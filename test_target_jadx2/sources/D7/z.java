package D7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class z implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1368a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1369b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0781e f1370c;

    public z(Executor executor, InterfaceC0781e interfaceC0781e) {
        this.f1368a = executor;
        this.f1370c = interfaceC0781e;
    }

    @Override // D7.I
    public final void c(Task task) {
        if (task.l()) {
            synchronized (this.f1369b) {
                try {
                    if (this.f1370c == null) {
                        return;
                    }
                    this.f1368a.execute(new y(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
