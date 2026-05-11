package Nd;

import kotlin.Unit;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public final class v implements Md.f {

    /* renamed from: a, reason: collision with root package name */
    private final Ld.x f6797a;

    public v(Ld.x xVar) {
        this.f6797a = xVar;
    }

    @Override // Md.f
    public Object f(Object obj, kotlin.coroutines.d dVar) {
        Object D10 = this.f6797a.D(obj, dVar);
        return D10 == AbstractC3868b.e() ? D10 : Unit.f36324a;
    }
}
