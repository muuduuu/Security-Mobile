package Ec;

import Ec.F;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.e0;
import Kc.f0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import vc.AbstractC5011a;
import xc.C5142C;
import yd.AbstractC5197E;
import yd.i0;
import yd.q0;
import yd.u0;

/* loaded from: classes3.dex */
public final class A implements xc.l {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f1922e = {C5142C.k(new xc.u(C5142C.b(A.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C5142C.k(new xc.u(C5142C.b(A.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5197E f1923a;

    /* renamed from: b, reason: collision with root package name */
    private final F.a f1924b;

    /* renamed from: c, reason: collision with root package name */
    private final F.a f1925c;

    /* renamed from: d, reason: collision with root package name */
    private final F.a f1926d;

    static final class a extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f1928b;

        /* renamed from: Ec.A$a$a, reason: collision with other inner class name */
        static final class C0041a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ A f1929a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1930b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Lazy f1931c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0041a(A a10, int i10, Lazy lazy) {
                super(0);
                this.f1929a = a10;
                this.f1930b = i10;
                this.f1931c = lazy;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type s10 = this.f1929a.s();
                if (s10 instanceof Class) {
                    Class cls = (Class) s10;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    Intrinsics.d(componentType);
                    return componentType;
                }
                if (s10 instanceof GenericArrayType) {
                    if (this.f1930b == 0) {
                        Type genericComponentType = ((GenericArrayType) s10).getGenericComponentType();
                        Intrinsics.d(genericComponentType);
                        return genericComponentType;
                    }
                    throw new D("Array type has been queried for a non-0th argument: " + this.f1929a);
                }
                if (!(s10 instanceof ParameterizedType)) {
                    throw new D("Non-generic type has been queried for arguments: " + this.f1929a);
                }
                Type type = (Type) a.c(this.f1931c).get(this.f1930b);
                if (type instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Intrinsics.checkNotNullExpressionValue(lowerBounds, "getLowerBounds(...)");
                    Type type2 = (Type) AbstractC3574i.A(lowerBounds);
                    if (type2 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                        type = (Type) AbstractC3574i.z(upperBounds);
                    } else {
                        type = type2;
                    }
                }
                Intrinsics.d(type);
                return type;
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1932a;

            static {
                int[] iArr = new int[u0.values().length];
                try {
                    iArr[u0.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[u0.IN_VARIANCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[u0.OUT_VARIANCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f1932a = iArr;
            }
        }

        static final class c extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ A f1933a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(A a10) {
                super(0);
                this.f1933a = a10;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                Type s10 = this.f1933a.s();
                Intrinsics.d(s10);
                return Pc.d.d(s10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0) {
            super(0);
            this.f1928b = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List c(Lazy lazy) {
            return (List) lazy.getValue();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            KTypeProjection d10;
            List U02 = A.this.r().U0();
            if (U02.isEmpty()) {
                return CollectionsKt.j();
            }
            Lazy b10 = lc.i.b(lc.l.PUBLICATION, new c(A.this));
            List list = U02;
            Function0 function0 = this.f1928b;
            A a10 = A.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.t();
                }
                i0 i0Var = (i0) obj;
                if (i0Var.c()) {
                    d10 = KTypeProjection.INSTANCE.c();
                } else {
                    AbstractC5197E type = i0Var.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    A a11 = new A(type, function0 == null ? null : new C0041a(a10, i10, b10));
                    int i12 = b.f1932a[i0Var.a().ordinal()];
                    if (i12 == 1) {
                        d10 = KTypeProjection.INSTANCE.d(a11);
                    } else if (i12 == 2) {
                        d10 = KTypeProjection.INSTANCE.a(a11);
                    } else {
                        if (i12 != 3) {
                            throw new lc.m();
                        }
                        d10 = KTypeProjection.INSTANCE.b(a11);
                    }
                }
                arrayList.add(d10);
                i10 = i11;
            }
            return arrayList;
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.e invoke() {
            A a10 = A.this;
            return a10.n(a10.r());
        }
    }

    public A(AbstractC5197E type, Function0 function0) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f1923a = type;
        F.a aVar = null;
        F.a aVar2 = function0 instanceof F.a ? (F.a) function0 : null;
        if (aVar2 != null) {
            aVar = aVar2;
        } else if (function0 != null) {
            aVar = F.c(function0);
        }
        this.f1924b = aVar;
        this.f1925c = F.c(new b());
        this.f1926d = F.c(new a(function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.e n(AbstractC5197E abstractC5197E) {
        AbstractC5197E type;
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        if (!(d10 instanceof InterfaceC0933e)) {
            if (d10 instanceof f0) {
                return new B(null, (f0) d10);
            }
            if (!(d10 instanceof e0)) {
                return null;
            }
            throw new lc.n("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class q10 = L.q((InterfaceC0933e) d10);
        if (q10 == null) {
            return null;
        }
        if (!q10.isArray()) {
            if (q0.l(abstractC5197E)) {
                return new C0832k(q10);
            }
            Class e10 = Pc.d.e(q10);
            if (e10 != null) {
                q10 = e10;
            }
            return new C0832k(q10);
        }
        i0 i0Var = (i0) CollectionsKt.C0(abstractC5197E.U0());
        if (i0Var == null || (type = i0Var.getType()) == null) {
            return new C0832k(q10);
        }
        kotlin.reflect.e n10 = n(type);
        if (n10 != null) {
            return new C0832k(L.f(AbstractC5011a.b(Dc.b.a(n10))));
        }
        throw new D("Cannot determine classifier for array element type: " + this);
    }

    public boolean equals(Object obj) {
        if (obj instanceof A) {
            A a10 = (A) obj;
            if (Intrinsics.b(this.f1923a, a10.f1923a) && Intrinsics.b(j(), a10.j()) && Intrinsics.b(f(), a10.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.o
    public List f() {
        Object b10 = this.f1926d.b(this, f1922e[1]);
        Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
        return (List) b10;
    }

    public int hashCode() {
        int hashCode = this.f1923a.hashCode() * 31;
        kotlin.reflect.e j10 = j();
        return ((hashCode + (j10 != null ? j10.hashCode() : 0)) * 31) + f().hashCode();
    }

    @Override // kotlin.reflect.b
    public List i() {
        return L.e(this.f1923a);
    }

    @Override // kotlin.reflect.o
    public kotlin.reflect.e j() {
        return (kotlin.reflect.e) this.f1925c.b(this, f1922e[0]);
    }

    @Override // kotlin.reflect.o
    public boolean p() {
        return this.f1923a.X0();
    }

    public final AbstractC5197E r() {
        return this.f1923a;
    }

    @Override // xc.l
    public Type s() {
        F.a aVar = this.f1924b;
        if (aVar != null) {
            return (Type) aVar.invoke();
        }
        return null;
    }

    public String toString() {
        return H.f1945a.h(this.f1923a);
    }

    public /* synthetic */ A(AbstractC5197E abstractC5197E, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5197E, (i10 & 2) != 0 ? null : function0);
    }
}
