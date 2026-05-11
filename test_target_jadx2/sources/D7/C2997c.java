package d7;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.m;

/* renamed from: d7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2997c {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f31277a;

    public C2997c(Context context) {
        this.f31277a = context;
    }

    public int a(String str) {
        return this.f31277a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f31277a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i10) {
        return this.f31277a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence d(String str) {
        Context context = this.f31277a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo e(String str, int i10) {
        return this.f31277a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean f() {
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return AbstractC2995a.a(this.f31277a);
        }
        if (!m.e()) {
            return false;
        }
        Context context = this.f31277a;
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid == null) {
            return false;
        }
        isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    public final boolean g(int i10, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f31277a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
