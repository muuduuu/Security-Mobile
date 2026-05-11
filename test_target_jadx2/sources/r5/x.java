package R5;

import D5.AbstractC0776b;
import K5.AbstractC0928i;
import Q5.k;
import java.util.Objects;
import v5.InterfaceC4942i;

/* loaded from: classes2.dex */
public class x extends AbstractC1128a implements P5.i {

    /* renamed from: e, reason: collision with root package name */
    protected final boolean f8546e;

    /* renamed from: f, reason: collision with root package name */
    protected final D5.j f8547f;

    /* renamed from: g, reason: collision with root package name */
    protected final M5.g f8548g;

    /* renamed from: h, reason: collision with root package name */
    protected D5.o f8549h;

    /* renamed from: i, reason: collision with root package name */
    protected Q5.k f8550i;

    public x(D5.j jVar, boolean z10, M5.g gVar, D5.o oVar) {
        super(Object[].class);
        this.f8547f = jVar;
        this.f8546e = z10;
        this.f8548g = gVar;
        this.f8550i = Q5.k.c();
        this.f8549h = oVar;
    }

    protected final D5.o A(Q5.k kVar, D5.j jVar, D5.B b10) {
        k.d g10 = kVar.g(jVar, b10, this.f8477c);
        Q5.k kVar2 = g10.f8208b;
        if (kVar != kVar2) {
            this.f8550i = kVar2;
        }
        return g10.f8207a;
    }

    protected final D5.o B(Q5.k kVar, Class cls, D5.B b10) {
        k.d h10 = kVar.h(cls, b10, this.f8477c);
        Q5.k kVar2 = h10.f8208b;
        if (kVar != kVar2) {
            this.f8550i = kVar2;
        }
        return h10.f8207a;
    }

    @Override // D5.o
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean d(D5.B b10, Object[] objArr) {
        return objArr.length == 0;
    }

    @Override // R5.H, D5.o
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final void f(Object[] objArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        int length = objArr.length;
        if (length == 1 && ((this.f8478d == null && b10.Z(D5.A.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f8478d == Boolean.TRUE)) {
            z(objArr, fVar, b10);
            return;
        }
        fVar.O1(objArr, length);
        z(objArr, fVar, b10);
        fVar.K();
    }

    @Override // R5.AbstractC1128a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(Object[] objArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        D5.o oVar = this.f8549h;
        if (oVar != null) {
            F(objArr, fVar, b10, oVar);
            return;
        }
        if (this.f8548g != null) {
            G(objArr, fVar, b10);
            return;
        }
        int i10 = 0;
        Object obj = null;
        try {
            Q5.k kVar = this.f8550i;
            while (i10 < length) {
                obj = objArr[i10];
                if (obj == null) {
                    b10.v(fVar);
                } else {
                    Class<?> cls = obj.getClass();
                    D5.o j10 = kVar.j(cls);
                    if (j10 == null) {
                        j10 = this.f8547f.v() ? A(kVar, b10.r(this.f8547f, cls), b10) : B(kVar, cls, b10);
                    }
                    j10.f(obj, fVar, b10);
                }
                i10++;
            }
        } catch (Exception e10) {
            t(b10, e10, obj, i10);
        }
    }

    public void F(Object[] objArr, com.fasterxml.jackson.core.f fVar, D5.B b10, D5.o oVar) {
        int length = objArr.length;
        M5.g gVar = this.f8548g;
        Object obj = null;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                obj = objArr[i10];
                if (obj == null) {
                    b10.v(fVar);
                } else if (gVar == null) {
                    oVar.f(obj, fVar, b10);
                } else {
                    oVar.g(obj, fVar, b10, gVar);
                }
            } catch (Exception e10) {
                t(b10, e10, obj, i10);
                return;
            }
        }
    }

    public void G(Object[] objArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        int length = objArr.length;
        M5.g gVar = this.f8548g;
        int i10 = 0;
        Object obj = null;
        try {
            Q5.k kVar = this.f8550i;
            while (i10 < length) {
                obj = objArr[i10];
                if (obj == null) {
                    b10.v(fVar);
                } else {
                    Class<?> cls = obj.getClass();
                    D5.o j10 = kVar.j(cls);
                    if (j10 == null) {
                        j10 = B(kVar, cls, b10);
                    }
                    j10.g(obj, fVar, b10, gVar);
                }
                i10++;
            }
        } catch (Exception e10) {
            t(b10, e10, obj, i10);
        }
    }

    public x H(D5.d dVar, M5.g gVar, D5.o oVar, Boolean bool) {
        return (this.f8477c == dVar && oVar == this.f8549h && this.f8548g == gVar && Objects.equals(this.f8478d, bool)) ? this : new x(this, dVar, gVar, oVar, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // R5.AbstractC1128a, P5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D5.o a(D5.B b10, D5.d dVar) {
        D5.o oVar;
        D5.o m10;
        D5.j jVar;
        Object f10;
        M5.g gVar = this.f8548g;
        if (gVar != null) {
            gVar = gVar.a(dVar);
        }
        if (dVar != null) {
            AbstractC0928i a10 = dVar.a();
            AbstractC0776b J10 = b10.J();
            if (a10 != null && (f10 = J10.f(a10)) != null) {
                oVar = b10.g0(a10, f10);
                InterfaceC4942i.d p10 = p(b10, dVar, c());
                Boolean e10 = p10 != null ? p10.e(InterfaceC4942i.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : null;
                if (oVar == null) {
                    oVar = this.f8549h;
                }
                m10 = m(b10, dVar, oVar);
                if (m10 == null && (jVar = this.f8547f) != null && this.f8546e && !jVar.F()) {
                    m10 = b10.w(this.f8547f, dVar);
                }
                return H(dVar, gVar, m10, e10);
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
            m10 = b10.w(this.f8547f, dVar);
        }
        return H(dVar, gVar, m10, e10);
    }

    @Override // P5.h
    public P5.h v(M5.g gVar) {
        return new x(this.f8547f, this.f8546e, gVar, this.f8549h);
    }

    @Override // R5.AbstractC1128a
    public D5.o y(D5.d dVar, Boolean bool) {
        return new x(this, dVar, this.f8548g, this.f8549h, bool);
    }

    public x(x xVar, D5.d dVar, M5.g gVar, D5.o oVar, Boolean bool) {
        super(xVar, dVar, bool);
        this.f8547f = xVar.f8547f;
        this.f8548g = gVar;
        this.f8546e = xVar.f8546e;
        this.f8550i = Q5.k.c();
        this.f8549h = oVar;
    }
}
