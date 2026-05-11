package p0;

import java.util.ArrayList;
import l0.C3592d;
import o0.C3736a;
import o0.d;
import o0.e;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f38208a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private a f38209b = new a();

    /* renamed from: c, reason: collision with root package name */
    private o0.f f38210c;

    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f38211k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f38212l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f38213m = 2;

        /* renamed from: a, reason: collision with root package name */
        public e.b f38214a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f38215b;

        /* renamed from: c, reason: collision with root package name */
        public int f38216c;

        /* renamed from: d, reason: collision with root package name */
        public int f38217d;

        /* renamed from: e, reason: collision with root package name */
        public int f38218e;

        /* renamed from: f, reason: collision with root package name */
        public int f38219f;

        /* renamed from: g, reason: collision with root package name */
        public int f38220g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f38221h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f38222i;

        /* renamed from: j, reason: collision with root package name */
        public int f38223j;
    }

    /* renamed from: p0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0588b {
        void a();

        void b(o0.e eVar, a aVar);
    }

    public b(o0.f fVar) {
        this.f38210c = fVar;
    }

    private boolean a(InterfaceC0588b interfaceC0588b, o0.e eVar, int i10) {
        this.f38209b.f38214a = eVar.y();
        this.f38209b.f38215b = eVar.R();
        this.f38209b.f38216c = eVar.U();
        this.f38209b.f38217d = eVar.v();
        a aVar = this.f38209b;
        aVar.f38222i = false;
        aVar.f38223j = i10;
        e.b bVar = aVar.f38214a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f38215b == bVar2;
        boolean z12 = z10 && eVar.f37715d0 > 0.0f;
        boolean z13 = z11 && eVar.f37715d0 > 0.0f;
        if (z12 && eVar.f37756y[0] == 4) {
            aVar.f38214a = e.b.FIXED;
        }
        if (z13 && eVar.f37756y[1] == 4) {
            aVar.f38215b = e.b.FIXED;
        }
        interfaceC0588b.b(eVar, aVar);
        eVar.g1(this.f38209b.f38218e);
        eVar.I0(this.f38209b.f38219f);
        eVar.H0(this.f38209b.f38221h);
        eVar.x0(this.f38209b.f38220g);
        a aVar2 = this.f38209b;
        aVar2.f38223j = a.f38211k;
        return aVar2.f38222i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0089, code lost:
    
        if (r8 != r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0090, code lost:
    
        if (r5.f37715d0 <= 0.0f) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(o0.f fVar) {
        l lVar;
        n nVar;
        int size = fVar.f37804K0.size();
        boolean P12 = fVar.P1(64);
        InterfaceC0588b F12 = fVar.F1();
        for (int i10 = 0; i10 < size; i10++) {
            o0.e eVar = (o0.e) fVar.f37804K0.get(i10);
            if (!(eVar instanceof o0.g) && !(eVar instanceof C3736a) && !eVar.j0() && (!P12 || (lVar = eVar.f37716e) == null || (nVar = eVar.f37718f) == null || !lVar.f38283e.f38244j || !nVar.f38283e.f38244j)) {
                e.b s10 = eVar.s(0);
                boolean z10 = true;
                e.b s11 = eVar.s(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z11 = s10 == bVar && eVar.f37752w != 1 && s11 == bVar && eVar.f37754x != 1;
                if (!z11 && fVar.P1(1)) {
                    if (s10 == bVar && eVar.f37752w == 0 && s11 != bVar && !eVar.g0()) {
                        z11 = true;
                    }
                    if (s11 == bVar && eVar.f37754x == 0 && s10 != bVar && !eVar.g0()) {
                        z11 = true;
                    }
                    if (s10 != bVar) {
                    }
                }
                z10 = z11;
                if (!z10) {
                    a(F12, eVar, a.f38211k);
                }
            }
        }
        F12.a();
    }

    private void c(o0.f fVar, String str, int i10, int i11, int i12) {
        int G10 = fVar.G();
        int F10 = fVar.F();
        fVar.W0(0);
        fVar.V0(0);
        fVar.g1(i11);
        fVar.I0(i12);
        fVar.W0(G10);
        fVar.V0(F10);
        this.f38210c.T1(i10);
        this.f38210c.o1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long d(o0.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19;
        boolean z10;
        int i20;
        int i21;
        boolean z11;
        boolean z12;
        int i22;
        b bVar = this;
        InterfaceC0588b F12 = fVar.F1();
        int size = fVar.f37804K0.size();
        int U10 = fVar.U();
        int v10 = fVar.v();
        boolean b10 = o0.j.b(i10, 128);
        int i23 = 1;
        boolean z13 = b10 || o0.j.b(i10, 64);
        if (z13) {
            for (int i24 = 0; i24 < size; i24++) {
                o0.e eVar = (o0.e) fVar.f37804K0.get(i24);
                e.b y10 = eVar.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z14 = (y10 == bVar2) && (eVar.R() == bVar2) && eVar.t() > 0.0f;
                if ((eVar.g0() && z14) || ((eVar.i0() && z14) || eVar.g0() || eVar.i0())) {
                    z13 = false;
                    break;
                }
            }
        }
        if (z13) {
            boolean z15 = C3592d.f36922r;
        }
        boolean z16 = z13 & ((i13 == 1073741824 && i15 == 1073741824) || b10);
        int i25 = 2;
        if (z16) {
            int min = Math.min(fVar.E(), i14);
            int min2 = Math.min(fVar.D(), i16);
            if (i13 == 1073741824 && fVar.U() != min) {
                fVar.g1(min);
                fVar.I1();
            }
            if (i15 == 1073741824 && fVar.v() != min2) {
                fVar.I0(min2);
                fVar.I1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                z10 = fVar.B1(b10);
                i20 = 2;
                i19 = 0;
            } else {
                boolean C12 = fVar.C1(b10);
                i19 = 0;
                if (i13 == 1073741824) {
                    C12 &= fVar.D1(b10, 0);
                    i20 = 1;
                } else {
                    i20 = 0;
                }
                if (i15 == 1073741824) {
                    z10 = fVar.D1(b10, 1) & C12;
                    i20++;
                } else {
                    z10 = C12;
                }
            }
            if (z10) {
                fVar.l1(i13 == 1073741824 ? 1 : i19, i15 == 1073741824 ? 1 : i19);
            }
        } else {
            i19 = 0;
            z10 = false;
            i20 = 0;
        }
        if (z10 && i20 == 2) {
            return 0L;
        }
        int G12 = fVar.G1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f38208a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, U10, v10);
        }
        if (size2 > 0) {
            e.b y11 = fVar.y();
            e.b bVar3 = e.b.WRAP_CONTENT;
            int i26 = y11 == bVar3 ? 1 : i19;
            int i27 = fVar.R() == bVar3 ? 1 : i19;
            int max = Math.max(fVar.U(), bVar.f38210c.G());
            int max2 = Math.max(fVar.v(), bVar.f38210c.F());
            for (int i28 = i19; i28 < size2; i28++) {
            }
            int i29 = 0;
            while (i29 < i25) {
                int i30 = 0;
                boolean z17 = false;
                while (i30 < size2) {
                    o0.e eVar2 = (o0.e) bVar.f38208a.get(i30);
                    if ((eVar2 instanceof o0.h) || (eVar2 instanceof o0.g)) {
                        i21 = size2;
                    } else {
                        i21 = size2;
                        if (eVar2.T() != 8 && (!z16 || !eVar2.f37716e.f38283e.f38244j || !eVar2.f37718f.f38283e.f38244j)) {
                            int U11 = eVar2.U();
                            int v11 = eVar2.v();
                            z11 = z16;
                            int n10 = eVar2.n();
                            int i31 = a.f38212l;
                            if (i29 == 1) {
                                i31 = a.f38213m;
                            }
                            boolean a10 = z17 | bVar.a(F12, eVar2, i31);
                            int U12 = eVar2.U();
                            int v12 = eVar2.v();
                            if (U12 != U11) {
                                eVar2.g1(U12);
                                if (i26 != 0 && eVar2.K() > max) {
                                    max = Math.max(max, eVar2.K() + eVar2.m(d.b.RIGHT).e());
                                }
                                z12 = true;
                            } else {
                                z12 = a10;
                            }
                            if (v12 != v11) {
                                eVar2.I0(v12);
                                if (i27 != 0 && eVar2.p() > max2) {
                                    max2 = Math.max(max2, eVar2.p() + eVar2.m(d.b.BOTTOM).e());
                                }
                                z17 = true;
                            } else {
                                z17 = z12;
                            }
                            if (eVar2.X() && n10 != eVar2.n()) {
                                i22 = 1;
                                z17 = true;
                                i30 += i22;
                                size2 = i21;
                                i23 = i22;
                                z16 = z11;
                                bVar = this;
                            }
                            i22 = 1;
                            i30 += i22;
                            size2 = i21;
                            i23 = i22;
                            z16 = z11;
                            bVar = this;
                        }
                    }
                    z11 = z16;
                    i22 = 1;
                    i30 += i22;
                    size2 = i21;
                    i23 = i22;
                    z16 = z11;
                    bVar = this;
                }
                boolean z18 = z16;
                int i32 = size2;
                int i33 = i23;
                if (!z17) {
                    break;
                }
                i29 += i33;
                c(fVar, "intermediate pass", i29, U10, v10);
                size2 = i32;
                i23 = i33;
                z16 = z18;
                i25 = 2;
                bVar = this;
            }
        }
        fVar.S1(G12);
        return 0L;
    }

    public void e(o0.f fVar) {
        this.f38208a.clear();
        int size = fVar.f37804K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0.e eVar = (o0.e) fVar.f37804K0.get(i10);
            e.b y10 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y10 == bVar || eVar.R() == bVar) {
                this.f38208a.add(eVar);
            }
        }
        fVar.I1();
    }
}
