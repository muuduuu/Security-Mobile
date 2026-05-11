package n4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f37566a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final a f37567b = new C0573b();

    /* renamed from: c, reason: collision with root package name */
    private static c f37568c;

    public interface a {
    }

    /* renamed from: n4.b$b, reason: collision with other inner class name */
    private static final class C0573b implements a {
    }

    public interface c {
        void a(String str);

        void b();

        boolean isTracing();
    }

    private b() {
    }

    public static final void a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        f37566a.c().a(name);
    }

    public static final void b() {
        f37566a.c().b();
    }

    private final c c() {
        C3707a c3707a;
        c cVar = f37568c;
        if (cVar != null) {
            return cVar;
        }
        synchronized (b.class) {
            c3707a = new C3707a();
            f37568c = c3707a;
        }
        return c3707a;
    }

    public static final boolean d() {
        return f37566a.c().isTracing();
    }
}
