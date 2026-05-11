package Ec;

import Ec.y;
import Kc.U;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.i;

/* loaded from: classes3.dex */
public final class q extends w implements kotlin.reflect.i {

    /* renamed from: q, reason: collision with root package name */
    private final Lazy f2086q;

    public static final class a extends y.d implements i.a {

        /* renamed from: j, reason: collision with root package name */
        private final q f2087j;

        public a(q property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f2087j = property;
        }

        @Override // kotlin.reflect.k.a
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public q u() {
            return this.f2087j;
        }

        public void W(Object obj, Object obj2) {
            u().b0(obj, obj2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            W(obj, obj2);
            return Unit.f36324a;
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(q.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f2086q = lc.i.b(lc.l.PUBLICATION, new b());
    }

    @Override // kotlin.reflect.i, kotlin.reflect.h
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public a l() {
        return (a) this.f2086q.getValue();
    }

    public void b0(Object obj, Object obj2) {
        l().h(obj, obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n container, U descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f2086q = lc.i.b(lc.l.PUBLICATION, new b());
    }
}
