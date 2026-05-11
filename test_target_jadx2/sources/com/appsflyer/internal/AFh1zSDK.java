package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class AFh1zSDK extends AFh1ySDK {
    private final AFd1zSDK getMediationNetwork;

    public AFh1zSDK(AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getMediationNetwork = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z12) {
            if (StringsKt.Z(str)) {
                str = "missing label";
            }
            this.getMediationNetwork.afErrorLogForExcManagerOnly().getMonetizationNetwork(th, withTag$SDK_prodRelease(str, aFg1cSDK));
        }
    }
}
