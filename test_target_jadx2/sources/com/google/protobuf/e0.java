package com.google.protobuf;

import com.google.protobuf.AbstractC2893y;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f28724a = A();

    /* renamed from: b, reason: collision with root package name */
    private static final i0 f28725b = B(false);

    /* renamed from: c, reason: collision with root package name */
    private static final i0 f28726c = B(true);

    /* renamed from: d, reason: collision with root package name */
    private static final i0 f28727d = new k0();

    private static Class A() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static i0 B(boolean z10) {
        try {
            Class C10 = C();
            if (C10 == null) {
                return null;
            }
            return (i0) C10.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(AbstractC2885p abstractC2885p, Object obj, Object obj2) {
        AbstractC2887s b10 = abstractC2885p.b(obj2);
        if (b10.d()) {
            return;
        }
        abstractC2885p.c(obj).h(b10);
    }

    static void E(I i10, Object obj, Object obj2, long j10) {
        m0.R(obj, j10, i10.a(m0.C(obj, j10), m0.C(obj2, j10)));
    }

    static void F(i0 i0Var, Object obj, Object obj2) {
        i0Var.i(obj, i0Var.g(i0Var.c(obj), i0Var.c(obj2)));
    }

    public static i0 G() {
        return f28725b;
    }

    public static i0 H() {
        return f28726c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC2891w.class.isAssignableFrom(cls) && (cls2 = f28724a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean J(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object K(Object obj, int i10, int i11, Object obj2, i0 i0Var) {
        if (obj2 == null) {
            obj2 = i0Var.b(obj);
        }
        i0Var.a(obj2, i10, i11);
        return obj2;
    }

    public static i0 L() {
        return f28727d;
    }

    public static void M(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.w(i10, list, z10);
    }

    public static void N(int i10, List list, p0 p0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.I(i10, list);
    }

    public static void O(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.G(i10, list, z10);
    }

    public static void P(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.F(i10, list, z10);
    }

    public static void Q(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.v(i10, list, z10);
    }

    public static void R(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.s(i10, list, z10);
    }

    public static void S(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.a(i10, list, z10);
    }

    public static void T(int i10, List list, p0 p0Var, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.K(i10, list, c0Var);
    }

    public static void U(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.m(i10, list, z10);
    }

    public static void V(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.E(i10, list, z10);
    }

    public static void W(int i10, List list, p0 p0Var, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.J(i10, list, c0Var);
    }

    public static void X(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.t(i10, list, z10);
    }

    public static void Y(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.f(i10, list, z10);
    }

    public static void Z(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.C(i10, list, z10);
    }

    static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2879j.L(i10) + AbstractC2879j.x(size) : size * AbstractC2879j.d(i10, true);
    }

    public static void a0(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.y(i10, list, z10);
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, p0 p0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.j(i10, list);
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L10 = size * AbstractC2879j.L(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            L10 += AbstractC2879j.g((AbstractC2877h) list.get(i11));
        }
        return L10;
    }

    public static void c0(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.x(i10, list, z10);
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        return z10 ? AbstractC2879j.L(i10) + AbstractC2879j.x(e10) : e10 + (size * AbstractC2879j.L(i10));
    }

    public static void d0(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.g(i10, list, z10);
    }

    static int e(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2892x) {
            AbstractC2892x abstractC2892x = (AbstractC2892x) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.k(abstractC2892x.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2879j.L(i10) + AbstractC2879j.x(size * 4) : size * AbstractC2879j.l(i10, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2879j.L(i10) + AbstractC2879j.x(size * 8) : size * AbstractC2879j.n(i10, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i10, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC2879j.r(i10, (N) list.get(i12), c0Var);
        }
        return i11;
    }

    static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        return z10 ? AbstractC2879j.L(i10) + AbstractC2879j.x(l10) : l10 + (size * AbstractC2879j.L(i10));
    }

    static int l(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2892x) {
            AbstractC2892x abstractC2892x = (AbstractC2892x) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.u(abstractC2892x.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.u(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z10 ? AbstractC2879j.L(i10) + AbstractC2879j.x(n10) : n10 + (list.size() * AbstractC2879j.L(i10));
    }

    static int n(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof E) {
            E e10 = (E) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.w(e10.h(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.w(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int o(int i10, Object obj, c0 c0Var) {
        return AbstractC2879j.y(i10, (N) obj, c0Var);
    }

    static int p(int i10, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L10 = AbstractC2879j.L(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            L10 += AbstractC2879j.z((N) list.get(i11), c0Var);
        }
        return L10;
    }

    static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        return z10 ? AbstractC2879j.L(i10) + AbstractC2879j.x(r10) : r10 + (size * AbstractC2879j.L(i10));
    }

    static int r(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2892x) {
            AbstractC2892x abstractC2892x = (AbstractC2892x) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.G(abstractC2892x.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.G(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        return z10 ? AbstractC2879j.L(i10) + AbstractC2879j.x(t10) : t10 + (size * AbstractC2879j.L(i10));
    }

    static int t(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof E) {
            E e10 = (E) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.I(e10.h(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.I(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int L10 = AbstractC2879j.L(i10) * size;
        if (list instanceof C) {
            C c10 = (C) list;
            while (i11 < size) {
                Object s10 = c10.s(i11);
                L10 += s10 instanceof AbstractC2877h ? AbstractC2879j.g((AbstractC2877h) s10) : AbstractC2879j.K((String) s10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                L10 += obj instanceof AbstractC2877h ? AbstractC2879j.g((AbstractC2877h) obj) : AbstractC2879j.K((String) obj);
                i11++;
            }
        }
        return L10;
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        return z10 ? AbstractC2879j.L(i10) + AbstractC2879j.x(w10) : w10 + (size * AbstractC2879j.L(i10));
    }

    static int w(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2892x) {
            AbstractC2892x abstractC2892x = (AbstractC2892x) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.N(abstractC2892x.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.N(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        return z10 ? AbstractC2879j.L(i10) + AbstractC2879j.x(y10) : y10 + (size * AbstractC2879j.L(i10));
    }

    static int y(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof E) {
            E e10 = (E) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.P(e10.h(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2879j.P(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static Object z(Object obj, int i10, List list, AbstractC2893y.a aVar, Object obj2, i0 i0Var) {
        if (aVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = (Integer) list.get(i12);
                int intValue = num.intValue();
                if (aVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    obj2 = K(obj, i10, intValue, obj2, i0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!aVar.a(intValue2)) {
                    obj2 = K(obj, i10, intValue2, obj2, i0Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
