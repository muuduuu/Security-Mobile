package co.hyperverge.hypersnapsdk.objects;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.util.Log;
import co.hyperverge.hypersnapsdk.data.models.FeatureConfig;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.model.HVJSONObject;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import co.hyperverge.hypersnapsdk.utils.UIUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HVFaceConfig extends HVBaseConfig implements Serializable {
    private static final String TAG = "co.hyperverge.hypersnapsdk.objects.HVFaceConfig";
    static HVFaceConfig faceConfigInstance;
    private Map<String, String> cprCheckSessionHeaders;
    String customUIStrings;
    private byte[] faceCaptureOverlay;
    String faceCaptureSubtitle;
    String faceCaptureTitle;
    public String headers;
    String livenessEndpoint;
    String params;
    private boolean showAlertTextBox;
    private int statusTypeFace;
    private int subtitleTypeface;
    private int titleTypeface;
    LivenessMode mode = LivenessMode.TEXTURELIVENESS;
    String clientID = BuildConfig.FLAVOR;
    boolean shouldShowInstructionPage = false;
    boolean shouldShowNetworkRetryDialog = false;
    boolean dataLogging = true;
    boolean shouldUseBackCamera = false;
    boolean shouldUseFlip = false;
    boolean useBothImagesSignature = false;
    boolean shouldCheckActiveLiveness = false;
    int totalGestures = 3;
    private int faceCaptureOverlayDuration = 3000;
    private boolean showModuleBackButton = true;
    private boolean showConsent = false;
    private Boolean useCameraX = null;
    private ArrayList<QualityChecks> disabledQualityChecks = new ArrayList<>();
    boolean shouldUseZoom = false;
    String customLoaderClass = null;
    boolean shouldUseEnhancedCameraFeatures = false;
    boolean shouldHandleRetries = true;
    boolean allowFaceTilt = true;
    int faceTiltAngle = 15;
    float leftPadding = 0.0f;
    float rightPadding = 0.0f;
    float topPadding = 0.0f;
    float bottomPadding = 0.0f;
    boolean shouldSetPadding = false;
    boolean useFlash = false;
    boolean shouldReturnFullImageUrl = false;
    private boolean shouldAddWaterMark = false;
    private int waterMarkColor = -65536;
    private int fullImageWaterMarkTextSizePx = 45;
    private int cropImageWaterMarkTextSizePx = 20;
    private boolean shouldRecordVideo = false;
    private int numberOfFrames = 50;
    private double bitrateM = 1.0d;
    private int fps = 30;
    private boolean shouldAutoCapture = false;
    private int autoCaptureDuration = 1500;
    private boolean shouldUseDefaultZoom = false;
    private int phoneTiltThreshold = -75;
    private boolean shouldAllowPhoneTilt = true;
    private boolean enableOverlay = true;
    private boolean encryptPayload = false;
    private long faceDetectorTimeout = 0;
    private long captureTimeout = 0;
    private boolean isFaceDetectionDisabled = false;
    private boolean retryIfFaceNotPresent = false;
    private int maxAttemptsForFaceNotPresent = 3;
    private boolean livenessOnMaxFaceNotPresent = false;

    public enum LivenessMode {
        NONE,
        TEXTURELIVENESS
    }

    public enum QualityChecks {
        MULTIPLE_FACES,
        FACE_CENTER
    }

    public static HVFaceConfig getFaceConfigInstance() {
        return faceConfigInstance;
    }

    public static void setFaceConfigInstance(HVFaceConfig hVFaceConfig) {
        faceConfigInstance = hVFaceConfig;
    }

    public void disableQualityChecks(ArrayList<QualityChecks> arrayList) {
        this.disabledQualityChecks = arrayList;
    }

    public int getAutoCaptureDuration() {
        return this.autoCaptureDuration;
    }

    public double getBitrateM() {
        return this.bitrateM;
    }

    public float getBottomPadding() {
        return this.bottomPadding;
    }

    public Map<String, String> getCPRCheckSessionHeaders() {
        return this.cprCheckSessionHeaders;
    }

    public long getCaptureTimeout() {
        return this.captureTimeout;
    }

    public String getClientID() {
        return this.clientID;
    }

    public int getCropImageWaterMarkTextSizePx() {
        return this.cropImageWaterMarkTextSizePx;
    }

    public String getCustomLoaderClass() {
        return this.customLoaderClass;
    }

    public HVJSONObject getCustomUIStrings() {
        HVJSONObject hVJSONObject = new HVJSONObject();
        if (this.customUIStrings == null) {
            return hVJSONObject;
        }
        try {
            return new HVJSONObject(this.customUIStrings);
        } catch (JSONException e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return hVJSONObject;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return hVJSONObject;
        }
    }

    public ArrayList<QualityChecks> getDisabledQualityChecks() {
        return this.disabledQualityChecks;
    }

    public Bitmap getFaceCaptureOverlay() {
        byte[] bArr = this.faceCaptureOverlay;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public int getFaceCaptureOverlayDuration() {
        return this.faceCaptureOverlayDuration;
    }

    @Deprecated
    public String getFaceCaptureSubtitle() {
        return this.faceCaptureSubtitle;
    }

    public String getFaceCaptureTitle() {
        return this.faceCaptureTitle;
    }

    public long getFaceDetectorTimeout() {
        return this.faceDetectorTimeout;
    }

    public int getFaceTiltAngle() {
        return this.faceTiltAngle;
    }

    public int getFps() {
        return this.fps;
    }

    public int getFullImageWaterMarkTextSizePx() {
        return this.fullImageWaterMarkTextSizePx;
    }

    public JSONObject getHeaders() {
        JSONObject jSONObject = new JSONObject();
        if (this.headers == null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.headers);
        } catch (JSONException e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return jSONObject;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return jSONObject;
        }
    }

    public float getLeftPadding() {
        return this.leftPadding;
    }

    public String getLivenessEndpoint() {
        String str = this.livenessEndpoint;
        if (str != null && (str == null || !str.trim().isEmpty())) {
            return this.livenessEndpoint;
        }
        return SDKInternalConfig.getInstance().getFaceBaseUrl() + SDKInternalConfig.getInstance().getLivenessUri();
    }

    public JSONObject getLivenessParams() {
        JSONObject jSONObject = new JSONObject();
        if (this.params == null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.params);
        } catch (JSONException e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return jSONObject;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return jSONObject;
        }
    }

    public int getMaxAttemptsForFaceNotPresent() {
        return this.maxAttemptsForFaceNotPresent;
    }

    public LivenessMode getMode() {
        return this.mode;
    }

    public int getNumberOfFrames() {
        return this.numberOfFrames;
    }

    public int getPhoneTiltThreshold() {
        return this.phoneTiltThreshold;
    }

    public float getRightPadding() {
        return this.rightPadding;
    }

    public boolean getShouldUseBackCamera() {
        return this.shouldUseBackCamera;
    }

    public int getStatusTypeFace() {
        return this.statusTypeFace;
    }

    public String getStringMode() {
        LivenessMode livenessMode = this.mode;
        return livenessMode == LivenessMode.NONE ? "NONE" : livenessMode == LivenessMode.TEXTURELIVENESS ? "TEXTURELIVENESS" : BuildConfig.FLAVOR;
    }

    public int getSubtitleTypeface() {
        return this.subtitleTypeface;
    }

    public String getSuffixModuleId() {
        return StringUtils.isEmptyOrNull(getModuleId()) ? BuildConfig.FLAVOR : getModuleId();
    }

    public int getTitleTypeface() {
        return this.titleTypeface;
    }

    public float getTopPadding() {
        return this.topPadding;
    }

    public int getTotalGestures() {
        return this.totalGestures;
    }

    public int getWaterMarkColor() {
        return this.waterMarkColor;
    }

    @Deprecated
    public boolean isDataLogging() {
        return true;
    }

    public boolean isFaceDetectionDisabled() {
        return this.isFaceDetectionDisabled;
    }

    public boolean isOverlayEnabled() {
        return this.enableOverlay;
    }

    public boolean isQualityCheckEnabled(QualityChecks qualityChecks) {
        return !getDisabledQualityChecks().contains(qualityChecks);
    }

    public boolean isShouldAddWaterMark() {
        return this.shouldAddWaterMark;
    }

    public boolean isShouldAllowPhoneTilt() {
        return this.shouldAllowPhoneTilt;
    }

    public boolean isShouldAutoCapture() {
        Map<String, FeatureConfig> featureConfigMap;
        if (this.shouldAutoCapture && (featureConfigMap = SDKInternalConfig.getInstance().getFeatureConfigMap()) != null && featureConfigMap.containsKey(AppConstants.SELFIE_AUTO_CAPTURE_FEATURE)) {
            this.shouldAutoCapture = featureConfigMap.get(AppConstants.SELFIE_AUTO_CAPTURE_FEATURE).isShouldEnable();
        }
        return this.shouldAutoCapture;
    }

    public boolean isShouldCheckActiveLiveness() {
        Map<String, FeatureConfig> featureConfigMap;
        if (this.shouldCheckActiveLiveness && (featureConfigMap = SDKInternalConfig.getInstance().getFeatureConfigMap()) != null && featureConfigMap.containsKey(AppConstants.ACTIVE_LIVENESS)) {
            this.shouldCheckActiveLiveness = featureConfigMap.get(AppConstants.ACTIVE_LIVENESS).isShouldEnable();
        }
        return this.shouldCheckActiveLiveness;
    }

    public boolean isShouldHandleRetries() {
        return this.shouldHandleRetries;
    }

    public boolean isShouldRecordVideo() {
        Map<String, FeatureConfig> featureConfigMap;
        boolean z10 = SDKInternalConfig.getInstance().getRemoteConfig().isUseSelfieVideoRecording() || this.shouldRecordVideo;
        this.shouldRecordVideo = z10;
        if (z10 && (featureConfigMap = SDKInternalConfig.getInstance().getFeatureConfigMap()) != null && featureConfigMap.containsKey(AppConstants.VIDEO_RECORDING_FEATURE)) {
            this.shouldRecordVideo = featureConfigMap.get(AppConstants.VIDEO_RECORDING_FEATURE).isShouldEnable();
        }
        return this.shouldRecordVideo;
    }

    public boolean isShouldReturnFullImageUrl() {
        return this.shouldReturnFullImageUrl;
    }

    public boolean isShouldSetPadding() {
        return this.shouldSetPadding;
    }

    public boolean isShouldShowInstructionPage() {
        return this.shouldShowInstructionPage;
    }

    public boolean isShouldShowNetworkRetryDialog() {
        return this.shouldShowNetworkRetryDialog;
    }

    public boolean isShouldUseDefaultZoom() {
        boolean z10 = this.shouldUseDefaultZoom;
        return z10 ? SDKInternalConfig.getInstance().shouldUseDefaultZoom() : z10;
    }

    public boolean isShouldUseEnhancedCameraFeatures() {
        return this.shouldUseEnhancedCameraFeatures;
    }

    public boolean isShouldUseFlip() {
        return this.shouldUseFlip;
    }

    public boolean isShouldUseZoom() {
        return this.shouldUseZoom;
    }

    public boolean isShowAlertTextBox() {
        return this.showAlertTextBox;
    }

    public boolean isUseBothImagesSignature() {
        return this.useBothImagesSignature;
    }

    public boolean isUseFlash() {
        return this.useFlash;
    }

    public void setAllowFaceTilt(boolean z10) {
        this.allowFaceTilt = z10;
        if (z10) {
            return;
        }
        SDKInternalConfig.getInstance().setFaceDetectionProcessor(SDKInternalConfig.FaceDetectionProcessor.MLKIT);
    }

    public void setAutoCaptureDuration(int i10) {
        this.autoCaptureDuration = i10;
    }

    public void setBitrateM(double d10) {
        this.bitrateM = d10;
    }

    public void setCPRCheckSessionHeaders(Map<String, String> map) {
        this.cprCheckSessionHeaders = map;
    }

    public void setCaptureTimeout(long j10) {
        this.captureTimeout = j10;
    }

    public void setClientID(String str) {
        this.clientID = str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientId", this.clientID);
            setLivenessAPIParameters(jSONObject);
        } catch (JSONException e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    public void setCropImageWaterMarkTextSizePx(int i10) {
        this.cropImageWaterMarkTextSizePx = i10;
    }

    public void setCustomLoadingScreen(String str) {
        this.customLoaderClass = str;
    }

    public void setCustomUIStrings(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.customUIStrings = jSONObject.toString();
        }
    }

    public void setDisableFaceDetection(boolean z10) {
        this.isFaceDetectionDisabled = z10;
        SDKInternalConfig.getInstance().setFaceDetectionOn(!z10);
    }

    public void setEncryptPayload(boolean z10) {
        this.encryptPayload = z10;
    }

    public void setFaceCaptureOverlay(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bitmap.recycle();
        this.faceCaptureOverlay = byteArray;
    }

    public void setFaceCaptureOverlayDuration(int i10) {
        this.faceCaptureOverlayDuration = i10;
    }

    @Deprecated
    public void setFaceCaptureSubtitle(String str) {
        this.faceCaptureSubtitle = str;
    }

    public void setFaceCaptureTitle(String str) {
        this.faceCaptureTitle = str;
    }

    public void setFaceDetectorTimeout(long j10) {
        this.faceDetectorTimeout = j10;
    }

    public void setFaceTiltAngle(int i10) {
        this.faceTiltAngle = i10;
    }

    public void setFps(int i10) {
        this.fps = i10;
    }

    public void setFullImageWaterMarkTextSizePx(int i10) {
        this.fullImageWaterMarkTextSizePx = i10;
    }

    public void setLivenessAPIHeaders(JSONObject jSONObject) {
        this.headers = jSONObject.toString();
    }

    public void setLivenessAPIParameters(JSONObject jSONObject) {
        this.params = jSONObject.toString();
    }

    public void setLivenessEndpoint(String str) {
        this.livenessEndpoint = str;
    }

    public void setLivenessMode(LivenessMode livenessMode) {
        this.mode = livenessMode;
    }

    public void setLivenessOnMaxFaceNotPresent(boolean z10) {
        this.livenessOnMaxFaceNotPresent = z10;
    }

    public void setMaxAttemptsForFaceNotPresent(int i10) {
        this.maxAttemptsForFaceNotPresent = i10;
    }

    public void setNumberOfFrames(int i10) {
        this.numberOfFrames = i10;
    }

    public void setPadding(float f10, float f11, float f12, float f13) {
        this.leftPadding = f10;
        this.rightPadding = f11;
        this.topPadding = f12;
        this.bottomPadding = f13;
    }

    public void setPhoneTiltAngleThreshold(int i10) {
        this.phoneTiltThreshold = -i10;
    }

    public void setShouldAddWaterMark(boolean z10) {
        this.shouldAddWaterMark = z10;
    }

    public void setShouldAllowPhoneTilt(boolean z10) {
        this.shouldAllowPhoneTilt = z10;
    }

    public void setShouldAutoCapture(boolean z10) {
        this.shouldAutoCapture = z10;
    }

    public void setShouldCheckActiveLiveness(boolean z10) {
        this.shouldCheckActiveLiveness = z10;
        if (z10) {
            setShouldEnableOverlay(false);
            SDKInternalConfig.getInstance().setFaceDetectionProcessor(SDKInternalConfig.FaceDetectionProcessor.MLKIT);
        }
    }

    @Deprecated
    public void setShouldEnableDataLogging(boolean z10) {
    }

    public void setShouldEnableOverlay(boolean z10) {
        if (!this.shouldCheckActiveLiveness) {
            this.enableOverlay = z10;
        } else {
            this.enableOverlay = false;
            this.faceCaptureOverlayDuration = 0;
        }
    }

    public void setShouldEnablePadding(boolean z10) {
        this.shouldSetPadding = z10;
        if (z10) {
            setPadding(0.2f, 0.2f, 0.3f, 0.1f);
        }
    }

    public void setShouldHandleRetries(boolean z10) {
        this.shouldHandleRetries = z10;
    }

    public void setShouldRecordVideo(boolean z10) {
        this.shouldRecordVideo = z10;
    }

    public void setShouldReturnFullImageUrl(boolean z10) {
        this.shouldReturnFullImageUrl = z10;
    }

    public void setShouldShowCameraSwitchButton(boolean z10) {
        this.shouldUseFlip = z10;
    }

    public void setShouldShowInstructionPage(boolean z10) {
        this.shouldShowInstructionPage = z10;
    }

    public void setShouldShowNetworkRetryDialog(boolean z10) {
        this.shouldShowNetworkRetryDialog = z10;
    }

    public void setShouldUseBackCamera(boolean z10) {
        this.shouldUseBackCamera = z10;
    }

    public void setShouldUseDefaultZoom(boolean z10) {
        this.shouldUseDefaultZoom = z10;
    }

    public void setShouldUseEnhancedCameraFeatures(boolean z10) {
        this.shouldUseEnhancedCameraFeatures = z10;
    }

    @Deprecated
    public void setShouldUseZoom(boolean z10) {
        this.shouldUseZoom = z10;
    }

    public void setShowAlertTextBox(boolean z10) {
        this.showAlertTextBox = z10;
    }

    public void setShowConsent(boolean z10) {
        this.showConsent = z10;
    }

    public void setShowModuleBackButton(boolean z10) {
        this.showModuleBackButton = z10;
    }

    public void setStatusTypeFace(int i10) {
        this.statusTypeFace = i10;
    }

    public void setSubtitleTypeface(int i10) {
        this.subtitleTypeface = i10;
    }

    public void setTitleTypeface(int i10) {
        this.titleTypeface = i10;
    }

    public void setTotalGestures(int i10) {
        this.totalGestures = i10;
    }

    public void setUseBothImagesSignatureCalc(boolean z10) {
        this.useBothImagesSignature = z10;
    }

    public void setUseCameraX(boolean z10) {
        this.useCameraX = Boolean.valueOf(z10);
    }

    public void setWaterMarkColor(int i10) {
        this.waterMarkColor = i10;
    }

    public boolean shouldCheckForFaceTilt() {
        return !this.allowFaceTilt;
    }

    public boolean shouldEncryptPayload() {
        return this.encryptPayload;
    }

    public boolean shouldLivenessOnMaxFaceNotPresent() {
        return this.livenessOnMaxFaceNotPresent;
    }

    public boolean shouldRetryIfFaceNotPresent() {
        return this.retryIfFaceNotPresent;
    }

    public boolean shouldShowConsent() {
        return this.showConsent;
    }

    public boolean shouldShowModuleBackButton() {
        return this.showModuleBackButton;
    }

    public Boolean shouldUseCameraX() {
        return this.useCameraX;
    }

    public void showRetryIfFaceNotPresent(boolean z10) {
        this.retryIfFaceNotPresent = z10;
    }

    public boolean isShowAlertTextBox(DisplayMetrics displayMetrics) {
        return !UIUtils.isSmallScreenDevice(displayMetrics) && this.showAlertTextBox;
    }
}
