package t7;

/* loaded from: classes2.dex */
public final class Z5 {

    /* renamed from: a, reason: collision with root package name */
    private static Z5 f42804a;

    private Z5() {
    }

    public static synchronized Z5 a() {
        Z5 z52;
        synchronized (Z5.class) {
            try {
                if (f42804a == null) {
                    f42804a = new Z5();
                }
                z52 = f42804a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z52;
    }
}
