package q7;

/* loaded from: classes2.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    private static V f38796a;

    public static synchronized N a(J j10) {
        N n10;
        synchronized (W.class) {
            try {
                if (f38796a == null) {
                    f38796a = new V(null);
                }
                n10 = (N) f38796a.b(j10);
            } catch (Throwable th) {
                throw th;
            }
        }
        return n10;
    }

    public static synchronized N b(String str) {
        N a10;
        synchronized (W.class) {
            a10 = a(J.d("common").c());
        }
        return a10;
    }
}
