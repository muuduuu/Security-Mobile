package V6;

import T6.InterfaceC1184n;
import V6.AbstractC1267c;
import com.google.android.gms.common.C2010b;

/* loaded from: classes2.dex */
final class K implements AbstractC1267c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1184n f10859a;

    K(InterfaceC1184n interfaceC1184n) {
        this.f10859a = interfaceC1184n;
    }

    @Override // V6.AbstractC1267c.b
    public final void onConnectionFailed(C2010b c2010b) {
        this.f10859a.onConnectionFailed(c2010b);
    }
}
