package co.hyperverge.hypersnapsdk.components.camera;

import Jd.AbstractC0891k;
import Jd.N;
import Md.s;
import Md.w;
import Md.y;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1599p;
import androidx.lifecycle.Y;
import co.hyperverge.hvcamera.HVMagicView;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.components.camera.model.HVCamConfig;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.CameraProperties;
import co.hyperverge.hypersnapsdk.helpers.HVCameraHelper;
import co.hyperverge.hypersnapsdk.helpers.face.FaceConstants;
import co.hyperverge.hypersnapsdk.helpers.face.FaceDetectionListener;
import co.hyperverge.hypersnapsdk.helpers.face.FaceViewListener;
import co.hyperverge.hypersnapsdk.helpers.face.MLKitFaceHelper;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.views.CircularProgressBar;
import co.hyperverge.hypersnapsdk.views.CrossHairView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000·\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\\\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B!\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0011J\u0015\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\r¢\u0006\u0004\b \u0010\u0011J\u000f\u0010!\u001a\u00020\rH\u0014¢\u0006\u0004\b!\u0010\u0011J\r\u0010\"\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0011J\u0013\u0010$\u001a\u00020#H\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010,J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020.H\u0016¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00100J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082D¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0016\u0010O\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR\u0016\u0010R\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010SR\u0014\u0010V\u001a\u00020U8\u0002X\u0082D¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010XR\u001c\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006_"}, d2 = {"Lco/hyperverge/hypersnapsdk/components/camera/HVFacePreview;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lco/hyperverge/hypersnapsdk/helpers/face/FaceViewListener;", "Lco/hyperverge/hypersnapsdk/helpers/face/FaceDetectionListener;", "Landroid/content/Context;", "context", "Lco/hyperverge/hypersnapsdk/components/camera/model/HVCamConfig;", HVRetakeActivity.CONFIG_TAG, "LJd/N;", "lifeCycleScope", "<init>", "(Landroid/content/Context;Lco/hyperverge/hypersnapsdk/components/camera/model/HVCamConfig;LJd/N;)V", BuildConfig.FLAVOR, "initialize", "(Landroid/content/Context;)V", "waitForCameraClose", "()V", "Lco/hyperverge/hypersnapsdk/components/hypercamera/models/CameraProperties;", "properties", "processFrame", "(Lco/hyperverge/hypersnapsdk/components/hypercamera/models/CameraProperties;)V", "Landroid/view/View;", "Landroidx/lifecycle/p;", "findViewTreeLifecycleOwner", "(Landroid/view/View;)Landroidx/lifecycle/p;", "addCrossHairView", "adjustCrossHairView", "LMd/w;", "Lco/hyperverge/hypersnapsdk/components/camera/model/FaceStateUIFlow;", "getUiStateFlow", "()LMd/w;", "startCamera", "onAttachedToWindow", "clickPicture", BuildConfig.FLAVOR, "stopCamera", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "owner", "onResume", "(Landroidx/lifecycle/p;)V", "onPause", BuildConfig.FLAVOR, "getViewY", "()F", "getViewX", "getViewYCenter", BuildConfig.FLAVOR, "getViewRadius", "()I", "Lco/hyperverge/hypersnapsdk/helpers/face/FaceConstants$FaceDetectionState;", Keys.FACE_DETECTION_STATE, "setFaceDetectionState", "(Lco/hyperverge/hypersnapsdk/helpers/face/FaceConstants$FaceDetectionState;)V", BuildConfig.FLAVOR, "TAG", "Ljava/lang/String;", "Landroid/graphics/Path;", "clipPath", "Landroid/graphics/Path;", "Lco/hyperverge/hypersnapsdk/views/CrossHairView;", "crossHairView", "Lco/hyperverge/hypersnapsdk/views/CrossHairView;", "Lco/hyperverge/hvcamera/HVMagicView;", "cameraView", "Lco/hyperverge/hvcamera/HVMagicView;", "camConfig", "Lco/hyperverge/hypersnapsdk/components/camera/model/HVCamConfig;", "LJd/N;", "Lco/hyperverge/hypersnapsdk/views/CircularProgressBar;", "progressBar", "Lco/hyperverge/hypersnapsdk/views/CircularProgressBar;", "lastTouchX", "F", "lastTouchY", "camViewWidth", "I", "camViewHeight", "safeToTakePicture", "Z", "isCheckingCamera", BuildConfig.FLAVOR, "cameraCheckDelay", "J", "Lco/hyperverge/hypersnapsdk/helpers/face/FaceConstants$FaceDetectionState;", "LMd/s;", "faceUIStateFlow", "LMd/s;", "co/hyperverge/hypersnapsdk/components/camera/HVFacePreview$hvCamHost$1", "hvCamHost", "Lco/hyperverge/hypersnapsdk/components/camera/HVFacePreview$hvCamHost$1;", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HVFacePreview extends ConstraintLayout implements DefaultLifecycleObserver, FaceViewListener, FaceDetectionListener {
    private final String TAG;
    private HVCamConfig camConfig;
    private int camViewHeight;
    private int camViewWidth;
    private final long cameraCheckDelay;
    private HVMagicView cameraView;
    private Path clipPath;
    private CrossHairView crossHairView;
    private FaceConstants.FaceDetectionState faceDetectionState;
    private final s faceUIStateFlow;
    private final HVFacePreview$hvCamHost$1 hvCamHost;
    private boolean isCheckingCamera;
    private float lastTouchX;
    private float lastTouchY;
    private N lifeCycleScope;
    private CircularProgressBar progressBar;
    private boolean safeToTakePicture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HVFacePreview(Context context, HVCamConfig config, N lifeCycleScope) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(lifeCycleScope, "lifeCycleScope");
        this.TAG = "HVFacePreview";
        this.safeToTakePicture = true;
        this.cameraCheckDelay = 20L;
        this.faceDetectionState = FaceConstants.FaceDetectionState.FACE_NOT_DETECTED;
        this.faceUIStateFlow = y.a(null);
        this.hvCamHost = new HVFacePreview$hvCamHost$1(this);
        this.camConfig = config;
        setId(R.id.hv_face_preview);
        this.lifeCycleScope = lifeCycleScope;
        MLKitFaceHelper.get().setConfig(new HVFaceConfig(), this, this);
        invalidate();
        setWillNotDraw(false);
        initialize(context);
    }

    private final void addCrossHairView(Context context) {
        HVLogUtils.d(this.TAG, "addCrossHairView() called with: context = " + context);
        CrossHairView crossHairView = new CrossHairView(context);
        crossHairView.setId(R.id.hv_crosshair);
        this.crossHairView = crossHairView;
        removeView(crossHairView);
        View view = this.crossHairView;
        HVCamConfig hVCamConfig = null;
        if (view == null) {
            Intrinsics.v("crossHairView");
            view = null;
        }
        addView(view);
        CrossHairView crossHairView2 = this.crossHairView;
        if (crossHairView2 == null) {
            Intrinsics.v("crossHairView");
            crossHairView2 = null;
        }
        HVCamConfig hVCamConfig2 = this.camConfig;
        if (hVCamConfig2 == null) {
            Intrinsics.v("camConfig");
        } else {
            hVCamConfig = hVCamConfig2;
        }
        crossHairView2.setVisibility(hVCamConfig.getUseBackCamera() ? 0 : 8);
        setOnTouchListener(new View.OnTouchListener() { // from class: co.hyperverge.hypersnapsdk.components.camera.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean addCrossHairView$lambda$6;
                addCrossHairView$lambda$6 = HVFacePreview.addCrossHairView$lambda$6(HVFacePreview.this, view2, motionEvent);
                return addCrossHairView$lambda$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addCrossHairView$lambda$6(HVFacePreview this$0, View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this$0.lastTouchX = event.getX();
            this$0.lastTouchY = event.getY();
        } else if (actionMasked == 1 && Math.abs(event.getX() - this$0.lastTouchX) < 20.0f && Math.abs(event.getY() - this$0.lastTouchY) < 20.0f) {
            CrossHairView crossHairView = this$0.crossHairView;
            if (crossHairView == null) {
                Intrinsics.v("crossHairView");
                crossHairView = null;
            }
            crossHairView.showCrosshair(event.getX(), event.getY(), false);
            if (this$0.cameraView == null) {
                Intrinsics.v("cameraView");
            }
            HVMagicView hVMagicView = this$0.cameraView;
            if (hVMagicView == null) {
                Intrinsics.v("cameraView");
                hVMagicView = null;
            }
            hVMagicView.onTouchToFocus(event.getX() / this$0.camViewWidth, event.getY() / this$0.camViewHeight, null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustCrossHairView() {
        HVLogUtils.d(this.TAG, "adjustCrossHairView() called");
        HVCamConfig hVCamConfig = this.camConfig;
        HVMagicView hVMagicView = null;
        if (hVCamConfig == null) {
            Intrinsics.v("camConfig");
            hVCamConfig = null;
        }
        if (hVCamConfig.getUseBackCamera()) {
            CrossHairView crossHairView = this.crossHairView;
            if (crossHairView == null) {
                Intrinsics.v("crossHairView");
                crossHairView = null;
            }
            crossHairView.getLayoutParams().height = this.camViewHeight;
            crossHairView.getLayoutParams().width = this.camViewWidth;
            HVMagicView hVMagicView2 = this.cameraView;
            if (hVMagicView2 == null) {
                Intrinsics.v("cameraView");
                hVMagicView2 = null;
            }
            crossHairView.setX(hVMagicView2.getX());
            HVMagicView hVMagicView3 = this.cameraView;
            if (hVMagicView3 == null) {
                Intrinsics.v("cameraView");
            } else {
                hVMagicView = hVMagicView3;
            }
            crossHairView.setY(hVMagicView.getY());
            crossHairView.requestLayout();
            requestLayout();
        }
    }

    private final InterfaceC1599p findViewTreeLifecycleOwner(View view) {
        return Y.a(view);
    }

    private final void initialize(Context context) {
        AbstractC1592i lifecycle;
        HVLogUtils.d(this.TAG, "initialize() called with: context = " + context);
        HVCamConfig hVCamConfig = this.camConfig;
        HVMagicView hVMagicView = null;
        if (hVCamConfig == null) {
            Intrinsics.v("camConfig");
            hVCamConfig = null;
        }
        HVCameraHelper.enableCameraParameters(context, hVCamConfig.getUseBackCamera(), false);
        CameraEngine.setPreviewCallback(true);
        CameraEngine.setCaptureMode(true);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.g(this);
        CircularProgressBar circularProgressBar = new CircularProgressBar(context);
        circularProgressBar.setId(R.id.hv_circular_bar);
        HVCamConfig hVCamConfig2 = this.camConfig;
        if (hVCamConfig2 == null) {
            Intrinsics.v("camConfig");
            hVCamConfig2 = null;
        }
        circularProgressBar.setDiameter(hVCamConfig2.getDiameter());
        circularProgressBar.setProgress(100);
        circularProgressBar.setMaxProgress(100);
        this.progressBar = circularProgressBar;
        HVFacePreview$hvCamHost$1 hVFacePreview$hvCamHost$1 = this.hvCamHost;
        HVCamConfig hVCamConfig3 = this.camConfig;
        if (hVCamConfig3 == null) {
            Intrinsics.v("camConfig");
            hVCamConfig3 = null;
        }
        HVMagicView hVMagicView2 = HVMagicView.getInstance(context, hVFacePreview$hvCamHost$1, true ^ hVCamConfig3.getUseBackCamera());
        hVMagicView2.disableRotation();
        hVMagicView2.setId(R.id.hv_camera_view);
        hVMagicView2.setContentDescription("hvFacePreview");
        hVMagicView2.setSensorCallback(new HVMagicView.SensorCallback() { // from class: co.hyperverge.hypersnapsdk.components.camera.c
            @Override // co.hyperverge.hvcamera.HVMagicView.SensorCallback
            public final void onSensorCallback() {
                HVFacePreview.initialize$lambda$2$lambda$1(HVFacePreview.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(hVMagicView2, "getInstance(context, hvC…          }\n            }");
        this.cameraView = hVMagicView2;
        addView(hVMagicView2);
        HVMagicView hVMagicView3 = this.cameraView;
        if (hVMagicView3 == null) {
            Intrinsics.v("cameraView");
            hVMagicView3 = null;
        }
        int id2 = hVMagicView3.getId();
        HVCamConfig hVCamConfig4 = this.camConfig;
        if (hVCamConfig4 == null) {
            Intrinsics.v("camConfig");
            hVCamConfig4 = null;
        }
        dVar.j(id2, hVCamConfig4.getDiameter());
        HVMagicView hVMagicView4 = this.cameraView;
        if (hVMagicView4 == null) {
            Intrinsics.v("cameraView");
            hVMagicView4 = null;
        }
        int id3 = hVMagicView4.getId();
        HVCamConfig hVCamConfig5 = this.camConfig;
        if (hVCamConfig5 == null) {
            Intrinsics.v("camConfig");
            hVCamConfig5 = null;
        }
        dVar.i(id3, hVCamConfig5.getDiameter());
        dVar.c(this);
        HVMagicView hVMagicView5 = this.cameraView;
        if (hVMagicView5 == null) {
            Intrinsics.v("cameraView");
            hVMagicView5 = null;
        }
        hVMagicView5.bringToFront();
        addCrossHairView(context);
        adjustCrossHairView();
        HVMagicView hVMagicView6 = this.cameraView;
        if (hVMagicView6 == null) {
            Intrinsics.v("cameraView");
        } else {
            hVMagicView = hVMagicView6;
        }
        hVMagicView.onResume();
        InterfaceC1599p findViewTreeLifecycleOwner = findViewTreeLifecycleOwner(this);
        if (findViewTreeLifecycleOwner != null && (lifecycle = findViewTreeLifecycleOwner.getLifecycle()) != null) {
            lifecycle.a(this);
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$2$lambda$1(HVFacePreview this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.crossHairView == null) {
            Intrinsics.v("crossHairView");
        }
        CrossHairView crossHairView = this$0.crossHairView;
        if (crossHairView == null) {
            Intrinsics.v("crossHairView");
            crossHairView = null;
        }
        crossHairView.showCrosshair(this$0.camViewWidth / 2, this$0.camViewHeight / 2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processFrame(CameraProperties properties) {
        MLKitFaceHelper.get().processFrame(properties);
    }

    private final void waitForCameraClose() {
        HVLogUtils.d(this.TAG, "waitForCameraClose() called");
        if (this.isCheckingCamera) {
            HVLogUtils.d(this.TAG, "waitForCameraClose: already checking");
            return;
        }
        if (!CameraEngine.isCameraReleased()) {
            HVLogUtils.d(this.TAG, "waitForCameraClose: camera is not released");
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: co.hyperverge.hypersnapsdk.components.camera.b
                @Override // java.lang.Runnable
                public final void run() {
                    HVFacePreview.waitForCameraClose$lambda$4(HVFacePreview.this);
                }
            }, this.cameraCheckDelay);
            return;
        }
        HVLogUtils.d(this.TAG, "waitForCameraClose: camera is released");
        this.isCheckingCamera = true;
        MLKitFaceHelper.get().destroy();
        HVMagicView hVMagicView = this.cameraView;
        if (hVMagicView == null) {
            Intrinsics.v("cameraView");
            hVMagicView = null;
        }
        hVMagicView.clearHandlers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitForCameraClose$lambda$4(HVFacePreview this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.waitForCameraClose();
    }

    public final void clickPicture() {
        HVLogUtils.d(this.TAG, "clickPicture() called");
        HVMagicView hVMagicView = this.cameraView;
        if (hVMagicView == null) {
            Intrinsics.v("cameraView");
            hVMagicView = null;
        }
        hVMagicView.takePicture(null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        HVLogUtils.d(this.TAG, "dispatchDraw() called with: canvas = " + canvas);
        Path path = new Path();
        float width = (float) (getWidth() / 2);
        float height = (float) (getHeight() / 2);
        HVCamConfig hVCamConfig = this.camConfig;
        Path path2 = null;
        if (hVCamConfig == null) {
            Intrinsics.v("camConfig");
            hVCamConfig = null;
        }
        path.addCircle(width, height, hVCamConfig.getDiameter() / 2, Path.Direction.CW);
        this.clipPath = path;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Path path3 = this.clipPath;
        if (path3 == null) {
            Intrinsics.v("clipPath");
            path3 = null;
        }
        canvas.clipPath(path3);
        Path path4 = this.clipPath;
        if (path4 == null) {
            Intrinsics.v("clipPath");
        } else {
            path2 = path4;
        }
        canvas.drawPath(path2, paint);
        super.dispatchDraw(canvas);
    }

    public final w getUiStateFlow() {
        return this.faceUIStateFlow;
    }

    @Override // co.hyperverge.hypersnapsdk.helpers.face.FaceViewListener
    public int getViewRadius() {
        HVCamConfig hVCamConfig = this.camConfig;
        if (hVCamConfig == null) {
            Intrinsics.v("camConfig");
            hVCamConfig = null;
        }
        int diameter = hVCamConfig.getDiameter() / 2;
        HVLogUtils.d(this.TAG, "getViewRadius() returned: " + diameter);
        return diameter;
    }

    @Override // co.hyperverge.hypersnapsdk.helpers.face.FaceViewListener
    public float getViewX() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        float f10 = iArr[0];
        HVLogUtils.d(this.TAG, "getViewX() returned: " + f10);
        return f10;
    }

    @Override // co.hyperverge.hypersnapsdk.helpers.face.FaceViewListener
    public float getViewY() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        float f10 = iArr[1];
        HVLogUtils.d(this.TAG, "getViewY() returned: " + f10);
        return f10;
    }

    @Override // co.hyperverge.hypersnapsdk.helpers.face.FaceViewListener
    public float getViewYCenter() {
        float viewY = getViewY();
        HVCamConfig hVCamConfig = this.camConfig;
        if (hVCamConfig == null) {
            Intrinsics.v("camConfig");
            hVCamConfig = null;
        }
        float diameter = viewY + (hVCamConfig.getDiameter() / 2);
        HVLogUtils.d(this.TAG, "getViewYCenter() returned: " + diameter);
        return diameter;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        HVLogUtils.d(this.TAG, "onAttachedToWindow() called");
        if (getParent() != null) {
            CircularProgressBar circularProgressBar = this.progressBar;
            CircularProgressBar circularProgressBar2 = null;
            if (circularProgressBar == null) {
                Intrinsics.v("progressBar");
                circularProgressBar = null;
            }
            addView(circularProgressBar);
            CircularProgressBar circularProgressBar3 = this.progressBar;
            if (circularProgressBar3 == null) {
                Intrinsics.v("progressBar");
            } else {
                circularProgressBar2 = circularProgressBar3;
            }
            circularProgressBar2.invalidate();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(InterfaceC1599p owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        HVLogUtils.d(this.TAG, "onPause() called with: owner = " + owner);
        HVMagicView hVMagicView = this.cameraView;
        if (hVMagicView == null) {
            Intrinsics.v("cameraView");
            hVMagicView = null;
        }
        hVMagicView.onPause();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(InterfaceC1599p owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        HVLogUtils.d(this.TAG, "onResume() called with: owner = " + owner);
        HVMagicView hVMagicView = this.cameraView;
        if (hVMagicView == null) {
            Intrinsics.v("cameraView");
            hVMagicView = null;
        }
        hVMagicView.onResume();
    }

    @Override // co.hyperverge.hypersnapsdk.helpers.face.FaceDetectionListener
    public void setFaceDetectionState(FaceConstants.FaceDetectionState faceDetectionState) {
        AbstractC0891k.d(this.lifeCycleScope, null, null, new HVFacePreview$setFaceDetectionState$1(faceDetectionState, this, null), 3, null);
    }

    public final void startCamera() {
        HVLogUtils.d(this.TAG, "startCamera() called");
        HVMagicView hVMagicView = this.cameraView;
        if (hVMagicView == null) {
            Intrinsics.v("cameraView");
            hVMagicView = null;
        }
        hVMagicView.onResume();
    }

    public final Object stopCamera(kotlin.coroutines.d<? super Boolean> dVar) {
        HVLogUtils.d(this.TAG, "stopCamera() called");
        HVMagicView hVMagicView = this.cameraView;
        HVMagicView hVMagicView2 = null;
        if (hVMagicView == null) {
            Intrinsics.v("cameraView");
            hVMagicView = null;
        }
        hVMagicView.onDestroy();
        HVMagicView hVMagicView3 = this.cameraView;
        if (hVMagicView3 == null) {
            Intrinsics.v("cameraView");
        } else {
            hVMagicView2 = hVMagicView3;
        }
        hVMagicView2.onPause();
        waitForCameraClose();
        return kotlin.coroutines.jvm.internal.b.a(true);
    }
}
