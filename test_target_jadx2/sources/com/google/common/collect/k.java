package com.google.common.collect;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class k extends h implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient i f27903b;

    k() {
    }

    public static k A(Object obj) {
        return new x(obj);
    }

    public static k B(Object obj, Object obj2, Object obj3) {
        return r(3, obj, obj2, obj3);
    }

    public static k D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        g8.h.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return r(length, objArr2);
    }

    private static boolean E(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    static int m(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            g8.h.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    private static k r(int i10, Object... objArr) {
        if (i10 == 0) {
            return w();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return A(obj);
        }
        int m10 = m(i10);
        Object[] objArr2 = new Object[m10];
        int i11 = m10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object a10 = q.a(objArr[i14], i14);
            int hashCode = a10.hashCode();
            int a11 = g.a(hashCode);
            while (true) {
                int i15 = a11 & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = a10;
                    objArr2[i15] = a10;
                    i12 += hashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(a10)) {
                    break;
                }
                a11++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new x(obj3);
        }
        if (m(i13) < m10 / 2) {
            return r(i13, objArr);
        }
        if (E(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new v(objArr, i12, objArr2, i11, i13);
    }

    public static k w() {
        return v.f27924i;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof k) && u() && ((k) obj).u() && hashCode() != obj.hashCode()) {
            return false;
        }
        return w.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return w.b(this);
    }

    public i k() {
        i iVar = this.f27903b;
        if (iVar != null) {
            return iVar;
        }
        i t10 = t();
        this.f27903b = t10;
        return t10;
    }

    i t() {
        return i.k(toArray());
    }

    boolean u() {
        return false;
    }

    /* renamed from: v */
    public abstract z iterator();
}
