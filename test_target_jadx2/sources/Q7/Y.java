package q7;

/* loaded from: classes2.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    private static Y f38798a;

    private Y() {
    }

    public static synchronized Y a() {
        Y y10;
        synchronized (Y.class) {
            try {
                if (f38798a == null) {
                    f38798a = new Y();
                }
                y10 = f38798a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return y10;
    }

    public static void b() {
        X.a();
    }
}
