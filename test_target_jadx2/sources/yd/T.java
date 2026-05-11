package yd;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class T extends j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Kc.f0 f45462a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f45463b;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke() {
            return U.b(T.this.f45462a);
        }
    }

    public T(Kc.f0 typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f45462a = typeParameter;
        this.f45463b = lc.i.b(lc.l.PUBLICATION, new a());
    }

    private final AbstractC5197E e() {
        return (AbstractC5197E) this.f45463b.getValue();
    }

    @Override // yd.i0
    public u0 a() {
        return u0.OUT_VARIANCE;
    }

    @Override // yd.i0
    public i0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // yd.i0
    public boolean c() {
        return true;
    }

    @Override // yd.i0
    public AbstractC5197E getType() {
        return e();
    }
}
