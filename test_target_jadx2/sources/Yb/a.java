package Yb;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Ea.b f12168a;

    public a(Ea.b bVar) {
        this.f12168a = bVar;
    }

    private final Activity b() {
        Ea.b bVar = this.f12168a;
        Activity a10 = bVar != null ? bVar.a() : null;
        if (a10 != null) {
            return a10;
        }
        throw new Da.c();
    }

    private final PackageManager f() {
        PackageManager packageManager = b().getPackageManager();
        if (packageManager != null) {
            return packageManager;
        }
        throw new j();
    }

    private final List h(Intent intent) {
        List<ResolveInfo> queryIntentActivities = f().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
        return queryIntentActivities;
    }

    public final boolean a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return !h(intent).isEmpty();
    }

    public final ArrayList c() {
        Intent c10;
        c10 = b.c();
        List h10 = h(c10);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = h10.iterator();
        while (it.hasNext()) {
            String packageName = ((ResolveInfo) it.next()).activityInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            linkedHashSet.add(packageName);
        }
        return new ArrayList(linkedHashSet);
    }

    public final ArrayList d() {
        Intent d10;
        PackageManager f10 = f();
        d10 = b.d();
        List<ResolveInfo> queryIntentServices = f10.queryIntentServices(d10, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "queryIntentServices(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            String packageName = it.next().serviceInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            linkedHashSet.add(packageName);
        }
        return new ArrayList(linkedHashSet);
    }

    public final String e() {
        Intent c10;
        ActivityInfo activityInfo;
        PackageManager f10 = f();
        c10 = b.c();
        ResolveInfo resolveActivity = f10.resolveActivity(c10, 0);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
            return null;
        }
        return activityInfo.packageName;
    }

    public final String g(List list) {
        if (list == null) {
            list = c();
        }
        return androidx.browser.customtabs.c.c(b(), list);
    }

    public final void i(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        b().startActivity(intent);
    }
}
