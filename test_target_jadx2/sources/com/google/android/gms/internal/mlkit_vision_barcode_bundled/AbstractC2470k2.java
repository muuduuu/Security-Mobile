package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2470k2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f24878a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2539y2 f24879b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2539y2 f24880c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24881d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC2539y2 abstractC2539y2 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f24878a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC2539y2 = (AbstractC2539y2) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f24879b = abstractC2539y2;
        f24880c = new B2();
    }

    static int A(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2449g1) {
            C2449g1 c2449g1 = (C2449g1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += M0.w(c2449g1.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += M0.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (M0.A(i10 << 3) + 4);
    }

    static int C(List list) {
        return list.size() * 4;
    }

    static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (M0.A(i10 << 3) + 8);
    }

    static int E(List list) {
        return list.size() * 8;
    }

    static int F(int i10, List list, InterfaceC2460i2 interfaceC2460i2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += M0.v(i10, (P1) list.get(i12), interfaceC2460i2);
        }
        return i11;
    }

    static int G(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * M0.A(i10 << 3));
    }

    static int H(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2449g1) {
            C2449g1 c2449g1 = (C2449g1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += M0.w(c2449g1.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += M0.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int I(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return J(list) + (list.size() * M0.A(i10 << 3));
    }

    static int J(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += M0.B(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    static int K(int i10, Object obj, InterfaceC2460i2 interfaceC2460i2) {
        return M0.A(i10 << 3) + M0.y((P1) obj, interfaceC2460i2);
    }

    static int L(int i10, List list, InterfaceC2460i2 interfaceC2460i2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A10 = M0.A(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            A10 += M0.y((P1) list.get(i11), interfaceC2460i2);
        }
        return A10;
    }

    static int M(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * M0.A(i10 << 3));
    }

    static int N(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2449g1) {
            C2449g1 c2449g1 = (C2449g1) list;
            i10 = 0;
            while (i11 < size) {
                int e10 = c2449g1.e(i11);
                i10 += M0.A((e10 >> 31) ^ (e10 + e10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += M0.A((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    static int O(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * M0.A(i10 << 3));
    }

    static int P(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long longValue = ((Long) list.get(i11)).longValue();
            i10 += M0.B((longValue >> 63) ^ (longValue + longValue));
        }
        return i10;
    }

    static int Q(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z10 = list instanceof InterfaceC2533x1;
        int A10 = M0.A(i10 << 3) * size;
        if (z10) {
            InterfaceC2533x1 interfaceC2533x1 = (InterfaceC2533x1) list;
            while (i11 < size) {
                Object z11 = interfaceC2533x1.z(i11);
                if (z11 instanceof E0) {
                    int j10 = ((E0) z11).j();
                    A10 += M0.A(j10) + j10;
                } else {
                    A10 += M0.z((String) z11);
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof E0) {
                    int j11 = ((E0) obj).j();
                    A10 += M0.A(j11) + j11;
                } else {
                    A10 += M0.z((String) obj);
                }
                i11++;
            }
        }
        return A10;
    }

    static int R(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return S(list) + (size * M0.A(i10 << 3));
    }

    static int S(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2449g1) {
            C2449g1 c2449g1 = (C2449g1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += M0.A(c2449g1.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += M0.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int T(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return U(list) + (size * M0.A(i10 << 3));
    }

    static int U(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += M0.B(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static AbstractC2539y2 V() {
        return f24879b;
    }

    public static AbstractC2539y2 W() {
        return f24880c;
    }

    static Object a(Object obj, int i10, int i11, Object obj2, AbstractC2539y2 abstractC2539y2) {
        if (obj2 == null) {
            obj2 = abstractC2539y2.c(obj);
        }
        abstractC2539y2.f(obj2, i10, i11);
        return obj2;
    }

    static void b(R0 r02, Object obj, Object obj2) {
        V0 b10 = r02.b(obj2);
        if (b10.f24818a.isEmpty()) {
            return;
        }
        r02.c(obj).h(b10);
    }

    static void c(AbstractC2539y2 abstractC2539y2, Object obj, Object obj2) {
        abstractC2539y2.h(obj, abstractC2539y2.e(abstractC2539y2.d(obj), abstractC2539y2.d(obj2)));
    }

    public static void d(Class cls) {
        Class cls2;
        if (!AbstractC2444f1.class.isAssignableFrom(cls) && (cls2 = f24878a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void e(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.c(i10, list, z10);
    }

    public static void f(int i10, List list, R2 r22) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.a(i10, list);
    }

    public static void g(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.g(i10, list, z10);
    }

    public static void h(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.e(i10, list, z10);
    }

    public static void i(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.d(i10, list, z10);
    }

    public static void j(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.f(i10, list, z10);
    }

    public static void k(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.D(i10, list, z10);
    }

    public static void l(int i10, List list, R2 r22, InterfaceC2460i2 interfaceC2460i2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((N0) r22).w(i10, list.get(i11), interfaceC2460i2);
        }
    }

    public static void m(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.k(i10, list, z10);
    }

    public static void n(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.A(i10, list, z10);
    }

    public static void o(int i10, List list, R2 r22, InterfaceC2460i2 interfaceC2460i2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((N0) r22).G(i10, list.get(i11), interfaceC2460i2);
        }
    }

    public static void p(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.l(i10, list, z10);
    }

    public static void q(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.p(i10, list, z10);
    }

    public static void r(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.r(i10, list, z10);
    }

    public static void s(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.u(i10, list, z10);
    }

    public static void t(int i10, List list, R2 r22) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.H(i10, list);
    }

    public static void u(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.o(i10, list, z10);
    }

    public static void v(int i10, List list, R2 r22, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r22.t(i10, list, z10);
    }

    static boolean w(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (M0.A(i10 << 3) + 1);
    }

    static int y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A10 = size * M0.A(i10 << 3);
        for (int i11 = 0; i11 < list.size(); i11++) {
            int j10 = ((E0) list.get(i11)).j();
            A10 += M0.A(j10) + j10;
        }
        return A10;
    }

    static int z(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * M0.A(i10 << 3));
    }
}
