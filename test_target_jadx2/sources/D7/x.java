package D7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class x implements InterfaceC0783g, InterfaceC0782f, InterfaceC0781e, I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1364a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0779c f1365b;

    /* renamed from: c, reason: collision with root package name */
    private final N f1366c;

    public x(Executor executor, InterfaceC0779c interfaceC0779c, N n10) {
        this.f1364a = executor;
        this.f1365b = interfaceC0779c;
        this.f1366c = n10;
    }

    @Override // D7.InterfaceC0781e
    public final void a() {
        this.f1366c.r();
    }

    @Override // D7.InterfaceC0782f
    public final void b(Exception exc) {
        this.f1366c.p(exc);
    }

    @Override // D7.I
    public final void c(Task task) {
        this.f1364a.execute(new w(this, task));
    }

    @Override // D7.InterfaceC0783g
    public final void onSuccess(Object obj) {
        this.f1366c.q(obj);
    }
}
