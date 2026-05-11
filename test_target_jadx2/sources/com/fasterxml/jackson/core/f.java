package com.fasterxml.jackson.core;

import B5.b;
import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public abstract class f implements Closeable, Flushable {

    /* renamed from: b, reason: collision with root package name */
    protected static final C5.h f23139b;

    /* renamed from: c, reason: collision with root package name */
    protected static final C5.h f23140c;

    /* renamed from: d, reason: collision with root package name */
    protected static final C5.h f23141d;

    /* renamed from: a, reason: collision with root package name */
    protected m f23142a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23143a;

        static {
            int[] iArr = new int[b.a.values().length];
            f23143a = iArr;
            try {
                iArr[b.a.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23143a[b.a.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23143a[b.a.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23143a[b.a.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23143a[b.a.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        b(boolean z10) {
            this._defaultState = z10;
        }

        public static int collectDefaults() {
            int i10 = 0;
            for (b bVar : values()) {
                if (bVar.enabledByDefault()) {
                    i10 |= bVar.getMask();
                }
            }
            return i10;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i10) {
            return (i10 & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    static {
        C5.h a10 = C5.h.a(o.values());
        f23139b = a10;
        f23140c = a10.b(o.CAN_WRITE_FORMATTED_NUMBERS);
        f23141d = a10.b(o.CAN_WRITE_BINARY_NATIVELY);
    }

    protected f() {
    }

    public abstract void A0(float f10);

    public abstract void A1(String str);

    public abstract void C(com.fasterxml.jackson.core.a aVar, byte[] bArr, int i10, int i11);

    public void F(byte[] bArr) {
        C(com.fasterxml.jackson.core.b.a(), bArr, 0, bArr.length);
    }

    public void H(byte[] bArr, int i10, int i11) {
        C(com.fasterxml.jackson.core.b.a(), bArr, i10, i11);
    }

    public abstract void I(boolean z10);

    public abstract void K();

    public abstract void M1();

    public abstract void N();

    public abstract void N1(Object obj);

    public abstract void O0(int i10);

    public abstract void O1(Object obj, int i10);

    public void Q(long j10) {
        o0(Long.toString(j10));
    }

    public abstract void U1();

    public abstract void Z0(long j10);

    protected void a(String str) {
        throw new e(str, this);
    }

    public abstract void a1(String str);

    protected final void b() {
        C5.l.a();
    }

    protected final void c(int i10, int i11, int i12) {
        if (i11 < 0 || i11 + i12 > i10) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public boolean d() {
        return true;
    }

    public boolean e() {
        return false;
    }

    public abstract void e2(Object obj);

    public boolean f() {
        return false;
    }

    public void f2(Object obj, int i10) {
        U1();
        q(obj);
    }

    public boolean g() {
        return false;
    }

    public abstract void g1(BigDecimal bigDecimal);

    public abstract void g2(n nVar);

    public abstract void h2(String str);

    public abstract f i(b bVar);

    public abstract void i0(n nVar);

    public abstract void i1(BigInteger bigInteger);

    public abstract void i2(char[] cArr, int i10, int i11);

    public abstract j j();

    public void j2(String str, String str2) {
        o0(str);
        h2(str2);
    }

    public void k2(Object obj) {
        throw new e("No native support for writing Type Ids", this);
    }

    public m l() {
        return this.f23142a;
    }

    public abstract void l1(short s10);

    public B5.b l2(B5.b bVar) {
        Object obj = bVar.f443c;
        k kVar = bVar.f446f;
        if (g()) {
            bVar.f447g = false;
            k2(obj);
        } else {
            String valueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            bVar.f447g = true;
            b.a aVar = bVar.f445e;
            if (kVar != k.START_OBJECT && aVar.requiresObjectContext()) {
                aVar = b.a.WRAPPER_ARRAY;
                bVar.f445e = aVar;
            }
            int i10 = a.f23143a[aVar.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    e2(bVar.f441a);
                    j2(bVar.f444d, valueOf);
                    return bVar;
                }
                if (i10 != 4) {
                    M1();
                    h2(valueOf);
                } else {
                    U1();
                    o0(valueOf);
                }
            }
        }
        if (kVar == k.START_OBJECT) {
            e2(bVar.f441a);
        } else if (kVar == k.START_ARRAY) {
            M1();
        }
        return bVar;
    }

    public void m1(Object obj) {
        throw new e("No native support for writing Object Ids", this);
    }

    public B5.b m2(B5.b bVar) {
        k kVar = bVar.f446f;
        if (kVar == k.START_OBJECT) {
            N();
        } else if (kVar == k.START_ARRAY) {
            K();
        }
        if (bVar.f447g) {
            int i10 = a.f23143a[bVar.f445e.ordinal()];
            if (i10 == 1) {
                Object obj = bVar.f443c;
                j2(bVar.f444d, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i10 != 2 && i10 != 3) {
                if (i10 != 5) {
                    N();
                } else {
                    K();
                }
            }
        }
        return bVar;
    }

    public abstract boolean n(b bVar);

    public f o(int i10, int i11) {
        return this;
    }

    public abstract void o0(String str);

    public void o1(Object obj) {
        throw new e("No native support for writing Object Ids", this);
    }

    public abstract f p(int i10, int i11);

    public abstract void q(Object obj);

    public abstract f r(int i10);

    public f s(m mVar) {
        this.f23142a = mVar;
        return this;
    }

    public void t(double[] dArr, int i10, int i11) {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        c(dArr.length, i10, i11);
        O1(dArr, i11);
        int i12 = i11 + i10;
        while (i10 < i12) {
            z0(dArr[i10]);
            i10++;
        }
        K();
    }

    public void t1(String str) {
    }

    public void u(int[] iArr, int i10, int i11) {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        c(iArr.length, i10, i11);
        O1(iArr, i11);
        int i12 = i11 + i10;
        while (i10 < i12) {
            O0(iArr[i10]);
            i10++;
        }
        K();
    }

    public abstract void v1(char c10);

    public void x(long[] jArr, int i10, int i11) {
        if (jArr == null) {
            throw new IllegalArgumentException("null array");
        }
        c(jArr.length, i10, i11);
        O1(jArr, i11);
        int i12 = i11 + i10;
        while (i10 < i12) {
            Z0(jArr[i10]);
            i10++;
        }
        K();
    }

    public abstract void x1(n nVar);

    public abstract int y(com.fasterxml.jackson.core.a aVar, InputStream inputStream, int i10);

    public abstract void y0();

    public abstract void y1(String str);

    public int z(InputStream inputStream, int i10) {
        return y(com.fasterxml.jackson.core.b.a(), inputStream, i10);
    }

    public abstract void z0(double d10);

    public abstract void z1(char[] cArr, int i10, int i11);
}
