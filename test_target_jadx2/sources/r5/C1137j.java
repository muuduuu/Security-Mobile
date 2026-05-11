package R5;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: R5.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1137j extends AbstractC1129b {
    public C1137j(D5.j jVar, boolean z10, M5.g gVar, D5.o oVar) {
        super(Collection.class, jVar, z10, gVar, oVar);
    }

    @Override // D5.o
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean d(D5.B b10, Collection collection) {
        return collection.isEmpty();
    }

    @Override // R5.H, D5.o
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void f(Collection collection, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        int size = collection.size();
        if (size == 1 && ((this.f8482f == null && b10.Z(D5.A.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f8482f == Boolean.TRUE)) {
            z(collection, fVar, b10);
            return;
        }
        fVar.O1(collection, size);
        z(collection, fVar, b10);
        fVar.K();
    }

    @Override // R5.AbstractC1129b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void z(Collection collection, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        fVar.q(collection);
        D5.o oVar = this.f8484h;
        if (oVar != null) {
            E(collection, fVar, b10, oVar);
            return;
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            Q5.k kVar = this.f8485i;
            M5.g gVar = this.f8483g;
            int i10 = 0;
            do {
                try {
                    Object next = it.next();
                    if (next == null) {
                        b10.v(fVar);
                    } else {
                        Class<?> cls = next.getClass();
                        D5.o j10 = kVar.j(cls);
                        if (j10 == null) {
                            j10 = this.f8479c.v() ? x(kVar, b10.r(this.f8479c, cls), b10) : y(kVar, cls, b10);
                            kVar = this.f8485i;
                        }
                        if (gVar == null) {
                            j10.f(next, fVar, b10);
                        } else {
                            j10.g(next, fVar, b10, gVar);
                        }
                    }
                    i10++;
                } catch (Exception e10) {
                    t(b10, e10, collection, i10);
                    return;
                }
            } while (it.hasNext());
        }
    }

    public void E(Collection collection, com.fasterxml.jackson.core.f fVar, D5.B b10, D5.o oVar) {
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            M5.g gVar = this.f8483g;
            int i10 = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        b10.v(fVar);
                    } catch (Exception e10) {
                        t(b10, e10, collection, i10);
                    }
                } else if (gVar == null) {
                    oVar.f(next, fVar, b10);
                } else {
                    oVar.g(next, fVar, b10, gVar);
                }
                i10++;
            } while (it.hasNext());
        }
    }

    @Override // R5.AbstractC1129b
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public C1137j A(D5.d dVar, M5.g gVar, D5.o oVar, Boolean bool) {
        return new C1137j(this, dVar, gVar, oVar, bool);
    }

    @Override // P5.h
    public P5.h v(M5.g gVar) {
        return new C1137j(this, this.f8480d, gVar, this.f8484h, this.f8482f);
    }

    public C1137j(C1137j c1137j, D5.d dVar, M5.g gVar, D5.o oVar, Boolean bool) {
        super(c1137j, dVar, gVar, oVar, bool);
    }
}
