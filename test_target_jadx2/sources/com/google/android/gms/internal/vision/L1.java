package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
abstract class L1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f25045a = F();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2549a2 f25046b = g(false);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2549a2 f25047c = g(true);

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC2549a2 f25048d = new C2557c2();

    static int A(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2571g1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2614v0.j0(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static AbstractC2549a2 B() {
        return f25048d;
    }

    public static void C(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.c(i10, list, z10);
    }

    static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * AbstractC2614v0.c0(i10));
    }

    static int E(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof P0) {
            P0 p02 = (P0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2614v0.x0(p02.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2614v0.x0(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    private static Class F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void G(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.y(i10, list, z10);
    }

    static int H(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return I(list) + (size * AbstractC2614v0.c0(i10));
    }

    static int I(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof P0) {
            P0 p02 = (P0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2614v0.g0(p02.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2614v0.g0(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    private static Class J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void K(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.f(i10, list, z10);
    }

    static int L(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * AbstractC2614v0.c0(i10));
    }

    static int M(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof P0) {
            P0 p02 = (P0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2614v0.k0(p02.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2614v0.k0(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void N(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.w(i10, list, z10);
    }

    static int O(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * AbstractC2614v0.c0(i10));
    }

    static int P(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof P0) {
            P0 p02 = (P0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2614v0.o0(p02.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2614v0.o0(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void Q(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.d(i10, list, z10);
    }

    static int R(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC2614v0.t0(i10, 0);
    }

    static int S(List list) {
        return list.size() << 2;
    }

    public static void T(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.l(i10, list, z10);
    }

    static int U(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC2614v0.m0(i10, 0L);
    }

    static int V(List list) {
        return list.size() << 3;
    }

    public static void W(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.e(i10, list, z10);
    }

    static int X(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC2614v0.D(i10, true);
    }

    static int Y(List list) {
        return list.size();
    }

    public static void Z(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.z(i10, list, z10);
    }

    static int a(int i10, Object obj, K1 k12) {
        return AbstractC2614v0.B(i10, (InterfaceC2609t1) obj, k12);
    }

    public static void a0(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.q(i10, list, z10);
    }

    static int b(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int c02 = AbstractC2614v0.c0(i10) * size;
        if (list instanceof InterfaceC2560d1) {
            InterfaceC2560d1 interfaceC2560d1 = (InterfaceC2560d1) list;
            while (i11 < size) {
                Object n10 = interfaceC2560d1.n(i11);
                c02 += n10 instanceof AbstractC2570g0 ? AbstractC2614v0.E((AbstractC2570g0) n10) : AbstractC2614v0.G((String) n10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                c02 += obj instanceof AbstractC2570g0 ? AbstractC2614v0.E((AbstractC2570g0) obj) : AbstractC2614v0.G((String) obj);
                i11++;
            }
        }
        return c02;
    }

    public static void b0(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.s(i10, list, z10);
    }

    static int c(int i10, List list, K1 k12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c02 = AbstractC2614v0.c0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            c02 += AbstractC2614v0.c((InterfaceC2609t1) list.get(i11), k12);
        }
        return c02;
    }

    public static void c0(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.m(i10, list, z10);
    }

    static int d(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + (list.size() * AbstractC2614v0.c0(i10));
    }

    public static void d0(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.i(i10, list, z10);
    }

    static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2571g1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2614v0.Z(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static AbstractC2549a2 f() {
        return f25046b;
    }

    private static AbstractC2549a2 g(boolean z10) {
        try {
            Class J10 = J();
            if (J10 == null) {
                return null;
            }
            return (AbstractC2549a2) J10.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    static Object h(int i10, int i11, Object obj, AbstractC2549a2 abstractC2549a2) {
        if (obj == null) {
            obj = abstractC2549a2.a();
        }
        abstractC2549a2.b(obj, i10, i11);
        return obj;
    }

    static Object i(int i10, List list, S0 s02, Object obj, AbstractC2549a2 abstractC2549a2) {
        if (s02 == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = (Integer) list.get(i12);
                int intValue = num.intValue();
                if (s02.b(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    obj = h(i10, intValue, obj, abstractC2549a2);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!s02.b(intValue2)) {
                    obj = h(i10, intValue2, obj, abstractC2549a2);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static void j(int i10, List list, y2 y2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.G(i10, list);
    }

    public static void k(int i10, List list, y2 y2Var, K1 k12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.N(i10, list, k12);
    }

    public static void l(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.g(i10, list, z10);
    }

    static void m(C0 c02, Object obj, Object obj2) {
        F0 b10 = c02.b(obj2);
        if (b10.f25021a.isEmpty()) {
            return;
        }
        c02.e(obj).c(b10);
    }

    static void n(InterfaceC2601q1 interfaceC2601q1, Object obj, Object obj2, long j10) {
        h2.j(obj, j10, interfaceC2601q1.g(h2.F(obj, j10), h2.F(obj2, j10)));
    }

    static void o(AbstractC2549a2 abstractC2549a2, Object obj, Object obj2) {
        abstractC2549a2.e(obj, abstractC2549a2.i(abstractC2549a2.f(obj), abstractC2549a2.f(obj2)));
    }

    public static void p(Class cls) {
        Class cls2;
        if (!N0.class.isAssignableFrom(cls) && (cls2 = f25045a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int r(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c02 = size * AbstractC2614v0.c0(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            c02 += AbstractC2614v0.E((AbstractC2570g0) list.get(i11));
        }
        return c02;
    }

    static int s(int i10, List list, K1 k12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC2614v0.Q(i10, (InterfaceC2609t1) list.get(i12), k12);
        }
        return i11;
    }

    static int t(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u(list) + (size * AbstractC2614v0.c0(i10));
    }

    static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2571g1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2614v0.e0(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static AbstractC2549a2 v() {
        return f25047c;
    }

    public static void w(int i10, List list, y2 y2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.C(i10, list);
    }

    public static void x(int i10, List list, y2 y2Var, K1 k12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.J(i10, list, k12);
    }

    public static void y(int i10, List list, y2 y2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y2Var.E(i10, list, z10);
    }

    static int z(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * AbstractC2614v0.c0(i10));
    }
}
