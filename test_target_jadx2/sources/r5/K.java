package R5;

/* loaded from: classes2.dex */
public class K extends H {
    protected K(Class cls) {
        super(cls, false);
    }

    @Override // D5.o
    public boolean d(D5.B b10, Object obj) {
        return true;
    }

    @Override // R5.H, D5.o
    public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        fVar.f2(obj, 0);
        fVar.N();
    }

    @Override // D5.o
    public void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        gVar.h(fVar, gVar.g(fVar, gVar.d(obj, com.fasterxml.jackson.core.k.START_OBJECT)));
    }

    public K(D5.j jVar) {
        super(jVar);
    }
}
