package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class M1 extends AbstractC2175w1 implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public long f23867b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f23868c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f23869d = 0;

    /* renamed from: e, reason: collision with root package name */
    private String f23870e = BuildConfig.FLAVOR;

    /* renamed from: f, reason: collision with root package name */
    public int f23871f = 0;

    /* renamed from: g, reason: collision with root package name */
    private String f23872g = BuildConfig.FLAVOR;

    /* renamed from: h, reason: collision with root package name */
    private int f23873h = 0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f23874i = false;

    /* renamed from: j, reason: collision with root package name */
    private N1[] f23875j = N1.l();

    /* renamed from: k, reason: collision with root package name */
    private byte[] f23876k;

    /* renamed from: l, reason: collision with root package name */
    private C1 f23877l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f23878m;

    /* renamed from: n, reason: collision with root package name */
    private String f23879n;

    /* renamed from: o, reason: collision with root package name */
    private String f23880o;

    /* renamed from: p, reason: collision with root package name */
    private String f23881p;

    /* renamed from: q, reason: collision with root package name */
    public long f23882q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f23883r;

    /* renamed from: s, reason: collision with root package name */
    private String f23884s;

    /* renamed from: t, reason: collision with root package name */
    private int f23885t;

    /* renamed from: u, reason: collision with root package name */
    private int[] f23886u;

    /* renamed from: v, reason: collision with root package name */
    private long f23887v;

    /* renamed from: w, reason: collision with root package name */
    private D1 f23888w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f23889x;

    public M1() {
        byte[] bArr = B1.f23802h;
        this.f23876k = bArr;
        this.f23877l = null;
        this.f23878m = bArr;
        this.f23879n = BuildConfig.FLAVOR;
        this.f23880o = BuildConfig.FLAVOR;
        this.f23881p = BuildConfig.FLAVOR;
        this.f23882q = 180000L;
        this.f23883r = bArr;
        this.f23884s = BuildConfig.FLAVOR;
        this.f23885t = 0;
        this.f23886u = B1.f23795a;
        this.f23887v = 0L;
        this.f23888w = null;
        this.f23889x = false;
        this.f24113a = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final M1 clone() {
        try {
            M1 m12 = (M1) super.k();
            N1[] n1Arr = this.f23875j;
            if (n1Arr != null && n1Arr.length > 0) {
                m12.f23875j = new N1[n1Arr.length];
                int i10 = 0;
                while (true) {
                    N1[] n1Arr2 = this.f23875j;
                    if (i10 >= n1Arr2.length) {
                        break;
                    }
                    N1 n12 = n1Arr2[i10];
                    i10++;
                }
            }
            C1 c12 = this.f23877l;
            if (c12 != null) {
                m12.f23877l = c12;
            }
            int[] iArr = this.f23886u;
            if (iArr != null && iArr.length > 0) {
                m12.f23886u = (int[]) iArr.clone();
            }
            D1 d12 = this.f23888w;
            if (d12 != null) {
                m12.f23888w = d12;
            }
            return m12;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2175w1, com.google.android.gms.internal.clearcut.AbstractC2181y1
    public final void a(C2169u1 c2169u1) {
        long j10 = this.f23867b;
        if (j10 != 0) {
            c2169u1.r(1, j10);
        }
        String str = this.f23870e;
        if (str != null && !str.equals(BuildConfig.FLAVOR)) {
            c2169u1.b(2, this.f23870e);
        }
        N1[] n1Arr = this.f23875j;
        int i10 = 0;
        if (n1Arr != null && n1Arr.length > 0) {
            int i11 = 0;
            while (true) {
                N1[] n1Arr2 = this.f23875j;
                if (i11 >= n1Arr2.length) {
                    break;
                }
                N1 n12 = n1Arr2[i11];
                i11++;
            }
        }
        byte[] bArr = this.f23876k;
        byte[] bArr2 = B1.f23802h;
        if (!Arrays.equals(bArr, bArr2)) {
            c2169u1.c(4, this.f23876k);
        }
        if (!Arrays.equals(this.f23878m, bArr2)) {
            c2169u1.c(6, this.f23878m);
        }
        String str2 = this.f23879n;
        if (str2 != null && !str2.equals(BuildConfig.FLAVOR)) {
            c2169u1.b(8, this.f23879n);
        }
        C1 c12 = this.f23877l;
        if (c12 != null) {
            c2169u1.m(9, c12);
        }
        int i12 = this.f23871f;
        if (i12 != 0) {
            c2169u1.j(11, i12);
        }
        String str3 = this.f23880o;
        if (str3 != null && !str3.equals(BuildConfig.FLAVOR)) {
            c2169u1.b(13, this.f23880o);
        }
        String str4 = this.f23881p;
        if (str4 != null && !str4.equals(BuildConfig.FLAVOR)) {
            c2169u1.b(14, this.f23881p);
        }
        long j11 = this.f23882q;
        if (j11 != 180000) {
            c2169u1.h(15, 0);
            c2169u1.t(C2169u1.s(j11));
        }
        long j12 = this.f23868c;
        if (j12 != 0) {
            c2169u1.r(17, j12);
        }
        if (!Arrays.equals(this.f23883r, bArr2)) {
            c2169u1.c(18, this.f23883r);
        }
        int[] iArr = this.f23886u;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f23886u;
                if (i10 >= iArr2.length) {
                    break;
                }
                c2169u1.j(20, iArr2[i10]);
                i10++;
            }
        }
        D1 d12 = this.f23888w;
        if (d12 != null) {
            c2169u1.m(23, d12);
        }
        String str5 = this.f23884s;
        if (str5 != null && !str5.equals(BuildConfig.FLAVOR)) {
            c2169u1.b(24, this.f23884s);
        }
        boolean z10 = this.f23889x;
        if (z10) {
            c2169u1.i(25, z10);
        }
        String str6 = this.f23872g;
        if (str6 != null && !str6.equals(BuildConfig.FLAVOR)) {
            c2169u1.b(26, this.f23872g);
        }
        super.a(c2169u1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M1)) {
            return false;
        }
        M1 m12 = (M1) obj;
        if (this.f23867b != m12.f23867b || this.f23868c != m12.f23868c) {
            return false;
        }
        String str = this.f23870e;
        if (str == null) {
            if (m12.f23870e != null) {
                return false;
            }
        } else if (!str.equals(m12.f23870e)) {
            return false;
        }
        if (this.f23871f != m12.f23871f) {
            return false;
        }
        String str2 = this.f23872g;
        if (str2 == null) {
            if (m12.f23872g != null) {
                return false;
            }
        } else if (!str2.equals(m12.f23872g)) {
            return false;
        }
        if (!AbstractC2178x1.b(this.f23875j, m12.f23875j) || !Arrays.equals(this.f23876k, m12.f23876k)) {
            return false;
        }
        C1 c12 = this.f23877l;
        if (c12 == null) {
            if (m12.f23877l != null) {
                return false;
            }
        } else if (!c12.equals(m12.f23877l)) {
            return false;
        }
        if (!Arrays.equals(this.f23878m, m12.f23878m)) {
            return false;
        }
        String str3 = this.f23879n;
        if (str3 == null) {
            if (m12.f23879n != null) {
                return false;
            }
        } else if (!str3.equals(m12.f23879n)) {
            return false;
        }
        String str4 = this.f23880o;
        if (str4 == null) {
            if (m12.f23880o != null) {
                return false;
            }
        } else if (!str4.equals(m12.f23880o)) {
            return false;
        }
        String str5 = this.f23881p;
        if (str5 == null) {
            if (m12.f23881p != null) {
                return false;
            }
        } else if (!str5.equals(m12.f23881p)) {
            return false;
        }
        if (this.f23882q != m12.f23882q || !Arrays.equals(this.f23883r, m12.f23883r)) {
            return false;
        }
        String str6 = this.f23884s;
        if (str6 == null) {
            if (m12.f23884s != null) {
                return false;
            }
        } else if (!str6.equals(m12.f23884s)) {
            return false;
        }
        if (!AbstractC2178x1.a(this.f23886u, m12.f23886u)) {
            return false;
        }
        D1 d12 = this.f23888w;
        if (d12 == null) {
            if (m12.f23888w != null) {
                return false;
            }
        } else if (!d12.equals(m12.f23888w)) {
            return false;
        }
        return this.f23889x == m12.f23889x;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2175w1, com.google.android.gms.internal.clearcut.AbstractC2181y1
    protected final int h() {
        int[] iArr;
        int h10 = super.h();
        long j10 = this.f23867b;
        if (j10 != 0) {
            h10 += C2169u1.k(1, j10);
        }
        String str = this.f23870e;
        if (str != null && !str.equals(BuildConfig.FLAVOR)) {
            h10 += C2169u1.f(2, this.f23870e);
        }
        N1[] n1Arr = this.f23875j;
        int i10 = 0;
        if (n1Arr != null && n1Arr.length > 0) {
            int i11 = 0;
            while (true) {
                N1[] n1Arr2 = this.f23875j;
                if (i11 >= n1Arr2.length) {
                    break;
                }
                N1 n12 = n1Arr2[i11];
                i11++;
            }
        }
        byte[] bArr = this.f23876k;
        byte[] bArr2 = B1.f23802h;
        if (!Arrays.equals(bArr, bArr2)) {
            h10 += C2169u1.g(4, this.f23876k);
        }
        if (!Arrays.equals(this.f23878m, bArr2)) {
            h10 += C2169u1.g(6, this.f23878m);
        }
        String str2 = this.f23879n;
        if (str2 != null && !str2.equals(BuildConfig.FLAVOR)) {
            h10 += C2169u1.f(8, this.f23879n);
        }
        C1 c12 = this.f23877l;
        if (c12 != null) {
            h10 += K.L(9, c12);
        }
        int i12 = this.f23871f;
        if (i12 != 0) {
            h10 += C2169u1.v(11) + C2169u1.w(i12);
        }
        String str3 = this.f23880o;
        if (str3 != null && !str3.equals(BuildConfig.FLAVOR)) {
            h10 += C2169u1.f(13, this.f23880o);
        }
        String str4 = this.f23881p;
        if (str4 != null && !str4.equals(BuildConfig.FLAVOR)) {
            h10 += C2169u1.f(14, this.f23881p);
        }
        long j11 = this.f23882q;
        if (j11 != 180000) {
            h10 += C2169u1.v(15) + C2169u1.u(C2169u1.s(j11));
        }
        long j12 = this.f23868c;
        if (j12 != 0) {
            h10 += C2169u1.k(17, j12);
        }
        if (!Arrays.equals(this.f23883r, bArr2)) {
            h10 += C2169u1.g(18, this.f23883r);
        }
        int[] iArr2 = this.f23886u;
        if (iArr2 != null && iArr2.length > 0) {
            int i13 = 0;
            while (true) {
                iArr = this.f23886u;
                if (i10 >= iArr.length) {
                    break;
                }
                i13 += C2169u1.w(iArr[i10]);
                i10++;
            }
            h10 = h10 + i13 + (iArr.length * 2);
        }
        D1 d12 = this.f23888w;
        if (d12 != null) {
            h10 += K.L(23, d12);
        }
        String str5 = this.f23884s;
        if (str5 != null && !str5.equals(BuildConfig.FLAVOR)) {
            h10 += C2169u1.f(24, this.f23884s);
        }
        if (this.f23889x) {
            h10 += C2169u1.v(25) + 1;
        }
        String str6 = this.f23872g;
        return (str6 == null || str6.equals(BuildConfig.FLAVOR)) ? h10 : h10 + C2169u1.f(26, this.f23872g);
    }

    public final int hashCode() {
        int hashCode = (M1.class.getName().hashCode() + 527) * 31;
        long j10 = this.f23867b;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f23868c;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 961;
        String str = this.f23870e;
        int hashCode2 = (((i11 + (str == null ? 0 : str.hashCode())) * 31) + this.f23871f) * 31;
        String str2 = this.f23872g;
        int hashCode3 = ((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 961) + 1237) * 31) + AbstractC2178x1.d(this.f23875j)) * 31) + Arrays.hashCode(this.f23876k);
        C1 c12 = this.f23877l;
        int hashCode4 = ((((hashCode3 * 31) + (c12 == null ? 0 : c12.hashCode())) * 31) + Arrays.hashCode(this.f23878m)) * 31;
        String str3 = this.f23879n;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23880o;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 961;
        String str5 = this.f23881p;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        long j12 = this.f23882q;
        int hashCode8 = (((hashCode7 + ((int) (j12 ^ (j12 >>> 32)))) * 961) + Arrays.hashCode(this.f23883r)) * 31;
        String str6 = this.f23884s;
        int hashCode9 = ((hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 961) + AbstractC2178x1.c(this.f23886u);
        D1 d12 = this.f23888w;
        return ((((hashCode9 * 961) + (d12 != null ? d12.hashCode() : 0)) * 31) + (this.f23889x ? 1231 : 1237)) * 31;
    }
}
