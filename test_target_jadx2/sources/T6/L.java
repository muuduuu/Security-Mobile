package T6;

import S6.a;

/* loaded from: classes2.dex */
final class L implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ M f9359a;

    L(M m10) {
        this.f9359a = m10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        N n10 = this.f9359a.f9360a;
        fVar = n10.f9362g;
        fVar2 = n10.f9362g;
        fVar.d(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
