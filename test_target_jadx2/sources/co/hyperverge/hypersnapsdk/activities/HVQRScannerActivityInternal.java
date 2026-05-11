package co.hyperverge.hypersnapsdk.activities;

import E7.b;
import F7.b;
import Z8.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.AbstractC1480b;
import co.hyperverge.hvcamera.HVCamHost;
import co.hyperverge.hvcamera.HVMagicView;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine;
import co.hyperverge.hvqrmodule.objects.HVQRConfig;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.activities.HVQRScannerActivityInternal;
import co.hyperverge.hypersnapsdk.components.camera.CommonCameraManager;
import co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.HyperCameraX;
import co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.models.HyperCameraXConfig;
import co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperCameraPosition;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperDefaultZoomConfig;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.HyperPreviewConfig;
import co.hyperverge.hypersnapsdk.helpers.CustomTextStringConst;
import co.hyperverge.hypersnapsdk.helpers.HVCameraHelper;
import co.hyperverge.hypersnapsdk.helpers.HVLottieHelper;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.listeners.PermDialogCallback;
import co.hyperverge.hypersnapsdk.listeners.QRCodeCompletionHandler;
import co.hyperverge.hypersnapsdk.model.HVJSONObject;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.providers.CallbackProvider;
import co.hyperverge.hypersnapsdk.utils.BarcodeAnalyzer;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.HyperSnapUIConfigUtil;
import co.hyperverge.hypersnapsdk.utils.InsetUtils;
import co.hyperverge.hypersnapsdk.utils.InternalToolUtils;
import co.hyperverge.hypersnapsdk.utils.PermissionManager;
import co.hyperverge.hypersnapsdk.utils.PicassoManager;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import co.hyperverge.hypersnapsdk.utils.TextConfigUtils;
import co.hyperverge.hypersnapsdk.utils.UIUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import co.hyperverge.hypersnapsdk.views.CrossHairView;
import co.hyperverge.hypersnapsdk.views.RoundedRectangleView;
import co.hyperverge.hypersnapsdk.views.ScanningIndicator;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import g9.C3201a;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HVQRScannerActivityInternal extends HVQRBaseActivity {
    private static final String ARG_HV_QR_CONFIG = "hv_qr_config";
    private static final String TAG = "co.hyperverge.hypersnapsdk.activities.HVQRScannerActivityInternal";
    private Z8.b barcodeScannerOptions;
    private int camViewHeight;
    private int camViewWidth;
    private FrameLayout cameraContainer;
    private HVMagicView cameraView;
    private CommonCameraManager commonCameraManager;
    private Bitmap croppedBitmap;
    private CrossHairView crossHairView;
    private float density;
    private F7.b detector;
    private HVQRConfig hvqrConfig;
    private HyperCameraX hyperCameraX;
    private ScanningIndicator indicator;
    private float lastTouchX;
    private float lastTouchY;
    private PermissionManager permissionManager;
    private androidx.camera.view.m previewView;
    private ConstraintLayout rlInstructions;
    private RoundedRectangleView rrView;
    private MaterialButton skipButton;
    private TextView tvHint;
    private final String camViewTag = "qrCaptureCameraPreview";
    private boolean barcodeAvailable = false;
    private boolean isTestCountdownTimerFinished = false;
    private boolean overrideCameraX = false;
    private boolean isCheckingCamera = false;
    private final HVCamHost camHost = new HVCamHost() { // from class: co.hyperverge.hypersnapsdk.activities.HVQRScannerActivityInternal.1
        @Override // co.hyperverge.hvcamera.HVCamHost
        public void flashScreen() {
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
            return null;
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public String getPhotoFilename() {
            return null;
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public float getPictureMegapixels() {
            return 1.3f;
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
            return false;
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
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onFlashNull() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onFlashOff() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onFlashOn() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onFlashTorchOn() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onLayoutChange() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onNewPreviewFrame(byte[] bArr, int i10, int i11, int i12, int i13, byte[] bArr2) {
            Bitmap barcodeImageBitmap;
            if (HVQRScannerActivityInternal.this.barcodeAvailable || HVQRScannerActivityInternal.this.detector == null || !HVQRScannerActivityInternal.this.detector.b()) {
                return;
            }
            E7.b a10 = new b.a().c(ByteBuffer.wrap(bArr), i10, i11, 17).a();
            if (InternalToolUtils.isTestMode(HVQRScannerActivityInternal.this) && HVQRScannerActivityInternal.this.isTestCountdownTimerFinished && (barcodeImageBitmap = InternalToolUtils.getBarcodeImageBitmap()) != null) {
                a10 = new b.a().b(barcodeImageBitmap).a();
            }
            SparseArray a11 = HVQRScannerActivityInternal.this.detector.a(a10);
            if (a11.size() != 0) {
                F7.a aVar = (F7.a) a11.valueAt(0);
                String str = aVar.f2567b;
                HVQRScannerActivityInternal.this.barcodeAvailable = true;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", "success");
                    jSONObject.put("qr-code", aVar.f2567b);
                    HVQRScannerActivityInternal.this.sendResponse(jSONObject, null);
                } catch (JSONException e10) {
                    HVLogUtils.e(HVQRScannerActivityInternal.TAG, "initErrorMonitoring(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                    Log.e(HVQRScannerActivityInternal.TAG, Utils.getErrorMessage(e10));
                }
            }
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onPictureFailed() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onPictureReady(byte[] bArr) {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onPictureSaved(File file) {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onPictureSizeSet(int i10, int i11) {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onPictureTaken() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onReady() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onVideoSaved(File file) {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void onViewDimensionChange(int i10, int i11) {
            HVQRScannerActivityInternal.this.onViewDimensionChangeHelper(i10, i11);
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void setScreenFlashOff() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void setScreenFlashOn() {
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void showCrossHair(float f10, float f11, boolean z10) {
            HVQRScannerActivityInternal.this.showCrossHairHelper(f10, f11, z10);
        }

        @Override // co.hyperverge.hvcamera.HVCamHost
        public void zoomMaxLevel(int i10) {
        }
    };
    private final HyperCameraXHost hyperCameraXHost = new AnonymousClass2();

    /* renamed from: co.hyperverge.hypersnapsdk.activities.HVQRScannerActivityInternal$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$co$hyperverge$hvqrmodule$objects$HVQRConfig$HVBarcodeType;

        static {
            int[] iArr = new int[HVQRConfig.HVBarcodeType.values().length];
            $SwitchMap$co$hyperverge$hvqrmodule$objects$HVQRConfig$HVBarcodeType = iArr;
            try {
                iArr[HVQRConfig.HVBarcodeType.QR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$co$hyperverge$hvqrmodule$objects$HVQRConfig$HVBarcodeType[HVQRConfig.HVBarcodeType.AZTEC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$co$hyperverge$hvqrmodule$objects$HVQRConfig$HVBarcodeType[HVQRConfig.HVBarcodeType.DATA_MATRIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$co$hyperverge$hvqrmodule$objects$HVQRConfig$HVBarcodeType[HVQRConfig.HVBarcodeType.PDF417.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void addCrossHairView(FrameLayout frameLayout) {
        HVLogUtils.d(TAG, "addCrossHairView() called with: cameraContainer = [" + frameLayout + "]");
        CrossHairView crossHairView = new CrossHairView(this);
        this.crossHairView = crossHairView;
        frameLayout.addView(crossHairView);
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: co.hyperverge.hypersnapsdk.activities.T0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$addCrossHairView$7;
                lambda$addCrossHairView$7 = HVQRScannerActivityInternal.this.lambda$addCrossHairView$7(view, motionEvent);
                return lambda$addCrossHairView$7;
            }
        });
    }

    private void addHintTextView() {
        HVLogUtils.d(TAG, "addHintTextView() called");
        this.tvHint = (TextView) findViewById(R.id.tvHint);
        if (this.hvqrConfig.getCustomUIStrings() != null) {
            this.tvHint.setText(TextConfigUtils.getText(this.hvqrConfig.getCustomUIStrings(), BuildConfig.FLAVOR, CustomTextStringConst.QRScanTextConfigs.TEXT_CONFIG_QR_CAPTURE_SUB_TEXT, getString(R.string.hv_qr_capture_info_label)));
        }
        this.tvHint.setBackgroundResource(R.drawable.hv_rounded_button_white);
        int dpToPx = UIUtils.dpToPx(this, 12.0f);
        int dpToPx2 = UIUtils.dpToPx(this, 4.0f);
        this.tvHint.setPadding(dpToPx, dpToPx2, dpToPx, dpToPx2);
        this.tvHint.setTextColor(androidx.core.content.a.c(this, R.color.title_text_color));
        this.tvHint.setTextSize(12.0f);
        this.tvHint.setGravity(49);
        this.tvHint.setVisibility(0);
        this.cameraContainer.removeView(this.tvHint);
        this.cameraContainer.addView(this.tvHint, new FrameLayout.LayoutParams(-2, -2, 1));
    }

    private void adjustCrossHairView() {
        HVLogUtils.d(TAG, "adjustCrossHairView() called");
        if (this.crossHairView.getParent() != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.crossHairView.getLayoutParams();
            layoutParams.height = this.camViewHeight;
            layoutParams.width = this.camViewWidth;
            if (shouldUseCameraX()) {
                this.crossHairView.setX(this.previewView.getX());
                this.crossHairView.setY(this.previewView.getY());
            } else {
                this.crossHairView.setX(this.cameraView.getX());
                this.crossHairView.setY(this.cameraView.getY());
            }
            this.crossHairView.requestLayout();
        }
        this.cameraContainer.requestLayout();
    }

    private void adjustQRScannerView() {
        HVLogUtils.d(TAG, "adjustQRScannerView() called");
        if (this.rrView.getParent() != null) {
            String backgroundImage = HyperSnapUIConfigUtil.getInstance().getConfig().getBackgroundImage();
            if (!StringUtils.isEmptyOrNull(backgroundImage)) {
                PicassoManager.getInstance(this).getBitmap(backgroundImage, new PicassoManager.ImageDownloaderCallback() { // from class: co.hyperverge.hypersnapsdk.activities.HVQRScannerActivityInternal.4
                    @Override // co.hyperverge.hypersnapsdk.utils.PicassoManager.ImageDownloaderCallback
                    public void onError(String str) {
                    }

                    @Override // co.hyperverge.hypersnapsdk.utils.PicassoManager.ImageDownloaderCallback
                    public void onSuccess(Bitmap bitmap) {
                        if (bitmap == null || HVQRScannerActivityInternal.this.cameraContainer == null || HVQRScannerActivityInternal.this.cameraContainer.getWidth() <= 0 || HVQRScannerActivityInternal.this.cameraContainer.getHeight() <= 0) {
                            return;
                        }
                        HVQRScannerActivityInternal hVQRScannerActivityInternal = HVQRScannerActivityInternal.this;
                        hVQRScannerActivityInternal.croppedBitmap = UIUtils.cropImageFromView(bitmap, hVQRScannerActivityInternal.findViewById(R.id.flCameraContainer));
                        HVQRScannerActivityInternal.this.rrView.setBackgroundImage(HVQRScannerActivityInternal.this.croppedBitmap);
                        HyperSnapUIConfigUtil.getInstance().customiseBackgroundImage(HVQRScannerActivityInternal.this.findViewById(R.id.hvBackgroundContainer));
                    }
                });
            }
            int i10 = this.camViewWidth;
            int bottomYOfBox = getBottomYOfBox() - getTopYOfBox();
            int i11 = (int) (this.camViewWidth * 0.15d);
            this.rrView.setY(0.0f);
            float f10 = i11;
            float f11 = bottomYOfBox - i11;
            this.rrView.setBoxRect(new RectF(f10, f10, i10 - i11, f11), 0.1f);
            this.rrView.requestLayout();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.indicator.getLayoutParams();
            layoutParams.setMargins(0, i11, 0, 0);
            this.indicator.setLayoutParams(layoutParams);
            this.indicator.setmHeight(bottomYOfBox - (i11 * 2));
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.tvHint.getLayoutParams();
            this.tvHint.setY(f11 - (r1.getMeasuredHeight() * 1.5f));
            this.tvHint.setLayoutParams(layoutParams2);
        }
        this.cameraContainer.requestLayout();
        this.indicator.startAnimation();
        HyperSnapUIConfigUtil.getInstance().customiseSecondaryButton((Button) this.skipButton);
    }

    private void adjustSkipButton() {
        HVLogUtils.d(TAG, "adjustSkipButton() called");
        this.cameraContainer.removeView(this.skipButton);
        this.cameraContainer.addView(this.skipButton, new FrameLayout.LayoutParams(-2, -2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkCameraAndHandleCompletion, reason: merged with bridge method [inline-methods] */
    public void lambda$checkCameraAndHandleCompletion$3(final HVError hVError, final JSONObject jSONObject) {
        if (this.isCheckingCamera) {
            HVLogUtils.d(TAG, "checkCameraAndHandleCompletion: already checking");
            return;
        }
        if (!isCameraReleased()) {
            new Handler().postDelayed(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.N0
                @Override // java.lang.Runnable
                public final void run() {
                    HVQRScannerActivityInternal.this.lambda$checkCameraAndHandleCompletion$3(hVError, jSONObject);
                }
            }, 20L);
            return;
        }
        this.isCheckingCamera = true;
        QRCodeCompletionHandler injectQRCodeCallback = CallbackProvider.get().injectQRCodeCallback();
        if (injectQRCodeCallback != null) {
            HVQRConfig hVQRConfig = this.hvqrConfig;
            HVQRBaseActivity.callCompletionHandler(hVQRConfig != null ? hVQRConfig.getModuleId() : null, this, injectQRCodeCallback, hVError, jSONObject);
        }
        HVMagicView hVMagicView = this.cameraView;
        if (hVMagicView != null) {
            hVMagicView.clearHandlers();
            this.cameraView = null;
        }
        finish();
    }

    private void configureCloseButton(ImageView imageView) {
        HVLogUtils.d(TAG, "configureCloseButton() called with: closeIconView = [" + imageView + "]");
        if (imageView == null) {
            return;
        }
        HVQRConfig hVQRConfig = this.hvqrConfig;
        boolean z10 = hVQRConfig != null && hVQRConfig.shouldShowCloseIcon();
        imageView.setVisibility(z10 ? 0 : 8);
        if (z10) {
            HyperSnapUIConfigUtil.getInstance().customiseCloseButtonIcon(imageView);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.S0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVQRScannerActivityInternal.this.lambda$configureCloseButton$0(view);
            }
        });
    }

    private void createQRCamera() {
        HVLogUtils.d(TAG, "createQRCamera() called");
        HVCameraHelper.enableCameraParameters(this, true, shouldUseCameraX());
        CameraEngine.setPreviewCallback(true);
        CameraEngine.setCaptureMode(true);
        setupRRViewAndIndicator();
        HVMagicView hVMagicView = HVMagicView.getInstance(this, this.camHost, false);
        this.cameraView = hVMagicView;
        hVMagicView.setContentDescription("qrCaptureCameraPreview");
        this.cameraView.disableRotation();
        F7.b a10 = new b.a(getApplicationContext()).b(getBarcodeFormat()).a();
        this.detector = a10;
        if (!a10.b()) {
            sendResponse(null, new HVError(60, "QR Scanner detector not available. Please try again after sometime "));
            return;
        }
        this.cameraContainer.addView(this.cameraView);
        this.commonCameraManager = new CommonCameraManager(this.cameraView, this.hyperCameraX);
        addCrossHairView(this.cameraContainer);
        adjustCrossHairView();
        setupSharedUIComponents();
    }

    private void findViews() {
        HVLogUtils.d(TAG, "findViews() called");
        this.cameraContainer = (FrameLayout) findViewById(R.id.flCameraContainer);
        this.rlInstructions = (ConstraintLayout) findViewById(R.id.layoutQRInstructions);
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.btnSkip);
        this.skipButton = materialButton;
        materialButton.setEnabled(true);
        ImageView imageView = (ImageView) findViewById(R.id.ivBack);
        ImageView imageView2 = (ImageView) this.rlInstructions.findViewById(R.id.ivBack);
        ImageView imageView3 = (ImageView) this.rlInstructions.findViewById(R.id.ivClose);
        if (imageView3 != null) {
            configureCloseButton(imageView3);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.ivClose);
        if (imageView4 != null) {
            configureCloseButton(imageView4);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.P0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVQRScannerActivityInternal.this.lambda$findViews$4(view);
            }
        };
        imageView.setOnClickListener(onClickListener);
        imageView2.setOnClickListener(onClickListener);
        if (!this.hvqrConfig.shouldShowModuleBackButton()) {
            if (this.hvqrConfig.shouldShowInstructions()) {
                imageView2.setVisibility(4);
            } else {
                imageView.setVisibility(4);
            }
        }
        Button button = (Button) this.rlInstructions.findViewById(R.id.btnProceed);
        button.setEnabled(true);
        button.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.Q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVQRScannerActivityInternal.this.lambda$findViews$5(view);
            }
        });
        this.skipButton.setOnClickListener(new View.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.activities.R0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HVQRScannerActivityInternal.this.lambda$findViews$6(view);
            }
        });
    }

    private int getBarcodeFormat() {
        int i10 = AnonymousClass7.$SwitchMap$co$hyperverge$hvqrmodule$objects$HVQRConfig$HVBarcodeType[this.hvqrConfig.getHVBarcodeType().ordinal()];
        if (i10 == 1) {
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (i10 == 2) {
            return 4096;
        }
        if (i10 != 3) {
            return i10 != 4 ? 6416 : 2048;
        }
        return 16;
    }

    private Z8.b getBarcodeScannerOptions() {
        return new b.a().b(getBarcodeFormat(), new int[0]).a();
    }

    private int getBottomYOfBox() {
        int i10 = (int) getBoxRect().bottom;
        HVLogUtils.d(TAG, "getBottomYOfBox() returned: " + i10);
        return i10;
    }

    private RectF getBoxRect() {
        int i10;
        int i11;
        String str = TAG;
        HVLogUtils.d(str, "getBoxRect() called");
        float aspectRatio = this.hvqrConfig.getHVBarcodeType().getAspectRatio();
        int width = this.cameraContainer.getWidth();
        int min = Math.min(this.camViewHeight, this.cameraContainer.getHeight());
        if (aspectRatio <= 1.0f) {
            i11 = (int) (aspectRatio * width);
            i10 = width;
        } else {
            i10 = (int) (min / aspectRatio);
            i11 = min;
        }
        RectF rectF = new RectF((width - i10) / 2, (min - i11) / 2, (width + i10) / 2, (min + i11) / 2);
        HVLogUtils.d(str, "getBoxRect() returned: " + rectF);
        return rectF;
    }

    private int getTopYOfBox() {
        int i10 = (int) getBoxRect().top;
        HVLogUtils.d(TAG, "getTopYOfBox() returned: " + i10);
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$addCrossHairView$7(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.lastTouchX = motionEvent.getX();
            this.lastTouchY = motionEvent.getY();
        } else if (actionMasked == 1 && Math.abs(motionEvent.getX() - this.lastTouchX) < 20.0f && Math.abs(motionEvent.getY() - this.lastTouchY) < 20.0f) {
            this.crossHairView.showCrosshair(motionEvent.getX(), motionEvent.getY(), false);
            if (shouldUseCameraX()) {
                this.previewView.onTouchEvent(motionEvent);
            } else {
                this.cameraView.onTouchToFocus(motionEvent.getX() / this.camViewWidth, motionEvent.getY() / this.camViewHeight, null);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureCloseButton$0(View view) {
        performCloseAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$findViews$4(View view) {
        closeScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$findViews$5(View view) {
        view.setEnabled(false);
        showInstructions(false);
        checkForPermissions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$findViews$6(View view) {
        view.setEnabled(false);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "skipped");
            jSONObject.put("qr-code", BuildConfig.FLAVOR);
            sendResponse(jSONObject, null);
        } catch (Exception e10) {
            String str = TAG;
            HVLogUtils.e(str, "findViews(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendResponse$2(HVError hVError, JSONObject jSONObject) {
        stopCamera();
        this.isTestCountdownTimerFinished = false;
        lambda$checkCameraAndHandleCompletion$3(hVError, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startQRCapture$1() {
        this.skipButton.setVisibility(0);
    }

    private void loadAnimation() {
        HVLogUtils.d(TAG, "loadAnimation() called");
        HVLottieHelper.load((LottieAnimationView) findViewById(R.id.lavQRInstructions), HVLottieHelper.QR_INSTRUCTION, HVLottieHelper.State.START, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onViewDimensionChangeHelper(int i10, int i11) {
        HVLogUtils.d(TAG, "onViewDimensionChange() called with: width = [" + i10 + "], height = [" + i11 + "]");
        this.camViewHeight = i11;
        this.camViewWidth = i10;
        adjustQRScannerView();
        adjustCrossHairView();
    }

    private void performCloseAction() {
        HVLogUtils.d(TAG, "performCloseAction() called");
        sendResponse(null, new HVError(44, getResources().getString(R.string.sdk_close_error)));
    }

    private void setupCameraX() {
        HVLogUtils.d(TAG, "setupCameraX() called");
        HVCameraHelper.enableCameraParameters(this, true, shouldUseCameraX());
        setupRRViewAndIndicator();
        androidx.camera.view.m mVar = new androidx.camera.view.m(this);
        this.previewView = mVar;
        mVar.setContentDescription("qrCaptureCameraPreview");
        this.cameraContainer.addView(this.previewView);
        addCrossHairView(this.cameraContainer);
        adjustCrossHairView();
        this.barcodeScannerOptions = getBarcodeScannerOptions();
        try {
            this.hyperCameraX = new HyperCameraX(this, this.previewView, this.hyperCameraXHost, new HyperCameraXConfig(HyperCameraPosition.BACK, new HyperDefaultZoomConfig(), new HyperPreviewConfig(true, true, false, false)));
            this.commonCameraManager = new CommonCameraManager(this.cameraView, this.hyperCameraX);
            setupSharedUIComponents();
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "Failed to start CameraX, falling back to HVCamera: " + e10.getMessage());
            androidx.camera.view.m mVar2 = this.previewView;
            if (mVar2 != null) {
                this.cameraContainer.removeView(mVar2);
                this.previewView = null;
            }
            if (this.hyperCameraX != null) {
                this.hyperCameraX = null;
            }
            this.overrideCameraX = true;
            createQRCamera();
        }
    }

    private void setupRRViewAndIndicator() {
        this.rrView = new RoundedRectangleView(this);
        this.indicator = new ScanningIndicator(this, getBottomYOfBox() - getTopYOfBox());
    }

    private void setupSharedUIComponents() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (UIUtils.getScreenWidth() * 0.7d), UIUtils.dpToPx(this, 15.0f));
        layoutParams.gravity = 1;
        this.indicator.setLayoutParams(layoutParams);
        this.indicator.setImageResource(R.drawable.hv_ic_camera_qr_status);
        this.cameraContainer.addView(this.indicator);
        this.rrView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.cameraContainer.addView(this.rrView);
        addHintTextView();
        adjustQRScannerView();
        this.commonCameraManager.startCamera(TAG);
        HyperSnapUIConfigUtil.getInstance().customiseDocumentSideTextView((TextView) findViewById(R.id.tvHint));
        HyperSnapUIConfigUtil.getInstance().customiseBrandingColor((TextView) findViewById(R.id.tvBranding));
        if (InternalToolUtils.isTestMode(this)) {
            new CountDownTimer(this.hvqrConfig.getSkipButtonDelay() + 2000, 1000L) { // from class: co.hyperverge.hypersnapsdk.activities.HVQRScannerActivityInternal.5
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    HVQRScannerActivityInternal.this.isTestCountdownTimerFinished = true;
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j10) {
                }
            }.start();
        }
    }

    private boolean shouldUseCameraX() {
        boolean z10 = SDKInternalConfig.getInstance().shouldUseCameraX() && !this.overrideCameraX;
        return (!z10 || this.hvqrConfig.shouldUseCameraX() == null) ? z10 : this.hvqrConfig.shouldUseCameraX().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCrossHairHelper(final float f10, final float f11, final boolean z10) {
        HVLogUtils.d(TAG, "showCrossHair() called with: x = [" + f10 + "], y = [" + f11 + "], b = [" + z10 + "]");
        if (this.crossHairView != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.HVQRScannerActivityInternal.3
                @Override // java.lang.Runnable
                public void run() {
                    if (f10 > 0.0f || f11 > 0.0f) {
                        HVQRScannerActivityInternal.this.crossHairView.showCrosshair(f10 * HVQRScannerActivityInternal.this.camViewWidth, f11 * HVQRScannerActivityInternal.this.camViewHeight, z10);
                    } else {
                        HVQRScannerActivityInternal.this.crossHairView.showCrosshair(HVQRScannerActivityInternal.this.camViewWidth / 2, HVQRScannerActivityInternal.this.camViewHeight / 2, z10);
                    }
                }
            });
        }
    }

    private void showInstructions(boolean z10) {
        HVLogUtils.d(TAG, "showInstructions() called with: show = [" + z10 + "]");
        this.rlInstructions.setVisibility(z10 ? 0 : 8);
        if (z10) {
            TextView textView = (TextView) this.rlInstructions.findViewById(R.id.tvTitle);
            HyperSnapUIConfigUtil.getInstance().customiseTitleTextView(textView);
            TextView textView2 = (TextView) this.rlInstructions.findViewById(R.id.tvSubtitle);
            HyperSnapUIConfigUtil.getInstance().customiseDescriptionTextView(textView2);
            Button button = (Button) this.rlInstructions.findViewById(R.id.btnProceed);
            button.setEnabled(true);
            HyperSnapUIConfigUtil.getInstance().customisePrimaryButton(button);
            HyperSnapUIConfigUtil.getInstance().customiseBackgroundImage(this.rlInstructions);
            HyperSnapUIConfigUtil.getInstance().customiseBackButtonIcon((ImageView) this.rlInstructions.findViewById(R.id.ivBack));
            HyperSnapUIConfigUtil.getInstance().customiseClientLogo((ImageView) this.rlInstructions.findViewById(R.id.clientLogo));
            HyperSnapUIConfigUtil.getInstance().customiseBrandingColor((TextView) this.rlInstructions.findViewById(R.id.tvBranding));
            setupBranding(this.rlInstructions);
            HVJSONObject customUIStrings = this.hvqrConfig.getCustomUIStrings();
            if (customUIStrings != null) {
                Spanned text = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.QRScanTextConfigs.TEXT_CONFIG_QR_INSTRUCTIONS_TITLE, getString(R.string.hv_qr_instruction_title));
                if (text != null) {
                    textView.setText(text);
                }
                Spanned text2 = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.QRScanTextConfigs.TEXT_CONFIG_QR_INSTRUCTIONS_DESC, getString(R.string.hv_qr_instruction_subtitle));
                if (text2 != null) {
                    textView2.setText(text2);
                }
                Spanned text3 = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.QRScanTextConfigs.TEXT_CONFIG_QR_INSTRUCTIONS_BUTTON, getString(R.string.hv_proceed_to_scan_qr));
                if (text3 != null) {
                    button.setText(text3);
                }
            }
            loadAnimation();
        }
    }

    public static void start(Context context, HVQRConfig hVQRConfig, QRCodeCompletionHandler qRCodeCompletionHandler) {
        HVLogUtils.d(TAG, "start() called with: context = [" + context + "], config = [" + hVQRConfig + "], handler = [" + qRCodeCompletionHandler + "]");
        Intent intent = new Intent(context, (Class<?>) HVQRScannerActivityInternal.class);
        if (hVQRConfig == null) {
            hVQRConfig = new HVQRConfig();
        }
        intent.putExtra(ARG_HV_QR_CONFIG, hVQRConfig);
        CallbackProvider.get().setCallback(qRCodeCompletionHandler);
        context.startActivity(intent);
    }

    public void checkForPermissions() {
        HVLogUtils.d(TAG, "checkForPermissions() called");
        ArrayList arrayList = new ArrayList(Collections.singletonList("android.permission.CAMERA"));
        this.permissionManager.checkAndRequestPermissions(this, arrayList);
        if (this.permissionManager.getStatus(this, arrayList).denied.isEmpty()) {
            startQRCapture();
        }
    }

    public void closeScreen() {
        HVLogUtils.d(TAG, "closeScreen() called");
        boolean shouldShowModuleBackButton = this.hvqrConfig.shouldShowModuleBackButton();
        boolean shouldShowInstructions = this.hvqrConfig.shouldShowInstructions();
        boolean z10 = this.rlInstructions.getVisibility() == 0;
        if (shouldShowModuleBackButton || (shouldShowInstructions && !z10)) {
            if (!shouldShowInstructions || z10) {
                sendResponse(null, new HVError(3, getResources().getString(R.string.operation_cancelled)));
            } else {
                showInstructions(true);
            }
        }
    }

    public boolean isCameraReleased() {
        CommonCameraManager commonCameraManager = this.commonCameraManager;
        if (commonCameraManager != null) {
            return commonCameraManager.isCameraReleased();
        }
        HVLogUtils.e(TAG, "isCameraReleased: commonCameraManager is null, returning true");
        return true;
    }

    @Override // androidx.activity.f, android.app.Activity
    public void onBackPressed() {
        HVLogUtils.d(TAG, "onBackPressed() called");
        closeScreen();
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVQRBaseActivity, androidx.appcompat.app.d, androidx.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HVLogUtils.d(TAG, "onConfigurationChanged: newConfig = " + configuration);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVQRBaseActivity, androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = TAG;
        HVLogUtils.d(str, "onCreate() called with: savedInstanceState = [" + bundle + "]");
        setContentView(R.layout.hv_activity_qrscanner);
        new InsetUtils().applySystemInsets(getWindow(), findViewById(R.id.hvBackgroundContainer), R.id.hv_qr);
        if (bundle != null) {
            HVLogUtils.d(str, "onCreate() savedInstance is not null, finishing activity");
            this.hvqrConfig = (HVQRConfig) new com.google.gson.e().k(bundle.getString("hvqrConfig"), HVQRConfig.class);
            if (HVQrScannerActivity.isApplicationRecreated) {
                this.permissionManager = new PermissionManager();
                ArrayList arrayList = new ArrayList(Arrays.asList("android.permission.CAMERA"));
                this.permissionManager.checkAndRequestPermissions(this, arrayList, false);
                PermissionManager.StatusArray status = this.permissionManager.getStatus(this, arrayList);
                if (!status.denied.isEmpty()) {
                    HVBaseActivity.resetStateForCompletion(this.hvqrConfig.getModuleId(), HVQrScannerActivity.getAppFilesDir(this), new HVError(45, getResources().getString(R.string.hv_permission_revoked_error) + " " + TextUtils.join(",", status.denied)), null);
                    finish();
                    return;
                }
            }
        }
        getWindow().getDecorView().getRootView().setTag("qrCaptureCameraPreview");
        HVQRConfig hVQRConfig = (HVQRConfig) getIntent().getSerializableExtra(ARG_HV_QR_CONFIG);
        this.hvqrConfig = hVQRConfig;
        if (hVQRConfig == null) {
            HVError hVError = new HVError(6, getResources().getString(R.string.qr_config_error));
            HVLogUtils.d(str, "start: error = [" + hVError + "]");
            HVQRConfig hVQRConfig2 = this.hvqrConfig;
            HVQRBaseActivity.callCompletionHandler(hVQRConfig2 != null ? hVQRConfig2.getModuleId() : null, this, CallbackProvider.get().injectQRCodeCallback(), hVError, null);
            return;
        }
        findViews();
        try {
            if (getIntent() != null && getIntent().getStringExtra("customUIStrings") != null) {
                new JSONObject(getIntent().getStringExtra("customUIStrings"));
            }
        } catch (JSONException e10) {
            String str2 = TAG;
            String message = e10.getMessage();
            Objects.requireNonNull(message);
            Log.e(str2, message);
        }
        this.permissionManager = new PermissionManager();
        showInstructions(this.hvqrConfig.shouldShowInstructions());
        TextView textView = (TextView) findViewById(R.id.tvTitle);
        HyperSnapUIConfigUtil.getInstance().customiseTitleTextView(textView, true);
        TextView textView2 = (TextView) findViewById(R.id.tvSubtitle);
        HyperSnapUIConfigUtil.getInstance().customiseDescriptionTextView(textView2, true);
        HyperSnapUIConfigUtil.getInstance().customiseBackButtonIcon((ImageView) findViewById(R.id.ivBack), true);
        HyperSnapUIConfigUtil.getInstance().customiseClientLogo((ImageView) findViewById(R.id.clientLogo), true);
        HyperSnapUIConfigUtil.getInstance().customiseBrandingColor((TextView) findViewById(R.id.tvBranding));
        if (!this.hvqrConfig.shouldShowInstructions() && !this.hvqrConfig.shouldShowModuleBackButton()) {
            findViewById(R.id.ivBack).setVisibility(4);
        }
        if (this.hvqrConfig.getCustomUIStrings() != null) {
            HVJSONObject customUIStrings = this.hvqrConfig.getCustomUIStrings();
            Spanned text = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.QRScanTextConfigs.TEXT_CONFIG_QR_CAPTURE_TITLE, getString(R.string.hv_qr_capture_title));
            if (text != null) {
                textView.setText(text);
            }
            Spanned text2 = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.QRScanTextConfigs.TEXT_CONFIG_QR_CAPTURE_DESC, getString(R.string.hv_qr_capture_subtitle));
            if (text2 != null) {
                textView2.setText(text2);
            }
            Spanned text3 = TextConfigUtils.getText(customUIStrings, BuildConfig.FLAVOR, CustomTextStringConst.QRScanTextConfigs.TEXT_CONFIG_QR_CAPTURE_SKIP_TEXT, getString(R.string.hv_qr_capture_skip));
            if (text3 != null) {
                this.skipButton.setText(text3);
            }
        }
        setupBranding(null);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVQRBaseActivity, androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Bitmap bitmap = this.croppedBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.croppedBitmap.recycle();
        this.croppedBitmap = null;
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onPause() {
        super.onPause();
        String str = TAG;
        HVLogUtils.d(str, "onPause() called");
        CommonCameraManager commonCameraManager = this.commonCameraManager;
        if (commonCameraManager != null) {
            commonCameraManager.pauseCamera(str);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        HVLogUtils.d(TAG, "onRequestPermissionsResult() called with: requestCode = [" + i10 + "], permissions = [" + strArr + "], grantResults = [" + iArr + "]");
        final PermissionManager.StatusArray status = this.permissionManager.getStatus(this, new ArrayList(Collections.singletonList("android.permission.CAMERA")));
        if (status.denied.isEmpty()) {
            startQRCapture();
        } else {
            showCameraPermissionAlert(this.hvqrConfig.getCustomUIStrings(), new PermDialogCallback() { // from class: co.hyperverge.hypersnapsdk.activities.HVQRScannerActivityInternal.6
                @Override // co.hyperverge.hypersnapsdk.listeners.PermDialogCallback
                public void onActionClick() {
                    if (AbstractC1480b.y(HVQRScannerActivityInternal.this, "android.permission.CAMERA")) {
                        HVQRScannerActivityInternal.this.checkForPermissions();
                        return;
                    }
                    HVQRScannerActivityInternal.this.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + HVQRScannerActivityInternal.this.getApplicationContext().getPackageName())));
                }

                @Override // co.hyperverge.hypersnapsdk.listeners.PermDialogCallback
                public void onCancel() {
                    String join = TextUtils.join(",", status.denied);
                    HVQRScannerActivityInternal.this.sendResponse(null, new HVError(4, "Following Permissions not granted by user: " + join));
                    HVQRScannerActivityInternal.this.finish();
                }
            });
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // co.hyperverge.hypersnapsdk.activities.HVQRBaseActivity, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    public void onResume() {
        super.onResume();
        String str = TAG;
        HVLogUtils.d(str, "onResume() called");
        CommonCameraManager commonCameraManager = this.commonCameraManager;
        if (commonCameraManager != null) {
            commonCameraManager.resumeCamera(str);
        }
    }

    @Override // androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("hvqrConfig", new com.google.gson.e().t(this.hvqrConfig));
        HVLogUtils.d(TAG, "onSaveInstanceState() called with: outState = [" + bundle + "]");
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onStart() {
        super.onStart();
        HVLogUtils.d(TAG, "onStart() called");
        if (this.hvqrConfig.shouldShowInstructions() && this.rlInstructions.getVisibility() == 0) {
            return;
        }
        checkForPermissions();
    }

    public void sendResponse(final JSONObject jSONObject, final HVError hVError) {
        HVLogUtils.d(TAG, "sendResponse() called with: result = [" + jSONObject + "], error = [" + hVError + "]");
        runOnUiThread(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.O0
            @Override // java.lang.Runnable
            public final void run() {
                HVQRScannerActivityInternal.this.lambda$sendResponse$2(hVError, jSONObject);
            }
        });
    }

    public void startQRCapture() {
        HVLogUtils.d(TAG, "startQRCapture() called");
        this.density = getResources().getDisplayMetrics().density;
        new Handler().postDelayed(new Runnable() { // from class: co.hyperverge.hypersnapsdk.activities.M0
            @Override // java.lang.Runnable
            public final void run() {
                HVQRScannerActivityInternal.this.lambda$startQRCapture$1();
            }
        }, this.hvqrConfig.getSkipButtonDelay());
        if (shouldUseCameraX()) {
            setupCameraX();
        } else {
            createQRCamera();
        }
    }

    public void stopCamera() {
        String str = TAG;
        HVLogUtils.d(str, "stopCamera() called");
        MaterialButton materialButton = this.skipButton;
        if (materialButton != null) {
            materialButton.setVisibility(8);
        }
        HVMagicView hVMagicView = this.cameraView;
        if (hVMagicView != null) {
            hVMagicView.setSensorCallback(null);
        }
        CommonCameraManager commonCameraManager = this.commonCameraManager;
        if (commonCameraManager != null) {
            commonCameraManager.stopCamera(str);
        }
    }

    /* renamed from: co.hyperverge.hypersnapsdk.activities.HVQRScannerActivityInternal$2, reason: invalid class name */
    class AnonymousClass2 extends HyperCameraXHost {
        AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNewPreviewFrame$0(String str) {
            if (str == null || HVQRScannerActivityInternal.this.barcodeAvailable) {
                return;
            }
            HVQRScannerActivityInternal.this.barcodeAvailable = true;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", "success");
                jSONObject.put("qr-code", str);
                HVQRScannerActivityInternal.this.sendResponse(jSONObject, null);
            } catch (JSONException e10) {
                HVLogUtils.e(HVQRScannerActivityInternal.TAG, "initErrorMonitoring(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(HVQRScannerActivityInternal.TAG, Utils.getErrorMessage(e10));
            }
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public int getAspectRatio() {
            return 1;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public File getPhotoDirectory() {
            return null;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public String getPhotoFilename() {
            return BuildConfig.FLAVOR;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public float getPictureMegapixels() {
            return 2.0f;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public float getPreviewMegapixels() {
            return 2.0f;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public boolean isShouldCaptureHighResolutionImage() {
            return true;
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void onCameraFlipCallback() {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void onCamerasFound(int i10) {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void onLayoutChange() {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void onNewPreviewFrame(androidx.camera.core.n nVar) {
            if (HVQRScannerActivityInternal.this.barcodeAvailable) {
                nVar.close();
                return;
            }
            try {
                new BarcodeAnalyzer(HVQRScannerActivityInternal.this.barcodeScannerOptions, new BarcodeAnalyzer.BarcodeListener() { // from class: co.hyperverge.hypersnapsdk.activities.U0
                    @Override // co.hyperverge.hypersnapsdk.utils.BarcodeAnalyzer.BarcodeListener
                    public final void onBarcodeDetected(String str) {
                        HVQRScannerActivityInternal.AnonymousClass2.this.lambda$onNewPreviewFrame$0(str);
                    }
                }).analyze(nVar);
            } catch (Exception e10) {
                HVLogUtils.e(HVQRScannerActivityInternal.TAG, "onNewPreviewFrame(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(HVQRScannerActivityInternal.TAG, Utils.getErrorMessage(e10));
                HVQRScannerActivityInternal.this.sendResponse(null, new HVError(2, Utils.getErrorMessage(e10)));
            }
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void onPictureFailed() {
            HVLogUtils.d(HVQRScannerActivityInternal.TAG, "onPictureFailed() called");
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void onPictureReady(byte[] bArr) {
            HVLogUtils.d(HVQRScannerActivityInternal.TAG, "onPictureReady() called with: bytes = [" + bArr + "]");
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void onPictureSaved(File file) {
            HVLogUtils.d(HVQRScannerActivityInternal.TAG, "onPictureSaved() called with: file = [" + file + "]");
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void onPictureSizeSet(int i10, int i11) {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void onPictureTaken() {
            HVLogUtils.d(HVQRScannerActivityInternal.TAG, "onPictureTaken() called");
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void onReady() {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void onViewDimensionChange(int i10, int i11) {
            HVQRScannerActivityInternal.this.onViewDimensionChangeHelper(i10, i11);
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void showCrossHair(float f10, float f11, boolean z10) {
            HVQRScannerActivityInternal.this.showCrossHairHelper(f10, f11, z10);
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void zoomMaxLevel(int i10) {
        }

        @Override // co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.services.HyperCameraXHost
        public void onFaceDetection(C3201a[] c3201aArr) {
        }
    }
}
