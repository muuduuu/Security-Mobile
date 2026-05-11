package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class n0 {
    public static p0 a(String str, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, Context context) {
        Map<String, Object> map4;
        StringBuilder sb2;
        Map<String, Object> map5;
        Map<String, Object> map6 = null;
        if (str == null) {
            return null;
        }
        p0 p0Var = new p0();
        p0Var.c(WebEngageUtils.a(str, 50));
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("sdk_id", 2);
        map.put("sdk_version", Double.valueOf(42101.0d));
        map.put("app_id", context.getApplicationContext().getPackageName());
        try {
            map4 = (Map) DataType.cloneExternal(str, map);
        } catch (Exception unused) {
            map4 = null;
        }
        p0Var.c(map4);
        if (map2 == null) {
            map2 = new HashMap<>();
            sb2 = new StringBuilder();
            sb2.append("Processing event: ");
            sb2.append(str);
        } else {
            sb2 = new StringBuilder();
            sb2.append("Processing event: ");
            sb2.append(str);
            sb2.append(", data: ");
            sb2.append(map2);
        }
        Logger.d("WebEngage", sb2.toString());
        try {
            map5 = (Map) DataType.cloneExternal(str, map2);
        } catch (Exception unused2) {
            map5 = null;
        }
        if (map3 != null) {
            try {
                map6 = (Map) DataType.cloneExternal(str, map3);
            } catch (Exception unused3) {
            }
        }
        p0Var.a(map5);
        p0Var.b("application");
        p0Var.b(map6);
        return p0Var;
    }

    public static p0 b(String str, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, Context context) {
        StringBuilder sb2;
        StringBuilder sb3;
        String sb4;
        Map<String, Object> map4;
        Map<String, Object> map5 = null;
        if (str == null) {
            return null;
        }
        p0 p0Var = new p0();
        p0Var.c(WebEngageUtils.a(str, 50));
        if (map == null) {
            map = new HashMap<>();
            if (map2 == null || map2.isEmpty()) {
                sb3 = new StringBuilder();
                sb3.append("Processing event: ");
                sb3.append(str);
                sb4 = sb3.toString();
            } else {
                sb2 = new StringBuilder();
                sb2.append("Processing event: ");
                sb2.append(str);
                sb2.append(", data: ");
                sb2.append(map2);
                sb4 = sb2.toString();
            }
        } else if (map2 == null || map2.isEmpty()) {
            sb2 = new StringBuilder();
            sb2.append("Processing event: ");
            sb2.append(str);
            sb2.append(", data: ");
            sb2.append(map);
            sb4 = sb2.toString();
        } else {
            sb3 = new StringBuilder();
            sb3.append("Processing event: ");
            sb3.append(str);
            sb3.append(", system-data: ");
            sb3.append(map);
            sb3.append(", event-data: ");
            sb3.append(map2);
            sb4 = sb3.toString();
        }
        Logger.d("WebEngage", sb4);
        map.put("sdk_id", 2);
        map.put("sdk_version", Double.valueOf(42101.0d));
        map.put("app_id", context.getApplicationContext().getPackageName());
        try {
            map4 = (Map) DataType.cloneExternal(str, map);
        } catch (Exception unused) {
            map4 = null;
        }
        p0Var.c(map4);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        try {
            map5 = (Map) DataType.cloneExternal(str, map2);
        } catch (Exception unused2) {
        }
        p0Var.a(map5);
        p0Var.b("system");
        p0Var.b(map3);
        return p0Var;
    }
}
