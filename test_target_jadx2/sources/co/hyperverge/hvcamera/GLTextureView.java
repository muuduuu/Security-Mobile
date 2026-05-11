package co.hyperverge.hvcamera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {
    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    private static final boolean LOG_ATTACH_DETACH = false;
    private static final boolean LOG_EGL = false;
    private static final boolean LOG_PAUSE_RESUME = false;
    private static final boolean LOG_RENDERER = false;
    private static final boolean LOG_RENDERER_DRAW_FRAME = false;
    private static final boolean LOG_SURFACE = false;
    private static final boolean LOG_THREADS = false;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int RENDERMODE_WHEN_DIRTY = 0;
    private static final String TAG = "GLTextureView";
    private static final GLThreadManager glThreadManager = new GLThreadManager();
    private int debugFlags;
    private boolean detached;
    private EGLConfigChooser eglConfigChooser;
    private int eglContextClientVersion;
    private EGLContextFactory eglContextFactory;
    private EGLWindowSurfaceFactory eglWindowSurfaceFactory;
    private GLThread glThread;
    private GLWrapper glWrapper;
    private final WeakReference<GLTextureView> mThisWeakRef;
    private boolean preserveEGLContextOnDestroy;
    private Renderer renderer;
    private final List<TextureView.SurfaceTextureListener> surfaceTextureListeners;

    private abstract class BaseConfigChooser implements EGLConfigChooser {
        protected int[] mConfigSpec;

        public BaseConfigChooser(int[] iArr) {
            this.mConfigSpec = filterConfigSpec(iArr);
        }

        private int[] filterConfigSpec(int[] iArr) {
            if (GLTextureView.this.eglContextClientVersion != 2) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i10 = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            iArr2[i10] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        @Override // co.hyperverge.hvcamera.GLTextureView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i10 = iArr[0];
            if (i10 <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i10];
            if (!egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, eGLConfigArr, i10, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig chooseConfig = chooseConfig(egl10, eGLDisplay, eGLConfigArr);
            if (chooseConfig != null) {
                return chooseConfig;
            }
            throw new IllegalArgumentException("No config chosen");
        }

        abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);
    }

    private class ComponentSizeChooser extends BaseConfigChooser {
        protected int alphaSize;
        protected int blueSize;
        protected int depthSize;
        protected int greenSize;
        protected int redSize;
        protected int stencilSize;
        private final int[] value;

        public ComponentSizeChooser(int i10, int i11, int i12, int i13, int i14, int i15) {
            super(new int[]{12324, i10, 12323, i11, 12322, i12, 12321, i13, 12325, i14, 12326, i15, 12344});
            this.value = new int[1];
            this.redSize = i10;
            this.greenSize = i11;
            this.blueSize = i12;
            this.alphaSize = i13;
            this.depthSize = i14;
            this.stencilSize = i15;
        }

        private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, this.value) ? this.value[0] : i11;
        }

        @Override // co.hyperverge.hvcamera.GLTextureView.BaseConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int findConfigAttrib = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int findConfigAttrib2 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (findConfigAttrib >= this.depthSize && findConfigAttrib2 >= this.stencilSize) {
                    int findConfigAttrib3 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int findConfigAttrib4 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int findConfigAttrib5 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int findConfigAttrib6 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (findConfigAttrib3 == this.redSize && findConfigAttrib4 == this.greenSize && findConfigAttrib5 == this.blueSize && findConfigAttrib6 == this.alphaSize) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }
    }

    private class DefaultContextFactory implements EGLContextFactory {
        private final int EGL_CONTEXT_CLIENT_VERSION;

        private DefaultContextFactory() {
            this.EGL_CONTEXT_CLIENT_VERSION = 12440;
        }

        @Override // co.hyperverge.hvcamera.GLTextureView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {12440, GLTextureView.this.eglContextClientVersion, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (GLTextureView.this.eglContextClientVersion == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // co.hyperverge.hvcamera.GLTextureView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            HVLog.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            EglHelper.throwEglException("eglDestroyContex", egl10.eglGetError());
        }
    }

    private static class DefaultWindowSurfaceFactory implements EGLWindowSurfaceFactory {
        private DefaultWindowSurfaceFactory() {
        }

        @Override // co.hyperverge.hvcamera.GLTextureView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e10) {
                HVLog.e(GLTextureView.TAG, "eglCreateWindowSurface", e10);
                return null;
            }
        }

        @Override // co.hyperverge.hvcamera.GLTextureView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    public interface EGLConfigChooser {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    public interface EGLContextFactory {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    public interface EGLWindowSurfaceFactory {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    static class GLThread extends Thread {
        private EglHelper eglHelper;
        private boolean exited;
        private final WeakReference<GLTextureView> glTextureViewWeakRef;
        private boolean hasSurface;
        private boolean haveEglContext;
        private boolean haveEglSurface;
        private boolean paused;
        private boolean renderComplete;
        private boolean requestPaused;
        private boolean shouldExit;
        private boolean shouldReleaseEglContext;
        private boolean surfaceIsBad;
        private boolean waitingForSurface;
        private final ArrayList<Runnable> eventQueue = new ArrayList<>();
        private boolean sizeChanged = true;
        private int width = 0;
        private int height = 0;
        private boolean requestRender = true;
        private int renderMode = 1;

        GLThread(WeakReference<GLTextureView> weakReference) {
            this.glTextureViewWeakRef = weakReference;
        }

        private void guardedRun() {
            boolean z10;
            boolean z11;
            GLTextureView gLTextureView;
            this.eglHelper = new EglHelper(this.glTextureViewWeakRef);
            this.haveEglContext = false;
            this.haveEglSurface = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            int i10 = 0;
            int i11 = 0;
            boolean z19 = false;
            GL10 gl10 = null;
            while (true) {
                Runnable runnable = null;
                while (true) {
                    try {
                        synchronized (GLTextureView.glThreadManager) {
                            while (!this.shouldExit) {
                                if (this.eventQueue.isEmpty()) {
                                    boolean z20 = this.paused;
                                    boolean z21 = this.requestPaused;
                                    if (z20 != z21) {
                                        this.paused = z21;
                                        GLTextureView.glThreadManager.notifyAll();
                                    } else {
                                        z21 = false;
                                    }
                                    if (this.shouldReleaseEglContext) {
                                        stopEglSurfaceLocked();
                                        stopEglContextLocked();
                                        this.shouldReleaseEglContext = false;
                                        z14 = true;
                                    }
                                    if (z12) {
                                        stopEglSurfaceLocked();
                                        stopEglContextLocked();
                                        z12 = false;
                                    }
                                    if (z21 && this.haveEglSurface) {
                                        stopEglSurfaceLocked();
                                    }
                                    if (z21 && this.haveEglContext && ((gLTextureView = this.glTextureViewWeakRef.get()) == null || !gLTextureView.preserveEGLContextOnDestroy || GLTextureView.glThreadManager.shouldReleaseEGLContextWhenPausing())) {
                                        stopEglContextLocked();
                                    }
                                    if (z21 && GLTextureView.glThreadManager.shouldTerminateEGLWhenPausing()) {
                                        this.eglHelper.finish();
                                    }
                                    if (!this.hasSurface && !this.waitingForSurface) {
                                        if (this.haveEglSurface) {
                                            stopEglSurfaceLocked();
                                        }
                                        this.waitingForSurface = true;
                                        this.surfaceIsBad = false;
                                        GLTextureView.glThreadManager.notifyAll();
                                    }
                                    if (this.hasSurface && this.waitingForSurface) {
                                        this.waitingForSurface = false;
                                        GLTextureView.glThreadManager.notifyAll();
                                    }
                                    if (z13) {
                                        this.renderComplete = true;
                                        GLTextureView.glThreadManager.notifyAll();
                                        z13 = false;
                                        z19 = false;
                                    }
                                    if (readyToDraw()) {
                                        if (!this.haveEglContext) {
                                            if (z14) {
                                                z14 = false;
                                            } else if (GLTextureView.glThreadManager.tryAcquireEglContextLocked(this)) {
                                                try {
                                                    this.eglHelper.start();
                                                    this.haveEglContext = true;
                                                    GLTextureView.glThreadManager.notifyAll();
                                                    z15 = true;
                                                } catch (RuntimeException e10) {
                                                    GLTextureView.glThreadManager.releaseEglContextLocked(this);
                                                    throw e10;
                                                }
                                            }
                                        }
                                        if (this.haveEglContext && !this.haveEglSurface) {
                                            this.haveEglSurface = true;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        }
                                        if (this.haveEglSurface) {
                                            if (this.sizeChanged) {
                                                i10 = this.width;
                                                i11 = this.height;
                                                z10 = false;
                                                this.sizeChanged = false;
                                                z16 = true;
                                                z18 = true;
                                                z19 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            this.requestRender = z10;
                                            GLTextureView.glThreadManager.notifyAll();
                                        }
                                    }
                                    GLTextureView.glThreadManager.wait();
                                } else {
                                    runnable = this.eventQueue.remove(0);
                                    z10 = false;
                                }
                            }
                            synchronized (GLTextureView.glThreadManager) {
                                stopEglSurfaceLocked();
                                stopEglContextLocked();
                            }
                            return;
                        }
                        if (runnable != null) {
                            break;
                        }
                        if (z16) {
                            if (this.eglHelper.createSurface()) {
                                z16 = z10;
                            } else {
                                synchronized (GLTextureView.glThreadManager) {
                                    this.surfaceIsBad = true;
                                    GLTextureView.glThreadManager.notifyAll();
                                }
                            }
                        }
                        if (z17) {
                            GL10 gl102 = (GL10) this.eglHelper.createGL();
                            GLTextureView.glThreadManager.checkGLDriver(gl102);
                            z17 = z10;
                            gl10 = gl102;
                        }
                        if (z15) {
                            GLTextureView gLTextureView2 = this.glTextureViewWeakRef.get();
                            if (gLTextureView2 != null) {
                                gLTextureView2.renderer.onSurfaceCreated(gl10, this.eglHelper.eglConfig);
                            }
                            z15 = z10;
                        }
                        if (z18) {
                            GLTextureView gLTextureView3 = this.glTextureViewWeakRef.get();
                            if (gLTextureView3 != null) {
                                gLTextureView3.renderer.onSurfaceChanged(gl10, i10, i11);
                            }
                            z18 = z10;
                        }
                        GLTextureView gLTextureView4 = this.glTextureViewWeakRef.get();
                        if (gLTextureView4 != null) {
                            gLTextureView4.renderer.onDrawFrame(gl10);
                        }
                        int swap = this.eglHelper.swap();
                        if (swap == 12288) {
                            z11 = true;
                        } else if (swap != 12302) {
                            EglHelper.logEglErrorAsWarning("GLThread", "eglSwapBuffers", swap);
                            synchronized (GLTextureView.glThreadManager) {
                                z11 = true;
                                this.surfaceIsBad = true;
                                GLTextureView.glThreadManager.notifyAll();
                            }
                        } else {
                            z11 = true;
                            z12 = true;
                        }
                        if (z19) {
                            z13 = z11;
                        }
                    } catch (Throwable th) {
                        synchronized (GLTextureView.glThreadManager) {
                            stopEglSurfaceLocked();
                            stopEglContextLocked();
                            throw th;
                        }
                    }
                }
                runnable.run();
            }
        }

        private boolean readyToDraw() {
            return !this.paused && this.hasSurface && !this.surfaceIsBad && this.width > 0 && this.height > 0 && (this.requestRender || this.renderMode == 1);
        }

        private void stopEglContextLocked() {
            if (this.haveEglContext) {
                this.eglHelper.finish();
                this.haveEglContext = false;
                GLTextureView.glThreadManager.releaseEglContextLocked(this);
            }
        }

        private void stopEglSurfaceLocked() {
            if (this.haveEglSurface) {
                this.haveEglSurface = false;
                this.eglHelper.destroySurface();
            }
        }

        public boolean ableToDraw() {
            return this.haveEglContext && this.haveEglSurface && readyToDraw();
        }

        public int getRenderMode() {
            int i10;
            synchronized (GLTextureView.glThreadManager) {
                i10 = this.renderMode;
            }
            return i10;
        }

        public void onPause() {
            synchronized (GLTextureView.glThreadManager) {
                this.requestPaused = true;
                GLTextureView.glThreadManager.notifyAll();
                while (!this.exited && !this.paused) {
                    try {
                        GLTextureView.glThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onResume() {
            synchronized (GLTextureView.glThreadManager) {
                this.requestPaused = false;
                this.requestRender = true;
                this.renderComplete = false;
                GLTextureView.glThreadManager.notifyAll();
                while (!this.exited && this.paused && !this.renderComplete) {
                    try {
                        GLTextureView.glThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onWindowResize(int i10, int i11) {
            synchronized (GLTextureView.glThreadManager) {
                this.width = i10;
                this.height = i11;
                this.sizeChanged = true;
                this.requestRender = true;
                this.renderComplete = false;
                GLTextureView.glThreadManager.notifyAll();
                while (!this.exited && !this.paused && !this.renderComplete && ableToDraw()) {
                    try {
                        GLTextureView.glThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void queueEvent(Runnable runnable) {
            if (runnable == null) {
                throw new IllegalArgumentException("r must not be null");
            }
            synchronized (GLTextureView.glThreadManager) {
                this.eventQueue.add(runnable);
                GLTextureView.glThreadManager.notifyAll();
            }
        }

        public void requestExitAndWait() {
            synchronized (GLTextureView.glThreadManager) {
                this.shouldExit = true;
                GLTextureView.glThreadManager.notifyAll();
                while (!this.exited) {
                    try {
                        GLTextureView.glThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void requestReleaseEglContextLocked() {
            this.shouldReleaseEglContext = true;
            GLTextureView.glThreadManager.notifyAll();
        }

        public void requestRender() {
            synchronized (GLTextureView.glThreadManager) {
                this.requestRender = true;
                GLTextureView.glThreadManager.notifyAll();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            try {
                guardedRun();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                GLTextureView.glThreadManager.threadExiting(this);
                throw th;
            }
            GLTextureView.glThreadManager.threadExiting(this);
        }

        public void setRenderMode(int i10) {
            if (i10 < 0 || i10 > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (GLTextureView.glThreadManager) {
                this.renderMode = i10;
                GLTextureView.glThreadManager.notifyAll();
            }
        }

        public void surfaceCreated() {
            synchronized (GLTextureView.glThreadManager) {
                this.hasSurface = true;
                GLTextureView.glThreadManager.notifyAll();
                while (this.waitingForSurface && !this.exited) {
                    try {
                        GLTextureView.glThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void surfaceDestroyed() {
            synchronized (GLTextureView.glThreadManager) {
                this.hasSurface = false;
                GLTextureView.glThreadManager.notifyAll();
                while (!this.waitingForSurface && !this.exited) {
                    try {
                        GLTextureView.glThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    private static class GLThreadManager {
        private static final String TAG = "GLThreadManager";
        private static final int kGLES_20 = 131072;
        private static final String kMSM7K_RENDERER_PREFIX = "Q3Dimension MSM7500 ";
        private GLThread eglOwner;
        private boolean glesDriverCheckComplete;
        private int glesVersion;
        private boolean glesVersionCheckComplete;
        private boolean limitedGLESContexts;
        private boolean multipleGLESContextsAllowed;

        private GLThreadManager() {
        }

        private void checkGLESVersion() {
            if (this.glesVersionCheckComplete) {
                return;
            }
            this.glesVersionCheckComplete = true;
        }

        public synchronized void checkGLDriver(GL10 gl10) {
            try {
                if (!this.glesDriverCheckComplete) {
                    checkGLESVersion();
                    String glGetString = gl10.glGetString(7937);
                    if (this.glesVersion < kGLES_20) {
                        this.multipleGLESContextsAllowed = !glGetString.startsWith(kMSM7K_RENDERER_PREFIX);
                        notifyAll();
                    }
                    this.limitedGLESContexts = !this.multipleGLESContextsAllowed;
                    HVLog.d(TAG, "checkGLDriver renderer = \"" + glGetString + "\" multipleContextsAllowed = " + this.multipleGLESContextsAllowed + " limitedGLESContexts = " + this.limitedGLESContexts);
                    this.glesDriverCheckComplete = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public void releaseEglContextLocked(GLThread gLThread) {
            if (this.eglOwner == gLThread) {
                this.eglOwner = null;
            }
            notifyAll();
        }

        public synchronized boolean shouldReleaseEGLContextWhenPausing() {
            return this.limitedGLESContexts;
        }

        public synchronized boolean shouldTerminateEGLWhenPausing() {
            checkGLESVersion();
            return !this.multipleGLESContextsAllowed;
        }

        public synchronized void threadExiting(GLThread gLThread) {
            try {
                gLThread.exited = true;
                if (this.eglOwner == gLThread) {
                    this.eglOwner = null;
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }

        public boolean tryAcquireEglContextLocked(GLThread gLThread) {
            GLThread gLThread2 = this.eglOwner;
            if (gLThread2 == gLThread || gLThread2 == null) {
                this.eglOwner = gLThread;
                notifyAll();
                return true;
            }
            checkGLESVersion();
            if (this.multipleGLESContextsAllowed) {
                return true;
            }
            GLThread gLThread3 = this.eglOwner;
            if (gLThread3 == null) {
                return false;
            }
            gLThread3.requestReleaseEglContextLocked();
            return false;
        }
    }

    public interface GLWrapper {
        GL wrap(GL gl);
    }

    static class LogWriter extends Writer {
        private final StringBuilder builder = new StringBuilder();

        LogWriter() {
        }

        private void flushBuilder() {
            if (this.builder.length() > 0) {
                HVLog.v(GLTextureView.TAG, this.builder.toString());
                StringBuilder sb2 = this.builder;
                sb2.delete(0, sb2.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            flushBuilder();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            flushBuilder();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                char c10 = cArr[i10 + i12];
                if (c10 == '\n') {
                    flushBuilder();
                } else {
                    this.builder.append(c10);
                }
            }
        }
    }

    public interface Renderer {
        void onDrawFrame(GL10 gl10);

        void onSurfaceChanged(GL10 gl10, int i10, int i11);

        void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig);
    }

    private class SimpleEGLConfigChooser extends ComponentSizeChooser {
        public SimpleEGLConfigChooser(boolean z10) {
            super(8, 8, 8, 0, z10 ? 16 : 0, 0);
        }
    }

    public GLTextureView(Context context) {
        super(context);
        this.mThisWeakRef = new WeakReference<>(this);
        this.surfaceTextureListeners = new ArrayList();
        init();
    }

    private void checkRenderThreadState() {
        if (this.glThread != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    private void init() {
        setSurfaceTextureListener(this);
    }

    public void addSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.surfaceTextureListeners.add(surfaceTextureListener);
    }

    protected void finalize() {
        try {
            GLThread gLThread = this.glThread;
            if (gLThread != null) {
                gLThread.requestExitAndWait();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.debugFlags;
    }

    public boolean getPreserveEGLContextOnDestroy() {
        return this.preserveEGLContextOnDestroy;
    }

    public int getRenderMode() {
        return this.glThread.getRenderMode();
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.detached && this.renderer != null) {
            GLThread gLThread = this.glThread;
            int renderMode = gLThread != null ? gLThread.getRenderMode() : 1;
            GLThread gLThread2 = new GLThread(this.mThisWeakRef);
            this.glThread = gLThread2;
            if (renderMode != 1) {
                gLThread2.setRenderMode(renderMode);
            }
            this.glThread.start();
        }
        this.detached = false;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        GLThread gLThread = this.glThread;
        if (gLThread != null) {
            gLThread.requestExitAndWait();
        }
        this.detached = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        surfaceChanged(getSurfaceTexture(), 0, i12 - i10, i13 - i11);
    }

    public void onPause() {
        this.glThread.onPause();
    }

    public void onResume() {
        this.glThread.onResume();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        surfaceCreated(surfaceTexture);
        surfaceChanged(surfaceTexture, 0, i10, i11);
        Iterator<TextureView.SurfaceTextureListener> it = this.surfaceTextureListeners.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureAvailable(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceDestroyed(surfaceTexture);
        Iterator<TextureView.SurfaceTextureListener> it = this.surfaceTextureListeners.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        surfaceChanged(surfaceTexture, 0, i10, i11);
        Iterator<TextureView.SurfaceTextureListener> it = this.surfaceTextureListeners.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        requestRender();
        Iterator<TextureView.SurfaceTextureListener> it = this.surfaceTextureListeners.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void queueEvent(Runnable runnable) {
        this.glThread.queueEvent(runnable);
    }

    public void requestRender() {
        this.glThread.requestRender();
    }

    public void setDebugFlags(int i10) {
        this.debugFlags = i10;
    }

    public void setEGLConfigChooser(EGLConfigChooser eGLConfigChooser) {
        checkRenderThreadState();
        this.eglConfigChooser = eGLConfigChooser;
    }

    public void setEGLContextClientVersion(int i10) {
        checkRenderThreadState();
        this.eglContextClientVersion = i10;
    }

    public void setEGLContextFactory(EGLContextFactory eGLContextFactory) {
        checkRenderThreadState();
        this.eglContextFactory = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        checkRenderThreadState();
        this.eglWindowSurfaceFactory = eGLWindowSurfaceFactory;
    }

    public void setGLWrapper(GLWrapper gLWrapper) {
        this.glWrapper = gLWrapper;
    }

    public void setPreserveEGLContextOnDestroy(boolean z10) {
        this.preserveEGLContextOnDestroy = z10;
    }

    public void setRenderMode(int i10) {
        this.glThread.setRenderMode(i10);
    }

    public void setRenderer(Renderer renderer) {
        checkRenderThreadState();
        if (this.eglConfigChooser == null) {
            this.eglConfigChooser = new SimpleEGLConfigChooser(true);
        }
        if (this.eglContextFactory == null) {
            this.eglContextFactory = new DefaultContextFactory();
        }
        if (this.eglWindowSurfaceFactory == null) {
            this.eglWindowSurfaceFactory = new DefaultWindowSurfaceFactory();
        }
        this.renderer = renderer;
        GLThread gLThread = new GLThread(this.mThisWeakRef);
        this.glThread = gLThread;
        gLThread.start();
    }

    public void surfaceChanged(SurfaceTexture surfaceTexture, int i10, int i11, int i12) {
        this.glThread.onWindowResize(i11, i12);
    }

    public void surfaceCreated(SurfaceTexture surfaceTexture) {
        this.glThread.surfaceCreated();
    }

    public void surfaceDestroyed(SurfaceTexture surfaceTexture) {
        this.glThread.surfaceDestroyed();
    }

    private static class EglHelper {
        EGL10 egl;
        EGLConfig eglConfig;
        EGLContext eglContext;
        EGLDisplay eglDisplay;
        EGLSurface eglSurface;
        private final WeakReference<GLTextureView> glTextureViewWeakRef;

        public EglHelper(WeakReference<GLTextureView> weakReference) {
            this.glTextureViewWeakRef = weakReference;
        }

        private void destroySurfaceImp() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.eglSurface;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.egl.eglMakeCurrent(this.eglDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.glTextureViewWeakRef.get();
            if (gLTextureView != null) {
                gLTextureView.eglWindowSurfaceFactory.destroySurface(this.egl, this.eglDisplay, this.eglSurface);
            }
            this.eglSurface = null;
        }

        public static String formatEglError(String str, int i10) {
            return str + " failed: " + i10;
        }

        public static void logEglErrorAsWarning(String str, String str2, int i10) {
            HVLog.w(str, formatEglError(str2, i10));
        }

        public static void throwEglException(String str, int i10) {
            throw new RuntimeException(formatEglError(str, i10));
        }

        GL createGL() {
            GL gl = this.eglContext.getGL();
            GLTextureView gLTextureView = this.glTextureViewWeakRef.get();
            if (gLTextureView == null) {
                return gl;
            }
            if (gLTextureView.glWrapper != null) {
                gl = gLTextureView.glWrapper.wrap(gl);
            }
            if ((gLTextureView.debugFlags & 3) != 0) {
                return GLDebugHelper.wrap(gl, (gLTextureView.debugFlags & 1) == 0 ? 0 : 1, (gLTextureView.debugFlags & 2) != 0 ? new LogWriter() : null);
            }
            return gl;
        }

        public boolean createSurface() {
            if (this.egl == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.eglDisplay == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.eglConfig == null) {
                throw new RuntimeException("eglConfig not initialized");
            }
            destroySurfaceImp();
            GLTextureView gLTextureView = this.glTextureViewWeakRef.get();
            if (gLTextureView != null) {
                this.eglSurface = gLTextureView.eglWindowSurfaceFactory.createWindowSurface(this.egl, this.eglDisplay, this.eglConfig, gLTextureView.getSurfaceTexture());
            } else {
                this.eglSurface = null;
            }
            EGLSurface eGLSurface = this.eglSurface;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.egl.eglGetError() == 12299) {
                    HVLog.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.egl.eglMakeCurrent(this.eglDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                return true;
            }
            logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", this.egl.eglGetError());
            return false;
        }

        public void destroySurface() {
            destroySurfaceImp();
        }

        public void finish() {
            if (this.eglContext != null) {
                GLTextureView gLTextureView = this.glTextureViewWeakRef.get();
                if (gLTextureView != null) {
                    gLTextureView.eglContextFactory.destroyContext(this.egl, this.eglDisplay, this.eglContext);
                }
                this.eglContext = null;
            }
            EGLDisplay eGLDisplay = this.eglDisplay;
            if (eGLDisplay != null) {
                this.egl.eglTerminate(eGLDisplay);
                this.eglDisplay = null;
            }
        }

        public void start() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.egl.eglInitialize(eglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            GLTextureView gLTextureView = this.glTextureViewWeakRef.get();
            if (gLTextureView == null) {
                this.eglConfig = null;
                this.eglContext = null;
            } else {
                this.eglConfig = gLTextureView.eglConfigChooser.chooseConfig(this.egl, this.eglDisplay);
                this.eglContext = gLTextureView.eglContextFactory.createContext(this.egl, this.eglDisplay, this.eglConfig);
            }
            EGLContext eGLContext = this.eglContext;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.eglContext = null;
                throwEglException("createContext");
            }
            this.eglSurface = null;
        }

        public int swap() {
            if (this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface)) {
                return 12288;
            }
            return this.egl.eglGetError();
        }

        private void throwEglException(String str) {
            throwEglException(str, this.egl.eglGetError());
        }
    }

    public void setEGLConfigChooser(boolean z10) {
        setEGLConfigChooser(new SimpleEGLConfigChooser(z10));
    }

    public void setEGLConfigChooser(int i10, int i11, int i12, int i13, int i14, int i15) {
        setEGLConfigChooser(new ComponentSizeChooser(i10, i11, i12, i13, i14, i15));
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mThisWeakRef = new WeakReference<>(this);
        this.surfaceTextureListeners = new ArrayList();
        init();
    }
}
