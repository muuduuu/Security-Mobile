package F9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2649a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2650b;

    public b(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.f2649a = ctx;
        this.f2650b = "Gobbler.DeviceInfo";
    }

    private final String k() {
        int networkType;
        Object systemService = this.f2649a.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            return "Unavailable";
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (androidx.core.content.a.a(this.f2649a, "android.permission.READ_PHONE_STATE") == 0) {
                try {
                    networkType = telephonyManager.getDataNetworkType();
                } catch (SecurityException e10) {
                    d.g(d.f2658a, this.f2650b, "Device network type " + e10.getMessage(), null, 4, null);
                }
            } else {
                d.g(d.f2658a, this.f2650b, "Missing READ_PHONE_STATE permission", null, 4, null);
            }
            networkType = 0;
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        if (networkType == 20) {
            return "5G";
        }
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return "3G";
            case 13:
                return "4G";
            default:
                return "Unknown";
        }
    }

    @Override // F9.a
    public String a() {
        try {
            Object systemService = this.f2649a.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
            return networkOperatorName == null ? BuildConfig.FLAVOR : networkOperatorName;
        } catch (Exception e10) {
            d.f2658a.f(this.f2650b, "Failed to get network operator name from network", e10);
            return BuildConfig.FLAVOR;
        }
    }

    @Override // F9.a
    public String b() {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    @Override // F9.a
    public int c() {
        try {
            return this.f2649a.getPackageManager().getPackageInfo(this.f2649a.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            d.f2658a.f(this.f2650b, "Unable to get app version code", e10);
            return 0;
        }
    }

    @Override // F9.a
    public String d() {
        String str = Build.MODEL + "-" + Build.DEVICE + "-" + Build.ID + "-" + Build.MANUFACTURER;
        try {
            String string = Settings.Secure.getString(this.f2649a.getContentResolver(), "android_id");
            if (string != null && string.length() != 0) {
                Intrinsics.d(string);
                return string;
            }
            return str;
        } catch (Exception e10) {
            d.f2658a.f(this.f2650b, "Failed to get secure ANDROID_ID", e10);
            return str;
        }
    }

    @Override // F9.a
    public String e() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.b(this.f2649a, ((b) obj).f2649a);
    }

    @Override // F9.a
    public String f() {
        return k();
    }

    @Override // F9.a
    public String g() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    @Override // F9.a
    public String h() {
        try {
            String versionName = this.f2649a.getPackageManager().getPackageInfo(this.f2649a.getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
            return versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            d.f2658a.f(this.f2650b, "Unable to get app version name", e10);
            return BuildConfig.FLAVOR;
        }
    }

    public int hashCode() {
        return this.f2649a.hashCode();
    }

    @Override // F9.a
    public String i() {
        return "3.12.2";
    }

    @Override // F9.a
    public String j() {
        return "Android";
    }

    public String toString() {
        return "DeviceInfoImpl(ctx=" + this.f2649a + ")";
    }
}
