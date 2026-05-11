package Q;

import A.B;
import A.J0;
import A.W;
import A.r0;
import M.L;
import Q.h;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.AbstractC1450n;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.InterfaceC1455p0;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.InterfaceC1469x;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.m1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
class l implements J0.b {

    /* renamed from: a, reason: collision with root package name */
    final Set f7814a;

    /* renamed from: e, reason: collision with root package name */
    private final m1 f7818e;

    /* renamed from: f, reason: collision with root package name */
    private final H f7819f;

    /* renamed from: g, reason: collision with root package name */
    private final H f7820g;

    /* renamed from: i, reason: collision with root package name */
    private final Set f7822i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f7823j;

    /* renamed from: k, reason: collision with root package name */
    private final b f7824k;

    /* renamed from: l, reason: collision with root package name */
    private b f7825l;

    /* renamed from: b, reason: collision with root package name */
    final Map f7815b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f7816c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Map f7817d = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC1450n f7821h = t();

    class a extends AbstractC1450n {
        a() {
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void b(int i10, InterfaceC1469x interfaceC1469x) {
            super.b(i10, interfaceC1469x);
            Iterator it = l.this.f7814a.iterator();
            while (it.hasNext()) {
                l.K(interfaceC1469x, ((J0) it.next()).w(), i10);
            }
        }
    }

    l(H h10, H h11, Set set, m1 m1Var, h.a aVar) {
        this.f7819f = h10;
        this.f7820g = h11;
        this.f7818e = m1Var;
        this.f7814a = set;
        Map M10 = M(h10, set, m1Var);
        this.f7823j = M10;
        HashSet hashSet = new HashSet(M10.values());
        this.f7822i = hashSet;
        this.f7824k = new b(h10, hashSet);
        if (h11 != null) {
            this.f7825l = new b(h11, hashSet);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            this.f7817d.put(j02, Boolean.FALSE);
            this.f7816c.put(j02, new k(h10, this, aVar));
        }
    }

    private static int C(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 = Math.max(i10, ((l1) it.next()).M(0));
        }
        return i10;
    }

    private L E(J0 j02) {
        L l10 = (L) this.f7815b.get(j02);
        Objects.requireNonNull(l10);
        return l10;
    }

    private boolean F(J0 j02) {
        Boolean bool = (Boolean) this.f7817d.get(j02);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    static void K(InterfaceC1469x interfaceC1469x, V0 v02, int i10) {
        Iterator it = v02.i().iterator();
        while (it.hasNext()) {
            ((AbstractC1450n) it.next()).b(i10, new m(v02.j().j(), interfaceC1469x));
        }
    }

    private static Map M(H h10, Set set, m1 m1Var) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            hashMap.put(j02, j02.D(h10.q(), null, j02.k(true, m1Var)));
        }
        return hashMap;
    }

    private O.f s(J0 j02, b bVar, H h10, L l10, int i10, boolean z10) {
        int m10 = h10.c().m(i10);
        boolean l11 = E.r.l(l10.r());
        l1 l1Var = (l1) this.f7823j.get(j02);
        Objects.requireNonNull(l1Var);
        Pair s10 = bVar.s(l1Var, l10.n(), E.r.g(l10.r()), z10);
        Rect rect = (Rect) s10.first;
        Size size = (Size) s10.second;
        int w10 = w(j02, this.f7819f);
        k kVar = (k) this.f7816c.get(j02);
        Objects.requireNonNull(kVar);
        kVar.r(w10);
        int v10 = E.r.v((l10.q() + w10) - m10);
        return O.f.h(y(j02), v(j02), rect, E.r.p(size, v10), v10, j02.C(h10) ^ l11);
    }

    private static void u(L l10, AbstractC1429c0 abstractC1429c0, V0 v02) {
        l10.v();
        try {
            l10.C(abstractC1429c0);
        } catch (AbstractC1429c0.a unused) {
            if (v02.d() != null) {
                v02.d().a(v02, V0.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    private static int v(J0 j02) {
        if (j02 instanceof W) {
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return 34;
    }

    private int w(J0 j02, H h10) {
        return h10.c().m(((InterfaceC1457q0) j02.j()).V(0));
    }

    static AbstractC1429c0 x(J0 j02) {
        List n10 = j02 instanceof W ? j02.w().n() : j02.w().j().i();
        y0.f.i(n10.size() <= 1);
        if (n10.size() == 1) {
            return (AbstractC1429c0) n10.get(0);
        }
        return null;
    }

    private static int y(J0 j02) {
        if (j02 instanceof r0) {
            return 1;
        }
        return j02 instanceof W ? 4 : 2;
    }

    Map A(L l10, int i10, boolean z10) {
        HashMap hashMap = new HashMap();
        for (J0 j02 : this.f7814a) {
            hashMap.put(j02, s(j02, this.f7824k, this.f7819f, l10, i10, z10));
        }
        return hashMap;
    }

    Map B(L l10, L l11, int i10, boolean z10) {
        HashMap hashMap = new HashMap();
        for (J0 j02 : this.f7814a) {
            O.f s10 = s(j02, this.f7824k, this.f7819f, l10, i10, z10);
            b bVar = this.f7825l;
            H h10 = this.f7820g;
            Objects.requireNonNull(h10);
            hashMap.put(j02, N.d.c(s10, s(j02, bVar, h10, l11, i10, z10)));
        }
        return hashMap;
    }

    AbstractC1450n D() {
        return this.f7821h;
    }

    void G(A0 a02) {
        a02.x(InterfaceC1457q0.f14684w, this.f7824k.o(a02));
        a02.x(l1.f14632B, Integer.valueOf(C(this.f7822i)));
        B d10 = Q.a.d(this.f7822i);
        if (d10 == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        a02.x(InterfaceC1455p0.f14674m, d10);
        for (J0 j02 : this.f7814a) {
            if (j02.j().G() != 0) {
                a02.x(l1.f14638H, Integer.valueOf(j02.j().G()));
            }
            if (j02.j().O() != 0) {
                a02.x(l1.f14637G, Integer.valueOf(j02.j().O()));
            }
        }
    }

    void H() {
        for (J0 j02 : this.f7814a) {
            j02.M();
            j02.K();
        }
    }

    void I() {
        Iterator it = this.f7814a.iterator();
        while (it.hasNext()) {
            ((J0) it.next()).N();
        }
    }

    void J() {
        E.q.a();
        Iterator it = this.f7814a.iterator();
        while (it.hasNext()) {
            f((J0) it.next());
        }
    }

    void L(Map map) {
        this.f7815b.clear();
        this.f7815b.putAll(map);
        for (Map.Entry entry : this.f7815b.entrySet()) {
            J0 j02 = (J0) entry.getKey();
            L l10 = (L) entry.getValue();
            j02.V(l10.n());
            j02.T(l10.r());
            j02.Y(l10.s(), null);
            j02.H();
        }
    }

    void N() {
        for (J0 j02 : this.f7814a) {
            k kVar = (k) this.f7816c.get(j02);
            Objects.requireNonNull(kVar);
            j02.W(kVar);
        }
    }

    @Override // A.J0.b
    public void d(J0 j02) {
        E.q.a();
        if (F(j02)) {
            this.f7817d.put(j02, Boolean.FALSE);
            E(j02).m();
        }
    }

    @Override // A.J0.b
    public void f(J0 j02) {
        AbstractC1429c0 x10;
        E.q.a();
        L E10 = E(j02);
        if (F(j02) && (x10 = x(j02)) != null) {
            u(E10, x10, j02.w());
        }
    }

    @Override // A.J0.b
    public void j(J0 j02) {
        E.q.a();
        if (F(j02)) {
            L E10 = E(j02);
            AbstractC1429c0 x10 = x(j02);
            if (x10 != null) {
                u(E10, x10, j02.w());
            } else {
                E10.m();
            }
        }
    }

    @Override // A.J0.b
    public void k(J0 j02) {
        E.q.a();
        if (F(j02)) {
            return;
        }
        this.f7817d.put(j02, Boolean.TRUE);
        AbstractC1429c0 x10 = x(j02);
        if (x10 != null) {
            u(E(j02), x10, j02.w());
        }
    }

    void r() {
        for (J0 j02 : this.f7814a) {
            k kVar = (k) this.f7816c.get(j02);
            Objects.requireNonNull(kVar);
            j02.b(kVar, null, null, j02.k(true, this.f7818e));
        }
    }

    AbstractC1450n t() {
        return new a();
    }

    Set z() {
        return this.f7814a;
    }
}
