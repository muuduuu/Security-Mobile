package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1uSDK {
    public AFe1pSDK AFAdRevenueData;
    private byte[] component4;
    String getCurrencyIso4217Code;
    public String getMediationNetwork;
    public Map<String, String> getMonetizationNetwork;
    public String getRevenue;

    public AFc1uSDK(String str, byte[] bArr, String str2, AFe1pSDK aFe1pSDK, Map<String, String> map) {
        this.getRevenue = str;
        this.component4 = bArr;
        this.getCurrencyIso4217Code = str2;
        this.AFAdRevenueData = aFe1pSDK;
        this.getMonetizationNetwork = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFc1uSDK.class == obj.getClass()) {
            AFc1uSDK aFc1uSDK = (AFc1uSDK) obj;
            if (Objects.equals(this.getCurrencyIso4217Code, aFc1uSDK.getCurrencyIso4217Code) && Arrays.equals(this.component4, aFc1uSDK.component4) && Objects.equals(this.getRevenue, aFc1uSDK.getRevenue) && Objects.equals(this.getMediationNetwork, aFc1uSDK.getMediationNetwork) && Objects.equals(this.getMonetizationNetwork, aFc1uSDK.getMonetizationNetwork) && this.AFAdRevenueData == aFc1uSDK.AFAdRevenueData) {
                return true;
            }
        }
        return false;
    }

    public final byte[] getMediationNetwork() {
        return this.component4;
    }

    public final int hashCode() {
        String str = this.getCurrencyIso4217Code;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.component4)) * 31;
        String str2 = this.getRevenue;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMediationNetwork;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFe1pSDK aFe1pSDK = this.AFAdRevenueData;
        int hashCode4 = (hashCode3 + (aFe1pSDK != null ? aFe1pSDK.hashCode() : 0)) * 31;
        Map<String, String> map = this.getMonetizationNetwork;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public AFc1uSDK(char[] cArr) {
        String nextLine;
        Map<String, String> map;
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            try {
                nextLine = scanner.nextLine();
            } catch (Throwable th) {
                try {
                    scanner.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            if (nextLine.startsWith("url=")) {
                this.getRevenue = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.getCurrencyIso4217Code = nextLine.substring(8).trim();
            } else {
                if (nextLine.startsWith("headers=")) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(nextLine.substring(8).trim(), 2), Charset.defaultCharset()));
                        Intrinsics.checkNotNullParameter(jSONObject, "");
                        if (jSONObject.length() == 0) {
                            map = kotlin.collections.G.h();
                        } else {
                            Iterator<String> keys = jSONObject.keys();
                            Intrinsics.checkNotNullExpressionValue(keys, "");
                            Sequence c10 = kotlin.sequences.j.c(keys);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj : c10) {
                                Object obj2 = jSONObject.get((String) obj);
                                linkedHashMap.put(obj, Intrinsics.b(obj2, JSONObject.NULL) ? "null" : obj2.toString());
                            }
                            map = linkedHashMap;
                        }
                        this.getMonetizationNetwork = map;
                    } catch (Exception e10) {
                        AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error parsing headers", e10);
                        this.getMonetizationNetwork = new HashMap();
                    }
                } else if (nextLine.startsWith("data=")) {
                    this.component4 = Base64.decode(nextLine.substring(5).trim(), 2);
                } else if (nextLine.startsWith("type=")) {
                    String trim = nextLine.substring(5).trim();
                    try {
                        this.AFAdRevenueData = AFe1pSDK.valueOf(trim);
                    } catch (Exception e11) {
                        AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Unknown task type: ".concat(String.valueOf(trim)), e11);
                    }
                }
                scanner.close();
                throw th;
            }
        }
        scanner.close();
    }
}
