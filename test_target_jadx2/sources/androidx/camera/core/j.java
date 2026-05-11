package androidx.camera.core;

import androidx.camera.core.impl.InterfaceC1458r0;

/* loaded from: classes.dex */
final class j extends i {

    class a implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f14720a;

        a(n nVar) {
            this.f14720a = nVar;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            this.f14720a.close();
        }
    }

    j() {
    }

    @Override // androidx.camera.core.i
    n d(InterfaceC1458r0 interfaceC1458r0) {
        return interfaceC1458r0.g();
    }

    @Override // androidx.camera.core.i
    void g() {
    }

    @Override // androidx.camera.core.i
    void o(n nVar) {
        G.n.j(e(nVar), new a(nVar), F.c.b());
    }
}
