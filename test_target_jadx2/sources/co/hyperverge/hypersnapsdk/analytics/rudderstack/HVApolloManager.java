package co.hyperverge.hypersnapsdk.analytics.rudderstack;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import co.hyperverge.hypersnapsdk.BuildConfig;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService;
import co.hyperverge.hypersnapsdk.analytics.Event;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.analytics.rudderstack.HVApolloManager;
import co.hyperverge.hypersnapsdk.data.DataRepository;
import co.hyperverge.hypersnapsdk.helpers.HVGenericCallback;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.SPHelper;
import co.hyperverge.hypersnapsdk.helpers.TimingUtils;
import co.hyperverge.hypersnapsdk.model.LivenessResponse;
import co.hyperverge.hypersnapsdk.objects.ExternalConfigs;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.DeviceExtensionsKt;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import com.google.gson.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class HVApolloManager implements AnalyticsTrackerService {
    private static final String TAG = "HVApolloManager";
    private static HVApolloManager rudderstackManager;
    private final String analyticsEndpoint;
    private final Context context;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    private HVApolloManager(Context context, String str) {
        this.context = context;
        this.analyticsEndpoint = str;
    }

    private String getBase64EncodedImage(String str) {
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            return null;
        }
    }

    private void getDefaultProperties(final HVGenericCallback<Map<String, Object>> hVGenericCallback) {
        HVLogUtils.d(TAG, "getDefaultProperties() called");
        this.executor.execute(new Runnable() { // from class: I1.c
            @Override // java.lang.Runnable
            public final void run() {
                HVApolloManager.this.lambda$getDefaultProperties$1(hVGenericCallback);
            }
        });
    }

    private String getFileFormat(String str) {
        try {
            return str.substring(str.lastIndexOf(".") + 1);
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            return null;
        }
    }

    private String getImageSize(String str) {
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            return (byteArrayOutputStream.toByteArray().length / 1024.0d) + " KB";
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            return null;
        }
    }

    public static HVApolloManager getInstance(Context context, String str) {
        if (rudderstackManager == null) {
            rudderstackManager = new HVApolloManager(context, str);
        }
        return rudderstackManager;
    }

    private Map<String, Object> getSdkProperties() {
        HashMap hashMap = new HashMap();
        ExternalConfigs externalConfigs = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getExternalConfigs();
        if (externalConfigs != null) {
            HashMap<String, String> metadataMap = externalConfigs.getMetadataMap();
            for (String str : metadataMap.keySet()) {
                String lowerCase = str.toLowerCase();
                lowerCase.hashCode();
                switch (lowerCase) {
                    case "sdk-version":
                        hashMap.put("version", metadataMap.get(str));
                        break;
                    case "sdk-type":
                        hashMap.put("type", metadataMap.get(str));
                        break;
                    case "hv_hk_sdk_version":
                        hashMap.put("hyperkycVersion", metadataMap.get(str));
                        break;
                }
            }
        }
        hashMap.put("hypersnapVersion", BuildConfig.HYPERSNAP_VERSION_NAME);
        hashMap.put("shouldEnableSslPinning", Boolean.valueOf(HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldEnableSSLPinning()));
        hashMap.put("shouldUseSignature", Boolean.valueOf(HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSignature()));
        hashMap.put("shouldLogOnlyErrors", Boolean.valueOf(HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldLogOnlyErrors()));
        hashMap.put("shouldReturnRawResponse", Boolean.valueOf(HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldReturnRawResponse()));
        hashMap.put("shouldUseSensorBiometrics", Boolean.valueOf(HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics()));
        hashMap.put("shouldUseLocation", Boolean.valueOf(HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseLocation()));
        hashMap.put("connectTimeOut", Integer.valueOf(HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getConnectTimeOut()));
        hashMap.put("readTimeOut", Integer.valueOf(HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getReadTimeOut()));
        hashMap.put("writeTimeOut", Integer.valueOf(HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getWriteTimeOut()));
        hashMap.put("region", HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getHyperSnapRegion().name());
        return hashMap;
    }

    private String getVideoSize(String str) {
        return (new File(str).length() / 1024) + "KB";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getDefaultProperties$1(final HVGenericCallback hVGenericCallback) {
        final HashMap hashMap = new HashMap();
        hashMap.put("sdk", getSdkProperties());
        hashMap.put("device", DeviceExtensionsKt.getDeviceProperties(this.context));
        hashMap.put("os", DeviceExtensionsKt.getOsProperties(this.context));
        this.mainThreadHandler.post(new Runnable() { // from class: I1.a
            @Override // java.lang.Runnable
            public final void run() {
                HVGenericCallback.this.accept(hashMap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushRudderAnalyticsTrackEvent$2(Map map, Map map2, String str, String str2, Map map3) {
        map.putAll(map3);
        String transactionID = SPHelper.getTransactionID();
        String appId = HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId();
        putIfAbsent(map2, "common", new HashMap());
        Map<String, Object> map4 = (Map) map2.get("common");
        putIfAbsent(map4, "transactionId", transactionID);
        putIfAbsent(map4, "appId", appId);
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(date);
        putIfAbsent(map2, Keys.EVENT, new HashMap());
        Map<String, Object> map5 = (Map) map2.get(Keys.EVENT);
        putIfAbsent(map5, "name", str);
        putIfAbsent(map5, "timestamp", format);
        if (str2 != null) {
            if (str2.equals(Keys.FACE_EVENT)) {
                putIfAbsent(map5, Keys.CAMERA_LEVEL, AppConstants.cameraLevel);
                putIfAbsent(map5, Keys.CAMERA_TYPE, AppConstants.cameraType);
                putIfAbsent(map5, Keys.FACE_DETECTION_ENABLED, Boolean.valueOf(SDKInternalConfig.getInstance().isFaceDetectionOn()));
                putIfAbsent(map5, Keys.FACE_DETECTION_PROCESSOR, SDKInternalConfig.getInstance().getFaceDetectionProcessor().name());
            } else if (str2.equals(Keys.DOC_EVENT)) {
                putIfAbsent(map5, Keys.CAMERA_LEVEL, AppConstants.cameraLevel);
                putIfAbsent(map5, Keys.CAMERA_TYPE, AppConstants.cameraType);
            }
        }
        map.putAll(map2);
        HVLogUtils.d(TAG, "Track Event: " + new e().t(map));
        if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
            HVLogUtils.d(TAG, "Track Event will not be logged for this user");
        } else {
            DataRepository.getInstance().postAnalyticsData(this.context, this.analyticsEndpoint, map);
        }
    }

    private void pushRudderAnalyticsIdentifyEvent(String str, String str2, Map<String, Object> map) {
    }

    private void pushRudderAnalyticsScreenEvent(String str, String str2, Map<String, Object> map) {
    }

    private void pushRudderAnalyticsTrackEvent(final String str, final String str2, Map<String, Object> map) {
        HVLogUtils.d(TAG, "pushRudderAnalyticsTrackEvent() called with: text = [" + str + "], eventKind = [" + str2 + "], eventSpecificProperties = [" + map + "]");
        final HashMap hashMap = new HashMap();
        hashMap.put("hvEventName", "track_events");
        final HashMap hashMap2 = map != null ? new HashMap(map) : new HashMap();
        getDefaultProperties(new HVGenericCallback() { // from class: I1.b
            @Override // co.hyperverge.hypersnapsdk.helpers.HVGenericCallback
            public final void accept(Object obj) {
                HVApolloManager.this.lambda$pushRudderAnalyticsTrackEvent$2(hashMap, hashMap2, str, str2, (Map) obj);
            }
        });
    }

    private void putIfAbsent(Map<String, Object> map, String str, Object obj) {
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, obj);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logCameraPermissionDeniedError() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logCameraPermissionsGranted(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_CAMERA_PERMISSION_GRANTED, null, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logCameraPermissionsRejected(HVError hVError, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_CAMERA_PERMISSION_DENIED, null, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logCameraPermissionsRequested() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_CAMERA_PERMISSION_REQUESTED, null, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logCheckBrandingAPIError(String str, int i10) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logCheckBrandingAPISuccess() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentAPICallFailed(HVResponse hVResponse, HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_API_CALL_FAILED, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentAPIPost(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.API_URL, str);
        hashMap.put(Keys.CONTENT_TYPE, Keys.FORM_DATA);
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_API_POST, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentAPIResponseReceived(HVResponse hVResponse, String str, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ATTEMPTS, Integer.valueOf(hVResponse.getAttemptsCount()));
        hashMap.put("action", hVResponse.getAction());
        hashMap.put(Keys.RESPONSE_TIME, Long.valueOf(j10));
        hashMap.put(Keys.IMAGE_SIZE, getImageSize(str));
        hashMap.put(Keys.IMAGE_FORMAT, getFileFormat(str));
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_API_RESPONSE_RECEIVED, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentCaptureButtonClicked(HVDocConfig hVDocConfig, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        hashMap.put(Keys.DOCUMENT_SIDE, hVDocConfig.getDocumentSide());
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_CAPTURE_BUTTON_CLICKED, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentCaptureFailed(HVError hVError, HVDocConfig hVDocConfig, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_CAPTURE_FAILED, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentCaptureFlashButtonClicked() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_FLASH_BUTTON_CLICKED, Keys.DOC_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentCaptureSaved(HVDocConfig hVDocConfig, String str, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        hashMap.put(Keys.IMAGE_SIZE, getImageSize(str));
        hashMap.put(Keys.IMAGE_FORMAT, getFileFormat(str));
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_CAPTURE_SAVED, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentCaptureScreenBackPressed() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_CAPTURE_BACK_PRESSED, Keys.DOC_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentCaptureScreenLaunched() {
        pushRudderAnalyticsScreenEvent(Event.EVENT_DOCUMENT_CAPTURE_SCREEN_LAUNCHED, Keys.DOC_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentCaptureScreenLoadFailure(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_CAPTURE_SCREEN_LOAD_FAILURE, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentCaptureScreenLoadSuccess(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_CAPTURE_SCREEN_LOAD_SUCCESS, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentCaptureScreenOpened(HVDocConfig hVDocConfig) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentCaptureSuccessful(HVDocConfig hVDocConfig, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_CAPTURE_SUCCESSFUL, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentCloseClicked() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_CLOSE_CLICKED, Keys.DOC_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentDocFlowStarted(HVDocConfig hVDocConfig) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentInstructionsScreenEnabled() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentInstructionsScreenLaunched() {
        pushRudderAnalyticsScreenEvent(Event.EVENT_DOCUMENT_INSTRUCTIONS_SCREEN_LAUNCHED, Keys.DOC_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentInstructionsScreenLoadFailure(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_INSTRUCTIONS_SCREEN_LOAD_FAILURE, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentInstructionsScreenLoadSuccess(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_INSTRUCTIONS_SCREEN_LOAD_SUCCESS, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentInstructionsScreenProceedButtonClicked(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_INSTRUCTIONS_SCREEN_PROCEED_BUTTON_CLICKED, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentPickerScreenCloseClicked() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_PICKER_SCREEN_CLOSE_CLICKED, Keys.DOC_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentPickerScreenDocumentCaptureButtonClicked(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_PICKER_SCREEN_DOCUMENT_CAPTURE_CLICKED, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentPickerScreenDocumentUploadButtonClicked(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_PICKER_SCREEN_DOCUMENT_UPLOAD_CLICKED, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentPickerScreenLaunched() {
        pushRudderAnalyticsScreenEvent(Event.EVENT_DOCUMENT_PICKER_SCREEN_LAUNCHED, Keys.DOC_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentPickerScreenLoadFailure(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_PICKER_SCREEN_LOAD_FAILURE, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentPickerScreenLoadSuccess(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_PICKER_SCREEN_LOAD_SUCCESS, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentRetakeScreenBackPressed() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_RETAKE_BACK_PRESSED, Keys.DOC_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentRetakeScreenLaunched() {
        pushRudderAnalyticsScreenEvent(Event.EVENT_DOCUMENT_RETAKE_SCREEN_LAUNCHED, Keys.DOC_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentRetakeScreenLoadFailure(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_RETAKE_SCREEN_LOAD_FAILURE, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentRetakeScreenLoadSuccess(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_RETAKE_SCREEN_LOAD_SUCCESS, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentRetakeScreenRetakeButtonClicked(HVDocConfig hVDocConfig, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        hashMap.put(Keys.DOCUMENT_SIDE, hVDocConfig.getDocumentSide());
        hashMap.put(Keys.NUMBER_OF_DOCUMENT_RETRY_ATTEMPTS, Integer.valueOf(SPHelper.getAttemptsCountForImage(hVDocConfig.ocrEndpoint, hVDocConfig.getSuffixModuleId())));
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_RETAKE_SCREEN_RETAKE_BUTTON_CLICKED, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentReviewScreenBackPressed() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_REVIEW_BACK_PRESSED, Keys.DOC_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentReviewScreenConfirmButtonClicked(HVDocConfig hVDocConfig, int i10, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        hashMap.put(Keys.DOCUMENT_SIDE, hVDocConfig.getDocumentSide());
        hashMap.put(Keys.NUMBER_OF_DOCUMENT_RETAKE_ATTEMPTS, Integer.valueOf(i10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_REVIEW_SCREEN_CONFIRM_BUTTON_CLICKED, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentReviewScreenLaunched() {
        pushRudderAnalyticsScreenEvent(Event.EVENT_DOCUMENT_REVIEW_SCREEN_LAUNCHED, Keys.DOC_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentReviewScreenLoadFailure(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_REVIEW_SCREEN_LOAD_FAILURE, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentReviewScreenLoadSuccess(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_REVIEW_SCREEN_LOAD_SUCCESS, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logDocumentReviewScreenRetakeButtonClicked(HVDocConfig hVDocConfig, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        hashMap.put(Keys.DOCUMENT_SIDE, hVDocConfig.getDocumentSide());
        pushRudderAnalyticsTrackEvent(Event.EVENT_DOCUMENT_REVIEW_SCREEN_RETAKE_BUTTON_CLICKED, Keys.DOC_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logFaceCaptureTimedOut() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_CAPTURE_TIMEOUT, Keys.FACE_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logFaceDetectorMissing(String str) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logFaceDetectorTimedOut() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_DETECTOR_TIMEOUT, Keys.FACE_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logFaceMatchAPICallFailed(HVResponse hVResponse, HVError hVError, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_FACE_MATCH_API_CALL_FAILED, Keys.NETWORK_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logFaceMatchAPIPost(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.API_URL, str);
        hashMap.put(Keys.CONTENT_TYPE, Keys.FORM_DATA);
        pushRudderAnalyticsTrackEvent(Event.EVENT_FACE_MATCH_API_POST, Keys.NETWORK_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logFaceMatchAPIResponseReceived(HVResponse hVResponse, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ATTEMPTS, Integer.valueOf(hVResponse.getAttemptsCount()));
        hashMap.put("action", hVResponse.getAction());
        hashMap.put(Keys.RESPONSE_TIME, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_FACE_MATCH_API_RESPONSE_RECEIVED, Keys.NETWORK_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logFaceMatchEnabled() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logFaceMatchFailed(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_FACE_MATCH_FAILED, Keys.NETWORK_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logFaceMatchSuccess() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_FACE_MATCH_SUCCESS, Keys.NETWORK_EVENT, new HashMap());
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logGenericTrackEvent(String str, Map<String, Object> map) {
        pushRudderAnalyticsTrackEvent(str, null, map);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logHardwareError() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logHyperSnapSDKInitError(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_MESSAGE, str);
        pushRudderAnalyticsTrackEvent(Event.EVENT_HYPERNSAPSDK_INIT_ERROR, null, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logHyperSnapSDKInitialised() {
        TimingUtils timingUtils = new TimingUtils();
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.SDK_INITIALISATION_TIMESTAMP, Long.valueOf(timingUtils.getNowTime()));
        hashMap.put(Keys.IP_ADDRESS, Utils.getIPAddress(true));
        pushRudderAnalyticsIdentifyEvent(UUID.randomUUID() + "_HyperSnapSDKInitialised", Event.EVENT_HYPERSNAPSDK_INITIALISED, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logIdAPIFailed(boolean z10, String str, String str2, int i10, String str3) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logIdAPISuccessful(boolean z10, String str, String str2, long j10) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logIdCaptureReviewScreenLaunched() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logIdCaptureReviewScreenRetake() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logIdOldReviewScreenEvents(HVDocConfig hVDocConfig, String str) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logIdScreenClosedByUser(HVDocConfig hVDocConfig) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logLivenessAPIFailed(HVError hVError, LivenessResponse livenessResponse, HVFaceConfig hVFaceConfig) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logLivenessAPISuccessful(LivenessResponse livenessResponse, HVFaceConfig hVFaceConfig, long j10) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logQRParseFailed() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logQRScannerFailed(HVError hVError) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logQRScannerLaunched() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logRemoteConfigAPIError(String str, int i10) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logRemoteConfigAPISuccess() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieAPICallFailed(LivenessResponse livenessResponse, HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_API_CALL_FAILED, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieAPIPost(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.API_URL, str);
        hashMap.put(Keys.CONTENT_TYPE, Keys.FORM_DATA);
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_API_POST, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieAPIResponseReceived(LivenessResponse livenessResponse, String str, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.STATUS_CODE, livenessResponse.getHttpStatusCode());
        hashMap.put(Keys.RESPONSE_TIME, Long.valueOf(j10));
        hashMap.put(Keys.IMAGE_SIZE, getImageSize(str));
        hashMap.put(Keys.IMAGE_FORMAT, getFileFormat(str));
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_API_RESPONSE_RECEIVED, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieCameraOpen() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_CAMERA_OPEN, Keys.FACE_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieCaptureButtonClicked(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_CAPTURE_BUTTON_CLICKED, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieCaptureFailed(HVError hVError, HVFaceConfig hVFaceConfig, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_CAPTURE_FAILED, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieCaptureFlipCameraButtonClicked() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_FLIP_CAMERA_BUTTON_CLICKED, Keys.FACE_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieCaptureSaved(HVFaceConfig hVFaceConfig, String str, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        hashMap.put(Keys.IMAGE_SIZE, getImageSize(str));
        hashMap.put(Keys.IMAGE_FORMAT, getFileFormat(str));
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_CAPTURE_SAVED, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieCaptureScreenBackPressed() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieCaptureScreenLaunched() {
        pushRudderAnalyticsScreenEvent(Event.EVENT_SELFIE_CAPTURE_SCREEN_LAUNCHED, Keys.FACE_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieCaptureScreenLoadFailure(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_CAPTURE_SCREEN_LOAD_FAILURE, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieCaptureScreenLoadSuccess(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_CAPTURE_SCREEN_LOAD_SUCCESS, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieCaptureScreenOpened(HVFaceConfig hVFaceConfig) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieCaptureSuccessful(HVFaceConfig hVFaceConfig, long j10) {
        Map<String, Object> hashMap = new HashMap<>();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Keys.TIME_SPENT, Long.valueOf(j10));
        hashMap.put(Keys.EVENT, hashMap2);
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_CAPTURE_SUCCESSFUL, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieCloseClicked() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieFirstFaceDetected(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.FACE_DATA, str);
        Map<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(Keys.EVENT, hashMap);
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_FIRST_FACE_DETECTED, Keys.FACE_EVENT, hashMap2);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieFirstFrameProcessed(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.FACE_DETECTION_STATE, str);
        Map<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(Keys.EVENT, hashMap);
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_FIRST_FRAME_PROCESSED, Keys.FACE_EVENT, hashMap2);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieFirstFrameReceived() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_FIRST_FRAME_RECEIVED, Keys.FACE_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieFirstFrameSentForProcessing() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_FIRST_FRAME_SENT_FOR_PROCESSING, Keys.FACE_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieFirstMeaningfulFaceDetected() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_FIRST_MEANINGFUL_FACE_DETECTED, Keys.FACE_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieFlowEnded(HVError hVError, HVResponse hVResponse) {
        HashMap hashMap = new HashMap();
        String str = org.conscrypt.BuildConfig.FLAVOR;
        hashMap.put(Keys.ERROR_CODE, hVError != null ? String.valueOf(hVError.getErrorCode()) : org.conscrypt.BuildConfig.FLAVOR);
        if (hVError != null) {
            str = hVError.getErrorMessage();
        }
        hashMap.put(Keys.ERROR_MESSAGE, str);
        Map<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(Keys.EVENT, hashMap);
        pushRudderAnalyticsTrackEvent(Event.EVENT_FACE_FLOW_ENDED, Keys.FACE_EVENT, hashMap2);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieFlowStarted(HVFaceConfig hVFaceConfig) {
        pushRudderAnalyticsTrackEvent(Event.EVENT_FACE_FLOW_STARTED, Keys.FACE_EVENT, new HashMap());
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieInstructionsScreenEnabled() {
        pushRudderAnalyticsScreenEvent(Event.EVENT_SELFIE_INSTRUCTIONS_SCREEN_ENABLED, Keys.FACE_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieInstructionsScreenLaunched() {
        pushRudderAnalyticsScreenEvent(Event.EVENT_SELFIE_INSTRUCTIONS_SCREEN_LAUNCHED, Keys.FACE_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieInstructionsScreenLoadFailure(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_INSTRUCTIONS_SCREEN_LOAD_FAILURE, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieInstructionsScreenLoadSuccess(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_INSTRUCTIONS_SCREEN_LOAD_SUCCESS, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieInstructionsScreenProceedButtonClicked(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_INSTRUCTIONS_SCREEN_PROCEED_BUTTON_CLICKED, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieRetakeScreenBackPressed() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_RETAKE_BACK_PRESSED, Keys.FACE_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieRetakeScreenLaunched() {
        pushRudderAnalyticsScreenEvent(Event.EVENT_SELFIE_RETAKE_LAUNCHED, Keys.FACE_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieRetakeScreenLoadFailure(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_RETAKE_LOAD_FAILURE, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieRetakeScreenLoadSuccess(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_RETAKE_LOAD_SUCCESS, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieRetakeScreenRetakeButtonClicked(HVFaceConfig hVFaceConfig, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TIME_SPENT, Long.valueOf(j10));
        hashMap.put(Keys.NUMBER_OF_FACE_RETRY_ATTEMPTS, Integer.valueOf(SPHelper.getAttemptsCountForImage(hVFaceConfig.getLivenessEndpoint(), hVFaceConfig.getSuffixModuleId())));
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_RETAKE_BUTTON_CLICKED, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieScreenClosedByUser(HVFaceConfig hVFaceConfig) {
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_CAPTURE_CLOSED_BY_USER, Keys.FACE_EVENT, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieVideoRecordFailed(HVError hVError, long j10) {
        Map<String, Object> hashMap = new HashMap<>();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap2.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        hashMap2.put(Keys.TIME_SPENT, Long.valueOf(j10));
        hashMap.put(Keys.EVENT, hashMap2);
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_VIDEO_RECORD_FAILED, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSelfieVideoRecordSuccessful(String str, long j10, long j11) {
        Map<String, Object> hashMap = new HashMap<>();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Keys.TIME_SPENT, Long.valueOf(j11));
        hashMap2.put("videoSize", getVideoSize(str));
        hashMap2.put(Keys.VIDEO_FORMAT, getFileFormat(str));
        hashMap2.put("videoDuration", Long.valueOf(j10));
        hashMap.put(Keys.EVENT, hashMap2);
        pushRudderAnalyticsTrackEvent(Event.EVENT_SELFIE_VIDEO_RECORD_SUCCESSFUL, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSensorDataPostFailure(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_SENSOR_DATA_POST_FAILURE, Keys.FACE_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logSensorDataPostSuccessful() {
        pushRudderAnalyticsTrackEvent(Event.EVENT_SENSOR_DATA_POST_SUCCESSFUL, null, null);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logTextMatchAPICallFailed(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_TEXT_MATCH_API_CALL_FAILED, Keys.NETWORK_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logTextMatchAPIFailed(boolean z10, String str, String str2, int i10, String str3) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logTextMatchAPIMethodCalled() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logTextMatchAPIPost() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logTextMatchAPIResponseReceived() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logTextMatchAPISuccessful(boolean z10, String str, String str2, HyperSnapParams.FaceMatchMode faceMatchMode, long j10) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logUserSessionEnded(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(Keys.STATE, str);
        }
        if (hashMap.isEmpty()) {
            hashMap = null;
        }
        pushRudderAnalyticsTrackEvent(Event.EVENT_USER_SESSION_ENDED, null, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logUserSessionStarted(boolean z10) {
        String transactionID = SPHelper.getTransactionID();
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.TRANSACTION_ID_SET_BY_CLIENT, Boolean.valueOf(z10));
        hashMap.put("transactionId", transactionID);
        pushRudderAnalyticsTrackEvent(Event.EVENT_USER_SESSION_STARTED, null, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logValidationAPICallFailed(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_VALIDATION_API_CALL_FAILED, Keys.NETWORK_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logValidationAPIFailed(String str, int i10, String str2) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logValidationAPIPost() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logValidationAPIResponseReceived() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logValidationAPISuccess(String str, long j10) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logVerifyAlignmentAPICallFailed(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put(Keys.ERROR_CODE, Integer.valueOf(hVError.getErrorCode()));
        hashMap.put(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
        pushRudderAnalyticsTrackEvent(Event.EVENT_VERIFY_ALIGNMENT_API_CALL_FAILED, Keys.NETWORK_EVENT, hashMap);
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logVerifyAlignmentAPIFailed(boolean z10, String str, String str2, int i10, String str3) {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logVerifyAlignmentAPIPost() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logVerifyAlignmentAPIResponseReceived() {
    }

    @Override // co.hyperverge.hypersnapsdk.analytics.AnalyticsTrackerService
    public void logVerifyAlignmentAPISuccess(boolean z10, String str, String str2, long j10) {
    }
}
