package Ec;

import Ec.AbstractC0830i;
import Ec.F;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.T;
import Kc.U;
import Kc.V;
import Kc.W;
import gd.AbstractC3218a;
import hd.d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kd.AbstractC3565e;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.k;
import xc.AbstractC5150c;
import xc.C5142C;

/* loaded from: classes3.dex */
public abstract class y extends AbstractC0831j implements kotlin.reflect.k {

    /* renamed from: m, reason: collision with root package name */
    public static final b f2135m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    private static final Object f2136n = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final n f2137g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2138h;

    /* renamed from: i, reason: collision with root package name */
    private final String f2139i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f2140j;

    /* renamed from: k, reason: collision with root package name */
    private final Lazy f2141k;

    /* renamed from: l, reason: collision with root package name */
    private final F.a f2142l;

    public static abstract class a extends AbstractC0831j implements kotlin.reflect.g, k.a {
        @Override // Ec.AbstractC0831j
        public n M() {
            return u().M();
        }

        @Override // Ec.AbstractC0831j
        public Fc.e N() {
            return null;
        }

        @Override // Ec.AbstractC0831j
        public boolean R() {
            return u().R();
        }

        public abstract T S();

        /* renamed from: T */
        public abstract y u();

        @Override // kotlin.reflect.c
        public boolean z() {
            return S().z();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static abstract class c extends a implements k.b {

        /* renamed from: i, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.k[] f2143i = {C5142C.k(new xc.u(C5142C.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};

        /* renamed from: g, reason: collision with root package name */
        private final F.a f2144g = F.c(new b());

        /* renamed from: h, reason: collision with root package name */
        private final Lazy f2145h = lc.i.b(lc.l.PUBLICATION, new a());

        static final class a extends xc.m implements Function0 {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Fc.e invoke() {
                Fc.e b10;
                b10 = z.b(c.this, true);
                return b10;
            }
        }

        static final class b extends xc.m implements Function0 {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final V invoke() {
                V d10 = c.this.u().S().d();
                return d10 == null ? AbstractC3565e.d(c.this.u().S(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b()) : d10;
            }
        }

        @Override // Ec.AbstractC0831j
        public Fc.e L() {
            return (Fc.e) this.f2145h.getValue();
        }

        @Override // Ec.y.a
        /* renamed from: U, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public V S() {
            Object b10 = this.f2144g.b(this, f2143i[0]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (V) b10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && Intrinsics.b(u(), ((c) obj).u());
        }

        @Override // kotlin.reflect.c
        public String getName() {
            return "<get-" + u().getName() + '>';
        }

        public int hashCode() {
            return u().hashCode();
        }

        public String toString() {
            return "getter of " + u();
        }
    }

    public static abstract class d extends a implements h.a {

        /* renamed from: i, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.k[] f2148i = {C5142C.k(new xc.u(C5142C.b(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

        /* renamed from: g, reason: collision with root package name */
        private final F.a f2149g = F.c(new b());

        /* renamed from: h, reason: collision with root package name */
        private final Lazy f2150h = lc.i.b(lc.l.PUBLICATION, new a());

        static final class a extends xc.m implements Function0 {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Fc.e invoke() {
                Fc.e b10;
                b10 = z.b(d.this, false);
                return b10;
            }
        }

        static final class b extends xc.m implements Function0 {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final W invoke() {
                W l10 = d.this.u().S().l();
                if (l10 != null) {
                    return l10;
                }
                U S10 = d.this.u().S();
                g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0;
                return AbstractC3565e.e(S10, aVar.b(), aVar.b());
            }
        }

        @Override // Ec.AbstractC0831j
        public Fc.e L() {
            return (Fc.e) this.f2150h.getValue();
        }

        @Override // Ec.y.a
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public W S() {
            Object b10 = this.f2149g.b(this, f2148i[0]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (W) b10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && Intrinsics.b(u(), ((d) obj).u());
        }

        @Override // kotlin.reflect.c
        public String getName() {
            return "<set-" + u().getName() + '>';
        }

        public int hashCode() {
            return u().hashCode();
        }

        public String toString() {
            return "setter of " + u();
        }
    }

    static final class e extends xc.m implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U invoke() {
            return y.this.M().G(y.this.getName(), y.this.Y());
        }
    }

    static final class f extends xc.m implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Field invoke() {
            Class<?> enclosingClass;
            AbstractC0830i f10 = I.f1950a.f(y.this.S());
            if (!(f10 instanceof AbstractC0830i.c)) {
                if (f10 instanceof AbstractC0830i.a) {
                    return ((AbstractC0830i.a) f10).b();
                }
                if ((f10 instanceof AbstractC0830i.b) || (f10 instanceof AbstractC0830i.d)) {
                    return null;
                }
                throw new lc.m();
            }
            AbstractC0830i.c cVar = (AbstractC0830i.c) f10;
            U b10 = cVar.b();
            d.a d10 = hd.i.d(hd.i.f34080a, cVar.e(), cVar.d(), cVar.g(), false, 8, null);
            if (d10 == null) {
                return null;
            }
            y yVar = y.this;
            if (Sc.k.e(b10) || hd.i.f(cVar.e())) {
                enclosingClass = yVar.M().m().getEnclosingClass();
            } else {
                InterfaceC0941m b11 = b10.b();
                enclosingClass = b11 instanceof InterfaceC0933e ? L.q((InterfaceC0933e) b11) : yVar.M().m();
            }
            if (enclosingClass == null) {
                return null;
            }
            try {
                return enclosingClass.getDeclaredField(d10.c());
            } catch (NoSuchFieldException unused) {
                return null;
            }
        }
    }

    private y(n nVar, String str, String str2, U u10, Object obj) {
        this.f2137g = nVar;
        this.f2138h = str;
        this.f2139i = str2;
        this.f2140j = obj;
        this.f2141k = lc.i.b(lc.l.PUBLICATION, new f());
        F.a b10 = F.b(u10, new e());
        Intrinsics.checkNotNullExpressionValue(b10, "lazySoft(...)");
        this.f2142l = b10;
    }

    @Override // Ec.AbstractC0831j
    public Fc.e L() {
        return d().L();
    }

    @Override // Ec.AbstractC0831j
    public n M() {
        return this.f2137g;
    }

    @Override // Ec.AbstractC0831j
    public Fc.e N() {
        return d().N();
    }

    @Override // Ec.AbstractC0831j
    public boolean R() {
        return !Intrinsics.b(this.f2140j, AbstractC5150c.f44978g);
    }

    protected final Member S() {
        if (!S().T()) {
            return null;
        }
        AbstractC0830i f10 = I.f1950a.f(S());
        if (f10 instanceof AbstractC0830i.c) {
            AbstractC0830i.c cVar = (AbstractC0830i.c) f10;
            if (cVar.f().B()) {
                AbstractC3218a.c w10 = cVar.f().w();
                if (!w10.w() || !w10.v()) {
                    return null;
                }
                return M().F(cVar.d().getString(w10.u()), cVar.d().getString(w10.t()));
            }
        }
        return X();
    }

    public final Object T() {
        return Fc.k.g(this.f2140j, S());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final Object U(Member member, Object obj, Object obj2) {
        try {
            Object obj3 = f2136n;
            if ((obj == obj3 || obj2 == obj3) && S().s0() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object T10 = R() ? T() : obj;
            if (T10 == obj3) {
                T10 = null;
            }
            if (!R()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(Dc.a.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(T10);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (T10 == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    Intrinsics.checkNotNullExpressionValue(cls, "get(...)");
                    T10 = L.g(cls);
                }
                return method.invoke(null, T10);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                Intrinsics.checkNotNullExpressionValue(cls2, "get(...)");
                obj = L.g(cls2);
            }
            return method2.invoke(null, T10, obj);
        } catch (IllegalAccessException e10) {
            throw new Cc.b(e10);
        }
    }

    @Override // Ec.AbstractC0831j
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public U S() {
        Object invoke = this.f2142l.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return (U) invoke;
    }

    /* renamed from: W */
    public abstract c d();

    public final Field X() {
        return (Field) this.f2141k.getValue();
    }

    public final String Y() {
        return this.f2139i;
    }

    public boolean equals(Object obj) {
        y d10 = L.d(obj);
        return d10 != null && Intrinsics.b(M(), d10.M()) && Intrinsics.b(getName(), d10.getName()) && Intrinsics.b(this.f2139i, d10.f2139i) && Intrinsics.b(this.f2140j, d10.f2140j);
    }

    @Override // kotlin.reflect.c
    public String getName() {
        return this.f2138h;
    }

    public int hashCode() {
        return (((M().hashCode() * 31) + getName().hashCode()) * 31) + this.f2139i.hashCode();
    }

    public String toString() {
        return H.f1945a.g(S());
    }

    @Override // kotlin.reflect.c
    public boolean z() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(n container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y(n container, U descriptor) {
        this(container, r3, I.f1950a.f(descriptor).a(), descriptor, AbstractC5150c.f44978g);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String c10 = descriptor.getName().c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
    }
}
