package T6;

/* loaded from: classes2.dex */
final class K implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f9357a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N f9358b;

    K(N n10, int i10) {
        this.f9358b = n10;
        this.f9357a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9358b.i(this.f9357a);
    }
}
