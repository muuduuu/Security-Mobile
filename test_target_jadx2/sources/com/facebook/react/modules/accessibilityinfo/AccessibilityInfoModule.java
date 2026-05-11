package com.facebook.react.modules.accessibilityinfo;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.fbreact.specs.NativeAccessibilityInfoSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@K4.a(name = NativeAccessibilityInfoSpec.NAME)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0003>?@B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\tJ\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\tJ\u0019\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u00060+R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u00060.R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;", "Lcom/facebook/fbreact/specs/NativeAccessibilityInfoSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", BuildConfig.FLAVOR, "updateAndSendReduceMotionChangeEvent", "()V", BuildConfig.FLAVOR, AppConstants.VIDEO_RECORDING_ENABLED, "updateAndSendTouchExplorationChangeEvent", "(Z)V", "updateAndSendAccessibilityServiceChangeEvent", "Lcom/facebook/react/bridge/Callback;", "successCallback", "isReduceMotionEnabled", "(Lcom/facebook/react/bridge/Callback;)V", "isTouchExplorationEnabled", "isAccessibilityServiceEnabled", "onHostResume", "onHostPause", "initialize", "invalidate", "onHostDestroy", BuildConfig.FLAVOR, "message", "announceForAccessibility", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "reactTag", "setAccessibilityFocus", "(D)V", "originalTimeout", "getRecommendedTimeoutMillis", "(DLcom/facebook/react/bridge/Callback;)V", "Landroid/database/ContentObserver;", "animationScaleObserver", "Landroid/database/ContentObserver;", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;", "touchExplorationStateChangeListener", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;", "accessibilityServiceChangeListener", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/content/ContentResolver;", "reduceMotionEnabled", "Z", "touchExplorationEnabled", "accessibilityServiceEnabled", BuildConfig.FLAVOR, "recommendedTimeout", "I", "isReduceMotionEnabledValue", "()Z", "Companion", C4870a.f43493a, "b", "c", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccessibilityInfoModule extends NativeAccessibilityInfoSpec implements LifecycleEventListener {
    private static final String ACCESSIBILITY_SERVICE_EVENT_NAME = "accessibilityServiceDidChange";
    private static final a Companion = new a(null);
    private static final String REDUCE_MOTION_EVENT_NAME = "reduceMotionDidChange";
    private static final String TOUCH_EXPLORATION_EVENT_NAME = "touchExplorationDidChange";
    private final AccessibilityManager accessibilityManager;
    private final b accessibilityServiceChangeListener;
    private boolean accessibilityServiceEnabled;
    private final ContentObserver animationScaleObserver;
    private final ContentResolver contentResolver;
    private int recommendedTimeout;
    private boolean reduceMotionEnabled;
    private boolean touchExplorationEnabled;
    private final c touchExplorationStateChangeListener;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z10) {
            AccessibilityInfoModule.this.updateAndSendAccessibilityServiceChangeEvent(z10);
        }
    }

    private final class c implements AccessibilityManager.TouchExplorationStateChangeListener {
        public c() {
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            AccessibilityInfoModule.this.updateAndSendTouchExplorationChangeEvent(z10);
        }
    }

    public static final class d extends ContentObserver {
        d(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            onChange(z10, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            if (AccessibilityInfoModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                AccessibilityInfoModule.this.updateAndSendReduceMotionChangeEvent();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityInfoModule(ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.animationScaleObserver = new d(UiThreadUtil.getUiThreadHandler());
        this.touchExplorationStateChangeListener = new c();
        this.accessibilityServiceChangeListener = new b();
        Object systemService = context.getApplicationContext().getSystemService("accessibility");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        this.contentResolver = contentResolver;
        this.touchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
        this.accessibilityServiceEnabled = accessibilityManager.isEnabled();
        this.reduceMotionEnabled = isReduceMotionEnabledValue();
    }

    private final boolean isReduceMotionEnabledValue() {
        String string = Settings.Global.getString(this.contentResolver, "transition_animation_scale");
        return (string != null ? Float.parseFloat(string) : 1.0f) == 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendAccessibilityServiceChangeEvent(boolean enabled) {
        if (this.accessibilityServiceEnabled != enabled) {
            this.accessibilityServiceEnabled = enabled;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(ACCESSIBILITY_SERVICE_EVENT_NAME, Boolean.valueOf(this.accessibilityServiceEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendReduceMotionChangeEvent() {
        boolean isReduceMotionEnabledValue = isReduceMotionEnabledValue();
        if (this.reduceMotionEnabled != isReduceMotionEnabledValue) {
            this.reduceMotionEnabled = isReduceMotionEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(REDUCE_MOTION_EVENT_NAME, Boolean.valueOf(this.reduceMotionEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendTouchExplorationChangeEvent(boolean enabled) {
        if (this.touchExplorationEnabled != enabled) {
            this.touchExplorationEnabled = enabled;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(TOUCH_EXPLORATION_EVENT_NAME, Boolean.valueOf(this.touchExplorationEnabled));
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void announceForAccessibility(String message) {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.getText().add(message);
        obtain.setClassName(AccessibilityInfoModule.class.getName());
        obtain.setPackageName(getReactApplicationContext().getPackageName());
        this.accessibilityManager.sendAccessibilityEvent(obtain);
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void getRecommendedTimeoutMillis(double originalTimeout, Callback successCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        if (Build.VERSION.SDK_INT < 29) {
            successCallback.invoke(Integer.valueOf((int) originalTimeout));
            return;
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        int recommendedTimeoutMillis = accessibilityManager != null ? accessibilityManager.getRecommendedTimeoutMillis((int) originalTimeout, 4) : 0;
        this.recommendedTimeout = recommendedTimeoutMillis;
        successCallback.invoke(Integer.valueOf(recommendedTimeoutMillis));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        boolean z10 = false;
        updateAndSendTouchExplorationChangeEvent(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled());
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null && accessibilityManager2.isEnabled()) {
            z10 = true;
        }
        updateAndSendAccessibilityServiceChangeEvent(z10);
        updateAndSendReduceMotionChangeEvent();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isAccessibilityServiceEnabled(Callback successCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        successCallback.invoke(Boolean.valueOf(this.accessibilityServiceEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isReduceMotionEnabled(Callback successCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        successCallback.invoke(Boolean.valueOf(this.reduceMotionEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isTouchExplorationEnabled(Callback successCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        successCallback.invoke(Boolean.valueOf(this.touchExplorationEnabled));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null) {
            accessibilityManager2.removeAccessibilityStateChangeListener(this.accessibilityServiceChangeListener);
        }
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null) {
            accessibilityManager2.addAccessibilityStateChangeListener(this.accessibilityServiceChangeListener);
        }
        boolean z10 = false;
        this.contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, this.animationScaleObserver);
        AccessibilityManager accessibilityManager3 = this.accessibilityManager;
        updateAndSendTouchExplorationChangeEvent(accessibilityManager3 != null && accessibilityManager3.isTouchExplorationEnabled());
        AccessibilityManager accessibilityManager4 = this.accessibilityManager;
        if (accessibilityManager4 != null && accessibilityManager4.isEnabled()) {
            z10 = true;
        }
        updateAndSendAccessibilityServiceChangeEvent(z10);
        updateAndSendReduceMotionChangeEvent();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void setAccessibilityFocus(double reactTag) {
    }
}
