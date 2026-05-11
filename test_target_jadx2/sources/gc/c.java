package gc;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import bc.InterfaceC1672b;
import ec.C3120b;
import ec.InterfaceC3119a;
import fc.C3164b;
import fc.EnumC3163a;
import ic.InterfaceC3364b;

/* loaded from: classes2.dex */
public class c implements InterfaceC3119a, LocationListener {

    /* renamed from: f, reason: collision with root package name */
    private LocationManager f33668f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC1672b f33669g;

    /* renamed from: h, reason: collision with root package name */
    private C3120b f33670h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC3364b f33671i;

    /* renamed from: j, reason: collision with root package name */
    private Context f33672j;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33673a;

        static {
            int[] iArr = new int[EnumC3163a.values().length];
            f33673a = iArr;
            try {
                iArr[EnumC3163a.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33673a[EnumC3163a.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33673a[EnumC3163a.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33673a[EnumC3163a.LOWEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private Criteria c(C3164b c3164b) {
        EnumC3163a a10 = c3164b.a();
        Criteria criteria = new Criteria();
        int i10 = a.f33673a[a10.ordinal()];
        if (i10 == 1) {
            criteria.setAccuracy(1);
            criteria.setHorizontalAccuracy(3);
            criteria.setVerticalAccuracy(3);
            criteria.setBearingAccuracy(3);
            criteria.setSpeedAccuracy(3);
            criteria.setPowerRequirement(3);
        } else if (i10 != 2) {
            criteria.setAccuracy(2);
            criteria.setHorizontalAccuracy(1);
            criteria.setVerticalAccuracy(1);
            criteria.setBearingAccuracy(1);
            criteria.setSpeedAccuracy(1);
            criteria.setPowerRequirement(1);
        } else {
            criteria.setAccuracy(2);
            criteria.setHorizontalAccuracy(2);
            criteria.setVerticalAccuracy(2);
            criteria.setBearingAccuracy(2);
            criteria.setSpeedAccuracy(2);
            criteria.setPowerRequirement(2);
        }
        return criteria;
    }

    @Override // ec.InterfaceC3119a
    public void a(Context context, InterfaceC3364b interfaceC3364b) {
        this.f33668f = (LocationManager) context.getSystemService("location");
        this.f33671i = interfaceC3364b;
        this.f33672j = context;
        this.f33670h = new C3120b(context);
    }

    @Override // ec.InterfaceC3119a
    public Location b() {
        if (this.f33668f != null) {
            if (androidx.core.content.a.a(this.f33672j, "android.permission.ACCESS_FINE_LOCATION") != 0 && androidx.core.content.a.a(this.f33672j, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                return null;
            }
            Location lastKnownLocation = this.f33668f.getLastKnownLocation("gps");
            if (lastKnownLocation != null) {
                return lastKnownLocation;
            }
        }
        Location a10 = this.f33670h.a("LMP");
        if (a10 != null) {
            return a10;
        }
        return null;
    }

    @Override // ec.InterfaceC3119a
    public void d(InterfaceC1672b interfaceC1672b, C3164b c3164b, boolean z10) {
        this.f33669g = interfaceC1672b;
        if (interfaceC1672b == null) {
            this.f33671i.a("Listener is null, you sure about this?", new Object[0]);
        }
        Criteria c10 = c(c3164b);
        if (!z10) {
            this.f33668f.requestLocationUpdates(c3164b.c(), c3164b.b(), c10, this, Looper.getMainLooper());
        } else if (androidx.core.content.a.a(this.f33672j, "android.permission.ACCESS_FINE_LOCATION") == 0 || androidx.core.content.a.a(this.f33672j, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f33668f.requestSingleUpdate(c10, this, Looper.getMainLooper());
        } else {
            this.f33671i.d("Permission check failed. Please handle it in your app before setting up location", new Object[0]);
        }
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        this.f33671i.a("onLocationChanged", location);
        InterfaceC1672b interfaceC1672b = this.f33669g;
        if (interfaceC1672b != null) {
            interfaceC1672b.a(location);
        }
        if (this.f33670h != null) {
            this.f33671i.a("Stored in SharedPreferences", new Object[0]);
            this.f33670h.c("LMP", location);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
