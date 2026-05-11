package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class AFd1qSDK {
    public static final boolean getCurrencyIso4217Code(HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        return httpURLConnection.getResponseCode() / 100 == 2;
    }

    public static final JSONArray getMediationNetwork(List<ExceptionInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<ExceptionInfo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExceptionInfo) it.next()).getRevenue());
        }
        return new JSONArray((Collection) arrayList);
    }
}
