package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class M0 extends AbstractC2512t0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f24782b = Logger.getLogger(M0.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f24783c = J2.C();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24784d = 0;

    /* renamed from: a, reason: collision with root package name */
    N0 f24785a;

    /* synthetic */ M0(L0 l02) {
    }

    public static int A(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int B(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            j10 >>>= 14;
            i10 += 2;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static M0 a(byte[] bArr, int i10, int i11) {
        return new J0(bArr, 0, i11);
    }

    static int v(int i10, P1 p12, InterfaceC2460i2 interfaceC2460i2) {
        int b10 = ((AbstractC2488o0) p12).b(interfaceC2460i2);
        int A10 = A(i10 << 3);
        return A10 + A10 + b10;
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return A(i10);
        }
        return 10;
    }

    public static int x(P1 p12) {
        int x10 = p12.x();
        return A(x10) + x10;
    }

    static int y(P1 p12, InterfaceC2460i2 interfaceC2460i2) {
        int b10 = ((AbstractC2488o0) p12).b(interfaceC2460i2);
        return A(b10) + b10;
    }

    public static int z(String str) {
        int length;
        try {
            length = O2.e(str);
        } catch (N2 unused) {
            length = str.getBytes(AbstractC2489o1.f24885b).length;
        }
        return A(length) + length;
    }

    public final void b() {
        if (e() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void c(String str, N2 n22) {
        f24782b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) n22);
        byte[] bytes = str.getBytes(AbstractC2489o1.f24885b);
        try {
            int length = bytes.length;
            s(length);
            o(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new K0(e10);
        }
    }

    public abstract int e();

    public abstract void f(byte b10);

    public abstract void g(int i10, boolean z10);

    public abstract void h(int i10, E0 e02);

    public abstract void i(int i10, int i11);

    public abstract void j(int i10);

    public abstract void k(int i10, long j10);

    public abstract void l(long j10);

    public abstract void m(int i10, int i11);

    public abstract void n(int i10);

    public abstract void o(byte[] bArr, int i10, int i11);

    public abstract void p(int i10, String str);

    public abstract void q(int i10, int i11);

    public abstract void r(int i10, int i11);

    public abstract void s(int i10);

    public abstract void t(int i10, long j10);

    public abstract void u(long j10);
}
