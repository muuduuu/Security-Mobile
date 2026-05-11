package Nd;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public final class h extends g {
    public /* synthetic */ h(Md.e eVar, CoroutineContext coroutineContext, int i10, Ld.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i11 & 2) != 0 ? kotlin.coroutines.g.f36372a : coroutineContext, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? Ld.a.SUSPEND : aVar);
    }

    @Override // Nd.e
    protected e h(CoroutineContext coroutineContext, int i10, Ld.a aVar) {
        return new h(this.f6758d, coroutineContext, i10, aVar);
    }

    @Override // Nd.g
    protected Object o(Md.f fVar, kotlin.coroutines.d dVar) {
        Object b10 = this.f6758d.b(fVar, dVar);
        return b10 == AbstractC3868b.e() ? b10 : Unit.f36324a;
    }

    public h(Md.e eVar, CoroutineContext coroutineContext, int i10, Ld.a aVar) {
        super(eVar, coroutineContext, i10, aVar);
    }
}
