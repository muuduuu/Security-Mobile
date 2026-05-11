package Q;

import A.C0698g0;
import A.J0;
import M.C0972t;
import M.L;
import M.U;
import N.o;
import N.r;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.InterfaceC1455p0;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.Z0;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.m1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class h extends J0 {

    /* renamed from: A, reason: collision with root package name */
    V0.b f7793A;

    /* renamed from: B, reason: collision with root package name */
    V0.b f7794B;

    /* renamed from: C, reason: collision with root package name */
    private V0.c f7795C;

    /* renamed from: p, reason: collision with root package name */
    private final j f7796p;

    /* renamed from: q, reason: collision with root package name */
    private final l f7797q;

    /* renamed from: r, reason: collision with root package name */
    private final C0698g0 f7798r;

    /* renamed from: s, reason: collision with root package name */
    private final C0698g0 f7799s;

    /* renamed from: t, reason: collision with root package name */
    private U f7800t;

    /* renamed from: u, reason: collision with root package name */
    private U f7801u;

    /* renamed from: v, reason: collision with root package name */
    private N.r f7802v;

    /* renamed from: w, reason: collision with root package name */
    private L f7803w;

    /* renamed from: x, reason: collision with root package name */
    private L f7804x;

    /* renamed from: y, reason: collision with root package name */
    private L f7805y;

    /* renamed from: z, reason: collision with root package name */
    private L f7806z;

    interface a {
        h8.d a(int i10, int i11);
    }

    public h(H h10, H h11, C0698g0 c0698g0, C0698g0 c0698g02, Set set, m1 m1Var) {
        super(m0(set));
        this.f7796p = m0(set);
        this.f7798r = c0698g0;
        this.f7799s = c0698g02;
        this.f7797q = new l(h10, h11, set, m1Var, new a() { // from class: Q.f
            @Override // Q.h.a
            public final h8.d a(int i10, int i11) {
                h8.d s02;
                s02 = h.this.s0(i10, i11);
                return s02;
            }
        });
    }

    private void c0(V0.b bVar, final String str, final String str2, final l1 l1Var, final Z0 z02, final Z0 z03) {
        V0.c cVar = this.f7795C;
        if (cVar != null) {
            cVar.b();
        }
        V0.c cVar2 = new V0.c(new V0.d() { // from class: Q.g
            @Override // androidx.camera.core.impl.V0.d
            public final void a(V0 v02, V0.g gVar) {
                h.this.r0(str, str2, l1Var, z02, z03, v02, gVar);
            }
        });
        this.f7795C = cVar2;
        bVar.t(cVar2);
    }

    private void d0() {
        V0.c cVar = this.f7795C;
        if (cVar != null) {
            cVar.b();
            this.f7795C = null;
        }
        L l10 = this.f7803w;
        if (l10 != null) {
            l10.i();
            this.f7803w = null;
        }
        L l11 = this.f7804x;
        if (l11 != null) {
            l11.i();
            this.f7804x = null;
        }
        L l12 = this.f7805y;
        if (l12 != null) {
            l12.i();
            this.f7805y = null;
        }
        L l13 = this.f7806z;
        if (l13 != null) {
            l13.i();
            this.f7806z = null;
        }
        U u10 = this.f7801u;
        if (u10 != null) {
            u10.i();
            this.f7801u = null;
        }
        N.r rVar = this.f7802v;
        if (rVar != null) {
            rVar.f();
            this.f7802v = null;
        }
        U u11 = this.f7800t;
        if (u11 != null) {
            u11.i();
            this.f7800t = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List e0(String str, String str2, l1 l1Var, Z0 z02, Z0 z03) {
        List a10;
        List a11;
        E.q.a();
        if (z03 != null) {
            f0(str, str2, l1Var, z02, z03);
            g0(str, str2, l1Var, z02, z03);
            this.f7802v = n0(g(), s(), z02, this.f7798r, this.f7799s);
            Map B10 = this.f7797q.B(this.f7805y, this.f7806z, y(), A() != null);
            r.c i10 = this.f7802v.i(r.b.d(this.f7805y, this.f7806z, new ArrayList(B10.values())));
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : B10.entrySet()) {
                hashMap.put((J0) entry.getKey(), (L) i10.get(entry.getValue()));
            }
            this.f7797q.L(hashMap);
            a10 = A.H.a(new Object[]{this.f7793A.o(), this.f7794B.o()});
            return a10;
        }
        f0(str, str2, l1Var, z02, null);
        H g10 = g();
        Objects.requireNonNull(g10);
        this.f7801u = p0(g10, z02);
        Map A10 = this.f7797q.A(this.f7805y, y(), A() != null);
        U.c m10 = this.f7801u.m(U.b.c(this.f7805y, new ArrayList(A10.values())));
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry2 : A10.entrySet()) {
            hashMap2.put((J0) entry2.getKey(), (L) m10.get(entry2.getValue()));
        }
        this.f7797q.L(hashMap2);
        a11 = A.H.a(new Object[]{this.f7793A.o()});
        return a11;
    }

    private void f0(String str, String str2, l1 l1Var, Z0 z02, Z0 z03) {
        Matrix v10 = v();
        H g10 = g();
        Objects.requireNonNull(g10);
        boolean o10 = g10.o();
        Rect l02 = l0(z02.e());
        Objects.requireNonNull(l02);
        H g11 = g();
        Objects.requireNonNull(g11);
        int q10 = q(g11);
        H g12 = g();
        Objects.requireNonNull(g12);
        L l10 = new L(3, 34, z02, v10, o10, l02, q10, -1, C(g12));
        this.f7803w = l10;
        H g13 = g();
        Objects.requireNonNull(g13);
        this.f7805y = o0(l10, g13);
        V0.b h02 = h0(this.f7803w, l1Var, z02);
        this.f7793A = h02;
        c0(h02, str, str2, l1Var, z02, z03);
    }

    private void g0(String str, String str2, l1 l1Var, Z0 z02, Z0 z03) {
        Matrix v10 = v();
        H s10 = s();
        Objects.requireNonNull(s10);
        boolean o10 = s10.o();
        Rect l02 = l0(z03.e());
        Objects.requireNonNull(l02);
        H s11 = s();
        Objects.requireNonNull(s11);
        int q10 = q(s11);
        H s12 = s();
        Objects.requireNonNull(s12);
        L l10 = new L(3, 34, z03, v10, o10, l02, q10, -1, C(s12));
        this.f7804x = l10;
        H s13 = s();
        Objects.requireNonNull(s13);
        this.f7806z = o0(l10, s13);
        V0.b h02 = h0(this.f7804x, l1Var, z03);
        this.f7794B = h02;
        c0(h02, str, str2, l1Var, z02, z03);
    }

    private V0.b h0(L l10, l1 l1Var, Z0 z02) {
        V0.b q10 = V0.b.q(l1Var, z02.e());
        u0(q10);
        t0(z02.e(), q10);
        q10.m(l10.o(), z02.b(), null, -1);
        q10.j(this.f7797q.D());
        if (z02.d() != null) {
            q10.g(z02.d());
        }
        return q10;
    }

    public static List i0(J0 j02) {
        ArrayList arrayList = new ArrayList();
        if (q0(j02)) {
            Iterator it = ((h) j02).k0().iterator();
            while (it.hasNext()) {
                arrayList.add(((J0) it.next()).j().F());
            }
        } else {
            arrayList.add(j02.j().F());
        }
        return arrayList;
    }

    private static int j0(J0 j02) {
        return j02.j().v().o();
    }

    private Rect l0(Size size) {
        return A() != null ? A() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    private static j m0(Set set) {
        A0 b10 = new i().b();
        b10.x(InterfaceC1455p0.f14673l, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            if (j02.j().b(l1.f14636F)) {
                arrayList.add(j02.j().F());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        b10.x(j.f7808J, arrayList);
        b10.x(InterfaceC1457q0.f14678q, 2);
        return new j(G0.b0(b10));
    }

    private N.r n0(H h10, H h11, Z0 z02, C0698g0 c0698g0, C0698g0 c0698g02) {
        return new N.r(h10, h11, o.a.a(z02.b(), c0698g0, c0698g02));
    }

    private L o0(L l10, H h10) {
        l();
        return l10;
    }

    private U p0(H h10, Z0 z02) {
        l();
        return new U(h10, C0972t.a.a(z02.b()));
    }

    public static boolean q0(J0 j02) {
        return j02 instanceof h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(String str, String str2, l1 l1Var, Z0 z02, Z0 z03, V0 v02, V0.g gVar) {
        if (g() == null) {
            return;
        }
        d0();
        X(e0(str, str2, l1Var, z02, z03));
        G();
        this.f7797q.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h8.d s0(int i10, int i11) {
        U u10 = this.f7801u;
        return u10 != null ? u10.e().c(i10, i11) : G.n.n(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void t0(Size size, V0.b bVar) {
        Iterator it = k0().iterator();
        while (it.hasNext()) {
            V0 o10 = V0.b.q(((J0) it.next()).j(), size).o();
            bVar.c(o10.i());
            bVar.a(o10.m());
            bVar.d(o10.k());
            bVar.b(o10.c());
            bVar.g(o10.f());
        }
    }

    private void u0(V0.b bVar) {
        Iterator it = k0().iterator();
        int i10 = -1;
        while (it.hasNext()) {
            i10 = V0.e(i10, j0((J0) it.next()));
        }
        if (i10 != -1) {
            bVar.z(i10);
        }
    }

    @Override // A.J0
    public void J() {
        super.J();
        this.f7797q.r();
    }

    @Override // A.J0
    protected l1 L(G g10, l1.a aVar) {
        this.f7797q.G(aVar.b());
        return aVar.c();
    }

    @Override // A.J0
    public void M() {
        super.M();
        this.f7797q.H();
    }

    @Override // A.J0
    public void N() {
        super.N();
        this.f7797q.I();
    }

    @Override // A.J0
    protected Z0 O(V v10) {
        List a10;
        this.f7793A.g(v10);
        a10 = A.H.a(new Object[]{this.f7793A.o()});
        X(a10);
        return e().g().d(v10).a();
    }

    @Override // A.J0
    protected Z0 P(Z0 z02, Z0 z03) {
        X(e0(i(), t(), j(), z02, z03));
        E();
        return z02;
    }

    @Override // A.J0
    public void Q() {
        super.Q();
        d0();
        this.f7797q.N();
    }

    @Override // A.J0
    public l1 k(boolean z10, m1 m1Var) {
        V a10 = m1Var.a(this.f7796p.F(), 1);
        if (z10) {
            a10 = V.H(a10, this.f7796p.n());
        }
        if (a10 == null) {
            return null;
        }
        return z(a10).c();
    }

    public Set k0() {
        return this.f7797q.z();
    }

    @Override // A.J0
    public Set x() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // A.J0
    public l1.a z(V v10) {
        return new i(B0.e0(v10));
    }
}
