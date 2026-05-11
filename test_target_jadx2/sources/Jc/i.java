package Jc;

import Gd.b;
import Gd.g;
import Jc.f;
import Kc.AbstractC0946s;
import Kc.AbstractC0947t;
import Kc.AbstractC0951x;
import Kc.D;
import Kc.E;
import Kc.EnumC0934f;
import Kc.G;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.J;
import Kc.Z;
import Kc.a0;
import Kc.j0;
import Mc.C0982h;
import Mc.z;
import bd.C1673A;
import bd.x;
import bd.y;
import dd.C3032i;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kd.l;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import od.AbstractC3778c;
import qc.AbstractC3958a;
import rd.h;
import wd.C5072d;
import xc.C5141B;
import xc.C5142C;
import xc.u;
import xd.InterfaceC5157a;
import xd.n;
import yd.AbstractC5197E;
import yd.H;
import yd.M;
import yd.n0;

/* loaded from: classes3.dex */
public final class i implements Lc.a, Lc.c {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f4936i = {C5142C.k(new u(C5142C.b(i.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), C5142C.k(new u(C5142C.b(i.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), C5142C.k(new u(C5142C.b(i.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: a, reason: collision with root package name */
    private final G f4937a;

    /* renamed from: b, reason: collision with root package name */
    private final Jc.d f4938b;

    /* renamed from: c, reason: collision with root package name */
    private final xd.i f4939c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5197E f4940d;

    /* renamed from: e, reason: collision with root package name */
    private final xd.i f4941e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC5157a f4942f;

    /* renamed from: g, reason: collision with root package name */
    private final xd.i f4943g;

    /* renamed from: h, reason: collision with root package name */
    private final xd.g f4944h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a HIDDEN = new a("HIDDEN", 0);
        public static final a VISIBLE = new a("VISIBLE", 1);
        public static final a DEPRECATED_LIST_METHODS = new a("DEPRECATED_LIST_METHODS", 2);
        public static final a NOT_CONSIDERED = new a("NOT_CONSIDERED", 3);
        public static final a DROP = new a("DROP", 4);

        private static final /* synthetic */ a[] $values() {
            return new a[]{HIDDEN, VISIBLE, DEPRECATED_LIST_METHODS, NOT_CONSIDERED, DROP};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private a(String str, int i10) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4945a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f4945a = iArr;
        }
    }

    static final class c extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f4947b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f4947b = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke() {
            return AbstractC0951x.c(i.this.u().a(), Jc.e.f4911d.a(), new J(this.f4947b, i.this.u().a())).y();
        }
    }

    public static final class d extends z {
        d(G g10, id.c cVar) {
            super(g10, cVar);
        }

        @Override // Kc.K
        /* renamed from: N0, reason: merged with bridge method [inline-methods] */
        public h.b w() {
            return h.b.f40647b;
        }
    }

    static final class e extends xc.m implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke() {
            M i10 = i.this.f4937a.v().i();
            Intrinsics.checkNotNullExpressionValue(i10, "getAnyType(...)");
            return i10;
        }
    }

    static final class f extends xc.m implements Function1 {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g invoke(Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.a(CollectionsKt.e(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.a(i.this.f4937a.v(), '\'' + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
        }
    }

    static final class g extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Wc.f f4950a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0933e f4951b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Wc.f fVar, InterfaceC0933e interfaceC0933e) {
            super(0);
            this.f4950a = fVar;
            this.f4951b = interfaceC0933e;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0933e invoke() {
            Wc.f fVar = this.f4950a;
            Tc.g EMPTY = Tc.g.f9761a;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            return fVar.W0(EMPTY, this.f4951b);
        }
    }

    static final class h extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.f f4952a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(id.f fVar) {
            super(1);
            this.f4952a = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(rd.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.a(this.f4952a, Rc.d.FROM_BUILTINS);
        }
    }

    /* renamed from: Jc.i$i, reason: collision with other inner class name */
    public static final class C0099i extends b.AbstractC0073b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4953a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5141B f4954b;

        C0099i(String str, C5141B c5141b) {
            this.f4953a = str;
            this.f4954b = c5141b;
        }

        @Override // Gd.b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC0933e javaClassDescriptor) {
            Intrinsics.checkNotNullParameter(javaClassDescriptor, "javaClassDescriptor");
            String a10 = x.a(C1673A.f18936a, javaClassDescriptor, this.f4953a);
            l lVar = l.f4960a;
            if (lVar.f().contains(a10)) {
                this.f4954b.f44962a = a.HIDDEN;
            } else if (lVar.i().contains(a10)) {
                this.f4954b.f44962a = a.VISIBLE;
            } else if (lVar.c().contains(a10)) {
                this.f4954b.f44962a = a.DEPRECATED_LIST_METHODS;
            } else if (lVar.d().contains(a10)) {
                this.f4954b.f44962a = a.DROP;
            }
            return this.f4954b.f44962a == null;
        }

        @Override // Gd.b.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a() {
            a aVar = (a) this.f4954b.f44962a;
            return aVar == null ? a.NOT_CONSIDERED : aVar;
        }
    }

    static final class j extends xc.m implements Function1 {
        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0930b interfaceC0930b) {
            boolean z10;
            if (interfaceC0930b.o() == InterfaceC0930b.a.DECLARATION) {
                Jc.d dVar = i.this.f4938b;
                InterfaceC0941m b10 = interfaceC0930b.b();
                Intrinsics.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (dVar.c((InterfaceC0933e) b10)) {
                    z10 = true;
                    return Boolean.valueOf(z10);
                }
            }
            z10 = false;
            return Boolean.valueOf(z10);
        }
    }

    static final class k extends xc.m implements Function0 {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g invoke() {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.a(CollectionsKt.e(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.b(i.this.f4937a.v(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
        }
    }

    public i(G moduleDescriptor, n storageManager, Function0 settingsComputation) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(settingsComputation, "settingsComputation");
        this.f4937a = moduleDescriptor;
        this.f4938b = Jc.d.f4910a;
        this.f4939c = storageManager.d(settingsComputation);
        this.f4940d = l(storageManager);
        this.f4941e = storageManager.d(new c(storageManager));
        this.f4942f = storageManager.b();
        this.f4943g = storageManager.d(new k());
        this.f4944h = storageManager.h(new f());
    }

    private final Z k(C5072d c5072d, Z z10) {
        InterfaceC0952y.a A10 = z10.A();
        A10.f(c5072d);
        A10.i(AbstractC0947t.f5589e);
        A10.v(c5072d.y());
        A10.n(c5072d.S0());
        InterfaceC0952y c10 = A10.c();
        Intrinsics.d(c10);
        return (Z) c10;
    }

    private final AbstractC5197E l(n nVar) {
        C0982h c0982h = new C0982h(new d(this.f4937a, new id.c("java.io")), id.f.o("Serializable"), D.ABSTRACT, EnumC0934f.INTERFACE, CollectionsKt.e(new H(nVar, new e())), a0.f5560a, false, nVar);
        c0982h.T0(h.b.f40647b, O.d(), null);
        M y10 = c0982h.y();
        Intrinsics.checkNotNullExpressionValue(y10, "getDefaultType(...)");
        return y10;
    }

    private final Collection m(InterfaceC0933e interfaceC0933e, Function1 function1) {
        Wc.f q10 = q(interfaceC0933e);
        if (q10 == null) {
            return CollectionsKt.j();
        }
        Collection g10 = this.f4938b.g(AbstractC3778c.l(q10), Jc.b.f4888h.a());
        InterfaceC0933e interfaceC0933e2 = (InterfaceC0933e) CollectionsKt.o0(g10);
        if (interfaceC0933e2 == null) {
            return CollectionsKt.j();
        }
        g.b bVar = Gd.g.f3017c;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(g10, 10));
        Iterator it = g10.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3778c.l((InterfaceC0933e) it.next()));
        }
        Gd.g b10 = bVar.b(arrayList);
        boolean c10 = this.f4938b.c(interfaceC0933e);
        rd.h L02 = ((InterfaceC0933e) this.f4942f.a(AbstractC3778c.l(q10), new g(q10, interfaceC0933e2))).L0();
        Intrinsics.checkNotNullExpressionValue(L02, "getUnsubstitutedMemberScope(...)");
        Iterable iterable = (Iterable) function1.invoke(L02);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            Z z10 = (Z) obj;
            if (z10.o() == InterfaceC0930b.a.DECLARATION && z10.h().d() && !Hc.g.k0(z10)) {
                Collection f10 = z10.f();
                Intrinsics.checkNotNullExpressionValue(f10, "getOverriddenDescriptors(...)");
                Collection collection = f10;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        InterfaceC0941m b11 = ((InterfaceC0952y) it2.next()).b();
                        Intrinsics.checkNotNullExpressionValue(b11, "getContainingDeclaration(...)");
                        if (b10.contains(AbstractC3778c.l(b11))) {
                            break;
                        }
                    }
                }
                if (!v(z10, c10)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    private final M n() {
        return (M) xd.m.a(this.f4941e, this, f4936i[1]);
    }

    private static final boolean o(InterfaceC0940l interfaceC0940l, n0 n0Var, InterfaceC0940l interfaceC0940l2) {
        return kd.l.x(interfaceC0940l, interfaceC0940l2.c(n0Var)) == l.i.a.OVERRIDABLE;
    }

    private final Wc.f q(InterfaceC0933e interfaceC0933e) {
        C3367b n10;
        id.c b10;
        if (Hc.g.a0(interfaceC0933e) || !Hc.g.B0(interfaceC0933e)) {
            return null;
        }
        id.d m10 = AbstractC3778c.m(interfaceC0933e);
        if (!m10.f() || (n10 = Jc.c.f4890a.n(m10)) == null || (b10 = n10.b()) == null) {
            return null;
        }
        InterfaceC0933e d10 = AbstractC0946s.d(u().a(), b10, Rc.d.FROM_BUILTINS);
        if (d10 instanceof Wc.f) {
            return (Wc.f) d10;
        }
        return null;
    }

    private final a r(InterfaceC0952y interfaceC0952y) {
        InterfaceC0941m b10 = interfaceC0952y.b();
        Intrinsics.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object b11 = Gd.b.b(CollectionsKt.e((InterfaceC0933e) b10), new Jc.h(this), new C0099i(y.c(interfaceC0952y, false, false, 3, null), new C5141B()));
        Intrinsics.checkNotNullExpressionValue(b11, "dfs(...)");
        return (a) b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable s(i this$0, InterfaceC0933e interfaceC0933e) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Collection a10 = interfaceC0933e.r().a();
        Intrinsics.checkNotNullExpressionValue(a10, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            InterfaceC0936h d10 = ((AbstractC5197E) it.next()).W0().d();
            Wc.f fVar = null;
            InterfaceC0936h a11 = d10 != null ? d10.a() : null;
            InterfaceC0933e interfaceC0933e2 = a11 instanceof InterfaceC0933e ? (InterfaceC0933e) a11 : null;
            if (interfaceC0933e2 != null && (fVar = this$0.q(interfaceC0933e2)) == null) {
                fVar = interfaceC0933e2;
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g t() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) xd.m.a(this.f4943g, this, f4936i[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.b u() {
        return (f.b) xd.m.a(this.f4939c, this, f4936i[0]);
    }

    private final boolean v(Z z10, boolean z11) {
        InterfaceC0941m b10 = z10.b();
        Intrinsics.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String c10 = y.c(z10, false, false, 3, null);
        if (z11 ^ l.f4960a.g().contains(x.a(C1673A.f18936a, (InterfaceC0933e) b10, c10))) {
            return true;
        }
        Boolean e10 = Gd.b.e(CollectionsKt.e(z10), Jc.g.f4934a, new j());
        Intrinsics.checkNotNullExpressionValue(e10, "ifAny(...)");
        return e10.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable w(InterfaceC0930b interfaceC0930b) {
        return interfaceC0930b.a().f();
    }

    private final boolean x(InterfaceC0940l interfaceC0940l, InterfaceC0933e interfaceC0933e) {
        if (interfaceC0940l.m().size() == 1) {
            List m10 = interfaceC0940l.m();
            Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
            InterfaceC0936h d10 = ((j0) CollectionsKt.A0(m10)).getType().W0().d();
            if (Intrinsics.b(d10 != null ? AbstractC3778c.m(d10) : null, AbstractC3778c.m(interfaceC0933e))) {
                return true;
            }
        }
        return false;
    }

    @Override // Lc.c
    public boolean a(InterfaceC0933e classDescriptor, Z functionDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        Wc.f q10 = q(classDescriptor);
        if (q10 == null || !functionDescriptor.i().A1(Lc.d.a())) {
            return true;
        }
        if (!u().b()) {
            return false;
        }
        String c10 = y.c(functionDescriptor, false, false, 3, null);
        Wc.g L02 = q10.L0();
        id.f name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Collection a10 = L02.a(name, Rc.d.FROM_BUILTINS);
        if (!(a10 instanceof Collection) || !a10.isEmpty()) {
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                if (Intrinsics.b(y.c((Z) it.next(), false, false, 3, null), c10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Lc.a
    public Collection b(InterfaceC0933e classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (classDescriptor.o() != EnumC0934f.CLASS || !u().b()) {
            return CollectionsKt.j();
        }
        Wc.f q10 = q(classDescriptor);
        if (q10 == null) {
            return CollectionsKt.j();
        }
        InterfaceC0933e f10 = Jc.d.f(this.f4938b, AbstractC3778c.l(q10), Jc.b.f4888h.a(), null, 4, null);
        if (f10 == null) {
            return CollectionsKt.j();
        }
        n0 c10 = m.a(f10, q10).c();
        List k10 = q10.k();
        ArrayList<InterfaceC0932d> arrayList = new ArrayList();
        for (Object obj : k10) {
            InterfaceC0932d interfaceC0932d = (InterfaceC0932d) obj;
            if (interfaceC0932d.h().d()) {
                Collection k11 = f10.k();
                Intrinsics.checkNotNullExpressionValue(k11, "getConstructors(...)");
                Collection<InterfaceC0932d> collection = k11;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (InterfaceC0932d interfaceC0932d2 : collection) {
                        Intrinsics.d(interfaceC0932d2);
                        if (o(interfaceC0932d2, c10, interfaceC0932d)) {
                            break;
                        }
                    }
                }
                if (!x(interfaceC0932d, classDescriptor) && !Hc.g.k0(interfaceC0932d) && !l.f4960a.e().contains(x.a(C1673A.f18936a, q10, y.c(interfaceC0932d, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
        for (InterfaceC0932d interfaceC0932d3 : arrayList) {
            InterfaceC0952y.a A10 = interfaceC0932d3.A();
            A10.f(classDescriptor);
            A10.v(classDescriptor.y());
            A10.h();
            A10.u(c10.j());
            if (!l.f4960a.h().contains(x.a(C1673A.f18936a, q10, y.c(interfaceC0932d3, false, false, 3, null)))) {
                A10.r(t());
            }
            InterfaceC0952y c11 = A10.c();
            Intrinsics.e(c11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((InterfaceC0932d) c11);
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
    
        if (r3 != 4) goto L52;
     */
    @Override // Lc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Collection c(id.f name, InterfaceC0933e classDescriptor) {
        id.f fVar;
        id.f fVar2;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (Intrinsics.b(name, Jc.a.f4886e.a()) && (classDescriptor instanceof C5072d) && Hc.g.d0(classDescriptor)) {
            C5072d c5072d = (C5072d) classDescriptor;
            List F02 = c5072d.j1().F0();
            Intrinsics.checkNotNullExpressionValue(F02, "getFunctionList(...)");
            List list = F02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.b(ud.y.b(c5072d.i1().g(), ((C3032i) it.next()).a0()), Jc.a.f4886e.a())) {
                        return CollectionsKt.j();
                    }
                }
            }
            return CollectionsKt.e(k(c5072d, (Z) CollectionsKt.z0(n().w().a(name, Rc.d.FROM_BUILTINS))));
        }
        if (!u().b()) {
            return CollectionsKt.j();
        }
        Collection<Z> m10 = m(classDescriptor, new h(name));
        ArrayList arrayList = new ArrayList();
        for (Z z10 : m10) {
            InterfaceC0941m b10 = z10.b();
            Intrinsics.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC0952y c10 = z10.c(m.a((InterfaceC0933e) b10, classDescriptor).c());
            Intrinsics.e(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            InterfaceC0952y.a A10 = ((Z) c10).A();
            A10.f(classDescriptor);
            A10.n(classDescriptor.S0());
            A10.h();
            int i10 = b.f4945a[r(z10).ordinal()];
            Z z11 = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    id.f name2 = z10.getName();
                    fVar = Jc.j.f4957a;
                    if (Intrinsics.b(name2, fVar)) {
                        gVar = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) this.f4944h.invoke(t.a(z10.getName().c(), "first"));
                    } else {
                        fVar2 = Jc.j.f4958b;
                        if (!Intrinsics.b(name2, fVar2)) {
                            throw new IllegalStateException(("Unexpected name: " + z10.getName()).toString());
                        }
                        gVar = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) this.f4944h.invoke(t.a(z10.getName().c(), "last"));
                    }
                    A10.r(gVar);
                } else if (i10 == 3) {
                    A10.r(t());
                }
                InterfaceC0952y c11 = A10.c();
                Intrinsics.d(c11);
                z11 = (Z) c11;
            } else if (!E.a(classDescriptor)) {
                A10.l();
                InterfaceC0952y c112 = A10.c();
                Intrinsics.d(c112);
                z11 = (Z) c112;
            }
            if (z11 != null) {
                arrayList.add(z11);
            }
        }
        return arrayList;
    }

    @Override // Lc.a
    public Collection d(InterfaceC0933e classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        id.d m10 = AbstractC3778c.m(classDescriptor);
        l lVar = l.f4960a;
        if (!lVar.j(m10)) {
            return lVar.k(m10) ? CollectionsKt.e(this.f4940d) : CollectionsKt.j();
        }
        M n10 = n();
        Intrinsics.checkNotNullExpressionValue(n10, "<get-cloneableType>(...)");
        return CollectionsKt.m(n10, this.f4940d);
    }

    @Override // Lc.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Set e(InterfaceC0933e classDescriptor) {
        Wc.g L02;
        Set b10;
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (!u().b()) {
            return O.d();
        }
        Wc.f q10 = q(classDescriptor);
        return (q10 == null || (L02 = q10.L0()) == null || (b10 = L02.b()) == null) ? O.d() : b10;
    }
}
