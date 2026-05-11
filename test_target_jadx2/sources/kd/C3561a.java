package kd;

import Kc.D;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.K;
import Kc.e0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nc.AbstractC3728a;
import od.AbstractC3778c;
import rd.k;

/* renamed from: kd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3561a extends p {

    /* renamed from: a, reason: collision with root package name */
    public static final C3561a f36281a = new C3561a();

    /* renamed from: kd.a$a, reason: collision with other inner class name */
    public static final class C0524a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC3728a.a(AbstractC3778c.l((InterfaceC0933e) obj).b(), AbstractC3778c.l((InterfaceC0933e) obj2).b());
        }
    }

    private C3561a() {
    }

    private static final void b(InterfaceC0933e interfaceC0933e, LinkedHashSet linkedHashSet, rd.h hVar, boolean z10) {
        for (InterfaceC0941m interfaceC0941m : k.a.a(hVar, rd.d.f40623t, null, 2, null)) {
            if (interfaceC0941m instanceof InterfaceC0933e) {
                InterfaceC0933e interfaceC0933e2 = (InterfaceC0933e) interfaceC0941m;
                if (interfaceC0933e2.R()) {
                    id.f name = interfaceC0933e2.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    InterfaceC0936h f10 = hVar.f(name, Rc.d.WHEN_GET_ALL_DESCRIPTORS);
                    interfaceC0933e2 = f10 instanceof InterfaceC0933e ? (InterfaceC0933e) f10 : f10 instanceof e0 ? ((e0) f10).x() : null;
                }
                if (interfaceC0933e2 != null) {
                    if (f.z(interfaceC0933e2, interfaceC0933e)) {
                        linkedHashSet.add(interfaceC0933e2);
                    }
                    if (z10) {
                        rd.h G02 = interfaceC0933e2.G0();
                        Intrinsics.checkNotNullExpressionValue(G02, "getUnsubstitutedInnerClassesScope(...)");
                        b(interfaceC0933e, linkedHashSet, G02, z10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    public Collection a(InterfaceC0933e sealedClass, boolean z10) {
        InterfaceC0941m interfaceC0941m;
        InterfaceC0941m interfaceC0941m2;
        Intrinsics.checkNotNullParameter(sealedClass, "sealedClass");
        if (sealedClass.s() != D.SEALED) {
            return CollectionsKt.j();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z10) {
            Iterator it = AbstractC3778c.r(sealedClass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC0941m = 0;
                    break;
                }
                interfaceC0941m = it.next();
                if (((InterfaceC0941m) interfaceC0941m) instanceof K) {
                    break;
                }
            }
            interfaceC0941m2 = interfaceC0941m;
        } else {
            interfaceC0941m2 = sealedClass.b();
        }
        if (interfaceC0941m2 instanceof K) {
            b(sealedClass, linkedHashSet, ((K) interfaceC0941m2).w(), z10);
        }
        rd.h G02 = sealedClass.G0();
        Intrinsics.checkNotNullExpressionValue(G02, "getUnsubstitutedInnerClassesScope(...)");
        b(sealedClass, linkedHashSet, G02, true);
        return CollectionsKt.F0(linkedHashSet, new C0524a());
    }
}
