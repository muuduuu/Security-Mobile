package yd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5215q extends M {
    @Override // yd.AbstractC5197E
    public List U0() {
        return f1().U0();
    }

    @Override // yd.AbstractC5197E
    public a0 V0() {
        return f1().V0();
    }

    @Override // yd.AbstractC5197E
    public e0 W0() {
        return f1().W0();
    }

    @Override // yd.AbstractC5197E
    public boolean X0() {
        return f1().X0();
    }

    protected abstract M f1();

    @Override // yd.t0
    public M g1(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC5197E a10 = kotlinTypeRefiner.a(f1());
        Intrinsics.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return h1((M) a10);
    }

    public abstract AbstractC5215q h1(M m10);

    @Override // yd.AbstractC5197E
    public rd.h w() {
        return f1().w();
    }
}
