package S6;

import T6.C1185o;
import T6.C1190u;
import V6.AbstractC1287s;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class l {
    public static k a(o oVar, h hVar) {
        AbstractC1287s.n(oVar, "Result must not be null");
        AbstractC1287s.b(!oVar.c().Z0(), "Status code must not be SUCCESS");
        u uVar = new u(hVar, oVar);
        uVar.k(oVar);
        return uVar;
    }

    public static j b(o oVar, h hVar) {
        AbstractC1287s.n(oVar, "Result must not be null");
        v vVar = new v(hVar);
        vVar.k(oVar);
        return new C1185o(vVar);
    }

    public static k c(Status status, h hVar) {
        AbstractC1287s.n(status, "Result must not be null");
        C1190u c1190u = new C1190u(hVar);
        c1190u.k(status);
        return c1190u;
    }
}
