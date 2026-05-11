package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: f, reason: collision with root package name */
    private static final n0 f16421f = new n0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f16422a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f16423b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f16424c;

    /* renamed from: d, reason: collision with root package name */
    private int f16425d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16426e;

    private n0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f16423b;
        if (i10 > iArr.length) {
            int i11 = this.f16422a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f16423b = Arrays.copyOf(iArr, i10);
            this.f16424c = Arrays.copyOf(this.f16424c, i10);
        }
    }

    public static n0 c() {
        return f16421f;
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

    static n0 j(n0 n0Var, n0 n0Var2) {
        int i10 = n0Var.f16422a + n0Var2.f16422a;
        int[] copyOf = Arrays.copyOf(n0Var.f16423b, i10);
        System.arraycopy(n0Var2.f16423b, 0, copyOf, n0Var.f16422a, n0Var2.f16422a);
        Object[] copyOf2 = Arrays.copyOf(n0Var.f16424c, i10);
        System.arraycopy(n0Var2.f16424c, 0, copyOf2, n0Var.f16422a, n0Var2.f16422a);
        return new n0(i10, copyOf, copyOf2, true);
    }

    static n0 k() {
        return new n0();
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

    private static void q(int i10, Object obj, s0 s0Var) {
        int a10 = r0.a(i10);
        int b10 = r0.b(i10);
        if (b10 == 0) {
            s0Var.n(a10, ((Long) obj).longValue());
            return;
        }
        if (b10 == 1) {
            s0Var.h(a10, ((Long) obj).longValue());
            return;
        }
        if (b10 == 2) {
            s0Var.L(a10, (AbstractC1540g) obj);
            return;
        }
        if (b10 != 3) {
            if (b10 != 5) {
                throw new RuntimeException(C1558z.e());
            }
            s0Var.d(a10, ((Integer) obj).intValue());
        } else if (s0Var.i() == s0.a.ASCENDING) {
            s0Var.q(a10);
            ((n0) obj).r(s0Var);
            s0Var.B(a10);
        } else {
            s0Var.B(a10);
            ((n0) obj).r(s0Var);
            s0Var.q(a10);
        }
    }

    void a() {
        if (!this.f16426e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int R10;
        int i10 = this.f16425d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f16422a; i12++) {
            int i13 = this.f16423b[i12];
            int a10 = r0.a(i13);
            int b10 = r0.b(i13);
            if (b10 == 0) {
                R10 = AbstractC1543j.R(a10, ((Long) this.f16424c[i12]).longValue());
            } else if (b10 == 1) {
                R10 = AbstractC1543j.n(a10, ((Long) this.f16424c[i12]).longValue());
            } else if (b10 == 2) {
                R10 = AbstractC1543j.f(a10, (AbstractC1540g) this.f16424c[i12]);
            } else if (b10 == 3) {
                R10 = (AbstractC1543j.O(a10) * 2) + ((n0) this.f16424c[i12]).d();
            } else {
                if (b10 != 5) {
                    throw new IllegalStateException(C1558z.e());
                }
                R10 = AbstractC1543j.l(a10, ((Integer) this.f16424c[i12]).intValue());
            }
            i11 += R10;
        }
        this.f16425d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f16425d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f16422a; i12++) {
            i11 += AbstractC1543j.D(r0.a(this.f16423b[i12]), (AbstractC1540g) this.f16424c[i12]);
        }
        this.f16425d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        int i10 = this.f16422a;
        return i10 == n0Var.f16422a && o(this.f16423b, n0Var.f16423b, i10) && l(this.f16424c, n0Var.f16424c, this.f16422a);
    }

    public void h() {
        if (this.f16426e) {
            this.f16426e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f16422a;
        return ((((527 + i10) * 31) + f(this.f16423b, i10)) * 31) + g(this.f16424c, this.f16422a);
    }

    n0 i(n0 n0Var) {
        if (n0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f16422a + n0Var.f16422a;
        b(i10);
        System.arraycopy(n0Var.f16423b, 0, this.f16423b, this.f16422a, n0Var.f16422a);
        System.arraycopy(n0Var.f16424c, 0, this.f16424c, this.f16422a, n0Var.f16422a);
        this.f16422a = i10;
        return this;
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f16422a; i11++) {
            S.d(sb2, i10, String.valueOf(r0.a(this.f16423b[i11])), this.f16424c[i11]);
        }
    }

    void n(int i10, Object obj) {
        a();
        b(this.f16422a + 1);
        int[] iArr = this.f16423b;
        int i11 = this.f16422a;
        iArr[i11] = i10;
        this.f16424c[i11] = obj;
        this.f16422a = i11 + 1;
    }

    void p(s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            for (int i10 = this.f16422a - 1; i10 >= 0; i10--) {
                s0Var.c(r0.a(this.f16423b[i10]), this.f16424c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f16422a; i11++) {
            s0Var.c(r0.a(this.f16423b[i11]), this.f16424c[i11]);
        }
    }

    public void r(s0 s0Var) {
        if (this.f16422a == 0) {
            return;
        }
        if (s0Var.i() == s0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f16422a; i10++) {
                q(this.f16423b[i10], this.f16424c[i10], s0Var);
            }
            return;
        }
        for (int i11 = this.f16422a - 1; i11 >= 0; i11--) {
            q(this.f16423b[i11], this.f16424c[i11], s0Var);
        }
    }

    private n0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f16425d = -1;
        this.f16422a = i10;
        this.f16423b = iArr;
        this.f16424c = objArr;
        this.f16426e = z10;
    }
}
