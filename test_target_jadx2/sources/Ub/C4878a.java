package ub;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import Db.T;
import Db.U;
import android.app.Activity;
import com.facebook.react.AbstractActivityC1928s;
import com.facebook.react.C1997z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import lc.t;
import pb.j;
import q1.AbstractC3901a;
import wb.k;
import wb.q;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lub/a;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ub.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4878a extends AbstractC5139a {

    /* renamed from: ub.a$a, reason: collision with other inner class name */
    public static final class C0625a extends m implements Function2 {
        public C0625a() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            C1997z C10;
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Activity x10 = C4878a.this.a().x();
            AbstractActivityC1928s abstractActivityC1928s = x10 instanceof AbstractActivityC1928s ? (AbstractActivityC1928s) x10 : null;
            if (abstractActivityC1928s == null || (C10 = abstractActivityC1928s.C()) == null) {
                return;
            }
            Intrinsics.d(C10);
            C10.u();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: ub.a$b */
    public static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f43605a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: ub.a$c */
    public static final class c extends m implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            C1997z C10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Activity x10 = C4878a.this.a().x();
            AbstractActivityC1928s abstractActivityC1928s = x10 instanceof AbstractActivityC1928s ? (AbstractActivityC1928s) x10 : null;
            if (abstractActivityC1928s != null && (C10 = abstractActivityC1928s.C()) != null) {
                Intrinsics.d(C10);
                C10.u();
            }
            return Unit.f36324a;
        }
    }

    /* renamed from: ub.a$d */
    public static final class d extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f43607a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: ub.a$e */
    public static final class e extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f43608a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: ub.a$f */
    public static final class f extends m implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) obj;
            try {
                UUID fromString = UUID.fromString(str);
                Intrinsics.d(fromString);
                return Hb.b.b(fromString, str2).toString();
            } catch (IllegalArgumentException unused) {
                throw new Hb.a(str);
            }
        }
    }

    /* renamed from: ub.a$g */
    public static final class g extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f43609a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: ub.a$h */
    public static final class h extends m implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            expo.modules.kotlin.views.o h10;
            String[] a10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            j t10 = C4878a.this.d().h().t((String) objArr[0]);
            LinkedHashMap linkedHashMap = null;
            if (t10 == null || (h10 = t10.e().h()) == null) {
                return null;
            }
            Set keySet = h10.f().keySet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.ranges.d.d(G.d(CollectionsKt.u(keySet, 10)), 16));
            for (Object obj : keySet) {
                linkedHashMap2.put(obj, Boolean.TRUE);
            }
            expo.modules.kotlin.views.b c10 = h10.c();
            if (c10 != null && (a10 = c10.a()) != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(kotlin.ranges.d.d(G.d(a10.length), 16));
                for (String str : a10) {
                    Pair a11 = t.a(vb.i.a(str), G.e(t.a("registrationName", str)));
                    linkedHashMap3.put(a11.c(), a11.d());
                }
                linkedHashMap = linkedHashMap3;
            }
            return G.k(t.a("validAttributes", linkedHashMap2), t.a("directEventTypes", linkedHashMap));
        }
    }

    /* renamed from: ub.a$i */
    public static final class i extends m implements Function1 {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return UUID.randomUUID().toString();
        }
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        wb.g kVar;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            C0792a[] c0792aArr = new C0792a[0];
            U u10 = U.f1425a;
            T t10 = (T) u10.a().get(C5142C.b(Object.class));
            if (t10 == null) {
                t10 = new T(C5142C.b(Object.class));
                u10.a().put(C5142C.b(Object.class), t10);
            }
            bVar.n().put("uuidv4", new q("uuidv4", c0792aArr, t10, new i()));
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b10 = C5142C.b(String.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b10, bool));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(String.class), false, d.f43607a));
            }
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a2 == null) {
                c0792a2 = new C0792a(new M(C5142C.b(String.class), false, e.f43608a));
            }
            C0792a[] c0792aArr2 = {c0792a, c0792a2};
            T t11 = (T) u10.a().get(C5142C.b(String.class));
            if (t11 == null) {
                t11 = new T(C5142C.b(String.class));
                u10.a().put(C5142C.b(String.class), t11);
            }
            bVar.n().put("uuidv5", new q("uuidv5", c0792aArr2, t11, new f()));
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a3 == null) {
                c0792a3 = new C0792a(new M(C5142C.b(String.class), false, g.f43609a));
            }
            C0792a[] c0792aArr3 = {c0792a3};
            T t12 = (T) u10.a().get(C5142C.b(Map.class));
            if (t12 == null) {
                t12 = new T(C5142C.b(Map.class));
                u10.a().put(C5142C.b(Map.class), t12);
            }
            bVar.n().put("getViewConfig", new q("getViewConfig", c0792aArr3, t12, new h()));
            if (Intrinsics.b(String.class, pb.m.class)) {
                kVar = new wb.f("reloadAppAsync", new C0792a[0], new C0625a());
            } else {
                C0792a c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
                if (c0792a4 == null) {
                    c0792a4 = new C0792a(new M(C5142C.b(String.class), false, b.f43605a));
                }
                C0792a[] c0792aArr4 = {c0792a4};
                c cVar = new c();
                kVar = Intrinsics.b(Unit.class, Integer.TYPE) ? new k("reloadAppAsync", c0792aArr4, cVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("reloadAppAsync", c0792aArr4, cVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("reloadAppAsync", c0792aArr4, cVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("reloadAppAsync", c0792aArr4, cVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("reloadAppAsync", c0792aArr4, cVar) : new wb.e("reloadAppAsync", c0792aArr4, cVar);
            }
            bVar.k().put("reloadAppAsync", kVar);
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
