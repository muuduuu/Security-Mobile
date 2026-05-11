package ad;

import bd.C1673A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.t;

/* renamed from: ad.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1388m {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12723a = new LinkedHashMap();

    /* renamed from: ad.m$a */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f12724a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1388m f12725b;

        /* renamed from: ad.m$a$a, reason: collision with other inner class name */
        public final class C0237a {

            /* renamed from: a, reason: collision with root package name */
            private final String f12726a;

            /* renamed from: b, reason: collision with root package name */
            private final List f12727b;

            /* renamed from: c, reason: collision with root package name */
            private Pair f12728c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f12729d;

            public C0237a(a aVar, String functionName) {
                Intrinsics.checkNotNullParameter(functionName, "functionName");
                this.f12729d = aVar;
                this.f12726a = functionName;
                this.f12727b = new ArrayList();
                this.f12728c = t.a("V", null);
            }

            public final Pair a() {
                C1673A c1673a = C1673A.f18936a;
                String b10 = this.f12729d.b();
                String str = this.f12726a;
                List list = this.f12727b;
                ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).c());
                }
                String k10 = c1673a.k(b10, c1673a.j(str, arrayList, (String) this.f12728c.c()));
                C1392q c1392q = (C1392q) this.f12728c.d();
                List list2 = this.f12727b;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((C1392q) ((Pair) it2.next()).d());
                }
                return t.a(k10, new C1386k(c1392q, arrayList2));
            }

            public final void b(String type, C1378e... qualifiers) {
                C1392q c1392q;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                List list = this.f12727b;
                if (qualifiers.length == 0) {
                    c1392q = null;
                } else {
                    Iterable<IndexedValue> z02 = AbstractC3574i.z0(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(G.d(CollectionsKt.u(z02, 10)), 16));
                    for (IndexedValue indexedValue : z02) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.c()), (C1378e) indexedValue.d());
                    }
                    c1392q = new C1392q(linkedHashMap);
                }
                list.add(t.a(type, c1392q));
            }

            public final void c(String type, C1378e... qualifiers) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                Iterable<IndexedValue> z02 = AbstractC3574i.z0(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(G.d(CollectionsKt.u(z02, 10)), 16));
                for (IndexedValue indexedValue : z02) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.c()), (C1378e) indexedValue.d());
                }
                this.f12728c = t.a(type, new C1392q(linkedHashMap));
            }

            public final void d(pd.e type) {
                Intrinsics.checkNotNullParameter(type, "type");
                String desc = type.getDesc();
                Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
                this.f12728c = t.a(desc, null);
            }
        }

        public a(C1388m c1388m, String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f12725b = c1388m;
            this.f12724a = className;
        }

        public final void a(String name, Function1 block) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(block, "block");
            Map map = this.f12725b.f12723a;
            C0237a c0237a = new C0237a(this, name);
            block.invoke(c0237a);
            Pair a10 = c0237a.a();
            map.put(a10.c(), a10.d());
        }

        public final String b() {
            return this.f12724a;
        }
    }

    public final Map b() {
        return this.f12723a;
    }
}
