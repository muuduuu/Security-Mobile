package Wc;

import Gd.b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.U;
import Kc.Z;
import Zc.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kd.AbstractC3565e;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public final class l extends m {

    /* renamed from: n, reason: collision with root package name */
    private final Zc.g f11564n;

    /* renamed from: o, reason: collision with root package name */
    private final Uc.c f11565o;

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11566a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(q it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.o());
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.f f11567a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(id.f fVar) {
            super(1);
            this.f11567a = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(rd.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.c(this.f11567a, Rc.d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f11568a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(rd.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.d();
        }
    }

    static final class d extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f11569a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0933e invoke(AbstractC5197E abstractC5197E) {
            InterfaceC0936h d10 = abstractC5197E.W0().d();
            if (d10 instanceof InterfaceC0933e) {
                return (InterfaceC0933e) d10;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Vc.g c10, Zc.g jClass, Uc.c ownerDescriptor) {
        super(c10);
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.f11564n = jClass;
        this.f11565o = ownerDescriptor;
    }

    private final Set O(InterfaceC0933e interfaceC0933e, Set set, Function1 function1) {
        Gd.b.b(CollectionsKt.e(interfaceC0933e), k.f11563a, new e(interfaceC0933e, set, function1));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable P(InterfaceC0933e interfaceC0933e) {
        Collection a10 = interfaceC0933e.r().a();
        Intrinsics.checkNotNullExpressionValue(a10, "getSupertypes(...)");
        return kotlin.sequences.j.k(kotlin.sequences.j.x(CollectionsKt.T(a10), d.f11569a));
    }

    private final U R(U u10) {
        if (u10.o().isReal()) {
            return u10;
        }
        Collection f10 = u10.f();
        Intrinsics.checkNotNullExpressionValue(f10, "getOverriddenDescriptors(...)");
        Collection<U> collection = f10;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(collection, 10));
        for (U u11 : collection) {
            Intrinsics.d(u11);
            arrayList.add(R(u11));
        }
        return (U) CollectionsKt.A0(CollectionsKt.W(arrayList));
    }

    private final Set S(id.f fVar, InterfaceC0933e interfaceC0933e) {
        l b10 = Uc.h.b(interfaceC0933e);
        return b10 == null ? O.d() : CollectionsKt.S0(b10.a(fVar, Rc.d.WHEN_GET_SUPER_MEMBERS));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Wc.j
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public Wc.a p() {
        return new Wc.a(this.f11564n, a.f11566a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Wc.j
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Uc.c C() {
        return this.f11565o;
    }

    @Override // rd.i, rd.k
    public InterfaceC0936h f(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // Wc.j
    protected Set l(rd.d kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return O.d();
    }

    @Override // Wc.j
    protected Set n(rd.d kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Set R02 = CollectionsKt.R0(((Wc.b) y().invoke()).a());
        l b10 = Uc.h.b(C());
        Set b11 = b10 != null ? b10.b() : null;
        if (b11 == null) {
            b11 = O.d();
        }
        R02.addAll(b11);
        if (this.f11564n.G()) {
            R02.addAll(CollectionsKt.m(Hc.j.f3872f, Hc.j.f3870d));
        }
        R02.addAll(w().a().w().b(w(), C()));
        return R02;
    }

    @Override // Wc.j
    protected void o(Collection result, id.f name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        w().a().w().h(w(), C(), name, result);
    }

    @Override // Wc.j
    protected void r(Collection result, id.f name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        Collection e10 = Tc.a.e(name, S(name, C()), result, C(), w().a().c(), w().a().k().a());
        Intrinsics.checkNotNullExpressionValue(e10, "resolveOverridesForStaticMembers(...)");
        result.addAll(e10);
        if (this.f11564n.G()) {
            if (Intrinsics.b(name, Hc.j.f3872f)) {
                Z g10 = AbstractC3565e.g(C());
                Intrinsics.checkNotNullExpressionValue(g10, "createEnumValueOfMethod(...)");
                result.add(g10);
            } else if (Intrinsics.b(name, Hc.j.f3870d)) {
                Z h10 = AbstractC3565e.h(C());
                Intrinsics.checkNotNullExpressionValue(h10, "createEnumValuesMethod(...)");
                result.add(h10);
            }
        }
    }

    @Override // Wc.m, Wc.j
    protected void s(id.f name, Collection result) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Set O10 = O(C(), new LinkedHashSet(), new b(name));
        if (result.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : O10) {
                U R10 = R((U) obj);
                Object obj2 = linkedHashMap.get(R10);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(R10, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection e10 = Tc.a.e(name, (Collection) ((Map.Entry) it.next()).getValue(), result, C(), w().a().c(), w().a().k().a());
                Intrinsics.checkNotNullExpressionValue(e10, "resolveOverridesForStaticMembers(...)");
                CollectionsKt.z(arrayList, e10);
            }
            result.addAll(arrayList);
        } else {
            Collection e11 = Tc.a.e(name, O10, result, C(), w().a().c(), w().a().k().a());
            Intrinsics.checkNotNullExpressionValue(e11, "resolveOverridesForStaticMembers(...)");
            result.addAll(e11);
        }
        if (this.f11564n.G() && Intrinsics.b(name, Hc.j.f3871e)) {
            Gd.a.a(result, AbstractC3565e.f(C()));
        }
    }

    @Override // Wc.j
    protected Set t(rd.d kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Set R02 = CollectionsKt.R0(((Wc.b) y().invoke()).f());
        O(C(), R02, c.f11568a);
        if (this.f11564n.G()) {
            R02.add(Hc.j.f3871e);
        }
        return R02;
    }

    public static final class e extends b.AbstractC0073b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0933e f11570a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f11571b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f11572c;

        e(InterfaceC0933e interfaceC0933e, Set set, Function1 function1) {
            this.f11570a = interfaceC0933e;
            this.f11571b = set;
            this.f11572c = function1;
        }

        @Override // Gd.b.d
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return Unit.f36324a;
        }

        @Override // Gd.b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC0933e current) {
            Intrinsics.checkNotNullParameter(current, "current");
            if (current == this.f11570a) {
                return true;
            }
            rd.h X10 = current.X();
            Intrinsics.checkNotNullExpressionValue(X10, "getStaticScope(...)");
            if (!(X10 instanceof m)) {
                return true;
            }
            this.f11571b.addAll((Collection) this.f11572c.invoke(X10));
            return false;
        }

        public void e() {
        }
    }
}
