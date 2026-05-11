package co.hyperverge.hvcamera.magicfilter.display;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import co.hyperverge.hvcamera.GLTextureView;
import co.hyperverge.hvcamera.HVCamHost;
import co.hyperverge.hvcamera.HVMagicView;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine2;
import co.hyperverge.hvcamera.magicfilter.filter.base.MagicCameraInputFilter;
import co.hyperverge.hvcamera.magicfilter.utils.OpenGLUtils;
import co.hyperverge.hvcamera.magicfilter.utils.Rotation;
import co.hyperverge.hvcamera.magicfilter.utils.SaveTask;
import co.hyperverge.hvcamera.magicfilter.utils.SaveTask2;
import co.hyperverge.hvcamera.magicfilter.utils.TextureRotationUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public class MagicCameraDisplay2 extends MagicDisplay {
    private static final String TAG = "co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay2";
    private CameraHandlerThread camHandler;
    private CameraEngine2 cameraEngine2;
    private final MagicCameraInputFilter mCameraInputFilter;
    SaveTask2.onPictureSaveListener mListener;
    private SurfaceTexture.OnFrameAvailableListener mOnFrameAvailableListener;
    private MyPictureCallback mPictureCallback;
    private SurfaceTexture mSurfaceTexture;
    private float[] mtx;
    private CameraEngine2.PictureListener pictureListener;

    private static class CameraHandlerThread extends HandlerThread {
        private final Handler backHandler;
        WeakReference<CameraEngine2> cameraEngine2WeakReference;
        private Runnable changeCamera;
        WeakReference<MagicCameraDisplay2> magicCameraDisplayWeakReference;
        private Runnable openCamera;
        private Runnable releaseCamera;
        private Runnable switchCamera;
        private final Handler uiHandler;
        private Runnable uiSetupRunnable;

        public CameraHandlerThread(MagicCameraDisplay2 magicCameraDisplay2, CameraEngine2 cameraEngine2) {
            super("CameraHandler");
            this.releaseCamera = new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay2.CameraHandlerThread.1
                @Override // java.lang.Runnable
                public void run() {
                    MagicCameraDisplay2 magicCameraDisplay22 = CameraHandlerThread.this.magicCameraDisplayWeakReference.get();
                    CameraEngine2 cameraEngine22 = CameraHandlerThread.this.cameraEngine2WeakReference.get();
                    CameraHandlerThread.this.uiHandler.removeCallbacksAndMessages(null);
                    magicCameraDisplay22.mGLTextureView.removeCallbacks(null);
                    cameraEngine22.closeCamera();
                }
            };
            this.openCamera = new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay2.CameraHandlerThread.2
                @Override // java.lang.Runnable
                public void run() {
                    MagicCameraDisplay2 magicCameraDisplay22 = CameraHandlerThread.this.magicCameraDisplayWeakReference.get();
                    CameraEngine2 cameraEngine22 = CameraHandlerThread.this.cameraEngine2WeakReference.get();
                    CameraHandlerThread.this.uiHandler.removeCallbacksAndMessages(null);
                    if (magicCameraDisplay22 == null || cameraEngine22 == null) {
                        return;
                    }
                    cameraEngine22.openCamera();
                    magicCameraDisplay22.adjustPosition(cameraEngine22.getOrientation(), true, false);
                    CameraHandlerThread.this.uiHandler.post(CameraHandlerThread.this.uiSetupRunnable);
                }
            };
            this.switchCamera = new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay2.CameraHandlerThread.3
                @Override // java.lang.Runnable
                public void run() {
                    MagicCameraDisplay2 magicCameraDisplay22 = CameraHandlerThread.this.magicCameraDisplayWeakReference.get();
                    CameraEngine2 cameraEngine22 = CameraHandlerThread.this.cameraEngine2WeakReference.get();
                    CameraHandlerThread.this.uiHandler.removeCallbacksAndMessages(null);
                    if (magicCameraDisplay22 == null || cameraEngine22 == null) {
                        return;
                    }
                    try {
                        magicCameraDisplay22.mGLTextureView.removeCallbacks(null);
                        cameraEngine22.closeCamera();
                        cameraEngine22.switchCamera();
                        cameraEngine22.openCamera();
                        magicCameraDisplay22.adjustPosition(cameraEngine22.getOrientation(), true, false);
                        CameraHandlerThread.this.uiHandler.post(CameraHandlerThread.this.uiSetupRunnable);
                        HVCamHost hVCamHost = HVMagicView.camHost;
                        if (hVCamHost != null) {
                            hVCamHost.onCameraFlipCallback();
                        }
                    } catch (Exception e10) {
                        Log.e(MagicCameraDisplay2.TAG, e10.getMessage());
                    }
                }
            };
            this.changeCamera = new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay2.CameraHandlerThread.4
                @Override // java.lang.Runnable
                public void run() {
                    CameraHandlerThread.this.uiHandler.removeCallbacksAndMessages(null);
                    MagicCameraDisplay2 magicCameraDisplay22 = CameraHandlerThread.this.magicCameraDisplayWeakReference.get();
                    CameraEngine2 cameraEngine22 = CameraHandlerThread.this.cameraEngine2WeakReference.get();
                    if (magicCameraDisplay22 == null || cameraEngine22 == null) {
                        return;
                    }
                    try {
                        magicCameraDisplay22.mGLTextureView.removeCallbacks(null);
                        cameraEngine22.closeCamera();
                        cameraEngine22.openCamera();
                    } catch (Exception e10) {
                        Log.e(MagicCameraDisplay2.TAG, e10.getMessage());
                    }
                    CameraHandlerThread.this.uiHandler.post(CameraHandlerThread.this.uiSetupRunnable);
                }
            };
            this.uiSetupRunnable = new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay2.CameraHandlerThread.5
                @Override // java.lang.Runnable
                public void run() {
                    MagicCameraDisplay2 magicCameraDisplay22 = CameraHandlerThread.this.magicCameraDisplayWeakReference.get();
                    Log.i("camera", "setup called");
                    magicCameraDisplay22.setUpCamera();
                    magicCameraDisplay22.setFilter(MagicDisplay.currentFiltertype);
                    magicCameraDisplay22.mGLTextureView.requestLayout();
                    HVMagicView.reLayout();
                }
            };
            this.magicCameraDisplayWeakReference = new WeakReference<>(magicCameraDisplay2);
            this.cameraEngine2WeakReference = new WeakReference<>(cameraEngine2);
            start();
            this.backHandler = new Handler(getLooper());
            this.uiHandler = new Handler(Looper.getMainLooper());
        }

        public void triggerChange() {
            this.backHandler.removeCallbacksAndMessages(null);
            this.backHandler.post(this.changeCamera);
        }

        public void triggerClose() {
            this.backHandler.removeCallbacksAndMessages(null);
            this.backHandler.post(this.releaseCamera);
        }

        public void triggerOpen() {
            this.backHandler.removeCallbacksAndMessages(null);
            this.backHandler.post(this.openCamera);
        }

        public void triggerSwitchCamera() {
            this.backHandler.removeCallbacksAndMessages(null);
            this.backHandler.post(this.switchCamera);
        }
    }

    private class MyPictureCallback implements Camera.PictureCallback {
        MagicCameraDisplay2 mCameraDisplay;
        public File photoFile;

        private MyPictureCallback() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            if (this.photoFile == null) {
                Log.d(MagicCameraDisplay2.TAG, "Error creating media file, check storage permissions");
                return;
            }
            HVCamHost hVCamHost = HVMagicView.camHost;
            if (hVCamHost != null) {
                hVCamHost.onReady();
            }
            new SaveTask(this.photoFile, bArr, this.mCameraDisplay).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Boolean.valueOf(MagicCameraDisplay2.this.mFilters != null), Boolean.valueOf(CameraEngine.isFrontFacingCamera()));
        }

        public void setCameraDisplay(MagicCameraDisplay2 magicCameraDisplay2) {
            this.mCameraDisplay = magicCameraDisplay2;
        }

        public void setPhotoFile(File file) {
            this.photoFile = file;
        }
    }

    public MagicCameraDisplay2(GLTextureView gLTextureView) {
        super(gLTextureView);
        this.mOnFrameAvailableListener = new SurfaceTexture.OnFrameAvailableListener() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay2.2
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                MagicCameraDisplay2.this.mGLTextureView.requestRender();
            }
        };
        this.mListener = new SaveTask2.onPictureSaveListener() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay2.4
            @Override // co.hyperverge.hvcamera.magicfilter.utils.SaveTask2.onPictureSaveListener
            public void onSaved(String str) {
                HVCamHost hVCamHost = HVMagicView.camHost;
                if (hVCamHost != null) {
                    hVCamHost.onPictureSaved(new File(str));
                }
            }
        };
        this.mPictureCallback = new MyPictureCallback();
        this.pictureListener = new CameraEngine2.PictureListener() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay2.5
            @Override // co.hyperverge.hvcamera.magicfilter.camera.CameraEngine2.PictureListener
            public void onNewPreviewFrame(byte[] bArr, int i10, int i11, int i12, int i13, byte[] bArr2) {
                HVCamHost hVCamHost = HVMagicView.camHost;
                if (hVCamHost != null) {
                    hVCamHost.onNewPreviewFrame(bArr, i10, i11, i12, i13, bArr2);
                }
            }

            @Override // co.hyperverge.hvcamera.magicfilter.camera.CameraEngine2.PictureListener
            public void onPictureTaken(byte[] bArr) {
                HVCamHost hVCamHost = HVMagicView.camHost;
                if (hVCamHost != null) {
                    hVCamHost.onPictureReady(bArr);
                }
            }
        };
        this.mCameraInputFilter = new MagicCameraInputFilter();
        this.mtx = new float[16];
        this.cameraEngine2 = CameraEngine2.getInstance();
        this.camHandler = new CameraHandlerThread(this, this.cameraEngine2);
        MagicDisplay.currentFiltertype = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adjustPosition(int i10, boolean z10, boolean z11) {
        float[] rotation = TextureRotationUtil.getRotation(Rotation.fromInt(i10), z10, z11);
        this.mGLTextureBuffer.clear();
        this.mGLTextureBuffer.put(rotation).position(0);
    }

    public static void destroyBuffer(Buffer buffer) {
        if (buffer.isDirect()) {
            try {
                if (!buffer.getClass().getName().equals("java.nio.DirectByteBuffer")) {
                    Field declaredField = buffer.getClass().getDeclaredField("att");
                    declaredField.setAccessible(true);
                    buffer = (Buffer) declaredField.get(buffer);
                }
                Method method = buffer.getClass().getMethod("cleaner", null);
                method.setAccessible(true);
                Object invoke = method.invoke(buffer, null);
                Method method2 = invoke.getClass().getMethod("clean", null);
                method2.setAccessible(true);
                method2.invoke(invoke, null);
            } catch (Exception e10) {
                throw new RuntimeException("Could not destroy direct buffer " + buffer, e10);
            }
        }
    }

    private void drawBox(int i10) {
        GLES20.glEnable(3089);
        GLES20.glScissor(50, 200, 100, 100);
        GLES20.glClearColor(1.0f, 0.0f, 1.0f, 1.0f);
        GLES20.glClear(16384);
        GLES20.glDisable(3089);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpCamera() {
        this.mGLTextureView.removeCallbacks(null);
        this.mGLTextureView.queueEvent(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay2.3
            /* JADX WARN: Removed duplicated region for block: B:18:0x009f A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0002, B:5:0x000e, B:6:0x0035, B:10:0x0042, B:15:0x0055, B:16:0x0076, B:18:0x009f, B:20:0x00af, B:21:0x00b2, B:23:0x00b8, B:26:0x00c7, B:30:0x0066), top: B:2:0x0002 }] */
            /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                try {
                    Log.i("camera", "setup");
                    MagicCameraDisplay2 magicCameraDisplay2 = MagicCameraDisplay2.this;
                    if (magicCameraDisplay2.mTextureId == -1) {
                        magicCameraDisplay2.mTextureId = OpenGLUtils.getExternalOESTextureID();
                        MagicCameraDisplay2.this.mSurfaceTexture = new SurfaceTexture(MagicCameraDisplay2.this.mTextureId);
                        MagicCameraDisplay2.this.mSurfaceTexture.setOnFrameAvailableListener(MagicCameraDisplay2.this.mOnFrameAvailableListener);
                    }
                    Size previewSize = MagicCameraDisplay2.this.cameraEngine2.getPreviewSize();
                    if (previewSize == null) {
                        return;
                    }
                    int orientation = MagicCameraDisplay2.this.cameraEngine2.getOrientation();
                    if (orientation != 90 && orientation != 270) {
                        MagicCameraDisplay2.this.mImageWidth = previewSize.getWidth();
                        MagicCameraDisplay2.this.mImageHeight = previewSize.getHeight();
                        MagicCameraInputFilter magicCameraInputFilter = MagicCameraDisplay2.this.mCameraInputFilter;
                        MagicCameraDisplay2 magicCameraDisplay22 = MagicCameraDisplay2.this;
                        magicCameraInputFilter.onOutputSizeChanged(magicCameraDisplay22.mImageWidth, magicCameraDisplay22.mImageHeight);
                        Log.i("camera", "createpreview called");
                        MagicCameraDisplay2.this.cameraEngine2.createCameraPreviewSession(MagicCameraDisplay2.this.mSurfaceTexture);
                        if (CameraEngine.getCaptureMode()) {
                            return;
                        }
                        Size captureSize = MagicCameraDisplay2.this.cameraEngine2.getCaptureSize();
                        IntBuffer intBuffer = MagicCameraDisplay2.this.f19506ib;
                        if (intBuffer != null) {
                            intBuffer.clear();
                        }
                        IntBuffer intBuffer2 = MagicCameraDisplay2.this.f19506ib;
                        if (intBuffer2 == null || intBuffer2.capacity() < captureSize.getHeight() * captureSize.getWidth()) {
                            MagicCameraDisplay2.this.f19506ib = IntBuffer.allocate(captureSize.getHeight() * captureSize.getWidth());
                            return;
                        }
                        return;
                    }
                    MagicCameraDisplay2.this.mImageWidth = previewSize.getHeight();
                    MagicCameraDisplay2.this.mImageHeight = previewSize.getWidth();
                    MagicCameraInputFilter magicCameraInputFilter2 = MagicCameraDisplay2.this.mCameraInputFilter;
                    MagicCameraDisplay2 magicCameraDisplay222 = MagicCameraDisplay2.this;
                    magicCameraInputFilter2.onOutputSizeChanged(magicCameraDisplay222.mImageWidth, magicCameraDisplay222.mImageHeight);
                    Log.i("camera", "createpreview called");
                    MagicCameraDisplay2.this.cameraEngine2.createCameraPreviewSession(MagicCameraDisplay2.this.mSurfaceTexture);
                    if (CameraEngine.getCaptureMode()) {
                    }
                } catch (Exception e10) {
                    if (TextUtils.isEmpty(e10.getMessage())) {
                        return;
                    }
                    Log.d(MagicCameraDisplay2.TAG, e10.getMessage());
                }
            }
        });
        this.cameraEngine2.setPictureListener(this.pictureListener);
    }

    public void autoFocus() {
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void clearHandlers() {
        super.clearHandlers();
        this.camHandler = null;
        this.cameraEngine2.destroyEngine();
    }

    protected void getBitmapFromGL(final Bitmap bitmap, final boolean z10, final boolean z11, final boolean z12, final File file, final int i10) {
        this.mGLTextureView.queueEvent(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay2.6
            @Override // java.lang.Runnable
            public void run() {
                int i11;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                GLES20.glGenTextures(1, iArr2, 0);
                GLES20.glBindTexture(3553, iArr2[0]);
                GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLES20.glBindFramebuffer(36160, iArr[0]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
                GLES20.glViewport(0, 0, width, height);
                MagicCameraDisplay2.this.mFilters.onOutputSizeChanged(width, height);
                MagicCameraDisplay2 magicCameraDisplay2 = MagicCameraDisplay2.this;
                magicCameraDisplay2.mFilters.onDisplaySizeChanged(magicCameraDisplay2.mImageWidth, magicCameraDisplay2.mImageHeight);
                int loadTexture = z10 ? OpenGLUtils.loadTexture(bitmap, -1, true) : MagicCameraDisplay2.this.mTextureId;
                MagicCameraDisplay2.this.mFilters.onDrawFrame(loadTexture, z11, z12);
                IntBuffer intBuffer = MagicCameraDisplay2.this.f19506ib;
                if (intBuffer != null) {
                    intBuffer.clear();
                }
                IntBuffer intBuffer2 = MagicCameraDisplay2.this.f19506ib;
                if (intBuffer2 == null || intBuffer2.capacity() < height * width) {
                    MagicCameraDisplay2.this.f19506ib = IntBuffer.allocate(height * width);
                }
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, MagicCameraDisplay2.this.f19506ib);
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(MagicCameraDisplay2.this.f19506ib.array()));
                if (z10) {
                    i11 = 1;
                    GLES20.glDeleteTextures(1, new int[]{loadTexture}, 0);
                } else {
                    i11 = 1;
                }
                GLES20.glDeleteFramebuffers(i11, iArr, 0);
                GLES20.glDeleteTextures(i11, iArr2, 0);
                MagicCameraDisplay2 magicCameraDisplay22 = MagicCameraDisplay2.this;
                GLES20.glViewport(0, 0, magicCameraDisplay22.mSurfaceWidth, magicCameraDisplay22.mSurfaceHeight);
                MagicCameraDisplay2 magicCameraDisplay23 = MagicCameraDisplay2.this;
                magicCameraDisplay23.mFilters.onOutputSizeChanged(magicCameraDisplay23.mImageWidth, magicCameraDisplay23.mImageHeight);
                MagicCameraDisplay2.this.onGetBitmapFromGL(createBitmap, file, i10);
            }
        });
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void getBitmapfromgl(Bitmap bitmap, File file, boolean z10, boolean z11, int i10) {
        if (this.mFilters == null || MagicDisplay.currentFiltertype == 0) {
            new SaveTask2(file, this.mListener, i10).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, bitmap);
        } else {
            getBitmapFromGL(bitmap, true, z10, z11, file, i10);
        }
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void onCameraChanged() {
        this.camHandler.triggerChange();
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void onCameraFlip() {
        this.camHandler.triggerSwitchCamera();
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void onDestroy() {
        IntBuffer intBuffer = this.f19506ib;
        if (intBuffer != null) {
            destroyBuffer(intBuffer);
            this.f19506ib = null;
        }
        super.onDestroy();
    }

    @Override // co.hyperverge.hvcamera.GLTextureView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.mSurfaceTexture != null) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            try {
                this.mSurfaceTexture.updateTexImage();
            } catch (Exception e10) {
                Log.d(TAG, e10.getMessage());
            }
            this.mSurfaceTexture.getTransformMatrix(this.mtx);
            this.mCameraInputFilter.setTextureTransformMatrix(this.mtx);
            int i10 = this.mTextureId;
            if (this.mFilters == null) {
                this.mCameraInputFilter.onDrawFrame(i10, this.mGLCubeBuffer, this.mGLTextureBuffer);
            } else {
                this.mFilters.onDrawFrame(this.mCameraInputFilter.onDrawToTexture(i10), this.mGLCubeBuffer, this.mGLTextureBuffer);
            }
        }
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    protected void onFilterChanged() {
        super.onFilterChanged();
        this.mCameraInputFilter.onDisplaySizeChanged(this.mSurfaceWidth, this.mSurfaceHeight);
        if (this.mFilters != null) {
            this.mCameraInputFilter.initCameraFrameBuffer(this.mImageWidth, this.mImageHeight);
        } else {
            this.mCameraInputFilter.destroyFramebuffers();
        }
    }

    protected void onGetBitmapFromGL(Bitmap bitmap, File file, int i10) {
        new SaveTask2(file, this.mListener, i10).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, bitmap);
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void onPause() {
        super.onPause();
        CameraHandlerThread cameraHandlerThread = this.camHandler;
        if (cameraHandlerThread != null) {
            cameraHandlerThread.triggerClose();
        }
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void onResume() {
        super.onResume();
        CameraHandlerThread cameraHandlerThread = this.camHandler;
        if (cameraHandlerThread != null) {
            cameraHandlerThread.triggerOpen();
        }
    }

    @Override // co.hyperverge.hvcamera.GLTextureView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
        this.mSurfaceWidth = i10;
        this.mSurfaceHeight = i11;
        onFilterChanged();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay2.1
            @Override // java.lang.Runnable
            public void run() {
                HVCamHost hVCamHost = HVMagicView.camHost;
                if (hVCamHost != null) {
                    hVCamHost.onLayoutChange();
                }
            }
        });
    }

    @Override // co.hyperverge.hvcamera.GLTextureView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glDisable(3024);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glEnable(2884);
        GLES20.glEnable(2929);
        this.mCameraInputFilter.init();
        setFilter(MagicDisplay.currentFiltertype);
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void onTakePicture(File file, SaveTask2.onPictureSaveListener onpicturesavelistener, Camera.ShutterCallback shutterCallback) {
        this.cameraEngine2.setPictureListener(this.pictureListener);
        this.mPictureCallback.setPhotoFile(file);
        this.mPictureCallback.setCameraDisplay(this);
        this.cameraEngine2.takePicture();
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void setFilter(int i10) {
        super.setFilter(i10);
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void setTouchEvent(float f10, float f11, Camera.AutoFocusCallback autoFocusCallback) {
        CameraEngine2 cameraEngine2 = this.cameraEngine2;
        if (cameraEngine2 != null) {
            cameraEngine2.setTouchEvent(f10, f11, autoFocusCallback);
        }
    }
}
