package Pd;

import Od.AbstractC1081i;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import lc.o;
import lc.p;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public abstract class a {
    private static final void a(d dVar, Throwable th) {
        o.a aVar = o.f37128b;
        dVar.resumeWith(o.b(p.a(th)));
        throw th;
    }

    public static final void b(d dVar, d dVar2) {
        try {
            d c10 = AbstractC3868b.c(dVar);
            o.a aVar = o.f37128b;
            AbstractC1081i.b(c10, o.b(Unit.f36324a));
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final void c(Function2 function2, Object obj, d dVar) {
        try {
            d c10 = AbstractC3868b.c(AbstractC3868b.a(function2, obj, dVar));
            o.a aVar = o.f37128b;
            AbstractC1081i.b(c10, o.b(Unit.f36324a));
        } catch (Throwable th) {
            a(dVar, th);
        }
    }
}
