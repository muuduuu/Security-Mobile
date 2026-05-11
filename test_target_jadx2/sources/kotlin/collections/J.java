package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class J extends I {
    public static Map h() {
        z zVar = z.f36362a;
        Intrinsics.e(zVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return zVar;
    }

    public static Object i(Map map, Object obj) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return H.a(map, obj);
    }

    public static HashMap j(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap hashMap = new HashMap(G.d(pairs.length));
        q(hashMap, pairs);
        return hashMap;
    }

    public static Map k(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return pairs.length > 0 ? v(pairs, new LinkedHashMap(G.d(pairs.length))) : G.h();
    }

    public static Map l(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(G.d(pairs.length));
        q(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map m(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : I.f(map) : G.h();
    }

    public static Map n(Map map, Map map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map o(Map map, Pair pair) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        if (map.isEmpty()) {
            return G.e(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static final void p(Map map, Iterable pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static final void q(Map map, Pair[] pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair pair : pairs) {
            map.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static Map r(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m(s(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return G.h();
        }
        if (size != 1) {
            return s(iterable, new LinkedHashMap(G.d(collection.size())));
        }
        return G.e((Pair) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final Map s(Iterable iterable, Map destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        p(destination, iterable);
        return destination;
    }

    public static Map t(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? G.w(map) : I.f(map) : G.h();
    }

    public static Map u(Pair[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        int length = pairArr.length;
        return length != 0 ? length != 1 ? v(pairArr, new LinkedHashMap(G.d(pairArr.length))) : G.e(pairArr[0]) : G.h();
    }

    public static final Map v(Pair[] pairArr, Map destination) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        q(destination, pairArr);
        return destination;
    }

    public static Map w(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }
}
