package Jd;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import xc.C5141B;

/* loaded from: classes3.dex */
public abstract class H {
    private static final CoroutineContext d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z10) {
        boolean h10 = h(coroutineContext);
        boolean h11 = h(coroutineContext2);
        if (!h10 && !h11) {
            return coroutineContext.l(coroutineContext2);
        }
        final C5141B c5141b = new C5141B();
        c5141b.f44962a = coroutineContext2;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f36372a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.K(gVar, new Function2() { // from class: Jd.F
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineContext e10;
                e10 = H.e(C5141B.this, z10, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
                return e10;
            }
        });
        if (h11) {
            c5141b.f44962a = ((CoroutineContext) c5141b.f44962a).K(gVar, new Function2() { // from class: Jd.G
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    CoroutineContext f10;
                    f10 = H.f((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                    return f10;
                }
            });
        }
        return coroutineContext3.l((CoroutineContext) c5141b.f44962a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext e(C5141B c5141b, boolean z10, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return coroutineContext.l(element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext f(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return coroutineContext.l(element);
    }

    public static final String g(CoroutineContext coroutineContext) {
        return null;
    }

    private static final boolean h(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.K(Boolean.FALSE, new Function2() { // from class: Jd.E
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean i10;
                i10 = H.i(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2);
                return Boolean.valueOf(i10);
            }
        })).booleanValue();
    }

    public static final CoroutineContext j(N n10, CoroutineContext coroutineContext) {
        CoroutineContext d10 = d(n10.y(), coroutineContext, true);
        return (d10 == C0874b0.a() || d10.a(kotlin.coroutines.e.f36370f0) != null) ? d10 : d10.l(C0874b0.a());
    }

    public static final CoroutineContext k(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !h(coroutineContext2) ? coroutineContext.l(coroutineContext2) : d(coroutineContext, coroutineContext2, false);
    }

    public static final T0 l(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof Y) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof T0) {
                return (T0) eVar;
            }
        }
        return null;
    }

    public static final T0 m(kotlin.coroutines.d dVar, CoroutineContext coroutineContext, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e) || coroutineContext.a(U0.f5017a) == null) {
            return null;
        }
        T0 l10 = l((kotlin.coroutines.jvm.internal.e) dVar);
        if (l10 != null) {
            l10.W0(coroutineContext, obj);
        }
        return l10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(boolean z10, CoroutineContext.Element element) {
        return z10;
    }
}
