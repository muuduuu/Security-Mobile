package Jd;

import Od.C1080h;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import lc.o;

/* loaded from: classes3.dex */
public abstract class Z extends Qd.h {

    /* renamed from: c, reason: collision with root package name */
    public int f5021c;

    public Z(int i10) {
        this.f5021c = i10;
    }

    public abstract kotlin.coroutines.d e();

    public Throwable f(Object obj) {
        B b10 = obj instanceof B ? (B) obj : null;
        if (b10 != null) {
            return b10.f4974a;
        }
        return null;
    }

    public final void i(Throwable th) {
        L.a(e().getContext(), new Q("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            kotlin.coroutines.d e10 = e();
            Intrinsics.e(e10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C1080h c1080h = (C1080h) e10;
            kotlin.coroutines.d dVar = c1080h.f7322e;
            Object obj = c1080h.f7324g;
            CoroutineContext context = dVar.getContext();
            Object i10 = Od.K.i(context, obj);
            InterfaceC0915w0 interfaceC0915w0 = null;
            T0 m10 = i10 != Od.K.f7306a ? H.m(dVar, context, i10) : null;
            try {
                CoroutineContext context2 = dVar.getContext();
                Object j10 = j();
                Throwable f10 = f(j10);
                if (f10 == null && AbstractC0872a0.b(this.f5021c)) {
                    interfaceC0915w0 = (InterfaceC0915w0) context2.a(InterfaceC0915w0.f5070O);
                }
                if (interfaceC0915w0 != null && !interfaceC0915w0.b()) {
                    CancellationException p10 = interfaceC0915w0.p();
                    a(j10, p10);
                    o.a aVar = lc.o.f37128b;
                    dVar.resumeWith(lc.o.b(lc.p.a(p10)));
                } else if (f10 != null) {
                    o.a aVar2 = lc.o.f37128b;
                    dVar.resumeWith(lc.o.b(lc.p.a(f10)));
                } else {
                    o.a aVar3 = lc.o.f37128b;
                    dVar.resumeWith(lc.o.b(g(j10)));
                }
                Unit unit = Unit.f36324a;
                if (m10 == null || m10.V0()) {
                    Od.K.f(context, i10);
                }
            } catch (Throwable th) {
                if (m10 == null || m10.V0()) {
                    Od.K.f(context, i10);
                }
                throw th;
            }
        } catch (Throwable th2) {
            i(th2);
        }
    }

    public Object g(Object obj) {
        return obj;
    }

    public void a(Object obj, Throwable th) {
    }
}
