package L0;

import M0.f;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f5636a = new LinkedHashSet();

    static final class a extends l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f5637a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f5638b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f5639c;

        a(kotlin.coroutines.d dVar) {
            super(3, dVar);
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(K0.c cVar, M0.f fVar, kotlin.coroutines.d dVar) {
            a aVar = new a(dVar);
            aVar.f5638b = cVar;
            aVar.f5639c = fVar;
            return aVar.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f5637a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            K0.c cVar = (K0.c) this.f5638b;
            M0.f fVar = (M0.f) this.f5639c;
            Set keySet = fVar.a().keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.u(keySet, 10));
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a) it.next()).a());
            }
            Map a10 = cVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : a10.entrySet()) {
                if (!arrayList.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            M0.c c10 = fVar.c();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    c10.i(M0.i.a(str), value);
                } else if (value instanceof Float) {
                    c10.i(M0.i.d(str), value);
                } else if (value instanceof Integer) {
                    c10.i(M0.i.e(str), value);
                } else if (value instanceof Long) {
                    c10.i(M0.i.f(str), value);
                } else if (value instanceof String) {
                    c10.i(M0.i.g(str), value);
                } else if (value instanceof Set) {
                    f.a h10 = M0.i.h(str);
                    Intrinsics.e(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    c10.i(h10, (Set) value);
                }
            }
            return c10.d();
        }
    }

    static final class b extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f5640a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f5641b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f5642c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f5642c = set;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            b bVar = new b(this.f5642c, dVar);
            bVar.f5641b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(M0.f fVar, kotlin.coroutines.d dVar) {
            return ((b) create(fVar, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f5640a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            Set keySet = ((M0.f) this.f5641b).a().keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.u(keySet, 10));
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a) it.next()).a());
            }
            boolean z10 = true;
            if (this.f5642c != i.c()) {
                Set set = this.f5642c;
                if (set == null || !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                            break;
                        }
                    }
                }
                z10 = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
    }

    public static final K0.a a(Context context, String sharedPreferencesName, Set keysToMigrate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f5636a ? new K0.a(context, sharedPreferencesName, null, e(keysToMigrate), d(), 4, null) : new K0.a(context, sharedPreferencesName, keysToMigrate, e(keysToMigrate), d());
    }

    public static /* synthetic */ K0.a b(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f5636a;
        }
        return a(context, str, set);
    }

    public static final Set c() {
        return f5636a;
    }

    private static final InterfaceC5068n d() {
        return new a(null);
    }

    private static final Function2 e(Set set) {
        return new b(set, null);
    }
}
