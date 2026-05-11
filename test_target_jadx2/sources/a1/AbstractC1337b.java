package a1;

import Jd.C0874b0;
import Jd.O0;
import kotlin.coroutines.CoroutineContext;
import lc.n;

/* renamed from: a1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1337b {
    public static final C1336a a() {
        CoroutineContext coroutineContext;
        try {
            coroutineContext = C0874b0.c().y0();
        } catch (IllegalStateException unused) {
            coroutineContext = kotlin.coroutines.g.f36372a;
        } catch (n unused2) {
            coroutineContext = kotlin.coroutines.g.f36372a;
        }
        return new C1336a(coroutineContext.l(O0.b(null, 1, null)));
    }
}
