package io.invertase.firebase.config;

import J8.q;
import J8.r;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import j8.C3511e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseConfigModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Config";
    private static HashMap<String, J8.d> mConfigUpdateRegistrations = new HashMap<>();
    private final o module;

    class a implements J8.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34340a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReactNativeFirebaseConfigModule f34341b;

        a(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, String str) {
            this.f34340a = str;
            this.f34341b = reactNativeFirebaseConfigModule;
        }

        @Override // J8.c
        public void a(J8.b bVar) {
            Zb.g i10 = Zb.g.i();
            ArrayList arrayList = new ArrayList(bVar.b());
            HashMap hashMap = new HashMap();
            hashMap.put("appName", this.f34340a);
            hashMap.put("resultType", "success");
            hashMap.put("updatedKeys", arrayList);
            i10.o(new Zb.b("on_config_updated", Arguments.makeNativeMap(hashMap), this.f34340a));
        }

        @Override // J8.c
        public void b(q qVar) {
            Zb.g i10 = Zb.g.i();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("resultType", AppConstants.VIDEO_RECORDING_ERROR);
            createMap.putString("appName", this.f34340a);
            int i11 = b.f34342a[qVar.a().ordinal()];
            if (i11 == 1) {
                createMap.putString(AppConstants.RETAKE_ERROR_CODE, "config_update_stream_error");
            } else if (i11 == 2) {
                createMap.putString(AppConstants.RETAKE_ERROR_CODE, "config_update_message_invalid");
            } else if (i11 == 3) {
                createMap.putString(AppConstants.RETAKE_ERROR_CODE, "config_update_not_fetched");
            } else if (i11 == 4) {
                createMap.putString(AppConstants.RETAKE_ERROR_CODE, "config_update_unavailable");
            } else if (i11 != 5) {
                createMap.putString(AppConstants.RETAKE_ERROR_CODE, "internal");
            } else {
                createMap.putString(AppConstants.RETAKE_ERROR_CODE, "unknown");
            }
            createMap.putString("message", qVar.getMessage());
            createMap.putString("nativeErrorMessage", qVar.getMessage());
            i10.o(new Zb.b("on_config_updated", createMap, this.f34340a));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34342a;

        static {
            int[] iArr = new int[q.a.values().length];
            f34342a = iArr;
            try {
                iArr[q.a.CONFIG_UPDATE_STREAM_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34342a[q.a.CONFIG_UPDATE_MESSAGE_INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34342a[q.a.CONFIG_UPDATE_NOT_FETCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34342a[q.a.CONFIG_UPDATE_UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34342a[q.a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    ReactNativeFirebaseConfigModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new o(reactApplicationContext, SERVICE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$activate$0(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureInitialized$7(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(null));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetch$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            rejectPromiseWithConfigException(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchAndActivate$2(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            rejectPromiseWithConfigException(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reset$3(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            rejectPromiseWithConfigException(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setConfigSettings$4(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCustomSignals$8(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDefaults$5(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDefaultsFromResource$6(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
            return;
        }
        Exception exception = task.getException();
        if (exception != null && exception.getMessage().equals("resource_not_found")) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "resource_not_found", "The specified resource name was not found.");
        }
        ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
    }

    private void rejectPromiseWithConfigException(Promise promise, Exception exc) {
        if (exc == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "unknown", "Operation cannot be completed successfully, due to an unknown error.");
        } else if (exc.getCause() instanceof r) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "throttled", "fetch() operation cannot be completed successfully, due to throttling.", exc.getMessage());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "failure", "fetch() operation cannot be completed successfully.", exc.getMessage());
        }
    }

    private WritableMap resultWithConstants(Object obj) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("result", obj);
        hashMap.put("constants", this.module.p("[DEFAULT]"));
        return Arguments.makeNativeMap(hashMap);
    }

    @ReactMethod
    public void activate(String str, final Promise promise) {
        this.module.j(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.this.lambda$activate$0(promise, task);
            }
        });
    }

    @ReactMethod
    public void ensureInitialized(String str, final Promise promise) {
        this.module.l(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.this.lambda$ensureInitialized$7(promise, task);
            }
        });
    }

    @ReactMethod
    public void fetch(String str, double d10, final Promise promise) {
        this.module.m(str, (long) d10).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.this.lambda$fetch$1(promise, task);
            }
        });
    }

    @ReactMethod
    public void fetchAndActivate(String str, final Promise promise) {
        this.module.n(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.this.lambda$fetchAndActivate$2(promise, task);
            }
        });
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.module.b();
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        Iterator<Map.Entry<String, J8.d>> it = mConfigUpdateRegistrations.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().remove();
            it.remove();
        }
    }

    @ReactMethod
    public void onConfigUpdated(String str) {
        if (mConfigUpdateRegistrations.get(str) == null) {
            mConfigUpdateRegistrations.put(str, com.google.firebase.remoteconfig.b.s(C3511e.o(str)).l(new a(this, str)));
        }
    }

    @ReactMethod
    public void removeConfigUpdateRegistration(String str) {
        J8.d dVar = mConfigUpdateRegistrations.get(str);
        if (dVar != null) {
            dVar.remove();
            mConfigUpdateRegistrations.remove(str);
        }
    }

    @ReactMethod
    public void reset(String str, final Promise promise) {
        this.module.w(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.this.lambda$reset$3(promise, task);
            }
        });
    }

    @ReactMethod
    public void setConfigSettings(String str, ReadableMap readableMap, final Promise promise) {
        this.module.x(str, Arguments.toBundle(readableMap)).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.c
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.this.lambda$setConfigSettings$4(promise, task);
            }
        });
    }

    @ReactMethod
    public void setCustomSignals(String str, ReadableMap readableMap, final Promise promise) {
        this.module.y(str, readableMap.toHashMap()).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.i
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.this.lambda$setCustomSignals$8(promise, task);
            }
        });
    }

    @ReactMethod
    public void setDefaults(String str, ReadableMap readableMap, final Promise promise) {
        this.module.z(str, readableMap.toHashMap()).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.this.lambda$setDefaults$5(promise, task);
            }
        });
    }

    @ReactMethod
    public void setDefaultsFromResource(String str, String str2, final Promise promise) {
        this.module.A(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.this.lambda$setDefaultsFromResource$6(promise, task);
            }
        });
    }
}
