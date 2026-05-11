package R5;

/* loaded from: classes2.dex */
public abstract class M extends H {
    public M(Class cls) {
        super(cls, false);
    }

    @Override // D5.o
    public boolean d(D5.B b10, Object obj) {
        return v(obj).isEmpty();
    }

    @Override // R5.H, D5.o
    public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        fVar.h2(v(obj));
    }

    @Override // D5.o
    public void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        B5.b g10 = gVar.g(fVar, gVar.d(obj, com.fasterxml.jackson.core.k.VALUE_STRING));
        f(obj, fVar, b10);
        gVar.h(fVar, g10);
    }

    public abstract String v(Object obj);
}
