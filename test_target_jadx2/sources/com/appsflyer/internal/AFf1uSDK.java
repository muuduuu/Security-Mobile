package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFf1uSDK extends AFe1fSDK<String> {
    private final AFh1gSDK component2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFf1uSDK(AFh1gSDK aFh1gSDK, AFd1zSDK aFd1zSDK) {
        super(r2, r3, aFd1zSDK, r0.toString(), aFh1gSDK.component3);
        AFe1pSDK aFe1pSDK = aFh1gSDK.hashCode;
        AFe1pSDK aFe1pSDK2 = aFe1pSDK == null ? AFe1pSDK.CACHED_EVENT : aFe1pSDK;
        AFe1pSDK[] aFe1pSDKArr = {AFe1pSDK.RC_CDN};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aFh1gSDK.component3);
        sb2.append("-");
        sb2.append(getRevenue(aFh1gSDK));
        this.component2 = aFh1gSDK;
    }

    private boolean copy() {
        ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
        boolean z10 = this.getMonetizationNetwork == AFe1uSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1pSDK aFe1pSDK = this.getRevenue;
        return z10 && (aFe1pSDK == AFe1pSDK.CONVERSION || aFe1pSDK == AFe1pSDK.ATTR);
    }

    private boolean equals() {
        ResponseNetwork responseNetwork;
        AFe1pSDK aFe1pSDK = this.component2.hashCode;
        if (aFe1pSDK == null) {
            aFe1pSDK = AFe1pSDK.CACHED_EVENT;
        }
        return aFe1pSDK == AFe1pSDK.ARS_VALIDATE && (responseNetwork = ((AFe1fSDK) this).areAllFieldsValid) != null && responseNetwork.getStatusCode() == 424;
    }

    private static String getRevenue(AFh1gSDK aFh1gSDK) {
        try {
            return new URL(aFh1gSDK.component2).getHost();
        } catch (MalformedURLException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AFd1hSDK<String> AFAdRevenueData(String str) {
        String encodeToString = Base64.encodeToString(this.component2.getMonetizationNetwork(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        this.component3.getRevenue(this.component2.component2, encodeToString);
        return ((AFe1fSDK) this).component4.getRevenue(this.component2);
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AppsFlyerRequestListener component2() {
        return this.component2.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return super.getMonetizationNetwork() || equals() || copy();
    }
}
