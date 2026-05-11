package com.appsflyer.internal;

import java.util.List;

/* loaded from: classes.dex */
public interface AFc1cSDK {
    String AFAdRevenueData(Throwable th, String str);

    void getCurrencyIso4217Code(int i10, int i11);

    boolean getCurrencyIso4217Code();

    int getMediationNetwork();

    boolean getMonetizationNetwork(String... strArr);

    List<ExceptionInfo> getRevenue();
}
