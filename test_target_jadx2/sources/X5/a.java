package X5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a {
    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
        if (installedApplications != null) {
            for (ApplicationInfo applicationInfo : installedApplications) {
                try {
                    String[] strArr = packageManager.getPackageInfo(applicationInfo.packageName, 4096).requestedPermissions;
                    if (strArr != null) {
                        for (String str : strArr) {
                            if (str.equals("android.permission.ACCESS_MOCK_LOCATION") && !applicationInfo.packageName.equals(context.getPackageName())) {
                                return true;
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.e("Mock location check error", e10.getMessage());
                }
            }
        }
        return false;
    }
}
