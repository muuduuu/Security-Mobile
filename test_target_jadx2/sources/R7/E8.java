package r7;

/* loaded from: classes2.dex */
public abstract class E8 {

    /* renamed from: a, reason: collision with root package name */
    private static D8 f39360a;

    public static synchronized C4217s8 a(AbstractC4138k8 abstractC4138k8) {
        C4217s8 c4217s8;
        synchronized (E8.class) {
            try {
                if (f39360a == null) {
                    f39360a = new D8(null);
                }
                c4217s8 = (C4217s8) f39360a.b(abstractC4138k8);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4217s8;
    }

    public static synchronized C4217s8 b(String str) {
        C4217s8 a10;
        synchronized (E8.class) {
            a10 = a(AbstractC4138k8.d(str).c());
        }
        return a10;
    }
}
