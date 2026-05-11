package s7;

/* loaded from: classes2.dex */
public final class K5 {

    /* renamed from: a, reason: collision with root package name */
    private static K5 f40952a;

    private K5() {
    }

    public static synchronized K5 a() {
        K5 k52;
        synchronized (K5.class) {
            try {
                if (f40952a == null) {
                    f40952a = new K5();
                }
                k52 = f40952a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k52;
    }

    public static final boolean b() {
        return J5.a("mlkit-dev-profiling");
    }
}
