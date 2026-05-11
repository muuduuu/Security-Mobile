package androidx.work;

import android.content.Context;
import h8.d;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import x1.AbstractC5096C;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f18146a;

    /* renamed from: b, reason: collision with root package name */
    private WorkerParameters f18147b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f18148c = -256;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18149d;

    public static abstract class a {

        /* renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C0312a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f18150a;

            public C0312a() {
                this(androidx.work.b.f18143c);
            }

            public androidx.work.b e() {
                return this.f18150a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0312a.class != obj.getClass()) {
                    return false;
                }
                return this.f18150a.equals(((C0312a) obj).f18150a);
            }

            public int hashCode() {
                return (C0312a.class.getName().hashCode() * 31) + this.f18150a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f18150a + '}';
            }

            public C0312a(androidx.work.b bVar) {
                this.f18150a = bVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        public static final class C0313c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f18151a;

            public C0313c() {
                this(androidx.work.b.f18143c);
            }

            public androidx.work.b e() {
                return this.f18151a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0313c.class != obj.getClass()) {
                    return false;
                }
                return this.f18151a.equals(((C0313c) obj).f18151a);
            }

            public int hashCode() {
                return (C0313c.class.getName().hashCode() * 31) + this.f18151a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f18151a + '}';
            }

            public C0313c(androidx.work.b bVar) {
                this.f18151a = bVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0312a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new C0313c();
        }

        public static a d(androidx.work.b bVar) {
            return new C0313c(bVar);
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f18146a = context;
        this.f18147b = workerParameters;
    }

    public final Context a() {
        return this.f18146a;
    }

    public Executor b() {
        return this.f18147b.a();
    }

    public d c() {
        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
        t10.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t10;
    }

    public final UUID e() {
        return this.f18147b.c();
    }

    public final b f() {
        return this.f18147b.d();
    }

    public final int g() {
        return this.f18148c;
    }

    public final Set h() {
        return this.f18147b.e();
    }

    public E1.b i() {
        return this.f18147b.f();
    }

    public AbstractC5096C j() {
        return this.f18147b.g();
    }

    public final boolean k() {
        return this.f18148c != -256;
    }

    public final boolean l() {
        return this.f18149d;
    }

    public void m() {
    }

    public final void n() {
        this.f18149d = true;
    }

    public abstract d o();

    public final void p(int i10) {
        this.f18148c = i10;
        m();
    }
}
