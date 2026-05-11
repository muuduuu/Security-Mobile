package gc;

import S6.h;
import S6.p;
import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import bc.InterfaceC1672b;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import ec.C3120b;
import ec.InterfaceC3119a;
import fc.C3164b;
import fc.EnumC3163a;
import ic.InterfaceC3363a;
import ic.InterfaceC3364b;
import x7.AbstractC5131n;
import x7.C5132o;
import x7.InterfaceC5130m;
import x7.q;

/* renamed from: gc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3217a implements InterfaceC3119a, h.b, h.c, InterfaceC5130m, p {

    /* renamed from: f, reason: collision with root package name */
    private h f33646f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC3364b f33647g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC1672b f33648h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f33649i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f33650j;

    /* renamed from: k, reason: collision with root package name */
    private C3120b f33651k;

    /* renamed from: l, reason: collision with root package name */
    private LocationRequest f33652l;

    /* renamed from: m, reason: collision with root package name */
    private Context f33653m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC3363a f33654n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f33655o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f33656p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f33657q;

    /* renamed from: r, reason: collision with root package name */
    private p f33658r;

    /* renamed from: gc.a$a, reason: collision with other inner class name */
    class C0489a implements p {
        C0489a() {
        }

        @Override // S6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void c(q qVar) {
            Status c10 = qVar.c();
            int u10 = c10.u();
            if (u10 == 0) {
                C3217a.this.f33647g.a("All location settings are satisfied.", new Object[0]);
                C3217a.this.f33656p = true;
                C3217a c3217a = C3217a.this;
                c3217a.m(c3217a.f33652l);
                return;
            }
            if (u10 != 6) {
                if (u10 != 8502) {
                    return;
                }
                C3217a.this.f33647g.d("Location settings are inadequate, and cannot be fixed here. Dialog not created.", new Object[0]);
                C3217a.this.n();
                return;
            }
            C3217a.this.f33647g.c("Location settings are not satisfied. Show the user a dialog to upgrade location settings. You should hook into the Activity onActivityResult and call this provider's onActivityResult method for continuing this call flow. ", new Object[0]);
            if (!(C3217a.this.f33653m instanceof Activity)) {
                C3217a.this.f33647g.c("Provided context is not the context of an activity, therefore we can't launch the resolution activity.", new Object[0]);
                return;
            }
            try {
                c10.a1((Activity) C3217a.this.f33653m, 20001);
            } catch (IntentSender.SendIntentException unused) {
                C3217a.this.f33647g.d("PendingIntent unable to execute request.", new Object[0]);
            }
        }
    }

    /* renamed from: gc.a$b */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33660a;

        static {
            int[] iArr = new int[EnumC3163a.values().length];
            f33660a = iArr;
            try {
                iArr[EnumC3163a.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33660a[EnumC3163a.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33660a[EnumC3163a.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33660a[EnumC3163a.LOWEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C3217a() {
        this.f33649i = false;
        this.f33650j = false;
        this.f33657q = true;
        this.f33658r = new C0489a();
        this.f33655o = false;
        this.f33656p = false;
    }

    private void j() {
        AbstractC5131n.f44876d.a(this.f33646f, new C5132o.a().c(this.f33657q).a(this.f33652l).b()).e(this.f33658r);
    }

    private LocationRequest k(C3164b c3164b, boolean z10) {
        LocationRequest j22 = LocationRequest.j().e2(c3164b.c()).f2(c3164b.c()).j2(c3164b.b());
        int i10 = b.f33660a[c3164b.a().ordinal()];
        if (i10 == 1) {
            j22.i2(100);
        } else if (i10 == 2) {
            j22.i2(102);
        } else if (i10 == 3) {
            j22.i2(104);
        } else if (i10 == 4) {
            j22.i2(105);
        }
        if (z10) {
            j22.h2(1);
        }
        return j22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(LocationRequest locationRequest) {
        if (this.f33655o && !this.f33656p) {
            this.f33647g.a("startUpdating wont be executed for now, as we have to test the location settings before", new Object[0]);
            j();
        } else if (!this.f33646f.l()) {
            this.f33647g.c("startUpdating executed without the GoogleApiClient being connected!!", new Object[0]);
        } else if (androidx.core.content.a.a(this.f33653m, "android.permission.ACCESS_FINE_LOCATION") == 0 || androidx.core.content.a.a(this.f33653m, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            AbstractC5131n.f44874b.b(this.f33646f, locationRequest, this, Looper.getMainLooper()).e(this);
        } else {
            this.f33647g.d("Permission check failed. Please handle it in your app before setting up location", new Object[0]);
        }
    }

    @Override // ec.InterfaceC3119a
    public void a(Context context, InterfaceC3364b interfaceC3364b) {
        this.f33647g = interfaceC3364b;
        this.f33653m = context;
        this.f33651k = new C3120b(context);
        if (this.f33649i) {
            interfaceC3364b.a("already started", new Object[0]);
            return;
        }
        h d10 = new h.a(context).a(AbstractC5131n.f44873a).b(this).c(this).d();
        this.f33646f = d10;
        d10.d();
    }

    @Override // ec.InterfaceC3119a
    public Location b() {
        h hVar = this.f33646f;
        if (hVar != null && hVar.l()) {
            if (androidx.core.content.a.a(this.f33653m, "android.permission.ACCESS_FINE_LOCATION") != 0 && androidx.core.content.a.a(this.f33653m, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                return null;
            }
            Location c10 = AbstractC5131n.f44874b.c(this.f33646f);
            if (c10 != null) {
                return c10;
            }
        }
        C3120b c3120b = this.f33651k;
        if (c3120b != null) {
            return c3120b.a("GMS");
        }
        return null;
    }

    @Override // ec.InterfaceC3119a
    public void d(InterfaceC1672b interfaceC1672b, C3164b c3164b, boolean z10) {
        this.f33648h = interfaceC1672b;
        if (interfaceC1672b == null) {
            this.f33647g.a("Listener is null, you sure about this?", new Object[0]);
        }
        this.f33652l = k(c3164b, z10);
        if (this.f33646f.l()) {
            m(this.f33652l);
            return;
        }
        if (!this.f33650j) {
            this.f33649i = true;
            this.f33647g.a("still not connected - scheduled start when connection is ok", new Object[0]);
        } else {
            this.f33649i = true;
            this.f33646f.d();
            this.f33650j = false;
        }
    }

    @Override // S6.p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void c(Status status) {
        if (status.Z0()) {
            this.f33647g.a("Locations update request successful", new Object[0]);
            return;
        }
        if (status.I() && (this.f33653m instanceof Activity)) {
            this.f33647g.c("Unable to register, but we can solve this - will startActivityForResult. You should hook into the Activity onActivityResult and call this provider's onActivityResult method for continuing this call flow.", new Object[0]);
            try {
                status.a1((Activity) this.f33653m, 10001);
                return;
            } catch (IntentSender.SendIntentException e10) {
                this.f33647g.e(e10, "problem with startResolutionForResult", new Object[0]);
                return;
            }
        }
        this.f33647g.b("Registering failed: " + status.F(), new Object[0]);
    }

    public void n() {
        this.f33647g.a("stop", new Object[0]);
        if (this.f33646f.l()) {
            AbstractC5131n.f44874b.a(this.f33646f, this);
            this.f33646f.e();
        }
        this.f33656p = false;
        this.f33649i = false;
        this.f33650j = true;
    }

    @Override // T6.InterfaceC1169e
    public void onConnected(Bundle bundle) {
        this.f33647g.a("onConnected", new Object[0]);
        if (this.f33649i) {
            m(this.f33652l);
        }
        InterfaceC3363a interfaceC3363a = this.f33654n;
        if (interfaceC3363a != null) {
            interfaceC3363a.onConnected(bundle);
        }
    }

    @Override // T6.InterfaceC1184n
    public void onConnectionFailed(C2010b c2010b) {
        this.f33647g.a("onConnectionFailed " + c2010b.toString(), new Object[0]);
        InterfaceC3363a interfaceC3363a = this.f33654n;
        if (interfaceC3363a != null) {
            interfaceC3363a.onConnectionFailed(c2010b);
        }
    }

    @Override // T6.InterfaceC1169e
    public void onConnectionSuspended(int i10) {
        this.f33647g.a("onConnectionSuspended " + i10, new Object[0]);
        InterfaceC3363a interfaceC3363a = this.f33654n;
        if (interfaceC3363a != null) {
            interfaceC3363a.onConnectionSuspended(i10);
        }
    }

    @Override // x7.InterfaceC5130m
    public void onLocationChanged(Location location) {
        this.f33647g.a("onLocationChanged", location);
        InterfaceC1672b interfaceC1672b = this.f33648h;
        if (interfaceC1672b != null) {
            interfaceC1672b.a(location);
        }
        if (this.f33651k != null) {
            this.f33647g.a("Stored in SharedPreferences", new Object[0]);
            this.f33651k.c("GMS", location);
        }
    }

    public C3217a(InterfaceC3363a interfaceC3363a) {
        this();
        this.f33654n = interfaceC3363a;
    }
}
