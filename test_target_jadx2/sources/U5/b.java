package u5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.common.api.Status;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private ReactApplicationContext f43494a;

    public b(ReactApplicationContext reactApplicationContext) {
        this.f43494a = reactApplicationContext;
    }

    private void a(String str) {
        ReactApplicationContext reactApplicationContext = this.f43494a;
        if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
            new WritableNativeMap().putString("message", str);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f43494a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("com.faizalshap.otpVerify:otpReceived", str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        Status status;
        if (!"com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction()) || (extras = intent.getExtras()) == null || (status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) == null) {
            return;
        }
        int u10 = status.u();
        if (u10 != 0) {
            if (u10 != 15) {
                return;
            }
            Log.d("SMS", "Timeout error");
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f43494a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("com.faizalshap.otpVerify:otpReceived", "Timeout Error.");
            return;
        }
        String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
        a(str);
        if (str != null) {
            Log.d("SMS", BuildConfig.FLAVOR + str);
        }
    }
}
