package ke;

import Wd.m;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import pe.C3877e;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f36321a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final String a(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        return d(str, i10, i11, encodeSet, z10, z11, z12, z13, null, 128, null);
    }

    public static final String c(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z13) || StringsKt.J(encodeSet, (char) codePointAt, false, 2, null) || ((codePointAt == 37 && (!z10 || (z11 && !e(str, i12, i11)))) || (codePointAt == 43 && z12)))) {
                C3877e c3877e = new C3877e();
                c3877e.e1(str, i10, i12);
                h(c3877e, str, i12, i11, encodeSet, z10, z11, z12, z13, charset);
                return c3877e.F1();
            }
            i12 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String d(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
        return c(str, (i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? str.length() : i11, str2, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? null : charset);
    }

    public static final boolean e(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && m.D(str.charAt(i10 + 1)) != -1 && m.D(str.charAt(i12)) != -1;
    }

    public static final String f(String str, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (charAt == '+' && z10)) {
                C3877e c3877e = new C3877e();
                c3877e.e1(str, i10, i12);
                i(c3877e, str, i12, i11, z10);
                return c3877e.F1();
            }
        }
        String substring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String g(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return f(str, i10, i11, z10);
    }

    public static final void h(C3877e c3877e, String input, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        Intrinsics.checkNotNullParameter(c3877e, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int i12 = i10;
        C3877e c3877e2 = null;
        while (i12 < i11) {
            int codePointAt = input.codePointAt(i12);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 32 && encodeSet == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                    c3877e.T0("+");
                } else if (codePointAt == 43 && z12) {
                    c3877e.T0(z10 ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z13) || StringsKt.J(encodeSet, (char) codePointAt, false, 2, null) || (codePointAt == 37 && (!z10 || (z11 && !e(input, i12, i11)))))) {
                    if (c3877e2 == null) {
                        c3877e2 = new C3877e();
                    }
                    if (charset == null || Intrinsics.b(charset, Charsets.UTF_8)) {
                        c3877e2.g0(codePointAt);
                    } else {
                        c3877e2.e2(input, i12, Character.charCount(codePointAt) + i12, charset);
                    }
                    while (!c3877e2.p0()) {
                        byte readByte = c3877e2.readByte();
                        c3877e.q0(37);
                        char[] cArr = f36321a;
                        c3877e.q0(cArr[((readByte & 255) >> 4) & 15]);
                        c3877e.q0(cArr[readByte & 15]);
                    }
                } else {
                    c3877e.g0(codePointAt);
                }
            }
            i12 += Character.charCount(codePointAt);
        }
    }

    public static final void i(C3877e c3877e, String encoded, int i10, int i11, boolean z10) {
        int i12;
        Intrinsics.checkNotNullParameter(c3877e, "<this>");
        Intrinsics.checkNotNullParameter(encoded, "encoded");
        while (i10 < i11) {
            int codePointAt = encoded.codePointAt(i10);
            if (codePointAt != 37 || (i12 = i10 + 2) >= i11) {
                if (codePointAt == 43 && z10) {
                    c3877e.q0(32);
                    i10++;
                }
                c3877e.g0(codePointAt);
                i10 += Character.charCount(codePointAt);
            } else {
                int D10 = m.D(encoded.charAt(i10 + 1));
                int D11 = m.D(encoded.charAt(i12));
                if (D10 != -1 && D11 != -1) {
                    c3877e.q0((D10 << 4) + D11);
                    i10 = Character.charCount(codePointAt) + i12;
                }
                c3877e.g0(codePointAt);
                i10 += Character.charCount(codePointAt);
            }
        }
    }
}
