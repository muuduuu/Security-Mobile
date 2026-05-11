package xc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class m implements InterfaceC5155h, Serializable {
    private final int arity;

    public m(int i10) {
        this.arity = i10;
    }

    @Override // xc.InterfaceC5155h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String n10 = C5142C.n(this);
        Intrinsics.checkNotNullExpressionValue(n10, "renderLambdaToString(...)");
        return n10;
    }
}
