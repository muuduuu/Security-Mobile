package Jd;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: Jd.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0889j {
    public static final Object a(CoroutineContext coroutineContext, Function2 function2) {
        AbstractC0882f0 a10;
        CoroutineContext j10;
        Thread currentThread = Thread.currentThread();
        kotlin.coroutines.e eVar = (kotlin.coroutines.e) coroutineContext.a(kotlin.coroutines.e.f36370f0);
        if (eVar == null) {
            a10 = Q0.f5006a.b();
            j10 = H.j(C0902p0.f5058a, coroutineContext.l(a10));
        } else {
            AbstractC0882f0 abstractC0882f0 = eVar instanceof AbstractC0882f0 ? (AbstractC0882f0) eVar : null;
            if (abstractC0882f0 != null) {
                AbstractC0882f0 abstractC0882f02 = abstractC0882f0.t1() ? abstractC0882f0 : null;
                if (abstractC0882f02 != null) {
                    a10 = abstractC0882f02;
                    j10 = H.j(C0902p0.f5058a, coroutineContext);
                }
            }
            a10 = Q0.f5006a.a();
            j10 = H.j(C0902p0.f5058a, coroutineContext);
        }
        C0883g c0883g = new C0883g(j10, currentThread, a10);
        c0883g.U0(P.DEFAULT, c0883g, function2);
        return c0883g.V0();
    }

    public static /* synthetic */ Object b(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f36372a;
        }
        return AbstractC0887i.e(coroutineContext, function2);
    }
}
