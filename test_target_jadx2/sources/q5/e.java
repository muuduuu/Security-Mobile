package Q5;

import D5.A;
import D5.B;
import R5.AbstractC1129b;
import java.util.List;

/* loaded from: classes2.dex */
public final class e extends AbstractC1129b {
    public e(D5.j jVar, boolean z10, M5.g gVar, D5.o oVar) {
        super(List.class, jVar, z10, gVar, oVar);
    }

    @Override // D5.o
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean d(B b10, List list) {
        return list.isEmpty();
    }

    @Override // R5.H, D5.o
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void f(List list, com.fasterxml.jackson.core.f fVar, B b10) {
        int size = list.size();
        if (size == 1 && ((this.f8482f == null && b10.Z(A.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f8482f == Boolean.TRUE)) {
            z(list, fVar, b10);
            return;
        }
        fVar.O1(list, size);
        z(list, fVar, b10);
        fVar.K();
    }

    @Override // R5.AbstractC1129b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void z(List list, com.fasterxml.jackson.core.f fVar, B b10) {
        D5.o oVar = this.f8484h;
        if (oVar != null) {
            E(list, fVar, b10, oVar);
            return;
        }
        if (this.f8483g != null) {
            F(list, fVar, b10);
            return;
        }
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i10 = 0;
        try {
            k kVar = this.f8485i;
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj == null) {
                    b10.v(fVar);
                } else {
                    Class<?> cls = obj.getClass();
                    D5.o j10 = kVar.j(cls);
                    if (j10 == null) {
                        j10 = this.f8479c.v() ? x(kVar, b10.r(this.f8479c, cls), b10) : y(kVar, cls, b10);
                        kVar = this.f8485i;
                    }
                    j10.f(obj, fVar, b10);
                }
                i10++;
            }
        } catch (Exception e10) {
            t(b10, e10, list, i10);
        }
    }

    public void E(List list, com.fasterxml.jackson.core.f fVar, B b10, D5.o oVar) {
        int size = list.size();
        if (size == 0) {
            return;
        }
        M5.g gVar = this.f8483g;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == null) {
                try {
                    b10.v(fVar);
                } catch (Exception e10) {
                    t(b10, e10, list, i10);
                }
            } else if (gVar == null) {
                oVar.f(obj, fVar, b10);
            } else {
                oVar.g(obj, fVar, b10, gVar);
            }
        }
    }

    public void F(List list, com.fasterxml.jackson.core.f fVar, B b10) {
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i10 = 0;
        try {
            M5.g gVar = this.f8483g;
            k kVar = this.f8485i;
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj == null) {
                    b10.v(fVar);
                } else {
                    Class<?> cls = obj.getClass();
                    D5.o j10 = kVar.j(cls);
                    if (j10 == null) {
                        j10 = this.f8479c.v() ? x(kVar, b10.r(this.f8479c, cls), b10) : y(kVar, cls, b10);
                        kVar = this.f8485i;
                    }
                    j10.g(obj, fVar, b10, gVar);
                }
                i10++;
            }
        } catch (Exception e10) {
            t(b10, e10, list, i10);
        }
    }

    @Override // R5.AbstractC1129b
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public e A(D5.d dVar, M5.g gVar, D5.o oVar, Boolean bool) {
        return new e(this, dVar, gVar, oVar, bool);
    }

    @Override // P5.h
    public P5.h v(M5.g gVar) {
        return new e(this, this.f8480d, gVar, this.f8484h, this.f8482f);
    }

    public e(e eVar, D5.d dVar, M5.g gVar, D5.o oVar, Boolean bool) {
        super(eVar, dVar, gVar, oVar, bool);
    }
}
