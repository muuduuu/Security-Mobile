package E;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
final class h {

    /* renamed from: e, reason: collision with root package name */
    static final Charset f1821e = StandardCharsets.US_ASCII;

    /* renamed from: f, reason: collision with root package name */
    static final String[] f1822f = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f1823g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: h, reason: collision with root package name */
    static final byte[] f1824h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public final int f1825a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1826b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1827c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1828d;

    h(int i10, int i11, byte[] bArr) {
        this(i10, i11, -1L, bArr);
    }

    public static h a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new h(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f1821e);
        return new h(1, bytes.length, bytes);
    }

    public static h b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1823g[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d10 : dArr) {
            wrap.putDouble(d10);
        }
        return new h(12, dArr.length, wrap.array());
    }

    public static h c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1823g[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putInt(i10);
        }
        return new h(9, iArr.length, wrap.array());
    }

    public static h d(l[] lVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1823g[10] * lVarArr.length]);
        wrap.order(byteOrder);
        for (l lVar : lVarArr) {
            wrap.putInt((int) lVar.b());
            wrap.putInt((int) lVar.a());
        }
        return new h(10, lVarArr.length, wrap.array());
    }

    public static h e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f1821e);
        return new h(2, bytes.length, bytes);
    }

    public static h f(long j10, ByteOrder byteOrder) {
        return g(new long[]{j10}, byteOrder);
    }

    public static h g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1823g[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j10 : jArr) {
            wrap.putInt((int) j10);
        }
        return new h(4, jArr.length, wrap.array());
    }

    public static h h(l[] lVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1823g[5] * lVarArr.length]);
        wrap.order(byteOrder);
        for (l lVar : lVarArr) {
            wrap.putInt((int) lVar.b());
            wrap.putInt((int) lVar.a());
        }
        return new h(5, lVarArr.length, wrap.array());
    }

    public static h i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1823g[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putShort((short) i10);
        }
        return new h(3, iArr.length, wrap.array());
    }

    public int j() {
        return f1823g[this.f1825a] * this.f1826b;
    }

    public String toString() {
        return "(" + f1822f[this.f1825a] + ", data length:" + this.f1828d.length + ")";
    }

    h(int i10, int i11, long j10, byte[] bArr) {
        this.f1825a = i10;
        this.f1826b = i11;
        this.f1827c = j10;
        this.f1828d = bArr;
    }
}
