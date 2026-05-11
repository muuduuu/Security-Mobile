package hc;

import android.content.Context;
import android.location.LocationManager;
import android.provider.Settings;

/* renamed from: hc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3304a {

    /* renamed from: c, reason: collision with root package name */
    private static C3304a f34051c;

    /* renamed from: a, reason: collision with root package name */
    private Context f34052a;

    /* renamed from: b, reason: collision with root package name */
    private LocationManager f34053b;

    private C3304a(Context context) {
        this.f34052a = context;
        this.f34053b = (LocationManager) context.getSystemService("location");
    }

    public static C3304a e(Context context) {
        if (f34051c == null) {
            f34051c = new C3304a(context.getApplicationContext());
        }
        return f34051c;
    }

    public boolean a() {
        return this.f34053b.isProviderEnabled("gps");
    }

    public boolean b() {
        return this.f34053b.isProviderEnabled("network");
    }

    public boolean c() {
        return this.f34053b.isProviderEnabled("passive");
    }

    public boolean d() {
        int i10;
        try {
            i10 = Settings.Secure.getInt(this.f34052a.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException unused) {
            i10 = 0;
        }
        return i10 != 0;
    }
}
