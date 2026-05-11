package kotlin.text;

import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.conscrypt.BuildConfig;
import u5.C4870a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "(C)Z", "char", BuildConfig.FLAVOR, "radix", C4870a.f43493a, "(CI)I", "checkRadix", "(I)I", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes3.dex */
public class CharsKt__CharJVMKt {
    public static final int a(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    public static boolean b(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static int checkRadix(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new IntRange(2, 36));
    }
}
