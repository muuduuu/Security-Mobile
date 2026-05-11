package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.fbreact.specs.NativeIntentAndroidSpec;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import org.conscrypt.BuildConfig;

@K4.a(name = NativeIntentAndroidSpec.NAME)
/* loaded from: classes.dex */
public class IntentModule extends NativeIntentAndroidSpec {
    private static final String EXTRA_MAP_KEY_FOR_VALUE = "value";
    private LifecycleEventListener mInitialURLListener;

    class a implements LifecycleEventListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f21817a;

        a(Promise promise) {
            this.f21817a = promise;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            IntentModule.this.getInitialURL(this.f21817a);
            IntentModule.this.getReactApplicationContext().removeLifecycleEventListener(this);
            IntentModule.this.mInitialURLListener = null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21819a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f21819a = iArr;
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21819a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21819a[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public IntentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mInitialURLListener = null;
    }

    private void sendOSIntent(Intent intent, Boolean bool) {
        Activity currentActivity = getCurrentActivity();
        String packageName = getReactApplicationContext().getPackageName();
        ComponentName resolveActivity = intent.resolveActivity(getReactApplicationContext().getPackageManager());
        String packageName2 = resolveActivity != null ? resolveActivity.getPackageName() : BuildConfig.FLAVOR;
        if (bool.booleanValue() || currentActivity == null || !packageName.equals(packageName2)) {
            intent.addFlags(268435456);
        }
        if (currentActivity != null) {
            currentActivity.startActivity(intent);
        } else {
            getReactApplicationContext().startActivity(intent);
        }
    }

    private void waitForActivityAndGetInitialURL(Promise promise) {
        if (this.mInitialURLListener != null) {
            promise.reject(new IllegalStateException("Cannot await activity from more than one call to getInitialURL"));
        } else {
            this.mInitialURLListener = new a(promise);
            getReactApplicationContext().addLifecycleEventListener(this.mInitialURLListener);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void canOpenURL(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException("Invalid URL: " + str));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            promise.resolve(Boolean.valueOf(intent.resolveActivity(getReactApplicationContext().getPackageManager()) != null));
        } catch (Exception e10) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not check if URL '" + str + "' can be opened: " + e10.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void getInitialURL(Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                waitForActivityAndGetInitialURL(promise);
                return;
            }
            Intent intent = currentActivity.getIntent();
            String action = intent.getAction();
            Uri data = intent.getData();
            promise.resolve((data == null || !("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action))) ? null : data.toString());
        } catch (Exception e10) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not get the initial URL : " + e10.getMessage()));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        if (this.mInitialURLListener != null) {
            getReactApplicationContext().removeLifecycleEventListener(this.mInitialURLListener);
            this.mInitialURLListener = null;
        }
        super.invalidate();
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openSettings(Promise promise) {
        try {
            Intent intent = new Intent();
            Activity currentActivity = getCurrentActivity();
            String packageName = getReactApplicationContext().getPackageName();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + packageName));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            currentActivity.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not open the Settings: " + e10.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openURL(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException("Invalid URL: " + str));
            return;
        }
        try {
            sendOSIntent(new Intent("android.intent.action.VIEW", Uri.parse(str).normalizeScheme()), Boolean.FALSE);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not open URL '" + str + "': " + e10.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void sendIntent(String str, ReadableArray readableArray, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException("Invalid Action: " + str + "."));
            return;
        }
        Intent intent = new Intent(str);
        if (intent.resolveActivity(getReactApplicationContext().getPackageManager()) == null) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not launch Intent with action " + str + "."));
            return;
        }
        if (readableArray != null) {
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                ReadableMap map = readableArray.getMap(i10);
                String string = map.getString("key");
                int i11 = b.f21819a[map.getType(EXTRA_MAP_KEY_FOR_VALUE).ordinal()];
                if (i11 == 1) {
                    intent.putExtra(string, map.getString(EXTRA_MAP_KEY_FOR_VALUE));
                } else if (i11 == 2) {
                    intent.putExtra(string, Double.valueOf(map.getDouble(EXTRA_MAP_KEY_FOR_VALUE)));
                } else {
                    if (i11 != 3) {
                        promise.reject(new JSApplicationIllegalArgumentException("Extra type for " + string + " not supported."));
                        return;
                    }
                    intent.putExtra(string, map.getBoolean(EXTRA_MAP_KEY_FOR_VALUE));
                }
            }
        }
        sendOSIntent(intent, Boolean.TRUE);
    }
}
