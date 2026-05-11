package k3;

import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.UnsupportedEncodingException;

/* renamed from: k3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3540c {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f36202a = true;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f36203b = e();

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC3539b f36204c = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f36205d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f36206e = a("RIFF");

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f36207f = a("WEBP");

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f36208g = a("VP8 ");

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f36209h = a("VP8L");

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f36210i = a("VP8X");

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static boolean b(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f36210i) && ((bArr[i10 + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i10, int i11) {
        return i11 >= 21 && j(bArr, i10 + 12, f36210i);
    }

    public static boolean d(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f36210i) && ((bArr[i10 + 20] & 16) == 16);
    }

    private static boolean e() {
        return true;
    }

    public static boolean f(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f36209h);
    }

    public static boolean g(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f36208g);
    }

    public static boolean h(byte[] bArr, int i10, int i11) {
        return i11 >= 20 && j(bArr, i10, f36206e) && j(bArr, i10 + 8, f36207f);
    }

    public static InterfaceC3539b i() {
        InterfaceC3539b interfaceC3539b;
        if (f36205d) {
            return f36204c;
        }
        try {
            interfaceC3539b = (InterfaceC3539b) WebpBitmapFactoryImpl.class.newInstance();
        } catch (Throwable unused) {
            interfaceC3539b = null;
        }
        f36205d = true;
        return interfaceC3539b;
    }

    private static boolean j(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
