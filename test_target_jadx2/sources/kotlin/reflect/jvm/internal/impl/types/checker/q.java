package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5197E f36701a;

    /* renamed from: b, reason: collision with root package name */
    private final q f36702b;

    public q(AbstractC5197E type, q qVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f36701a = type;
        this.f36702b = qVar;
    }

    public final q a() {
        return this.f36702b;
    }

    public final AbstractC5197E b() {
        return this.f36701a;
    }
}
