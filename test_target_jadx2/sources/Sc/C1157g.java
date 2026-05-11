package Sc;

import Hc.j;
import id.C3367b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Sc.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1157g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1157g f9031a = new C1157g();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f9032b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f9033c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set f9034d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set f9035e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f9036f;

    static {
        id.c d10;
        id.c d11;
        id.c c10;
        id.c c11;
        id.c d12;
        id.c c12;
        id.c c13;
        id.c c14;
        id.d dVar = j.a.f3967s;
        d10 = AbstractC1158h.d(dVar, "name");
        Pair a10 = lc.t.a(d10, Hc.j.f3877k);
        d11 = AbstractC1158h.d(dVar, "ordinal");
        Pair a11 = lc.t.a(d11, id.f.o("ordinal"));
        c10 = AbstractC1158h.c(j.a.f3926V, "size");
        Pair a12 = lc.t.a(c10, id.f.o("size"));
        id.c cVar = j.a.f3930Z;
        c11 = AbstractC1158h.c(cVar, "size");
        Pair a13 = lc.t.a(c11, id.f.o("size"));
        d12 = AbstractC1158h.d(j.a.f3943g, "length");
        Pair a14 = lc.t.a(d12, id.f.o("length"));
        c12 = AbstractC1158h.c(cVar, "keys");
        Pair a15 = lc.t.a(c12, id.f.o("keySet"));
        c13 = AbstractC1158h.c(cVar, "values");
        Pair a16 = lc.t.a(c13, id.f.o("values"));
        c14 = AbstractC1158h.c(cVar, "entries");
        Map k10 = kotlin.collections.G.k(a10, a11, a12, a13, a14, a15, a16, lc.t.a(c14, id.f.o("entrySet")));
        f9032b = k10;
        Set<Map.Entry> entrySet = k10.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(CollectionsKt.u(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new Pair(((id.c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            id.f fVar = (id.f) pair.d();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((id.f) pair.c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.G.d(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.W((Iterable) entry2.getValue()));
        }
        f9033c = linkedHashMap2;
        Map map = f9032b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            Jc.c cVar2 = Jc.c.f4890a;
            id.d j10 = ((id.c) entry3.getKey()).e().j();
            Intrinsics.checkNotNullExpressionValue(j10, "toUnsafe(...)");
            C3367b n10 = cVar2.n(j10);
            Intrinsics.d(n10);
            linkedHashSet.add(n10.b().c((id.f) entry3.getValue()));
        }
        f9034d = linkedHashSet;
        Set keySet = f9032b.keySet();
        f9035e = keySet;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(((id.c) it.next()).g());
        }
        f9036f = CollectionsKt.S0(arrayList2);
    }

    private C1157g() {
    }

    public final Map a() {
        return f9032b;
    }

    public final List b(id.f name1) {
        Intrinsics.checkNotNullParameter(name1, "name1");
        List list = (List) f9033c.get(name1);
        return list == null ? CollectionsKt.j() : list;
    }

    public final Set c() {
        return f9035e;
    }

    public final Set d() {
        return f9036f;
    }
}
