package com.facebook.react.bridge;

import android.util.JsonWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class JsonWriterHelper {

    /* renamed from: com.facebook.react.bridge.JsonWriterHelper$1, reason: invalid class name */
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

    private static void dynamicValue(JsonWriter jsonWriter, Dynamic dynamic) {
        switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()]) {
            case 1:
                jsonWriter.nullValue();
                return;
            case 2:
                jsonWriter.value(dynamic.asBoolean());
                return;
            case 3:
                jsonWriter.value(dynamic.asDouble());
                return;
            case 4:
                jsonWriter.value(dynamic.asString());
                return;
            case 5:
                readableMapValue(jsonWriter, dynamic.asMap());
                return;
            case 6:
                readableArrayValue(jsonWriter, dynamic.asArray());
                return;
            default:
                throw new IllegalArgumentException("Unknown data type: " + dynamic.getType());
        }
    }

    private static void listValue(JsonWriter jsonWriter, List<?> list) {
        jsonWriter.beginArray();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            objectValue(jsonWriter, it.next());
        }
        jsonWriter.endArray();
    }

    private static void mapValue(JsonWriter jsonWriter, Map<?, ?> map) {
        jsonWriter.beginObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            jsonWriter.name(entry.getKey().toString());
            value(jsonWriter, entry.getValue());
        }
        jsonWriter.endObject();
    }

    private static void objectValue(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else {
            if (obj instanceof Boolean) {
                jsonWriter.value(((Boolean) obj).booleanValue());
                return;
            }
            throw new IllegalArgumentException("Unknown value: " + obj);
        }
    }

    public static void readableArrayValue(JsonWriter jsonWriter, ReadableArray readableArray) {
        jsonWriter.beginArray();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            try {
                switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i10).ordinal()]) {
                    case 1:
                        jsonWriter.nullValue();
                        continue;
                    case 2:
                        jsonWriter.value(readableArray.getBoolean(i10));
                        continue;
                    case 3:
                        jsonWriter.value(readableArray.getDouble(i10));
                        continue;
                    case 4:
                        jsonWriter.value(readableArray.getString(i10));
                        continue;
                    case 5:
                        readableMapValue(jsonWriter, readableArray.getMap(i10));
                        continue;
                    case 6:
                        readableArrayValue(jsonWriter, readableArray.getArray(i10));
                        continue;
                    default:
                        throw new IllegalArgumentException("Unknown data type: " + readableArray.getType(i10));
                }
            } catch (Throwable th) {
                jsonWriter.endArray();
                throw th;
            }
            jsonWriter.endArray();
            throw th;
        }
        jsonWriter.endArray();
    }

    private static void readableMapValue(JsonWriter jsonWriter, ReadableMap readableMap) {
        ReadableMapKeySetIterator keySetIterator;
        jsonWriter.beginObject();
        try {
            keySetIterator = readableMap.keySetIterator();
        } catch (Throwable th) {
            jsonWriter.endObject();
            throw th;
        }
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            jsonWriter.name(nextKey);
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    jsonWriter.nullValue();
                    continue;
                case 2:
                    jsonWriter.value(readableMap.getBoolean(nextKey));
                    continue;
                case 3:
                    jsonWriter.value(readableMap.getDouble(nextKey));
                    continue;
                case 4:
                    jsonWriter.value(readableMap.getString(nextKey));
                    continue;
                case 5:
                    readableMapValue(jsonWriter, readableMap.getMap(nextKey));
                    continue;
                case 6:
                    readableArrayValue(jsonWriter, readableMap.getArray(nextKey));
                    continue;
                default:
                    throw new IllegalArgumentException("Unknown data type: " + readableMap.getType(nextKey));
            }
            jsonWriter.endObject();
            throw th;
        }
        jsonWriter.endObject();
    }

    public static void value(JsonWriter jsonWriter, Object obj) {
        if (obj instanceof Map) {
            mapValue(jsonWriter, (Map) obj);
            return;
        }
        if (obj instanceof List) {
            listValue(jsonWriter, (List) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            readableMapValue(jsonWriter, (ReadableMap) obj);
            return;
        }
        if (obj instanceof ReadableArray) {
            readableArrayValue(jsonWriter, (ReadableArray) obj);
        } else if (obj instanceof Dynamic) {
            dynamicValue(jsonWriter, (Dynamic) obj);
        } else {
            objectValue(jsonWriter, obj);
        }
    }
}
