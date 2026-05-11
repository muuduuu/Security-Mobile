package R;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f8353b = new b("1.4.0");

    /* renamed from: a, reason: collision with root package name */
    private final e f8354a;

    public b(String str) {
        this.f8354a = e.r(str);
    }

    public static b a() {
        return f8353b;
    }

    public static boolean c(e eVar) {
        return a().f8354a.b(eVar.o(), eVar.p()) >= 0;
    }

    public e b() {
        return this.f8354a;
    }

    public String d() {
        return this.f8354a.toString();
    }
}
