package D7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class v implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1359a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0779c f1360b;

    /* renamed from: c, reason: collision with root package name */
    private final N f1361c;

    public v(Executor executor, InterfaceC0779c interfaceC0779c, N n10) {
        this.f1359a = executor;
        this.f1360b = interfaceC0779c;
        this.f1361c = n10;
    }

    @Override // D7.I
    public final void c(Task task) {
        this.f1359a.execute(new u(this, task));
    }
}
