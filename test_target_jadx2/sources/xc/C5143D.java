package xc;

import java.util.List;

/* renamed from: xc.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5143D {
    public kotlin.reflect.d b(Class cls) {
        return new C5152e(cls);
    }

    public kotlin.reflect.f c(Class cls, String str) {
        return new q(cls, str);
    }

    public String h(InterfaceC5155h interfaceC5155h) {
        String obj = interfaceC5155h.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String i(m mVar) {
        return h(mVar);
    }

    public kotlin.reflect.o j(kotlin.reflect.e eVar, List list, boolean z10) {
        return new I(eVar, list, z10);
    }

    public kotlin.reflect.g a(AbstractC5156i abstractC5156i) {
        return abstractC5156i;
    }

    public kotlin.reflect.i d(n nVar) {
        return nVar;
    }

    public kotlin.reflect.l e(r rVar) {
        return rVar;
    }

    public kotlin.reflect.m f(t tVar) {
        return tVar;
    }

    public kotlin.reflect.n g(v vVar) {
        return vVar;
    }
}
