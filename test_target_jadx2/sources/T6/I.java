package T6;

import T6.ComponentCallbacks2C1165c;

/* loaded from: classes2.dex */
final class I implements ComponentCallbacks2C1165c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1171f f9350a;

    I(C1171f c1171f) {
        this.f9350a = c1171f;
    }

    @Override // T6.ComponentCallbacks2C1165c.a
    public final void a(boolean z10) {
        C1171f c1171f = this.f9350a;
        c1171f.f9431n.sendMessage(c1171f.f9431n.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
