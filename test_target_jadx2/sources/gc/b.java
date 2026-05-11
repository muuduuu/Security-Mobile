package gc;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import bc.InterfaceC1672b;
import com.google.android.gms.common.AbstractC2021m;
import com.google.android.gms.common.C2010b;
import ec.InterfaceC3119a;
import fc.C3164b;
import ic.InterfaceC3363a;
import ic.InterfaceC3364b;

/* loaded from: classes2.dex */
public class b implements InterfaceC3119a, InterfaceC3363a {

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC3364b f33661f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC1672b f33662g;

    /* renamed from: i, reason: collision with root package name */
    private Context f33664i;

    /* renamed from: j, reason: collision with root package name */
    private C3164b f33665j;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC3119a f33667l;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33663h = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33666k = false;

    public b(Context context) {
        if (AbstractC2021m.h(context) == 0) {
            this.f33667l = new C3217a(this);
        } else {
            this.f33667l = new c();
        }
    }

    private void c() {
        this.f33661f.a("FusedLocationProvider not working, falling back and using LocationManager", new Object[0]);
        c cVar = new c();
        this.f33667l = cVar;
        cVar.a(this.f33664i, this.f33661f);
        if (this.f33663h) {
            this.f33667l.d(this.f33662g, this.f33665j, this.f33666k);
        }
    }

    @Override // ec.InterfaceC3119a
    public void a(Context context, InterfaceC3364b interfaceC3364b) {
        this.f33661f = interfaceC3364b;
        this.f33664i = context;
        interfaceC3364b.a("Currently selected provider = " + this.f33667l.getClass().getSimpleName(), new Object[0]);
        this.f33667l.a(context, interfaceC3364b);
    }

    @Override // ec.InterfaceC3119a
    public Location b() {
        return this.f33667l.b();
    }

    @Override // ec.InterfaceC3119a
    public void d(InterfaceC1672b interfaceC1672b, C3164b c3164b, boolean z10) {
        this.f33663h = true;
        this.f33662g = interfaceC1672b;
        this.f33665j = c3164b;
        this.f33666k = z10;
        this.f33667l.d(interfaceC1672b, c3164b, z10);
    }

    @Override // ic.InterfaceC3363a
    public void onConnectionFailed(C2010b c2010b) {
        c();
    }

    @Override // ic.InterfaceC3363a
    public void onConnectionSuspended(int i10) {
        c();
    }

    @Override // ic.InterfaceC3363a
    public void onConnected(Bundle bundle) {
    }
}
