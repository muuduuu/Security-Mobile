package com.reactnativegooglesignin;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C2017i;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class RNGoogleSigninModule extends NativeGoogleSigninSpec {
    public static final String PLAY_SERVICES_NOT_AVAILABLE = "PLAY_SERVICES_NOT_AVAILABLE";
    public static final int RC_SIGN_IN = 9001;
    public static final int REQUEST_CODE_ADD_SCOPES = 53295;
    public static final int REQUEST_CODE_RECOVER_AUTH = 53294;
    private static final String SHOULD_RECOVER = "SHOULD_RECOVER";
    private com.google.android.gms.auth.api.signin.b _apiClient;
    private com.reactnativegooglesignin.b pendingAuthRecovery;
    private final com.reactnativegooglesignin.c signInOrAddScopesPromiseWrapper;
    private final com.reactnativegooglesignin.c silentSignInPromiseWrapper;
    private final com.reactnativegooglesignin.c tokenClearingPromiseWrapper;
    private final com.reactnativegooglesignin.c tokenRetrievalPromiseWrapper;

    private static class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f29380a;

        a(RNGoogleSigninModule rNGoogleSigninModule) {
            this.f29380a = new WeakReference(rNGoogleSigninModule);
        }

        private void a(RNGoogleSigninModule rNGoogleSigninModule, Exception exc, WritableMap writableMap) {
            Activity currentActivity = rNGoogleSigninModule.getCurrentActivity();
            if (currentActivity != null) {
                rNGoogleSigninModule.pendingAuthRecovery = new com.reactnativegooglesignin.b(writableMap);
                currentActivity.startActivityForResult(((UserRecoverableAuthException) exc).a(), RNGoogleSigninModule.REQUEST_CODE_RECOVER_AUTH);
                return;
            }
            rNGoogleSigninModule.pendingAuthRecovery = null;
            rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().c("Cannot attempt recovery auth because app is not in foreground. " + exc.getLocalizedMessage());
        }

        private void c(RNGoogleSigninModule rNGoogleSigninModule, Exception exc, WritableMap writableMap, WritableMap writableMap2) {
            if (!(exc instanceof UserRecoverableAuthException)) {
                rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().b(exc);
            } else if (writableMap2 != null && writableMap2.hasKey(RNGoogleSigninModule.SHOULD_RECOVER) && writableMap2.getBoolean(RNGoogleSigninModule.SHOULD_RECOVER)) {
                a(rNGoogleSigninModule, exc, writableMap);
            } else {
                rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().b(exc);
            }
        }

        private void d(RNGoogleSigninModule rNGoogleSigninModule, WritableMap writableMap) {
            writableMap.putString("accessToken", I6.b.b(rNGoogleSigninModule.getReactApplicationContext(), new Account(writableMap.getMap("user").getString("email"), "com.google"), o.e(writableMap.getArray("scopes"))));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(WritableMap... writableMapArr) {
            WritableMap writableMap = writableMapArr[0];
            RNGoogleSigninModule rNGoogleSigninModule = (RNGoogleSigninModule) this.f29380a.get();
            if (rNGoogleSigninModule == null) {
                return null;
            }
            try {
                d(rNGoogleSigninModule, writableMap);
                rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().g(writableMap);
            } catch (Exception e10) {
                c(rNGoogleSigninModule, e10, writableMap, writableMapArr.length >= 2 ? writableMapArr[1] : null);
            }
            return null;
        }
    }

    private class b extends BaseActivityEventListener {
        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
            if (i10 == 9001) {
                Task c10 = com.google.android.gms.auth.api.signin.a.c(intent);
                RNGoogleSigninModule rNGoogleSigninModule = RNGoogleSigninModule.this;
                rNGoogleSigninModule.handleSignInTaskResult(c10, rNGoogleSigninModule.signInOrAddScopesPromiseWrapper);
            } else {
                if (i10 == 53294) {
                    if (i11 == -1) {
                        RNGoogleSigninModule.this.rerunFailedAuthTokenTask();
                        return;
                    } else {
                        RNGoogleSigninModule.this.tokenRetrievalPromiseWrapper.c("Failed authentication recovery attempt, probably user-rejected.");
                        return;
                    }
                }
                if (i10 == 53295) {
                    if (i11 == -1) {
                        RNGoogleSigninModule.this.signInOrAddScopesPromiseWrapper.g(Boolean.TRUE);
                    } else {
                        RNGoogleSigninModule.this.signInOrAddScopesPromiseWrapper.c("Failed to add scopes.");
                    }
                }
            }
        }

        private b() {
        }
    }

    private static class c extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f29382a;

        c(RNGoogleSigninModule rNGoogleSigninModule) {
            this.f29382a = new WeakReference(rNGoogleSigninModule);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            RNGoogleSigninModule rNGoogleSigninModule = (RNGoogleSigninModule) this.f29382a.get();
            if (rNGoogleSigninModule == null) {
                return null;
            }
            com.reactnativegooglesignin.c tokenClearingPromiseWrapper = rNGoogleSigninModule.getTokenClearingPromiseWrapper();
            try {
                I6.b.a(rNGoogleSigninModule.getReactApplicationContext(), strArr[0]);
                tokenClearingPromiseWrapper.g(null);
            } catch (Exception e10) {
                tokenClearingPromiseWrapper.b(e10);
            }
            return null;
        }
    }

    public RNGoogleSigninModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.signInOrAddScopesPromiseWrapper = new com.reactnativegooglesignin.c(NativeGoogleSigninSpec.NAME);
        this.silentSignInPromiseWrapper = new com.reactnativegooglesignin.c(NativeGoogleSigninSpec.NAME);
        this.tokenRetrievalPromiseWrapper = new com.reactnativegooglesignin.c(NativeGoogleSigninSpec.NAME);
        this.tokenClearingPromiseWrapper = new com.reactnativegooglesignin.c(NativeGoogleSigninSpec.NAME);
        reactApplicationContext.addActivityEventListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSignInTaskResult(Task<GoogleSignInAccount> task, com.reactnativegooglesignin.c cVar) {
        try {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) task.k(S6.b.class);
            if (googleSignInAccount == null) {
                cVar.c("GoogleSignInAccount instance was null");
            } else {
                cVar.g(o.d(googleSignInAccount));
            }
        } catch (S6.b e10) {
            cVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSignOutOrRevokeAccessTask, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$signOut$3(Task<Void> task, Promise promise) {
        if (task.isSuccessful()) {
            promise.resolve(null);
            return;
        }
        int b10 = o.b(task);
        promise.reject(String.valueOf(b10), N6.c.a(b10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signIn$2(Activity activity) {
        activity.startActivityForResult(this._apiClient.M(), RC_SIGN_IN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInSilently$0(Task task) {
        handleSignInTaskResult(task, this.silentSignInPromiseWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInSilently$1() {
        Task P10 = this._apiClient.P();
        if (P10.isSuccessful()) {
            handleSignInTaskResult(P10, this.silentSignInPromiseWrapper);
        } else {
            P10.addOnCompleteListener(new OnCompleteListener() { // from class: com.reactnativegooglesignin.f
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    RNGoogleSigninModule.this.lambda$signInSilently$0(task);
                }
            });
        }
    }

    static void rejectWithNullActivity(Promise promise) {
        promise.reject(NativeGoogleSigninSpec.NAME, "activity is null");
    }

    private void rejectWithNullClientError(Promise promise) {
        promise.reject(NativeGoogleSigninSpec.NAME, "apiClient is null - call configure() first");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rerunFailedAuthTokenTask() {
        WritableMap a10 = this.pendingAuthRecovery.a();
        if (a10 != null) {
            new a(this).execute(a10, null);
        } else {
            this.tokenRetrievalPromiseWrapper.c("rerunFailedAuthTokenTask: recovery failed");
        }
    }

    private void startTokenRetrievalTaskWithRecovery(GoogleSignInAccount googleSignInAccount) {
        WritableMap d10 = o.d(googleSignInAccount);
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean(SHOULD_RECOVER, true);
        new a(this).execute(d10, createMap);
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void addScopes(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            rejectWithNullActivity(promise);
            return;
        }
        GoogleSignInAccount b10 = com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext());
        if (b10 == null) {
            promise.resolve(Boolean.FALSE);
        } else {
            this.signInOrAddScopesPromiseWrapper.h(promise, "addScopes");
            com.google.android.gms.auth.api.signin.a.d(currentActivity, REQUEST_CODE_ADD_SCOPES, b10, o.a(readableMap.getArray("scopes")));
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void clearCachedAccessToken(String str, Promise promise) {
        this.tokenClearingPromiseWrapper.h(promise, "clearCachedAccessToken");
        new c(this).execute(str);
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void configure(ReadableMap readableMap, Promise promise) {
        this._apiClient = com.google.android.gms.auth.api.signin.a.a(getReactApplicationContext(), o.c(o.a(readableMap.hasKey("scopes") ? readableMap.getArray("scopes") : Arguments.createArray()), readableMap.hasKey("webClientId") ? readableMap.getString("webClientId") : null, readableMap.hasKey("offlineAccess") && readableMap.getBoolean("offlineAccess"), readableMap.hasKey("forceCodeForRefreshToken") && readableMap.getBoolean("forceCodeForRefreshToken"), readableMap.hasKey("accountName") ? readableMap.getString("accountName") : null, readableMap.hasKey("hostedDomain") ? readableMap.getString("hostedDomain") : null));
        promise.resolve(null);
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getCurrentUser() {
        GoogleSignInAccount b10 = com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext());
        if (b10 == null) {
            return null;
        }
        return o.d(b10);
    }

    public com.reactnativegooglesignin.c getTokenClearingPromiseWrapper() {
        return this.tokenClearingPromiseWrapper;
    }

    public com.reactnativegooglesignin.c getTokenRetrievalPromiseWrapper() {
        return this.tokenRetrievalPromiseWrapper;
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void getTokens(Promise promise) {
        GoogleSignInAccount b10 = com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext());
        if (b10 == null) {
            promise.reject("getTokens", "getTokens requires a user to be signed in");
        } else {
            this.tokenRetrievalPromiseWrapper.h(promise, "getTokens");
            startTokenRetrievalTaskWithRecovery(b10);
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    protected Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("BUTTON_SIZE_ICON", 2);
        hashMap.put("BUTTON_SIZE_STANDARD", 0);
        hashMap.put("BUTTON_SIZE_WIDE", 1);
        hashMap.put("SIGN_IN_CANCELLED", String.valueOf(12501));
        hashMap.put("SIGN_IN_REQUIRED", String.valueOf(4));
        hashMap.put("SCOPES_ALREADY_GRANTED", "NEVER_HAPPENS_ON_ANDROID");
        hashMap.put("ONE_TAP_START_FAILED", "ONE_TAP_START_FAILED");
        hashMap.put("NO_SAVED_CREDENTIAL_FOUND", "NO_SAVED_CREDENTIAL_FOUND");
        hashMap.put("IN_PROGRESS", "ASYNC_OP_IN_PROGRESS");
        hashMap.put(PLAY_SERVICES_NOT_AVAILABLE, PLAY_SERVICES_NOT_AVAILABLE);
        return hashMap;
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasPreviousSignIn() {
        return com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext()) != null;
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void playServicesAvailable(boolean z10, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.w(NativeGoogleSigninSpec.NAME, "could not determine playServicesAvailable, activity is null");
            rejectWithNullActivity(promise);
            return;
        }
        C2017i q10 = C2017i.q();
        int i10 = q10.i(currentActivity);
        if (i10 == 0) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        if (z10 && q10.m(i10)) {
            q10.n(currentActivity, i10, 2404).show();
        }
        promise.reject(PLAY_SERVICES_NOT_AVAILABLE, "Play services not available");
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void revokeAccess(final Promise promise) {
        com.google.android.gms.auth.api.signin.b bVar = this._apiClient;
        if (bVar == null) {
            rejectWithNullClientError(promise);
        } else {
            bVar.N().addOnCompleteListener(new OnCompleteListener() { // from class: com.reactnativegooglesignin.i
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    RNGoogleSigninModule.this.lambda$revokeAccess$4(promise, task);
                }
            });
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void signIn(ReadableMap readableMap, Promise promise) {
        if (this._apiClient == null) {
            rejectWithNullClientError(promise);
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            rejectWithNullActivity(promise);
        } else {
            this.signInOrAddScopesPromiseWrapper.h(promise, "signIn");
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativegooglesignin.h
                @Override // java.lang.Runnable
                public final void run() {
                    RNGoogleSigninModule.this.lambda$signIn$2(currentActivity);
                }
            });
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void signInSilently(Promise promise) {
        if (this._apiClient == null) {
            rejectWithNullClientError(promise);
        } else {
            this.silentSignInPromiseWrapper.h(promise, "signInSilently");
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativegooglesignin.j
                @Override // java.lang.Runnable
                public final void run() {
                    RNGoogleSigninModule.this.lambda$signInSilently$1();
                }
            });
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void signOut(final Promise promise) {
        com.google.android.gms.auth.api.signin.b bVar = this._apiClient;
        if (bVar == null) {
            rejectWithNullClientError(promise);
        } else {
            bVar.O().addOnCompleteListener(new OnCompleteListener() { // from class: com.reactnativegooglesignin.g
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    RNGoogleSigninModule.this.lambda$signOut$3(promise, task);
                }
            });
        }
    }
}
