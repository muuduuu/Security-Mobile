package D7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class H implements InterfaceC0783g, InterfaceC0782f, InterfaceC0781e, I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1325a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0786j f1326b;

    /* renamed from: c, reason: collision with root package name */
    private final N f1327c;

    public H(Executor executor, InterfaceC0786j interfaceC0786j, N n10) {
        this.f1325a = executor;
        this.f1326b = interfaceC0786j;
        this.f1327c = n10;
    }

    @Override // D7.InterfaceC0781e
    public final void a() {
        this.f1327c.r();
    }

    @Override // D7.InterfaceC0782f
    public final void b(Exception exc) {
        this.f1327c.p(exc);
    }

    @Override // D7.I
    public final void c(Task task) {
        this.f1325a.execute(new G(this, task));
    }

    @Override // D7.InterfaceC0783g
    public final void onSuccess(Object obj) {
        this.f1327c.q(obj);
    }
}
