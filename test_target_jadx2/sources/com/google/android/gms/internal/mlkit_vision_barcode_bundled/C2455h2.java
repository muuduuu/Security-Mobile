package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2455h2 extends E0 {

    /* renamed from: j, reason: collision with root package name */
    static final int[] f24869j = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: e, reason: collision with root package name */
    private final int f24870e;

    /* renamed from: f, reason: collision with root package name */
    private final E0 f24871f;

    /* renamed from: g, reason: collision with root package name */
    private final E0 f24872g;

    /* renamed from: h, reason: collision with root package name */
    private final int f24873h;

    /* renamed from: i, reason: collision with root package name */
    private final int f24874i;

    private static E0 R(E0 e02, E0 e03) {
        int j10 = e02.j();
        int j11 = e03.j();
        byte[] bArr = new byte[j10 + j11];
        e02.O(bArr, 0, 0, j10);
        e03.O(bArr, 0, j10, j11);
        return new A0(bArr);
    }

    static int S(int i10) {
        int[] iArr = f24869j;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    static E0 V(E0 e02, E0 e03) {
        if (e03.j() == 0) {
            return e02;
        }
        if (e02.j() == 0) {
            return e03;
        }
        int j10 = e02.j() + e03.j();
        if (j10 < 128) {
            return R(e02, e03);
        }
        if (e02 instanceof C2455h2) {
            C2455h2 c2455h2 = (C2455h2) e02;
            if (c2455h2.f24872g.j() + e03.j() < 128) {
                return new C2455h2(c2455h2.f24871f, R(c2455h2.f24872g, e03));
            }
            if (c2455h2.f24871f.m() > c2455h2.f24872g.m() && c2455h2.f24874i > e03.m()) {
                return new C2455h2(c2455h2.f24871f, new C2455h2(c2455h2.f24872g, e03));
            }
        }
        return j10 >= S(Math.max(e02.m(), e03.m()) + 1) ? new C2455h2(e02, e03) : C2435d2.a(new C2435d2(null), e02, e03);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    final void A(AbstractC2512t0 abstractC2512t0) {
        this.f24871f.A(abstractC2512t0);
        this.f24872g.A(abstractC2512t0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final boolean B() {
        int u10 = this.f24871f.u(0, 0, this.f24873h);
        E0 e02 = this.f24872g;
        return e02.u(u10, 0, e02.j()) == 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    /* renamed from: F */
    public final InterfaceC2537y0 iterator() {
        return new C2425b2(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final byte c(int i10) {
        E0.M(i10, this.f24870e);
        return e(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    final byte e(int i10) {
        int i11 = this.f24873h;
        return i10 < i11 ? this.f24871f.e(i10) : this.f24872g.e(i10 - i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (this.f24870e != e02.j()) {
            return false;
        }
        if (this.f24870e == 0) {
            return true;
        }
        int E10 = E();
        int E11 = e02.E();
        if (E10 != 0 && E11 != 0 && E10 != E11) {
            return false;
        }
        AbstractC2440e2 abstractC2440e2 = null;
        C2445f2 c2445f2 = new C2445f2(this, abstractC2440e2);
        AbstractC2542z0 next = c2445f2.next();
        C2445f2 c2445f22 = new C2445f2(e02, abstractC2440e2);
        AbstractC2542z0 next2 = c2445f22.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int j10 = next.j() - i10;
            int j11 = next2.j() - i11;
            int min = Math.min(j10, j11);
            if (!(i10 == 0 ? next.R(next2, i11, min) : next2.R(next, i10, min))) {
                return false;
            }
            i12 += min;
            int i13 = this.f24870e;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == j10) {
                next = c2445f2.next();
                i10 = 0;
            } else {
                i10 += min;
                next = next;
            }
            if (min == j11) {
                next2 = c2445f22.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C2425b2(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final int j() {
        return this.f24870e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    protected final void k(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f24873h;
        if (i13 <= i14) {
            this.f24871f.k(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f24872g.k(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f24871f.k(bArr, i10, i11, i15);
            this.f24872g.k(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    protected final int m() {
        return this.f24874i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    protected final boolean r() {
        return this.f24870e >= S(this.f24874i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    protected final int t(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f24873h;
        if (i13 <= i14) {
            return this.f24871f.t(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f24872g.t(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f24872g.t(this.f24871f.t(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    protected final int u(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f24873h;
        if (i13 <= i14) {
            return this.f24871f.u(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f24872g.u(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f24872g.u(this.f24871f.u(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final E0 v(int i10, int i11) {
        int D10 = E0.D(i10, i11, this.f24870e);
        if (D10 == 0) {
            return E0.f24749b;
        }
        if (D10 == this.f24870e) {
            return this;
        }
        int i12 = this.f24873h;
        if (i11 <= i12) {
            return this.f24871f.v(i10, i11);
        }
        if (i10 >= i12) {
            return this.f24872g.v(i10 - i12, i11 - i12);
        }
        E0 e02 = this.f24871f;
        return new C2455h2(e02.v(i10, e02.j()), this.f24872g.v(0, i11 - this.f24873h));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    protected final String w(Charset charset) {
        return new String(P(), charset);
    }

    private C2455h2(E0 e02, E0 e03) {
        this.f24871f = e02;
        this.f24872g = e03;
        int j10 = e02.j();
        this.f24873h = j10;
        this.f24870e = j10 + e03.j();
        this.f24874i = Math.max(e02.m(), e03.m()) + 1;
    }
}
