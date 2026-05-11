package Sc;

import id.C3367b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f9042a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f9043b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f9044c;

    static {
        m mVar = new m();
        f9042a = mVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f9043b = linkedHashMap;
        id.i iVar = id.i.f34245a;
        mVar.c(iVar.l(), mVar.a("java.util.ArrayList", "java.util.LinkedList"));
        mVar.c(iVar.n(), mVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        mVar.c(iVar.m(), mVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C3367b m10 = C3367b.m(new id.c("java.util.function.Function"));
        Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
        mVar.c(m10, mVar.a("java.util.function.UnaryOperator"));
        C3367b m11 = C3367b.m(new id.c("java.util.function.BiFunction"));
        Intrinsics.checkNotNullExpressionValue(m11, "topLevel(...)");
        mVar.c(m11, mVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(lc.t.a(((C3367b) entry.getKey()).b(), ((C3367b) entry.getValue()).b()));
        }
        f9044c = kotlin.collections.G.r(arrayList);
    }

    private m() {
    }

    private final List a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C3367b.m(new id.c(str)));
        }
        return arrayList;
    }

    private final void c(C3367b c3367b, List list) {
        Map map = f9043b;
        for (Object obj : list) {
            map.put(obj, c3367b);
        }
    }

    public final id.c b(id.c classFqName) {
        Intrinsics.checkNotNullParameter(classFqName, "classFqName");
        return (id.c) f9044c.get(classFqName);
    }
}
