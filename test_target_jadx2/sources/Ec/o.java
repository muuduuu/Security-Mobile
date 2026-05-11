package Ec;

import Ec.AbstractC0829h;
import Ec.F;
import Ec.InterfaceC0828g;
import Fc.a;
import Fc.f;
import Fc.j;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pd.AbstractC3872b;
import xc.AbstractC5150c;
import xc.C5142C;
import xc.InterfaceC5155h;

/* loaded from: classes3.dex */
public final class o extends AbstractC0831j implements InterfaceC5155h, kotlin.reflect.g, InterfaceC0828g {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f2072m = {C5142C.k(new xc.u(C5142C.b(o.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* renamed from: g, reason: collision with root package name */
    private final n f2073g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2074h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f2075i;

    /* renamed from: j, reason: collision with root package name */
    private final F.a f2076j;

    /* renamed from: k, reason: collision with root package name */
    private final Lazy f2077k;

    /* renamed from: l, reason: collision with root package name */
    private final Lazy f2078l;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fc.e invoke() {
            Object b10;
            Fc.e Y10;
            AbstractC0829h g10 = I.f1950a.g(o.this.S());
            if (g10 instanceof AbstractC0829h.d) {
                if (o.this.Q()) {
                    Class m10 = o.this.M().m();
                    List c10 = o.this.c();
                    ArrayList arrayList = new ArrayList(CollectionsKt.u(c10, 10));
                    Iterator it = c10.iterator();
                    while (it.hasNext()) {
                        String name = ((kotlin.reflect.j) it.next()).getName();
                        Intrinsics.d(name);
                        arrayList.add(name);
                    }
                    return new Fc.a(m10, arrayList, a.EnumC0058a.POSITIONAL_CALL, a.b.KOTLIN, null, 16, null);
                }
                b10 = o.this.M().x(((AbstractC0829h.d) g10).b());
            } else if (g10 instanceof AbstractC0829h.e) {
                InterfaceC0952y S10 = o.this.S();
                InterfaceC0941m b11 = S10.b();
                Intrinsics.checkNotNullExpressionValue(b11, "getContainingDeclaration(...)");
                if (kd.h.d(b11) && (S10 instanceof InterfaceC0940l) && ((InterfaceC0940l) S10).H()) {
                    InterfaceC0952y S11 = o.this.S();
                    n M10 = o.this.M();
                    String b12 = ((AbstractC0829h.e) g10).b();
                    List m11 = o.this.S().m();
                    Intrinsics.checkNotNullExpressionValue(m11, "getValueParameters(...)");
                    return new j.b(S11, M10, b12, m11);
                }
                AbstractC0829h.e eVar = (AbstractC0829h.e) g10;
                b10 = o.this.M().F(eVar.c(), eVar.b());
            } else if (g10 instanceof AbstractC0829h.c) {
                b10 = ((AbstractC0829h.c) g10).b();
            } else {
                if (!(g10 instanceof AbstractC0829h.b)) {
                    if (!(g10 instanceof AbstractC0829h.a)) {
                        throw new lc.m();
                    }
                    List b13 = ((AbstractC0829h.a) g10).b();
                    Class m12 = o.this.M().m();
                    List list = b13;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new Fc.a(m12, arrayList2, a.EnumC0058a.POSITIONAL_CALL, a.b.JAVA, b13);
                }
                b10 = ((AbstractC0829h.b) g10).b();
            }
            if (b10 instanceof Constructor) {
                o oVar = o.this;
                Y10 = oVar.X((Constructor) b10, oVar.S(), false);
            } else {
                if (!(b10 instanceof Method)) {
                    throw new D("Could not compute caller for function: " + o.this.S() + " (member = " + b10 + ')');
                }
                Method method = (Method) b10;
                Y10 = !Modifier.isStatic(method.getModifiers()) ? o.this.Y(method) : o.this.S().i().p(L.j()) != null ? o.this.Z(method) : o.this.a0(method);
            }
            return Fc.k.i(Y10, o.this.S(), false, 2, null);
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fc.e invoke() {
            GenericDeclaration genericDeclaration;
            Fc.e eVar;
            AbstractC0829h g10 = I.f1950a.g(o.this.S());
            if (g10 instanceof AbstractC0829h.e) {
                InterfaceC0952y S10 = o.this.S();
                InterfaceC0941m b10 = S10.b();
                Intrinsics.checkNotNullExpressionValue(b10, "getContainingDeclaration(...)");
                if (kd.h.d(b10) && (S10 instanceof InterfaceC0940l) && ((InterfaceC0940l) S10).H()) {
                    throw new D(o.this.S().b() + " cannot have default arguments");
                }
                n M10 = o.this.M();
                AbstractC0829h.e eVar2 = (AbstractC0829h.e) g10;
                String c10 = eVar2.c();
                String b11 = eVar2.b();
                Intrinsics.d(o.this.L().a());
                genericDeclaration = M10.D(c10, b11, !Modifier.isStatic(r5.getModifiers()));
            } else if (g10 instanceof AbstractC0829h.d) {
                if (o.this.Q()) {
                    Class m10 = o.this.M().m();
                    List c11 = o.this.c();
                    ArrayList arrayList = new ArrayList(CollectionsKt.u(c11, 10));
                    Iterator it = c11.iterator();
                    while (it.hasNext()) {
                        String name = ((kotlin.reflect.j) it.next()).getName();
                        Intrinsics.d(name);
                        arrayList.add(name);
                    }
                    return new Fc.a(m10, arrayList, a.EnumC0058a.CALL_BY_NAME, a.b.KOTLIN, null, 16, null);
                }
                genericDeclaration = o.this.M().C(((AbstractC0829h.d) g10).b());
            } else {
                if (g10 instanceof AbstractC0829h.a) {
                    List b12 = ((AbstractC0829h.a) g10).b();
                    Class m11 = o.this.M().m();
                    List list = b12;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new Fc.a(m11, arrayList2, a.EnumC0058a.CALL_BY_NAME, a.b.JAVA, b12);
                }
                genericDeclaration = null;
            }
            if (genericDeclaration instanceof Constructor) {
                o oVar = o.this;
                eVar = oVar.X((Constructor) genericDeclaration, oVar.S(), true);
            } else if (genericDeclaration instanceof Method) {
                if (o.this.S().i().p(L.j()) != null) {
                    InterfaceC0941m b13 = o.this.S().b();
                    Intrinsics.e(b13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (!((InterfaceC0933e) b13).F()) {
                        eVar = o.this.Z((Method) genericDeclaration);
                    }
                }
                eVar = o.this.a0((Method) genericDeclaration);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                return Fc.k.h(eVar, o.this.S(), true);
            }
            return null;
        }
    }

    static final class c extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f2082b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f2082b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0952y invoke() {
            return o.this.M().E(this.f2082b, o.this.f2074h);
        }
    }

    /* synthetic */ o(n nVar, String str, String str2, InterfaceC0952y interfaceC0952y, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, str, str2, interfaceC0952y, (i10 & 16) != 0 ? AbstractC5150c.f44978g : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Fc.f X(Constructor constructor, InterfaceC0952y interfaceC0952y, boolean z10) {
        return (z10 || !AbstractC3872b.f(interfaceC0952y)) ? R() ? new f.c(constructor, b0()) : new f.e(constructor) : R() ? new f.a(constructor, b0()) : new f.b(constructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.h Y(Method method) {
        return R() ? new f.h.a(method, b0()) : new f.h.e(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.h Z(Method method) {
        return R() ? new f.h.b(method) : new f.h.C0060f(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.h a0(Method method) {
        return R() ? new f.h.c(method, b0()) : new f.h.g(method);
    }

    private final Object b0() {
        return Fc.k.g(this.f2075i, S());
    }

    @Override // Ec.AbstractC0831j
    public Fc.e L() {
        return (Fc.e) this.f2077k.getValue();
    }

    @Override // Ec.AbstractC0831j
    public n M() {
        return this.f2073g;
    }

    @Override // Ec.AbstractC0831j
    public Fc.e N() {
        return (Fc.e) this.f2078l.getValue();
    }

    @Override // Ec.AbstractC0831j
    public boolean R() {
        return !Intrinsics.b(this.f2075i, AbstractC5150c.f44978g);
    }

    @Override // Ec.AbstractC0831j
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public InterfaceC0952y S() {
        Object b10 = this.f2076j.b(this, f2072m[0]);
        Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
        return (InterfaceC0952y) b10;
    }

    public boolean equals(Object obj) {
        o c10 = L.c(obj);
        return c10 != null && Intrinsics.b(M(), c10.M()) && Intrinsics.b(getName(), c10.getName()) && Intrinsics.b(this.f2074h, c10.f2074h) && Intrinsics.b(this.f2075i, c10.f2075i);
    }

    @Override // xc.InterfaceC5155h
    public int getArity() {
        return Fc.g.a(L());
    }

    @Override // kotlin.reflect.c
    public String getName() {
        String c10 = S().getName().c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        return c10;
    }

    public int hashCode() {
        return (((M().hashCode() * 31) + getName().hashCode()) * 31) + this.f2074h.hashCode();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return InterfaceC0828g.a.a(this);
    }

    @Override // wc.InterfaceC5068n
    public Object n(Object obj, Object obj2, Object obj3) {
        return InterfaceC0828g.a.d(this, obj, obj2, obj3);
    }

    @Override // wc.o
    public Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        return InterfaceC0828g.a.e(this, obj, obj2, obj3, obj4);
    }

    public String toString() {
        return H.f1945a.d(S());
    }

    @Override // wc.q
    public Object w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return InterfaceC0828g.a.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // wc.p
    public Object x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return InterfaceC0828g.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.reflect.c
    public boolean z() {
        return S().z();
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return InterfaceC0828g.a.b(this, obj);
    }

    private o(n nVar, String str, String str2, InterfaceC0952y interfaceC0952y, Object obj) {
        this.f2073g = nVar;
        this.f2074h = str2;
        this.f2075i = obj;
        this.f2076j = F.b(interfaceC0952y, new c(str));
        lc.l lVar = lc.l.PUBLICATION;
        this.f2077k = lc.i.b(lVar, new a());
        this.f2078l = lc.i.b(lVar, new b());
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return InterfaceC0828g.a.c(this, obj, obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(n container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(n container, InterfaceC0952y descriptor) {
        this(container, r3, I.f1950a.g(descriptor).a(), descriptor, null, 16, null);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String c10 = descriptor.getName().c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
    }
}
