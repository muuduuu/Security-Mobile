package yd;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import md.C3687n;
import od.AbstractC3778c;
import yd.X;

/* renamed from: yd.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5198F {

    /* renamed from: a, reason: collision with root package name */
    public static final C5198F f45434a = new C5198F();

    /* renamed from: b, reason: collision with root package name */
    private static final Function1 f45435b = a.f45436a;

    /* renamed from: yd.F$a */
    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45436a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            Intrinsics.checkNotNullParameter(gVar, "<anonymous parameter 0>");
            return null;
        }
    }

    /* renamed from: yd.F$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final M f45437a;

        /* renamed from: b, reason: collision with root package name */
        private final e0 f45438b;

        public b(M m10, e0 e0Var) {
            this.f45437a = m10;
            this.f45438b = e0Var;
        }

        public final M a() {
            return this.f45437a;
        }

        public final e0 b() {
            return this.f45438b;
        }
    }

    /* renamed from: yd.F$c */
    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0 f45439a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f45440b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f45441c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f45442d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e0 e0Var, List list, a0 a0Var, boolean z10) {
            super(1);
            this.f45439a = e0Var;
            this.f45440b = list;
            this.f45441c = a0Var;
            this.f45442d = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke(kotlin.reflect.jvm.internal.impl.types.checker.g refiner) {
            Intrinsics.checkNotNullParameter(refiner, "refiner");
            b f10 = C5198F.f45434a.f(this.f45439a, refiner, this.f45440b);
            if (f10 == null) {
                return null;
            }
            M a10 = f10.a();
            if (a10 != null) {
                return a10;
            }
            a0 a0Var = this.f45441c;
            e0 b10 = f10.b();
            Intrinsics.d(b10);
            return C5198F.i(a0Var, b10, this.f45440b, this.f45442d, refiner);
        }
    }

    /* renamed from: yd.F$d */
    static final class d extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0 f45443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f45444b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f45445c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f45446d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ rd.h f45447e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e0 e0Var, List list, a0 a0Var, boolean z10, rd.h hVar) {
            super(1);
            this.f45443a = e0Var;
            this.f45444b = list;
            this.f45445c = a0Var;
            this.f45446d = z10;
            this.f45447e = hVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            b f10 = C5198F.f45434a.f(this.f45443a, kotlinTypeRefiner, this.f45444b);
            if (f10 == null) {
                return null;
            }
            M a10 = f10.a();
            if (a10 != null) {
                return a10;
            }
            a0 a0Var = this.f45445c;
            e0 b10 = f10.b();
            Intrinsics.d(b10);
            return C5198F.k(a0Var, b10, this.f45444b, this.f45446d, this.f45447e);
        }
    }

    private C5198F() {
    }

    public static final M b(Kc.e0 e0Var, List arguments) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return new V(X.a.f45475a, false).h(W.f45470e.a(null, e0Var, arguments), a0.f45478b.i());
    }

    private final rd.h c(e0 e0Var, List list, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        InterfaceC0936h d10 = e0Var.d();
        if (d10 instanceof Kc.f0) {
            return ((Kc.f0) d10).y().w();
        }
        if (d10 instanceof InterfaceC0933e) {
            if (gVar == null) {
                gVar = AbstractC3778c.o(AbstractC3778c.p(d10));
            }
            return list.isEmpty() ? Mc.u.b((InterfaceC0933e) d10, gVar) : Mc.u.a((InterfaceC0933e) d10, f0.f45524c.b(e0Var, list), gVar);
        }
        if (d10 instanceof Kc.e0) {
            kotlin.reflect.jvm.internal.impl.types.error.g gVar2 = kotlin.reflect.jvm.internal.impl.types.error.g.SCOPE_FOR_ABBREVIATION_TYPE;
            String fVar = ((Kc.e0) d10).getName().toString();
            Intrinsics.checkNotNullExpressionValue(fVar, "toString(...)");
            return kotlin.reflect.jvm.internal.impl.types.error.k.a(gVar2, true, fVar);
        }
        if (e0Var instanceof C5196D) {
            return ((C5196D) e0Var).g();
        }
        throw new IllegalStateException("Unsupported classifier: " + d10 + " for constructor: " + e0Var);
    }

    public static final t0 d(M lowerBound, M upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        return Intrinsics.b(lowerBound, upperBound) ? lowerBound : new C5223z(lowerBound, upperBound);
    }

    public static final M e(a0 attributes, C3687n constructor, boolean z10) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        return k(attributes, constructor, CollectionsKt.j(), z10, kotlin.reflect.jvm.internal.impl.types.error.k.a(kotlin.reflect.jvm.internal.impl.types.error.g.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b f(e0 e0Var, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, List list) {
        InterfaceC0936h f10;
        InterfaceC0936h d10 = e0Var.d();
        if (d10 == null || (f10 = gVar.f(d10)) == null) {
            return null;
        }
        if (f10 instanceof Kc.e0) {
            return new b(b((Kc.e0) f10, list), null);
        }
        e0 b10 = f10.r().b(gVar);
        Intrinsics.checkNotNullExpressionValue(b10, "refine(...)");
        return new b(null, b10);
    }

    public static final M g(a0 attributes, InterfaceC0933e descriptor, List arguments) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        e0 r10 = descriptor.r();
        Intrinsics.checkNotNullExpressionValue(r10, "getTypeConstructor(...)");
        return j(attributes, r10, arguments, false, null, 16, null);
    }

    public static final M h(a0 attributes, e0 constructor, List arguments, boolean z10) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return j(attributes, constructor, arguments, z10, null, 16, null);
    }

    public static final M i(a0 attributes, e0 constructor, List arguments, boolean z10, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z10 || constructor.d() == null) {
            return l(attributes, constructor, arguments, z10, f45434a.c(constructor, arguments, gVar), new c(constructor, arguments, attributes, z10));
        }
        InterfaceC0936h d10 = constructor.d();
        Intrinsics.d(d10);
        M y10 = d10.y();
        Intrinsics.checkNotNullExpressionValue(y10, "getDefaultType(...)");
        return y10;
    }

    public static /* synthetic */ M j(a0 a0Var, e0 e0Var, List list, boolean z10, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return i(a0Var, e0Var, list, z10, gVar);
    }

    public static final M k(a0 attributes, e0 constructor, List arguments, boolean z10, rd.h memberScope) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        N n10 = new N(constructor, arguments, z10, memberScope, new d(constructor, arguments, attributes, z10, memberScope));
        return attributes.isEmpty() ? n10 : new O(n10, attributes);
    }

    public static final M l(a0 attributes, e0 constructor, List arguments, boolean z10, rd.h memberScope, Function1 refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        N n10 = new N(constructor, arguments, z10, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? n10 : new O(n10, attributes);
    }
}
