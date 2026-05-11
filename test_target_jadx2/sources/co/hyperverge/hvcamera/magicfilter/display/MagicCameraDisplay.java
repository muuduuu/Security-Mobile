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
import co.hyperverge.hvcamera.GLTextureView;
import co.hyperverge.hvcamera.HVCamHost;
import co.hyperverge.hvcamera.HVMagicView;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine;
import co.hyperverge.hvcamera.magicfilter.camera.CameraEngine1;
import co.hyperverge.hvcamera.magicfilter.filter.base.MagicCameraInputFilter;
import co.hyperverge.hvcamera.magicfilter.utils.OpenGLUtils;
import co.hyperverge.hvcamera.magicfilter.utils.Rotation;
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
public class MagicCameraDisplay extends MagicDisplay {
    private static final String TAG = "co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay";
    private CameraHandlerThread camHandler;
    private CameraEngine1 cameraEngine1;
    private boolean isSurfaceViewCreated;
    private final MagicCameraInputFilter mCameraInputFilter;
    SaveTask2.onPictureSaveListener mListener;
    private SurfaceTexture.OnFrameAvailableListener mOnFrameAvailableListener;
    private MyPictureCallback mPictureCallback;
    private SurfaceTexture mSurfaceTexture;
    private float[] mtx;

    private static class CameraHandlerThread extends HandlerThread {
        private final Handler backHandler;
        WeakReference<CameraEngine1> cameraEngineWeakReference;
        private Runnable changeCamera;
        WeakReference<MagicCameraDisplay> magicCameraDisplayWeakReference;
        private Runnable openCamera;
        private Runnable releaseCamera;
        private Runnable switchCamera;
        private final Handler uiHandler;
        private Runnable uiSetupRunnable;

        public CameraHandlerThread(MagicCameraDisplay magicCameraDisplay, CameraEngine1 cameraEngine1) {
            super("CameraHandler");
            this.releaseCamera = new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay.CameraHandlerThread.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MagicCameraDisplay magicCameraDisplay2 = CameraHandlerThread.this.magicCameraDisplayWeakReference.get();
                        CameraEngine1 cameraEngine12 = CameraHandlerThread.this.cameraEngineWeakReference.get();
                        CameraHandlerThread.this.uiHandler.removeCallbacksAndMessages(null);
                        magicCameraDisplay2.mGLTextureView.removeCallbacks(null);
                        cameraEngine12.releaseCamera();
                    } catch (Exception e10) {
                        Log.e(MagicCameraDisplay.TAG, e10.getMessage());
                    }
                }
            };
            this.openCamera = new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay.CameraHandlerThread.2
                @Override // java.lang.Runnable
                public void run() {
                    MagicCameraDisplay magicCameraDisplay2 = CameraHandlerThread.this.magicCameraDisplayWeakReference.get();
                    CameraEngine1 cameraEngine12 = CameraHandlerThread.this.cameraEngineWeakReference.get();
                    CameraHandlerThread.this.uiHandler.removeCallbacksAndMessages(null);
                    if (magicCameraDisplay2 == null || cameraEngine12 == null) {
                        return;
                    }
                    try {
                        cameraEngine12.openCamera();
                        if (cameraEngine12.getCamera() != null) {
                            boolean isFrontFacingCamera = cameraEngine12.isFrontFacingCamera();
                            magicCameraDisplay2.adjustPosition(cameraEngine12.getOrientation(), isFrontFacingCamera, !isFrontFacingCamera);
                            CameraHandlerThread.this.uiHandler.post(CameraHandlerThread.this.uiSetupRunnable);
                        }
                    } catch (Exception e10) {
                        Log.e(MagicCameraDisplay.TAG, e10.getMessage());
                    }
                }
            };
            this.switchCamera = new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay.CameraHandlerThread.3
                @Override // java.lang.Runnable
                public void run() {
                    MagicCameraDisplay magicCameraDisplay2 = CameraHandlerThread.this.magicCameraDisplayWeakReference.get();
                    CameraEngine1 cameraEngine12 = CameraHandlerThread.this.cameraEngineWeakReference.get();
                    CameraHandlerThread.this.uiHandler.removeCallbacksAndMessages(null);
                    if (magicCameraDisplay2 == null || cameraEngine12 == null) {
                        return;
                    }
                    try {
                        magicCameraDisplay2.mGLTextureView.removeCallbacks(null);
                        cameraEngine12.releaseCamera();
                        cameraEngine12.switchCamera();
                        CameraHandlerThread.this.uiHandler.post(CameraHandlerThread.this.uiSetupRunnable);
                        HVCamHost hVCamHost = HVMagicView.camHost;
                        if (hVCamHost != null) {
                            hVCamHost.onCameraFlipCallback();
                        }
                    } catch (Exception e10) {
                        Log.e(MagicCameraDisplay.TAG, e10.getMessage());
                    }
                }
            };
            this.changeCamera = new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay.CameraHandlerThread.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        CameraHandlerThread.this.uiHandler.removeCallbacksAndMessages(null);
                        MagicCameraDisplay magicCameraDisplay2 = CameraHandlerThread.this.magicCameraDisplayWeakReference.get();
                        CameraEngine1 cameraEngine12 = CameraHandlerThread.this.cameraEngineWeakReference.get();
                        magicCameraDisplay2.mGLTextureView.removeCallbacks(null);
                        cameraEngine12.releaseCamera();
                        cameraEngine12.changeCamera();
                        CameraHandlerThread.this.uiHandler.post(CameraHandlerThread.this.uiSetupRunnable);
                    } catch (Exception e10) {
                        Log.e(MagicCameraDisplay.TAG, e10.getMessage());
                    }
                }
            };
            this.uiSetupRunnable = new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay.CameraHandlerThread.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MagicCameraDisplay magicCameraDisplay2 = CameraHandlerThread.this.magicCameraDisplayWeakReference.get();
                        Log.i("camera", "setup called");
                        magicCameraDisplay2.setUpCamera();
                        if (magicCameraDisplay2.isSurfaceViewCreated) {
                            magicCameraDisplay2.setFilter(MagicDisplay.currentFiltertype);
                        }
                        magicCameraDisplay2.mGLTextureView.requestLayout();
                        HVMagicView.reLayout();
                    } catch (Exception e10) {
                        Log.e(MagicCameraDisplay.TAG, e10.getMessage());
                    }
                }
            };
            this.magicCameraDisplayWeakReference = new WeakReference<>(magicCameraDisplay);
            this.cameraEngineWeakReference = new WeakReference<>(cameraEngine1);
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
        MagicCameraDisplay mCameraDisplay;
        public File photoFile;

        private MyPictureCallback() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            try {
                if (HVMagicView.camHost == null || MagicCameraDisplay.this.cameraEngine1 == null) {
                    return;
                }
                MagicCameraDisplay.this.cameraEngine1.startPreview();
                HVMagicView.camHost.onReady();
                HVMagicView.camHost.onPictureReady(bArr);
            } catch (Exception e10) {
                Log.d(MagicCameraDisplay.TAG, e10.getMessage());
            }
        }

        public void setCameraDisplay(MagicCameraDisplay magicCameraDisplay) {
            this.mCameraDisplay = magicCameraDisplay;
        }

        public void setPhotoFile(File file) {
            this.photoFile = file;
        }
    }

    public MagicCameraDisplay(GLTextureView gLTextureView) {
        super(gLTextureView);
        this.mOnFrameAvailableListener = new SurfaceTexture.OnFrameAvailableListener() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay.2
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                MagicCameraDisplay.this.mGLTextureView.requestRender();
            }
        };
        this.mListener = new SaveTask2.onPictureSaveListener() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay.4
            @Override // co.hyperverge.hvcamera.magicfilter.utils.SaveTask2.onPictureSaveListener
            public void onSaved(String str) {
                HVCamHost hVCamHost = HVMagicView.camHost;
                if (hVCamHost != null) {
                    hVCamHost.onPictureSaved(new File(str));
                }
            }
        };
        this.mPictureCallback = new MyPictureCallback();
        this.mCameraInputFilter = new MagicCameraInputFilter();
        this.mtx = new float[16];
        this.cameraEngine1 = CameraEngine1.getInstance();
        this.camHandler = new CameraHandlerThread(this, this.cameraEngine1);
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
        this.mGLTextureView.queueEvent(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay.3
            /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:2:0x0000, B:4:0x0007, B:5:0x002e, B:9:0x003b, B:14:0x004e, B:15:0x0063, B:17:0x0087, B:19:0x0097, B:20:0x009a, B:22:0x00a0, B:25:0x00ab, B:29:0x0059), top: B:1:0x0000 }] */
            /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                try {
                    MagicCameraDisplay magicCameraDisplay = MagicCameraDisplay.this;
                    if (magicCameraDisplay.mTextureId == -1) {
                        magicCameraDisplay.mTextureId = OpenGLUtils.getExternalOESTextureID();
                        MagicCameraDisplay.this.mSurfaceTexture = new SurfaceTexture(MagicCameraDisplay.this.mTextureId);
                        MagicCameraDisplay.this.mSurfaceTexture.setOnFrameAvailableListener(MagicCameraDisplay.this.mOnFrameAvailableListener);
                    }
                    Camera.Size previewSize = MagicCameraDisplay.this.cameraEngine1.getPreviewSize();
                    if (previewSize == null) {
                        return;
                    }
                    int orientation = MagicCameraDisplay.this.cameraEngine1.getOrientation();
                    if (orientation != 90 && orientation != 270) {
                        MagicCameraDisplay magicCameraDisplay2 = MagicCameraDisplay.this;
                        magicCameraDisplay2.mImageWidth = previewSize.width;
                        magicCameraDisplay2.mImageHeight = previewSize.height;
                        MagicCameraInputFilter magicCameraInputFilter = MagicCameraDisplay.this.mCameraInputFilter;
                        MagicCameraDisplay magicCameraDisplay3 = MagicCameraDisplay.this;
                        magicCameraInputFilter.onOutputSizeChanged(magicCameraDisplay3.mImageWidth, magicCameraDisplay3.mImageHeight);
                        MagicCameraDisplay.this.cameraEngine1.startPreview(MagicCameraDisplay.this.mSurfaceTexture);
                        if (CameraEngine.getCaptureMode()) {
                            return;
                        }
                        Camera.Size bestPictureSize = MagicCameraDisplay.this.cameraEngine1.getBestPictureSize();
                        IntBuffer intBuffer = MagicCameraDisplay.this.f19506ib;
                        if (intBuffer != null) {
                            intBuffer.clear();
                        }
                        IntBuffer intBuffer2 = MagicCameraDisplay.this.f19506ib;
                        if (intBuffer2 == null || intBuffer2.capacity() < bestPictureSize.height * bestPictureSize.width) {
                            MagicCameraDisplay.this.f19506ib = IntBuffer.allocate(bestPictureSize.height * bestPictureSize.width);
                            return;
                        }
                        return;
                    }
                    MagicCameraDisplay magicCameraDisplay4 = MagicCameraDisplay.this;
                    magicCameraDisplay4.mImageWidth = previewSize.height;
                    magicCameraDisplay4.mImageHeight = previewSize.width;
                    MagicCameraInputFilter magicCameraInputFilter2 = MagicCameraDisplay.this.mCameraInputFilter;
                    MagicCameraDisplay magicCameraDisplay32 = MagicCameraDisplay.this;
                    magicCameraInputFilter2.onOutputSizeChanged(magicCameraDisplay32.mImageWidth, magicCameraDisplay32.mImageHeight);
                    MagicCameraDisplay.this.cameraEngine1.startPreview(MagicCameraDisplay.this.mSurfaceTexture);
                    if (CameraEngine.getCaptureMode()) {
                    }
                } catch (Exception e10) {
                    if (TextUtils.isEmpty(e10.getMessage())) {
                        return;
                    }
                    Log.d(MagicCameraDisplay.TAG, e10.getMessage());
                }
            }
        });
    }

    public void autoFocus() {
        CameraEngine1.getInstance().autoFocus();
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void clearHandlers() {
        super.clearHandlers();
        this.camHandler = null;
        this.cameraEngine1.destroyEngine();
        this.cameraEngine1 = null;
    }

    protected void getBitmapFromGL(final Bitmap bitmap, final boolean z10, final boolean z11, final boolean z12, final File file, final int i10) {
        this.mGLTextureView.queueEvent(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay.5
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
                MagicCameraDisplay.this.mFilters.onOutputSizeChanged(width, height);
                MagicCameraDisplay magicCameraDisplay = MagicCameraDisplay.this;
                magicCameraDisplay.mFilters.onDisplaySizeChanged(magicCameraDisplay.mImageWidth, magicCameraDisplay.mImageHeight);
                int loadTexture = z10 ? OpenGLUtils.loadTexture(bitmap, -1, true) : MagicCameraDisplay.this.mTextureId;
                MagicCameraDisplay.this.mFilters.onDrawFrame(loadTexture, z11, z12);
                IntBuffer intBuffer = MagicCameraDisplay.this.f19506ib;
                if (intBuffer != null) {
                    intBuffer.clear();
                }
                IntBuffer intBuffer2 = MagicCameraDisplay.this.f19506ib;
                if (intBuffer2 == null || intBuffer2.capacity() < height * width) {
                    MagicCameraDisplay.this.f19506ib = IntBuffer.allocate(height * width);
                }
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, MagicCameraDisplay.this.f19506ib);
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(MagicCameraDisplay.this.f19506ib.array()));
                if (CameraEngine1.getInstance().getCamera() != null) {
                    i11 = 1;
                    MagicCameraDisplay.this.adjustPosition(CameraEngine1.getInstance().getOrientation(), true, false);
                } else {
                    i11 = 1;
                }
                if (z10) {
                    GLES20.glDeleteTextures(i11, new int[]{loadTexture}, 0);
                }
                GLES20.glDeleteFramebuffers(i11, iArr, 0);
                GLES20.glDeleteTextures(i11, iArr2, 0);
                MagicCameraDisplay magicCameraDisplay2 = MagicCameraDisplay.this;
                GLES20.glViewport(0, 0, magicCameraDisplay2.mSurfaceWidth, magicCameraDisplay2.mSurfaceHeight);
                MagicCameraDisplay magicCameraDisplay3 = MagicCameraDisplay.this;
                magicCameraDisplay3.mFilters.onOutputSizeChanged(magicCameraDisplay3.mImageWidth, magicCameraDisplay3.mImageHeight);
                MagicCameraDisplay.this.onGetBitmapFromGL(createBitmap, file, i10);
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
        CameraHandlerThread cameraHandlerThread = this.camHandler;
        if (cameraHandlerThread != null) {
            cameraHandlerThread.triggerChange();
        }
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void onCameraFlip() {
        CameraHandlerThread cameraHandlerThread = this.camHandler;
        if (cameraHandlerThread != null) {
            cameraHandlerThread.triggerSwitchCamera();
        }
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
        CameraEngine1 cameraEngine1;
        if (this.mSurfaceTexture == null || (cameraEngine1 = this.cameraEngine1) == null || cameraEngine1.getCamera() == null) {
            return;
        }
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
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicCameraDisplay.1
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
        this.isSurfaceViewCreated = true;
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void onTakePicture(File file, SaveTask2.onPictureSaveListener onpicturesavelistener, Camera.ShutterCallback shutterCallback) {
        this.mPictureCallback.setPhotoFile(file);
        this.mPictureCallback.setCameraDisplay(this);
        this.cameraEngine1.takePicture(shutterCallback, null, this.mPictureCallback);
    }

    @Override // co.hyperverge.hvcamera.magicfilter.display.MagicDisplay
    public void setTouchEvent(float f10, float f11, Camera.AutoFocusCallback autoFocusCallback) {
        CameraEngine1 cameraEngine1 = this.cameraEngine1;
        if (cameraEngine1 != null) {
            cameraEngine1.setTouchEvent(f10, f11, autoFocusCallback);
        }
    }
}
