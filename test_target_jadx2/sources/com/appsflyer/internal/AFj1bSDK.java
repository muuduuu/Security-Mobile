package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFj1bSDK {
    private static final List<Object> getMediationNetwork(JSONArray jSONArray) {
        IntRange p10 = kotlin.ranges.d.p(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.u(p10, 10));
        Iterator it = p10.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((kotlin.collections.D) it).a());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            arrayList.add(getMediationNetwork(obj));
        }
        return arrayList;
    }

    public static final Map<String, Object> getMonetizationNetwork(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "");
        Sequence c10 = kotlin.sequences.j.c(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : c10) {
            Object obj2 = jSONObject.get((String) obj);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            linkedHashMap.put(obj, getMediationNetwork(obj2));
        }
        return linkedHashMap;
    }

    private static final Object getMediationNetwork(Object obj) {
        if (obj instanceof JSONArray) {
            return getMediationNetwork((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getMonetizationNetwork((JSONObject) obj);
        }
        if (Intrinsics.b(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
