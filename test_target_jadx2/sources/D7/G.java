package D7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class G implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f1323a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ H f1324b;

    G(H h10, Task task) {
        this.f1324b = h10;
        this.f1323a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0786j interfaceC0786j;
        try {
            interfaceC0786j = this.f1324b.f1326b;
            Task a10 = interfaceC0786j.a(this.f1323a.getResult());
            if (a10 == null) {
                this.f1324b.b(new NullPointerException("Continuation returned null"));
                return;
            }
            H h10 = this.f1324b;
            Executor executor = AbstractC0788l.f1344b;
            a10.g(executor, h10);
            a10.e(executor, this.f1324b);
            a10.b(executor, this.f1324b);
        } catch (C0785i e10) {
            if (e10.getCause() instanceof Exception) {
                this.f1324b.b((Exception) e10.getCause());
            } else {
                this.f1324b.b(e10);
            }
        } catch (CancellationException unused) {
            this.f1324b.a();
        } catch (Exception e11) {
            this.f1324b.b(e11);
        }
    }
}
