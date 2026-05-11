package D7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f1362a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f1363b;

    w(x xVar, Task task) {
        this.f1363b = xVar;
        this.f1362a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N n10;
        N n11;
        N n12;
        InterfaceC0779c interfaceC0779c;
        try {
            interfaceC0779c = this.f1363b.f1365b;
            Task task = (Task) interfaceC0779c.a(this.f1362a);
            if (task == null) {
                this.f1363b.b(new NullPointerException("Continuation returned null"));
                return;
            }
            x xVar = this.f1363b;
            Executor executor = AbstractC0788l.f1344b;
            task.g(executor, xVar);
            task.e(executor, this.f1363b);
            task.b(executor, this.f1363b);
        } catch (C0785i e10) {
            if (e10.getCause() instanceof Exception) {
                n12 = this.f1363b.f1366c;
                n12.p((Exception) e10.getCause());
            } else {
                n11 = this.f1363b.f1366c;
                n11.p(e10);
            }
        } catch (Exception e11) {
            n10 = this.f1363b.f1366c;
            n10.p(e11);
        }
    }
}
