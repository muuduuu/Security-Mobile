package R5;

import java.util.Objects;
import v5.InterfaceC4942i;

/* renamed from: R5.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1140m extends G implements P5.i {

    /* renamed from: c, reason: collision with root package name */
    protected final T5.i f8504c;

    /* renamed from: d, reason: collision with root package name */
    protected final Boolean f8505d;

    public C1140m(T5.i iVar, Boolean bool) {
        super(iVar.c(), false);
        this.f8504c = iVar;
        this.f8505d = bool;
    }

    protected static Boolean v(Class cls, InterfaceC4942i.d dVar, boolean z10, Boolean bool) {
        InterfaceC4942i.c h10 = dVar == null ? null : dVar.h();
        if (h10 == null) {
            return bool;
        }
        if (h10 == InterfaceC4942i.c.ANY || h10 == InterfaceC4942i.c.SCALAR) {
            return bool;
        }
        if (h10 == InterfaceC4942i.c.STRING || h10 == InterfaceC4942i.c.NATURAL) {
            return Boolean.FALSE;
        }
        if (h10.isNumeric() || h10 == InterfaceC4942i.c.ARRAY) {
            return Boolean.TRUE;
        }
        throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", h10, cls.getName(), z10 ? "class" : "property"));
    }

    public static C1140m x(Class cls, D5.z zVar, D5.c cVar, InterfaceC4942i.d dVar) {
        return new C1140m(T5.i.b(zVar, cls), v(cls, dVar, true, null));
    }

    @Override // P5.i
    public D5.o a(D5.B b10, D5.d dVar) {
        InterfaceC4942i.d p10 = p(b10, dVar, c());
        if (p10 != null) {
            Boolean v10 = v(c(), p10, false, this.f8505d);
            if (!Objects.equals(v10, this.f8505d)) {
                return new C1140m(this.f8504c, v10);
            }
        }
        return this;
    }

    protected final boolean w(D5.B b10) {
        Boolean bool = this.f8505d;
        return bool != null ? bool.booleanValue() : b10.Z(D5.A.WRITE_ENUMS_USING_INDEX);
    }

    @Override // R5.H, D5.o
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void f(Enum r22, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        if (w(b10)) {
            fVar.O0(r22.ordinal());
        } else if (b10.Z(D5.A.WRITE_ENUMS_USING_TO_STRING)) {
            fVar.h2(r22.toString());
        } else {
            fVar.g2(this.f8504c.d(r22));
        }
    }
}
