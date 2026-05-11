package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC2109a0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Z0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Z0 f23968f = new Z0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f23969a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f23970b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f23971c;

    /* renamed from: d, reason: collision with root package name */
    private int f23972d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23973e;

    private Z0() {
        this(0, new int[8], new Object[8], true);
    }

    static Z0 a(Z0 z02, Z0 z03) {
        int i10 = z02.f23969a + z03.f23969a;
        int[] copyOf = Arrays.copyOf(z02.f23970b, i10);
        System.arraycopy(z03.f23970b, 0, copyOf, z02.f23969a, z03.f23969a);
        Object[] copyOf2 = Arrays.copyOf(z02.f23971c, i10);
        System.arraycopy(z03.f23971c, 0, copyOf2, z02.f23969a, z03.f23969a);
        return new Z0(i10, copyOf, copyOf2, true);
    }

    private static void f(int i10, Object obj, InterfaceC2166t1 interfaceC2166t1) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            interfaceC2166t1.K(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            interfaceC2166t1.a(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            interfaceC2166t1.M(i11, (AbstractC2179y) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new RuntimeException(C2127g0.c());
            }
            interfaceC2166t1.x(i11, ((Integer) obj).intValue());
        } else if (interfaceC2166t1.B() == AbstractC2109a0.c.f24004l) {
            interfaceC2166t1.O(i11);
            ((Z0) obj).g(interfaceC2166t1);
            interfaceC2166t1.J(i11);
        } else {
            interfaceC2166t1.J(i11);
            ((Z0) obj).g(interfaceC2166t1);
            interfaceC2166t1.O(i11);
        }
    }

    public static Z0 h() {
        return f23968f;
    }

    static Z0 i() {
        return new Z0();
    }

    final void b(InterfaceC2166t1 interfaceC2166t1) {
        if (interfaceC2166t1.B() == AbstractC2109a0.c.f24005m) {
            for (int i10 = this.f23969a - 1; i10 >= 0; i10--) {
                interfaceC2166t1.p(this.f23970b[i10] >>> 3, this.f23971c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f23969a; i11++) {
            interfaceC2166t1.p(this.f23970b[i11] >>> 3, this.f23971c[i11]);
        }
    }

    final void c(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f23969a; i11++) {
            E0.c(sb2, i10, String.valueOf(this.f23970b[i11] >>> 3), this.f23971c[i11]);
        }
    }

    public final int d() {
        int X10;
        int i10 = this.f23972d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f23969a; i12++) {
            int i13 = this.f23970b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                X10 = K.X(i14, ((Long) this.f23971c[i12]).longValue());
            } else if (i15 == 1) {
                X10 = K.e0(i14, ((Long) this.f23971c[i12]).longValue());
            } else if (i15 == 2) {
                X10 = K.K(i14, (AbstractC2179y) this.f23971c[i12]);
            } else if (i15 == 3) {
                X10 = (K.v0(i14) << 1) + ((Z0) this.f23971c[i12]).d();
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException(C2127g0.c());
                }
                X10 = K.n0(i14, ((Integer) this.f23971c[i12]).intValue());
            }
            i11 += X10;
        }
        this.f23972d = i11;
        return i11;
    }

    final void e(int i10, Object obj) {
        if (!this.f23973e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f23969a;
        int[] iArr = this.f23970b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f23970b = Arrays.copyOf(iArr, i12);
            this.f23971c = Arrays.copyOf(this.f23971c, i12);
        }
        int[] iArr2 = this.f23970b;
        int i13 = this.f23969a;
        iArr2[i13] = i10;
        this.f23971c[i13] = obj;
        this.f23969a = i13 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Z0)) {
            return false;
        }
        Z0 z02 = (Z0) obj;
        int i10 = this.f23969a;
        if (i10 == z02.f23969a) {
            int[] iArr = this.f23970b;
            int[] iArr2 = z02.f23970b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f23971c;
                    Object[] objArr2 = z02.f23971c;
                    int i12 = this.f23969a;
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

    public final void g(InterfaceC2166t1 interfaceC2166t1) {
        if (this.f23969a == 0) {
            return;
        }
        if (interfaceC2166t1.B() == AbstractC2109a0.c.f24004l) {
            for (int i10 = 0; i10 < this.f23969a; i10++) {
                f(this.f23970b[i10], this.f23971c[i10], interfaceC2166t1);
            }
            return;
        }
        for (int i11 = this.f23969a - 1; i11 >= 0; i11--) {
            f(this.f23970b[i11], this.f23971c[i11], interfaceC2166t1);
        }
    }

    public final int hashCode() {
        int i10 = this.f23969a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f23970b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f23971c;
        int i16 = this.f23969a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int j() {
        int i10 = this.f23972d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f23969a; i12++) {
            i11 += K.U(this.f23970b[i12] >>> 3, (AbstractC2179y) this.f23971c[i12]);
        }
        this.f23972d = i11;
        return i11;
    }

    public final void k() {
        this.f23973e = false;
    }

    private Z0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f23972d = -1;
        this.f23969a = i10;
        this.f23970b = iArr;
        this.f23971c = objArr;
        this.f23973e = z10;
    }
}
