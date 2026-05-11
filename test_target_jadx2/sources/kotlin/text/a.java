package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class a extends CharsKt__CharJVMKt {
    public static final boolean c(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean d(char c10) {
        return 55296 <= c10 && c10 < 57344;
    }
}
