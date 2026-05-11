package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.C1973v0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.V;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c1;
import com.rssignaturecapture.RSSignatureCaptureViewManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import v4.AbstractC4929e;

@K4.a(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001jB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\b2\b\b\u0001\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\b1\u0010&J!\u00104\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b7\u00105J\u001f\u00109\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u0019H\u0017¢\u0006\u0004\b9\u0010)J!\u0010;\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b;\u00105J!\u0010=\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b=\u0010>J!\u0010@\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b@\u0010>J\u001f\u0010B\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010A\u001a\u00020.H\u0017¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010D\u001a\u00020.H\u0017¢\u0006\u0004\bE\u0010CJ\u001f\u0010G\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010F\u001a\u00020.H\u0017¢\u0006\u0004\bG\u0010CJ!\u0010I\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010H\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\bI\u0010>J\u001f\u0010K\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010J\u001a\u00020.H\u0017¢\u0006\u0004\bK\u0010CJ\u001f\u0010M\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010L\u001a\u00020.H\u0017¢\u0006\u0004\bM\u0010CJ\u001f\u0010O\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010N\u001a\u00020.H\u0017¢\u0006\u0004\bO\u0010CJ!\u0010Q\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bQ\u00105J\u001d\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"\u0018\u00010RH\u0016¢\u0006\u0004\bS\u0010TJ\u0015\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00020UH\u0014¢\u0006\u0004\bV\u0010WJ#\u0010Y\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bY\u00105J#\u0010Z\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bZ\u00105J!\u0010[\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020\u0019H\u0016¢\u0006\u0004\b[\u0010)J!\u0010\\\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020.H\u0016¢\u0006\u0004\b\\\u0010CJ!\u0010]\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020.H\u0016¢\u0006\u0004\b]\u0010CJ#\u0010^\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b^\u00105J!\u0010_\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020\u0019H\u0016¢\u0006\u0004\b_\u0010)J#\u0010`\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b`\u00105J#\u0010a\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\ba\u0010>J!\u0010b\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020.H\u0016¢\u0006\u0004\bb\u0010CJ#\u0010c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bc\u0010>J!\u0010d\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020.H\u0016¢\u0006\u0004\bd\u0010CJ#\u0010e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\be\u00105J#\u0010f\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bf\u00105R\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006k"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/F;", "Lh5/O;", "<init>", "()V", BuildConfig.FLAVOR, "propName", BuildConfig.FLAVOR, "logNotAvailable", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/F0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/swmansion/rnscreens/F;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Lcom/facebook/react/uimanager/V;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/V;", "parent", "Landroid/view/View;", "child", BuildConfig.FLAVOR, "index", "addView", "(Lcom/swmansion/rnscreens/F;Landroid/view/View;I)V", "view", "Lcom/facebook/react/uimanager/v0;", "props", "Lcom/facebook/react/uimanager/E0;", "stateWrapper", BuildConfig.FLAVOR, "updateState", "(Lcom/swmansion/rnscreens/F;Lcom/facebook/react/uimanager/v0;Lcom/facebook/react/uimanager/E0;)Ljava/lang/Object;", "onDropViewInstance", "(Lcom/swmansion/rnscreens/F;)V", "removeAllViews", "removeViewAt", "(Lcom/swmansion/rnscreens/F;I)V", "getChildCount", "(Lcom/swmansion/rnscreens/F;)I", "getChildAt", "(Lcom/swmansion/rnscreens/F;I)Landroid/view/View;", BuildConfig.FLAVOR, "needsCustomLayoutForChildren", "()Z", "onAfterUpdateTransaction", HVRetakeActivity.CONFIG_TAG, "title", "setTitle", "(Lcom/swmansion/rnscreens/F;Ljava/lang/String;)V", "titleFontFamily", "setTitleFontFamily", "titleFontSize", "setTitleFontSize", "titleFontWeight", "setTitleFontWeight", "titleColor", "setTitleColor", "(Lcom/swmansion/rnscreens/F;Ljava/lang/Integer;)V", RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR, "setBackgroundColor", "hideShadow", "setHideShadow", "(Lcom/swmansion/rnscreens/F;Z)V", "hideBackButton", "setHideBackButton", "topInsetEnabled", "setTopInsetEnabled", "color", "setColor", "hidden", "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", BuildConfig.FLAVOR, "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/c1;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", "value", "setBackTitle", "setBackTitleFontFamily", "setBackTitleFontSize", "setBackTitleVisible", "setLargeTitle", "setLargeTitleFontFamily", "setLargeTitleFontSize", "setLargeTitleFontWeight", "setLargeTitleBackgroundColor", "setLargeTitleHideShadow", "setLargeTitleColor", "setDisableBackButtonMenu", "setBackButtonDisplayMode", "setBlurEffect", "delegate", "Lcom/facebook/react/uimanager/c1;", "Companion", C4870a.f43493a, "react-native-screens_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<F> implements h5.O {
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";
    private final c1 delegate = new h5.N(this);

    private final void logNotAvailable(String propName) {
        Log.w("[RNScreens]", propName + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected c1 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return AbstractC4929e.e("topAttached", AbstractC4929e.d("registrationName", "onAttached"), "topDetached", AbstractC4929e.d("registrationName", "onDetached"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.P
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public V createShadowNodeInstance(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new G(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public F createViewInstance(F0 reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new F(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(F parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        super.onAfterUpdateTransaction((ScreenStackHeaderConfigViewManager) parent);
        parent.j();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(F view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.f();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public void removeAllViews(F parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.k();
    }

    @Override // h5.O
    public void setBackButtonDisplayMode(F view, String value) {
        logNotAvailable("backButtonDisplayMode");
    }

    @Override // h5.O
    @Z4.a(name = "backButtonInCustomView")
    public void setBackButtonInCustomView(F config, boolean backButtonInCustomView) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setBackButtonInCustomView(backButtonInCustomView);
    }

    @Override // h5.O
    public void setBackTitle(F view, String value) {
        logNotAvailable("backTitle");
    }

    @Override // h5.O
    public void setBackTitleFontFamily(F view, String value) {
        logNotAvailable("backTitleFontFamily");
    }

    @Override // h5.O
    public void setBackTitleFontSize(F view, int value) {
        logNotAvailable("backTitleFontSize");
    }

    @Override // h5.O
    public void setBackTitleVisible(F view, boolean value) {
        logNotAvailable("backTitleVisible");
    }

    @Override // h5.O
    @Z4.a(customType = "Color", name = RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR)
    public void setBackgroundColor(F config, Integer backgroundColor) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setBackgroundColor(backgroundColor);
    }

    @Override // h5.O
    public void setBlurEffect(F view, String value) {
        logNotAvailable("blurEffect");
    }

    @Override // h5.O
    @Z4.a(customType = "Color", name = "color")
    public void setColor(F config, Integer color) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTintColor(color != null ? color.intValue() : 0);
    }

    @Override // h5.O
    @Z4.a(name = "direction")
    public void setDirection(F config, String direction) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setDirection(direction);
    }

    @Override // h5.O
    public void setDisableBackButtonMenu(F view, boolean value) {
        logNotAvailable("disableBackButtonMenu");
    }

    @Override // h5.O
    @Z4.a(name = "hidden")
    public void setHidden(F config, boolean hidden) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHidden(hidden);
    }

    @Override // h5.O
    @Z4.a(name = "hideBackButton")
    public void setHideBackButton(F config, boolean hideBackButton) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHideBackButton(hideBackButton);
    }

    @Override // h5.O
    @Z4.a(name = "hideShadow")
    public void setHideShadow(F config, boolean hideShadow) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHideShadow(hideShadow);
    }

    @Override // h5.O
    public void setLargeTitle(F view, boolean value) {
        logNotAvailable("largeTitle");
    }

    @Override // h5.O
    public void setLargeTitleBackgroundColor(F view, Integer value) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    @Override // h5.O
    public void setLargeTitleColor(F view, Integer value) {
        logNotAvailable("largeTitleColor");
    }

    @Override // h5.O
    public void setLargeTitleFontFamily(F view, String value) {
        logNotAvailable("largeTitleFontFamily");
    }

    @Override // h5.O
    public void setLargeTitleFontSize(F view, int value) {
        logNotAvailable("largeTitleFontSize");
    }

    @Override // h5.O
    public void setLargeTitleFontWeight(F view, String value) {
        logNotAvailable("largeTitleFontWeight");
    }

    @Override // h5.O
    public void setLargeTitleHideShadow(F view, boolean value) {
        logNotAvailable("largeTitleHideShadow");
    }

    @Override // h5.O
    @Z4.a(name = "title")
    public void setTitle(F config, String title) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitle(title);
    }

    @Override // h5.O
    @Z4.a(customType = "Color", name = "titleColor")
    public void setTitleColor(F config, Integer titleColor) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (titleColor != null) {
            config.setTitleColor(titleColor.intValue());
        }
    }

    @Override // h5.O
    @Z4.a(name = "titleFontFamily")
    public void setTitleFontFamily(F config, String titleFontFamily) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontFamily(titleFontFamily);
    }

    @Override // h5.O
    @Z4.a(name = "titleFontSize")
    public void setTitleFontSize(F config, int titleFontSize) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontSize(titleFontSize);
    }

    @Override // h5.O
    @Z4.a(name = "titleFontWeight")
    public void setTitleFontWeight(F config, String titleFontWeight) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontWeight(titleFontWeight);
    }

    @Override // h5.O
    @Z4.a(name = "topInsetEnabled")
    public void setTopInsetEnabled(F config, boolean topInsetEnabled) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTopInsetEnabled(topInsetEnabled);
    }

    @Override // h5.O
    @Z4.a(name = "translucent")
    public void setTranslucent(F config, boolean translucent) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTranslucent(translucent);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(F view, C1973v0 props, E0 stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState((ScreenStackHeaderConfigViewManager) view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(F parent, View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof H) {
            parent.d((H) child, index);
            return;
        }
        throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(F parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.g(index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(F parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getConfigSubviewsCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(F parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.l(index);
    }
}
