package co.hyperverge.hypersnapsdk.helpers;

import android.content.Context;
import android.util.Log;
import co.hyperverge.hypersnapsdk.analytics.AnalyticsTracker;
import co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService;
import co.hyperverge.hypersnapsdk.data.DefaultRemoteConfig;
import co.hyperverge.hypersnapsdk.data.MixpanelConfig;
import co.hyperverge.hypersnapsdk.data.MixpanelEvents;
import co.hyperverge.hypersnapsdk.data.RemoteConfig;
import co.hyperverge.hypersnapsdk.data.models.FeatureConfig;
import co.hyperverge.hypersnapsdk.service.errortracking.ErrorMonitor;
import co.hyperverge.hypersnapsdk.service.errortracking.ErrorMonitoringService;
import co.hyperverge.hypersnapsdk.service.sensorbiometrics.HVSensorBiometrics;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class SDKInternalConfig {
    private static final String TAG = "SDKInternalConfig";
    private static SDKInternalConfig config;
    private AnalyticsTrackerService analyticsTrackerService;
    public String appName;
    public String appVersion;
    private DefaultRemoteConfig defaultRemoteConfig;
    private String docsBaseUrl;
    private ErrorMonitoringService errorMonitoringService;
    private String faceBaseUrl;
    private Map<String, FeatureConfig> featureConfigMap;
    private HVSensorBiometrics hvSensorBiometrics;
    private String publicKey;
    private RemoteConfig remoteConfig;
    private int userRandomNumber;
    private boolean isFaceDetectionOn = true;
    private FaceDetectionProcessor faceDetectionProcessor = FaceDetectionProcessor.MLKIT;
    private boolean shouldDoImageInjectionChecks = true;
    private boolean autoCamSelection = false;
    private boolean isFaceDetectorMissing = false;
    private boolean isMLKitDetectorMissing = false;
    private boolean isMLKitUnavailable = false;
    private boolean shouldUseMixpanel = true;
    private boolean remoteConfigFetchDone = false;
    private boolean defaultRemoteConfigFetchDone = false;
    private String publicKeyVersion = "sdk_test";
    private boolean npdDetectorAvailable = false;

    public enum FaceDetectionProcessor {
        NPD,
        MLKIT
    }

    private SDKInternalConfig() {
    }

    public static SDKInternalConfig getInstance() {
        if (config == null) {
            config = new SDKInternalConfig();
        }
        return config;
    }

    public void createDefaultMixpanelConfigs() {
        RemoteConfig remoteConfig = new RemoteConfig();
        MixpanelConfig mixpanelConfig = new MixpanelConfig();
        mixpanelConfig.setMixpanelToken(BuildConfig.FLAVOR);
        MixpanelEvents mixpanelEvents = new MixpanelEvents();
        mixpanelEvents.setUserSession(true);
        mixpanelEvents.setInstructionsScreenLaunched(true);
        mixpanelEvents.setCaptureScreenLaunched(true);
        mixpanelEvents.setCaptureScreenClosed(true);
        mixpanelEvents.setCaptureSuccessful(true);
        mixpanelEvents.setCaptureFailed(true);
        mixpanelEvents.setOldDocReviewScreenEvents(true);
        mixpanelEvents.setApiCallMade(true);
        mixpanelEvents.setApiCallSuccessful(true);
        mixpanelEvents.setApiCallFailed(true);
        mixpanelEvents.setOtherErrors(true);
        mixpanelConfig.setMixpanelEvents(mixpanelEvents);
        remoteConfig.setMixpanelConfig(mixpanelConfig);
        remoteConfig.setUseBranding(true);
        setRemoteConfig(remoteConfig);
    }

    public String getAfricaFaceMatchBaseUrl() {
        return "https://zaf-face.hyperverge.co/v1/";
    }

    public String getAfricaLivenessFaceBaseUrl() {
        return "https://zaf-face.hyperverge.co/v2/";
    }

    public AnalyticsTrackerService getAnalyticsTrackerService() {
        return this.analyticsTrackerService;
    }

    public String getApacFaceMatchBaseUrl() {
        return "https://apac-faceid.hyperverge.co/v1/";
    }

    public String getApacLivenessFaceBaseUrl() {
        return "https://apac-faceid.hyperverge.co/v2/";
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public DefaultRemoteConfig getDefaultRemoteConfig() {
        if (this.defaultRemoteConfig == null) {
            this.defaultRemoteConfig = new DefaultRemoteConfig();
        }
        return this.defaultRemoteConfig;
    }

    public String getDocsBaseUrl() {
        return this.docsBaseUrl;
    }

    public ErrorMonitoringService getErrorMonitoringService() {
        return this.errorMonitoringService;
    }

    public String getFaceBaseUrl() {
        return this.faceBaseUrl;
    }

    public FaceDetectionProcessor getFaceDetectionProcessor() {
        return this.faceDetectionProcessor;
    }

    public Map<String, FeatureConfig> getFeatureConfigMap() {
        if (this.featureConfigMap == null) {
            this.featureConfigMap = new HashMap();
        }
        return this.featureConfigMap;
    }

    public HVSensorBiometrics getHvSensorBiometrics() {
        return this.hvSensorBiometrics;
    }

    public String getIndiaFaceBaseUrl() {
        return "https://ind-faceid.hyperverge.co/v1/";
    }

    public String getLivenessUri() {
        return "photo/liveness";
    }

    public String getMixPanelBaseUrl() {
        return BuildConfig.FLAVOR;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public String getPublicKeyVersion() {
        return this.publicKeyVersion;
    }

    public RemoteConfig getRemoteConfig() {
        if (this.remoteConfig == null) {
            this.remoteConfig = new RemoteConfig();
        }
        return this.remoteConfig;
    }

    public String getS3FeatureConfigBaseUrl() {
        return "https://s3.ap-south-1.amazonaws.com/hv-sdk-device-configs/hypersnap/android/";
    }

    public String getS3RemoteConfigBaseUrl() {
        return "https://s3-ap-south-1.amazonaws.com";
    }

    public String getVerifyPairUri() {
        return "photo/verifyPair";
    }

    public boolean isAutoCamSelectionEnabled(String str) {
        Map<String, FeatureConfig> featureConfigMap = getInstance().getFeatureConfigMap();
        if (featureConfigMap != null && featureConfigMap.containsKey(AppConstants.AUTO_CAM_SELECTION)) {
            FeatureConfig featureConfig = featureConfigMap.get(AppConstants.AUTO_CAM_SELECTION);
            this.autoCamSelection = featureConfig.isShouldEnable() && str != null && !str.isEmpty() && featureConfig.getCameraLevels().contains(str);
        }
        HVLogUtils.d(TAG, "isAutoCamSelectionEnabled() returned: " + this.autoCamSelection);
        return this.autoCamSelection;
    }

    public boolean isDateValid(String str) {
        if (str == null) {
            return false;
        }
        try {
            if (str.isEmpty()) {
                return false;
            }
            Date parse = new SimpleDateFormat("dd-MM-yyyy").parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parse);
            calendar.add(5, 14);
            return new Date().before(calendar.getTime());
        } catch (Exception e10) {
            Log.d(TAG, e10.getMessage());
            return false;
        }
    }

    public boolean isDefaultRemoteConfigFetchDone() {
        return this.defaultRemoteConfigFetchDone;
    }

    public boolean isFaceDetectionOn() {
        Map<String, FeatureConfig> featureConfigMap;
        if (this.isFaceDetectionOn && (featureConfigMap = getInstance().getFeatureConfigMap()) != null && featureConfigMap.containsKey(AppConstants.FACE_DETECTION_FEATURE)) {
            this.isFaceDetectionOn = featureConfigMap.get(AppConstants.FACE_DETECTION_FEATURE).isShouldEnable();
        }
        return this.isFaceDetectionOn;
    }

    public boolean isFaceDetectorMissing() {
        return this.isFaceDetectorMissing;
    }

    public boolean isMLKitDetectorMissing() {
        return this.isMLKitDetectorMissing;
    }

    public boolean isMLKitUnavailable() {
        return this.isMLKitUnavailable;
    }

    public boolean isNpdDetectorAvailable() {
        return this.npdDetectorAvailable;
    }

    public boolean isRemoteConfigFetchDone() {
        return this.remoteConfigFetchDone;
    }

    public boolean isShouldDoImageInjectionChecks() {
        Map<String, FeatureConfig> featureConfigMap = getInstance().getFeatureConfigMap();
        if (featureConfigMap != null && featureConfigMap.containsKey(AppConstants.IMAGE_INJECTION_FEATURE)) {
            this.shouldDoImageInjectionChecks = featureConfigMap.get(AppConstants.IMAGE_INJECTION_FEATURE).isShouldEnable();
        }
        return getRemoteConfig().isEnableInjectionChecks() && this.shouldDoImageInjectionChecks;
    }

    public boolean isShouldLogAnalyticsForThisUser() {
        return getRemoteConfig().isUseAnalytics();
    }

    public boolean isShouldShowSDKVersion() {
        return getRemoteConfig().isShowSdkVersion();
    }

    public boolean isShouldUseBranding() {
        return getRemoteConfig().isUseBranding();
    }

    @Deprecated
    public boolean isShouldUseMixpanel() {
        return this.shouldUseMixpanel;
    }

    public boolean isVideoRecordingAutoColorFormatEnabled() {
        Map<String, FeatureConfig> featureConfigMap = getInstance().getFeatureConfigMap();
        boolean z10 = featureConfigMap != null && featureConfigMap.containsKey(AppConstants.VIDEO_RECORDING_AUTO_COLOR_FORMAT_SELECTION) && featureConfigMap.get(AppConstants.VIDEO_RECORDING_AUTO_COLOR_FORMAT_SELECTION).isShouldEnable();
        HVLogUtils.d(TAG, "isVideoRecordingAutoColorFormatSelectionEnabled() returned: " + z10);
        return z10;
    }

    public void setAnalyticsTrackerService(AnalyticsTrackerService analyticsTrackerService) {
        this.analyticsTrackerService = analyticsTrackerService;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setDefaultRemoteConfig(DefaultRemoteConfig defaultRemoteConfig) {
        this.defaultRemoteConfig = defaultRemoteConfig;
    }

    public void setDefaultRemoteConfigFetchDone(boolean z10) {
        this.defaultRemoteConfigFetchDone = z10;
    }

    public void setDocsBaseUrl(String str) {
        this.docsBaseUrl = str;
    }

    public void setErrorMonitoringService(ErrorMonitoringService errorMonitoringService) {
        this.errorMonitoringService = errorMonitoringService;
    }

    public void setFaceBaseUrl(String str) {
        this.faceBaseUrl = str;
    }

    public void setFaceDetectionOn(boolean z10) {
        this.isFaceDetectionOn = z10;
    }

    public void setFaceDetectionProcessor(FaceDetectionProcessor faceDetectionProcessor) {
        this.faceDetectionProcessor = faceDetectionProcessor;
    }

    public void setFaceDetectorMissing(boolean z10) {
        this.isFaceDetectorMissing = z10;
    }

    public void setFeatureConfigMap(Map<String, FeatureConfig> map) {
        this.featureConfigMap = map;
    }

    public void setHvSensorBiometrics(HVSensorBiometrics hVSensorBiometrics) {
        this.hvSensorBiometrics = hVSensorBiometrics;
    }

    public void setMLKitDetectorMissing(boolean z10) {
        this.isMLKitDetectorMissing = z10;
    }

    public void setMLKitUnavailable(boolean z10) {
        this.isMLKitUnavailable = z10;
    }

    public void setNpdDetectorAvailable(boolean z10) {
        this.npdDetectorAvailable = z10;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public void setPublicKeyVersion(String str) {
        this.publicKeyVersion = str;
    }

    public void setRemoteConfig(RemoteConfig remoteConfig) {
        this.remoteConfig = remoteConfig;
    }

    public void setRemoteConfigFetchDone(boolean z10) {
        this.remoteConfigFetchDone = z10;
    }

    @Deprecated
    public void setShouldUseMixpanel(boolean z10) {
        this.shouldUseMixpanel = z10;
    }

    public void setUserRandomNumber(int i10) {
        this.userRandomNumber = i10;
    }

    public boolean shouldCompressFinalImage() {
        return getRemoteConfig().isUseCompression();
    }

    public boolean shouldCorrectOrientation() {
        Map<String, FeatureConfig> featureConfigMap = getInstance().getFeatureConfigMap();
        boolean isShouldEnable = (featureConfigMap == null || !featureConfigMap.containsKey(AppConstants.ORIENTATION_BACK_CAM_FEATURE)) ? false : featureConfigMap.get(AppConstants.ORIENTATION_BACK_CAM_FEATURE).isShouldEnable();
        HVLogUtils.d(TAG, "shouldCorrectOrientation() returned: " + isShouldEnable);
        return isShouldEnable;
    }

    public boolean shouldRandomizeResolution() {
        Map<String, FeatureConfig> featureConfigMap = getInstance().getFeatureConfigMap();
        boolean isShouldEnable = (featureConfigMap == null || !featureConfigMap.containsKey(AppConstants.RESOLUTION_RANDOMIZE_FEATURE)) ? true : featureConfigMap.get(AppConstants.RESOLUTION_RANDOMIZE_FEATURE).isShouldEnable();
        HVLogUtils.d(TAG, "shouldRandomizeResolution() returned: " + isShouldEnable);
        return isShouldEnable;
    }

    public boolean shouldUseCamera2() {
        Map<String, FeatureConfig> featureConfigMap = getInstance().getFeatureConfigMap();
        boolean isShouldEnable = (featureConfigMap == null || !featureConfigMap.containsKey("camera2")) ? false : featureConfigMap.get("camera2").isShouldEnable();
        HVLogUtils.d(TAG, "shouldUseCamera2() returned: " + isShouldEnable);
        return isShouldEnable;
    }

    public boolean shouldUseCameraX() {
        Map<String, FeatureConfig> featureConfigMap = getInstance().getFeatureConfigMap();
        return getRemoteConfig().isUseCameraX() && ((featureConfigMap == null || !featureConfigMap.containsKey(AppConstants.CAMERAX)) ? true : featureConfigMap.get(AppConstants.CAMERAX).isShouldEnable());
    }

    public boolean shouldUseDefaultZoom() {
        HVLogUtils.d(TAG, "shouldUseDefaultZoom() called");
        Map<String, FeatureConfig> featureConfigMap = getInstance().getFeatureConfigMap();
        boolean isShouldEnable = (featureConfigMap == null || !featureConfigMap.containsKey(AppConstants.DEFAULT_ZOOM)) ? true : featureConfigMap.get(AppConstants.DEFAULT_ZOOM).isShouldEnable();
        HVLogUtils.d(TAG, "shouldUseDefaultZoom() returned: " + isShouldEnable);
        return isShouldEnable;
    }

    public AnalyticsTrackerService getAnalyticsTrackerService(Context context) {
        if (this.analyticsTrackerService == null) {
            this.analyticsTrackerService = new AnalyticsTracker(context);
        }
        return this.analyticsTrackerService;
    }

    public ErrorMonitoringService getErrorMonitoringService(Context context) {
        if (this.errorMonitoringService == null) {
            this.errorMonitoringService = new ErrorMonitor(context);
        }
        return this.errorMonitoringService;
    }
}
