package Jd;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: Jd.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0915w0 extends CoroutineContext.Element {

    /* renamed from: O, reason: collision with root package name */
    public static final b f5070O = b.f5071a;

    /* renamed from: Jd.w0$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC0915w0 interfaceC0915w0, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC0915w0.d(cancellationException);
        }

        public static Object b(InterfaceC0915w0 interfaceC0915w0, Object obj, Function2 function2) {
            return CoroutineContext.Element.a.a(interfaceC0915w0, obj, function2);
        }

        public static CoroutineContext.Element c(InterfaceC0915w0 interfaceC0915w0, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.b(interfaceC0915w0, bVar);
        }

        public static CoroutineContext d(InterfaceC0915w0 interfaceC0915w0, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.c(interfaceC0915w0, bVar);
        }

        public static CoroutineContext e(InterfaceC0915w0 interfaceC0915w0, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(interfaceC0915w0, coroutineContext);
        }
    }

    /* renamed from: Jd.w0$b */
    public static final class b implements CoroutineContext.b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f5071a = new b();

        private b() {
        }
    }

    boolean b();

    boolean c();

    void d(CancellationException cancellationException);

    InterfaceC0908t j(InterfaceC0912v interfaceC0912v);

    InterfaceC0876c0 n(boolean z10, boolean z11, Function1 function1);

    CancellationException p();

    boolean start();

    InterfaceC0876c0 z(Function1 function1);
}
