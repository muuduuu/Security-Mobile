package Jc;

import Hc.j;
import Kc.D;
import Kc.EnumC0934f;
import Kc.G;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.a0;
import Mc.C0982h;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xc.C5142C;
import xc.u;
import xd.n;

/* loaded from: classes3.dex */
public final class e implements Lc.b {

    /* renamed from: g, reason: collision with root package name */
    private static final id.f f4914g;

    /* renamed from: h, reason: collision with root package name */
    private static final C3367b f4915h;

    /* renamed from: a, reason: collision with root package name */
    private final G f4916a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f4917b;

    /* renamed from: c, reason: collision with root package name */
    private final xd.i f4918c;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f4912e = {C5142C.k(new u(C5142C.b(e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: d, reason: collision with root package name */
    public static final b f4911d = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final id.c f4913f = Hc.j.f3891y;

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4919a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Hc.b invoke(G module) {
            Intrinsics.checkNotNullParameter(module, "module");
            List O10 = module.p0(e.f4913f).O();
            ArrayList arrayList = new ArrayList();
            for (Object obj : O10) {
                if (obj instanceof Hc.b) {
                    arrayList.add(obj);
                }
            }
            return (Hc.b) CollectionsKt.d0(arrayList);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3367b a() {
            return e.f4915h;
        }

        private b() {
        }
    }

    static final class c extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f4921b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f4921b = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0982h invoke() {
            C0982h c0982h = new C0982h((InterfaceC0941m) e.this.f4917b.invoke(e.this.f4916a), e.f4914g, D.ABSTRACT, EnumC0934f.INTERFACE, CollectionsKt.e(e.this.f4916a.v().i()), a0.f5560a, false, this.f4921b);
            c0982h.T0(new Jc.a(this.f4921b, c0982h), O.d(), null);
            return c0982h;
        }
    }

    static {
        id.d dVar = j.a.f3937d;
        id.f i10 = dVar.i();
        Intrinsics.checkNotNullExpressionValue(i10, "shortName(...)");
        f4914g = i10;
        C3367b m10 = C3367b.m(dVar.l());
        Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
        f4915h = m10;
    }

    public e(n storageManager, G moduleDescriptor, Function1 computeContainingDeclaration) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(computeContainingDeclaration, "computeContainingDeclaration");
        this.f4916a = moduleDescriptor;
        this.f4917b = computeContainingDeclaration;
        this.f4918c = storageManager.d(new c(storageManager));
    }

    private final C0982h i() {
        return (C0982h) xd.m.a(this.f4918c, this, f4912e[0]);
    }

    @Override // Lc.b
    public InterfaceC0933e a(C3367b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (Intrinsics.b(classId, f4915h)) {
            return i();
        }
        return null;
    }

    @Override // Lc.b
    public boolean b(id.c packageFqName, id.f name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.b(name, f4914g) && Intrinsics.b(packageFqName, f4913f);
    }

    @Override // Lc.b
    public Collection c(id.c packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return Intrinsics.b(packageFqName, f4913f) ? O.c(i()) : O.d();
    }

    public /* synthetic */ e(n nVar, G g10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, g10, (i10 & 4) != 0 ? a.f4919a : function1);
    }
}
