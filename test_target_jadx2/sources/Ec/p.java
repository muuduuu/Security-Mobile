package Ec;

import Ec.y;
import Kc.U;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;

/* loaded from: classes3.dex */
public final class p extends v implements kotlin.reflect.l, kotlin.reflect.h {

    /* renamed from: q, reason: collision with root package name */
    private final Lazy f2083q;

    public static final class a extends y.d implements h.a, Function1 {

        /* renamed from: j, reason: collision with root package name */
        private final p f2084j;

        public a(p property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f2084j = property;
        }

        @Override // kotlin.reflect.k.a
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public p u() {
            return this.f2084j;
        }

        public void W(Object obj) {
            u().b0(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            W(obj);
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
            return new a(p.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n container, U descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f2083q = lc.i.b(lc.l.PUBLICATION, new b());
    }

    @Override // kotlin.reflect.h
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public a l() {
        return (a) this.f2083q.getValue();
    }

    public void b0(Object obj) {
        l().h(obj);
    }
}
