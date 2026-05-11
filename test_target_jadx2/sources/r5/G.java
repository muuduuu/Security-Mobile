package R5;

/* loaded from: classes2.dex */
public abstract class G extends H {
    protected G(Class cls) {
        super(cls);
    }

    @Override // D5.o
    public void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        B5.b g10 = gVar.g(fVar, gVar.d(obj, com.fasterxml.jackson.core.k.VALUE_STRING));
        f(obj, fVar, b10);
        gVar.h(fVar, g10);
    }

    protected G(Class cls, boolean z10) {
        super(cls);
    }
}
