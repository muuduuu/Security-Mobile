package Hc;

import Hc.j;
import id.C3367b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3825a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f3826b;

    static {
        Set<h> set = h.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(j.c((h) it.next()));
        }
        id.c l10 = j.a.f3945h.l();
        Intrinsics.checkNotNullExpressionValue(l10, "toSafe(...)");
        List x02 = CollectionsKt.x0(arrayList, l10);
        id.c l11 = j.a.f3949j.l();
        Intrinsics.checkNotNullExpressionValue(l11, "toSafe(...)");
        List x03 = CollectionsKt.x0(x02, l11);
        id.c l12 = j.a.f3967s.l();
        Intrinsics.checkNotNullExpressionValue(l12, "toSafe(...)");
        List x04 = CollectionsKt.x0(x03, l12);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = x04.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(C3367b.m((id.c) it2.next()));
        }
        f3826b = linkedHashSet;
    }

    private c() {
    }

    public final Set a() {
        return f3826b;
    }

    public final Set b() {
        return f3826b;
    }
}
