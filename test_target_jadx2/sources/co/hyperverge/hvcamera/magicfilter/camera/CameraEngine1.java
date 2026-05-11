package co.hyperverge.hvcamera.magicfilter.camera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import co.hyperverge.hvcamera.HVCamHost;
import co.hyperverge.hvcamera.HVCamUtils;
import co.hyperverge.hvcamera.HVLog;
import co.hyperverge.hvcamera.HVMagicView;
import co.hyperverge.hvcamera.magicfilter.utils.BitmapUtil;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class CameraEngine1 {
    private static final String TAG = "CameraEngine1";
    private static List<String> availableFlashmodes;
    private static final List<String> cancelAutoFocusList;
    static String currentMode;
    public static CameraEngine1 instance;
    static Matrix matrix;
    private static final List<String> stopAutoFocusList;
    private static final List<String> supportedFlashModesStillImage;
    private static final List<String> supportedFlashModesVideo;
    private Camera.Parameters currParameters;
    private int data2counter;
    private String focusMode;
    private boolean isStillImageMode;
    private Camera.PictureCallback pictureCallback;
    private ScheduledExecutorService scheduler;
    private int screenHeight;
    private int screenWidth;
    private Camera.ShutterCallback shutterCallback;
    private boolean useEnhancedCamera;
    private float zoomCurrent;
    private int zoomMax;
    private List<Integer> zooms;
    private final String LOG_TAG = CameraEngine1.class.getCanonicalName();
    public boolean returnNextFrame = false;
    private Camera mCamera = null;
    private int mCameraID = getFrontCameraId();
    private boolean isDetectingFace = false;
    private boolean isZoomSupported = false;
    private float zoomBase = 0.0f;
    private boolean isReleased = true;
    private final byte[][] data2 = new byte[5][];
    private final byte[][] byteBuffer = new byte[5][];
    private int currentOrientation = 0;
    private boolean isScreenFlashOn = false;
    private boolean isCameraInitialised = false;

    static {
        ArrayList arrayList = new ArrayList();
        supportedFlashModesStillImage = arrayList;
        ArrayList arrayList2 = new ArrayList();
        supportedFlashModesVideo = arrayList2;
        matrix = new Matrix();
        ArrayList arrayList3 = new ArrayList();
        cancelAutoFocusList = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        stopAutoFocusList = arrayList4;
        arrayList3.add("SM-J200G");
        arrayList3.add("SM-J120G");
        arrayList3.add("SM-T285");
        arrayList4.add("LLD-AL10");
        arrayList4.add("vivo 1814");
        arrayList.add("off");
        arrayList.add("on");
        arrayList.add("torch");
        arrayList2.add("off");
        arrayList2.add("torch");
    }

    private Rect calculateTapArea(float f10, float f11) {
        HVLog.d(TAG, "calculateTapArea() called with: x = [" + f10 + "], y = [" + f11 + "]");
        if (isFrontFacingCamera()) {
            f10 = 1.0f - f10;
        }
        int i10 = (int) ((f10 - 0.5f) * 2000.0f);
        int i11 = (int) ((f11 - 0.5f) * 2000.0f);
        int clamp = clamp(i10 - 100);
        int clamp2 = clamp(i10 + 100);
        int clamp3 = clamp(i11 - 100);
        int clamp4 = clamp(i11 + 100);
        matrix.reset();
        matrix.postRotate(90.0f);
        Matrix matrix2 = matrix;
        matrix2.invert(matrix2);
        RectF rectF = new RectF(clamp, clamp3, clamp2, clamp4);
        matrix.mapRect(rectF);
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        HVLog.d(TAG, "calculateTapArea() returned: " + rect);
        return rect;
    }

    private static int clamp(int i10) {
        if (i10 > 1000) {
            return 1000;
        }
        if (i10 < -1000) {
            return -1000;
        }
        return i10;
    }

    private Rect getFocusRect(float f10, float f11, float f12, float f13) {
        HVLog.d(TAG, "getFocusRect() called with: t = [" + f10 + "], b = [" + f11 + "], l = [" + f12 + "], r = [" + f13 + "]");
        if (isFrontFacingCamera()) {
            float f14 = 1.0f - f13;
            float f15 = 1.0f - f12;
            float max = Math.max(f14, f15);
            float min = Math.min(f14, f15);
            f13 = max;
            f12 = min;
        }
        int clamp = clamp((int) ((f12 - 0.5f) * 2000.0f));
        int clamp2 = clamp((int) ((f13 - 0.5f) * 2000.0f));
        int clamp3 = clamp((int) ((f10 - 0.5f) * 2000.0f));
        int clamp4 = clamp((int) ((f11 - 0.5f) * 2000.0f));
        matrix.reset();
        matrix.postRotate(90.0f);
        Matrix matrix2 = matrix;
        matrix2.invert(matrix2);
        RectF rectF = new RectF(clamp, clamp3, clamp2, clamp4);
        matrix.mapRect(rectF);
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        HVLog.d(TAG, "getFocusRect() returned: " + rect);
        return rect;
    }

    public static CameraEngine1 getInstance() {
        if (instance == null) {
            instance = new CameraEngine1();
        }
        return instance;
    }

    private Camera.PreviewCallback getPreviewCallBack() {
        HVLog.d(TAG, "getPreviewCallBack() called");
        this.data2counter = 0;
        for (int i10 = 0; i10 < 5; i10++) {
            this.data2[i10] = new byte[getPreviewSize().width * getPreviewSize().height];
        }
        return new Camera.PreviewCallback() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine1.5
            /* JADX WARN: Removed duplicated region for block: B:31:0x014e A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #0 {Exception -> 0x005e, blocks: (B:17:0x0034, B:19:0x0058, B:21:0x0066, B:29:0x011c, B:31:0x014e, B:33:0x010c, B:46:0x00de, B:50:0x0061), top: B:16:0x0034 }] */
            @Override // android.hardware.Camera.PreviewCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onPreviewFrame(byte[] bArr, Camera camera) {
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                HVCamHost hVCamHost;
                System.currentTimeMillis();
                if (!CameraEngine1.this.isCameraInitialised) {
                    HVCamHost hVCamHost2 = HVMagicView.camHost;
                    if (hVCamHost2 != null) {
                        hVCamHost2.onReady();
                    }
                    CameraEngine1.this.isCameraInitialised = true;
                }
                if (!CameraEngine.isSetPreviewCallback()) {
                    CameraEngine1.this.setPreviewCallbackWithBuffer(null);
                    return;
                }
                if (bArr == null) {
                    HVLog.d("NPD", "WTF");
                } else {
                    try {
                        int i18 = CameraEngine1.this.getPreviewSize().width;
                        int i19 = CameraEngine1.this.getPreviewSize().height;
                        int i20 = (((CameraEngine1.this.currentOrientation + 45) / 90) * 90) % 360;
                        int i21 = CameraEngine.isFrontFacingCamera() ? (630 - i20) % 360 : (i20 + 90) % 360;
                        if (CameraEngine1.this.returnNextFrame) {
                            try {
                                HVCamHost hVCamHost3 = HVMagicView.camHost;
                                if (hVCamHost3 != null) {
                                    hVCamHost3.setScreenFlashOff();
                                }
                                CameraEngine1.this.isScreenFlashOn = false;
                                CameraEngine1.this.returnNextFrame = false;
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                new YuvImage(bArr, 17, i18, i19, null).compressToJpeg(new Rect(0, 0, i18, i19), 90, byteArrayOutputStream);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                Matrix matrix2 = new Matrix();
                                matrix2.postRotate(i21);
                                i11 = i21;
                                i12 = i20;
                                i13 = 90;
                                i14 = i19;
                                i15 = i18;
                                try {
                                    Bitmap.createBitmap(decodeByteArray, 0, 0, i18, i19, matrix2, false).compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream2);
                                    HVCamHost hVCamHost4 = HVMagicView.camHost;
                                    if (hVCamHost4 != null) {
                                        hVCamHost4.onPictureReady(byteArrayOutputStream2.toByteArray());
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    HVLog.e(CameraEngine1.this.LOG_TAG, "getPreviewCallBack() returnNextFrame : " + e.getMessage());
                                    if (i11 != i13) {
                                        i17 = i14;
                                        i16 = i15;
                                        CameraEngine1 cameraEngine1 = CameraEngine1.this;
                                        cameraEngine1.data2counter = (cameraEngine1.data2counter + 1) % 5;
                                        CameraEngine.rotateNV21a(bArr, CameraEngine1.this.getPreviewSize().width, CameraEngine1.this.getPreviewSize().height, i11, CameraEngine1.this.data2[CameraEngine1.this.data2counter]);
                                        hVCamHost = HVMagicView.camHost;
                                        if (hVCamHost != null) {
                                        }
                                        CameraEngine1.this.addPreviewCallback(bArr);
                                    }
                                    i16 = CameraEngine1.this.getPreviewSize().height;
                                    i17 = CameraEngine1.this.getPreviewSize().width;
                                    CameraEngine1 cameraEngine12 = CameraEngine1.this;
                                    cameraEngine12.data2counter = (cameraEngine12.data2counter + 1) % 5;
                                    CameraEngine.rotateNV21a(bArr, CameraEngine1.this.getPreviewSize().width, CameraEngine1.this.getPreviewSize().height, i11, CameraEngine1.this.data2[CameraEngine1.this.data2counter]);
                                    hVCamHost = HVMagicView.camHost;
                                    if (hVCamHost != null) {
                                    }
                                    CameraEngine1.this.addPreviewCallback(bArr);
                                }
                            } catch (Exception e11) {
                                e = e11;
                                i11 = i21;
                                i12 = i20;
                                i13 = 90;
                                i14 = i19;
                                i15 = i18;
                            }
                        } else {
                            i11 = i21;
                            i12 = i20;
                            i13 = 90;
                            i14 = i19;
                            i15 = i18;
                        }
                        if (i11 != i13 && i11 != 270) {
                            i17 = i14;
                            i16 = i15;
                            CameraEngine1 cameraEngine122 = CameraEngine1.this;
                            cameraEngine122.data2counter = (cameraEngine122.data2counter + 1) % 5;
                            CameraEngine.rotateNV21a(bArr, CameraEngine1.this.getPreviewSize().width, CameraEngine1.this.getPreviewSize().height, i11, CameraEngine1.this.data2[CameraEngine1.this.data2counter]);
                            hVCamHost = HVMagicView.camHost;
                            if (hVCamHost != null) {
                                hVCamHost.onNewPreviewFrame(CameraEngine1.this.data2[CameraEngine1.this.data2counter], i16, i17, i12, i11, BitmapUtil.createByteArrayForFrame(bArr, i17, i16, i11));
                            }
                        }
                        i16 = CameraEngine1.this.getPreviewSize().height;
                        i17 = CameraEngine1.this.getPreviewSize().width;
                        CameraEngine1 cameraEngine1222 = CameraEngine1.this;
                        cameraEngine1222.data2counter = (cameraEngine1222.data2counter + 1) % 5;
                        CameraEngine.rotateNV21a(bArr, CameraEngine1.this.getPreviewSize().width, CameraEngine1.this.getPreviewSize().height, i11, CameraEngine1.this.data2[CameraEngine1.this.data2counter]);
                        hVCamHost = HVMagicView.camHost;
                        if (hVCamHost != null) {
                        }
                    } catch (Exception e12) {
                        HVLog.e(CameraEngine1.this.LOG_TAG, "getPreviewCallBack : " + e12.getMessage());
                    }
                }
                CameraEngine1.this.addPreviewCallback(bArr);
            }
        };
    }

    private void setDefaultParameters() {
        HVLog.d(TAG, "setDefaultParameters() called");
        Camera.Parameters parameters = this.mCamera.getParameters();
        if (HVMagicView.camHost != null) {
            Camera.Size bestPreviewSize = HVCamUtils.getBestPreviewSize(this.mCamera, HVMagicView.getmRatioWidth(), HVMagicView.getmRatioHeight(), HVMagicView.camHost.getPreviewMegapixels());
            parameters.setPreviewSize(bestPreviewSize.width, bestPreviewSize.height);
            Camera.Size bestPictureSize = HVCamUtils.getBestPictureSize(this.mCamera, HVMagicView.getmRatioWidth(), HVMagicView.getmRatioHeight(), HVMagicView.camHost.getPictureMegapixels(), HVMagicView.camHost.isShouldCaptureHighResolutionImage());
            parameters.setPictureSize(bestPictureSize.width, bestPictureSize.height);
        }
        HVCamUtils.lastRotation = -1;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes.contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
            this.focusMode = "continuous-picture";
        } else if (supportedFocusModes.contains("auto")) {
            parameters.setFocusMode("auto");
            this.focusMode = "auto";
        }
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        if (iArr[0] == iArr[1]) {
            for (int[] iArr2 : parameters.getSupportedPreviewFpsRange()) {
                int i10 = iArr2[0];
                int i11 = iArr2[1];
                if (i10 != i11) {
                    parameters.setPreviewFpsRange(i10, i11);
                    break;
                }
            }
        }
        try {
            if (this.useEnhancedCamera) {
                parameters.setAntibanding("off");
            }
        } catch (Exception e10) {
            HVLog.e(this.LOG_TAG, "setDefaultParameters() useEnhancedCamera :" + e10.getMessage());
        }
        if (parameters.isAutoExposureLockSupported()) {
            parameters.setAutoExposureLock(false);
        }
        try {
            this.mCamera.cancelAutoFocus();
            this.mCamera.setParameters(parameters);
        } catch (Exception e11) {
            HVLog.e(this.LOG_TAG, "setDefaultParameters() :" + e11.getMessage());
        }
    }

    private void updateCamHostFlashMode() {
        HVLog.d(TAG, "updateCamHostFlashMode() called");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine1.6
            /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: Exception -> 0x000f, TRY_LEAVE, TryCatch #0 {Exception -> 0x000f, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0008, B:9:0x0012, B:25:0x005f, B:27:0x0065, B:29:0x006b, B:31:0x0071, B:33:0x002d, B:36:0x0037, B:39:0x0041, B:42:0x004b), top: B:1:0x0000 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                char c10;
                try {
                    if (HVMagicView.camHost == null) {
                        return;
                    }
                    String str = CameraEngine1.currentMode;
                    if (str == null) {
                        HVMagicView.camHost.onFlashNull();
                        return;
                    }
                    int hashCode = str.hashCode();
                    if (hashCode == 3551) {
                        if (str.equals("on")) {
                            c10 = 3;
                            if (c10 != 0) {
                            }
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                        }
                    } else if (hashCode == 109935) {
                        if (str.equals("off")) {
                            c10 = 0;
                            if (c10 != 0) {
                            }
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                        }
                    } else if (hashCode != 3005871) {
                        if (hashCode == 110547964 && str.equals("torch")) {
                            c10 = 2;
                            if (c10 != 0) {
                                HVMagicView.camHost.onFlashOff();
                                return;
                            }
                            if (c10 == 1) {
                                HVMagicView.camHost.onFlashAuto();
                                return;
                            } else if (c10 == 2) {
                                HVMagicView.camHost.onFlashTorchOn();
                                return;
                            } else {
                                if (c10 != 3) {
                                    return;
                                }
                                HVMagicView.camHost.onFlashOn();
                                return;
                            }
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                        }
                    } else {
                        if (str.equals("auto")) {
                            c10 = 1;
                            if (c10 != 0) {
                            }
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                        }
                    }
                } catch (Exception e10) {
                    HVLog.e(CameraEngine1.this.LOG_TAG, "updateCamHostFlashMode() :" + e10.getMessage());
                }
            }
        });
    }

    private void zoomModify(int i10) {
        Camera camera;
        HVLog.d(TAG, "zoomModify() called with: zoomValue = [" + i10 + "]");
        if (!this.isZoomSupported || (camera = this.mCamera) == null) {
            return;
        }
        float f10 = i10;
        try {
            this.zoomCurrent = f10;
            if (f10 <= this.zoomMax) {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setZoom((int) this.zoomCurrent);
                this.mCamera.setParameters(parameters);
            }
        } catch (Exception e10) {
            HVLog.e(this.LOG_TAG, "zoomModify() :" + e10.getMessage());
        }
    }

    public void addPreviewCallback(byte[] bArr) {
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.addCallbackBuffer(bArr);
        }
    }

    public void autoFocus() {
        HVLog.d(TAG, "autoFocus() called");
        try {
            Camera camera = this.mCamera;
            if (camera != null) {
                camera.autoFocus(null);
            }
        } catch (Exception e10) {
            HVLog.d(TAG, "autoFocus: " + e10.getMessage());
        }
    }

    public void changeCamera() {
        HVLog.d(TAG, "changeCamera() called");
        openCamera();
        startPreview();
    }

    public void clearEvent(Camera.AutoFocusCallback autoFocusCallback) {
        Camera.Parameters parameters;
        try {
            Camera camera = this.mCamera;
            if (camera != null) {
                try {
                    camera.cancelAutoFocus();
                    parameters = this.mCamera.getParameters();
                } catch (Throwable th) {
                    HVLog.e(TAG, "clearEvent: " + th.getMessage());
                    parameters = null;
                }
                if (parameters != null) {
                    if (parameters.getMaxNumMeteringAreas() > 0) {
                        parameters.setMeteringAreas(null);
                    }
                    if (parameters.getMaxNumFocusAreas() > 0) {
                        parameters.setFocusAreas(null);
                    }
                    String str = this.focusMode;
                    if (str != null) {
                        parameters.setFocusMode(str);
                    }
                    try {
                        this.mCamera.cancelAutoFocus();
                        this.mCamera.setParameters(parameters);
                    } catch (Exception e10) {
                        HVLog.e(TAG, "clearEvent: " + e10.getMessage());
                    }
                }
            }
        } catch (Exception e11) {
            HVLog.e(TAG, "clearEvent: " + e11.getMessage());
        }
    }

    public void destroyEngine() {
        HVLog.d(TAG, "destroyEngine() called");
        instance = null;
    }

    public Camera.Size getBestPictureSize() {
        if (this.isReleased) {
            return null;
        }
        return HVCamUtils.newChosensize;
    }

    public Camera getCamera() {
        return this.mCamera;
    }

    public Camera.CameraInfo getCameraInfo() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.mCameraID, cameraInfo);
        return cameraInfo;
    }

    int getFrontCameraId() {
        HVLog.d(TAG, "getFrontCameraId() called");
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i10 = 0; i10 < Camera.getNumberOfCameras(); i10++) {
                Camera.getCameraInfo(i10, cameraInfo);
                if (cameraInfo.facing == 1) {
                    return i10;
                }
            }
        } catch (Exception e10) {
            HVLog.e(TAG, "setExposure: " + e10.getMessage());
        }
        return 0;
    }

    public boolean getIsStillImageMode() {
        HVLog.d(TAG, "getIsStillImageMode() called");
        return this.isStillImageMode;
    }

    public int getOrientation() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.mCameraID, cameraInfo);
        return cameraInfo.orientation;
    }

    public Camera.Size getPreviewSize() {
        if (this.isReleased) {
            return null;
        }
        return this.mCamera.getParameters().getPreviewSize();
    }

    public boolean isFrontFacingCamera() {
        try {
            return getCameraInfo().facing == 1;
        } catch (Exception e10) {
            HVLog.e(TAG, "isFrontFacingCamera: " + e10.getMessage());
            return false;
        }
    }

    public boolean isReleased() {
        return this.isReleased;
    }

    public void nextFlashMode() {
        String str;
        HVLog.d(TAG, "nextFlashMode() called");
        try {
            List<String> list = availableFlashmodes;
            if (list == null || (str = currentMode) == null) {
                return;
            }
            int indexOf = list.indexOf(str);
            String str2 = availableFlashmodes.get(indexOf == availableFlashmodes.size() + (-1) ? 0 : indexOf + 1);
            currentMode = str2;
            setFlashMode(str2);
        } catch (Exception e10) {
            HVLog.e(TAG, "nextFlashMode: " + e10.getMessage());
        }
    }

    public boolean openCamera() {
        HVLog.d(TAG, "openCamera() called");
        try {
            this.isScreenFlashOn = false;
            try {
                HVCamHost hVCamHost = HVMagicView.camHost;
                if (hVCamHost != null) {
                    hVCamHost.setScreenFlashOff();
                }
            } catch (Exception e10) {
                Log.d(this.LOG_TAG, e10.getMessage());
            }
            this.mCamera.getParameters();
            this.isReleased = false;
        } catch (Throwable th) {
            HVLog.e(TAG, "openCamera: exception -" + th.getMessage());
            this.isReleased = true;
            this.mCamera = null;
        }
        Camera camera = this.mCamera;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                this.currParameters = parameters;
                this.isZoomSupported = parameters.isZoomSupported();
                HVLog.d("scale", "supported ?? ::" + this.isZoomSupported);
                int maxZoom = this.currParameters.getMaxZoom();
                this.zoomMax = maxZoom;
                HVCamHost hVCamHost2 = HVMagicView.camHost;
                if (hVCamHost2 != null) {
                    hVCamHost2.zoomMaxLevel(maxZoom);
                }
                return false;
            } catch (Throwable th2) {
                HVLog.e(TAG, "openCamera: " + th2.getMessage());
                this.isReleased = true;
                this.mCamera = null;
                return openCamera();
            }
        }
        try {
            this.mCamera = Camera.open(this.mCameraID);
            this.isReleased = false;
            HVMagicView.updateRatios();
            setDefaultParameters();
            List<String> supportedFlashModes = this.mCamera.getParameters().getSupportedFlashModes();
            if (supportedFlashModes != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : supportedFlashModes) {
                    if (supportedFlashModesStillImage.contains(str)) {
                        arrayList.add(str);
                    }
                }
                availableFlashmodes = arrayList;
            } else {
                availableFlashmodes = null;
            }
            currentMode = this.mCamera.getParameters().getFlashMode();
            updateCamHostFlashMode();
            if (CameraEngine.isFacePriority()) {
                this.mCamera.setFaceDetectionListener(new Camera.FaceDetectionListener() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine1.1
                    @Override // android.hardware.Camera.FaceDetectionListener
                    public void onFaceDetection(Camera.Face[] faceArr, Camera camera2) {
                    }
                });
                if (this.mCamera.getParameters().getMaxNumDetectedFaces() > 0 && !this.isDetectingFace) {
                    try {
                        this.isDetectingFace = true;
                        this.mCamera.startFaceDetection();
                    } catch (RuntimeException e11) {
                        HVLog.e(TAG, e11.getMessage());
                    }
                }
            }
            Camera.Parameters parameters2 = this.mCamera.getParameters();
            this.currParameters = parameters2;
            this.isZoomSupported = parameters2.isZoomSupported();
            this.zoomMax = this.currParameters.getMaxZoom();
            this.zooms = this.currParameters.getZoomRatios();
            HVCamHost hVCamHost3 = HVMagicView.camHost;
            if (hVCamHost3 != null) {
                hVCamHost3.zoomMaxLevel(this.zoomMax);
                HVCamHost hVCamHost4 = HVMagicView.camHost;
                Camera.Size size = HVCamUtils.newChosensize;
                hVCamHost4.onPictureSizeSet(size.width, size.height);
            }
            for (int i10 = 0; i10 < 5; i10++) {
                this.byteBuffer[i10] = new byte[((getPreviewSize().width * getPreviewSize().height) * ImageFormat.getBitsPerPixel(17)) / 8];
                addPreviewCallback(this.byteBuffer[i10]);
            }
            setPreviewCallbackWithBuffer(getPreviewCallBack());
            return true;
        } catch (RuntimeException e12) {
            if (!TextUtils.isEmpty(e12.getMessage())) {
                HVLog.e(TAG, "openCamera: " + e12.getMessage());
            }
            return false;
        }
    }

    public void releaseCamera() {
        HVLog.d(TAG, "releaseCamera() called");
        if (this.mCamera != null) {
            HVCamUtils.newChosensize = null;
            if (this.isDetectingFace && CameraEngine.isFacePriority()) {
                try {
                    this.isDetectingFace = false;
                    this.mCamera.stopFaceDetection();
                } catch (RuntimeException e10) {
                    HVLog.e(TAG, "releaseCamera: " + e10.getMessage());
                }
            }
            this.currParameters = null;
            try {
                this.mCamera.setPreviewCallback(null);
            } catch (Exception e11) {
                HVLog.e(TAG, "releaseCamera: " + e11.getMessage());
            }
            try {
                this.mCamera.stopPreview();
            } catch (Exception e12) {
                HVLog.e(TAG, "releaseCamera: " + e12.getMessage());
            }
            try {
                this.mCamera.release();
            } catch (Exception e13) {
                HVLog.e(TAG, "releaseCamera: " + e13.getMessage());
            }
            this.mCamera = null;
            this.isReleased = true;
        }
    }

    public void resetZoom() {
        HVLog.d(TAG, "resetZoom() called");
        if (CameraEngine.shouldUseDefaultZoom) {
            Camera.Parameters parameters = this.mCamera.getParameters();
            parameters.setZoom(1);
            this.mCamera.setParameters(parameters);
        }
    }

    public void setEffect(String str) {
        HVLog.d(TAG, "setEffect() called with: effect = [" + str + "]");
        Camera camera = this.mCamera;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setColorEffect(str);
                this.mCamera.setParameters(parameters);
            } catch (Exception e10) {
                HVLog.e(TAG, "setEffect: " + e10.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setExposure(double d10) {
        int round;
        int round2;
        HVLog.d(TAG, "setExposure() called with: exposure = [" + d10 + "]");
        try {
            Camera.Parameters parameters = this.mCamera.getParameters();
            float exposureCompensationStep = parameters.getExposureCompensationStep();
            float exposureCompensation = parameters.getExposureCompensation();
            int maxExposureCompensation = parameters.getMaxExposureCompensation();
            int minExposureCompensation = parameters.getMinExposureCompensation();
            int ceil = (int) Math.ceil(((exposureCompensation * exposureCompensationStep) + ((float) d10)) / exposureCompensationStep);
            float f10 = ceil;
            float f11 = f10 - exposureCompensation;
            if (f11 <= 1.0f) {
                if (exposureCompensation - f10 > 1.0f) {
                    round = Math.round(exposureCompensation);
                    round2 = Math.round(f11 / 2.0f);
                }
                if (ceil >= minExposureCompensation) {
                    maxExposureCompensation = minExposureCompensation;
                } else if (ceil <= maxExposureCompensation) {
                    maxExposureCompensation = ceil;
                }
                parameters.setExposureCompensation(maxExposureCompensation);
                this.mCamera.setParameters(parameters);
            }
            round = Math.round(exposureCompensation);
            round2 = Math.round(f11 / 2.0f);
            ceil = round + round2;
            if (ceil >= minExposureCompensation) {
            }
            parameters.setExposureCompensation(maxExposureCompensation);
            this.mCamera.setParameters(parameters);
        } catch (Exception e10) {
            HVLog.e(this.LOG_TAG, "setExposure : " + e10.getMessage());
        }
    }

    public void setFlashMode(String str) {
        HVLog.d(TAG, "setFlashMode() called with: flashMode = [" + str + "]");
        try {
            currentMode = str;
            Camera.Parameters parameters = this.mCamera.getParameters();
            parameters.setFlashMode(str);
            this.mCamera.setParameters(parameters);
            updateCamHostFlashMode();
        } catch (Exception e10) {
            HVLog.e(TAG, "setFlashMode: " + e10.getMessage());
        }
    }

    public void setFocusArea(float f10, float f11, float f12, float f13, Camera.AutoFocusCallback autoFocusCallback) {
        Camera.Parameters parameters;
        HVLog.d(TAG, "setFocusArea() called with: top = [" + f10 + "], bottom = [" + f11 + "], left = [" + f12 + "], right = [" + f13 + "], callback = [" + autoFocusCallback + "]");
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.cancelAutoFocus();
            Rect focusRect = getFocusRect(f10, f11, f12, f13);
            try {
                parameters = this.mCamera.getParameters();
            } catch (Exception e10) {
                HVLog.e(TAG, "setFocusArea: " + e10.getMessage());
                parameters = null;
            }
            if (parameters != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Camera.Area(focusRect, 1000));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new Camera.Area(focusRect, 400));
                if (parameters.getMaxNumFocusAreas() > 0) {
                    parameters.setFocusMode("auto");
                    parameters.setFocusAreas(arrayList);
                } else {
                    HVLog.d(TAG, "setFocusArea: No focusing supported");
                }
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    parameters.setMeteringAreas(arrayList2);
                } else {
                    HVLog.d(TAG, "setFocusArea: No metering supported");
                }
                try {
                    this.mCamera.setParameters(parameters);
                    this.mCamera.autoFocus(autoFocusCallback);
                } catch (Exception e11) {
                    HVLog.e(TAG, "setFocusArea: " + e11.getMessage());
                }
            }
        }
    }

    public void setFocusMode(String str) {
        Camera.Parameters parameters;
        Camera camera = this.mCamera;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return;
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (!supportedFocusModes.contains(str)) {
            str = "auto";
            if (!supportedFocusModes.contains("auto")) {
                return;
            }
        }
        parameters.setFocusMode(str);
        this.focusMode = str;
        Camera camera2 = this.mCamera;
        if (camera2 != null) {
            camera2.setParameters(parameters);
        }
    }

    public void setInitialFrontCam(boolean z10) {
        this.scheduler = Executors.newScheduledThreadPool(1);
        if (z10) {
            this.mCameraID = getFrontCameraId();
        } else {
            this.mCameraID = 0;
        }
    }

    public void setIsStillImageMode(boolean z10) {
        HVLog.d(TAG, "setIsStillImageMode() called with: isStillImageMode = [" + z10 + "]");
        this.isStillImageMode = z10;
    }

    public void setOrientation(int i10) {
        HVLog.d(TAG, "setOrientation() called with: orientation = [" + i10 + "]");
        this.currentOrientation = i10 % 360;
        try {
            Camera camera = this.mCamera;
            if (camera == null || this.isReleased) {
                return;
            }
            HVCamUtils.setPictureOrientation(this.mCameraID, camera, i10 % 360);
        } catch (Exception e10) {
            HVLog.e(TAG, "setOrientation: " + e10.getMessage());
        }
    }

    public void setPreviewCallbackWithBuffer(Camera.PreviewCallback previewCallback) {
        HVLog.d(TAG, "setPreviewCallbackWithBuffer() called with: previewCallback = [" + previewCallback + "]");
        this.mCamera.setPreviewCallbackWithBuffer(previewCallback);
    }

    public void setScreenDisplaySize(Point point) {
        HVLog.d(TAG, "setScreenDisplaySize() called with: size = [" + point + "]");
        this.screenWidth = point.x;
        this.screenHeight = point.y;
    }

    public void setTouchEvent(float f10, float f11, Camera.AutoFocusCallback autoFocusCallback) {
        Camera.Parameters parameters;
        HVLog.d(TAG, "setTouchEvent() called with: x = [" + f10 + "], y = [" + f11 + "], callback = [" + autoFocusCallback + "]");
        if (this.mCamera != null) {
            Rect calculateTapArea = calculateTapArea(f10, f11);
            try {
                this.mCamera.cancelAutoFocus();
                parameters = this.mCamera.getParameters();
            } catch (Exception e10) {
                HVLog.e(TAG, "setTouchEvent: " + e10.getMessage());
                parameters = null;
            }
            if (parameters != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Camera.Area(calculateTapArea, 1000));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new Camera.Area(calculateTapArea, 400));
                if (parameters.getMaxNumFocusAreas() > 0) {
                    parameters.setFocusMode("auto");
                    parameters.setFocusAreas(arrayList);
                } else {
                    Log.e(this.LOG_TAG, "No focusing supported");
                }
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    parameters.setMeteringAreas(arrayList2);
                } else {
                    HVLog.d(TAG, "setTouchEvent: No metering supported");
                }
                try {
                    this.mCamera.setParameters(parameters);
                    this.mCamera.autoFocus(autoFocusCallback);
                } catch (Exception e11) {
                    HVLog.e(TAG, "setTouchEvent: " + e11.getMessage());
                }
            }
        }
    }

    public void setUseEnhancedCamera(boolean z10) {
        HVLog.d(TAG, "setUseEnhancedCamera() called with: enhancedCamera = [" + z10 + "]");
        this.useEnhancedCamera = z10;
    }

    public void setZoom(float f10) {
        HVLog.d(TAG, "setZoom() called with: delta = [" + f10 + "]");
        if (this.isZoomSupported) {
            zoomModify((int) f10);
        }
    }

    public void setZoomBase() {
        HVLog.d(TAG, "setZoomBase() called");
        if (this.mCamera != null) {
            this.zoomBase = this.zoomMax;
        }
    }

    public void setZoomLevel(int i10) {
        HVLog.d(TAG, "setZoomLevel() called with: scale = [" + i10 + "]");
        List<Integer> list = this.zooms;
        if (list == null || list.isEmpty()) {
            return;
        }
        int intValue = this.zooms.get(0).intValue();
        for (int i11 = 0; i11 < this.zooms.size(); i11++) {
            if (intValue > 0 && intValue * i10 < this.zooms.get(i11).intValue()) {
                float f10 = i11;
                this.zoomCurrent = f10;
                zoomModify((int) f10);
                return;
            }
        }
    }

    public void startPreview(SurfaceTexture surfaceTexture) {
        HVLog.d(TAG, "startPreview() called with: surfaceTexture = [" + surfaceTexture + "]");
        try {
            this.mCamera.setPreviewTexture(surfaceTexture);
            this.mCamera.startPreview();
            setOrientation(0);
        } catch (Exception e10) {
            HVLog.e(TAG, "startPreview: " + e10.getMessage());
        }
    }

    public void stopZoom() {
        HVLog.d(TAG, "stopZoom() called");
    }

    public void switchCamera() {
        HVLog.d(TAG, "switchCamera() called");
        releaseCamera();
        if (this.mCameraID == 0) {
            this.mCameraID = 1;
        } else {
            this.mCameraID = 0;
        }
        openCamera();
        startPreview();
    }

    public void takePicture(Camera.ShutterCallback shutterCallback, Camera.PictureCallback pictureCallback, Camera.PictureCallback pictureCallback2) {
        HVLog.d(TAG, "takePicture() called with: shuttercallback = [" + shutterCallback + "], rawCallback = [" + pictureCallback + "], jpegCallback = [" + pictureCallback2 + "]");
        try {
            Camera.Parameters parameters = this.mCamera.getParameters();
            this.shutterCallback = shutterCallback;
            this.pictureCallback = pictureCallback2;
            if (parameters.getMaxNumFocusAreas() <= 0 || this.mCameraID != 0) {
                takePictureInternal();
            } else {
                this.mCamera.cancelAutoFocus();
                final ScheduledFuture<?> schedule = this.scheduler.schedule(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        List list = CameraEngine1.cancelAutoFocusList;
                        String str = Build.MODEL;
                        if (!list.contains(str) && !CameraEngine1.stopAutoFocusList.contains(str)) {
                            CameraEngine1.this.mCamera.cancelAutoFocus();
                        }
                        CameraEngine1.this.takePictureInternal();
                    }
                }, 1000L, TimeUnit.MILLISECONDS);
                if (!stopAutoFocusList.contains(Build.MODEL)) {
                    this.mCamera.autoFocus(new Camera.AutoFocusCallback() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine1.3
                        @Override // android.hardware.Camera.AutoFocusCallback
                        public void onAutoFocus(boolean z10, Camera camera) {
                            if (schedule.cancel(false)) {
                                CameraEngine1.this.takePictureInternal();
                            }
                        }
                    });
                }
            }
        } catch (Exception e10) {
            HVLog.e(TAG, "takePicture: " + e10.getMessage());
            takePictureInternal();
        }
    }

    public void takePictureInternal() {
        HVLog.d(TAG, "takePictureInternal() called");
        if (this.mCamera != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine1.4
                @Override // java.lang.Runnable
                public void run() {
                    if (CameraEngine.isScreenFlashSet()) {
                        HVCamHost hVCamHost = HVMagicView.camHost;
                        if (hVCamHost != null) {
                            hVCamHost.setScreenFlashOn();
                        }
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine1.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                CameraEngine1.this.mCamera.takePicture(CameraEngine1.this.shutterCallback, null, CameraEngine1.this.pictureCallback);
                            }
                        }, 500L);
                        return;
                    }
                    try {
                        CameraEngine1.this.mCamera.takePicture(CameraEngine1.this.shutterCallback, null, CameraEngine1.this.pictureCallback);
                    } catch (Exception e10) {
                        HVLog.e(CameraEngine1.TAG, "takePictureInternal: " + e10.getMessage());
                        try {
                            HVCamHost hVCamHost2 = HVMagicView.camHost;
                            if (hVCamHost2 != null) {
                                hVCamHost2.onPictureFailed();
                            }
                        } catch (Exception e11) {
                            HVLog.e(CameraEngine1.TAG, "takePictureInternal: " + e11.getMessage());
                        }
                    }
                }
            });
        }
    }

    public void startPreview() {
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.startPreview();
            this.mCamera.cancelAutoFocus();
        }
    }
}
