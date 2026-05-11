package s7;

/* loaded from: classes2.dex */
public abstract class G5 {

    /* renamed from: a, reason: collision with root package name */
    private static F5 f40883a;

    public static synchronized C4492x5 a(AbstractC4457s5 abstractC4457s5) {
        C4492x5 c4492x5;
        synchronized (G5.class) {
            try {
                if (f40883a == null) {
                    f40883a = new F5(null);
                }
                c4492x5 = (C4492x5) f40883a.b(abstractC4457s5);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4492x5;
    }

    public static synchronized C4492x5 b(String str) {
        C4492x5 a10;
        synchronized (G5.class) {
            a10 = a(AbstractC4457s5.d("vision-common").c());
        }
        return a10;
    }
}
