package co.hyperverge.hypersnapsdk.service;

import android.util.Log;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HVSignatureService {
    private static final String TAG = "co.hyperverge.hypersnapsdk.service.HVSignatureService";

    public static TreeMap<String, Object> convertJSONObjToMap(JSONObject jSONObject) {
        Object obj;
        HVLogUtils.d(TAG, "convertJSONObjToMap() called with: jObject = [" + jSONObject + "]");
        TreeMap<String, Object> treeMap = new TreeMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                obj = jSONObject.get(next);
            } catch (JSONException e10) {
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
                obj = null;
            }
            treeMap.put(next, obj);
        }
        return treeMap;
    }

    private static String getParsedString(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\t", "\\t").replace("\r", "\\r").replace("\b", "\\b").replace("\f", "\\f");
    }

    private static Object sortJSONArray(Object obj) {
        HVLogUtils.d(TAG, "sortJSONArray() called with: value = [" + obj + "]");
        try {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < jSONArray.length()) {
                Object obj2 = jSONArray.get(i10);
                if (!(obj2 instanceof JSONObject)) {
                    return obj;
                }
                arrayList.add(sortJSONKeysAlphabetically(convertJSONObjToMap((JSONObject) obj2)));
                i10++;
                z10 = true;
            }
            if (!z10) {
                return obj;
            }
            String str = "[";
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                str = str.concat(String.valueOf(arrayList.get(i11)));
                if (i11 < arrayList.size() - 1) {
                    str = str.concat(",");
                }
            }
            return str.concat("]");
        } catch (JSONException e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return obj;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return obj;
        }
    }

    public static String sortJSONKeysAlphabetically(TreeMap<String, Object> treeMap) {
        HVLogUtils.d(TAG, "sortJSONKeysAlphabetically() called with: map = [" + treeMap + "]");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(BuildConfig.FLAVOR);
        sb2.append("{");
        String sb3 = sb2.toString();
        try {
            for (String str : treeMap.keySet()) {
                if (!sb3.equals("{")) {
                    sb3 = sb3 + ",";
                }
                Object obj = treeMap.get(str);
                if (obj instanceof JSONObject) {
                    obj = sortJSONKeysAlphabetically(convertJSONObjToMap((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    obj = sortJSONArray(obj);
                } else if (obj instanceof String) {
                    obj = "\"" + getParsedString((String) obj) + "\"";
                }
                sb3 = sb3 + "\"" + str + "\":" + obj;
            }
            return sb3 + "}";
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            return null;
        }
    }
}
