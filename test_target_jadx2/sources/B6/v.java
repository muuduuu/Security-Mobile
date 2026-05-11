package B6;

import C6.InterfaceC0753d;
import D6.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f508a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0753d f509b;

    /* renamed from: c, reason: collision with root package name */
    private final x f510c;

    /* renamed from: d, reason: collision with root package name */
    private final D6.b f511d;

    v(Executor executor, InterfaceC0753d interfaceC0753d, x xVar, D6.b bVar) {
        this.f508a = executor;
        this.f509b = interfaceC0753d;
        this.f510c = xVar;
        this.f511d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator it = this.f509b.u0().iterator();
        while (it.hasNext()) {
            this.f510c.b((u6.o) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f511d.a(new b.a() { // from class: B6.u
            @Override // D6.b.a
            public final Object j() {
                Object d10;
                d10 = v.this.d();
                return d10;
            }
        });
    }

    public void c() {
        this.f508a.execute(new Runnable() { // from class: B6.t
            @Override // java.lang.Runnable
            public final void run() {
                v.this.e();
            }
        });
    }
}
