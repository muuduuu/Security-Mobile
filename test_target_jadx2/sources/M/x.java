package M;

import A.AbstractC0700h0;
import O.d;
import O.e;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class x {

    /* renamed from: c, reason: collision with root package name */
    protected Thread f5948c;

    /* renamed from: g, reason: collision with root package name */
    protected EGLConfig f5952g;

    /* renamed from: i, reason: collision with root package name */
    protected Surface f5954i;

    /* renamed from: a, reason: collision with root package name */
    protected final AtomicBoolean f5946a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    protected final Map f5947b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    protected EGLDisplay f5949d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e, reason: collision with root package name */
    protected EGLContext f5950e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: f, reason: collision with root package name */
    protected int[] f5951f = O.d.f6825a;

    /* renamed from: h, reason: collision with root package name */
    protected EGLSurface f5953h = EGL14.EGL_NO_SURFACE;

    /* renamed from: j, reason: collision with root package name */
    protected Map f5955j = Collections.emptyMap();

    /* renamed from: k, reason: collision with root package name */
    protected d.f f5956k = null;

    /* renamed from: l, reason: collision with root package name */
    protected d.e f5957l = d.e.UNKNOWN;

    /* renamed from: m, reason: collision with root package name */
    private int f5958m = -1;

    private void a(int i10) {
        GLES20.glActiveTexture(33984);
        O.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, i10);
        O.d.g("glBindTexture");
    }

    private void b(A.B b10, e.a aVar) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f5949d = eglGetDisplay;
        if (Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f5949d, iArr, 0, iArr, 1)) {
            this.f5949d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            aVar.c(iArr[0] + "." + iArr[1]);
        }
        int i10 = b10.d() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f5949d, new int[]{12324, i10, 12323, i10, 12322, i10, 12321, b10.d() ? 2 : 8, 12325, 0, 12326, 0, 12352, b10.d() ? 64 : 4, 12610, b10.d() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f5949d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, b10.d() ? 3 : 2, 12344}, 0);
        O.d.f("eglCreateContext");
        this.f5952g = eGLConfig;
        this.f5950e = eglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f5949d, eglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    private void d() {
        EGLDisplay eGLDisplay = this.f5949d;
        EGLConfig eGLConfig = this.f5952g;
        Objects.requireNonNull(eGLConfig);
        this.f5953h = O.d.n(eGLDisplay, eGLConfig, 1, 1);
    }

    private y0.c e(A.B b10) {
        O.d.i(this.f5946a, false);
        try {
            b(b10, null);
            d();
            i(this.f5953h);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString(this.f5949d, 12373);
            if (glGetString == null) {
                glGetString = BuildConfig.FLAVOR;
            }
            if (eglQueryString == null) {
                eglQueryString = BuildConfig.FLAVOR;
            }
            return new y0.c(glGetString, eglQueryString);
        } catch (IllegalStateException e10) {
            AbstractC0700h0.m("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e10.getMessage(), e10);
            return new y0.c(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        } finally {
            l();
        }
    }

    private void l() {
        Iterator it = this.f5955j.values().iterator();
        while (it.hasNext()) {
            ((d.f) it.next()).b();
        }
        this.f5955j = Collections.emptyMap();
        this.f5956k = null;
        if (!Objects.equals(this.f5949d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f5949d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (O.g gVar : this.f5947b.values()) {
                if (!Objects.equals(gVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f5949d, gVar.a())) {
                    O.d.e("eglDestroySurface");
                }
            }
            this.f5947b.clear();
            if (!Objects.equals(this.f5953h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f5949d, this.f5953h);
                this.f5953h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f5950e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f5949d, this.f5950e);
                this.f5950e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f5949d);
            this.f5949d = EGL14.EGL_NO_DISPLAY;
        }
        this.f5952g = null;
        this.f5958m = -1;
        this.f5957l = d.e.UNKNOWN;
        this.f5954i = null;
        this.f5948c = null;
    }

    private void q(ByteBuffer byteBuffer, Size size, float[] fArr) {
        y0.f.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        y0.f.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int u10 = O.d.u();
        GLES20.glActiveTexture(33985);
        O.d.g("glActiveTexture");
        GLES20.glBindTexture(3553, u10);
        O.d.g("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        O.d.g("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int t10 = O.d.t();
        GLES20.glBindFramebuffer(36160, t10);
        O.d.g("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, u10, 0);
        O.d.g("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        O.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, this.f5958m);
        O.d.g("glBindTexture");
        this.f5954i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        d.f fVar = (d.f) y0.f.g(this.f5956k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        O.d.g("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        O.d.g("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        O.d.s(u10);
        O.d.r(t10);
        a(this.f5958m);
    }

    protected O.g c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f5949d;
            EGLConfig eGLConfig = this.f5952g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface q10 = O.d.q(eGLDisplay, eGLConfig, surface, this.f5951f);
            Size x10 = O.d.x(this.f5949d, q10);
            return O.g.d(q10, x10.getWidth(), x10.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            AbstractC0700h0.m("OpenGlRenderer", "Failed to create EGL surface: " + e10.getMessage(), e10);
            return null;
        }
    }

    protected O.g f(Surface surface) {
        y0.f.j(this.f5947b.containsKey(surface), "The surface is not registered.");
        O.g gVar = (O.g) this.f5947b.get(surface);
        Objects.requireNonNull(gVar);
        return gVar;
    }

    public int g() {
        O.d.i(this.f5946a, true);
        O.d.h(this.f5948c);
        return this.f5958m;
    }

    public O.e h(A.B b10, Map map) {
        O.d.i(this.f5946a, false);
        e.a a10 = O.e.a();
        try {
            if (b10.d()) {
                y0.c e10 = e(b10);
                String str = (String) y0.f.g((String) e10.f45130a);
                String str2 = (String) y0.f.g((String) e10.f45131b);
                if (!str.contains("GL_EXT_YUV_target")) {
                    AbstractC0700h0.l("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    b10 = A.B.f7d;
                }
                this.f5951f = O.d.k(str2, b10);
                a10.d(str);
                a10.b(str2);
            }
            b(b10, a10);
            d();
            i(this.f5953h);
            a10.e(O.d.w());
            this.f5955j = O.d.o(b10, map);
            int p10 = O.d.p();
            this.f5958m = p10;
            s(p10);
            this.f5948c = Thread.currentThread();
            this.f5946a.set(true);
            return a10.a();
        } catch (IllegalArgumentException e11) {
            e = e11;
            l();
            throw e;
        } catch (IllegalStateException e12) {
            e = e12;
            l();
            throw e;
        }
    }

    protected void i(EGLSurface eGLSurface) {
        y0.f.g(this.f5949d);
        y0.f.g(this.f5950e);
        if (!EGL14.eglMakeCurrent(this.f5949d, eGLSurface, eGLSurface, this.f5950e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void j(Surface surface) {
        O.d.i(this.f5946a, true);
        O.d.h(this.f5948c);
        if (this.f5947b.containsKey(surface)) {
            return;
        }
        this.f5947b.put(surface, O.d.f6836l);
    }

    public void k() {
        if (this.f5946a.getAndSet(false)) {
            O.d.h(this.f5948c);
            l();
        }
    }

    protected void m(Surface surface, boolean z10) {
        if (this.f5954i == surface) {
            this.f5954i = null;
            i(this.f5953h);
        }
        O.g gVar = z10 ? (O.g) this.f5947b.remove(surface) : (O.g) this.f5947b.put(surface, O.d.f6836l);
        if (gVar == null || gVar == O.d.f6836l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f5949d, gVar.a());
        } catch (RuntimeException e10) {
            AbstractC0700h0.m("OpenGlRenderer", "Failed to destroy EGL surface: " + e10.getMessage(), e10);
        }
    }

    public void n(long j10, float[] fArr, Surface surface) {
        O.d.i(this.f5946a, true);
        O.d.h(this.f5948c);
        O.g f10 = f(surface);
        if (f10 == O.d.f6836l) {
            f10 = c(surface);
            if (f10 == null) {
                return;
            } else {
                this.f5947b.put(surface, f10);
            }
        }
        if (surface != this.f5954i) {
            i(f10.a());
            this.f5954i = surface;
            GLES20.glViewport(0, 0, f10.c(), f10.b());
            GLES20.glScissor(0, 0, f10.c(), f10.b());
        }
        d.f fVar = (d.f) y0.f.g(this.f5956k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        O.d.g("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f5949d, f10.a(), j10);
        if (EGL14.eglSwapBuffers(this.f5949d, f10.a())) {
            return;
        }
        AbstractC0700h0.l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public void o(d.e eVar) {
        O.d.i(this.f5946a, true);
        O.d.h(this.f5948c);
        if (this.f5957l != eVar) {
            this.f5957l = eVar;
            s(this.f5958m);
        }
    }

    public Bitmap p(Size size, float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        q(allocateDirect, size, fArr);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.j(createBitmap, allocateDirect, size.getWidth() * 4);
        return createBitmap;
    }

    public void r(Surface surface) {
        O.d.i(this.f5946a, true);
        O.d.h(this.f5948c);
        m(surface, true);
    }

    protected void s(int i10) {
        d.f fVar = (d.f) this.f5955j.get(this.f5957l);
        if (fVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f5957l);
        }
        if (this.f5956k != fVar) {
            this.f5956k = fVar;
            fVar.f();
            Log.d("OpenGlRenderer", "Using program for input format " + this.f5957l + ": " + this.f5956k);
        }
        a(i10);
    }
}
