package E;

import android.os.Build;
import android.util.CloseGuard;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final b f1809a;

    static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private final CloseGuard f1810a = new CloseGuard();

        a() {
        }

        @Override // E.d.b
        public void a() {
            this.f1810a.warnIfOpen();
        }

        @Override // E.d.b
        public void b(String str) {
            this.f1810a.open(str);
        }

        @Override // E.d.b
        public void close() {
            this.f1810a.close();
        }
    }

    private interface b {
        void a();

        void b(String str);

        void close();
    }

    private d(b bVar) {
        this.f1809a = bVar;
    }

    public static d b() {
        return Build.VERSION.SDK_INT >= 30 ? new d(new a()) : new d(new c());
    }

    public void a() {
        this.f1809a.close();
    }

    public void c(String str) {
        this.f1809a.b(str);
    }

    public void d() {
        this.f1809a.a();
    }

    static final class c implements b {
        c() {
        }

        @Override // E.d.b
        public void b(String str) {
            y0.f.h(str, "CloseMethodName must not be null.");
        }

        @Override // E.d.b
        public void a() {
        }

        @Override // E.d.b
        public void close() {
        }
    }
}
