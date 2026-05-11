package Od;

import Jd.AbstractC0871a;
import kotlin.coroutines.CoroutineContext;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public class z extends AbstractC0871a implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.coroutines.d f7356d;

    public z(CoroutineContext coroutineContext, kotlin.coroutines.d dVar) {
        super(coroutineContext, true, true);
        this.f7356d = dVar;
    }

    @Override // Jd.C0
    protected void O(Object obj) {
        AbstractC1081i.b(AbstractC3868b.c(this.f7356d), Jd.D.a(obj, this.f7356d));
    }

    @Override // Jd.AbstractC0871a
    protected void R0(Object obj) {
        kotlin.coroutines.d dVar = this.f7356d;
        dVar.resumeWith(Jd.D.a(obj, dVar));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d dVar = this.f7356d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // Jd.C0
    protected final boolean s0() {
        return true;
    }
}
