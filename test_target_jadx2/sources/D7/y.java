package D7;

/* loaded from: classes2.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f1367a;

    y(z zVar) {
        this.f1367a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC0781e interfaceC0781e;
        InterfaceC0781e interfaceC0781e2;
        obj = this.f1367a.f1369b;
        synchronized (obj) {
            try {
                z zVar = this.f1367a;
                interfaceC0781e = zVar.f1370c;
                if (interfaceC0781e != null) {
                    interfaceC0781e2 = zVar.f1370c;
                    interfaceC0781e2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
