package t7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class F extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f42484j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private transient Object f42485a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f42486b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f42487c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f42488d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f42489e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f42490f;

    /* renamed from: g, reason: collision with root package name */
    private transient Set f42491g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set f42492h;

    /* renamed from: i, reason: collision with root package name */
    private transient Collection f42493i;

    F(int i10) {
        r(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(Object obj) {
        if (t()) {
            return f42484j;
        }
        int x10 = x();
        Object obj2 = this.f42485a;
        obj2.getClass();
        int b10 = G.b(obj, null, x10, obj2, C(), a(), null);
        if (b10 == -1) {
            return f42484j;
        }
        Object obj3 = b()[b10];
        s(b10, x10);
        this.f42490f--;
        q();
        return obj3;
    }

    private final void B(int i10) {
        this.f42489e = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f42489e & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] C() {
        int[] iArr = this.f42486b;
        iArr.getClass();
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] a() {
        Object[] objArr = this.f42487c;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] b() {
        Object[] objArr = this.f42488d;
        objArr.getClass();
        return objArr;
    }

    static /* synthetic */ int d(F f10) {
        int i10 = f10.f42490f;
        f10.f42490f = i10 - 1;
        return i10;
    }

    static /* synthetic */ Object i(F f10, int i10) {
        return f10.a()[i10];
    }

    static /* synthetic */ Object m(F f10, int i10) {
        return f10.b()[i10];
    }

    static /* synthetic */ Object n(F f10) {
        Object obj = f10.f42485a;
        obj.getClass();
        return obj;
    }

    static /* synthetic */ void p(F f10, int i10, Object obj) {
        f10.b()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int x() {
        return (1 << (this.f42489e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int y(Object obj) {
        if (t()) {
            return -1;
        }
        int a10 = H.a(obj);
        int x10 = x();
        Object obj2 = this.f42485a;
        obj2.getClass();
        int c10 = G.c(obj2, a10 & x10);
        if (c10 != 0) {
            int i10 = ~x10;
            int i11 = a10 & i10;
            do {
                int i12 = c10 - 1;
                int i13 = C()[i12];
                if ((i13 & i10) == i11 && x6.a(obj, a()[i12])) {
                    return i12;
                }
                c10 = i13 & x10;
            } while (c10 != 0);
        }
        return -1;
    }

    private final int z(int i10, int i11, int i12, int i13) {
        Object d10 = G.d(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            G.e(d10, i12 & i14, i13 + 1);
        }
        Object obj = this.f42485a;
        obj.getClass();
        int[] C10 = C();
        for (int i15 = 0; i15 <= i10; i15++) {
            int c10 = G.c(obj, i15);
            while (c10 != 0) {
                int i16 = c10 - 1;
                int i17 = C10[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int c11 = G.c(d10, i19);
                G.e(d10, i19, c10);
                C10[i16] = ((~i14) & i18) | (c11 & i14);
                c10 = i17 & i10;
            }
        }
        this.f42485a = d10;
        B(i14);
        return i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (t()) {
            return;
        }
        q();
        Map o10 = o();
        if (o10 != null) {
            this.f42489e = AbstractC4752q0.a(size(), 3, 1073741823);
            o10.clear();
            this.f42485a = null;
            this.f42490f = 0;
            return;
        }
        Arrays.fill(a(), 0, this.f42490f, (Object) null);
        Arrays.fill(b(), 0, this.f42490f, (Object) null);
        Object obj = this.f42485a;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(C(), 0, this.f42490f, 0);
        this.f42490f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map o10 = o();
        return o10 != null ? o10.containsKey(obj) : y(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map o10 = o();
        if (o10 != null) {
            return o10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f42490f; i10++) {
            if (x6.a(obj, b()[i10])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f42492h;
        if (set != null) {
            return set;
        }
        C4813z c4813z = new C4813z(this);
        this.f42492h = c4813z;
        return c4813z;
    }

    final int g() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map o10 = o();
        if (o10 != null) {
            return o10.get(obj);
        }
        int y10 = y(obj);
        if (y10 == -1) {
            return null;
        }
        return b()[y10];
    }

    final int h(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f42490f) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f42491g;
        if (set != null) {
            return set;
        }
        C c10 = new C(this);
        this.f42491g = c10;
        return c10;
    }

    final Map o() {
        Object obj = this.f42485a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (t()) {
            AbstractC4653c.d(t(), "Arrays already allocated");
            int i10 = this.f42489e;
            int max = Math.max(i10 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f42485a = G.d(max2);
            B(max2 - 1);
            this.f42486b = new int[i10];
            this.f42487c = new Object[i10];
            this.f42488d = new Object[i10];
        }
        Map o10 = o();
        if (o10 != null) {
            return o10.put(obj, obj2);
        }
        int[] C10 = C();
        Object[] a10 = a();
        Object[] b10 = b();
        int i11 = this.f42490f;
        int i12 = i11 + 1;
        int a11 = H.a(obj);
        int x10 = x();
        int i13 = a11 & x10;
        Object obj3 = this.f42485a;
        obj3.getClass();
        int c10 = G.c(obj3, i13);
        if (c10 != 0) {
            int i14 = ~x10;
            int i15 = a11 & i14;
            int i16 = 0;
            while (true) {
                int i17 = c10 - 1;
                int i18 = C10[i17];
                int i19 = i18 & i14;
                if (i19 == i15 && x6.a(obj, a10[i17])) {
                    Object obj4 = b10[i17];
                    b10[i17] = obj2;
                    return obj4;
                }
                int i20 = i18 & x10;
                i16++;
                if (i20 != 0) {
                    c10 = i20;
                } else {
                    if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(x() + 1, 1.0f);
                        int g10 = g();
                        while (g10 >= 0) {
                            linkedHashMap.put(a()[g10], b()[g10]);
                            g10 = h(g10);
                        }
                        this.f42485a = linkedHashMap;
                        this.f42486b = null;
                        this.f42487c = null;
                        this.f42488d = null;
                        q();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i12 > x10) {
                        x10 = z(x10, G.a(x10), a11, i11);
                    } else {
                        C10[i17] = (i12 & x10) | i19;
                    }
                }
            }
        } else if (i12 > x10) {
            x10 = z(x10, G.a(x10), a11, i11);
        } else {
            Object obj5 = this.f42485a;
            obj5.getClass();
            G.e(obj5, i13, i12);
        }
        int length = C().length;
        if (i12 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f42486b = Arrays.copyOf(C(), min);
            this.f42487c = Arrays.copyOf(a(), min);
            this.f42488d = Arrays.copyOf(b(), min);
        }
        C()[i11] = (~x10) & a11;
        a()[i11] = obj;
        b()[i11] = obj2;
        this.f42490f = i12;
        q();
        return null;
    }

    final void q() {
        this.f42489e += 32;
    }

    final void r(int i10) {
        this.f42489e = AbstractC4752q0.a(12, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map o10 = o();
        if (o10 != null) {
            return o10.remove(obj);
        }
        Object A10 = A(obj);
        if (A10 == f42484j) {
            return null;
        }
        return A10;
    }

    final void s(int i10, int i11) {
        Object obj = this.f42485a;
        obj.getClass();
        int[] C10 = C();
        Object[] a10 = a();
        Object[] b10 = b();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            a10[i10] = null;
            b10[i10] = null;
            C10[i10] = 0;
            return;
        }
        Object obj2 = a10[i12];
        a10[i10] = obj2;
        b10[i10] = b10[i12];
        a10[i12] = null;
        b10[i12] = null;
        C10[i10] = C10[i12];
        C10[i12] = 0;
        int a11 = H.a(obj2) & i11;
        int c10 = G.c(obj, a11);
        if (c10 == size) {
            G.e(obj, a11, i10 + 1);
            return;
        }
        while (true) {
            int i13 = c10 - 1;
            int i14 = C10[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                C10[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                return;
            }
            c10 = i15;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map o10 = o();
        return o10 != null ? o10.size() : this.f42490f;
    }

    final boolean t() {
        return this.f42485a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f42493i;
        if (collection != null) {
            return collection;
        }
        E e10 = new E(this);
        this.f42493i = e10;
        return e10;
    }
}
