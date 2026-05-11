package ud;

import Kc.C0953z;
import Kc.H;
import Kc.h0;
import dd.C3026c;
import dd.C3040q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class G {
    public static final h0 a(C3026c c3026c, fd.c nameResolver, fd.g typeTable, Function1 typeDeserializer, Function1 typeOfPublicProperty) {
        Ad.j jVar;
        List P02;
        Intrinsics.checkNotNullParameter(c3026c, "<this>");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
        Intrinsics.checkNotNullParameter(typeOfPublicProperty, "typeOfPublicProperty");
        if (c3026c.J0() <= 0) {
            if (!c3026c.l1()) {
                return null;
            }
            id.f b10 = y.b(nameResolver, c3026c.G0());
            C3040q i10 = fd.f.i(c3026c, typeTable);
            if ((i10 != null && (jVar = (Ad.j) typeDeserializer.invoke(i10)) != null) || (jVar = (Ad.j) typeOfPublicProperty.invoke(b10)) != null) {
                return new C0953z(b10, jVar);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + y.b(nameResolver, c3026c.C0()) + " with property " + b10).toString());
        }
        List K02 = c3026c.K0();
        Intrinsics.checkNotNullExpressionValue(K02, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = K02;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        for (Integer num : list) {
            Intrinsics.d(num);
            arrayList.add(y.b(nameResolver, num.intValue()));
        }
        Pair a10 = lc.t.a(Integer.valueOf(c3026c.N0()), Integer.valueOf(c3026c.M0()));
        if (Intrinsics.b(a10, lc.t.a(Integer.valueOf(arrayList.size()), 0))) {
            List O02 = c3026c.O0();
            Intrinsics.checkNotNullExpressionValue(O02, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = O02;
            P02 = new ArrayList(CollectionsKt.u(list2, 10));
            for (Integer num2 : list2) {
                Intrinsics.d(num2);
                P02.add(typeTable.a(num2.intValue()));
            }
        } else {
            if (!Intrinsics.b(a10, lc.t.a(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + y.b(nameResolver, c3026c.C0()) + " has illegal multi-field value class representation").toString());
            }
            P02 = c3026c.P0();
        }
        Intrinsics.d(P02);
        List list3 = P02;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.invoke(it.next()));
        }
        return new H(CollectionsKt.V0(arrayList, arrayList2));
    }
}
