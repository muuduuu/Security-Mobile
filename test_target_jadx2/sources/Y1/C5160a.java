package y1;

import C1.u;
import androidx.work.impl.InterfaceC1636w;
import java.util.HashMap;
import java.util.Map;
import x1.InterfaceC5098b;
import x1.n;
import x1.w;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5160a {

    /* renamed from: e, reason: collision with root package name */
    static final String f45133e = n.i("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC1636w f45134a;

    /* renamed from: b, reason: collision with root package name */
    private final w f45135b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5098b f45136c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f45137d = new HashMap();

    /* renamed from: y1.a$a, reason: collision with other inner class name */
    class RunnableC0660a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f45138a;

        RunnableC0660a(u uVar) {
            this.f45138a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.e().a(C5160a.f45133e, "Scheduling work " + this.f45138a.f790a);
            C5160a.this.f45134a.a(this.f45138a);
        }
    }

    public C5160a(InterfaceC1636w interfaceC1636w, w wVar, InterfaceC5098b interfaceC5098b) {
        this.f45134a = interfaceC1636w;
        this.f45135b = wVar;
        this.f45136c = interfaceC5098b;
    }

    public void a(u uVar, long j10) {
        Runnable runnable = (Runnable) this.f45137d.remove(uVar.f790a);
        if (runnable != null) {
            this.f45135b.b(runnable);
        }
        RunnableC0660a runnableC0660a = new RunnableC0660a(uVar);
        this.f45137d.put(uVar.f790a, runnableC0660a);
        this.f45135b.a(j10 - this.f45136c.a(), runnableC0660a);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f45137d.remove(str);
        if (runnable != null) {
            this.f45135b.b(runnable);
        }
    }
}
