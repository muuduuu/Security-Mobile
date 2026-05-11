package Ld;

import Jd.L;
import Ld.x;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
final class t extends h implements u {
    public t(CoroutineContext coroutineContext, g gVar) {
        super(coroutineContext, gVar, true, true);
    }

    @Override // Jd.AbstractC0871a
    protected void S0(Throwable th, boolean z10) {
        if (W0().v(th) || z10) {
            return;
        }
        L.a(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Jd.AbstractC0871a
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public void T0(Unit unit) {
        x.a.a(W0(), null, 1, null);
    }

    @Override // Jd.AbstractC0871a, Jd.C0, Jd.InterfaceC0915w0
    public boolean b() {
        return super.b();
    }

    @Override // Ld.u
    public /* bridge */ /* synthetic */ x r() {
        return V0();
    }
}
