package q7;

import java.util.Arrays;

/* renamed from: q7.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3949x extends AbstractC3942p {

    /* renamed from: g, reason: collision with root package name */
    static final AbstractC3942p f38831g = new C3949x(null, new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    private final transient Object f38832d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f38833e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f38834f;

    private C3949x(Object obj, Object[] objArr, int i10) {
        this.f38832d = obj;
        this.f38833e = objArr;
        this.f38834f = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static C3949x g(int i10, Object[] objArr, C3941o c3941o) {
        int i11;
        short[] sArr;
        char c10;
        char c11;
        byte[] bArr;
        int i12 = i10;
        Object[] objArr2 = objArr;
        if (i12 == 0) {
            return (C3949x) f38831g;
        }
        Object obj = null;
        int i13 = 1;
        if (i12 == 1) {
            Object obj2 = objArr2[0];
            obj2.getClass();
            Object obj3 = objArr2[1];
            obj3.getClass();
            AbstractC3932f.a(obj2, obj3);
            return new C3949x(null, objArr2, 1);
        }
        AbstractC3929c.b(i12, objArr2.length >> 1, "index");
        int max = Math.max(i12, 2);
        if (max < 751619276) {
            i11 = Integer.highestOneBit(max - 1);
            do {
                i11 += i11;
            } while (i11 * 0.7d < max);
        } else {
            i11 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i12 == 1) {
            Object obj4 = objArr2[0];
            obj4.getClass();
            Object obj5 = objArr2[1];
            obj5.getClass();
            AbstractC3932f.a(obj4, obj5);
            c10 = 1;
            c11 = 2;
        } else {
            int i14 = i11 - 1;
            char c12 = 65535;
            if (i11 <= 128) {
                byte[] bArr2 = new byte[i11];
                Arrays.fill(bArr2, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i16 + i16;
                    int i18 = i15 + i15;
                    Object obj6 = objArr2[i18];
                    obj6.getClass();
                    Object obj7 = objArr2[i18 ^ i13];
                    obj7.getClass();
                    AbstractC3932f.a(obj6, obj7);
                    int a10 = AbstractC3934h.a(obj6.hashCode());
                    while (true) {
                        int i19 = a10 & i14;
                        int i20 = bArr2[i19] & 255;
                        if (i20 == 255) {
                            bArr2[i19] = (byte) i17;
                            if (i16 < i15) {
                                objArr2[i17] = obj6;
                                objArr2[i17 ^ 1] = obj7;
                            }
                            i16++;
                        } else {
                            if (obj6.equals(objArr2[i20])) {
                                int i21 = i20 ^ 1;
                                Object obj8 = objArr2[i21];
                                obj8.getClass();
                                C3940n c3940n = new C3940n(obj6, obj7, obj8);
                                objArr2[i21] = obj7;
                                obj = c3940n;
                                break;
                            }
                            a10 = i19 + 1;
                        }
                    }
                    i15++;
                    i13 = 1;
                }
                if (i16 == i12) {
                    bArr = bArr2;
                } else {
                    bArr = new Object[]{bArr2, Integer.valueOf(i16), obj};
                    c11 = 2;
                    c10 = 1;
                    obj = bArr;
                }
            } else if (i11 <= 32768) {
                sArr = new short[i11];
                Arrays.fill(sArr, (short) -1);
                int i22 = 0;
                for (int i23 = 0; i23 < i12; i23++) {
                    int i24 = i22 + i22;
                    int i25 = i23 + i23;
                    Object obj9 = objArr2[i25];
                    obj9.getClass();
                    Object obj10 = objArr2[i25 ^ 1];
                    obj10.getClass();
                    AbstractC3932f.a(obj9, obj10);
                    int a11 = AbstractC3934h.a(obj9.hashCode());
                    while (true) {
                        int i26 = a11 & i14;
                        char c13 = (char) sArr[i26];
                        if (c13 == 65535) {
                            sArr[i26] = (short) i24;
                            if (i22 < i23) {
                                objArr2[i24] = obj9;
                                objArr2[i24 ^ 1] = obj10;
                            }
                            i22++;
                        } else {
                            if (obj9.equals(objArr2[c13])) {
                                int i27 = c13 ^ 1;
                                Object obj11 = objArr2[i27];
                                obj11.getClass();
                                C3940n c3940n2 = new C3940n(obj9, obj10, obj11);
                                objArr2[i27] = obj10;
                                obj = c3940n2;
                                break;
                            }
                            a11 = i26 + 1;
                        }
                    }
                }
                if (i22 != i12) {
                    c11 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i22), obj};
                    c10 = 1;
                }
                bArr = sArr;
            } else {
                int i28 = 1;
                sArr = new int[i11];
                Arrays.fill((int[]) sArr, -1);
                int i29 = 0;
                int i30 = 0;
                while (i29 < i12) {
                    int i31 = i30 + i30;
                    int i32 = i29 + i29;
                    Object obj12 = objArr2[i32];
                    obj12.getClass();
                    Object obj13 = objArr2[i32 ^ i28];
                    obj13.getClass();
                    AbstractC3932f.a(obj12, obj13);
                    int a12 = AbstractC3934h.a(obj12.hashCode());
                    while (true) {
                        int i33 = a12 & i14;
                        ?? r15 = sArr[i33];
                        if (r15 == c12) {
                            sArr[i33] = i31;
                            if (i30 < i29) {
                                objArr2[i31] = obj12;
                                objArr2[i31 ^ 1] = obj13;
                            }
                            i30++;
                        } else {
                            if (obj12.equals(objArr2[r15])) {
                                int i34 = r15 ^ 1;
                                Object obj14 = objArr2[i34];
                                obj14.getClass();
                                C3940n c3940n3 = new C3940n(obj12, obj13, obj14);
                                objArr2[i34] = obj13;
                                obj = c3940n3;
                                break;
                            }
                            a12 = i33 + 1;
                            c12 = 65535;
                        }
                    }
                    i29++;
                    i28 = 1;
                    c12 = 65535;
                }
                if (i30 != i12) {
                    c10 = 1;
                    c11 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i30), obj};
                }
                bArr = sArr;
            }
            c11 = 2;
            c10 = 1;
            obj = bArr;
        }
        boolean z10 = obj instanceof Object[];
        Object obj15 = obj;
        if (z10) {
            Object[] objArr3 = (Object[]) obj;
            C3940n c3940n4 = (C3940n) objArr3[c11];
            if (c3941o == null) {
                throw c3940n4.a();
            }
            c3941o.f38814c = c3940n4;
            Object obj16 = objArr3[0];
            int intValue = ((Integer) objArr3[c10]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj15 = obj16;
            i12 = intValue;
        }
        return new C3949x(obj15, objArr2, i12);
    }

    @Override // q7.AbstractC3942p
    final AbstractC3936j a() {
        return new C3948w(this.f38833e, 1, this.f38834f);
    }

    @Override // q7.AbstractC3942p
    final AbstractC3943q d() {
        return new C3946u(this, this.f38833e, 0, this.f38834f);
    }

    @Override // q7.AbstractC3942p
    final AbstractC3943q e() {
        return new C3947v(this, new C3948w(this.f38833e, 0, this.f38834f));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // q7.AbstractC3942p, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object obj3 = this.f38832d;
        Object[] objArr = this.f38833e;
        int i10 = this.f38834f;
        if (obj != null) {
            if (i10 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                if (obj4.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else if (obj3 != null) {
                if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int a10 = AbstractC3934h.a(obj.hashCode());
                    while (true) {
                        int i11 = a10 & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                            break;
                        }
                        a10 = i11 + 1;
                    }
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int a11 = AbstractC3934h.a(obj.hashCode());
                    while (true) {
                        int i13 = a11 & length2;
                        char c10 = (char) sArr[i13];
                        if (c10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c10])) {
                            obj2 = objArr[c10 ^ 1];
                            break;
                        }
                        a11 = i13 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int a12 = AbstractC3934h.a(obj.hashCode());
                    while (true) {
                        int i14 = a12 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                            break;
                        }
                        a12 = i14 + 1;
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f38834f;
    }
}
