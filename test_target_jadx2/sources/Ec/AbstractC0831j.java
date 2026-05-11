package Ec;

import Ec.F;
import Kc.InterfaceC0930b;
import Kc.Q;
import Kc.X;
import Kc.f0;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.j;
import nc.AbstractC3728a;
import vc.AbstractC5011a;
import yd.AbstractC5197E;
import yd.m0;

/* renamed from: Ec.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0831j implements kotlin.reflect.c, C {

    /* renamed from: a, reason: collision with root package name */
    private final F.a f1993a;

    /* renamed from: b, reason: collision with root package name */
    private final F.a f1994b;

    /* renamed from: c, reason: collision with root package name */
    private final F.a f1995c;

    /* renamed from: d, reason: collision with root package name */
    private final F.a f1996d;

    /* renamed from: e, reason: collision with root package name */
    private final F.a f1997e;

    /* renamed from: f, reason: collision with root package name */
    private final Lazy f1998f;

    /* renamed from: Ec.j$a */
    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object[] invoke() {
            int i10;
            List<kotlin.reflect.j> c10 = AbstractC0831j.this.c();
            int size = c10.size() + (AbstractC0831j.this.z() ? 1 : 0);
            if (((Boolean) AbstractC0831j.this.f1998f.getValue()).booleanValue()) {
                AbstractC0831j abstractC0831j = AbstractC0831j.this;
                i10 = 0;
                for (kotlin.reflect.j jVar : c10) {
                    i10 += jVar.o() == j.a.VALUE ? abstractC0831j.P(jVar) : 0;
                }
            } else {
                List list = c10;
                if ((list instanceof Collection) && list.isEmpty()) {
                    i10 = 0;
                } else {
                    Iterator it = list.iterator();
                    i10 = 0;
                    while (it.hasNext()) {
                        if (((kotlin.reflect.j) it.next()).o() == j.a.VALUE && (i10 = i10 + 1) < 0) {
                            CollectionsKt.s();
                        }
                    }
                }
            }
            int i11 = (i10 + 31) / 32;
            Object[] objArr = new Object[size + i11 + 1];
            AbstractC0831j abstractC0831j2 = AbstractC0831j.this;
            for (kotlin.reflect.j jVar2 : c10) {
                if (jVar2.A() && !L.l(jVar2.getType())) {
                    objArr[jVar2.getIndex()] = L.g(Dc.c.f(jVar2.getType()));
                } else if (jVar2.b()) {
                    objArr[jVar2.getIndex()] = abstractC0831j2.I(jVar2.getType());
                }
            }
            for (int i12 = 0; i12 < i11; i12++) {
                objArr[size + i12] = 0;
            }
            return objArr;
        }
    }

    /* renamed from: Ec.j$b */
    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return L.e(AbstractC0831j.this.S());
        }
    }

    /* renamed from: Ec.j$c */
    static final class c extends xc.m implements Function0 {

        /* renamed from: Ec.j$c$a */
        static final class a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ X f2002a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(X x10) {
                super(0);
                this.f2002a = x10;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Q invoke() {
                return this.f2002a;
            }
        }

        /* renamed from: Ec.j$c$b */
        static final class b extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ X f2003a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(X x10) {
                super(0);
                this.f2003a = x10;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Q invoke() {
                return this.f2003a;
            }
        }

        /* renamed from: Ec.j$c$c, reason: collision with other inner class name */
        static final class C0044c extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0930b f2004a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f2005b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0044c(InterfaceC0930b interfaceC0930b, int i10) {
                super(0);
                this.f2004a = interfaceC0930b;
                this.f2005b = i10;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Q invoke() {
                Object obj = this.f2004a.m().get(this.f2005b);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return (Q) obj;
            }
        }

        /* renamed from: Ec.j$c$d */
        public static final class d implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC3728a.a(((kotlin.reflect.j) obj).getName(), ((kotlin.reflect.j) obj2).getName());
            }
        }

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList invoke() {
            int i10;
            InterfaceC0930b S10 = AbstractC0831j.this.S();
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            if (AbstractC0831j.this.R()) {
                i10 = 0;
            } else {
                X i12 = L.i(S10);
                if (i12 != null) {
                    arrayList.add(new u(AbstractC0831j.this, 0, j.a.INSTANCE, new a(i12)));
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                X s02 = S10.s0();
                if (s02 != null) {
                    arrayList.add(new u(AbstractC0831j.this, i10, j.a.EXTENSION_RECEIVER, new b(s02)));
                    i10++;
                }
            }
            int size = S10.m().size();
            while (i11 < size) {
                arrayList.add(new u(AbstractC0831j.this, i10, j.a.VALUE, new C0044c(S10, i11)));
                i11++;
                i10++;
            }
            if (AbstractC0831j.this.Q() && (S10 instanceof Uc.a) && arrayList.size() > 1) {
                CollectionsKt.y(arrayList, new d());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* renamed from: Ec.j$d */
    static final class d extends xc.m implements Function0 {

        /* renamed from: Ec.j$d$a */
        static final class a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC0831j f2007a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC0831j abstractC0831j) {
                super(0);
                this.f2007a = abstractC0831j;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type J10 = this.f2007a.J();
                return J10 == null ? this.f2007a.L().g() : J10;
            }
        }

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A invoke() {
            AbstractC5197E g10 = AbstractC0831j.this.S().g();
            Intrinsics.d(g10);
            return new A(g10, new a(AbstractC0831j.this));
        }
    }

    /* renamed from: Ec.j$e */
    static final class e extends xc.m implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List n10 = AbstractC0831j.this.S().n();
            Intrinsics.checkNotNullExpressionValue(n10, "getTypeParameters(...)");
            List<f0> list = n10;
            AbstractC0831j abstractC0831j = AbstractC0831j.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            for (f0 f0Var : list) {
                Intrinsics.d(f0Var);
                arrayList.add(new B(abstractC0831j, f0Var));
            }
            return arrayList;
        }
    }

    /* renamed from: Ec.j$f */
    static final class f extends xc.m implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            List c10 = AbstractC0831j.this.c();
            boolean z10 = false;
            if (!(c10 instanceof Collection) || !c10.isEmpty()) {
                Iterator it = c10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (L.k(((kotlin.reflect.j) it.next()).getType())) {
                        z10 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    public AbstractC0831j() {
        F.a c10 = F.c(new b());
        Intrinsics.checkNotNullExpressionValue(c10, "lazySoft(...)");
        this.f1993a = c10;
        F.a c11 = F.c(new c());
        Intrinsics.checkNotNullExpressionValue(c11, "lazySoft(...)");
        this.f1994b = c11;
        F.a c12 = F.c(new d());
        Intrinsics.checkNotNullExpressionValue(c12, "lazySoft(...)");
        this.f1995c = c12;
        F.a c13 = F.c(new e());
        Intrinsics.checkNotNullExpressionValue(c13, "lazySoft(...)");
        this.f1996d = c13;
        F.a c14 = F.c(new a());
        Intrinsics.checkNotNullExpressionValue(c14, "lazySoft(...)");
        this.f1997e = c14;
        this.f1998f = lc.i.b(lc.l.PUBLICATION, new f());
    }

    private final Object G(Map map) {
        Object I10;
        List<kotlin.reflect.j> c10 = c();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(c10, 10));
        for (kotlin.reflect.j jVar : c10) {
            if (map.containsKey(jVar)) {
                I10 = map.get(jVar);
                if (I10 == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + jVar + ')');
                }
            } else if (jVar.A()) {
                I10 = null;
            } else {
                if (!jVar.b()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + jVar);
                }
                I10 = I(jVar.getType());
            }
            arrayList.add(I10);
        }
        Fc.e N10 = N();
        if (N10 != null) {
            try {
                return N10.h(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e10) {
                throw new Cc.a(e10);
            }
        }
        throw new D("This callable does not support a default call: " + S());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I(kotlin.reflect.o oVar) {
        Class b10 = AbstractC5011a.b(Dc.b.b(oVar));
        if (b10.isArray()) {
            Object newInstance = Array.newInstance(b10.getComponentType(), 0);
            Intrinsics.checkNotNullExpressionValue(newInstance, "run(...)");
            return newInstance;
        }
        throw new D("Cannot instantiate the default empty array of type " + b10.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Type J() {
        Type[] lowerBounds;
        if (!z()) {
            return null;
        }
        Object p02 = CollectionsKt.p0(L().i());
        ParameterizedType parameterizedType = p02 instanceof ParameterizedType ? (ParameterizedType) p02 : null;
        if (!Intrinsics.b(parameterizedType != null ? parameterizedType.getRawType() : null, kotlin.coroutines.d.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        Object Z10 = AbstractC3574i.Z(actualTypeArguments);
        WildcardType wildcardType = Z10 instanceof WildcardType ? (WildcardType) Z10 : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) AbstractC3574i.z(lowerBounds);
    }

    private final Object[] K() {
        return (Object[]) ((Object[]) this.f1997e.invoke()).clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P(kotlin.reflect.j jVar) {
        if (!((Boolean) this.f1998f.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!L.k(jVar.getType())) {
            return 1;
        }
        kotlin.reflect.o type = jVar.getType();
        Intrinsics.e(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List m10 = Fc.k.m(m0.a(((A) type).r()));
        Intrinsics.d(m10);
        return m10.size();
    }

    public final Object H(Map args, kotlin.coroutines.d dVar) {
        Intrinsics.checkNotNullParameter(args, "args");
        List<kotlin.reflect.j> c10 = c();
        boolean z10 = false;
        if (c10.isEmpty()) {
            try {
                return L().h(z() ? new kotlin.coroutines.d[]{dVar} : new kotlin.coroutines.d[0]);
            } catch (IllegalAccessException e10) {
                throw new Cc.a(e10);
            }
        }
        int size = c10.size() + (z() ? 1 : 0);
        Object[] K10 = K();
        if (z()) {
            K10[c10.size()] = dVar;
        }
        boolean booleanValue = ((Boolean) this.f1998f.getValue()).booleanValue();
        int i10 = 0;
        for (kotlin.reflect.j jVar : c10) {
            int P10 = booleanValue ? P(jVar) : 1;
            if (args.containsKey(jVar)) {
                K10[jVar.getIndex()] = args.get(jVar);
            } else if (jVar.A()) {
                if (booleanValue) {
                    int i11 = i10 + P10;
                    for (int i12 = i10; i12 < i11; i12++) {
                        int i13 = (i12 / 32) + size;
                        Object obj = K10[i13];
                        Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Int");
                        K10[i13] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i12 % 32)));
                    }
                } else {
                    int i14 = (i10 / 32) + size;
                    Object obj2 = K10[i14];
                    Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                    K10[i14] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i10 % 32)));
                }
                z10 = true;
            } else if (!jVar.b()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + jVar);
            }
            if (jVar.o() == j.a.VALUE) {
                i10 += P10;
            }
        }
        if (!z10) {
            try {
                Fc.e L10 = L();
                Object[] copyOf = Arrays.copyOf(K10, size);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                return L10.h(copyOf);
            } catch (IllegalAccessException e11) {
                throw new Cc.a(e11);
            }
        }
        Fc.e N10 = N();
        if (N10 != null) {
            try {
                return N10.h(K10);
            } catch (IllegalAccessException e12) {
                throw new Cc.a(e12);
            }
        }
        throw new D("This callable does not support a default call: " + S());
    }

    public abstract Fc.e L();

    public abstract n M();

    public abstract Fc.e N();

    /* renamed from: O */
    public abstract InterfaceC0930b S();

    protected final boolean Q() {
        return Intrinsics.b(getName(), "<init>") && M().m().isAnnotation();
    }

    public abstract boolean R();

    @Override // kotlin.reflect.c
    public List c() {
        Object invoke = this.f1994b.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return (List) invoke;
    }

    @Override // kotlin.reflect.c
    public kotlin.reflect.o g() {
        Object invoke = this.f1995c.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return (kotlin.reflect.o) invoke;
    }

    @Override // kotlin.reflect.c
    public Object h(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return L().h(args);
        } catch (IllegalAccessException e10) {
            throw new Cc.a(e10);
        }
    }

    @Override // kotlin.reflect.b
    public List i() {
        Object invoke = this.f1993a.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return (List) invoke;
    }

    @Override // kotlin.reflect.c
    public Object v(Map args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return Q() ? G(args) : H(args, null);
    }
}
