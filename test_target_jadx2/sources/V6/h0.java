package V6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import d7.C2998d;

/* loaded from: classes2.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f10967a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f10968b;

    /* renamed from: c, reason: collision with root package name */
    private static String f10969c;

    /* renamed from: d, reason: collision with root package name */
    private static int f10970d;

    public static int a(Context context) {
        b(context);
        return f10970d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f10967a) {
            try {
                if (f10968b) {
                    return;
                }
                f10968b = true;
                try {
                    bundle = C2998d.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
                if (bundle == null) {
                    return;
                }
                f10969c = bundle.getString("com.google.app.id");
                f10970d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
