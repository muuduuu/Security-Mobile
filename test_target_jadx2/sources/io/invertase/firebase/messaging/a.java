package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: io.invertase.firebase.messaging.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0509a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34379a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f34379a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34379a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34379a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34379a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34379a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34379a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static WritableArray a(JSONArray jSONArray) {
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
                createArray.pushMap(b(jSONArray.getJSONObject(i10)));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(a(jSONArray.getJSONArray(i10)));
            } else if (obj == JSONObject.NULL) {
                createArray.pushNull();
            }
        }
        return createArray;
    }

    public static WritableMap b(JSONObject jSONObject) {
        WritableMap createMap = Arguments.createMap();
        Iterator<String> keys = jSONObject.keys();
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
                createMap.putMap(next, b(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(next, a(jSONObject.getJSONArray(next)));
            } else if (obj == JSONObject.NULL) {
                createMap.putNull(next);
            }
        }
        return createMap;
    }

    public static JSONArray c(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            switch (C0509a.f34379a[readableArray.getType(i10).ordinal()]) {
                case 1:
                    jSONArray.put(JSONObject.NULL);
                    break;
                case 2:
                    jSONArray.put(readableArray.getBoolean(i10));
                    break;
                case 3:
                    try {
                        jSONArray.put(readableArray.getInt(i10));
                        break;
                    } catch (Exception unused) {
                        jSONArray.put(readableArray.getDouble(i10));
                        break;
                    }
                case 4:
                    jSONArray.put(readableArray.getString(i10));
                    break;
                case 5:
                    jSONArray.put(d(readableArray.getMap(i10)));
                    break;
                case 6:
                    jSONArray.put(c(readableArray.getArray(i10)));
                    break;
            }
        }
        return jSONArray;
    }

    public static JSONObject d(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (C0509a.f34379a[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    jSONObject.put(nextKey, JSONObject.NULL);
                    break;
                case 2:
                    jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    try {
                        jSONObject.put(nextKey, readableMap.getInt(nextKey));
                        break;
                    } catch (Exception unused) {
                        jSONObject.put(nextKey, readableMap.getDouble(nextKey));
                        break;
                    }
                case 4:
                    jSONObject.put(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    jSONObject.put(nextKey, d(readableMap.getMap(nextKey)));
                    break;
                case 6:
                    jSONObject.put(nextKey, c(readableMap.getArray(nextKey)));
                    break;
            }
        }
        return jSONObject;
    }
}
