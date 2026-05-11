package D7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class F implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1320a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1321b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0783g f1322c;

    public F(Executor executor, InterfaceC0783g interfaceC0783g) {
        this.f1320a = executor;
        this.f1322c = interfaceC0783g;
    }

    @Override // D7.I
    public final void c(Task task) {
        if (task.isSuccessful()) {
            synchronized (this.f1321b) {
                try {
                    if (this.f1322c == null) {
                        return;
                    }
                    this.f1320a.execute(new E(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
