package D7;

import V6.AbstractC1287s;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
final class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f1313a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D f1314b;

    C(D d10, Task task) {
        this.f1314b = d10;
        this.f1313a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC0782f interfaceC0782f;
        InterfaceC0782f interfaceC0782f2;
        obj = this.f1314b.f1316b;
        synchronized (obj) {
            try {
                D d10 = this.f1314b;
                interfaceC0782f = d10.f1317c;
                if (interfaceC0782f != null) {
                    interfaceC0782f2 = d10.f1317c;
                    interfaceC0782f2.b((Exception) AbstractC1287s.m(this.f1313a.getException()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
