package kotlin.text;

import kotlin.collections.AbstractC3568c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import lc.x;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f36820a;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f36821b;

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f36822c;

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f36823d;

    static {
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f36820a = iArr;
        int[] iArr2 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f36821b = iArr2;
        int[] iArr3 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f36822c = iArr3;
        long[] jArr = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f36823d = jArr;
    }

    private static final int a(long j10) {
        if (0 <= j10 && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) x.n(x.c(j10))));
    }

    private static final int b(byte[] bArr, int i10, String str, String str2, int[] iArr, char[] cArr, int i11) {
        return f(str2, cArr, c(bArr, i10, iArr, cArr, f(str, cArr, i11)));
    }

    private static final int c(byte[] bArr, int i10, int[] iArr, char[] cArr, int i11) {
        int i12 = iArr[bArr[i10] & 255];
        cArr[i11] = (char) (i12 >> 8);
        cArr[i11 + 1] = (char) (i12 & 255);
        return i11 + 2;
    }

    private static final int d(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = i11;
        return a((i10 * (((i12 + 2) + i13) + j10)) - j10);
    }

    public static final int e(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i17 = (i10 - 1) / i11;
        int i18 = (i11 - 1) / i12;
        int i19 = i10 % i11;
        if (i19 != 0) {
            i11 = i19;
        }
        return a(i17 + (((i18 * i17) + ((i11 - 1) / i12)) * i13) + (((r0 - i17) - r2) * i14) + (i10 * (i15 + 2 + i16)));
    }

    private static final int f(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                Intrinsics.e(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return i10 + str.length();
    }

    public static final String g(byte[] bArr, int i10, int i11, d format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractC3568c.f36342a.a(i10, i11, bArr.length);
        if (i10 == i11) {
            return BuildConfig.FLAVOR;
        }
        int[] iArr = format.c() ? f36821b : f36820a;
        d.a b10 = format.b();
        return b10.i() ? j(bArr, i10, i11, b10, iArr) : m(bArr, i10, i11, b10, iArr);
    }

    public static final String h(byte[] bArr, d format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return g(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String i(byte[] bArr, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = d.f36824d.a();
        }
        return h(bArr, dVar);
    }

    private static final String j(byte[] bArr, int i10, int i11, d.a aVar, int[] iArr) {
        return aVar.j() ? l(bArr, i10, i11, aVar, iArr) : k(bArr, i10, i11, aVar, iArr);
    }

    private static final String k(byte[] bArr, int i10, int i11, d.a aVar, int[] iArr) {
        String c10 = aVar.c();
        String e10 = aVar.e();
        String d10 = aVar.d();
        char[] cArr = new char[d(i11 - i10, d10.length(), c10.length(), e10.length())];
        int b10 = b(bArr, i10, c10, e10, iArr, cArr, 0);
        while (true) {
            i10++;
            if (i10 >= i11) {
                return StringsKt.n(cArr);
            }
            b10 = b(bArr, i10, c10, e10, iArr, cArr, f(d10, cArr, b10));
        }
    }

    private static final String l(byte[] bArr, int i10, int i11, d.a aVar, int[] iArr) {
        int length = aVar.d().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 - i10;
        int i13 = 0;
        if (length == 0) {
            char[] cArr = new char[a(i12 * 2)];
            while (i10 < i11) {
                i13 = c(bArr, i10, iArr, cArr, i13);
                i10++;
            }
            return StringsKt.n(cArr);
        }
        char[] cArr2 = new char[a((i12 * 3) - 1)];
        char charAt = aVar.d().charAt(0);
        int c10 = c(bArr, i10, iArr, cArr2, 0);
        for (int i14 = i10 + 1; i14 < i11; i14++) {
            cArr2[c10] = charAt;
            c10 = c(bArr, i14, iArr, cArr2, c10 + 1);
        }
        return StringsKt.n(cArr2);
    }

    private static final String m(byte[] bArr, int i10, int i11, d.a aVar, int[] iArr) {
        int i12;
        int i13;
        int g10 = aVar.g();
        int f10 = aVar.f();
        String c10 = aVar.c();
        String e10 = aVar.e();
        String d10 = aVar.d();
        String h10 = aVar.h();
        int e11 = e(i11 - i10, g10, f10, h10.length(), d10.length(), c10.length(), e10.length());
        char[] cArr = new char[e11];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = i10; i17 < i11; i17++) {
            if (i15 == g10) {
                cArr[i14] = '\n';
                i14++;
                i12 = 0;
                i13 = 0;
            } else if (i16 == f10) {
                i14 = f(h10, cArr, i14);
                i12 = i15;
                i13 = 0;
            } else {
                i12 = i15;
                i13 = i16;
            }
            if (i13 != 0) {
                i14 = f(d10, cArr, i14);
            }
            i14 = b(bArr, i17, c10, e10, iArr, cArr, i14);
            i16 = i13 + 1;
            i15 = i12 + 1;
        }
        if (i14 == e11) {
            return StringsKt.n(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }
}
