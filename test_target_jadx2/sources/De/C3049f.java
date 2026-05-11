package de;

import Wd.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import pe.C3880h;

/* renamed from: de.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3049f {

    /* renamed from: a, reason: collision with root package name */
    public static final C3049f f31929a = new C3049f();

    /* renamed from: b, reason: collision with root package name */
    public static final C3880h f31930b = C3880h.f38683d.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f31931c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f31932d = new String[64];

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f31933e;

    static {
        String[] strArr = new String[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(...)");
            strArr[i10] = StringsKt.y(p.i("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f31933e = strArr;
        String[] strArr2 = f31932d;
        strArr2[0] = BuildConfig.FLAVOR;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = strArr2[i11] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f31932d;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
        }
        int length = f31932d.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f31932d;
            if (strArr4[i16] == null) {
                strArr4[i16] = f31933e[i16];
            }
        }
    }

    private C3049f() {
    }

    public final String a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f31933e[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f31932d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    Intrinsics.d(str);
                } else {
                    str = f31933e[i11];
                }
                String str2 = str;
                return (i10 != 5 || (i11 & 4) == 0) ? (i10 != 0 || (i11 & 32) == 0) ? str2 : StringsKt.z(str2, "PRIORITY", "COMPRESSED", false, 4, null) : StringsKt.z(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f31933e[i11];
    }

    public final String b(int i10) {
        String[] strArr = f31931c;
        return i10 < strArr.length ? strArr[i10] : p.i("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return p.i("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }

    public final String d(boolean z10, int i10, int i11, long j10) {
        return p.i("%s 0x%08x %5d %-13s %d", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(8), Long.valueOf(j10));
    }
}
