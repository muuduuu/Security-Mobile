package md;

import Hc.j;
import Kc.AbstractC0951x;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.f0;
import id.C3367b;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.G;
import yd.M;
import yd.a0;
import yd.i0;
import yd.k0;
import yd.u0;

/* renamed from: md.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3689p extends AbstractC3680g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f37495b = new a(null);

    /* renamed from: md.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC3680g a(AbstractC5197E argumentType) {
            Intrinsics.checkNotNullParameter(argumentType, "argumentType");
            if (G.a(argumentType)) {
                return null;
            }
            AbstractC5197E abstractC5197E = argumentType;
            int i10 = 0;
            while (Hc.g.c0(abstractC5197E)) {
                abstractC5197E = ((i0) CollectionsKt.A0(abstractC5197E.U0())).getType();
                Intrinsics.checkNotNullExpressionValue(abstractC5197E, "getType(...)");
                i10++;
            }
            InterfaceC0936h d10 = abstractC5197E.W0().d();
            if (d10 instanceof InterfaceC0933e) {
                C3367b k10 = AbstractC3778c.k(d10);
                return k10 == null ? new C3689p(new b.a(argumentType)) : new C3689p(k10, i10);
            }
            if (!(d10 instanceof f0)) {
                return null;
            }
            C3367b m10 = C3367b.m(j.a.f3933b.l());
            Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
            return new C3689p(m10, 0);
        }

        private a() {
        }
    }

    /* renamed from: md.p$b */
    public static abstract class b {

        /* renamed from: md.p$b$a */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC5197E f37496a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC5197E type) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.f37496a = type;
            }

            public final AbstractC5197E a() {
                return this.f37496a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.b(this.f37496a, ((a) obj).f37496a);
            }

            public int hashCode() {
                return this.f37496a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f37496a + ')';
            }
        }

        /* renamed from: md.p$b$b, reason: collision with other inner class name */
        public static final class C0566b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C3679f f37497a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0566b(C3679f value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.f37497a = value;
            }

            public final int a() {
                return this.f37497a.c();
            }

            public final C3367b b() {
                return this.f37497a.d();
            }

            public final C3679f c() {
                return this.f37497a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0566b) && Intrinsics.b(this.f37497a, ((C0566b) obj).f37497a);
            }

            public int hashCode() {
                return this.f37497a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f37497a + ')';
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3689p(b value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // md.AbstractC3680g
    public AbstractC5197E a(Kc.G module) {
        Intrinsics.checkNotNullParameter(module, "module");
        a0 i10 = a0.f45478b.i();
        InterfaceC0933e E10 = module.v().E();
        Intrinsics.checkNotNullExpressionValue(E10, "getKClass(...)");
        return C5198F.g(i10, E10, CollectionsKt.e(new k0(c(module))));
    }

    public final AbstractC5197E c(Kc.G module) {
        Intrinsics.checkNotNullParameter(module, "module");
        b bVar = (b) b();
        if (bVar instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(bVar instanceof b.C0566b)) {
            throw new lc.m();
        }
        C3679f c10 = ((b.C0566b) b()).c();
        C3367b a10 = c10.a();
        int b10 = c10.b();
        InterfaceC0933e a11 = AbstractC0951x.a(module, a10);
        if (a11 == null) {
            kotlin.reflect.jvm.internal.impl.types.error.j jVar = kotlin.reflect.jvm.internal.impl.types.error.j.UNRESOLVED_KCLASS_CONSTANT_VALUE;
            String c3367b = a10.toString();
            Intrinsics.checkNotNullExpressionValue(c3367b, "toString(...)");
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(jVar, c3367b, String.valueOf(b10));
        }
        M y10 = a11.y();
        Intrinsics.checkNotNullExpressionValue(y10, "getDefaultType(...)");
        AbstractC5197E y11 = Bd.a.y(y10);
        for (int i10 = 0; i10 < b10; i10++) {
            y11 = module.v().l(u0.INVARIANT, y11);
            Intrinsics.checkNotNullExpressionValue(y11, "getArrayType(...)");
        }
        return y11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3689p(C3679f value) {
        this(new b.C0566b(value));
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3689p(C3367b classId, int i10) {
        this(new C3679f(classId, i10));
        Intrinsics.checkNotNullParameter(classId, "classId");
    }
}
