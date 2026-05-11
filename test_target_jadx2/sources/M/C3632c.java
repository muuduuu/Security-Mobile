package m;

import java.util.concurrent.Executor;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3632c extends AbstractC3634e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile C3632c f37249c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f37250d = new Executor() { // from class: m.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C3632c.i(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f37251e = new Executor() { // from class: m.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C3632c.j(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private AbstractC3634e f37252a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3634e f37253b;

    private C3632c() {
        C3633d c3633d = new C3633d();
        this.f37253b = c3633d;
        this.f37252a = c3633d;
    }

    public static Executor g() {
        return f37251e;
    }

    public static C3632c h() {
        if (f37249c != null) {
            return f37249c;
        }
        synchronized (C3632c.class) {
            try {
                if (f37249c == null) {
                    f37249c = new C3632c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f37249c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Runnable runnable) {
        h().d(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Runnable runnable) {
        h().a(runnable);
    }

    @Override // m.AbstractC3634e
    public void a(Runnable runnable) {
        this.f37252a.a(runnable);
    }

    @Override // m.AbstractC3634e
    public boolean c() {
        return this.f37252a.c();
    }

    @Override // m.AbstractC3634e
    public void d(Runnable runnable) {
        this.f37252a.d(runnable);
    }
}
