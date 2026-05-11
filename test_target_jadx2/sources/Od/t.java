package Od;

import Jd.G0;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class t {
    private static final u a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        d();
        throw new lc.e();
    }

    static /* synthetic */ u b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(G0 g02) {
        return g02.y0() instanceof u;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final G0 e(r rVar, List list) {
        try {
            return rVar.b(list);
        } catch (Throwable th) {
            return a(th, rVar.a());
        }
    }
}
