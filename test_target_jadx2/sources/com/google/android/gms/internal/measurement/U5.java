package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
abstract class U5 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2219d6 f24389a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24390b = 0;

    static {
        int i10 = P5.f24329d;
        f24389a = new C2237f6();
    }

    static int A(List list) {
        return list.size() * 4;
    }

    static int B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (O4.E(i10 << 3) + 4);
    }

    static int C(List list) {
        return list.size() * 8;
    }

    static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (O4.E(i10 << 3) + 8);
    }

    static int E(int i10, Object obj, S5 s52) {
        return O4.E(i10 << 3) + O4.d((H5) obj, s52);
    }

    public static AbstractC2219d6 a() {
        return f24389a;
    }

    static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void c(U4 u42, Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj2);
        throw null;
    }

    static void d(AbstractC2219d6 abstractC2219d6, Object obj, Object obj2) {
        AbstractC2245g5 abstractC2245g5 = (AbstractC2245g5) obj;
        C2228e6 c2228e6 = abstractC2245g5.zzc;
        C2228e6 c2228e62 = ((AbstractC2245g5) obj2).zzc;
        if (!C2228e6.a().equals(c2228e62)) {
            if (C2228e6.a().equals(c2228e6)) {
                c2228e6 = C2228e6.c(c2228e6, c2228e62);
            } else {
                c2228e6.k(c2228e62);
            }
        }
        abstractC2245g5.zzc = c2228e6;
    }

    static Object e(Object obj, int i10, int i11, Object obj2, AbstractC2219d6 abstractC2219d6) {
        if (obj2 == null) {
            obj2 = abstractC2219d6.a(obj);
        }
        ((C2228e6) obj2).j(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    public static void f(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.r(i10, list, z10);
    }

    public static void g(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.N(i10, list, z10);
    }

    public static void h(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.l(i10, list, z10);
    }

    public static void i(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.C(i10, list, z10);
    }

    public static void j(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.t(i10, list, z10);
    }

    public static void k(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.p(i10, list, z10);
    }

    public static void l(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.o(i10, list, z10);
    }

    public static void m(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.X(i10, list, z10);
    }

    public static void n(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.J(i10, list, z10);
    }

    public static void o(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.Q(i10, list, z10);
    }

    public static void p(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.T(i10, list, z10);
    }

    public static void q(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.F(i10, list, z10);
    }

    public static void r(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.W(i10, list, z10);
    }

    public static void s(int i10, List list, InterfaceC2336q6 interfaceC2336q6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2336q6.u(i10, list, z10);
    }

    static int t(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2379v5) {
            C2379v5 c2379v5 = (C2379v5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += O4.a(c2379v5.O0(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += O4.a(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int u(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2379v5) {
            C2379v5 c2379v5 = (C2379v5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += O4.a(c2379v5.O0(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += O4.a(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int v(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2379v5) {
            C2379v5 c2379v5 = (C2379v5) list;
            i10 = 0;
            while (i11 < size) {
                long O02 = c2379v5.O0(i11);
                i10 += O4.a((O02 >> 63) ^ (O02 + O02));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += O4.a((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    static int w(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2254h5) {
            C2254h5 c2254h5 = (C2254h5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += O4.a(c2254h5.h(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += O4.a(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int x(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2254h5) {
            C2254h5 c2254h5 = (C2254h5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += O4.a(c2254h5.h(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += O4.a(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int y(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2254h5) {
            C2254h5 c2254h5 = (C2254h5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += O4.E(c2254h5.h(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += O4.E(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int z(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2254h5) {
            C2254h5 c2254h5 = (C2254h5) list;
            i10 = 0;
            while (i11 < size) {
                int h10 = c2254h5.h(i11);
                i10 += O4.E((h10 >> 31) ^ (h10 + h10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += O4.E((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }
}
