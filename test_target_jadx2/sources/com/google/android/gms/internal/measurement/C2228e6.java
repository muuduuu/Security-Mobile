package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.e6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2228e6 {

    /* renamed from: f, reason: collision with root package name */
    private static final C2228e6 f24491f = new C2228e6(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f24492a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f24493b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f24494c;

    /* renamed from: d, reason: collision with root package name */
    private int f24495d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24496e;

    private C2228e6(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f24492a = i10;
        this.f24493b = iArr;
        this.f24494c = objArr;
        this.f24496e = z10;
    }

    public static C2228e6 a() {
        return f24491f;
    }

    static C2228e6 b() {
        return new C2228e6(0, new int[8], new Object[8], true);
    }

    static C2228e6 c(C2228e6 c2228e6, C2228e6 c2228e62) {
        int i10 = c2228e6.f24492a + c2228e62.f24492a;
        int[] copyOf = Arrays.copyOf(c2228e6.f24493b, i10);
        System.arraycopy(c2228e62.f24493b, 0, copyOf, c2228e6.f24492a, c2228e62.f24492a);
        Object[] copyOf2 = Arrays.copyOf(c2228e6.f24494c, i10);
        System.arraycopy(c2228e62.f24494c, 0, copyOf2, c2228e6.f24492a, c2228e62.f24492a);
        return new C2228e6(i10, copyOf, copyOf2, true);
    }

    private final void l(int i10) {
        int[] iArr = this.f24493b;
        if (i10 > iArr.length) {
            int i11 = this.f24492a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f24493b = Arrays.copyOf(iArr, i10);
            this.f24494c = Arrays.copyOf(this.f24494c, i10);
        }
    }

    public final void d() {
        if (this.f24496e) {
            this.f24496e = false;
        }
    }

    final void e() {
        if (!this.f24496e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2228e6)) {
            return false;
        }
        C2228e6 c2228e6 = (C2228e6) obj;
        int i10 = this.f24492a;
        if (i10 == c2228e6.f24492a) {
            int[] iArr = this.f24493b;
            int[] iArr2 = c2228e6.f24493b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f24494c;
                    Object[] objArr2 = c2228e6.f24494c;
                    int i12 = this.f24492a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final void f(InterfaceC2336q6 interfaceC2336q6) {
        if (this.f24492a != 0) {
            for (int i10 = 0; i10 < this.f24492a; i10++) {
                int i11 = this.f24493b[i10];
                Object obj = this.f24494c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC2336q6.a(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC2336q6.h(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC2336q6.B(i13, (J4) obj);
                } else if (i12 == 3) {
                    interfaceC2336q6.I(i13);
                    ((C2228e6) obj).f(interfaceC2336q6);
                    interfaceC2336q6.K(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new C2317o5("Protocol message tag had invalid wire type."));
                    }
                    interfaceC2336q6.m(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int g() {
        int i10 = this.f24495d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f24492a; i12++) {
            int i13 = this.f24493b[i12] >>> 3;
            J4 j42 = (J4) this.f24494c[i12];
            int E10 = O4.E(8);
            int E11 = O4.E(16) + O4.E(i13);
            int E12 = O4.E(24);
            int h10 = j42.h();
            i11 += E10 + E10 + E11 + E12 + O4.E(h10) + h10;
        }
        this.f24495d = i11;
        return i11;
    }

    public final int h() {
        int E10;
        int a10;
        int i10;
        int i11 = this.f24495d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f24492a; i13++) {
            int i14 = this.f24493b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.f24494c[i13]).longValue();
                    i10 = O4.E(i15 << 3) + 8;
                } else if (i16 == 2) {
                    int i17 = i15 << 3;
                    J4 j42 = (J4) this.f24494c[i13];
                    int E11 = O4.E(i17);
                    int h10 = j42.h();
                    i10 = E11 + O4.E(h10) + h10;
                } else if (i16 == 3) {
                    int E12 = O4.E(i15 << 3);
                    E10 = E12 + E12;
                    a10 = ((C2228e6) this.f24494c[i13]).h();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(new C2317o5("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f24494c[i13]).intValue();
                    i10 = O4.E(i15 << 3) + 4;
                }
                i12 += i10;
            } else {
                int i18 = i15 << 3;
                long longValue = ((Long) this.f24494c[i13]).longValue();
                E10 = O4.E(i18);
                a10 = O4.a(longValue);
            }
            i10 = E10 + a10;
            i12 += i10;
        }
        this.f24495d = i12;
        return i12;
    }

    public final int hashCode() {
        int i10 = this.f24492a;
        int i11 = i10 + 527;
        int[] iArr = this.f24493b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i11 * 31) + i13) * 31;
        Object[] objArr = this.f24494c;
        int i16 = this.f24492a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f24492a; i11++) {
            J5.b(sb2, i10, String.valueOf(this.f24493b[i11] >>> 3), this.f24494c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        e();
        l(this.f24492a + 1);
        int[] iArr = this.f24493b;
        int i11 = this.f24492a;
        iArr[i11] = i10;
        this.f24494c[i11] = obj;
        this.f24492a = i11 + 1;
    }

    final C2228e6 k(C2228e6 c2228e6) {
        if (c2228e6.equals(f24491f)) {
            return this;
        }
        e();
        int i10 = this.f24492a + c2228e6.f24492a;
        l(i10);
        System.arraycopy(c2228e6.f24493b, 0, this.f24493b, this.f24492a, c2228e6.f24492a);
        System.arraycopy(c2228e6.f24494c, 0, this.f24494c, this.f24492a, c2228e6.f24492a);
        this.f24492a = i10;
        return this;
    }
}
