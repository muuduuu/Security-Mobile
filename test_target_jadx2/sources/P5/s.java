package P5;

import D5.B;
import K5.C0922c;
import java.io.Serializable;
import v5.p;

/* loaded from: classes2.dex */
public abstract class s extends c implements Serializable {
    protected s(K5.s sVar, T5.a aVar, D5.j jVar, D5.o oVar, M5.g gVar, D5.j jVar2, p.b bVar, Class[] clsArr) {
        super(sVar, sVar.v(), aVar, jVar, oVar, gVar, jVar2, A(bVar), B(bVar), clsArr);
    }

    protected static boolean A(p.b bVar) {
        p.a h10;
        return (bVar == null || (h10 = bVar.h()) == p.a.ALWAYS || h10 == p.a.USE_DEFAULTS) ? false : true;
    }

    protected static Object B(p.b bVar) {
        if (bVar == null) {
            return Boolean.FALSE;
        }
        p.a h10 = bVar.h();
        if (h10 == p.a.ALWAYS || h10 == p.a.NON_NULL || h10 == p.a.USE_DEFAULTS) {
            return null;
        }
        return c.f7477s;
    }

    protected abstract Object C(Object obj, com.fasterxml.jackson.core.f fVar, B b10);

    public abstract s D(F5.l lVar, C0922c c0922c, K5.s sVar, D5.j jVar);

    @Override // P5.c
    public void s(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        Object C10 = C(obj, fVar, b10);
        if (C10 == null) {
            D5.o oVar = this.f7488l;
            if (oVar != null) {
                oVar.f(null, fVar, b10);
                return;
            } else {
                fVar.y0();
                return;
            }
        }
        D5.o oVar2 = this.f7487k;
        if (oVar2 == null) {
            Class<?> cls = C10.getClass();
            Q5.k kVar = this.f7490n;
            D5.o j10 = kVar.j(cls);
            oVar2 = j10 == null ? d(kVar, cls, b10) : j10;
        }
        Object obj2 = this.f7492p;
        if (obj2 != null) {
            if (c.f7477s == obj2) {
                if (oVar2.d(b10, C10)) {
                    v(obj, fVar, b10);
                    return;
                }
            } else if (obj2.equals(C10)) {
                v(obj, fVar, b10);
                return;
            }
        }
        if (C10 == obj && e(obj, fVar, b10, oVar2)) {
            return;
        }
        M5.g gVar = this.f7489m;
        if (gVar == null) {
            oVar2.f(C10, fVar, b10);
        } else {
            oVar2.g(C10, fVar, b10, gVar);
        }
    }

    @Override // P5.c
    public void t(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        Object C10 = C(obj, fVar, b10);
        if (C10 == null) {
            if (this.f7488l != null) {
                fVar.i0(this.f7478b);
                this.f7488l.f(null, fVar, b10);
                return;
            }
            return;
        }
        D5.o oVar = this.f7487k;
        if (oVar == null) {
            Class<?> cls = C10.getClass();
            Q5.k kVar = this.f7490n;
            D5.o j10 = kVar.j(cls);
            oVar = j10 == null ? d(kVar, cls, b10) : j10;
        }
        Object obj2 = this.f7492p;
        if (obj2 != null) {
            if (c.f7477s == obj2) {
                if (oVar.d(b10, C10)) {
                    return;
                }
            } else if (obj2.equals(C10)) {
                return;
            }
        }
        if (C10 == obj && e(obj, fVar, b10, oVar)) {
            return;
        }
        fVar.i0(this.f7478b);
        M5.g gVar = this.f7489m;
        if (gVar == null) {
            oVar.f(C10, fVar, b10);
        } else {
            oVar.g(C10, fVar, b10, gVar);
        }
    }
}
