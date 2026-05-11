package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class O4 extends A4 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f24317b = Logger.getLogger(O4.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f24318c = AbstractC2282k6.f();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24319d = 0;

    /* renamed from: a, reason: collision with root package name */
    P4 f24320a;

    /* synthetic */ O4(byte[] bArr) {
    }

    public static int E(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int a(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int b(String str) {
        int length;
        try {
            length = AbstractC2309n6.b(str);
        } catch (C2300m6 unused) {
            length = str.getBytes(AbstractC2308n5.f24581a).length;
        }
        return E(length) + length;
    }

    public static int c(H5 h52) {
        int a10 = h52.a();
        return E(a10) + a10;
    }

    static int d(H5 h52, S5 s52) {
        int e10 = ((AbstractC2369u4) h52).e(s52);
        return E(e10) + e10;
    }

    static int g(int i10, H5 h52, S5 s52) {
        int E10 = E(i10 << 3);
        return E10 + E10 + ((AbstractC2369u4) h52).e(s52);
    }

    public abstract void A(long j10);

    public abstract void B(byte[] bArr, int i10, int i11);

    public abstract void C(String str);

    public abstract int D();

    public final void e() {
        if (D() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void f(String str, C2300m6 c2300m6) {
        f24317b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c2300m6);
        byte[] bytes = str.getBytes(AbstractC2308n5.f24581a);
        try {
            int length = bytes.length;
            x(length);
            B(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new N4(e10);
        }
    }

    public abstract void i(int i10, int i11);

    public abstract void j(int i10, int i11);

    public abstract void k(int i10, int i11);

    public abstract void l(int i10, int i11);

    public abstract void m(int i10, long j10);

    public abstract void n(int i10, long j10);

    public abstract void o(int i10, boolean z10);

    public abstract void p(int i10, String str);

    public abstract void q(int i10, J4 j42);

    public abstract void r(J4 j42);

    abstract void s(byte[] bArr, int i10, int i11);

    abstract void t(int i10, H5 h52, S5 s52);

    public abstract void u(H5 h52);

    public abstract void v(byte b10);

    public abstract void w(int i10);

    public abstract void x(int i10);

    public abstract void y(int i10);

    public abstract void z(long j10);
}
