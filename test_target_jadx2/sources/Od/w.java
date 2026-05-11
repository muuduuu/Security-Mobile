package Od;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import lc.AbstractC3622a;

/* loaded from: classes3.dex */
public abstract class w {
    public static final void a(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        P b10 = b(function1, obj, null);
        if (b10 != null) {
            Jd.L.a(coroutineContext, b10);
        }
    }

    public static final P b(Function1 function1, Object obj, P p10) {
        try {
            function1.invoke(obj);
        } catch (Throwable th) {
            if (p10 == null || p10.getCause() == th) {
                return new P("Exception in undelivered element handler for " + obj, th);
            }
            AbstractC3622a.a(p10, th);
        }
        return p10;
    }

    public static /* synthetic */ P c(Function1 function1, Object obj, P p10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            p10 = null;
        }
        return b(function1, obj, p10);
    }
}
