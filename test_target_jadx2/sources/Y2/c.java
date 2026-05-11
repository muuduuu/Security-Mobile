package Y2;

/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private static c f11997a;

    private c() {
    }

    public static synchronized c b() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f11997a == null) {
                    f11997a = new c();
                }
                cVar = f11997a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // Y2.b
    public void a(a aVar) {
    }
}
