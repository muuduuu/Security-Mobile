package Pd;

import Jd.B;
import Jd.D0;
import Od.K;
import Od.z;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function2;
import lc.o;
import lc.p;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public abstract class b {
    public static final void a(Function2 function2, Object obj, d dVar) {
        d a10 = h.a(dVar);
        try {
            CoroutineContext context = a10.getContext();
            Object i10 = K.i(context, null);
            try {
                h.b(a10);
                Object d10 = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC3868b.d(function2, obj, a10) : ((Function2) kotlin.jvm.internal.a.f(function2, 2)).invoke(obj, a10);
                K.f(context, i10);
                if (d10 != AbstractC3868b.e()) {
                    a10.resumeWith(o.b(d10));
                }
            } catch (Throwable th) {
                K.f(context, i10);
                throw th;
            }
        } catch (Throwable th2) {
            o.a aVar = o.f37128b;
            a10.resumeWith(o.b(p.a(th2)));
        }
    }

    public static final Object b(z zVar, Object obj, Function2 function2) {
        Object b10;
        try {
            b10 = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC3868b.d(function2, obj, zVar) : ((Function2) kotlin.jvm.internal.a.f(function2, 2)).invoke(obj, zVar);
        } catch (Throwable th) {
            b10 = new B(th, false, 2, null);
        }
        if (b10 == AbstractC3868b.e()) {
            return AbstractC3868b.e();
        }
        Object v02 = zVar.v0(b10);
        if (v02 == D0.f4988b) {
            return AbstractC3868b.e();
        }
        if (v02 instanceof B) {
            throw ((B) v02).f4974a;
        }
        return D0.h(v02);
    }
}
