package io.invertase.firebase.analytics;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseAnalyticsModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Analytics";
    private final v module;

    ReactNativeFirebaseAnalyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new v(reactApplicationContext, SERVICE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAppInstanceId$3(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getSessionId$4(Promise promise, Task task) {
        if (!task.isSuccessful()) {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        } else {
            Long l10 = (Long) task.getResult();
            promise.resolve(l10 != null ? Double.valueOf(l10.doubleValue()) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$logEvent$0(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$resetAnalyticsData$8(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAnalyticsCollectionEnabled$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setConsent$10(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDefaultEventParameters$9(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setSessionTimeoutDuration$2(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUserId$5(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUserProperties$7(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUserProperty$6(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    private Bundle toBundle(ReadableMap readableMap) {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) bundle.getSerializable("items");
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Bundle) {
                Bundle bundle2 = (Bundle) next;
                if (bundle2.containsKey("quantity")) {
                    bundle2.putInt("quantity", (int) bundle2.getDouble("quantity"));
                }
            }
        }
        if (bundle.containsKey("extend_session")) {
            bundle.putLong("extend_session", (long) bundle.getDouble("extend_session"));
        }
        return bundle;
    }

    @ReactMethod
    public void getAppInstanceId(final Promise promise) {
        this.module.o().addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.lambda$getAppInstanceId$3(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void getSessionId(final Promise promise) {
        this.module.p().addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.lambda$getSessionId$4(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void logEvent(String str, ReadableMap readableMap, final Promise promise) {
        this.module.z(str, toBundle(readableMap)).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.lambda$logEvent$0(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void resetAnalyticsData(final Promise promise) {
        this.module.A().addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.lambda$resetAnalyticsData$8(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setAnalyticsCollectionEnabled(Boolean bool, final Promise promise) {
        this.module.B(bool).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.lambda$setAnalyticsCollectionEnabled$1(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setConsent(ReadableMap readableMap, final Promise promise) {
        this.module.C(Arguments.toBundle(readableMap)).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.c
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.lambda$setConsent$10(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setDefaultEventParameters(ReadableMap readableMap, final Promise promise) {
        this.module.D(toBundle(readableMap)).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.lambda$setDefaultEventParameters$9(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setSessionTimeoutDuration(double d10, final Promise promise) {
        this.module.E((long) d10).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.lambda$setSessionTimeoutDuration$2(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setUserId(String str, final Promise promise) {
        this.module.F(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.k
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.lambda$setUserId$5(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setUserProperties(ReadableMap readableMap, final Promise promise) {
        this.module.G(Arguments.toBundle(readableMap)).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.i
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.lambda$setUserProperties$7(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setUserProperty(String str, String str2, final Promise promise) {
        this.module.H(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.lambda$setUserProperty$6(Promise.this, task);
            }
        });
    }
}
