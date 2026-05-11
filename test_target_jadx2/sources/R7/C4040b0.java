package r7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: r7.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4040b0 extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f39909j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private transient Object f39910a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f39911b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f39912c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f39913d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f39914e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f39915f;

    /* renamed from: g, reason: collision with root package name */
    private transient Set f39916g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set f39917h;

    /* renamed from: i, reason: collision with root package name */
    private transient Collection f39918i;

    C4040b0(int i10) {
        n(12);
    }

    static /* synthetic */ Object h(C4040b0 c4040b0) {
        Object obj = c4040b0.f39910a;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int q() {
        return (1 << (this.f39914e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(Object obj) {
        if (p()) {
            return -1;
        }
        int a10 = AbstractC4060d0.a(obj);
        int q10 = q();
        Object obj2 = this.f39910a;
        obj2.getClass();
        int c10 = AbstractC4050c0.c(obj2, a10 & q10);
        if (c10 != 0) {
            int i10 = ~q10;
            int i11 = a10 & i10;
            do {
                int i12 = c10 - 1;
                int[] iArr = this.f39911b;
                iArr.getClass();
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.f39912c;
                    objArr.getClass();
                    if (r.a(obj, objArr[i12])) {
                        return i12;
                    }
                }
                c10 = i13 & q10;
            } while (c10 != 0);
        }
        return -1;
    }

    private final int s(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object d10 = AbstractC4050c0.d(i11);
        if (i13 != 0) {
            AbstractC4050c0.e(d10, i12 & i14, i13 + 1);
        }
        Object obj = this.f39910a;
        obj.getClass();
        int[] iArr = this.f39911b;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int c10 = AbstractC4050c0.c(obj, i15);
            while (c10 != 0) {
                int i16 = c10 - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int c11 = AbstractC4050c0.c(d10, i19);
                AbstractC4050c0.e(d10, i19, c10);
                iArr[i16] = ((~i14) & i18) | (c11 & i14);
                c10 = i17 & i10;
            }
        }
        this.f39910a = d10;
        u(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(Object obj) {
        if (p()) {
            return f39909j;
        }
        int q10 = q();
        Object obj2 = this.f39910a;
        obj2.getClass();
        int[] iArr = this.f39911b;
        iArr.getClass();
        Object[] objArr = this.f39912c;
        objArr.getClass();
        int b10 = AbstractC4050c0.b(obj, null, q10, obj2, iArr, objArr, null);
        if (b10 == -1) {
            return f39909j;
        }
        Object[] objArr2 = this.f39913d;
        objArr2.getClass();
        Object obj3 = objArr2[b10];
        o(b10, q10);
        this.f39915f--;
        m();
        return obj3;
    }

    private final void u(int i10) {
        this.f39914e = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f39914e & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (p()) {
            return;
        }
        m();
        Map j10 = j();
        if (j10 != null) {
            this.f39914e = L0.a(size(), 3, 1073741823);
            j10.clear();
            this.f39910a = null;
            this.f39915f = 0;
            return;
        }
        Object[] objArr = this.f39912c;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f39915f, (Object) null);
        Object[] objArr2 = this.f39913d;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f39915f, (Object) null);
        Object obj = this.f39910a;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f39911b;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f39915f, 0);
        this.f39915f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map j10 = j();
        return j10 != null ? j10.containsKey(obj) : r(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map j10 = j();
        if (j10 != null) {
            return j10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f39915f; i10++) {
            Object[] objArr = this.f39913d;
            objArr.getClass();
            if (r.a(obj, objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    final int e() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f39917h;
        if (set != null) {
            return set;
        }
        V v10 = new V(this);
        this.f39917h = v10;
        return v10;
    }

    final int f(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f39915f) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map j10 = j();
        if (j10 != null) {
            return j10.get(obj);
        }
        int r10 = r(obj);
        if (r10 == -1) {
            return null;
        }
        Object[] objArr = this.f39913d;
        objArr.getClass();
        return objArr[r10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    final Map j() {
        Object obj = this.f39910a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f39916g;
        if (set != null) {
            return set;
        }
        Y y10 = new Y(this);
        this.f39916g = y10;
        return y10;
    }

    final void m() {
        this.f39914e += 32;
    }

    final void n(int i10) {
        this.f39914e = L0.a(12, 1, 1073741823);
    }

    final void o(int i10, int i11) {
        Object obj = this.f39910a;
        obj.getClass();
        int[] iArr = this.f39911b;
        iArr.getClass();
        Object[] objArr = this.f39912c;
        objArr.getClass();
        Object[] objArr2 = this.f39913d;
        objArr2.getClass();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
            return;
        }
        Object obj2 = objArr[i12];
        objArr[i10] = obj2;
        objArr2[i10] = objArr2[i12];
        objArr[i12] = null;
        objArr2[i12] = null;
        iArr[i10] = iArr[i12];
        iArr[i12] = 0;
        int a10 = AbstractC4060d0.a(obj2) & i11;
        int c10 = AbstractC4050c0.c(obj, a10);
        if (c10 == size) {
            AbstractC4050c0.e(obj, a10, i10 + 1);
            return;
        }
        while (true) {
            int i13 = c10 - 1;
            int i14 = iArr[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                return;
            }
            c10 = i15;
        }
    }

    final boolean p() {
        return this.f39910a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (p()) {
            AbstractC4248w.e(p(), "Arrays already allocated");
            int i10 = this.f39914e;
            int max = Math.max(i10 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f39910a = AbstractC4050c0.d(max2);
            u(max2 - 1);
            this.f39911b = new int[i10];
            this.f39912c = new Object[i10];
            this.f39913d = new Object[i10];
        }
        Map j10 = j();
        if (j10 != null) {
            return j10.put(obj, obj2);
        }
        int[] iArr = this.f39911b;
        iArr.getClass();
        Object[] objArr = this.f39912c;
        objArr.getClass();
        Object[] objArr2 = this.f39913d;
        objArr2.getClass();
        int i11 = this.f39915f;
        int i12 = i11 + 1;
        int a10 = AbstractC4060d0.a(obj);
        int q10 = q();
        int i13 = a10 & q10;
        Object obj3 = this.f39910a;
        obj3.getClass();
        int c10 = AbstractC4050c0.c(obj3, i13);
        if (c10 != 0) {
            int i14 = ~q10;
            int i15 = a10 & i14;
            int i16 = 0;
            while (true) {
                int i17 = c10 - 1;
                int i18 = iArr[i17];
                int i19 = i18 & i14;
                if (i19 == i15 && r.a(obj, objArr[i17])) {
                    Object obj4 = objArr2[i17];
                    objArr2[i17] = obj2;
                    return obj4;
                }
                int i20 = i18 & q10;
                i16++;
                if (i20 != 0) {
                    c10 = i20;
                } else {
                    if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q() + 1, 1.0f);
                        int e10 = e();
                        while (e10 >= 0) {
                            Object[] objArr3 = this.f39912c;
                            objArr3.getClass();
                            Object obj5 = objArr3[e10];
                            Object[] objArr4 = this.f39913d;
                            objArr4.getClass();
                            linkedHashMap.put(obj5, objArr4[e10]);
                            e10 = f(e10);
                        }
                        this.f39910a = linkedHashMap;
                        this.f39911b = null;
                        this.f39912c = null;
                        this.f39913d = null;
                        m();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i12 > q10) {
                        q10 = s(q10, AbstractC4050c0.a(q10), a10, i11);
                    } else {
                        iArr[i17] = (i12 & q10) | i19;
                    }
                }
            }
        } else if (i12 > q10) {
            q10 = s(q10, AbstractC4050c0.a(q10), a10, i11);
        } else {
            Object obj6 = this.f39910a;
            obj6.getClass();
            AbstractC4050c0.e(obj6, i13, i12);
        }
        int[] iArr2 = this.f39911b;
        iArr2.getClass();
        int length = iArr2.length;
        if (i12 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.f39911b;
            iArr3.getClass();
            this.f39911b = Arrays.copyOf(iArr3, min);
            Object[] objArr5 = this.f39912c;
            objArr5.getClass();
            this.f39912c = Arrays.copyOf(objArr5, min);
            Object[] objArr6 = this.f39913d;
            objArr6.getClass();
            this.f39913d = Arrays.copyOf(objArr6, min);
        }
        int i21 = (~q10) & a10;
        int[] iArr4 = this.f39911b;
        iArr4.getClass();
        iArr4[i11] = i21;
        Object[] objArr7 = this.f39912c;
        objArr7.getClass();
        objArr7[i11] = obj;
        Object[] objArr8 = this.f39913d;
        objArr8.getClass();
        objArr8[i11] = obj2;
        this.f39915f = i12;
        m();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map j10 = j();
        if (j10 != null) {
            return j10.remove(obj);
        }
        Object t10 = t(obj);
        if (t10 == f39909j) {
            return null;
        }
        return t10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map j10 = j();
        return j10 != null ? j10.size() : this.f39915f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f39918i;
        if (collection != null) {
            return collection;
        }
        C4030a0 c4030a0 = new C4030a0(this);
        this.f39918i = c4030a0;
        return c4030a0;
    }
}
