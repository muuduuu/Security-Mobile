package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import io.sentry.ILogger;
import io.sentry.K1;
import io.sentry.android.core.N;

/* loaded from: classes2.dex */
public abstract class d {

    public enum a {
        CONNECTED,
        NOT_CONNECTED,
        NO_PERMISSION,
        UNKNOWN
    }

    private static a a(Context context, ConnectivityManager connectivityManager, ILogger iLogger) {
        if (!k.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(K1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return a.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? a.CONNECTED : a.NOT_CONNECTED;
            }
            iLogger.c(K1.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return a.NOT_CONNECTED;
        } catch (Throwable th) {
            iLogger.b(K1.ERROR, "Could not retrieve Connection Status", th);
            return a.UNKNOWN;
        }
    }

    public static a b(Context context, ILogger iLogger) {
        ConnectivityManager e10 = e(context, iLogger);
        return e10 == null ? a.UNKNOWN : a(context, e10, iLogger);
    }

    public static String c(Context context, ILogger iLogger, N n10) {
        boolean z10;
        boolean z11;
        ConnectivityManager e10 = e(context, iLogger);
        if (e10 == null) {
            return null;
        }
        boolean z12 = false;
        if (!k.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(K1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            z10 = true;
            if (n10.d() >= 23) {
                Network activeNetwork = e10.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.c(K1.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = e10.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.c(K1.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean hasTransport = networkCapabilities.hasTransport(3);
                z11 = networkCapabilities.hasTransport(1);
                z10 = networkCapabilities.hasTransport(0);
                z12 = hasTransport;
            } else {
                NetworkInfo activeNetworkInfo = e10.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.c(K1.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    z11 = false;
                } else if (type != 1) {
                    if (type != 9) {
                        z11 = false;
                    } else {
                        z11 = false;
                        z12 = true;
                    }
                    z10 = z11;
                } else {
                    z11 = true;
                    z10 = false;
                }
            }
        } catch (Throwable th) {
            iLogger.b(K1.ERROR, "Failed to retrieve network info", th);
        }
        if (z12) {
            return "ethernet";
        }
        if (z11) {
            return "wifi";
        }
        if (z10) {
            return "cellular";
        }
        return null;
    }

    public static String d(NetworkCapabilities networkCapabilities, N n10) {
        if (n10.d() < 21) {
            return null;
        }
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    private static ConnectivityManager e(Context context, ILogger iLogger) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            iLogger.c(K1.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
        }
        return connectivityManager;
    }

    public static boolean f(Context context, ILogger iLogger, N n10, ConnectivityManager.NetworkCallback networkCallback) {
        if (n10.d() < 24) {
            iLogger.c(K1.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager e10 = e(context, iLogger);
        if (e10 == null) {
            return false;
        }
        if (!k.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(K1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            e10.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th) {
            iLogger.b(K1.ERROR, "registerDefaultNetworkCallback failed", th);
            return false;
        }
    }

    public static void g(Context context, ILogger iLogger, N n10, ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager e10;
        if (n10.d() >= 21 && (e10 = e(context, iLogger)) != null) {
            try {
                e10.unregisterNetworkCallback(networkCallback);
            } catch (Throwable th) {
                iLogger.b(K1.ERROR, "unregisterNetworkCallback failed", th);
            }
        }
    }
}
