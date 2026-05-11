package d7;

import android.content.Context;
import com.google.android.gms.common.util.m;

/* renamed from: d7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2995a {

    /* renamed from: a, reason: collision with root package name */
    private static Context f31275a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f31276b;

    public static synchronized boolean a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (AbstractC2995a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f31275a;
            if (context2 != null && (bool = f31276b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f31276b = null;
            if (m.e()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f31276b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f31276b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f31276b = Boolean.FALSE;
                }
            }
            f31275a = applicationContext;
            return f31276b.booleanValue();
        }
    }
}
