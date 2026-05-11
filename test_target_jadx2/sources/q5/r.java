package Q5;

import D5.B;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class r extends P5.c implements Serializable {

    /* renamed from: t, reason: collision with root package name */
    protected final T5.m f8229t;

    public r(P5.c cVar, T5.m mVar) {
        super(cVar);
        this.f8229t = mVar;
    }

    protected r A(T5.m mVar, y5.h hVar) {
        return new r(this, mVar, hVar);
    }

    @Override // P5.c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public r r(T5.m mVar) {
        return A(T5.m.a(mVar, this.f8229t), new y5.h(mVar.c(this.f7478b.getValue())));
    }

    @Override // P5.c
    protected D5.o d(k kVar, Class cls, B b10) {
        D5.j jVar = this.f7482f;
        D5.o G10 = jVar != null ? b10.G(b10.r(jVar, cls), this) : b10.H(cls, this);
        T5.m mVar = this.f8229t;
        if (G10.e() && (G10 instanceof s)) {
            mVar = T5.m.a(mVar, ((s) G10).f8230m);
        }
        D5.o h10 = G10.h(mVar);
        this.f7490n = this.f7490n.i(cls, h10);
        return h10;
    }

    @Override // P5.c
    public void h(D5.o oVar) {
        if (oVar != null) {
            T5.m mVar = this.f8229t;
            if (oVar.e() && (oVar instanceof s)) {
                mVar = T5.m.a(mVar, ((s) oVar).f8230m);
            }
            oVar = oVar.h(mVar);
        }
        super.h(oVar);
    }

    @Override // P5.c
    public void t(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        Object k10 = k(obj);
        if (k10 == null) {
            return;
        }
        D5.o oVar = this.f7487k;
        if (oVar == null) {
            Class<?> cls = k10.getClass();
            k kVar = this.f7490n;
            D5.o j10 = kVar.j(cls);
            oVar = j10 == null ? d(kVar, cls, b10) : j10;
        }
        Object obj2 = this.f7492p;
        if (obj2 != null) {
            if (P5.c.f7477s == obj2) {
                if (oVar.d(b10, k10)) {
                    return;
                }
            } else if (obj2.equals(k10)) {
                return;
            }
        }
        if (k10 == obj && e(obj, fVar, b10, oVar)) {
            return;
        }
        if (!oVar.e()) {
            fVar.i0(this.f7478b);
        }
        M5.g gVar = this.f7489m;
        if (gVar == null) {
            oVar.f(k10, fVar, b10);
        } else {
            oVar.g(k10, fVar, b10, gVar);
        }
    }

    protected r(r rVar, T5.m mVar, y5.h hVar) {
        super(rVar, hVar);
        this.f8229t = mVar;
    }
}
