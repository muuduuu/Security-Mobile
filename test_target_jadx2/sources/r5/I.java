package R5;

/* loaded from: classes2.dex */
public final class I extends G {
    public I() {
        super(String.class, false);
    }

    @Override // D5.o
    public boolean d(D5.B b10, Object obj) {
        return ((String) obj).isEmpty();
    }

    @Override // R5.H, D5.o
    public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        fVar.h2((String) obj);
    }

    @Override // R5.G, D5.o
    public final void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        fVar.h2((String) obj);
    }
}
