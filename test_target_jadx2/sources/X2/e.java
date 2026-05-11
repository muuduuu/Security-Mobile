package x2;

import android.content.Context;
import android.util.Log;
import x2.b;

/* loaded from: classes.dex */
public class e implements c {
    @Override // x2.c
    public b a(Context context, b.a aVar) {
        boolean z10 = androidx.core.content.a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new d(context, aVar) : new n();
    }
}
