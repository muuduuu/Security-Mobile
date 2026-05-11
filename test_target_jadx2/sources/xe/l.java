package xe;

import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
final class l {

    /* renamed from: d, reason: collision with root package name */
    static final l[] f45118d = {new l(BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 0, " "), new l(" ", 0, " "), new l(BuildConfig.FLAVOR, 12, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 10, " "), new l(BuildConfig.FLAVOR, 0, " the "), new l(" ", 0, BuildConfig.FLAVOR), new l("s ", 0, " "), new l(BuildConfig.FLAVOR, 0, " of "), new l(BuildConfig.FLAVOR, 10, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 0, " and "), new l(BuildConfig.FLAVOR, 13, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 1, BuildConfig.FLAVOR), new l(", ", 0, " "), new l(BuildConfig.FLAVOR, 0, ", "), new l(" ", 10, " "), new l(BuildConfig.FLAVOR, 0, " in "), new l(BuildConfig.FLAVOR, 0, " to "), new l("e ", 0, " "), new l(BuildConfig.FLAVOR, 0, "\""), new l(BuildConfig.FLAVOR, 0, "."), new l(BuildConfig.FLAVOR, 0, "\">"), new l(BuildConfig.FLAVOR, 0, "\n"), new l(BuildConfig.FLAVOR, 3, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 0, "]"), new l(BuildConfig.FLAVOR, 0, " for "), new l(BuildConfig.FLAVOR, 14, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 2, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 0, " a "), new l(BuildConfig.FLAVOR, 0, " that "), new l(" ", 10, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 0, ". "), new l(".", 0, BuildConfig.FLAVOR), new l(" ", 0, ", "), new l(BuildConfig.FLAVOR, 15, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 0, " with "), new l(BuildConfig.FLAVOR, 0, "'"), new l(BuildConfig.FLAVOR, 0, " from "), new l(BuildConfig.FLAVOR, 0, " by "), new l(BuildConfig.FLAVOR, 16, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 17, BuildConfig.FLAVOR), new l(" the ", 0, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 4, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 0, ". The "), new l(BuildConfig.FLAVOR, 11, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 0, " on "), new l(BuildConfig.FLAVOR, 0, " as "), new l(BuildConfig.FLAVOR, 0, " is "), new l(BuildConfig.FLAVOR, 7, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 1, "ing "), new l(BuildConfig.FLAVOR, 0, "\n\t"), new l(BuildConfig.FLAVOR, 0, ":"), new l(" ", 0, ". "), new l(BuildConfig.FLAVOR, 0, "ed "), new l(BuildConfig.FLAVOR, 20, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 18, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 6, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 0, "("), new l(BuildConfig.FLAVOR, 10, ", "), new l(BuildConfig.FLAVOR, 8, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 0, " at "), new l(BuildConfig.FLAVOR, 0, "ly "), new l(" the ", 0, " of "), new l(BuildConfig.FLAVOR, 5, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 9, BuildConfig.FLAVOR), new l(" ", 10, ", "), new l(BuildConfig.FLAVOR, 10, "\""), new l(".", 0, "("), new l(BuildConfig.FLAVOR, 11, " "), new l(BuildConfig.FLAVOR, 10, "\">"), new l(BuildConfig.FLAVOR, 0, "=\""), new l(" ", 0, "."), new l(".com/", 0, BuildConfig.FLAVOR), new l(" the ", 0, " of the "), new l(BuildConfig.FLAVOR, 10, "'"), new l(BuildConfig.FLAVOR, 0, ". This "), new l(BuildConfig.FLAVOR, 0, ","), new l(".", 0, " "), new l(BuildConfig.FLAVOR, 10, "("), new l(BuildConfig.FLAVOR, 10, "."), new l(BuildConfig.FLAVOR, 0, " not "), new l(" ", 0, "=\""), new l(BuildConfig.FLAVOR, 0, "er "), new l(" ", 11, " "), new l(BuildConfig.FLAVOR, 0, "al "), new l(" ", 11, BuildConfig.FLAVOR), new l(BuildConfig.FLAVOR, 0, "='"), new l(BuildConfig.FLAVOR, 11, "\""), new l(BuildConfig.FLAVOR, 10, ". "), new l(" ", 0, "("), new l(BuildConfig.FLAVOR, 0, "ful "), new l(" ", 10, ". "), new l(BuildConfig.FLAVOR, 0, "ive "), new l(BuildConfig.FLAVOR, 0, "less "), new l(BuildConfig.FLAVOR, 11, "'"), new l(BuildConfig.FLAVOR, 0, "est "), new l(" ", 10, "."), new l(BuildConfig.FLAVOR, 11, "\">"), new l(" ", 0, "='"), new l(BuildConfig.FLAVOR, 10, ","), new l(BuildConfig.FLAVOR, 0, "ize "), new l(BuildConfig.FLAVOR, 11, "."), new l("Â ", 0, BuildConfig.FLAVOR), new l(" ", 0, ","), new l(BuildConfig.FLAVOR, 10, "=\""), new l(BuildConfig.FLAVOR, 11, "=\""), new l(BuildConfig.FLAVOR, 0, "ous "), new l(BuildConfig.FLAVOR, 11, ", "), new l(BuildConfig.FLAVOR, 10, "='"), new l(" ", 10, ","), new l(" ", 11, "=\""), new l(" ", 11, ", "), new l(BuildConfig.FLAVOR, 11, ","), new l(BuildConfig.FLAVOR, 11, "("), new l(BuildConfig.FLAVOR, 11, ". "), new l(" ", 11, "."), new l(BuildConfig.FLAVOR, 11, "='"), new l(" ", 11, ". "), new l(" ", 10, "=\""), new l(" ", 11, "='"), new l(" ", 10, "='")};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f45119a;

    /* renamed from: b, reason: collision with root package name */
    private final int f45120b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f45121c;

    l(String str, int i10, String str2) {
        this.f45119a = a(str);
        this.f45120b = i10;
        this.f45121c = a(str2);
    }

    static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    static int b(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, l lVar) {
        int i13 = i10;
        for (byte b10 : lVar.f45119a) {
            bArr[i13] = b10;
            i13++;
        }
        int i14 = lVar.f45120b;
        int a10 = n.a(i14);
        if (a10 > i12) {
            a10 = i12;
        }
        int i15 = i11 + a10;
        int b11 = (i12 - a10) - n.b(i14);
        int i16 = b11;
        while (i16 > 0) {
            bArr[i13] = bArr2[i15];
            i16--;
            i13++;
            i15++;
        }
        if (i14 == 11 || i14 == 10) {
            int i17 = i13 - b11;
            if (i14 == 10) {
                b11 = 1;
            }
            while (b11 > 0) {
                byte b12 = bArr[i17];
                int i18 = b12 & 255;
                if (i18 < 192) {
                    if (i18 >= 97 && i18 <= 122) {
                        bArr[i17] = (byte) (b12 ^ 32);
                    }
                    i17++;
                    b11--;
                } else if (i18 < 224) {
                    int i19 = i17 + 1;
                    bArr[i19] = (byte) (bArr[i19] ^ 32);
                    i17 += 2;
                    b11 -= 2;
                } else {
                    int i20 = i17 + 2;
                    bArr[i20] = (byte) (bArr[i20] ^ 5);
                    i17 += 3;
                    b11 -= 3;
                }
            }
        }
        for (byte b13 : lVar.f45121c) {
            bArr[i13] = b13;
            i13++;
        }
        return i13 - i10;
    }
}
