package com.google.android.gms.internal.vision;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.vision.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2561d2 {

    /* renamed from: f, reason: collision with root package name */
    private static final C2561d2 f25115f = new C2561d2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f25116a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f25117b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f25118c;

    /* renamed from: d, reason: collision with root package name */
    private int f25119d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25120e;

    private C2561d2() {
        this(0, new int[8], new Object[8], true);
    }

    public static C2561d2 a() {
        return f25115f;
    }

    static C2561d2 b(C2561d2 c2561d2, C2561d2 c2561d22) {
        int i10 = c2561d2.f25116a + c2561d22.f25116a;
        int[] copyOf = Arrays.copyOf(c2561d2.f25117b, i10);
        System.arraycopy(c2561d22.f25117b, 0, copyOf, c2561d2.f25116a, c2561d22.f25116a);
        Object[] copyOf2 = Arrays.copyOf(c2561d2.f25118c, i10);
        System.arraycopy(c2561d22.f25118c, 0, copyOf2, c2561d2.f25116a, c2561d22.f25116a);
        return new C2561d2(i10, copyOf, copyOf2, true);
    }

    private static void d(int i10, Object obj, y2 y2Var) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            y2Var.t(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            y2Var.A(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            y2Var.H(i11, (AbstractC2570g0) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new RuntimeException(W0.d());
            }
            y2Var.D(i11, ((Integer) obj).intValue());
        } else if (y2Var.zza() == x2.f25221a) {
            y2Var.b(i11);
            ((C2561d2) obj).h(y2Var);
            y2Var.n(i11);
        } else {
            y2Var.n(i11);
            ((C2561d2) obj).h(y2Var);
            y2Var.b(i11);
        }
    }

    static C2561d2 g() {
        return new C2561d2();
    }

    final void c(int i10, Object obj) {
        if (!this.f25120e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f25116a;
        int[] iArr = this.f25117b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f25117b = Arrays.copyOf(iArr, i12);
            this.f25118c = Arrays.copyOf(this.f25118c, i12);
        }
        int[] iArr2 = this.f25117b;
        int i13 = this.f25116a;
        iArr2[i13] = i10;
        this.f25118c[i13] = obj;
        this.f25116a = i13 + 1;
    }

    final void e(y2 y2Var) {
        if (y2Var.zza() == x2.f25222b) {
            for (int i10 = this.f25116a - 1; i10 >= 0; i10--) {
                y2Var.p(this.f25117b[i10] >>> 3, this.f25118c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f25116a; i11++) {
            y2Var.p(this.f25117b[i11] >>> 3, this.f25118c[i11]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2561d2)) {
            return false;
        }
        C2561d2 c2561d2 = (C2561d2) obj;
        int i10 = this.f25116a;
        if (i10 == c2561d2.f25116a) {
            int[] iArr = this.f25117b;
            int[] iArr2 = c2561d2.f25117b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f25118c;
                    Object[] objArr2 = c2561d2.f25118c;
                    int i12 = this.f25116a;
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

    final void f(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f25116a; i11++) {
            AbstractC2624y1.d(sb2, i10, String.valueOf(this.f25117b[i11] >>> 3), this.f25118c[i11]);
        }
    }

    public final void h(y2 y2Var) {
        if (this.f25116a == 0) {
            return;
        }
        if (y2Var.zza() == x2.f25221a) {
            for (int i10 = 0; i10 < this.f25116a; i10++) {
                d(this.f25117b[i10], this.f25118c[i10], y2Var);
            }
            return;
        }
        for (int i11 = this.f25116a - 1; i11 >= 0; i11--) {
            d(this.f25117b[i11], this.f25118c[i11], y2Var);
        }
    }

    public final int hashCode() {
        int i10 = this.f25116a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f25117b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f25118c;
        int i16 = this.f25116a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final void i() {
        this.f25120e = false;
    }

    public final int j() {
        int i10 = this.f25119d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f25116a; i12++) {
            i11 += AbstractC2614v0.Y(this.f25117b[i12] >>> 3, (AbstractC2570g0) this.f25118c[i12]);
        }
        this.f25119d = i11;
        return i11;
    }

    public final int k() {
        int d02;
        int i10 = this.f25119d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f25116a; i12++) {
            int i13 = this.f25117b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                d02 = AbstractC2614v0.d0(i14, ((Long) this.f25118c[i12]).longValue());
            } else if (i15 == 1) {
                d02 = AbstractC2614v0.m0(i14, ((Long) this.f25118c[i12]).longValue());
            } else if (i15 == 2) {
                d02 = AbstractC2614v0.P(i14, (AbstractC2570g0) this.f25118c[i12]);
            } else if (i15 == 3) {
                d02 = (AbstractC2614v0.c0(i14) << 1) + ((C2561d2) this.f25118c[i12]).k();
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException(W0.d());
                }
                d02 = AbstractC2614v0.t0(i14, ((Integer) this.f25118c[i12]).intValue());
            }
            i11 += d02;
        }
        this.f25119d = i11;
        return i11;
    }

    private C2561d2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f25119d = -1;
        this.f25116a = i10;
        this.f25117b = iArr;
        this.f25118c = objArr;
        this.f25120e = z10;
    }
}
