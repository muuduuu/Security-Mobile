package N;

import A.AbstractC0700h0;
import A.B;
import A.C0698g0;
import A.x0;
import M.x;
import O.d;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends x {

    /* renamed from: n, reason: collision with root package name */
    private int f6474n = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f6475o = -1;

    /* renamed from: p, reason: collision with root package name */
    private final C0698g0 f6476p;

    /* renamed from: q, reason: collision with root package name */
    private final C0698g0 f6477q;

    public c(C0698g0 c0698g0, C0698g0 c0698g02) {
        this.f6476p = c0698g0;
        this.f6477q = c0698g02;
    }

    private static float[] u(Size size, Size size2, C0698g0 c0698g0) {
        float[] l10 = O.d.l();
        float[] l11 = O.d.l();
        float[] l12 = O.d.l();
        Matrix.scaleM(l10, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(l11, 0, c0698g0.c() / c0698g0.e(), c0698g0.d() / c0698g0.b(), 0.0f);
        Matrix.multiplyMM(l12, 0, l10, 0, l11, 0);
        return l12;
    }

    private void w(O.g gVar, x0 x0Var, SurfaceTexture surfaceTexture, C0698g0 c0698g0, int i10, boolean z10) {
        s(i10);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        x0Var.c0(fArr2, fArr, z10);
        d.f fVar = (d.f) y0.f.g(this.f5956k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr2);
        }
        fVar.e(u(new Size((int) (gVar.c() * c0698g0.e()), (int) (gVar.b() * c0698g0.b())), new Size(gVar.c(), gVar.b()), c0698g0));
        fVar.d(c0698g0.a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        O.d.g("glDrawArrays");
        GLES20.glDisable(3042);
    }

    @Override // M.x
    public O.e h(B b10, Map map) {
        O.e h10 = super.h(b10, map);
        this.f6474n = O.d.p();
        this.f6475o = O.d.p();
        return h10;
    }

    @Override // M.x
    public void k() {
        super.k();
        this.f6474n = -1;
        this.f6475o = -1;
    }

    public int t(boolean z10) {
        O.d.i(this.f5946a, true);
        O.d.h(this.f5948c);
        return z10 ? this.f6474n : this.f6475o;
    }

    public void v(long j10, Surface surface, x0 x0Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
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
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        O.g gVar = f10;
        w(gVar, x0Var, surfaceTexture, this.f6476p, this.f6474n, true);
        w(gVar, x0Var, surfaceTexture2, this.f6477q, this.f6475o, true);
        EGLExt.eglPresentationTimeANDROID(this.f5949d, f10.a(), j10);
        if (EGL14.eglSwapBuffers(this.f5949d, f10.a())) {
            return;
        }
        AbstractC0700h0.l("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }
}
