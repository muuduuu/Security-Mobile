package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1557y {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f16476a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f16477b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f16478c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f16479d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f16480e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC1541h f16481f;

    /* renamed from: androidx.datastore.preferences.protobuf.y$a */
    public interface a {
        boolean a(int i10);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$b */
    public interface b extends List, RandomAccess {
        boolean N();

        void x();

        b y(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f16479d = bArr;
        f16480e = ByteBuffer.wrap(bArr);
        f16481f = AbstractC1541h.i(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int g10 = g(i11, bArr, i10, i11);
        if (g10 == 0) {
            return 1;
        }
        return g10;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    static int g(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
