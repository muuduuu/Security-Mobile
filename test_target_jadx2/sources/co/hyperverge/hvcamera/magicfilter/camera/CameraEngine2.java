package co.hyperverge.hvcamera.magicfilter.camera;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.WindowManager;
import co.hyperverge.hvcamera.HVCamHost;
import co.hyperverge.hvcamera.HVLog;
import co.hyperverge.hvcamera.HVMagicView;
import co.hyperverge.hvcamera.magicfilter.utils.AutoFocusHelper;
import co.hyperverge.hvcamera.magicfilter.utils.BitmapUtil;
import co.hyperverge.hvcamera.magicfilter.utils.Camera2Utils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public class CameraEngine2 {
    private static final String HVLog_TAG = "co.hyperverge.hvcamera.magicfilter.camera.CameraEngine2";
    private static final SparseIntArray ORIENTATIONS;
    public static CameraEngine2 cameraEngine2;
    private static int orientation;
    private static final List<Integer> supportedModes;
    private static final List<Integer> supportedModesVideo;
    private List<Integer> availableFlashmodes;
    private Context context;
    private int flashMode;
    private boolean isFocused;
    private boolean isStillImageMode;
    private Handler mBackgroundHandler;
    private HandlerThread mBackgroundThread;
    private CameraDevice mCameraDevice;
    private String mCameraId;
    private CameraCaptureSession mCaptureSession;
    private Size mCaptureSize;
    private ImageReader mImageReader;
    private ImageReader mImageReaderNew;
    private CaptureRequest mPreviewRequest;
    private CaptureRequest.Builder mPreviewRequestBuilder;
    private Size mPreviewSize;
    private int mSensorOrientation;
    private int mState;
    private Surface mSurface;
    private CameraManager manager;
    private PictureListener pictureListener;
    private int screenHeight;
    private int screenWidth;
    private boolean useFrontCam;
    private float zoomCurrent;
    private float zoomMax;
    private Rect zoomRect;
    private final int STATE_PREVIEW = 0;
    private final int STATE_WAITING_LOCK = 1;
    private final int STATE_WAITING_PRECAPTURE = 2;
    private final int STATE_WAITING_NON_PRECAPTURE = 3;
    private final int STATE_PICTURE_TAKEN = 4;
    private boolean isCameraOpened = false;
    private float currentExposure = -1.0f;
    private final Matrix matrix = new Matrix();
    private final Semaphore mCameraOpenCloseLock = new Semaphore(1);
    private final int ANTIBANDING_MODE = -1;
    private int OIS_MODE = -1;
    private boolean isReleased = true;
    private boolean captureTriggered = false;
    private final CameraDevice.StateCallback mStateCallback = new CameraDevice.StateCallback() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine2.1
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            CameraEngine2.this.mCameraOpenCloseLock.release();
            cameraDevice.close();
            CameraEngine2.this.mCameraDevice = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            CameraEngine2.this.mCameraOpenCloseLock.release();
            cameraDevice.close();
            CameraEngine2.this.mCameraDevice = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            CameraEngine2.this.mCameraOpenCloseLock.release();
            CameraEngine2.this.mCameraDevice = cameraDevice;
        }
    };
    private boolean isInitialized = false;
    private boolean isLegacy = false;
    private final float[] focusRegion = {-1.0f, -1.0f};
    private boolean isZoomSupported = false;
    private float zoomBase = 0.0f;
    private boolean useEnhancedCamera = false;
    private int counter = 0;
    private int data2counter = 0;
    private final byte[][] data2 = new byte[5][];
    private final byte[][] byteBuffer = new byte[5][];
    public boolean willNeedNextFrame = false;
    private final String TAG = "CameraEngine2";
    private final CameraCaptureSession.CaptureCallback mCaptureCallback = new CameraCaptureSession.CaptureCallback() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine2.2
        private void process(CaptureResult captureResult) {
            HVCamHost hVCamHost;
            int i10 = CameraEngine2.this.mState;
            if (i10 == 0) {
                try {
                    CameraEngine2.this.currentExposure = ((Integer) captureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue();
                } catch (Exception e10) {
                    HVLog.d(CameraEngine2.HVLog_TAG, e10.getMessage());
                }
                try {
                    int intValue = ((Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE)).intValue();
                    if (intValue == 0) {
                        CameraEngine2.this.isFocused = false;
                        return;
                    }
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue != 4) {
                                    CameraEngine2.this.isFocused = false;
                                    return;
                                }
                            }
                        }
                        if (!CameraEngine2.this.isFocused && (hVCamHost = HVMagicView.camHost) != null) {
                            hVCamHost.showCrossHair(CameraEngine2.this.focusRegion[0], CameraEngine2.this.focusRegion[1], true);
                        }
                        CameraEngine2.this.isFocused = true;
                        return;
                    }
                    HVCamHost hVCamHost2 = HVMagicView.camHost;
                    if (hVCamHost2 != null) {
                        hVCamHost2.showCrossHair(CameraEngine2.this.focusRegion[0], CameraEngine2.this.focusRegion[1], false);
                    }
                    CameraEngine2.this.isFocused = false;
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num == null || num.intValue() == 5 || num.intValue() == 4 || num.intValue() == 2) {
                        CameraEngine2.this.mState = 3;
                        return;
                    }
                    return;
                }
                if (i10 != 3) {
                    return;
                }
                Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num2 == null || num2.intValue() != 5) {
                    CameraEngine2.this.mState = 4;
                    CameraEngine2.this.captureStillPicture();
                    return;
                }
                return;
            }
            Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num3 == null) {
                CameraEngine2.this.mState = 4;
                CameraEngine2.this.captureStillPicture();
                return;
            }
            if (4 == num3.intValue() || 5 == num3.intValue()) {
                HVCamHost hVCamHost3 = HVMagicView.camHost;
                if (hVCamHost3 != null) {
                    hVCamHost3.showCrossHair(CameraEngine2.this.focusRegion[0], CameraEngine2.this.focusRegion[1], 4 == num3.intValue());
                }
                CameraEngine2.this.isFocused = false;
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num4 != null && num4.intValue() != 2) {
                    CameraEngine2.this.runPrecaptureSequence();
                    return;
                } else {
                    CameraEngine2.this.mState = 4;
                    CameraEngine2.this.captureStillPicture();
                    return;
                }
            }
            if (num3.intValue() == 3) {
                HVCamHost hVCamHost4 = HVMagicView.camHost;
                if (hVCamHost4 != null) {
                    hVCamHost4.showCrossHair(CameraEngine2.this.focusRegion[0], CameraEngine2.this.focusRegion[1], false);
                    return;
                }
                return;
            }
            CameraEngine2.this.mState = 4;
            HVCamHost hVCamHost5 = HVMagicView.camHost;
            if (hVCamHost5 != null) {
                hVCamHost5.showCrossHair(CameraEngine2.this.focusRegion[0], CameraEngine2.this.focusRegion[1], true);
            }
            CameraEngine2.this.captureStillPicture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            try {
                process(totalCaptureResult);
                HVCamHost hVCamHost = HVMagicView.camHost;
                if (hVCamHost != null) {
                    hVCamHost.onReady();
                }
            } catch (Exception e10) {
                HVLog.d(CameraEngine2.HVLog_TAG, e10.getMessage());
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            process(captureResult);
        }
    };
    private final CameraCaptureSession.CaptureCallback mCaptureCallback2 = new CameraCaptureSession.CaptureCallback() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine2.3
        private void process(CaptureResult captureResult) {
            CameraEngine2.this.mState = 1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            process(totalCaptureResult);
        }
    };
    public boolean returnNextFrame = false;

    public interface PictureListener {
        void onNewPreviewFrame(byte[] bArr, int i10, int i11, int i12, int i13, byte[] bArr2);

        void onPictureTaken(byte[] bArr);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ORIENTATIONS = sparseIntArray;
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
        ArrayList arrayList = new ArrayList();
        supportedModes = arrayList;
        arrayList.add(3);
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        supportedModesVideo = arrayList2;
        arrayList2.add(3);
        arrayList2.add(1);
    }

    private static void cancelAutoFocus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void captureStillPicture() {
        CameraDevice cameraDevice;
        try {
            if (this.context != null && (cameraDevice = this.mCameraDevice) != null && !this.captureTriggered) {
                this.captureTriggered = true;
                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(2);
                createCaptureRequest.addTarget(this.mImageReader.getSurface());
                createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
                if (builder.get(key) != null) {
                    createCaptureRequest.set(key, (MeteringRectangle[]) this.mPreviewRequestBuilder.get(key));
                }
                CaptureRequest.Builder builder2 = this.mPreviewRequestBuilder;
                CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_REGIONS;
                if (builder2.get(key2) != null) {
                    createCaptureRequest.set(key2, (MeteringRectangle[]) this.mPreviewRequestBuilder.get(key2));
                }
                if (CameraEngine.isFacePriority()) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
                }
                try {
                    if (this.useEnhancedCamera) {
                        createCaptureRequest.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, 0);
                    }
                } catch (Exception e10) {
                    HVLog.e(HVLog_TAG, e10.getMessage());
                }
                setCurrentFlash(createCaptureRequest);
                CameraCharacteristics cameraCharacteristics = this.manager.getCameraCharacteristics(this.mCameraId);
                if (CameraEngine.shouldUseDefaultZoom) {
                    createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, getZoomRect(1.0f));
                } else {
                    Rect rect = this.zoomRect;
                    if (rect != null) {
                        createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, rect);
                    }
                }
                createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(getJpegOrientation(cameraCharacteristics, orientation)));
                CameraCaptureSession.CaptureCallback captureCallback = new CameraCaptureSession.CaptureCallback() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine2.5
                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                        CameraEngine2.this.unlockFocus();
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
                        super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                        HVCamHost hVCamHost = HVMagicView.camHost;
                        if (hVCamHost != null) {
                            hVCamHost.flashScreen();
                        }
                    }
                };
                CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.stopRepeating();
                    this.mCaptureSession.capture(createCaptureRequest.build(), captureCallback, null);
                }
            }
        } catch (Exception e11) {
            HVLog.d(HVLog_TAG, e11.getMessage());
        }
    }

    private void destroy() {
        this.context = null;
    }

    private String getCameraId(int i10) {
        try {
            for (String str : this.manager.getCameraIdList()) {
                Integer num = (Integer) this.manager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == i10) {
                    return str;
                }
            }
            return null;
        } catch (Exception e10) {
            HVLog.d(HVLog_TAG, e10.getMessage());
            return null;
        }
    }

    public static CameraEngine2 getInstance() {
        if (cameraEngine2 == null) {
            cameraEngine2 = new CameraEngine2();
        }
        return cameraEngine2;
    }

    private int getJpegOrientation(CameraCharacteristics cameraCharacteristics, int i10) {
        if (i10 == -1) {
            return 0;
        }
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        if (num == null) {
            HVLog.e("CameraEngine2", "Sensor orientation is null");
            return 0;
        }
        int i11 = ((i10 + 45) / 90) * 90;
        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        if (num2 != null && num2.intValue() == 0) {
            i11 = -i11;
        }
        int intValue = ((num.intValue() + i11) + 360) % 360;
        HVLog.i("camera", "jpegOrientation: " + intValue);
        return intValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be A[Catch: Exception -> 0x0035, IllegalArgumentException -> 0x00d6, TRY_LEAVE, TryCatch #1 {IllegalArgumentException -> 0x00d6, blocks: (B:20:0x0099, B:22:0x00be), top: B:19:0x0099, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$openCamera$0(ImageReader imageReader) {
        HVLog.d("CameraEngine2", "openCamera.setOnImageAvailableListener() called");
        try {
            Image acquireLatestImage = imageReader.acquireLatestImage();
            int i10 = ((((orientation + 45) / 90) * 90) % 360) + (this.mSensorOrientation - 270);
            int i11 = CameraEngine.isFrontFacingCamera() ? Build.MODEL.toLowerCase().contains("rk3399-all") ? (450 - i10) % 360 : (630 - i10) % 360 : Build.MODEL.toLowerCase().contains("comio x1") ? (i10 + 90) % 360 : (630 - i10) % 360;
            byte[] YUV_420_888toNV21 = YUV_420_888toNV21(acquireLatestImage);
            acquireLatestImage.close();
            System.currentTimeMillis();
            this.counter = (this.counter + 1) % 3;
            if (YUV_420_888toNV21 == null) {
                HVLog.e("CameraEngine2", "YUV conversion failed: nv21 is null");
                return;
            }
            int width = getPreviewSize().getWidth();
            int height = getPreviewSize().getHeight();
            try {
                if (i11 != 90) {
                    if (i11 == 270) {
                    }
                    int i12 = width;
                    int i13 = height;
                    this.data2counter = (this.data2counter + 1) % 5;
                    int width2 = getPreviewSize().getWidth();
                    int height2 = getPreviewSize().getHeight();
                    CameraEngine.rotateNV21a(YUV_420_888toNV21, width2, height2, i11, this.data2[this.data2counter]);
                    if (this.pictureListener == null) {
                        this.pictureListener.onNewPreviewFrame(this.data2[this.data2counter], i12, i13, ((i10 + 360) + (this.mSensorOrientation - 270)) % 360, i11, BitmapUtil.createByteArrayForFrame(YUV_420_888toNV21, width2, height2, i11));
                        return;
                    }
                    return;
                }
                this.data2counter = (this.data2counter + 1) % 5;
                int width22 = getPreviewSize().getWidth();
                int height22 = getPreviewSize().getHeight();
                CameraEngine.rotateNV21a(YUV_420_888toNV21, width22, height22, i11, this.data2[this.data2counter]);
                if (this.pictureListener == null) {
                }
            } catch (IllegalArgumentException e10) {
                HVLog.d(HVLog_TAG, e10.getMessage());
                return;
            }
            width = getPreviewSize().getHeight();
            height = getPreviewSize().getWidth();
            int i122 = width;
            int i132 = height;
        } catch (Exception e11) {
            HVLog.d(HVLog_TAG, e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openCamera$1(ImageReader imageReader) {
        Log.d("CameraEngine2", "openCamera() called reader");
        try {
            Image acquireLatestImage = imageReader.acquireLatestImage();
            ByteBuffer buffer = acquireLatestImage.getPlanes()[0].getBuffer();
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            PictureListener pictureListener = this.pictureListener;
            if (pictureListener != null) {
                pictureListener.onPictureTaken(bArr);
            }
            acquireLatestImage.close();
        } catch (Exception e10) {
            HVLog.d(HVLog_TAG, e10.getMessage());
        }
    }

    private void lockFocus() {
        try {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            this.mState = 1;
            this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback2, this.mBackgroundHandler);
            HVCamHost hVCamHost = HVMagicView.camHost;
            if (hVCamHost != null) {
                float[] fArr = this.focusRegion;
                hVCamHost.showCrossHair(fArr[0], fArr[1], false);
            }
        } catch (Exception e10) {
            HVLog.d(HVLog_TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runPrecaptureSequence() {
        try {
            if (this.mCaptureSession != null) {
                setCurrentFlash(this.mPreviewRequestBuilder);
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                this.mState = 2;
                this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mBackgroundHandler);
            }
        } catch (Exception e10) {
            HVLog.d(HVLog_TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentFlash(CaptureRequest.Builder builder) {
        List<Integer> list = this.availableFlashmodes;
        if (list == null || !list.contains(Integer.valueOf(this.flashMode))) {
            return;
        }
        try {
            int i10 = this.flashMode;
            if (i10 == 1) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i10 == 2) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
            } else if (i10 != 3) {
                if (i10 != 4) {
                    builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
                } else {
                    builder.set(CaptureRequest.FLASH_MODE, 4);
                }
            } else if (this.isStillImageMode) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 2);
            } else {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 2);
            }
        } catch (Exception e10) {
            HVLog.d(HVLog_TAG, e10.getMessage());
        }
    }

    private void startBackgroundThread() {
        try {
            HandlerThread handlerThread = new HandlerThread("CameraBackground");
            this.mBackgroundThread = handlerThread;
            handlerThread.start();
            this.mBackgroundHandler = new Handler(this.mBackgroundThread.getLooper());
        } catch (Exception e10) {
            HVLog.d(HVLog_TAG, e10.getMessage());
        }
    }

    private void stopBackgroundThread() {
        try {
            this.mBackgroundThread.quitSafely();
            try {
                this.mBackgroundThread.join();
                this.mBackgroundThread = null;
                this.mBackgroundHandler = null;
            } catch (InterruptedException e10) {
                HVLog.d(HVLog_TAG, e10.getMessage());
            }
        } catch (Exception e11) {
            HVLog.d(HVLog_TAG, e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unlockFocus() {
        try {
            if (this.mCaptureSession != null) {
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mBackgroundHandler);
                this.mState = 0;
                this.mCaptureSession.setRepeatingRequest(this.mPreviewRequest, this.mCaptureCallback, this.mBackgroundHandler);
            }
        } catch (Exception e10) {
            HVLog.d(HVLog_TAG, e10.getMessage());
        }
    }

    private void updateCamHostFlashMode() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine2.6
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0058 -> B:19:0x0069). Please report as a decompilation issue!!! */
            @Override // java.lang.Runnable
            public void run() {
                if (HVMagicView.camHost != null) {
                    if (CameraEngine2.this.flashMode <= 0 || (CameraEngine2.this.availableFlashmodes != null && CameraEngine2.this.availableFlashmodes.size() == 1 && ((Integer) CameraEngine2.this.availableFlashmodes.get(0)).intValue() == 1)) {
                        HVMagicView.camHost.onFlashNull();
                        return;
                    }
                    try {
                        int i10 = CameraEngine2.this.flashMode;
                        if (i10 == 1) {
                            HVMagicView.camHost.onFlashOff();
                        } else if (i10 == 2) {
                            HVMagicView.camHost.onFlashAuto();
                        } else if (i10 == 3) {
                            HVMagicView.camHost.onFlashOn();
                        }
                    } catch (Exception e10) {
                        HVLog.d(CameraEngine2.HVLog_TAG, e10.getMessage());
                    }
                }
            }
        });
    }

    private void updateFlash(int[] iArr) {
        if (iArr == null) {
            this.availableFlashmodes = null;
            this.flashMode = -1;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            Integer valueOf = Integer.valueOf(i10);
            if (this.isStillImageMode) {
                if (supportedModes.contains(valueOf)) {
                    arrayList.add(valueOf);
                }
            } else if (supportedModesVideo.contains(valueOf)) {
                arrayList.add(valueOf);
            }
        }
        this.availableFlashmodes = arrayList;
        if (arrayList.isEmpty()) {
            this.flashMode = -1;
        } else {
            this.flashMode = this.availableFlashmodes.get(0).intValue();
        }
    }

    private void zoomModify(float f10) {
        if (!this.isZoomSupported || this.mCameraId == null || f10 <= 0.0f) {
            return;
        }
        try {
            float f11 = this.zoomMax;
            if (f10 <= f11) {
                this.zoomCurrent = f10;
                if (f10 <= f11) {
                    this.zoomRect = getZoomRect(f10);
                    this.mPreviewRequestBuilder.set(CaptureRequest.SCALER_CROP_REGION, getZoomRect(this.zoomCurrent));
                    CaptureRequest build = this.mPreviewRequestBuilder.build();
                    this.mPreviewRequest = build;
                    try {
                        this.mCaptureSession.setRepeatingRequest(build, this.mCaptureCallback, this.mBackgroundHandler);
                    } catch (CameraAccessException e10) {
                        HVLog.d(HVLog_TAG, e10.getMessage());
                    }
                }
            }
        } catch (Exception e11) {
            HVLog.d(HVLog_TAG, e11.getMessage());
        }
    }

    public byte[] YUV_420_888toNV21(Image image) {
        if (image == null || image.getFormat() != 35) {
            HVLog.e("CameraEngine2", "Invalid image or format");
            return null;
        }
        try {
            Rect cropRect = image.getCropRect();
            int width = cropRect.width();
            int height = cropRect.height();
            if (width > 0 && height > 0 && width <= 8192 && height <= 8192) {
                Image.Plane[] planes = image.getPlanes();
                if (planes != null && planes.length >= 3) {
                    int i10 = 2;
                    byte[] bArr = new byte[((width * height) * 3) / 2];
                    int i11 = 0;
                    ByteBuffer buffer = planes[0].getBuffer();
                    int rowStride = planes[0].getRowStride();
                    int pixelStride = planes[0].getPixelStride();
                    int i12 = 1;
                    ByteBuffer buffer2 = planes[1].getBuffer();
                    int rowStride2 = planes[1].getRowStride();
                    int pixelStride2 = planes[1].getPixelStride();
                    ByteBuffer buffer3 = planes[2].getBuffer();
                    int rowStride3 = planes[2].getRowStride();
                    int pixelStride3 = planes[2].getPixelStride();
                    int i13 = 0;
                    while (i11 < height) {
                        int i14 = i11 * rowStride;
                        int i15 = 0;
                        while (i15 < width) {
                            if (pixelStride == i12) {
                                bArr[i13] = buffer.get(i14 + i15);
                                i13++;
                            } else {
                                bArr[i13] = buffer.get(i14 + (i15 * pixelStride));
                                i13++;
                            }
                            i15++;
                            i12 = 1;
                        }
                        i11++;
                        i10 = 2;
                        i12 = 1;
                    }
                    int i16 = i10;
                    int i17 = height / i16;
                    int i18 = width / i16;
                    for (int i19 = 0; i19 < i17; i19++) {
                        for (int i20 = 0; i20 < i18; i20++) {
                            int i21 = i13 + 1;
                            bArr[i13] = buffer3.get((i19 * rowStride3) + (i20 * pixelStride3));
                            i13 += 2;
                            bArr[i21] = buffer2.get((i19 * rowStride2) + (i20 * pixelStride2));
                        }
                    }
                    return bArr;
                }
                HVLog.e("CameraEngine2", "Invalid image planes");
                return null;
            }
            HVLog.e("CameraEngine2", "Invalid dimensions: " + width + "x" + height);
            return null;
        } catch (Exception e10) {
            HVLog.e("CameraEngine2", "YUV conversion error: " + e10.getMessage());
            return null;
        }
    }

    public void clearEvent(Object obj) {
        try {
            float[] fArr = this.focusRegion;
            fArr[0] = -1.0f;
            fArr[1] = -1.0f;
            CameraCharacteristics cameraCharacteristics = this.manager.getCameraCharacteristics(this.mCameraId);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) {
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, null);
            } else {
                HVLog.e(HVLog_TAG, "No focusing supported");
            }
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) {
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, null);
            } else {
                HVLog.e(HVLog_TAG, "No metering supported");
            }
            CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            builder.set(key, 2);
            this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mBackgroundHandler);
            this.mPreviewRequestBuilder.set(key, 0);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 4);
            CaptureRequest build = this.mPreviewRequestBuilder.build();
            this.mPreviewRequest = build;
            this.mCaptureSession.setRepeatingRequest(build, this.mCaptureCallback, this.mBackgroundHandler);
        } catch (Exception e10) {
            HVLog.d(HVLog_TAG, e10.getMessage());
        }
    }

    public void closeCamera() {
        Camera2Utils.newChosensize = null;
        try {
            try {
                try {
                    try {
                        HVLog.e("CameraEngine2", "closing  camera");
                        this.mCameraOpenCloseLock.acquire();
                        CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
                        if (cameraCaptureSession != null) {
                            cameraCaptureSession.abortCaptures();
                            this.mCaptureSession.close();
                            this.mCaptureSession = null;
                        }
                        CameraDevice cameraDevice = this.mCameraDevice;
                        if (cameraDevice != null) {
                            cameraDevice.close();
                            this.mCameraDevice = null;
                        }
                        ImageReader imageReader = this.mImageReader;
                        if (imageReader != null) {
                            try {
                                imageReader.close();
                            } catch (Exception unused) {
                                HVLog.e("CameraEngine2", "This image was not produced by this ImageReader");
                            }
                            this.mImageReader = null;
                        }
                        ImageReader imageReader2 = this.mImageReaderNew;
                        if (imageReader2 != null) {
                            try {
                                imageReader2.close();
                            } catch (Exception unused2) {
                                HVLog.e("CameraEngine2", "This image was not produced by this ImageReader");
                            }
                            this.mImageReaderNew = null;
                        }
                        stopBackgroundThread();
                    } catch (InterruptedException e10) {
                        throw new RuntimeException("Interrupted while trying to lock camera closing.", e10);
                    }
                } catch (CameraAccessException unused3) {
                    HVLog.e("CameraEngine2", "Camera abort captures exception");
                }
            } catch (IllegalStateException unused4) {
                HVLog.e("CameraEngine2", "Capture session is no longer active");
            }
            this.mCameraOpenCloseLock.release();
            this.captureTriggered = false;
            this.isCameraOpened = false;
            this.isReleased = true;
        } catch (Throwable th) {
            this.mCameraOpenCloseLock.release();
            this.captureTriggered = false;
            this.isCameraOpened = false;
            this.isReleased = true;
            throw th;
        }
    }

    public void createCameraPreviewSession(final SurfaceTexture surfaceTexture) {
        if (this.mCameraDevice == null || !this.isCameraOpened) {
            return;
        }
        this.mBackgroundHandler.post(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine2.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (surfaceTexture != null) {
                        CameraEngine2.this.mSurface = new Surface(surfaceTexture);
                        surfaceTexture.setDefaultBufferSize(CameraEngine2.this.mPreviewSize.getWidth(), CameraEngine2.this.mPreviewSize.getHeight());
                        CameraEngine2 cameraEngine22 = CameraEngine2.this;
                        cameraEngine22.mPreviewRequestBuilder = cameraEngine22.mCameraDevice.createCaptureRequest(1);
                        CameraEngine2.this.mPreviewRequestBuilder.addTarget(CameraEngine2.this.mSurface);
                        if (CameraEngine.isSetPreviewCallback()) {
                            CameraEngine2.this.mPreviewRequestBuilder.addTarget(CameraEngine2.this.mImageReaderNew.getSurface());
                        }
                        CameraEngine2.this.mState = 0;
                        CameraEngine2.this.mCameraDevice.createCaptureSession(CameraEngine.isSetPreviewCallback() ? Arrays.asList(CameraEngine2.this.mSurface, CameraEngine2.this.mImageReader.getSurface(), CameraEngine2.this.mImageReaderNew.getSurface()) : Arrays.asList(CameraEngine2.this.mSurface, CameraEngine2.this.mImageReader.getSurface()), new CameraCaptureSession.StateCallback() { // from class: co.hyperverge.hvcamera.magicfilter.camera.CameraEngine2.4.1
                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                            public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                                HVLog.i("camera", "config failed");
                            }

                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                            public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                                if (CameraEngine2.this.mCameraDevice == null || !CameraEngine2.this.isCameraOpened) {
                                    return;
                                }
                                try {
                                    CameraEngine2.this.mCaptureSession = cameraCaptureSession;
                                    CameraEngine2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 4);
                                    CameraEngine2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_MODE, 1);
                                    if (CameraEngine.isFacePriority()) {
                                        CameraEngine2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
                                    }
                                    if (CameraEngine2.this.OIS_MODE == 1) {
                                        CameraEngine2.this.mPreviewRequestBuilder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                                        CameraEngine2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                                    } else {
                                        CameraEngine2.this.mPreviewRequestBuilder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                                        CameraEngine2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                                    }
                                    if (CameraEngine.shouldUseDefaultZoom) {
                                        CaptureRequest.Builder builder = CameraEngine2.this.mPreviewRequestBuilder;
                                        CaptureRequest.Key key = CaptureRequest.SCALER_CROP_REGION;
                                        CameraEngine2 cameraEngine23 = CameraEngine2.this;
                                        builder.set(key, cameraEngine23.getZoomRect(cameraEngine23.zoomCurrent));
                                    }
                                    CameraEngine2 cameraEngine24 = CameraEngine2.this;
                                    cameraEngine24.setCurrentFlash(cameraEngine24.mPreviewRequestBuilder);
                                    CameraEngine2 cameraEngine25 = CameraEngine2.this;
                                    cameraEngine25.mPreviewRequest = cameraEngine25.mPreviewRequestBuilder.build();
                                    try {
                                        CameraEngine2.this.mCaptureSession.setRepeatingRequest(CameraEngine2.this.mPreviewRequest, CameraEngine2.this.mCaptureCallback, CameraEngine2.this.mBackgroundHandler);
                                    } catch (Exception e10) {
                                        HVLog.d(CameraEngine2.HVLog_TAG, e10.getMessage());
                                    }
                                } catch (Exception e11) {
                                    HVLog.d(CameraEngine2.HVLog_TAG, e11.getMessage());
                                }
                            }
                        }, null);
                    }
                } catch (Exception e10) {
                    HVLog.d(CameraEngine2.HVLog_TAG, e10.getMessage());
                }
            }
        });
    }

    public void destroyEngine() {
        cameraEngine2 = null;
    }

    public Size getCaptureSize() {
        return this.mCaptureSize;
    }

    public boolean getIsStillImageMode() {
        return this.isStillImageMode;
    }

    public int getOrientation() {
        ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (!Build.MODEL.toLowerCase().contains("comio x1") || this.useFrontCam) ? 180 : 0;
    }

    public Size getPreviewSize() {
        return this.mPreviewSize;
    }

    public int getVideoRotation() {
        try {
            return getJpegOrientation(this.manager.getCameraCharacteristics(this.mCameraId), orientation);
        } catch (CameraAccessException e10) {
            HVLog.d(HVLog_TAG, e10.getMessage());
            return 0;
        }
    }

    public Rect getZoomRect(float f10) {
        try {
            return AutoFocusHelper.cropRegionForZoom(this.manager.getCameraCharacteristics(this.mCameraId), f10, this.zoomMax);
        } catch (Exception e10) {
            HVLog.d(HVLog_TAG, e10.getMessage());
            return new Rect(0, 0, 0, 0);
        }
    }

    public void init(Context context, boolean z10) {
        setContext(context);
        this.isInitialized = true;
        this.isReleased = false;
        this.manager = (CameraManager) this.context.getSystemService("camera");
        this.useFrontCam = z10;
        this.flashMode = 1;
    }

    public boolean isFrontFacingCamera() {
        return this.useFrontCam;
    }

    public boolean isReleased() {
        return this.isReleased;
    }

    public void nextFlashMode() {
        List<Integer> list = this.availableFlashmodes;
        if (list == null || !list.contains(Integer.valueOf(this.flashMode))) {
            return;
        }
        int indexOf = this.availableFlashmodes.indexOf(Integer.valueOf(this.flashMode));
        int intValue = this.availableFlashmodes.get(indexOf == this.availableFlashmodes.size() + (-1) ? 0 : indexOf + 1).intValue();
        this.flashMode = intValue;
        setFlashMode(intValue);
    }

    public void openCamera() {
        HVLog.d("CameraEngine2", "openCamera() called");
        if (this.useFrontCam) {
            this.mCameraId = getCameraId(0);
        }
        if (this.mCameraId == null || !this.useFrontCam) {
            this.mCameraId = getCameraId(1);
        }
        startBackgroundThread();
        try {
            if (!this.mCameraOpenCloseLock.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Time out waiting to lock camera opening.");
            }
            this.manager.openCamera(this.mCameraId, this.mStateCallback, this.mBackgroundHandler);
            CameraCharacteristics cameraCharacteristics = this.manager.getCameraCharacteristics(this.mCameraId);
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            HVMagicView.updateRatios();
            updateFlash((int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES));
            float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
            this.zoomMax = floatValue;
            if (floatValue > 1.0f) {
                this.isZoomSupported = true;
            }
            float f10 = CameraEngine.zoomFactor;
            this.zoomCurrent = f10;
            this.zoomRect = getZoomRect(f10);
            float f11 = this.zoomMax;
            this.zoomBase = f11;
            HVCamHost hVCamHost = HVMagicView.camHost;
            if (hVCamHost != null) {
                hVCamHost.zoomMaxLevel((int) f11);
            }
            updateCamHostFlashMode();
            float[] fArr = this.focusRegion;
            fArr[0] = -1.0f;
            fArr[1] = -1.0f;
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                this.OIS_MODE = -1;
                for (int i10 : iArr) {
                    if (i10 == 1) {
                        this.OIS_MODE = 1;
                        break;
                    }
                }
            }
            try {
                CameraEngine.hardwareInfo.put("focalCalibration", cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION));
                CameraEngine.hardwareInfo.put("cameraIds", a.a(",", this.manager.getCameraIdList()));
            } catch (Exception e10) {
                HVLog.d(HVLog_TAG, e10.getMessage());
            }
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                this.isLegacy = true;
            }
            HVCamHost hVCamHost2 = HVMagicView.camHost;
            if (hVCamHost2 != null) {
                hVCamHost2.getAspectRatio();
            }
            if (HVMagicView.camHost != null) {
                this.mPreviewSize = Camera2Utils.getBestPreviewSize(streamConfigurationMap, HVMagicView.getmRatioWidth(), HVMagicView.getmRatioHeight(), HVMagicView.camHost.getPreviewMegapixels());
                Size bestCaptureSize = Camera2Utils.getBestCaptureSize(streamConfigurationMap, HVMagicView.getmRatioWidth(), HVMagicView.getmRatioHeight(), HVMagicView.camHost.getPictureMegapixels(), HVMagicView.camHost.isShouldCaptureHighResolutionImage());
                this.mCaptureSize = bestCaptureSize;
                HVMagicView.camHost.onPictureSizeSet(bestCaptureSize.getWidth(), this.mCaptureSize.getHeight());
            }
            this.mImageReader = ImageReader.newInstance(this.mCaptureSize.getWidth(), this.mCaptureSize.getHeight(), PSKKeyManager.MAX_KEY_LENGTH_BYTES, 2);
            if (CameraEngine.isSetPreviewCallback()) {
                this.mImageReaderNew = ImageReader.newInstance(this.mPreviewSize.getWidth(), this.mPreviewSize.getHeight(), 35, 5);
                for (int i11 = 0; i11 < 5; i11++) {
                    this.data2[i11] = new byte[getPreviewSize().getWidth() * getPreviewSize().getHeight()];
                }
                this.mImageReaderNew.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: co.hyperverge.hvcamera.magicfilter.camera.b
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader) {
                        CameraEngine2.this.lambda$openCamera$0(imageReader);
                    }
                }, this.mBackgroundHandler);
            }
            this.mImageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: co.hyperverge.hvcamera.magicfilter.camera.c
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    CameraEngine2.this.lambda$openCamera$1(imageReader);
                }
            }, this.mBackgroundHandler);
            this.mSensorOrientation = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            getJpegOrientation(cameraCharacteristics, orientation);
            this.isCameraOpened = true;
        } catch (CameraAccessException e11) {
            HVLog.d(HVLog_TAG, e11.getMessage());
        } catch (InterruptedException e12) {
            throw new RuntimeException("Interrupted while trying to lock camera opening.", e12);
        } catch (RuntimeException unused) {
            openCamera();
        } catch (Exception e13) {
            HVLog.d(HVLog_TAG, e13.getMessage());
        }
    }

    public void pause() {
        stopBackgroundThread();
    }

    public void resume() {
        startBackgroundThread();
    }

    public void setContext(Context context) {
        this.context = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setExposure(double d10) {
        int round;
        int round2;
        try {
            CameraCharacteristics cameraCharacteristics = this.manager.getCameraCharacteristics(this.mCameraId);
            Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
            float floatValue = ((Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP)).floatValue();
            float f10 = this.currentExposure;
            int intValue = ((Integer) range.getUpper()).intValue();
            int intValue2 = ((Integer) range.getLower()).intValue();
            int ceil = (int) Math.ceil(((f10 * floatValue) + ((float) d10)) / floatValue);
            float f11 = ceil;
            float f12 = f11 - f10;
            if (f12 <= 1.0f) {
                if (f10 - f11 > 1.0f) {
                    round = Math.round(f10);
                    round2 = Math.round(f12 / 2.0f);
                }
                if (ceil >= intValue2) {
                    intValue = intValue2;
                } else if (ceil <= intValue) {
                    intValue = ceil;
                }
                CaptureRequest.Builder createCaptureRequest = this.mCameraDevice.createCaptureRequest(2);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(intValue));
                this.mCaptureSession.capture(createCaptureRequest.build(), null, this.mBackgroundHandler);
            }
            round = Math.round(f10);
            round2 = Math.round(f12 / 2.0f);
            ceil = round + round2;
            if (ceil >= intValue2) {
            }
            CaptureRequest.Builder createCaptureRequest2 = this.mCameraDevice.createCaptureRequest(2);
            createCaptureRequest2.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(intValue));
            this.mCaptureSession.capture(createCaptureRequest2.build(), null, this.mBackgroundHandler);
        } catch (Exception e10) {
            HVLog.d(HVLog_TAG, e10.getMessage());
        }
    }

    public void setFlashMode(int i10) {
        this.flashMode = i10;
        setCurrentFlash(this.mPreviewRequestBuilder);
        CaptureRequest build = this.mPreviewRequestBuilder.build();
        this.mPreviewRequest = build;
        try {
            this.mCaptureSession.setRepeatingRequest(build, this.mCaptureCallback, this.mBackgroundHandler);
        } catch (Exception e10) {
            HVLog.d(HVLog_TAG, e10.getMessage());
        }
        updateCamHostFlashMode();
    }

    public void setFocusRectangle(float f10, float f11, float f12, float f13, Camera.AutoFocusCallback autoFocusCallback) {
        float f14;
        float f15;
        if (this.mCameraId != null) {
            cancelAutoFocus();
            if (this.useFrontCam) {
                f15 = 1.0f - f12;
                f14 = 1.0f - f13;
            } else {
                f14 = f12;
                f15 = f13;
            }
            float[] fArr = this.focusRegion;
            fArr[0] = (f14 + f15) / 2.0f;
            fArr[1] = (f10 + f11) / 2.0f;
            MeteringRectangle[] afRegionsForRectangle = AutoFocusHelper.afRegionsForRectangle(f10, f11, f14, f15, this.zoomRect, this.mSensorOrientation);
            try {
                CameraCharacteristics cameraCharacteristics = this.manager.getCameraCharacteristics(this.mCameraId);
                if (((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) {
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    if (afRegionsForRectangle != null) {
                        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, afRegionsForRectangle);
                    }
                } else {
                    HVLog.e(HVLog_TAG, "No focusing supported");
                }
                if (((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) {
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, afRegionsForRectangle);
                } else {
                    HVLog.e(HVLog_TAG, "No metering supported");
                }
                CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
                CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                builder.set(key, 2);
                CaptureRequest.Builder builder2 = this.mPreviewRequestBuilder;
                CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
                builder2.set(key2, 2);
                this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mBackgroundHandler);
                this.mPreviewRequestBuilder.set(key, 1);
                this.mPreviewRequestBuilder.set(key2, 1);
                this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mBackgroundHandler);
                this.mPreviewRequestBuilder.set(key, 0);
                this.mPreviewRequestBuilder.set(key2, 0);
                this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mBackgroundHandler);
            } catch (Exception e10) {
                HVLog.d(HVLog_TAG, e10.getMessage());
            }
        }
    }

    public void setIsStillImageMode(boolean z10) {
        this.isStillImageMode = z10;
    }

    public void setOrientation(int i10) {
        orientation = i10 % 360;
    }

    public void setPictureListener(PictureListener pictureListener) {
        this.pictureListener = pictureListener;
    }

    public void setScreenDisplaySize(Point point) {
        this.screenWidth = point.x;
        this.screenHeight = point.y;
    }

    public void setTouchEvent(float f10, float f11, Camera.AutoFocusCallback autoFocusCallback) {
        if (this.mCameraId != null) {
            cancelAutoFocus();
            float[] fArr = this.focusRegion;
            fArr[0] = f10;
            fArr[1] = f11;
            if (this.useFrontCam) {
                f10 = 1.0f - f10;
            }
            MeteringRectangle[] afRegionsForNormalizedCoord = AutoFocusHelper.afRegionsForNormalizedCoord(f10, f11, this.zoomRect, this.mSensorOrientation);
            MeteringRectangle[] aeRegionsForNormalizedCoord = AutoFocusHelper.aeRegionsForNormalizedCoord(f10, f11, this.zoomRect, this.mSensorOrientation);
            try {
                CameraCharacteristics cameraCharacteristics = this.manager.getCameraCharacteristics(this.mCameraId);
                if (((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) {
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    if (afRegionsForNormalizedCoord != null) {
                        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, afRegionsForNormalizedCoord);
                    }
                } else {
                    HVLog.e(HVLog_TAG, "No focusing supported");
                }
                if (((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) {
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    if (aeRegionsForNormalizedCoord != null) {
                        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, aeRegionsForNormalizedCoord);
                    }
                } else {
                    HVLog.e(HVLog_TAG, "No metering supported");
                }
                CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
                CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                builder.set(key, 2);
                CaptureRequest.Builder builder2 = this.mPreviewRequestBuilder;
                CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
                builder2.set(key2, 2);
                this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mBackgroundHandler);
                this.mPreviewRequestBuilder.set(key, 1);
                this.mPreviewRequestBuilder.set(key2, 1);
                this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mBackgroundHandler);
                this.mPreviewRequestBuilder.set(key, 0);
                this.mPreviewRequestBuilder.set(key2, 0);
                this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mBackgroundHandler);
            } catch (Exception e10) {
                HVLog.d(HVLog_TAG, e10.getMessage());
            }
        }
    }

    public void setUseEnhancedCamera(boolean z10) {
        this.useEnhancedCamera = z10;
    }

    public void setZoom(float f10) {
        if (this.isZoomSupported) {
            zoomModify(f10);
        }
    }

    public void stopZoom() {
    }

    public void switchCamera() {
        this.useFrontCam = !this.useFrontCam;
    }

    public void takePicture() {
        lockFocus();
    }
}
