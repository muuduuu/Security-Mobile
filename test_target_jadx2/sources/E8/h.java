package e8;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class h {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
