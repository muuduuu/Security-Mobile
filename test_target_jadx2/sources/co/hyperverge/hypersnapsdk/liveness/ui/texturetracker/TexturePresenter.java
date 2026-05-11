package co.hyperverge.hypersnapsdk.liveness.ui.texturetracker;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.CameraProperties;
import co.hyperverge.hypersnapsdk.data.DataRepository;
import co.hyperverge.hypersnapsdk.data.DataSource;
import co.hyperverge.hypersnapsdk.helpers.ExifHelper;
import co.hyperverge.hypersnapsdk.helpers.FaceRetryHelper;
import co.hyperverge.hypersnapsdk.helpers.FileHelper;
import co.hyperverge.hypersnapsdk.helpers.HVActiveLiveness;
import co.hyperverge.hypersnapsdk.helpers.HVGenericCallback;
import co.hyperverge.hypersnapsdk.helpers.HVLottieHelper;
import co.hyperverge.hypersnapsdk.helpers.ImageComparisonHelper;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.SPHelper;
import co.hyperverge.hypersnapsdk.helpers.SaveBitmapAsync;
import co.hyperverge.hypersnapsdk.helpers.TimingUtils;
import co.hyperverge.hypersnapsdk.helpers.WaterMarkHelper;
import co.hyperverge.hypersnapsdk.helpers.face.FaceConstants;
import co.hyperverge.hypersnapsdk.helpers.face.FaceDetectionListener;
import co.hyperverge.hypersnapsdk.helpers.face.MLKitFaceHelper;
import co.hyperverge.hypersnapsdk.helpers.face.NPDFaceHelper;
import co.hyperverge.hypersnapsdk.listeners.APICompletionCallback;
import co.hyperverge.hypersnapsdk.listeners.FaceCaptureCompletionHandler;
import co.hyperverge.hypersnapsdk.listeners.LocationProviderCallback;
import co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract;
import co.hyperverge.hypersnapsdk.model.BaseResponse;
import co.hyperverge.hypersnapsdk.model.LivenessResponse;
import co.hyperverge.hypersnapsdk.objects.HVBaseResponse;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HVFrameRecorderData;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.objects.HVVideoRecordingData;
import co.hyperverge.hypersnapsdk.objects.IPAddress;
import co.hyperverge.hypersnapsdk.providers.CallbackProvider;
import co.hyperverge.hypersnapsdk.service.iptogeo.IPToGeoService;
import co.hyperverge.hypersnapsdk.service.iptogeo.IPToGeoServiceImpl;
import co.hyperverge.hypersnapsdk.service.location.LocationServiceImpl;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.DeviceExtensionsKt;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.InternalToolUtils;
import co.hyperverge.hypersnapsdk.utils.StaticVideoAnalyzer;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import co.hyperverge.hypersnapsdk.utils.threading.MainUIThread;
import co.hyperverge.hypersnapsdk.utils.threading.ThreadExecutor;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TexturePresenter implements TextureContract.Presenter, FaceDetectionListener {
    private Long completeVideoDuration;
    FaceCaptureCompletionHandler completionHandler;
    public String fullImageUri;
    HVActiveLiveness hvActiveLiveness;
    private Long imageCaptureTimestamp;
    ImageComparisonHelper imageComparisonHelper;
    boolean isFaceDetected;
    boolean isMultipleFaces;
    boolean isSaving;
    private String lastCroppedFacePath;
    private List<Integer> lastFaceCoords;
    private String lastFilePath;
    private String lastFrameZipUri;
    private String lastVideoUri;
    private Location mLocation;
    TextureContract.View mView;
    boolean moveAway;
    DataRepository repository;
    long timeTaken;
    private Long trimmedVideoDuration;
    private HVError videoFailureError;
    private String waterMarkCropImageUrl;
    private String waterMarkFullImageUrl;
    private boolean isFirstFaceDetectionStateSet = false;
    private boolean isFirstFrameSentForProcessing = false;
    private final String TAG = getClass().getSimpleName();
    private final ArrayList<HVBaseResponse> retakeResponses = new ArrayList<>();
    HVFaceConfig.LivenessMode mode = HVFaceConfig.LivenessMode.TEXTURELIVENESS;
    String clientId = BuildConfig.FLAVOR;
    String imageUri = BuildConfig.FLAVOR;
    String retryAction = null;
    String retakeMessage = null;
    MediaMetadataRetriever metaDataRetriever = new MediaMetadataRetriever();
    private final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
    private String videoUri = BuildConfig.FLAVOR;
    private String frameZipUri = null;
    private HVFrameRecorderData hvFrameRecorderData = null;
    private String latLongString = BuildConfig.FLAVOR;
    boolean isFaceDetectedAtleastOnce = false;
    private boolean hasFaceDetectorTimedOut = false;
    private boolean isCheckingCamera = false;
    private final int CAMERA_CHECK_DELAY = 20;
    private boolean maxRetryAttemptsExhausted = false;
    ThreadExecutor mExecutor = ThreadExecutor.getInstance();
    MainUIThread uiThread = MainUIThread.getInstance();
    boolean uiReady = true;
    Handler delayHandler = new Handler();
    private final SDKInternalConfig.FaceDetectionProcessor faceDetectionProcessor = SDKInternalConfig.getInstance().getFaceDetectionProcessor();
    private FaceConstants.FaceDetectionState faceDetectionState = FaceConstants.FaceDetectionState.FACE_TOO_FAR;
    HVFaceConfig faceConfig = new HVFaceConfig();

    /* renamed from: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TexturePresenter$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$co$hyperverge$hypersnapsdk$helpers$SDKInternalConfig$FaceDetectionProcessor;

        static {
            int[] iArr = new int[SDKInternalConfig.FaceDetectionProcessor.values().length];
            $SwitchMap$co$hyperverge$hypersnapsdk$helpers$SDKInternalConfig$FaceDetectionProcessor = iArr;
            try {
                iArr[SDKInternalConfig.FaceDetectionProcessor.NPD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$helpers$SDKInternalConfig$FaceDetectionProcessor[SDKInternalConfig.FaceDetectionProcessor.MLKIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public TexturePresenter() {
        MLKitFaceHelper.get();
        NPDFaceHelper.get();
        this.repository = DataRepository.getInstance();
        this.imageComparisonHelper = ImageComparisonHelper.get();
        this.completionHandler = CallbackProvider.get().injectFaceCaptureCallback();
    }

    private void addAdditionalMetadata(final HVGenericCallback<HashMap<String, Object>> hVGenericCallback) {
        this.singleThreadExecutor.execute(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.H
            @Override // java.lang.Runnable
            public final void run() {
                TexturePresenter.this.lambda$addAdditionalMetadata$7(hVGenericCallback);
            }
        });
    }

    private void addFrameRecordingDataToLivenessParams(String str) {
        HVLogUtils.d(this.TAG, "addCameraXVideoRecordingDataToLivenessParams() called with: videoUri = [" + str + "]");
        if (getFaceConfig().getLivenessParams() != null) {
            try {
                JSONObject livenessParams = getFaceConfig().getLivenessParams();
                if (this.hvFrameRecorderData == null) {
                    this.hvFrameRecorderData = new HVFrameRecorderData();
                }
                this.hvFrameRecorderData.getRecorderData().setEnabled(Boolean.valueOf(getFaceConfig().isShouldRecordVideo()));
                this.hvFrameRecorderData.getRecorderData().setVideoDuration(this.completeVideoDuration);
                livenessParams.put(AppConstants.VIDEO_RECORDING_V2_DATA, new com.google.gson.e().t(this.hvFrameRecorderData));
                getFaceConfig().setLivenessAPIParameters(livenessParams);
            } catch (Exception e10) {
                HVLogUtils.e(this.TAG, "uploadImage: video recording data points for camera x could not be added to livenessParams: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    private void addVideoRecordingDataToLivenessParams(String str) {
        HVLogUtils.d(this.TAG, "addVideoRecordingDataToLivenessParams() called with: videoUri = [" + str + "]");
        if (getFaceConfig().getLivenessParams() != null) {
            try {
                JSONObject livenessParams = getFaceConfig().getLivenessParams();
                HVVideoRecordingData videoRecordingDataPoints = this.mView.getVideoRecordingDataPoints();
                videoRecordingDataPoints.setCompleteVideoDuration(this.completeVideoDuration);
                videoRecordingDataPoints.setVideoDuration(this.trimmedVideoDuration);
                videoRecordingDataPoints.setVideoSize(Double.valueOf(FileHelper.getFileSizeInBytes(str)));
                HVError hVError = this.videoFailureError;
                if (hVError != null) {
                    videoRecordingDataPoints.setError(hVError.getErrorMessage());
                }
                livenessParams.put(AppConstants.VIDEO_RECORDING_DATA, videoRecordingDataPoints.toJson().toString());
                getFaceConfig().setLivenessAPIParameters(livenessParams);
            } catch (Exception e10) {
                HVLogUtils.e(this.TAG, "uploadImage: video recording data points could not be added to livenessParams: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    private void checkCPRSession(final String str, final String str2, final List<Integer> list, final String str3) {
        HVLogUtils.d(this.TAG, "checkCPRSession() called with: filePath = [" + str + "], croppedFacePath = [" + str2 + "], faceCoords = [" + list + "], videoUri = [" + str3 + "]");
        if (this.faceConfig.getCPRCheckSessionHeaders() == null || this.mView.injectContext() == null) {
            makeLivenessCall(str, str2, list, str3, this.frameZipUri);
        } else {
            this.repository.checkCPRSession(this.mView.injectContext(), this.faceConfig.getCPRCheckSessionHeaders(), new JSONObject(), new APICompletionCallback() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.v
                @Override // co.hyperverge.hypersnapsdk.listeners.APICompletionCallback
                public final void onResult(HVError hVError, HVResponse hVResponse) {
                    TexturePresenter.this.lambda$checkCPRSession$5(str, str2, list, str3, hVError, hVResponse);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkCameraAndHandleCompletion, reason: merged with bridge method [inline-methods] */
    public void lambda$checkCameraAndHandleCompletion$12(final HVError hVError, final HVResponse hVResponse) {
        HVLogUtils.d(this.TAG, "checkCameraAndHandleCompletion() called with: error = [" + hVError + "], hvResponse = [" + hVResponse + "]");
        this.uiThread.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.J
            @Override // java.lang.Runnable
            public final void run() {
                TexturePresenter.this.lambda$checkCameraAndHandleCompletion$13(hVError, hVResponse);
            }
        });
    }

    private void checkForStaticVideo(final SaveBitmapAsync saveBitmapAsync) {
        HVLogUtils.d(this.TAG, "checkForStaticVideo() called");
        new StaticVideoAnalyzer().analyze(this.videoUri, this.metaDataRetriever, new StaticVideoAnalyzer.VideoAnalysisCallback() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.z
            @Override // co.hyperverge.hypersnapsdk.utils.StaticVideoAnalyzer.VideoAnalysisCallback
            public final void onAnalysisComplete(boolean z10) {
                TexturePresenter.this.lambda$checkForStaticVideo$0(saveBitmapAsync, z10);
            }
        });
    }

    private HVBaseResponse createHVResponse(LivenessResponse livenessResponse, boolean z10) {
        JSONObject jSONObject;
        String str;
        Integer num;
        HVActiveLiveness hVActiveLiveness;
        HVLogUtils.d(this.TAG, "createHVResponse() called with: livenessResponse = [" + livenessResponse + "], shouldReturnBaseResponse = [" + z10 + "]");
        JSONObject jSONObject2 = new JSONObject();
        if (livenessResponse != null) {
            if (livenessResponse.getResponse() != null) {
                jSONObject2 = livenessResponse.getResponse();
                if (this.mode == HVFaceConfig.LivenessMode.TEXTURELIVENESS && SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService().logLivenessAPISuccessful(livenessResponse, getFaceConfig(), this.timeTaken);
                }
            }
            jSONObject = livenessResponse.getHeaders();
            num = livenessResponse.getHttpStatusCode();
            str = livenessResponse.getStatusMessage();
        } else {
            jSONObject = null;
            str = null;
            num = null;
        }
        HVBaseResponse hVBaseResponse = z10 ? new HVBaseResponse(jSONObject2, jSONObject, this.imageUri, this.retryAction) : new HVResponse(jSONObject2, jSONObject, this.imageUri, this.retryAction);
        Location location = this.mLocation;
        if (location != null) {
            hVBaseResponse.setLatitude(Double.valueOf(location.getLatitude()));
            hVBaseResponse.setLongitude(Double.valueOf(this.mLocation.getLongitude()));
        }
        Long l10 = this.imageCaptureTimestamp;
        if (l10 != null) {
            hVBaseResponse.setSubmittedTimestamp(l10);
        }
        hVBaseResponse.setRetakeMessage(this.retakeMessage);
        hVBaseResponse.setAttemptsCount(SPHelper.getAttemptsCountForImage(getFaceConfig().getLivenessEndpoint(), this.faceConfig.getSuffixModuleId()));
        if (getFaceConfig().isShouldReturnFullImageUrl()) {
            hVBaseResponse.setFullImageURI(this.fullImageUri);
        } else if (!StringUtils.isEmptyOrNull(this.fullImageUri) && !this.fullImageUri.equals(this.imageUri)) {
            new File(this.fullImageUri).delete();
        }
        if (getFaceConfig().isShouldAddWaterMark() && HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseLocation()) {
            hVBaseResponse.setWaterMarkFullImageUri(this.waterMarkFullImageUrl);
            hVBaseResponse.setWaterMarkCroppedImageUri(this.waterMarkCropImageUrl);
        }
        if (getFaceConfig().isShouldCheckActiveLiveness() && (hVActiveLiveness = this.hvActiveLiveness) != null && hVActiveLiveness.getSavedImagePaths() != null) {
            hVBaseResponse.setGestureLivenessImageUrls((HashMap) this.hvActiveLiveness.getSavedImagePaths());
        }
        hVBaseResponse.setVideoUri(this.videoUri);
        hVBaseResponse.setStatusMessage(str);
        hVBaseResponse.setStatusCode(num);
        Log.d("response before sending", hVBaseResponse.toString());
        return hVBaseResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HVFaceConfig getFaceConfig() {
        HVFaceConfig hVFaceConfig = this.faceConfig;
        if (hVFaceConfig != null) {
            return hVFaceConfig;
        }
        lambda$onFailureResponse$8(null, getError(2, this.mView.getStringForID(R.string.face_config_error)));
        return new HVFaceConfig();
    }

    private void getLocation() {
        try {
            HVLogUtils.d(this.TAG, "getLocation() called");
            LocationServiceImpl.getInstance(this.mView.injectContext()).startLocationUpdates();
            LocationServiceImpl.getInstance(this.mView.injectContext()).addLocationCallback(new LocationProviderCallback() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TexturePresenter.3
                @Override // co.hyperverge.hypersnapsdk.listeners.LocationProviderCallback
                public void onResult(Location location) {
                    if (location != null) {
                        TexturePresenter.this.mLocation = location;
                        TexturePresenter.this.latLongString = location.getLatitude() + ", " + location.getLongitude();
                        return;
                    }
                    TexturePresenter texturePresenter = TexturePresenter.this;
                    texturePresenter.mLocation = LocationServiceImpl.getInstance(texturePresenter.mView.injectContext()).getLastKnownLocation();
                    TexturePresenter.this.latLongString = TexturePresenter.this.mLocation.getLatitude() + ", " + TexturePresenter.this.mLocation.getLongitude();
                }
            });
        } catch (NoClassDefFoundError e10) {
            HVLogUtils.e(this.TAG, "getLocation(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(this.TAG, "gms excluded");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addAdditionalMetadata$7(final HVGenericCallback hVGenericCallback) {
        final HashMap<String, Object> additionalLivenessMetadata = DeviceExtensionsKt.getAdditionalLivenessMetadata(this.mView.injectContext());
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.F
            @Override // java.lang.Runnable
            public final void run() {
                HVGenericCallback.this.accept(additionalLivenessMetadata);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkCPRSession$5(String str, String str2, List list, String str3, HVError hVError, HVResponse hVResponse) {
        if (hVError == null) {
            makeLivenessCall(str, str2, list, str3, this.frameZipUri);
            return;
        }
        HVLogUtils.e(this.TAG, "checkCPRSession.onResult() failed with error: " + hVError.getErrorMessage());
        sendCheckSessionResponse(hVResponse, hVError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkCameraAndHandleCompletion$13(final HVError hVError, final HVResponse hVResponse) {
        if (this.isCheckingCamera) {
            HVLogUtils.d(this.TAG, "checkCameraAndHandleCompletion: already checking");
            return;
        }
        if (!this.mView.isCameraReleased()) {
            HVLogUtils.d(this.TAG, "checkCameraAndHandleCompletion: camera is not released");
            new Handler().postDelayed(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.A
                @Override // java.lang.Runnable
                public final void run() {
                    TexturePresenter.this.lambda$checkCameraAndHandleCompletion$12(hVError, hVResponse);
                }
            }, 20L);
            return;
        }
        this.isCheckingCamera = true;
        HVLogUtils.d(this.TAG, "checkCameraAndHandleCompletion: camera is released");
        int i10 = (hVError == null || hVError.getErrorCode() != 4) ? -1 : AppConstants.PERMISSION_CANCELLED;
        if (hVError != null && hVError.getErrorCode() == 3) {
            i10 = this.mView.shouldShowConsentOnBackPress() ? 200 : 300;
        }
        if (i10 == -1 || (!getFaceConfig().isShouldShowInstructionPage() && !this.mView.shouldShowConsentOnBackPress())) {
            this.mView.callCompletionHandler(hVError, hVResponse);
        }
        finishView(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkForRetryLogic$14(boolean z10, LivenessResponse livenessResponse, String str, String str2, HVError hVError) {
        if (!z10 || getFaceConfig().shouldLivenessOnMaxFaceNotPresent() || this.maxRetryAttemptsExhausted) {
            lambda$onFailureResponse$8(livenessResponse, hVError);
            return;
        }
        this.retakeResponses.add(createHVResponse(livenessResponse, true));
        startRetakeScreen(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkForRetryLogic$15(String str, final boolean z10, final LivenessResponse livenessResponse, final String str2, final String str3, final HVError hVError) {
        this.mView.showLoader(true, BuildConfig.FLAVOR, str, HVLottieHelper.State.END, new HVLottieHelper.Listener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.t
            @Override // co.hyperverge.hypersnapsdk.helpers.HVLottieHelper.Listener
            public final void onEnd() {
                TexturePresenter.this.lambda$checkForRetryLogic$14(z10, livenessResponse, str2, str3, hVError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0023, code lost:
    
        if (r19 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r14.getHttpStatusCode().intValue() == 200) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r0 = co.hyperverge.hypersnapsdk.helpers.HVLottieHelper.FACE_SUCCESS;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$checkForRetryLogic$16(final LivenessResponse livenessResponse, final String str, final boolean z10, final String str2, String str3, final HVError hVError) {
        TextureContract.View view;
        HVLottieHelper.State state;
        HVLottieHelper.Listener listener;
        this.retryAction = str3;
        this.retakeMessage = str2;
        try {
            if (str3 != null) {
                try {
                    if (!str3.equals("pass")) {
                        if (str3.equals("manualReview")) {
                        }
                    }
                } catch (Exception e10) {
                    String str4 = this.TAG;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("checkForRetryLogic() with: livenessResponse = [");
                    try {
                        sb2.append(livenessResponse);
                        sb2.append("], filePath = [");
                        try {
                            sb2.append(str);
                            sb2.append("]: exception = [");
                            sb2.append(Utils.getErrorMessage(e10));
                            sb2.append("]");
                            HVLogUtils.e(str4, sb2.toString(), e10);
                            Log.e(this.TAG, "checkForRetryLogic: " + Utils.getErrorMessage(e10));
                            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                            }
                            view = this.mView;
                            state = HVLottieHelper.State.TRANSITION;
                            final String str5 = HVLottieHelper.FACE_FAILURE;
                            listener = new HVLottieHelper.Listener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.B
                                @Override // co.hyperverge.hypersnapsdk.helpers.HVLottieHelper.Listener
                                public final void onEnd() {
                                    TexturePresenter.this.lambda$checkForRetryLogic$15(str5, z10, livenessResponse, str, str2, hVError);
                                }
                            };
                        } catch (Throwable th) {
                            th = th;
                            TextureContract.View view2 = this.mView;
                            HVLottieHelper.State state2 = HVLottieHelper.State.TRANSITION;
                            final String str6 = HVLottieHelper.FACE_FAILURE;
                            view2.showLoader(true, BuildConfig.FLAVOR, null, state2, new HVLottieHelper.Listener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.B
                                @Override // co.hyperverge.hypersnapsdk.helpers.HVLottieHelper.Listener
                                public final void onEnd() {
                                    TexturePresenter.this.lambda$checkForRetryLogic$15(str6, z10, livenessResponse, str, str2, hVError);
                                }
                            });
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        TextureContract.View view22 = this.mView;
                        HVLottieHelper.State state22 = HVLottieHelper.State.TRANSITION;
                        final String str62 = HVLottieHelper.FACE_FAILURE;
                        view22.showLoader(true, BuildConfig.FLAVOR, null, state22, new HVLottieHelper.Listener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.B
                            @Override // co.hyperverge.hypersnapsdk.helpers.HVLottieHelper.Listener
                            public final void onEnd() {
                                TexturePresenter.this.lambda$checkForRetryLogic$15(str62, z10, livenessResponse, str, str2, hVError);
                            }
                        });
                        throw th;
                    }
                }
            }
            if (livenessResponse.getHttpStatusCode() != null) {
            }
            String str7 = HVLottieHelper.FACE_FAILURE;
            final String str8 = str7;
            view = this.mView;
            state = HVLottieHelper.State.TRANSITION;
            listener = new HVLottieHelper.Listener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.B
                @Override // co.hyperverge.hypersnapsdk.helpers.HVLottieHelper.Listener
                public final void onEnd() {
                    TexturePresenter.this.lambda$checkForRetryLogic$15(str8, z10, livenessResponse, str, str2, hVError);
                }
            };
            view.showLoader(true, BuildConfig.FLAVOR, null, state, listener);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkForStaticVideo$0(SaveBitmapAsync saveBitmapAsync, boolean z10) {
        HVLogUtils.d(this.TAG, "checkForStaticVideo() isStatic: " + z10);
        if (!z10) {
            this.mExecutor.execute(saveBitmapAsync);
            return;
        }
        HVError hVError = new HVError(2, this.mView.getStringForID(R.string.static_video_error));
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieVideoRecordFailed(hVError, this.mView.getVideoRecordedTime());
        }
        int attemptsCountForStaticVideo = SPHelper.getAttemptsCountForStaticVideo() + 1;
        SPHelper.setAttemptsCountForStaticVideo(attemptsCountForStaticVideo);
        if (attemptsCountForStaticVideo >= 3) {
            this.mExecutor.execute(saveBitmapAsync);
            return;
        }
        this.videoUri = null;
        this.isSaving = false;
        this.mView.onPictureSaved(BuildConfig.FLAVOR);
        startRetakeScreen(BuildConfig.FLAVOR, this.mView.getRetakeMessageForStaticVideo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$moveOnFromFaceCapture$1() {
        onFailureResponse(getError(2, this.mView.getStringForID(R.string.internal_error)), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$moveOnFromFaceCapture$2() {
        onFailureResponse(getError(23, this.mView.getStringForID(R.string.blurry_face_detection_error)), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$moveOnFromFaceCapture$3() {
        onFailureResponse(getError(23, this.mView.getStringForID(R.string.blurry_face_detection_error)), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFailureResponse$9(final LivenessResponse livenessResponse, final HVError hVError) {
        this.mView.showLoader(true, BuildConfig.FLAVOR, HVLottieHelper.FACE_FAILURE, HVLottieHelper.State.END, new HVLottieHelper.Listener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.K
            @Override // co.hyperverge.hypersnapsdk.helpers.HVLottieHelper.Listener
            public final void onEnd() {
                TexturePresenter.this.lambda$onFailureResponse$8(livenessResponse, hVError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFaceDetectionStateFromView$11(FaceConstants.FaceDetectionState faceDetectionState) {
        this.mView.setFaceDetectionState(faceDetectionState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDialog$10(boolean z10, String str) {
        if (getFaceConfig().getCustomLoaderClass() == null) {
            this.mView.shouldShowProgress(z10, str);
            return;
        }
        if (!z10) {
            ((Activity) this.mView.injectContext()).finishActivity(87);
            return;
        }
        try {
            ((Activity) this.mView.injectContext()).startActivityForResult(new Intent(this.mView.injectContext(), Class.forName(getFaceConfig().getCustomLoaderClass())), 87);
        } catch (ClassNotFoundException e10) {
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRetakeScreen$17() {
        this.mView.resetLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$submitPreviewData$18(byte[] bArr, long j10, int i10, int i11, boolean z10) {
        this.imageComparisonHelper.compareConsecutiveFrames(bArr, j10, i10, i11, Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadImage$4(String str, String str2, List list, String str3, HashMap hashMap) {
        if (getFaceConfig().getLivenessParams() != null) {
            JSONObject livenessParams = getFaceConfig().getLivenessParams();
            try {
                livenessParams.put(AppConstants.LIVENESS_ADDITIONAL_METADATA, new JSONObject(hashMap).toString());
                getFaceConfig().setLivenessAPIParameters(livenessParams);
            } catch (JSONException e10) {
                HVLogUtils.e(this.TAG, "Unable to add additionalLivenessParams: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
        checkCPRSession(str, str2, list, str3);
    }

    private void makeLivenessCall(final String str, String str2, List<Integer> list, String str3, String str4) {
        this.lastFilePath = str;
        this.lastCroppedFacePath = str2;
        this.lastFaceCoords = list;
        this.lastVideoUri = str3;
        this.lastFrameZipUri = str4;
        final TimingUtils timingUtils = new TimingUtils();
        this.repository.getLivenessTextureScore(this.mView.injectContext(), str, str2, str3, str4, list, getFaceConfig(), new DataSource.NetworkCallback() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TexturePresenter.2
            @Override // co.hyperverge.hypersnapsdk.data.DataSource.NetworkCallback
            public void onFailure(int i10, String str5) {
                HVError error;
                HVLogUtils.d(TexturePresenter.this.TAG, "onFailure() called with: errorCode = [" + i10 + "], message = [" + str5 + "]");
                try {
                    TexturePresenter.this.mView.setShouldAllowActivityClose(true);
                    if (str5 == null || !str5.contains("Certificate pinning")) {
                        error = TexturePresenter.this.getError(i10, str5);
                    } else {
                        TexturePresenter texturePresenter = TexturePresenter.this;
                        error = texturePresenter.getError(15, texturePresenter.mView.getStringForID(R.string.ssl_error));
                    }
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieAPICallFailed(null, error);
                    }
                    TexturePresenter.this.onFailureResponse(error, null);
                } catch (Exception e10) {
                    HVLogUtils.e(TexturePresenter.this.TAG, "getLivenessTextureScore.onFailure(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                    Log.e(TexturePresenter.this.TAG, Utils.getErrorMessage(e10));
                    if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                        SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                    }
                }
            }

            @Override // co.hyperverge.hypersnapsdk.data.DataSource.NetworkCallback
            public void onNetworkFailure() {
                HVLogUtils.d(TexturePresenter.this.TAG, "onNetworkFailure() called");
                TexturePresenter.this.mView.setShouldAllowActivityClose(true);
                TexturePresenter texturePresenter = TexturePresenter.this;
                HVError error = texturePresenter.getError(12, texturePresenter.mView.getStringForID(R.string.network_error));
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieAPICallFailed(null, error);
                }
                if (TexturePresenter.this.getFaceConfig().isShouldShowNetworkRetryDialog()) {
                    TexturePresenter.this.mView.notifyNetworkFailure();
                } else {
                    TexturePresenter.this.onFailureResponse(error, null);
                }
            }

            @Override // co.hyperverge.hypersnapsdk.data.DataSource.NetworkCallback
            public void onSuccess(BaseResponse baseResponse) {
                HVLogUtils.d(TexturePresenter.this.TAG, "getLivenessTextureScore.onSuccess() called with: response = [" + baseResponse + "]");
                TexturePresenter.this.mView.setShouldAllowActivityClose(true);
                Log.d(TexturePresenter.this.TAG, "onSuccess() called with: response = [" + baseResponse + "]");
                TexturePresenter.this.timeTaken = timingUtils.getTimeDifferenceLong().longValue();
                TexturePresenter.this.faceDetectionState = FaceConstants.FaceDetectionState.FACE_NOT_DETECTED;
                LivenessResponse livenessResponse = (LivenessResponse) baseResponse;
                if (InternalToolUtils.isTestMode(TexturePresenter.this.mView.injectContext())) {
                    TexturePresenter.this.mergeJSON(livenessResponse.getResponse());
                }
                if (livenessResponse.getErrorCode() == 18) {
                    TexturePresenter.this.onFailureResponse(TexturePresenter.this.getError(livenessResponse.getErrorCode(), livenessResponse.getLivenessError()), livenessResponse);
                    return;
                }
                if (baseResponse == null || baseResponse.getHttpStatusCode() == null) {
                    HVError error = TexturePresenter.this.getError(14, "Internal server error has occurred.");
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieAPICallFailed(null, error);
                    }
                    TexturePresenter.this.onFailureResponse(error, null);
                    return;
                }
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieAPIResponseReceived(livenessResponse, str, timingUtils.getTimeDifferenceLong().longValue());
                }
                TexturePresenter.this.processServerResponse(livenessResponse, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJSON(JSONObject jSONObject) {
        JSONObject selfieLivenessResult = InternalToolUtils.getSelfieLivenessResult();
        if (jSONObject == null || selfieLivenessResult == null) {
            return;
        }
        Iterator<String> keys = selfieLivenessResult.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                if (jSONObject.has(next)) {
                    jSONObject.remove(next);
                    jSONObject.put(next, selfieLivenessResult.get(next));
                }
            } catch (JSONException e10) {
                HVLogUtils.e(this.TAG, "getLivenessTextureScore: onSuccess: could not put 'selfieLivenessResult' object inside 'resultInternal'", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moveOnFromFaceCapture(String str, String str2, String str3, List<Integer> list, IPAddress iPAddress, ExifHelper exifHelper, String str4) {
        HVLogUtils.d(this.TAG, "moveOnFromFaceCapture() called with: filePath = [" + str + "], fileName = [" + str2 + "], croppedFilePath = [" + str3 + "], faceCoords = [" + list + "], ipAddress = [" + iPAddress + "], helper = [" + exifHelper + "], transactionID = [" + str4 + "]");
        if (this.mView.isFragmentAdded()) {
            exifHelper.writeExifData(this.imageUri, str4, iPAddress);
            exifHelper.writeExifData(this.fullImageUri, str4, iPAddress);
            if (getFaceConfig().isShouldAddWaterMark()) {
                exifHelper.writeExifData(this.waterMarkFullImageUrl, str4, iPAddress);
                exifHelper.writeExifData(this.waterMarkCropImageUrl, str4, iPAddress);
            }
            if (getFaceConfig().isShouldRecordVideo()) {
                long videoDuration = Utils.getVideoDuration(this.videoUri, this.mView.injectContext(), this.metaDataRetriever);
                this.trimmedVideoDuration = Long.valueOf(videoDuration);
                if (videoDuration == 0) {
                    this.videoUri = null;
                    this.videoFailureError = new HVError(2, "videoDuration is 0 ms");
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieVideoRecordFailed(this.videoFailureError, this.mView.getVideoRecordedTime());
                    }
                } else if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieVideoRecordSuccessful(this.videoUri, videoDuration, this.mView.getVideoRecordedTime());
                }
            }
            if (this.imageUri == null) {
                if (getFaceConfig().shouldRetryIfFaceNotPresent()) {
                    int attemptsCountForFaceNotPresent = SPHelper.getAttemptsCountForFaceNotPresent();
                    if (attemptsCountForFaceNotPresent < 0) {
                        this.delayHandler.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.s
                            @Override // java.lang.Runnable
                            public final void run() {
                                TexturePresenter.this.lambda$moveOnFromFaceCapture$1();
                            }
                        });
                    } else {
                        int i10 = attemptsCountForFaceNotPresent + 1;
                        SPHelper.setAttemptsCountForFaceNotPresent(i10);
                        if (i10 < getFaceConfig().getMaxAttemptsForFaceNotPresent()) {
                            startRetakeScreen(str + "/" + str2, this.mView.getRetakeMessageForFaceNotPresentInCapturedImage());
                        } else if (getFaceConfig().shouldLivenessOnMaxFaceNotPresent()) {
                            uploadImage(str + "/" + str2, str3, list, this.videoUri);
                            this.maxRetryAttemptsExhausted = true;
                        } else {
                            this.delayHandler.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.C
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TexturePresenter.this.lambda$moveOnFromFaceCapture$2();
                                }
                            });
                        }
                    }
                } else {
                    this.delayHandler.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.D
                        @Override // java.lang.Runnable
                        public final void run() {
                            TexturePresenter.this.lambda$moveOnFromFaceCapture$3();
                        }
                    });
                }
            } else if (this.mode == HVFaceConfig.LivenessMode.NONE) {
                lambda$onFailureResponse$8(null, null);
            } else if (getFaceConfig().isShouldCheckActiveLiveness()) {
                HVActiveLiveness hVActiveLiveness = this.hvActiveLiveness;
                if (hVActiveLiveness != null) {
                    if (hVActiveLiveness.saveImage(str + "/" + str2)) {
                        this.mView.pauseCamera();
                        uploadImage(str + "/" + str2, str3, list, null);
                    } else {
                        this.faceDetectionState = this.hvActiveLiveness.isFaceDetected() ? FaceConstants.FaceDetectionState.FACE_DETECTED : FaceConstants.FaceDetectionState.FACE_NOT_DETECTED;
                        this.mView.resumeCamera();
                    }
                }
            } else {
                uploadImage(str + "/" + str2, str3, list, this.videoUri);
            }
            this.isSaving = false;
        }
    }

    private void startRetakeScreen(String str, String str2) {
        HVLogUtils.d(this.TAG, "startRetakeScreen() called with: filePath = [" + str + "], message = [" + str2 + "]");
        this.faceDetectionState = SDKInternalConfig.getInstance().isFaceDetectionOn() ? FaceConstants.FaceDetectionState.FACE_NOT_DETECTED : FaceConstants.FaceDetectionState.FACE_DETECTED;
        this.imageCaptureTimestamp = null;
        Intent intent = new Intent(this.mView.injectContext(), (Class<?>) HVRetakeActivity.class);
        intent.putExtra(HVRetakeActivity.IMAGE_URI_TAG, str);
        intent.putExtra(HVRetakeActivity.RETRY_MESSAGE_TAG, str2);
        intent.putExtra(HVRetakeActivity.CONFIG_TAG, getFaceConfig());
        intent.putExtra(HVRetakeActivity.FACE_TAG, true);
        intent.putExtra(HVRetakeActivity.CALLING_ACTIVITY_TAG, HVRetakeActivity.FACE_CALLING_ACTIVITY_VALUE);
        intent.putExtra(HVRetakeActivity.RADIUS_TAG, this.mView.getViewListener().getViewRadius());
        ((Activity) this.mView.injectContext()).startActivityForResult(intent, 1);
        this.uiThread.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.I
            @Override // java.lang.Runnable
            public final void run() {
                TexturePresenter.this.lambda$startRetakeScreen$17();
            }
        });
    }

    public byte[] bitmapToRgbByteArray(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr[i12];
            bArr[i11] = (byte) ((i13 >> 16) & 255);
            int i14 = i11 + 2;
            bArr[i11 + 1] = (byte) ((i13 >> 8) & 255);
            i11 += 3;
            bArr[i14] = (byte) (i13 & 255);
        }
        return bArr;
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public Boolean canResumeCamera() {
        return Boolean.valueOf(this.faceDetectionState != FaceConstants.FaceDetectionState.SAVE_UPLOAD);
    }

    public void checkForRetryLogic(final LivenessResponse livenessResponse, final String str) {
        HVLogUtils.d(this.TAG, "checkForRetryLogic() called with: livenessResponse = [" + livenessResponse + "], filePath = [" + str + "]");
        FaceRetryHelper.get().checkForRetakeMessage(getJSONForRetry(livenessResponse), getFaceConfig(), new FaceRetryHelper.FaceRetryListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.E
            @Override // co.hyperverge.hypersnapsdk.helpers.FaceRetryHelper.FaceRetryListener
            public final void onResult(boolean z10, String str2, String str3, HVError hVError) {
                TexturePresenter.this.lambda$checkForRetryLogic$16(livenessResponse, str, z10, str2, str3, hVError);
            }
        });
    }

    public void checkForWaterMark() {
        HVLogUtils.d(this.TAG, "checkForWaterMark() called");
        if (getFaceConfig().isShouldAddWaterMark() && HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseLocation()) {
            if (this.fullImageUri != null) {
                this.waterMarkFullImageUrl = WaterMarkHelper.get().addWaterMarkOnFullImage(this.mView.injectContext(), getFaceConfig(), this.latLongString, this.fullImageUri, false);
            }
            if (this.imageUri != null) {
                this.waterMarkCropImageUrl = WaterMarkHelper.get().addWaterMarkOnFullImage(this.mView.injectContext(), getFaceConfig(), this.latLongString, this.imageUri, true);
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void closeOnLowStorage() {
        HVLogUtils.d(this.TAG, "closeOnLowStorage() called");
        lambda$onFailureResponse$8(null, getError(25, this.mView.getStringForID(R.string.storage_error)));
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void faceCaptureError(HVError hVError) {
        HVLogUtils.d(this.TAG, "faceCaptureError() called with: hvError = [" + hVError + "]");
        lambda$onFailureResponse$8(null, hVError);
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void faceCaptureTimeout() {
        HVLogUtils.d(this.TAG, "faceCaptureTimeout() called");
        lambda$onFailureResponse$8(null, getError(35, this.mView.getStringForID(R.string.face_capture_timeout)));
    }

    public void finishView(int i10) {
        HVLogUtils.d(this.TAG, "finishView() called with: resultCode = [" + i10 + "]");
        try {
            this.imageComparisonHelper.destroy();
            FaceRetryHelper.destroy();
            MLKitFaceHelper.get().destroy();
            NPDFaceHelper.get().destroy();
            LocationServiceImpl.destroy();
            HVActiveLiveness hVActiveLiveness = this.hvActiveLiveness;
            if (hVActiveLiveness != null) {
                hVActiveLiveness.destroy();
            }
            this.mView.finishTextureView(i10);
            MediaMetadataRetriever mediaMetadataRetriever = this.metaDataRetriever;
            if (mediaMetadataRetriever != null) {
                mediaMetadataRetriever.release();
            }
            this.completionHandler = null;
        } catch (Exception e10) {
            HVLogUtils.e(this.TAG, "finishView(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(this.TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    public HVError getError(int i10, String str) {
        HVLogUtils.d(this.TAG, "getError() called with: errorCode = [" + i10 + "], errorMsg = [" + str + "]");
        return new HVError(i10, str);
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public FaceConstants.FaceDetectionState getFaceDetectionState() {
        HVLogUtils.d(this.TAG, "getFaceDetectionState() called");
        HVLogUtils.d(this.TAG, "getFaceDetectionState: returning " + this.faceDetectionState);
        return this.faceDetectionState;
    }

    public JSONObject getJSONForRetry(LivenessResponse livenessResponse) {
        HVLogUtils.d(this.TAG, "getJSONForRetry() called with: livenessResponse = [" + livenessResponse + "]");
        JSONObject jSONObject = new JSONObject();
        if (livenessResponse.getResponse() != null) {
            return livenessResponse.getResponse();
        }
        try {
            JSONObject headers = livenessResponse.getHeaders();
            if (!headers.has(AppConstants.RAW_RESPONSE)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(headers.getString(AppConstants.RAW_RESPONSE));
            return jSONObject2.has("result") ? jSONObject2 : jSONObject;
        } catch (JSONException e10) {
            HVLogUtils.e(this.TAG, "getJSONForRetry(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(this.TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return jSONObject;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return jSONObject;
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void handleNetworkFailureCancellation() {
        HVLogUtils.d(this.TAG, "handleNetworkFailureCancellation() called in Presenter");
        onFailureResponse(getError(12, this.mView.getStringForID(R.string.network_error)), null);
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public boolean isFaceDetectedOnce() {
        HVLogUtils.d(this.TAG, "isFaceDetectedOnce() called");
        return this.isFaceDetectedAtleastOnce;
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public boolean isFacePresent() {
        HVLogUtils.d(this.TAG, "isFacePresent() called");
        return getFaceConfig().isShouldCheckActiveLiveness() ? this.hvActiveLiveness.isFaceDetected() : this.faceDetectionState == FaceConstants.FaceDetectionState.FACE_DETECTED || !SDKInternalConfig.getInstance().isFaceDetectionOn();
    }

    public void onFailureResponse(final HVError hVError, final LivenessResponse livenessResponse) {
        HVLogUtils.d(this.TAG, "onFailureResponse() called with: error = [" + hVError + "], response = [" + livenessResponse + "]");
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logLivenessAPIFailed(hVError, livenessResponse, getFaceConfig());
        }
        this.mView.showLoader(true, BuildConfig.FLAVOR, null, HVLottieHelper.State.TRANSITION, new HVLottieHelper.Listener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.y
            @Override // co.hyperverge.hypersnapsdk.helpers.HVLottieHelper.Listener
            public final void onEnd() {
                TexturePresenter.this.lambda$onFailureResponse$9(livenessResponse, hVError);
            }
        });
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void operationCancelled() {
        HVLogUtils.d(this.TAG, "operationCancelled() called");
        this.mView.stopCamera();
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieScreenClosedByUser(getFaceConfig());
        }
        HVError error = getError(3, this.mView.getStringForID(R.string.operation_cancelled));
        if (this.mView.shouldShowConsentOnBackPress() || getFaceConfig().isShouldShowInstructionPage()) {
            lambda$checkCameraAndHandleCompletion$12(error, null);
        } else {
            lambda$onFailureResponse$8(null, error);
        }
    }

    public void processServerResponse(LivenessResponse livenessResponse, String str) {
        HVLogUtils.d(this.TAG, "processServerResponse() called with: livenessResponse = [" + livenessResponse + "], filePath = [" + str + "]");
        try {
            checkForRetryLogic(livenessResponse, str);
        } catch (Exception e10) {
            HVLogUtils.e(this.TAG, "processServerResponse() with: livenessResponse = [" + livenessResponse + "], filePath = [" + str + "]: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(this.TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void resetCounters() {
        HVLogUtils.d(this.TAG, "resetCounters() called");
        if (this.hvActiveLiveness != null) {
            this.mView.resetUI();
            this.hvActiveLiveness.resetCounters();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void resetTimer() {
        HVLogUtils.d(this.TAG, "resetTimer() called");
        HVActiveLiveness hVActiveLiveness = this.hvActiveLiveness;
        if (hVActiveLiveness != null) {
            hVActiveLiveness.resetTimer();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void resume() {
        HVLogUtils.d(this.TAG, "resume() called");
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseLocation()) {
            getLocation();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void retryLivenessCall() {
        HVLogUtils.d(this.TAG, "retryLivenessCall() called in Presenter");
        if (this.lastFilePath == null || this.lastCroppedFacePath == null || this.lastFaceCoords == null) {
            HVLogUtils.e(this.TAG, "Cannot retry liveness call, parameters are null.");
            handleNetworkFailureCancellation();
        } else {
            this.mView.showLoader(true, BuildConfig.FLAVOR, HVLottieHelper.FACE_PROCESSING, HVLottieHelper.State.START, null);
            makeLivenessCall(this.lastFilePath, this.lastCroppedFacePath, this.lastFaceCoords, this.lastVideoUri, this.lastFrameZipUri);
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void savePicture(byte[] bArr, byte[] bArr2, Bitmap bitmap, Integer num, final String str, final String str2, String str3, String str4, HVFrameRecorderData hVFrameRecorderData) {
        String transactionID;
        HVLogUtils.d(this.TAG, "savePicture() called with: data = [" + bArr + "], previewFrameData = [" + bArr2 + "], previewFrameBitmap = [" + bitmap + "], rotationDegrees = [" + num + "], filePath = [" + str + "], sourceFileName = [" + str2 + "], videoUri = [" + str3 + "], frameZipUri = [" + str4 + "], cameraXRecorderData = [" + hVFrameRecorderData + "]");
        this.isSaving = true;
        final ExifHelper exifHelper = new ExifHelper();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        exifHelper.readExif(bArr, sb2.toString(), this.mLocation);
        this.videoUri = str3;
        this.frameZipUri = str4;
        this.hvFrameRecorderData = hVFrameRecorderData;
        try {
            this.completeVideoDuration = Long.valueOf(Utils.getVideoDuration(str3, this.mView.injectContext(), this.metaDataRetriever));
            if (!SDKInternalConfig.getInstance().getRemoteConfig().getVideoRecordingV2Config().isEnable()) {
                File file = new File(str3);
                String nameWithoutExtension = FileHelper.getNameWithoutExtension(file);
                File file2 = new File(file.getParent(), nameWithoutExtension + "_final.mp4");
                Utils.trimVideo(str3, Uri.parse(file2.toString()).toString(), (long) (getFaceConfig().getNumberOfFrames() / getFaceConfig().getFps()));
                if (file.delete()) {
                    file2.renameTo(new File(file.getParent(), nameWithoutExtension + ".mp4"));
                }
            }
        } catch (Exception e10) {
            HVLogUtils.e(this.TAG, "savePicture(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(this.TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        if (getFaceConfig().getHeaders() == null || !getFaceConfig().getHeaders().has("transactionId")) {
            transactionID = SPHelper.getTransactionID();
        } else {
            try {
                transactionID = getFaceConfig().getHeaders().getString("transactionId");
            } catch (JSONException e11) {
                Log.e(this.TAG, Utils.getErrorMessage(e11));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
                }
                transactionID = BuildConfig.FLAVOR;
            }
        }
        final String str5 = transactionID;
        SaveBitmapAsync saveBitmapAsync = new SaveBitmapAsync(bArr, bArr2, bitmap, num, str, str2, getFaceConfig(), str5, new SaveBitmapAsync.SaveCallBack() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TexturePresenter.1
            @Override // co.hyperverge.hypersnapsdk.helpers.SaveBitmapAsync.SaveCallBack
            public void onImageSaved(final String str6, final List<Integer> list, boolean z10) {
                HVLogUtils.d(TexturePresenter.this.TAG, "onImageSaved() called with: croppedFilePath = [" + str6 + "], faceCoords = [" + list + "], isFaceDetectorExcluded = [" + z10 + "]");
                TexturePresenter.this.imageCaptureTimestamp = Long.valueOf(System.currentTimeMillis());
                TexturePresenter.this.mView.onPictureSaved(str6);
                TexturePresenter texturePresenter = TexturePresenter.this;
                texturePresenter.imageUri = str6;
                texturePresenter.fullImageUri = str + "/" + str2;
                if (z10) {
                    TexturePresenter texturePresenter2 = TexturePresenter.this;
                    texturePresenter2.imageUri = texturePresenter2.fullImageUri;
                }
                TexturePresenter texturePresenter3 = TexturePresenter.this;
                if (texturePresenter3.imageUri != null || (!texturePresenter3.getFaceConfig().isShouldCheckActiveLiveness() && !TexturePresenter.this.getFaceConfig().shouldCheckForFaceTilt())) {
                    TexturePresenter.this.checkForWaterMark();
                    if (SDKInternalConfig.getInstance().getRemoteConfig().isUseIpToGeo()) {
                        new IPToGeoServiceImpl().performIp2GeoAddress(new IPToGeoService.IPToGeoCallback() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TexturePresenter.1.1
                            @Override // co.hyperverge.hypersnapsdk.service.iptogeo.IPToGeoService.IPToGeoCallback
                            public void onError() {
                                HVLogUtils.d(TexturePresenter.this.TAG, "IPToGeoCallback.onError() called");
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                TexturePresenter.this.moveOnFromFaceCapture(str, str2, str6, list, null, exifHelper, str5);
                            }

                            @Override // co.hyperverge.hypersnapsdk.service.iptogeo.IPToGeoService.IPToGeoCallback
                            public void onSuccess(IPAddress iPAddress) {
                                HVLogUtils.d(TexturePresenter.this.TAG, "IPToGeoCallback.onSuccess() called with: ipAddress = [" + iPAddress + "]");
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                TexturePresenter.this.moveOnFromFaceCapture(str, str2, str6, list, iPAddress, exifHelper, str5);
                            }
                        });
                        return;
                    } else {
                        TexturePresenter.this.moveOnFromFaceCapture(str, str2, str6, list, null, exifHelper, str5);
                        return;
                    }
                }
                TexturePresenter texturePresenter4 = TexturePresenter.this;
                texturePresenter4.isSaving = false;
                texturePresenter4.mView.resumeCamera();
                if (TexturePresenter.this.getFaceConfig().shouldCheckForFaceTilt()) {
                    TexturePresenter texturePresenter5 = TexturePresenter.this;
                    texturePresenter5.onFailureResponse(texturePresenter5.getError(24, "Tilted face captured. Hold phone straight and face straight to the camera"), null);
                    return;
                }
                TexturePresenter texturePresenter6 = TexturePresenter.this;
                HVActiveLiveness hVActiveLiveness = texturePresenter6.hvActiveLiveness;
                if (hVActiveLiveness != null) {
                    texturePresenter6.faceDetectionState = hVActiveLiveness.isFaceDetected() ? FaceConstants.FaceDetectionState.FACE_DETECTED : FaceConstants.FaceDetectionState.FACE_NOT_DETECTED;
                }
            }
        });
        if (getFaceConfig().isShouldRecordVideo() && SDKInternalConfig.getInstance().getRemoteConfig().isRetakeOnStaticVideo()) {
            checkForStaticVideo(saveBitmapAsync);
        } else {
            this.mExecutor.execute(saveBitmapAsync);
        }
    }

    public void sendCheckSessionResponse(HVResponse hVResponse, HVError hVError) {
        HVLogUtils.d(this.TAG, "sendCheckSessionResponse() called with: hvResponse = [" + hVResponse + "], error = [" + hVError + "]");
        try {
            try {
                this.mView.stopCamera();
            } catch (Exception e10) {
                Log.e(this.TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
            if (this.hasFaceDetectorTimedOut && getFaceConfig().isFaceDetectionDisabled()) {
                SDKInternalConfig.getInstance().setFaceDetectionOn(true);
            }
            lambda$checkCameraAndHandleCompletion$12(hVError, hVResponse);
        } catch (Exception e11) {
            Log.e(this.TAG, Utils.getErrorMessage(e11));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            }
        }
    }

    /* renamed from: sendResponse, reason: merged with bridge method [inline-methods] */
    public void lambda$onFailureResponse$8(LivenessResponse livenessResponse, HVError hVError) {
        HVLogUtils.d(this.TAG, "sendResponse() called with: livenessResponse = [" + livenessResponse + "], error = [" + hVError + "]");
        try {
            try {
                this.mView.stopCamera();
            } catch (Exception e10) {
                Log.e(this.TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
            HVResponse hVResponse = (HVResponse) createHVResponse(livenessResponse, false);
            hVResponse.setRetakeAttemptResponses(this.retakeResponses);
            if (!HyperSnapSDK.getFaceCaptureMetaData().isFaceDetected()) {
                HyperSnapSDK.getFaceCaptureMetaData().setFaceDetected(this.isFaceDetectedAtleastOnce);
            }
            if (this.hasFaceDetectorTimedOut && getFaceConfig().isFaceDetectionDisabled()) {
                SDKInternalConfig.getInstance().setFaceDetectionOn(true);
            }
            lambda$checkCameraAndHandleCompletion$12(hVError, hVResponse);
        } catch (Exception e11) {
            Log.e(this.TAG, Utils.getErrorMessage(e11));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            }
        }
    }

    public void setClientId(String str) {
        HVLogUtils.d(this.TAG, "setClientId() called with: clientId = [" + str + "]");
        this.clientId = str;
    }

    public void setFaceConfig(HVFaceConfig hVFaceConfig) {
        this.faceConfig = hVFaceConfig;
    }

    @Override // co.hyperverge.hypersnapsdk.helpers.face.FaceDetectionListener
    public void setFaceDetectionState(FaceConstants.FaceDetectionState faceDetectionState) {
        if (!this.isFirstFaceDetectionStateSet) {
            this.isFirstFaceDetectionStateSet = true;
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieFirstFrameProcessed(faceDetectionState.name());
            }
        }
        if (this.faceDetectionState == faceDetectionState || !SDKInternalConfig.getInstance().isFaceDetectionOn() || this.faceDetectionState == FaceConstants.FaceDetectionState.SAVE_UPLOAD) {
            return;
        }
        HVLogUtils.d(this.TAG, "setFaceDetectionState() called with: faceDetectionState = [" + faceDetectionState + "]");
        this.faceDetectionState = faceDetectionState;
        FaceConstants.FaceDetectionState faceDetectionState2 = FaceConstants.FaceDetectionState.FACE_DETECTED;
        if (faceDetectionState != faceDetectionState2) {
            this.mView.setFaceDetectionState(faceDetectionState);
            return;
        }
        boolean z10 = this.isFaceDetectedAtleastOnce;
        this.isFaceDetectedAtleastOnce = true;
        if (!z10 && SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieFirstMeaningfulFaceDetected();
        }
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseLocation() && this.mLocation == null) {
            this.mView.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_NOT_DETECTED);
        } else if (this.mView.isPhoneHeldStraight()) {
            this.mView.setFaceDetectionState(faceDetectionState2);
        } else {
            this.mView.setFaceDetectionState(FaceConstants.FaceDetectionState.PHONE_NOT_STRAIGHT);
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void setFaceDetectionStateFromView(final FaceConstants.FaceDetectionState faceDetectionState) {
        this.faceDetectionState = faceDetectionState;
        this.uiThread.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.u
            @Override // java.lang.Runnable
            public final void run() {
                TexturePresenter.this.lambda$setFaceDetectionStateFromView$11(faceDetectionState);
            }
        });
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void setFaceDetectorTimedOut() {
        HVLogUtils.d(this.TAG, "setFaceDetectorTimedOut() called");
        this.faceDetectionState = FaceConstants.FaceDetectionState.FACE_DETECTED;
        this.hasFaceDetectorTimedOut = true;
    }

    public void setMode(HVFaceConfig.LivenessMode livenessMode) {
        HVLogUtils.d(this.TAG, "setMode() called with: mode = [" + livenessMode + "]");
        if (livenessMode != null) {
            this.mode = livenessMode;
        }
    }

    public void setUiReady(boolean z10) {
        this.uiReady = z10;
    }

    public void setView(TextureContract.View view) {
        HVLogUtils.d(this.TAG, "setView() called with: view = [" + view + "]");
        this.mView = view;
        MLKitFaceHelper.get().setConfig(getFaceConfig(), view.getViewListener(), this);
        NPDFaceHelper.get().setConfig(getFaceConfig(), view.getViewListener(), this);
        if (getFaceConfig().isShouldCheckActiveLiveness()) {
            try {
                HVActiveLiveness hVActiveLiveness = HVActiveLiveness.get();
                this.hvActiveLiveness = hVActiveLiveness;
                hVActiveLiveness.setConfig(this.mView, getFaceConfig());
            } catch (Exception e10) {
                HVLogUtils.e(this.TAG, "setView() with: view = [" + view + "]: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(this.TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void showDialog(final boolean z10, final String str) {
        if (this.mView.isFragmentAdded()) {
            HVLogUtils.d(this.TAG, "showDialog() called with: shouldShow = [" + z10 + "], progressLoaderText = [" + str + "]");
            this.uiThread.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.x
                @Override // java.lang.Runnable
                public final void run() {
                    TexturePresenter.this.lambda$showDialog$10(z10, str);
                }
            });
        }
    }

    @Override // co.hyperverge.hypersnapsdk.utils.BasePresenter
    public void start() {
        HVLogUtils.d(this.TAG, "start() called");
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseLocation()) {
            getLocation();
        }
        if (SDKInternalConfig.getInstance().isFaceDetectionOn()) {
            return;
        }
        this.faceDetectionState = FaceConstants.FaceDetectionState.FACE_DETECTED;
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void submitFrameForProcessing(CameraProperties cameraProperties) {
        Bitmap selfieImageBitmap;
        if (InternalToolUtils.isTestMode(this.mView.injectContext()) && (selfieImageBitmap = InternalToolUtils.getSelfieImageBitmap()) != null) {
            if (MLKitFaceHelper.get().processImage(selfieImageBitmap) != null) {
                setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_DETECTED);
                return;
            } else {
                setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_NOT_DETECTED);
                return;
            }
        }
        boolean z10 = true;
        if (SDKInternalConfig.getInstance().isFaceDetectionOn()) {
            if (!this.isFirstFrameSentForProcessing) {
                this.isFirstFrameSentForProcessing = true;
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieFirstFrameSentForProcessing();
                }
            }
            if (cameraProperties.getImageProxy() != null) {
                MLKitFaceHelper.get().processFrame(cameraProperties);
            } else {
                int i10 = AnonymousClass4.$SwitchMap$co$hyperverge$hypersnapsdk$helpers$SDKInternalConfig$FaceDetectionProcessor[this.faceDetectionProcessor.ordinal()];
                if (i10 == 1) {
                    NPDFaceHelper.get().processFrame(cameraProperties);
                } else if (i10 == 2) {
                    MLKitFaceHelper.get().processFrame(cameraProperties);
                }
            }
        }
        if (!SDKInternalConfig.getInstance().isShouldDoImageInjectionChecks()) {
            if (cameraProperties.getImageProxy() != null) {
                cameraProperties.getImageProxy().close();
                return;
            }
            return;
        }
        try {
            long rgbDataLength = cameraProperties.getRgbDataLength();
            byte[] rgbData = cameraProperties.getRgbData();
            if (cameraProperties.getImageProxy() != null) {
                rgbData = bitmapToRgbByteArray(cameraProperties.getImageProxy().r1());
                rgbDataLength = rgbData.length;
                cameraProperties.getImageProxy().close();
                z10 = false;
            }
            submitPreviewData(rgbData, rgbDataLength, cameraProperties.width, cameraProperties.height, z10);
        } catch (OutOfMemoryError e10) {
            HVLogUtils.e(this.TAG, e10.getMessage(), e10);
        }
    }

    public void submitPreviewData(final byte[] bArr, final long j10, final int i10, final int i11, final boolean z10) {
        this.mExecutor.execute(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.G
            @Override // java.lang.Runnable
            public final void run() {
                TexturePresenter.this.lambda$submitPreviewData$18(bArr, j10, i10, i11, z10);
            }
        });
    }

    public void uploadImage(final String str, final String str2, final List<Integer> list, final String str3) {
        HVLogUtils.d(this.TAG, "uploadImage() called with: filePath = [" + str + "], croppedFacePath = [" + str2 + "], faceCoords = [" + list + "], videoUri = [" + str3 + "]");
        this.mView.showLoader(true, BuildConfig.FLAVOR, HVLottieHelper.FACE_PROCESSING, HVLottieHelper.State.START, null);
        if (StringUtils.isEmptyOrNull(SPHelper.getTransactionID(this.mView.injectContext().getApplicationContext()))) {
            HVLogUtils.d(this.TAG, "uploadImage: SPHelper.getTransactionID() returned: " + SPHelper.getTransactionID());
        } else {
            FaceRetryHelper.get().setRetryLivenessParamsAndHeaders(getFaceConfig());
        }
        if (SDKInternalConfig.getInstance().getRemoteConfig().getVideoRecordingV2Config().isEnable()) {
            addFrameRecordingDataToLivenessParams(str3);
        } else {
            addVideoRecordingDataToLivenessParams(str3);
        }
        if (this.mLocation != null && getFaceConfig().getLivenessParams() != null) {
            try {
                JSONObject livenessParams = getFaceConfig().getLivenessParams();
                livenessParams.put(AppConstants.LATITUDE, String.valueOf(this.mLocation.getLatitude()));
                livenessParams.put(AppConstants.LONGITUDE, String.valueOf(this.mLocation.getLongitude()));
                getFaceConfig().setLivenessAPIParameters(livenessParams);
            } catch (JSONException e10) {
                HVLogUtils.e(this.TAG, "uploadImage: location data could not be added to livenessParams: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
        try {
            if (getFaceConfig().getHeaders() != null) {
                JSONObject headers = getFaceConfig().getHeaders();
                headers.put(AppConstants.SDK_MODE, InternalToolUtils.getSdkMode(this.mView.injectContext()));
                getFaceConfig().setLivenessAPIHeaders(headers);
            }
        } catch (JSONException e11) {
            HVLogUtils.e(this.TAG, "uploadImage(): exception = [" + Utils.getErrorMessage(e11) + "]", e11);
            Log.e(this.TAG, Utils.getErrorMessage(e11));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            }
        }
        this.mView.setShouldAllowActivityClose(false);
        if (this.mView.injectContext() == null || !SDKInternalConfig.getInstance().isShouldDoImageInjectionChecks()) {
            checkCPRSession(str, str2, list, str3);
        } else {
            addAdditionalMetadata(new HVGenericCallback() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.w
                @Override // co.hyperverge.hypersnapsdk.helpers.HVGenericCallback
                public final void accept(Object obj) {
                    TexturePresenter.this.lambda$uploadImage$4(str, str2, list, str3, (HashMap) obj);
                }
            });
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.Presenter
    public void waitForUI(boolean z10) {
        this.hvActiveLiveness.waitForUI(z10);
    }
}
