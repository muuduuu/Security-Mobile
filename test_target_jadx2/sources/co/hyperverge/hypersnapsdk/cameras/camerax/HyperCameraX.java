package co.hyperverge.hypersnapsdk.cameras.camerax;

import A.AbstractC0708l0;
import A.C0706k0;
import A.D;
import A.InterfaceC0703j;
import A.InterfaceC0705k;
import A.W;
import A.X;
import A.r;
import A.r0;
import P.c;
import U.g;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.f;
import androidx.camera.core.n;
import androidx.camera.view.m;
import androidx.lifecycle.InterfaceC1599p;
import co.hyperverge.hypersnapsdk.components.camera.model.HyperCameraXConfig;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 I2\u00020\u0001:\u0001IB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\f¢\u0006\u0004\b(\u0010\u000eJ\u0017\u0010*\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b*\u0010!J\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010\u000eJ\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u000eJ\r\u0010-\u001a\u00020\f¢\u0006\u0004\b-\u0010\u000eJ\r\u0010.\u001a\u00020\f¢\u0006\u0004\b.\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0016\u00103\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0018\u00106\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0017\u0010E\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lco/hyperverge/hypersnapsdk/cameras/camerax/HyperCameraX;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "Landroidx/camera/view/m;", "previewView", "Lco/hyperverge/hypersnapsdk/cameras/camerax/HyperCameraXHost;", "hyperCameraXHost", "Lco/hyperverge/hypersnapsdk/components/camera/model/HyperCameraXConfig;", "hyperCameraXConfig", "<init>", "(Landroid/content/Context;Landroidx/camera/view/m;Lco/hyperverge/hypersnapsdk/cameras/camerax/HyperCameraXHost;Lco/hyperverge/hypersnapsdk/components/camera/model/HyperCameraXConfig;)V", BuildConfig.FLAVOR, "updateRatios", "()V", "LA/j;", "camera", "setupTouchToFocus", "(LA/j;)V", "setDimensions", "setDefaultZoom", "LA/r0;", "getPreview", "()LA/r0;", "LA/W;", "getImageCapture", "()LA/W;", "Landroidx/camera/core/f;", "getImageAnalyser", "()Landroidx/camera/core/f;", BuildConfig.FLAVOR, "filePath", "takePictureInternal", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "readFileAsBytes", "(Ljava/lang/String;)[B", BuildConfig.FLAVOR, "getAspectRatio", "()I", "startCamera", "path", "takePicture", "flipCamera", "pauseCamera", "resumeCamera", "destroyCamera", "Landroid/content/Context;", "Landroidx/camera/view/m;", "Lco/hyperverge/hypersnapsdk/cameras/camerax/HyperCameraXHost;", "Lco/hyperverge/hypersnapsdk/components/camera/model/HyperCameraXConfig;", "mRatioWidth", "I", "mRatioHeight", "preview", "LA/r0;", "imageCapture", "LA/W;", "LU/g;", "cameraProvider", "LU/g;", "LA/j;", "LA/r;", "selectedCamera", "LA/r;", BuildConfig.FLAVOR, "isPreviewPaused", "Z", "LP/c;", "resolutionSelector", "LP/c;", "getResolutionSelector", "()LP/c;", "Companion", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HyperCameraX {
    public static final int ASPECT_16_9 = 2;
    public static final int ASPECT_4_3 = 1;
    public static final int IMAGE_CAPTURE_HEIGHT = 960;
    public static final int IMAGE_CAPTURE_WIDTH = 1280;
    public static final int PREVIEW_HEIGHT = 960;
    public static final int PREVIEW_WIDTH = 1280;
    private InterfaceC0703j camera;
    private g cameraProvider;
    private final Context context;
    private final HyperCameraXConfig hyperCameraXConfig;
    private final HyperCameraXHost hyperCameraXHost;
    private W imageCapture;
    private boolean isPreviewPaused;
    private int mRatioHeight;
    private int mRatioWidth;
    private r0 preview;
    private final m previewView;
    private final P.c resolutionSelector;
    private r selectedCamera;
    private static final String TAG = HyperCameraX.class.getCanonicalName();

    public HyperCameraX(Context context, m previewView, HyperCameraXHost hyperCameraXHost, HyperCameraXConfig hyperCameraXConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(hyperCameraXHost, "hyperCameraXHost");
        Intrinsics.checkNotNullParameter(hyperCameraXConfig, "hyperCameraXConfig");
        this.context = context;
        this.previewView = previewView;
        this.hyperCameraXHost = hyperCameraXHost;
        this.hyperCameraXConfig = hyperCameraXConfig;
        this.mRatioWidth = 3;
        this.mRatioHeight = 4;
        r rVar = hyperCameraXConfig.getUseFFC() ? r.f209c : r.f210d;
        Intrinsics.checkNotNullExpressionValue(rVar, "if (hyperCameraXConfig.u…DEFAULT_BACK_CAMERA\n    }");
        this.selectedCamera = rVar;
        HVLogUtils.d(TAG, "HyperCameraX init() called");
        Object systemService = context.getSystemService("camera");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        String[] cameraIdList = ((CameraManager) systemService).getCameraIdList();
        Intrinsics.checkNotNullExpressionValue(cameraIdList, "manager.cameraIdList");
        hyperCameraXHost.onCamerasFound(cameraIdList.length);
        P.c a10 = new c.a().f(new P.d(new Size(1080, 1920), 1)).a();
        Intrinsics.checkNotNullExpressionValue(a10, "Builder()\n        .setRe…      )\n        ).build()");
        this.resolutionSelector = a10;
    }

    private final f getImageAnalyser() {
        HVLogUtils.d(TAG, "getImageAnalyser() called");
        f.c cVar = new f.c();
        if (this.hyperCameraXConfig.getUseBarcodeCapture()) {
            cVar.l(this.resolutionSelector);
        }
        cVar.h(0);
        f e10 = cVar.e();
        Intrinsics.checkNotNullExpressionValue(e10, "Builder().run {\n        …        build()\n        }");
        e10.q0(Executors.newSingleThreadExecutor(), new f.a() { // from class: co.hyperverge.hypersnapsdk.cameras.camerax.d
            @Override // androidx.camera.core.f.a
            public final void analyze(n nVar) {
                HyperCameraX.getImageAnalyser$lambda$5(HyperCameraX.this, nVar);
            }
        });
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getImageAnalyser$lambda$5(HyperCameraX this$0, n imageProxy) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        try {
            this$0.hyperCameraXHost.onNewPreviewFrame(imageProxy);
        } catch (IllegalStateException e10) {
            HVLogUtils.e(TAG, e10.getMessage(), e10);
        }
    }

    private final W getImageCapture() {
        HVLogUtils.d(TAG, "getImageCapture() called");
        P.c a10 = new c.a().f(new P.d(new Size(1280, 960), 1)).a();
        Intrinsics.checkNotNullExpressionValue(a10, "Builder()\n            .s…  )\n            ).build()");
        W e10 = new W.b().m(a10).h(0).e();
        this.imageCapture = e10;
        Intrinsics.d(e10);
        return e10;
    }

    private final r0 getPreview() {
        HVLogUtils.d(TAG, "getPreview() called");
        r0 e10 = new r0.a().e();
        this.preview = e10;
        if (e10 != null) {
            e10.k0(this.previewView.getSurfaceProvider());
        }
        r0 r0Var = this.preview;
        Intrinsics.d(r0Var);
        return r0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] readFileAsBytes(String filePath) {
        HVLogUtils.d(TAG, "readFileAsBytes() called with: filePath = " + filePath);
        File file = new File(filePath);
        byte[] bArr = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read(bArr);
                kotlin.io.c.a(fileInputStream, null);
            } finally {
            }
        } catch (IOException e10) {
            HVLogUtils.e(TAG, Utils.getErrorMessage(e10), e10);
        }
        return bArr;
    }

    private final void setDefaultZoom() {
        InterfaceC0705k a10;
        InterfaceC0703j interfaceC0703j = this.camera;
        if (interfaceC0703j == null || (a10 = interfaceC0703j.a()) == null) {
            return;
        }
        a10.f(this.hyperCameraXConfig.getUseFFC() ? AppConstants.ZOOM_FACTOR_FRONT_CAM : AppConstants.ZOOM_FACTOR_BACK_CAM);
    }

    private final void setDimensions() {
        HVLogUtils.d(TAG, "setDimensions() called");
        this.previewView.post(new Runnable() { // from class: co.hyperverge.hypersnapsdk.cameras.camerax.c
            @Override // java.lang.Runnable
            public final void run() {
                HyperCameraX.setDimensions$lambda$3(HyperCameraX.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDimensions$lambda$3(HyperCameraX this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int measuredWidth = this$0.previewView.getMeasuredWidth();
        int measuredHeight = this$0.previewView.getMeasuredHeight();
        if (this$0.mRatioWidth == 0 || this$0.mRatioHeight == 0) {
            this$0.hyperCameraXHost.onViewDimensionChange(measuredWidth, measuredHeight);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this$0.previewView.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "previewView.layoutParams");
        layoutParams.height = (this$0.mRatioHeight * measuredWidth) / this$0.mRatioWidth;
        this$0.previewView.setLayoutParams(layoutParams);
        this$0.hyperCameraXHost.onViewDimensionChange(measuredWidth, (this$0.mRatioHeight * measuredWidth) / this$0.mRatioWidth);
    }

    private final void setupTouchToFocus(final InterfaceC0703j camera) {
        HVLogUtils.d(TAG, "setupTouchToFocus() called");
        this.previewView.setOnTouchListener(new View.OnTouchListener() { // from class: co.hyperverge.hypersnapsdk.cameras.camerax.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z10;
                z10 = HyperCameraX.setupTouchToFocus$lambda$2(HyperCameraX.this, camera, view, motionEvent);
                return z10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupTouchToFocus$lambda$2(HyperCameraX this$0, InterfaceC0703j camera, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(camera, "$camera");
        AbstractC0708l0 meteringPointFactory = this$0.previewView.getMeteringPointFactory();
        Intrinsics.checkNotNullExpressionValue(meteringPointFactory, "previewView.meteringPointFactory");
        C0706k0 b10 = meteringPointFactory.b(motionEvent.getX(), motionEvent.getY());
        Intrinsics.checkNotNullExpressionValue(b10, "factory.createPoint(event.x, event.y)");
        D b11 = new D.a(b10, 1).b();
        Intrinsics.checkNotNullExpressionValue(b11, "Builder(point, FocusMete…\n                .build()");
        camera.a().l(b11);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCamera$lambda$1(HyperCameraX this$0, h8.d cameraProviderFuture) {
        InterfaceC0703j interfaceC0703j;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cameraProviderFuture, "$cameraProviderFuture");
        g gVar = (g) cameraProviderFuture.get();
        this$0.cameraProvider = gVar;
        if (gVar != null) {
            gVar.A();
        }
        try {
            g gVar2 = this$0.cameraProvider;
            if (gVar2 != null) {
                Object obj = this$0.context;
                Intrinsics.e(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                interfaceC0703j = gVar2.o((InterfaceC1599p) obj, this$0.selectedCamera, this$0.getPreview(), this$0.getImageCapture(), this$0.getImageAnalyser());
            } else {
                interfaceC0703j = null;
            }
            this$0.camera = interfaceC0703j;
            if (interfaceC0703j != null) {
                this$0.setupTouchToFocus(interfaceC0703j);
            }
            if (this$0.hyperCameraXConfig.getUseDefaultZoom()) {
                this$0.setDefaultZoom();
            }
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "Use case binding failed", e10);
        }
    }

    private final void takePictureInternal(String filePath) {
        HVLogUtils.d(TAG, "takePictureInternal() called with filePath: " + filePath + ", imageCapture: " + this.imageCapture);
        W.g a10 = new W.g.a(new File(filePath)).a();
        Intrinsics.checkNotNullExpressionValue(a10, "Builder(File(filePath)).build()");
        W w10 = this.imageCapture;
        if (w10 != null) {
            w10.B0(a10, androidx.core.content.a.h(this.context), new W.f() { // from class: co.hyperverge.hypersnapsdk.cameras.camerax.HyperCameraX$takePictureInternal$1
                @Override // A.W.f
                public /* bridge */ /* synthetic */ void onCaptureProcessProgressed(int i10) {
                    super.onCaptureProcessProgressed(i10);
                }

                @Override // A.W.f
                public /* bridge */ /* synthetic */ void onCaptureStarted() {
                    super.onCaptureStarted();
                }

                @Override // A.W.f
                public void onError(X exc) {
                    HyperCameraXHost hyperCameraXHost;
                    String str;
                    Intrinsics.checkNotNullParameter(exc, "exc");
                    hyperCameraXHost = HyperCameraX.this.hyperCameraXHost;
                    hyperCameraXHost.onPictureFailed();
                    str = HyperCameraX.TAG;
                    HVLogUtils.e(str, "Photo capture failed: " + exc.getMessage());
                }

                @Override // A.W.f
                public void onImageSaved(W.h output) {
                    String str;
                    String str2;
                    HyperCameraXHost hyperCameraXHost;
                    byte[] readFileAsBytes;
                    Intrinsics.checkNotNullParameter(output, "output");
                    Uri a11 = output.a();
                    if (a11 == null || (str = a11.getPath()) == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    if (str.length() > 0) {
                        hyperCameraXHost = HyperCameraX.this.hyperCameraXHost;
                        readFileAsBytes = HyperCameraX.this.readFileAsBytes(str);
                        hyperCameraXHost.onPictureReady(readFileAsBytes);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Photo capture succeeded: ");
                    Uri a12 = output.a();
                    sb2.append(a12 != null ? a12.getPath() : null);
                    String sb3 = sb2.toString();
                    str2 = HyperCameraX.TAG;
                    HVLogUtils.d(str2, sb3);
                }

                @Override // A.W.f
                public /* bridge */ /* synthetic */ void onPostviewBitmapAvailable(Bitmap bitmap) {
                    super.onPostviewBitmapAvailable(bitmap);
                }
            });
        }
    }

    private final void updateRatios() {
        HVLogUtils.d(TAG, "updateRatios() called");
        if (this.hyperCameraXHost.getAspectRatio() == 1) {
            this.mRatioWidth = 3;
            this.mRatioHeight = 4;
        } else if (this.hyperCameraXHost.getAspectRatio() == 2) {
            this.mRatioWidth = 9;
            this.mRatioHeight = 16;
        }
    }

    public final void destroyCamera() {
        HVLogUtils.d(TAG, "destroyCamera() called");
        g gVar = this.cameraProvider;
        if (gVar != null) {
            gVar.A();
        }
        this.imageCapture = null;
        this.cameraProvider = null;
        this.preview = null;
    }

    public final void flipCamera() {
        HVLogUtils.d(TAG, "flipCamera() called");
        r rVar = this.selectedCamera;
        r rVar2 = r.f210d;
        if (Intrinsics.b(rVar, rVar2)) {
            rVar2 = r.f209c;
            Intrinsics.checkNotNullExpressionValue(rVar2, "{\n            CameraSele…LT_FRONT_CAMERA\n        }");
        } else {
            Intrinsics.checkNotNullExpressionValue(rVar2, "{\n            CameraSele…ULT_BACK_CAMERA\n        }");
        }
        this.selectedCamera = rVar2;
        this.hyperCameraXHost.onCameraFlipCallback();
        startCamera();
    }

    public final int getAspectRatio() {
        HVLogUtils.d(TAG, "getAspectRatio() called");
        return this.mRatioHeight == 4 ? 1 : 2;
    }

    public final P.c getResolutionSelector() {
        return this.resolutionSelector;
    }

    public final void pauseCamera() {
        HVLogUtils.d(TAG, "pauseCamera() called");
        this.isPreviewPaused = true;
        g gVar = this.cameraProvider;
        if (gVar != null) {
            gVar.z(this.preview);
        }
    }

    public final void resumeCamera() {
        HVLogUtils.d(TAG, "resumeCamera() called with isPreviewPaused = " + this.isPreviewPaused);
        if (this.isPreviewPaused) {
            this.isPreviewPaused = false;
            g gVar = this.cameraProvider;
            if (gVar != null) {
                Object obj = this.context;
                Intrinsics.e(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                gVar.o((InterfaceC1599p) obj, this.selectedCamera, this.preview);
            }
        }
    }

    public final void startCamera() {
        HVLogUtils.d(TAG, "startCamera() called");
        updateRatios();
        setDimensions();
        final h8.d b10 = g.f10263i.b(this.context);
        Executor h10 = androidx.core.content.a.h(this.context);
        Intrinsics.checkNotNullExpressionValue(h10, "getMainExecutor(context)");
        try {
            b10.e(new Runnable() { // from class: co.hyperverge.hypersnapsdk.cameras.camerax.a
                @Override // java.lang.Runnable
                public final void run() {
                    HyperCameraX.startCamera$lambda$1(HyperCameraX.this, b10);
                }
            }, h10);
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "CameraProviderFuture failed", e10);
        }
    }

    public final void takePicture(String path) {
        HVLogUtils.d(TAG, "takePicture() called");
        if (path != null) {
            takePictureInternal(path);
            return;
        }
        String absolutePath = this.hyperCameraXHost.getPhotoPath().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "hyperCameraXHost.getPhotoPath().absolutePath");
        takePictureInternal(absolutePath);
    }
}
