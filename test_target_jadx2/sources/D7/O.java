package D7;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class O implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ N f1339a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f1340b;

    O(N n10, Callable callable) {
        this.f1339a = n10;
        this.f1340b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1339a.q(this.f1340b.call());
        } catch (Exception e10) {
            this.f1339a.p(e10);
        } catch (Throwable th) {
            this.f1339a.p(new RuntimeException(th));
        }
    }
}
