package io.invertase.firebase.installations;

import D7.AbstractC0789m;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import j8.C3511e;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseInstallationsModule extends ReactNativeFirebaseModule {
    private static final String TAG = "Installations";

    ReactNativeFirebaseInstallationsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$delete$4(C3511e c3511e) {
        return (Void) AbstractC0789m.a(com.google.firebase.installations.c.t(c3511e).j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$delete$5(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(null);
            return;
        }
        Log.e(TAG, "RNFB: Unknown error while deleting Installations" + task.getException().getMessage());
        ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "delete-error", task.getException().getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getId$0(C3511e c3511e) {
        return (String) AbstractC0789m.a(com.google.firebase.installations.c.t(c3511e).getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getId$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
            return;
        }
        Log.e(TAG, "RNFB: Unknown error while fetching Installations ID " + task.getException().getMessage());
        ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "id-error", task.getException().getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.firebase.installations.g lambda$getToken$2(C3511e c3511e, boolean z10) {
        return (com.google.firebase.installations.g) AbstractC0789m.a(com.google.firebase.installations.c.t(c3511e).a(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getToken$3(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(((com.google.firebase.installations.g) task.getResult()).b());
            return;
        }
        Log.e(TAG, "RNFB: Unknown error while fetching Installations token " + task.getException().getMessage());
        ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "token-error", task.getException().getMessage());
    }

    @ReactMethod
    public void delete(String str, final Promise promise) {
        final C3511e o10 = C3511e.o(str);
        AbstractC0789m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.installations.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$delete$4;
                lambda$delete$4 = ReactNativeFirebaseInstallationsModule.lambda$delete$4(C3511e.this);
                return lambda$delete$4;
            }
        }).c(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.installations.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseInstallationsModule.lambda$delete$5(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void getId(String str, final Promise promise) {
        final C3511e o10 = C3511e.o(str);
        AbstractC0789m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.installations.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String lambda$getId$0;
                lambda$getId$0 = ReactNativeFirebaseInstallationsModule.lambda$getId$0(C3511e.this);
                return lambda$getId$0;
            }
        }).c(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.installations.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseInstallationsModule.lambda$getId$1(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void getToken(String str, final boolean z10, final Promise promise) {
        final C3511e o10 = C3511e.o(str);
        AbstractC0789m.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.installations.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.firebase.installations.g lambda$getToken$2;
                lambda$getToken$2 = ReactNativeFirebaseInstallationsModule.lambda$getToken$2(C3511e.this, z10);
                return lambda$getToken$2;
            }
        }).c(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.installations.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseInstallationsModule.lambda$getToken$3(Promise.this, task);
            }
        });
    }
}
