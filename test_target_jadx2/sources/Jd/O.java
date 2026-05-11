package Jd;

import Od.C1076d;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public abstract class O {
    public static final N a(CoroutineContext coroutineContext) {
        InterfaceC0919z b10;
        if (coroutineContext.a(InterfaceC0915w0.f5070O) == null) {
            b10 = A0.b(null, 1, null);
            coroutineContext = coroutineContext.l(b10);
        }
        return new C1076d(coroutineContext);
    }

    public static final N b() {
        return new C1076d(O0.b(null, 1, null).l(C0874b0.c()));
    }

    public static final void c(N n10, CancellationException cancellationException) {
        InterfaceC0915w0 interfaceC0915w0 = (InterfaceC0915w0) n10.y().a(InterfaceC0915w0.f5070O);
        if (interfaceC0915w0 != null) {
            interfaceC0915w0.d(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + n10).toString());
    }

    public static final Object d(Function2 function2, kotlin.coroutines.d dVar) {
        Od.z zVar = new Od.z(dVar.getContext(), dVar);
        Object b10 = Pd.b.b(zVar, zVar, function2);
        if (b10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b10;
    }

    public static final void e(N n10) {
        z0.f(n10.y());
    }

    public static final boolean f(N n10) {
        InterfaceC0915w0 interfaceC0915w0 = (InterfaceC0915w0) n10.y().a(InterfaceC0915w0.f5070O);
        if (interfaceC0915w0 != null) {
            return interfaceC0915w0.b();
        }
        return true;
    }
}
