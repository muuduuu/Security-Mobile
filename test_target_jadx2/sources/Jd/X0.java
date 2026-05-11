package Jd;

import Od.AbstractC1081i;
import Od.C1080h;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public abstract class X0 {
    public static final Object a(kotlin.coroutines.d dVar) {
        Object e10;
        CoroutineContext context = dVar.getContext();
        z0.f(context);
        kotlin.coroutines.d c10 = AbstractC3868b.c(dVar);
        C1080h c1080h = c10 instanceof C1080h ? (C1080h) c10 : null;
        if (c1080h == null) {
            e10 = Unit.f36324a;
        } else {
            if (c1080h.f7321d.y(context)) {
                c1080h.m(context, Unit.f36324a);
            } else {
                W0 w02 = new W0();
                CoroutineContext l10 = context.l(w02);
                Unit unit = Unit.f36324a;
                c1080h.m(l10, unit);
                if (w02.f5019b) {
                    e10 = AbstractC1081i.c(c1080h) ? AbstractC3868b.e() : unit;
                }
            }
            e10 = AbstractC3868b.e();
        }
        if (e10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e10 == AbstractC3868b.e() ? e10 : Unit.f36324a;
    }
}
