package C;

import A.AbstractC0700h0;
import A.W;
import C.A;
import C.C0731i;
import C.C0744w;
import C.O;
import M.C0973u;
import android.graphics.Bitmap;
import androidx.camera.core.impl.P0;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.util.Objects;
import java.util.concurrent.Executor;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public class O {

    /* renamed from: a, reason: collision with root package name */
    final Executor f599a;

    /* renamed from: b, reason: collision with root package name */
    final M.w f600b;

    /* renamed from: c, reason: collision with root package name */
    private a f601c;

    /* renamed from: d, reason: collision with root package name */
    private M.y f602d;

    /* renamed from: e, reason: collision with root package name */
    private M.y f603e;

    /* renamed from: f, reason: collision with root package name */
    private M.y f604f;

    /* renamed from: g, reason: collision with root package name */
    private M.y f605g;

    /* renamed from: h, reason: collision with root package name */
    private M.y f606h;

    /* renamed from: i, reason: collision with root package name */
    private M.y f607i;

    /* renamed from: j, reason: collision with root package name */
    private M.y f608j;

    /* renamed from: k, reason: collision with root package name */
    private M.y f609k;

    /* renamed from: l, reason: collision with root package name */
    private M.y f610l;

    /* renamed from: m, reason: collision with root package name */
    private final P0 f611m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f612n;

    static abstract class a {
        a() {
        }

        static a e(int i10, int i11) {
            return new C0727e(new C0973u(), new C0973u(), i10, i11);
        }

        abstract C0973u a();

        abstract int b();

        abstract int c();

        abstract C0973u d();
    }

    static abstract class b {
        b() {
        }

        static b c(P p10, androidx.camera.core.n nVar) {
            return new C0728f(p10, nVar);
        }

        abstract androidx.camera.core.n a();

        abstract P b();
    }

    O(Executor executor, M.w wVar) {
        this(executor, wVar, androidx.camera.core.internal.compat.quirk.a.c());
    }

    private M.z i(M.z zVar, int i10) {
        y0.f.i(L.b.i(zVar.e()));
        M.z zVar2 = (M.z) this.f606h.apply(zVar);
        M.y yVar = this.f610l;
        if (yVar != null) {
            zVar2 = (M.z) yVar.apply(zVar2);
        }
        return (M.z) this.f604f.apply(C0731i.b.c(zVar2, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(final b bVar) {
        if (bVar.b().j()) {
            bVar.a().close();
        } else {
            this.f599a.execute(new Runnable() { // from class: C.J
                @Override // java.lang.Runnable
                public final void run() {
                    O.this.n(bVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(final b bVar) {
        if (!bVar.b().j()) {
            this.f599a.execute(new Runnable() { // from class: C.I
                @Override // java.lang.Runnable
                public final void run() {
                    O.this.p(bVar);
                }
            });
        } else {
            AbstractC0700h0.l("ProcessingNode", "The postview image is closed due to request aborted");
            bVar.a().close();
        }
    }

    private static void w(final P p10, final A.X x10) {
        F.c.e().execute(new Runnable() { // from class: C.N
            @Override // java.lang.Runnable
            public final void run() {
                P.this.s(x10);
            }
        });
    }

    androidx.camera.core.n r(b bVar) {
        P b10 = bVar.b();
        M.z zVar = (M.z) this.f602d.apply(bVar);
        if ((zVar.e() == 35 || this.f610l != null || this.f612n) && this.f601c.c() == 256) {
            M.z zVar2 = (M.z) this.f603e.apply(C0744w.a.c(zVar, b10.c()));
            if (this.f610l != null) {
                zVar2 = i(zVar2, b10.c());
            }
            zVar = (M.z) this.f608j.apply(zVar2);
        }
        return (androidx.camera.core.n) this.f607i.apply(zVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(b bVar) {
        final P b10 = bVar.b();
        try {
            if (bVar.b().k()) {
                final androidx.camera.core.n r10 = r(bVar);
                F.c.e().execute(new Runnable() { // from class: C.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        P.this.p(r10);
                    }
                });
            } else {
                final W.h t10 = t(bVar);
                F.c.e().execute(new Runnable() { // from class: C.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        P.this.o(t10);
                    }
                });
            }
        } catch (A.X e10) {
            w(b10, e10);
        } catch (OutOfMemoryError e11) {
            w(b10, new A.X(0, "Processing failed due to low memory.", e11));
        } catch (RuntimeException e12) {
            w(b10, new A.X(0, "Processing failed.", e12));
        }
    }

    W.h t(b bVar) {
        int c10 = this.f601c.c();
        y0.f.b(L.b.i(c10), String.format("On-disk capture only support JPEG and JPEG/R output formats. Output format: %s", Integer.valueOf(c10)));
        P b10 = bVar.b();
        M.z zVar = (M.z) this.f603e.apply(C0744w.a.c((M.z) this.f602d.apply(bVar), b10.c()));
        if (zVar.i() || this.f610l != null) {
            zVar = i(zVar, b10.c());
        }
        M.y yVar = this.f605g;
        W.g d10 = b10.d();
        Objects.requireNonNull(d10);
        return (W.h) yVar.apply(A.a.c(zVar, d10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void p(b bVar) {
        int c10 = this.f601c.c();
        y0.f.b(c10 == 35 || c10 == 256, String.format("Postview only support YUV and JPEG output formats. Output format: %s", Integer.valueOf(c10)));
        final P b10 = bVar.b();
        try {
            final Bitmap bitmap = (Bitmap) this.f609k.apply((M.z) this.f602d.apply(bVar));
            F.c.e().execute(new Runnable() { // from class: C.M
                @Override // java.lang.Runnable
                public final void run() {
                    P.this.r(bitmap);
                }
            });
        } catch (Exception e10) {
            bVar.a().close();
            AbstractC0700h0.d("ProcessingNode", "process postview input packet failed.", e10);
        }
    }

    public Void x(a aVar) {
        this.f601c = aVar;
        aVar.a().a(new InterfaceC5159a() { // from class: C.G
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                O.this.o((O.b) obj);
            }
        });
        aVar.d().a(new InterfaceC5159a() { // from class: C.H
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                O.this.q((O.b) obj);
            }
        });
        this.f602d = new F();
        this.f603e = new C0744w(this.f611m);
        this.f606h = new C0747z();
        this.f604f = new C0731i();
        this.f605g = new A();
        this.f607i = new C();
        this.f609k = new C0743v();
        if (aVar.b() != 35 && !this.f612n) {
            return null;
        }
        this.f608j = new B();
        return null;
    }

    O(Executor executor, M.w wVar, P0 p02) {
        if (androidx.camera.core.internal.compat.quirk.a.b(LowMemoryQuirk.class) != null) {
            this.f599a = F.c.g(executor);
        } else {
            this.f599a = executor;
        }
        this.f611m = p02;
        this.f612n = p02.a(IncorrectJpegMetadataQuirk.class);
    }

    public void v() {
    }
}
