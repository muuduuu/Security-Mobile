package E8;

/* loaded from: classes2.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private static b f1914a;

    private b() {
    }

    public static b b() {
        if (f1914a == null) {
            f1914a = new b();
        }
        return f1914a;
    }

    @Override // E8.a
    public long a() {
        return System.currentTimeMillis();
    }
}
