package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.G;
import c3.AbstractC1721a;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Map;
import v4.AbstractC4929e;

@K4.a(name = NativeDialogManagerAndroidSpec.NAME)
/* loaded from: classes.dex */
public class DialogModule extends NativeDialogManagerAndroidSpec implements LifecycleEventListener {
    static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    private boolean mIsInForeground;
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final Map<String, Object> CONSTANTS = AbstractC4929e.h(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, ACTION_DISMISSED, ACTION_DISMISSED, KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f21796a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f21797b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callback f21798c;

        a(c cVar, Bundle bundle, Callback callback) {
            this.f21796a = cVar;
            this.f21797b = bundle;
            this.f21798c = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21796a.b(this.f21797b, this.f21798c);
        }
    }

    class b implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* renamed from: a, reason: collision with root package name */
        private final Callback f21800a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f21801b = false;

        public b(Callback callback) {
            this.f21800a = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f21801b || !DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.f21800a.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i10));
            this.f21801b = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f21801b || !DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.f21800a.invoke(DialogModule.ACTION_DISMISSED);
            this.f21801b = true;
        }
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        private final G f21803a;

        /* renamed from: b, reason: collision with root package name */
        private Object f21804b;

        public c(G g10) {
            this.f21803a = g10;
        }

        private void a() {
            com.facebook.react.modules.dialog.a aVar;
            if (DialogModule.this.mIsInForeground && (aVar = (com.facebook.react.modules.dialog.a) this.f21803a.i0(DialogModule.FRAGMENT_TAG)) != null && aVar.isResumed()) {
                aVar.H();
            }
        }

        public void b(Bundle bundle, Callback callback) {
            UiThreadUtil.assertOnUiThread();
            a();
            com.facebook.react.modules.dialog.a aVar = new com.facebook.react.modules.dialog.a(callback != null ? DialogModule.this.new b(callback) : null, bundle);
            if (!DialogModule.this.mIsInForeground || this.f21803a.Q0()) {
                this.f21804b = aVar;
                return;
            }
            if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                aVar.R(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
            }
            aVar.U(this.f21803a, DialogModule.FRAGMENT_TAG);
        }

        public void c() {
            UiThreadUtil.assertOnUiThread();
            SoftAssertions.assertCondition(DialogModule.this.mIsInForeground, "showPendingAlert() called in background");
            if (this.f21804b == null) {
                return;
            }
            a();
            ((com.facebook.react.modules.dialog.a) this.f21804b).U(this.f21803a, DialogModule.FRAGMENT_TAG);
            this.f21804b = null;
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private c getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof AbstractActivityC1577t)) {
            return null;
        }
        return new c(((AbstractActivityC1577t) currentActivity).getSupportFragmentManager());
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mIsInForeground = true;
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.c();
        } else {
            AbstractC1721a.F(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(KEY_TITLE)) {
            bundle.putString(KEY_TITLE, readableMap.getString(KEY_TITLE));
        }
        if (readableMap.hasKey(KEY_MESSAGE)) {
            bundle.putString(KEY_MESSAGE, readableMap.getString(KEY_MESSAGE));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey(KEY_ITEMS)) {
            ReadableArray array = readableMap.getArray(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i10 = 0; i10 < array.size(); i10++) {
                charSequenceArr[i10] = array.getString(i10);
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new a(fragmentManagerHelper, bundle, callback2));
    }
}
