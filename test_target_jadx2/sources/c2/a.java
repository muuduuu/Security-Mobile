package C2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import i2.f;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap f869a = new ConcurrentHashMap();

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
            return null;
        }
    }

    private static String b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    public static f c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap concurrentMap = f869a;
        f fVar = (f) concurrentMap.get(packageName);
        if (fVar != null) {
            return fVar;
        }
        f d10 = d(context);
        f fVar2 = (f) concurrentMap.putIfAbsent(packageName, d10);
        return fVar2 == null ? d10 : fVar2;
    }

    private static f d(Context context) {
        return new c(b(a(context)));
    }
}
