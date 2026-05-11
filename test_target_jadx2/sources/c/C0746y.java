package C;

import A.AbstractC0707l;
import A.AbstractC0722z;
import C.C0742u;
import C.Z;
import android.util.Size;
import androidx.camera.core.e;
import androidx.camera.core.impl.C1453o0;
import androidx.camera.core.impl.InterfaceC1455p0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.V0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.conscrypt.PSKKeyManager;

/* renamed from: C.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0746y {

    /* renamed from: f, reason: collision with root package name */
    private static int f727f;

    /* renamed from: g, reason: collision with root package name */
    static final K.b f728g = new K.b();

    /* renamed from: a, reason: collision with root package name */
    private final C1453o0 f729a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.impl.T f730b;

    /* renamed from: c, reason: collision with root package name */
    private final C0742u f731c;

    /* renamed from: d, reason: collision with root package name */
    private final O f732d;

    /* renamed from: e, reason: collision with root package name */
    private final C0742u.c f733e;

    public C0746y(C1453o0 c1453o0, Size size, AbstractC0707l abstractC0707l, boolean z10, Size size2, int i10) {
        E.q.a();
        this.f729a = c1453o0;
        this.f730b = T.a.j(c1453o0).h();
        C0742u c0742u = new C0742u();
        this.f731c = c0742u;
        Executor e02 = c1453o0.e0(F.c.d());
        Objects.requireNonNull(e02);
        O o10 = new O(e02, null);
        this.f732d = o10;
        int p10 = c1453o0.p();
        int i11 = i();
        c1453o0.d0();
        C0742u.c m10 = C0742u.c.m(size, p10, i11, z10, null, size2, i10);
        this.f733e = m10;
        o10.x(c0742u.v(m10));
    }

    private C0734l b(int i10, androidx.camera.core.impl.S s10, f0 f0Var, V v10) {
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(s10.hashCode());
        List<androidx.camera.core.impl.U> a10 = s10.a();
        Objects.requireNonNull(a10);
        for (androidx.camera.core.impl.U u10 : a10) {
            T.a aVar = new T.a();
            aVar.v(this.f730b.k());
            aVar.e(this.f730b.g());
            aVar.a(f0Var.p());
            aVar.f(this.f733e.k());
            aVar.t(l());
            if (L.b.i(this.f733e.d())) {
                if (f728g.a()) {
                    aVar.d(androidx.camera.core.impl.T.f14453i, Integer.valueOf(f0Var.n()));
                }
                aVar.d(androidx.camera.core.impl.T.f14454j, Integer.valueOf(g(f0Var)));
            }
            aVar.e(u10.a().g());
            aVar.g(valueOf, Integer.valueOf(u10.getId()));
            aVar.r(i10);
            aVar.c(this.f733e.a());
            arrayList.add(aVar.h());
        }
        return new C0734l(arrayList, v10);
    }

    private androidx.camera.core.impl.S c() {
        androidx.camera.core.impl.S Z10 = this.f729a.Z(AbstractC0722z.b());
        Objects.requireNonNull(Z10);
        return Z10;
    }

    private P d(int i10, androidx.camera.core.impl.S s10, f0 f0Var, V v10, h8.d dVar) {
        return new P(s10, f0Var.m(), f0Var.i(), f0Var.n(), f0Var.k(), f0Var.o(), v10, dVar, i10);
    }

    private int i() {
        Integer num = (Integer) this.f729a.f(C1453o0.f14661M, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f729a.f(InterfaceC1455p0.f14673l, null);
        if (num2 == null || num2.intValue() != 4101) {
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return 4101;
    }

    private boolean l() {
        return this.f733e.h() != null;
    }

    public void a() {
        E.q.a();
        this.f731c.r();
        this.f732d.v();
    }

    y0.c e(f0 f0Var, V v10, h8.d dVar) {
        E.q.a();
        androidx.camera.core.impl.S c10 = c();
        int i10 = f727f;
        f727f = i10 + 1;
        return new y0.c(b(i10, c10, f0Var, v10), d(i10, c10, f0Var, v10, dVar));
    }

    public V0.b f(Size size) {
        V0.b q10 = V0.b.q(this.f729a, size);
        q10.h(this.f733e.k());
        if (this.f733e.h() != null) {
            q10.x(this.f733e.h());
        }
        return q10;
    }

    int g(f0 f0Var) {
        return ((f0Var.l() != null) && E.r.h(f0Var.i(), this.f733e.j())) ? f0Var.h() == 0 ? 100 : 95 : f0Var.k();
    }

    public int h() {
        E.q.a();
        return this.f731c.h();
    }

    void j(Z.b bVar) {
        E.q.a();
        this.f733e.b().accept(bVar);
    }

    public void k(e.a aVar) {
        E.q.a();
        this.f731c.u(aVar);
    }

    void m(P p10) {
        E.q.a();
        this.f733e.i().accept(p10);
    }
}
