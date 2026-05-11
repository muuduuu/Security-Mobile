package Q5;

import D5.B;
import R5.AbstractC1129b;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class g extends AbstractC1129b {
    public g(D5.j jVar, boolean z10, M5.g gVar) {
        super(Iterator.class, jVar, z10, gVar, (D5.o) null);
    }

    protected void B(Iterator it, com.fasterxml.jackson.core.f fVar, B b10) {
        M5.g gVar = this.f8483g;
        k kVar = this.f8485i;
        do {
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
        } while (it.hasNext());
    }

    @Override // D5.o
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean d(B b10, Iterator it) {
        return !it.hasNext();
    }

    @Override // R5.H, D5.o
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final void f(Iterator it, com.fasterxml.jackson.core.f fVar, B b10) {
        fVar.N1(it);
        z(it, fVar, b10);
        fVar.K();
    }

    @Override // R5.AbstractC1129b
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(Iterator it, com.fasterxml.jackson.core.f fVar, B b10) {
        if (it.hasNext()) {
            D5.o oVar = this.f8484h;
            if (oVar == null) {
                B(it, fVar, b10);
                return;
            }
            M5.g gVar = this.f8483g;
            do {
                Object next = it.next();
                if (next == null) {
                    b10.v(fVar);
                } else if (gVar == null) {
                    oVar.f(next, fVar, b10);
                } else {
                    oVar.g(next, fVar, b10, gVar);
                }
            } while (it.hasNext());
        }
    }

    @Override // R5.AbstractC1129b
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public g A(D5.d dVar, M5.g gVar, D5.o oVar, Boolean bool) {
        return new g(this, dVar, gVar, oVar, bool);
    }

    @Override // P5.h
    public P5.h v(M5.g gVar) {
        return new g(this, this.f8480d, gVar, this.f8484h, this.f8482f);
    }

    public g(g gVar, D5.d dVar, M5.g gVar2, D5.o oVar, Boolean bool) {
        super(gVar, dVar, gVar2, oVar, bool);
    }
}
