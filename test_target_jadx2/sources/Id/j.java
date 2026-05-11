package id;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final c f34297a;

    /* renamed from: b, reason: collision with root package name */
    private static final c f34298b;

    static {
        c cVar = new c("java.lang");
        f34297a = cVar;
        c c10 = cVar.c(f.o("annotation"));
        Intrinsics.checkNotNullExpressionValue(c10, "child(...)");
        f34298b = c10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3367b k(String str) {
        return new C3367b(i.f34245a.b(), f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3367b l(String str) {
        return new C3367b(i.f34245a.f(), f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3367b m(String str) {
        return new C3367b(i.f34245a.c(), f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3367b n(String str) {
        return new C3367b(i.f34245a.d(), f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3367b o(String str) {
        return new C3367b(i.f34245a.e(), f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map p(Map map) {
        Set<Map.Entry> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(G.d(CollectionsKt.u(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Pair a10 = t.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(a10.c(), a10.d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3367b q(f fVar) {
        i iVar = i.f34245a;
        return new C3367b(iVar.a().h(), f.o(fVar.e() + iVar.a().j().e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3367b r(String str) {
        return new C3367b(i.f34245a.g(), f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3367b s(String str) {
        return new C3367b(i.f34245a.h(), f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3367b t(C3367b c3367b) {
        return new C3367b(i.f34245a.f(), f.o('U' + c3367b.j().e()));
    }
}
