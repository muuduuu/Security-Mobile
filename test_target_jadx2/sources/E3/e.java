package e3;

/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private static e f32184a;

    public static synchronized e b() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f32184a == null) {
                    f32184a = new e();
                }
                eVar = f32184a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // e3.d
    public void a(InterfaceC3076c interfaceC3076c) {
    }
}
