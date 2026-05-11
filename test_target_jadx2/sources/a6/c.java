package A6;

import B6.x;
import C6.InterfaceC0753d;
import D6.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import s6.InterfaceC4324j;
import u6.o;
import u6.t;
import v6.InterfaceC4953e;
import v6.InterfaceC4961m;

/* loaded from: classes2.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f359f = Logger.getLogger(t.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final x f360a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f361b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4953e f362c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0753d f363d;

    /* renamed from: e, reason: collision with root package name */
    private final D6.b f364e;

    public c(Executor executor, InterfaceC4953e interfaceC4953e, x xVar, InterfaceC0753d interfaceC0753d, D6.b bVar) {
        this.f361b = executor;
        this.f362c = interfaceC4953e;
        this.f360a = xVar;
        this.f363d = interfaceC0753d;
        this.f364e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(o oVar, u6.i iVar) {
        this.f363d.q1(oVar, iVar);
        this.f360a.b(oVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final o oVar, InterfaceC4324j interfaceC4324j, u6.i iVar) {
        try {
            InterfaceC4961m a10 = this.f362c.a(oVar.b());
            if (a10 == null) {
                String format = String.format("Transport backend '%s' is not registered", oVar.b());
                f359f.warning(format);
                interfaceC4324j.a(new IllegalArgumentException(format));
            } else {
                final u6.i b10 = a10.b(iVar);
                this.f364e.a(new b.a() { // from class: A6.b
                    @Override // D6.b.a
                    public final Object j() {
                        Object d10;
                        d10 = c.this.d(oVar, b10);
                        return d10;
                    }
                });
                interfaceC4324j.a(null);
            }
        } catch (Exception e10) {
            f359f.warning("Error scheduling event " + e10.getMessage());
            interfaceC4324j.a(e10);
        }
    }

    @Override // A6.e
    public void a(final o oVar, final u6.i iVar, final InterfaceC4324j interfaceC4324j) {
        this.f361b.execute(new Runnable() { // from class: A6.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.e(oVar, interfaceC4324j, iVar);
            }
        });
    }
}
