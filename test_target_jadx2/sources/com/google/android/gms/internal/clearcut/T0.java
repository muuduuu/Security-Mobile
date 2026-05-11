package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
abstract class T0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f23938a = C();

    /* renamed from: b, reason: collision with root package name */
    private static final Y0 f23939b = w(false);

    /* renamed from: c, reason: collision with root package name */
    private static final Y0 f23940c = w(true);

    /* renamed from: d, reason: collision with root package name */
    private static final Y0 f23941d = new C2110a1();

    public static Y0 A() {
        return f23940c;
    }

    public static Y0 B() {
        return f23941d;
    }

    private static Class C() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int E(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2112b0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += K.w0(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static void F(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.f(i10, list, z10);
    }

    static int G(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2112b0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += K.x0(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static void H(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.w(i10, list, z10);
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC2109a0.class.isAssignableFrom(cls) && (cls2 = f23938a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static int J(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2112b0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += K.y0(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static void K(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.d(i10, list, z10);
    }

    static int L(List list) {
        return list.size() << 2;
    }

    public static void M(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.l(i10, list, z10);
    }

    static int N(List list) {
        return list.size() << 3;
    }

    public static void O(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.e(i10, list, z10);
    }

    static int P(List list) {
        return list.size();
    }

    public static void Q(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.z(i10, list, z10);
    }

    public static void R(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.q(i10, list, z10);
    }

    public static void S(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.s(i10, list, z10);
    }

    public static void T(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.m(i10, list, z10);
    }

    public static void U(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.i(i10, list, z10);
    }

    static int V(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * K.v0(i10));
    }

    static int W(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j(list) + (size * K.v0(i10));
    }

    static int X(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return q(list) + (size * K.v0(i10));
    }

    static int Y(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v(list) + (size * K.v0(i10));
    }

    static int Z(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * K.v0(i10));
    }

    static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2154p0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += K.Y(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    static int a0(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * K.v0(i10));
    }

    private static Object b(int i10, int i11, Object obj, Y0 y02) {
        if (obj == null) {
            obj = y02.f();
        }
        y02.a(obj, i10, i11);
        return obj;
    }

    static int b0(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J(list) + (size * K.v0(i10));
    }

    static Object c(int i10, List list, InterfaceC2121e0 interfaceC2121e0, Object obj, Y0 y02) {
        if (interfaceC2121e0 == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = (Integer) list.get(i12);
                int intValue = num.intValue();
                if (interfaceC2121e0.n(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    obj = b(i10, intValue, obj, y02);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (interfaceC2121e0.n(intValue2) == null) {
                    obj = b(i10, intValue2, obj, y02);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static int c0(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * K.n0(i10, 0);
    }

    public static void d(int i10, List list, InterfaceC2166t1 interfaceC2166t1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.G(i10, list);
    }

    static int d0(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * K.e0(i10, 0L);
    }

    public static void e(int i10, List list, InterfaceC2166t1 interfaceC2166t1, R0 r02) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.I(i10, list, r02);
    }

    static int e0(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * K.N(i10, true);
    }

    public static void f(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.g(i10, list, z10);
    }

    static void g(P p10, Object obj, Object obj2) {
        U b10 = p10.b(obj2);
        if (b10.b()) {
            return;
        }
        p10.e(obj).f(b10);
    }

    static void h(InterfaceC2174w0 interfaceC2174w0, Object obj, Object obj2, long j10) {
        AbstractC2125f1.i(obj, j10, interfaceC2174w0.f(AbstractC2125f1.M(obj, j10), AbstractC2125f1.M(obj2, j10)));
    }

    static void i(Y0 y02, Object obj, Object obj2) {
        y02.g(obj, y02.i(y02.k(obj), y02.k(obj2)));
    }

    static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2154p0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += K.b0(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static void k(int i10, List list, InterfaceC2166t1 interfaceC2166t1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.C(i10, list);
    }

    public static void l(int i10, List list, InterfaceC2166t1 interfaceC2166t1, R0 r02) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.H(i10, list, r02);
    }

    public static void m(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.E(i10, list, z10);
    }

    static int n(int i10, Object obj, R0 r02) {
        return K.y(i10, (B0) obj, r02);
    }

    static int o(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int v02 = K.v0(i10) * size;
        if (list instanceof InterfaceC2139k0) {
            InterfaceC2139k0 interfaceC2139k0 = (InterfaceC2139k0) list;
            while (i11 < size) {
                Object s10 = interfaceC2139k0.s(i11);
                v02 += s10 instanceof AbstractC2179y ? K.A((AbstractC2179y) s10) : K.k0((String) s10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                v02 += obj instanceof AbstractC2179y ? K.A((AbstractC2179y) obj) : K.k0((String) obj);
                i11++;
            }
        }
        return v02;
    }

    static int p(int i10, List list, R0 r02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v02 = K.v0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            v02 += K.B((B0) list.get(i11), r02);
        }
        return v02;
    }

    static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2154p0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += K.f0(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static void r(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.c(i10, list, z10);
    }

    public static boolean s(int i10, int i11, int i12) {
        if (i11 < 40) {
            return true;
        }
        long j10 = i11 - i10;
        long j11 = i12;
        return j10 + 10 <= ((2 * j11) + 3) + ((j11 + 3) * 3);
    }

    static int t(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v02 = size * K.v0(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            v02 += K.A((AbstractC2179y) list.get(i11));
        }
        return v02;
    }

    static int u(int i10, List list, R0 r02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += K.M(i10, (B0) list.get(i12), r02);
        }
        return i11;
    }

    static int v(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2112b0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += K.B0(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    private static Y0 w(boolean z10) {
        try {
            Class D10 = D();
            if (D10 == null) {
                return null;
            }
            return (Y0) D10.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void x(int i10, List list, InterfaceC2166t1 interfaceC2166t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2166t1.y(i10, list, z10);
    }

    static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Y0 z() {
        return f23939b;
    }
}
