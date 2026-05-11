package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1557y;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f16380a = A();

    /* renamed from: b, reason: collision with root package name */
    private static final m0 f16381b = B();

    /* renamed from: c, reason: collision with root package name */
    private static final m0 f16382c = new o0();

    private static Class A() {
        if (b0.f16333d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static m0 B() {
        try {
            Class C10 = C();
            if (C10 == null) {
                return null;
            }
            return (m0) C10.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        if (b0.f16333d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(AbstractC1549p abstractC1549p, Object obj, Object obj2) {
        C1551s c10 = abstractC1549p.c(obj2);
        if (c10.j()) {
            return;
        }
        abstractC1549p.d(obj).p(c10);
    }

    static void E(K k10, Object obj, Object obj2, long j10) {
        p0.O(obj, j10, k10.a(p0.z(obj, j10), p0.z(obj2, j10)));
    }

    static void F(m0 m0Var, Object obj, Object obj2) {
        m0Var.p(obj, m0Var.k(m0Var.g(obj), m0Var.g(obj2)));
    }

    public static void G(Class cls) {
        Class cls2;
        if (!AbstractC1555w.class.isAssignableFrom(cls) && !b0.f16333d && (cls2 = f16380a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean H(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object I(Object obj, int i10, int i11, Object obj2, m0 m0Var) {
        if (obj2 == null) {
            obj2 = m0Var.f(obj);
        }
        m0Var.e(obj2, i10, i11);
        return obj2;
    }

    public static m0 J() {
        return f16381b;
    }

    public static m0 K() {
        return f16382c;
    }

    public static void L(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.w(i10, list, z10);
    }

    public static void M(int i10, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.I(i10, list);
    }

    public static void N(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.G(i10, list, z10);
    }

    public static void O(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.F(i10, list, z10);
    }

    public static void P(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.v(i10, list, z10);
    }

    public static void Q(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.s(i10, list, z10);
    }

    public static void R(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.a(i10, list, z10);
    }

    public static void S(int i10, List list, s0 s0Var, f0 f0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.K(i10, list, f0Var);
    }

    public static void T(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.m(i10, list, z10);
    }

    public static void U(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.E(i10, list, z10);
    }

    public static void V(int i10, List list, s0 s0Var, f0 f0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.J(i10, list, f0Var);
    }

    public static void W(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.t(i10, list, z10);
    }

    public static void X(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.f(i10, list, z10);
    }

    public static void Y(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.C(i10, list, z10);
    }

    public static void Z(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.y(i10, list, z10);
    }

    static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC1543j.O(i10) + AbstractC1543j.y(size) : size * AbstractC1543j.c(i10, true);
    }

    public static void a0(int i10, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.j(i10, list);
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.x(i10, list, z10);
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O10 = size * AbstractC1543j.O(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            O10 += AbstractC1543j.g((AbstractC1540g) list.get(i11));
        }
        return O10;
    }

    public static void c0(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.g(i10, list, z10);
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        return z10 ? AbstractC1543j.O(i10) + AbstractC1543j.y(e10) : e10 + (size * AbstractC1543j.O(i10));
    }

    static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1556x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC1543j.k(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC1543j.O(i10) + AbstractC1543j.y(size * 4) : size * AbstractC1543j.l(i10, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC1543j.O(i10) + AbstractC1543j.y(size * 8) : size * AbstractC1543j.n(i10, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i10, List list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC1543j.r(i10, (P) list.get(i12), f0Var);
        }
        return i11;
    }

    static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        return z10 ? AbstractC1543j.O(i10) + AbstractC1543j.y(l10) : l10 + (size * AbstractC1543j.O(i10));
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1556x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC1543j.v(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z10 ? AbstractC1543j.O(i10) + AbstractC1543j.y(n10) : n10 + (list.size() * AbstractC1543j.O(i10));
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC1543j.x(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    static int o(int i10, Object obj, f0 f0Var) {
        return AbstractC1543j.z(i10, (P) obj, f0Var);
    }

    static int p(int i10, List list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O10 = AbstractC1543j.O(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            O10 += AbstractC1543j.B((P) list.get(i11), f0Var);
        }
        return O10;
    }

    static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        return z10 ? AbstractC1543j.O(i10) + AbstractC1543j.y(r10) : r10 + (size * AbstractC1543j.O(i10));
    }

    static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1556x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC1543j.J(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        return z10 ? AbstractC1543j.O(i10) + AbstractC1543j.y(t10) : t10 + (size * AbstractC1543j.O(i10));
    }

    static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC1543j.L(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int O10 = AbstractC1543j.O(i10) * size;
        if (list instanceof C) {
            C c10 = (C) list;
            while (i11 < size) {
                Object s10 = c10.s(i11);
                O10 += s10 instanceof AbstractC1540g ? AbstractC1543j.g((AbstractC1540g) s10) : AbstractC1543j.N((String) s10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                O10 += obj instanceof AbstractC1540g ? AbstractC1543j.g((AbstractC1540g) obj) : AbstractC1543j.N((String) obj);
                i11++;
            }
        }
        return O10;
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        return z10 ? AbstractC1543j.O(i10) + AbstractC1543j.y(w10) : w10 + (size * AbstractC1543j.O(i10));
    }

    static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1556x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC1543j.Q(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        return z10 ? AbstractC1543j.O(i10) + AbstractC1543j.y(y10) : y10 + (size * AbstractC1543j.O(i10));
    }

    static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC1543j.S(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    static Object z(Object obj, int i10, List list, AbstractC1557y.a aVar, Object obj2, m0 m0Var) {
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
                    obj2 = I(obj, i10, intValue, obj2, m0Var);
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
                    obj2 = I(obj, i10, intValue2, obj2, m0Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
