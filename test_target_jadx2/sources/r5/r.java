package R5;

import java.util.Iterator;

/* loaded from: classes2.dex */
public class r extends AbstractC1129b {
    public r(D5.j jVar, boolean z10, M5.g gVar) {
        super(Iterable.class, jVar, z10, gVar, (D5.o) null);
    }

    public boolean B(Iterable iterable) {
        if (iterable == null) {
            return false;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        return !it.hasNext();
    }

    @Override // D5.o
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean d(D5.B b10, Iterable iterable) {
        return !iterable.iterator().hasNext();
    }

    @Override // R5.H, D5.o
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final void f(Iterable iterable, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        if (((this.f8482f == null && b10.Z(D5.A.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f8482f == Boolean.TRUE) && B(iterable)) {
            z(iterable, fVar, b10);
            return;
        }
        fVar.N1(iterable);
        z(iterable, fVar, b10);
        fVar.K();
    }

    @Override // R5.AbstractC1129b
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(Iterable iterable, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        D5.o oVar;
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            M5.g gVar = this.f8483g;
            Class<?> cls = null;
            D5.o oVar2 = null;
            do {
                Object next = it.next();
                if (next == null) {
                    b10.v(fVar);
                } else {
                    D5.o oVar3 = this.f8484h;
                    if (oVar3 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            oVar2 = b10.H(cls2, this.f8480d);
                            cls = cls2;
                        }
                        oVar = oVar2;
                    } else {
                        oVar = oVar2;
                        oVar2 = oVar3;
                    }
                    if (gVar == null) {
                        oVar2.f(next, fVar, b10);
                    } else {
                        oVar2.g(next, fVar, b10, gVar);
                    }
                    oVar2 = oVar;
                }
            } while (it.hasNext());
        }
    }

    @Override // R5.AbstractC1129b
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public r A(D5.d dVar, M5.g gVar, D5.o oVar, Boolean bool) {
        return new r(this, dVar, gVar, oVar, bool);
    }

    @Override // P5.h
    public P5.h v(M5.g gVar) {
        return new r(this, this.f8480d, gVar, this.f8484h, this.f8482f);
    }

    public r(r rVar, D5.d dVar, M5.g gVar, D5.o oVar, Boolean bool) {
        super(rVar, dVar, gVar, oVar, bool);
    }
}
