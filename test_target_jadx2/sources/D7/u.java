package D7;

import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f1357a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f1358b;

    u(v vVar, Task task) {
        this.f1358b = vVar;
        this.f1357a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N n10;
        N n11;
        N n12;
        InterfaceC0779c interfaceC0779c;
        N n13;
        N n14;
        if (this.f1357a.l()) {
            n14 = this.f1358b.f1361c;
            n14.r();
            return;
        }
        try {
            interfaceC0779c = this.f1358b.f1360b;
            Object a10 = interfaceC0779c.a(this.f1357a);
            n13 = this.f1358b.f1361c;
            n13.q(a10);
        } catch (C0785i e10) {
            if (e10.getCause() instanceof Exception) {
                n12 = this.f1358b.f1361c;
                n12.p((Exception) e10.getCause());
            } else {
                n11 = this.f1358b.f1361c;
                n11.p(e10);
            }
        } catch (Exception e11) {
            n10 = this.f1358b.f1361c;
            n10.p(e11);
        }
    }
}
