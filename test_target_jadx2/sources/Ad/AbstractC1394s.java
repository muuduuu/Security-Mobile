package ad;

import Sc.B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.internal.Intrinsics;
import yd.o0;

/* renamed from: ad.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1394s {
    public static final C1378e a(C1378e c1378e, Collection superQualifiers, boolean z10, boolean z11, boolean z12) {
        EnumC1381h enumC1381h;
        boolean z13;
        Intrinsics.checkNotNullParameter(c1378e, "<this>");
        Intrinsics.checkNotNullParameter(superQualifiers, "superQualifiers");
        Collection collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            EnumC1381h b10 = b((C1378e) it.next());
            if (b10 != null) {
                arrayList.add(b10);
            }
        }
        EnumC1381h d10 = d(CollectionsKt.S0(arrayList), b(c1378e), z10);
        if (d10 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                EnumC1381h d11 = ((C1378e) it2.next()).d();
                if (d11 != null) {
                    arrayList2.add(d11);
                }
            }
            enumC1381h = d(CollectionsKt.S0(arrayList2), c1378e.d(), z10);
        } else {
            enumC1381h = d10;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = collection.iterator();
        while (it3.hasNext()) {
            EnumC1379f c10 = ((C1378e) it3.next()).c();
            if (c10 != null) {
                arrayList3.add(c10);
            }
        }
        EnumC1379f enumC1379f = (EnumC1379f) e(CollectionsKt.S0(arrayList3), EnumC1379f.MUTABLE, EnumC1379f.READ_ONLY, c1378e.c(), z10);
        EnumC1381h enumC1381h2 = null;
        if (enumC1381h != null && !z12 && (!z11 || enumC1381h != EnumC1381h.NULLABLE)) {
            enumC1381h2 = enumC1381h;
        }
        boolean z14 = false;
        if (enumC1381h2 == EnumC1381h.NOT_NULL) {
            if (!c1378e.b()) {
                if (!collection.isEmpty()) {
                    Iterator it4 = collection.iterator();
                    while (it4.hasNext()) {
                        if (((C1378e) it4.next()).b()) {
                        }
                    }
                }
            }
            z13 = true;
            if (enumC1381h2 != null && d10 != enumC1381h) {
                z14 = true;
            }
            return new C1378e(enumC1381h2, enumC1379f, z13, z14);
        }
        z13 = false;
        if (enumC1381h2 != null) {
            z14 = true;
        }
        return new C1378e(enumC1381h2, enumC1379f, z13, z14);
    }

    private static final EnumC1381h b(C1378e c1378e) {
        if (c1378e.e()) {
            return null;
        }
        return c1378e.d();
    }

    public static final boolean c(o0 o0Var, Ad.i type) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        id.c ENHANCED_NULLABILITY_ANNOTATION = B.f8964v;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return o0Var.O(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    private static final EnumC1381h d(Set set, EnumC1381h enumC1381h, boolean z10) {
        EnumC1381h enumC1381h2 = EnumC1381h.FORCE_FLEXIBILITY;
        return enumC1381h == enumC1381h2 ? enumC1381h2 : (EnumC1381h) e(set, EnumC1381h.NOT_NULL, EnumC1381h.NULLABLE, enumC1381h, z10);
    }

    private static final Object e(Set set, Object obj, Object obj2, Object obj3, boolean z10) {
        Set S02;
        if (!z10) {
            if (obj3 != null && (S02 = CollectionsKt.S0(O.l(set, obj3))) != null) {
                set = S02;
            }
            return CollectionsKt.B0(set);
        }
        Object obj4 = set.contains(obj) ? obj : set.contains(obj2) ? obj2 : null;
        if (Intrinsics.b(obj4, obj) && Intrinsics.b(obj3, obj2)) {
            return null;
        }
        return obj3 == null ? obj4 : obj3;
    }
}
