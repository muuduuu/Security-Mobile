package V6;

import T6.InterfaceC1169e;
import V6.AbstractC1267c;
import android.os.Bundle;

/* loaded from: classes2.dex */
final class J implements AbstractC1267c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1169e f10858a;

    J(InterfaceC1169e interfaceC1169e) {
        this.f10858a = interfaceC1169e;
    }

    @Override // V6.AbstractC1267c.a
    public final void onConnected(Bundle bundle) {
        this.f10858a.onConnected(bundle);
    }

    @Override // V6.AbstractC1267c.a
    public final void onConnectionSuspended(int i10) {
        this.f10858a.onConnectionSuspended(i10);
    }
}
