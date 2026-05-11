package com.hypersnapsdk;

import android.util.Log;
import co.hyperverge.hypersnapsdk.activities.HVFaceActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.listeners.FaceCaptureCompletionHandler;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

@K4.a(name = RNHVFaceCapture.NAME)
/* loaded from: classes2.dex */
public class RNHVFaceCapture extends ReactContextBaseJavaModule {
    public static final String NAME = "RNHVFaceCapture";
    HVFaceConfig faceConfig;
    boolean hasBeenCalled;
    public String liveness;

    class a implements FaceCaptureCompletionHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f29140a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RNHVFaceCapture f29141b;

        a(RNHVFaceCapture rNHVFaceCapture, Callback callback) {
            this.f29140a = callback;
            this.f29141b = rNHVFaceCapture;
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
                    b.a(hVResponse, createMap2);
                    createMap2.putArray("retakeAttemptResponses", b.b(hVResponse));
                }
                RNHVFaceCapture rNHVFaceCapture = this.f29141b;
                if (rNHVFaceCapture.hasBeenCalled) {
                    return;
                }
                rNHVFaceCapture.hasBeenCalled = true;
                this.f29140a.invoke(createMap, createMap2);
            } catch (Exception e10) {
                String name = this.f29141b.getName();
                String message = e10.getMessage();
                Objects.requireNonNull(message);
                Log.e(name, message);
            }
        }
    }

    public RNHVFaceCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void disableQualityChecks(ReadableArray readableArray) {
        try {
            ArrayList<HVFaceConfig.QualityChecks> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                if (readableArray.getType(i10) == ReadableType.String) {
                    String string = readableArray.getString(i10);
                    try {
                        arrayList.add(HVFaceConfig.QualityChecks.valueOf(string));
                    } catch (IllegalArgumentException unused) {
                        Log.e(getName(), "Invalid quality check: " + string);
                    }
                } else {
                    Log.e(getName(), "Non-string value at index " + i10);
                }
            }
            getFaceConfig().disableQualityChecks(arrayList);
        } catch (Exception e10) {
            String name = getName();
            String message = e10.getMessage();
            Objects.requireNonNull(message);
            Log.e(name, message);
        }
    }

    public HVFaceConfig getFaceConfig() {
        if (this.faceConfig == null) {
            this.faceConfig = new HVFaceConfig();
        }
        return this.faceConfig;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void setAutoCaptureDuration(Integer num) {
        getFaceConfig().setAutoCaptureDuration(num.intValue());
    }

    @ReactMethod
    public void setClientID(String str) {
        getFaceConfig().setClientID(str);
    }

    @ReactMethod
    public void setCloseAlertDialogDescription(String str) {
        getFaceConfig().setCloseAlertDialogDesc(str);
    }

    @ReactMethod
    public void setCloseAlertDialogTitle(String str) {
        getFaceConfig().setCloseAlertDialogTitle(str);
    }

    @ReactMethod
    public void setCustomUIStrings(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str != null && !str.trim().isEmpty()) {
                jSONObject = new JSONObject(str);
            }
            getFaceConfig().setCustomUIStrings(jSONObject);
        } catch (JSONException e10) {
            String name = getName();
            String message = e10.getMessage();
            Objects.requireNonNull(message);
            Log.e(name, message);
        }
    }

    @ReactMethod
    public void setFaceCaptureTimeout(double d10) {
        getFaceConfig().setCaptureTimeout((long) d10);
    }

    @ReactMethod
    public void setFaceCaptureTitle(String str) {
        getFaceConfig().setFaceCaptureTitle(str);
    }

    @ReactMethod
    public void setFaceDetectorTimeout(double d10) {
        getFaceConfig().setFaceDetectorTimeout((long) d10);
    }

    @ReactMethod
    public void setLivenessAPIHeaders(String str) {
        try {
            getFaceConfig().setLivenessAPIHeaders(new JSONObject(str));
        } catch (JSONException e10) {
            String name = getName();
            String message = e10.getMessage();
            Objects.requireNonNull(message);
            Log.e(name, message);
        }
    }

    @ReactMethod
    public void setLivenessAPIParameters(String str) {
        try {
            getFaceConfig().setLivenessAPIParameters(new JSONObject(str));
        } catch (JSONException e10) {
            String name = getName();
            String message = e10.getMessage();
            Objects.requireNonNull(message);
            Log.e(name, message);
        }
    }

    @ReactMethod
    public void setLivenessEndpoint(String str) {
        getFaceConfig().setLivenessEndpoint(str);
    }

    @ReactMethod
    public void setLivenessMode(String str) {
        try {
            String str2 = str.split("\\.")[1];
            this.liveness = str2;
            getFaceConfig().setLivenessMode(HVFaceConfig.LivenessMode.valueOf(str2));
        } catch (Exception e10) {
            String name = getName();
            String message = e10.getMessage();
            Objects.requireNonNull(message);
            Log.e(name, message);
        }
    }

    @ReactMethod
    public void setPadding(Float f10, Float f11, Float f12, Float f13) {
        getFaceConfig().setPadding(f10.floatValue(), f11.floatValue(), f12.floatValue(), f13.floatValue());
    }

    @ReactMethod
    public void setShouldCheckActiveLiveness(Boolean bool) {
        getFaceConfig().setShouldCheckActiveLiveness(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldEnableAutoCapture(Boolean bool) {
        getFaceConfig().setShouldAutoCapture(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldEnableDataLogging(Boolean bool) {
        getFaceConfig().setShouldEnableDataLogging(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldEnablePadding(Boolean bool) {
        getFaceConfig().setShouldEnablePadding(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldEnableRetries(Boolean bool) {
        getFaceConfig().setShouldHandleRetries(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldReturnFullImageUri(Boolean bool) {
        getFaceConfig().setShouldReturnFullImageUrl(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldShowCameraSwitchButton(Boolean bool) {
        getFaceConfig().setShouldShowCameraSwitchButton(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldShowCloseAlert(Boolean bool) {
        getFaceConfig().setShouldShowCloseAlert(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldShowInstructionPage(Boolean bool) {
        getFaceConfig().setShouldShowInstructionPage(bool.booleanValue());
    }

    @ReactMethod
    public void setShouldUseBackCamera(Boolean bool) {
        getFaceConfig().setShouldUseBackCamera(bool.booleanValue());
    }

    @ReactMethod
    public void setTotalGestures(Integer num) {
        getFaceConfig().setTotalGestures(num.intValue());
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
    public void setVideoRecordingConfig(Boolean bool, Integer num, Double d10, Integer num2) {
        getFaceConfig().setShouldRecordVideo(bool.booleanValue());
        getFaceConfig().setNumberOfFrames(num.intValue());
        getFaceConfig().setBitrateM(d10.doubleValue());
        getFaceConfig().setFps(num2.intValue());
    }

    @ReactMethod
    public void start(Callback callback) {
        this.hasBeenCalled = false;
        HVFaceActivity.start(getCurrentActivity(), getFaceConfig(), new a(this, callback));
    }
}
