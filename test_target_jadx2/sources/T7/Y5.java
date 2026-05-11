package t7;

/* loaded from: classes2.dex */
public abstract class Y5 {

    /* renamed from: a, reason: collision with root package name */
    private static X5 f42784a;

    public static synchronized M5 a(D5 d52) {
        M5 m52;
        synchronized (Y5.class) {
            try {
                if (f42784a == null) {
                    f42784a = new X5(null);
                }
                m52 = (M5) f42784a.b(d52);
            } catch (Throwable th) {
                throw th;
            }
        }
        return m52;
    }

    public static synchronized M5 b(String str) {
        M5 a10;
        synchronized (Y5.class) {
            a10 = a(D5.d(str).c());
        }
        return a10;
    }
}
