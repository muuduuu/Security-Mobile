package K5;

import D5.AbstractC0776b;
import java.io.Serializable;
import v5.InterfaceC4942i;
import v5.p;

/* loaded from: classes2.dex */
public abstract class v implements D5.d, Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected final D5.v f5443a;

    protected v(D5.v vVar) {
        this.f5443a = vVar == null ? D5.v.f1285j : vVar;
    }

    @Override // D5.d
    public InterfaceC4942i.d b(F5.l lVar, Class cls) {
        AbstractC0928i a10;
        InterfaceC4942i.d o10 = lVar.o(cls);
        AbstractC0776b g10 = lVar.g();
        InterfaceC4942i.d k10 = (g10 == null || (a10 = a()) == null) ? null : g10.k(a10);
        return o10 == null ? k10 == null ? D5.d.f1236L : k10 : k10 == null ? o10 : o10.q(k10);
    }

    @Override // D5.d
    public p.b c(F5.l lVar, Class cls) {
        AbstractC0776b g10 = lVar.g();
        AbstractC0928i a10 = a();
        if (a10 == null) {
            return lVar.p(cls);
        }
        p.b l10 = lVar.l(cls, a10.d());
        if (g10 == null) {
            return l10;
        }
        p.b C10 = g10.C(a10);
        return l10 == null ? C10 : l10.m(C10);
    }

    protected v(v vVar) {
        this.f5443a = vVar.f5443a;
    }
}
