package R5;

import D5.AbstractC0776b;
import K5.AbstractC0928i;
import Q5.k;
import java.util.Objects;
import v5.InterfaceC4942i;

/* renamed from: R5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1129b extends P5.h implements P5.i {

    /* renamed from: c, reason: collision with root package name */
    protected final D5.j f8479c;

    /* renamed from: d, reason: collision with root package name */
    protected final D5.d f8480d;

    /* renamed from: e, reason: collision with root package name */
    protected final boolean f8481e;

    /* renamed from: f, reason: collision with root package name */
    protected final Boolean f8482f;

    /* renamed from: g, reason: collision with root package name */
    protected final M5.g f8483g;

    /* renamed from: h, reason: collision with root package name */
    protected final D5.o f8484h;

    /* renamed from: i, reason: collision with root package name */
    protected Q5.k f8485i;

    protected AbstractC1129b(Class cls, D5.j jVar, boolean z10, M5.g gVar, D5.o oVar) {
        this(cls, jVar, z10, gVar, null, oVar, null);
    }

    public abstract AbstractC1129b A(D5.d dVar, M5.g gVar, D5.o oVar, Boolean bool);

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // P5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D5.o a(D5.B b10, D5.d dVar) {
        D5.o oVar;
        D5.o m10;
        D5.j jVar;
        Object f10;
        M5.g gVar = this.f8483g;
        if (gVar != null) {
            gVar = gVar.a(dVar);
        }
        if (dVar != null) {
            AbstractC0776b J10 = b10.J();
            AbstractC0928i a10 = dVar.a();
            if (a10 != null && (f10 = J10.f(a10)) != null) {
                oVar = b10.g0(a10, f10);
                InterfaceC4942i.d p10 = p(b10, dVar, c());
                Boolean e10 = p10 != null ? p10.e(InterfaceC4942i.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : null;
                if (oVar == null) {
                    oVar = this.f8484h;
                }
                m10 = m(b10, dVar, oVar);
                if (m10 == null && (jVar = this.f8479c) != null && this.f8481e && !jVar.F()) {
                    m10 = b10.w(this.f8479c, dVar);
                }
                return (m10 != this.f8484h && dVar == this.f8480d && this.f8483g == gVar && Objects.equals(this.f8482f, e10)) ? this : A(dVar, gVar, m10, e10);
            }
        }
        oVar = null;
        InterfaceC4942i.d p102 = p(b10, dVar, c());
        if (p102 != null) {
        }
        if (oVar == null) {
        }
        m10 = m(b10, dVar, oVar);
        if (m10 == null) {
            m10 = b10.w(this.f8479c, dVar);
        }
        if (m10 != this.f8484h) {
        }
    }

    @Override // D5.o
    public void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        B5.b g10 = gVar.g(fVar, gVar.d(obj, com.fasterxml.jackson.core.k.START_ARRAY));
        fVar.q(obj);
        z(obj, fVar, b10);
        gVar.h(fVar, g10);
    }

    protected final D5.o x(Q5.k kVar, D5.j jVar, D5.B b10) {
        k.d g10 = kVar.g(jVar, b10, this.f8480d);
        Q5.k kVar2 = g10.f8208b;
        if (kVar != kVar2) {
            this.f8485i = kVar2;
        }
        return g10.f8207a;
    }

    protected final D5.o y(Q5.k kVar, Class cls, D5.B b10) {
        k.d h10 = kVar.h(cls, b10, this.f8480d);
        Q5.k kVar2 = h10.f8208b;
        if (kVar != kVar2) {
            this.f8485i = kVar2;
        }
        return h10.f8207a;
    }

    protected abstract void z(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1129b(Class cls, D5.j jVar, boolean z10, M5.g gVar, D5.d dVar, D5.o oVar, Boolean bool) {
        super(cls, false);
        boolean z11 = false;
        this.f8479c = jVar;
        if (z10 || (jVar != null && jVar.D())) {
            z11 = true;
        }
        this.f8481e = z11;
        this.f8483g = gVar;
        this.f8480d = dVar;
        this.f8484h = oVar;
        this.f8485i = Q5.k.c();
        this.f8482f = bool;
    }

    protected AbstractC1129b(AbstractC1129b abstractC1129b, D5.d dVar, M5.g gVar, D5.o oVar, Boolean bool) {
        super(abstractC1129b);
        this.f8479c = abstractC1129b.f8479c;
        this.f8481e = abstractC1129b.f8481e;
        this.f8483g = gVar;
        this.f8480d = dVar;
        this.f8484h = oVar;
        this.f8485i = Q5.k.c();
        this.f8482f = bool;
    }
}
