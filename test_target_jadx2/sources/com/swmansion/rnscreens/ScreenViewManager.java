package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1973v0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c1;
import com.swmansion.rnscreens.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import v4.AbstractC4929e;

@K4.a(name = ScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 c2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0011\u0010\u001bJ!\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010)J\u001f\u0010.\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b0\u0010)J!\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b2\u0010)J!\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u0010)J!\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b6\u00107J!\u00109\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b9\u0010)J\u001f\u0010;\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010:\u001a\u00020,H\u0017¢\u0006\u0004\b;\u0010/J\u001f\u0010=\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010<\u001a\u00020,H\u0017¢\u0006\u0004\b=\u0010/J!\u0010?\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b?\u00107J\u001f\u0010A\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010@\u001a\u00020,H\u0017¢\u0006\u0004\bA\u0010/J\u001f\u0010C\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010B\u001a\u00020,H\u0017¢\u0006\u0004\bC\u0010/J\u001f\u0010E\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010D\u001a\u00020,H\u0017¢\u0006\u0004\bE\u0010/J!\u0010G\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bG\u0010\u001bJ!\u0010H\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bH\u0010/J!\u0010I\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bI\u0010/J!\u0010J\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\u0016H\u0016¢\u0006\u0004\bJ\u0010\u001bJ!\u0010K\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bK\u0010/J!\u0010L\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bL\u0010/J#\u0010N\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bN\u0010OJ!\u0010P\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bP\u0010/J!\u0010Q\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bQ\u0010/J#\u0010R\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bR\u0010)J!\u0010T\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010SH\u0017¢\u0006\u0004\bT\u0010UJ\u001f\u0010V\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bV\u0010\u001bJ\u001f\u0010W\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020,H\u0017¢\u0006\u0004\bW\u0010/J\u001f\u0010X\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u000eH\u0017¢\u0006\u0004\bX\u0010\u0012J\u001f\u0010Y\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020,H\u0017¢\u0006\u0004\bY\u0010/J\u001f\u0010Z\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bZ\u0010\u001bJ\u001b\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0[H\u0016¢\u0006\u0004\b\\\u0010]J\u0015\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00020^H\u0014¢\u0006\u0004\b_\u0010`R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006e"}, d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/r;", "Lh5/M;", "<init>", "()V", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/F0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/swmansion/rnscreens/r;", "view", BuildConfig.FLAVOR, "activityState", BuildConfig.FLAVOR, "setActivityState", "(Lcom/swmansion/rnscreens/r;F)V", "parent", "Landroid/view/View;", "child", BuildConfig.FLAVOR, "index", "addView", "(Lcom/swmansion/rnscreens/r;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/r;I)V", "removeView", "(Lcom/swmansion/rnscreens/r;Landroid/view/View;)V", "Lcom/facebook/react/uimanager/v0;", "props", "Lcom/facebook/react/uimanager/E0;", "stateWrapper", BuildConfig.FLAVOR, "updateState", "(Lcom/swmansion/rnscreens/r;Lcom/facebook/react/uimanager/v0;Lcom/facebook/react/uimanager/E0;)Ljava/lang/Object;", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/r;)V", "presentation", "setStackPresentation", "(Lcom/swmansion/rnscreens/r;Ljava/lang/String;)V", "animation", "setStackAnimation", BuildConfig.FLAVOR, "gestureEnabled", "setGestureEnabled", "(Lcom/swmansion/rnscreens/r;Z)V", "setReplaceAnimation", "screenOrientation", "setScreenOrientation", "statusBarAnimation", "setStatusBarAnimation", "statusBarColor", "setStatusBarColor", "(Lcom/swmansion/rnscreens/r;Ljava/lang/Integer;)V", "statusBarStyle", "setStatusBarStyle", "statusBarTranslucent", "setStatusBarTranslucent", "statusBarHidden", "setStatusBarHidden", "navigationBarColor", "setNavigationBarColor", "navigationBarTranslucent", "setNavigationBarTranslucent", "navigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "value", "setSheetElevation", "setFullScreenSwipeEnabled", "setFullScreenSwipeShadowEnabled", "setTransitionDuration", "setHideKeyboardOnSwipe", "setCustomAnimationOnSwipe", "Lcom/facebook/react/bridge/ReadableMap;", "setGestureResponseDistance", "(Lcom/swmansion/rnscreens/r;Lcom/facebook/react/bridge/ReadableMap;)V", "setHomeIndicatorHidden", "setPreventNativeDismiss", "setSwipeDirection", "Lcom/facebook/react/bridge/ReadableArray;", "setSheetAllowedDetents", "(Lcom/swmansion/rnscreens/r;Lcom/facebook/react/bridge/ReadableArray;)V", "setSheetLargestUndimmedDetent", "setSheetGrabberVisible", "setSheetCornerRadius", "setSheetExpandsWhenScrolledToEdge", "setSheetInitialDetent", BuildConfig.FLAVOR, "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/c1;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", "delegate", "Lcom/facebook/react/uimanager/c1;", "Companion", C4870a.f43493a, "react-native-screens_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ScreenViewManager extends ViewGroupManager<r> implements h5.M {
    public static final String REACT_CLASS = "RNSScreen";
    private final c1 delegate = new h5.L(this);

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReadableArray f29918a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReadableArray readableArray) {
            super(1);
            this.f29918a = readableArray;
        }

        public final Double a(int i10) {
            return Double.valueOf(this.f29918a.getDouble(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected c1 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return kotlin.collections.G.l(lc.t.a("topDismissed", AbstractC4929e.d("registrationName", "onDismissed")), lc.t.a("topWillAppear", AbstractC4929e.d("registrationName", "onWillAppear")), lc.t.a("topAppear", AbstractC4929e.d("registrationName", "onAppear")), lc.t.a("topWillDisappear", AbstractC4929e.d("registrationName", "onWillDisappear")), lc.t.a("topDisappear", AbstractC4929e.d("registrationName", "onDisappear")), lc.t.a("topHeaderHeightChange", AbstractC4929e.d("registrationName", "onHeaderHeightChange")), lc.t.a("topHeaderBackButtonClicked", AbstractC4929e.d("registrationName", "onHeaderBackButtonClicked")), lc.t.a("topTransitionProgress", AbstractC4929e.d("registrationName", "onTransitionProgress")), lc.t.a("topSheetDetentChanged", AbstractC4929e.d("registrationName", "onSheetDetentChanged")));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // h5.M
    public void setCustomAnimationOnSwipe(r view, boolean value) {
    }

    @Override // h5.M
    public void setFullScreenSwipeEnabled(r view, boolean value) {
    }

    @Override // h5.M
    public void setFullScreenSwipeShadowEnabled(r view, boolean value) {
    }

    @Override // h5.M
    public void setGestureResponseDistance(r view, ReadableMap value) {
    }

    @Override // h5.M
    public void setHideKeyboardOnSwipe(r view, boolean value) {
    }

    @Override // h5.M
    public void setHomeIndicatorHidden(r view, boolean value) {
    }

    @Override // h5.M
    public void setPreventNativeDismiss(r view, boolean value) {
    }

    @Override // h5.M
    public void setSwipeDirection(r view, String value) {
    }

    @Override // h5.M
    public void setTransitionDuration(r view, int value) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public r createViewInstance(F0 reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new r(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(r view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction((ScreenViewManager) view);
        view.o();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(r parent, View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        super.removeView((ScreenViewManager) parent, view);
        if (view instanceof w) {
            parent.setFooter(null);
        }
    }

    @Override // h5.M
    public void setActivityState(r view, float activityState) {
        Intrinsics.checkNotNullParameter(view, "view");
        setActivityState(view, (int) activityState);
    }

    @Override // h5.M
    @Z4.a(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(r view, boolean gestureEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setGestureEnabled(gestureEnabled);
    }

    @Override // h5.M
    @Z4.a(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(r view, boolean nativeBackButtonDismissalEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNativeBackButtonDismissalEnabled(nativeBackButtonDismissalEnabled);
    }

    @Override // h5.M
    @Z4.a(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(r view, Integer navigationBarColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarColor(navigationBarColor);
    }

    @Override // h5.M
    @Z4.a(name = "navigationBarHidden")
    public void setNavigationBarHidden(r view, boolean navigationBarHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarHidden(Boolean.valueOf(navigationBarHidden));
    }

    @Override // h5.M
    @Z4.a(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(r view, boolean navigationBarTranslucent) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarTranslucent(Boolean.valueOf(navigationBarTranslucent));
    }

    @Override // h5.M
    @Z4.a(name = "replaceAnimation")
    public void setReplaceAnimation(r view, String animation) {
        r.c cVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (animation == null ? true : Intrinsics.b(animation, "pop")) {
            cVar = r.c.POP;
        } else {
            if (!Intrinsics.b(animation, "push")) {
                throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + animation);
            }
            cVar = r.c.PUSH;
        }
        view.setReplaceAnimation(cVar);
    }

    @Override // h5.M
    @Z4.a(name = "screenOrientation")
    public void setScreenOrientation(r view, String screenOrientation) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScreenOrientation(screenOrientation);
    }

    @Override // h5.M
    @Z4.a(name = "sheetAllowedDetents")
    public void setSheetAllowedDetents(r view, ReadableArray value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.getSheetDetents().clear();
        if (value == null || value.size() == 0) {
            view.getSheetDetents().add(Double.valueOf(1.0d));
        } else {
            kotlin.sequences.j.B(kotlin.sequences.j.w(CollectionsKt.T(kotlin.ranges.a.f36419d.a(0, value.size() - 1, 1)), new b(value)), view.getSheetDetents());
        }
    }

    @Override // h5.M
    @Z4.a(name = "sheetCornerRadius")
    public void setSheetCornerRadius(r view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetCornerRadius(value);
    }

    @Override // h5.M
    @Z4.a(name = "sheetElevation")
    public void setSheetElevation(r view, int value) {
        if (view == null) {
            return;
        }
        view.setSheetElevation(value);
    }

    @Override // h5.M
    @Z4.a(name = "sheetExpandsWhenScrolledToEdge")
    public void setSheetExpandsWhenScrolledToEdge(r view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetExpandsWhenScrolledToEdge(value);
    }

    @Override // h5.M
    @Z4.a(name = "sheetGrabberVisible")
    public void setSheetGrabberVisible(r view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetGrabberVisible(value);
    }

    @Override // h5.M
    @Z4.a(name = "sheetInitialDetent")
    public void setSheetInitialDetent(r view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetInitialDetentIndex(value);
    }

    @Override // h5.M
    @Z4.a(name = "sheetLargestUndimmedDetent")
    public void setSheetLargestUndimmedDetent(r view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (-1 > value || value >= 3) {
            throw new IllegalStateException("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2");
        }
        view.setSheetLargestUndimmedDetentIndex(value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r4.equals("default") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r4.equals("flip") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (r4.equals("simple_push") != false) goto L42;
     */
    @Override // h5.M
    @Z4.a(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStackAnimation(r view, String animation) {
        r.d dVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (animation != null) {
            switch (animation.hashCode()) {
                case -1418955385:
                    break;
                case -1198710326:
                    if (animation.equals("ios_from_left")) {
                        dVar = r.d.IOS_FROM_LEFT;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case -427095442:
                    if (animation.equals("slide_from_left")) {
                        dVar = r.d.SLIDE_FROM_LEFT;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case -349395819:
                    if (animation.equals("slide_from_right")) {
                        dVar = r.d.SLIDE_FROM_RIGHT;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 3135100:
                    if (animation.equals("fade")) {
                        dVar = r.d.FADE;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 3145837:
                    break;
                case 3387192:
                    if (animation.equals("none")) {
                        dVar = r.d.NONE;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 182437661:
                    if (animation.equals("fade_from_bottom")) {
                        dVar = r.d.FADE_FROM_BOTTOM;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 1500346553:
                    if (animation.equals("ios_from_right")) {
                        dVar = r.d.IOS_FROM_RIGHT;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 1544803905:
                    break;
                case 1601504978:
                    if (animation.equals("slide_from_bottom")) {
                        dVar = r.d.SLIDE_FROM_BOTTOM;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                default:
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
            }
        }
        dVar = r.d.DEFAULT;
        view.setStackAnimation(dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r4.equals("fullScreenModal") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r4 = com.swmansion.rnscreens.r.e.MODAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4.equals("containedTransparentModal") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r4 = com.swmansion.rnscreens.r.e.TRANSPARENT_MODAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r4.equals("containedModal") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r4.equals("modal") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r4.equals("transparentModal") != false) goto L27;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // h5.M
    @Z4.a(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStackPresentation(r view, String presentation) {
        r.e eVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (presentation != null) {
            switch (presentation.hashCode()) {
                case -76271493:
                    break;
                case 3452698:
                    if (presentation.equals("push")) {
                        eVar = r.e.PUSH;
                        view.setStackPresentation(eVar);
                        return;
                    }
                    break;
                case 104069805:
                    break;
                case 438078970:
                    break;
                case 955284238:
                    break;
                case 1171936146:
                    break;
                case 1798290171:
                    if (presentation.equals("formSheet")) {
                        eVar = r.e.FORM_SHEET;
                        view.setStackPresentation(eVar);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unknown presentation type " + presentation);
    }

    @Override // h5.M
    @Z4.a(name = "statusBarAnimation")
    public void setStatusBarAnimation(r view, String statusBarAnimation) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf((statusBarAnimation == null || Intrinsics.b("none", statusBarAnimation)) ? false : true));
    }

    @Override // h5.M
    @Z4.a(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(r view, Integer statusBarColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarColor(statusBarColor);
    }

    @Override // h5.M
    @Z4.a(name = "statusBarHidden")
    public void setStatusBarHidden(r view, boolean statusBarHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarHidden(Boolean.valueOf(statusBarHidden));
    }

    @Override // h5.M
    @Z4.a(name = "statusBarStyle")
    public void setStatusBarStyle(r view, String statusBarStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarStyle(statusBarStyle);
    }

    @Override // h5.M
    @Z4.a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(r view, boolean statusBarTranslucent) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarTranslucent(Boolean.valueOf(statusBarTranslucent));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(r view, C1973v0 props, E0 stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState((ScreenViewManager) view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(r parent, View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof C2950u) {
            parent.q((C2950u) child);
        } else if (child instanceof w) {
            parent.setFooter((w) child);
        }
        super.addView((ScreenViewManager) parent, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(r parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent.getChildAt(index) instanceof w) {
            parent.setFooter(null);
        }
        super.removeViewAt((ScreenViewManager) parent, index);
    }

    @Z4.a(name = "activityState")
    public final void setActivityState(r view, int activityState) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (activityState == -1) {
            return;
        }
        if (activityState == 0) {
            view.setActivityState(r.a.INACTIVE);
        } else if (activityState == 1) {
            view.setActivityState(r.a.TRANSITIONING_OR_BELOW_TOP);
        } else {
            if (activityState != 2) {
                return;
            }
            view.setActivityState(r.a.ON_TOP);
        }
    }
}
