package yd;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class H extends v0 {

    /* renamed from: b, reason: collision with root package name */
    private final xd.n f45448b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f45449c;

    /* renamed from: d, reason: collision with root package name */
    private final xd.i f45450d;

    static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.g f45451a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H f45452b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.types.checker.g gVar, H h10) {
            super(0);
            this.f45451a = gVar;
            this.f45452b = h10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke() {
            return this.f45451a.a((Ad.i) this.f45452b.f45449c.invoke());
        }
    }

    public H(xd.n storageManager, Function0 computation) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.f45448b = storageManager;
        this.f45449c = computation;
        this.f45450d = storageManager.d(computation);
    }

    @Override // yd.v0
    protected AbstractC5197E a1() {
        return (AbstractC5197E) this.f45450d.invoke();
    }

    @Override // yd.v0
    public boolean b1() {
        return this.f45450d.m();
    }

    @Override // yd.AbstractC5197E
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public H g1(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new H(this.f45448b, new a(kotlinTypeRefiner, this));
    }
}
