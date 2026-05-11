package Ec;

import Ec.F;
import Fc.j;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.Q;
import Kc.X;
import Kc.j0;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.j;
import od.AbstractC3778c;
import vc.C5012b;
import xc.C5142C;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public final class u implements kotlin.reflect.j {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f2110f = {C5142C.k(new xc.u(C5142C.b(u.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), C5142C.k(new xc.u(C5142C.b(u.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0831j f2111a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2112b;

    /* renamed from: c, reason: collision with root package name */
    private final j.a f2113c;

    /* renamed from: d, reason: collision with root package name */
    private final F.a f2114d;

    /* renamed from: e, reason: collision with root package name */
    private final F.a f2115e;

    private static final class a implements Type {

        /* renamed from: a, reason: collision with root package name */
        private final Type[] f2116a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2117b;

        public a(Type[] types) {
            Intrinsics.checkNotNullParameter(types, "types");
            this.f2116a = types;
            this.f2117b = Arrays.hashCode(types);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Arrays.equals(this.f2116a, ((a) obj).f2116a);
        }

        @Override // java.lang.reflect.Type
        public String getTypeName() {
            return AbstractC3574i.S(this.f2116a, ", ", "[", "]", 0, null, null, 56, null);
        }

        public int hashCode() {
            return this.f2117b;
        }

        public String toString() {
            return getTypeName();
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return L.e(u.this.u());
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Type invoke() {
            Q u10 = u.this.u();
            if ((u10 instanceof X) && Intrinsics.b(L.i(u.this.t().S()), u10) && u.this.t().S().o() == InterfaceC0930b.a.FAKE_OVERRIDE) {
                InterfaceC0941m b10 = u.this.t().S().b();
                Intrinsics.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class q10 = L.q((InterfaceC0933e) b10);
                if (q10 != null) {
                    return q10;
                }
                throw new D("Cannot determine receiver Java type of inherited declaration: " + u10);
            }
            Fc.e L10 = u.this.t().L();
            if (L10 instanceof Fc.j) {
                List D02 = CollectionsKt.D0(L10.i(), ((Fc.j) L10).c(u.this.getIndex()));
                u uVar = u.this;
                Type[] typeArr = (Type[]) D02.toArray(new Type[0]);
                return uVar.r((Type[]) Arrays.copyOf(typeArr, typeArr.length));
            }
            if (!(L10 instanceof j.b)) {
                return (Type) L10.i().get(u.this.getIndex());
            }
            u uVar2 = u.this;
            Class[] clsArr = (Class[]) ((Collection) ((j.b) L10).c().get(u.this.getIndex())).toArray(new Class[0]);
            return uVar2.r((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
    }

    public u(AbstractC0831j callable, int i10, j.a kind, Function0 computeDescriptor) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(computeDescriptor, "computeDescriptor");
        this.f2111a = callable;
        this.f2112b = i10;
        this.f2113c = kind;
        this.f2114d = F.c(computeDescriptor);
        this.f2115e = F.c(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Type r(Type... typeArr) {
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new a(typeArr) : (Type) AbstractC3574i.Z(typeArr);
        }
        throw new C5012b("Expected at least 1 type for compound type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Q u() {
        Object b10 = this.f2114d.b(this, f2110f[0]);
        Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
        return (Q) b10;
    }

    @Override // kotlin.reflect.j
    public boolean A() {
        Q u10 = u();
        j0 j0Var = u10 instanceof j0 ? (j0) u10 : null;
        if (j0Var != null) {
            return AbstractC3778c.c(j0Var);
        }
        return false;
    }

    @Override // kotlin.reflect.j
    public boolean b() {
        Q u10 = u();
        return (u10 instanceof j0) && ((j0) u10).r0() != null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (Intrinsics.b(this.f2111a, uVar.f2111a) && getIndex() == uVar.getIndex()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.j
    public int getIndex() {
        return this.f2112b;
    }

    @Override // kotlin.reflect.j
    public String getName() {
        Q u10 = u();
        j0 j0Var = u10 instanceof j0 ? (j0) u10 : null;
        if (j0Var == null || j0Var.b().M()) {
            return null;
        }
        id.f name = j0Var.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (name.p()) {
            return null;
        }
        return name.c();
    }

    @Override // kotlin.reflect.j
    public kotlin.reflect.o getType() {
        AbstractC5197E type = u().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return new A(type, new c());
    }

    public int hashCode() {
        return (this.f2111a.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    @Override // kotlin.reflect.b
    public List i() {
        Object b10 = this.f2115e.b(this, f2110f[1]);
        Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
        return (List) b10;
    }

    @Override // kotlin.reflect.j
    public j.a o() {
        return this.f2113c;
    }

    public final AbstractC0831j t() {
        return this.f2111a;
    }

    public String toString() {
        return H.f1945a.f(this);
    }
}
