package com.appsflyer.reactnative;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RNUtil {

    /* renamed from: com.appsflyer.reactnative.RNUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private RNUtil() {
    }

    private static JSONArray convertArrayToJson(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            int i11 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i10).ordinal()];
            if (i11 == 2) {
                jSONArray.put(readableArray.getBoolean(i10));
            } else if (i11 == 3) {
                jSONArray.put(readableArray.getDouble(i10));
            } else if (i11 == 4) {
                jSONArray.put(readableArray.getString(i10));
            } else if (i11 == 5) {
                jSONArray.put(readableMapToJson(readableArray.getMap(i10)));
            } else if (i11 == 6) {
                jSONArray.put(convertArrayToJson(readableArray.getArray(i10)));
            }
        }
        return jSONArray;
    }

    public static WritableArray jsonArrayToWritableArray(JSONArray jSONArray) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                Object obj = jSONArray.get(i10);
                if (obj == null) {
                    writableNativeArray.pushNull();
                } else if (obj instanceof Boolean) {
                    writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    writableNativeArray.pushInt(((Integer) obj).intValue());
                } else if (obj instanceof Double) {
                    writableNativeArray.pushDouble(((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    writableNativeArray.pushString((String) obj);
                } else if (obj instanceof JSONObject) {
                    writableNativeArray.pushMap(jsonToWritableMap((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableNativeArray.pushArray(jsonArrayToWritableArray((JSONArray) obj));
                }
            } catch (JSONException unused) {
            }
        }
        return writableNativeArray;
    }

    public static Map<String, String> jsonObjectToMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, (String) jSONObject.get(next));
        }
        return hashMap;
    }

    public static Bundle jsonToBundle(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            bundle.putString(next, jSONObject.getString(next));
        }
        return bundle;
    }

    public static WritableMap jsonToWritableMap(JSONObject jSONObject) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        if (!keys.hasNext()) {
            return null;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj == null) {
                    writableNativeMap.putNull(next);
                } else if (obj instanceof Boolean) {
                    writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    writableNativeMap.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Double) {
                    writableNativeMap.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    writableNativeMap.putString(next, (String) obj);
                } else if (obj instanceof JSONObject) {
                    writableNativeMap.putMap(next, jsonToWritableMap((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableNativeMap.putArray(next, jsonArrayToWritableArray((JSONArray) obj));
                }
            } catch (JSONException unused) {
            }
        }
        return writableNativeMap;
    }

    public static JSONObject readableMapToJson(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (!keySetIterator.hasNextKey()) {
            return null;
        }
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                    case 1:
                        jSONObject.put(nextKey, (Object) null);
                        continue;
                    case 2:
                        jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                        continue;
                    case 3:
                        jSONObject.put(nextKey, readableMap.getInt(nextKey));
                        continue;
                    case 4:
                        jSONObject.put(nextKey, readableMap.getString(nextKey));
                        continue;
                    case 5:
                        jSONObject.put(nextKey, readableMapToJson(readableMap.getMap(nextKey)));
                        continue;
                    case 6:
                        jSONObject.put(nextKey, convertArrayToJson(readableMap.getArray(nextKey)));
                        continue;
                    default:
                        continue;
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static List<Object> toList(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        List<Object> arrayList = new ArrayList<>(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i10).ordinal()]) {
                case 1:
                    arrayList.add(null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i10)));
                    break;
                case 3:
                    double d10 = readableArray.getDouble(i10);
                    int i11 = (int) d10;
                    if (d10 == i11) {
                        arrayList.add(Integer.valueOf(i11));
                        break;
                    } else {
                        arrayList.add(Double.valueOf(d10));
                        break;
                    }
                case 4:
                    arrayList.add(readableArray.getString(i10));
                    break;
                case 5:
                    arrayList.add(toMap(readableArray.getMap(i10)));
                    break;
                case 6:
                    arrayList = toList(readableArray.getArray(i10));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with index: " + i10 + ".");
            }
        }
        return arrayList;
    }

    public static Map<String, Object> toMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (!keySetIterator.hasNextKey()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, toObject(readableMap, nextKey));
        }
        return hashMap;
    }

    public static Object toObject(ReadableMap readableMap, String str) {
        if (readableMap == null) {
            return null;
        }
        switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(str).ordinal()]) {
            case 1:
                return null;
            case 2:
                return Boolean.valueOf(readableMap.getBoolean(str));
            case 3:
                double d10 = readableMap.getDouble(str);
                int i10 = (int) d10;
                return d10 == ((double) i10) ? Integer.valueOf(i10) : Double.valueOf(d10);
            case 4:
                return readableMap.getString(str);
            case 5:
                return toMap(readableMap.getMap(str));
            case 6:
                return toList(readableMap.getArray(str));
            default:
                throw new IllegalArgumentException("Could not convert object with key: " + str + ".");
        }
    }

    public static WritableArray toWritableArray(List<Object> list) {
        WritableArray createArray = Arguments.createArray();
        for (Object obj : list) {
            if (obj == null) {
                createArray.pushNull();
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Double) {
                createArray.pushDouble(((Double) obj).doubleValue());
            } else if (obj instanceof Integer) {
                createArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof String) {
                createArray.pushString((String) obj);
            } else if (obj instanceof Map) {
                createArray.pushMap(toWritableMap((Map) obj));
            } else if (obj instanceof List) {
                createArray.pushArray(toWritableArray((List) obj));
            }
        }
        return createArray;
    }

    public static WritableMap toWritableMap(Map<String, Object> map) {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                createMap.putNull(key);
            } else if (value instanceof Boolean) {
                createMap.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                createMap.putDouble(key, ((Double) value).doubleValue());
            } else if (value instanceof Integer) {
                createMap.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof String) {
                createMap.putString(key, (String) value);
            } else if (value instanceof Map) {
                createMap.putMap(key, toWritableMap((Map) value));
            } else if (value instanceof List) {
                createMap.putArray(key, toWritableArray((List) value));
            }
        }
        return createMap;
    }
}
