package j4;

/* loaded from: classes.dex */
public class z implements G {

    /* renamed from: a, reason: collision with root package name */
    private static z f35839a;

    private z() {
    }

    public static synchronized z h() {
        z zVar;
        synchronized (z.class) {
            try {
                if (f35839a == null) {
                    f35839a = new z();
                }
                zVar = f35839a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVar;
    }

    @Override // j4.G
    public void d() {
    }

    @Override // j4.G
    public void f() {
    }

    @Override // j4.G
    public void a(int i10) {
    }

    @Override // j4.G
    public void b(int i10) {
    }

    @Override // j4.G
    public void c(com.facebook.imagepipeline.memory.a aVar) {
    }

    @Override // j4.G
    public void e(int i10) {
    }

    @Override // j4.G
    public void g(int i10) {
    }
}
