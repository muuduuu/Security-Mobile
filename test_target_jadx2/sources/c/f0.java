package C;

import A.W;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    private int f689a = new K.a().a();

    interface a {
        void a(f0 f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(int i10) {
        if (l() != null) {
            l().onCaptureProcessProgressed(i10);
        } else if (j() != null) {
            j().a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(A.X x10) {
        boolean z10 = j() != null;
        boolean z11 = l() != null;
        if (z10 && !z11) {
            W.e j10 = j();
            Objects.requireNonNull(j10);
            j10.d(x10);
        } else {
            if (!z11 || z10) {
                throw new IllegalStateException("One and only one callback is allowed.");
            }
            W.f l10 = l();
            Objects.requireNonNull(l10);
            l10.onError(x10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(Bitmap bitmap) {
        if (l() != null) {
            l().onPostviewBitmapAvailable(bitmap);
        } else if (j() != null) {
            j().e(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(W.h hVar) {
        W.f l10 = l();
        Objects.requireNonNull(l10);
        Objects.requireNonNull(hVar);
        l10.onImageSaved(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(androidx.camera.core.n nVar) {
        W.e j10 = j();
        Objects.requireNonNull(j10);
        Objects.requireNonNull(nVar);
        j10.c(nVar);
    }

    public static f0 v(Executor executor, W.e eVar, W.f fVar, W.g gVar, Rect rect, Matrix matrix, int i10, int i11, int i12, List list) {
        y0.f.b((fVar == null) == (gVar == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        y0.f.b((eVar == null) ^ (fVar == null), "One and only one on-disk or in-memory callback should be present.");
        return new C0730h(executor, eVar, fVar, gVar, rect, matrix, i10, i11, i12, list);
    }

    void A(final androidx.camera.core.n nVar) {
        g().execute(new Runnable() { // from class: C.c0
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.u(nVar);
            }
        });
    }

    boolean f() {
        E.q.a();
        int i10 = this.f689a;
        if (i10 <= 0) {
            return false;
        }
        this.f689a = i10 - 1;
        return true;
    }

    abstract Executor g();

    abstract int h();

    abstract Rect i();

    public abstract W.e j();

    abstract int k();

    public abstract W.f l();

    abstract W.g m();

    abstract int n();

    abstract Matrix o();

    abstract List p();

    void w(final int i10) {
        g().execute(new Runnable() { // from class: C.b0
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.q(i10);
            }
        });
    }

    void x(final A.X x10) {
        g().execute(new Runnable() { // from class: C.a0
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.r(x10);
            }
        });
    }

    void y(final Bitmap bitmap) {
        g().execute(new Runnable() { // from class: C.d0
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.s(bitmap);
            }
        });
    }

    void z(final W.h hVar) {
        g().execute(new Runnable() { // from class: C.e0
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.t(hVar);
            }
        });
    }
}
