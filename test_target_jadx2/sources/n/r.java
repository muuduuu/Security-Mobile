package N;

import A.AbstractC0700h0;
import A.x0;
import M.L;
import M.P;
import M.V;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.H;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    final P f6516a;

    /* renamed from: b, reason: collision with root package name */
    final H f6517b;

    /* renamed from: c, reason: collision with root package name */
    final H f6518c;

    /* renamed from: d, reason: collision with root package name */
    private c f6519d;

    /* renamed from: e, reason: collision with root package name */
    private b f6520e;

    class a implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L f6521a;

        a(L l10) {
            this.f6521a = l10;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(x0 x0Var) {
            y0.f.g(x0Var);
            r.this.f6516a.b(x0Var);
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            if (this.f6521a.t() == 2 && (th instanceof CancellationException)) {
                AbstractC0700h0.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            AbstractC0700h0.m("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + V.a(this.f6521a.t()), th);
        }
    }

    public static abstract class b {
        public static b d(L l10, L l11, List list) {
            return new N.b(l10, l11, list);
        }

        public abstract List a();

        public abstract L b();

        public abstract L c();
    }

    public static class c extends HashMap {
    }

    public r(H h10, H h11, P p10) {
        this.f6517b = h10;
        this.f6518c = h11;
        this.f6516a = p10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void e(H h10, H h11, L l10, L l11, Map.Entry entry) {
        L l12 = (L) entry.getValue();
        Size e10 = l10.s().e();
        Rect a10 = ((d) entry.getKey()).a().a();
        if (!l10.u()) {
            h10 = null;
        }
        x0.a f10 = x0.a.f(e10, a10, h10, ((d) entry.getKey()).a().c(), ((d) entry.getKey()).a().g());
        Size e11 = l11.s().e();
        Rect a11 = ((d) entry.getKey()).b().a();
        if (!l11.u()) {
            h11 = null;
        }
        G.n.j(l12.j(((d) entry.getKey()).a().b(), f10, x0.a.f(e11, a11, h11, ((d) entry.getKey()).b().c(), ((d) entry.getKey()).b().g())), new a(l12), F.c.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.f6519d;
        if (cVar != null) {
            Iterator it = cVar.values().iterator();
            while (it.hasNext()) {
                ((L) it.next()).i();
            }
        }
    }

    private void g(final H h10, final H h11, final L l10, final L l11, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            e(h10, h11, l10, l11, entry);
            ((L) entry.getValue()).e(new Runnable() { // from class: N.q
                @Override // java.lang.Runnable
                public final void run() {
                    r.this.e(h10, h11, l10, l11, entry);
                }
            });
        }
    }

    private void h(H h10, L l10, Map map, boolean z10) {
        this.f6516a.d(l10.l(h10, z10));
    }

    private L j(L l10, O.f fVar) {
        Rect a10 = fVar.a();
        int c10 = fVar.c();
        boolean g10 = fVar.g();
        Matrix matrix = new Matrix();
        y0.f.a(E.r.j(E.r.f(a10, c10), fVar.d()));
        Rect q10 = E.r.q(fVar.d());
        return new L(fVar.e(), fVar.b(), l10.s().g().e(fVar.d()).a(), matrix, false, q10, l10.q() - c10, -1, l10.w() != g10);
    }

    public void f() {
        this.f6516a.a();
        E.q.d(new Runnable() { // from class: N.p
            @Override // java.lang.Runnable
            public final void run() {
                r.this.d();
            }
        });
    }

    public c i(b bVar) {
        E.q.a();
        this.f6520e = bVar;
        this.f6519d = new c();
        L b10 = this.f6520e.b();
        L c10 = this.f6520e.c();
        for (d dVar : this.f6520e.a()) {
            this.f6519d.put(dVar, j(b10, dVar.a()));
        }
        h(this.f6517b, b10, this.f6519d, true);
        h(this.f6518c, c10, this.f6519d, false);
        g(this.f6517b, this.f6518c, b10, c10, this.f6519d);
        return this.f6519d;
    }
}
