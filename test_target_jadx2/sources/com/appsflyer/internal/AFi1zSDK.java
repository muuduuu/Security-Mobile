package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFi1zSDK {
    public final AFh1aSDK getCurrencyIso4217Code;
    public AFi1xSDK getMediationNetwork;
    public final AFi1uSDK getMonetizationNetwork;

    public AFi1zSDK(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getMediationNetwork = AFAdRevenueData(jSONObject);
        this.getCurrencyIso4217Code = getMediationNetwork(jSONObject);
        this.getMonetizationNetwork = getCurrencyIso4217Code(jSONObject);
    }

    private static AFi1xSDK AFAdRevenueData(JSONObject jSONObject) {
        Object b10;
        AFi1xSDK aFi1xSDK;
        List j10;
        try {
            o.a aVar = lc.o.f37128b;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (AFAdRevenueData != null) {
                long j11 = AFAdRevenueData.getLong("ttl");
                int i10 = AFAdRevenueData.getInt("counter");
                String optString = AFAdRevenueData.optString("app_ver", BuildConfig.FLAVOR);
                String optString2 = AFAdRevenueData.optString("sdk_ver", BuildConfig.FLAVOR);
                float optDouble = (float) AFAdRevenueData.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = AFAdRevenueData.optJSONArray("tags");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        String string = optJSONArray.getString(i11);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                    }
                    j10 = arrayList;
                } else {
                    j10 = CollectionsKt.j();
                }
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                aFi1xSDK = new AFi1xSDK(j11, optDouble, j10, i10, optString, optString2);
            } else {
                aFi1xSDK = null;
            }
            b10 = lc.o.b(aFi1xSDK);
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        return (AFi1xSDK) (lc.o.f(b10) ? null : b10);
    }

    private static AFi1uSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object b10;
        try {
            o.a aVar = lc.o.f37128b;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            b10 = lc.o.b(AFAdRevenueData != null ? new AFi1uSDK(AFAdRevenueData.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        return (AFi1uSDK) (lc.o.f(b10) ? null : b10);
    }

    private static AFh1aSDK getMediationNetwork(JSONObject jSONObject) {
        Object b10;
        try {
            o.a aVar = lc.o.f37128b;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            b10 = lc.o.b(AFAdRevenueData != null ? new AFh1aSDK(AFAdRevenueData.getString("sdk_ver"), AFAdRevenueData.optInt("min", -1), AFAdRevenueData.optInt("expire", -1), AFAdRevenueData.optLong("ttl", -1L)) : null);
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        return (AFh1aSDK) (lc.o.f(b10) ? null : b10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(AFi1zSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.e(obj, "");
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        return Intrinsics.b(this.getCurrencyIso4217Code, aFi1zSDK.getCurrencyIso4217Code) && Intrinsics.b(this.getMonetizationNetwork, aFi1zSDK.getMonetizationNetwork) && Intrinsics.b(this.getMediationNetwork, aFi1zSDK.getMediationNetwork);
    }

    public final int hashCode() {
        AFh1aSDK aFh1aSDK = this.getCurrencyIso4217Code;
        int hashCode = (aFh1aSDK != null ? aFh1aSDK.hashCode() : 0) * 31;
        AFi1uSDK aFi1uSDK = this.getMonetizationNetwork;
        int hashCode2 = (hashCode + (aFi1uSDK != null ? aFi1uSDK.hashCode() : 0)) * 31;
        AFi1xSDK aFi1xSDK = this.getMediationNetwork;
        return hashCode2 + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0);
    }

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
