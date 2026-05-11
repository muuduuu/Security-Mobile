package A;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.Z0;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.m1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class J0 {

    /* renamed from: d, reason: collision with root package name */
    private l1 f71d;

    /* renamed from: e, reason: collision with root package name */
    private l1 f72e;

    /* renamed from: f, reason: collision with root package name */
    private l1 f73f;

    /* renamed from: g, reason: collision with root package name */
    private Z0 f74g;

    /* renamed from: h, reason: collision with root package name */
    private l1 f75h;

    /* renamed from: i, reason: collision with root package name */
    private Rect f76i;

    /* renamed from: k, reason: collision with root package name */
    private androidx.camera.core.impl.H f78k;

    /* renamed from: l, reason: collision with root package name */
    private androidx.camera.core.impl.H f79l;

    /* renamed from: m, reason: collision with root package name */
    private String f80m;

    /* renamed from: a, reason: collision with root package name */
    private final Set f68a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Object f69b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private a f70c = a.INACTIVE;

    /* renamed from: j, reason: collision with root package name */
    private Matrix f77j = new Matrix();

    /* renamed from: n, reason: collision with root package name */
    private V0 f81n = V0.b();

    /* renamed from: o, reason: collision with root package name */
    private V0 f82o = V0.b();

    enum a {
        ACTIVE,
        INACTIVE
    }

    public interface b {
        void d(J0 j02);

        void f(J0 j02);

        void j(J0 j02);

        void k(J0 j02);
    }

    protected J0(l1 l1Var) {
        this.f72e = l1Var;
        this.f73f = l1Var;
    }

    private void R(b bVar) {
        this.f68a.remove(bVar);
    }

    private void a(b bVar) {
        this.f68a.add(bVar);
    }

    public Rect A() {
        return this.f76i;
    }

    public boolean B(int i10) {
        Iterator it = x().iterator();
        while (it.hasNext()) {
            if (M.V.b(i10, ((Integer) it.next()).intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean C(androidx.camera.core.impl.H h10) {
        int n10 = n();
        if (n10 == -1 || n10 == 0) {
            return false;
        }
        if (n10 == 1) {
            return true;
        }
        if (n10 == 2) {
            return h10.e();
        }
        throw new AssertionError("Unknown mirrorMode: " + n10);
    }

    public l1 D(androidx.camera.core.impl.G g10, l1 l1Var, l1 l1Var2) {
        androidx.camera.core.impl.B0 d02;
        if (l1Var2 != null) {
            d02 = androidx.camera.core.impl.B0.e0(l1Var2);
            d02.f0(H.m.f3078b);
        } else {
            d02 = androidx.camera.core.impl.B0.d0();
        }
        if (this.f72e.b(InterfaceC1457q0.f14675n) || this.f72e.b(InterfaceC1457q0.f14679r)) {
            V.a aVar = InterfaceC1457q0.f14683v;
            if (d02.b(aVar)) {
                d02.f0(aVar);
            }
        }
        l1 l1Var3 = this.f72e;
        V.a aVar2 = InterfaceC1457q0.f14683v;
        if (l1Var3.b(aVar2)) {
            V.a aVar3 = InterfaceC1457q0.f14681t;
            if (d02.b(aVar3) && ((P.c) this.f72e.a(aVar2)).d() != null) {
                d02.f0(aVar3);
            }
        }
        Iterator it = this.f72e.e().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.V.X(d02, d02, this.f72e, (V.a) it.next());
        }
        if (l1Var != null) {
            for (V.a aVar4 : l1Var.e()) {
                if (!aVar4.c().equals(H.m.f3078b.c())) {
                    androidx.camera.core.impl.V.X(d02, d02, l1Var, aVar4);
                }
            }
        }
        if (d02.b(InterfaceC1457q0.f14679r)) {
            V.a aVar5 = InterfaceC1457q0.f14675n;
            if (d02.b(aVar5)) {
                d02.f0(aVar5);
            }
        }
        V.a aVar6 = InterfaceC1457q0.f14683v;
        if (d02.b(aVar6) && ((P.c) d02.a(aVar6)).a() != 0) {
            d02.x(l1.f14634D, Boolean.TRUE);
        }
        return L(g10, z(d02));
    }

    protected final void E() {
        this.f70c = a.ACTIVE;
        H();
    }

    protected final void F() {
        this.f70c = a.INACTIVE;
        H();
    }

    protected final void G() {
        Iterator it = this.f68a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).f(this);
        }
    }

    public final void H() {
        int ordinal = this.f70c.ordinal();
        if (ordinal == 0) {
            Iterator it = this.f68a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).k(this);
            }
        } else {
            if (ordinal != 1) {
                return;
            }
            Iterator it2 = this.f68a.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).d(this);
            }
        }
    }

    protected final void I() {
        Iterator it = this.f68a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).j(this);
        }
    }

    protected abstract l1 L(androidx.camera.core.impl.G g10, l1.a aVar);

    protected abstract Z0 O(androidx.camera.core.impl.V v10);

    protected abstract Z0 P(Z0 z02, Z0 z03);

    public void S(AbstractC0707l abstractC0707l) {
        y0.f.a(true);
    }

    public void T(Matrix matrix) {
        this.f77j = new Matrix(matrix);
    }

    protected boolean U(int i10) {
        int V10 = ((InterfaceC1457q0) j()).V(-1);
        if (V10 != -1 && V10 == i10) {
            return false;
        }
        l1.a z10 = z(this.f72e);
        L.e.a(z10, i10);
        this.f72e = z10.c();
        androidx.camera.core.impl.H g10 = g();
        if (g10 == null) {
            this.f73f = this.f72e;
            return true;
        }
        this.f73f = D(g10.q(), this.f71d, this.f75h);
        return true;
    }

    public void V(Rect rect) {
        this.f76i = rect;
    }

    public final void W(androidx.camera.core.impl.H h10) {
        Q();
        synchronized (this.f69b) {
            try {
                androidx.camera.core.impl.H h11 = this.f78k;
                if (h10 == h11) {
                    R(h11);
                    this.f78k = null;
                }
                androidx.camera.core.impl.H h12 = this.f79l;
                if (h10 == h12) {
                    R(h12);
                    this.f79l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f74g = null;
        this.f76i = null;
        this.f73f = this.f72e;
        this.f71d = null;
        this.f75h = null;
    }

    protected void X(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f81n = (V0) list.get(0);
        if (list.size() > 1) {
            this.f82o = (V0) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (AbstractC1429c0 abstractC1429c0 : ((V0) it.next()).n()) {
                if (abstractC1429c0.g() == null) {
                    abstractC1429c0.s(getClass());
                }
            }
        }
    }

    public void Y(Z0 z02, Z0 z03) {
        this.f74g = P(z02, z03);
    }

    public void Z(androidx.camera.core.impl.V v10) {
        this.f74g = O(v10);
    }

    public final void b(androidx.camera.core.impl.H h10, androidx.camera.core.impl.H h11, l1 l1Var, l1 l1Var2) {
        synchronized (this.f69b) {
            try {
                this.f78k = h10;
                this.f79l = h11;
                a(h10);
                if (h11 != null) {
                    a(h11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f71d = l1Var;
        this.f75h = l1Var2;
        this.f73f = D(h10.q(), this.f71d, this.f75h);
        J();
    }

    protected l1 c() {
        return this.f72e;
    }

    protected int d() {
        return ((InterfaceC1457q0) this.f73f).B(-1);
    }

    public Z0 e() {
        return this.f74g;
    }

    public Size f() {
        Z0 z02 = this.f74g;
        if (z02 != null) {
            return z02.e();
        }
        return null;
    }

    public androidx.camera.core.impl.H g() {
        androidx.camera.core.impl.H h10;
        synchronized (this.f69b) {
            h10 = this.f78k;
        }
        return h10;
    }

    protected androidx.camera.core.impl.D h() {
        synchronized (this.f69b) {
            try {
                androidx.camera.core.impl.H h10 = this.f78k;
                if (h10 == null) {
                    return androidx.camera.core.impl.D.f14409a;
                }
                return h10.h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected String i() {
        return ((androidx.camera.core.impl.H) y0.f.h(g(), "No camera attached to use case: " + this)).q().f();
    }

    public l1 j() {
        return this.f73f;
    }

    public abstract l1 k(boolean z10, m1 m1Var);

    public AbstractC0707l l() {
        return null;
    }

    public int m() {
        return this.f73f.p();
    }

    protected int n() {
        return ((InterfaceC1457q0) this.f73f).W(-1);
    }

    public String o() {
        String C10 = this.f73f.C("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(C10);
        return C10;
    }

    public String p() {
        return this.f80m;
    }

    protected int q(androidx.camera.core.impl.H h10) {
        return r(h10, false);
    }

    protected int r(androidx.camera.core.impl.H h10, boolean z10) {
        int m10 = h10.q().m(y());
        return (h10.o() || !z10) ? m10 : E.r.v(-m10);
    }

    public androidx.camera.core.impl.H s() {
        androidx.camera.core.impl.H h10;
        synchronized (this.f69b) {
            h10 = this.f79l;
        }
        return h10;
    }

    protected String t() {
        if (s() == null) {
            return null;
        }
        return s().q().f();
    }

    public V0 u() {
        return this.f82o;
    }

    public Matrix v() {
        return this.f77j;
    }

    public V0 w() {
        return this.f81n;
    }

    protected Set x() {
        return Collections.emptySet();
    }

    protected int y() {
        return ((InterfaceC1457q0) this.f73f).V(0);
    }

    public abstract l1.a z(androidx.camera.core.impl.V v10);

    public void J() {
    }

    public void K() {
    }

    public void M() {
    }

    public void N() {
    }

    public void Q() {
    }
}
