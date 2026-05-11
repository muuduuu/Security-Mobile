package F8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import j8.C3508b;
import x8.C5133a;
import x8.InterfaceC5135c;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2645a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f2646b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5135c f2647c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2648d;

    public a(Context context, String str, InterfaceC5135c interfaceC5135c) {
        Context a10 = a(context);
        this.f2645a = a10;
        this.f2646b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f2647c = interfaceC5135c;
        this.f2648d = c();
    }

    private static Context a(Context context) {
        return androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f2646b.contains("firebase_data_collection_default_enabled") ? this.f2646b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f2645a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f2645a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z10) {
        if (this.f2648d != z10) {
            this.f2648d = z10;
            this.f2647c.d(new C5133a(C3508b.class, new C3508b(z10)));
        }
    }

    public synchronized boolean b() {
        return this.f2648d;
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.f2646b.edit().remove("firebase_data_collection_default_enabled").apply();
                f(d());
            } else {
                boolean equals = Boolean.TRUE.equals(bool);
                this.f2646b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
                f(equals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
