package com.faizal.OtpVerify;

import D7.InterfaceC0781e;
import D7.InterfaceC0782f;
import D7.InterfaceC0783g;
import S6.h;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.faizal.OtpVerify.OtpVerifyModule;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import u5.C4870a;

@K4.a(name = OtpVerifyModule.NAME)
/* loaded from: classes2.dex */
public class OtpVerifyModule extends ReactContextBaseJavaModule implements LifecycleEventListener, ActivityEventListener {
    public static final String NAME = "OtpVerify";
    private static final int RESOLVE_HINT = 10001;
    private static final String TAG = "OtpVerifyModule";
    private h apiClient;
    private boolean isReceiverRegistered;
    private BroadcastReceiver mReceiver;
    private final ReactApplicationContext reactContext;
    private Promise requestHintCallback;

    class a implements InterfaceC0781e {
        a() {
        }

        @Override // D7.InterfaceC0781e
        public void a() {
            Log.e(OtpVerifyModule.TAG, "sms listener cancelled");
        }
    }

    class b implements OnCompleteListener {
        b() {
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(Task task) {
            Log.e(OtpVerifyModule.TAG, "sms listener complete");
        }
    }

    class c implements InterfaceC0783g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f23110a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OtpVerifyModule f23111b;

        c(OtpVerifyModule otpVerifyModule, Promise promise) {
            this.f23110a = promise;
            this.f23111b = otpVerifyModule;
        }

        @Override // D7.InterfaceC0783g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            Log.e(OtpVerifyModule.TAG, "started sms listener");
            this.f23110a.resolve(Boolean.TRUE);
        }
    }

    class d implements InterfaceC0782f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f23112a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OtpVerifyModule f23113b;

        d(OtpVerifyModule otpVerifyModule, Promise promise) {
            this.f23112a = promise;
            this.f23113b = otpVerifyModule;
        }

        @Override // D7.InterfaceC0782f
        public void b(Exception exc) {
            Log.e(OtpVerifyModule.TAG, "Could not start sms listener", exc);
            this.f23112a.reject(exc);
        }
    }

    public OtpVerifyModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.isReceiverRegistered = false;
        this.reactContext = reactApplicationContext;
        this.mReceiver = new u5.b(reactApplicationContext);
        getReactApplicationContext().addLifecycleEventListener(this);
        registerReceiverIfNecessary(this.mReceiver);
        reactApplicationContext.addActivityEventListener(this);
        this.apiClient = new h.a(reactApplicationContext).a(J6.a.f4788b).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestHint$0(Activity activity, PendingIntent pendingIntent) {
        try {
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), RESOLVE_HINT, null, 0, 0, 0);
        } catch (Exception e10) {
            Log.e(TAG, "Launching the PendingIntent failed", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestHint$1(Exception exc) {
        Log.e(TAG, "Phone Number Hint failed", exc);
    }

    private void registerReceiverIfNecessary(BroadcastReceiver broadcastReceiver) {
        if (getCurrentActivity() == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                getCurrentActivity().registerReceiver(broadcastReceiver, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), "com.google.android.gms.auth.api.phone.permission.SEND", null, 2);
            } else {
                getCurrentActivity().registerReceiver(broadcastReceiver, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
            }
            Log.d(TAG, "Receiver Registered");
            this.isReceiverRegistered = true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void requestOtp(Promise promise) {
        Task M10 = L6.a.a(this.reactContext).M();
        M10.a(new a());
        M10.addOnCompleteListener(new b());
        M10.f(new c(this, promise));
        M10.d(new d(this, promise));
    }

    private void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        if (!this.isReceiverRegistered || getCurrentActivity() == null || broadcastReceiver == null) {
            return;
        }
        try {
            getCurrentActivity().unregisterReceiver(broadcastReceiver);
            Log.d(TAG, "Receiver UnRegistered");
            this.isReceiverRegistered = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void getHash(Promise promise) {
        try {
            ArrayList a10 = new C4870a(this.reactContext).a();
            WritableArray createArray = Arguments.createArray();
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                createArray.pushString((String) it.next());
            }
            promise.resolve(createArray);
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getOtp(Promise promise) {
        requestOtp(promise);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        if (i10 == RESOLVE_HINT && i11 == -1) {
            try {
                this.requestHintCallback.resolve(K6.b.a(activity).k(intent));
            } catch (S6.b e10) {
                this.requestHintCallback.reject(e10.getMessage());
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        unregisterReceiver(this.mReceiver);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        unregisterReceiver(this.mReceiver);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        registerReceiverIfNecessary(this.mReceiver);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void requestHint(Promise promise) {
        final Activity currentActivity = getCurrentActivity();
        this.requestHintCallback = promise;
        if (currentActivity == null) {
            promise.reject("No Activity Found", "Current Activity Null.");
            return;
        }
        try {
            K6.b.a(currentActivity).m(K6.a.j().a()).f(new InterfaceC0783g() { // from class: u5.d
                @Override // D7.InterfaceC0783g
                public final void onSuccess(Object obj) {
                    OtpVerifyModule.lambda$requestHint$0(currentActivity, (PendingIntent) obj);
                }
            }).d(new InterfaceC0782f() { // from class: u5.e
                @Override // D7.InterfaceC0782f
                public final void b(Exception exc) {
                    OtpVerifyModule.lambda$requestHint$1(exc);
                }
            });
        } catch (Exception e10) {
            this.requestHintCallback.reject(e10);
        }
    }
}
