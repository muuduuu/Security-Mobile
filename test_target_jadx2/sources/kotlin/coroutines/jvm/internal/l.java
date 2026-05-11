package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import xc.C5142C;
import xc.InterfaceC5155h;

/* loaded from: classes.dex */
public abstract class l extends d implements InterfaceC5155h {
    private final int arity;

    public l(int i10, kotlin.coroutines.d dVar) {
        super(dVar);
        this.arity = i10;
    }

    @Override // xc.InterfaceC5155h
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String m10 = C5142C.m(this);
        Intrinsics.checkNotNullExpressionValue(m10, "renderLambdaToString(...)");
        return m10;
    }
}
