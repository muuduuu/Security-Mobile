package co.hyperverge.hypersnapsdk;

import Td.C1227c;
import Z5.b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.a;
import co.hyperverge.crashguard.CrashGuard;
import co.hyperverge.crashguard.objects.CrashguardConfig;
import co.hyperverge.facedetection.FaceDetectorApi;
import co.hyperverge.hypersnapsdk.analytics.AnalyticsTracker;
import co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo;
import co.hyperverge.hypersnapsdk.helpers.HVFeatureConfigHelper;
import co.hyperverge.hypersnapsdk.helpers.LanguageHelper;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.SPHelper;
import co.hyperverge.hypersnapsdk.helpers.face.MLKitFaceHelper;
import co.hyperverge.hypersnapsdk.listeners.BrandingCompletionCallback;
import co.hyperverge.hypersnapsdk.listeners.InitializerCallback;
import co.hyperverge.hypersnapsdk.listeners.SessionStatusCallback;
import co.hyperverge.hypersnapsdk.model.UIConfig;
import co.hyperverge.hypersnapsdk.objects.ExternalConfigs;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVExifData;
import co.hyperverge.hypersnapsdk.objects.HVFaceCaptureMetaData;
import co.hyperverge.hypersnapsdk.objects.HVSessionResponse;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams;
import co.hyperverge.hypersnapsdk.objects.HyperSnapSDKConfig;
import co.hyperverge.hypersnapsdk.providers.CallbackProvider;
import co.hyperverge.hypersnapsdk.service.HVSignatureService;
import co.hyperverge.hypersnapsdk.service.exif.HVEXIFExtractor;
import co.hyperverge.hypersnapsdk.service.qr.AadhaarQRParser;
import co.hyperverge.hypersnapsdk.service.sensorbiometrics.HVSensorBiometrics;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HyperSnapSDK {
    private static final String APP_ID_NULL_OR_EMPTY_ERROR = "appId is compulsory";
    private static final String APP_KEY_ACCESS_TOKEN_EMPTY = "Either appKey or accessToken are empty/null; Set either of them";
    private static final String APP_KEY_ACCESS_TOKEN_SET = "Set either appKey or accessToken, not both";
    private static final String CONTEXT_NULL_ERROR_MESSAGE = "Context object should not be null";
    private static final String HYPERSNAP_SDK_CONFIG_NULL_ERROR_MESSAGE = "HyperSnapSDKConfig object should not be null";
    private static final String LOCATION_PERMISSION_UNAVAILABLE = "Location permission not available while location config is set to true";
    private static final int PREFETCH_CONFIGS_CACHE_EXPIRY_IN_SECONDS = 3600;
    private static final String TAG = "co.hyperverge.hypersnapsdk.HyperSnapSDK";
    private static C1227c cacheDir;
    private static HVFaceCaptureMetaData faceCaptureMetaData;
    private static HyperSnapSDK hyperSnapSDK;
    private static boolean isLegacy;
    private static HyperSnapSDKConfig sHyperSnapSDKConfig = new HyperSnapSDKConfig();
    private JSONObject geoDetails;
    private boolean hyperSnapSDKInitialised = false;
    private boolean isHVFDInitialised = false;
    private InitializerCallback mInitializerCallback;

    private HyperSnapSDK() {
        faceCaptureMetaData = new HVFaceCaptureMetaData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void continueInitialisation(HyperSnapSDKConfig hyperSnapSDKConfig, Context context) {
        if (hyperSnapSDKConfig.isShouldUseRemoteConfig()) {
            getRemoteConfigs(hyperSnapSDKConfig);
        } else {
            SDKInternalConfig.getInstance().createDefaultMixpanelConfigs();
            getFeatureConfigs();
        }
        initialize(context, hyperSnapSDKConfig);
    }

    public static TreeMap<String, Object> convertJSONObjToMap(JSONObject jSONObject) {
        HVLogUtils.d(TAG, "convertJSONObjToMap() called with: jObject = [" + jSONObject + "]");
        return HVSignatureService.convertJSONObjToMap(jSONObject);
    }

    public static void endUserSession() {
        String str = TAG;
        HVLogUtils.d(str, "endUserSession() called");
        if (!isUserSessionActive()) {
            HVLogUtils.d(str, "endUserSession(): No active sessions");
            Log.d(str, "No active user sessions to end. Please call startUserSession after initialising the SDK");
            return;
        }
        SPHelper.closeTransactionId();
        if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
            return;
        }
        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logUserSessionEnded(null);
    }

    public static HVExifData extractExifDataFromImage(String str) {
        HVLogUtils.d(TAG, "extractExifDataFromImage() called with: imageUri = [" + str + "]");
        return new HVEXIFExtractor().extractExifDataFromImage(str);
    }

    private void getDefaultRemoteConfigs(HVRemoteConfigRepo.HVCallback hVCallback) {
        HVLogUtils.d(TAG, "getDefaultRemoteConfigs() called");
        HVRemoteConfigRepo.getInstance(cacheDir).getDefaultRemoteConfig(false, null, hVCallback);
    }

    public static HVFaceCaptureMetaData getFaceCaptureMetaData() {
        HVLogUtils.d(TAG, "getFaceCaptureMetaData() called");
        return faceCaptureMetaData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getFeatureConfigs() {
        HVLogUtils.d(TAG, "getFeatureConfigs() called");
        HVRemoteConfigRepo.getInstance(cacheDir).getFeatureConfigs(BuildConfig.HYPERSNAP_VERSION_NAME, false, null, new HVRemoteConfigRepo.HVCallback() { // from class: co.hyperverge.hypersnapsdk.HyperSnapSDK.7
            @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
            public void onError(HVError hVError) {
                HVLogUtils.d(HyperSnapSDK.TAG, "getFeatureConfigs(): onError() called with error = [" + hVError + "]");
                Log.e(HyperSnapSDK.TAG, "onError: " + hVError.getErrorMessage());
                SDKInternalConfig.getInstance().setFeatureConfigMap(HVFeatureConfigHelper.getDefaultFeatureMap());
                SDKInternalConfig.getInstance().setRemoteConfigFetchDone(true);
            }

            @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
            public void onSuccess() {
                HVLogUtils.d(HyperSnapSDK.TAG, "getFeatureConfigs(): onSuccess() called");
                SDKInternalConfig.getInstance().setRemoteConfigFetchDone(true);
            }
        });
    }

    public static HyperSnapSDK getInstance() {
        if (hyperSnapSDK == null) {
            hyperSnapSDK = new HyperSnapSDK();
        }
        return hyperSnapSDK;
    }

    private static void getRemoteConfigForBrandingCheck(String str, final BrandingCompletionCallback brandingCompletionCallback) {
        String str2 = TAG;
        HVLogUtils.d(str2, "getRemoteConfigForBrandingCheck() called with: appId = [" + str + "], brandingCompletionCallback = [" + brandingCompletionCallback + "]");
        if (TextUtils.isEmpty(str)) {
            HVLogUtils.d(str2, "getRemoteConfigForBrandingCheck(): appId is empty");
            brandingCompletionCallback.onResult(new HVError(11, APP_ID_NULL_OR_EMPTY_ERROR), false);
        }
        HVRemoteConfigRepo.getInstance(cacheDir).getRemoteConfig(str, true, false, null, new HVRemoteConfigRepo.HVCallback() { // from class: co.hyperverge.hypersnapsdk.HyperSnapSDK.4
            @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
            public void onError(HVError hVError) {
                Log.d(HyperSnapSDK.TAG, "getRemoteConfig(): onError() called with: hvError = [" + hVError + "]");
                BrandingCompletionCallback.this.onResult(hVError, false);
            }

            @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
            public void onSuccess() {
                HVLogUtils.d(HyperSnapSDK.TAG, "getRemoteConfig(): onSuccess() called");
                BrandingCompletionCallback.this.onResult(null, SDKInternalConfig.getInstance().isShouldUseBranding());
            }
        });
    }

    private void getRemoteConfigs(HyperSnapSDKConfig hyperSnapSDKConfig) {
        HVLogUtils.d(TAG, "getRemoteConfigs() called with: hyperSnapSDKConfig = [" + hyperSnapSDKConfig + "]");
        HVRemoteConfigRepo.getInstance(cacheDir).getRemoteConfig(hyperSnapSDKConfig.getAppId(), false, false, null, new HVRemoteConfigRepo.HVCallback() { // from class: co.hyperverge.hypersnapsdk.HyperSnapSDK.8
            @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
            public void onError(HVError hVError) {
                HVLogUtils.d(HyperSnapSDK.TAG, "getRemoteConfigs(): onError() called with: hvError = [" + hVError + "]");
                HyperSnapSDK.this.getFeatureConfigs();
            }

            @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
            public void onSuccess() {
                HVLogUtils.d(HyperSnapSDK.TAG, "getRemoteConfigs(): onSuccess called");
                HyperSnapSDK.this.getFeatureConfigs();
            }
        });
    }

    public static void init(Context context, String str, String str2, HyperSnapParams.Region region, HyperSnapParams.Product product) {
        HVLogUtils.d(TAG, "init() called with: context = [" + context + "], appId = [" + str + "], appKey = [" + str2 + "], hyperSnapRegion = [" + region + "], hyperSnapProduct = [" + product + "]");
        initForDeprecatedMethods(context, str, str2, region, product, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initAnalytics(Context context) {
        HVLogUtils.d(TAG, "initAnalytics() called with: context = [" + context + "]");
        int userRandomNumber = SPHelper.getUserRandomNumber();
        if (userRandomNumber == 1000) {
            userRandomNumber = Utils.generateRandomInteger(100);
            SPHelper.saveUserRandomNumber(userRandomNumber);
        }
        SDKInternalConfig.getInstance().setUserRandomNumber(userRandomNumber);
        try {
            SDKInternalConfig.getInstance().setAnalyticsTrackerService(new AnalyticsTracker(context));
            SDKInternalConfig.getInstance().setShouldUseMixpanel(true);
        } catch (Exception | NoClassDefFoundError e10) {
            String str = TAG;
            HVLogUtils.e(str, "initAnalytics(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(e10);
            SDKInternalConfig.getInstance().setShouldUseMixpanel(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void initErrorMonitoring(Context context) {
        HashSet<String> sentryFilters;
        HVLogUtils.d(TAG, "initErrorMonitoring() called with: context = [" + context + "]");
        SDKInternalConfig.getInstance().setErrorMonitoringService(SDKInternalConfig.getInstance().getErrorMonitoringService(context));
        HyperSnapSDKConfig hyperSnapSDKConfig = getHyperSnapSDKConfig();
        HashMap hashMap = new HashMap();
        hashMap.put("appId", hyperSnapSDKConfig.getAppId());
        hashMap.put("hypersnap_sdk_version", BuildConfig.HYPERSNAP_VERSION_NAME);
        ExternalConfigs externalConfigs = hyperSnapSDKConfig.getExternalConfigs();
        if (externalConfigs != null) {
            HashMap<String, String> metadataMap = externalConfigs.getMetadataMap();
            if (!metadataMap.containsKey("release")) {
                metadataMap.put("release", BuildConfig.HYPERSNAP_VERSION_NAME);
            }
            for (String str : metadataMap.keySet()) {
                hashMap.put(str, metadataMap.get(str));
            }
        }
        try {
            HashSet hashSet = new HashSet();
            hashSet.add("co.hyperverge");
            if (externalConfigs != null && externalConfigs.getSentryConfig() != null && (sentryFilters = externalConfigs.getSentryConfig().getSentryFilters()) != null) {
                hashSet.addAll(sentryFilters);
            }
            CrashGuard.getInstance().init(context.getApplicationContext(), new CrashguardConfig(new ArrayList(hashSet), hashMap));
        } catch (Exception e10) {
            e = e10;
            String str2 = TAG;
            HVLogUtils.e(str2, "initErrorMonitoring(): exception = [" + Utils.getErrorMessage(e) + "]", e);
            Log.e(str2, Utils.getErrorMessage(e));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
            }
        } catch (NoClassDefFoundError e11) {
            e = e11;
            String str22 = TAG;
            HVLogUtils.e(str22, "initErrorMonitoring(): exception = [" + Utils.getErrorMessage(e) + "]", e);
            Log.e(str22, Utils.getErrorMessage(e));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
            }
        }
    }

    private void initFaceDetector(Context context) {
        HVLogUtils.d(TAG, "initFaceDetector() called with: context = [" + context + "]");
        try {
            if (this.isHVFDInitialised) {
                return;
            }
            FaceDetectorApi.initialize(context.getApplicationContext(), 2);
            SDKInternalConfig.getInstance().setFaceDetectionProcessor(SDKInternalConfig.FaceDetectionProcessor.NPD);
            SDKInternalConfig.getInstance().setNpdDetectorAvailable(true);
            SDKInternalConfig.getInstance().setFaceDetectionOn(true);
            this.isHVFDInitialised = true;
        } catch (b | NoClassDefFoundError | UnsatisfiedLinkError e10) {
            HVLogUtils.e(TAG, "initFaceDetector(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            MLKitFaceHelper.get();
            SDKInternalConfig.getInstance().setFaceDetectionProcessor(SDKInternalConfig.FaceDetectionProcessor.MLKIT);
            SDKInternalConfig.getInstance().setFaceDetectionOn((SDKInternalConfig.getInstance().isMLKitDetectorMissing() || SDKInternalConfig.getInstance().isMLKitUnavailable()) ? false : true);
        }
    }

    @Deprecated
    private static void initForDeprecatedMethods(Context context, String str, String str2, HyperSnapParams.Region region, HyperSnapParams.Product product, String str3, InitializerCallback initializerCallback) {
        HVLogUtils.d(TAG, "initForDeprecatedMethods() called with: context = [" + context + "], appId = [" + str + "], appKey = [" + str2 + "], hyperSnapRegion = [" + region + "], hyperSnapProduct = [" + product + "], token = [" + str3 + "], initializerCallback = [" + initializerCallback + "]");
        sHyperSnapSDKConfig.setAppId(str);
        sHyperSnapSDKConfig.setAppKey(str2);
        sHyperSnapSDKConfig.setHyperSnapRegion(region);
        if (region == HyperSnapParams.Region.India) {
            sHyperSnapSDKConfig.setHyperSnapRegion(HyperSnapParams.Region.INDIA);
        } else if (region == HyperSnapParams.Region.AsiaPacific) {
            sHyperSnapSDKConfig.setHyperSnapRegion(HyperSnapParams.Region.ASIA_PACIFIC);
        }
        sHyperSnapSDKConfig.setHyperSnapProduct(product);
        if (!StringUtils.isEmptyOrNull(str3)) {
            sHyperSnapSDKConfig.setAccessToken(str3);
        }
        isLegacy = true;
        getInstance().init(context, sHyperSnapSDKConfig, initializerCallback);
    }

    private void initHVSensorBiometrics(Context context) {
        HVLogUtils.d(TAG, "initHVSensorBiometrics() called with: context = [" + context + "]");
        SDKInternalConfig.getInstance().setHvSensorBiometrics(new HVSensorBiometrics(context));
    }

    public static void initWithToken(Context context, String str, String str2, HyperSnapParams.Region region) {
        HVLogUtils.d(TAG, "initWithToken() called with: context = [" + context + "], appId = [" + str + "], accessToken = [" + str2 + "], hyperSnapRegion = [" + region + "]");
        initForDeprecatedMethods(context, str, null, region, HyperSnapParams.Product.FACEID, str2, null);
    }

    private void initialize(Context context, HyperSnapSDKConfig hyperSnapSDKConfig) {
        HVLogUtils.d(TAG, "initialize() called with: context = [" + context + "], hyperSnapSDKConfig = [" + hyperSnapSDKConfig + "]");
        initFaceDetector(context);
        LanguageHelper.init(context);
        initHVSensorBiometrics(context);
        setUiConfig(context, null);
        notifySuccess();
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService(context).logHyperSnapSDKInitialised();
        }
    }

    public static boolean isInitialised() {
        HVLogUtils.d(TAG, "isInitialised() called");
        return getInstance().isHyperSnapSDKInitialised();
    }

    private boolean isLocationPermissionAvailable(Context context) {
        HVLogUtils.d(TAG, "isLocationPermissionAvailable() called with: context = [" + context + "]");
        return a.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || a.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public static boolean isShouldUseLocation() {
        HVLogUtils.d(TAG, "isShouldUseLocation() called");
        return sHyperSnapSDKConfig.isShouldUseLocation();
    }

    public static boolean isSslPinning() {
        HVLogUtils.d(TAG, "isSslPinning() called");
        return sHyperSnapSDKConfig.isShouldEnableSSLPinning();
    }

    public static boolean isUserSessionActive() {
        HVLogUtils.d(TAG, "isUserSessionActive() called");
        if (isInitialised()) {
            return !TextUtils.isEmpty(SPHelper.getTransactionID());
        }
        return false;
    }

    private boolean isValidInputs(Context context, HyperSnapSDKConfig hyperSnapSDKConfig) {
        String str = TAG;
        HVLogUtils.d(str, "isValidInputs() called with: context = [" + context + "], hyperSnapSDKConfig = [" + hyperSnapSDKConfig + "]");
        if (context == null) {
            HVLogUtils.d(str, "isValidInputs(): Context object should not be null");
            notifyError(CONTEXT_NULL_ERROR_MESSAGE, 6);
            return false;
        }
        if (hyperSnapSDKConfig == null) {
            HVLogUtils.d(str, "isValidInputs(): HyperSnapSDKConfig object should not be null");
            notifyError(HYPERSNAP_SDK_CONFIG_NULL_ERROR_MESSAGE, 6);
            return false;
        }
        if (StringUtils.isEmptyOrNull(hyperSnapSDKConfig.getAppId())) {
            HVLogUtils.d(str, "isValidInputs(): appId is compulsory");
            notifyError(APP_ID_NULL_OR_EMPTY_ERROR, 6);
            return false;
        }
        boolean isEmptyOrNull = StringUtils.isEmptyOrNull(hyperSnapSDKConfig.getAppKey());
        boolean isEmptyOrNull2 = StringUtils.isEmptyOrNull(hyperSnapSDKConfig.getAccessToken());
        if (isEmptyOrNull && isEmptyOrNull2) {
            HVLogUtils.d(str, "isValidInputs(): Either appKey or accessToken are empty/null; Set either of them");
            notifyError(APP_KEY_ACCESS_TOKEN_EMPTY, 6);
            return false;
        }
        if (!isEmptyOrNull && !isEmptyOrNull2) {
            HVLogUtils.d(str, "isValidInputs(): Set either appKey or accessToken, not both");
            notifyError(APP_KEY_ACCESS_TOKEN_SET, 6);
            return false;
        }
        if (!hyperSnapSDKConfig.isShouldUseLocation() || isLocationPermissionAvailable(context)) {
            return true;
        }
        HVLogUtils.d(str, "isValidInputs(): Location permission not available while location config is set to true");
        notifyError(LOCATION_PERMISSION_UNAVAILABLE, 8);
        return false;
    }

    private void notifyError(String str, int i10) {
        String str2 = TAG;
        HVLogUtils.d(str2, "notifyError() called with: errorMessage = [" + str + "], errorCode = [" + i10 + "]");
        if (this.mInitializerCallback != null) {
            HVError hVError = new HVError();
            hVError.setErrorCode(i10);
            hVError.setErrorMessage(str);
            HVLogUtils.d(str2, "notifySuccess(): initializer.onError called");
            this.mInitializerCallback.onError(hVError);
            if (getInstance().getHyperSnapSDKConfig() == null || !getInstance().getHyperSnapSDKConfig().isShouldUseRemoteConfig() || CallbackProvider.get().injectBrandingCallback() == null) {
                return;
            }
            CallbackProvider.get().injectBrandingCallback().onResult(hVError, false);
        }
    }

    private void notifySuccess() {
        String str = TAG;
        HVLogUtils.d(str, "notifySuccess() called");
        this.hyperSnapSDKInitialised = true;
        if (this.mInitializerCallback != null) {
            HVLogUtils.d(str, "notifySuccess(): initializer.onSuccess called");
            this.mInitializerCallback.onSuccess();
            if (!getInstance().getHyperSnapSDKConfig().isShouldUseRemoteConfig() || CallbackProvider.get().injectBrandingCallback() == null) {
                return;
            }
            CallbackProvider.get().injectBrandingCallback().onResult(null, true);
        }
    }

    public static JSONObject parseAadhaarQRData(String str) {
        HVLogUtils.d(TAG, "parseAadhaarQRData() called with: xmlstring = [" + str + "]");
        return new AadhaarQRParser().parseAadhaarQRData(str);
    }

    public static void prefetchConfigs(Context context, List<String> list, Integer num) {
        String str = TAG;
        HVLogUtils.d(str, "prefetchConfigs() called with: context = [" + context + "], appIds = [" + list + "], expiryInSeconds = [" + num + "]");
        if (context == null) {
            HVLogUtils.e(str, "prefetchConfigs: context is null");
            return;
        }
        if (list == null || list.isEmpty()) {
            HVLogUtils.e(str, "prefetchConfigs: appIds is null or empty");
            return;
        }
        if (num != null && num.intValue() < 0) {
            HVLogUtils.e(str, "prefetchConfigs: expiryInSeconds should be greater than or equal to 0");
            return;
        }
        SPHelper.initConfigsSP(context);
        int intValue = num != null ? num.intValue() : PREFETCH_CONFIGS_CACHE_EXPIRY_IN_SECONDS;
        C1227c c1227c = new C1227c(context.getApplicationContext().getCacheDir(), 5242880L);
        cacheDir = c1227c;
        HVRemoteConfigRepo hVRemoteConfigRepo = HVRemoteConfigRepo.getInstance(c1227c);
        hVRemoteConfigRepo.getDefaultRemoteConfig(true, Integer.valueOf(intValue), new HVRemoteConfigRepo.HVCallback() { // from class: co.hyperverge.hypersnapsdk.HyperSnapSDK.1
            @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
            public void onError(HVError hVError) {
                HVLogUtils.d(HyperSnapSDK.TAG, "prefetchConfigs: getDefaultRemoteConfigs: onError() called with: hvError = [" + hVError + "]");
            }

            @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
            public void onSuccess() {
                HVLogUtils.d(HyperSnapSDK.TAG, "prefetchConfigs: getDefaultRemoteConfigs: onSuccess() called");
            }
        });
        for (final String str2 : list) {
            hVRemoteConfigRepo.getRemoteConfig(str2, false, true, Integer.valueOf(intValue), new HVRemoteConfigRepo.HVCallback() { // from class: co.hyperverge.hypersnapsdk.HyperSnapSDK.2
                @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
                public void onError(HVError hVError) {
                    HVLogUtils.d(HyperSnapSDK.TAG, "prefetchConfigs: getRemoteConfigs: appId = [" + str2 + "]: onError() called with: hvError = [" + hVError + "]");
                }

                @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
                public void onSuccess() {
                    HVLogUtils.d(HyperSnapSDK.TAG, "prefetchConfigs: getRemoteConfigs: appId = [" + str2 + "]: onSuccess called");
                }
            });
        }
        hVRemoteConfigRepo.getFeatureConfigs(BuildConfig.HYPERSNAP_VERSION_NAME, true, Integer.valueOf(intValue), new HVRemoteConfigRepo.HVCallback() { // from class: co.hyperverge.hypersnapsdk.HyperSnapSDK.3
            @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
            public void onError(HVError hVError) {
                HVLogUtils.d(HyperSnapSDK.TAG, "prefetchConfigs: getFeatureConfigs: onError() called with error = [" + hVError + "]");
            }

            @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
            public void onSuccess() {
                HVLogUtils.d(HyperSnapSDK.TAG, "prefetchConfigs: getFeatureConfigs: onSuccess() called");
            }
        });
    }

    public static void setAccessToken(String str) {
        HVLogUtils.d(TAG, "setAccessToken() called with: token = [" + str + "]");
        sHyperSnapSDKConfig.setAccessToken(str);
    }

    @Deprecated
    public static void setBrandingCheck(boolean z10, BrandingCompletionCallback brandingCompletionCallback) {
        String str = TAG;
        HVLogUtils.d(str, "setBrandingCheck() called with: check = [" + z10 + "], completionCallback = [" + brandingCompletionCallback + "]");
        CallbackProvider.get().setCallback(brandingCompletionCallback);
        sHyperSnapSDKConfig.setShouldUseRemoteConfig(z10);
        if (!isInitialised()) {
            HVLogUtils.d(str, "setBrandingCheck(): SDK not initialised");
            brandingCompletionCallback.onResult(new HVError(11, "SDK not initialised."), false);
        }
        if (z10 && isInitialised()) {
            getRemoteConfigForBrandingCheck(sHyperSnapSDKConfig.getAppId(), brandingCompletionCallback);
        }
    }

    public static void setHttpTimeoutValues(int i10, int i11, int i12) {
        HVLogUtils.d(TAG, "setHttpTimeoutValues() called with: connectTimeout = [" + i10 + "], readTimeout = [" + i11 + "], writeTimeout = [" + i12 + "]");
        sHyperSnapSDKConfig.setConnectTimeOut(i10);
        sHyperSnapSDKConfig.setReadTimeOut(i11);
        sHyperSnapSDKConfig.setWriteTimeOut(i12);
    }

    public static void setInitCallTimeout(Integer num) {
        HVLogUtils.d(TAG, "setInitHttpTimeoutValues() called with: callTimeout = [" + num + "]");
        sHyperSnapSDKConfig.setInitCallTimeout(num);
    }

    private void setInternalConfigs(Context context, HyperSnapParams.Region region) {
        HVLogUtils.d(TAG, "setInternalConfigs() called with: context = [" + context + "], region = [" + region + "]");
        try {
            SDKInternalConfig.getInstance().setAppVersion(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e10) {
            String str = TAG;
            HVLogUtils.e(str, "setInternalConfigs(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        SDKInternalConfig.getInstance().setAppName(context.getPackageName());
        if (region == HyperSnapParams.Region.INDIA) {
            SDKInternalConfig.getInstance().setFaceBaseUrl(SDKInternalConfig.getInstance().getIndiaFaceBaseUrl());
            return;
        }
        if (region == HyperSnapParams.Region.ASIA_PACIFIC) {
            SDKInternalConfig.getInstance().setFaceBaseUrl(SDKInternalConfig.getInstance().getApacLivenessFaceBaseUrl());
        } else if (region == HyperSnapParams.Region.AFRICA) {
            SDKInternalConfig.getInstance().setFaceBaseUrl(SDKInternalConfig.getInstance().getAfricaLivenessFaceBaseUrl());
        } else {
            SDKInternalConfig.getInstance().setFaceBaseUrl(SDKInternalConfig.getInstance().getApacLivenessFaceBaseUrl());
        }
    }

    public static void setPrefetchCallTimeout(Integer num) {
        sHyperSnapSDKConfig.setPrefetchCallTimeout(num);
    }

    public static void setShouldEnableSSLPinning(boolean z10) {
        HVLogUtils.d(TAG, "setShouldEnableSSLPinning() called with: shouldEnable = [" + z10 + "]");
        sHyperSnapSDKConfig.setShouldEnableSSLPinning(z10);
    }

    public static void setShouldLogOnlyErrors(Boolean bool) {
        HVLogUtils.d(TAG, "setShouldLogOnlyErrors() called with: shouldLog = [" + bool + "]");
        sHyperSnapSDKConfig.setShouldLogOnlyErrors(bool.booleanValue());
    }

    public static void setShouldReturnRawResponse(boolean z10) {
        HVLogUtils.d(TAG, "setShouldReturnRawResponse() called with: shouldSend = [" + z10 + "]");
        sHyperSnapSDKConfig.setShouldReturnRawResponse(z10);
    }

    public static boolean setShouldUseLocation(Context context, boolean z10) {
        HVLogUtils.d(TAG, "setShouldUseLocation() called with: context = [" + context + "], shouldUseLocation = [" + z10 + "]");
        sHyperSnapSDKConfig.setShouldUseLocation(z10);
        return true;
    }

    public static void setShouldUseSHA256Signature(boolean z10) {
        HVLogUtils.d(TAG, "setShouldUseSHA256Signature() called with: shouldUse = [" + z10 + "]");
        sHyperSnapSDKConfig.setShouldUseSHA256Signature(z10);
        if (z10) {
            sHyperSnapSDKConfig.setSignatureMethod("SHA-256");
        }
    }

    public static void setShouldUseSensorBiometrics(boolean z10) {
        HVLogUtils.d(TAG, "setShouldUseSensorBiometrics() called with: shouldUse = [" + z10 + "]");
        sHyperSnapSDKConfig.setShouldUseSensorBiometrics(z10);
    }

    public static void setShouldUseSignature(boolean z10) {
        HVLogUtils.d(TAG, "setShouldUseSignature() called with: useSignature = [" + z10 + "]");
        sHyperSnapSDKConfig.setShouldUseSignature(z10);
    }

    public static void shouldDisableRemoteConfig() {
        HVLogUtils.d(TAG, "shouldDisableRemoteConfig() called");
        sHyperSnapSDKConfig.setShouldUseRemoteConfig(false);
    }

    public static String sortJSONKeysAlphabetically(TreeMap<String, Object> treeMap) {
        HVLogUtils.d(TAG, "sortJSONKeysAlphabetically() called with: map = [" + treeMap + "]");
        return HVSignatureService.sortJSONKeysAlphabetically(treeMap);
    }

    @Deprecated
    public static boolean startUserSession(SessionStatusCallback sessionStatusCallback) {
        String str = TAG;
        HVLogUtils.d(str, "startUserSession() called with: callback = [" + sessionStatusCallback + "]");
        if (isInitialised()) {
            if (isUserSessionActive()) {
                return false;
            }
            HVLogUtils.d(str, "startUserSession(): user session is not active, generating random transactionId");
            return SPHelper.generateRandomTransactionId(sessionStatusCallback);
        }
        if (sessionStatusCallback != null) {
            HVLogUtils.d(str, "startUserSession(): SDK is not initialised");
            sessionStatusCallback.onFailure(new HVError(11, "SDK is not initialised"));
        }
        return false;
    }

    public JSONObject getGeoDetails() {
        HVLogUtils.d(TAG, "getGeoDetails() called");
        return this.geoDetails;
    }

    public HyperSnapSDKConfig getHyperSnapSDKConfig() {
        return sHyperSnapSDKConfig;
    }

    public boolean isHyperSnapSDKInitialised() {
        HVLogUtils.d(TAG, "isHyperSnapSDKInitialised() called");
        return this.hyperSnapSDKInitialised;
    }

    public void logEvent(String str, Map<String, Object> map) {
        HVLogUtils.d(TAG, "logEvent() called with: eventName = [" + str + "], eventData = [" + map + "]");
        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logGenericTrackEvent(str, map);
    }

    public void setUiConfig(Context context, UIConfig uIConfig) {
        String str = TAG;
        HVLogUtils.d(str, "setUiConfig() called with: context = [" + context + "], uiConfig = [" + uIConfig + "]");
        if (getHyperSnapSDKConfig().getUiConfig() == null && uIConfig == null) {
            HVLogUtils.d(str, "setUiConfig() setting default uiconfig");
            getHyperSnapSDKConfig().setUiConfig(new UIConfig());
            HyperSnapUIConfigUtil.getInstance().init(context);
            return;
        }
        if (uIConfig != null) {
            HVLogUtils.d(str, "setUiConfig() setting custom uiconfig");
            getHyperSnapSDKConfig().setUiConfig(uIConfig);
            HyperSnapUIConfigUtil.getInstance().init(context);
        }
    }

    public static void init(Context context, String str, String str2, HyperSnapParams.Region region) {
        HVLogUtils.d(TAG, "init() called with: context = [" + context + "], appId = [" + str + "], appKey = [" + str2 + "], hyperSnapRegion = [" + region + "]");
        initForDeprecatedMethods(context, str, str2, region, HyperSnapParams.Product.FACEID, null, null);
    }

    public static void initWithToken(Context context, String str, String str2, HyperSnapParams.Region region, InitializerCallback initializerCallback) {
        HVLogUtils.d(TAG, "initWithToken() called with: context = [" + context + "], appId = [" + str + "], accessToken = [" + str2 + "], hyperSnapRegion = [" + region + "], initializerCallback = [" + initializerCallback + "]");
        initForDeprecatedMethods(context, str, null, region, HyperSnapParams.Product.FACEID, str2, initializerCallback);
    }

    public static void init(Context context, String str, String str2, HyperSnapParams.Region region, InitializerCallback initializerCallback) {
        HVLogUtils.d(TAG, "init() called with: context = [" + context + "], appId = [" + str + "], appKey = [" + str2 + "], hyperSnapRegion = [" + region + "], initializerCallback = [" + initializerCallback + "]");
        initForDeprecatedMethods(context, str, str2, region, HyperSnapParams.Product.FACEID, null, initializerCallback);
    }

    public static void setHttpTimeoutValues(Integer num) {
        HVLogUtils.d(TAG, "setHttpTimeoutValues() called with: callTimeout = [" + num + "]");
        sHyperSnapSDKConfig.setCallTimeOut(num);
    }

    public void init(final Context context, final HyperSnapSDKConfig hyperSnapSDKConfig, InitializerCallback initializerCallback) {
        HVLogUtils.d(TAG, "init() called with: context = [" + context + "], hyperSnapSDKConfig = [" + hyperSnapSDKConfig + "], initializerCallback = [" + initializerCallback + "]");
        sHyperSnapSDKConfig = hyperSnapSDKConfig;
        this.mInitializerCallback = initializerCallback;
        if (isValidInputs(context, hyperSnapSDKConfig)) {
            cacheDir = new C1227c(context.getApplicationContext().getCacheDir(), 5242880L);
            initErrorMonitoring(context);
            setInternalConfigs(context, hyperSnapSDKConfig.getHyperSnapRegion());
            SPHelper.init(context);
            if (initializerCallback != null) {
                getDefaultRemoteConfigs(new HVRemoteConfigRepo.HVCallback() { // from class: co.hyperverge.hypersnapsdk.HyperSnapSDK.5
                    @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
                    public void onError(HVError hVError) {
                        HVLogUtils.d(HyperSnapSDK.TAG, "getDefaultRemoteConfigs: onError() called with: hvError = [" + hVError + "]");
                        HyperSnapSDK.this.initAnalytics(context);
                        HyperSnapSDK.this.continueInitialisation(hyperSnapSDKConfig, context);
                        SDKInternalConfig.getInstance().setDefaultRemoteConfigFetchDone(true);
                    }

                    @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
                    public void onSuccess() {
                        HVLogUtils.d(HyperSnapSDK.TAG, "getDefaultRemoteConfigs: onSuccess() called");
                        HyperSnapSDK.this.initAnalytics(context);
                        HyperSnapSDK.this.continueInitialisation(hyperSnapSDKConfig, context);
                        SDKInternalConfig.getInstance().setDefaultRemoteConfigFetchDone(true);
                    }
                });
            } else {
                getDefaultRemoteConfigs(new HVRemoteConfigRepo.HVCallback() { // from class: co.hyperverge.hypersnapsdk.HyperSnapSDK.6
                    @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
                    public void onError(HVError hVError) {
                        HVLogUtils.d(HyperSnapSDK.TAG, "getDefaultRemoteConfigs: onError() called with: hvError = [" + hVError + "]");
                        HyperSnapSDK.this.initAnalytics(context);
                        SDKInternalConfig.getInstance().setDefaultRemoteConfigFetchDone(true);
                    }

                    @Override // co.hyperverge.hypersnapsdk.data.remote.HVRemoteConfigRepo.HVCallback
                    public void onSuccess() {
                        HVLogUtils.d(HyperSnapSDK.TAG, "getDefaultRemoteConfigs: onSuccess() called");
                        HyperSnapSDK.this.initAnalytics(context);
                        SDKInternalConfig.getInstance().setDefaultRemoteConfigFetchDone(true);
                    }
                });
                continueInitialisation(hyperSnapSDKConfig, context);
            }
        }
    }

    @Deprecated
    public static boolean startUserSession(String str, SessionStatusCallback sessionStatusCallback) {
        String str2 = TAG;
        HVLogUtils.d(str2, "startUserSession() called with: userId = [" + str + "], callback = [" + sessionStatusCallback + "]");
        if (!isInitialised()) {
            if (sessionStatusCallback != null) {
                HVLogUtils.d(str2, "startUserSession(): SDK is not initialised");
                sessionStatusCallback.onFailure(new HVError(11, "SDK is not initialised"));
            }
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            if (isUserSessionActive()) {
                return false;
            }
            return SPHelper.setTransactionID(str, sessionStatusCallback);
        }
        if (sessionStatusCallback != null) {
            HVLogUtils.d(str2, "startUserSession(): empty transactionId");
            sessionStatusCallback.onFailure(new HVError(17, AppConstants.EMPTY_TRANSACTION_ERROR));
        }
        return false;
    }

    public static HVSessionResponse startUserSession(String str) {
        HVError generateRandomTransactionId;
        String str2 = TAG;
        HVLogUtils.d(str2, "startUserSession() called with: userId = [" + str + "]");
        HVSessionResponse hVSessionResponse = new HVSessionResponse();
        if (!isInitialised()) {
            HVLogUtils.d(str2, "startUserSession(): SDK is not initialised");
            hVSessionResponse.setHvError(new HVError(11, "SDK is not initialised"));
            return hVSessionResponse;
        }
        if (!StringUtils.isEmptyOrNull(str)) {
            generateRandomTransactionId = SPHelper.setTransactionID(str);
        } else {
            generateRandomTransactionId = SPHelper.generateRandomTransactionId();
        }
        if (generateRandomTransactionId != null) {
            HVLogUtils.d(str2, "startUserSession(): error in creating transactionId, error = [" + generateRandomTransactionId + "]");
            hVSessionResponse.setHvError(generateRandomTransactionId);
        }
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null && hVSessionResponse.isSuccess()) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logUserSessionStarted(!StringUtils.isEmptyOrNull(str));
        }
        if (hVSessionResponse.isSuccess()) {
            HVLogUtils.d(str2, "startUserSession(): successful creation of transactionId, response = [" + hVSessionResponse + "]");
            getInstance().getFeatureConfigs();
        }
        return hVSessionResponse;
    }

    public static HVSessionResponse startUserSession() {
        HVLogUtils.d(TAG, "startUserSession() called");
        return startUserSession((String) null);
    }
}
