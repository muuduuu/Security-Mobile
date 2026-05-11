package Nd;

import Od.K;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public abstract class f {
    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, kotlin.coroutines.d dVar) {
        Object i10 = K.i(coroutineContext, obj2);
        try {
            w wVar = new w(dVar, coroutineContext);
            Object d10 = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC3868b.d(function2, obj, wVar) : ((Function2) kotlin.jvm.internal.a.f(function2, 2)).invoke(obj, wVar);
            K.f(coroutineContext, i10);
            if (d10 == AbstractC3868b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return d10;
        } catch (Throwable th) {
            K.f(coroutineContext, i10);
            throw th;
        }
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = K.g(coroutineContext);
        }
        return b(coroutineContext, obj, obj2, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Md.f d(Md.f fVar, CoroutineContext coroutineContext) {
        return !(fVar instanceof v) ? new x(fVar, coroutineContext) : fVar;
    }
}
