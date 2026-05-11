package com.hypersnapsdk;

import android.util.Log;
import co.hyperverge.hypersnapsdk.activities.HVDocsActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.listeners.DocCaptureCompletionHandler;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@K4.a(name = RNHVDocsCapture.NAME)
/* loaded from: classes2.dex */
public class RNHVDocsCapture extends ReactContextBaseJavaModule {
    public static final String NAME = "RNHVDocsCapture";
    public Float aspectRatio;
    HVDocConfig.Document doc;
    HVDocConfig docConfig;
    public String docType;
    boolean hasBeenCalled;

    class a implements DocCaptureCompletionHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f29137a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RNHVDocsCapture f29138b;

        a(RNHVDocsCapture rNHVDocsCapture, Callback callback) {
            this.f29137a = callback;
            this.f29138b = rNHVDocsCapture;
        }

        @Override // co.hyperverge.hypersnapsdk.listeners.CaptureCompletionHandler
        public void onResult(HVError hVError, HVResponse hVResponse) {
            try {
                WritableMap createMap = Arguments.createMap();
                WritableMap createMap2 = Arguments.createMap();
                if (hVError != null) {
                    createMap.putInt(Keys.ERROR_CODE, hVError.getErrorCode());
                    createMap.putString(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
                }
                if (hVResponse != null) {
                    com.hypersnapsdk.b.a(hVResponse, createMap2);
                    createMap2.putArray("retakeAttemptResponses", com.hypersnapsdk.b.b(hVResponse));
                }
                RNHVDocsCapture rNHVDocsCapture = this.f29138b;
                if (rNHVDocsCapture.hasBeenCalled) {
                    return;
                }
                rNHVDocsCapture.hasBeenCalled = true;
                this.f29137a.invoke(createMap, createMap2);
            } catch (Exception e10) {
                String name = this.f29138b.getName();
                String message = e10.getMessage();
                Objects.requireNonNull(message);
                Log.e(name, message);
            }
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29139a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f29139a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29139a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29139a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29139a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29139a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29139a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public RNHVDocsCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.docConfig = null;
    }

    private static JSONArray convertArrayToJson(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            int i11 = b.f29139a[readableArray.getType(i10).ordinal()];
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
            switch (b.f29139a[readableMap.getType(nextKey).ordinal()]) {
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

    private <T> HVDocConfig.DocumentSide getDocumentSide(String str, Class<T> cls) {
        str.hashCode();
        switch (str) {
            case "BACK":
            case "back":
                return HVDocConfig.DocumentSide.BACK;
            case "FRONT":
            case "front":
                return HVDocConfig.DocumentSide.FRONT;
            default:
                return null;
        }
    }

    private void test() {
    }

    public HVDocConfig.DocumentSide getBackDocumentSide() {
        return HVDocConfig.DocumentSide.BACK;
    }

    public HVDocConfig getConfig() {
        return getDocConfig();
    }

    public HVDocConfig getDocConfig() {
        if (this.docConfig == null) {
            this.docConfig = new HVDocConfig();
        }
        return this.docConfig;
    }

    public HVDocConfig.DocumentSide getFrontDocumentSide() {
        return HVDocConfig.DocumentSide.FRONT;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void setAspectRatio(Float f10) {
        this.aspectRatio = f10;
    }

    @ReactMethod
    public void setAutoCaptureDuration(Integer num) {
    }

    @ReactMethod
    public void setCloseAlertDialogDescription(String str) {
        getDocConfig().setCloseAlertDialogDesc(str);
    }

    @ReactMethod
    public void setCloseAlertDialogTitle(String str) {
        getDocConfig().setCloseAlertDialogTitle(str);
    }

    @ReactMethod
    public void setCustomUIStrings(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str != null && !str.trim().isEmpty()) {
                jSONObject = new JSONObject(str);
            }
            getDocConfig().setCustomUIStrings(jSONObject);
        } catch (JSONException e10) {
            String name = getName();
            String message = e10.getMessage();
            Objects.requireNonNull(message);
            Log.e(name, message);
        }
    }

    @ReactMethod
    public void setDocCaptureDescription(String str) {
        getDocConfig().setDocCaptureDescription(str);
    }

    @ReactMethod
    public void setDocCaptureSubText(String str) {
        getDocConfig().setDocCaptureSubText(str);
    }

    @ReactMethod
    public void setDocCaptureTitle(String str) {
        getDocConfig().setDocCaptureTitle(str);
    }

    @ReactMethod
    public void setDocReviewDescription(String str) {
        getDocConfig().setDocReviewDescription(str);
    }

    @ReactMethod
    public void setDocReviewTitle(String str) {
        getDocConfig().setDocReviewTitle(str);
    }

    @ReactMethod
    public void setDocumentType(String str) {
        try {
            String str2 = str.split("\\.")[1];
            this.docType = str2;
            if (str2 == null) {
                this.docType = "Card";
            }
            HVDocConfig.Document valueOf = HVDocConfig.Document.valueOf(this.docType);
            this.doc = valueOf;
            Float f10 = this.aspectRatio;
            if (f10 != null) {
                valueOf.setAspectRatio(f10.floatValue());
            }
            getDocConfig().setDocumentType(this.doc);
        } catch (Exception e10) {
            String name = getName();
            String message = e10.getMessage();
            Objects.requireNonNull(message);
            Log.e(name, message);
        }
    }

    @ReactMethod
    public void setEnableDocumentUpload(Boolean bool) {
        getDocConfig().setEnableDocumentUpload(bool.booleanValue());
    }

    @ReactMethod
    public void setOCRAPIDetails(String str, String str2, ReadableMap readableMap, ReadableMap readableMap2) {
        HVDocConfig.DocumentSide documentSide = getDocumentSide(str2.split("\\.")[2], HVDocConfig.DocumentSide.class);
        JSONObject jSONObject = new JSONObject();
        if (readableMap != null) {
            jSONObject = convertMapToJson(readableMap);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (readableMap2 != null) {
            jSONObject2 = convertMapToJson(readableMap2);
        }
        if (documentSide != null) {
            getDocConfig().setOCRDetails(str, documentSide, jSONObject.toString(), jSONObject2.toString());
        }
    }

    @ReactMethod
    public void setPadding(Float f10) {
        getDocConfig().setPadding(f10.floatValue());
    }

    @ReactMethod
    public void setShouldAddPadding(Boolean bool) {
        getDocConfig().setShouldAddPadding(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldEnableAutoCapture(Boolean bool) {
    }

    @ReactMethod
    public void setShouldEnableRetries(Boolean bool) {
        getDocConfig().setShouldEnableRetries(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldShowCloseAlert(Boolean bool) {
        getDocConfig().setShouldShowCloseAlert(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldShowFlashIcon(Boolean bool) {
        getDocConfig().setShouldShowFlashIcon(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldShowInstructionPage(Boolean bool) {
        getDocConfig().setShouldShowInstructionPage(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldShowReviewScreen(Boolean bool) {
        getDocConfig().setShouldShowReviewScreen(bool.booleanValue());
    }

    @ReactMethod
    public void setUIStrings(String str) {
        try {
            setCustomUIStrings(str);
        } catch (Exception e10) {
            String name = getName();
            String message = e10.getMessage();
            Objects.requireNonNull(message);
            Log.e(name, message);
        }
    }

    @ReactMethod
    public void start(Callback callback) {
        this.hasBeenCalled = false;
        HVDocsActivity.start(getCurrentActivity(), getDocConfig(), new a(this, callback));
    }
}
