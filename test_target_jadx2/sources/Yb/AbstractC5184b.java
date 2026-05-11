package yb;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import wb.i;
import wb.j;
import wb.k;
import xc.C5142C;
import xc.m;
import yb.C5183a;

/* renamed from: yb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5184b {

    /* renamed from: b, reason: collision with root package name */
    private vb.f f45391b;

    /* renamed from: a, reason: collision with root package name */
    private Function0 f45390a = e.f45404a;

    /* renamed from: c, reason: collision with root package name */
    private Map f45392c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private Map f45393d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    private Map f45394e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map f45395f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    private Map f45396g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    private final List f45397h = new ArrayList();

    /* renamed from: yb.b$a */
    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Pair[] f45398a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Pair[] pairArr) {
            super(0);
            this.f45398a = pairArr;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return G.u(this.f45398a);
        }
    }

    /* renamed from: yb.b$b, reason: collision with other inner class name */
    public static final class C0665b extends m implements Function2 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5183a.d f45400b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0665b(C5183a.d dVar) {
            super(2);
            this.f45400b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            String str = (String) promise;
            Iterator it = AbstractC5184b.this.f45397h.iterator();
            while (it.hasNext()) {
                ((C5183a) it.next()).a(this.f45400b, str);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: yb.b$c */
    public static final class c extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f45401a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: yb.b$d */
    public static final class d extends m implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5183a.d f45403b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C5183a.d dVar) {
            super(1);
            this.f45403b = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            String str = (String) objArr[0];
            Iterator it = AbstractC5184b.this.f45397h.iterator();
            while (it.hasNext()) {
                ((C5183a) it.next()).a(this.f45403b, str);
            }
            return Unit.f36324a;
        }
    }

    /* renamed from: yb.b$e */
    static final class e extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f45404a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return G.h();
        }
    }

    public final wb.d a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        wb.d dVar = new wb.d(name);
        this.f45395f.put(name, dVar);
        return dVar;
    }

    public final void b(Function0 constantsProvider) {
        Intrinsics.checkNotNullParameter(constantsProvider, "constantsProvider");
        this.f45390a = constantsProvider;
    }

    public final void c(Pair... constants) {
        Intrinsics.checkNotNullParameter(constants, "constants");
        this.f45390a = new a(constants);
    }

    public final void d(String... events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.f45391b = new vb.f(events);
    }

    public final void e(String eventName, Function0 body) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f45397h.add(new C5183a(C5183a.d.StartObserving, new C5183a.c(eventName), body));
    }

    public final void f(Function0 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f45397h.add(new C5183a(C5183a.d.StartObserving, C5183a.C0664a.f45388a, body));
    }

    public final void g(String eventName, Function0 body) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f45397h.add(new C5183a(C5183a.d.StopObserving, new C5183a.c(eventName), body));
    }

    public final void h(Function0 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f45397h.add(new C5183a(C5183a.d.StopObserving, C5183a.C0664a.f45388a, body));
    }

    public final C5185c j() {
        wb.g kVar;
        for (C5183a.d dVar : C5183a.d.getEntries()) {
            if (!this.f45394e.containsKey(dVar.getValue())) {
                String value = dVar.getValue();
                if (Intrinsics.b(String.class, pb.m.class)) {
                    kVar = new wb.f(value, new C0792a[0], new C0665b(dVar));
                } else {
                    C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(String.class), Boolean.FALSE));
                    if (c0792a == null) {
                        c0792a = new C0792a(new M(C5142C.b(String.class), false, c.f45401a));
                    }
                    C0792a[] c0792aArr = {c0792a};
                    d dVar2 = new d(dVar);
                    kVar = Intrinsics.b(Unit.class, Integer.TYPE) ? new k(value, c0792aArr, dVar2) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h(value, c0792aArr, dVar2) : Intrinsics.b(Unit.class, Double.TYPE) ? new i(value, c0792aArr, dVar2) : Intrinsics.b(Unit.class, Float.TYPE) ? new j(value, c0792aArr, dVar2) : Intrinsics.b(Unit.class, String.class) ? new wb.m(value, c0792aArr, dVar2) : new wb.e(value, c0792aArr, dVar2);
                }
                k().put(value, kVar);
            }
        }
        Map map = this.f45394e;
        Map map2 = this.f45395f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(G.d(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((wb.d) entry.getValue()).a());
        }
        Map w10 = G.w(G.n(map, linkedHashMap));
        Function0 function0 = this.f45390a;
        Map map3 = this.f45392c;
        Map map4 = this.f45393d;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(G.d(map4.size()));
        Iterator it = map4.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            entry2.getKey();
            android.support.v4.media.session.b.a(entry2.getValue());
            throw null;
        }
        Map n10 = G.n(map3, linkedHashMap2);
        vb.f fVar = this.f45391b;
        Map map5 = this.f45396g;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(G.d(map5.size()));
        for (Map.Entry entry3 : map5.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), ((C5189g) entry3.getValue()).a());
        }
        return new C5185c(function0, n10, w10, fVar, linkedHashMap3);
    }

    public final Map k() {
        return this.f45394e;
    }

    public final vb.f l() {
        return this.f45391b;
    }

    public final Map m() {
        return this.f45396g;
    }

    public final Map n() {
        return this.f45392c;
    }
}
