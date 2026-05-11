package f3;

import b3.l;
import f3.AbstractC3142a;

/* loaded from: classes.dex */
public class g extends AbstractC3142a {
    private g(i iVar, AbstractC3142a.c cVar, Throwable th) {
        super(iVar, cVar, th);
    }

    @Override // f3.AbstractC3142a
    /* renamed from: b */
    public AbstractC3142a clone() {
        l.i(s());
        return new g(this.f32868b, this.f32869c, this.f32870d);
    }

    g(Object obj, h hVar, AbstractC3142a.c cVar, Throwable th) {
        super(obj, hVar, cVar, th, false);
    }
}
