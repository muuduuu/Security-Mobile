package Ec;

import java.util.Collections;
import java.util.List;
import xc.AbstractC5150c;
import xc.AbstractC5156i;
import xc.C5143D;
import xc.InterfaceC5151d;
import xc.InterfaceC5155h;

/* loaded from: classes3.dex */
public class G extends C5143D {
    private static n k(AbstractC5150c abstractC5150c) {
        kotlin.reflect.f E10 = abstractC5150c.E();
        return E10 instanceof n ? (n) E10 : C0827f.f1971d;
    }

    @Override // xc.C5143D
    public kotlin.reflect.g a(AbstractC5156i abstractC5156i) {
        return new o(k(abstractC5156i), abstractC5156i.getName(), abstractC5156i.G(), abstractC5156i.D());
    }

    @Override // xc.C5143D
    public kotlin.reflect.d b(Class cls) {
        return AbstractC0824c.c(cls);
    }

    @Override // xc.C5143D
    public kotlin.reflect.f c(Class cls, String str) {
        return AbstractC0824c.d(cls);
    }

    @Override // xc.C5143D
    public kotlin.reflect.i d(xc.n nVar) {
        return new q(k(nVar), nVar.getName(), nVar.G(), nVar.D());
    }

    @Override // xc.C5143D
    public kotlin.reflect.l e(xc.r rVar) {
        return new v(k(rVar), rVar.getName(), rVar.G(), rVar.D());
    }

    @Override // xc.C5143D
    public kotlin.reflect.m f(xc.t tVar) {
        return new w(k(tVar), tVar.getName(), tVar.G(), tVar.D());
    }

    @Override // xc.C5143D
    public kotlin.reflect.n g(xc.v vVar) {
        return new x(k(vVar), vVar.getName(), vVar.G());
    }

    @Override // xc.C5143D
    public String h(InterfaceC5155h interfaceC5155h) {
        o c10;
        kotlin.reflect.g a10 = Dc.d.a(interfaceC5155h);
        return (a10 == null || (c10 = L.c(a10)) == null) ? super.h(interfaceC5155h) : H.f1945a.e(c10.S());
    }

    @Override // xc.C5143D
    public String i(xc.m mVar) {
        return h(mVar);
    }

    @Override // xc.C5143D
    public kotlin.reflect.o j(kotlin.reflect.e eVar, List list, boolean z10) {
        return eVar instanceof InterfaceC5151d ? AbstractC0824c.a(((InterfaceC5151d) eVar).m(), list, z10) : Cc.e.b(eVar, list, z10, Collections.emptyList());
    }
}
