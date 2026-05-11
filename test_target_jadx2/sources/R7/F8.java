package r7;

/* loaded from: classes2.dex */
public final class F8 {

    /* renamed from: a, reason: collision with root package name */
    private static F8 f39392a;

    private F8() {
    }

    public static synchronized F8 a() {
        F8 f82;
        synchronized (F8.class) {
            try {
                if (f39392a == null) {
                    f39392a = new F8();
                }
                f82 = f39392a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f82;
    }
}
