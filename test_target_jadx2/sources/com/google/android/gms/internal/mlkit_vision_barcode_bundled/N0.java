package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* loaded from: classes2.dex */
final class N0 implements R2 {

    /* renamed from: a, reason: collision with root package name */
    private final M0 f24786a;

    private N0(M0 m02) {
        byte[] bArr = AbstractC2489o1.f24887d;
        this.f24786a = m02;
        m02.f24785a = this;
    }

    public static N0 L(M0 m02) {
        N0 n02 = m02.f24785a;
        return n02 != null ? n02 : new N0(m02);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void A(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24786a.t(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += M0.B(((Long) list.get(i13)).longValue());
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            this.f24786a.u(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void B(int i10, Object obj) {
        if (obj instanceof E0) {
            J0 j02 = (J0) this.f24786a;
            j02.s(11);
            j02.r(2, i10);
            j02.h(3, (E0) obj);
            j02.s(12);
            return;
        }
        M0 m02 = this.f24786a;
        P1 p12 = (P1) obj;
        J0 j03 = (J0) m02;
        j03.s(11);
        j03.r(2, i10);
        j03.s(26);
        j03.s(p12.x());
        p12.a(m02);
        j03.s(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void C(int i10, int i11) {
        this.f24786a.i(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void D(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24786a.i(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            i12 += 4;
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            this.f24786a.j(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void E(int i10, int i11) {
        this.f24786a.r(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void F(int i10, long j10) {
        this.f24786a.k(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void G(int i10, Object obj, InterfaceC2460i2 interfaceC2460i2) {
        P1 p12 = (P1) obj;
        J0 j02 = (J0) this.f24786a;
        j02.s((i10 << 3) | 2);
        j02.s(((AbstractC2488o0) p12).b(interfaceC2460i2));
        interfaceC2460i2.h(p12, j02.f24785a);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void H(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC2533x1)) {
            while (i11 < list.size()) {
                this.f24786a.p(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC2533x1 interfaceC2533x1 = (InterfaceC2533x1) list;
        while (i11 < list.size()) {
            Object z10 = interfaceC2533x1.z(i11);
            if (z10 instanceof String) {
                this.f24786a.p(i10, (String) z10);
            } else {
                this.f24786a.h(i10, (E0) z10);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void I(int i10, long j10) {
        this.f24786a.t(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void J(int i10) {
        this.f24786a.q(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void K(int i10) {
        this.f24786a.q(i10, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void a(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f24786a.h(i10, (E0) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void b(int i10, String str) {
        this.f24786a.p(i10, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24786a.g(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            this.f24786a.f(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void d(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24786a.i(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            this.f24786a.j(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void e(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24786a.m(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += M0.w(((Integer) list.get(i13)).intValue());
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            this.f24786a.n(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24786a.k(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            this.f24786a.l(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24786a.k(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            this.f24786a.l(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void h(int i10, E0 e02) {
        this.f24786a.h(i10, e02);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void i(int i10, int i11) {
        this.f24786a.r(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void j(int i10, long j10) {
        this.f24786a.t(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void k(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24786a.m(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += M0.w(((Integer) list.get(i13)).intValue());
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            this.f24786a.n(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24786a.i(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            this.f24786a.j(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void m(int i10, int i11) {
        this.f24786a.i(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void n(int i10, boolean z10) {
        this.f24786a.g(i10, z10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void o(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24786a.r(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += M0.A(((Integer) list.get(i13)).intValue());
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            this.f24786a.s(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void p(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24786a.k(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            this.f24786a.l(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void q(int i10, int i11) {
        this.f24786a.m(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                M0 m02 = this.f24786a;
                int intValue = ((Integer) list.get(i11)).intValue();
                m02.r(i10, (intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = ((Integer) list.get(i13)).intValue();
            i12 += M0.A((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            M0 m03 = this.f24786a;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            m03.s((intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void s(int i10, double d10) {
        this.f24786a.k(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24786a.t(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += M0.B(((Long) list.get(i13)).longValue());
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            this.f24786a.u(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void u(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                M0 m02 = this.f24786a;
                long longValue = ((Long) list.get(i11)).longValue();
                m02.t(i10, (longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return;
        }
        this.f24786a.q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += M0.B((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.f24786a.s(i12);
        while (i11 < list.size()) {
            M0 m03 = this.f24786a;
            long longValue3 = ((Long) list.get(i11)).longValue();
            m03.u((longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void v(int i10, long j10) {
        this.f24786a.k(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void w(int i10, Object obj, InterfaceC2460i2 interfaceC2460i2) {
        M0 m02 = this.f24786a;
        m02.q(i10, 3);
        interfaceC2460i2.h((P1) obj, m02.f24785a);
        m02.q(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void x(int i10, int i11) {
        this.f24786a.m(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void y(int i10, long j10) {
        this.f24786a.t(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R2
    public final void z(int i10, float f10) {
        this.f24786a.i(i10, Float.floatToRawIntBits(f10));
    }
}
