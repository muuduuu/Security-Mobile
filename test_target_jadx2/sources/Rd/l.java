package rd;

import Kc.EnumC0934f;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.U;
import Kc.Z;
import java.util.Collection;
import java.util.List;
import kd.AbstractC3565e;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xc.C5142C;
import xc.u;

/* loaded from: classes3.dex */
public final class l extends i {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f40648f = {C5142C.k(new u(C5142C.b(l.class), "functions", "getFunctions()Ljava/util/List;")), C5142C.k(new u(C5142C.b(l.class), "properties", "getProperties()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0933e f40649b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40650c;

    /* renamed from: d, reason: collision with root package name */
    private final xd.i f40651d;

    /* renamed from: e, reason: collision with root package name */
    private final xd.i f40652e;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return CollectionsKt.m(AbstractC3565e.g(l.this.f40649b), AbstractC3565e.h(l.this.f40649b));
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return l.this.f40650c ? CollectionsKt.n(AbstractC3565e.f(l.this.f40649b)) : CollectionsKt.j();
        }
    }

    public l(xd.n storageManager, InterfaceC0933e containingClass, boolean z10) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.f40649b = containingClass;
        this.f40650c = z10;
        containingClass.o();
        EnumC0934f enumC0934f = EnumC0934f.CLASS;
        this.f40651d = storageManager.d(new a());
        this.f40652e = storageManager.d(new b());
    }

    private final List m() {
        return (List) xd.m.a(this.f40651d, this, f40648f[0]);
    }

    private final List n() {
        return (List) xd.m.a(this.f40652e, this, f40648f[1]);
    }

    @Override // rd.i, rd.h
    public Collection c(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List n10 = n();
        Gd.f fVar = new Gd.f();
        for (Object obj : n10) {
            if (Intrinsics.b(((U) obj).getName(), name)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override // rd.i, rd.k
    public /* bridge */ /* synthetic */ InterfaceC0936h f(id.f fVar, Rc.b bVar) {
        return (InterfaceC0936h) j(fVar, bVar);
    }

    public Void j(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // rd.i, rd.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public List g(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt.w0(m(), n());
    }

    @Override // rd.i, rd.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Gd.f a(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List m10 = m();
        Gd.f fVar = new Gd.f();
        for (Object obj : m10) {
            if (Intrinsics.b(((Z) obj).getName(), name)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }
}
