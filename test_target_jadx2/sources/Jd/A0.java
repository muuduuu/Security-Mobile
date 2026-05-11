package Jd;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class A0 {

    /* synthetic */ class a extends xc.j implements Function1 {
        a(Object obj) {
            super(1, obj, B0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void I(Throwable th) {
            ((B0) this.f44980b).x(th);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            I((Throwable) obj);
            return Unit.f36324a;
        }
    }

    public static final InterfaceC0919z a(InterfaceC0915w0 interfaceC0915w0) {
        return new y0(interfaceC0915w0);
    }

    public static /* synthetic */ InterfaceC0919z b(InterfaceC0915w0 interfaceC0915w0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0915w0 = null;
        }
        return z0.a(interfaceC0915w0);
    }

    public static final void c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        InterfaceC0915w0 interfaceC0915w0 = (InterfaceC0915w0) coroutineContext.a(InterfaceC0915w0.f5070O);
        if (interfaceC0915w0 != null) {
            interfaceC0915w0.d(cancellationException);
        }
    }

    public static /* synthetic */ void d(CoroutineContext coroutineContext, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        z0.c(coroutineContext, cancellationException);
    }

    public static final void e(InterfaceC0915w0 interfaceC0915w0) {
        if (!interfaceC0915w0.b()) {
            throw interfaceC0915w0.p();
        }
    }

    public static final void f(CoroutineContext coroutineContext) {
        InterfaceC0915w0 interfaceC0915w0 = (InterfaceC0915w0) coroutineContext.a(InterfaceC0915w0.f5070O);
        if (interfaceC0915w0 != null) {
            z0.e(interfaceC0915w0);
        }
    }

    public static final InterfaceC0915w0 g(CoroutineContext coroutineContext) {
        InterfaceC0915w0 interfaceC0915w0 = (InterfaceC0915w0) coroutineContext.a(InterfaceC0915w0.f5070O);
        if (interfaceC0915w0 != null) {
            return interfaceC0915w0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final InterfaceC0876c0 h(InterfaceC0915w0 interfaceC0915w0, boolean z10, B0 b02) {
        return interfaceC0915w0 instanceof C0 ? ((C0) interfaceC0915w0).r0(z10, b02) : interfaceC0915w0.n(b02.w(), z10, new a(b02));
    }

    public static /* synthetic */ InterfaceC0876c0 i(InterfaceC0915w0 interfaceC0915w0, boolean z10, B0 b02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return z0.h(interfaceC0915w0, z10, b02);
    }
}
