package kotlin.reflect.jvm.internal.impl.types.checker;

import Kc.F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final F f36675a = new F("KotlinTypeRefiner");

    public static final F a() {
        return f36675a;
    }

    public static final List b(g gVar, Iterable types) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(types, "types");
        ArrayList arrayList = new ArrayList(CollectionsKt.u(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.a((AbstractC5197E) it.next()));
        }
        return arrayList;
    }
}
