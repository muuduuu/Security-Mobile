package B1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Intrinsics;
import v0.AbstractC4907a;
import z1.C5239c;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f431a;

    static {
        String i10 = x1.n.i("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"NetworkStateTracker\")");
        f431a = i10;
    }

    public static final h a(Context context, E1.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new j(context, taskExecutor);
    }

    public static final C5239c c(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean d10 = d(connectivityManager);
        boolean a10 = AbstractC4907a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z10 = true;
        }
        return new C5239c(z11, d10, a10, z10);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities a10 = D1.m.a(connectivityManager, D1.n.a(connectivityManager));
            if (a10 != null) {
                return D1.m.b(a10, 16);
            }
            return false;
        } catch (SecurityException e10) {
            x1.n.e().d(f431a, "Unable to validate active network", e10);
            return false;
        }
    }
}
