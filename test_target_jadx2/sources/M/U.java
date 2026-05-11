package M;

import A.AbstractC0700h0;
import A.I0;
import A.x0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public class U {

    /* renamed from: a, reason: collision with root package name */
    final P f5881a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.camera.core.impl.H f5882b;

    /* renamed from: c, reason: collision with root package name */
    private c f5883c;

    /* renamed from: d, reason: collision with root package name */
    private b f5884d;

    class a implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L f5885a;

        a(L l10) {
            this.f5885a = l10;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(x0 x0Var) {
            y0.f.g(x0Var);
            U.this.f5881a.b(x0Var);
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            if (this.f5885a.t() == 2 && (th instanceof CancellationException)) {
                AbstractC0700h0.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            AbstractC0700h0.m("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + V.a(this.f5885a.t()), th);
        }
    }

    public static abstract class b {
        public static b c(L l10, List list) {
            return new C0956c(l10, list);
        }

        public abstract List a();

        public abstract L b();
    }

    public static class c extends HashMap {
    }

    public U(androidx.camera.core.impl.H h10, P p10) {
        this.f5882b = h10;
        this.f5881a = p10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void g(L l10, Map.Entry entry) {
        L l11 = (L) entry.getValue();
        G.n.j(l11.j(((O.f) entry.getKey()).b(), x0.a.f(l10.s().e(), ((O.f) entry.getKey()).a(), l10.u() ? this.f5882b : null, ((O.f) entry.getKey()).c(), ((O.f) entry.getKey()).g()), null), new a(l11), F.c.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        c cVar = this.f5883c;
        if (cVar != null) {
            Iterator it = cVar.values().iterator();
            while (it.hasNext()) {
                ((L) it.next()).i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Map map, I0.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int b10 = hVar.b() - ((O.f) entry.getKey()).c();
            if (((O.f) entry.getKey()).g()) {
                b10 = -b10;
            }
            ((L) entry.getValue()).D(E.r.v(b10), -1);
        }
    }

    private void j(final L l10, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            g(l10, entry);
            ((L) entry.getValue()).e(new Runnable() { // from class: M.Q
                @Override // java.lang.Runnable
                public final void run() {
                    U.this.g(l10, entry);
                }
            });
        }
    }

    private void k(L l10) {
        this.f5881a.d(l10.k(this.f5882b));
    }

    private L n(L l10, O.f fVar) {
        Rect q10;
        Rect a10 = fVar.a();
        int c10 = fVar.c();
        boolean g10 = fVar.g();
        Matrix matrix = new Matrix(l10.r());
        Matrix e10 = E.r.e(new RectF(a10), E.r.s(fVar.d()), c10, g10);
        matrix.postConcat(e10);
        y0.f.a(E.r.j(E.r.f(a10, c10), fVar.d()));
        if (fVar.k()) {
            y0.f.b(fVar.a().contains(l10.n()), String.format("Output crop rect %s must contain input crop rect %s", fVar.a(), l10.n()));
            q10 = new Rect();
            RectF rectF = new RectF(l10.n());
            e10.mapRect(rectF);
            rectF.round(q10);
        } else {
            q10 = E.r.q(fVar.d());
        }
        Rect rect = q10;
        return new L(fVar.e(), fVar.b(), l10.s().g().e(fVar.d()).a(), matrix, false, rect, l10.q() - c10, -1, l10.w() != g10);
    }

    public P e() {
        return this.f5881a;
    }

    public void i() {
        this.f5881a.a();
        E.q.d(new Runnable() { // from class: M.T
            @Override // java.lang.Runnable
            public final void run() {
                U.this.f();
            }
        });
    }

    void l(L l10, final Map map) {
        l10.f(new InterfaceC5159a() { // from class: M.S
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                U.h(map, (I0.h) obj);
            }
        });
    }

    public c m(b bVar) {
        E.q.a();
        this.f5884d = bVar;
        this.f5883c = new c();
        L b10 = bVar.b();
        for (O.f fVar : bVar.a()) {
            this.f5883c.put(fVar, n(b10, fVar));
        }
        k(b10);
        j(b10, this.f5883c);
        l(b10, this.f5883c);
        return this.f5883c;
    }
}
