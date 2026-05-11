package R5;

import v5.InterfaceC4942i;

/* renamed from: R5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1132e extends G implements P5.i {

    /* renamed from: c, reason: collision with root package name */
    protected final boolean f8497c;

    /* renamed from: R5.e$a */
    static final class a extends G implements P5.i {

        /* renamed from: c, reason: collision with root package name */
        protected final boolean f8498c;

        public a(boolean z10) {
            super(z10 ? Boolean.TYPE : Boolean.class, false);
            this.f8498c = z10;
        }

        @Override // P5.i
        public D5.o a(D5.B b10, D5.d dVar) {
            InterfaceC4942i.d p10 = p(b10, dVar, Boolean.class);
            return (p10 == null || p10.h().isNumeric()) ? this : new C1132e(this.f8498c);
        }

        @Override // R5.H, D5.o
        public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            fVar.O0(!Boolean.FALSE.equals(obj) ? 1 : 0);
        }

        @Override // R5.G, D5.o
        public final void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
            fVar.I(Boolean.TRUE.equals(obj));
        }
    }

    public C1132e(boolean z10) {
        super(z10 ? Boolean.TYPE : Boolean.class, false);
        this.f8497c = z10;
    }

    @Override // P5.i
    public D5.o a(D5.B b10, D5.d dVar) {
        InterfaceC4942i.d p10 = p(b10, dVar, c());
        if (p10 != null) {
            InterfaceC4942i.c h10 = p10.h();
            if (h10.isNumeric()) {
                return new a(this.f8497c);
            }
            if (h10 == InterfaceC4942i.c.STRING) {
                return new L(this.f8473a);
            }
        }
        return this;
    }

    @Override // R5.H, D5.o
    public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        fVar.I(Boolean.TRUE.equals(obj));
    }

    @Override // R5.G, D5.o
    public final void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        fVar.I(Boolean.TRUE.equals(obj));
    }
}
