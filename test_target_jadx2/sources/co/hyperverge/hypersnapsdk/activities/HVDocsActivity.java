package co.hyperverge.hypersnapsdk.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.AbstractC1480b;
import co.hyperverge.hvcamera.HVCamHost;
import co.hyperverge.hvcamera.HVMagicView;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine;
import co.hyperverge.hvcamera.magicfilter.utils.Exif;
import co.hyperverge.hyperdocdetect.carddetectorservice.HVTfliteHelper;
import co.hyperverge.hyperdocdetect.carddetectorservice.models.HVCardDetectionResult;
import co.hyperverge.hyperdocdetect.carddetectorservice.models.HVCardDetectorInput;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.activities.HVDocsActivity;
import co.hyperverge.hypersnapsdk.data.DataRepository;
import co.hyperverge.hypersnapsdk.data.models.FeatureConfig;
import co.hyperverge.hypersnapsdk.helpers.CustomTextStringConst;
import co.hyperverge.hypersnapsdk.helpers.DocOCRHelper;
import co.hyperverge.hypersnapsdk.helpers.ExifHelper;
import co.hyperverge.hypersnapsdk.helpers.FileHelper;
import co.hyperverge.hypersnapsdk.helpers.HVCameraHelper;
import co.hyperverge.hypersnapsdk.helpers.HVLottieHelper;
import co.hyperverge.hypersnapsdk.helpers.ImageToPDFConverter;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.SPHelper;
import co.hyperverge.hypersnapsdk.helpers.TimingUtils;
import co.hyperverge.hypersnapsdk.listeners.APICompletionCallback;
import co.hyperverge.hypersnapsdk.listeners.DocCaptureCompletionHandler;
import co.hyperverge.hypersnapsdk.listeners.LocationProviderCallback;
import co.hyperverge.hypersnapsdk.listeners.NetworkRetryDialogCallback;
import co.hyperverge.hypersnapsdk.listeners.PermDialogCallback;
import co.hyperverge.hypersnapsdk.model.HVJSONObject;
import co.hyperverge.hypersnapsdk.objects.HVBaseConfig;
import co.hyperverge.hypersnapsdk.objects.HVBaseResponse;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams;
import co.hyperverge.hypersnapsdk.objects.HyperSnapSDKConfig;
import co.hyperverge.hypersnapsdk.objects.IPAddress;
import co.hyperverge.hypersnapsdk.providers.CallbackProvider;
import co.hyperverge.hypersnapsdk.service.iptogeo.IPToGeoService;
import co.hyperverge.hypersnapsdk.service.iptogeo.IPToGeoServiceImpl;
import co.hyperverge.hypersnapsdk.service.location.LocationServiceImpl;
import co.hyperverge.hypersnapsdk.service.qr.HVBarcodeDetector;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil;
import co.hyperverge.hypersnapsdk.utils.InternalToolUtils;
import co.hyperverge.hypersnapsdk.utils.PDFUtils;
import co.hyperverge.hypersnapsdk.utils.PermissionManager;
import co.hyperverge.hypersnapsdk.utils.PicassoManager;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import co.hyperverge.hypersnapsdk.utils.TextConfigUtils;
import co.hyperverge.hypersnapsdk.utils.UIUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import co.hyperverge.hypersnapsdk.views.CrossHairView;
import co.hyperverge.hypersnapsdk.views.RectPortHoleView;
import co.hyperverge.hypersnapsdk.views.ScanningIndicator;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.imageview.ShapeableImageView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HVDocsActivity extends HVBaseActivity implements View.OnClickListener {
    private static final int LOCATION_SETTINGS_REQUEST_CODE = 1001;
    public static String LOG_TAG = "DocumentActivity";
    private static final int RC_PICK_DOC = 1000;
    private static final long SENSOR_EVENT_PROCESSING_MIN_INTERVAL_MS = 500;
    private static final String TAG = "co.hyperverge.hypersnapsdk.activities.HVDocsActivity";
    private final float BOX_PORTHOLE_PADDING_PERCENT;
    private final int CAMERA_CHECK_DELAY;
    final float[][] accels;
    private CountDownTimer autoCaptureTimer;
    private int autoCaptureTimerNumber;
    final float[] azimuth;
    View blackOverlay;
    ImageView btCapture;
    private final HVCamHost camHost;
    private int camViewHeight;
    private final String camViewTag = "docCaptureCameraPreview";
    private int camViewWidth;
    FrameLayout cameraContainer;
    private AtomicBoolean cameraFree;
    HVMagicView cameraView;
    private final TimingUtils captureClickTimingUtils;
    private String capturedHighResolutionFullImagePath;
    private String capturedHighResolutionQRCroppedImagePath;
    private String capturedImagePath;
    File compressedFile;
    private Bitmap croppedBitmap;
    private ImageView cross;
    CrossHairView crossHairView;
    private final Handler delayHandler;
    private float density;
    TextView descText;
    private String detectedBarcode;
    private HVDocConfig docConfig;
    private ConstraintLayout docInstructionsLayout;
    private ConstraintLayout docLoaderLayout;
    private final TimingUtils docPickerCaptureButtonClickTimingUtils;
    private final TimingUtils docPickerScreenLoadSuccessTimingUtils;
    private final TimingUtils docPickerUploadButtonClickTimingUtils;
    private HVDocConfig.Document document;
    RectPortHoleView documentCaptureView;
    private float dpHeight;
    private float dpWidth;
    private final Animation.AnimationListener flashAnimationListener;
    File folder;
    private File fullHRImageFile;
    final float[][] gravity;
    private boolean hasDelayFinished;
    TextView hintText;
    private final HVBarcodeDetector hvBarcodeDetector;
    private HVCardUIState hvCardUIState;
    private ImageView hvGreenTickImageView;
    private HVError hvImageCaptureError;
    private final HVResponse hvResponse;
    private final ArrayList<HVBaseResponse> hvResponses;
    private final TimingUtils imageCaptureTimingUtils;
    private Long imageSubmissionTimestamp;
    private ScanningIndicator indicator;
    private TextView instructionsInsideCameraPreviewBox;
    private TextView instructionsOutsideCameraPreviewBox;
    private Button instructionsUploadButton;
    private IPAddress ipAddress;
    private boolean isAutoCaptureTimerRunning;
    private boolean isAutoCapturing;
    private boolean isBarcodeDetected;
    private boolean isCardDetectedInAutoCapturedImage;
    private boolean isCardDetectionInProgress;
    private boolean isCheckingCamera;
    private boolean isDocCaptureFlow;
    boolean isPhoneTilted;
    private boolean isReadBarcodeTimerRunning;
    private boolean isStillAutoCaptureInitialState;
    private boolean isViewsInitialised;
    ImageView ivFlash;
    private long lastSensorEventProcessedTimeMs;
    private float lastTouchX;
    private float lastTouchY;
    private LottieAnimationView lav;
    private LottieAnimationView lavDocInstructions;
    private LottieAnimationView lavDocInstructionsProcessing;
    private LottieAnimationView lavLoader;
    private Location mLocation;
    final float[][] magnetic;
    final float[][] mags;
    private final float maximumDocFrameXPercentage;
    private final float maximumDocFrameYPercentage;
    private final float minimumDocXFramePercentage;
    private final float minimumDocYFramePercentage;
    SensorEventListener mySensorEventListener;
    private int numberOfRechecks;
    private ShapeableImageView overlayImageView;
    double padding;
    String pdfPath;
    PermissionManager permissionManager;
    private final TimingUtils permissionTimingUtils;
    final float[] pitch;
    private TextView progressDialogTextView;
    private View progressDialogView;
    private ImageView progressSpinnerImageView;
    private String qrCodeValue;
    private File qrCroppedFile;
    private CountDownTimer readBarcodeTimer;
    String retakeMessage;
    String retryAction;
    final float[] roll;
    private boolean safeToTakePicture;
    private final TimingUtils screenLoadSuccessTimingUtils;
    SensorManager sensorManager;
    private boolean shouldAllowActivityClose;
    private boolean showInstructionPage;
    TextView tvTitle;
    private final boolean useFrontFacingCam;
    View vFlash;
    final float[] values;

    /* renamed from: co.hyperverge.hypersnapsdk.activities.HVDocsActivity$15, reason: invalid class name */
    static /* synthetic */ class AnonymousClass15 {
        static final /* synthetic */ int[] $SwitchMap$co$hyperverge$hypersnapsdk$activities$HVDocsActivity$HVCardUIState;

        static {
            int[] iArr = new int[HVCardUIState.values().length];
            $SwitchMap$co$hyperverge$hypersnapsdk$activities$HVDocsActivity$HVCardUIState = iArr;
            try {
                iArr[HVCardUIState.CARD_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$activities$HVDocsActivity$HVCardUIState[HVCardUIState.CARD_NOT_DETECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$activities$HVDocsActivity$HVCardUIState[HVCardUIState.MOVE_CLOSER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$activities$HVDocsActivity$HVCardUIState[HVCardUIState.MOVE_AWAY_FROM_CAMERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$co$hyperverge$hypersnapsdk$activities$HVDocsActivity$HVCardUIState[HVCardUIState.MOVE_AWAY_FROM_EDGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: co.hyperverge.hypersnapsdk.activities.HVDocsActivity$2, reason: invalid class name */
    class AnonymousClass2 extends HVCamHost {
        AnonymousClass2() {
        }

        private void handleBarcodeScanned(boolean z10) {
            HVDocsActivity.this.isReadBarcodeTimerRunning = false;
            if (z10) {
                HVDocsActivity.this.readBarcodeTimer.cancel();
            }
            HVDocsActivity.this.showBarcodeScannedSuccessfulOverlay(true);
            HVDocsActivity.this.cameraView.postDelayed(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.l0
                @Override // java.lang.Runnable
                public final void run() {
                    HVDocsActivity.AnonymousClass2.this.lambda$handleBarcodeScanned$1();
                }
            }, 1000L);
            HVDocsActivity.this.cameraView.removeCallbacks(null);
            if (HVDocsActivity.this.getDocConfig().isShouldPerformAssistiveCapture()) {
                HVDocsActivity.this.setCaptureButtonState(true, false);
            } else {
                if (HVDocsActivity.this.getDocConfig().isShouldAutoCapture()) {
                    return;
                }
                HVDocsActivity.this.setCaptureButtonState(true, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleBarcodeScanned$1() {
            HVDocsActivity.this.showBarcodeScannedSuccessfulOverlay(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNewPreviewFrame$10() {
            HVDocsActivity.this.setHVCardUIState(HVCardUIState.CARD_NOT_DETECTED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNewPreviewFrame$11() {
            HVDocsActivity.this.setHVCardUIState(HVCardUIState.CARD_NOT_DETECTED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onNewPreviewFrame$2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNewPreviewFrame$3() {
            HVDocsActivity.this.setHVCardUIState(HVCardUIState.MOVE_CLOSER);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNewPreviewFrame$4() {
            HVDocsActivity.this.setHVCardUIState(HVCardUIState.MOVE_CLOSER);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNewPreviewFrame$5() {
            HVDocsActivity.this.setHVCardUIState(HVCardUIState.CARD_DETECTED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNewPreviewFrame$6() {
            HVDocsActivity.this.setHVCardUIState(HVCardUIState.MOVE_CLOSER);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNewPreviewFrame$7() {
            HVDocsActivity.this.setHVCardUIState(HVCardUIState.MOVE_AWAY_FROM_CAMERA);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNewPreviewFrame$8() {
            HVDocsActivity.this.setHVCardUIState(HVCardUIState.MOVE_AWAY_FROM_EDGE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNewPreviewFrame$9() {
            HVDocsActivity.this.setHVCardUIState(HVCardUIState.MOVE_AWAY_FROM_CAMERA);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPictureReady$0(final ExifHelper exifHelper, final String str, Bitmap bitmap) {
            HVLogUtils.d(HVDocsActivity.TAG, "onImageSave() called with: croppedFilePath = [" + str + "], bitmap = [" + bitmap + "]");
            HVDocsActivity.this.imageSubmissionTimestamp = Long.valueOf(System.currentTimeMillis());
            onPictureSaved(new File(str));
            boolean z10 = true;
            HVDocsActivity.this.cameraFree.set(true);
            if (bitmap == null || !new File(str).exists()) {
                HVDocsActivity.this.stopCamera();
                HVDocsActivity.this.finishView(new HVError(2, "Error while capturing the document"), new HVResponse(null, null, null, HVDocsActivity.this.retryAction));
                return;
            }
            if (HVDocsActivity.this.shouldUseDocDetect()) {
                try {
                    HVCardDetectionResult detectCard = HVTfliteHelper.getInstance().detectCard(new HVCardDetectorInput(bitmap));
                    if (detectCard != null) {
                        if (detectCard.getNormalisedTopLeftX() >= 0.0f) {
                            if (detectCard.getNormalisedTopLeftX() <= 1.0f) {
                                if (detectCard.getNormalisedTopLeftY() >= 0.0f) {
                                    if (detectCard.getNormalisedTopLeftY() <= 1.0f) {
                                        if (detectCard.getNormalisedBottomRightX() >= 0.0f) {
                                            if (detectCard.getNormalisedBottomRightX() <= 1.0f) {
                                                if (detectCard.getNormalisedBottomRightY() >= 0.0f) {
                                                    if (detectCard.getNormalisedBottomRightY() > 1.0f) {
                                                    }
                                                    setIsCardDetectedInAutoCapturedImage(z10);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z10 = false;
                    setIsCardDetectedInAutoCapturedImage(z10);
                } catch (Exception e10) {
                    Log.e(HVDocsActivity.TAG, Utils.getErrorMessage(e10));
                    if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                        SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                    }
                } catch (NoClassDefFoundError e11) {
                    Log.e(HVDocsActivity.TAG, Utils.getErrorMessage(e11));
                    if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                        SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
                    }
                    HVDocsActivity.this.callCompletionHandler(new HVError(36, HVDocsActivity.this.getStringFromResources(R.string.hyper_doc_detect_error)), null);
                    HVDocsActivity.this.finish();
                }
            }
            final JSONObject jSONObject = new JSONObject();
            try {
                if (HVDocsActivity.this.getDocConfig().isShouldExportPDF()) {
                    HVDocsActivity.this.pdfPath = ImageToPDFConverter.convertImageToPDF(bitmap, HVDocsActivity.this.folder.getPath() + "/hv_" + System.currentTimeMillis() + ".pdf");
                    jSONObject.put("pdfUri", HVDocsActivity.this.pdfPath);
                }
                final String transactionID = (HVDocsActivity.this.getDocConfig().getOcrHeaders() == null || !HVDocsActivity.this.getDocConfig().getOcrHeaders().has("transactionId")) ? SPHelper.getTransactionID() : HVDocsActivity.this.getDocConfig().getOcrHeaders().getString("transactionId");
                if (SDKInternalConfig.getInstance().getRemoteConfig().isUseIpToGeo()) {
                    new IPToGeoServiceImpl().performIp2GeoAddress(new IPToGeoService.IPToGeoCallback() { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.2.1
                        @Override // co.hyperverge.hypersnapsdk.service.iptogeo.IPToGeoService.IPToGeoCallback
                        public void onError() {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            anonymousClass2.moveOnFromHVDocView(str, HVDocsActivity.this.capturedHighResolutionQRCroppedImagePath, transactionID, null, exifHelper, jSONObject);
                        }

                        @Override // co.hyperverge.hypersnapsdk.service.iptogeo.IPToGeoService.IPToGeoCallback
                        public void onSuccess(IPAddress iPAddress) {
                            HVDocsActivity.this.ipAddress = iPAddress;
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            anonymousClass2.moveOnFromHVDocView(str, HVDocsActivity.this.capturedHighResolutionQRCroppedImagePath, transactionID, iPAddress, exifHelper, jSONObject);
                        }
                    });
                } else {
                    moveOnFromHVDocView(str, HVDocsActivity.this.capturedHighResolutionQRCroppedImagePath, transactionID, null, exifHelper, jSONObject);
                }
            } catch (Exception e12) {
                Log.e(HVDocsActivity.TAG, Utils.getErrorMessage(e12));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e12);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void moveOnFromHVDocView(String str, String str2, String str3, IPAddress iPAddress, ExifHelper exifHelper, JSONObject jSONObject) {
            Log.d(HVDocsActivity.TAG, "moveOnFromHVDocView() called with: filePath = [" + str + "], capturedHighResolutionQRCroppedImagePath = [" + str2 + "], transactionID = [" + str3 + "], ipAddress = [" + iPAddress + "], helper = [" + exifHelper + "], result = [" + jSONObject + "]");
            if (HVDocsActivity.this.getDocConfig().isShouldReadNIDQR()) {
                Bitmap decodeFile = BitmapFactory.decodeFile(str);
                try {
                    HVDocsActivity hVDocsActivity = HVDocsActivity.this;
                    hVDocsActivity.qrCodeValue = hVDocsActivity.hvBarcodeDetector.detect(decodeFile);
                } catch (NoClassDefFoundError unused) {
                    Log.e(HVDocsActivity.TAG, "gms vision excluded");
                }
                JSONObject ocrParams = HVDocsActivity.this.getDocConfig().getOcrParams();
                try {
                    ocrParams.put(AppConstants.DOCUMENT_QR_CODE, HVDocsActivity.this.qrCodeValue);
                    HVDocsActivity.this.getDocConfig().ocrParams = ocrParams.toString();
                } catch (Exception e10) {
                    Log.e(HVDocsActivity.TAG, "onPictureReady:- JSON Exception :" + Utils.getErrorMessage(e10));
                }
                decodeFile.recycle();
            }
            if (HVDocsActivity.this.getDocConfig().isShouldReadBarcode()) {
                JSONObject ocrParams2 = HVDocsActivity.this.getDocConfig().getOcrParams();
                try {
                    ocrParams2.put(AppConstants.DOCUMENT_BAR_CODE, HVDocsActivity.this.detectedBarcode);
                    HVDocsActivity.this.getDocConfig().ocrParams = ocrParams2.toString();
                } catch (Exception e11) {
                    Log.e(HVDocsActivity.TAG, "onPictureReady:- JSON Exception :" + Utils.getErrorMessage(e11));
                }
            }
            exifHelper.writeExifData(str, str3, iPAddress);
            HVDocsActivity.this.cross.setEnabled(true);
            HVDocsActivity.this.showProgressDialog(false, null);
            if (HVDocsActivity.this.getDocConfig().isShouldReadBarcode() && HVDocsActivity.this.isReadBarcodeTimerRunning) {
                HVDocsActivity.this.resetReadBarcodeVariables();
            }
            HVDocsActivity.this.resetAutoCaptureVariables();
            HVDocsActivity.this.safeToTakePicture = true;
            if (HVDocsActivity.this.shouldUseDocDetect() && !HVDocsActivity.this.isCardDetectedInAutoCapturedImage) {
                HVDocsActivity hVDocsActivity2 = HVDocsActivity.this;
                hVDocsActivity2.startRetakeScreen(str, TextConfigUtils.getText(hVDocsActivity2.getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_AUTO_CAPTURE_ERROR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_AUTO_CAPTURE_ERROR, HVDocsActivity.this.getStringFromResources(R.string.docCaptureAutoCaptureError)).toString());
                return;
            }
            if (HVDocsActivity.this.getDocConfig().shouldShowReviewScreen()) {
                HVDocsActivity.this.enableCaptureButton();
                HVDocsActivity.this.startReviewScreen(str, str2);
            } else {
                if (HVDocsActivity.this.getDocConfig().isShouldDoOCR()) {
                    HVDocsActivity.this.checkCPRSession(str, str2);
                    return;
                }
                HVDocsActivity.this.enableCaptureButton();
                HVDocsActivity.this.stopCamera();
                HVDocsActivity.this.finishView(null, new HVResponse(jSONObject, new JSONObject(), str, HVDocsActivity.this.retryAction));
            }
        }

        private void setIsCardDetectedInAutoCapturedImage(boolean z10) {
            HVDocsActivity.this.isCardDetectedInAutoCapturedImage = z10;
        }

        private void showDocBoxView(RectF rectF, boolean z10) {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void flashScreen() {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.2.3
                @Override // java.lang.Runnable
                public void run() {
                    HVDocsActivity.this.flashScreen();
                }
            });
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public int getAspectRatio() {
            return 1;
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void getCurrentVideoLength(long j10) {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public File getPhotoDirectory() {
            return new File(HVDocsActivity.this.capturedImagePath).getParentFile();
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public String getPhotoFilename() {
            return "IS_" + System.currentTimeMillis() + ".jpg";
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public float getPictureMegapixels() {
            return 2.0f;
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public float getPreviewMegapixels() {
            return 2.0f;
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public String getVideoFilename() {
            return null;
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public boolean isShouldCaptureHighResolutionImage() {
            return HVDocsActivity.this.getDocConfig().isShouldReadNIDQR();
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onCameraFlipCallback() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onCamerasFound(int i10) {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onFaceDetection(Camera.Face[] faceArr) {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onFilterMode(int i10, String str) {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onFlashAuto() {
            HVDocsActivity.this.getDocConfig().isShouldShowFlashIcon();
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onFlashNull() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onFlashOff() {
            try {
                if (HVDocsActivity.this.getDocConfig().isShouldShowFlashIcon()) {
                    HVDocsActivity.this.ivFlash.setImageResource(R.drawable.ic_baseline_flash_off_18);
                }
            } catch (Exception e10) {
                Log.e(HVDocsActivity.TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onFlashOn() {
            HVMagicView hVMagicView;
            try {
                if (HVDocsActivity.this.getDocConfig().isShouldShowFlashIcon()) {
                    HVDocsActivity.this.ivFlash.setImageResource(R.drawable.ic_baseline_flash_on_18);
                    if (CameraEngine.isCamera2(HVDocsActivity.this) || (hVMagicView = HVDocsActivity.this.cameraView) == null) {
                        return;
                    }
                    hVMagicView.nextFlashMode();
                }
            } catch (Exception e10) {
                Log.e(HVDocsActivity.TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onFlashTorchOn() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onLayoutChange() {
            HVDocsActivity.this.adjustView(true);
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onNewPreviewFrame(byte[] bArr, int i10, int i11, int i12, int i13, byte[] bArr2) {
            Bitmap documentImageBitmap;
            if (HVDocsActivity.this.safeToTakePicture) {
                if (HVDocsActivity.this.getDocConfig().isShouldReadBarcode() && HVDocsActivity.this.isReadBarcodeTimerRunning) {
                    String detect = HVDocsActivity.this.hvBarcodeDetector.detect(bArr, i10, i11);
                    if (!detect.isEmpty()) {
                        HVDocsActivity.this.detectedBarcode = detect;
                        if (!HVDocsActivity.this.isBarcodeDetected) {
                            HVDocsActivity.this.isBarcodeDetected = true;
                            if (HVDocsActivity.this.getDocConfig().isBarcodeSkipDisabled()) {
                                handleBarcodeScanned(false);
                            }
                            if (!HVDocsActivity.this.getDocConfig().isBarcodeSkipDisabled()) {
                                handleBarcodeScanned(true);
                            }
                        }
                        if (!HVDocsActivity.this.getDocConfig().isShouldAutoCapture() && !HVDocsActivity.this.getDocConfig().isShouldPerformAssistiveCapture() && !HVDocsActivity.this.isReadBarcodeTimerRunning && (!HVDocsActivity.this.btCapture.isEnabled() || !HVDocsActivity.this.btCapture.isClickable())) {
                            HVDocsActivity.this.runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.j0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    HVDocsActivity.AnonymousClass2.lambda$onNewPreviewFrame$2();
                                }
                            });
                        }
                    }
                }
                if (HVDocsActivity.this.isReadBarcodeTimerRunning || !HVDocsActivity.this.shouldUseDocDetect() || HVDocsActivity.this.isCardDetectionInProgress) {
                    return;
                }
                HVDocsActivity.this.isCardDetectionInProgress = true;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
                if (InternalToolUtils.isTestMode(HVDocsActivity.this) && (documentImageBitmap = InternalToolUtils.getDocumentImageBitmap(HVDocsActivity.this.getDocConfig().getDocumentSide())) != null) {
                    decodeByteArray = documentImageBitmap;
                }
                float width = decodeByteArray.getWidth();
                float height = decodeByteArray.getHeight();
                float width2 = HVDocsActivity.this.cameraContainer.getWidth();
                float height2 = HVDocsActivity.this.cameraContainer.getHeight();
                try {
                    try {
                        HVCardDetectionResult detectCard = HVTfliteHelper.getInstance().detectCard(new HVCardDetectorInput(decodeByteArray));
                        if (detectCard != null) {
                            RectF boxRect = HVDocsActivity.this.getBoxRect();
                            RectF rectF = new RectF(((int) boxRect.left) + ((int) (boxRect.width() * 0.02f)), ((int) boxRect.top) + ((int) (boxRect.height() * 0.02f)), ((int) boxRect.right) - ((int) (boxRect.width() * 0.02f)), ((int) boxRect.bottom) - ((int) (((int) boxRect.height()) * 0.02f)));
                            float f10 = rectF.bottom - rectF.top;
                            float f11 = rectF.right - rectF.left;
                            int i14 = (int) ((0.0f * f11) / 200.0f);
                            int i15 = (int) ((10.0f * f10) / 200.0f);
                            RectF rectF2 = new RectF(((int) rectF.left) + i14, ((int) rectF.top) + i15, ((int) rectF.right) - i14, ((int) rectF.bottom) - i15);
                            int i16 = (int) ((45.0f * f11) / 200.0f);
                            int i17 = (int) ((f10 * 50.0f) / 200.0f);
                            RectF rectF3 = new RectF(((int) rectF.left) + i16, ((int) rectF.top) + i17, ((int) rectF.right) - i16, ((int) rectF.bottom) - i17);
                            float tfliteInputShapeHeight = detectCard.getTfliteInputShapeHeight() * ((height / width) - 1.0f);
                            float normalisedTopLeftX = detectCard.getNormalisedTopLeftX() * width2;
                            float normalisedTopLeftY = (detectCard.getNormalisedTopLeftY() * height2) + tfliteInputShapeHeight;
                            float normalisedBottomRightX = detectCard.getNormalisedBottomRightX() * width2;
                            float normalisedBottomRightY = (detectCard.getNormalisedBottomRightY() * height2) + tfliteInputShapeHeight;
                            detectCard.getNormalisedWidth();
                            detectCard.getNormalisedHeight();
                            RectF rectF4 = new RectF(normalisedTopLeftX, normalisedTopLeftY, normalisedBottomRightX, normalisedBottomRightY);
                            float f12 = rectF4.bottom - rectF4.top;
                            float f13 = rectF4.right - rectF4.left;
                            float min = Math.min(f11, f10);
                            boolean z10 = f12 < (90.0f * f10) / 100.0f && f13 < (f11 * 100.0f) / 100.0f;
                            boolean z11 = f12 > (min * 50.0f) / 100.0f && f13 > (min * 55.0f) / 100.0f;
                            try {
                                if (rectF3.contains(rectF4)) {
                                    HVDocsActivity.this.cancelAutoCaptureTimer();
                                    HVDocsActivity.this.runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.m0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            HVDocsActivity.AnonymousClass2.this.lambda$onNewPreviewFrame$3();
                                        }
                                    });
                                } else if (rectF2.contains(rectF4)) {
                                    if (z11) {
                                        if (HVDocsActivity.this.hvCardUIState != HVCardUIState.CARD_DETECTED) {
                                            HVDocsActivity.this.runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.o0
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    HVDocsActivity.AnonymousClass2.this.lambda$onNewPreviewFrame$5();
                                                }
                                            });
                                        }
                                        if (!HVDocsActivity.this.isAutoCapturing) {
                                            HVDocsActivity.this.isAutoCapturing = true;
                                            if (HVDocsActivity.this.autoCaptureTimer == null || HVDocsActivity.this.isAutoCaptureTimerRunning) {
                                                Log.e(HVDocsActivity.TAG, "onNewPreviewFrame: autoCaptureTimer is null or is already running");
                                            } else {
                                                HVDocsActivity.this.autoCaptureTimer.start();
                                                HVDocsActivity.this.isAutoCaptureTimerRunning = true;
                                            }
                                        }
                                    } else {
                                        HVDocsActivity.this.cancelAutoCaptureTimer();
                                        HVDocsActivity.this.runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.n0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                HVDocsActivity.AnonymousClass2.this.lambda$onNewPreviewFrame$4();
                                            }
                                        });
                                    }
                                } else if (!rectF.contains(rectF4)) {
                                    if (f13 <= f11 * 1.0f && f12 <= f10 * 0.9f) {
                                        HVDocsActivity.this.cancelAutoCaptureTimer();
                                        HVDocsActivity.this.runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.t0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                HVDocsActivity.AnonymousClass2.this.lambda$onNewPreviewFrame$10();
                                            }
                                        });
                                    }
                                    HVDocsActivity.this.cancelAutoCaptureTimer();
                                    HVDocsActivity.this.runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.s0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            HVDocsActivity.AnonymousClass2.this.lambda$onNewPreviewFrame$9();
                                        }
                                    });
                                } else if (!z11) {
                                    HVDocsActivity.this.cancelAutoCaptureTimer();
                                    HVDocsActivity.this.runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.p0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            HVDocsActivity.AnonymousClass2.this.lambda$onNewPreviewFrame$6();
                                        }
                                    });
                                } else if (z10) {
                                    HVDocsActivity.this.cancelAutoCaptureTimer();
                                    HVDocsActivity.this.runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.r0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            HVDocsActivity.AnonymousClass2.this.lambda$onNewPreviewFrame$8();
                                        }
                                    });
                                } else {
                                    HVDocsActivity.this.cancelAutoCaptureTimer();
                                    HVDocsActivity.this.runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.q0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            HVDocsActivity.AnonymousClass2.this.lambda$onNewPreviewFrame$7();
                                        }
                                    });
                                }
                            } catch (Exception e10) {
                                Log.e(HVDocsActivity.TAG, "onNewPreviewFrame: Exception : " + e10.getMessage());
                                HVDocsActivity.this.cancelAutoCaptureTimer();
                            }
                        } else {
                            HVDocsActivity.this.cancelAutoCaptureTimer();
                            HVDocsActivity.this.runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.u0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    HVDocsActivity.AnonymousClass2.this.lambda$onNewPreviewFrame$11();
                                }
                            });
                        }
                    } catch (NoClassDefFoundError e11) {
                        Log.e(HVDocsActivity.TAG, Utils.getErrorMessage(e11));
                        if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
                        }
                        HVDocsActivity.this.callCompletionHandler(new HVError(36, HVDocsActivity.this.getStringFromResources(R.string.hyper_doc_detect_error)), null);
                        HVDocsActivity.this.finish();
                    }
                } catch (Exception e12) {
                    Log.e(HVDocsActivity.TAG, Utils.getErrorMessage(e12));
                    if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                        SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e12);
                    }
                }
                HVDocsActivity.this.isCardDetectionInProgress = false;
            }
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onPictureFailed() {
            Log.d(HVDocsActivity.TAG, "onPictureFailed() called");
            HVDocsActivity.this.cameraFree.set(true);
            HVDocsActivity.this.hvImageCaptureError = new HVError(2, "failure logged in document onPictureFailed()");
            long longValue = HVDocsActivity.this.imageCaptureTimingUtils.getTimeDifferenceLong().longValue();
            if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                return;
            }
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureFailed(HVDocsActivity.this.hvImageCaptureError, HVDocsActivity.this.getDocConfig(), longValue);
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onPictureReady(byte[] bArr) {
            Bitmap documentImageBitmap;
            if (InternalToolUtils.isTestMode(HVDocsActivity.this) && (documentImageBitmap = InternalToolUtils.getDocumentImageBitmap(HVDocsActivity.this.getDocConfig().getDocumentSide())) != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                documentImageBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            }
            onPictureTaken();
            HVMagicView hVMagicView = HVDocsActivity.this.cameraView;
            if (hVMagicView != null) {
                hVMagicView.onPause();
            }
            final ExifHelper exifHelper = new ExifHelper();
            exifHelper.readExif(bArr, HVDocsActivity.this.capturedImagePath, HVDocsActivity.this.mLocation);
            try {
                HVDocsActivity.this.showProgressDialog(true, BuildConfig.FLAVOR);
                HVDocsActivity hVDocsActivity = HVDocsActivity.this;
                hVDocsActivity.new SaveBitmapTask(bArr, hVDocsActivity, new ImageSaveListener() { // from class: co.hyperverge.hypersnapsdk.activities.k0
                    @Override // co.hyperverge.hypersnapsdk.activities.HVDocsActivity.ImageSaveListener
                    public final void onImageSave(String str, Bitmap bitmap) {
                        HVDocsActivity.AnonymousClass2.this.lambda$onPictureReady$0(exifHelper, str, bitmap);
                    }
                }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } catch (Exception e10) {
                Log.e(HVDocsActivity.TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onPictureSaved(File file) {
            Log.d(HVDocsActivity.TAG, "onPictureSaved() called with: file = [" + file + "]");
            long longValue = HVDocsActivity.this.imageCaptureTimingUtils.getTimeDifferenceLong().longValue();
            if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                return;
            }
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureSaved(HVDocsActivity.this.getDocConfig(), file.getAbsolutePath(), longValue);
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onPictureSizeSet(int i10, int i11) {
            if (HVDocsActivity.this.getDocConfig().isShouldAutoCapture() || HVDocsActivity.this.getDocConfig().isShouldPerformAssistiveCapture() || HVDocsActivity.this.isReadBarcodeTimerRunning || HVDocsActivity.this.getDocConfig().isShouldReadBarcode()) {
                return;
            }
            HVDocsActivity.this.enableCaptureButton();
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onPictureTaken() {
            Log.d(HVDocsActivity.TAG, "onPictureTaken() called");
            long longValue = HVDocsActivity.this.imageCaptureTimingUtils.getTimeDifferenceLong().longValue();
            if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                return;
            }
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureSuccessful(HVDocsActivity.this.getDocConfig(), longValue);
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onReady() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onVideoSaved(File file) {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onViewDimensionChange(int i10, int i11) {
            HVDocsActivity.this.camViewHeight = i11;
            HVDocsActivity.this.camViewWidth = i10;
            HVDocsActivity.this.adjustCrossHairView();
            HVDocsActivity.this.adjustDocumentCaptureView();
            HVDocsActivity.this.adjustHintText();
            HVDocsActivity.this.adjustTitleText();
            HVDocsActivity.this.adjustScanningIndicator();
            HVDocsActivity.this.adjustOverlayImageView();
            HVDocsActivity.this.adjustBlackOverlayView();
            HVDocsActivity.this.adjustProgressDialogView();
            HVDocsActivity.this.adjustStatusText();
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void setScreenFlashOff() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void setScreenFlashOn() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void showCrossHair(final float f10, final float f11, final boolean z10) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.2.2
                @Override // java.lang.Runnable
                public void run() {
                    float f12 = f10;
                    if (f12 > 0.0f || f11 > 0.0f) {
                        HVDocsActivity.this.crossHairView.showCrosshair(f12 * r1.camViewWidth, f11 * HVDocsActivity.this.camViewHeight, z10);
                    } else {
                        HVDocsActivity.this.crossHairView.showCrosshair(r0.camViewWidth / 2, HVDocsActivity.this.camViewHeight / 2, z10);
                    }
                }
            });
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void zoomMaxLevel(int i10) {
        }
    }

    /* renamed from: co.hyperverge.hypersnapsdk.activities.HVDocsActivity$7, reason: invalid class name */
    class AnonymousClass7 extends CountDownTimer {
        AnonymousClass7(long j10, long j11) {
            super(j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFinish$0() {
            if (HVDocsActivity.this.getDocConfig().isShouldPerformAssistiveCapture()) {
                return;
            }
            HVDocsActivity.this.safeTakePicture();
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (HVDocsActivity.this.isAutoCaptureTimerRunning) {
                HVDocsActivity.this.isAutoCaptureTimerRunning = false;
                HVDocsActivity.this.runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        HVDocsActivity.AnonymousClass7.this.lambda$onFinish$0();
                    }
                });
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            if (HVDocsActivity.this.isAutoCaptureTimerRunning) {
                HVDocsActivity.this.instructionsInsideCameraPreviewBox.setText(((Object) TextConfigUtils.getText(HVDocsActivity.this.getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_AUTO_CAPTURE_WAIT, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_AUTO_CAPTURE_WAIT, HVDocsActivity.this.getStringFromResources(R.string.docCaptureAutoCaptureWait))) + " " + HVDocsActivity.access$4610(HVDocsActivity.this));
            }
        }
    }

    private enum HVCardUIState {
        CARD_DETECTED,
        CARD_NOT_DETECTED,
        MOVE_CLOSER,
        MOVE_AWAY_FROM_CAMERA,
        MOVE_AWAY_FROM_EDGE
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface ImageSaveListener {
        void onImageSave(String str, Bitmap bitmap);
    }

    private class SaveBitmapTask extends AsyncTask<Void, Void, Void> {
        private final byte[] data;
        ImageSaveListener listener;
        private Bitmap mBitmap;
        Context mContext;

        public SaveBitmapTask(byte[] bArr, Context context, ImageSaveListener imageSaveListener) {
            this.data = bArr;
            this.mContext = context;
            this.listener = imageSaveListener;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x00b9 A[Catch: Exception -> 0x0041, OutOfMemoryError -> 0x0044, TryCatch #2 {Exception -> 0x0041, OutOfMemoryError -> 0x0044, blocks: (B:2:0x0000, B:4:0x0030, B:7:0x0049, B:10:0x0081, B:12:0x00b9, B:13:0x00bd, B:15:0x00c5, B:16:0x00fb), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00c5 A[Catch: Exception -> 0x0041, OutOfMemoryError -> 0x0044, TryCatch #2 {Exception -> 0x0041, OutOfMemoryError -> 0x0044, blocks: (B:2:0x0000, B:4:0x0030, B:7:0x0049, B:10:0x0081, B:12:0x00b9, B:13:0x00bd, B:15:0x00c5, B:16:0x00fb), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Bitmap cropBitmap(Bitmap bitmap) {
            int height;
            int height2;
            try {
                double width = HVDocsActivity.this.getDocConfig().padding * bitmap.getWidth() * HVDocsActivity.this.document.getAspectRatio();
                HVDocsActivity.this.getBottomYOfBox();
                HVDocsActivity.this.getTopYOfBox();
                if (HVDocsActivity.this.getDocConfig().isShouldSetPadding()) {
                    if (HVDocsActivity.this.document.getAspectRatio() > 1.0f) {
                    }
                    HVDocsActivity.this.padding = width;
                    int width2 = (int) (bitmap.getWidth() * (HVDocsActivity.this.getBoxRect().left / HVDocsActivity.this.camViewWidth));
                    height = (int) (((int) (bitmap.getHeight() * (HVDocsActivity.this.getTopYOfBox() / HVDocsActivity.this.camViewHeight))) - width);
                    if (height < 0) {
                        height = 0;
                    }
                    height2 = (int) ((((int) (bitmap.getHeight() * (HVDocsActivity.this.getBottomYOfBox() / HVDocsActivity.this.camViewHeight))) - height) + width);
                    int width3 = ((int) (bitmap.getWidth() * (HVDocsActivity.this.getBoxRect().right / HVDocsActivity.this.camViewWidth))) - width2;
                    if (height2 > bitmap.getHeight()) {
                        height2 = bitmap.getHeight();
                    }
                    if (height + height2 > bitmap.getHeight()) {
                        height = (int) (bitmap.getHeight() * (HVDocsActivity.this.getTopYOfBox() / HVDocsActivity.this.camViewHeight));
                        height2 = ((int) (bitmap.getHeight() * (HVDocsActivity.this.getBottomYOfBox() / HVDocsActivity.this.camViewHeight))) - height;
                        HVDocsActivity.this.getDocConfig().setShouldAddPadding(false);
                    }
                    return Bitmap.createBitmap(bitmap, width2, height, width3, height2);
                }
                width = 0.0d;
                HVDocsActivity.this.padding = width;
                int width22 = (int) (bitmap.getWidth() * (HVDocsActivity.this.getBoxRect().left / HVDocsActivity.this.camViewWidth));
                height = (int) (((int) (bitmap.getHeight() * (HVDocsActivity.this.getTopYOfBox() / HVDocsActivity.this.camViewHeight))) - width);
                if (height < 0) {
                }
                height2 = (int) ((((int) (bitmap.getHeight() * (HVDocsActivity.this.getBottomYOfBox() / HVDocsActivity.this.camViewHeight))) - height) + width);
                int width32 = ((int) (bitmap.getWidth() * (HVDocsActivity.this.getBoxRect().right / HVDocsActivity.this.camViewWidth))) - width22;
                if (height2 > bitmap.getHeight()) {
                }
                if (height + height2 > bitmap.getHeight()) {
                }
                return Bitmap.createBitmap(bitmap, width22, height, width32, height2);
            } catch (Exception e10) {
                e = e10;
                Log.e(HVDocsActivity.TAG, Utils.getErrorMessage(e));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    return null;
                }
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
                return null;
            } catch (OutOfMemoryError e11) {
                e = e11;
                Log.e(HVDocsActivity.TAG, Utils.getErrorMessage(e));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            Bitmap rotateBitmap;
            int orientation = Exif.getOrientation(this.data);
            try {
                byte[] bArr = this.data;
                rotateBitmap = FileHelper.rotateBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), Utils.checkForOrientationCorrection(orientation));
            } catch (Exception | OutOfMemoryError e10) {
                Log.e(HVDocsActivity.TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
            if (rotateBitmap == null) {
                return null;
            }
            Bitmap cropBitmap = cropBitmap(rotateBitmap);
            HVDocsActivity.this.fullHRImageFile = new File(HVDocsActivity.this.capturedHighResolutionFullImagePath);
            FileOutputStream fileOutputStream = new FileOutputStream(HVDocsActivity.this.fullHRImageFile);
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            cropBitmap.compress(compressFormat, Utils.JPEG_COMPRESSION_QUALITY, fileOutputStream);
            fileOutputStream.close();
            if (HVDocsActivity.this.getDocConfig().isShouldReadNIDQR()) {
                Bitmap cropQR = Utils.cropQR(cropBitmap);
                HVDocsActivity.this.qrCroppedFile = new File(HVDocsActivity.this.capturedHighResolutionQRCroppedImagePath);
                try {
                    if (cropQR == null) {
                        return null;
                    }
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(HVDocsActivity.this.qrCroppedFile);
                        try {
                            cropQR.compress(compressFormat, Utils.JPEG_COMPRESSION_QUALITY, fileOutputStream2);
                            fileOutputStream2.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Exception e11) {
                        Log.e(HVDocsActivity.TAG, Utils.getErrorMessage(e11));
                    }
                } finally {
                    cropQR.recycle();
                }
            }
            this.mBitmap = Utils.resizeBitmap(cropBitmap);
            cropBitmap.recycle();
            if (this.mBitmap == null) {
                return null;
            }
            HVDocsActivity.this.compressedFile = new File(HVDocsActivity.this.capturedImagePath);
            FileOutputStream fileOutputStream3 = new FileOutputStream(HVDocsActivity.this.compressedFile);
            this.mBitmap.compress(Bitmap.CompressFormat.JPEG, Utils.JPEG_COMPRESSION_QUALITY, fileOutputStream3);
            fileOutputStream3.close();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void r42) {
            this.listener.onImageSave(HVDocsActivity.this.capturedImagePath, this.mBitmap);
            super.onPostExecute((SaveBitmapTask) r42);
        }
    }

    public HVDocsActivity() {
        Class cls = Float.TYPE;
        this.gravity = (float[][]) Array.newInstance((Class<?>) cls, 1, 1);
        this.magnetic = (float[][]) Array.newInstance((Class<?>) cls, 1, 1);
        this.accels = new float[][]{new float[3]};
        this.mags = new float[][]{new float[3]};
        this.values = new float[3];
        this.azimuth = new float[1];
        this.pitch = new float[1];
        this.roll = new float[1];
        this.docPickerScreenLoadSuccessTimingUtils = new TimingUtils();
        this.docPickerUploadButtonClickTimingUtils = new TimingUtils();
        this.docPickerCaptureButtonClickTimingUtils = new TimingUtils();
        this.screenLoadSuccessTimingUtils = new TimingUtils();
        this.imageCaptureTimingUtils = new TimingUtils();
        this.permissionTimingUtils = new TimingUtils();
        this.captureClickTimingUtils = new TimingUtils();
        this.hvBarcodeDetector = new HVBarcodeDetector();
        this.delayHandler = new Handler();
        this.BOX_PORTHOLE_PADDING_PERCENT = 0.03f;
        this.useFrontFacingCam = false;
        this.shouldAllowActivityClose = true;
        this.hvResponse = new HVResponse();
        this.hvResponses = new ArrayList<>();
        this.minimumDocXFramePercentage = 55.0f;
        this.minimumDocYFramePercentage = 50.0f;
        this.maximumDocFrameXPercentage = 100.0f;
        this.maximumDocFrameYPercentage = 90.0f;
        this.flashAnimationListener = new Animation.AnimationListener() { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                HVDocsActivity.this.vFlash.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                HVDocsActivity.this.vFlash.setVisibility(0);
            }
        };
        this.isPhoneTilted = false;
        this.permissionManager = new PermissionManager();
        this.hasDelayFinished = false;
        this.qrCodeValue = BuildConfig.FLAVOR;
        this.detectedBarcode = BuildConfig.FLAVOR;
        this.isBarcodeDetected = false;
        this.safeToTakePicture = true;
        this.isAutoCapturing = false;
        this.isCardDetectionInProgress = false;
        this.isAutoCaptureTimerRunning = false;
        this.isCardDetectedInAutoCapturedImage = true;
        this.hvCardUIState = HVCardUIState.CARD_NOT_DETECTED;
        this.autoCaptureTimerNumber = 3;
        this.isStillAutoCaptureInitialState = true;
        this.numberOfRechecks = 0;
        this.isViewsInitialised = false;
        this.isCheckingCamera = false;
        this.CAMERA_CHECK_DELAY = 20;
        this.lastSensorEventProcessedTimeMs = -1L;
        this.camHost = new AnonymousClass2();
    }

    static /* synthetic */ int access$4610(HVDocsActivity hVDocsActivity) {
        int i10 = hVDocsActivity.autoCaptureTimerNumber;
        hVDocsActivity.autoCaptureTimerNumber = i10 - 1;
        return i10;
    }

    private void addCrossHairView(FrameLayout frameLayout) {
        CrossHairView crossHairView = new CrossHairView(this);
        this.crossHairView = crossHairView;
        frameLayout.removeView(crossHairView);
        frameLayout.addView(this.crossHairView, -1);
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: co.hyperverge.hypersnapsdk.activities.b0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$addCrossHairView$17;
                lambda$addCrossHairView$17 = HVDocsActivity.this.lambda$addCrossHairView$17(view, motionEvent);
                return lambda$addCrossHairView$17;
            }
        });
    }

    private void addDocumentCaptureView(FrameLayout frameLayout) {
        RectPortHoleView rectPortHoleView = new RectPortHoleView(this);
        this.documentCaptureView = rectPortHoleView;
        frameLayout.removeView(rectPortHoleView);
        frameLayout.addView(this.documentCaptureView, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adjustCrossHairView() {
        if (this.crossHairView.getParent() != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.crossHairView.getLayoutParams();
            layoutParams.height = this.camViewHeight;
            layoutParams.width = this.camViewWidth;
            HVMagicView hVMagicView = this.cameraView;
            if (hVMagicView != null) {
                this.crossHairView.setX(hVMagicView.getX());
                this.crossHairView.setY(this.cameraView.getY());
            }
            if (!this.crossHairView.isInLayout()) {
                this.crossHairView.requestLayout();
            }
        }
        if (this.cameraContainer.isInLayout()) {
            return;
        }
        this.cameraContainer.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adjustDocumentCaptureView() {
        if (this.documentCaptureView.getParent() != null) {
            RectF boxRect = getBoxRect();
            int width = (int) boxRect.width();
            int height = (int) boxRect.height();
            int topYOfBox = getTopYOfBox();
            this.documentCaptureView.setX(0);
            this.documentCaptureView.setY(topYOfBox);
            RectPortHoleView rectPortHoleView = this.documentCaptureView;
            float f10 = boxRect.left;
            rectPortHoleView.setBoxRect(new RectF((int) f10, 0.0f, width + ((int) f10), height), 0.02f);
            if (shouldUseDocDetect() && !this.isReadBarcodeTimerRunning) {
                this.documentCaptureView.setStrokeWidth(10);
                this.documentCaptureView.setBorderColor(getResources().getColor(R.color.doc_capture_circle_failure));
            }
            if (!this.documentCaptureView.isInLayout()) {
                this.documentCaptureView.requestLayout();
            }
        }
        if (this.cameraContainer.isInLayout()) {
            return;
        }
        this.cameraContainer.requestLayout();
    }

    private void adjustTopBar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adjustView(boolean z10) {
        final FrameLayout frameLayout = (FrameLayout) findViewById(R.id.overlay1);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.overlay2);
        int topYOfBox = getTopYOfBox();
        getBottomYOfBox();
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.height = topYOfBox;
            frameLayout.setLayoutParams(layoutParams);
        }
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams2.setMargins(0, getBottomYOfBox(), 0, 0);
            frameLayout2.setLayoutParams(layoutParams2);
        }
        if (z10) {
            relayoutChildren(findViewById(R.id.mainLayout));
            String backgroundImage = HyperSnapUIConfigUtil.getInstance().getConfig().getBackgroundImage();
            if (StringUtils.isEmptyOrNull(backgroundImage)) {
                return;
            }
            PicassoManager.getInstance(this).getBitmap(backgroundImage, new PicassoManager.ImageDownloaderCallback() { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.13
                @Override // co.hyperverge.hypersnapsdk.utils.PicassoManager.ImageDownloaderCallback
                public void onError(String str) {
                }

                @Override // co.hyperverge.hypersnapsdk.utils.PicassoManager.ImageDownloaderCallback
                public void onSuccess(Bitmap bitmap) {
                    if (bitmap != null) {
                        HVDocsActivity hVDocsActivity = HVDocsActivity.this;
                        hVDocsActivity.croppedBitmap = UIUtils.cropImageFromView(bitmap, hVDocsActivity.findViewById(R.id.cameraContainer));
                        FrameLayout frameLayout3 = frameLayout;
                        if (frameLayout3 != null) {
                            frameLayout3.setBackground(new BitmapDrawable(HVDocsActivity.this.getResources(), HVDocsActivity.this.croppedBitmap));
                        }
                        HVDocsActivity hVDocsActivity2 = HVDocsActivity.this;
                        hVDocsActivity2.documentCaptureView.setBackgroundImage(hVDocsActivity2.croppedBitmap);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelAutoCaptureTimer() {
        this.autoCaptureTimerNumber = 3;
        this.isAutoCapturing = false;
        CountDownTimer countDownTimer = this.autoCaptureTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.isAutoCaptureTimerRunning = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCPRSession(final String str, final String str2) {
        HVLogUtils.d(TAG, "checkCPRSession() called with: filePath = [" + str + "], capturedHighResolutionQRCroppedImagePath = [" + str2 + "]");
        if (this.docConfig.getCPRCheckSessionHeaders() == null) {
            makeOCRAPICall(str, str2);
        } else {
            DataRepository.getInstance().checkCPRSession(this, this.docConfig.getCPRCheckSessionHeaders(), new JSONObject(), new APICompletionCallback() { // from class: co.hyperverge.hypersnapsdk.activities.a0
                @Override // co.hyperverge.hypersnapsdk.listeners.APICompletionCallback
                public final void onResult(HVError hVError, HVResponse hVResponse) {
                    HVDocsActivity.this.lambda$checkCPRSession$22(str, str2, hVError, hVResponse);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkCameraAndHandleCompletion, reason: merged with bridge method [inline-methods] */
    public void lambda$checkCameraAndHandleCompletion$6(final HVError hVError, final HVResponse hVResponse) {
        String str = TAG;
        HVLogUtils.d(str, "checkCameraAndHandleCompletion() called with: error = [" + hVError + "], hvResponse = [" + hVResponse + "]");
        if (this.isCheckingCamera) {
            HVLogUtils.d("checkCameraAndHandleCompletion", "already checking");
            return;
        }
        if (!CameraEngine.isCameraReleased()) {
            HVLogUtils.d(str, "checkCameraAndHandleCompletion: camera is not released");
            new Handler().postDelayed(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.c0
                @Override // java.lang.Runnable
                public final void run() {
                    HVDocsActivity.this.lambda$checkCameraAndHandleCompletion$6(hVError, hVResponse);
                }
            }, 20L);
            return;
        }
        HVLogUtils.d(str, "checkCameraAndHandleCompletion: camera is released");
        this.isCheckingCamera = true;
        callCompletionHandler(hVError, hVResponse);
        DocOCRHelper.destroy();
        LocationServiceImpl.destroy();
        this.mLocation = null;
        HVMagicView hVMagicView = this.cameraView;
        if (hVMagicView != null) {
            hVMagicView.clearHandlers();
            this.cameraView = null;
        }
        finish();
    }

    private void decideWhatToShow(boolean z10) {
        boolean z11 = true;
        if (z10) {
            this.showInstructionPage = !this.isDocCaptureFlow;
        } else {
            if ((!getDocConfig().isShouldShowInstructionPage() || this.isDocCaptureFlow) && (!getDocConfig().isDocumentUploadEnabled() || this.isDocCaptureFlow)) {
                z11 = false;
            }
            this.showInstructionPage = z11;
        }
        if (this.showInstructionPage) {
            showDocInstructions();
        } else {
            startDocCapture();
        }
    }

    private void displayProgressView(final String str) {
        Log.d(TAG, "displayProgressView() called with: progressLoaderText = [" + str + "]");
        runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.V
            @Override // java.lang.Runnable
            public final void run() {
                HVDocsActivity.this.lambda$displayProgressView$18(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enableCaptureButton() {
        if (getDocConfig().isShouldReadBarcode()) {
            setCaptureButtonState(true, true);
        } else if (!getDocConfig().isShouldReadNIDQR() || this.hasDelayFinished) {
            setCaptureButtonState(true, true);
        } else {
            this.delayHandler.postDelayed(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.d0
                @Override // java.lang.Runnable
                public final void run() {
                    HVDocsActivity.this.lambda$enableCaptureButton$16();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flashScreen() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.6f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new DecelerateInterpolator(2.0f));
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(this.flashAnimationListener);
        this.vFlash.startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomYOfBox() {
        return (int) getBoxRect().bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getBoxRect() {
        int i10;
        int i11;
        float aspectRatio = this.document.getAspectRatio();
        int width = this.cameraContainer.getWidth();
        int min = Math.min(this.camViewHeight, this.cameraContainer.getHeight());
        if (aspectRatio <= 1.0f) {
            i11 = (int) (aspectRatio * width);
            i10 = width;
        } else {
            i10 = (int) (min / aspectRatio);
            i11 = min;
        }
        return new RectF((width - i10) / 2, (min - i11) / 2, (width + i10) / 2, (min + i11) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HVDocConfig getDocConfig() {
        HVDocConfig hVDocConfig = this.docConfig;
        if (hVDocConfig != null) {
            return hVDocConfig;
        }
        finishView(new HVError(2, getResources().getString(R.string.document_config_error)), null);
        return new HVDocConfig();
    }

    private void getLocation(final Context context) {
        if (!LocationServiceImpl.getInstance(this).isGPSSwitchedOn()) {
            showLocationSettingsDialog();
        } else {
            LocationServiceImpl.getInstance(context).startLocationUpdates();
            LocationServiceImpl.getInstance(context).addLocationCallback(new LocationProviderCallback() { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.3
                @Override // co.hyperverge.hypersnapsdk.listeners.LocationProviderCallback
                public void onResult(Location location) {
                    if (location != null) {
                        HVDocsActivity.this.mLocation = location;
                        HVDocsActivity.this.enableCaptureButton();
                    } else {
                        HVDocsActivity.this.mLocation = LocationServiceImpl.getInstance(context).getLastKnownLocation();
                        if (HVDocsActivity.this.mLocation != null) {
                            HVDocsActivity.this.enableCaptureButton();
                        }
                    }
                    Log.d(HVDocsActivity.TAG, "onResult: mLocation: " + location);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getStringFromResources(int i10) {
        return getResources().getString(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopYOfBox() {
        return (int) getBoxRect().top;
    }

    private String getTransactionId() {
        return (getDocConfig().getOcrHeaders() == null || !getDocConfig().getOcrHeaders().has("transactionId")) ? SPHelper.getTransactionID() : getDocConfig().getOcrHeaders().getString("transactionId");
    }

    private String[] getUploadMimeTypes() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        hashMap.put("jpg", "image/jpg");
        hashMap.put("jpeg", "image/jpeg");
        hashMap.put("png", "image/png");
        hashMap.put("pdf", "application/pdf");
        List<String> uploadFileTypes = getDocConfig().getUploadFileTypes();
        if (uploadFileTypes == null || uploadFileTypes.isEmpty()) {
            uploadFileTypes = Arrays.asList("jpg", "jpeg", "png");
        }
        for (String str : hashMap.keySet()) {
            if (uploadFileTypes.contains(str)) {
                arrayList.add((String) hashMap.get(str));
            }
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    private boolean initDocumentDetector(Context context) {
        try {
            return HVTfliteHelper.getInstance().initialiseDetector(context);
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            return false;
        } catch (NoClassDefFoundError e11) {
            Log.e(TAG, Utils.getErrorMessage(e11));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            }
            callCompletionHandler(new HVError(36, getStringFromResources(R.string.hyper_doc_detect_error)), null);
            finish();
            return false;
        }
    }

    private void initializeHVBarcodeDetector() {
        try {
            this.hvBarcodeDetector.initialiseHVBarcodeDetector(getApplicationContext(), 6416);
        } catch (NoClassDefFoundError unused) {
            Log.e(TAG, "gms vision excluded");
        }
    }

    private void initializeTiltSensor() {
        try {
            this.sensorManager = (SensorManager) getSystemService("sensor");
            this.mySensorEventListener = new SensorEventListener() { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.4
                @Override // android.hardware.SensorEventListener
                public void onAccuracyChanged(Sensor sensor, int i10) {
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x00e0 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:2:0x0000, B:6:0x002e, B:8:0x0036, B:10:0x003c, B:12:0x0095, B:14:0x00be, B:19:0x00ca, B:26:0x00da, B:28:0x00e0, B:30:0x00e4, B:31:0x00eb, B:35:0x00e8, B:43:0x000e, B:44:0x0020), top: B:1:0x0000 }] */
                /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
                @Override // android.hardware.SensorEventListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onSensorChanged(SensorEvent sensorEvent) {
                    boolean z10;
                    HVDocsActivity hVDocsActivity;
                    try {
                        int type = sensorEvent.sensor.getType();
                        if (type == 1) {
                            HVDocsActivity.this.accels[0] = (float[]) sensorEvent.values.clone();
                        } else if (type == 2) {
                            HVDocsActivity.this.mags[0] = (float[]) sensorEvent.values.clone();
                        }
                        HVDocsActivity hVDocsActivity2 = HVDocsActivity.this;
                        float[][] fArr = hVDocsActivity2.mags;
                        if (fArr[0] == null) {
                            return;
                        }
                        float[][] fArr2 = hVDocsActivity2.accels;
                        if (fArr2[0] == null) {
                            return;
                        }
                        float[][] fArr3 = hVDocsActivity2.gravity;
                        fArr3[0] = new float[9];
                        float[] fArr4 = new float[9];
                        hVDocsActivity2.magnetic[0] = fArr4;
                        SensorManager.getRotationMatrix(fArr3[0], fArr4, fArr2[0], fArr[0]);
                        HVDocsActivity hVDocsActivity3 = HVDocsActivity.this;
                        SensorManager.getOrientation(hVDocsActivity3.gravity[0], hVDocsActivity3.values);
                        HVDocsActivity hVDocsActivity4 = HVDocsActivity.this;
                        float[] fArr5 = hVDocsActivity4.azimuth;
                        float[] fArr6 = hVDocsActivity4.values;
                        fArr5[0] = fArr6[0] * 57.29578f;
                        hVDocsActivity4.pitch[0] = fArr6[1] * 57.29578f;
                        hVDocsActivity4.roll[0] = fArr6[2] * 57.29578f;
                        hVDocsActivity4.mags[0] = null;
                        hVDocsActivity4.accels[0] = null;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - HVDocsActivity.this.lastSensorEventProcessedTimeMs < HVDocsActivity.SENSOR_EVENT_PROCESSING_MIN_INTERVAL_MS) {
                            return;
                        }
                        HVDocsActivity.this.lastSensorEventProcessedTimeMs = elapsedRealtime;
                        HVDocsActivity hVDocsActivity5 = HVDocsActivity.this;
                        float f10 = hVDocsActivity5.pitch[0];
                        float f11 = hVDocsActivity5.roll[0];
                        float allowedTiltPitch = hVDocsActivity5.getDocConfig().getAllowedTiltPitch();
                        float allowedTiltRoll = HVDocsActivity.this.getDocConfig().getAllowedTiltRoll();
                        boolean z11 = f10 < allowedTiltPitch && f10 > allowedTiltPitch * (-1.0f);
                        boolean z12 = f11 < allowedTiltRoll && f11 > allowedTiltRoll * (-1.0f);
                        if (z11 && z12) {
                            z10 = false;
                            hVDocsActivity = HVDocsActivity.this;
                            if (hVDocsActivity.isPhoneTilted == z10) {
                                hVDocsActivity.isPhoneTilted = z10;
                                if (z10) {
                                    hVDocsActivity.setCaptureButtonState(true, false);
                                } else {
                                    hVDocsActivity.enableCaptureButton();
                                }
                                HVDocsActivity.this.setDescText();
                                return;
                            }
                            return;
                        }
                        z10 = true;
                        hVDocsActivity = HVDocsActivity.this;
                        if (hVDocsActivity.isPhoneTilted == z10) {
                        }
                    } catch (Exception e10) {
                        Log.e(HVDocsActivity.TAG, Utils.getErrorMessage(e10));
                        if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                        }
                    }
                }
            };
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    private boolean is4By3Device() {
        return ((double) this.dpHeight) <= (((double) this.dpWidth) * 4.0d) / 3.0d;
    }

    private boolean isSelectedFileExtentionInAllowedList(String str) {
        for (String str2 : getUploadMimeTypes()) {
            if (str2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$addCrossHairView$17(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.lastTouchX = motionEvent.getX();
            this.lastTouchY = motionEvent.getY();
        } else if (actionMasked == 1 && Math.abs(motionEvent.getX() - this.lastTouchX) < 20.0f && Math.abs(motionEvent.getY() - this.lastTouchY) < 20.0f) {
            this.crossHairView.showCrosshair(motionEvent.getX(), motionEvent.getY(), false);
            HVMagicView hVMagicView = this.cameraView;
            if (hVMagicView != null) {
                hVMagicView.onTouchToFocus(motionEvent.getX() / this.camViewWidth, motionEvent.getY() / this.camViewHeight, null);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkCPRSession$22(String str, String str2, HVError hVError, HVResponse hVResponse) {
        if (hVError == null) {
            makeOCRAPICall(str, str2);
            return;
        }
        HVLogUtils.e(TAG, "checkCPRSession.onResult() failed with error: " + hVError.getErrorMessage());
        finishView(hVError, hVResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$displayProgressView$18(String str) {
        View view = this.blackOverlay;
        if (view != null) {
            view.setVisibility(0);
        }
        if (str != null) {
            this.progressDialogTextView.setText(str);
        }
        ImageView imageView = this.progressSpinnerImageView;
        if (imageView != null) {
            imageView.setAnimation(UIUtils.getInfiniteRotationAnimation());
        }
        View view2 = this.progressDialogView;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        showOverlayImageView(false);
        TextView textView = this.instructionsInsideCameraPreviewBox;
        if (textView != null) {
            textView.setVisibility(4);
        }
        TextView textView2 = this.hintText;
        if (textView2 != null) {
            textView2.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableCaptureButton$16() {
        this.hasDelayFinished = true;
        setCaptureButtonState(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$makeOCRAPICall$23() {
        TextView textView = this.instructionsOutsideCameraPreviewBox;
        if (textView != null) {
            textView.setVisibility(0);
            this.instructionsOutsideCameraPreviewBox.setText(TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_LOADER_TITLE, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_LOADER_TITLE, getStringFromResources(R.string.hv_doc_loader_title)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$makeOCRAPICall$24(final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2, final HVError hVError) {
        showNetworkRetryBS(new NetworkRetryDialogCallback() { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.14
            @Override // co.hyperverge.hypersnapsdk.listeners.NetworkRetryDialogCallback
            public void onActionClick() {
                HVLogUtils.d(HVDocsActivity.TAG, "NetworkRetryDialog: Retry clicked");
                HVDocsActivity.this.makeOCRAPICall(str, str2);
            }

            @Override // co.hyperverge.hypersnapsdk.listeners.NetworkRetryDialogCallback
            public void onCancel() {
                HVLogUtils.d(HVDocsActivity.TAG, "NetworkRetryDialog: Cancel clicked");
                HVDocsActivity.this.setHVResponse(jSONObject, str, jSONObject2);
                HVDocsActivity hVDocsActivity = HVDocsActivity.this;
                hVDocsActivity.finishView(hVError, hVDocsActivity.hvResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$makeOCRAPICall$25() {
        this.docLoaderLayout.setVisibility(8);
        this.docInstructionsLayout.setVisibility(8);
        HVLottieHelper.reset(this.lav);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$makeOCRAPICall$26(String str, String str2, boolean z10, JSONObject jSONObject, String str3, JSONObject jSONObject2, HVError hVError) {
        showProgressDialog(false, null);
        this.shouldAllowActivityClose = true;
        this.retryAction = str;
        this.retakeMessage = str2;
        if (!z10) {
            stopCamera();
            setHVResponse(jSONObject2, str3, jSONObject);
            finishView(hVError, this.hvResponse);
            return;
        }
        if (this.hvResponse.getRetakeAttemptResponses() == null) {
            this.hvResponse.setRetakeAttemptResponses(this.hvResponses);
        }
        HVBaseResponse hVBaseResponse = new HVBaseResponse();
        hVBaseResponse.setAction(this.retryAction);
        hVBaseResponse.setApiHeaders(jSONObject);
        hVBaseResponse.setImageURI(str3);
        hVBaseResponse.setApiResult(addResultImageUri(jSONObject2, str3));
        hVBaseResponse.setRetakeMessage(this.retakeMessage);
        hVBaseResponse.setAttemptsCount(SPHelper.getAttemptsCountForImage(getDocConfig().ocrEndpoint, getDocConfig().getSuffixModuleId()));
        this.hvResponses.add(hVBaseResponse);
        startRetakeScreen(str3, str2);
        this.uiThread.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.h0
            @Override // java.lang.Runnable
            public final void run() {
                HVDocsActivity.this.lambda$makeOCRAPICall$25();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$makeOCRAPICall$27(final String str, final String str2, final boolean z10, final String str3, final String str4, final JSONObject jSONObject, final JSONObject jSONObject2, final HVError hVError) {
        if (hVError != null && hVError.getErrorCode() == 12 && getDocConfig().isShouldShowNetworkRetryDialog()) {
            runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.e0
                @Override // java.lang.Runnable
                public final void run() {
                    HVDocsActivity.this.lambda$makeOCRAPICall$24(str, str2, jSONObject, jSONObject2, hVError);
                }
            });
        } else {
            runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.f0
                @Override // java.lang.Runnable
                public final void run() {
                    HVDocsActivity.this.lambda$makeOCRAPICall$26(str4, str3, z10, jSONObject2, str, jSONObject, hVError);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityResult$21(boolean z10, Uri uri, File file) {
        this.lavDocInstructions.setVisibility(0);
        this.lavDocInstructionsProcessing.setVisibility(8);
        if (file == null || !file.exists()) {
            startRetakeScreen(null, TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_UPLOAD_READ_FILE_ERROR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_UPLOAD_READ_FILE_ERROR, getStringFromResources(R.string.docUploadReadFileError)).toString());
            return;
        }
        String path = file.getPath();
        JSONObject jSONObject = new JSONObject();
        String fileExtension = Utils.getFileExtension(z10, getContentResolver(), uri);
        HVLogUtils.d(TAG, "onActivityResult: extension - " + fileExtension);
        if (fileExtension == null) {
            startRetakeScreen(path, TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_UPLOAD_READ_FILE_ERROR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_UPLOAD_READ_FILE_ERROR, getStringFromResources(R.string.docUploadReadFileError)).toString());
            return;
        }
        if (fileExtension.equals("pdf")) {
            try {
                PDFUtils.checkIfPDFIsReadable(uri, getContentResolver());
            } catch (Exception e10) {
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (e10 instanceof SecurityException) {
                    startRetakeScreen(path, TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_UPLOAD_PASSWORD_PROTECTED_ERROR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_UPLOAD_PASSWORD_PROTECTED_ERROR, getStringFromResources(R.string.docUploadPasswordProtectedError)).toString());
                    return;
                } else {
                    startRetakeScreen(path, TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_UPLOAD_READ_FILE_ERROR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_UPLOAD_READ_FILE_ERROR, getStringFromResources(R.string.docUploadReadFileError)).toString());
                    return;
                }
            }
        } else {
            try {
                ExifHelper exifHelper = new ExifHelper();
                exifHelper.readExifFromFile(file, this.mLocation);
                if (getDocConfig().isShouldExportPDF()) {
                    String convertImageToPDF = ImageToPDFConverter.convertImageToPDF(BitmapFactory.decodeFile(path), this.folder.getPath() + "/hv_" + System.currentTimeMillis() + ".pdf");
                    this.pdfPath = convertImageToPDF;
                    jSONObject.put("pdfUri", convertImageToPDF);
                }
                exifHelper.writeExifData(path, getTransactionId(), this.ipAddress);
            } catch (Exception e11) {
                Log.e(TAG, Utils.getErrorMessage(e11));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
                }
            }
        }
        startReviewScreen(path, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRemoteConfigFetchDone$8() {
        findViewById(R.id.parent_container).setBackground(null);
        LottieAnimationView lottieAnimationView = this.lavLoader;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        findViewById(R.id.mainLayout).setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readyToStartDocCapture$7() {
        this.lavLoader = (LottieAnimationView) findViewById(R.id.lavLoader);
        HyperSnapUIConfigUtil.getInstance().customiseBackgroundImage(findViewById(R.id.parent_container));
        HyperSnapUIConfigUtil.getInstance().customiseBackgroundImage(findViewById(R.id.mainLayout));
        HyperSnapUIConfigUtil.getInstance().customiseBrandingColor((TextView) findViewById(R.id.tvBranding));
        findViewById(R.id.mainLayout).setVisibility(8);
        LottieAnimationView lottieAnimationView = this.lavLoader;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
            if (!this.lavLoader.isInLayout()) {
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.parent_container);
                relativeLayout.removeView(this.lavLoader);
                relativeLayout.addView(this.lavLoader);
            }
            HVLottieHelper.load(this.lavLoader, HVLottieHelper.LOADER_LOTTIE, HVLottieHelper.State.START, null);
        }
        lambda$checkAndWaitForRemoteConfig$1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeProgressView$19() {
        TextView textView;
        View view = this.blackOverlay;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.progressSpinnerImageView;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        if (shouldUseDocDetect() && (textView = this.instructionsOutsideCameraPreviewBox) != null) {
            textView.setText(TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_DOC_NOT_FOUND, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_DOC_NOT_FOUND, getStringFromResources(R.string.docCaptureDocNotFound)));
        }
        View view2 = this.progressDialogView;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TextView textView2 = this.hintText;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAutoCaptureUI$10() {
        TextView textView = this.instructionsInsideCameraPreviewBox;
        if (textView != null) {
            textView.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAutoCaptureUI$11() {
        TextView textView = this.instructionsOutsideCameraPreviewBox;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAutoCaptureUI$12() {
        showOverlayImageView(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAutoCaptureUI$13() {
        TextView textView = this.instructionsInsideCameraPreviewBox;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAutoCaptureUI$14() {
        TextView textView = this.hintText;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAutoCaptureUI$15() {
        showOverlayImageView(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAutoCaptureUI$9() {
        TextView textView = this.instructionsOutsideCameraPreviewBox;
        if (textView != null) {
            textView.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCaptureButtonState$28(boolean z10, boolean z11) {
        if (z10) {
            this.btCapture.setVisibility(0);
        } else {
            this.btCapture.setVisibility(4);
        }
        if (z11) {
            this.btCapture.setImageResource(R.drawable.ic_camera_button_svg);
            this.btCapture.setClickable(true);
            this.btCapture.setEnabled(true);
            HyperSnapUIConfigUtil.getInstance().customiseCaptureButton(this.btCapture);
            return;
        }
        this.btCapture.setImageResource(R.drawable.hv_camera_button_disabled);
        this.btCapture.setClickable(false);
        this.btCapture.setEnabled(false);
        HyperSnapUIConfigUtil.getInstance().customiseCaptureButton(this.btCapture);
        androidx.core.widget.g.c(this.btCapture, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showBarcodeScannedSuccessfulOverlay$20(boolean z10) {
        if (z10) {
            if (this.indicator != null) {
                removeScanningIndicator();
            }
            View view = this.blackOverlay;
            if (view != null) {
                view.setVisibility(0);
            }
            ImageView imageView = this.hvGreenTickImageView;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            TextView textView = this.instructionsOutsideCameraPreviewBox;
            if (textView != null) {
                textView.setText(TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_BARCODE_SCANNED, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_BARCODE_SCANNED, getStringFromResources(R.string.docCaptureBarcodeScanned)));
            }
            showOverlayImageView(false);
            TextView textView2 = this.instructionsInsideCameraPreviewBox;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            TextView textView3 = this.hintText;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
            if (getDocConfig().isShouldAutoCapture() || getDocConfig().isShouldPerformAssistiveCapture()) {
                return;
            }
            updateInstructionsVisibility();
            return;
        }
        if (this.indicator != null) {
            removeScanningIndicator();
        }
        View view2 = this.blackOverlay;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        ImageView imageView2 = this.hvGreenTickImageView;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        TextView textView4 = this.instructionsOutsideCameraPreviewBox;
        if (textView4 != null) {
            textView4.setText(TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_TITLE, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_TITLE, getStringFromResources(R.string.docCaptureTitle)));
        }
        if (this.overlayImageView != null) {
            if (getDocConfig().getDocumentCaptureOverlay() != null) {
                this.overlayImageView.setImageBitmap(getDocConfig().getDocumentCaptureOverlay());
            } else {
                this.overlayImageView.setImageResource(R.drawable.hv_front_overlay);
            }
        }
        showOverlayImageView(true);
        runOverlayTimer();
        TextView textView5 = this.instructionsInsideCameraPreviewBox;
        if (textView5 != null) {
            textView5.setVisibility(4);
        }
        TextView textView6 = this.hintText;
        if (textView6 != null) {
            textView6.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDocInstructions$2(View view) {
        view.setEnabled(false);
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService(getApplicationContext()).logDocumentPickerScreenCloseClicked();
        }
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDocInstructions$3(View view) {
        performCloseAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDocInstructions$4(View view) {
        view.setEnabled(false);
        long longValue = this.docPickerUploadButtonClickTimingUtils.getTimeDifferenceLong().longValue();
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService(getApplicationContext()).logDocumentPickerScreenDocumentUploadButtonClicked(longValue);
        }
        this.lavDocInstructions.setVisibility(8);
        HVLottieHelper.load(this.lavDocInstructionsProcessing, HVLottieHelper.LOADER_LOTTIE, HVLottieHelper.State.START, null);
        this.lavDocInstructionsProcessing.setVisibility(0);
        startDocUpload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDocInstructions$5(View view) {
        view.setEnabled(false);
        long longValue = this.docPickerCaptureButtonClickTimingUtils.getTimeDifferenceLong().longValue();
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService(getApplicationContext()).logDocumentPickerScreenDocumentCaptureButtonClicked(longValue);
        }
        startDocCapture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLocationSettingsDialog$0(DialogInterface dialogInterface, int i10) {
        startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), LOCATION_SETTINGS_REQUEST_CODE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLocationSettingsDialog$1(Spanned spanned, DialogInterface dialogInterface, int i10) {
        String string = getString(R.string.hv_gps_access_denied_by_user);
        if (spanned != null) {
            string = spanned.toString();
        }
        callCompletionHandler(new HVError(33, string), null);
        finish();
    }

    private void loadAnimation() {
        String str = getDocConfig().getDocumentSide().equals(HVDocConfig.DocumentSide.FRONT) ? "hv_doc_instruction_front.lottie" : getDocConfig().getDocumentSide().equals(HVDocConfig.DocumentSide.BACK) ? HVLottieHelper.DOC_INSTRUCTION_BACK : BuildConfig.FLAVOR;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.docInstructionsLayout.findViewById(R.id.lavDocInstructions);
        this.lavDocInstructions = lottieAnimationView;
        HVLottieHelper.load(lottieAnimationView, str, HVLottieHelper.State.START, null);
        this.lavDocInstructionsProcessing = (LottieAnimationView) this.docInstructionsLayout.findViewById(R.id.lavDocInstructionsProcessing);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void popin() {
        ImageView imageView = this.btCapture;
        imageView.clearAnimation();
        imageView.clearAnimation();
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(150L);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setFillAfter(true);
        imageView.startAnimation(scaleAnimation);
        this.btCapture.startAnimation(scaleAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void popout() {
        ImageView imageView = this.btCapture;
        imageView.clearAnimation();
        this.btCapture.clearAnimation();
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(150L);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.12
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        this.btCapture.startAnimation(scaleAnimation);
        imageView.startAnimation(scaleAnimation);
    }

    private void reInitCaptureButton() {
        HVLogUtils.d(TAG, "reInitCaptureButton() called");
        if (getDocConfig().isShouldPerformAssistiveCapture()) {
            setCaptureButtonState(true, false);
        } else if (!getDocConfig().isShouldAutoCapture()) {
            setCaptureButtonState(true, true);
        }
        this.hasDelayFinished = false;
    }

    private void reInitTimingUtils() {
        try {
            this.docPickerScreenLoadSuccessTimingUtils.init();
            this.docPickerCaptureButtonClickTimingUtils.init();
            this.docPickerUploadButtonClickTimingUtils.init();
            this.screenLoadSuccessTimingUtils.init();
            this.imageCaptureTimingUtils.init();
            this.permissionTimingUtils.init();
            this.captureClickTimingUtils.init();
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
        }
    }

    private void readyToStartDocCapture() {
        HVLogUtils.d(TAG, "readyToStartDocCapture() called");
        runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.X
            @Override // java.lang.Runnable
            public final void run() {
                HVDocsActivity.this.lambda$readyToStartDocCapture$7();
            }
        });
    }

    private static void relayoutChildren(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private void removeProgressView() {
        Log.d(TAG, "removeProgressView() called");
        runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.P
            @Override // java.lang.Runnable
            public final void run() {
                HVDocsActivity.this.lambda$removeProgressView$19();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetAutoCaptureVariables() {
        this.autoCaptureTimerNumber = 3;
        this.isAutoCapturing = false;
        this.isCardDetectionInProgress = false;
        this.isStillAutoCaptureInitialState = true;
        if (shouldUseDocDetect() && this.isDocCaptureFlow) {
            setAutoCaptureInitialState();
        }
        CountDownTimer countDownTimer = this.autoCaptureTimer;
        if (countDownTimer == null || !this.isAutoCaptureTimerRunning) {
            return;
        }
        countDownTimer.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetReadBarcodeVariables() {
        this.isBarcodeDetected = false;
        if (getDocConfig().isShouldReadBarcode() && this.isDocCaptureFlow) {
            setReadBarcodeInitialState();
        }
    }

    private void runOverlayTimer() {
        if (getDocConfig().getDocumentCaptureOverlayDuration() != Integer.MAX_VALUE) {
            new CountDownTimer(getDocConfig().getDocumentCaptureOverlayDuration(), 1000L) { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.6
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    if (HVDocsActivity.this.overlayImageView != null) {
                        HVDocsActivity.this.overlayImageView.setVisibility(4);
                    }
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j10) {
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeTakePicture() {
        String str = TAG;
        Log.d(str, "safeTakePicture() called");
        if (this.cameraFree.get()) {
            this.safeToTakePicture = false;
            this.cameraFree.set(false);
            try {
                this.imageCaptureTimingUtils.init();
                if (this.cameraView != null) {
                    showProgressDialog(true, BuildConfig.FLAVOR);
                    Log.e(str, "safeTakePicture: Taking picture");
                    this.cameraView.takePicture(null);
                } else {
                    this.hvImageCaptureError = new HVError(2, "cameraView is null");
                    long longValue = this.imageCaptureTimingUtils.getTimeDifferenceLong().longValue();
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureFailed(this.hvImageCaptureError, getDocConfig(), longValue);
                    }
                }
            } catch (Exception e10) {
                Log.e(TAG, Utils.getErrorMessage(e10));
                this.hvImageCaptureError = new HVError(2, Utils.getErrorMessage(e10));
                long longValue2 = this.imageCaptureTimingUtils.getTimeDifferenceLong().longValue();
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureFailed(this.hvImageCaptureError, getDocConfig(), longValue2);
                }
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
    }

    private void setAutoCaptureInitialState() {
        try {
            TextView textView = this.instructionsOutsideCameraPreviewBox;
            if (textView != null) {
                textView.setVisibility(0);
            }
            showOverlayImageView(true);
            TextView textView2 = this.instructionsInsideCameraPreviewBox;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            TextView textView3 = this.hintText;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    private void setAutoCaptureUI(boolean z10, Spanned spanned) {
        if (z10) {
            if (getDocConfig().isShouldPerformAssistiveCapture()) {
                setCaptureButtonState(true, true);
            }
            this.documentCaptureView.setBorderColor(getResources().getColor(R.color.doc_capture_circle_success));
        } else {
            if (getDocConfig().isShouldPerformAssistiveCapture()) {
                setCaptureButtonState(true, false);
            }
            this.documentCaptureView.setBorderColor(getResources().getColor(R.color.doc_capture_circle_failure));
        }
        if (getDocConfig().isShouldPerformAssistiveCapture()) {
            try {
                TextView textView = this.instructionsInsideCameraPreviewBox;
                if (textView != null) {
                    textView.setVisibility(4);
                }
            } catch (Exception unused) {
                runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        HVDocsActivity.this.lambda$setAutoCaptureUI$10();
                    }
                });
            }
            TextView textView2 = this.instructionsOutsideCameraPreviewBox;
            if (textView2 != null) {
                textView2.setText(spanned);
            }
            try {
                TextView textView3 = this.instructionsOutsideCameraPreviewBox;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
            } catch (Exception unused2) {
                runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        HVDocsActivity.this.lambda$setAutoCaptureUI$11();
                    }
                });
            }
        } else {
            TextView textView4 = this.instructionsInsideCameraPreviewBox;
            if (textView4 != null) {
                textView4.setText(spanned);
            }
            try {
                TextView textView5 = this.instructionsOutsideCameraPreviewBox;
                if (textView5 != null) {
                    textView5.setVisibility(4);
                }
            } catch (Exception unused3) {
                runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        HVDocsActivity.this.lambda$setAutoCaptureUI$9();
                    }
                });
            }
        }
        try {
            showOverlayImageView(false);
        } catch (Exception unused4) {
            runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.J
                @Override // java.lang.Runnable
                public final void run() {
                    HVDocsActivity.this.lambda$setAutoCaptureUI$12();
                }
            });
        }
        if (!getDocConfig().isShouldPerformAssistiveCapture()) {
            try {
                TextView textView6 = this.instructionsInsideCameraPreviewBox;
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
            } catch (Exception unused5) {
                runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        HVDocsActivity.this.lambda$setAutoCaptureUI$13();
                    }
                });
            }
            try {
                TextView textView7 = this.hintText;
                if (textView7 != null) {
                    textView7.setVisibility(0);
                }
            } catch (Exception unused6) {
                runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        HVDocsActivity.this.lambda$setAutoCaptureUI$14();
                    }
                });
            }
        }
        try {
            showOverlayImageView(false);
        } catch (Exception unused7) {
            runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.M
                @Override // java.lang.Runnable
                public final void run() {
                    HVDocsActivity.this.lambda$setAutoCaptureUI$15();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCaptureButtonState(final boolean z10, final boolean z11) {
        if (this.btCapture == null) {
            HVLogUtils.d(TAG, "setCaptureButtonState() returning since btCapture is null");
        } else {
            runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.Y
                @Override // java.lang.Runnable
                public final void run() {
                    HVDocsActivity.this.lambda$setCaptureButtonState$28(z10, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHVCardUIState(HVCardUIState hVCardUIState) {
        this.hvCardUIState = hVCardUIState;
        int i10 = AnonymousClass15.$SwitchMap$co$hyperverge$hypersnapsdk$activities$HVDocsActivity$HVCardUIState[hVCardUIState.ordinal()];
        if (i10 == 1) {
            this.isStillAutoCaptureInitialState = false;
            setAutoCaptureUI(true, TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_DOC_FOUND, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_DOC_FOUND, getStringFromResources(R.string.docCaptureDocFound)));
            return;
        }
        if (i10 == 2) {
            if (this.isStillAutoCaptureInitialState) {
                return;
            }
            setAutoCaptureUI(false, TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_DOC_NOT_FOUND, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_DOC_NOT_FOUND, getStringFromResources(R.string.docCaptureDocNotFound)));
        } else if (i10 == 3) {
            this.isStillAutoCaptureInitialState = false;
            setAutoCaptureUI(false, TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_MOVE_CLOSER, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_MOVE_CLOSER, getStringFromResources(R.string.docCaptureMoveCloser)));
        } else if (i10 == 4) {
            this.isStillAutoCaptureInitialState = false;
            setAutoCaptureUI(false, TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_MOVE_AWAY_FROM_CAMERA, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_MOVE_AWAY_FROM_CAMERA, getStringFromResources(R.string.docCaptureMoveAwayFromCamera)));
        } else {
            if (i10 != 5) {
                return;
            }
            this.isStillAutoCaptureInitialState = false;
            setAutoCaptureUI(false, TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_MOVE_AWAY_FROM_EDGE, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_MOVE_AWAY_FROM_EDGE, getStringFromResources(R.string.docCaptureMoveAwayFromEdge)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHVResponse(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject addResultImageUri = addResultImageUri(jSONObject, str);
        this.hvResponse.setAction(this.retryAction);
        this.hvResponse.setApiHeaders(jSONObject2);
        this.hvResponse.setImageURI(str);
        this.hvResponse.setApiResult(addResultImageUri);
        this.hvResponse.setRetakeMessage(this.retakeMessage);
        this.hvResponse.setAttemptsCount(SPHelper.getAttemptsCountForImage(getDocConfig().ocrEndpoint, getDocConfig().getSuffixModuleId()));
        this.hvResponse.setRetakeAttemptResponses(this.hvResponses);
    }

    private void setReadBarcodeInitialState() {
        try {
            setCaptureButtonState(false, false);
            TextView textView = this.instructionsOutsideCameraPreviewBox;
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (this.overlayImageView != null) {
                if (getDocConfig().getReadBarcodeOverlay() != null) {
                    this.overlayImageView.setImageBitmap(getDocConfig().getReadBarcodeOverlay());
                } else {
                    this.overlayImageView.setImageResource(R.drawable.hv_read_barcode_overlay);
                }
            }
            showOverlayImageView(true);
            TextView textView2 = this.instructionsInsideCameraPreviewBox;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            TextView textView3 = this.hintText;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    private void setupOverlayImageView() {
        ShapeableImageView shapeableImageView;
        TextView textView = this.instructionsInsideCameraPreviewBox;
        if (textView != null) {
            textView.setVisibility(4);
        }
        if (!getDocConfig().isShouldReadBarcode() && getDocConfig().getDocumentCaptureOverlay() != null && (shapeableImageView = this.overlayImageView) != null) {
            shapeableImageView.setImageBitmap(getDocConfig().getDocumentCaptureOverlay());
            adjustOverlayImageView();
        }
        if (getDocConfig().isShouldAutoCapture() || getDocConfig().isShouldReadBarcode()) {
            return;
        }
        showOverlayImageView(true);
        runOverlayTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldUseDocDetect() {
        return getDocConfig().isShouldAutoCapture() || getDocConfig().isShouldPerformAssistiveCapture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBarcodeScannedSuccessfulOverlay(final boolean z10) {
        runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.Z
            @Override // java.lang.Runnable
            public final void run() {
                HVDocsActivity.this.lambda$showBarcodeScannedSuccessfulOverlay$20(z10);
            }
        });
    }

    private void showDocInstructions() {
        Log.d(TAG, "showDocInstructions() called");
        this.docPickerScreenLoadSuccessTimingUtils.init();
        this.docInstructionsLayout.setVisibility(0);
        HVJSONObject customUIStrings = getDocConfig().getCustomUIStrings();
        Spanned text = TextConfigUtils.getText(customUIStrings, CustomTextStringConst.DocCaptureTextConfigs.DOC_INSTRUCTIONS_TITLE, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_INSTRUCTIONS_TITLE);
        if (text != null) {
            ((TextView) this.docInstructionsLayout.findViewById(R.id.tvTitle)).setText(text);
        }
        Spanned text2 = TextConfigUtils.getText(customUIStrings, CustomTextStringConst.DocCaptureTextConfigs.DOC_INSTRUCTIONS_SUBTITLE, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_INSTRUCTIONS_SUBTITLE);
        if (text2 != null) {
            ((TextView) this.docInstructionsLayout.findViewById(R.id.tvSubtitle)).setText(text2);
        }
        Spanned text3 = TextConfigUtils.getText(customUIStrings, CustomTextStringConst.DocCaptureTextConfigs.DOC_INSTRUCTIONS_BUTTON, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_INSTRUCTIONS_BUTTON);
        if (text3 != null) {
            ((Button) this.docInstructionsLayout.findViewById(R.id.btnCaptureDoc)).setText(text3);
        }
        Spanned text4 = TextConfigUtils.getText(customUIStrings, CustomTextStringConst.DocCaptureTextConfigs.DOC_INSTRUCTIONS_UPLOAD_BUTTON, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_INSTRUCTIONS_UPLOAD_BUTTON);
        if (text4 != null) {
            ((Button) this.docInstructionsLayout.findViewById(R.id.btnUploadDoc)).setText(text4);
        }
        setupBranding(this.docInstructionsLayout);
        TextView textView = (TextView) this.docInstructionsLayout.findViewById(R.id.tvTitle);
        TextView textView2 = (TextView) this.docInstructionsLayout.findViewById(R.id.tvSubtitle);
        Button button = (Button) this.docInstructionsLayout.findViewById(R.id.btnCaptureDoc);
        button.setEnabled(true);
        Button button2 = (Button) this.docInstructionsLayout.findViewById(R.id.btnUploadDoc);
        this.instructionsUploadButton = button2;
        button2.setEnabled(true);
        HyperSnapUIConfigUtil.getInstance().customiseTitleTextView(textView);
        HyperSnapUIConfigUtil.getInstance().customiseDescriptionTextView(textView2);
        HyperSnapUIConfigUtil.getInstance().customisePrimaryButton(button);
        HyperSnapUIConfigUtil.getInstance().customiseSecondaryButton(this.instructionsUploadButton);
        HyperSnapUIConfigUtil.getInstance().customiseBackgroundImage(this.docInstructionsLayout);
        HyperSnapUIConfigUtil.getInstance().customiseBackButtonIcon((ImageView) this.docInstructionsLayout.findViewById(R.id.ivBack));
        HyperSnapUIConfigUtil.getInstance().customiseClientLogo((ImageView) this.docInstructionsLayout.findViewById(R.id.clientLogo));
        HyperSnapUIConfigUtil.getInstance().customiseBrandingColor((TextView) this.docInstructionsLayout.findViewById(R.id.tvBranding));
        if (!getDocConfig().shouldShowModuleBackButton()) {
            this.docInstructionsLayout.findViewById(R.id.ivBack).setVisibility(4);
        }
        this.docInstructionsLayout.findViewById(R.id.ivBack).setEnabled(true);
        this.docInstructionsLayout.findViewById(R.id.ivBack).setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVDocsActivity.this.lambda$showDocInstructions$2(view);
            }
        });
        ImageView imageView = (ImageView) this.docInstructionsLayout.findViewById(R.id.ivClose);
        if (imageView != null && getDocConfig().shouldShowCloseIcon()) {
            imageView.setVisibility(0);
            configureCloseButton(imageView);
            HyperSnapUIConfigUtil.getInstance().customiseCloseButtonIcon(imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.S
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HVDocsActivity.this.lambda$showDocInstructions$3(view);
                }
            });
        }
        this.instructionsUploadButton.setVisibility(getDocConfig().isDocumentUploadEnabled() ? 0 : 8);
        this.instructionsUploadButton.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.T
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVDocsActivity.this.lambda$showDocInstructions$4(view);
            }
        });
        button.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.U
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVDocsActivity.this.lambda$showDocInstructions$5(view);
            }
        });
        long longValue = this.docPickerScreenLoadSuccessTimingUtils.getTimeDifferenceLong().longValue();
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService(getApplicationContext()).logDocumentPickerScreenLoadSuccess(longValue);
            SDKInternalConfig.getInstance().getAnalyticsTrackerService(getApplicationContext()).logDocumentPickerScreenLaunched();
        }
        this.docPickerUploadButtonClickTimingUtils.init();
        this.docPickerCaptureButtonClickTimingUtils.init();
        loadAnimation();
    }

    private void showLocationSettingsDialog() {
        HVJSONObject customUIStrings = getDocConfig().getCustomUIStrings();
        Spanned text = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_LOCATION_PERMISSION_TITLE, getString(R.string.hv_gps_switched_off));
        Spanned text2 = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_LOCATION_PERMISSION_DESC, getString(R.string.hv_please_enable_gps_to_continue));
        Spanned text3 = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_LOCATION_PERMISSION_SETTINGS_BUTTON, getString(R.string.hv_open_settings));
        Spanned text4 = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_LOCATION_PERMISSION_CANCEL_BUTTON, getString(R.string.hv_cancel));
        final Spanned text5 = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_LOCATION_PERMISSION_ERROR, getString(R.string.hv_gps_access_denied_by_user));
        c.a aVar = new c.a(this);
        aVar.o(text);
        aVar.h(text2);
        aVar.d(false);
        aVar.l(text3, new DialogInterface.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.N
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HVDocsActivity.this.lambda$showLocationSettingsDialog$0(dialogInterface, i10);
            }
        });
        aVar.i(text4, new DialogInterface.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.O
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HVDocsActivity.this.lambda$showLocationSettingsDialog$1(text5, dialogInterface, i10);
            }
        });
        aVar.q();
    }

    private void showOverlayImageView(boolean z10) {
        if (z10) {
            if (this.overlayImageView == null || !getDocConfig().isOverlayEnabled()) {
                return;
            }
            this.overlayImageView.setVisibility(0);
            return;
        }
        ShapeableImageView shapeableImageView = this.overlayImageView;
        if (shapeableImageView != null) {
            shapeableImageView.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showProgressDialog(boolean z10, String str) {
        Log.d(TAG, "showProgressDialog() called with: show = [" + z10 + "], progressLoaderText = [" + str + "]");
        if (this.blackOverlay != null) {
            if (z10) {
                displayProgressView(str);
            } else {
                removeProgressView();
            }
        }
    }

    public static void start(Context context, HVDocConfig hVDocConfig, DocCaptureCompletionHandler docCaptureCompletionHandler) {
        String str = TAG;
        Log.d(str, "start() called with: context = [" + context + "], hvDocConfig = [" + hVDocConfig + "], listener = [" + docCaptureCompletionHandler + "]");
        if (docCaptureCompletionHandler == null) {
            return;
        }
        HVBaseActivity.isApplicationRecreated = false;
        CallbackProvider.get().setCallback(docCaptureCompletionHandler);
        Log.d(str, "start: documentImageListener: " + docCaptureCompletionHandler);
        String moduleId = hVDocConfig.getModuleId();
        if (context == null) {
            HVBaseActivity.callCompletionHandler(moduleId, HVBaseActivity.getAppFilesDir(context), CallbackProvider.get().injectDocCaptureCallback(), new HVError(6, "Context object is null"), null);
            return;
        }
        HyperSnapSDK hyperSnapSDK = HyperSnapSDK.getInstance();
        HyperSnapSDKConfig hyperSnapSDKConfig = hyperSnapSDK.getHyperSnapSDKConfig();
        if (!hyperSnapSDK.isHyperSnapSDKInitialised() || ((hyperSnapSDKConfig.getAppId() != null && hyperSnapSDKConfig.getAppId().isEmpty()) || (hyperSnapSDKConfig.getAppKey() != null && hyperSnapSDKConfig.getAppKey().isEmpty()))) {
            HVError hVError = new HVError(11, context.getResources().getString(R.string.initialised_error));
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logHyperSnapSDKInitError(hVError.getErrorMessage());
            }
            HVBaseActivity.callCompletionHandler(moduleId, HVBaseActivity.getAppFilesDir(context), CallbackProvider.get().injectDocCaptureCallback(), hVError, null);
            return;
        }
        if (hyperSnapSDKConfig.getHyperSnapRegion() == HyperSnapParams.Region.ASIA_PACIFIC && !HyperSnapSDK.isUserSessionActive()) {
            HVBaseActivity.callCompletionHandler(moduleId, HVBaseActivity.getAppFilesDir(context), CallbackProvider.get().injectDocCaptureCallback(), new HVError(11, context.getResources().getString(R.string.user_session_not_created_error)), null);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) HVDocsActivity.class);
        if (hVDocConfig.isShouldReadNIDQR() && SDKInternalConfig.getInstance().getFeatureConfigMap().get(AppConstants.READ_DOC_QR_FEATURE) != null) {
            hVDocConfig.setShouldReadNIDQR(SDKInternalConfig.getInstance().getFeatureConfigMap().get(AppConstants.READ_DOC_QR_FEATURE).isShouldEnable());
        }
        if (hVDocConfig.isShouldAutoCapture() || hVDocConfig.isShouldPerformAssistiveCapture()) {
            if (Build.VERSION.SDK_INT >= 26) {
                Map<String, FeatureConfig> featureConfigMap = SDKInternalConfig.getInstance().getFeatureConfigMap();
                if (featureConfigMap != null && featureConfigMap.containsKey(AppConstants.DOC_AUTO_CAPTURE)) {
                    hVDocConfig.setShouldAutoCapture(featureConfigMap.get(AppConstants.DOC_AUTO_CAPTURE).isShouldEnable());
                }
            } else {
                hVDocConfig.setShouldAutoCapture(false);
            }
        }
        intent.putExtra(HVDocConfig.KEY, hVDocConfig);
        context.startActivity(intent);
    }

    private void startDocCapture() {
        Log.d(TAG, "startDocCapture() called");
        this.isDocCaptureFlow = true;
        this.docInstructionsLayout.setVisibility(8);
        try {
            if (SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentDocFlowStarted(getDocConfig());
            }
            checkForPermissions();
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            sendResponse(new HVError(2, getStringFromResources(R.string.internal_error)));
        }
    }

    private void startDocPicker(String str) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        PackageManager packageManager = getPackageManager();
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType(str);
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(65536L);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        }
        if (!queryIntentActivities.isEmpty()) {
            intent.putExtra("android.intent.extra.MIME_TYPES", getUploadMimeTypes());
            startActivityForResult(intent, RC_PICK_DOC);
        } else {
            getDocConfig().setEnableDocumentUpload(false);
            this.lavDocInstructionsProcessing.setVisibility(8);
            this.lavDocInstructions.setVisibility(0);
            startRetakeScreen(null, TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_UPLOAD_NO_SUPPORTED_APP_TYPE_ERROR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_UPLOAD_NO_SUPPORTED_APP_TYPE_ERROR, getStringFromResources(R.string.docUploadNoSupportedAppTypeError)).toString());
        }
    }

    private void startDocUpload() {
        Log.d(TAG, "startDocUpload() called");
        this.isDocCaptureFlow = false;
        if (!InternalToolUtils.isTestMode(this)) {
            startNativeDocPicker("*/*");
            return;
        }
        String fileUploadIntentType = InternalToolUtils.getFileUploadIntentType();
        if (fileUploadIntentType != BuildConfig.FLAVOR) {
            startNativeDocPicker(fileUploadIntentType);
        } else {
            onActivityResult(RC_PICK_DOC, -1, new Intent().setData(Uri.fromFile(InternalToolUtils.getDocumentImageFile(getDocConfig().getDocumentSide()))));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:2|3|(10:5|(1:7)|8|(2:54|(8:71|(1:73)|74|(1:76)|77|(1:79)|80|(1:82))(9:58|(1:60)|61|(1:63)|64|(1:66)|67|(1:69)|70))(10:12|(1:14)|15|(1:17)|18|(1:20)|21|(1:23)|24|(1:53))|28|29|30|(1:32)|34|(1:42)(2:38|40))|83|8|(1:10)|54|(1:56)|71|(0)|74|(0)|77|(0)|80|(0)|28|29|30|(0)|34|(2:36|42)(1:43)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ed, code lost:
    
        android.util.Log.e(co.hyperverge.hypersnapsdk.activities.HVDocsActivity.TAG, co.hyperverge.hypersnapsdk.utils.Utils.getErrorMessage(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fe, code lost:
    
        if (co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010a, code lost:
    
        co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureScreenLoadFailure(new co.hyperverge.hypersnapsdk.objects.HVError(2, co.hyperverge.hypersnapsdk.utils.Utils.getErrorMessage(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0126, code lost:
    
        if (co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig.getInstance().getErrorMonitoringService() != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0128, code lost:
    
        co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1 A[Catch: Exception -> 0x00ec, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ec, blocks: (B:30:0x00c7, B:32:0x00d1), top: B:29:0x00c7, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a1 A[Catch: Exception -> 0x000a, TryCatch #1 {Exception -> 0x000a, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x0010, B:10:0x0019, B:12:0x001d, B:14:0x0021, B:15:0x0024, B:17:0x0028, B:18:0x002b, B:20:0x002f, B:21:0x0032, B:23:0x0036, B:24:0x0039, B:26:0x0046, B:28:0x00b9, B:34:0x0133, B:36:0x013d, B:38:0x0147, B:45:0x00ed, B:47:0x0100, B:49:0x010a, B:50:0x011e, B:52:0x0128, B:53:0x0050, B:54:0x0054, B:56:0x005e, B:58:0x0062, B:60:0x0066, B:61:0x0069, B:63:0x006d, B:64:0x008b, B:66:0x008f, B:67:0x0092, B:69:0x0096, B:70:0x0099, B:71:0x009d, B:73:0x00a1, B:74:0x00a4, B:76:0x00a8, B:77:0x00ab, B:79:0x00af, B:80:0x00b2, B:82:0x00b6, B:83:0x000d, B:30:0x00c7, B:32:0x00d1), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a8 A[Catch: Exception -> 0x000a, TryCatch #1 {Exception -> 0x000a, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x0010, B:10:0x0019, B:12:0x001d, B:14:0x0021, B:15:0x0024, B:17:0x0028, B:18:0x002b, B:20:0x002f, B:21:0x0032, B:23:0x0036, B:24:0x0039, B:26:0x0046, B:28:0x00b9, B:34:0x0133, B:36:0x013d, B:38:0x0147, B:45:0x00ed, B:47:0x0100, B:49:0x010a, B:50:0x011e, B:52:0x0128, B:53:0x0050, B:54:0x0054, B:56:0x005e, B:58:0x0062, B:60:0x0066, B:61:0x0069, B:63:0x006d, B:64:0x008b, B:66:0x008f, B:67:0x0092, B:69:0x0096, B:70:0x0099, B:71:0x009d, B:73:0x00a1, B:74:0x00a4, B:76:0x00a8, B:77:0x00ab, B:79:0x00af, B:80:0x00b2, B:82:0x00b6, B:83:0x000d, B:30:0x00c7, B:32:0x00d1), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00af A[Catch: Exception -> 0x000a, TryCatch #1 {Exception -> 0x000a, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x0010, B:10:0x0019, B:12:0x001d, B:14:0x0021, B:15:0x0024, B:17:0x0028, B:18:0x002b, B:20:0x002f, B:21:0x0032, B:23:0x0036, B:24:0x0039, B:26:0x0046, B:28:0x00b9, B:34:0x0133, B:36:0x013d, B:38:0x0147, B:45:0x00ed, B:47:0x0100, B:49:0x010a, B:50:0x011e, B:52:0x0128, B:53:0x0050, B:54:0x0054, B:56:0x005e, B:58:0x0062, B:60:0x0066, B:61:0x0069, B:63:0x006d, B:64:0x008b, B:66:0x008f, B:67:0x0092, B:69:0x0096, B:70:0x0099, B:71:0x009d, B:73:0x00a1, B:74:0x00a4, B:76:0x00a8, B:77:0x00ab, B:79:0x00af, B:80:0x00b2, B:82:0x00b6, B:83:0x000d, B:30:0x00c7, B:32:0x00d1), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b6 A[Catch: Exception -> 0x000a, TryCatch #1 {Exception -> 0x000a, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x0010, B:10:0x0019, B:12:0x001d, B:14:0x0021, B:15:0x0024, B:17:0x0028, B:18:0x002b, B:20:0x002f, B:21:0x0032, B:23:0x0036, B:24:0x0039, B:26:0x0046, B:28:0x00b9, B:34:0x0133, B:36:0x013d, B:38:0x0147, B:45:0x00ed, B:47:0x0100, B:49:0x010a, B:50:0x011e, B:52:0x0128, B:53:0x0050, B:54:0x0054, B:56:0x005e, B:58:0x0062, B:60:0x0066, B:61:0x0069, B:63:0x006d, B:64:0x008b, B:66:0x008f, B:67:0x0092, B:69:0x0096, B:70:0x0099, B:71:0x009d, B:73:0x00a1, B:74:0x00a4, B:76:0x00a8, B:77:0x00ab, B:79:0x00af, B:80:0x00b2, B:82:0x00b6, B:83:0x000d, B:30:0x00c7, B:32:0x00d1), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void startDocumentCapture() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        try {
            if (this.isViewsInitialised) {
                if (this.showInstructionPage) {
                }
                if (!shouldUseDocDetect() && !this.isReadBarcodeTimerRunning) {
                    TextView textView5 = this.instructionsInsideCameraPreviewBox;
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                    }
                    TextView textView6 = this.instructionsOutsideCameraPreviewBox;
                    if (textView6 != null) {
                        textView6.setVisibility(0);
                    }
                    TextView textView7 = this.tvTitle;
                    if (textView7 != null) {
                        textView7.setVisibility(4);
                    }
                    TextView textView8 = this.descText;
                    if (textView8 != null) {
                        textView8.setVisibility(4);
                    }
                    resetAutoCaptureVariables();
                    if (!getDocConfig().isShouldAutoCapture() || getDocConfig().isShouldPerformAssistiveCapture()) {
                        setCaptureButtonState(true, false);
                    }
                } else if (getDocConfig().isShouldReadBarcode() || !this.isReadBarcodeTimerRunning) {
                    textView = this.instructionsInsideCameraPreviewBox;
                    if (textView != null) {
                        textView.setVisibility(4);
                    }
                    textView2 = this.instructionsOutsideCameraPreviewBox;
                    if (textView2 != null) {
                        textView2.setVisibility(4);
                    }
                    textView3 = this.tvTitle;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    textView4 = this.descText;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                } else {
                    TextView textView9 = this.instructionsInsideCameraPreviewBox;
                    if (textView9 != null) {
                        textView9.setVisibility(4);
                    }
                    TextView textView10 = this.instructionsOutsideCameraPreviewBox;
                    if (textView10 != null) {
                        textView10.setVisibility(0);
                        this.instructionsOutsideCameraPreviewBox.setText(TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_SCANNING_BARCODE, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_SCANNING_BARCODE, getStringFromResources(R.string.docCaptureScanningBarcode)));
                    }
                    TextView textView11 = this.tvTitle;
                    if (textView11 != null) {
                        textView11.setVisibility(4);
                    }
                    TextView textView12 = this.descText;
                    if (textView12 != null) {
                        textView12.setVisibility(4);
                    }
                    resetReadBarcodeVariables();
                }
                setupOverlayImageView();
                setupBranding(null);
                this.cameraFree = new AtomicBoolean(true);
                if (!getDocConfig().isShouldAllowPhoneTilt()) {
                    initializeTiltSensor();
                    SensorManager sensorManager = this.sensorManager;
                    sensorManager.registerListener(this.mySensorEventListener, sensorManager.getDefaultSensor(2), 3);
                    SensorManager sensorManager2 = this.sensorManager;
                    sensorManager2.registerListener(this.mySensorEventListener, sensorManager2.getDefaultSensor(1), 3);
                }
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                }
                long longValue = this.screenLoadSuccessTimingUtils.getTimeDifferenceLong().longValue();
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureScreenOpened(getDocConfig());
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureScreenLoadSuccess(longValue);
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureScreenLaunched();
                this.captureClickTimingUtils.init();
                return;
            }
            initializeViewsById();
            if (!shouldUseDocDetect()) {
            }
            if (getDocConfig().isShouldReadBarcode()) {
            }
            textView = this.instructionsInsideCameraPreviewBox;
            if (textView != null) {
            }
            textView2 = this.instructionsOutsideCameraPreviewBox;
            if (textView2 != null) {
            }
            textView3 = this.tvTitle;
            if (textView3 != null) {
            }
            textView4 = this.descText;
            if (textView4 != null) {
            }
            setupOverlayImageView();
            setupBranding(null);
            this.cameraFree = new AtomicBoolean(true);
            if (!getDocConfig().isShouldAllowPhoneTilt()) {
            }
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
            }
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureScreenLoadFailure(new HVError(2, Utils.getErrorMessage(e10)));
            }
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            sendResponse(new HVError(2, getStringFromResources(R.string.internal_error)));
        }
    }

    private void startNativeDocPicker(String str) {
        try {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType(str);
            intent.putExtra("android.intent.extra.MIME_TYPES", getUploadMimeTypes());
            startActivityForResult(intent, RC_PICK_DOC);
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "Native file picker cannot be opened " + e10.getMessage());
            startDocPicker(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateInstructionsVisibility() {
        TextView textView = this.tvTitle;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.descText;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.instructionsInsideCameraPreviewBox;
        if (textView3 != null) {
            textView3.setVisibility(4);
        }
        TextView textView4 = this.instructionsOutsideCameraPreviewBox;
        if (textView4 != null) {
            textView4.setVisibility(4);
        }
    }

    private void userCancelledOperation() {
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logIdScreenClosedByUser(getDocConfig());
        }
        stopCamera();
        finishView(new HVError(3, getString(R.string.operation_cancelled)), new HVResponse(new JSONObject(), null, null, this.retryAction));
    }

    public JSONObject addResultImageUri(JSONObject jSONObject, String str) {
        String str2;
        try {
            if (getDocConfig().isShouldExportPDF() && (str2 = this.pdfPath) != null) {
                jSONObject.put("pdfUri", str2);
            }
        } catch (JSONException e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        return jSONObject;
    }

    public void adjustBlackOverlayView() {
        View view = this.blackOverlay;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            if (!this.blackOverlay.isInLayout()) {
                this.blackOverlay.setLayoutParams(layoutParams);
            }
            if (this.cameraContainer.isInLayout()) {
                return;
            }
            this.cameraContainer.requestLayout();
        }
    }

    public void adjustHintText() {
        TextView textView = this.hintText;
        if (textView != null) {
            textView.setY(getBottomYOfBox() - (this.hintText.getHeight() * 1.75f));
            if (!this.hintText.isInLayout()) {
                this.hintText.requestLayout();
            }
            if (this.cameraContainer.isInLayout()) {
                return;
            }
            this.cameraContainer.requestLayout();
        }
    }

    public void adjustOverlayImageView() {
        ShapeableImageView shapeableImageView = this.overlayImageView;
        if (shapeableImageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) shapeableImageView.getLayoutParams();
            layoutParams.setMargins(((int) getBoxRect().left) + UIUtils.dpToPx(this, 32.0f), UIUtils.dpToPx(this, 32.0f), ((int) getBoxRect().left) + UIUtils.dpToPx(this, 32.0f), UIUtils.dpToPx(this, 32.0f));
            if (!this.overlayImageView.isInLayout()) {
                this.overlayImageView.setLayoutParams(layoutParams);
            }
            if (this.cameraContainer.isInLayout()) {
                return;
            }
            this.cameraContainer.requestLayout();
        }
    }

    public void adjustProgressDialogView() {
        View view = this.progressDialogView;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMargins(((int) getBoxRect().left) + UIUtils.dpToPx(this, 32.0f), 0, ((int) getBoxRect().left) + UIUtils.dpToPx(this, 32.0f), 0);
            if (!this.progressDialogView.isInLayout()) {
                this.progressDialogView.setLayoutParams(layoutParams);
            }
            if (this.cameraContainer.isInLayout()) {
                return;
            }
            this.cameraContainer.requestLayout();
        }
    }

    public void adjustScanningIndicator() {
        if (!getDocConfig().isShouldReadBarcode() || this.indicator == null) {
            return;
        }
        int bottomYOfBox = getBottomYOfBox() - getTopYOfBox();
        int topYOfBox = getTopYOfBox();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.indicator.getLayoutParams();
        layoutParams.setMargins(0, topYOfBox, 0, 0);
        this.indicator.setLayoutParams(layoutParams);
        this.indicator.setmHeight(bottomYOfBox);
        if (!this.cameraContainer.isInLayout()) {
            this.cameraContainer.requestLayout();
        }
        this.indicator.startAnimation();
    }

    public void adjustStatusText() {
        TextView textView = this.instructionsInsideCameraPreviewBox;
        if (textView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.setMarginStart(UIUtils.dpToPx(this, 32.0f));
            layoutParams.setMarginEnd(UIUtils.dpToPx(this, 32.0f));
            if (!this.instructionsInsideCameraPreviewBox.isInLayout()) {
                this.instructionsInsideCameraPreviewBox.setLayoutParams(layoutParams);
            }
            if (this.cameraContainer.isInLayout()) {
                return;
            }
            this.cameraContainer.requestLayout();
        }
    }

    public void adjustTitleText() {
    }

    public void adjustTopText() {
        TextView textView = this.descText;
        if (textView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (this.document.getAspectRatio() < 1.0f) {
                layoutParams.setMargins(UIUtils.dpToPx(this, 30.0f), UIUtils.dpToPx(this, 60.0f), UIUtils.dpToPx(this, 30.0f), 0);
            }
            if (this.descText.isInLayout()) {
                return;
            }
            this.descText.requestLayout();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    void callCompletionHandler(HVError hVError, HVResponse hVResponse) {
        HVBaseActivity.callCompletionHandler(this.docConfig.getModuleId(), getAppFilesDir(), CallbackProvider.get().injectDocCaptureCallback(), hVError, hVResponse);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    /* renamed from: checkAndWaitForRemoteConfig */
    public /* bridge */ /* synthetic */ void lambda$checkAndWaitForRemoteConfig$1() {
        super.lambda$checkAndWaitForRemoteConfig$1();
    }

    public void checkForPermissions() {
        this.permissionTimingUtils.init();
        ArrayList arrayList = new ArrayList(Arrays.asList("android.permission.CAMERA"));
        this.permissionManager.checkAndRequestPermissions(this, arrayList);
        if (this.permissionManager.getStatus(this, arrayList).denied.isEmpty()) {
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logCameraPermissionsGranted(this.permissionTimingUtils.getTimeDifferenceLong().longValue());
            }
            readyToStartDocCapture();
        }
    }

    public void finishView(HVError hVError, HVResponse hVResponse) {
        Log.d(TAG, "finishView() called with: documentImageListener: " + CallbackProvider.get().injectDocCaptureCallback() + "error = [" + hVError + "], hvResponse = [" + hVResponse + "]");
        if (hVResponse != null) {
            try {
                if (getDocConfig().isShouldReadBarcode()) {
                    hVResponse.setRawBarcode(this.detectedBarcode);
                }
                Location location = this.mLocation;
                if (location != null) {
                    hVResponse.setLatitude(Double.valueOf(location.getLatitude()));
                    hVResponse.setLongitude(Double.valueOf(this.mLocation.getLongitude()));
                }
                Long l10 = this.imageSubmissionTimestamp;
                if (l10 != null) {
                    hVResponse.setSubmittedTimestamp(l10);
                }
            } catch (Exception e10) {
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                    return;
                }
                return;
            }
        }
        stopCamera();
        lambda$checkCameraAndHandleCompletion$6(hVError, hVResponse);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    HVBaseConfig getBaseConfig() {
        return this.docConfig;
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    Integer getInsetContentId() {
        return Integer.valueOf(R.id.hv_document);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    View getInsetView() {
        return findViewById(R.id.parent_container);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public /* bridge */ /* synthetic */ void handleCloseAction() {
        super.handleCloseAction();
    }

    public void initializeViewsById() {
        this.hvGreenTickImageView = (ImageView) findViewById(R.id.docGreenTickImageView);
        this.overlayImageView = (ShapeableImageView) findViewById(R.id.docOverlayImageView);
        this.instructionsInsideCameraPreviewBox = (TextView) findViewById(R.id.tvStatus);
        this.instructionsOutsideCameraPreviewBox = (TextView) findViewById(R.id.initialStatusTV);
        ImageView imageView = (ImageView) findViewById(R.id.camera_icon);
        this.btCapture = imageView;
        androidx.core.widget.g.c(imageView, null);
        this.btCapture.setImageResource(R.drawable.hv_camera_button_disabled);
        setCaptureButtonState(true, false);
        this.progressDialogView = findViewById(R.id.docProgressDialogView);
        this.progressSpinnerImageView = (ImageView) findViewById(R.id.hv_loading_icon);
        this.progressDialogTextView = (TextView) findViewById(R.id.hv_loading_text);
        if (shouldUseDocDetect()) {
            ImageView imageView2 = this.btCapture;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            this.autoCaptureTimer = new AnonymousClass7(getDocConfig().getAutoCaptureDuration(), getDocConfig().getAutoCaptureDuration() / 2);
        }
        if (getDocConfig().isShouldReadBarcode()) {
            if (!getDocConfig().isBarcodeSkipDisabled()) {
                CountDownTimer countDownTimer = new CountDownTimer(getDocConfig().getReadBarcodeTimeout(), 1000L) { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.8
                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                        HVDocsActivity.this.isReadBarcodeTimerRunning = false;
                        HVDocsActivity.this.showBarcodeScannedSuccessfulOverlay(false);
                        if (!HVDocsActivity.this.getDocConfig().isShouldAutoCapture() && !HVDocsActivity.this.getDocConfig().isShouldPerformAssistiveCapture()) {
                            HVDocsActivity.this.updateInstructionsVisibility();
                            HVDocsActivity.this.enableCaptureButton();
                        } else if (!HVDocsActivity.this.getDocConfig().isShouldAutoCapture() || HVDocsActivity.this.getDocConfig().isShouldPerformAssistiveCapture()) {
                            HVDocsActivity.this.setCaptureButtonState(true, false);
                        }
                    }

                    @Override // android.os.CountDownTimer
                    public void onTick(long j10) {
                    }
                };
                this.readBarcodeTimer = countDownTimer;
                countDownTimer.start();
                this.isReadBarcodeTimerRunning = true;
            }
            if (getDocConfig().isBarcodeSkipDisabled()) {
                this.isReadBarcodeTimerRunning = true;
            }
        }
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseLocation() && this.mLocation != null) {
            enableCaptureButton();
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.ivFlashFlip);
        this.ivFlash = imageView3;
        imageView3.setImageResource(R.drawable.ic_baseline_flash_off_18);
        this.ivFlash.setEnabled(true);
        this.blackOverlay = findViewById(R.id.blackOverlayView);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.9
            @Override // java.lang.Runnable
            public void run() {
                if (SDKInternalConfig.getInstance().isRemoteConfigFetchDone()) {
                    HVDocsActivity.this.setupBranding(null);
                }
            }
        }, 100L);
        View view = this.vFlash;
        if (view != null) {
            view.setVisibility(8);
        }
        this.cameraContainer = (FrameLayout) findViewById(R.id.cameraContainer);
        CameraEngine.setPreviewCallback(getDocConfig().isShouldReadBarcode() || shouldUseDocDetect());
        HVCameraHelper.enableCameraParameters(this, true, false);
        CameraEngine.setShouldRandomize(false);
        CameraEngine.setShouldUseDefaultZoom(false);
        try {
            HVMagicView hVMagicView = this.cameraView;
            if (hVMagicView != null) {
                this.cameraContainer.removeView(hVMagicView);
            }
            HVMagicView hVMagicView2 = HVMagicView.getInstance(this, this.camHost, false);
            this.cameraView = hVMagicView2;
            hVMagicView2.disableRotation();
            this.cameraView.setContentDescription("docCaptureCameraPreview");
            this.cameraContainer.addView(this.cameraView, 0);
            HVMagicView hVMagicView3 = this.cameraView;
            if (hVMagicView3 != null) {
                this.cameraView.setSensorCallback(new HVMagicView.SensorCallback() { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.10
                    @Override // co.hyperverge.hvcamera.HVMagicView.SensorCallback
                    public void onSensorCallback() {
                        Log.i("CameraActivity", HVDocsActivity.this.cameraContainer.getWidth() + " " + HVDocsActivity.this.cameraContainer.getHeight());
                        HVDocsActivity hVDocsActivity = HVDocsActivity.this;
                        hVDocsActivity.crossHairView.showCrosshair((float) (hVDocsActivity.camViewWidth / 2), (float) (HVDocsActivity.this.camViewHeight / 2), false);
                    }
                });
            }
            addCrossHairView(this.cameraContainer);
            if (getDocConfig().isShouldReadBarcode()) {
                removeScanningIndicator();
                this.indicator = new ScanningIndicator(this, getBottomYOfBox() - getTopYOfBox());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(UIUtils.getScreenWidth(), UIUtils.dpToPx(this, 15.0f));
                layoutParams.gravity = 1;
                this.indicator.setLayoutParams(layoutParams);
                this.indicator.setImageResource(R.drawable.hv_ic_camera_qr_status);
                this.cameraContainer.addView(this.indicator);
            }
            addDocumentCaptureView(this.cameraContainer);
            ImageView imageView4 = (ImageView) findViewById(R.id.ivBack);
            this.cross = imageView4;
            imageView4.setEnabled(true);
            this.cross.setOnClickListener(this);
            this.tvTitle = (TextView) findViewById(R.id.title_text);
            this.hintText = (TextView) findViewById(R.id.tvHint);
            try {
                HVJSONObject customUIStrings = getDocConfig().getCustomUIStrings();
                if (getDocConfig().getHintTypeface() > 0) {
                    this.hintText.setTypeface(androidx.core.content.res.f.h(getApplicationContext(), getDocConfig().getHintTypeface()));
                }
                String docCaptureSubText = getDocConfig().getDocCaptureSubText();
                if (TextUtils.isEmpty(docCaptureSubText)) {
                    Spanned text = TextConfigUtils.getText(customUIStrings, CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_SUB_TEXT, getDocConfig().getDocumentSide() == HVDocConfig.DocumentSide.FRONT ? CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_FRONT_SUB_TEXT : CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_BACK_SUB_TEXT);
                    if (text != null) {
                        this.hintText.setText(text);
                    }
                } else {
                    this.hintText.setText(docCaptureSubText);
                }
                this.descText = (TextView) findViewById(R.id.desc_text);
                if (getDocConfig().getDescTypeface() > 0) {
                    this.descText.setTypeface(androidx.core.content.res.f.h(getApplicationContext(), getDocConfig().getDescTypeface()));
                }
                if (getDocConfig().getDocCaptureDescription() == null || getDocConfig().getDocCaptureDescription().isEmpty()) {
                    Spanned text2 = TextConfigUtils.getText(customUIStrings, CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_DESC, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_DESC);
                    if (text2 != null) {
                        this.descText.setText(text2);
                    }
                } else {
                    this.descText.setText(getDocConfig().getDocCaptureDescription());
                }
                String capturePageTitleText = getDocConfig().getCapturePageTitleText();
                if (TextUtils.isEmpty(capturePageTitleText)) {
                    Spanned text3 = TextConfigUtils.getText(customUIStrings, CustomTextStringConst.DocCaptureTextConfigs.DOC_CAPTURE_TITLE, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAPTURE_TITLE);
                    if (text3 != null) {
                        this.tvTitle.setText(text3);
                    }
                } else {
                    this.tvTitle.setText(capturePageTitleText);
                }
            } catch (Exception e10) {
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureScreenLoadFailure(new HVError(2, Utils.getErrorMessage(e10)));
                }
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
            CameraEngine.setCaptureMode(true);
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            defaultDisplay.getMetrics(new DisplayMetrics());
            CameraEngine.setScreenSize(point);
            float f10 = getResources().getDisplayMetrics().density;
            this.density = f10;
            this.dpHeight = r6.heightPixels / f10;
            this.dpWidth = r6.widthPixels / f10;
            adjustView(false);
            adjustCrossHairView();
            adjustHintText();
            adjustTitleText();
            adjustDocumentCaptureView();
            adjustScanningIndicator();
            adjustOverlayImageView();
            adjustBlackOverlayView();
            adjustProgressDialogView();
            adjustStatusText();
            if (getDocConfig().getTitleTypeface() > 0) {
                this.tvTitle.setTypeface(androidx.core.content.res.f.h(getApplicationContext(), getDocConfig().getTitleTypeface()));
            }
            HyperSnapUIConfigUtil.getInstance().customiseTitleTextView(this.tvTitle, true);
            HyperSnapUIConfigUtil.getInstance().customiseDescriptionTextView(this.descText, true);
            HyperSnapUIConfigUtil.getInstance().customiseStatusTextView(this.instructionsOutsideCameraPreviewBox, true);
            HyperSnapUIConfigUtil.getInstance().customiseDocumentSideTextView(this.hintText);
            HyperSnapUIConfigUtil.getInstance().customiseBackButtonIcon((ImageView) findViewById(R.id.ivBack), true);
            HyperSnapUIConfigUtil.getInstance().customiseClientLogo((ImageView) findViewById(R.id.clientLogo), true);
            if (!getDocConfig().shouldShowModuleBackButton() && !getDocConfig().isShouldShowInstructionPage() && !getDocConfig().isDocumentUploadEnabled()) {
                findViewById(R.id.ivBack).setVisibility(4);
            }
            this.btCapture.setOnClickListener(this);
            this.ivFlash.setOnClickListener(this);
            this.btCapture.setOnTouchListener(new View.OnTouchListener() { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.11
                boolean inAnimate;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (!HVDocsActivity.this.getDocConfig().isShouldAllowPhoneTilt() && HVDocsActivity.this.isPhoneTilted) {
                        return false;
                    }
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.inAnimate = HVDocsActivity.this.cameraFree.get();
                        if (HVDocsActivity.this.cameraFree.get()) {
                            HVDocsActivity.this.popin();
                        }
                    } else if (action == 1 && this.inAnimate) {
                        HVDocsActivity.this.popout();
                    }
                    return false;
                }
            });
            if (this.cameraView != null) {
                Log.d(LOG_TAG, "Camera resume is called");
                this.cameraView.onResume();
            } else if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureScreenLoadFailure(new HVError(2, "CameraView is null"));
            }
            this.isViewsInitialised = true;
        } catch (Exception e11) {
            Log.e(TAG, Utils.getErrorMessage(e11));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            }
            HVError hVError = new HVError(5, getStringFromResources(R.string.camera_error));
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureScreenLoadFailure(hVError);
            }
            sendResponse(hVError);
        }
    }

    public void makeOCRAPICall(final String str, final String str2) {
        Log.d(TAG, "makeOCRAPICall() called with: filePath = [" + str + "], capturedHighResolutionQRCroppedImagePath = [" + str2 + "]");
        JSONObject ocrHeaders = getDocConfig().getOcrHeaders();
        try {
            ocrHeaders.put(AppConstants.IS_DOCUMENT_UPLOADED, !this.isDocCaptureFlow);
            ocrHeaders.put(AppConstants.SDK_MODE, InternalToolUtils.getSdkMode(this));
            getDocConfig().ocrHeaders = ocrHeaders.toString();
        } catch (Exception e10) {
            Log.e(TAG, "makeOCRAPICall() ocrHeaders:" + Utils.getErrorMessage(e10));
        }
        if (shouldUseDocDetect()) {
            runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.i0
                @Override // java.lang.Runnable
                public final void run() {
                    HVDocsActivity.this.lambda$makeOCRAPICall$23();
                }
            });
        }
        Spanned text = TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_LOADER_DESC, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_LOADER_DESC, getStringFromResources(R.string.hv_doc_loader_subtitle));
        showProgressDialog(true, text != null ? text.toString() : null);
        this.shouldAllowActivityClose = false;
        DocOCRHelper.get().makeOcrAPICall(this, str, str2, getDocConfig(), new DocOCRHelper.DocOCRListener() { // from class: co.hyperverge.hypersnapsdk.activities.F
            @Override // co.hyperverge.hypersnapsdk.helpers.DocOCRHelper.DocOCRListener
            public final void onResult(boolean z10, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, HVError hVError) {
                HVDocsActivity.this.lambda$makeOCRAPICall$27(str, str2, z10, str3, str4, jSONObject, jSONObject2, hVError);
            }
        });
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Log.d(TAG, "onActivityResult() called with: requestCode = [" + i10 + "], resultCode = [" + i11 + "], data = [" + intent + "]");
        this.safeToTakePicture = true;
        if (getDocConfig().isShouldReadBarcode() && this.isReadBarcodeTimerRunning) {
            resetReadBarcodeVariables();
        }
        resetAutoCaptureVariables();
        reInitCaptureButton();
        setupOverlayImageView();
        reInitTimingUtils();
        ImageView imageView = this.cross;
        if (imageView != null) {
            imageView.setEnabled(true);
        }
        showProgressDialog(false, null);
        if (i10 == LOCATION_SETTINGS_REQUEST_CODE) {
            try {
                getLocation(this);
            } catch (NoClassDefFoundError unused) {
                HVLogUtils.e(TAG, "gms excluded");
            }
        }
        final boolean isTestMode = InternalToolUtils.isTestMode(this);
        if (i10 == RC_PICK_DOC) {
            this.imageSubmissionTimestamp = Long.valueOf(System.currentTimeMillis());
            if (i11 != -1 || intent == null || intent.getData() == null) {
                this.instructionsUploadButton.setEnabled(true);
                this.lavDocInstructions.setVisibility(0);
                this.lavDocInstructionsProcessing.setVisibility(8);
            } else {
                final Uri data = intent.getData();
                String fileMimeType = Utils.getFileMimeType(isTestMode, getContentResolver(), data);
                String str = TAG;
                HVLogUtils.d(str, "onActivityResult: uri - " + data);
                HVLogUtils.d(str, "onActivityResult: fileMimeType - " + fileMimeType);
                if (fileMimeType == null) {
                    startRetakeScreen(null, TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_UPLOAD_READ_FILE_ERROR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_UPLOAD_READ_FILE_ERROR, getStringFromResources(R.string.docUploadReadFileError)).toString());
                } else if (isSelectedFileExtentionInAllowedList(fileMimeType)) {
                    Utils.saveDocToFilesDir(isTestMode, getContentResolver(), data, new File(getFilesDir(), "hv"), new Utils.FileOperationCallback() { // from class: co.hyperverge.hypersnapsdk.activities.g0
                        @Override // co.hyperverge.hypersnapsdk.utils.Utils.FileOperationCallback
                        public final void onSaved(File file) {
                            HVDocsActivity.this.lambda$onActivityResult$21(isTestMode, data, file);
                        }
                    });
                } else {
                    startRetakeScreen(null, TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_UPLOAD_ALLOWED_FILE_TYPE_ERROR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_UPLOAD_ALLOWED_FILE_TYPE_ERROR, getStringFromResources(R.string.docUploadAllowedFileTypeError)).toString());
                }
            }
        }
        if (i11 == 6) {
            this.numberOfRechecks++;
            this.imageSubmissionTimestamp = null;
            decideWhatToShow(false);
            if (intent != null) {
                long longExtra = intent.getLongExtra("timeTakenToClickRetakeButton", 0L);
                if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                    return;
                }
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentReviewScreenRetakeButtonClicked(getDocConfig(), longExtra);
                return;
            }
            return;
        }
        if (i11 == 7) {
            long longExtra2 = intent.getLongExtra("timeTakenToClickConfirmButton", 0L);
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentReviewScreenConfirmButtonClicked(getDocConfig(), this.numberOfRechecks, longExtra2);
            }
            stopCamera();
            finishView((HVError) intent.getSerializableExtra("hvError"), (HVResponse) intent.getSerializableExtra("hvResponse"));
            return;
        }
        if (i11 == 8 || i11 == 18) {
            this.imageSubmissionTimestamp = null;
            stopCamera();
            finishView((HVError) intent.getSerializableExtra("hvError"), null);
        } else {
            if (i11 != 21) {
                return;
            }
            this.numberOfRechecks++;
            this.imageSubmissionTimestamp = null;
            decideWhatToShow(true);
            if (intent != null) {
                long longExtra3 = intent.getLongExtra("timeTakenToClickRetakeButton", 0L);
                if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                    return;
                }
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentRetakeScreenRetakeButtonClicked(getDocConfig(), longExtra3);
            }
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.activity.f, android.app.Activity
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.ivBack) {
            view.setEnabled(false);
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCloseClicked();
            }
            onBackPressed();
            return;
        }
        if (id2 != R.id.camera_icon) {
            if (id2 == R.id.ivFlashFlip) {
                if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                    SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureFlashButtonClicked();
                }
                HVMagicView hVMagicView = this.cameraView;
                if (hVMagicView != null) {
                    hVMagicView.nextFlashMode();
                    return;
                }
                return;
            }
            return;
        }
        Log.d(TAG, "onClick() called with: view = [" + view + "]");
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentCaptureButtonClicked(getDocConfig(), this.captureClickTimingUtils.getTimeDifferenceLong().longValue());
        }
        if (getDocConfig().isShouldAllowPhoneTilt() || !this.isPhoneTilted) {
            setCaptureButtonState(true, false);
            this.cross.setEnabled(false);
            safeTakePicture();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    void onCloseActivity() {
        Log.d(TAG, "onCloseActivity() called");
        boolean shouldShowModuleBackButton = getDocConfig().shouldShowModuleBackButton();
        boolean isShouldShowInstructionPage = getDocConfig().isShouldShowInstructionPage();
        boolean isDocumentUploadEnabled = getDocConfig().isDocumentUploadEnabled();
        boolean z10 = this.docInstructionsLayout.getVisibility() == 0;
        if (shouldShowModuleBackButton || !((isShouldShowInstructionPage || isDocumentUploadEnabled) && z10)) {
            if (shouldShowModuleBackButton || isShouldShowInstructionPage || isDocumentUploadEnabled || z10) {
                if ((getDocConfig().isShouldShowInstructionPage() || getDocConfig().isDocumentUploadEnabled()) && this.docInstructionsLayout.getVisibility() != 0) {
                    stopCamera();
                    showProgressDialog(false, null);
                    this.safeToTakePicture = true;
                    this.showInstructionPage = true;
                    showDocInstructions();
                } else {
                    userCancelledOperation();
                }
                if (!SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() || SDKInternalConfig.getInstance().getAnalyticsTrackerService() == null) {
                    return;
                }
                SDKInternalConfig.getInstance().getAnalyticsTrackerService(getApplicationContext()).logDocumentCaptureScreenBackPressed();
            }
        }
    }

    @Override // androidx.appcompat.app.d, androidx.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HVLogUtils.d(TAG, "onConfigurationChanged: newConfig = " + configuration);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(R.layout.hv_activity_doc_capture);
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
            sendResponse(new HVError(2, getStringFromResources(R.string.internal_error)));
        }
        this.docConfig = (HVDocConfig) getIntent().getSerializableExtra(HVDocConfig.KEY);
        if (bundle != null) {
            HVDocConfig hVDocConfig = (HVDocConfig) new com.google.gson.e().k(bundle.getString("docConfig"), HVDocConfig.class);
            this.docConfig = hVDocConfig;
            if (performPermissionRevokeCheck(hVDocConfig.getModuleId())) {
                return;
            }
        }
        getWindow().getDecorView().getRootView().setTag("docCaptureCameraPreview");
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentDocFlowStarted(getDocConfig());
        }
        if (this.docConfig == null) {
            sendResponse(new HVError(2, getStringFromResources(R.string.document_config_error)));
            return;
        }
        if (getDocConfig().isShouldReadBarcode() || getDocConfig().isShouldReadNIDQR()) {
            initializeHVBarcodeDetector();
        }
        if (shouldUseDocDetect()) {
            getDocConfig().setShouldAutoCapture(initDocumentDetector(this));
        }
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseLocation()) {
            try {
                getLocation(this);
            } catch (NoClassDefFoundError unused) {
                Log.e(TAG, "gms excluded");
            }
        }
        this.document = getDocConfig().getDocument();
        View findViewById = findViewById(R.id.v_flash);
        this.vFlash = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        File file = new File(getFilesDir(), "hv");
        this.folder = file;
        if (!file.exists()) {
            this.folder.mkdirs();
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.capturedImagePath = this.folder.getPath() + "/" + currentTimeMillis + ".jpg";
        this.capturedHighResolutionQRCroppedImagePath = this.folder.getPath() + "/HIGH_RES_CROPPED_" + currentTimeMillis + ".jpg";
        this.capturedHighResolutionFullImagePath = this.folder.getPath() + "/HIGH_RES_FULL_" + currentTimeMillis + ".jpg";
        this.docInstructionsLayout = (ConstraintLayout) findViewById(R.id.layoutDocInstructions);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.layoutDocLoader);
        this.docLoaderLayout = constraintLayout;
        this.lav = (LottieAnimationView) constraintLayout.findViewById(R.id.lavDocLoader);
        Log.d(TAG, "onCreate: documentImageListener: " + CallbackProvider.get().injectDocCaptureCallback());
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onDestroy() {
        try {
            if (!getDocConfig().isShouldAllowPhoneTilt()) {
                this.sensorManager.unregisterListener(this.mySensorEventListener);
                DocOCRHelper.destroy();
            }
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        super.onDestroy();
        LocationServiceImpl.destroy();
        Bitmap bitmap = this.croppedBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.croppedBitmap.recycle();
        this.croppedBitmap = null;
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onPause() {
        super.onPause();
        HVMagicView hVMagicView = this.cameraView;
        if (hVMagicView != null) {
            hVMagicView.onPause();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public void onRemoteConfigFetchDone() {
        HVLogUtils.d(TAG, "onRemoteConfigFetchDone() called");
        runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.W
            @Override // java.lang.Runnable
            public final void run() {
                HVDocsActivity.this.lambda$onRemoteConfigFetchDone$8();
            }
        });
        if (HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseSensorBiometrics()) {
            String sensorDataZipFileName = Utils.getSensorDataZipFileName("doc");
            if (SDKInternalConfig.getInstance().getHvSensorBiometrics() != null) {
                SDKInternalConfig.getInstance().getHvSensorBiometrics().registerSensorBiometrics(sensorDataZipFileName);
            }
            JSONObject ocrHeaders = getDocConfig().getOcrHeaders();
            try {
                ocrHeaders.put(AppConstants.SENSOR_DATA_ZIP_FILE_NAME, sensorDataZipFileName);
                getDocConfig().ocrHeaders = ocrHeaders.toString();
            } catch (Exception e10) {
                Log.e(TAG, "start() ocrHeaders :- JSON Exception :" + Utils.getErrorMessage(e10));
            }
        }
        startDocumentCapture();
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        final PermissionManager.StatusArray status = this.permissionManager.getStatus(this, new ArrayList(Arrays.asList("android.permission.CAMERA")));
        if (!status.denied.isEmpty()) {
            Log.d(LOG_TAG, "Required permissions not granted");
            showCameraPermissionBS(TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), BuildConfig.FLAVOR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAMERA_PERMISSION_TITLE), TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), BuildConfig.FLAVOR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAMERA_PERMISSION_DESC), TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), BuildConfig.FLAVOR, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_CAMERA_PERMISSION_BUTTON), new PermDialogCallback() { // from class: co.hyperverge.hypersnapsdk.activities.HVDocsActivity.5
                @Override // co.hyperverge.hypersnapsdk.listeners.PermDialogCallback
                public void onActionClick() {
                    if (AbstractC1480b.y(HVDocsActivity.this, "android.permission.CAMERA")) {
                        HVDocsActivity.this.checkForPermissions();
                        return;
                    }
                    HVDocsActivity.this.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + HVDocsActivity.this.getApplicationContext().getPackageName())));
                }

                @Override // co.hyperverge.hypersnapsdk.listeners.PermDialogCallback
                public void onCancel() {
                    HVError hVError = new HVError(4, "Following Permissions not granted by user: " + TextUtils.join(",", status.denied));
                    if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                        SDKInternalConfig.getInstance().getAnalyticsTrackerService().logCameraPermissionsRejected(hVError, HVDocsActivity.this.permissionTimingUtils.getTimeDifferenceLong().longValue());
                    }
                    HVDocsActivity.this.callCompletionHandler(hVError, null);
                    HVDocsActivity.this.finish();
                }
            });
            return;
        }
        if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logCameraPermissionsGranted(this.permissionTimingUtils.getTimeDifferenceLong().longValue());
        }
        readyToStartDocCapture();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onResume() {
        super.onResume();
        HVMagicView hVMagicView = this.cameraView;
        if (hVMagicView != null) {
            hVMagicView.onResume();
        }
        if (getDocConfig().isShouldPerformAssistiveCapture()) {
            this.hvCardUIState = HVCardUIState.CARD_NOT_DETECTED;
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("docConfig", new com.google.gson.e().t(this.docConfig));
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onStart() {
        super.onStart();
        String str = TAG;
        Log.d(str, "onStart() called");
        Log.d(str, "onStart: docConfig.isShouldShowInstructionPage(): " + getDocConfig().isShouldShowInstructionPage() + "\ndocConfig.isDocumentUploadEnabled(): " + getDocConfig().isDocumentUploadEnabled() + "\nisDocCaptureFlow: " + this.isDocCaptureFlow + "\nisFromRetake: false");
        decideWhatToShow(false);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity, androidx.appcompat.app.d
    public /* bridge */ /* synthetic */ boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }

    public void removeScanningIndicator() {
        ScanningIndicator scanningIndicator = this.indicator;
        if (scanningIndicator != null) {
            this.cameraContainer.removeView(scanningIndicator);
            if (this.cameraContainer.isInLayout()) {
                return;
            }
            this.cameraContainer.requestLayout();
        }
    }

    public void sendResponse(HVError hVError) {
        Log.d(TAG, "sendResponse() called with: documentImageListener: " + CallbackProvider.get().injectDocCaptureCallback() + "error = [" + hVError + "]");
        callCompletionHandler(hVError, null);
        DocOCRHelper.destroy();
        finish();
    }

    public void setCameraButtonTint() {
        if (!getDocConfig().isShouldAllowPhoneTilt() || this.isPhoneTilted) {
            return;
        }
        if (this.mLocation == null && HyperSnapSDK.getInstance().getHyperSnapSDKConfig().isShouldUseLocation()) {
            return;
        }
        HyperSnapUIConfigUtil.getInstance().customiseCaptureButton(this.btCapture);
    }

    public void setDescText() {
        if (this.isPhoneTilted) {
            this.descText.setText(getStringFromResources(R.string.docCaptureTilt));
            this.descText.setTextColor(getResources().getColor(R.color.text_red));
            return;
        }
        this.descText.setTextColor(getResources().getColor(R.color.content_text_color));
        if (getDocConfig().getDocCaptureDescription() == null || getDocConfig().getDocCaptureDescription().isEmpty()) {
            this.descText.setText(getStringFromResources(R.string.docCaptureDescription));
        } else {
            this.descText.setText(getDocConfig().getDocCaptureDescription());
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    boolean shouldAllowActivityClose() {
        return this.shouldAllowActivityClose;
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    boolean shouldShowCloseAlert() {
        return getDocConfig().isDocumentUploadEnabled() ? getDocConfig().shouldShowCloseAlert() && this.docInstructionsLayout.getVisibility() == 0 : getDocConfig().shouldShowCloseAlert();
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public /* bridge */ /* synthetic */ void showCameraPermissionBS(Spanned spanned, Spanned spanned2, Spanned spanned3, PermDialogCallback permDialogCallback) {
        super.showCameraPermissionBS(spanned, spanned2, spanned3, permDialogCallback);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public /* bridge */ /* synthetic */ void showNetworkRetryBS(NetworkRetryDialogCallback networkRetryDialogCallback) {
        super.showNetworkRetryBS(networkRetryDialogCallback);
    }

    public void startRetakeScreen(String str, String str2) {
        Log.d(TAG, "startErrorReviewScreen() called with: filePath = [" + str + "], message = [" + str2 + "]");
        try {
            Intent intent = new Intent(this, (Class<?>) HVRetakeActivity.class);
            intent.putExtra(HVRetakeActivity.IMAGE_URI_TAG, str);
            intent.putExtra(HVRetakeActivity.ASPECT_RATIO_TAG, this.document.getAspectRatio());
            intent.putExtra(HVRetakeActivity.CONFIG_TAG, getDocConfig());
            intent.putExtra(HVRetakeActivity.SET_PADDING_TAG, getDocConfig().isShouldSetPadding());
            intent.putExtra(HVRetakeActivity.RETRY_MESSAGE_TAG, str2);
            intent.putExtra(HVRetakeActivity.EXTRA_PADDING_TAG, this.padding);
            intent.putExtra(HVRetakeActivity.CALLING_ACTIVITY_TAG, HVRetakeActivity.DOC_CALLING_ACTIVITY_VALUE);
            RectPortHoleView rectPortHoleView = this.documentCaptureView;
            if (rectPortHoleView != null) {
                intent.putExtra("viewWidth", rectPortHoleView.getWidth());
                intent.putExtra("viewHeight", this.documentCaptureView.getHeight());
            }
            startActivityForResult(intent, 1);
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    public void startReviewScreen(String str, String str2) {
        Log.d(TAG, "startReviewScreen() called with: filePath = [" + str + "]");
        try {
            Intent intent = new Intent(this, (Class<?>) HVDocReviewActivity.class);
            intent.putExtra(HVRetakeActivity.IMAGE_URI_TAG, str);
            if (getDocConfig().isShouldReadNIDQR() && !StringUtils.isEmptyOrNull(str2) && new File(str2).exists()) {
                intent.putExtra("qrCodeCroppedImageUri", str2);
            }
            intent.putExtra(HVRetakeActivity.ASPECT_RATIO_TAG, this.document.getAspectRatio());
            intent.putExtra(HVDocConfig.KEY, getDocConfig());
            intent.putExtra(HVRetakeActivity.EXTRA_PADDING_TAG, this.padding);
            RectPortHoleView rectPortHoleView = this.documentCaptureView;
            if (rectPortHoleView != null) {
                intent.putExtra("viewWidth", rectPortHoleView.getWidth());
                intent.putExtra("viewHeight", this.documentCaptureView.getHeight());
            }
            intent.putExtra(CustomTextStringConst.DocCaptureTextConfigs.DOC_LOADER_DESC, TextConfigUtils.getText(getDocConfig().getCustomUIStrings(), CustomTextStringConst.DocCaptureTextConfigs.DOC_LOADER_DESC, CustomTextStringConst.DocCaptureTextConfigs.TEXT_CONFIG_DOC_LOADER_DESC, getStringFromResources(R.string.hv_doc_loader_subtitle)));
            intent.putExtra("isDocCaptureFlow", this.isDocCaptureFlow);
            startActivityForResult(intent, 1);
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
                SDKInternalConfig.getInstance().getAnalyticsTrackerService().logDocumentReviewScreenLoadFailure(new HVError(2, Utils.getErrorMessage(e10)));
            }
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    public void stopCamera() {
        HVMagicView hVMagicView = this.cameraView;
        if (hVMagicView != null) {
            hVMagicView.setSensorCallback(null);
            this.cameraView.onDestroy();
            this.cameraView.onPause();
        }
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVBaseActivity
    public /* bridge */ /* synthetic */ Context updateBaseContextLocale(Context context) {
        return super.updateBaseContextLocale(context);
    }
}
