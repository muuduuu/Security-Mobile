package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import xc.C5142C;
import xc.InterfaceC5155h;

/* loaded from: classes.dex */
public abstract class k extends j implements InterfaceC5155h {

    /* renamed from: a, reason: collision with root package name */
    private final int f36383a;

    public k(int i10, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f36383a = i10;
    }

    @Override // xc.InterfaceC5155h
    public int getArity() {
        return this.f36383a;
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
