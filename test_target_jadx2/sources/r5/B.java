package R5;

import D5.AbstractC0776b;
import K5.AbstractC0928i;
import java.util.Collection;
import java.util.Objects;
import v5.InterfaceC4942i;

/* loaded from: classes2.dex */
public abstract class B extends H implements P5.i {

    /* renamed from: c, reason: collision with root package name */
    protected final Boolean f8459c;

    protected B(Class cls) {
        super(cls, false);
        this.f8459c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002a  */
    @Override // P5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D5.o a(D5.B b10, D5.d dVar) {
        D5.o oVar;
        D5.o m10;
        Object f10;
        if (dVar != null) {
            AbstractC0776b J10 = b10.J();
            AbstractC0928i a10 = dVar.a();
            if (a10 != null && (f10 = J10.f(a10)) != null) {
                oVar = b10.g0(a10, f10);
                InterfaceC4942i.d p10 = p(b10, dVar, c());
                Boolean e10 = p10 == null ? p10.e(InterfaceC4942i.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : null;
                m10 = m(b10, dVar, oVar);
                if (m10 == null) {
                    m10 = b10.x(String.class, dVar);
                }
                return !s(m10) ? Objects.equals(e10, this.f8459c) ? this : v(dVar, e10) : new C1137j(b10.d(String.class), true, null, m10);
            }
        }
        oVar = null;
        InterfaceC4942i.d p102 = p(b10, dVar, c());
        if (p102 == null) {
        }
        m10 = m(b10, dVar, oVar);
        if (m10 == null) {
        }
        if (!s(m10)) {
        }
    }

    public abstract D5.o v(D5.d dVar, Boolean bool);

    @Override // D5.o
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public boolean d(D5.B b10, Collection collection) {
        return collection == null || collection.size() == 0;
    }

    protected B(B b10, Boolean bool) {
        super(b10);
        this.f8459c = bool;
    }
}
