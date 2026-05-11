package A;

import android.os.Handler;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.m1;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: A.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721y implements H.m {

    /* renamed from: J, reason: collision with root package name */
    static final V.a f276J = V.a.a("camerax.core.appConfig.cameraFactoryProvider", F.a.class);

    /* renamed from: K, reason: collision with root package name */
    static final V.a f277K = V.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", E.a.class);

    /* renamed from: L, reason: collision with root package name */
    static final V.a f278L = V.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", m1.c.class);

    /* renamed from: M, reason: collision with root package name */
    static final V.a f279M = V.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: N, reason: collision with root package name */
    static final V.a f280N = V.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: O, reason: collision with root package name */
    static final V.a f281O = V.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: P, reason: collision with root package name */
    static final V.a f282P = V.a.a("camerax.core.appConfig.availableCamerasLimiter", r.class);

    /* renamed from: Q, reason: collision with root package name */
    static final V.a f283Q = V.a.a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);

    /* renamed from: R, reason: collision with root package name */
    static final V.a f284R = V.a.a("camerax.core.appConfig.cameraProviderInitRetryPolicy", u0.class);

    /* renamed from: S, reason: collision with root package name */
    static final V.a f285S = V.a.a("camerax.core.appConfig.quirksSettings", androidx.camera.core.impl.L0.class);

    /* renamed from: I, reason: collision with root package name */
    private final androidx.camera.core.impl.G0 f286I;

    /* renamed from: A.y$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.B0 f287a;

        public a() {
            this(androidx.camera.core.impl.B0.d0());
        }

        private androidx.camera.core.impl.A0 b() {
            return this.f287a;
        }

        public C0721y a() {
            return new C0721y(androidx.camera.core.impl.G0.b0(this.f287a));
        }

        public a c(F.a aVar) {
            b().x(C0721y.f276J, aVar);
            return this;
        }

        public a d(E.a aVar) {
            b().x(C0721y.f277K, aVar);
            return this;
        }

        public a e(Class cls) {
            b().x(H.m.f3079c, cls);
            if (b().f(H.m.f3078b, null) == null) {
                f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a f(String str) {
            b().x(H.m.f3078b, str);
            return this;
        }

        public a g(m1.c cVar) {
            b().x(C0721y.f278L, cVar);
            return this;
        }

        private a(androidx.camera.core.impl.B0 b02) {
            this.f287a = b02;
            Class cls = (Class) b02.f(H.m.f3079c, null);
            if (cls == null || cls.equals(C0720x.class)) {
                e(C0720x.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* renamed from: A.y$b */
    public interface b {
        C0721y getCameraXConfig();
    }

    C0721y(androidx.camera.core.impl.G0 g02) {
        this.f286I = g02;
    }

    public r Z(r rVar) {
        return (r) this.f286I.f(f282P, rVar);
    }

    public Executor a0(Executor executor) {
        return (Executor) this.f286I.f(f279M, executor);
    }

    public F.a b0(F.a aVar) {
        return (F.a) this.f286I.f(f276J, aVar);
    }

    public long c0() {
        return ((Long) this.f286I.f(f283Q, -1L)).longValue();
    }

    public u0 d0() {
        u0 u0Var = (u0) this.f286I.f(f284R, u0.f234b);
        Objects.requireNonNull(u0Var);
        return u0Var;
    }

    public E.a e0(E.a aVar) {
        return (E.a) this.f286I.f(f277K, aVar);
    }

    public androidx.camera.core.impl.L0 f0() {
        return (androidx.camera.core.impl.L0) this.f286I.f(f285S, null);
    }

    public Handler g0(Handler handler) {
        return (Handler) this.f286I.f(f280N, handler);
    }

    public m1.c h0(m1.c cVar) {
        return (m1.c) this.f286I.f(f278L, cVar);
    }

    @Override // androidx.camera.core.impl.Q0
    public androidx.camera.core.impl.V n() {
        return this.f286I;
    }
}
