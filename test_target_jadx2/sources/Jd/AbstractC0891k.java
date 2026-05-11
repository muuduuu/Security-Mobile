package Jd;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: Jd.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0891k {
    public static final V a(N n10, CoroutineContext coroutineContext, P p10, Function2 function2) {
        CoroutineContext j10 = H.j(n10, coroutineContext);
        W e02 = p10.isLazy() ? new E0(j10, function2) : new W(j10, true);
        e02.U0(p10, e02, function2);
        return e02;
    }

    public static /* synthetic */ V b(N n10, CoroutineContext coroutineContext, P p10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f36372a;
        }
        if ((i10 & 2) != 0) {
            p10 = P.DEFAULT;
        }
        return AbstractC0887i.a(n10, coroutineContext, p10, function2);
    }

    public static final InterfaceC0915w0 c(N n10, CoroutineContext coroutineContext, P p10, Function2 function2) {
        CoroutineContext j10 = H.j(n10, coroutineContext);
        M0 f02 = p10.isLazy() ? new F0(j10, function2) : new M0(j10, true);
        f02.U0(p10, f02, function2);
        return f02;
    }

    public static /* synthetic */ InterfaceC0915w0 d(N n10, CoroutineContext coroutineContext, P p10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f36372a;
        }
        if ((i10 & 2) != 0) {
            p10 = P.DEFAULT;
        }
        return AbstractC0887i.c(n10, coroutineContext, p10, function2);
    }

    public static final Object e(CoroutineContext coroutineContext, Function2 function2, kotlin.coroutines.d dVar) {
        Object V02;
        CoroutineContext context = dVar.getContext();
        CoroutineContext k10 = H.k(context, coroutineContext);
        z0.f(k10);
        if (k10 == context) {
            Od.z zVar = new Od.z(k10, dVar);
            V02 = Pd.b.b(zVar, zVar, function2);
        } else {
            e.b bVar = kotlin.coroutines.e.f36370f0;
            if (Intrinsics.b(k10.a(bVar), context.a(bVar))) {
                T0 t02 = new T0(k10, dVar);
                CoroutineContext context2 = t02.getContext();
                Object i10 = Od.K.i(context2, null);
                try {
                    Object b10 = Pd.b.b(t02, t02, function2);
                    Od.K.f(context2, i10);
                    V02 = b10;
                } catch (Throwable th) {
                    Od.K.f(context2, i10);
                    throw th;
                }
            } else {
                Y y10 = new Y(k10, dVar);
                Pd.a.c(function2, y10, y10);
                V02 = y10.V0();
            }
        }
        if (V02 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return V02;
    }
}
