package Q5;

import D5.A;
import D5.AbstractC0776b;
import D5.B;
import K5.AbstractC0928i;
import R5.AbstractC1128a;
import java.util.Objects;
import v5.InterfaceC4942i;

/* loaded from: classes2.dex */
public class m extends AbstractC1128a implements P5.i {

    /* renamed from: f, reason: collision with root package name */
    private static final D5.j f8221f = S5.o.D().G(String.class);

    /* renamed from: g, reason: collision with root package name */
    public static final m f8222g = new m();

    /* renamed from: e, reason: collision with root package name */
    protected final D5.o f8223e;

    protected m() {
        super(String[].class);
        this.f8223e = null;
    }

    private void D(String[] strArr, com.fasterxml.jackson.core.f fVar, B b10, D5.o oVar) {
        for (String str : strArr) {
            if (str == null) {
                b10.v(fVar);
            } else {
                oVar.f(str, fVar, b10);
            }
        }
    }

    @Override // D5.o
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean d(B b10, String[] strArr) {
        return strArr.length == 0;
    }

    @Override // R5.H, D5.o
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void f(String[] strArr, com.fasterxml.jackson.core.f fVar, B b10) {
        int length = strArr.length;
        if (length == 1 && ((this.f8478d == null && b10.Z(A.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f8478d == Boolean.TRUE)) {
            z(strArr, fVar, b10);
            return;
        }
        fVar.O1(strArr, length);
        z(strArr, fVar, b10);
        fVar.K();
    }

    @Override // R5.AbstractC1128a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void z(String[] strArr, com.fasterxml.jackson.core.f fVar, B b10) {
        if (strArr.length == 0) {
            return;
        }
        D5.o oVar = this.f8223e;
        if (oVar != null) {
            D(strArr, fVar, b10, oVar);
            return;
        }
        for (String str : strArr) {
            if (str == null) {
                fVar.y0();
            } else {
                fVar.h2(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    @Override // R5.AbstractC1128a, P5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D5.o a(B b10, D5.d dVar) {
        D5.o oVar;
        D5.o m10;
        Object f10;
        if (dVar != null) {
            AbstractC0776b J10 = b10.J();
            AbstractC0928i a10 = dVar.a();
            if (a10 != null && (f10 = J10.f(a10)) != null) {
                oVar = b10.g0(a10, f10);
                Boolean o10 = o(b10, dVar, String[].class, InterfaceC4942i.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
                if (oVar == null) {
                    oVar = this.f8223e;
                }
                m10 = m(b10, dVar, oVar);
                if (m10 == null) {
                    m10 = b10.x(String.class, dVar);
                }
                D5.o oVar2 = s(m10) ? null : m10;
                return (oVar2 == this.f8223e || !Objects.equals(o10, this.f8478d)) ? new m(this, dVar, oVar2, o10) : this;
            }
        }
        oVar = null;
        Boolean o102 = o(b10, dVar, String[].class, InterfaceC4942i.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
        if (oVar == null) {
        }
        m10 = m(b10, dVar, oVar);
        if (m10 == null) {
        }
        if (s(m10)) {
        }
        if (oVar2 == this.f8223e) {
        }
    }

    @Override // R5.AbstractC1128a
    public D5.o y(D5.d dVar, Boolean bool) {
        return new m(this, dVar, this.f8223e, bool);
    }

    public m(m mVar, D5.d dVar, D5.o oVar, Boolean bool) {
        super(mVar, dVar, bool);
        this.f8223e = oVar;
    }

    @Override // P5.h
    public P5.h v(M5.g gVar) {
        return this;
    }
}
