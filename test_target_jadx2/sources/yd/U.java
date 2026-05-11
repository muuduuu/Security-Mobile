package yd;

import Kc.InterfaceC0936h;
import Kc.InterfaceC0937i;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;

/* loaded from: classes3.dex */
public abstract class U {

    public static final class a extends f0 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f45465d;

        a(List list) {
            this.f45465d = list;
        }

        @Override // yd.f0
        public i0 k(e0 key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!this.f45465d.contains(key)) {
                return null;
            }
            InterfaceC0936h d10 = key.d();
            Intrinsics.e(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return q0.s((Kc.f0) d10);
        }
    }

    private static final AbstractC5197E a(List list, List list2, Hc.g gVar) {
        AbstractC5197E p10 = n0.g(new a(list)).p((AbstractC5197E) CollectionsKt.d0(list2), u0.OUT_VARIANCE);
        if (p10 == null) {
            p10 = gVar.y();
        }
        Intrinsics.d(p10);
        return p10;
    }

    public static final AbstractC5197E b(Kc.f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        InterfaceC0941m b10 = f0Var.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getContainingDeclaration(...)");
        if (b10 instanceof InterfaceC0937i) {
            List c10 = ((InterfaceC0937i) b10).r().c();
            Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
            List list = c10;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e0 r10 = ((Kc.f0) it.next()).r();
                Intrinsics.checkNotNullExpressionValue(r10, "getTypeConstructor(...)");
                arrayList.add(r10);
            }
            List upperBounds = f0Var.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            return a(arrayList, upperBounds, AbstractC3778c.j(f0Var));
        }
        if (!(b10 instanceof InterfaceC0952y)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List n10 = ((InterfaceC0952y) b10).n();
        Intrinsics.checkNotNullExpressionValue(n10, "getTypeParameters(...)");
        List list2 = n10;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            e0 r11 = ((Kc.f0) it2.next()).r();
            Intrinsics.checkNotNullExpressionValue(r11, "getTypeConstructor(...)");
            arrayList2.add(r11);
        }
        List upperBounds2 = f0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        return a(arrayList2, upperBounds2, AbstractC3778c.j(f0Var));
    }
}
