package D7;

import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f1318a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F f1319b;

    E(F f10, Task task) {
        this.f1319b = f10;
        this.f1318a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC0783g interfaceC0783g;
        InterfaceC0783g interfaceC0783g2;
        obj = this.f1319b.f1321b;
        synchronized (obj) {
            try {
                F f10 = this.f1319b;
                interfaceC0783g = f10.f1322c;
                if (interfaceC0783g != null) {
                    interfaceC0783g2 = f10.f1322c;
                    interfaceC0783g2.onSuccess(this.f1318a.getResult());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
