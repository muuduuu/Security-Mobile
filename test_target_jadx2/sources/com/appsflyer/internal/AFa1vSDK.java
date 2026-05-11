package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFa1vSDK;", BuildConfig.FLAVOR, "<init>", "()V", "Lcom/appsflyer/internal/AFc1hSDK;", "p0", "Lcom/appsflyer/internal/AFc1oSDK;", "p1", BuildConfig.FLAVOR, "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFc1hSDK;Lcom/appsflyer/internal/AFc1oSDK;)V", BuildConfig.FLAVOR, "()Ljava/lang/String;", "getCurrencyIso4217Code"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFa1vSDK {
    public static final AFa1vSDK INSTANCE = new AFa1vSDK();

    private AFa1vSDK() {
    }

    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }

    public static final void getMonetizationNetwork(AFc1hSDK p02, AFc1oSDK p12) {
        int i10;
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFj1kSDK.getRevenue()) {
            AFLogger.afRDLog("OPPO device found");
            i10 = 23;
        } else {
            i10 = 18;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < i10 || appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog("OS SDK is=" + i11 + "; no KeyStore usage");
            return;
        }
        AFLogger.afRDLog("OS SDK is=" + i11 + "; use KeyStore");
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p02.getMonetizationNetwork);
        if (aFKeystoreWrapper.AFAdRevenueData()) {
            String monetizationNetwork = aFKeystoreWrapper.getMonetizationNetwork();
            synchronized (aFKeystoreWrapper.getMediationNetwork) {
                aFKeystoreWrapper.AFAdRevenueData++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(monetizationNetwork)));
                try {
                    synchronized (aFKeystoreWrapper.getMediationNetwork) {
                        aFKeystoreWrapper.getMonetizationNetwork.deleteEntry(monetizationNetwork);
                    }
                } catch (KeyStoreException e10) {
                    StringBuilder sb2 = new StringBuilder("Exception ");
                    sb2.append(e10.getMessage());
                    sb2.append(" occurred");
                    AFLogger.afErrorLog(sb2.toString(), e10);
                }
            }
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getMonetizationNetwork());
        } else {
            aFKeystoreWrapper.getCurrencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(p12.getMediationNetwork);
            aFKeystoreWrapper.AFAdRevenueData = 0;
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getMonetizationNetwork());
        }
        appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.getCurrencyIso4217Code());
        appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.getRevenue()));
    }

    public static String getMonetizationNetwork() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }
}
