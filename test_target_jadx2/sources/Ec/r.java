package Ec;

import Ec.y;
import Kc.U;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import wc.InterfaceC5068n;

/* loaded from: classes3.dex */
public final class r extends x implements kotlin.reflect.n, kotlin.reflect.h {

    /* renamed from: q, reason: collision with root package name */
    private final Lazy f2089q;

    public static final class a extends y.d implements h.a, InterfaceC5068n {

        /* renamed from: j, reason: collision with root package name */
        private final r f2090j;

        public a(r property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f2090j = property;
        }

        @Override // kotlin.reflect.k.a
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public r u() {
            return this.f2090j;
        }

        public void W(Object obj, Object obj2, Object obj3) {
            u().b0(obj, obj2, obj3);
        }

        @Override // wc.InterfaceC5068n
        public /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3) {
            W(obj, obj2, obj3);
            return Unit.f36324a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(n container, U descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f2089q = lc.i.b(lc.l.PUBLICATION, new s(this));
    }

    @Override // kotlin.reflect.h
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public a l() {
        return (a) this.f2089q.getValue();
    }

    public void b0(Object obj, Object obj2, Object obj3) {
        l().h(obj, obj2, obj3);
    }
}
