package kotlin.reflect.jvm.internal.impl.types.checker;

import Kc.InterfaceC0936h;
import Kc.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ld.InterfaceC3627b;
import yd.AbstractC5197E;
import yd.i0;
import yd.t0;

/* loaded from: classes3.dex */
public final class j implements InterfaceC3627b {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f36682a;

    /* renamed from: b, reason: collision with root package name */
    private Function0 f36683b;

    /* renamed from: c, reason: collision with root package name */
    private final j f36684c;

    /* renamed from: d, reason: collision with root package name */
    private final f0 f36685d;

    /* renamed from: e, reason: collision with root package name */
    private final Lazy f36686e;

    static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f36687a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list) {
            super(0);
            this.f36687a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return this.f36687a;
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            Function0 function0 = j.this.f36683b;
            if (function0 != null) {
                return (List) function0.invoke();
            }
            return null;
        }
    }

    static final class c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f36689a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list) {
            super(0);
            this.f36689a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return this.f36689a;
        }
    }

    static final class d extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f36691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.f36691b = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List a10 = j.this.a();
            g gVar = this.f36691b;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(a10, 10));
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                arrayList.add(((t0) it.next()).g1(gVar));
            }
            return arrayList;
        }
    }

    public j(i0 projection, Function0 function0, j jVar, f0 f0Var) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f36682a = projection;
        this.f36683b = function0;
        this.f36684c = jVar;
        this.f36685d = f0Var;
        this.f36686e = lc.i.b(lc.l.PUBLICATION, new b());
    }

    private final List i() {
        return (List) this.f36686e.getValue();
    }

    @Override // yd.e0
    public List c() {
        return CollectionsKt.j();
    }

    @Override // yd.e0
    public InterfaceC0936h d() {
        return null;
    }

    @Override // yd.e0
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        j jVar = (j) obj;
        j jVar2 = this.f36684c;
        if (jVar2 == null) {
            jVar2 = this;
        }
        j jVar3 = jVar.f36684c;
        if (jVar3 != null) {
            jVar = jVar3;
        }
        return jVar2 == jVar;
    }

    @Override // ld.InterfaceC3627b
    public i0 f() {
        return this.f36682a;
    }

    @Override // yd.e0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List a() {
        List i10 = i();
        return i10 == null ? CollectionsKt.j() : i10;
    }

    public int hashCode() {
        j jVar = this.f36684c;
        return jVar != null ? jVar.hashCode() : super.hashCode();
    }

    public final void j(List supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        this.f36683b = new c(supertypes);
    }

    @Override // yd.e0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public j b(g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        i0 b10 = f().b(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(b10, "refine(...)");
        d dVar = this.f36683b != null ? new d(kotlinTypeRefiner) : null;
        j jVar = this.f36684c;
        if (jVar == null) {
            jVar = this;
        }
        return new j(b10, dVar, jVar, this.f36685d);
    }

    public String toString() {
        return "CapturedType(" + f() + ')';
    }

    @Override // yd.e0
    public Hc.g v() {
        AbstractC5197E type = f().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return Bd.a.i(type);
    }

    public /* synthetic */ j(i0 i0Var, Function0 function0, j jVar, f0 f0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, (i10 & 2) != 0 ? null : function0, (i10 & 4) != 0 ? null : jVar, (i10 & 8) != 0 ? null : f0Var);
    }

    public /* synthetic */ j(i0 i0Var, List list, j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, list, (i10 & 4) != 0 ? null : jVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(i0 projection, List supertypes, j jVar) {
        this(projection, new a(supertypes), jVar, null, 8, null);
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
    }
}
