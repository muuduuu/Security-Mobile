package Od;

import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import lc.AbstractC3622a;

/* renamed from: Od.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1078f {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        Iterator it = AbstractC1077e.a().iterator();
        while (it.hasNext()) {
            try {
                ((Jd.K) it.next()).N(coroutineContext, th);
            } catch (Throwable th2) {
                AbstractC1077e.b(Jd.L.b(th, th2));
            }
        }
        try {
            AbstractC3622a.a(th, new C1079g(coroutineContext));
        } catch (Throwable unused) {
        }
        AbstractC1077e.b(th);
    }
}
