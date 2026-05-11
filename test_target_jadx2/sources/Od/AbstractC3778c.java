package od;

import Gd.b;
import Hc.g;
import Kc.C0953z;
import Kc.G;
import Kc.H;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0937i;
import Kc.InterfaceC0941m;
import Kc.K;
import Kc.T;
import Kc.U;
import Kc.h0;
import Kc.j0;
import id.C3367b;
import id.d;
import id.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.h;
import kotlin.sequences.Sequence;
import kotlin.sequences.j;
import xc.AbstractC5156i;
import xc.C5141B;
import xc.C5142C;
import xc.m;
import yd.AbstractC5197E;

/* renamed from: od.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3778c {

    /* renamed from: a, reason: collision with root package name */
    private static final f f38049a;

    /* renamed from: od.c$a */
    /* synthetic */ class a extends AbstractC5156i implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public static final a f38050j = new a();

        a() {
            super(1);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(j0.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "declaresDefaultValue()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(j0 p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Boolean.valueOf(p02.B0());
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "declaresDefaultValue";
        }
    }

    /* renamed from: od.c$b */
    public static final class b extends b.AbstractC0073b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5141B f38051a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f38052b;

        b(C5141B c5141b, Function1 function1) {
            this.f38051a = c5141b;
            this.f38052b = function1;
        }

        @Override // Gd.b.AbstractC0073b, Gd.b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0930b current) {
            Intrinsics.checkNotNullParameter(current, "current");
            if (this.f38051a.f44962a == null && ((Boolean) this.f38052b.invoke(current)).booleanValue()) {
                this.f38051a.f44962a = current;
            }
        }

        @Override // Gd.b.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC0930b current) {
            Intrinsics.checkNotNullParameter(current, "current");
            return this.f38051a.f44962a == null;
        }

        @Override // Gd.b.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC0930b a() {
            return (InterfaceC0930b) this.f38051a.f44962a;
        }
    }

    /* renamed from: od.c$c, reason: collision with other inner class name */
    static final class C0583c extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0583c f38053a = new C0583c();

        C0583c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0941m invoke(InterfaceC0941m it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.b();
        }
    }

    static {
        f o10 = f.o("value");
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        f38049a = o10;
    }

    public static final boolean c(j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Boolean e10 = Gd.b.e(CollectionsKt.e(j0Var), C3776a.f38047a, a.f38050j);
        Intrinsics.checkNotNullExpressionValue(e10, "ifAny(...)");
        return e10.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable d(j0 j0Var) {
        Collection f10 = j0Var.f();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(f10, 10));
        Iterator it = f10.iterator();
        while (it.hasNext()) {
            arrayList.add(((j0) it.next()).a());
        }
        return arrayList;
    }

    public static final InterfaceC0930b e(InterfaceC0930b interfaceC0930b, boolean z10, Function1 predicate) {
        Intrinsics.checkNotNullParameter(interfaceC0930b, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return (InterfaceC0930b) Gd.b.b(CollectionsKt.e(interfaceC0930b), new C3777b(z10), new b(new C5141B(), predicate));
    }

    public static /* synthetic */ InterfaceC0930b f(InterfaceC0930b interfaceC0930b, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(interfaceC0930b, z10, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable g(boolean z10, InterfaceC0930b interfaceC0930b) {
        if (z10) {
            interfaceC0930b = interfaceC0930b != null ? interfaceC0930b.a() : null;
        }
        Collection f10 = interfaceC0930b != null ? interfaceC0930b.f() : null;
        return f10 == null ? CollectionsKt.j() : f10;
    }

    public static final id.c h(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        d m10 = m(interfaceC0941m);
        if (!m10.f()) {
            m10 = null;
        }
        if (m10 != null) {
            return m10.l();
        }
        return null;
    }

    public static final InterfaceC0933e i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        InterfaceC0936h d10 = cVar.getType().W0().d();
        if (d10 instanceof InterfaceC0933e) {
            return (InterfaceC0933e) d10;
        }
        return null;
    }

    public static final g j(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        return p(interfaceC0941m).v();
    }

    public static final C3367b k(InterfaceC0936h interfaceC0936h) {
        InterfaceC0941m b10;
        C3367b k10;
        if (interfaceC0936h == null || (b10 = interfaceC0936h.b()) == null) {
            return null;
        }
        if (b10 instanceof K) {
            return new C3367b(((K) b10).e(), interfaceC0936h.getName());
        }
        if (!(b10 instanceof InterfaceC0937i) || (k10 = k((InterfaceC0936h) b10)) == null) {
            return null;
        }
        return k10.d(interfaceC0936h.getName());
    }

    public static final id.c l(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        id.c n10 = kd.f.n(interfaceC0941m);
        Intrinsics.checkNotNullExpressionValue(n10, "getFqNameSafe(...)");
        return n10;
    }

    public static final d m(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        d m10 = kd.f.m(interfaceC0941m);
        Intrinsics.checkNotNullExpressionValue(m10, "getFqName(...)");
        return m10;
    }

    public static final C0953z n(InterfaceC0933e interfaceC0933e) {
        h0 H02 = interfaceC0933e != null ? interfaceC0933e.H0() : null;
        if (H02 instanceof C0953z) {
            return (C0953z) H02;
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.checker.g o(G g10) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        android.support.v4.media.session.b.a(g10.E0(h.a()));
        return g.a.f36674a;
    }

    public static final G p(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        G g10 = kd.f.g(interfaceC0941m);
        Intrinsics.checkNotNullExpressionValue(g10, "getContainingModule(...)");
        return g10;
    }

    public static final H q(InterfaceC0933e interfaceC0933e) {
        h0 H02 = interfaceC0933e != null ? interfaceC0933e.H0() : null;
        if (H02 instanceof H) {
            return (H) H02;
        }
        return null;
    }

    public static final Sequence r(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        return j.m(s(interfaceC0941m), 1);
    }

    public static final Sequence s(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        return j.h(interfaceC0941m, C0583c.f38053a);
    }

    public static final InterfaceC0930b t(InterfaceC0930b interfaceC0930b) {
        Intrinsics.checkNotNullParameter(interfaceC0930b, "<this>");
        if (!(interfaceC0930b instanceof T)) {
            return interfaceC0930b;
        }
        U J02 = ((T) interfaceC0930b).J0();
        Intrinsics.checkNotNullExpressionValue(J02, "getCorrespondingProperty(...)");
        return J02;
    }

    public static final InterfaceC0933e u(InterfaceC0933e interfaceC0933e) {
        Intrinsics.checkNotNullParameter(interfaceC0933e, "<this>");
        for (AbstractC5197E abstractC5197E : interfaceC0933e.y().W0().a()) {
            if (!Hc.g.b0(abstractC5197E)) {
                InterfaceC0936h d10 = abstractC5197E.W0().d();
                if (kd.f.w(d10)) {
                    Intrinsics.e(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (InterfaceC0933e) d10;
                }
            }
        }
        return null;
    }

    public static final boolean v(G g10) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        android.support.v4.media.session.b.a(g10.E0(h.a()));
        return false;
    }

    public static final InterfaceC0933e w(G g10, id.c topLevelClassFqName, Rc.b location) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        Intrinsics.checkNotNullParameter(topLevelClassFqName, "topLevelClassFqName");
        Intrinsics.checkNotNullParameter(location, "location");
        topLevelClassFqName.d();
        id.c e10 = topLevelClassFqName.e();
        Intrinsics.checkNotNullExpressionValue(e10, "parent(...)");
        rd.h w10 = g10.p0(e10).w();
        f g11 = topLevelClassFqName.g();
        Intrinsics.checkNotNullExpressionValue(g11, "shortName(...)");
        InterfaceC0936h f10 = w10.f(g11, location);
        if (f10 instanceof InterfaceC0933e) {
            return (InterfaceC0933e) f10;
        }
        return null;
    }
}
