package A;

import A.u0;
import androidx.camera.core.impl.K;
import androidx.camera.core.impl.U0;
import androidx.camera.core.impl.f1;

/* loaded from: classes.dex */
public interface u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f233a = new u0() { // from class: A.t0
        @Override // A.u0
        public final u0.c f(u0.b bVar) {
            u0.c b10;
            b10 = u0.b(bVar);
            return b10;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f234b = new K.b(a());

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f235c = new androidx.camera.core.impl.K(a());

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final u0 f236a;

        /* renamed from: b, reason: collision with root package name */
        private long f237b;

        public a(u0 u0Var) {
            this.f236a = u0Var;
            this.f237b = u0Var.c();
        }

        public u0 a() {
            u0 u0Var = this.f236a;
            return u0Var instanceof U0 ? ((U0) u0Var).e(this.f237b) : new f1(this.f237b, this.f236a);
        }
    }

    public interface b {
        int c();

        Throwable d();

        long e();
    }

    public static final class c {

        /* renamed from: d, reason: collision with root package name */
        public static final c f238d = new c(false, 0);

        /* renamed from: e, reason: collision with root package name */
        public static final c f239e = new c(true);

        /* renamed from: f, reason: collision with root package name */
        public static final c f240f = new c(true, 100);

        /* renamed from: g, reason: collision with root package name */
        public static c f241g = new c(false, 0, true);

        /* renamed from: a, reason: collision with root package name */
        private final long f242a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f243b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f244c;

        private c(boolean z10) {
            this(z10, a());
        }

        public static long a() {
            return 500L;
        }

        public long b() {
            return this.f242a;
        }

        public boolean c() {
            return this.f244c;
        }

        public boolean d() {
            return this.f243b;
        }

        private c(boolean z10, long j10) {
            this(z10, j10, false);
        }

        private c(boolean z10, long j10, boolean z11) {
            this.f243b = z10;
            this.f242a = j10;
            if (z11) {
                y0.f.b(!z10, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f244c = z11;
        }
    }

    static long a() {
        return 6000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ c b(b bVar) {
        return c.f238d;
    }

    default long c() {
        return 0L;
    }

    c f(b bVar);
}
