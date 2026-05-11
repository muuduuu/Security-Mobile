package yd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class v0 extends AbstractC5197E {
    public v0() {
        super(null);
    }

    @Override // yd.AbstractC5197E
    public List U0() {
        return a1().U0();
    }

    @Override // yd.AbstractC5197E
    public a0 V0() {
        return a1().V0();
    }

    @Override // yd.AbstractC5197E
    public e0 W0() {
        return a1().W0();
    }

    @Override // yd.AbstractC5197E
    public boolean X0() {
        return a1().X0();
    }

    @Override // yd.AbstractC5197E
    public final t0 Z0() {
        AbstractC5197E a12 = a1();
        while (a12 instanceof v0) {
            a12 = ((v0) a12).a1();
        }
        Intrinsics.e(a12, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (t0) a12;
    }

    protected abstract AbstractC5197E a1();

    public abstract boolean b1();

    public String toString() {
        return b1() ? a1().toString() : "<Not computed yet>";
    }

    @Override // yd.AbstractC5197E
    public rd.h w() {
        return a1().w();
    }
}
