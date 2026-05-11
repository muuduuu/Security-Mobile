package Md;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
abstract class c extends Nd.e {

    /* renamed from: d, reason: collision with root package name */
    private final Function2 f6390d;

    public c(Function2 function2, CoroutineContext coroutineContext, int i10, Ld.a aVar) {
        super(coroutineContext, i10, aVar);
        this.f6390d = function2;
    }

    static /* synthetic */ Object l(c cVar, Ld.u uVar, kotlin.coroutines.d dVar) {
        Object invoke = cVar.f6390d.invoke(uVar, dVar);
        return invoke == AbstractC3868b.e() ? invoke : Unit.f36324a;
    }

    @Override // Nd.e
    protected Object g(Ld.u uVar, kotlin.coroutines.d dVar) {
        return l(this, uVar, dVar);
    }

    @Override // Nd.e
    public String toString() {
        return "block[" + this.f6390d + "] -> " + super.toString();
    }
}
