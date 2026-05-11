package com.google.common.collect;

import com.google.common.collect.j;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class u extends j {

    /* renamed from: h, reason: collision with root package name */
    static final j f27909h = new u(null, new Object[0], 0);

    /* renamed from: e, reason: collision with root package name */
    private final transient Object f27910e;

    /* renamed from: f, reason: collision with root package name */
    final transient Object[] f27911f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f27912g;

    static class a extends k {

        /* renamed from: c, reason: collision with root package name */
        private final transient j f27913c;

        /* renamed from: d, reason: collision with root package name */
        private final transient Object[] f27914d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f27915e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f27916f;

        /* renamed from: com.google.common.collect.u$a$a, reason: collision with other inner class name */
        class C0412a extends i {
            C0412a() {
            }

            @Override // java.util.List
            /* renamed from: I, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i10) {
                g8.h.f(i10, a.this.f27916f);
                int i11 = i10 * 2;
                Object obj = a.this.f27914d[a.this.f27915e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f27914d[i11 + (a.this.f27915e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f27916f;
            }
        }

        a(j jVar, Object[] objArr, int i10, int i11) {
            this.f27913c = jVar;
            this.f27914d = objArr;
            this.f27915e = i10;
            this.f27916f = i11;
        }

        @Override // com.google.common.collect.h
        int c(Object[] objArr, int i10) {
            return k().c(objArr, i10);
        }

        @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f27913c.get(key));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f27916f;
        }

        @Override // com.google.common.collect.k
        i t() {
            return new C0412a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: v */
        public z iterator() {
            return k().iterator();
        }
    }

    static final class b extends k {

        /* renamed from: c, reason: collision with root package name */
        private final transient j f27918c;

        /* renamed from: d, reason: collision with root package name */
        private final transient i f27919d;

        b(j jVar, i iVar) {
            this.f27918c = jVar;
            this.f27919d = iVar;
        }

        @Override // com.google.common.collect.h
        int c(Object[] objArr, int i10) {
            return k().c(objArr, i10);
        }

        @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f27918c.get(obj) != null;
        }

        @Override // com.google.common.collect.k
        public i k() {
            return this.f27919d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f27918c.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: v */
        public z iterator() {
            return k().iterator();
        }
    }

    static final class c extends i {

        /* renamed from: c, reason: collision with root package name */
        private final transient Object[] f27920c;

        /* renamed from: d, reason: collision with root package name */
        private final transient int f27921d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f27922e;

        c(Object[] objArr, int i10, int i11) {
            this.f27920c = objArr;
            this.f27921d = i10;
            this.f27922e = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            g8.h.f(i10, this.f27922e);
            Object obj = this.f27920c[(i10 * 2) + this.f27921d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f27922e;
        }
    }

    private u(Object obj, Object[] objArr, int i10) {
        this.f27910e = obj;
        this.f27911f = objArr;
        this.f27912g = i10;
    }

    static u n(int i10, Object[] objArr) {
        return o(i10, objArr, null);
    }

    static u o(int i10, Object[] objArr, j.a aVar) {
        if (i10 == 0) {
            return (u) f27909h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            d.a(obj, obj2);
            return new u(null, objArr, 1);
        }
        g8.h.j(i10, objArr.length >> 1);
        Object p10 = p(objArr, i10, k.m(i10), 0);
        if (p10 instanceof Object[]) {
            Object[] objArr2 = (Object[]) p10;
            j.a.C0410a c0410a = (j.a.C0410a) objArr2[2];
            if (aVar == null) {
                throw c0410a.a();
            }
            aVar.f27899e = c0410a;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            p10 = obj3;
            i10 = intValue;
        }
        return new u(p10, objArr, i10);
    }

    private static Object p(Object[] objArr, int i10, int i11, int i12) {
        j.a.C0410a c0410a = null;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            d.a(obj, obj2);
            return null;
        }
        int i13 = i11 - 1;
        int i14 = -1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = (i16 * 2) + i12;
                int i18 = (i15 * 2) + i12;
                Object obj3 = objArr[i17];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj4);
                d.a(obj3, obj4);
                int a10 = g.a(obj3.hashCode());
                while (true) {
                    int i19 = a10 & i13;
                    int i20 = bArr[i19] & 255;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj3;
                            objArr[i18 ^ 1] = obj4;
                        }
                        i15++;
                    } else {
                        if (obj3.equals(objArr[i20])) {
                            int i21 = i20 ^ 1;
                            Object obj5 = objArr[i21];
                            Objects.requireNonNull(obj5);
                            c0410a = new j.a.C0410a(obj3, obj4, obj5);
                            objArr[i21] = obj4;
                            break;
                        }
                        a10 = i19 + 1;
                    }
                }
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), c0410a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i10; i23++) {
                int i24 = (i23 * 2) + i12;
                int i25 = (i22 * 2) + i12;
                Object obj6 = objArr[i24];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj7);
                d.a(obj6, obj7);
                int a11 = g.a(obj6.hashCode());
                while (true) {
                    int i26 = a11 & i13;
                    int i27 = sArr[i26] & 65535;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            objArr[i25] = obj6;
                            objArr[i25 ^ 1] = obj7;
                        }
                        i22++;
                    } else {
                        if (obj6.equals(objArr[i27])) {
                            int i28 = i27 ^ 1;
                            Object obj8 = objArr[i28];
                            Objects.requireNonNull(obj8);
                            c0410a = new j.a.C0410a(obj6, obj7, obj8);
                            objArr[i28] = obj7;
                            break;
                        }
                        a11 = i26 + 1;
                    }
                }
            }
            return i22 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i22), c0410a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i29 = 0;
        int i30 = 0;
        while (i29 < i10) {
            int i31 = (i29 * 2) + i12;
            int i32 = (i30 * 2) + i12;
            Object obj9 = objArr[i31];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i31 ^ 1];
            Objects.requireNonNull(obj10);
            d.a(obj9, obj10);
            int a12 = g.a(obj9.hashCode());
            while (true) {
                int i33 = a12 & i13;
                int i34 = iArr[i33];
                if (i34 == i14) {
                    iArr[i33] = i32;
                    if (i30 < i29) {
                        objArr[i32] = obj9;
                        objArr[i32 ^ 1] = obj10;
                    }
                    i30++;
                } else {
                    if (obj9.equals(objArr[i34])) {
                        int i35 = i34 ^ 1;
                        Object obj11 = objArr[i35];
                        Objects.requireNonNull(obj11);
                        c0410a = new j.a.C0410a(obj9, obj10, obj11);
                        objArr[i35] = obj10;
                        break;
                    }
                    a12 = i33 + 1;
                    i14 = -1;
                }
            }
            i29++;
            i14 = -1;
        }
        return i30 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i30), c0410a};
    }

    static Object q(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int a10 = g.a(obj2.hashCode());
            while (true) {
                int i12 = a10 & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                a10 = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int a11 = g.a(obj2.hashCode());
            while (true) {
                int i14 = a11 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                a11 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int a12 = g.a(obj2.hashCode());
            while (true) {
                int i16 = a12 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                a12 = i16 + 1;
            }
        }
    }

    @Override // com.google.common.collect.j
    k c() {
        return new a(this, this.f27911f, 0, this.f27912g);
    }

    @Override // com.google.common.collect.j
    k d() {
        return new b(this, new c(this.f27911f, 0, this.f27912g));
    }

    @Override // com.google.common.collect.j
    h e() {
        return new c(this.f27911f, 1, this.f27912g);
    }

    @Override // com.google.common.collect.j, java.util.Map
    public Object get(Object obj) {
        Object q10 = q(this.f27910e, this.f27911f, this.f27912g, 0, obj);
        if (q10 == null) {
            return null;
        }
        return q10;
    }

    @Override // java.util.Map
    public int size() {
        return this.f27912g;
    }
}
