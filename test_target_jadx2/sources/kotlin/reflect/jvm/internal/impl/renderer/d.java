package kotlin.reflect.jvm.internal.impl.renderer;

import Hc.j;
import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.C;
import Kc.D;
import Kc.EnumC0934f;
import Kc.G;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0937i;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0943o;
import Kc.InterfaceC0944p;
import Kc.InterfaceC0950w;
import Kc.InterfaceC0952y;
import Kc.J;
import Kc.K;
import Kc.P;
import Kc.S;
import Kc.T;
import Kc.U;
import Kc.V;
import Kc.W;
import Kc.X;
import Kc.e0;
import Kc.f0;
import Kc.g0;
import Kc.j0;
import Kc.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import md.AbstractC3680g;
import md.C3674a;
import md.C3675b;
import md.C3689p;
import od.AbstractC3778c;
import org.conscrypt.BuildConfig;
import yd.AbstractC5197E;
import yd.AbstractC5222y;
import yd.C5196D;
import yd.C5199a;
import yd.C5213o;
import yd.M;
import yd.Q;
import yd.i0;
import yd.q0;
import yd.t0;
import yd.u0;
import yd.v0;

/* loaded from: classes3.dex */
public final class d extends kotlin.reflect.jvm.internal.impl.renderer.c implements kotlin.reflect.jvm.internal.impl.renderer.f {

    /* renamed from: l, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.renderer.g f36601l;

    /* renamed from: m, reason: collision with root package name */
    private final Lazy f36602m;

    private final class a implements InterfaceC0943o {

        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0537a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f36604a;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[l.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f36604a = iArr;
            }
        }

        public a() {
        }

        private final void t(T t10, StringBuilder sb2, String str) {
            int i10 = C0537a.f36604a[d.this.k0().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                p(t10, sb2);
                return;
            }
            d.this.Q0(t10, sb2);
            sb2.append(str + " for ");
            d dVar = d.this;
            U J02 = t10.J0();
            Intrinsics.checkNotNullExpressionValue(J02, "getCorrespondingProperty(...)");
            dVar.z1(J02, sb2);
        }

        public void A(j0 descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            d.this.R1(descriptor, true, builder, true);
        }

        @Override // Kc.InterfaceC0943o
        public /* bridge */ /* synthetic */ Object a(InterfaceC0952y interfaceC0952y, Object obj) {
            p(interfaceC0952y, (StringBuilder) obj);
            return Unit.f36324a;
        }

        @Override // Kc.InterfaceC0943o
        public /* bridge */ /* synthetic */ Object b(f0 f0Var, Object obj) {
            z(f0Var, (StringBuilder) obj);
            return Unit.f36324a;
        }

        @Override // Kc.InterfaceC0943o
        public /* bridge */ /* synthetic */ Object c(P p10, Object obj) {
            s(p10, (StringBuilder) obj);
            return Unit.f36324a;
        }

        @Override // Kc.InterfaceC0943o
        public /* bridge */ /* synthetic */ Object d(e0 e0Var, Object obj) {
            y(e0Var, (StringBuilder) obj);
            return Unit.f36324a;
        }

        @Override // Kc.InterfaceC0943o
        public /* bridge */ /* synthetic */ Object e(j0 j0Var, Object obj) {
            A(j0Var, (StringBuilder) obj);
            return Unit.f36324a;
        }

        @Override // Kc.InterfaceC0943o
        public /* bridge */ /* synthetic */ Object f(W w10, Object obj) {
            w(w10, (StringBuilder) obj);
            return Unit.f36324a;
        }

        @Override // Kc.InterfaceC0943o
        public /* bridge */ /* synthetic */ Object g(X x10, Object obj) {
            x(x10, (StringBuilder) obj);
            return Unit.f36324a;
        }

        @Override // Kc.InterfaceC0943o
        public /* bridge */ /* synthetic */ Object h(InterfaceC0933e interfaceC0933e, Object obj) {
            n(interfaceC0933e, (StringBuilder) obj);
            return Unit.f36324a;
        }

        @Override // Kc.InterfaceC0943o
        public /* bridge */ /* synthetic */ Object i(V v10, Object obj) {
            v(v10, (StringBuilder) obj);
            return Unit.f36324a;
        }

        @Override // Kc.InterfaceC0943o
        public /* bridge */ /* synthetic */ Object j(K k10, Object obj) {
            r(k10, (StringBuilder) obj);
            return Unit.f36324a;
        }

        @Override // Kc.InterfaceC0943o
        public /* bridge */ /* synthetic */ Object k(G g10, Object obj) {
            q(g10, (StringBuilder) obj);
            return Unit.f36324a;
        }

        @Override // Kc.InterfaceC0943o
        public /* bridge */ /* synthetic */ Object l(U u10, Object obj) {
            u(u10, (StringBuilder) obj);
            return Unit.f36324a;
        }

        @Override // Kc.InterfaceC0943o
        public /* bridge */ /* synthetic */ Object m(InterfaceC0940l interfaceC0940l, Object obj) {
            o(interfaceC0940l, (StringBuilder) obj);
            return Unit.f36324a;
        }

        public void n(InterfaceC0933e descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            d.this.W0(descriptor, builder);
        }

        public void o(InterfaceC0940l constructorDescriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(constructorDescriptor, "constructorDescriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            d.this.b1(constructorDescriptor, builder);
        }

        public void p(InterfaceC0952y descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            d.this.h1(descriptor, builder);
        }

        public void q(G descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            d.this.r1(descriptor, builder, true);
        }

        public void r(K descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            d.this.v1(descriptor, builder);
        }

        public void s(P descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            d.this.x1(descriptor, builder);
        }

        public void u(U descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            d.this.z1(descriptor, builder);
        }

        public void v(V descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            t(descriptor, builder, "getter");
        }

        public void w(W descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            t(descriptor, builder, "setter");
        }

        public void x(X descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.append(descriptor.getName());
        }

        public void y(e0 descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            d.this.H1(descriptor, builder);
        }

        public void z(f0 descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            d.this.M1(descriptor, builder, true);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36605a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f36606b;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36605a = iArr;
            int[] iArr2 = new int[k.values().length];
            try {
                iArr2[k.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[k.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[k.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f36606b = iArr2;
        }
    }

    static final class c extends xc.m implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(i0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.c()) {
                return "*";
            }
            d dVar = d.this;
            AbstractC5197E type = it.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            String w10 = dVar.w(type);
            if (it.a() == u0.INVARIANT) {
                return w10;
            }
            return it.a() + ' ' + w10;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$d, reason: collision with other inner class name */
    static final class C0538d extends xc.m implements Function0 {

        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$d$a */
        static final class a extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f36609a = new a();

            a() {
                super(1);
            }

            public final void a(kotlin.reflect.jvm.internal.impl.renderer.f withOptions) {
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.a(O.k(withOptions.m(), CollectionsKt.m(j.a.f3897C, j.a.f3899D)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((kotlin.reflect.jvm.internal.impl.renderer.f) obj);
                return Unit.f36324a;
            }
        }

        C0538d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            kotlin.reflect.jvm.internal.impl.renderer.c y10 = d.this.y(a.f36609a);
            Intrinsics.e(y10, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
            return (d) y10;
        }
    }

    static final class e extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f36610a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j0 j0Var) {
            return BuildConfig.FLAVOR;
        }
    }

    static final class f extends xc.m implements Function1 {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(AbstractC5197E abstractC5197E) {
            d dVar = d.this;
            Intrinsics.d(abstractC5197E);
            return dVar.w(abstractC5197E);
        }
    }

    static final class g extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f36612a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC5197E it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    public d(kotlin.reflect.jvm.internal.impl.renderer.g options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f36601l = options;
        options.l0();
        this.f36602m = lc.i.a(new C0538d());
    }

    private final void A1(U u10, StringBuilder sb2) {
        if (d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.ANNOTATIONS)) {
            U0(this, sb2, u10, null, 2, null);
            InterfaceC0950w w02 = u10.w0();
            if (w02 != null) {
                T0(sb2, w02, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.FIELD);
            }
            InterfaceC0950w t02 = u10.t0();
            if (t02 != null) {
                T0(sb2, t02, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_DELEGATE_FIELD);
            }
            if (k0() == l.NONE) {
                V d10 = u10.d();
                if (d10 != null) {
                    T0(sb2, d10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_GETTER);
                }
                W l10 = u10.l();
                if (l10 != null) {
                    T0(sb2, l10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_SETTER);
                    List m10 = l10.m();
                    Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
                    j0 j0Var = (j0) CollectionsKt.A0(m10);
                    Intrinsics.d(j0Var);
                    T0(sb2, j0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void B1(InterfaceC0929a interfaceC0929a, StringBuilder sb2) {
        X s02 = interfaceC0929a.s0();
        if (s02 != null) {
            T0(sb2, s02, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.RECEIVER);
            AbstractC5197E type = s02.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(f1(type));
            sb2.append(".");
        }
    }

    private final void C1(InterfaceC0929a interfaceC0929a, StringBuilder sb2) {
        X s02;
        if (l0() && (s02 = interfaceC0929a.s0()) != null) {
            sb2.append(" on ");
            AbstractC5197E type = s02.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(w(type));
        }
    }

    private final void D1(StringBuilder sb2, M m10) {
        if (Intrinsics.b(m10, q0.f45560b) || q0.k(m10)) {
            sb2.append("???");
            return;
        }
        if (kotlin.reflect.jvm.internal.impl.types.error.k.o(m10)) {
            if (!A0()) {
                sb2.append("???");
                return;
            }
            yd.e0 W02 = m10.W0();
            Intrinsics.e(W02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(e1(((kotlin.reflect.jvm.internal.impl.types.error.i) W02).h(0)));
            return;
        }
        if (yd.G.a(m10)) {
            d1(sb2, m10);
        } else if (W1(m10)) {
            i1(sb2, m10);
        } else {
            d1(sb2, m10);
        }
    }

    private final void E1(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    private final void F1(InterfaceC0933e interfaceC0933e, StringBuilder sb2) {
        if (H0() || Hc.g.n0(interfaceC0933e.y())) {
            return;
        }
        Collection a10 = interfaceC0933e.r().a();
        Intrinsics.checkNotNullExpressionValue(a10, "getSupertypes(...)");
        if (a10.isEmpty()) {
            return;
        }
        if (a10.size() == 1 && Hc.g.b0((AbstractC5197E) a10.iterator().next())) {
            return;
        }
        E1(sb2);
        sb2.append(": ");
        CollectionsKt.j0(a10, sb2, ", ", null, null, 0, null, new f(), 60, null);
    }

    private final void G1(InterfaceC0952y interfaceC0952y, StringBuilder sb2) {
        q1(sb2, interfaceC0952y.z(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(e0 e0Var, StringBuilder sb2) {
        U0(this, sb2, e0Var, null, 2, null);
        AbstractC0948u h10 = e0Var.h();
        Intrinsics.checkNotNullExpressionValue(h10, "getVisibility(...)");
        U1(h10, sb2);
        m1(e0Var, sb2);
        sb2.append(k1("typealias"));
        sb2.append(" ");
        r1(e0Var, sb2, true);
        List B10 = e0Var.B();
        Intrinsics.checkNotNullExpressionValue(B10, "getDeclaredTypeParameters(...)");
        O1(B10, sb2, false);
        V0(e0Var, sb2);
        sb2.append(" = ");
        sb2.append(w(e0Var.m0()));
    }

    private final String J0() {
        return N(">");
    }

    private final void K(StringBuilder sb2, InterfaceC0941m interfaceC0941m) {
        InterfaceC0941m b10;
        String name;
        if ((interfaceC0941m instanceof K) || (interfaceC0941m instanceof P) || (b10 = interfaceC0941m.b()) == null || (b10 instanceof G)) {
            return;
        }
        sb2.append(" ");
        sb2.append(n1("defined in"));
        sb2.append(" ");
        id.d m10 = kd.f.m(b10);
        Intrinsics.checkNotNullExpressionValue(m10, "getFqName(...)");
        sb2.append(m10.e() ? "root package" : u(m10));
        if (F0() && (b10 instanceof K) && (interfaceC0941m instanceof InterfaceC0944p) && (name = ((InterfaceC0944p) interfaceC0941m).j().a().getName()) != null) {
            sb2.append(" ");
            sb2.append(n1("in file"));
            sb2.append(" ");
            sb2.append(name);
        }
    }

    private final boolean K0(AbstractC5197E abstractC5197E) {
        return Hc.f.r(abstractC5197E) || !abstractC5197E.i().isEmpty();
    }

    private final void K1(StringBuilder sb2, AbstractC5197E abstractC5197E, yd.e0 e0Var) {
        S a10 = g0.a(abstractC5197E);
        if (a10 != null) {
            y1(sb2, a10);
        } else {
            sb2.append(J1(e0Var));
            sb2.append(I1(abstractC5197E.U0()));
        }
    }

    private final void L(StringBuilder sb2, List list) {
        CollectionsKt.j0(list, sb2, ", ", null, null, 0, null, new c(), 60, null);
    }

    private final D L0(C c10) {
        if (c10 instanceof InterfaceC0933e) {
            return ((InterfaceC0933e) c10).o() == EnumC0934f.INTERFACE ? D.ABSTRACT : D.FINAL;
        }
        InterfaceC0941m b10 = c10.b();
        InterfaceC0933e interfaceC0933e = b10 instanceof InterfaceC0933e ? (InterfaceC0933e) b10 : null;
        if (interfaceC0933e == null) {
            return D.FINAL;
        }
        if (!(c10 instanceof InterfaceC0930b)) {
            return D.FINAL;
        }
        InterfaceC0930b interfaceC0930b = (InterfaceC0930b) c10;
        Collection f10 = interfaceC0930b.f();
        Intrinsics.checkNotNullExpressionValue(f10, "getOverriddenDescriptors(...)");
        if (!f10.isEmpty() && interfaceC0933e.s() != D.FINAL) {
            return D.OPEN;
        }
        if (interfaceC0933e.o() != EnumC0934f.INTERFACE || Intrinsics.b(interfaceC0930b.h(), AbstractC0947t.f5585a)) {
            return D.FINAL;
        }
        D s10 = interfaceC0930b.s();
        D d10 = D.ABSTRACT;
        return s10 == d10 ? d10 : D.OPEN;
    }

    static /* synthetic */ void L1(d dVar, StringBuilder sb2, AbstractC5197E abstractC5197E, yd.e0 e0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e0Var = abstractC5197E.W0();
        }
        dVar.K1(sb2, abstractC5197E, e0Var);
    }

    private final String M() {
        int i10 = b.f36605a[y0().ordinal()];
        if (i10 == 1) {
            return N("->");
        }
        if (i10 == 2) {
            return "&rarr;";
        }
        throw new lc.m();
    }

    private final boolean M0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        return Intrinsics.b(cVar.e(), j.a.f3901E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(f0 f0Var, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(N0());
        }
        if (D0()) {
            sb2.append("/*");
            sb2.append(f0Var.getIndex());
            sb2.append("*/ ");
        }
        q1(sb2, f0Var.L(), "reified");
        String label = f0Var.u().getLabel();
        boolean z11 = true;
        q1(sb2, label.length() > 0, label);
        U0(this, sb2, f0Var, null, 2, null);
        r1(f0Var, sb2, z10);
        int size = f0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            AbstractC5197E abstractC5197E = (AbstractC5197E) f0Var.getUpperBounds().iterator().next();
            if (!Hc.g.j0(abstractC5197E)) {
                sb2.append(" : ");
                Intrinsics.d(abstractC5197E);
                sb2.append(w(abstractC5197E));
            }
        } else if (z10) {
            for (AbstractC5197E abstractC5197E2 : f0Var.getUpperBounds()) {
                if (!Hc.g.j0(abstractC5197E2)) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    Intrinsics.d(abstractC5197E2);
                    sb2.append(w(abstractC5197E2));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(J0());
        }
    }

    private final String N(String str) {
        return y0().escape(str);
    }

    private final String N0() {
        return N("<");
    }

    private final void N1(StringBuilder sb2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            M1((f0) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final boolean O0(InterfaceC0930b interfaceC0930b) {
        return !interfaceC0930b.f().isEmpty();
    }

    private final void O1(List list, StringBuilder sb2, boolean z10) {
        if (I0() || list.isEmpty()) {
            return;
        }
        sb2.append(N0());
        N1(sb2, list);
        sb2.append(J0());
        if (z10) {
            sb2.append(" ");
        }
    }

    private final void P0(StringBuilder sb2, C5199a c5199a) {
        m y02 = y0();
        m mVar = m.HTML;
        if (y02 == mVar) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* = ");
        t1(sb2, c5199a.b0());
        sb2.append(" */");
        if (y0() == mVar) {
            sb2.append("</i></font>");
        }
    }

    private final void P1(k0 k0Var, StringBuilder sb2, boolean z10) {
        if (z10 || !(k0Var instanceof j0)) {
            sb2.append(k1(k0Var.q0() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(T t10, StringBuilder sb2) {
        m1(t10, sb2);
    }

    static /* synthetic */ void Q1(d dVar, k0 k0Var, StringBuilder sb2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        dVar.P1(k0Var, sb2, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (P() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (P() != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void R0(InterfaceC0952y interfaceC0952y, StringBuilder sb2) {
        boolean z10;
        boolean z11 = false;
        if (interfaceC0952y.V()) {
            Collection f10 = interfaceC0952y.f();
            Intrinsics.checkNotNullExpressionValue(f10, "getOverriddenDescriptors(...)");
            Collection collection = f10;
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((InterfaceC0952y) it.next()).V()) {
                    }
                }
            }
            z10 = true;
            if (interfaceC0952y.Q0()) {
                Collection f11 = interfaceC0952y.f();
                Intrinsics.checkNotNullExpressionValue(f11, "getOverriddenDescriptors(...)");
                Collection collection2 = f11;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (((InterfaceC0952y) it2.next()).Q0()) {
                        }
                    }
                }
                z11 = true;
            }
            q1(sb2, interfaceC0952y.U(), "tailrec");
            G1(interfaceC0952y, sb2);
            q1(sb2, interfaceC0952y.p(), "inline");
            q1(sb2, z11, "infix");
            q1(sb2, z10, "operator");
        }
        z10 = false;
        if (interfaceC0952y.Q0()) {
        }
        q1(sb2, interfaceC0952y.U(), "tailrec");
        G1(interfaceC0952y, sb2);
        q1(sb2, interfaceC0952y.p(), "inline");
        q1(sb2, z11, "infix");
        q1(sb2, z10, "operator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1(j0 j0Var, boolean z10, StringBuilder sb2, boolean z11) {
        boolean z12;
        if (z11) {
            sb2.append(k1("value-parameter"));
            sb2.append(" ");
        }
        if (D0()) {
            sb2.append("/*");
            sb2.append(j0Var.getIndex());
            sb2.append("*/ ");
        }
        U0(this, sb2, j0Var, null, 2, null);
        q1(sb2, j0Var.h0(), "crossinline");
        q1(sb2, j0Var.d0(), "noinline");
        boolean z13 = false;
        if (s0()) {
            InterfaceC0929a b10 = j0Var.b();
            InterfaceC0932d interfaceC0932d = b10 instanceof InterfaceC0932d ? (InterfaceC0932d) b10 : null;
            if (interfaceC0932d != null && interfaceC0932d.H()) {
                z12 = true;
                if (z12) {
                    q1(sb2, O(), "actual");
                }
                T1(j0Var, z10, sb2, z11, z12);
                if (U() != null) {
                    if (n() ? j0Var.B0() : AbstractC3778c.c(j0Var)) {
                        z13 = true;
                    }
                }
                if (z13) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" = ");
                Function1 U10 = U();
                Intrinsics.d(U10);
                sb3.append((String) U10.invoke(j0Var));
                sb2.append(sb3.toString());
                return;
            }
        }
        z12 = false;
        if (z12) {
        }
        T1(j0Var, z10, sb2, z11, z12);
        if (U() != null) {
        }
        if (z13) {
        }
    }

    private final List S0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        InterfaceC0932d W10;
        List m10;
        Map a10 = cVar.a();
        List list = null;
        InterfaceC0933e i10 = p0() ? AbstractC3778c.i(cVar) : null;
        if (i10 != null && (W10 = i10.W()) != null && (m10 = W10.m()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : m10) {
                if (((j0) obj).B0()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((j0) it.next()).getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = CollectionsKt.j();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            id.f fVar = (id.f) obj2;
            Intrinsics.d(fVar);
            if (!a10.containsKey(fVar)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.u(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((id.f) it2.next()).c() + " = ...");
        }
        Set<Map.Entry> entrySet = a10.entrySet();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.u(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            id.f fVar2 = (id.f) entry.getKey();
            AbstractC3680g abstractC3680g = (AbstractC3680g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar2.c());
            sb2.append(" = ");
            sb2.append(!list.contains(fVar2) ? a1(abstractC3680g) : "...");
            arrayList5.add(sb2.toString());
        }
        return CollectionsKt.E0(CollectionsKt.w0(arrayList4, arrayList5));
    }

    private final void S1(Collection collection, boolean z10, StringBuilder sb2) {
        boolean X12 = X1(z10);
        int size = collection.size();
        C0().c(size, sb2);
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            C0().b(j0Var, i10, size, sb2);
            R1(j0Var, X12, sb2, false);
            C0().a(j0Var, i10, size, sb2);
            i10++;
        }
        C0().d(size, sb2);
    }

    private final void T0(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        if (d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.ANNOTATIONS)) {
            Set m10 = aVar instanceof AbstractC5197E ? m() : W();
            Function1 Q10 = Q();
            for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : aVar.i()) {
                if (!CollectionsKt.V(m10, cVar.e()) && !M0(cVar) && (Q10 == null || ((Boolean) Q10.invoke(cVar)).booleanValue())) {
                    sb2.append(r(cVar, eVar));
                    if (V()) {
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    private final void T1(k0 k0Var, boolean z10, StringBuilder sb2, boolean z11, boolean z12) {
        AbstractC5197E type = k0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        j0 j0Var = k0Var instanceof j0 ? (j0) k0Var : null;
        AbstractC5197E r02 = j0Var != null ? j0Var.r0() : null;
        AbstractC5197E abstractC5197E = r02 == null ? type : r02;
        q1(sb2, r02 != null, "vararg");
        if (z12 || (z11 && !x0())) {
            P1(k0Var, sb2, z12);
        }
        if (z10) {
            r1(k0Var, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(w(abstractC5197E));
        j1(k0Var, sb2);
        if (!D0() || r02 == null) {
            return;
        }
        sb2.append(" /*");
        sb2.append(w(type));
        sb2.append("*/");
    }

    static /* synthetic */ void U0(d dVar, StringBuilder sb2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        dVar.T0(sb2, aVar, eVar);
    }

    private final boolean U1(AbstractC0948u abstractC0948u, StringBuilder sb2) {
        if (!d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.VISIBILITY)) {
            return false;
        }
        if (e0()) {
            abstractC0948u = abstractC0948u.f();
        }
        if (!r0() && Intrinsics.b(abstractC0948u, AbstractC0947t.f5596l)) {
            return false;
        }
        sb2.append(k1(abstractC0948u.c()));
        sb2.append(" ");
        return true;
    }

    private final void V0(InterfaceC0937i interfaceC0937i, StringBuilder sb2) {
        List B10 = interfaceC0937i.B();
        Intrinsics.checkNotNullExpressionValue(B10, "getDeclaredTypeParameters(...)");
        List c10 = interfaceC0937i.r().c();
        Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
        if (D0() && interfaceC0937i.S() && c10.size() > B10.size()) {
            sb2.append(" /*captured type parameters: ");
            N1(sb2, c10.subList(B10.size(), c10.size()));
            sb2.append("*/");
        }
    }

    private final void V1(List list, StringBuilder sb2) {
        if (I0()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            List upperBounds = f0Var.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            for (AbstractC5197E abstractC5197E : CollectionsKt.X(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                id.f name = f0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                sb3.append(v(name, false));
                sb3.append(" : ");
                Intrinsics.d(abstractC5197E);
                sb3.append(w(abstractC5197E));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(k1("where"));
        sb2.append(" ");
        CollectionsKt.j0(arrayList, sb2, ", ", null, null, 0, null, null, 124, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0(InterfaceC0933e interfaceC0933e, StringBuilder sb2) {
        InterfaceC0932d W10;
        boolean z10 = interfaceC0933e.o() == EnumC0934f.ENUM_ENTRY;
        if (!x0()) {
            U0(this, sb2, interfaceC0933e, null, 2, null);
            List P02 = interfaceC0933e.P0();
            Intrinsics.checkNotNullExpressionValue(P02, "getContextReceivers(...)");
            c1(P02, sb2);
            if (!z10) {
                AbstractC0948u h10 = interfaceC0933e.h();
                Intrinsics.checkNotNullExpressionValue(h10, "getVisibility(...)");
                U1(h10, sb2);
            }
            if ((interfaceC0933e.o() != EnumC0934f.INTERFACE || interfaceC0933e.s() != D.ABSTRACT) && (!interfaceC0933e.o().isSingleton() || interfaceC0933e.s() != D.FINAL)) {
                D s10 = interfaceC0933e.s();
                Intrinsics.checkNotNullExpressionValue(s10, "getModality(...)");
                o1(s10, sb2, L0(interfaceC0933e));
            }
            m1(interfaceC0933e, sb2);
            q1(sb2, d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.INNER) && interfaceC0933e.S(), "inner");
            q1(sb2, d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.DATA) && interfaceC0933e.R0(), "data");
            q1(sb2, d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.INLINE) && interfaceC0933e.p(), "inline");
            q1(sb2, d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.VALUE) && interfaceC0933e.Q(), "value");
            q1(sb2, d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.FUN) && interfaceC0933e.J(), "fun");
            X0(interfaceC0933e, sb2);
        }
        if (kd.f.x(interfaceC0933e)) {
            Z0(interfaceC0933e, sb2);
        } else {
            if (!x0()) {
                E1(sb2);
            }
            r1(interfaceC0933e, sb2, true);
        }
        if (z10) {
            return;
        }
        List B10 = interfaceC0933e.B();
        Intrinsics.checkNotNullExpressionValue(B10, "getDeclaredTypeParameters(...)");
        O1(B10, sb2, false);
        V0(interfaceC0933e, sb2);
        if (!interfaceC0933e.o().isSingleton() && S() && (W10 = interfaceC0933e.W()) != null) {
            sb2.append(" ");
            U0(this, sb2, W10, null, 2, null);
            AbstractC0948u h11 = W10.h();
            Intrinsics.checkNotNullExpressionValue(h11, "getVisibility(...)");
            U1(h11, sb2);
            sb2.append(k1("constructor"));
            List m10 = W10.m();
            Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
            S1(m10, W10.M(), sb2);
        }
        F1(interfaceC0933e, sb2);
        V1(B10, sb2);
    }

    private final boolean W1(AbstractC5197E abstractC5197E) {
        if (Hc.f.p(abstractC5197E)) {
            List U02 = abstractC5197E.U0();
            if (!(U02 instanceof Collection) || !U02.isEmpty()) {
                Iterator it = U02.iterator();
                while (it.hasNext()) {
                    if (((i0) it.next()).c()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final d X() {
        return (d) this.f36602m.getValue();
    }

    private final void X0(InterfaceC0933e interfaceC0933e, StringBuilder sb2) {
        sb2.append(k1(kotlin.reflect.jvm.internal.impl.renderer.c.f36578a.a(interfaceC0933e)));
    }

    private final boolean X1(boolean z10) {
        int i10 = b.f36606b[h0().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new lc.m();
            }
        } else if (!z10) {
            return true;
        }
        return false;
    }

    private final void Z0(InterfaceC0941m interfaceC0941m, StringBuilder sb2) {
        if (m0()) {
            if (x0()) {
                sb2.append("companion object");
            }
            E1(sb2);
            InterfaceC0941m b10 = interfaceC0941m.b();
            if (b10 != null) {
                sb2.append("of ");
                id.f name = b10.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                sb2.append(v(name, false));
            }
        }
        if (D0() || !Intrinsics.b(interfaceC0941m.getName(), id.h.f34197d)) {
            if (!x0()) {
                E1(sb2);
            }
            id.f name2 = interfaceC0941m.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            sb2.append(v(name2, true));
        }
    }

    private final String a1(AbstractC3680g abstractC3680g) {
        Function1 M10 = this.f36601l.M();
        if (M10 != null) {
            return (String) M10.invoke(abstractC3680g);
        }
        if (abstractC3680g instanceof C3675b) {
            Iterable iterable = (Iterable) ((C3675b) abstractC3680g).b();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String a12 = a1((AbstractC3680g) it.next());
                if (a12 != null) {
                    arrayList.add(a12);
                }
            }
            return CollectionsKt.l0(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (abstractC3680g instanceof C3674a) {
            return StringsKt.o0(kotlin.reflect.jvm.internal.impl.renderer.c.s(this, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) ((C3674a) abstractC3680g).b(), null, 2, null), "@");
        }
        if (!(abstractC3680g instanceof C3689p)) {
            return abstractC3680g.toString();
        }
        C3689p.b bVar = (C3689p.b) ((C3689p) abstractC3680g).b();
        if (bVar instanceof C3689p.b.a) {
            return ((C3689p.b.a) bVar).a() + "::class";
        }
        if (!(bVar instanceof C3689p.b.C0566b)) {
            throw new lc.m();
        }
        C3689p.b.C0566b c0566b = (C3689p.b.C0566b) bVar;
        String b10 = c0566b.b().b().b();
        Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
        for (int i10 = 0; i10 < c0566b.a(); i10++) {
            b10 = "kotlin.Array<" + b10 + '>';
        }
        return b10 + "::class";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(InterfaceC0940l interfaceC0940l, StringBuilder sb2) {
        boolean z10;
        boolean z11;
        InterfaceC0932d W10;
        ArrayList arrayList;
        U0(this, sb2, interfaceC0940l, null, 2, null);
        if (this.f36601l.T() || interfaceC0940l.I().s() != D.SEALED) {
            AbstractC0948u h10 = interfaceC0940l.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getVisibility(...)");
            if (U1(h10, sb2)) {
                z10 = true;
                l1(interfaceC0940l, sb2);
                z11 = (o0() && interfaceC0940l.H() && !z10) ? false : true;
                if (z11) {
                    sb2.append(k1("constructor"));
                }
                InterfaceC0937i b10 = interfaceC0940l.b();
                Intrinsics.checkNotNullExpressionValue(b10, "getContainingDeclaration(...)");
                if (v0()) {
                    if (z11) {
                        sb2.append(" ");
                    }
                    r1(b10, sb2, true);
                    List n10 = interfaceC0940l.n();
                    Intrinsics.checkNotNullExpressionValue(n10, "getTypeParameters(...)");
                    O1(n10, sb2, false);
                }
                List m10 = interfaceC0940l.m();
                Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
                S1(m10, interfaceC0940l.M(), sb2);
                if (n0() && !interfaceC0940l.H() && (b10 instanceof InterfaceC0933e) && (W10 = ((InterfaceC0933e) b10).W()) != null) {
                    List m11 = W10.m();
                    Intrinsics.checkNotNullExpressionValue(m11, "getValueParameters(...)");
                    arrayList = new ArrayList();
                    for (Object obj : m11) {
                        j0 j0Var = (j0) obj;
                        if (!j0Var.B0() && j0Var.r0() == null) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sb2.append(" : ");
                        sb2.append(k1("this"));
                        sb2.append(CollectionsKt.l0(arrayList, ", ", "(", ")", 0, null, e.f36610a, 24, null));
                    }
                }
                if (v0()) {
                    return;
                }
                List n11 = interfaceC0940l.n();
                Intrinsics.checkNotNullExpressionValue(n11, "getTypeParameters(...)");
                V1(n11, sb2);
                return;
            }
        }
        z10 = false;
        l1(interfaceC0940l, sb2);
        if (o0()) {
        }
        if (z11) {
        }
        InterfaceC0937i b102 = interfaceC0940l.b();
        Intrinsics.checkNotNullExpressionValue(b102, "getContainingDeclaration(...)");
        if (v0()) {
        }
        List m102 = interfaceC0940l.m();
        Intrinsics.checkNotNullExpressionValue(m102, "getValueParameters(...)");
        S1(m102, interfaceC0940l.M(), sb2);
        if (n0()) {
            List m112 = W10.m();
            Intrinsics.checkNotNullExpressionValue(m112, "getValueParameters(...)");
            arrayList = new ArrayList();
            while (r0.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
            }
        }
        if (v0()) {
        }
    }

    private final void c1(List list, StringBuilder sb2) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            X x10 = (X) it.next();
            T0(sb2, x10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.RECEIVER);
            AbstractC5197E type = x10.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(f1(type));
            if (i10 == CollectionsKt.l(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i10 = i11;
        }
    }

    private final void d1(StringBuilder sb2, AbstractC5197E abstractC5197E) {
        U0(this, sb2, abstractC5197E, null, 2, null);
        C5213o c5213o = abstractC5197E instanceof C5213o ? (C5213o) abstractC5197E : null;
        if (c5213o != null) {
            c5213o.i1();
        }
        if (!yd.G.a(abstractC5197E)) {
            L1(this, sb2, abstractC5197E, null, 2, null);
        } else if (Bd.a.u(abstractC5197E) && j0()) {
            sb2.append(e1(kotlin.reflect.jvm.internal.impl.types.error.k.f36726a.p(abstractC5197E)));
        } else {
            if (!(abstractC5197E instanceof kotlin.reflect.jvm.internal.impl.types.error.h) || c0()) {
                sb2.append(abstractC5197E.W0().toString());
            } else {
                sb2.append(((kotlin.reflect.jvm.internal.impl.types.error.h) abstractC5197E).f1());
            }
            sb2.append(I1(abstractC5197E.U0()));
        }
        if (abstractC5197E.X0()) {
            sb2.append("?");
        }
        if (Q.c(abstractC5197E)) {
            sb2.append(" & Any");
        }
    }

    private final String e1(String str) {
        int i10 = b.f36605a[y0().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new lc.m();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    private final String f1(AbstractC5197E abstractC5197E) {
        String w10 = w(abstractC5197E);
        if ((!W1(abstractC5197E) || q0.l(abstractC5197E)) && !(abstractC5197E instanceof C5213o)) {
            return w10;
        }
        return '(' + w10 + ')';
    }

    private final String g1(List list) {
        return N(n.c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h1(InterfaceC0952y interfaceC0952y, StringBuilder sb2) {
        if (!x0()) {
            if (!w0()) {
                U0(this, sb2, interfaceC0952y, null, 2, null);
                List x02 = interfaceC0952y.x0();
                Intrinsics.checkNotNullExpressionValue(x02, "getContextReceiverParameters(...)");
                c1(x02, sb2);
                AbstractC0948u h10 = interfaceC0952y.h();
                Intrinsics.checkNotNullExpressionValue(h10, "getVisibility(...)");
                U1(h10, sb2);
                p1(interfaceC0952y, sb2);
                if (Y()) {
                    m1(interfaceC0952y, sb2);
                }
                u1(interfaceC0952y, sb2);
                if (Y()) {
                    R0(interfaceC0952y, sb2);
                } else {
                    G1(interfaceC0952y, sb2);
                }
                l1(interfaceC0952y, sb2);
                if (D0()) {
                    if (interfaceC0952y.D0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC0952y.K0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(k1("fun"));
            sb2.append(" ");
            List n10 = interfaceC0952y.n();
            Intrinsics.checkNotNullExpressionValue(n10, "getTypeParameters(...)");
            O1(n10, sb2, true);
            B1(interfaceC0952y, sb2);
        }
        r1(interfaceC0952y, sb2, true);
        List m10 = interfaceC0952y.m();
        Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
        S1(m10, interfaceC0952y.M(), sb2);
        C1(interfaceC0952y, sb2);
        AbstractC5197E g10 = interfaceC0952y.g();
        if (!G0() && (B0() || g10 == null || !Hc.g.C0(g10))) {
            sb2.append(": ");
            sb2.append(g10 == null ? "[NULL]" : w(g10));
        }
        List n11 = interfaceC0952y.n();
        Intrinsics.checkNotNullExpressionValue(n11, "getTypeParameters(...)");
        V1(n11, sb2);
    }

    private final void i1(StringBuilder sb2, AbstractC5197E abstractC5197E) {
        id.f fVar;
        int length = sb2.length();
        U0(X(), sb2, abstractC5197E, null, 2, null);
        boolean z10 = sb2.length() != length;
        AbstractC5197E k10 = Hc.f.k(abstractC5197E);
        List e10 = Hc.f.e(abstractC5197E);
        if (!e10.isEmpty()) {
            sb2.append("context(");
            Iterator it = e10.subList(0, CollectionsKt.l(e10)).iterator();
            while (it.hasNext()) {
                s1(sb2, (AbstractC5197E) it.next());
                sb2.append(", ");
            }
            s1(sb2, (AbstractC5197E) CollectionsKt.n0(e10));
            sb2.append(") ");
        }
        boolean r10 = Hc.f.r(abstractC5197E);
        boolean X02 = abstractC5197E.X0();
        boolean z11 = X02 || (z10 && k10 != null);
        if (z11) {
            if (r10) {
                sb2.insert(length, '(');
            } else {
                if (z10) {
                    CharsKt.b(StringsKt.V0(sb2));
                    if (sb2.charAt(StringsKt.R(sb2) - 1) != ')') {
                        sb2.insert(StringsKt.R(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        q1(sb2, r10, "suspend");
        if (k10 != null) {
            boolean z12 = (W1(k10) && !k10.X0()) || K0(k10) || (k10 instanceof C5213o);
            if (z12) {
                sb2.append("(");
            }
            s1(sb2, k10);
            if (z12) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!Hc.f.n(abstractC5197E) || abstractC5197E.U0().size() > 1) {
            int i10 = 0;
            for (i0 i0Var : Hc.f.m(abstractC5197E)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (i0()) {
                    AbstractC5197E type = i0Var.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    fVar = Hc.f.d(type);
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    sb2.append(v(fVar, false));
                    sb2.append(": ");
                }
                sb2.append(x(i0Var));
                i10 = i11;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(M());
        sb2.append(" ");
        s1(sb2, Hc.f.l(abstractC5197E));
        if (z11) {
            sb2.append(")");
        }
        if (X02) {
            sb2.append("?");
        }
    }

    private final void j1(k0 k0Var, StringBuilder sb2) {
        AbstractC3680g c02;
        String a12;
        if (!b0() || (c02 = k0Var.c0()) == null || (a12 = a1(c02)) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(N(a12));
    }

    private final String k1(String str) {
        int i10 = b.f36605a[y0().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new lc.m();
        }
        if (R()) {
            return str;
        }
        return "<b>" + str + "</b>";
    }

    private final void l1(InterfaceC0930b interfaceC0930b, StringBuilder sb2) {
        if (d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.MEMBER_KIND) && D0() && interfaceC0930b.o() != InterfaceC0930b.a.DECLARATION) {
            sb2.append("/*");
            sb2.append(Ed.a.f(interfaceC0930b.o().name()));
            sb2.append("*/ ");
        }
    }

    private final void m1(C c10, StringBuilder sb2) {
        q1(sb2, c10.q(), "external");
        boolean z10 = false;
        q1(sb2, d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.EXPECT) && c10.R(), "expect");
        if (d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.ACTUAL) && c10.M0()) {
            z10 = true;
        }
        q1(sb2, z10, "actual");
    }

    private final void o1(D d10, StringBuilder sb2, D d11) {
        if (q0() || d10 != d11) {
            q1(sb2, d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.MODALITY), Ed.a.f(d10.name()));
        }
    }

    private final void p1(InterfaceC0930b interfaceC0930b, StringBuilder sb2) {
        if (kd.f.J(interfaceC0930b) && interfaceC0930b.s() == D.FINAL) {
            return;
        }
        if (g0() == j.RENDER_OVERRIDE && interfaceC0930b.s() == D.OPEN && O0(interfaceC0930b)) {
            return;
        }
        D s10 = interfaceC0930b.s();
        Intrinsics.checkNotNullExpressionValue(s10, "getModality(...)");
        o1(s10, sb2, L0(interfaceC0930b));
    }

    private final void q1(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(k1(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1(InterfaceC0941m interfaceC0941m, StringBuilder sb2, boolean z10) {
        id.f name = interfaceC0941m.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(v(name, z10));
    }

    private final void s1(StringBuilder sb2, AbstractC5197E abstractC5197E) {
        t0 Z02 = abstractC5197E.Z0();
        C5199a c5199a = Z02 instanceof C5199a ? (C5199a) Z02 : null;
        if (c5199a == null) {
            t1(sb2, abstractC5197E);
            return;
        }
        if (t0()) {
            t1(sb2, c5199a.b0());
            return;
        }
        t1(sb2, c5199a.i1());
        if (u0()) {
            P0(sb2, c5199a);
        }
    }

    private final void t1(StringBuilder sb2, AbstractC5197E abstractC5197E) {
        if ((abstractC5197E instanceof v0) && n() && !((v0) abstractC5197E).b1()) {
            sb2.append("<Not computed yet>");
            return;
        }
        t0 Z02 = abstractC5197E.Z0();
        if (Z02 instanceof AbstractC5222y) {
            sb2.append(((AbstractC5222y) Z02).g1(this, this));
        } else if (Z02 instanceof M) {
            D1(sb2, (M) Z02);
        }
    }

    private final void u1(InterfaceC0930b interfaceC0930b, StringBuilder sb2) {
        if (d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.OVERRIDE) && O0(interfaceC0930b) && g0() != j.RENDER_OPEN) {
            q1(sb2, true, "override");
            if (D0()) {
                sb2.append("/*");
                sb2.append(interfaceC0930b.f().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1(K k10, StringBuilder sb2) {
        w1(k10.e(), "package-fragment", sb2);
        if (n()) {
            sb2.append(" in ");
            r1(k10.b(), sb2, false);
        }
    }

    private final void w1(id.c cVar, String str, StringBuilder sb2) {
        sb2.append(k1(str));
        id.d j10 = cVar.j();
        Intrinsics.checkNotNullExpressionValue(j10, "toUnsafe(...)");
        String u10 = u(j10);
        if (u10.length() > 0) {
            sb2.append(" ");
            sb2.append(u10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(P p10, StringBuilder sb2) {
        w1(p10.e(), "package", sb2);
        if (n()) {
            sb2.append(" in context of ");
            r1(p10.C0(), sb2, false);
        }
    }

    private final void y1(StringBuilder sb2, S s10) {
        S c10 = s10.c();
        if (c10 != null) {
            y1(sb2, c10);
            sb2.append('.');
            id.f name = s10.b().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb2.append(v(name, false));
        } else {
            yd.e0 r10 = s10.b().r();
            Intrinsics.checkNotNullExpressionValue(r10, "getTypeConstructor(...)");
            sb2.append(J1(r10));
        }
        sb2.append(I1(s10.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1(U u10, StringBuilder sb2) {
        if (!x0()) {
            if (!w0()) {
                A1(u10, sb2);
                List x02 = u10.x0();
                Intrinsics.checkNotNullExpressionValue(x02, "getContextReceiverParameters(...)");
                c1(x02, sb2);
                AbstractC0948u h10 = u10.h();
                Intrinsics.checkNotNullExpressionValue(h10, "getVisibility(...)");
                U1(h10, sb2);
                boolean z10 = false;
                q1(sb2, d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.CONST) && u10.G(), "const");
                m1(u10, sb2);
                p1(u10, sb2);
                u1(u10, sb2);
                if (d0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.LATEINIT) && u10.y0()) {
                    z10 = true;
                }
                q1(sb2, z10, "lateinit");
                l1(u10, sb2);
            }
            Q1(this, u10, sb2, false, 4, null);
            List n10 = u10.n();
            Intrinsics.checkNotNullExpressionValue(n10, "getTypeParameters(...)");
            O1(n10, sb2, true);
            B1(u10, sb2);
        }
        r1(u10, sb2, true);
        sb2.append(": ");
        AbstractC5197E type = u10.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb2.append(w(type));
        C1(u10, sb2);
        j1(u10, sb2);
        List n11 = u10.n();
        Intrinsics.checkNotNullExpressionValue(n11, "getTypeParameters(...)");
        V1(n11, sb2);
    }

    public boolean A0() {
        return this.f36601l.c0();
    }

    public boolean B0() {
        return this.f36601l.d0();
    }

    public c.l C0() {
        return this.f36601l.e0();
    }

    public boolean D0() {
        return this.f36601l.f0();
    }

    public boolean E0() {
        return this.f36601l.g0();
    }

    public boolean F0() {
        return this.f36601l.h0();
    }

    public boolean G0() {
        return this.f36601l.i0();
    }

    public boolean H0() {
        return this.f36601l.j0();
    }

    public boolean I0() {
        return this.f36601l.k0();
    }

    public String I1(List typeArguments) {
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(N0());
        L(sb2, typeArguments);
        sb2.append(J0());
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public String J1(yd.e0 typeConstructor) {
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        InterfaceC0936h d10 = typeConstructor.d();
        if (d10 instanceof f0 ? true : d10 instanceof InterfaceC0933e ? true : d10 instanceof e0) {
            return Y0(d10);
        }
        if (d10 == null) {
            return typeConstructor instanceof C5196D ? ((C5196D) typeConstructor).j(g.f36612a) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + d10.getClass()).toString());
    }

    public boolean O() {
        return this.f36601l.r();
    }

    public boolean P() {
        return this.f36601l.s();
    }

    public Function1 Q() {
        return this.f36601l.t();
    }

    public boolean R() {
        return this.f36601l.u();
    }

    public boolean S() {
        return this.f36601l.v();
    }

    public kotlin.reflect.jvm.internal.impl.renderer.b T() {
        return this.f36601l.w();
    }

    public Function1 U() {
        return this.f36601l.x();
    }

    public boolean V() {
        return this.f36601l.y();
    }

    public Set W() {
        return this.f36601l.z();
    }

    public boolean Y() {
        return this.f36601l.A();
    }

    public String Y0(InterfaceC0936h klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return kotlin.reflect.jvm.internal.impl.types.error.k.m(klass) ? klass.r().toString() : T().a(klass, this);
    }

    public boolean Z() {
        return this.f36601l.B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void a(Set set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f36601l.a(set);
    }

    public boolean a0() {
        return this.f36601l.C();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void b(boolean z10) {
        this.f36601l.b(z10);
    }

    public boolean b0() {
        return this.f36601l.D();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void c(Set set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f36601l.c(set);
    }

    public boolean c0() {
        return this.f36601l.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void d(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f36601l.d(kVar);
    }

    public Set d0() {
        return this.f36601l.F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void e(boolean z10) {
        this.f36601l.e(z10);
    }

    public boolean e0() {
        return this.f36601l.G();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean f() {
        return this.f36601l.f();
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.g f0() {
        return this.f36601l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void g(kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f36601l.g(bVar);
    }

    public j g0() {
        return this.f36601l.H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void h(boolean z10) {
        this.f36601l.h(z10);
    }

    public k h0() {
        return this.f36601l.I();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void i(boolean z10) {
        this.f36601l.i(z10);
    }

    public boolean i0() {
        return this.f36601l.J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void j(boolean z10) {
        this.f36601l.j(z10);
    }

    public boolean j0() {
        return this.f36601l.K();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void k(boolean z10) {
        this.f36601l.k(z10);
    }

    public l k0() {
        return this.f36601l.L();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void l(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.f36601l.l(mVar);
    }

    public boolean l0() {
        return this.f36601l.N();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public Set m() {
        return this.f36601l.m();
    }

    public boolean m0() {
        return this.f36601l.O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean n() {
        return this.f36601l.n();
    }

    public boolean n0() {
        return this.f36601l.P();
    }

    public String n1(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i10 = b.f36605a[y0().ordinal()];
        if (i10 == 1) {
            return message;
        }
        if (i10 != 2) {
            throw new lc.m();
        }
        return "<i>" + message + "</i>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public kotlin.reflect.jvm.internal.impl.renderer.a o() {
        return this.f36601l.o();
    }

    public boolean o0() {
        return this.f36601l.Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void p(boolean z10) {
        this.f36601l.p(z10);
    }

    public boolean p0() {
        return this.f36601l.R();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String q(InterfaceC0941m declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.f0(new a(), sb2);
        if (E0()) {
            K(sb2, declarationDescriptor);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public boolean q0() {
        return this.f36601l.S();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String r(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotation, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (eVar != null) {
            sb2.append(eVar.getRenderName() + ':');
        }
        AbstractC5197E type = annotation.getType();
        sb2.append(w(type));
        if (Z()) {
            List S02 = S0(annotation);
            if (a0() || !S02.isEmpty()) {
                CollectionsKt.j0(S02, sb2, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (D0() && (yd.G.a(type) || (type.W0().d() instanceof J.b))) {
            sb2.append(" /* annotation class not found */");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public boolean r0() {
        return this.f36601l.T();
    }

    public boolean s0() {
        return this.f36601l.U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String t(String lowerRendered, String upperRendered, Hc.g builtIns) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        if (n.f(lowerRendered, upperRendered)) {
            if (!StringsKt.F(upperRendered, "(", false, 2, null)) {
                return lowerRendered + '!';
            }
            return '(' + lowerRendered + ")!";
        }
        kotlin.reflect.jvm.internal.impl.renderer.b T10 = T();
        InterfaceC0933e w10 = builtIns.w();
        Intrinsics.checkNotNullExpressionValue(w10, "getCollection(...)");
        String Q02 = StringsKt.Q0(T10.a(w10, this), "Collection", null, 2, null);
        String d10 = n.d(lowerRendered, Q02 + "Mutable", upperRendered, Q02, Q02 + "(Mutable)");
        if (d10 != null) {
            return d10;
        }
        String d11 = n.d(lowerRendered, Q02 + "MutableMap.MutableEntry", upperRendered, Q02 + "Map.Entry", Q02 + "(Mutable)Map.(Mutable)Entry");
        if (d11 != null) {
            return d11;
        }
        kotlin.reflect.jvm.internal.impl.renderer.b T11 = T();
        InterfaceC0933e j10 = builtIns.j();
        Intrinsics.checkNotNullExpressionValue(j10, "getArray(...)");
        String Q03 = StringsKt.Q0(T11.a(j10, this), "Array", null, 2, null);
        String d12 = n.d(lowerRendered, Q03 + N("Array<"), upperRendered, Q03 + N("Array<out "), Q03 + N("Array<(out) "));
        if (d12 != null) {
            return d12;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    public boolean t0() {
        return this.f36601l.V();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String u(id.d fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List h10 = fqName.h();
        Intrinsics.checkNotNullExpressionValue(h10, "pathSegments(...)");
        return g1(h10);
    }

    public boolean u0() {
        return this.f36601l.W();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String v(id.f name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        String N10 = N(n.b(name));
        if (!R() || y0() != m.HTML || !z10) {
            return N10;
        }
        return "<b>" + N10 + "</b>";
    }

    public boolean v0() {
        return this.f36601l.X();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String w(AbstractC5197E type) {
        Intrinsics.checkNotNullParameter(type, "type");
        StringBuilder sb2 = new StringBuilder();
        s1(sb2, (AbstractC5197E) z0().invoke(type));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public boolean w0() {
        return this.f36601l.Y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String x(i0 typeProjection) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        L(sb2, CollectionsKt.e(typeProjection));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public boolean x0() {
        return this.f36601l.Z();
    }

    public m y0() {
        return this.f36601l.a0();
    }

    public Function1 z0() {
        return this.f36601l.b0();
    }
}
