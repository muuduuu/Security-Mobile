package io.invertase.firebase.messaging;

import D7.AbstractC0789m;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.W;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import j8.C3511e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseMessagingModule extends ReactNativeFirebaseModule implements ActivityEventListener {
    private static final String TAG = "Messaging";
    ReadableMap initialNotification;
    private HashMap<String, Boolean> initialNotificationMap;

    ReactNativeFirebaseMessagingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
        this.initialNotification = null;
        this.initialNotificationMap = new HashMap<>();
        reactApplicationContext.addActivityEventListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$deleteToken$8(FirebaseMessaging firebaseMessaging) {
        AbstractC0789m.a(firebaseMessaging.p());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteToken$9(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getToken$6(FirebaseMessaging firebaseMessaging) {
        return (String) AbstractC0789m.a(firebaseMessaging.w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getToken$7(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$hasPermission$10() {
        return Boolean.valueOf(androidx.core.app.v.b(getReactApplicationContext()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hasPermission$11(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(Integer.valueOf(((Boolean) task.getResult()).booleanValue() ? 1 : 0));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$isNotificationDelegationEnabled$2() {
        FirebaseMessaging.t().E();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$isNotificationDelegationEnabled$3(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$sendMessage$12(ReadableMap readableMap) {
        FirebaseMessaging.t().R(u.e(readableMap));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendMessage$13(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$setAutoInitEnabled$0(Boolean bool) {
        FirebaseMessaging.t().S(bool.booleanValue());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAutoInitEnabled$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(Boolean.valueOf(FirebaseMessaging.t().C()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$setDeliveryMetricsExportToBigQuery$16(Boolean bool) {
        FirebaseMessaging.t().T(bool.booleanValue());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDeliveryMetricsExportToBigQuery$17(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(Boolean.valueOf(FirebaseMessaging.t().q()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$setNotificationDelegationEnabled$4(Boolean bool) {
        FirebaseMessaging.t().U(bool.booleanValue());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setNotificationDelegationEnabled$5(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(Boolean.valueOf(FirebaseMessaging.t().E()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$subscribeToTopic$14(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unsubscribeFromTopic$15(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    private WritableMap popRemoteMessageMapFromMessagingStore(String str) {
        v b10 = w.a().b();
        WritableMap a10 = b10.a(str);
        b10.b(str);
        return a10;
    }

    @ReactMethod
    public void deleteToken(String str, String str2, final Promise promise) {
        final FirebaseMessaging firebaseMessaging = (FirebaseMessaging) C3511e.o(str).j(FirebaseMessaging.class);
        AbstractC0789m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object lambda$deleteToken$8;
                lambda$deleteToken$8 = ReactNativeFirebaseMessagingModule.lambda$deleteToken$8(FirebaseMessaging.this);
                return lambda$deleteToken$8;
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.lambda$deleteToken$9(Promise.this, task);
            }
        });
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("isAutoInitEnabled", Boolean.valueOf(FirebaseMessaging.t().C()));
        hashMap.put("isDeliveryMetricsExportToBigQueryEnabled", Boolean.valueOf(FirebaseMessaging.t().q()));
        hashMap.put("isNotificationDelegationEnabled", Boolean.valueOf(FirebaseMessaging.t().E()));
        return hashMap;
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        ReadableMap readableMap = this.initialNotification;
        if (readableMap != null) {
            promise.resolve(readableMap);
            this.initialNotification = null;
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            Intent intent = currentActivity.getIntent();
            if (intent != null && intent.getExtras() != null) {
                String string = intent.getExtras().getString("google.message_id");
                if (string == null) {
                    string = intent.getExtras().getString("message_id");
                }
                if (string != null && this.initialNotificationMap.get(string) == null) {
                    W w10 = (W) ReactNativeFirebaseMessagingReceiver.f34378a.get(string);
                    WritableMap popRemoteMessageMapFromMessagingStore = w10 == null ? popRemoteMessageMapFromMessagingStore(string) : u.i(w10);
                    if (popRemoteMessageMapFromMessagingStore != null) {
                        promise.resolve(popRemoteMessageMapFromMessagingStore);
                        this.initialNotificationMap.put(string, Boolean.TRUE);
                        return;
                    }
                }
            }
        } else {
            Log.w(TAG, "Attempt to call getInitialNotification failed. The current activity is not ready, try calling the method later in the React lifecycle.");
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void getToken(String str, String str2, final Promise promise) {
        final FirebaseMessaging firebaseMessaging = (FirebaseMessaging) C3511e.o(str).j(FirebaseMessaging.class);
        AbstractC0789m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String lambda$getToken$6;
                lambda$getToken$6 = ReactNativeFirebaseMessagingModule.lambda$getToken$6(FirebaseMessaging.this);
                return lambda$getToken$6;
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.o
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.lambda$getToken$7(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void hasPermission(final Promise promise) {
        AbstractC0789m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean lambda$hasPermission$10;
                lambda$hasPermission$10 = ReactNativeFirebaseMessagingModule.this.lambda$hasPermission$10();
                return lambda$hasPermission$10;
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.m
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.lambda$hasPermission$11(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void isNotificationDelegationEnabled(final Promise promise) {
        AbstractC0789m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object lambda$isNotificationDelegationEnabled$2;
                lambda$isNotificationDelegationEnabled$2 = ReactNativeFirebaseMessagingModule.lambda$isNotificationDelegationEnabled$2();
                return lambda$isNotificationDelegationEnabled$2;
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.k
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.lambda$isNotificationDelegationEnabled$3(Promise.this, task);
            }
        });
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        if (intent == null || intent.getExtras() == null) {
            return;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string != null) {
            W w10 = (W) ReactNativeFirebaseMessagingReceiver.f34378a.get(string);
            WritableMap popRemoteMessageMapFromMessagingStore = w10 == null ? popRemoteMessageMapFromMessagingStore(string) : u.i(w10);
            if (popRemoteMessageMapFromMessagingStore != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.merge(popRemoteMessageMapFromMessagingStore);
                this.initialNotification = writableNativeMap;
                ReactNativeFirebaseMessagingReceiver.f34378a.remove(string);
                Zb.g.i().o(u.f(popRemoteMessageMapFromMessagingStore, Boolean.TRUE));
            }
        }
    }

    @ReactMethod
    public void sendMessage(final ReadableMap readableMap, final Promise promise) {
        AbstractC0789m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object lambda$sendMessage$12;
                lambda$sendMessage$12 = ReactNativeFirebaseMessagingModule.lambda$sendMessage$12(ReadableMap.this);
                return lambda$sendMessage$12;
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.q
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.lambda$sendMessage$13(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setAutoInitEnabled(final Boolean bool, final Promise promise) {
        AbstractC0789m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object lambda$setAutoInitEnabled$0;
                lambda$setAutoInitEnabled$0 = ReactNativeFirebaseMessagingModule.lambda$setAutoInitEnabled$0(bool);
                return lambda$setAutoInitEnabled$0;
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.lambda$setAutoInitEnabled$1(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setDeliveryMetricsExportToBigQuery(final Boolean bool, final Promise promise) {
        AbstractC0789m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object lambda$setDeliveryMetricsExportToBigQuery$16;
                lambda$setDeliveryMetricsExportToBigQuery$16 = ReactNativeFirebaseMessagingModule.lambda$setDeliveryMetricsExportToBigQuery$16(bool);
                return lambda$setDeliveryMetricsExportToBigQuery$16;
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.c
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.lambda$setDeliveryMetricsExportToBigQuery$17(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setNotificationDelegationEnabled(final Boolean bool, final Promise promise) {
        AbstractC0789m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object lambda$setNotificationDelegationEnabled$4;
                lambda$setNotificationDelegationEnabled$4 = ReactNativeFirebaseMessagingModule.lambda$setNotificationDelegationEnabled$4(bool);
                return lambda$setNotificationDelegationEnabled$4;
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.lambda$setNotificationDelegationEnabled$5(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void subscribeToTopic(String str, final Promise promise) {
        FirebaseMessaging.t().Z(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.lambda$subscribeToTopic$14(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void unsubscribeFromTopic(String str, final Promise promise) {
        FirebaseMessaging.t().c0(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.messaging.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseMessagingModule.lambda$unsubscribeFromTopic$15(Promise.this, task);
            }
        });
    }
}
