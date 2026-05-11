package yd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f0 extends l0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f45524c = new a(null);

    public static final class a {

        /* renamed from: yd.f0$a$a, reason: collision with other inner class name */
        public static final class C0669a extends f0 {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f45525d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f45526e;

            C0669a(Map map, boolean z10) {
                this.f45525d = map;
                this.f45526e = z10;
            }

            @Override // yd.l0
            public boolean a() {
                return this.f45526e;
            }

            @Override // yd.l0
            public boolean f() {
                return this.f45525d.isEmpty();
            }

            @Override // yd.f0
            public i0 k(e0 key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return (i0) this.f45525d.get(key);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ f0 e(a aVar, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.d(map, z10);
        }

        public final l0 a(AbstractC5197E kotlinType) {
            Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
            return b(kotlinType.W0(), kotlinType.U0());
        }

        public final l0 b(e0 typeConstructor, List arguments) {
            Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            List c10 = typeConstructor.c();
            Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
            Kc.f0 f0Var = (Kc.f0) CollectionsKt.p0(c10);
            if (f0Var == null || !f0Var.u0()) {
                return new C5195C(c10, arguments);
            }
            List c11 = typeConstructor.c();
            Intrinsics.checkNotNullExpressionValue(c11, "getParameters(...)");
            List list = c11;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Kc.f0) it.next()).r());
            }
            return e(this, kotlin.collections.G.r(CollectionsKt.V0(arrayList, arguments)), false, 2, null);
        }

        public final f0 c(Map map) {
            Intrinsics.checkNotNullParameter(map, "map");
            return e(this, map, false, 2, null);
        }

        public final f0 d(Map map, boolean z10) {
            Intrinsics.checkNotNullParameter(map, "map");
            return new C0669a(map, z10);
        }

        private a() {
        }
    }

    public static final l0 i(e0 e0Var, List list) {
        return f45524c.b(e0Var, list);
    }

    public static final f0 j(Map map) {
        return f45524c.c(map);
    }

    @Override // yd.l0
    public i0 e(AbstractC5197E key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return k(key.W0());
    }

    public abstract i0 k(e0 e0Var);
}
