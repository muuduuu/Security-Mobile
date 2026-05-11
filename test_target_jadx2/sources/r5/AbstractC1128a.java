package R5;

import java.util.Objects;
import v5.InterfaceC4942i;

/* renamed from: R5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1128a extends P5.h implements P5.i {

    /* renamed from: c, reason: collision with root package name */
    protected final D5.d f8477c;

    /* renamed from: d, reason: collision with root package name */
    protected final Boolean f8478d;

    protected AbstractC1128a(Class cls) {
        super(cls);
        this.f8477c = null;
        this.f8478d = null;
    }

    public D5.o a(D5.B b10, D5.d dVar) {
        InterfaceC4942i.d p10;
        if (dVar != null && (p10 = p(b10, dVar, c())) != null) {
            Boolean e10 = p10.e(InterfaceC4942i.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
            if (!Objects.equals(e10, this.f8478d)) {
                return y(dVar, e10);
            }
        }
        return this;
    }

    @Override // D5.o
    public final void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        B5.b g10 = gVar.g(fVar, gVar.d(obj, com.fasterxml.jackson.core.k.START_ARRAY));
        fVar.q(obj);
        z(obj, fVar, b10);
        gVar.h(fVar, g10);
    }

    protected final boolean x(D5.B b10) {
        Boolean bool = this.f8478d;
        return bool == null ? b10.Z(D5.A.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : bool.booleanValue();
    }

    public abstract D5.o y(D5.d dVar, Boolean bool);

    protected abstract void z(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10);

    protected AbstractC1128a(AbstractC1128a abstractC1128a, D5.d dVar, Boolean bool) {
        super(abstractC1128a.f8473a, false);
        this.f8477c = dVar;
        this.f8478d = bool;
    }
}
