package co.hyperverge.hypersnapsdk.liveness.ui.texturetracker;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.ComponentCallbacksC1573o;
import co.hyperverge.encoder.HyperVideoColorFormatListener;
import co.hyperverge.encoder.HyperVideoListener;
import co.hyperverge.encoder.HyperVideoLowStorageExceptionListener;
import co.hyperverge.encoder.HyperVideoRecorder;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.activities.HVFaceActivity;
import co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManager;
import co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.CameraProperties;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperCameraManagerConfig;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperCameraPosition;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperCameraSelector;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperDefaultZoomConfig;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperPreviewConfig;
import co.hyperverge.hypersnapsdk.helpers.CustomTextStringConst;
import co.hyperverge.hypersnapsdk.helpers.HVCameraHelper;
import co.hyperverge.hypersnapsdk.helpers.HVLottieHelper;
import co.hyperverge.hypersnapsdk.helpers.ImageComparisonHelper;
import co.hyperverge.hypersnapsdk.helpers.LanguageHelper;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.SPHelper;
import co.hyperverge.hypersnapsdk.helpers.TimingUtils;
import co.hyperverge.hypersnapsdk.helpers.face.FaceConstants;
import co.hyperverge.hypersnapsdk.helpers.face.FaceViewListener;
import co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract;
import co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment;
import co.hyperverge.hypersnapsdk.model.HVJSONObject;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HVFrameRecorderData;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.objects.HVVideoRecordingData;
import co.hyperverge.hypersnapsdk.providers.CallbackProvider;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorderConfig;
import co.hyperverge.hypersnapsdk.service.sensorbiometrics.PhoneTiltDetectorService;
import co.hyperverge.hypersnapsdk.service.sensorbiometrics.PhoneTiltListener;
import co.hyperverge.hypersnapsdk.service.sensorbiometrics.SensorData;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil;
import co.hyperverge.hypersnapsdk.utils.InternalToolUtils;
import co.hyperverge.hypersnapsdk.utils.TextConfigUtils;
import co.hyperverge.hypersnapsdk.utils.UIUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import co.hyperverge.hypersnapsdk.utils.threading.MainUIThread;
import co.hyperverge.hypersnapsdk.views.CircularProgressBar;
import co.hyperverge.hypersnapsdk.views.CrossHairView;
import co.hyperverge.hypersnapsdk.views.FaceBoxView;
import co.hyperverge.hypersnapsdk.views.TextureBlackOverlay;
import co.hyperverge.hypersnapsdk.views.TextureCamera;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.imageview.ShapeableImageView;
import g9.C3201a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import wc.InterfaceC5068n;

/* loaded from: classes.dex */
public class TextureFragment extends ComponentCallbacksC1573o implements TextureContract.View, FaceViewListener {
    private static final String TAG = "TextureFragment";
    private TextView alertTextView;
    private CountDownTimer autoCaptureTimer;
    private TextureBlackOverlay blackOverlay;
    private int camViewHeight;
    private int camViewWidth;
    ImageView cameraIcon;
    private androidx.appcompat.app.c captureAlertDialog;
    private CountDownTimer captureTimer;
    private String colorFormat;
    HVFaceConfig config;
    CrossHairView crossHairView;
    HVJSONObject customStrings;
    Handler delayhandler;
    ProgressDialog dialog;
    FaceBoxView faceBoxView;
    private CountDownTimer faceDetectorTimer;
    private ConstraintLayout faceLoaderLayout;
    ImageView flip;
    private String framesUri;
    private CountDownTimer gesturePoseTimer;
    private HVFrameRecorder hvFrameRecorder;
    private HVFrameRecorderData hvFrameRecorderData;
    private HVError hvImageCaptureError;
    private HVError hvVideoRecordError;
    private HyperCameraManager hyperCameraManager;
    private HyperVideoRecorder hyperVideoRecorder;
    private boolean isPhoneHeldStraight;
    ImageView ivBack;
    ImageView ivClose;
    private float lastTouchX;
    private float lastTouchY;
    private LottieAnimationView lav;
    TextureContract.Presenter mPresenter;
    ShapeableImageView overlayImageView;
    FrameLayout parentContainer;
    private PhoneTiltDetectorService phoneTiltDetectorService;
    TextureCamera previewContainer;
    private byte[] previousFrame;
    private Bitmap previousFrameBitmap;
    int previousValue;
    CircularProgressBar progressBar;
    private TextView progressDialogTextView;
    private View progressDialogView;
    private ImageView progressSpinnerImageView;
    ProgressDialog rotateDialog;
    private Integer rotationDegrees;
    TextView statusString;
    private long timeTakenToVideoRecord;
    TextView tvTitle;
    private String videoUri;
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final TimingUtils imageCaptureTimingUtils = new TimingUtils();
    private final TimingUtils captureClickTimingUtils = new TimingUtils();

    /* renamed from: n, reason: collision with root package name */
    private final int f19746n = 50;

    /* renamed from: m, reason: collision with root package name */
    private final int f19745m = 50;
    private final String MOVE_CLOSER_TAG = "moveCloser";
    private final String FACE_CAPTURE_MULTIPLE_FACES_TAG = CustomTextStringConst.FaceCaptureTextConfigs.FACE_MULTIPLE_FACES;
    private final String FACE_CAPTURE_ACTIVITY_TAG = "faceCaptureActivity";
    private final String FACE_CAPTURE_FACE_FOUND_TAG = CustomTextStringConst.FaceCaptureTextConfigs.FACE_FOUND;
    private final String FACE_CAPTURE_FACE_NOT_FOUND_TAG = CustomTextStringConst.FaceCaptureTextConfigs.FACE_NOT_FOUND;
    private final String FACE_CAPTURE_MOVE_AWAY_TAG = CustomTextStringConst.FaceCaptureTextConfigs.FACE_MOVE_AWAY;
    private final String FACE_CAPTURE_LOOK_STRAIGHT_TAG = CustomTextStringConst.FaceCaptureTextConfigs.FACE_LOOK_STRAIGHT;
    private final String FACE_CAPTURE_AUTO_CAPTURE_WAIT = CustomTextStringConst.FaceCaptureTextConfigs.FACE_CAPTURE_AUTO_CAPTURE_WAIT;
    private final String FACE_CAPTURE_AUTO_CAPTURE_ACTION = CustomTextStringConst.FaceCaptureTextConfigs.FACE_CAPTURE_AUTO_CAPTURE_ACTION;
    private final String FACE_CAPTURE_PHONE_STRAIGHT_TAG = "faceCapturePhoneStraightTag";
    private final String FACE_CAPTURE_STAY_STILL_TAG = "faceCaptureStayStill";
    private final String FACE_CAPTURE_FACE_NOT_PRESENT_IN_CAPTURED_IMAGE = CustomTextStringConst.FaceCaptureTextConfigs.FACE_CAPTURE_FACE_NOT_PRESENT_IN_CAPTURED_IMAGE;
    private final String FACE_CAPTURE_STATIC_VIDEO_DETECTED = "faceCaptureStaticVideoDetected";
    boolean safeToTakePicture = true;
    private boolean isTakePictureInProgress = false;
    private boolean isPaused = false;
    private final TimingUtils videoRecordTimingUtils = new TimingUtils();
    private boolean isVideoRecordingProcessComplete = false;
    private boolean isVideoRecorded = false;
    private boolean isFrontCam = true;
    private boolean isProgressBarAnimating = false;
    private boolean isCameraOpened = false;
    private boolean isCaptureTimerFinished = false;
    private long timeUntilFinished = 0;
    private boolean isCameraInitialized = false;
    private boolean isCheckingCamera = false;
    View.OnTouchListener touchCameraIconListener = new View.OnTouchListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment.1
        private void popin() {
            ImageView imageView = TextureFragment.this.cameraIcon;
            imageView.clearAnimation();
            imageView.clearAnimation();
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(150L);
            scaleAnimation.setInterpolator(new AccelerateInterpolator());
            scaleAnimation.setFillAfter(true);
            imageView.startAnimation(scaleAnimation);
            TextureFragment.this.cameraIcon.startAnimation(scaleAnimation);
        }

        private void popout() {
            ImageView imageView = TextureFragment.this.cameraIcon;
            imageView.clearAnimation();
            TextureFragment.this.cameraIcon.clearAnimation();
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(150L);
            scaleAnimation.setInterpolator(new AccelerateInterpolator());
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment.1.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    TextureFragment.this.capturePicture();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            TextureFragment.this.cameraIcon.startAnimation(scaleAnimation);
            imageView.startAnimation(scaleAnimation);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!TextureFragment.this.safeToTakePicture) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                popin();
                return false;
            }
            if (action != 1) {
                return false;
            }
            popout();
            return false;
        }
    };
    private final HyperCameraManagerHost hyperCameraManagerHost = new AnonymousClass2();
    Runnable poseRunnable = new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment.11
        @Override // java.lang.Runnable
        public void run() {
            TextureFragment.this.capturePicture();
        }
    };

    /* renamed from: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment$10, reason: invalid class name */
    class AnonymousClass10 extends CountDownTimer {
        AnonymousClass10(long j10, long j11) {
            super(j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFinish$0() {
            TextureFragment.this.mPresenter.resetTimer();
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            TextureFragment.this.delayhandler.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.o
                @Override // java.lang.Runnable
                public final void run() {
                    TextureFragment.AnonymousClass10.this.lambda$onFinish$0();
                }
            });
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    /* renamed from: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment$12, reason: invalid class name */
    static /* synthetic */ class AnonymousClass12 {
        static final /* synthetic */ int[] $SwitchMap$co$hyperverge$hypersnapsdk$helpers$face$FaceConstants$FaceDetectionState;

        static {
            int[] iArr = new int[FaceConstants.FaceDetectionState.values().length];
            $SwitchMap$co$hyperverge$hypersnapsdk$helpers$face$FaceConstants$FaceDetectionState = iArr;
            try {
                iArr[FaceConstants.FaceDetectionState.FACE_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$helpers$face$FaceConstants$FaceDetectionState[FaceConstants.FaceDetectionState.FACE_NOT_DETECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$helpers$face$FaceConstants$FaceDetectionState[FaceConstants.FaceDetectionState.FACE_TOO_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$helpers$face$FaceConstants$FaceDetectionState[FaceConstants.FaceDetectionState.FACE_TOO_FAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$helpers$face$FaceConstants$FaceDetectionState[FaceConstants.FaceDetectionState.MULTIPLE_FACES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$helpers$face$FaceConstants$FaceDetectionState[FaceConstants.FaceDetectionState.FACE_NOT_STRAIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$helpers$face$FaceConstants$FaceDetectionState[FaceConstants.FaceDetectionState.FACE_STAY_STILL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$helpers$face$FaceConstants$FaceDetectionState[FaceConstants.FaceDetectionState.PHONE_NOT_STRAIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$helpers$face$FaceConstants$FaceDetectionState[FaceConstants.FaceDetectionState.SAVE_UPLOAD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private void addBlackOverlayView() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "addBlackOverlayView() called");
            try {
                this.blackOverlay = new TextureBlackOverlay(requireActivity());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.blackOverlay.getDiameter(), this.blackOverlay.getDiameter());
                layoutParams.gravity = 49;
                this.blackOverlay.setLayoutParams(layoutParams);
                if (getFaceConfig().isShouldUseDefaultZoom()) {
                    this.blackOverlay.setOverlayBackground(getResources().getColor(R.color.black_opaque));
                } else {
                    this.blackOverlay.setOverlayBackground(getResources().getColor(R.color.black_transparent));
                }
                this.parentContainer.removeView(this.blackOverlay);
                this.parentContainer.addView(this.blackOverlay);
                this.blackOverlay.setVisibility(8);
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "addBlackOverlayView(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    private void addChildViews() {
        HVLogUtils.d(TAG, "addChildViews() called");
        try {
            createTextureCamera();
            addProgressbar();
            addBlackOverlayView();
            addProgressDialogView();
            setupOverlayImageView();
            removeProgressView();
            if (!this.isCameraInitialized) {
                shouldShowProgress(true, null);
                this.progressDialogTextView.setVisibility(8);
            }
            this.flip.setVisibility(getFaceConfig().isShouldUseFlip() ? 0 : 4);
            this.customStrings = getFaceConfig().getCustomUIStrings();
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "addChildViews(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    private void addCrossHairView(FrameLayout frameLayout) {
        HVLogUtils.d(TAG, "addCrossHairView() called with: cameraContainer = [" + frameLayout + "]");
        CrossHairView crossHairView = new CrossHairView(getActivity());
        this.crossHairView = crossHairView;
        frameLayout.removeView(crossHairView);
        frameLayout.addView(this.crossHairView);
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$addCrossHairView$9;
                lambda$addCrossHairView$9 = TextureFragment.this.lambda$addCrossHairView$9(view, motionEvent);
                return lambda$addCrossHairView$9;
            }
        });
    }

    private void addProgressDialogView() {
        HVLogUtils.d(TAG, "addProgressDialogView() called");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.previewContainer.getDiameter(), this.previewContainer.getDiameter());
        layoutParams.gravity = 49;
        this.progressDialogView.setLayoutParams(layoutParams);
        this.parentContainer.removeView(this.progressDialogView);
        this.parentContainer.addView(this.progressDialogView);
    }

    private void addProgressbar() {
        HVLogUtils.d(TAG, "addProgressbar() called");
        try {
            CircularProgressBar circularProgressBar = new CircularProgressBar(getActivity());
            this.progressBar = circularProgressBar;
            circularProgressBar.setId(R.id.hv_circular_bar);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.progressBar.getDiameter(), this.progressBar.getDiameter());
            layoutParams.gravity = 49;
            this.progressBar.setLayoutParams(layoutParams);
            this.parentContainer.removeView(this.progressBar);
            this.parentContainer.addView(this.progressBar);
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "addProgressbar(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adjustCrossHairView() {
        HVLogUtils.d(TAG, "adjustCrossHairView() called");
        if (getFaceConfig().getShouldUseBackCamera()) {
            if (this.crossHairView.getParent() != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.crossHairView.getLayoutParams();
                layoutParams.height = this.camViewHeight;
                layoutParams.width = this.camViewWidth;
                HyperCameraManager hyperCameraManager = this.hyperCameraManager;
                View cameraView = hyperCameraManager != null ? hyperCameraManager.getCameraView() : null;
                if (cameraView != null) {
                    this.crossHairView.setX(cameraView.getX());
                    this.crossHairView.setY(cameraView.getY());
                }
                this.crossHairView.requestLayout();
            }
            this.previewContainer.requestLayout();
        }
    }

    private boolean canShowDialog() {
        return isFragmentAdded() && !requireActivity().isFinishing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIfFaceIsDetected() {
        HVLogUtils.d(TAG, "checkIfFaceIsDetected() called" + this.mPresenter.isFaceDetectedOnce());
        if (this.mPresenter.isFaceDetectedOnce()) {
            return;
        }
        this.mPresenter.setFaceDetectorTimedOut();
        getFaceConfig().setDisableFaceDetection(true);
        enableCaptureButton();
        setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_DETECTED);
        this.faceDetectorTimer.cancel();
        if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
            return;
        }
        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logFaceDetectorTimedOut();
    }

    private void configureCloseButton(ImageView imageView) {
        boolean z10 = getFaceConfig() != null && getFaceConfig().shouldShowCloseIcon();
        imageView.setVisibility(z10 ? 0 : 8);
        if (z10) {
            HyperSnapUIConfigUtil.getInstance().customiseCloseButtonIcon(imageView);
        }
    }

    private File createMediaVideoFile() {
        HVLogUtils.d(TAG, "createMediaVideoFile() called");
        File photoDirectory = this.hyperCameraManagerHost.getPhotoDirectory();
        if (photoDirectory == null) {
            return null;
        }
        return new File(photoDirectory.getPath() + File.separator + this.hyperCameraManagerHost.getVideoFilename());
    }

    private void createTextureCamera() {
        HVLogUtils.d(TAG, "createTextureCamera() called");
        try {
            HVCameraHelper.enableCameraParameters(getActivity(), getFaceConfig().getShouldUseBackCamera(), shouldUseCameraX());
            TextureCamera textureCamera = this.previewContainer;
            if (textureCamera != null) {
                this.parentContainer.removeView(textureCamera);
            }
            this.previewContainer = new TextureCamera(requireActivity());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.previewContainer.getDiameter(), this.previewContainer.getDiameter());
            layoutParams.gravity = 49;
            this.previewContainer.setLayoutParams(layoutParams);
            this.parentContainer.addView(this.previewContainer);
            this.faceBoxView = new FaceBoxView(getActivity());
            this.camViewWidth = this.previewContainer.getDiameter();
            this.camViewHeight = this.previewContainer.getDiameter();
            int i10 = 0;
            this.isFrontCam = !getFaceConfig().getShouldUseBackCamera();
            HyperCameraManager hyperCameraManager = new HyperCameraManager(requireContext(), requireActivity(), new HyperCameraManagerConfig(shouldUseCameraX() ? HyperCameraSelector.CAMERAX : HyperCameraSelector.LEGACY, this.isFrontCam ? HyperCameraPosition.FRONT : HyperCameraPosition.BACK, new HyperDefaultZoomConfig(getFaceConfig().isShouldUseDefaultZoom(), this.isFrontCam ? AppConstants.ZOOM_FACTOR_FRONT_CAM : AppConstants.ZOOM_FACTOR_BACK_CAM), new HyperPreviewConfig(SDKInternalConfig.getInstance().isFaceDetectionOn(), false, getFaceConfig().isShouldUseEnhancedCameraFeatures(), SDKInternalConfig.getInstance().shouldRandomizeResolution())), this.hyperCameraManagerHost);
            this.hyperCameraManager = hyperCameraManager;
            View cameraView = hyperCameraManager.getCameraView();
            if (cameraView != null) {
                this.previewContainer.removeView(cameraView);
            }
            View view = this.hyperCameraManager.setupCameraView();
            this.previewContainer.addView(view);
            view.setLayoutParams(new FrameLayout.LayoutParams(this.previewContainer.getDiameter(), this.previewContainer.getDiameter()));
            addCrossHairView(this.previewContainer);
            adjustCrossHairView();
            adjustOverlayImageView();
            adjustBlackOverlayView();
            adjustProgressDialogView();
            if (this.crossHairView != null) {
                if (!getFaceConfig().getShouldUseBackCamera()) {
                    i10 = 8;
                }
                this.crossHairView.setVisibility(i10);
            }
            this.previewContainer.removeView(this.faceBoxView);
            this.previewContainer.addView(this.faceBoxView);
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "createTextureCamera(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    private void displayProgressView(String str) {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "displayProgressView() called with: progressLoaderText = [" + str + "]");
            TextureBlackOverlay textureBlackOverlay = this.blackOverlay;
            if (textureBlackOverlay != null) {
                textureBlackOverlay.setVisibility(0);
            }
            ImageView imageView = this.progressSpinnerImageView;
            if (imageView != null) {
                imageView.startAnimation(UIUtils.getInfiniteRotationAnimation());
            }
            if (str != null) {
                this.progressDialogTextView.setText(str);
            }
            View view = this.progressDialogView;
            if (view != null) {
                view.setVisibility(0);
            }
            ShapeableImageView shapeableImageView = this.overlayImageView;
            if (shapeableImageView != null) {
                shapeableImageView.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String emptyVideoUri() {
        HVLogUtils.d(TAG, "emptyVideoUri() called");
        File file = new File(this.hyperCameraManagerHost.getPhotoDirectory() + File.separator + "hv_dummy_video.mp4");
        try {
            file.createNewFile();
        } catch (IOException e10) {
            HVLogUtils.e(TAG, "emptyVideoUri(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        return file.getAbsolutePath();
    }

    private void enableTimers() {
        HVLogUtils.d(TAG, "enableTimers() called");
        if (getFaceConfig().getFaceDetectorTimeout() > 0) {
            CountDownTimer countDownTimer = new CountDownTimer(getFaceConfig().getFaceDetectorTimeout(), 1000L) { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment.5
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    TextureFragment.this.checkIfFaceIsDetected();
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j10) {
                }
            };
            this.faceDetectorTimer = countDownTimer;
            countDownTimer.start();
        }
        startCaptureTimer(getFaceConfig().getCaptureTimeout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HVFaceConfig getFaceConfig() {
        HVFaceConfig hVFaceConfig = this.config;
        if (hVFaceConfig != null) {
            return hVFaceConfig;
        }
        sendResponse(new HVError(2, "HVFaceConfig should not be null"));
        return new HVFaceConfig();
    }

    public static TextureFragment getInstance() {
        return new TextureFragment();
    }

    private void handlePreCapture() {
        this.isTakePictureInProgress = true;
        if (getFaceConfig().isShouldRecordVideo()) {
            this.videoRecordTimingUtils.init();
            obtainVideo();
        }
        this.mPresenter.showDialog(true, BuildConfig.FLAVOR);
        if (getFaceConfig().isShouldUseDefaultZoom()) {
            HyperCameraManager hyperCameraManager = this.hyperCameraManager;
            if (hyperCameraManager != null) {
                hyperCameraManager.resetZoom();
            } else {
                HVLogUtils.e(TAG, "handlePreCapture: hyperCameraManager is null");
            }
        }
    }

    private void initializeProgressBar() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "initializeProgressBar() called");
            try {
                this.progressBar.setBackgroundColor(getResources().getColor(R.color.progress_grey));
                this.progressBar.setProgressColor(getResources().getColor(R.color.face_capture_circle_failure));
                this.progressBar.setMaxProgress(100);
                this.progressBar.setProgress(100);
                if (SDKInternalConfig.getInstance().isFaceDetectionOn()) {
                    return;
                }
                this.progressBar.setmStrokeWidth(10);
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "initializeProgressBar(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    private void initializeVideoRecorder() {
        HVLogUtils.d(TAG, "initializeVideoRecorder() called");
        if (getFaceConfig().isShouldRecordVideo()) {
            if (SDKInternalConfig.getInstance().getRemoteConfig().getVideoRecordingV2Config().isEnable()) {
                this.hvFrameRecorder = new HVFrameRecorder(new HVFrameRecorderConfig(requireActivity().getFilesDir(), (int) ((getFaceConfig().getNumberOfFrames() / getFaceConfig().getFps()) / 0.125d), SDKInternalConfig.getInstance().getRemoteConfig().getVideoRecordingV2Config().isSendFrames()));
                return;
            }
            File createMediaVideoFile = createMediaVideoFile();
            if (createMediaVideoFile != null) {
                HyperVideoRecorder companion = HyperVideoRecorder.INSTANCE.getInstance();
                this.hyperVideoRecorder = companion;
                companion.start(requireContext(), requireActivity().getWindow(), createMediaVideoFile, SDKInternalConfig.getInstance().isVideoRecordingAutoColorFormatEnabled(), new HyperVideoColorFormatListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.b
                    @Override // co.hyperverge.encoder.HyperVideoColorFormatListener
                    public final void invoke(int i10) {
                        TextureFragment.this.lambda$initializeVideoRecorder$0(i10);
                    }
                }, new HyperVideoLowStorageExceptionListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.c
                    @Override // co.hyperverge.encoder.HyperVideoLowStorageExceptionListener
                    public final void invoke() {
                        TextureFragment.this.lambda$initializeVideoRecorder$1();
                    }
                });
                return;
            }
            HVError hVError = new HVError(2, "Could not create media video file");
            this.hvVideoRecordError = hVError;
            Log.d(TAG, hVError.getErrorMessage());
            long timeDifferenceAndUpdateLong = this.videoRecordTimingUtils.getTimeDifferenceAndUpdateLong();
            if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                return;
            }
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieVideoRecordFailed(this.hvVideoRecordError, timeDifferenceAndUpdateLong);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$addCrossHairView$9(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.lastTouchX = motionEvent.getX();
            this.lastTouchY = motionEvent.getY();
        } else if (actionMasked != 1) {
            Log.d(TAG, "cameraContainer : neither action up nor action down");
        } else if (Math.abs(motionEvent.getX() - this.lastTouchX) < 20.0f && Math.abs(motionEvent.getY() - this.lastTouchY) < 20.0f) {
            this.crossHairView.showCrosshair(motionEvent.getX(), motionEvent.getY(), false);
            HyperCameraManager hyperCameraManager = this.hyperCameraManager;
            if (hyperCameraManager != null) {
                hyperCameraManager.onTouchToFocus(motionEvent, this.camViewWidth, this.camViewHeight);
            } else {
                HVLogUtils.e(TAG, "addCrossHairView: hyperCameraManager is null");
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$4(View view) {
        performCloseAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$5(View view) {
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieCaptureButtonClicked(this.captureClickTimingUtils.getTimeDifferenceLong().longValue());
        }
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics() && SDKInternalConfig.getInstance().getHvSensorBiometrics() != null) {
            SDKInternalConfig.getInstance().getHvSensorBiometrics().updateSensorDataEvents(System.currentTimeMillis(), "selfieCaptureClicked");
        }
        capturePicture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$6(View view) {
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieCaptureFlipCameraButtonClicked();
        }
        swapCamera();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$7(View view) {
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieCloseClicked();
        }
        requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$8(SensorData sensorData) {
        this.isPhoneHeldStraight = sensorData.getPitch() < ((float) getFaceConfig().getPhoneTiltThreshold());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeVideoRecorder$0(int i10) {
        this.colorFormat = i10 == 21 ? AppConstants.VIDEO_RECORDING_SEMI_PLANAR_COLOR_FORMAT : AppConstants.VIDEO_RECORDING_PLANAR_COLOR_FORMAT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeVideoRecorder$1() {
        this.mPresenter.closeOnLowStorage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$obtainVideo$2(File file) {
        this.isVideoRecordingProcessComplete = true;
        if (file != null) {
            this.isVideoRecorded = true;
            this.videoUri = Uri.parse(file.toString()).toString();
            return;
        }
        this.isVideoRecorded = false;
        HVError hVError = new HVError(2, "Video encoding unsuccessful - file is null");
        this.hvVideoRecordError = hVError;
        Log.d(TAG, hVError.getErrorMessage());
        long timeDifferenceAndUpdateLong = this.videoRecordTimingUtils.getTimeDifferenceAndUpdateLong();
        if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
            return;
        }
        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieVideoRecordFailed(this.hvVideoRecordError, timeDifferenceAndUpdateLong);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$obtainVideo$3(File file, File file2, HVFrameRecorderData hVFrameRecorderData) {
        HVLogUtils.d(TAG, "hyperCameraXRecorder finished");
        this.isVideoRecordingProcessComplete = true;
        this.isVideoRecorded = true;
        this.videoUri = Uri.parse(file.toString()).toString();
        if (file2 != null) {
            this.framesUri = Uri.parse(file2.toString()).toString();
        }
        this.hvFrameRecorderData = hVFrameRecorderData;
        return Unit.f36324a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBackPress$11(File file) {
        reinitVideoRecording();
        this.mPresenter.operationCancelled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCaptureTimedOutAlert$10(DialogInterface dialogInterface, int i10) {
        this.mPresenter.faceCaptureTimeout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLoader$12(boolean z10, HVLottieHelper.Listener listener) {
        if (isFragmentAdded()) {
            if (getFaceConfig().getCustomLoaderClass() == null) {
                this.safeToTakePicture = !z10;
                Spanned text = TextConfigUtils.getText(this.customStrings, CustomTextStringConst.FaceCaptureTextConfigs.FACE_LOADER_DESC, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_LOADER_DESC, getStringForID(R.string.hv_face_loader_subtitle));
                showProgressDialog(z10, text != null ? text.toString() : null);
                if (listener != null) {
                    listener.onEnd();
                    return;
                }
                return;
            }
            if (!z10) {
                requireActivity().finishActivity(87);
                return;
            }
            try {
                requireActivity().startActivityForResult(new Intent(requireContext(), Class.forName(getFaceConfig().getCustomLoaderClass())), 87);
            } catch (ClassNotFoundException e10) {
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    private void obtainVideo() {
        HVLogUtils.d(TAG, "obtainVideo() called");
        HyperVideoRecorder hyperVideoRecorder = this.hyperVideoRecorder;
        if (hyperVideoRecorder != null) {
            hyperVideoRecorder.stop(new HyperVideoListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.m
                @Override // co.hyperverge.encoder.HyperVideoListener
                public final void invoke(File file) {
                    TextureFragment.this.lambda$obtainVideo$2(file);
                }
            });
            return;
        }
        HVFrameRecorder hVFrameRecorder = this.hvFrameRecorder;
        if (hVFrameRecorder != null) {
            hVFrameRecorder.createVideo(new InterfaceC5068n() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.n
                @Override // wc.InterfaceC5068n
                public final Object n(Object obj, Object obj2, Object obj3) {
                    Unit lambda$obtainVideo$3;
                    lambda$obtainVideo$3 = TextureFragment.this.lambda$obtainVideo$3((File) obj, (File) obj2, (HVFrameRecorderData) obj3);
                    return lambda$obtainVideo$3;
                }
            });
        }
    }

    private void performCloseAction() {
        HVLogUtils.d(TAG, "performCloseAction() called");
        sendResponse(new HVError(44, getResources().getString(R.string.sdk_close_error)));
    }

    private void progressBarStopAnimation() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "progressBarStopAnimation() called");
            this.isProgressBarAnimating = false;
            CountDownTimer countDownTimer = this.autoCaptureTimer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
    }

    private void removeProgressView() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "removeProgressView() called");
            TextureBlackOverlay textureBlackOverlay = this.blackOverlay;
            if (textureBlackOverlay != null) {
                textureBlackOverlay.setVisibility(8);
            }
            ImageView imageView = this.progressSpinnerImageView;
            if (imageView != null) {
                imageView.clearAnimation();
            }
            View view = this.progressDialogView;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusString(String str, String str2, String str3) {
        Spanned text;
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "setStatusString() called with: tag = [" + str + "], tcKey = [" + str2 + "], defaultValue = [" + str3 + "]");
            if (this.statusString == null || !isAdded() || (text = TextConfigUtils.getText(this.customStrings, str, str2, str3)) == null) {
                return;
            }
            this.statusString.setText(text);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUI, reason: merged with bridge method [inline-methods] */
    public void lambda$updateUI$13(boolean z10, Spanned spanned) {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "setUI() called with: canCaptureSelfie = [" + z10 + "], statusText = [" + ((Object) spanned) + "]");
            if (z10) {
                int i10 = SDKInternalConfig.getInstance().isFaceDetectionOn() ? R.color.face_capture_circle_success : R.color.hv_face_detection_turned_off;
                CircularProgressBar circularProgressBar = this.progressBar;
                if (circularProgressBar != null) {
                    circularProgressBar.setProgressColor(getResources().getColor(i10));
                }
                if (getFaceConfig().isShouldAutoCapture()) {
                    if (!this.isProgressBarAnimating) {
                        this.isProgressBarAnimating = true;
                        this.autoCaptureTimer.start();
                    }
                    if (this.safeToTakePicture && this.isPhoneHeldStraight) {
                        setStatusString(CustomTextStringConst.FaceCaptureTextConfigs.FACE_CAPTURE_AUTO_CAPTURE_WAIT, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_AUTO_CAPTURE_WAIT, LanguageHelper.AUTO_CAPTURE_WAIT);
                    }
                }
                enableCaptureButton();
            } else {
                CircularProgressBar circularProgressBar2 = this.progressBar;
                if (circularProgressBar2 != null) {
                    circularProgressBar2.setProgressColor(getResources().getColor(R.color.face_capture_circle_failure));
                }
                if (getFaceConfig().isShouldAutoCapture()) {
                    progressBarStopAnimation();
                }
                disableCaptureButton();
            }
            TextView textView = this.statusString;
            if (textView == null || spanned == null) {
                return;
            }
            textView.setText(spanned);
        }
    }

    private void setUpTextsForViews() {
        HVLogUtils.d(TAG, "setUpTextsForViews() called");
        HVJSONObject customUIStrings = getFaceConfig().getCustomUIStrings();
        Spanned text = TextConfigUtils.getText(customUIStrings, CustomTextStringConst.FaceCaptureTextConfigs.FACE_CAPTURE_TITLE, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_CAPTURE_TITLE);
        if (text != null) {
            this.tvTitle.setText(text);
        }
        Spanned text2 = TextConfigUtils.getText(customUIStrings, CustomTextStringConst.FaceCaptureTextConfigs.FACE_CAPTURE_ALERT_TEXT, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_ALERT_BOX_TEXT_MESSAGE);
        if (text2 != null) {
            this.alertTextView.setText(text2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupBranding(View view) {
        HVLogUtils.d(TAG, "setupBranding() called with: rootView = [" + view + "]");
        View findViewById = view.findViewById(R.id.includeFaceBranding);
        TextView textView = (TextView) findViewById.findViewById(R.id.tvBranding);
        TextView textView2 = (TextView) findViewById.findViewById(R.id.tvBrandingHyphen);
        TextView textView3 = (TextView) findViewById.findViewById(R.id.sdkVersionNumber);
        textView3.setText("v7.0.1");
        HyperSnapUIConfigUtil.getInstance().customiseBrandingColor(textView);
        boolean z10 = SDKInternalConfig.getInstance() != null && SDKInternalConfig.getInstance().isShouldUseBranding();
        boolean z11 = SDKInternalConfig.getInstance() != null && SDKInternalConfig.getInstance().isShouldShowSDKVersion();
        textView.setVisibility(z10 ? 0 : 8);
        textView2.setVisibility(z11 ? 0 : 8);
        textView3.setVisibility(z11 ? 0 : 8);
    }

    private void setupOverlayImageView() {
        HVLogUtils.d(TAG, "setupOverlayImageView() called");
        if (getFaceConfig().getFaceCaptureOverlay() != null) {
            this.overlayImageView.setImageBitmap(getFaceConfig().getFaceCaptureOverlay());
        }
        this.parentContainer.removeView(this.overlayImageView);
        this.parentContainer.addView(this.overlayImageView);
        showOverlayImageView(this.overlayImageView);
        adjustOverlayImageView();
        if (getFaceConfig().getFaceCaptureOverlayDuration() != Integer.MAX_VALUE) {
            new CountDownTimer(getFaceConfig().getFaceCaptureOverlayDuration(), 1000L) { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment.7
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    TextureFragment.this.overlayImageView.setVisibility(4);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j10) {
                }
            }.start();
        }
    }

    private void setupTextViewTypefaces() {
        HVLogUtils.d(TAG, "setupTextViewTypefaces() called");
        try {
            getFaceConfig().getTitleTypeface();
            if (getFaceConfig().getTitleTypeface() > 0) {
                this.statusString.setTypeface(androidx.core.content.res.f.h(requireActivity().getApplicationContext(), getFaceConfig().getTitleTypeface()));
            }
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "setupTextViewTypefaces(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    private boolean shouldUseCameraX() {
        boolean shouldUseCameraX = SDKInternalConfig.getInstance().shouldUseCameraX();
        return (!shouldUseCameraX || getFaceConfig().shouldUseCameraX() == null) ? shouldUseCameraX : getFaceConfig().shouldUseCameraX().booleanValue();
    }

    private void showCaptureTimedOutAlert() {
        HVLogUtils.d(TAG, "showCaptureTimedOutAlert() called");
        try {
            String captureTimeoutDialogTitle = getFaceConfig().getCaptureTimeoutDialogTitle();
            String captureTimeoutDialogDesc = getFaceConfig().getCaptureTimeoutDialogDesc();
            if (captureTimeoutDialogTitle == null) {
                captureTimeoutDialogTitle = TextConfigUtils.getText(this.customStrings, BuildConfig.FLAVOR, CustomTextStringConst.FaceCaptureTextConfigs.FACE_CAPTURE_TIMEOUT_TITLE, getString(R.string.hv_capture_timeout_title)).toString();
            }
            if (captureTimeoutDialogDesc == null) {
                captureTimeoutDialogDesc = TextConfigUtils.getText(this.customStrings, BuildConfig.FLAVOR, CustomTextStringConst.FaceCaptureTextConfigs.FACE_CAPTURE_TIMEOUT_DESC, getString(R.string.hv_capture_timeout_desc)).toString();
            }
            String obj = TextConfigUtils.getText(this.customStrings, BuildConfig.FLAVOR, CustomTextStringConst.FaceCaptureTextConfigs.FACE_CAPTURE_TIMEOUT_BUTTON, getString(R.string.hv_capture_timeout_positive_action)).toString();
            if (canShowDialog()) {
                this.captureAlertDialog = new c.a(requireActivity()).o(captureTimeoutDialogTitle).h(captureTimeoutDialogDesc).d(false).l(obj, new DialogInterface.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.e
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        TextureFragment.this.lambda$showCaptureTimedOutAlert$10(dialogInterface, i10);
                    }
                }).q();
            }
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "showCaptureTimedOutAlert(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    private void showOverlayImageView(ShapeableImageView shapeableImageView) {
        HVLogUtils.d(TAG, "showOverlayImageView() called with: overlayImageView = [" + shapeableImageView + "]");
        if (this.isPaused || shapeableImageView == null || !getFaceConfig().isOverlayEnabled()) {
            return;
        }
        shapeableImageView.setVisibility(0);
    }

    private void showProgressDialog(boolean z10, String str) {
        HVLogUtils.d(TAG, "showProgressDialog() called with: show = [" + z10 + "], progressLoaderText = [" + str + "]");
        if (this.blackOverlay != null) {
            if (z10) {
                displayProgressView(str);
            } else {
                removeProgressView();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void timeoutForCapture() {
        HVLogUtils.d(TAG, "timeoutForCapture() called");
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logFaceCaptureTimedOut();
        }
        showCaptureTimedOutAlert();
    }

    private void updateUI(final boolean z10, final Spanned spanned) {
        HVLogUtils.d(TAG, "updateUI() called with: canCaptureSelfie = [" + z10 + "], statusText = [" + ((Object) spanned) + "]");
        MainUIThread.getInstance().post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.d
            @Override // java.lang.Runnable
            public final void run() {
                TextureFragment.this.lambda$updateUI$13(z10, spanned);
            }
        });
    }

    public void adjustBlackOverlayView() {
        HVLogUtils.d(TAG, "adjustBlackOverlayView() called");
        TextureBlackOverlay textureBlackOverlay = this.blackOverlay;
        if (textureBlackOverlay != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureBlackOverlay.getLayoutParams();
            if (!this.blackOverlay.isInLayout()) {
                this.blackOverlay.setLayoutParams(layoutParams);
            }
            HyperCameraManager hyperCameraManager = this.hyperCameraManager;
            View cameraView = hyperCameraManager != null ? hyperCameraManager.getCameraView() : null;
            if (cameraView == null || cameraView.isInLayout()) {
                return;
            }
            cameraView.requestLayout();
        }
    }

    public void adjustOverlayImageView() {
        HVLogUtils.d(TAG, "adjustOverlayImageView() called");
        ShapeableImageView shapeableImageView = this.overlayImageView;
        if (shapeableImageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) shapeableImageView.getLayoutParams();
            if (getContext() != null) {
                layoutParams.setMargins(UIUtils.dpToPx(getContext(), 32.0f), UIUtils.dpToPx(getContext(), 32.0f), UIUtils.dpToPx(getContext(), 32.0f), UIUtils.dpToPx(getContext(), 32.0f));
            }
            if (!this.overlayImageView.isInLayout()) {
                this.overlayImageView.setLayoutParams(layoutParams);
            }
            HyperCameraManager hyperCameraManager = this.hyperCameraManager;
            View cameraView = hyperCameraManager != null ? hyperCameraManager.getCameraView() : null;
            if (cameraView == null || cameraView.isInLayout()) {
                return;
            }
            cameraView.requestLayout();
        }
    }

    public void adjustProgressDialogView() {
        HVLogUtils.d(TAG, "adjustProgressDialogView() called");
        View view = this.progressDialogView;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (getContext() != null) {
                layoutParams.setMargins(UIUtils.dpToPx(getContext(), 32.0f), 0, UIUtils.dpToPx(getContext(), 32.0f), 0);
            }
            if (!this.progressDialogView.isInLayout()) {
                this.progressDialogView.setLayoutParams(layoutParams);
            }
            HyperCameraManager hyperCameraManager = this.hyperCameraManager;
            View cameraView = hyperCameraManager != null ? hyperCameraManager.getCameraView() : null;
            if (cameraView == null || cameraView.isInLayout()) {
                return;
            }
            cameraView.requestLayout();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void authenticationDone() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "authenticationDone() called");
            try {
                CountDownTimer countDownTimer = this.gesturePoseTimer;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                    this.gesturePoseTimer = null;
                }
                CountDownTimer countDownTimer2 = this.autoCaptureTimer;
                if (countDownTimer2 != null) {
                    countDownTimer2.cancel();
                }
                this.autoCaptureTimer = new CountDownTimer(2000L, 1000L) { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment.8
                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                        TextureFragment.this.setStatusString(CustomTextStringConst.FaceCaptureTextConfigs.FACE_CAPTURE_AUTO_CAPTURE_ACTION, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_AUTO_CAPTURE_ACTION, LanguageHelper.AUTO_CAPTURE_ACTION);
                        TextureFragment.this.capturePicture();
                    }

                    @Override // android.os.CountDownTimer
                    public void onTick(long j10) {
                    }
                };
                this.progressBar.setProgressColor(getResources().getColor(R.color.face_capture_circle_success));
                this.statusString.setText(TextConfigUtils.getText(this.customStrings, CustomTextStringConst.FaceCaptureTextConfigs.FACE_GESTURE_LOOK_STRAIGHT, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_GESTURE_LOOK_STRAIGHT, "Look Straight"));
                this.autoCaptureTimer.start();
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "authenticationDone(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void callCompletionHandler(HVError hVError, HVResponse hVResponse) {
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieFlowEnded(hVError, hVResponse);
        }
        HVFaceActivity hVFaceActivity = (HVFaceActivity) getActivity();
        if (hVFaceActivity != null) {
            hVFaceActivity.callCompletionHandler(hVError, hVResponse);
        } else {
            HVLogUtils.e(TAG, "callCompletionHandler error, activity is null");
        }
    }

    public void capturePicture() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "capturePicture() called");
            try {
                disableCaptureButton();
                this.flip.setClickable(false);
                TextureContract.Presenter presenter = this.mPresenter;
                if (presenter != null && presenter.isFacePresent() && this.safeToTakePicture) {
                    this.imageCaptureTimingUtils.init();
                    CountDownTimer countDownTimer = this.captureTimer;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                        this.timeUntilFinished = 0L;
                    }
                    this.safeToTakePicture = false;
                    handlePreCapture();
                    HyperCameraManager hyperCameraManager = this.hyperCameraManager;
                    if (hyperCameraManager != null) {
                        hyperCameraManager.takePicture();
                    } else {
                        HVLogUtils.e(TAG, "capturePicture: hyperCameraManager is null");
                    }
                }
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "capturePicture(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TAG, Utils.getErrorMessage(e10));
                this.hvImageCaptureError = new HVError(2, Utils.getErrorMessage(e10));
                long longValue = this.imageCaptureTimingUtils.getTimeDifferenceLong().longValue();
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieCaptureFailed(this.hvImageCaptureError, getFaceConfig(), longValue);
                }
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    public void closeTexture() {
        this.mPresenter.operationCancelled();
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void disableCaptureButton() {
        HVLogUtils.d(TAG, "disableCaptureButton() called");
        this.cameraIcon.setOnTouchListener(null);
        this.cameraIcon.setClickable(false);
        this.cameraIcon.setEnabled(false);
        this.cameraIcon.setImageResource(R.drawable.hv_camera_button_disabled);
        HyperSnapUIConfigUtil.getInstance().customiseCaptureButton(this.cameraIcon);
        androidx.core.widget.g.c(this.cameraIcon, null);
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void enableCaptureButton() {
        HVLogUtils.d(TAG, "enableCaptureButton() called");
        this.cameraIcon.setOnTouchListener(this.touchCameraIconListener);
        this.cameraIcon.setClickable(true);
        this.flip.setClickable(true);
        this.cameraIcon.setEnabled(true);
        this.cameraIcon.setImageResource(R.drawable.ic_camera_button_svg);
        HyperSnapUIConfigUtil.getInstance().customiseCaptureButton(this.cameraIcon);
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void facePresentForActiveLiveness() {
        if (isFragmentAdded()) {
            try {
                HVLogUtils.d(TAG, "facePresentForActiveLiveness() called");
                this.progressBar.setProgressColor(getResources().getColor(R.color.face_capture_circle_success));
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "facePresentForActiveLiveness(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void finishTextureView(int i10) {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "finishTextureView() called with: resultCode = [" + i10 + "]");
            if (getActivity() != null) {
                HyperCameraManager hyperCameraManager = this.hyperCameraManager;
                if (hyperCameraManager != null) {
                    hyperCameraManager.clearHandlers();
                } else {
                    HVLogUtils.e(TAG, "finishTextureView: hyperCameraManager is null");
                }
                getActivity().setResult(i10);
                getActivity().finish();
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public String getRetakeMessageForFaceNotPresentInCapturedImage() {
        HVLogUtils.d(TAG, "getRetakeMessageForFaceNotPresentInCapturedImage() called");
        Spanned text = TextConfigUtils.getText(this.customStrings, CustomTextStringConst.FaceCaptureTextConfigs.FACE_CAPTURE_FACE_NOT_PRESENT_IN_CAPTURED_IMAGE, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_NOT_PRESENT_IN_CAPTURE_IMAGE, LanguageHelper.FACE_NOT_PRESENT_IN_CAPTURED_IMAGE);
        return text != null ? text.toString() : LanguageHelper.FACE_NOT_PRESENT_IN_CAPTURED_IMAGE;
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public String getRetakeMessageForStaticVideo() {
        HVLogUtils.d(TAG, "getRetakeMessageForStaticVideo() called");
        Spanned text = TextConfigUtils.getText(this.customStrings, "faceCaptureStaticVideoDetected", CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_STATIC_VIDEO_DETECTED, LanguageHelper.STATIC_VIDEO_DETECTED);
        return text != null ? text.toString() : LanguageHelper.STATIC_VIDEO_DETECTED;
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public String getStringForID(int i10) {
        if (!isFragmentAdded()) {
            return BuildConfig.FLAVOR;
        }
        HVLogUtils.d(TAG, "getStringForID() called with: resourceID = [" + i10 + "]");
        return getResources().getString(i10);
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public long getVideoRecordedTime() {
        return this.timeTakenToVideoRecord;
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public HVVideoRecordingData getVideoRecordingDataPoints() {
        HVLogUtils.d(TAG, "getVideoRecordingDataPoints() called");
        HVVideoRecordingData hVVideoRecordingData = new HVVideoRecordingData(getFaceConfig().isShouldRecordVideo());
        String str = this.colorFormat;
        if (str == null) {
            str = "NA";
        }
        hVVideoRecordingData.setColorFormat(str);
        HVError hVError = this.hvVideoRecordError;
        if (hVError != null) {
            hVVideoRecordingData.setError(hVError.getErrorMessage());
        }
        HVLogUtils.d(TAG, "getVideoRecordingDataPoints() returning: " + hVVideoRecordingData);
        return hVVideoRecordingData;
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public FaceViewListener getViewListener() {
        return this;
    }

    @Override // co.hyperverge.hypersnapsdk.helpers.face.FaceViewListener
    public int getViewRadius() {
        if (!isFragmentAdded()) {
            return 0;
        }
        HVLogUtils.d(TAG, "getViewRadius() called");
        return this.previewContainer.getDiameter() / 2;
    }

    @Override // co.hyperverge.hypersnapsdk.helpers.face.FaceViewListener
    public float getViewX() {
        TextureCamera textureCamera;
        if (!isFragmentAdded() || (textureCamera = this.previewContainer) == null) {
            return 0.0f;
        }
        textureCamera.getLocationOnScreen(new int[2]);
        return r1[0];
    }

    @Override // co.hyperverge.hypersnapsdk.helpers.face.FaceViewListener
    public float getViewY() {
        TextureCamera textureCamera;
        if (!isFragmentAdded() || (textureCamera = this.previewContainer) == null) {
            return 0.0f;
        }
        textureCamera.getLocationOnScreen(new int[2]);
        return r1[1];
    }

    @Override // co.hyperverge.hypersnapsdk.helpers.face.FaceViewListener
    public float getViewYCenter() {
        if (isFragmentAdded()) {
            return getViewY() + (this.previewContainer.getHeight() / 2);
        }
        return 0.0f;
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void hideFaceBox() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "hideFaceBox() called");
            this.faceBoxView.showHideBox(false);
        }
    }

    public void initView(final View view) {
        HVLogUtils.d(TAG, "initView() called with: root = [" + view + "]");
        this.parentContainer = (FrameLayout) view.findViewById(R.id.parent_container);
        this.statusString = (TextView) view.findViewById(R.id.tvStatus);
        this.overlayImageView = (ShapeableImageView) view.findViewById(R.id.faceOverlayImageView);
        this.cameraIcon = (ImageView) view.findViewById(R.id.camera_icon);
        this.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        ImageView imageView = (ImageView) view.findViewById(R.id.ivFlashFlip);
        this.flip = imageView;
        imageView.setImageResource(R.drawable.ic_flip_camera_24);
        this.ivBack = (ImageView) view.findViewById(R.id.ivBack);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.layoutFaceLoader);
        this.faceLoaderLayout = constraintLayout;
        this.lav = (LottieAnimationView) constraintLayout.findViewById(R.id.lavFaceLoader);
        TextView textView = (TextView) view.findViewById(R.id.hv_face_capture_alert_text_view);
        this.alertTextView = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.progressDialogView = view.findViewById(R.id.faceProgressDialogView);
        this.progressSpinnerImageView = (ImageView) view.findViewById(R.id.hv_loading_icon);
        this.progressDialogTextView = (TextView) view.findViewById(R.id.hv_loading_text);
        HyperSnapUIConfigUtil.getInstance().customiseBackButtonIcon(this.ivBack, true);
        HyperSnapUIConfigUtil.getInstance().customiseClientLogo((ImageView) view.findViewById(R.id.clientLogo), true);
        HyperSnapUIConfigUtil.getInstance().customiseBackgroundImage(view.findViewById(R.id.hvBackgroundContainer));
        ImageView imageView2 = (ImageView) view.findViewById(R.id.ivClose);
        this.ivClose = imageView2;
        if (imageView2 != null) {
            configureCloseButton(imageView2);
            this.ivClose.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TextureFragment.this.lambda$initView$4(view2);
                }
            });
        }
        if (!getFaceConfig().shouldShowModuleBackButton() && !getFaceConfig().isShouldShowInstructionPage()) {
            this.ivBack.setVisibility(4);
        }
        if (injectContext() != null && getFaceConfig().isShowAlertTextBox(injectContext().getResources().getDisplayMetrics())) {
            this.alertTextView.setVisibility(0);
            HyperSnapUIConfigUtil.getInstance().customiseAlertBoxTextView(this.alertTextView);
        }
        setupTextViewTypefaces();
        setUpTextsForViews();
        HyperSnapUIConfigUtil.getInstance().customiseTitleTextView(this.tvTitle, true);
        this.tvTitle.setVisibility(4);
        HyperSnapUIConfigUtil.getInstance().customiseStatusTextView(this.statusString, true);
        setUpTextsForViews();
        if (getFaceConfig().isShouldAutoCapture() || getFaceConfig().isShouldCheckActiveLiveness()) {
            this.cameraIcon.setVisibility(4);
            this.autoCaptureTimer = new CountDownTimer(getFaceConfig().getAutoCaptureDuration(), 1000L) { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment.3
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    TextureFragment.this.setStatusString(CustomTextStringConst.FaceCaptureTextConfigs.FACE_CAPTURE_AUTO_CAPTURE_ACTION, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_AUTO_CAPTURE_ACTION, LanguageHelper.AUTO_CAPTURE_ACTION);
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieCaptureButtonClicked(TextureFragment.this.captureClickTimingUtils.getTimeDifferenceLong().longValue());
                    }
                    if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics() && SDKInternalConfig.getInstance().getHvSensorBiometrics() != null) {
                        SDKInternalConfig.getInstance().getHvSensorBiometrics().updateSensorDataEvents(System.currentTimeMillis(), "selfieCaptureClicked");
                    }
                    TextureFragment.this.capturePicture();
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j10) {
                }
            };
        } else {
            this.cameraIcon.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TextureFragment.this.lambda$initView$5(view2);
                }
            });
        }
        this.flip.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TextureFragment.this.lambda$initView$6(view2);
            }
        });
        this.ivBack.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TextureFragment.this.lambda$initView$7(view2);
            }
        });
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment.4
            @Override // java.lang.Runnable
            public void run() {
                if (SDKInternalConfig.getInstance().isRemoteConfigFetchDone() && Utils.canDismissLoader(TextureFragment.this.getActivity())) {
                    TextureFragment.this.setupBranding(view);
                }
            }
        }, 100L);
        if (getFaceConfig().isShouldAllowPhoneTilt()) {
            this.isPhoneHeldStraight = true;
            return;
        }
        PhoneTiltDetectorService phoneTiltDetectorService = new PhoneTiltDetectorService(injectContext(), new PhoneTiltListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.k
            @Override // co.hyperverge.hypersnapsdk.service.sensorbiometrics.PhoneTiltListener
            public final void onSensorDataChanged(SensorData sensorData) {
                TextureFragment.this.lambda$initView$8(sensorData);
            }
        });
        this.phoneTiltDetectorService = phoneTiltDetectorService;
        phoneTiltDetectorService.registerSensors();
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public Context injectContext() {
        return getActivity();
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public boolean isCameraReleased() {
        HyperCameraManager hyperCameraManager = this.hyperCameraManager;
        if (hyperCameraManager != null) {
            return hyperCameraManager.isCameraReleased();
        }
        HVLogUtils.e(TAG, "isCameraReleased: hyperCameraManager is null, returning true");
        return true;
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public boolean isFragmentAdded() {
        return isAdded() && getActivity() != null;
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public boolean isPhoneHeldStraight() {
        return this.isPhoneHeldStraight;
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void notifyNetworkFailure() {
        HVLogUtils.d(TAG, "notifyNetworkFailure() called in Fragment");
        AbstractActivityC1577t activity = getActivity();
        if (activity instanceof HVFaceActivity) {
            HVLogUtils.d(TAG, "Calling displayNetworkRetryOptions on HVFaceActivity");
            ((HVFaceActivity) activity).displayNetworkRetryOptions();
            return;
        }
        HVLogUtils.e(TAG, "Hosting Activity is not HVFaceActivity. Cannot display retry options.");
        TextureContract.Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.handleNetworkFailureCancellation();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        HVLogUtils.d(TAG, "onActivityCreated() called with: savedInstanceState = [" + bundle + "]");
        try {
            TextureContract.Presenter presenter = this.mPresenter;
            if (presenter != null) {
                presenter.start();
            }
            enableTimers();
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "onActivityCreated() with: savedInstanceState = [" + bundle + "]: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        HVLogUtils.d(TAG, "onActivityResult() called with: requestCode = [" + i10 + "], resultCode = [" + i11 + "], data = [" + intent + "]");
        reinitTimingUtils();
        setupOverlayImageView();
        showProgressDialog(false, null);
        if (getFaceConfig() != null && getFaceConfig().isShouldRecordVideo()) {
            reinitVideoRecording();
        }
        if (i11 == 18) {
            HVError hVError = (HVError) intent.getSerializableExtra("hvError");
            TextureContract.Presenter presenter = this.mPresenter;
            if (presenter != null) {
                presenter.faceCaptureError(hVError);
                return;
            }
            return;
        }
        if (i11 != 20) {
            Log.d(TAG, "onActivityResult : default case has been triggered");
            return;
        }
        TextureContract.Presenter presenter2 = this.mPresenter;
        if (presenter2 != null) {
            presenter2.operationCancelled();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.utils.BaseView
    public void onBackPress() {
        HVLogUtils.d(TAG, "onBackPress() called");
        if (this.mPresenter != null) {
            if (!getFaceConfig().isShouldRecordVideo()) {
                this.mPresenter.operationCancelled();
                return;
            }
            HyperVideoRecorder hyperVideoRecorder = this.hyperVideoRecorder;
            if (hyperVideoRecorder != null) {
                hyperVideoRecorder.stop(new HyperVideoListener() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.l
                    @Override // co.hyperverge.encoder.HyperVideoListener
                    public final void invoke(File file) {
                        TextureFragment.this.lambda$onBackPress$11(file);
                    }
                });
                return;
            }
            HVFrameRecorder hVFrameRecorder = this.hvFrameRecorder;
            if (hVFrameRecorder != null) {
                hVFrameRecorder.close();
                reinitVideoRecording();
                this.mPresenter.operationCancelled();
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        HVLogUtils.d(TAG, "onCreateView() called with: inflater = [" + layoutInflater + "], container = [" + viewGroup + "], savedInstanceState = [" + bundle + "]");
        this.captureClickTimingUtils.init();
        View inflate = layoutInflater.inflate(R.layout.hv_fragment_texture_view, viewGroup, false);
        this.delayhandler = new Handler();
        initView(inflate);
        try {
            if (SDKInternalConfig.getInstance().isFaceDetectionOn()) {
                this.cameraIcon.setImageResource(R.drawable.hv_camera_button_disabled);
            } else {
                this.cameraIcon.setImageResource(R.drawable.ic_camera_button_svg);
            }
            setupBranding(inflate);
            this.safeToTakePicture = true;
            TextureContract.Presenter presenter = this.mPresenter;
            if (presenter != null) {
                presenter.start();
            }
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        return inflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onDestroyView() {
        super.onDestroyView();
        HVLogUtils.d(TAG, "onDestroyView() called");
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void onNewPose(Spanned spanned) {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "onNewPose() called with: facePose = [" + ((Object) spanned) + "]");
            try {
                CountDownTimer countDownTimer = this.gesturePoseTimer;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                    this.gesturePoseTimer = null;
                }
                startTimer();
                this.statusString.setText(spanned);
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "onNewPose() with: facePose = [" + ((Object) spanned) + "]: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onPause() {
        super.onPause();
        HVLogUtils.d(TAG, "onPause() called");
        this.isPaused = true;
        try {
            HyperCameraManager hyperCameraManager = this.hyperCameraManager;
            if (hyperCameraManager != null) {
                hyperCameraManager.onPause();
            } else {
                HVLogUtils.e(TAG, "onPause: hyperCameraManager is null");
            }
            this.safeToTakePicture = false;
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "onPause(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        ProgressDialog progressDialog = this.dialog;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.dialog.cancel();
        }
        androidx.appcompat.app.c cVar = this.captureAlertDialog;
        if (cVar != null && cVar.isShowing()) {
            this.captureAlertDialog.dismiss();
        }
        CountDownTimer countDownTimer = this.captureTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        TextureContract.Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.resetCounters();
        }
        PhoneTiltDetectorService phoneTiltDetectorService = this.phoneTiltDetectorService;
        if (phoneTiltDetectorService != null) {
            phoneTiltDetectorService.pauseSensors();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void onPictureSaved(String str) {
        HVLogUtils.d(TAG, "onPictureSaved() called with: imageFilePath = [" + str + "]");
        if (str != null) {
            this.hyperCameraManagerHost.onPictureSaved(new File(str));
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onResume() {
        super.onResume();
        HVLogUtils.d(TAG, "onResume() called");
        TextureContract.Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.resume();
        }
        this.isPaused = false;
        addChildViews();
        initializeProgressBar();
        UIUtils.setScreenBrightness(getActivity(), 255);
        if (isAdded()) {
            try {
                setFaceDetectionState(this.mPresenter.getFaceDetectionState());
                if (this.captureTimer != null) {
                    long j10 = this.timeUntilFinished;
                    if (j10 > 0) {
                        startCaptureTimer(j10);
                    }
                }
                if (this.mPresenter.canResumeCamera().booleanValue()) {
                    HyperCameraManager hyperCameraManager = this.hyperCameraManager;
                    if (hyperCameraManager != null) {
                        hyperCameraManager.onResume();
                    } else {
                        HVLogUtils.e(TAG, "onResume: hyperCameraManager is null");
                    }
                    this.safeToTakePicture = true;
                }
            } catch (Exception e10) {
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
        PhoneTiltDetectorService phoneTiltDetectorService = this.phoneTiltDetectorService;
        if (phoneTiltDetectorService != null) {
            phoneTiltDetectorService.resumeSensors();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onStart() {
        super.onStart();
        HVLogUtils.d(TAG, "onStart() called");
        initializeVideoRecorder();
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void pauseCamera() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "pauseCamera() called");
            try {
                HyperCameraManager hyperCameraManager = this.hyperCameraManager;
                if (hyperCameraManager != null) {
                    hyperCameraManager.pauseCamera();
                } else {
                    HVLogUtils.e(TAG, "pauseCamera: hyperCameraManager is null");
                }
                if (getFaceConfig().isShouldCheckActiveLiveness()) {
                    resetUI();
                }
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "pauseCamera(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void poseDoesNotMatch(boolean z10) {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "poseDoesNotMatch() called with: shouldStopCapture = [" + z10 + "]");
            try {
                this.progressBar.setProgressColor(getResources().getColor(R.color.progress_red));
                if (z10) {
                    this.delayhandler.removeCallbacks(this.poseRunnable);
                }
                this.delayhandler.postDelayed(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment.9
                    @Override // java.lang.Runnable
                    public void run() {
                        TextureFragment.this.mPresenter.waitForUI(false);
                    }
                }, 50L);
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "poseDoesNotMatch() with: shouldStopCapture = [" + z10 + "]: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void poseMatches(int i10) {
        HVLogUtils.d(TAG, "poseMatches() called with: correctAttempts = [" + i10 + "]");
        try {
            this.delayhandler.removeCallbacks(this.poseRunnable);
            this.delayhandler.post(this.poseRunnable);
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    public void reinitTimingUtils() {
        HVLogUtils.d(TAG, "reinitTimingUtils() called");
        this.captureClickTimingUtils.init();
        this.imageCaptureTimingUtils.init();
    }

    public void reinitVideoRecording() {
        HVLogUtils.d(TAG, "reinitVideoRecording() called");
        this.videoUri = BuildConfig.FLAVOR;
        this.isVideoRecorded = false;
        this.isVideoRecordingProcessComplete = false;
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void resetLoader() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "resetLoader() called");
            this.faceLoaderLayout.setVisibility(8);
            HVLottieHelper.reset(this.lav);
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void resetPoseTimer() {
        HVLogUtils.d(TAG, "resetPoseTimer() called");
        CountDownTimer countDownTimer = this.gesturePoseTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.gesturePoseTimer = null;
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void resetUI() {
        try {
            this.mPresenter.waitForUI(true);
            CountDownTimer countDownTimer = this.gesturePoseTimer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.gesturePoseTimer = null;
            }
            CountDownTimer countDownTimer2 = this.autoCaptureTimer;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
                this.autoCaptureTimer = null;
            }
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "resetUI(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void resumeCamera() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "resumeCamera() called");
            HyperCameraManager hyperCameraManager = this.hyperCameraManager;
            if (hyperCameraManager != null) {
                hyperCameraManager.resumeCamera();
            } else {
                HVLogUtils.e(TAG, "resumeCamera: hyperCameraManager is null");
            }
            this.safeToTakePicture = true;
        }
    }

    public void sendResponse(HVError hVError) {
        HVLogUtils.d(TAG, "sendResponse() called with: error = [" + hVError + "]");
        if (CallbackProvider.get().injectFaceCaptureCallback() != null) {
            if (this.isCheckingCamera) {
                HVLogUtils.d(TAG, "checkCameraAndHandleCompletion: already checking");
                return;
            }
            if (isCameraReleased()) {
                this.isCheckingCamera = true;
                try {
                    try {
                        stopCamera();
                    } catch (Exception e10) {
                        Log.e(TAG, Utils.getErrorMessage(e10));
                        if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                        }
                    }
                    callCompletionHandler(hVError, null);
                    finishTextureView(-1);
                } catch (Exception e11) {
                    Log.e(TAG, Utils.getErrorMessage(e11));
                    if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                        SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
                    }
                }
            }
        }
    }

    public void setConfig(HVFaceConfig hVFaceConfig) {
        this.config = hVFaceConfig;
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void setFaceDetectionState(FaceConstants.FaceDetectionState faceDetectionState) {
        if (isFragmentAdded() && !this.isPaused) {
            HVLogUtils.d(TAG, "setFaceDetectionState() called with: faceDetectionState = [" + faceDetectionState + "]");
            switch (AnonymousClass12.$SwitchMap$co$hyperverge$hypersnapsdk$helpers$face$FaceConstants$FaceDetectionState[faceDetectionState.ordinal()]) {
                case 1:
                    updateUI(true, TextConfigUtils.getText(this.customStrings, CustomTextStringConst.FaceCaptureTextConfigs.FACE_FOUND, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_FOUND, LanguageHelper.CAPTURE_PIC));
                    break;
                case 2:
                    updateUI(false, TextConfigUtils.getText(this.customStrings, CustomTextStringConst.FaceCaptureTextConfigs.FACE_NOT_FOUND, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_NOT_FOUND, LanguageHelper.PLACE_FACE));
                    break;
                case 3:
                    updateUI(false, TextConfigUtils.getText(this.customStrings, CustomTextStringConst.FaceCaptureTextConfigs.FACE_MOVE_AWAY, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_MOVE_AWAY, LanguageHelper.MOVE_AWAY));
                    break;
                case 4:
                    updateUI(false, TextConfigUtils.getText(this.customStrings, CustomTextStringConst.FaceCaptureTextConfigs.FACE_NOT_FOUND, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_NOT_FOUND, LanguageHelper.PLACE_FACE));
                    break;
                case 5:
                    updateUI(false, TextConfigUtils.getText(this.customStrings, CustomTextStringConst.FaceCaptureTextConfigs.FACE_MULTIPLE_FACES, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_MULTIPLE_FACES, LanguageHelper.MULTIPLE_FACES));
                    break;
                case 6:
                    updateUI(false, TextConfigUtils.getText(this.customStrings, CustomTextStringConst.FaceCaptureTextConfigs.FACE_LOOK_STRAIGHT, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_LOOK_STRAIGHT, LanguageHelper.LOOK_STRAIGHT));
                    break;
                case 7:
                    updateUI(false, TextConfigUtils.getText(this.customStrings, "faceCaptureStayStill", CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_STAY_STILL, LanguageHelper.STAY_STILL));
                    break;
                case 8:
                    updateUI(false, TextConfigUtils.getText(this.customStrings, "faceCapturePhoneStraightTag", CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_DEVICE_WRONG_ORIENTATION, LanguageHelper.PHONE_STRAIGHT));
                    break;
                case 9:
                    showLoader(true, BuildConfig.FLAVOR, HVLottieHelper.FACE_PROCESSING, HVLottieHelper.State.START, null);
                    updateUI(false, TextConfigUtils.getText(this.customStrings, CustomTextStringConst.FaceCaptureTextConfigs.FACE_LOADER_TITLE, CustomTextStringConst.FaceCaptureTextConfigs.TEXT_CONFIG_FACE_LOADER_TITLE, getStringForID(R.string.hv_face_loader_title)));
                    break;
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void setShouldAllowActivityClose(boolean z10) {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "setShouldAllowActivityClose() called with: shouldAllowActivityClose = [" + z10 + "]");
            ((HVFaceActivity) requireActivity()).setShouldAllowActivityClose(z10);
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public boolean shouldShowConsentOnBackPress() {
        return requireActivity().getIntent().getBooleanExtra("shouldShowConsentOnBackPress", false);
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void shouldShowProgress(boolean z10, String str) {
        HVLogUtils.d(TAG, "shouldShowProgress() called with: shouldShow = [" + z10 + "], progressLoaderText = [" + str + "]");
        try {
            showProgressDialog(z10, str);
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "shouldShowProgress() with: shouldShow = [" + z10 + "], progressLoaderText = [" + str + "]: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void showFaceBox(List<Integer> list) {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "showFaceBox() called with: rectPoints = [" + list + "]");
            this.faceBoxView.setPoints(list.get(0).intValue(), list.get(1).intValue(), list.get(2).intValue(), list.get(3).intValue());
            this.faceBoxView.showHideBox(true);
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void showLoader(final boolean z10, String str, String str2, HVLottieHelper.State state, final HVLottieHelper.Listener listener) {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "showLoader() called with: show = [" + z10 + "], progressLoaderText = [" + str + "], anim = [" + str2 + "], state = [" + state + "], animListener = [" + listener + "]");
            MainUIThread.getInstance().post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.f
                @Override // java.lang.Runnable
                public final void run() {
                    TextureFragment.this.lambda$showLoader$12(z10, listener);
                }
            });
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void showMessage(String str) {
        if (isFragmentAdded()) {
            try {
                HVLogUtils.d(TAG, "showMessage() called with: message = [" + str + "]");
                this.statusString.setText(str);
            } catch (Exception e10) {
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void stablePose() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "stablePose() called");
            this.progressBar.setProgressColor(getResources().getColor(R.color.progress_green));
        }
    }

    public void startCaptureTimer(long j10) {
        HVLogUtils.d(TAG, "startCaptureTimer() called with: timeRemaining = [" + j10 + "]");
        if (getFaceConfig().getCaptureTimeout() > 0) {
            CountDownTimer countDownTimer = new CountDownTimer(j10, 500L) { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment.6
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    TextureFragment.this.isCaptureTimerFinished = true;
                    TextureFragment.this.disableCaptureButton();
                    TextureFragment.this.pauseCamera();
                    TextureFragment.this.timeoutForCapture();
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j11) {
                    TextureFragment.this.timeUntilFinished = j11;
                }
            };
            this.captureTimer = countDownTimer;
            countDownTimer.start();
        }
    }

    public void startTimer() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "startTimer() called");
            try {
                this.progressBar.setProgressColor(getResources().getColor(R.color.progress_green));
                this.progressBar.setVisibility(0);
                AnonymousClass10 anonymousClass10 = new AnonymousClass10(5000L, 100L);
                this.gesturePoseTimer = anonymousClass10;
                anonymousClass10.start();
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "startTimer(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureContract.View
    public void stopCamera() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "stopCamera() called");
            try {
                HyperCameraManager hyperCameraManager = this.hyperCameraManager;
                if (hyperCameraManager != null) {
                    hyperCameraManager.stopCamera();
                } else {
                    HVLogUtils.e(TAG, "stopCamera: hyperCameraManager is null");
                }
            } catch (Exception e10) {
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    public void swapCamera() {
        if (isFragmentAdded()) {
            HVLogUtils.d(TAG, "swapCamera() called");
            try {
                ProgressDialog progressDialog = this.rotateDialog;
                if (progressDialog == null || !progressDialog.isShowing()) {
                    if (this.rotateDialog == null) {
                        this.rotateDialog = new ProgressDialog(getActivity());
                    }
                    getFaceConfig().setShouldUseBackCamera(!getFaceConfig().getShouldUseBackCamera());
                    this.rotateDialog.setCancelable(false);
                    this.rotateDialog.setMessage(requireActivity().getString(R.string.hv_please_wait));
                    if (canShowDialog()) {
                        this.rotateDialog.show();
                    }
                    HyperCameraManager hyperCameraManager = this.hyperCameraManager;
                    if (hyperCameraManager != null) {
                        hyperCameraManager.flipCamera();
                    } else {
                        HVLogUtils.e(TAG, "swapCamera: hyperCameraManager is null");
                    }
                }
            } catch (Exception e10) {
                HVLogUtils.e(TAG, "swapCamera(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // co.hyperverge.hypersnapsdk.utils.BaseView
    public TextureContract.Presenter getPresenter() {
        return this.mPresenter;
    }

    @Override // co.hyperverge.hypersnapsdk.utils.BaseView
    public void setPresenter(TextureContract.Presenter presenter) {
        this.mPresenter = presenter;
    }

    /* renamed from: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment$2, reason: invalid class name */
    class AnonymousClass2 extends HyperCameraManagerHost {
        AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCameraFlipCallback$1() {
            TextureFragment textureFragment = TextureFragment.this;
            if (textureFragment.crossHairView != null) {
                TextureFragment.this.crossHairView.setVisibility(textureFragment.getFaceConfig().getShouldUseBackCamera() ? 0 : 8);
                TextureFragment.this.getFaceConfig().isShouldUseZoom();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReady$0() {
            TextureFragment.this.shouldShowProgress(false, null);
            TextureFragment.this.progressDialogTextView.setVisibility(0);
            TextureFragment.this.isCameraInitialized = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$showCrossHair$2(float f10, float f11, boolean z10) {
            if (f10 > 0.0f || f11 > 0.0f) {
                TextureFragment.this.crossHairView.showCrosshair(f10 * r0.camViewWidth, f11 * TextureFragment.this.camViewHeight, z10);
            } else {
                TextureFragment.this.crossHairView.showCrosshair(r3.camViewWidth / 2, TextureFragment.this.camViewHeight / 2, z10);
            }
        }

        private void logSelfieFirstFrameReceivedHelper() {
            HVLogUtils.d(TextureFragment.TAG, "logSelfieFirstFrameReceivedHelper() called");
            if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                return;
            }
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieFirstFrameReceived();
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void flashScreen() {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public int getAspectRatio() {
            return 1;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void getCurrentVideoLength(long j10) {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public File getPhotoDirectory() {
            File file;
            Exception e10;
            HVLogUtils.d(TextureFragment.TAG, "getPhotoDirectory() called");
            try {
                file = new File(TextureFragment.this.requireActivity().getFilesDir(), "hv");
            } catch (Exception e11) {
                file = null;
                e10 = e11;
            }
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Exception e12) {
                e10 = e12;
                HVLogUtils.e(TextureFragment.TAG, "getPhotoDirectory(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getPhotoDirectory exception: ");
                sb2.append(Utils.getErrorMessage(e10));
                Log.e(TextureFragment.TAG, sb2.toString());
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
                return file;
            }
            return file;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public String getPhotoFilename() {
            return "FD_" + System.currentTimeMillis() + ".jpg";
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public float getPictureMegapixels() {
            return 1.3f;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public float getPreviewMegapixels() {
            return 0.3f;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public String getVideoFilename() {
            return "FD_" + System.currentTimeMillis() + ".mp4";
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public boolean isShouldCaptureHighResolutionImage() {
            return false;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onCameraFlipCallback() {
            HVLogUtils.d(TextureFragment.TAG, "onCameraFlipCallback() called");
            ProgressDialog progressDialog = TextureFragment.this.rotateDialog;
            if (progressDialog != null && progressDialog.isShowing() && Utils.canDismissLoader(TextureFragment.this.getActivity())) {
                TextureFragment.this.rotateDialog.dismiss();
                TextureFragment.this.rotateDialog = null;
            }
            TextureFragment.this.isFrontCam = !r0.isFrontCam;
            MainUIThread.getInstance().post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.r
                @Override // java.lang.Runnable
                public final void run() {
                    TextureFragment.AnonymousClass2.this.lambda$onCameraFlipCallback$1();
                }
            });
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onCamerasFound(int i10) {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onFilterMode(int i10, String str) {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onFlashAuto() {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onFlashNull() {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onFlashOff() {
            if (TextureFragment.this.getFaceConfig().isUseFlash()) {
                if (TextureFragment.this.hyperCameraManager != null) {
                    TextureFragment.this.hyperCameraManager.nextFlashMode();
                } else {
                    HVLogUtils.e(TextureFragment.TAG, "onFlashOff: hyperCameraManager is null");
                }
            }
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onFlashOn() {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onFlashTorchOn() {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onLayoutChange() {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onNewPreviewFrame(androidx.camera.core.n nVar) {
            if ((TextureFragment.this.isTakePictureInProgress && TextureFragment.this.config.isShouldUseDefaultZoom()) || TextureFragment.this.isPaused) {
                return;
            }
            if (TextureFragment.this.previousFrameBitmap == null) {
                logSelfieFirstFrameReceivedHelper();
            }
            TextureFragment.this.previousFrameBitmap = nVar.r1();
            TextureFragment.this.rotationDegrees = Integer.valueOf(nVar.G().d());
            CameraProperties cameraProperties = new CameraProperties(nVar.getWidth(), nVar.getHeight(), UIUtils.getScreenWidth(), TextureFragment.this.previewContainer.getDiameter() + UIUtils.dpToPx(TextureFragment.this.requireActivity(), 80.0f), 0L, -1, -1, null, null, nVar, !TextureFragment.this.config.getShouldUseBackCamera(), false);
            if (TextureFragment.this.hvFrameRecorder != null) {
                TextureFragment.this.hvFrameRecorder.pushFrame(TextureFragment.this.previousFrameBitmap, TextureFragment.this.rotationDegrees.intValue());
            }
            TextureContract.Presenter presenter = TextureFragment.this.mPresenter;
            if (presenter != null) {
                presenter.submitFrameForProcessing(cameraProperties);
            }
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onPictureFailed() {
            HVLogUtils.d(TextureFragment.TAG, "onPictureFailed() called");
            TextureFragment textureFragment = TextureFragment.this;
            textureFragment.safeToTakePicture = true;
            textureFragment.hvImageCaptureError = new HVError(2, "failure logged in selfie onPictureFailed()");
            long longValue = TextureFragment.this.imageCaptureTimingUtils.getTimeDifferenceLong().longValue();
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieCaptureFailed(TextureFragment.this.hvImageCaptureError, TextureFragment.this.getFaceConfig(), longValue);
            }
            TextureFragment.this.mPresenter.setFaceDetectionStateFromView(SDKInternalConfig.getInstance().isFaceDetectionOn() ? FaceConstants.FaceDetectionState.FACE_NOT_DETECTED : FaceConstants.FaceDetectionState.FACE_DETECTED);
            TextureFragment.this.isTakePictureInProgress = false;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onPictureReady(byte[] bArr) {
            Bitmap selfieImageBitmap;
            HVLogUtils.d(TextureFragment.TAG, "onPictureReady() called with: bytes = [" + bArr + "]");
            if (InternalToolUtils.isTestMode(TextureFragment.this.getContext()) && (selfieImageBitmap = InternalToolUtils.getSelfieImageBitmap()) != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                selfieImageBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            }
            final byte[] bArr2 = bArr;
            onPictureTaken();
            TextureFragment.this.pauseCamera();
            TextureFragment.this.mPresenter.setFaceDetectionStateFromView(FaceConstants.FaceDetectionState.SAVE_UPLOAD);
            if (TextureFragment.this.getFaceConfig().isShouldRecordVideo()) {
                final Handler handler = new Handler(Looper.getMainLooper());
                handler.postDelayed(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.TextureFragment.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!TextureFragment.this.isVideoRecordingProcessComplete) {
                            handler.postDelayed(this, 100L);
                            Log.d(TextureFragment.TAG, "waiting for videoUri");
                            return;
                        }
                        TextureContract.Presenter presenter = TextureFragment.this.mPresenter;
                        if (presenter != null) {
                            presenter.showDialog(false, null);
                        }
                        if (TextureFragment.this.isVideoRecorded) {
                            TextureFragment textureFragment = TextureFragment.this;
                            textureFragment.timeTakenToVideoRecord = textureFragment.videoRecordTimingUtils.getTimeDifferenceAndUpdateLong();
                        }
                        File photoDirectory = AnonymousClass2.this.getPhotoDirectory();
                        TextureFragment textureFragment2 = TextureFragment.this;
                        TextureContract.Presenter presenter2 = textureFragment2.mPresenter;
                        if (presenter2 != null && photoDirectory != null) {
                            presenter2.savePicture(bArr2, textureFragment2.previousFrame, TextureFragment.this.previousFrameBitmap, TextureFragment.this.rotationDegrees, photoDirectory.getAbsolutePath(), AnonymousClass2.this.getPhotoFilename(), TextureFragment.this.videoUri, TextureFragment.this.framesUri, TextureFragment.this.hvFrameRecorderData);
                        }
                        TextureFragment.this.safeToTakePicture = true;
                        handler.removeCallbacks(this);
                    }
                }, 100L);
                return;
            }
            File photoDirectory = getPhotoDirectory();
            TextureFragment textureFragment = TextureFragment.this;
            TextureContract.Presenter presenter = textureFragment.mPresenter;
            if (presenter != null && photoDirectory != null) {
                presenter.savePicture(bArr2, textureFragment.previousFrame, TextureFragment.this.previousFrameBitmap, TextureFragment.this.rotationDegrees, photoDirectory.getAbsolutePath(), getPhotoFilename(), TextureFragment.this.emptyVideoUri(), TextureFragment.this.framesUri, TextureFragment.this.hvFrameRecorderData);
            }
            TextureFragment.this.safeToTakePicture = true;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onPictureSaved(File file) {
            HVLogUtils.d(TextureFragment.TAG, "onPictureSaved() called with: file = [" + file + "]");
            long longValue = TextureFragment.this.imageCaptureTimingUtils.getTimeDifferenceLong().longValue();
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieCaptureSaved(TextureFragment.this.getFaceConfig(), file.getAbsolutePath(), longValue);
            }
            TextureFragment.this.isTakePictureInProgress = false;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onPictureSizeSet(int i10, int i11) {
            HVLogUtils.d(TextureFragment.TAG, "onPictureSizeSet() called with: width = [" + i10 + "], height = [" + i11 + "]");
            ImageComparisonHelper.get().setPictureSize(i10, i11);
            SPHelper.setLastUsedResolution(i10, i11);
            if (TextureFragment.this.isCameraOpened) {
                return;
            }
            TextureFragment.this.isCameraOpened = true;
            if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                return;
            }
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieCameraOpen();
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onPictureTaken() {
            HVLogUtils.d(TextureFragment.TAG, "onPictureTaken() called");
            long longValue = TextureFragment.this.imageCaptureTimingUtils.getTimeDifferenceLong().longValue();
            if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                return;
            }
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieCaptureSuccessful(TextureFragment.this.getFaceConfig(), longValue);
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onReady() {
            if (!TextureFragment.this.isCameraInitialized) {
                MainUIThread.getInstance().post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        TextureFragment.AnonymousClass2.this.lambda$onReady$0();
                    }
                });
            }
            try {
                if (TextureFragment.this.hyperCameraManager != null) {
                    TextureFragment.this.hyperCameraManager.startAccelerometer();
                } else {
                    HVLogUtils.e(TextureFragment.TAG, "onReady: hyperCameraManager is null");
                }
            } catch (Exception e10) {
                HVLogUtils.e(TextureFragment.TAG, "onReady(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(TextureFragment.TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onVideoSaved(File file) {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onViewDimensionChange(int i10, int i11) {
            HVLogUtils.d(TextureFragment.TAG, "onViewDimensionChange() called with: width = [" + i10 + "], height = [" + i11 + "]");
            TextureFragment.this.camViewHeight = i11;
            TextureFragment.this.camViewWidth = i10;
            TextureFragment.this.adjustCrossHairView();
            TextureFragment.this.adjustOverlayImageView();
            TextureFragment.this.adjustBlackOverlayView();
            TextureFragment.this.adjustProgressDialogView();
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void setScreenFlashOff() {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void setScreenFlashOn() {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void showCrossHair(final float f10, final float f11, final boolean z10) {
            if (TextureFragment.this.crossHairView != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.liveness.ui.texturetracker.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        TextureFragment.AnonymousClass2.this.lambda$showCrossHair$2(f10, f11, z10);
                    }
                });
            }
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void zoomMaxLevel(int i10) {
            HVLogUtils.d(TextureFragment.TAG, "zoomMaxLevel() called with: maxZoom = [" + i10 + "]");
            if (TextureFragment.this.hyperCameraManager == null) {
                HVLogUtils.e(TextureFragment.TAG, "zoomMaxLevel: hyperCameraManager is null, returning");
                return;
            }
            if (!TextureFragment.this.getFaceConfig().isShouldUseDefaultZoom()) {
                TextureFragment.this.hyperCameraManager.setShouldUseDefaultZoom(false);
            } else if (TextureFragment.this.getFaceConfig().getShouldUseBackCamera()) {
                TextureFragment.this.hyperCameraManager.setDefaultZoom(AppConstants.ZOOM_FACTOR_BACK_CAM);
            } else {
                TextureFragment.this.hyperCameraManager.setDefaultZoom(AppConstants.ZOOM_FACTOR_FRONT_CAM);
            }
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onNewPreviewFrame(byte[] bArr, int i10, int i11, int i12, int i13, byte[] bArr2) {
            if ((TextureFragment.this.isTakePictureInProgress && TextureFragment.this.getFaceConfig().isShouldUseDefaultZoom()) || TextureFragment.this.isPaused) {
                return;
            }
            if (TextureFragment.this.previousFrame == null) {
                logSelfieFirstFrameReceivedHelper();
            }
            CameraProperties cameraProperties = new CameraProperties(i10, i11, UIUtils.getScreenWidth(), TextureFragment.this.previewContainer.getDiameter() + UIUtils.dpToPx(TextureFragment.this.requireActivity(), 80.0f), bArr2.length, i12, i13, bArr, bArr2, null, !TextureFragment.this.getFaceConfig().getShouldUseBackCamera(), false);
            if (TextureFragment.this.hvFrameRecorder != null) {
                TextureFragment.this.hvFrameRecorder.pushFrame(bArr2, 0);
            }
            TextureContract.Presenter presenter = TextureFragment.this.mPresenter;
            if (presenter != null) {
                presenter.submitFrameForProcessing(cameraProperties);
            }
            TextureFragment.this.previousFrame = bArr2;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.HyperCameraManagerHost
        public void onFaceDetection(C3201a[] c3201aArr) {
        }
    }
}
