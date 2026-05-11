package Nd;

import Jd.InterfaceC0915w0;
import Od.z;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class u {
    public static final void b(final r rVar, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.K(0, new Function2() { // from class: Nd.t
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int c10;
                c10 = u.c(r.this, ((Integer) obj).intValue(), (CoroutineContext.Element) obj2);
                return Integer.valueOf(c10);
            }
        })).intValue() == rVar.f6791c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + rVar.f6790b + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(r rVar, int i10, CoroutineContext.Element element) {
        CoroutineContext.b key = element.getKey();
        CoroutineContext.Element a10 = rVar.f6790b.a(key);
        if (key != InterfaceC0915w0.f5070O) {
            if (element != a10) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        InterfaceC0915w0 interfaceC0915w0 = (InterfaceC0915w0) a10;
        Intrinsics.e(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        InterfaceC0915w0 d10 = d((InterfaceC0915w0) element, interfaceC0915w0);
        if (d10 == interfaceC0915w0) {
            return interfaceC0915w0 == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + d10 + ", expected child of " + interfaceC0915w0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final InterfaceC0915w0 d(InterfaceC0915w0 interfaceC0915w0, InterfaceC0915w0 interfaceC0915w02) {
        while (interfaceC0915w0 != null) {
            if (interfaceC0915w0 == interfaceC0915w02) {
                return interfaceC0915w0;
            }
            if (!(interfaceC0915w0 instanceof z)) {
                return interfaceC0915w0;
            }
            interfaceC0915w0 = ((z) interfaceC0915w0).j0();
        }
        return null;
    }
}
