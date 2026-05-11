package co.hyperverge.hvcamera.magicfilter.display;

import android.graphics.Bitmap;
import android.hardware.Camera;
import android.opengl.GLES20;
import co.hyperverge.hvcamera.GLTextureView;
import co.hyperverge.hvcamera.magicfilter.filter.base.gpuimage.GPUImageFilter;
import co.hyperverge.hvcamera.magicfilter.utils.SaveTask;
import co.hyperverge.hvcamera.magicfilter.utils.SaveTask2;
import co.hyperverge.hvcamera.magicfilter.utils.TextureRotationUtil;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* loaded from: classes.dex */
public abstract class MagicDisplay implements GLTextureView.Renderer {
    public static int currentFiltertype = -1;

    /* renamed from: ib, reason: collision with root package name */
    IntBuffer f19506ib;
    protected final FloatBuffer mGLCubeBuffer;
    protected final FloatBuffer mGLTextureBuffer;
    protected final GLTextureView mGLTextureView;
    protected int mImageHeight;
    protected int mImageWidth;
    protected SaveTask mSaveTask;
    protected int mSurfaceHeight;
    protected int mSurfaceWidth;
    protected int mTextureId = -1;
    protected GPUImageFilter mFilters = new GPUImageFilter();

    public MagicDisplay(GLTextureView gLTextureView) {
        this.mGLTextureView = gLTextureView;
        float[] fArr = TextureRotationUtil.CUBE;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mGLCubeBuffer = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = TextureRotationUtil.TEXTURE_NO_ROTATION;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mGLTextureBuffer = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        gLTextureView.setPreserveEGLContextOnDestroy(false);
        gLTextureView.setEGLContextClientVersion(2);
        gLTextureView.setRenderer(this);
        gLTextureView.setRenderMode(0);
    }

    public void clearHandlers() {
    }

    protected void deleteTextures() {
        if (this.mTextureId != -1) {
            this.mGLTextureView.queueEvent(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicDisplay.3
                @Override // java.lang.Runnable
                public void run() {
                    GLES20.glDeleteTextures(1, new int[]{MagicDisplay.this.mTextureId}, 0);
                    MagicDisplay.this.mTextureId = -1;
                }
            });
        }
    }

    public void getBitmapfromgl(Bitmap bitmap, File file, boolean z10, boolean z11, int i10) {
    }

    public void onCameraChanged() {
    }

    public void onCameraFlip() {
    }

    public void onDestroy() {
        this.mGLTextureView.queueEvent(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicDisplay.2
            @Override // java.lang.Runnable
            public void run() {
                MagicDisplay.this.mFilters.destroy();
            }
        });
    }

    protected void onFilterChanged() {
        GPUImageFilter gPUImageFilter = this.mFilters;
        if (gPUImageFilter == null) {
            return;
        }
        gPUImageFilter.onDisplaySizeChanged(this.mSurfaceWidth, this.mSurfaceHeight);
        this.mFilters.onOutputSizeChanged(this.mImageWidth, this.mImageHeight);
    }

    public void onPause() {
        SaveTask saveTask = this.mSaveTask;
        if (saveTask != null) {
            saveTask.cancel(true);
        }
    }

    public void onResume() {
    }

    public void onTakePicture(File file, SaveTask2.onPictureSaveListener onpicturesavelistener, Camera.ShutterCallback shutterCallback) {
    }

    public void setFilter(final int i10) {
        this.mGLTextureView.queueEvent(new Runnable() { // from class: co.hyperverge.hvcamera.magicfilter.display.MagicDisplay.1
            @Override // java.lang.Runnable
            public void run() {
                GPUImageFilter gPUImageFilter = MagicDisplay.this.mFilters;
                if (gPUImageFilter != null) {
                    gPUImageFilter.destroy();
                }
                MagicDisplay magicDisplay = MagicDisplay.this;
                magicDisplay.mFilters = null;
                magicDisplay.mFilters = new GPUImageFilter();
                MagicDisplay.currentFiltertype = i10;
                GPUImageFilter gPUImageFilter2 = MagicDisplay.this.mFilters;
                if (gPUImageFilter2 != null) {
                    gPUImageFilter2.init();
                }
                MagicDisplay.this.onFilterChanged();
            }
        });
        this.mGLTextureView.requestRender();
    }

    public void setTouchEvent(float f10, float f11, Camera.AutoFocusCallback autoFocusCallback) {
    }

    public void startRecording() {
    }

    public void stopRecording() {
    }
}
