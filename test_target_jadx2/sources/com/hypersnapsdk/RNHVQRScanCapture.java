package com.hypersnapsdk;

import android.util.Log;
import co.hyperverge.hypersnapsdk.activities.HVQrScannerActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.listeners.QRScannerCompletionHandler;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVQRConfig;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

@K4.a(name = RNHVQRScanCapture.NAME)
/* loaded from: classes2.dex */
public class RNHVQRScanCapture extends ReactContextBaseJavaModule {
    public static final String NAME = "RNHVQRScanCapture";
    private boolean hasBeenCalled;
    HVQRConfig hvqrConfig;

    class a implements QRScannerCompletionHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f29147a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RNHVQRScanCapture f29148b;

        a(RNHVQRScanCapture rNHVQRScanCapture, Callback callback) {
            this.f29147a = callback;
            this.f29148b = rNHVQRScanCapture;
        }

        @Override // co.hyperverge.hypersnapsdk.listeners.QRCompletionHandler
        public void onResult(HVError hVError, JSONObject jSONObject) {
            try {
                WritableMap createMap = Arguments.createMap();
                WritableMap createMap2 = Arguments.createMap();
                if (hVError != null) {
                    createMap.putInt(Keys.ERROR_CODE, hVError.getErrorCode());
                    createMap.putString(Keys.ERROR_MESSAGE, hVError.getErrorMessage());
                    if (this.f29148b.hasBeenCalled) {
                        return;
                    }
                    this.f29148b.hasBeenCalled = true;
                    this.f29147a.invoke(createMap, null);
                    return;
                }
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            if (jSONObject.get(next) instanceof String) {
                                createMap2.putString(next, (String) jSONObject.get(next));
                            } else if (jSONObject.get(next) instanceof JSONObject) {
                                createMap2.putString(next, jSONObject.get(next).toString());
                            }
                        } catch (JSONException e10) {
                            Log.e(this.f29148b.getName(), e10.getMessage());
                        }
                    }
                }
                if (this.f29148b.hasBeenCalled) {
                    return;
                }
                this.f29148b.hasBeenCalled = true;
                this.f29147a.invoke(null, createMap2);
            } catch (Exception e11) {
                Log.e(this.f29148b.getName(), e11.getMessage());
            }
        }
    }

    public RNHVQRScanCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public HVQRConfig getQRConfig() {
        if (this.hvqrConfig == null) {
            this.hvqrConfig = new HVQRConfig();
        }
        return this.hvqrConfig;
    }

    @ReactMethod
    public void setShouldShowInstructionPage(Boolean bool) {
        getQRConfig().setShowInstructions(bool.booleanValue());
    }

    @ReactMethod
    public void setUIStrings(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str != null && !str.trim().isEmpty()) {
                jSONObject = new JSONObject(str);
            }
            WritableMap convertJsonToMap = RNHVNetworkHelper.convertJsonToMap(jSONObject);
            String string = convertJsonToMap.getString("qrCaptureSubText");
            String string2 = convertJsonToMap.getString("qrCaptureTitleText");
            String string3 = convertJsonToMap.getString("qrCaptureDescText");
            String string4 = convertJsonToMap.getString("qrInstructionsProceedText");
            String string5 = convertJsonToMap.getString("qrInstructionsDescText");
            String string6 = convertJsonToMap.getString("qrInstructionTitleText");
            String string7 = convertJsonToMap.getString("qrCaptureSkipText");
            if (string != null) {
                getQRConfig().setQrCaptureSubText(string);
            }
            if (string2 != null) {
                getQRConfig().setQrCaptureTitleText(string2);
            }
            if (string3 != null) {
                getQRConfig().setQrCaptureDescText(string3);
            }
            if (string4 != null) {
                getQRConfig().setQrInstructionsProceedText(string4);
            }
            if (string5 != null) {
                getQRConfig().setQrInstructionsDescText(string5);
            }
            if (string6 != null) {
                getQRConfig().setQrInstructionTitleText(string6);
            }
            if (string7 != null) {
                getQRConfig().setQrCaptureSkipText(string7);
            }
        } catch (JSONException e10) {
            String name = getName();
            String message = e10.getMessage();
            Objects.requireNonNull(message);
            Log.e(name, message);
        }
    }

    @ReactMethod
    public void start(Callback callback) {
        this.hasBeenCalled = false;
        HVQrScannerActivity.start(getCurrentActivity(), getQRConfig(), new a(this, callback));
    }
}
