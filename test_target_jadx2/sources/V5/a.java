package V5;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes2.dex */
public abstract class a {
    public static boolean a(Context context) {
        try {
            try {
                return (context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 262144) == 262144;
            } catch (PackageManager.NameNotFoundException unused) {
                String absolutePath = context.getFilesDir().getAbsolutePath();
                if (absolutePath.startsWith("/data/")) {
                    return false;
                }
                if (!absolutePath.contains("/mnt/")) {
                    if (!absolutePath.contains("/sdcard/")) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Throwable unused2) {
            return false;
        }
    }
}
