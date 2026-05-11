package o0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import l0.AbstractC3593e;
import l0.C3592d;
import l0.C3597i;
import o0.e;
import p0.b;

/* loaded from: classes.dex */
public class f extends k {

    /* renamed from: N0, reason: collision with root package name */
    private int f37764N0;

    /* renamed from: R0, reason: collision with root package name */
    int f37768R0;

    /* renamed from: S0, reason: collision with root package name */
    int f37769S0;

    /* renamed from: T0, reason: collision with root package name */
    int f37770T0;

    /* renamed from: U0, reason: collision with root package name */
    int f37771U0;

    /* renamed from: L0, reason: collision with root package name */
    p0.b f37762L0 = new p0.b(this);

    /* renamed from: M0, reason: collision with root package name */
    public p0.e f37763M0 = new p0.e(this);

    /* renamed from: O0, reason: collision with root package name */
    protected b.InterfaceC0588b f37765O0 = null;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f37766P0 = false;

    /* renamed from: Q0, reason: collision with root package name */
    protected C3592d f37767Q0 = new C3592d();

    /* renamed from: V0, reason: collision with root package name */
    public int f37772V0 = 0;

    /* renamed from: W0, reason: collision with root package name */
    public int f37773W0 = 0;

    /* renamed from: X0, reason: collision with root package name */
    C3738c[] f37774X0 = new C3738c[4];

    /* renamed from: Y0, reason: collision with root package name */
    C3738c[] f37775Y0 = new C3738c[4];

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f37776Z0 = false;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f37777a1 = false;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f37778b1 = false;

    /* renamed from: c1, reason: collision with root package name */
    public int f37779c1 = 0;

    /* renamed from: d1, reason: collision with root package name */
    public int f37780d1 = 0;

    /* renamed from: e1, reason: collision with root package name */
    private int f37781e1 = 257;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f37782f1 = false;

    /* renamed from: g1, reason: collision with root package name */
    private boolean f37783g1 = false;

    /* renamed from: h1, reason: collision with root package name */
    private boolean f37784h1 = false;

    /* renamed from: i1, reason: collision with root package name */
    int f37785i1 = 0;

    /* renamed from: j1, reason: collision with root package name */
    private WeakReference f37786j1 = null;

    /* renamed from: k1, reason: collision with root package name */
    private WeakReference f37787k1 = null;

    /* renamed from: l1, reason: collision with root package name */
    private WeakReference f37788l1 = null;

    /* renamed from: m1, reason: collision with root package name */
    private WeakReference f37789m1 = null;

    /* renamed from: n1, reason: collision with root package name */
    HashSet f37790n1 = new HashSet();

    /* renamed from: o1, reason: collision with root package name */
    public b.a f37791o1 = new b.a();

    public static boolean O1(int i10, e eVar, b.InterfaceC0588b interfaceC0588b, b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0588b == null) {
            return false;
        }
        if (eVar.T() == 8 || (eVar instanceof g) || (eVar instanceof C3736a)) {
            aVar.f38218e = 0;
            aVar.f38219f = 0;
            return false;
        }
        aVar.f38214a = eVar.y();
        aVar.f38215b = eVar.R();
        aVar.f38216c = eVar.U();
        aVar.f38217d = eVar.v();
        aVar.f38222i = false;
        aVar.f38223j = i11;
        e.b bVar = aVar.f38214a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f38215b == bVar2;
        boolean z12 = z10 && eVar.f37715d0 > 0.0f;
        boolean z13 = z11 && eVar.f37715d0 > 0.0f;
        if (z10 && eVar.Y(0) && eVar.f37752w == 0 && !z12) {
            aVar.f38214a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f37754x == 0) {
                aVar.f38214a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.Y(1) && eVar.f37754x == 0 && !z13) {
            aVar.f38215b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f37752w == 0) {
                aVar.f38215b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.l0()) {
            aVar.f38214a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.m0()) {
            aVar.f38215b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f37756y[0] == 4) {
                aVar.f38214a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.f38215b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f38217d;
                } else {
                    aVar.f38214a = e.b.WRAP_CONTENT;
                    interfaceC0588b.b(eVar, aVar);
                    i13 = aVar.f38219f;
                }
                aVar.f38214a = bVar4;
                aVar.f38216c = (int) (eVar.t() * i13);
            }
        }
        if (z13) {
            if (eVar.f37756y[1] == 4) {
                aVar.f38215b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f38214a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f38216c;
                } else {
                    aVar.f38215b = e.b.WRAP_CONTENT;
                    interfaceC0588b.b(eVar, aVar);
                    i12 = aVar.f38218e;
                }
                aVar.f38215b = bVar6;
                if (eVar.u() == -1) {
                    aVar.f38217d = (int) (i12 / eVar.t());
                } else {
                    aVar.f38217d = (int) (eVar.t() * i12);
                }
            }
        }
        interfaceC0588b.b(eVar, aVar);
        eVar.g1(aVar.f38218e);
        eVar.I0(aVar.f38219f);
        eVar.H0(aVar.f38221h);
        eVar.x0(aVar.f38220g);
        aVar.f38223j = b.a.f38211k;
        return aVar.f38222i;
    }

    private void Q1() {
        this.f37772V0 = 0;
        this.f37773W0 = 0;
    }

    private void t1(e eVar) {
        int i10 = this.f37772V0 + 1;
        C3738c[] c3738cArr = this.f37775Y0;
        if (i10 >= c3738cArr.length) {
            this.f37775Y0 = (C3738c[]) Arrays.copyOf(c3738cArr, c3738cArr.length * 2);
        }
        this.f37775Y0[this.f37772V0] = new C3738c(eVar, 0, L1());
        this.f37772V0++;
    }

    private void w1(d dVar, C3597i c3597i) {
        this.f37767Q0.h(c3597i, this.f37767Q0.q(dVar), 0, 5);
    }

    private void x1(d dVar, C3597i c3597i) {
        this.f37767Q0.h(this.f37767Q0.q(dVar), c3597i, 0, 5);
    }

    private void y1(e eVar) {
        int i10 = this.f37773W0 + 1;
        C3738c[] c3738cArr = this.f37774X0;
        if (i10 >= c3738cArr.length) {
            this.f37774X0 = (C3738c[]) Arrays.copyOf(c3738cArr, c3738cArr.length * 2);
        }
        this.f37774X0[this.f37773W0] = new C3738c(eVar, 1, L1());
        this.f37773W0++;
    }

    void A1(d dVar) {
        WeakReference weakReference = this.f37786j1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f37786j1.get()).d()) {
            this.f37786j1 = new WeakReference(dVar);
        }
    }

    public boolean B1(boolean z10) {
        return this.f37763M0.f(z10);
    }

    public boolean C1(boolean z10) {
        return this.f37763M0.g(z10);
    }

    public boolean D1(boolean z10, int i10) {
        return this.f37763M0.h(z10, i10);
    }

    public void E1(AbstractC3593e abstractC3593e) {
        this.f37767Q0.v(abstractC3593e);
    }

    public b.InterfaceC0588b F1() {
        return this.f37765O0;
    }

    public int G1() {
        return this.f37781e1;
    }

    public C3592d H1() {
        return this.f37767Q0;
    }

    public void I1() {
        this.f37763M0.j();
    }

    public void J1() {
        this.f37763M0.k();
    }

    public boolean K1() {
        return this.f37784h1;
    }

    public boolean L1() {
        return this.f37766P0;
    }

    @Override // o0.e
    public void M(StringBuilder sb2) {
        sb2.append(this.f37736o + ":{\n");
        sb2.append("  actualWidth:" + this.f37711b0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f37713c0);
        sb2.append("\n");
        Iterator it = n1().iterator();
        while (it.hasNext()) {
            ((e) it.next()).M(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public boolean M1() {
        return this.f37783g1;
    }

    public long N1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f37768R0 = i17;
        this.f37769S0 = i18;
        return this.f37762L0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean P1(int i10) {
        return (this.f37781e1 & i10) == i10;
    }

    public void R1(b.InterfaceC0588b interfaceC0588b) {
        this.f37765O0 = interfaceC0588b;
        this.f37763M0.n(interfaceC0588b);
    }

    public void S1(int i10) {
        this.f37781e1 = i10;
        C3592d.f36922r = P1(512);
    }

    public void T1(int i10) {
        this.f37764N0 = i10;
    }

    public void U1(boolean z10) {
        this.f37766P0 = z10;
    }

    public boolean V1(C3592d c3592d, boolean[] zArr) {
        zArr[2] = false;
        boolean P12 = P1(64);
        m1(c3592d, P12);
        int size = this.f37804K0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.f37804K0.get(i10);
            eVar.m1(c3592d, P12);
            if (eVar.a0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void W1() {
        this.f37762L0.e(this);
    }

    @Override // o0.e
    public void l1(boolean z10, boolean z11) {
        super.l1(z10, z11);
        int size = this.f37804K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f37804K0.get(i10)).l1(z10, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x030c  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // o0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o1() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        ?? r62;
        boolean z13;
        boolean z14;
        int i12;
        e.b bVar;
        int i13 = 0;
        this.f37719f0 = 0;
        this.f37721g0 = 0;
        this.f37783g1 = false;
        this.f37784h1 = false;
        int size = this.f37804K0.size();
        int max = Math.max(0, U());
        int max2 = Math.max(0, v());
        e.b[] bVarArr = this.f37707Z;
        e.b bVar2 = bVarArr[1];
        e.b bVar3 = bVarArr[0];
        if (this.f37764N0 == 0 && j.b(this.f37781e1, 1)) {
            p0.h.h(this, F1());
            for (int i14 = 0; i14 < size; i14++) {
                e eVar = (e) this.f37804K0.get(i14);
                if (eVar.k0() && !(eVar instanceof g) && !(eVar instanceof C3736a) && !eVar.j0()) {
                    e.b s10 = eVar.s(0);
                    e.b s11 = eVar.s(1);
                    e.b bVar4 = e.b.MATCH_CONSTRAINT;
                    if (s10 != bVar4 || eVar.f37752w == 1 || s11 != bVar4 || eVar.f37754x == 1) {
                        O1(0, eVar, this.f37765O0, new b.a(), b.a.f38211k);
                    }
                }
            }
        }
        if (size <= 2 || !((bVar3 == (bVar = e.b.WRAP_CONTENT) || bVar2 == bVar) && j.b(this.f37781e1, 1024) && p0.i.c(this, F1()))) {
            i10 = max2;
            i11 = max;
            z10 = false;
        } else {
            if (bVar3 == bVar) {
                if (max >= U() || max <= 0) {
                    max = U();
                } else {
                    g1(max);
                    this.f37783g1 = true;
                }
            }
            if (bVar2 == bVar) {
                if (max2 >= v() || max2 <= 0) {
                    max2 = v();
                } else {
                    I0(max2);
                    this.f37784h1 = true;
                }
            }
            i10 = max2;
            i11 = max;
            z10 = true;
        }
        boolean z15 = P1(64) || P1(128);
        C3592d c3592d = this.f37767Q0;
        c3592d.f36937h = false;
        c3592d.f36938i = false;
        if (this.f37781e1 != 0 && z15) {
            c3592d.f36938i = true;
        }
        ArrayList arrayList = this.f37804K0;
        e.b y10 = y();
        e.b bVar5 = e.b.WRAP_CONTENT;
        boolean z16 = y10 == bVar5 || R() == bVar5;
        Q1();
        for (int i15 = 0; i15 < size; i15++) {
            e eVar2 = (e) this.f37804K0.get(i15);
            if (eVar2 instanceof k) {
                ((k) eVar2).o1();
            }
        }
        boolean P12 = P1(64);
        boolean z17 = z10;
        int i16 = 0;
        boolean z18 = true;
        while (z18) {
            int i17 = i16 + 1;
            try {
                this.f37767Q0.E();
                Q1();
                k(this.f37767Q0);
                for (int i18 = i13; i18 < size; i18++) {
                    ((e) this.f37804K0.get(i18)).k(this.f37767Q0);
                }
                z18 = s1(this.f37767Q0);
                WeakReference weakReference = this.f37786j1;
                if (weakReference != null && weakReference.get() != null) {
                    x1((d) this.f37786j1.get(), this.f37767Q0.q(this.f37697P));
                    this.f37786j1 = null;
                }
                WeakReference weakReference2 = this.f37788l1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    w1((d) this.f37788l1.get(), this.f37767Q0.q(this.f37699R));
                    this.f37788l1 = null;
                }
                WeakReference weakReference3 = this.f37787k1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    x1((d) this.f37787k1.get(), this.f37767Q0.q(this.f37696O));
                    this.f37787k1 = null;
                }
                WeakReference weakReference4 = this.f37789m1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    w1((d) this.f37789m1.get(), this.f37767Q0.q(this.f37698Q));
                    this.f37789m1 = null;
                }
                if (z18) {
                    this.f37767Q0.A();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                System.out.println("EXCEPTION : " + e10);
            }
            if (z18) {
                z11 = V1(this.f37767Q0, j.f37803a);
            } else {
                m1(this.f37767Q0, P12);
                for (int i19 = 0; i19 < size; i19++) {
                    ((e) this.f37804K0.get(i19)).m1(this.f37767Q0, P12);
                }
                z11 = false;
            }
            if (z16 && i17 < 8 && j.f37803a[2]) {
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (i20 < size) {
                    e eVar3 = (e) this.f37804K0.get(i20);
                    i22 = Math.max(i22, eVar3.f37719f0 + eVar3.U());
                    i21 = Math.max(i21, eVar3.f37721g0 + eVar3.v());
                    i20++;
                    z11 = z11;
                }
                z12 = z11;
                int max3 = Math.max(this.f37733m0, i22);
                int max4 = Math.max(this.f37735n0, i21);
                e.b bVar6 = e.b.WRAP_CONTENT;
                if (bVar3 == bVar6 && U() < max3) {
                    g1(max3);
                    this.f37707Z[0] = bVar6;
                    z17 = true;
                    z12 = true;
                }
                if (bVar2 == bVar6 && v() < max4) {
                    I0(max4);
                    this.f37707Z[1] = bVar6;
                    z17 = true;
                    z12 = true;
                }
            } else {
                z12 = z11;
            }
            int max5 = Math.max(this.f37733m0, U());
            if (max5 > U()) {
                g1(max5);
                this.f37707Z[0] = e.b.FIXED;
                z17 = true;
                z12 = true;
            }
            int max6 = Math.max(this.f37735n0, v());
            if (max6 > v()) {
                I0(max6);
                r62 = 1;
                this.f37707Z[1] = e.b.FIXED;
                z13 = true;
                z12 = true;
            } else {
                r62 = 1;
                z13 = z17;
            }
            if (!z13) {
                e.b bVar7 = this.f37707Z[0];
                e.b bVar8 = e.b.WRAP_CONTENT;
                if (bVar7 == bVar8 && i11 > 0 && U() > i11) {
                    this.f37783g1 = r62;
                    this.f37707Z[0] = e.b.FIXED;
                    g1(i11);
                    z13 = r62;
                    z12 = z13;
                }
                if (this.f37707Z[r62] == bVar8 && i10 > 0 && v() > i10) {
                    this.f37784h1 = r62;
                    this.f37707Z[r62] = e.b.FIXED;
                    I0(i10);
                    i12 = 8;
                    z14 = true;
                    z17 = true;
                    z18 = i17 <= i12 ? false : z14;
                    i16 = i17;
                    i13 = 0;
                }
            }
            z17 = z13;
            z14 = z12;
            i12 = 8;
            if (i17 <= i12) {
            }
            i16 = i17;
            i13 = 0;
        }
        this.f37804K0 = arrayList;
        if (z17) {
            e.b[] bVarArr2 = this.f37707Z;
            bVarArr2[0] = bVar3;
            bVarArr2[1] = bVar2;
        }
        t0(this.f37767Q0.w());
    }

    @Override // o0.k, o0.e
    public void r0() {
        this.f37767Q0.E();
        this.f37768R0 = 0;
        this.f37770T0 = 0;
        this.f37769S0 = 0;
        this.f37771U0 = 0;
        this.f37782f1 = false;
        super.r0();
    }

    void r1(e eVar, int i10) {
        if (i10 == 0) {
            t1(eVar);
        } else if (i10 == 1) {
            y1(eVar);
        }
    }

    public boolean s1(C3592d c3592d) {
        boolean P12 = P1(64);
        g(c3592d, P12);
        int size = this.f37804K0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.f37804K0.get(i10);
            eVar.P0(0, false);
            eVar.P0(1, false);
            if (eVar instanceof C3736a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.f37804K0.get(i11);
                if (eVar2 instanceof C3736a) {
                    ((C3736a) eVar2).u1();
                }
            }
        }
        this.f37790n1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = (e) this.f37804K0.get(i12);
            if (eVar3.f()) {
                eVar3.g(c3592d, P12);
            }
        }
        while (this.f37790n1.size() > 0) {
            int size2 = this.f37790n1.size();
            Iterator it = this.f37790n1.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a((e) it.next());
                throw null;
            }
            if (size2 == this.f37790n1.size()) {
                Iterator it2 = this.f37790n1.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).g(c3592d, P12);
                }
                this.f37790n1.clear();
            }
        }
        if (C3592d.f36922r) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = (e) this.f37804K0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, c3592d, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e eVar5 = (e) it3.next();
                j.a(this, c3592d, eVar5);
                eVar5.g(c3592d, P12);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                e eVar6 = (e) this.f37804K0.get(i14);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.f37707Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.M0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.c1(e.b.FIXED);
                    }
                    eVar6.g(c3592d, P12);
                    if (bVar == bVar3) {
                        eVar6.M0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.c1(bVar2);
                    }
                } else {
                    j.a(this, c3592d, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(c3592d, P12);
                    }
                }
            }
        }
        if (this.f37772V0 > 0) {
            AbstractC3737b.b(this, c3592d, null, 0);
        }
        if (this.f37773W0 > 0) {
            AbstractC3737b.b(this, c3592d, null, 1);
        }
        return true;
    }

    public void u1(d dVar) {
        WeakReference weakReference = this.f37789m1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f37789m1.get()).d()) {
            this.f37789m1 = new WeakReference(dVar);
        }
    }

    public void v1(d dVar) {
        WeakReference weakReference = this.f37787k1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f37787k1.get()).d()) {
            this.f37787k1 = new WeakReference(dVar);
        }
    }

    void z1(d dVar) {
        WeakReference weakReference = this.f37788l1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f37788l1.get()).d()) {
            this.f37788l1 = new WeakReference(dVar);
        }
    }
}
