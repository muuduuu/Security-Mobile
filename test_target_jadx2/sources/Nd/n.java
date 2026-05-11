package Nd;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public interface n extends Md.e {

    public static final class a {
        public static /* synthetic */ Md.e a(n nVar, CoroutineContext coroutineContext, int i10, Ld.a aVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                coroutineContext = kotlin.coroutines.g.f36372a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                aVar = Ld.a.SUSPEND;
            }
            return nVar.c(coroutineContext, i10, aVar);
        }
    }

    Md.e c(CoroutineContext coroutineContext, int i10, Ld.a aVar);
}
