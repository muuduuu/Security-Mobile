package sa;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sa.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4508b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return packageInfo.versionCode;
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return longVersionCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageInfo d(PackageManager packageManager, String str, int i10) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.PackageInfoFlags.of(i10);
                packageInfo = packageManager.getPackageInfo(str, of);
            } else {
                packageInfo = packageManager.getPackageInfo(str, i10);
            }
            Intrinsics.d(packageInfo);
            return packageInfo;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new C4509c(e10);
        }
    }
}
