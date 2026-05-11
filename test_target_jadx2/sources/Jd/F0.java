package Jd;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
final class F0 extends M0 {

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.coroutines.d f4997d;

    public F0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f4997d = AbstractC3868b.a(function2, this, this);
    }

    @Override // Jd.C0
    protected void C0() {
        Pd.a.b(this.f4997d, this);
    }
}
