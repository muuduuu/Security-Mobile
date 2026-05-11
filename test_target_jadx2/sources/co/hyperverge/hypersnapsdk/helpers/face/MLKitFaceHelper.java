package co.hyperverge.hypersnapsdk.helpers.face;

import D7.AbstractC0789m;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.camera.core.n;
import b8.C1658e;
import co.hyperverge.hypersnapsdk.components.hypercamera.models.CameraProperties;
import co.hyperverge.hypersnapsdk.helpers.HVActiveLiveness;
import co.hyperverge.hypersnapsdk.helpers.HVGenericCallback;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.helpers.face.FaceConstants;
import co.hyperverge.hypersnapsdk.helpers.face.MLKitFaceHelper;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.UIUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import e9.C3102a;
import g9.AbstractC3203c;
import g9.C3201a;
import g9.C3205e;
import g9.InterfaceC3204d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class MLKitFaceHelper {
    private static final String TAG = "MLKitFaceHelper";
    private static MLKitFaceHelper instance;
    private CameraProperties cameraProperties;
    private HVFaceConfig faceConfig;
    private FaceDetectionListener faceDetectionListener;
    private boolean isProcessing;
    private FaceViewListener mView;
    private InterfaceC3204d mlKitdetector;
    private int stableFrameCounter = 0;
    private boolean hasLoggedFirstFaceDetection = false;

    private MLKitFaceHelper() {
        this.isProcessing = false;
        HVLogUtils.d(TAG, "MLKitFaceHelper() called");
        try {
            this.mlKitdetector = AbstractC3203c.a();
            this.isProcessing = false;
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "MLKitFaceHelper(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            setMlKitdetectorUnavailable(Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        } catch (NoClassDefFoundError e11) {
            HVLogUtils.e(TAG, "MLKitFaceHelper(): exception = [" + Utils.getErrorMessage(e11) + "]", e11);
            setMlKitdetectorMissing(Utils.getErrorMessage(e11));
        }
    }

    private boolean areMultipleFacesPresent(ArrayList<C3201a> arrayList) {
        HVLogUtils.d(TAG, "areMultipleFacesPresent() called with: faces = [" + arrayList + "]");
        return arrayList.size() > 1;
    }

    private void checkFaceConditions(C3201a c3201a) {
        if (getFaceWidth(c3201a) > this.cameraProperties.getViewWidth() * 0.6f) {
            this.isProcessing = false;
            this.stableFrameCounter = 0;
            this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_TOO_CLOSE);
            return;
        }
        if (!isSignificantPortionOfFaceInsideFrame(c3201a)) {
            this.isProcessing = false;
            this.stableFrameCounter = 0;
            this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_NOT_DETECTED);
            return;
        }
        this.stableFrameCounter++;
        if (this.faceConfig.shouldCheckForFaceTilt()) {
            if (!isFaceStraight(c3201a)) {
                this.isProcessing = false;
                this.stableFrameCounter = 0;
                this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_NOT_STRAIGHT);
                return;
            } else if (this.stableFrameCounter <= 5.0f) {
                this.isProcessing = false;
                this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_STAY_STILL);
                return;
            }
        }
        if (this.stableFrameCounter <= 5.0f) {
            this.isProcessing = false;
        } else {
            this.isProcessing = false;
            this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_DETECTED);
        }
    }

    public static MLKitFaceHelper get() {
        if (instance == null) {
            instance = new MLKitFaceHelper();
        }
        return instance;
    }

    private C3205e getAccurateFaceDetectorOptions() {
        HVLogUtils.d(TAG, "getAccurateFaceDetectorOptions() called");
        try {
            return new C3205e.a().e(2).c(2).b(1).d(0.2f).a();
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "getAccurateFaceDetectorOptions(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            setMlKitdetectorUnavailable(Utils.getErrorMessage(e10));
            return null;
        } catch (NoClassDefFoundError e11) {
            HVLogUtils.e(TAG, "getAccurateFaceDetectorOptions(): exception = [" + Utils.getErrorMessage(e11) + "]", e11);
            setMlKitdetectorMissing(Utils.getErrorMessage(e11));
            return null;
        }
    }

    private float getFaceWidth(C3201a c3201a) {
        return (c3201a.a().width() * this.cameraProperties.getViewWidth()) / HVFrameRecorder.VIDEO_WIDTH;
    }

    private C3205e getFastFaceDetectorOptions() {
        HVLogUtils.d(TAG, "getFastFaceDetectorOptions() called");
        try {
            return new C3205e.a().e(1).c(1).b(1).d(0.2f).a();
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "getFastFaceDetectorOptions(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            setMlKitdetectorUnavailable(Utils.getErrorMessage(e10));
            return null;
        } catch (NoClassDefFoundError e11) {
            HVLogUtils.e(TAG, "getFastFaceDetectorOptions(): exception = [" + Utils.getErrorMessage(e11) + "]", e11);
            setMlKitdetectorMissing(Utils.getErrorMessage(e11));
            return null;
        }
    }

    private Boolean isConfigNull() {
        return Boolean.valueOf(this.faceConfig == null || this.mView == null || this.faceDetectionListener == null);
    }

    private boolean isFaceOccupyingSignificantPortionOfFrame(C3201a c3201a) {
        return getFaceWidth(c3201a) > (this.faceConfig.getShouldUseBackCamera() ? 0.35f : 0.3f) * ((float) UIUtils.getScreenWidth()) && getFaceWidth(c3201a) < ((float) UIUtils.getScreenWidth()) * 0.6f;
    }

    private boolean isFaceStraight(C3201a c3201a) {
        HVLogUtils.d(TAG, "isFaceStraight() called with: face = [" + c3201a + "]");
        float faceTiltAngle = (float) this.faceConfig.getFaceTiltAngle();
        boolean z10 = Math.abs(c3201a.d()) <= faceTiltAngle && Math.abs(c3201a.c()) <= faceTiltAngle && Math.abs(c3201a.e()) <= faceTiltAngle;
        HVLogUtils.d(TAG, "isFaceStraight() returned: " + z10);
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$isOperational$0(Bitmap bitmap) {
        try {
            AbstractC0789m.a(this.mlKitdetector.D(C3102a.a(bitmap, 0)));
            return Boolean.TRUE;
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "isOperational: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            return Boolean.FALSE;
        } catch (NoClassDefFoundError e11) {
            HVLogUtils.e(TAG, "isOperational: exception = [" + Utils.getErrorMessage(e11) + "]", e11);
            setMlKitdetectorMissing(Utils.getErrorMessage(e11));
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isOperational$1(Bitmap bitmap, HVGenericCallback hVGenericCallback, ExecutorService executorService) {
        try {
            try {
                try {
                    AbstractC0789m.a(this.mlKitdetector.D(C3102a.a(bitmap, 0)));
                    hVGenericCallback.accept(Boolean.TRUE);
                } catch (NoClassDefFoundError e10) {
                    HVLogUtils.e(TAG, "isOperational: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                    setMlKitdetectorMissing(Utils.getErrorMessage(e10));
                    hVGenericCallback.accept(Boolean.FALSE);
                }
            } catch (Exception e11) {
                HVLogUtils.e(TAG, "isOperational: exception = [" + Utils.getErrorMessage(e11) + "]", e11);
                hVGenericCallback.accept(Boolean.FALSE);
            }
        } finally {
            bitmap.recycle();
            executorService.shutdown();
        }
    }

    private void logFaceDetectionEvent(ArrayList<C3201a> arrayList) {
        if (!this.hasLoggedFirstFaceDetection && SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser() && SDKInternalConfig.getInstance().getAnalyticsTrackerService() != null) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService().logSelfieFirstFaceDetected(arrayList.toString());
        }
        this.hasLoggedFirstFaceDetection = true;
    }

    private ArrayList<C3201a> processCameraXFrame(n nVar) {
        if (nVar.E1() == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>((Collection) AbstractC0789m.a(this.mlKitdetector.x0(new C1658e(nVar.E1()).b(nVar.G().d()).a())));
    }

    private ArrayList<C3201a> processHVCameraFrame(byte[] bArr) {
        return new ArrayList<>((Collection) AbstractC0789m.a(this.mlKitdetector.D(C3102a.b(bArr, HVFrameRecorder.VIDEO_WIDTH, 360, 0, 17))));
    }

    private float scaleX(float f10, int i10) {
        float viewRadius = f10 * ((this.mView.getViewRadius() * 2) / i10);
        HVLogUtils.d(TAG, "scaleX() returned: " + viewRadius);
        return viewRadius;
    }

    private float scaleY(float f10, int i10) {
        return f10 * ((this.mView.getViewRadius() * 2) / i10);
    }

    private float translateX(float f10, int i10) {
        return this.faceConfig.getShouldUseBackCamera() ? scaleX(f10, i10) : this.mView.getViewRadius() - scaleX(f10, i10);
    }

    private float translateY(float f10, int i10) {
        return scaleY(f10, i10);
    }

    public void destroy() {
        HVLogUtils.d(TAG, "destroy() called");
        try {
            InterfaceC3204d interfaceC3204d = this.mlKitdetector;
            if (interfaceC3204d != null) {
                interfaceC3204d.close();
                this.mlKitdetector = null;
                instance = null;
            }
        } catch (Exception | NoClassDefFoundError e10) {
            HVLogUtils.e(TAG, "destroy(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
    }

    public boolean isOperational() {
        HVLogUtils.d(TAG, "isOperational() called");
        if (this.mlKitdetector == null) {
            return false;
        }
        final Bitmap createBitmap = Bitmap.createBitmap(HVFrameRecorder.VIDEO_WIDTH, HVFrameRecorder.VIDEO_HEIGHT, Bitmap.Config.ARGB_8888);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            try {
                return ((Boolean) newSingleThreadExecutor.submit(new Callable() { // from class: J1.a
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Boolean lambda$isOperational$0;
                        lambda$isOperational$0 = MLKitFaceHelper.this.lambda$isOperational$0(createBitmap);
                        return lambda$isOperational$0;
                    }
                }).get()).booleanValue();
            } finally {
                createBitmap.recycle();
                newSingleThreadExecutor.shutdown();
            }
        } catch (InterruptedException | ExecutionException e10) {
            HVLogUtils.e(TAG, "isOperational: exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            return false;
        }
    }

    public boolean isSignificantPortionOfFaceInsideFrame(C3201a c3201a) {
        int viewWidth = this.cameraProperties.getViewWidth();
        int viewHeight = this.cameraProperties.getViewHeight();
        float faceWidth = getFaceWidth(c3201a);
        float f10 = this.faceConfig.getShouldUseBackCamera() ? 0.35f : 0.3f;
        float translateY = translateY(c3201a.a().exactCenterY(), viewHeight);
        float scaleY = scaleY(c3201a.a().height() / 2, viewHeight);
        float f11 = translateY - scaleY;
        double abs = Math.abs(this.mView.getViewYCenter() - (this.mView.getViewY() + (((translateY + scaleY) + f11) / 2.0f)));
        boolean z10 = false;
        boolean z11 = abs < ((double) this.mView.getViewYCenter()) * 0.3d && f11 > 10.0f;
        float f12 = viewWidth;
        if (faceWidth > f10 * f12 && faceWidth < f12 * 0.6f && (!this.faceConfig.isQualityCheckEnabled(HVFaceConfig.QualityChecks.FACE_CENTER) || z11)) {
            z10 = true;
        }
        HVLogUtils.d(TAG, "isSignificantPortionOfFaceInsideFrame() returned: " + z10);
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processFrame(CameraProperties cameraProperties) {
        if (this.isProcessing || isConfigNull().booleanValue()) {
            return;
        }
        this.isProcessing = true;
        this.cameraProperties = cameraProperties;
        try {
            ArrayList<C3201a> processCameraXFrame = cameraProperties.getImageProxy() != null ? processCameraXFrame(cameraProperties.getImageProxy()) : processHVCameraFrame(cameraProperties.getData());
            if (this.faceConfig.isShouldCheckActiveLiveness()) {
                HVActiveLiveness.get().onActiveLivenessFaceDetection(processCameraXFrame);
                this.isProcessing = false;
                return;
            }
            if (processCameraXFrame.isEmpty()) {
                this.isProcessing = false;
                this.stableFrameCounter = 0;
                this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_NOT_DETECTED);
                return;
            }
            logFaceDetectionEvent(processCameraXFrame);
            if (!areMultipleFacesPresent(processCameraXFrame)) {
                checkFaceConditions(processCameraXFrame.get(0));
                return;
            }
            this.isProcessing = false;
            if (!this.faceConfig.isQualityCheckEnabled(HVFaceConfig.QualityChecks.MULTIPLE_FACES)) {
                this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.FACE_DETECTED);
            } else {
                this.stableFrameCounter = 0;
                this.faceDetectionListener.setFaceDetectionState(FaceConstants.FaceDetectionState.MULTIPLE_FACES);
            }
        } catch (Exception e10) {
            e = e10;
            HVLogUtils.e(TAG, "processFrame(): exception = [" + Utils.getErrorMessage(e) + "]", e);
            Log.e(TAG, Utils.getErrorMessage(e));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
            }
        } catch (NoClassDefFoundError e11) {
            e = e11;
            HVLogUtils.e(TAG, "processFrame(): exception = [" + Utils.getErrorMessage(e) + "]", e);
            Log.e(TAG, Utils.getErrorMessage(e));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
            }
        }
    }

    public C3201a processImage(Bitmap bitmap) {
        try {
            ArrayList arrayList = new ArrayList((Collection) AbstractC0789m.a(this.mlKitdetector.D(C3102a.a(bitmap, 0))));
            if (arrayList.isEmpty()) {
                return null;
            }
            return (C3201a) arrayList.get(0);
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "processImage(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(TAG, Utils.getErrorMessage(e10));
            AppConstants.mlkitUnavailableError = Utils.getErrorMessage(e10);
            SDKInternalConfig.getInstance().setMLKitUnavailable(true);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        }
    }

    public void setConfig(HVFaceConfig hVFaceConfig, FaceViewListener faceViewListener, FaceDetectionListener faceDetectionListener) {
        HVLogUtils.d(TAG, "setConfig() called with: faceConfig = [" + hVFaceConfig + "], faceViewListener = [" + faceViewListener + "], faceDetectionListener = [" + faceDetectionListener + "]");
        try {
            this.faceConfig = hVFaceConfig;
            this.mView = faceViewListener;
            this.faceDetectionListener = faceDetectionListener;
            C3205e fastFaceDetectorOptions = getFastFaceDetectorOptions();
            if (!hVFaceConfig.shouldCheckForFaceTilt()) {
                if (hVFaceConfig.isShouldCheckActiveLiveness()) {
                }
                this.mlKitdetector = AbstractC3203c.b(fastFaceDetectorOptions);
            }
            fastFaceDetectorOptions = getAccurateFaceDetectorOptions();
            this.mlKitdetector = AbstractC3203c.b(fastFaceDetectorOptions);
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "setConfig(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            setMlKitdetectorUnavailable(Utils.getErrorMessage(e10));
        } catch (NoClassDefFoundError e11) {
            HVLogUtils.e(TAG, "setConfig(): exception = [" + Utils.getErrorMessage(e11) + "]", e11);
            setMlKitdetectorMissing(Utils.getErrorMessage(e11));
        }
    }

    public void setMlKitdetectorMissing(String str) {
        HVLogUtils.d(TAG, "setMlKitdetectorMissing() called with: message = [" + str + "]");
        AppConstants.mlkitMissing = str;
        SDKInternalConfig.getInstance().setMLKitDetectorMissing(true);
    }

    public void setMlKitdetectorUnavailable(String str) {
        HVLogUtils.d(TAG, "setMlKitdetectorUnavailable() called with: message = [" + str + "]");
        AppConstants.mlkitUnavailableError = str;
        SDKInternalConfig.getInstance().setMLKitUnavailable(true);
    }

    public void isOperational(final HVGenericCallback<Boolean> hVGenericCallback) {
        HVLogUtils.d(TAG, "isOperational() called with: callback = [" + hVGenericCallback + "]");
        if (this.mlKitdetector == null) {
            hVGenericCallback.accept(Boolean.FALSE);
            return;
        }
        final Bitmap createBitmap = Bitmap.createBitmap(HVFrameRecorder.VIDEO_WIDTH, HVFrameRecorder.VIDEO_HEIGHT, Bitmap.Config.ARGB_8888);
        final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        newSingleThreadExecutor.submit(new Runnable() { // from class: J1.b
            @Override // java.lang.Runnable
            public final void run() {
                MLKitFaceHelper.this.lambda$isOperational$1(createBitmap, hVGenericCallback, newSingleThreadExecutor);
            }
        });
    }
}
