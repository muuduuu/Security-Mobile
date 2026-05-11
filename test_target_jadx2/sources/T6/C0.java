package T6;

import S6.h;
import V6.AbstractC1287s;
import android.os.Bundle;
import com.google.android.gms.common.C2010b;

/* loaded from: classes2.dex */
public final class C0 implements h.b, h.c {

    /* renamed from: f, reason: collision with root package name */
    public final S6.a f9340f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f9341g;

    /* renamed from: h, reason: collision with root package name */
    private D0 f9342h;

    public C0(S6.a aVar, boolean z10) {
        this.f9340f = aVar;
        this.f9341g = z10;
    }

    private final D0 b() {
        AbstractC1287s.n(this.f9342h, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f9342h;
    }

    public final void a(D0 d02) {
        this.f9342h = d02;
    }

    @Override // T6.InterfaceC1169e
    public final void onConnected(Bundle bundle) {
        b().onConnected(bundle);
    }

    @Override // T6.InterfaceC1184n
    public final void onConnectionFailed(C2010b c2010b) {
        b().p(c2010b, this.f9340f, this.f9341g);
    }

    @Override // T6.InterfaceC1169e
    public final void onConnectionSuspended(int i10) {
        b().onConnectionSuspended(i10);
    }
}
