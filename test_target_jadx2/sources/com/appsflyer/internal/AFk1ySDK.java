package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFk1ySDK implements AFk1zSDK {
    @Override // com.appsflyer.internal.AFk1zSDK
    public final String getMediationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String format = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
