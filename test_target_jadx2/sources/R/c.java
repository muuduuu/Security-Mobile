package R;

import A.AbstractC0700h0;
import androidx.camera.extensions.impl.ExtensionVersionImpl;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f8355a;

    private static class a extends c {
        a() {
        }

        @Override // R.c
        e c() {
            return null;
        }
    }

    private static class b extends c {

        /* renamed from: c, reason: collision with root package name */
        private static ExtensionVersionImpl f8356c;

        /* renamed from: b, reason: collision with root package name */
        private e f8357b;

        b() {
            if (f8356c == null) {
                f8356c = new ExtensionVersionImpl();
            }
            e r10 = e.r(f8356c.checkApiVersion(R.b.a().d()));
            if (r10 != null && R.b.a().b().o() == r10.o()) {
                this.f8357b = r10;
            }
            AbstractC0700h0.a("ExtenderVersion", "Selected vendor runtime: " + this.f8357b);
        }

        @Override // R.c
        e c() {
            return this.f8357b;
        }
    }

    private static c a() {
        if (f8355a != null) {
            return f8355a;
        }
        synchronized (c.class) {
            if (f8355a == null) {
                try {
                    f8355a = new b();
                } catch (NoClassDefFoundError unused) {
                    AbstractC0700h0.a("ExtenderVersion", "No versioning extender found. Falling back to default.");
                    f8355a = new a();
                }
            }
        }
        return f8355a;
    }

    public static e b() {
        return a().c();
    }

    public static boolean d(e eVar) {
        return b().b(eVar.o(), eVar.p()) >= 0;
    }

    abstract e c();
}
