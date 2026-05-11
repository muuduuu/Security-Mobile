package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2544z2 {

    /* renamed from: f, reason: collision with root package name */
    private static final C2544z2 f24986f = new C2544z2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f24987a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f24988b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f24989c;

    /* renamed from: d, reason: collision with root package name */
    private int f24990d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24991e;

    private C2544z2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f24987a = i10;
        this.f24988b = iArr;
        this.f24989c = objArr;
        this.f24991e = z10;
    }

    public static C2544z2 c() {
        return f24986f;
    }

    static C2544z2 e(C2544z2 c2544z2, C2544z2 c2544z22) {
        int i10 = c2544z2.f24987a + c2544z22.f24987a;
        int[] copyOf = Arrays.copyOf(c2544z2.f24988b, i10);
        System.arraycopy(c2544z22.f24988b, 0, copyOf, c2544z2.f24987a, c2544z22.f24987a);
        Object[] copyOf2 = Arrays.copyOf(c2544z2.f24989c, i10);
        System.arraycopy(c2544z22.f24989c, 0, copyOf2, c2544z2.f24987a, c2544z22.f24987a);
        return new C2544z2(i10, copyOf, copyOf2, true);
    }

    static C2544z2 f() {
        return new C2544z2(0, new int[8], new Object[8], true);
    }

    private final void m(int i10) {
        int[] iArr = this.f24988b;
        if (i10 > iArr.length) {
            int i11 = this.f24987a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f24988b = Arrays.copyOf(iArr, i10);
            this.f24989c = Arrays.copyOf(this.f24989c, i10);
        }
    }

    public final int a() {
        int B10;
        int A10;
        int i10;
        int i11 = this.f24990d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f24987a; i13++) {
            int i14 = this.f24988b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.f24989c[i13]).longValue();
                    i10 = M0.A(i15 << 3) + 8;
                } else if (i16 == 2) {
                    E0 e02 = (E0) this.f24989c[i13];
                    int i17 = M0.f24784d;
                    int j10 = e02.j();
                    i10 = M0.A(i15 << 3) + M0.A(j10) + j10;
                } else if (i16 == 3) {
                    int i18 = i15 << 3;
                    int i19 = M0.f24784d;
                    B10 = ((C2544z2) this.f24989c[i13]).a();
                    int A11 = M0.A(i18);
                    A10 = A11 + A11;
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(C2499q1.a());
                    }
                    ((Integer) this.f24989c[i13]).intValue();
                    i10 = M0.A(i15 << 3) + 4;
                }
                i12 += i10;
            } else {
                int i20 = i15 << 3;
                B10 = M0.B(((Long) this.f24989c[i13]).longValue());
                A10 = M0.A(i20);
            }
            i10 = A10 + B10;
            i12 += i10;
        }
        this.f24990d = i12;
        return i12;
    }

    public final int b() {
        int i10 = this.f24990d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f24987a; i12++) {
            int i13 = this.f24988b[i12] >>> 3;
            E0 e02 = (E0) this.f24989c[i12];
            int i14 = M0.f24784d;
            int j10 = e02.j();
            int A10 = M0.A(j10) + j10;
            int A11 = M0.A(16);
            int A12 = M0.A(i13);
            int A13 = M0.A(8);
            i11 += A13 + A13 + A11 + A12 + M0.A(24) + A10;
        }
        this.f24990d = i11;
        return i11;
    }

    final C2544z2 d(C2544z2 c2544z2) {
        if (c2544z2.equals(f24986f)) {
            return this;
        }
        g();
        int i10 = this.f24987a + c2544z2.f24987a;
        m(i10);
        System.arraycopy(c2544z2.f24988b, 0, this.f24988b, this.f24987a, c2544z2.f24987a);
        System.arraycopy(c2544z2.f24989c, 0, this.f24989c, this.f24987a, c2544z2.f24987a);
        this.f24987a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2544z2)) {
            return false;
        }
        C2544z2 c2544z2 = (C2544z2) obj;
        int i10 = this.f24987a;
        if (i10 == c2544z2.f24987a) {
            int[] iArr = this.f24988b;
            int[] iArr2 = c2544z2.f24988b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f24989c;
                    Object[] objArr2 = c2544z2.f24989c;
                    int i12 = this.f24987a;
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

    final void g() {
        if (!this.f24991e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f24991e) {
            this.f24991e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f24987a;
        int i11 = i10 + 527;
        int[] iArr = this.f24988b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 * 31) + i13;
        Object[] objArr = this.f24989c;
        int i16 = this.f24987a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return (i15 * 31) + i12;
    }

    final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f24987a; i11++) {
            R1.b(sb2, i10, String.valueOf(this.f24988b[i11] >>> 3), this.f24989c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        g();
        m(this.f24987a + 1);
        int[] iArr = this.f24988b;
        int i11 = this.f24987a;
        iArr[i11] = i10;
        this.f24989c[i11] = obj;
        this.f24987a = i11 + 1;
    }

    final void k(R2 r22) {
        for (int i10 = 0; i10 < this.f24987a; i10++) {
            r22.B(this.f24988b[i10] >>> 3, this.f24989c[i10]);
        }
    }

    public final void l(R2 r22) {
        if (this.f24987a != 0) {
            for (int i10 = 0; i10 < this.f24987a; i10++) {
                int i11 = this.f24988b[i10];
                Object obj = this.f24989c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    r22.j(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    r22.F(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    r22.h(i13, (E0) obj);
                } else if (i12 == 3) {
                    r22.K(i13);
                    ((C2544z2) obj).l(r22);
                    r22.J(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(C2499q1.a());
                    }
                    r22.m(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
