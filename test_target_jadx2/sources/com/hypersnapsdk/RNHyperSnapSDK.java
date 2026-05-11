package com.hypersnapsdk;

import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.model.UIConfig;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.google.gson.e;
import org.json.JSONArray;
import org.json.JSONObject;

@K4.a(name = RNHyperSnapSDK.NAME)
/* loaded from: classes2.dex */
public class RNHyperSnapSDK extends ReactContextBaseJavaModule {
    public static final String NAME = "RNHyperSnapSDK";

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29149a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f29149a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29149a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29149a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29149a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29149a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29149a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public RNHyperSnapSDK(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static JSONArray convertArrayToJson(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            int i11 = a.f29149a[readableArray.getType(i10).ordinal()];
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

    private static JSONObject convertMapToJson(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (a.f29149a[readableMap.getType(nextKey).ordinal()]) {
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

    public static <T> T getHVHyperSnapParam(String str, String str2, Class<T> cls) {
        str.hashCode();
        switch (str) {
            case "Region":
                return cls.cast(HyperSnapParams.Region.valueOf(str2));
            case "FaceMatchMode":
                return cls.cast(HyperSnapParams.FaceMatchMode.valueOf(str2));
            case "LivenessMode":
                return cls.cast(HVFaceConfig.LivenessMode.valueOf(str2));
            case "Document":
                return cls.cast(HVDocConfig.Document.valueOf(str2));
            case "Product":
                return cls.cast(HyperSnapParams.Product.valueOf(str2));
            default:
                return null;
        }
    }

    @ReactMethod
    public void endUserSession() {
        HyperSnapSDK.endUserSession();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void initialize(String str, String str2, String str3) {
        String[] split = str3.split("\\.");
        HyperSnapSDK.init(getReactApplicationContext(), str, str2, (HyperSnapParams.Region) getHVHyperSnapParam(split[0], split[1], HyperSnapParams.Region.class));
    }

    @ReactMethod
    public void initializeWithToken(String str, String str2, String str3) {
        String[] split = str3.split("\\.");
        HyperSnapSDK.initWithToken(getReactApplicationContext(), str, str2, (HyperSnapParams.Region) getHVHyperSnapParam(split[0], split[1], HyperSnapParams.Region.class));
    }

    @ReactMethod
    public void isFaceDetected(Callback callback) {
        callback.invoke(Boolean.valueOf(HyperSnapSDK.getFaceCaptureMetaData().isFaceDetected()));
    }

    @ReactMethod
    public void setHttpTimeoutValues(Integer num, Integer num2, Integer num3) {
        HyperSnapSDK.setHttpTimeoutValues(num.intValue(), num2.intValue(), num3.intValue());
    }

    @ReactMethod
    public void setShouldEnableSSLPinning(Boolean bool) {
        HyperSnapSDK.setShouldEnableSSLPinning(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldReturnRawResponse(Boolean bool) {
        HyperSnapSDK.setShouldReturnRawResponse(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldUseSignature(Boolean bool) {
        HyperSnapSDK.setShouldUseSignature(bool.booleanValue());
    }

    @ReactMethod
    public void setUiConfig(String str) {
        HyperSnapSDK.getInstance().setUiConfig(getReactApplicationContext(), (UIConfig) new e().k(str, UIConfig.class));
    }

    @ReactMethod
    public boolean startUserSession(String str) {
        if (str != null) {
            return (str.isEmpty() ? HyperSnapSDK.startUserSession() : HyperSnapSDK.startUserSession(str)).isSuccess();
        }
        return false;
    }
}
