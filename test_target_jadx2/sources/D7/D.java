package D7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class D implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1315a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1316b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0782f f1317c;

    public D(Executor executor, InterfaceC0782f interfaceC0782f) {
        this.f1315a = executor;
        this.f1317c = interfaceC0782f;
    }

    @Override // D7.I
    public final void c(Task task) {
        if (task.isSuccessful() || task.l()) {
            return;
        }
        synchronized (this.f1316b) {
            try {
                if (this.f1317c == null) {
                    return;
                }
                this.f1315a.execute(new C(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
