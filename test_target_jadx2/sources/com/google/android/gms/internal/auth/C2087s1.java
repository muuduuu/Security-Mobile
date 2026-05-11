package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.auth.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2087s1 {

    /* renamed from: e, reason: collision with root package name */
    private static final C2087s1 f23769e = new C2087s1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f23770a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f23771b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f23772c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23773d;

    private C2087s1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f23770a = i10;
        this.f23771b = iArr;
        this.f23772c = objArr;
        this.f23773d = z10;
    }

    public static C2087s1 a() {
        return f23769e;
    }

    static C2087s1 c(C2087s1 c2087s1, C2087s1 c2087s12) {
        int i10 = c2087s1.f23770a + c2087s12.f23770a;
        int[] copyOf = Arrays.copyOf(c2087s1.f23771b, i10);
        System.arraycopy(c2087s12.f23771b, 0, copyOf, c2087s1.f23770a, c2087s12.f23770a);
        Object[] copyOf2 = Arrays.copyOf(c2087s1.f23772c, i10);
        System.arraycopy(c2087s12.f23772c, 0, copyOf2, c2087s1.f23770a, c2087s12.f23770a);
        return new C2087s1(i10, copyOf, copyOf2, true);
    }

    static C2087s1 d() {
        return new C2087s1(0, new int[8], new Object[8], true);
    }

    private final void i(int i10) {
        int[] iArr = this.f23771b;
        if (i10 > iArr.length) {
            int i11 = this.f23770a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f23771b = Arrays.copyOf(iArr, i10);
            this.f23772c = Arrays.copyOf(this.f23772c, i10);
        }
    }

    final C2087s1 b(C2087s1 c2087s1) {
        if (c2087s1.equals(f23769e)) {
            return this;
        }
        e();
        int i10 = this.f23770a + c2087s1.f23770a;
        i(i10);
        System.arraycopy(c2087s1.f23771b, 0, this.f23771b, this.f23770a, c2087s1.f23770a);
        System.arraycopy(c2087s1.f23772c, 0, this.f23772c, this.f23770a, c2087s1.f23770a);
        this.f23770a = i10;
        return this;
    }

    final void e() {
        if (!this.f23773d) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2087s1)) {
            return false;
        }
        C2087s1 c2087s1 = (C2087s1) obj;
        int i10 = this.f23770a;
        if (i10 == c2087s1.f23770a) {
            int[] iArr = this.f23771b;
            int[] iArr2 = c2087s1.f23771b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f23772c;
                    Object[] objArr2 = c2087s1.f23772c;
                    int i12 = this.f23770a;
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

    public final void f() {
        if (this.f23773d) {
            this.f23773d = false;
        }
    }

    final void g(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f23770a; i11++) {
            AbstractC2037b1.b(sb2, i10, String.valueOf(this.f23771b[i11] >>> 3), this.f23772c[i11]);
        }
    }

    final void h(int i10, Object obj) {
        e();
        i(this.f23770a + 1);
        int[] iArr = this.f23771b;
        int i11 = this.f23770a;
        iArr[i11] = i10;
        this.f23772c[i11] = obj;
        this.f23770a = i11 + 1;
    }

    public final int hashCode() {
        int i10 = this.f23770a;
        int i11 = i10 + 527;
        int[] iArr = this.f23771b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 * 31) + i13;
        Object[] objArr = this.f23772c;
        int i16 = this.f23770a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return (i15 * 31) + i12;
    }
}
