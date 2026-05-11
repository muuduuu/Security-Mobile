package T6;

import S6.a;
import V6.AbstractC1267c;
import V6.InterfaceC1280k;
import android.util.Log;
import com.google.android.gms.common.C2010b;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class S implements AbstractC1267c.InterfaceC0202c, m0 {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f9378a;

    /* renamed from: b, reason: collision with root package name */
    private final C1163b f9379b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1280k f9380c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set f9381d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9382e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C1171f f9383f;

    public S(C1171f c1171f, a.f fVar, C1163b c1163b) {
        this.f9383f = c1171f;
        this.f9378a = fVar;
        this.f9379b = c1163b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        InterfaceC1280k interfaceC1280k;
        if (!this.f9382e || (interfaceC1280k = this.f9380c) == null) {
            return;
        }
        this.f9378a.q(interfaceC1280k, this.f9381d);
    }

    @Override // V6.AbstractC1267c.InterfaceC0202c
    public final void a(C2010b c2010b) {
        this.f9383f.f9431n.post(new Q(this, c2010b));
    }

    @Override // T6.m0
    public final void b(C2010b c2010b) {
        Map map;
        map = this.f9383f.f9427j;
        N n10 = (N) map.get(this.f9379b);
        if (n10 != null) {
            n10.G(c2010b);
        }
    }

    @Override // T6.m0
    public final void c(InterfaceC1280k interfaceC1280k, Set set) {
        if (interfaceC1280k == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new C2010b(4));
        } else {
            this.f9380c = interfaceC1280k;
            this.f9381d = set;
            i();
        }
    }

    @Override // T6.m0
    public final void d(int i10) {
        Map map;
        boolean z10;
        map = this.f9383f.f9427j;
        N n10 = (N) map.get(this.f9379b);
        if (n10 != null) {
            z10 = n10.f9369n;
            if (z10) {
                n10.G(new C2010b(17));
            } else {
                n10.onConnectionSuspended(i10);
            }
        }
    }
}
