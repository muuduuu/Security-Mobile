package Zb;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class m {
    public static void a(Object obj, WritableArray writableArray) {
        if (obj == null || obj == JSONObject.NULL) {
            writableArray.pushNull();
            return;
        }
        String name = obj.getClass().getName();
        if (name.equals("java.lang.Integer")) {
            writableArray.pushInt(((Integer) obj).intValue());
            return;
        }
        if (name.equals("java.lang.Float")) {
            writableArray.pushDouble(((Float) obj).floatValue());
            return;
        }
        if (name.equals("org.json.JSONArray$1")) {
            try {
                writableArray.pushArray(d((JSONArray) obj));
                return;
            } catch (JSONException unused) {
                writableArray.pushNull();
                return;
            }
        }
        if (name.equals("java.lang.Boolean")) {
            writableArray.pushBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (name.equals("java.lang.Long")) {
            writableArray.pushDouble(((Long) obj).longValue());
            return;
        }
        if (name.equals("java.lang.Double")) {
            writableArray.pushDouble(((Double) obj).doubleValue());
            return;
        }
        if (name.equals("java.lang.String")) {
            writableArray.pushString((String) obj);
            return;
        }
        if (name.equals("org.json.JSONObject$1")) {
            try {
                writableArray.pushMap(e((JSONObject) obj));
            } catch (JSONException unused2) {
                writableArray.pushNull();
            }
        } else {
            if (List.class.isAssignableFrom(obj.getClass())) {
                writableArray.pushArray(f((List) obj));
                return;
            }
            if (Map.class.isAssignableFrom(obj.getClass())) {
                writableArray.pushMap(h((Map) obj));
                return;
            }
            Log.d("Utils", "utils:arrayPushValue:unknownType:" + name);
            writableArray.pushNull();
        }
    }

    public static WritableMap b(Exception exc) {
        WritableMap createMap = Arguments.createMap();
        String message = exc.getMessage();
        createMap.putString(AppConstants.RETAKE_ERROR_CODE, "unknown");
        createMap.putString("nativeErrorCode", "unknown");
        createMap.putString("message", message);
        createMap.putString("nativeErrorMessage", message);
        return createMap;
    }

    public static boolean c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str;
        ComponentName componentName;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        i g10 = i.g();
        if (g10.a("android_background_activity_names")) {
            ArrayList c10 = g10.c("android_background_activity_names");
            if (c10.size() != 0) {
                List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
                if (appTasks.size() > 0) {
                    componentName = appTasks.get(0).getTaskInfo().baseActivity;
                    str = componentName.getShortClassName();
                } else {
                    str = BuildConfig.FLAVOR;
                }
                if (!BuildConfig.FLAVOR.equals(str) && c10.contains(str)) {
                    return false;
                }
            }
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                try {
                    return ((ReactContext) context).getLifecycleState() == LifecycleState.RESUMED;
                } catch (ClassCastException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public static WritableArray d(JSONArray jSONArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createArray.pushDouble(jSONArray.getDouble(i10));
            } else if (obj instanceof Number) {
                createArray.pushInt(jSONArray.getInt(i10));
            } else if (obj instanceof String) {
                createArray.pushString(jSONArray.getString(i10));
            } else if (obj instanceof JSONObject) {
                createArray.pushMap(e(jSONArray.getJSONObject(i10)));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(d(jSONArray.getJSONArray(i10)));
            } else if (obj == JSONObject.NULL) {
                createArray.pushNull();
            }
        }
        return createArray;
    }

    public static WritableMap e(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        WritableMap createMap = Arguments.createMap();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createMap.putDouble(next, jSONObject.getDouble(next));
            } else if (obj instanceof Number) {
                createMap.putInt(next, jSONObject.getInt(next));
            } else if (obj instanceof String) {
                createMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                createMap.putMap(next, e(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(next, d(jSONObject.getJSONArray(next)));
            } else if (obj == JSONObject.NULL) {
                createMap.putNull(next);
            }
        }
        return createMap;
    }

    private static WritableArray f(List list) {
        WritableArray createArray = Arguments.createArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), createArray);
        }
        return createArray;
    }

    public static void g(String str, Object obj, WritableMap writableMap) {
        if (obj == null || obj == JSONObject.NULL) {
            writableMap.putNull(str);
            return;
        }
        String name = obj.getClass().getName();
        if (name.equals("java.lang.Integer")) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (name.equals("java.lang.Float")) {
            writableMap.putDouble(str, ((Float) obj).floatValue());
            return;
        }
        if (name.equals("org.json.JSONArray$1")) {
            try {
                writableMap.putArray(str, d((JSONArray) obj));
                return;
            } catch (JSONException unused) {
                writableMap.putNull(str);
                return;
            }
        }
        if (name.equals("java.lang.Boolean")) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (name.equals("java.lang.Long")) {
            writableMap.putDouble(str, ((Long) obj).longValue());
            return;
        }
        if (name.equals("java.lang.Double")) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (name.equals("java.lang.String")) {
            writableMap.putString(str, (String) obj);
            return;
        }
        if (name.equals("org.json.JSONObject$1")) {
            try {
                writableMap.putMap(str, e((JSONObject) obj));
            } catch (JSONException unused2) {
                writableMap.putNull(str);
            }
        } else {
            if (List.class.isAssignableFrom(obj.getClass())) {
                writableMap.putArray(str, f((List) obj));
                return;
            }
            if (Map.class.isAssignableFrom(obj.getClass())) {
                writableMap.putMap(str, h((Map) obj));
                return;
            }
            Log.d("Utils", "utils:mapPutValue:unknownType:" + name);
            writableMap.putNull(str);
        }
    }

    public static WritableMap h(Map map) {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry entry : map.entrySet()) {
            g((String) entry.getKey(), entry.getValue(), createMap);
        }
        return createMap;
    }
}
