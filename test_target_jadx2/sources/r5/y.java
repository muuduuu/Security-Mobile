package R5;

/* loaded from: classes2.dex */
public class y extends H {
    public y(Class cls) {
        super(cls, false);
    }

    @Override // R5.H, D5.o
    public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        fVar.A1(obj.toString());
    }

    @Override // D5.o
    public void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        B5.b g10 = gVar.g(fVar, gVar.d(obj, com.fasterxml.jackson.core.k.VALUE_EMBEDDED_OBJECT));
        f(obj, fVar, b10);
        gVar.h(fVar, g10);
    }
}
