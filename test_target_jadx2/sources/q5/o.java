package Q5;

import D5.B;

/* loaded from: classes2.dex */
public final class o extends D5.o implements P5.i {

    /* renamed from: a, reason: collision with root package name */
    protected final M5.g f8225a;

    /* renamed from: b, reason: collision with root package name */
    protected final D5.o f8226b;

    public o(M5.g gVar, D5.o oVar) {
        this.f8225a = gVar;
        this.f8226b = oVar;
    }

    @Override // P5.i
    public D5.o a(B b10, D5.d dVar) {
        D5.o oVar = this.f8226b;
        if (oVar instanceof P5.i) {
            oVar = b10.V(oVar, dVar);
        }
        return oVar == this.f8226b ? this : new o(this.f8225a, oVar);
    }

    @Override // D5.o
    public Class c() {
        return Object.class;
    }

    @Override // D5.o
    public void f(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        this.f8226b.g(obj, fVar, b10, this.f8225a);
    }

    @Override // D5.o
    public void g(Object obj, com.fasterxml.jackson.core.f fVar, B b10, M5.g gVar) {
        this.f8226b.g(obj, fVar, b10, gVar);
    }
}
