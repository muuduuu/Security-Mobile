package N6;

/* loaded from: classes2.dex */
public abstract class c extends S6.d {
    public static String a(int i10) {
        switch (i10) {
            case 12500:
                return "A non-recoverable sign in failure occurred";
            case 12501:
                return "Sign in action cancelled";
            case 12502:
                return "Sign-in in progress";
            default:
                return S6.d.a(i10);
        }
    }
}
