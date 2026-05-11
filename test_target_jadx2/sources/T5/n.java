package T5;

import D5.w;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class n implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected transient k f9305a = new k(20, 200);

    public w a(Class cls, F5.l lVar) {
        S5.b bVar = new S5.b(cls);
        w wVar = (w) this.f9305a.get(bVar);
        if (wVar != null) {
            return wVar;
        }
        w I10 = lVar.g().I(lVar.B(cls).k());
        if (I10 == null || !I10.e()) {
            I10 = w.a(cls.getSimpleName());
        }
        this.f9305a.b(bVar, I10);
        return I10;
    }
}
