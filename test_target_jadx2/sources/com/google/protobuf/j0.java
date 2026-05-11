package com.google.protobuf;

import com.google.protobuf.p0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: f, reason: collision with root package name */
    private static final j0 f28759f = new j0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f28760a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f28761b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f28762c;

    /* renamed from: d, reason: collision with root package name */
    private int f28763d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f28764e;

    private j0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f28761b;
        if (i10 > iArr.length) {
            int i11 = this.f28760a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f28761b = Arrays.copyOf(iArr, i10);
            this.f28762c = Arrays.copyOf(this.f28762c, i10);
        }
    }

    public static j0 c() {
        return f28759f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    static j0 j(j0 j0Var, j0 j0Var2) {
        int i10 = j0Var.f28760a + j0Var2.f28760a;
        int[] copyOf = Arrays.copyOf(j0Var.f28761b, i10);
        System.arraycopy(j0Var2.f28761b, 0, copyOf, j0Var.f28760a, j0Var2.f28760a);
        Object[] copyOf2 = Arrays.copyOf(j0Var.f28762c, i10);
        System.arraycopy(j0Var2.f28762c, 0, copyOf2, j0Var.f28760a, j0Var2.f28760a);
        return new j0(i10, copyOf, copyOf2, true);
    }

    static j0 k() {
        return new j0();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i10, Object obj, p0 p0Var) {
        int a10 = o0.a(i10);
        int b10 = o0.b(i10);
        if (b10 == 0) {
            p0Var.n(a10, ((Long) obj).longValue());
            return;
        }
        if (b10 == 1) {
            p0Var.h(a10, ((Long) obj).longValue());
            return;
        }
        if (b10 == 2) {
            p0Var.N(a10, (AbstractC2877h) obj);
            return;
        }
        if (b10 != 3) {
            if (b10 != 5) {
                throw new RuntimeException(C2894z.d());
            }
            p0Var.d(a10, ((Integer) obj).intValue());
        } else if (p0Var.i() == p0.a.ASCENDING) {
            p0Var.q(a10);
            ((j0) obj).r(p0Var);
            p0Var.B(a10);
        } else {
            p0Var.B(a10);
            ((j0) obj).r(p0Var);
            p0Var.q(a10);
        }
    }

    void a() {
        if (!this.f28764e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int O10;
        int i10 = this.f28763d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f28760a; i12++) {
            int i13 = this.f28761b[i12];
            int a10 = o0.a(i13);
            int b10 = o0.b(i13);
            if (b10 == 0) {
                O10 = AbstractC2879j.O(a10, ((Long) this.f28762c[i12]).longValue());
            } else if (b10 == 1) {
                O10 = AbstractC2879j.n(a10, ((Long) this.f28762c[i12]).longValue());
            } else if (b10 == 2) {
                O10 = AbstractC2879j.f(a10, (AbstractC2877h) this.f28762c[i12]);
            } else if (b10 == 3) {
                O10 = (AbstractC2879j.L(a10) * 2) + ((j0) this.f28762c[i12]).d();
            } else {
                if (b10 != 5) {
                    throw new IllegalStateException(C2894z.d());
                }
                O10 = AbstractC2879j.l(a10, ((Integer) this.f28762c[i12]).intValue());
            }
            i11 += O10;
        }
        this.f28763d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f28763d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f28760a; i12++) {
            i11 += AbstractC2879j.A(o0.a(this.f28761b[i12]), (AbstractC2877h) this.f28762c[i12]);
        }
        this.f28763d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        int i10 = this.f28760a;
        return i10 == j0Var.f28760a && o(this.f28761b, j0Var.f28761b, i10) && l(this.f28762c, j0Var.f28762c, this.f28760a);
    }

    public void h() {
        this.f28764e = false;
    }

    public int hashCode() {
        int i10 = this.f28760a;
        return ((((527 + i10) * 31) + f(this.f28761b, i10)) * 31) + g(this.f28762c, this.f28760a);
    }

    j0 i(j0 j0Var) {
        if (j0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f28760a + j0Var.f28760a;
        b(i10);
        System.arraycopy(j0Var.f28761b, 0, this.f28761b, this.f28760a, j0Var.f28760a);
        System.arraycopy(j0Var.f28762c, 0, this.f28762c, this.f28760a, j0Var.f28760a);
        this.f28760a = i10;
        return this;
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f28760a; i11++) {
            P.d(sb2, i10, String.valueOf(o0.a(this.f28761b[i11])), this.f28762c[i11]);
        }
    }

    void n(int i10, Object obj) {
        a();
        b(this.f28760a + 1);
        int[] iArr = this.f28761b;
        int i11 = this.f28760a;
        iArr[i11] = i10;
        this.f28762c[i11] = obj;
        this.f28760a = i11 + 1;
    }

    void p(p0 p0Var) {
        if (p0Var.i() == p0.a.DESCENDING) {
            for (int i10 = this.f28760a - 1; i10 >= 0; i10--) {
                p0Var.c(o0.a(this.f28761b[i10]), this.f28762c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f28760a; i11++) {
            p0Var.c(o0.a(this.f28761b[i11]), this.f28762c[i11]);
        }
    }

    public void r(p0 p0Var) {
        if (this.f28760a == 0) {
            return;
        }
        if (p0Var.i() == p0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f28760a; i10++) {
                q(this.f28761b[i10], this.f28762c[i10], p0Var);
            }
            return;
        }
        for (int i11 = this.f28760a - 1; i11 >= 0; i11--) {
            q(this.f28761b[i11], this.f28762c[i11], p0Var);
        }
    }

    private j0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f28763d = -1;
        this.f28760a = i10;
        this.f28761b = iArr;
        this.f28762c = objArr;
        this.f28764e = z10;
    }
}
