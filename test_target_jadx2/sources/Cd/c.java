package Cd;

import Kc.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f1091a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5197E f1092b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5197E f1093c;

    public c(f0 typeParameter, AbstractC5197E inProjection, AbstractC5197E outProjection) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(inProjection, "inProjection");
        Intrinsics.checkNotNullParameter(outProjection, "outProjection");
        this.f1091a = typeParameter;
        this.f1092b = inProjection;
        this.f1093c = outProjection;
    }

    public final AbstractC5197E a() {
        return this.f1092b;
    }

    public final AbstractC5197E b() {
        return this.f1093c;
    }

    public final f0 c() {
        return this.f1091a;
    }

    public final boolean d() {
        return e.f36672a.c(this.f1092b, this.f1093c);
    }
}
