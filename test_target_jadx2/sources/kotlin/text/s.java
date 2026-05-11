package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class s extends r {
    public static final String T0(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(kotlin.ranges.d.h(i10, str.length()));
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String U0(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            return StringsKt.W0(str, kotlin.ranges.d.d(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char V0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt.R(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String W0(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(0, kotlin.ranges.d.h(i10, str.length()));
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
