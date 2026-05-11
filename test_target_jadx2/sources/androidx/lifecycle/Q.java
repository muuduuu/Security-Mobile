package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.InterfaceC3624c;
import o.InterfaceC3735a;
import xc.InterfaceC5154g;

/* loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1605w f17084a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3735a f17085b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1605w c1605w, InterfaceC3735a interfaceC3735a) {
            super(1);
            this.f17084a = c1605w;
            this.f17085b = interfaceC3735a;
        }

        public final void a(Object obj) {
            this.f17084a.o(this.f17085b.apply(obj));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return Unit.f36324a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class b implements InterfaceC1608z, InterfaceC5154g {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f17086a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f17086a = function;
        }

        @Override // xc.InterfaceC5154g
        public final InterfaceC3624c a() {
            return this.f17086a;
        }

        @Override // androidx.lifecycle.InterfaceC1608z
        public final /* synthetic */ void b(Object obj) {
            this.f17086a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1608z) && (obj instanceof InterfaceC5154g)) {
                return Intrinsics.b(a(), ((InterfaceC5154g) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public static final class c implements InterfaceC1608z {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC1604v f17087a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3735a f17088b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1605w f17089c;

        static final class a extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1605w f17090a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1605w c1605w) {
                super(1);
                this.f17090a = c1605w;
            }

            public final void a(Object obj) {
                this.f17090a.o(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(obj);
                return Unit.f36324a;
            }
        }

        c(InterfaceC3735a interfaceC3735a, C1605w c1605w) {
            this.f17088b = interfaceC3735a;
            this.f17089c = c1605w;
        }

        @Override // androidx.lifecycle.InterfaceC1608z
        public void b(Object obj) {
            AbstractC1604v abstractC1604v = (AbstractC1604v) this.f17088b.apply(obj);
            AbstractC1604v abstractC1604v2 = this.f17087a;
            if (abstractC1604v2 == abstractC1604v) {
                return;
            }
            if (abstractC1604v2 != null) {
                C1605w c1605w = this.f17089c;
                Intrinsics.d(abstractC1604v2);
                c1605w.q(abstractC1604v2);
            }
            this.f17087a = abstractC1604v;
            if (abstractC1604v != null) {
                C1605w c1605w2 = this.f17089c;
                Intrinsics.d(abstractC1604v);
                c1605w2.p(abstractC1604v, new b(new a(this.f17089c)));
            }
        }
    }

    public static final /* synthetic */ AbstractC1604v a(AbstractC1604v abstractC1604v, InterfaceC3735a mapFunction) {
        Intrinsics.checkNotNullParameter(abstractC1604v, "<this>");
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        C1605w c1605w = new C1605w();
        c1605w.p(abstractC1604v, new b(new a(c1605w, mapFunction)));
        return c1605w;
    }

    public static final /* synthetic */ AbstractC1604v b(AbstractC1604v abstractC1604v, InterfaceC3735a switchMapFunction) {
        Intrinsics.checkNotNullParameter(abstractC1604v, "<this>");
        Intrinsics.checkNotNullParameter(switchMapFunction, "switchMapFunction");
        C1605w c1605w = new C1605w();
        c1605w.p(abstractC1604v, new c(switchMapFunction, c1605w));
        return c1605w;
    }
}
