package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFd1pSDK {
    public static boolean getCurrencyIso4217Code(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int mediationNetwork = AFk1xSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFk1xSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> AFAdRevenueData = AFd1rSDK.AFAdRevenueData(str2);
        return (mediationNetwork2 == -1 || monetizationNetwork != null) ? AFAdRevenueData != null ? ((Number) AFAdRevenueData.c()).intValue() <= mediationNetwork && mediationNetwork <= ((Number) AFAdRevenueData.d()).intValue() : monetizationNetwork != null && ((Number) monetizationNetwork.c()).intValue() <= mediationNetwork && mediationNetwork <= ((Number) monetizationNetwork.d()).intValue() : mediationNetwork2 == mediationNetwork;
    }
}
