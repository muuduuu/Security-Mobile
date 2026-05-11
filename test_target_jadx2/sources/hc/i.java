package Hc;

import Hc.j;
import Kc.AbstractC0951x;
import Kc.G;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.J;
import Kc.f0;
import id.C3367b;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xc.C5142C;
import xc.u;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.T;
import yd.a0;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final J f3849a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f3850b;

    /* renamed from: c, reason: collision with root package name */
    private final a f3851c;

    /* renamed from: d, reason: collision with root package name */
    private final a f3852d;

    /* renamed from: e, reason: collision with root package name */
    private final a f3853e;

    /* renamed from: f, reason: collision with root package name */
    private final a f3854f;

    /* renamed from: g, reason: collision with root package name */
    private final a f3855g;

    /* renamed from: h, reason: collision with root package name */
    private final a f3856h;

    /* renamed from: i, reason: collision with root package name */
    private final a f3857i;

    /* renamed from: j, reason: collision with root package name */
    private final a f3858j;

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f3848l = {C5142C.k(new u(C5142C.b(i.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5142C.k(new u(C5142C.b(i.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5142C.k(new u(C5142C.b(i.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5142C.k(new u(C5142C.b(i.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5142C.k(new u(C5142C.b(i.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5142C.k(new u(C5142C.b(i.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5142C.k(new u(C5142C.b(i.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5142C.k(new u(C5142C.b(i.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* renamed from: k, reason: collision with root package name */
    public static final b f3847k = new b(null);

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f3859a;

        public a(int i10) {
            this.f3859a = i10;
        }

        public final InterfaceC0933e a(i types, kotlin.reflect.k property) {
            Intrinsics.checkNotNullParameter(types, "types");
            Intrinsics.checkNotNullParameter(property, "property");
            return types.b(Ed.a.a(property.getName()), this.f3859a);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC5197E a(G module) {
            Intrinsics.checkNotNullParameter(module, "module");
            InterfaceC0933e a10 = AbstractC0951x.a(module, j.a.f3972u0);
            if (a10 == null) {
                return null;
            }
            a0 i10 = a0.f45478b.i();
            List c10 = a10.r().c();
            Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
            Object A02 = CollectionsKt.A0(c10);
            Intrinsics.checkNotNullExpressionValue(A02, "single(...)");
            return C5198F.g(i10, a10, CollectionsKt.e(new T((f0) A02)));
        }

        private b() {
        }
    }

    static final class c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f3860a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(G g10) {
            super(0);
            this.f3860a = g10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rd.h invoke() {
            return this.f3860a.p0(j.f3888v).w();
        }
    }

    public i(G module, J notFoundClasses) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        this.f3849a = notFoundClasses;
        this.f3850b = lc.i.b(lc.l.PUBLICATION, new c(module));
        this.f3851c = new a(1);
        this.f3852d = new a(1);
        this.f3853e = new a(1);
        this.f3854f = new a(2);
        this.f3855g = new a(3);
        this.f3856h = new a(1);
        this.f3857i = new a(2);
        this.f3858j = new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0933e b(String str, int i10) {
        id.f o10 = id.f.o(str);
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        InterfaceC0936h f10 = d().f(o10, Rc.d.FROM_REFLECTION);
        InterfaceC0933e interfaceC0933e = f10 instanceof InterfaceC0933e ? (InterfaceC0933e) f10 : null;
        return interfaceC0933e == null ? this.f3849a.d(new C3367b(j.f3888v, o10), CollectionsKt.e(Integer.valueOf(i10))) : interfaceC0933e;
    }

    private final rd.h d() {
        return (rd.h) this.f3850b.getValue();
    }

    public final InterfaceC0933e c() {
        return this.f3851c.a(this, f3848l[0]);
    }
}
