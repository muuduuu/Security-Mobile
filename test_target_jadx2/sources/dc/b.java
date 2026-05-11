package Dc;

import Ec.A;
import Ec.D;
import Kc.EnumC0934f;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.e;
import kotlin.reflect.o;
import kotlin.reflect.p;
import xc.C5142C;

/* loaded from: classes3.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.reflect.d a(e eVar) {
        InterfaceC0933e interfaceC0933e;
        kotlin.reflect.d b10;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof kotlin.reflect.d) {
            return (kotlin.reflect.d) eVar;
        }
        if (!(eVar instanceof p)) {
            throw new D("Cannot calculate JVM erasure for type: " + eVar);
        }
        List upperBounds = ((p) eVar).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            o oVar = (o) next;
            Intrinsics.e(oVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC0936h d10 = ((A) oVar).r().W0().d();
            interfaceC0933e = d10 instanceof InterfaceC0933e ? (InterfaceC0933e) d10 : null;
            if (interfaceC0933e != null && interfaceC0933e.o() != EnumC0934f.INTERFACE && interfaceC0933e.o() != EnumC0934f.ANNOTATION_CLASS) {
                interfaceC0933e = next;
                break;
            }
        }
        o oVar2 = (o) interfaceC0933e;
        if (oVar2 == null) {
            oVar2 = (o) CollectionsKt.firstOrNull(upperBounds);
        }
        return (oVar2 == null || (b10 = b(oVar2)) == null) ? C5142C.b(Object.class) : b10;
    }

    public static final kotlin.reflect.d b(o oVar) {
        kotlin.reflect.d a10;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        e j10 = oVar.j();
        if (j10 != null && (a10 = a(j10)) != null) {
            return a10;
        }
        throw new D("Cannot calculate JVM erasure for type: " + oVar);
    }
}
