package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.b;
import com.appsflyer.attribution.RequestError;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public class a {

    /* renamed from: U, reason: collision with root package name */
    private static SimpleDateFormat f16605U;

    /* renamed from: V, reason: collision with root package name */
    private static SimpleDateFormat f16606V;

    /* renamed from: Z, reason: collision with root package name */
    private static final e[] f16610Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final e[] f16611a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final e[] f16612b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final e[] f16613c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final e[] f16614d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final e f16615e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final e[] f16616f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final e[] f16617g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final e[] f16618h0;

    /* renamed from: i0, reason: collision with root package name */
    private static final e[] f16619i0;

    /* renamed from: j0, reason: collision with root package name */
    static final e[][] f16620j0;

    /* renamed from: k0, reason: collision with root package name */
    private static final e[] f16621k0;

    /* renamed from: l0, reason: collision with root package name */
    private static final HashMap[] f16622l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final HashMap[] f16623m0;

    /* renamed from: n0, reason: collision with root package name */
    private static final HashSet f16624n0;

    /* renamed from: o0, reason: collision with root package name */
    private static final HashMap f16625o0;

    /* renamed from: p0, reason: collision with root package name */
    static final Charset f16626p0;

    /* renamed from: q0, reason: collision with root package name */
    static final byte[] f16627q0;

    /* renamed from: r0, reason: collision with root package name */
    private static final byte[] f16628r0;

    /* renamed from: s0, reason: collision with root package name */
    private static final Pattern f16629s0;

    /* renamed from: t0, reason: collision with root package name */
    private static final Pattern f16630t0;

    /* renamed from: u0, reason: collision with root package name */
    private static final Pattern f16631u0;

    /* renamed from: v0, reason: collision with root package name */
    private static final Pattern f16633v0;

    /* renamed from: a, reason: collision with root package name */
    private String f16638a;

    /* renamed from: b, reason: collision with root package name */
    private FileDescriptor f16639b;

    /* renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f16640c;

    /* renamed from: d, reason: collision with root package name */
    private int f16641d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16642e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap[] f16643f;

    /* renamed from: g, reason: collision with root package name */
    private Set f16644g;

    /* renamed from: h, reason: collision with root package name */
    private ByteOrder f16645h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16646i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16647j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16648k;

    /* renamed from: l, reason: collision with root package name */
    private int f16649l;

    /* renamed from: m, reason: collision with root package name */
    private int f16650m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f16651n;

    /* renamed from: o, reason: collision with root package name */
    private int f16652o;

    /* renamed from: p, reason: collision with root package name */
    private int f16653p;

    /* renamed from: q, reason: collision with root package name */
    private int f16654q;

    /* renamed from: r, reason: collision with root package name */
    private int f16655r;

    /* renamed from: s, reason: collision with root package name */
    private int f16656s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f16657t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f16658u;

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f16632v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w, reason: collision with root package name */
    private static final List f16634w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x, reason: collision with root package name */
    private static final List f16635x = Arrays.asList(2, 7, 4, 5);

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f16636y = {8, 8, 8};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f16637z = {4};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f16585A = {8};

    /* renamed from: B, reason: collision with root package name */
    static final byte[] f16586B = {-1, -40, -1};

    /* renamed from: C, reason: collision with root package name */
    private static final byte[] f16587C = {102, 116, 121, 112};

    /* renamed from: D, reason: collision with root package name */
    private static final byte[] f16588D = {109, 105, 102, 49};

    /* renamed from: E, reason: collision with root package name */
    private static final byte[] f16589E = {104, 101, 105, 99};

    /* renamed from: F, reason: collision with root package name */
    private static final byte[] f16590F = {79, 76, 89, 77, 80, 0};

    /* renamed from: G, reason: collision with root package name */
    private static final byte[] f16591G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: H, reason: collision with root package name */
    private static final byte[] f16592H = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: I, reason: collision with root package name */
    private static final byte[] f16593I = {101, 88, 73, 102};

    /* renamed from: J, reason: collision with root package name */
    private static final byte[] f16594J = {73, 72, 68, 82};

    /* renamed from: K, reason: collision with root package name */
    private static final byte[] f16595K = {73, 69, 78, 68};

    /* renamed from: L, reason: collision with root package name */
    private static final byte[] f16596L = {82, 73, 70, 70};

    /* renamed from: M, reason: collision with root package name */
    private static final byte[] f16597M = {87, 69, 66, 80};

    /* renamed from: N, reason: collision with root package name */
    private static final byte[] f16598N = {69, 88, 73, 70};

    /* renamed from: O, reason: collision with root package name */
    private static final byte[] f16599O = {-99, 1, 42};

    /* renamed from: P, reason: collision with root package name */
    private static final byte[] f16600P = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: Q, reason: collision with root package name */
    private static final byte[] f16601Q = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: R, reason: collision with root package name */
    private static final byte[] f16602R = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f16603S = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: T, reason: collision with root package name */
    private static final byte[] f16604T = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: W, reason: collision with root package name */
    static final String[] f16607W = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: X, reason: collision with root package name */
    static final int[] f16608X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: Y, reason: collision with root package name */
    static final byte[] f16609Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    class C0285a extends MediaDataSource {

        /* renamed from: a, reason: collision with root package name */
        long f16659a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f16660b;

        C0285a(g gVar) {
            this.f16660b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f16659a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f16660b.available()) {
                        return -1;
                    }
                    this.f16660b.f(j10);
                    this.f16659a = j10;
                }
                if (i11 > this.f16660b.available()) {
                    i11 = this.f16660b.available();
                }
                int read = this.f16660b.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f16659a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f16659a = -1L;
            return -1;
        }
    }

    private static class c extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        final OutputStream f16667a;

        /* renamed from: b, reason: collision with root package name */
        private ByteOrder f16668b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f16667a = outputStream;
            this.f16668b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f16668b = byteOrder;
        }

        public void b(int i10) {
            this.f16667a.write(i10);
        }

        public void c(int i10) {
            ByteOrder byteOrder = this.f16668b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f16667a.write(i10 & 255);
                this.f16667a.write((i10 >>> 8) & 255);
                this.f16667a.write((i10 >>> 16) & 255);
                this.f16667a.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f16667a.write((i10 >>> 24) & 255);
                this.f16667a.write((i10 >>> 16) & 255);
                this.f16667a.write((i10 >>> 8) & 255);
                this.f16667a.write(i10 & 255);
            }
        }

        public void d(short s10) {
            ByteOrder byteOrder = this.f16668b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f16667a.write(s10 & 255);
                this.f16667a.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f16667a.write((s10 >>> 8) & 255);
                this.f16667a.write(s10 & 255);
            }
        }

        public void e(long j10) {
            if (j10 > 4294967295L) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            c((int) j10);
        }

        public void f(int i10) {
            if (i10 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            d((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f16667a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            this.f16667a.write(bArr, i10, i11);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f16669a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16670b;

        /* renamed from: c, reason: collision with root package name */
        public final long f16671c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f16672d;

        d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f16626p0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f16608X[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d10 : dArr) {
                wrap.putDouble(d10);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f16608X[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putInt(i10);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f16608X[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f16677a);
                wrap.putInt((int) fVar.f16678b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f16626p0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f16608X[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f16608X[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f16677a);
                wrap.putInt((int) fVar.f16678b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f16608X[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (o10 instanceof String) {
                return Double.parseDouble((String) o10);
            }
            if (o10 instanceof long[]) {
                if (((long[]) o10).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o10 instanceof int[]) {
                if (((int[]) o10).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o10 instanceof double[]) {
                double[] dArr = (double[]) o10;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o10 instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) o10;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (o10 instanceof String) {
                return Integer.parseInt((String) o10);
            }
            if (o10 instanceof long[]) {
                long[] jArr = (long[]) o10;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o10 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) o10;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                return null;
            }
            if (o10 instanceof String) {
                return (String) o10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (o10 instanceof long[]) {
                long[] jArr = (long[]) o10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (o10 instanceof int[]) {
                int[] iArr = (int[]) o10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (o10 instanceof double[]) {
                double[] dArr = (double[]) o10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(o10 instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) o10;
            while (i10 < fVarArr.length) {
                sb2.append(fVarArr[i10].f16677a);
                sb2.append('/');
                sb2.append(fVarArr[i10].f16678b);
                i10++;
                if (i10 != fVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:49), block:B:166:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:169:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        Object o(ByteOrder byteOrder) {
            b bVar;
            InputStream inputStream;
            byte b10;
            byte b11;
            int i10 = 0;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.f16672d);
                    try {
                        bVar.d(byteOrder);
                        switch (this.f16669a) {
                            case 1:
                            case 6:
                                byte[] bArr = this.f16672d;
                                if (bArr.length != 1 || (b10 = bArr[0]) < 0 || b10 > 1) {
                                    String str = new String(bArr, a.f16626p0);
                                    try {
                                        bVar.close();
                                    } catch (IOException e10) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    }
                                    return str;
                                }
                                String str2 = new String(new char[]{(char) (b10 + 48)});
                                try {
                                    bVar.close();
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                }
                                return str2;
                            case 2:
                            case 7:
                                if (this.f16670b >= a.f16609Y.length) {
                                    int i11 = 0;
                                    while (true) {
                                        byte[] bArr2 = a.f16609Y;
                                        if (i11 >= bArr2.length) {
                                            i10 = bArr2.length;
                                        } else if (this.f16672d[i11] == bArr2[i11]) {
                                            i11++;
                                        }
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                while (i10 < this.f16670b && (b11 = this.f16672d[i10]) != 0) {
                                    if (b11 >= 32) {
                                        sb2.append((char) b11);
                                    } else {
                                        sb2.append('?');
                                    }
                                    i10++;
                                }
                                String sb3 = sb2.toString();
                                try {
                                    bVar.close();
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                }
                                return sb3;
                            case 3:
                                int[] iArr = new int[this.f16670b];
                                while (i10 < this.f16670b) {
                                    iArr[i10] = bVar.readUnsignedShort();
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                }
                                return iArr;
                            case 4:
                                long[] jArr = new long[this.f16670b];
                                while (i10 < this.f16670b) {
                                    jArr[i10] = bVar.c();
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                }
                                return jArr;
                            case 5:
                                f[] fVarArr = new f[this.f16670b];
                                while (i10 < this.f16670b) {
                                    fVarArr[i10] = new f(bVar.c(), bVar.c());
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e15) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                }
                                return fVarArr;
                            case 8:
                                int[] iArr2 = new int[this.f16670b];
                                while (i10 < this.f16670b) {
                                    iArr2[i10] = bVar.readShort();
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e16) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                }
                                return iArr2;
                            case 9:
                                int[] iArr3 = new int[this.f16670b];
                                while (i10 < this.f16670b) {
                                    iArr3[i10] = bVar.readInt();
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e17) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                }
                                return iArr3;
                            case RequestError.EVENT_TIMEOUT /* 10 */:
                                f[] fVarArr2 = new f[this.f16670b];
                                while (i10 < this.f16670b) {
                                    fVarArr2[i10] = new f(bVar.readInt(), bVar.readInt());
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e18) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                                }
                                return fVarArr2;
                            case 11:
                                double[] dArr = new double[this.f16670b];
                                while (i10 < this.f16670b) {
                                    dArr[i10] = bVar.readFloat();
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e19) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                                }
                                return dArr;
                            case 12:
                                double[] dArr2 = new double[this.f16670b];
                                while (i10 < this.f16670b) {
                                    dArr2[i10] = bVar.readDouble();
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e20) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e20);
                                }
                                return dArr2;
                            default:
                                try {
                                    bVar.close();
                                } catch (IOException e21) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e21);
                                }
                                return null;
                        }
                    } catch (IOException e22) {
                        e = e22;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e23) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e23);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e24) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e24);
                        }
                    }
                    throw th;
                }
            } catch (IOException e25) {
                e = e25;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                throw th;
            }
        }

        public int p() {
            return a.f16608X[this.f16669a] * this.f16670b;
        }

        public String toString() {
            return "(" + a.f16607W[this.f16669a] + ", data length:" + this.f16672d.length + ")";
        }

        d(int i10, int i11, long j10, byte[] bArr) {
            this.f16669a = i10;
            this.f16670b = i11;
            this.f16671c = j10;
            this.f16672d = bArr;
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        public final long f16677a;

        /* renamed from: b, reason: collision with root package name */
        public final long f16678b;

        f(double d10) {
            this((long) (d10 * 10000.0d), 10000L);
        }

        public double a() {
            return this.f16677a / this.f16678b;
        }

        public String toString() {
            return this.f16677a + "/" + this.f16678b;
        }

        f(long j10, long j11) {
            if (j11 == 0) {
                this.f16677a = 0L;
                this.f16678b = 1L;
            } else {
                this.f16677a = j10;
                this.f16678b = j11;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        f16610Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f16611a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f16612b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f16613c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f16614d0 = eVarArr5;
        f16615e0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f16616f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f16617g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f16618h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f16619i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f16620j0 = eVarArr10;
        f16621k0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f16622l0 = new HashMap[eVarArr10.length];
        f16623m0 = new HashMap[eVarArr10.length];
        f16624n0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f16625o0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f16626p0 = forName;
        f16627q0 = "Exif\u0000\u0000".getBytes(forName);
        f16628r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f16605U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f16606V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f16620j0;
            if (i10 >= eVarArr11.length) {
                HashMap hashMap = f16625o0;
                e[] eVarArr12 = f16621k0;
                hashMap.put(Integer.valueOf(eVarArr12[0].f16673a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f16673a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f16673a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f16673a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f16673a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f16673a), 8);
                f16629s0 = Pattern.compile(".*[1-9].*");
                f16630t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f16631u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f16633v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f16622l0[i10] = new HashMap();
            f16623m0[i10] = new HashMap();
            for (e eVar : eVarArr11[i10]) {
                f16622l0[i10].put(Integer.valueOf(eVar.f16673a), eVar);
                f16623m0[i10].put(eVar.f16674b, eVar);
            }
            i10++;
        }
    }

    public a(File file) {
        e[][] eVarArr = f16620j0;
        this.f16643f = new HashMap[eVarArr.length];
        this.f16644g = new HashSet(eVarArr.length);
        this.f16645h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        A(file.getAbsolutePath());
    }

    private void A(String str) {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f16640c = null;
        this.f16638a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (I(fileInputStream.getFD())) {
                this.f16639b = fileInputStream.getFD();
            } else {
                this.f16639b = null;
            }
            N(fileInputStream);
            androidx.exifinterface.media.b.b(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            androidx.exifinterface.media.b.b(fileInputStream2);
            throw th;
        }
    }

    private static boolean B(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f16627q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f16627q0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean C(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j10;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.readFully(bArr2);
        } catch (Exception e11) {
            e = e11;
            bVar2 = bVar;
            if (f16632v) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, f16587C)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j10 = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j10 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j11 = readInt - j10;
        if (j11 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            try {
                bVar.readFully(bArr3);
                if (j12 != 1) {
                    if (Arrays.equals(bArr3, f16588D)) {
                        z10 = true;
                    } else if (Arrays.equals(bArr3, f16589E)) {
                        z11 = true;
                    }
                    if (z10 && z11) {
                        bVar.close();
                        return true;
                    }
                }
            } catch (EOFException unused) {
                bVar.close();
                return false;
            }
        }
        bVar.close();
        return false;
    }

    private static boolean D(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f16586B;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean E(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder Q10 = Q(bVar2);
                this.f16645h = Q10;
                bVar2.d(Q10);
                short readShort = bVar2.readShort();
                boolean z10 = readShort == 20306 || readShort == 21330;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean F(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f16592H;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean G(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean H(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder Q10 = Q(bVar2);
                this.f16645h = Q10;
                bVar2.d(Q10);
                boolean z10 = bVar2.readShort() == 85;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean I(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f16632v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean J(HashMap hashMap) {
        d dVar;
        int m10;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f16645h);
            int[] iArr2 = f16636y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f16641d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m10 = dVar.m(this.f16645h)) == 1 && Arrays.equals(iArr, f16585A)) || (m10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f16632v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private static boolean K(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    private boolean L(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f16645h) <= 512 && dVar2.m(this.f16645h) <= 512;
    }

    private boolean M(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f16596L;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f16597M;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f16596L.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:8:0x001e, B:10:0x0022, B:11:0x0030, B:13:0x0038, B:15:0x0041, B:16:0x0061, B:23:0x0045, B:25:0x004b, B:28:0x0052, B:31:0x005a, B:32:0x005e, B:33:0x006b, B:35:0x0075, B:38:0x007d, B:41:0x0085, B:44:0x008d, B:53:0x009b, B:55:0x009f), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void N(InputStream inputStream) {
        boolean z10;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i10 = 0; i10 < f16620j0.length; i10++) {
            try {
                try {
                    this.f16643f[i10] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (f16632v) {
                        P();
                    }
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
                z10 = f16632v;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z10) {
                    return;
                }
                P();
            } catch (UnsupportedOperationException e11) {
                e = e11;
                z10 = f16632v;
                if (z10) {
                }
                a();
                if (!z10) {
                }
                P();
            }
        }
        if (!this.f16642e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f16641d = n(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (f0(this.f16641d)) {
            g gVar = new g(inputStream);
            if (this.f16642e) {
                t(gVar);
            } else {
                int i11 = this.f16641d;
                if (i11 == 12) {
                    k(gVar);
                } else if (i11 == 7) {
                    o(gVar);
                } else if (i11 == 10) {
                    s(gVar);
                } else {
                    r(gVar);
                }
            }
            gVar.f(this.f16653p);
            e0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f16641d;
            if (i12 == 4) {
                l(bVar, 0, 0);
            } else if (i12 == 13) {
                p(bVar);
            } else if (i12 == 9) {
                q(bVar);
            } else if (i12 == 14) {
                w(bVar);
            }
        }
        a();
        if (!f16632v) {
            return;
        }
        P();
    }

    private void O(b bVar) {
        ByteOrder Q10 = Q(bVar);
        this.f16645h = Q10;
        bVar.d(Q10);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f16641d;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i11 = readInt - 8;
        if (i11 > 0) {
            bVar.e(i11);
        }
    }

    private void P() {
        for (int i10 = 0; i10 < this.f16643f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f16643f[i10].size());
            for (Map.Entry entry : this.f16643f[i10].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.n(this.f16645h) + "'");
            }
        }
    }

    private ByteOrder Q(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f16632v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f16632v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void R(byte[] bArr, int i10) {
        g gVar = new g(bArr);
        O(gVar);
        S(gVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void S(g gVar, int i10) {
        short s10;
        short s11;
        e eVar;
        long j10;
        boolean z10;
        long j11;
        int i11;
        e eVar2;
        int readUnsignedShort;
        long j12;
        int i12 = i10;
        this.f16644g.add(Integer.valueOf(gVar.b()));
        short readShort = gVar.readShort();
        if (f16632v) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s12 = 0;
        while (s12 < readShort) {
            int readUnsignedShort2 = gVar.readUnsignedShort();
            int readUnsignedShort3 = gVar.readUnsignedShort();
            int readInt = gVar.readInt();
            long b10 = gVar.b() + 4;
            e eVar3 = (e) f16622l0[i12].get(Integer.valueOf(readUnsignedShort2));
            boolean z11 = f16632v;
            if (z11) {
                s10 = readShort;
                s11 = s12;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(readUnsignedShort2), eVar3 != null ? eVar3.f16674b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                s10 = readShort;
                s11 = s12;
            }
            if (eVar3 != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f16608X.length) {
                        if (eVar3.a(readUnsignedShort3)) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = eVar3.f16675c;
                            }
                            eVar = eVar3;
                            j10 = r6[readUnsignedShort3] * readInt;
                            if (j10 < 0 || j10 > 2147483647L) {
                                if (z11) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z10 = false;
                                if (z10) {
                                    gVar.f(b10);
                                } else {
                                    if (j10 > 4) {
                                        int readInt2 = gVar.readInt();
                                        if (z11) {
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        }
                                        if (this.f16641d == 7) {
                                            eVar2 = eVar;
                                            j11 = b10;
                                            if ("MakerNote".equals(eVar2.f16674b)) {
                                                this.f16654q = readInt2;
                                            } else if (i12 == 6 && "ThumbnailImage".equals(eVar2.f16674b)) {
                                                this.f16655r = readInt2;
                                                this.f16656s = readInt;
                                                d j13 = d.j(6, this.f16645h);
                                                d f10 = d.f(this.f16655r, this.f16645h);
                                                i11 = readInt;
                                                d f11 = d.f(this.f16656s, this.f16645h);
                                                this.f16643f[4].put("Compression", j13);
                                                this.f16643f[4].put("JPEGInterchangeFormat", f10);
                                                this.f16643f[4].put("JPEGInterchangeFormatLength", f11);
                                            }
                                            i11 = readInt;
                                        } else {
                                            j11 = b10;
                                            i11 = readInt;
                                            eVar2 = eVar;
                                        }
                                        gVar.f(readInt2);
                                    } else {
                                        j11 = b10;
                                        i11 = readInt;
                                        eVar2 = eVar;
                                    }
                                    Integer num = (Integer) f16625o0.get(Integer.valueOf(readUnsignedShort2));
                                    if (z11) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == 4) {
                                                j12 = gVar.c();
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = gVar.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = gVar.readInt();
                                            } else {
                                                j12 = -1;
                                            }
                                            if (z11) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), eVar2.f16674b));
                                            }
                                            if (j12 > 0 || (gVar.a() != -1 && j12 >= gVar.a())) {
                                                if (z11) {
                                                    String str = "Skip jump into the IFD since its offset is invalid: " + j12;
                                                    if (gVar.a() != -1) {
                                                        str = str + " (total length: " + gVar.a() + ")";
                                                    }
                                                    Log.d("ExifInterface", str);
                                                }
                                            } else if (!this.f16644g.contains(Integer.valueOf((int) j12))) {
                                                gVar.f(j12);
                                                S(gVar, num.intValue());
                                            } else if (z11) {
                                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                                            }
                                            gVar.f(j11);
                                        } else {
                                            readUnsignedShort = gVar.readUnsignedShort();
                                        }
                                        j12 = readUnsignedShort;
                                        if (z11) {
                                        }
                                        if (j12 > 0) {
                                        }
                                        if (z11) {
                                        }
                                        gVar.f(j11);
                                    } else {
                                        long j14 = j11;
                                        int b11 = gVar.b() + this.f16653p;
                                        byte[] bArr = new byte[(int) j10];
                                        gVar.readFully(bArr);
                                        d dVar = new d(readUnsignedShort3, i11, b11, bArr);
                                        this.f16643f[i10].put(eVar2.f16674b, dVar);
                                        if ("DNGVersion".equals(eVar2.f16674b)) {
                                            this.f16641d = 3;
                                        }
                                        if ((("Make".equals(eVar2.f16674b) || "Model".equals(eVar2.f16674b)) && dVar.n(this.f16645h).contains("PENTAX")) || ("Compression".equals(eVar2.f16674b) && dVar.m(this.f16645h) == 65535)) {
                                            this.f16641d = 8;
                                        }
                                        if (gVar.b() != j14) {
                                            gVar.f(j14);
                                        }
                                    }
                                }
                                s12 = (short) (s11 + 1);
                                i12 = i10;
                                readShort = s10;
                            } else {
                                z10 = true;
                                if (z10) {
                                }
                                s12 = (short) (s11 + 1);
                                i12 = i10;
                                readShort = s10;
                            }
                        } else if (z11) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f16607W[readUnsignedShort3] + ") is unexpected for tag: " + eVar3.f16674b);
                        }
                    }
                }
                eVar = eVar3;
                if (z11) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j10 = 0;
                z10 = false;
                if (z10) {
                }
                s12 = (short) (s11 + 1);
                i12 = i10;
                readShort = s10;
            } else if (z11) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            eVar = eVar3;
            j10 = 0;
            z10 = false;
            if (z10) {
            }
            s12 = (short) (s11 + 1);
            i12 = i10;
            readShort = s10;
        }
        int readInt3 = gVar.readInt();
        boolean z12 = f16632v;
        if (z12) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j15 = readInt3;
        if (j15 <= 0) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (this.f16644g.contains(Integer.valueOf(readInt3))) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        gVar.f(j15);
        if (this.f16643f[4].isEmpty()) {
            S(gVar, 4);
        } else if (this.f16643f[5].isEmpty()) {
            S(gVar, 5);
        }
    }

    private void T(String str) {
        for (int i10 = 0; i10 < f16620j0.length; i10++) {
            this.f16643f[i10].remove(str);
        }
    }

    private void U(int i10, String str, String str2) {
        if (this.f16643f[i10].isEmpty() || this.f16643f[i10].get(str) == null) {
            return;
        }
        HashMap hashMap = this.f16643f[i10];
        hashMap.put(str2, hashMap.get(str));
        this.f16643f[i10].remove(str);
    }

    private void V(g gVar, int i10) {
        d dVar = (d) this.f16643f[i10].get("ImageLength");
        d dVar2 = (d) this.f16643f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = (d) this.f16643f[i10].get("JPEGInterchangeFormat");
            d dVar4 = (d) this.f16643f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int m10 = dVar3.m(this.f16645h);
            int m11 = dVar3.m(this.f16645h);
            gVar.f(m10);
            byte[] bArr = new byte[m11];
            gVar.readFully(bArr);
            l(new b(bArr), m10, i10);
        }
    }

    private void X(InputStream inputStream, OutputStream outputStream) {
        if (f16632v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        d dVar = (g("Xmp") == null || !this.f16658u) ? null : (d) this.f16643f[0].remove("Xmp");
        cVar.b(-1);
        cVar.b(-31);
        j0(cVar);
        if (dVar != null) {
            this.f16643f[0].put("Xmp", dVar);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.b(-1);
                cVar.b(readByte);
                androidx.exifinterface.media.b.d(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.b(-1);
                cVar.b(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.f(readUnsignedShort);
                int i10 = readUnsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int read = bVar.read(bArr, 0, Math.min(i10, 4096));
                    if (read >= 0) {
                        cVar.write(bArr, 0, read);
                        i10 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int i11 = readUnsignedShort2 - 2;
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i11 >= 6) {
                    bVar.readFully(bArr2);
                    if (Arrays.equals(bArr2, f16627q0)) {
                        bVar.e(readUnsignedShort2 - 8);
                    }
                }
                cVar.b(-1);
                cVar.b(readByte);
                cVar.f(readUnsignedShort2);
                if (i11 >= 6) {
                    i11 = readUnsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i11 > 0) {
                    int read2 = bVar.read(bArr, 0, Math.min(i11, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr, 0, read2);
                        i11 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void Y(InputStream inputStream, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f16632v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        androidx.exifinterface.media.b.e(bVar, cVar, f16592H.length);
        if (this.f16653p == 0) {
            int readInt = bVar.readInt();
            cVar.c(readInt);
            androidx.exifinterface.media.b.e(bVar, cVar, readInt + 8);
        } else {
            androidx.exifinterface.media.b.e(bVar, cVar, (r2 - r7.length) - 8);
            bVar.e(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            j0(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f16667a).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.c((int) crc32.getValue());
            androidx.exifinterface.media.b.b(byteArrayOutputStream);
            androidx.exifinterface.media.b.d(bVar, cVar);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            androidx.exifinterface.media.b.b(byteArrayOutputStream2);
            throw th;
        }
    }

    private void Z(InputStream inputStream, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        int i10;
        int i11;
        int i12;
        boolean z10;
        if (f16632v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f16596L;
        androidx.exifinterface.media.b.e(bVar, cVar, bArr.length);
        byte[] bArr2 = f16597M;
        bVar.e(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            int i13 = this.f16653p;
            if (i13 != 0) {
                androidx.exifinterface.media.b.e(bVar, cVar2, (i13 - ((bArr.length + 4) + bArr2.length)) - 8);
                bVar.e(4);
                int readInt = bVar.readInt();
                if (readInt % 2 != 0) {
                    readInt++;
                }
                bVar.e(readInt);
                j0(cVar2);
            } else {
                byte[] bArr3 = new byte[4];
                bVar.readFully(bArr3);
                byte[] bArr4 = f16600P;
                boolean z11 = true;
                if (Arrays.equals(bArr3, bArr4)) {
                    int readInt2 = bVar.readInt();
                    byte[] bArr5 = new byte[readInt2 % 2 == 1 ? readInt2 + 1 : readInt2];
                    bVar.readFully(bArr5);
                    byte b10 = (byte) (8 | bArr5[0]);
                    bArr5[0] = b10;
                    boolean z12 = ((b10 >> 1) & 1) == 1;
                    cVar2.write(bArr4);
                    cVar2.c(readInt2);
                    cVar2.write(bArr5);
                    if (z12) {
                        d(bVar, cVar2, f16603S, null);
                        while (true) {
                            byte[] bArr6 = new byte[4];
                            try {
                                bVar.readFully(bArr6);
                                z10 = !Arrays.equals(bArr6, f16604T);
                            } catch (EOFException unused) {
                                z10 = true;
                            }
                            if (z10) {
                                break;
                            } else {
                                e(bVar, cVar2, bArr6);
                            }
                        }
                        j0(cVar2);
                    } else {
                        d(bVar, cVar2, f16602R, f16601Q);
                        j0(cVar2);
                    }
                } else {
                    byte[] bArr7 = f16602R;
                    if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f16601Q)) {
                        int readInt3 = bVar.readInt();
                        int i14 = readInt3 % 2 == 1 ? readInt3 + 1 : readInt3;
                        byte[] bArr8 = new byte[3];
                        if (Arrays.equals(bArr3, bArr7)) {
                            bVar.readFully(bArr8);
                            byte[] bArr9 = new byte[3];
                            bVar.readFully(bArr9);
                            if (!Arrays.equals(f16599O, bArr9)) {
                                throw new IOException("Error checking VP8 signature");
                            }
                            int readInt4 = bVar.readInt();
                            i12 = (readInt4 << 2) >> 18;
                            i14 -= 10;
                            i10 = (readInt4 << 18) >> 18;
                            i11 = readInt4;
                            z11 = false;
                        } else if (!Arrays.equals(bArr3, f16601Q)) {
                            i10 = 0;
                            z11 = false;
                            i11 = 0;
                            i12 = 0;
                        } else {
                            if (bVar.readByte() != 47) {
                                throw new IOException("Error checking VP8L signature");
                            }
                            i11 = bVar.readInt();
                            i10 = (i11 & 16383) + 1;
                            i12 = ((i11 & 268419072) >>> 14) + 1;
                            if ((i11 & 268435456) == 0) {
                                z11 = false;
                            }
                            i14 -= 5;
                        }
                        cVar2.write(bArr4);
                        cVar2.c(10);
                        byte[] bArr10 = new byte[10];
                        if (z11) {
                            bArr10[0] = (byte) (bArr10[0] | 16);
                        }
                        bArr10[0] = (byte) (bArr10[0] | 8);
                        int i15 = i10 - 1;
                        int i16 = i12 - 1;
                        bArr10[4] = (byte) i15;
                        bArr10[5] = (byte) (i15 >> 8);
                        bArr10[6] = (byte) (i15 >> 16);
                        bArr10[7] = (byte) i16;
                        bArr10[8] = (byte) (i16 >> 8);
                        bArr10[9] = (byte) (i16 >> 16);
                        cVar2.write(bArr10);
                        cVar2.write(bArr3);
                        cVar2.c(readInt3);
                        if (Arrays.equals(bArr3, bArr7)) {
                            cVar2.write(bArr8);
                            cVar2.write(f16599O);
                            cVar2.c(i11);
                        } else if (Arrays.equals(bArr3, f16601Q)) {
                            cVar2.write(47);
                            cVar2.c(i11);
                        }
                        androidx.exifinterface.media.b.e(bVar, cVar2, i14);
                        j0(cVar2);
                    }
                }
            }
            androidx.exifinterface.media.b.d(bVar, cVar2);
            int size = byteArrayOutputStream.size();
            byte[] bArr11 = f16597M;
            cVar.c(size + bArr11.length);
            cVar.write(bArr11);
            byteArrayOutputStream.writeTo(cVar);
            androidx.exifinterface.media.b.b(byteArrayOutputStream);
        } catch (Exception e11) {
            e = e11;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            androidx.exifinterface.media.b.b(byteArrayOutputStream2);
            throw th;
        }
    }

    private void a() {
        String g10 = g("DateTimeOriginal");
        if (g10 != null && g("DateTime") == null) {
            this.f16643f[0].put("DateTime", d.e(g10));
        }
        if (g("ImageWidth") == null) {
            this.f16643f[0].put("ImageWidth", d.f(0L, this.f16645h));
        }
        if (g("ImageLength") == null) {
            this.f16643f[0].put("ImageLength", d.f(0L, this.f16645h));
        }
        if (g("Orientation") == null) {
            this.f16643f[0].put("Orientation", d.f(0L, this.f16645h));
        }
        if (g("LightSource") == null) {
            this.f16643f[1].put("LightSource", d.f(0L, this.f16645h));
        }
    }

    private String b(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - j10;
        long j11 = (long) (d11 * 60.0d);
        return j10 + "/1," + j11 + "/1," + Math.round((d11 - (j11 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    private static double c(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private void d(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            e(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void e(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.c(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        androidx.exifinterface.media.b.e(bVar, cVar, readInt);
    }

    private void e0(b bVar) {
        HashMap hashMap = this.f16643f[4];
        d dVar = (d) hashMap.get("Compression");
        if (dVar == null) {
            this.f16652o = 6;
            y(bVar, hashMap);
            return;
        }
        int m10 = dVar.m(this.f16645h);
        this.f16652o = m10;
        if (m10 != 1) {
            if (m10 == 6) {
                y(bVar, hashMap);
                return;
            } else if (m10 != 7) {
                return;
            }
        }
        if (J(hashMap)) {
            z(bVar, hashMap);
        }
    }

    private static boolean f0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void g0(int i10, int i11) {
        if (this.f16643f[i10].isEmpty() || this.f16643f[i11].isEmpty()) {
            if (f16632v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) this.f16643f[i10].get("ImageLength");
        d dVar2 = (d) this.f16643f[i10].get("ImageWidth");
        d dVar3 = (d) this.f16643f[i11].get("ImageLength");
        d dVar4 = (d) this.f16643f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (f16632v) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (f16632v) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int m10 = dVar.m(this.f16645h);
        int m11 = dVar2.m(this.f16645h);
        int m12 = dVar3.m(this.f16645h);
        int m13 = dVar4.m(this.f16645h);
        if (m10 >= m12 || m11 >= m13) {
            return;
        }
        HashMap[] hashMapArr = this.f16643f;
        HashMap hashMap = hashMapArr[i10];
        hashMapArr[i10] = hashMapArr[i11];
        hashMapArr[i11] = hashMap;
    }

    private void h0(g gVar, int i10) {
        d j10;
        d j11;
        d dVar = (d) this.f16643f[i10].get("DefaultCropSize");
        d dVar2 = (d) this.f16643f[i10].get("SensorTopBorder");
        d dVar3 = (d) this.f16643f[i10].get("SensorLeftBorder");
        d dVar4 = (d) this.f16643f[i10].get("SensorBottomBorder");
        d dVar5 = (d) this.f16643f[i10].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                V(gVar, i10);
                return;
            }
            int m10 = dVar2.m(this.f16645h);
            int m11 = dVar4.m(this.f16645h);
            int m12 = dVar5.m(this.f16645h);
            int m13 = dVar3.m(this.f16645h);
            if (m11 <= m10 || m12 <= m13) {
                return;
            }
            d j12 = d.j(m11 - m10, this.f16645h);
            d j13 = d.j(m12 - m13, this.f16645h);
            this.f16643f[i10].put("ImageLength", j12);
            this.f16643f[i10].put("ImageWidth", j13);
            return;
        }
        if (dVar.f16669a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f16645h);
            if (fVarArr == null || fVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            j10 = d.h(fVarArr[0], this.f16645h);
            j11 = d.h(fVarArr[1], this.f16645h);
        } else {
            int[] iArr = (int[]) dVar.o(this.f16645h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            j10 = d.j(iArr[0], this.f16645h);
            j11 = d.j(iArr[1], this.f16645h);
        }
        this.f16643f[i10].put("ImageWidth", j10);
        this.f16643f[i10].put("ImageLength", j11);
    }

    private void i0() {
        g0(0, 5);
        g0(0, 4);
        g0(5, 4);
        d dVar = (d) this.f16643f[1].get("PixelXDimension");
        d dVar2 = (d) this.f16643f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f16643f[0].put("ImageWidth", dVar);
            this.f16643f[0].put("ImageLength", dVar2);
        }
        if (this.f16643f[4].isEmpty() && L(this.f16643f[5])) {
            HashMap[] hashMapArr = this.f16643f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!L(this.f16643f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        U(0, "ThumbnailOrientation", "Orientation");
        U(0, "ThumbnailImageLength", "ImageLength");
        U(0, "ThumbnailImageWidth", "ImageWidth");
        U(5, "ThumbnailOrientation", "Orientation");
        U(5, "ThumbnailImageLength", "ImageLength");
        U(5, "ThumbnailImageWidth", "ImageWidth");
        U(4, "Orientation", "ThumbnailOrientation");
        U(4, "ImageLength", "ThumbnailImageLength");
        U(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private d j(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f16632v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f16620j0.length; i10++) {
            d dVar = (d) this.f16643f[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private int j0(c cVar) {
        e[][] eVarArr = f16620j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f16621k0) {
            T(eVar.f16674b);
        }
        if (this.f16646i) {
            if (this.f16647j) {
                T("StripOffsets");
                T("StripByteCounts");
            } else {
                T("JPEGInterchangeFormat");
                T("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < f16620j0.length; i10++) {
            for (Object obj : this.f16643f[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f16643f[i10].remove(entry.getKey());
                }
            }
        }
        if (!this.f16643f[1].isEmpty()) {
            this.f16643f[0].put(f16621k0[1].f16674b, d.f(0L, this.f16645h));
        }
        if (!this.f16643f[2].isEmpty()) {
            this.f16643f[0].put(f16621k0[2].f16674b, d.f(0L, this.f16645h));
        }
        if (!this.f16643f[3].isEmpty()) {
            this.f16643f[1].put(f16621k0[3].f16674b, d.f(0L, this.f16645h));
        }
        if (this.f16646i) {
            if (this.f16647j) {
                this.f16643f[4].put("StripOffsets", d.j(0, this.f16645h));
                this.f16643f[4].put("StripByteCounts", d.j(this.f16650m, this.f16645h));
            } else {
                this.f16643f[4].put("JPEGInterchangeFormat", d.f(0L, this.f16645h));
                this.f16643f[4].put("JPEGInterchangeFormatLength", d.f(this.f16650m, this.f16645h));
            }
        }
        for (int i11 = 0; i11 < f16620j0.length; i11++) {
            Iterator it = this.f16643f[i11].entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int p10 = ((d) ((Map.Entry) it.next()).getValue()).p();
                if (p10 > 4) {
                    i12 += p10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < f16620j0.length; i14++) {
            if (!this.f16643f[i14].isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f16643f[i14].size() * 12) + 6 + iArr2[i14];
            }
        }
        if (this.f16646i) {
            if (this.f16647j) {
                this.f16643f[4].put("StripOffsets", d.j(i13, this.f16645h));
            } else {
                this.f16643f[4].put("JPEGInterchangeFormat", d.f(i13, this.f16645h));
            }
            this.f16649l = i13;
            i13 += this.f16650m;
        }
        if (this.f16641d == 4) {
            i13 += 8;
        }
        if (f16632v) {
            for (int i15 = 0; i15 < f16620j0.length; i15++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i15), Integer.valueOf(iArr[i15]), Integer.valueOf(this.f16643f[i15].size()), Integer.valueOf(iArr2[i15]), Integer.valueOf(i13)));
            }
        }
        if (!this.f16643f[1].isEmpty()) {
            this.f16643f[0].put(f16621k0[1].f16674b, d.f(iArr[1], this.f16645h));
        }
        if (!this.f16643f[2].isEmpty()) {
            this.f16643f[0].put(f16621k0[2].f16674b, d.f(iArr[2], this.f16645h));
        }
        if (!this.f16643f[3].isEmpty()) {
            this.f16643f[1].put(f16621k0[3].f16674b, d.f(iArr[3], this.f16645h));
        }
        int i16 = this.f16641d;
        if (i16 == 4) {
            if (i13 > 65535) {
                throw new IllegalStateException("Size of exif data (" + i13 + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.f(i13);
            cVar.write(f16627q0);
        } else if (i16 == 13) {
            cVar.c(i13);
            cVar.write(f16593I);
        } else if (i16 == 14) {
            cVar.write(f16598N);
            cVar.c(i13);
        }
        cVar.d(this.f16645h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.a(this.f16645h);
        cVar.f(42);
        cVar.e(8L);
        for (int i17 = 0; i17 < f16620j0.length; i17++) {
            if (!this.f16643f[i17].isEmpty()) {
                cVar.f(this.f16643f[i17].size());
                int size = iArr[i17] + 2 + (this.f16643f[i17].size() * 12) + 4;
                for (Map.Entry entry2 : this.f16643f[i17].entrySet()) {
                    int i18 = ((e) f16623m0[i17].get(entry2.getKey())).f16673a;
                    d dVar = (d) entry2.getValue();
                    int p11 = dVar.p();
                    cVar.f(i18);
                    cVar.f(dVar.f16669a);
                    cVar.c(dVar.f16670b);
                    if (p11 > 4) {
                        cVar.e(size);
                        size += p11;
                    } else {
                        cVar.write(dVar.f16672d);
                        if (p11 < 4) {
                            while (p11 < 4) {
                                cVar.b(0);
                                p11++;
                            }
                        }
                    }
                }
                if (i17 != 0 || this.f16643f[4].isEmpty()) {
                    cVar.e(0L);
                } else {
                    cVar.e(iArr[4]);
                }
                Iterator it2 = this.f16643f[i17].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it2.next()).getValue()).f16672d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f16646i) {
            cVar.write(v());
        }
        if (this.f16641d == 14 && i13 % 2 == 1) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return i13;
    }

    private void k(g gVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0286b.a(mediaMetadataRetriever, new C0285a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.f16643f[0].put("ImageWidth", d.j(Integer.parseInt(str), this.f16645h));
                }
                if (str2 != null) {
                    this.f16643f[0].put("ImageLength", d.j(Integer.parseInt(str2), this.f16645h));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    this.f16643f[0].put("Orientation", d.j(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f16645h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.f(parseInt2);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i10 = parseInt2 + 6;
                    int i11 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f16627q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i11];
                    gVar.readFully(bArr2);
                    this.f16653p = i10;
                    R(bArr2, 0);
                }
                if (f16632v) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
    
        r22.d(r21.f16645h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0170 A[LOOP:0: B:9:0x0037->B:33:0x0170, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0177 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void l(b bVar, int i10, int i11) {
        String str;
        if (f16632v) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.d(ByteOrder.BIG_ENDIAN);
        byte readByte = bVar.readByte();
        byte b10 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i12 = 2;
        while (true) {
            byte readByte2 = bVar.readByte();
            if (readByte2 != b10) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = bVar.readByte();
            boolean z10 = f16632v;
            if (z10) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = bVar.readUnsignedShort();
                int i13 = readUnsignedShort - 2;
                int i14 = i12 + 4;
                if (z10) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i13 < 0) {
                    throw new IOException("Invalid length");
                }
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i13];
                    bVar.readFully(bArr);
                    int i15 = i14 + i13;
                    byte[] bArr2 = f16627q0;
                    if (androidx.exifinterface.media.b.f(bArr, bArr2)) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i13);
                        this.f16653p = i10 + i14 + bArr2.length;
                        R(copyOfRange, i11);
                        e0(new b(copyOfRange));
                    } else {
                        byte[] bArr3 = f16628r0;
                        if (androidx.exifinterface.media.b.f(bArr, bArr3)) {
                            int length = i14 + bArr3.length;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i13);
                            if (g("Xmp") == null) {
                                str = "Invalid length";
                                this.f16643f[0].put("Xmp", new d(1, copyOfRange2.length, length, copyOfRange2));
                                this.f16658u = true;
                                i14 = i15;
                            }
                        }
                    }
                    str = "Invalid length";
                    i14 = i15;
                } else if (readByte3 != -2) {
                    switch (readByte3) {
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                        default:
                            switch (readByte3) {
                                case -59:
                                case -58:
                                case -57:
                                    break;
                                default:
                                    switch (readByte3) {
                                        case -55:
                                        case -54:
                                        case -53:
                                            break;
                                        default:
                                            switch (readByte3) {
                                            }
                                    }
                            }
                    }
                    bVar.e(1);
                    this.f16643f[i11].put(i11 != 4 ? "ImageLength" : "ThumbnailImageLength", d.f(bVar.readUnsignedShort(), this.f16645h));
                    this.f16643f[i11].put(i11 != 4 ? "ImageWidth" : "ThumbnailImageWidth", d.f(bVar.readUnsignedShort(), this.f16645h));
                    i13 = readUnsignedShort - 7;
                    str = "Invalid length";
                    if (i13 >= 0) {
                        throw new IOException(str);
                    }
                    bVar.e(i13);
                    i12 = i14 + i13;
                    b10 = -1;
                } else {
                    byte[] bArr4 = new byte[i13];
                    bVar.readFully(bArr4);
                    if (g("UserComment") == null) {
                        this.f16643f[1].put("UserComment", d.e(new String(bArr4, f16626p0)));
                    }
                    str = "Invalid length";
                }
                i13 = 0;
                if (i13 >= 0) {
                }
            }
        }
    }

    private int n(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (D(bArr)) {
            return 4;
        }
        if (G(bArr)) {
            return 9;
        }
        if (C(bArr)) {
            return 12;
        }
        if (E(bArr)) {
            return 7;
        }
        if (H(bArr)) {
            return 10;
        }
        if (F(bArr)) {
            return 13;
        }
        return M(bArr) ? 14 : 0;
    }

    private void o(g gVar) {
        int i10;
        int i11;
        r(gVar);
        d dVar = (d) this.f16643f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f16672d);
            gVar2.d(this.f16645h);
            byte[] bArr = f16590F;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.f(0L);
            byte[] bArr3 = f16591G;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.f(12L);
            }
            S(gVar2, 6);
            d dVar2 = (d) this.f16643f[7].get("PreviewImageStart");
            d dVar3 = (d) this.f16643f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f16643f[5].put("JPEGInterchangeFormat", dVar2);
                this.f16643f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) this.f16643f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f16645h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d j10 = d.j(i14, this.f16645h);
                d j11 = d.j(i15, this.f16645h);
                this.f16643f[0].put("ImageWidth", j10);
                this.f16643f[0].put("ImageLength", j11);
            }
        }
    }

    private void p(b bVar) {
        if (f16632v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.d(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f16592H;
        bVar.e(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i10 = length + 8;
                if (i10 == 16 && !Arrays.equals(bArr2, f16594J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f16595K)) {
                    return;
                }
                if (Arrays.equals(bArr2, f16593I)) {
                    byte[] bArr3 = new byte[readInt];
                    bVar.readFully(bArr3);
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f16653p = i10;
                        R(bArr3, 0);
                        i0();
                        e0(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i11 = readInt + 4;
                bVar.e(i11);
                length = i10 + i11;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void q(b bVar) {
        boolean z10 = f16632v;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.e(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.e(i10 - bVar.b());
        bVar.readFully(bArr4);
        l(new b(bArr4), i10, 5);
        bVar.e(i12 - bVar.b());
        bVar.d(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f16615e0.f16673a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j10 = d.j(readShort, this.f16645h);
                d j11 = d.j(readShort2, this.f16645h);
                this.f16643f[0].put("ImageLength", j10);
                this.f16643f[0].put("ImageWidth", j11);
                if (f16632v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.e(readUnsignedShort2);
        }
    }

    private void r(g gVar) {
        d dVar;
        O(gVar);
        S(gVar, 0);
        h0(gVar, 0);
        h0(gVar, 5);
        h0(gVar, 4);
        i0();
        if (this.f16641d != 8 || (dVar = (d) this.f16643f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f16672d);
        gVar2.d(this.f16645h);
        gVar2.e(6);
        S(gVar2, 9);
        d dVar2 = (d) this.f16643f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f16643f[1].put("ColorSpace", dVar2);
        }
    }

    private void s(g gVar) {
        if (f16632v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        r(gVar);
        d dVar = (d) this.f16643f[0].get("JpgFromRaw");
        if (dVar != null) {
            l(new b(dVar.f16672d), (int) dVar.f16671c, 5);
        }
        d dVar2 = (d) this.f16643f[0].get("ISO");
        d dVar3 = (d) this.f16643f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f16643f[1].put("PhotographicSensitivity", dVar2);
    }

    private void t(g gVar) {
        byte[] bArr = f16627q0;
        gVar.e(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f16653p = bArr.length;
        R(bArr2, 0);
    }

    private void w(b bVar) {
        if (f16632v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.d(ByteOrder.LITTLE_ENDIAN);
        bVar.e(f16596L.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f16597M;
        bVar.e(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i10 = length + 8;
                if (Arrays.equals(f16598N, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    this.f16653p = i10;
                    R(bArr3, 0);
                    e0(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i10 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.e(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair x(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair x10 = x(split[0]);
            if (((Integer) x10.first).intValue() == 2) {
                return x10;
            }
            for (int i10 = 1; i10 < split.length; i10++) {
                Pair x11 = x(split[i10]);
                int intValue = (((Integer) x11.first).equals(x10.first) || ((Integer) x11.second).equals(x10.first)) ? ((Integer) x10.first).intValue() : -1;
                int intValue2 = (((Integer) x10.second).intValue() == -1 || !(((Integer) x11.first).equals(x10.second) || ((Integer) x11.second).equals(x10.second))) ? -1 : ((Integer) x10.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    x10 = new Pair(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    x10 = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return x10;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    private void y(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int m10 = dVar.m(this.f16645h);
        int m11 = dVar2.m(this.f16645h);
        if (this.f16641d == 7) {
            m10 += this.f16654q;
        }
        if (m10 > 0 && m11 > 0) {
            this.f16646i = true;
            if (this.f16638a == null && this.f16640c == null && this.f16639b == null) {
                byte[] bArr = new byte[m11];
                bVar.e(m10);
                bVar.readFully(bArr);
                this.f16651n = bArr;
            }
            this.f16649l = m10;
            this.f16650m = m11;
        }
        if (f16632v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m10 + ", length: " + m11);
        }
    }

    private void z(b bVar, HashMap hashMap) {
        byte[] bArr;
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] c10 = androidx.exifinterface.media.b.c(dVar.o(this.f16645h));
        long[] c11 = androidx.exifinterface.media.b.c(dVar2.o(this.f16645h));
        if (c10 == null || c10.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (c11 == null || c11.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (c10.length != c11.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : c11) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr2 = new byte[i10];
        this.f16648k = true;
        this.f16647j = true;
        this.f16646i = true;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < c10.length) {
            int i14 = (int) c10[i11];
            int i15 = (int) c11[i11];
            if (i11 < c10.length - 1) {
                bArr = bArr2;
                if (i14 + i15 != c10[i11 + 1]) {
                    this.f16648k = false;
                }
            } else {
                bArr = bArr2;
            }
            int i16 = i14 - i12;
            if (i16 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.e(i16);
                int i17 = i12 + i16;
                byte[] bArr3 = new byte[i15];
                try {
                    bVar.readFully(bArr3);
                    i12 = i17 + i15;
                    byte[] bArr4 = bArr;
                    System.arraycopy(bArr3, 0, bArr4, i13, i15);
                    i13 += i15;
                    i11++;
                    bArr2 = bArr4;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                return;
            }
        }
        this.f16651n = bArr2;
        if (this.f16648k) {
            this.f16649l = (int) c10[0];
            this.f16650m = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:58:0x00ed, B:60:0x00f1, B:62:0x010e, B:66:0x0106), top: B:57:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:58:0x00ed, B:60:0x00f1, B:62:0x010e, B:66:0x0106), top: B:57:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void W() {
        FileOutputStream fileOutputStream;
        File createTempFile;
        FileInputStream fileInputStream;
        Closeable closeable;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        InputStream inputStream;
        Exception e10;
        FileOutputStream fileOutputStream4;
        FileInputStream fileInputStream2;
        if (!K(this.f16641d)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f16639b == null && this.f16638a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f16646i && this.f16647j && !this.f16648k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.f16657t = true;
        this.f16651n = u();
        InputStream inputStream2 = null;
        try {
            createTempFile = File.createTempFile("temp", "tmp");
            if (this.f16638a != null) {
                fileInputStream = new FileInputStream(this.f16638a);
            } else {
                b.a.c(this.f16639b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f16639b);
            }
            try {
                fileOutputStream = new FileOutputStream(createTempFile);
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            androidx.exifinterface.media.b.d(fileInputStream, fileOutputStream);
            androidx.exifinterface.media.b.b(fileInputStream);
            androidx.exifinterface.media.b.b(fileOutputStream);
            try {
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                try {
                    fileInputStream2 = new FileInputStream(createTempFile);
                } catch (Throwable th4) {
                    th = th4;
                    closeable = null;
                    androidx.exifinterface.media.b.b(inputStream2);
                    androidx.exifinterface.media.b.b(closeable);
                    if (0 == 0) {
                        createTempFile.delete();
                    }
                    throw th;
                }
                try {
                    if (this.f16638a != null) {
                        fileOutputStream3 = new FileOutputStream(this.f16638a);
                    } else {
                        b.a.c(this.f16639b, 0L, OsConstants.SEEK_SET);
                        fileOutputStream3 = new FileOutputStream(this.f16639b);
                    }
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream2);
                        try {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                            try {
                                int i10 = this.f16641d;
                                if (i10 == 4) {
                                    X(bufferedInputStream, bufferedOutputStream);
                                } else if (i10 == 13) {
                                    Y(bufferedInputStream, bufferedOutputStream);
                                } else if (i10 == 14) {
                                    Z(bufferedInputStream, bufferedOutputStream);
                                }
                                androidx.exifinterface.media.b.b(bufferedInputStream);
                                androidx.exifinterface.media.b.b(bufferedOutputStream);
                                createTempFile.delete();
                                this.f16651n = null;
                            } catch (Exception e13) {
                                exc = e13;
                                inputStream2 = fileInputStream2;
                                try {
                                    inputStream = new FileInputStream(createTempFile);
                                    try {
                                        if (this.f16638a != null) {
                                            b.a.c(this.f16639b, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream4 = new FileOutputStream(this.f16639b);
                                        } else {
                                            fileOutputStream4 = new FileOutputStream(this.f16638a);
                                        }
                                        fileOutputStream3 = fileOutputStream4;
                                        androidx.exifinterface.media.b.d(inputStream, fileOutputStream3);
                                        androidx.exifinterface.media.b.b(inputStream);
                                        androidx.exifinterface.media.b.b(fileOutputStream3);
                                        throw new IOException("Failed to save new file", exc);
                                    } catch (Exception e14) {
                                        e10 = e14;
                                        try {
                                            throw new IOException("Failed to save new file. Original file is stored in " + createTempFile.getAbsolutePath(), e10);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            inputStream2 = inputStream;
                                            androidx.exifinterface.media.b.b(inputStream2);
                                            androidx.exifinterface.media.b.b(fileOutputStream3);
                                            throw th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        inputStream2 = inputStream;
                                        androidx.exifinterface.media.b.b(inputStream2);
                                        androidx.exifinterface.media.b.b(fileOutputStream3);
                                        throw th;
                                    }
                                } catch (Exception e15) {
                                    inputStream = inputStream2;
                                    e10 = e15;
                                } catch (Throwable th7) {
                                    th = th7;
                                    androidx.exifinterface.media.b.b(inputStream2);
                                    androidx.exifinterface.media.b.b(fileOutputStream3);
                                    throw th;
                                }
                            }
                        } catch (Exception e16) {
                            inputStream2 = fileInputStream2;
                            exc = e16;
                        } catch (Throwable th8) {
                            th = th8;
                            closeable = null;
                            inputStream2 = bufferedInputStream;
                            androidx.exifinterface.media.b.b(inputStream2);
                            androidx.exifinterface.media.b.b(closeable);
                            if (0 == 0) {
                            }
                            throw th;
                        }
                    } catch (Exception e17) {
                        inputStream2 = fileInputStream2;
                        exc = e17;
                    }
                } catch (Exception e18) {
                    e = e18;
                    fileOutputStream2 = null;
                    inputStream2 = fileInputStream2;
                    exc = e;
                    fileOutputStream3 = fileOutputStream2;
                    inputStream = new FileInputStream(createTempFile);
                    if (this.f16638a != null) {
                    }
                    fileOutputStream3 = fileOutputStream4;
                    androidx.exifinterface.media.b.d(inputStream, fileOutputStream3);
                    androidx.exifinterface.media.b.b(inputStream);
                    androidx.exifinterface.media.b.b(fileOutputStream3);
                    throw new IOException("Failed to save new file", exc);
                }
            } catch (Exception e19) {
                e = e19;
                fileOutputStream2 = null;
            }
        } catch (Exception e20) {
            e = e20;
            inputStream2 = fileInputStream;
            try {
                throw new IOException("Failed to copy original file to temp file", e);
            } catch (Throwable th9) {
                th = th9;
                androidx.exifinterface.media.b.b(inputStream2);
                androidx.exifinterface.media.b.b(fileOutputStream);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            inputStream2 = fileInputStream;
            androidx.exifinterface.media.b.b(inputStream2);
            androidx.exifinterface.media.b.b(fileOutputStream);
            throw th;
        }
    }

    public void a0(double d10) {
        String str = d10 >= 0.0d ? "0" : "1";
        b0("GPSAltitude", new f(Math.abs(d10)).toString());
        b0("GPSAltitudeRef", str);
    }

    public void b0(String str, String str2) {
        e eVar;
        int i10;
        int i11;
        String str3 = str;
        String str4 = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = f16631u0.matcher(str4).find();
            boolean find2 = f16633v0.matcher(str4).find();
            if (str2.length() != 19 || (!find && !find2)) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                return;
            }
            if (find2) {
                str4 = str4.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            if (f16632v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i12 = 2;
        int i13 = 1;
        if (str4 != null && f16624n0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f16630t0.matcher(str4);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new f(Double.parseDouble(str4)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
            }
        }
        int i14 = 0;
        int i15 = 0;
        while (i15 < f16620j0.length) {
            if ((i15 != 4 || this.f16646i) && (eVar = (e) f16623m0[i15].get(str3)) != null) {
                if (str4 == null) {
                    this.f16643f[i15].remove(str3);
                } else {
                    Pair x10 = x(str4);
                    int i16 = -1;
                    if (eVar.f16675c == ((Integer) x10.first).intValue() || eVar.f16675c == ((Integer) x10.second).intValue()) {
                        i10 = eVar.f16675c;
                    } else {
                        int i17 = eVar.f16676d;
                        if (i17 == -1 || !(i17 == ((Integer) x10.first).intValue() || eVar.f16676d == ((Integer) x10.second).intValue())) {
                            int i18 = eVar.f16675c;
                            if (i18 == i13 || i18 == 7 || i18 == i12) {
                                i10 = i18;
                            } else if (f16632v) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str3);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f16607W;
                                sb2.append(strArr[eVar.f16675c]);
                                int i19 = eVar.f16676d;
                                String str5 = BuildConfig.FLAVOR;
                                sb2.append(i19 == -1 ? BuildConfig.FLAVOR : ", " + strArr[eVar.f16676d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) x10.first).intValue()]);
                                if (((Integer) x10.second).intValue() != -1) {
                                    str5 = ", " + strArr[((Integer) x10.second).intValue()];
                                }
                                sb2.append(str5);
                                sb2.append(")");
                                Log.d("ExifInterface", sb2.toString());
                            }
                        } else {
                            i10 = eVar.f16676d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            i11 = i13;
                            this.f16643f[i15].put(str3, d.a(str4));
                            break;
                        case 2:
                        case 7:
                            i11 = i13;
                            this.f16643f[i15].put(str3, d.e(str4));
                            break;
                        case 3:
                            i11 = i13;
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i20 = 0; i20 < split.length; i20++) {
                                iArr[i20] = Integer.parseInt(split[i20]);
                            }
                            this.f16643f[i15].put(str3, d.k(iArr, this.f16645h));
                            break;
                        case 4:
                            i11 = i13;
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i21 = 0; i21 < split2.length; i21++) {
                                jArr[i21] = Long.parseLong(split2[i21]);
                            }
                            this.f16643f[i15].put(str3, d.g(jArr, this.f16645h));
                            break;
                        case 5:
                            String[] split3 = str4.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            int i22 = 0;
                            while (i22 < split3.length) {
                                String[] split4 = split3[i22].split("/", i16);
                                fVarArr[i22] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                i22++;
                                i16 = -1;
                            }
                            i11 = 1;
                            this.f16643f[i15].put(str3, d.i(fVarArr, this.f16645h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f16632v) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i10);
                                break;
                            }
                            break;
                        case 9:
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i23 = 0; i23 < split5.length; i23++) {
                                iArr2[i23] = Integer.parseInt(split5[i23]);
                            }
                            this.f16643f[i15].put(str3, d.c(iArr2, this.f16645h));
                            i11 = 1;
                            break;
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            String[] split6 = str4.split(",", -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i24 = i14;
                            while (i24 < split6.length) {
                                String[] split7 = split6[i24].split("/", -1);
                                fVarArr2[i24] = new f((long) Double.parseDouble(split7[i14]), (long) Double.parseDouble(split7[i13]));
                                i24++;
                                split6 = split6;
                                i14 = 0;
                                i13 = 1;
                            }
                            this.f16643f[i15].put(str3, d.d(fVarArr2, this.f16645h));
                            i11 = 1;
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i25 = i14; i25 < split8.length; i25++) {
                                dArr[i25] = Double.parseDouble(split8[i25]);
                            }
                            this.f16643f[i15].put(str3, d.b(dArr, this.f16645h));
                            break;
                    }
                    i15++;
                    i13 = i11;
                    i12 = 2;
                    i14 = 0;
                }
            }
            i11 = i13;
            i15++;
            i13 = i11;
            i12 = 2;
            i14 = 0;
        }
    }

    public void c0(Location location) {
        if (location == null) {
            return;
        }
        b0("GPSProcessingMethod", location.getProvider());
        d0(location.getLatitude(), location.getLongitude());
        a0(location.getAltitude());
        b0("GPSSpeedRef", "K");
        b0("GPSSpeed", new f((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] split = f16605U.format(new Date(location.getTime())).split("\\s+", -1);
        b0("GPSDateStamp", split[0]);
        b0("GPSTimeStamp", split[1]);
    }

    public void d0(double d10, double d11) {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        }
        if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        }
        b0("GPSLatitudeRef", d10 >= 0.0d ? "N" : "S");
        b0("GPSLatitude", b(Math.abs(d10)));
        b0("GPSLongitudeRef", d11 >= 0.0d ? "E" : "W");
        b0("GPSLongitude", b(Math.abs(d11)));
    }

    public double f(double d10) {
        double h10 = h("GPSAltitude", -1.0d);
        int i10 = i("GPSAltitudeRef", -1);
        if (h10 < 0.0d || i10 < 0) {
            return d10;
        }
        return h10 * (i10 != 1 ? 1 : -1);
    }

    public String g(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d j10 = j(str);
        if (j10 != null) {
            if (!f16624n0.contains(str)) {
                return j10.n(this.f16645h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = j10.f16669a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + j10.f16669a);
                    return null;
                }
                f[] fVarArr = (f[]) j10.o(this.f16645h);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer valueOf = Integer.valueOf((int) (fVar.f16677a / fVar.f16678b));
                f fVar2 = fVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (fVar2.f16677a / fVar2.f16678b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (fVar3.f16677a / fVar3.f16678b)));
            }
            try {
                return Double.toString(j10.l(this.f16645h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public double h(String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d j10 = j(str);
        if (j10 == null) {
            return d10;
        }
        try {
            return j10.l(this.f16645h);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public int i(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d j10 = j(str);
        if (j10 == null) {
            return i10;
        }
        try {
            return j10.m(this.f16645h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public double[] m() {
        String g10 = g("GPSLatitude");
        String g11 = g("GPSLatitudeRef");
        String g12 = g("GPSLongitude");
        String g13 = g("GPSLongitudeRef");
        if (g10 == null || g11 == null || g12 == null || g13 == null) {
            return null;
        }
        try {
            return new double[]{c(g10, g11), c(g12, g13)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", g10, g11, g12, g13));
            return null;
        }
    }

    public byte[] u() {
        int i10 = this.f16652o;
        if (i10 == 6 || i10 == 7) {
            return v();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] v() {
        FileDescriptor fileDescriptor;
        InputStream inputStream;
        Exception e10;
        InputStream inputStream2 = null;
        if (!this.f16646i) {
            return null;
        }
        byte[] bArr = this.f16651n;
        if (bArr != null) {
            return bArr;
        }
        try {
            inputStream = this.f16640c;
            try {
                try {
                    if (inputStream != null) {
                        try {
                            if (!inputStream.markSupported()) {
                                Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                                androidx.exifinterface.media.b.b(inputStream);
                                return null;
                            }
                            inputStream.reset();
                        } catch (Exception e11) {
                            e10 = e11;
                            fileDescriptor = null;
                            Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
                            androidx.exifinterface.media.b.b(inputStream);
                            if (fileDescriptor != null) {
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            fileDescriptor = null;
                            inputStream2 = inputStream;
                            androidx.exifinterface.media.b.b(inputStream2);
                            if (fileDescriptor != null) {
                            }
                            throw th;
                        }
                    } else {
                        if (this.f16638a == null) {
                            FileDescriptor b10 = b.a.b(this.f16639b);
                            try {
                                b.a.c(b10, 0L, OsConstants.SEEK_SET);
                                fileDescriptor = b10;
                                inputStream = new FileInputStream(b10);
                                b bVar = new b(inputStream);
                                bVar.e(this.f16649l + this.f16653p);
                                byte[] bArr2 = new byte[this.f16650m];
                                bVar.readFully(bArr2);
                                this.f16651n = bArr2;
                                androidx.exifinterface.media.b.b(inputStream);
                                if (fileDescriptor != null) {
                                    androidx.exifinterface.media.b.a(fileDescriptor);
                                }
                                return bArr2;
                            } catch (Exception e12) {
                                e10 = e12;
                                fileDescriptor = b10;
                                inputStream = null;
                                Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
                                androidx.exifinterface.media.b.b(inputStream);
                                if (fileDescriptor != null) {
                                }
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileDescriptor = b10;
                                androidx.exifinterface.media.b.b(inputStream2);
                                if (fileDescriptor != null) {
                                }
                                throw th;
                            }
                        }
                        inputStream = new FileInputStream(this.f16638a);
                    }
                    b bVar2 = new b(inputStream);
                    bVar2.e(this.f16649l + this.f16653p);
                    byte[] bArr22 = new byte[this.f16650m];
                    bVar2.readFully(bArr22);
                    this.f16651n = bArr22;
                    androidx.exifinterface.media.b.b(inputStream);
                    if (fileDescriptor != null) {
                    }
                    return bArr22;
                } catch (Exception e13) {
                    e10 = e13;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
                    androidx.exifinterface.media.b.b(inputStream);
                    if (fileDescriptor != null) {
                        androidx.exifinterface.media.b.a(fileDescriptor);
                    }
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
                androidx.exifinterface.media.b.b(inputStream2);
                if (fileDescriptor != null) {
                    androidx.exifinterface.media.b.a(fileDescriptor);
                }
                throw th;
            }
            fileDescriptor = null;
        } catch (Exception e14) {
            inputStream = null;
            e10 = e14;
            fileDescriptor = null;
        } catch (Throwable th4) {
            th = th4;
            fileDescriptor = null;
        }
    }

    private static class b extends InputStream implements DataInput {

        /* renamed from: a, reason: collision with root package name */
        protected final DataInputStream f16662a;

        /* renamed from: b, reason: collision with root package name */
        protected int f16663b;

        /* renamed from: c, reason: collision with root package name */
        private ByteOrder f16664c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f16665d;

        /* renamed from: e, reason: collision with root package name */
        private int f16666e;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f16666e = bArr.length;
        }

        public int a() {
            return this.f16666e;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f16662a.available();
        }

        public int b() {
            return this.f16663b;
        }

        public long c() {
            return readInt() & 4294967295L;
        }

        public void d(ByteOrder byteOrder) {
            this.f16664c = byteOrder;
        }

        public void e(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f16662a.skip(i12);
                if (skip <= 0) {
                    if (this.f16665d == null) {
                        this.f16665d = new byte[8192];
                    }
                    skip = this.f16662a.read(this.f16665d, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += skip;
            }
            this.f16663b += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f16663b++;
            return this.f16662a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f16663b++;
            return this.f16662a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f16663b++;
            int read = this.f16662a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f16663b += 2;
            return this.f16662a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) {
            this.f16663b += i11;
            this.f16662a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f16663b += 4;
            int read = this.f16662a.read();
            int read2 = this.f16662a.read();
            int read3 = this.f16662a.read();
            int read4 = this.f16662a.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f16664c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f16664c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f16663b += 8;
            int read = this.f16662a.read();
            int read2 = this.f16662a.read();
            int read3 = this.f16662a.read();
            int read4 = this.f16662a.read();
            int read5 = this.f16662a.read();
            int read6 = this.f16662a.read();
            int read7 = this.f16662a.read();
            int read8 = this.f16662a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f16664c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f16664c);
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f16663b += 2;
            int read = this.f16662a.read();
            int read2 = this.f16662a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f16664c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f16664c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f16663b += 2;
            return this.f16662a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f16663b++;
            return this.f16662a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f16663b += 2;
            int read = this.f16662a.read();
            int read2 = this.f16662a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f16664c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f16664c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f16662a.read(bArr, i10, i11);
            this.f16663b += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f16663b += bArr.length;
            this.f16662a.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f16662a = dataInputStream;
            dataInputStream.mark(0);
            this.f16663b = 0;
            this.f16664c = byteOrder;
            this.f16666e = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }
    }

    private static class g extends b {
        g(byte[] bArr) {
            super(bArr);
            this.f16662a.mark(Integer.MAX_VALUE);
        }

        public void f(long j10) {
            int i10 = this.f16663b;
            if (i10 > j10) {
                this.f16663b = 0;
                this.f16662a.reset();
            } else {
                j10 -= i10;
            }
            e((int) j10);
        }

        g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f16662a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f16673a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16674b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16675c;

        /* renamed from: d, reason: collision with root package name */
        public final int f16676d;

        e(String str, int i10, int i11) {
            this.f16674b = str;
            this.f16673a = i10;
            this.f16675c = i11;
            this.f16676d = -1;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f16675c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f16676d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        e(String str, int i10, int i11, int i12) {
            this.f16674b = str;
            this.f16673a = i10;
            this.f16675c = i11;
            this.f16676d = i12;
        }
    }

    public a(String str) {
        e[][] eVarArr = f16620j0;
        this.f16643f = new HashMap[eVarArr.length];
        this.f16644g = new HashSet(eVarArr.length);
        this.f16645h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            A(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int i10) {
        e[][] eVarArr = f16620j0;
        this.f16643f = new HashMap[eVarArr.length];
        this.f16644g = new HashSet(eVarArr.length);
        this.f16645h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f16638a = null;
            if (i10 == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f16627q0.length);
                if (!B(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f16642e = true;
                this.f16640c = null;
                this.f16639b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f16640c = (AssetManager.AssetInputStream) inputStream;
                this.f16639b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (I(fileInputStream.getFD())) {
                        this.f16640c = null;
                        this.f16639b = fileInputStream.getFD();
                    }
                }
                this.f16640c = null;
                this.f16639b = null;
            }
            N(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
