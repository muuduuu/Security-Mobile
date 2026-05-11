package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H%¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00128\u0005@\u0004X\u0085\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/appsflyer/internal/AFi1qSDK;", BuildConfig.FLAVOR, "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "AFAdRevenueData", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFi1rSDK;", "getMonetizationNetwork", "()Lcom/appsflyer/internal/AFi1rSDK;", "Landroid/net/NetworkInfo;", BuildConfig.FLAVOR, "v_", "(Landroid/net/NetworkInfo;)Z", "getMediationNetwork", "()Z", "Landroid/net/ConnectivityManager;", "getCurrencyIso4217Code", "Landroid/net/ConnectivityManager;", "Landroid/telephony/TelephonyManager;", "getRevenue", "Landroid/telephony/TelephonyManager;", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFi1qSDK {

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    ConnectivityManager getMonetizationNetwork;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    private final TelephonyManager getMediationNetwork;

    public AFi1qSDK(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("connectivity");
        this.getMonetizationNetwork = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Object systemService2 = context.getSystemService("phone");
        this.getMediationNetwork = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    protected static boolean v_(NetworkInfo p02) {
        if (p02 != null) {
            return p02.isConnectedOrConnecting();
        }
        return false;
    }

    protected abstract String AFAdRevenueData();

    public abstract boolean getMediationNetwork();

    public final AFi1rSDK getMonetizationNetwork() {
        Throwable th;
        String str;
        String str2;
        String str3 = null;
        try {
            TelephonyManager telephonyManager = this.getMediationNetwork;
            if (telephonyManager != null) {
                str2 = telephonyManager.getSimOperatorName();
                try {
                    str3 = telephonyManager.getNetworkOperatorName();
                    if (str3 != null) {
                        if (str3.length() == 0) {
                        }
                    }
                    if (telephonyManager.getPhoneType() == 2) {
                        str3 = "CDMA";
                    }
                } catch (Throwable th2) {
                    str = str3;
                    str3 = str2;
                    th = th2;
                    AFLogger.afErrorLog("Exception while collecting network info. ", th);
                    str2 = str3;
                    str3 = str;
                    return new AFi1rSDK(AFAdRevenueData(), str3, str2, getMediationNetwork());
                }
            } else {
                str2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
        }
        return new AFi1rSDK(AFAdRevenueData(), str3, str2, getMediationNetwork());
    }
}
