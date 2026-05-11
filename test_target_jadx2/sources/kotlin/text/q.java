package kotlin.text;

import java.util.Comparator;
import kotlin.collections.AbstractC3568c;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import xc.C5146G;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class q extends StringsKt__StringNumberConversionsKt {
    public static final String A(String str, String oldValue, String newValue, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int X10 = StringsKt.X(str, oldValue, 0, z10, 2, null);
        return X10 < 0 ? str : StringsKt__StringsKt.s0(str, X10, oldValue.length() + X10, newValue).toString();
    }

    public static /* synthetic */ String B(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return A(str, str2, str3, z10);
    }

    public static boolean C(String str, String prefix, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : StringsKt.t(str, i10, prefix, 0, prefix.length(), z10);
    }

    public static boolean D(String str, String prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : StringsKt.t(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean E(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return StringsKt.C(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean F(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return StringsKt.D(str, str2, z10);
    }

    public static String n(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static String o(char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractC3568c.f36342a.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static boolean p(String str, String suffix, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : StringsKt.t(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean q(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return StringsKt.p(str, str2, z10);
    }

    public static boolean r(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator s(C5146G c5146g) {
        Intrinsics.checkNotNullParameter(c5146g, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean t(String str, int i10, String other, int i11, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static /* synthetic */ boolean u(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return StringsKt.t(str, i10, str2, i11, i12, z10);
    }

    public static String v(CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return BuildConfig.FLAVOR;
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return BuildConfig.FLAVOR;
        }
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.d(sb3);
        return sb3;
    }

    public static final String w(String str, char c10, char c11, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z10) {
            String replace = str.replace(c10, c11);
            Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (a.c(charAt, c10, z10)) {
                charAt = c11;
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final String x(String str, String oldValue, String newValue, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i10 = 0;
        int T10 = StringsKt.T(str, oldValue, 0, z10);
        if (T10 < 0) {
            return str;
        }
        int length = oldValue.length();
        int d10 = kotlin.ranges.d.d(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, T10);
            sb2.append(newValue);
            i10 = T10 + length;
            if (T10 >= str.length()) {
                break;
            }
            T10 = StringsKt.T(str, oldValue, T10 + d10, z10);
        } while (T10 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static /* synthetic */ String y(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return w(str, c10, c11, z10);
    }

    public static /* synthetic */ String z(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return x(str, str2, str3, z10);
    }
}
