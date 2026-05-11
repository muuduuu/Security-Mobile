package R5;

import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: R5.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1141n extends AbstractC1129b {
    public C1141n(D5.j jVar) {
        super(EnumSet.class, jVar, true, (M5.g) null, (D5.o) null);
    }

    @Override // D5.o
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean d(D5.B b10, EnumSet enumSet) {
        return enumSet.isEmpty();
    }

    @Override // R5.H, D5.o
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final void f(EnumSet enumSet, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        int size = enumSet.size();
        if (size == 1 && ((this.f8482f == null && b10.Z(D5.A.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f8482f == Boolean.TRUE)) {
            z(enumSet, fVar, b10);
            return;
        }
        fVar.O1(enumSet, size);
        z(enumSet, fVar, b10);
        fVar.K();
    }

    @Override // R5.AbstractC1129b
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(EnumSet enumSet, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        D5.o oVar = this.f8484h;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            Enum r12 = (Enum) it.next();
            if (oVar == null) {
                oVar = b10.x(r12.getDeclaringClass(), this.f8480d);
            }
            oVar.f(r12, fVar, b10);
        }
    }

    @Override // R5.AbstractC1129b
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public C1141n A(D5.d dVar, M5.g gVar, D5.o oVar, Boolean bool) {
        return new C1141n(this, dVar, gVar, oVar, bool);
    }

    public C1141n(C1141n c1141n, D5.d dVar, M5.g gVar, D5.o oVar, Boolean bool) {
        super(c1141n, dVar, gVar, oVar, bool);
    }

    @Override // P5.h
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public C1141n v(M5.g gVar) {
        return this;
    }
}
