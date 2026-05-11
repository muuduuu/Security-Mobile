package com.hypersnapsdk;

import D5.s;
import android.util.Log;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.listeners.APICompletionCallback;
import co.hyperverge.hypersnapsdk.network.HVNetworkHelper;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.fasterxml.jackson.core.i;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@K4.a(name = RNHVNetworkHelper.NAME)
/* loaded from: classes2.dex */
public class RNHVNetworkHelper extends ReactContextBaseJavaModule {
    public static final String NAME = "RNHVNetworkHelper";

    class a implements APICompletionCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f29142a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RNHVNetworkHelper f29143b;

        a(RNHVNetworkHelper rNHVNetworkHelper, Callback callback) {
            this.f29142a = callback;
            this.f29143b = rNHVNetworkHelper;
        }

        @Override // co.hyperverge.hypersnapsdk.listeners.APICompletionCallback
        public void onResult(HVError hVError, HVResponse hVResponse) {
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            if (hVError != null) {
                createMap.putInt(Keys.ERROR_CODE, hVError.getErrorCode());
                createMap.putString(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
            }
            if (hVResponse != null) {
                JSONObject apiResult = hVResponse.getApiResult();
                JSONObject apiHeaders = hVResponse.getApiHeaders();
                String imageURI = hVResponse.getImageURI();
                String fullImageURI = hVResponse.getFullImageURI();
                String action = hVResponse.getAction();
                String retakeMessage = hVResponse.getRetakeMessage();
                if (apiResult != null) {
                    try {
                        createMap2.putMap("apiResult", RNHVNetworkHelper.convertJsonToMap(apiResult));
                        createMap2.putString(HVRetakeActivity.IMAGE_URI_TAG, imageURI);
                        if (fullImageURI != null && !fullImageURI.isEmpty()) {
                            createMap2.putString("fullImageUri", fullImageURI);
                        }
                        if (retakeMessage != null && !retakeMessage.isEmpty()) {
                            createMap2.putString(AppConstants.RETAKE_MESSAGE, retakeMessage);
                        }
                        if (action != null && !action.isEmpty()) {
                            createMap2.putString("action", action);
                        }
                    } catch (Exception e10) {
                        Log.e(this.f29143b.getName(), e10.getMessage());
                    }
                }
                if (apiHeaders != null) {
                    try {
                        createMap2.putMap("apiHeaders", RNHVNetworkHelper.convertJsonToMap(apiHeaders));
                    } catch (Exception e11) {
                        Log.e(this.f29143b.getName(), e11.getMessage());
                    }
                }
            }
            this.f29142a.invoke(createMap, createMap2);
        }
    }

    class b implements APICompletionCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f29144a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RNHVNetworkHelper f29145b;

        b(RNHVNetworkHelper rNHVNetworkHelper, Callback callback) {
            this.f29144a = callback;
            this.f29145b = rNHVNetworkHelper;
        }

        @Override // co.hyperverge.hypersnapsdk.listeners.APICompletionCallback
        public void onResult(HVError hVError, HVResponse hVResponse) {
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            if (hVError != null) {
                createMap.putInt(Keys.ERROR_CODE, hVError.getErrorCode());
                createMap.putString(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
            }
            if (hVResponse != null) {
                JSONObject apiResult = hVResponse.getApiResult();
                JSONObject apiHeaders = hVResponse.getApiHeaders();
                String imageURI = hVResponse.getImageURI();
                String fullImageURI = hVResponse.getFullImageURI();
                String action = hVResponse.getAction();
                String retakeMessage = hVResponse.getRetakeMessage();
                if (apiResult != null) {
                    try {
                        createMap2.putMap("apiResult", RNHVNetworkHelper.convertJsonToMap(apiResult));
                        createMap2.putString(HVRetakeActivity.IMAGE_URI_TAG, imageURI);
                        if (fullImageURI != null && !fullImageURI.isEmpty()) {
                            createMap2.putString("fullImageUri", fullImageURI);
                        }
                        if (retakeMessage != null && !retakeMessage.isEmpty()) {
                            createMap2.putString(AppConstants.RETAKE_MESSAGE, retakeMessage);
                        }
                        if (action != null && !action.isEmpty()) {
                            createMap2.putString("action", action);
                        }
                    } catch (Exception e10) {
                        Log.e(this.f29145b.getName(), e10.getMessage());
                    }
                }
                if (apiHeaders != null) {
                    try {
                        createMap2.putMap("apiHeaders", RNHVNetworkHelper.convertJsonToMap(apiHeaders));
                    } catch (Exception e11) {
                        Log.e(this.f29145b.getName(), e11.getMessage());
                    }
                }
            }
            this.f29144a.invoke(createMap, createMap2);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29146a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f29146a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29146a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29146a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29146a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29146a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29146a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public RNHVNetworkHelper(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static JSONArray convertArrayToJson(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            int i11 = c.f29146a[readableArray.getType(i10).ordinal()];
            if (i11 == 2) {
                jSONArray.put(readableArray.getBoolean(i10));
            } else if (i11 == 3) {
                jSONArray.put(readableArray.getDouble(i10));
            } else if (i11 == 4) {
                jSONArray.put(readableArray.getString(i10));
            } else if (i11 == 5) {
                jSONArray.put(convertMapToJson(readableArray.getMap(i10)));
            } else if (i11 == 6) {
                jSONArray.put(convertArrayToJson(readableArray.getArray(i10)));
            }
        }
        return jSONArray;
    }

    public static JSONObject convertHashMapToJson(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            return new JSONObject(new s().i(map));
        } catch (i e10) {
            String message = e10.getMessage();
            Objects.requireNonNull(message);
            Log.e(NAME, message);
            return jSONObject;
        }
    }

    private static WritableArray convertJsonToArray(JSONArray jSONArray) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONObject) {
                writableNativeArray.pushMap(convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeArray.pushArray(convertJsonToArray((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeArray.pushDouble(((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeArray.pushString((String) obj);
            } else {
                writableNativeArray.pushString(obj.toString());
            }
        }
        return writableNativeArray;
    }

    protected static WritableMap convertJsonToMap(JSONObject jSONObject) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                writableNativeMap.putMap(next, convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeMap.putArray(next, convertJsonToArray((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeMap.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeMap.putDouble(next, ((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeMap.putString(next, (String) obj);
            } else {
                writableNativeMap.putString(next, obj.toString());
            }
        }
        return writableNativeMap;
    }

    private static JSONObject convertMapToJson(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (c.f29146a[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    jSONObject.put(nextKey, JSONObject.NULL);
                    break;
                case 2:
                    jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    jSONObject.put(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 4:
                    jSONObject.put(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    jSONObject.put(nextKey, convertMapToJson(readableMap.getMap(nextKey)));
                    break;
                case 6:
                    jSONObject.put(nextKey, convertArrayToJson(readableMap.getArray(nextKey)));
                    break;
            }
        }
        return jSONObject;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void makeFaceMatchCall(String str, String str2, String str3, ReadableMap readableMap, ReadableMap readableMap2, Callback callback) {
        makeFaceMatchCallWithFaceMatchMode(str, str2, str3, RNHyperSnapParams.FaceMatchModeFaceId, readableMap, readableMap2, callback);
    }

    @ReactMethod
    public void makeFaceMatchCallWithFaceMatchMode(String str, String str2, String str3, String str4, ReadableMap readableMap, ReadableMap readableMap2, Callback callback) {
        b bVar = new b(this, callback);
        try {
            JSONObject convertMapToJson = readableMap != null ? convertMapToJson(readableMap) : new JSONObject();
            JSONObject jSONObject = new JSONObject();
            if (readableMap2 != null) {
                jSONObject = convertMapToJson(readableMap2);
            }
            String[] split = str4.split("\\.");
            HVNetworkHelper.makeFaceMatchCall(getCurrentActivity(), str, str2, str3, (HyperSnapParams.FaceMatchMode) RNHyperSnapSDK.getHVHyperSnapParam(split[0], split[1], HyperSnapParams.FaceMatchMode.class), convertMapToJson, jSONObject, bVar);
        } catch (JSONException e10) {
            Log.e(getName(), e10.getMessage());
        }
    }

    @ReactMethod
    public void makeOCRCall(String str, String str2, ReadableMap readableMap, ReadableMap readableMap2, Callback callback) {
        a aVar = new a(this, callback);
        try {
            JSONObject convertMapToJson = readableMap != null ? convertMapToJson(readableMap) : new JSONObject();
            JSONObject jSONObject = new JSONObject();
            if (readableMap2 != null) {
                jSONObject = convertMapToJson(readableMap2);
            }
            HVNetworkHelper.makeOCRCall(getCurrentActivity(), str, str2, convertMapToJson, jSONObject, aVar);
        } catch (Exception e10) {
            Log.e(getName(), e10.getMessage());
        }
    }
}
