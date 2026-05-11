package expo.modules.kotlin.views;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC1975w0;
import com.facebook.react.uimanager.C1973v0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.SimpleViewManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lexpo/modules/kotlin/views/SimpleViewManagerWrapper;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Landroid/view/View;", "Lexpo/modules/kotlin/views/s;", "Lexpo/modules/kotlin/views/q;", "viewWrapperDelegate", "<init>", "(Lexpo/modules/kotlin/views/q;)V", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/F0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Landroid/view/View;", "viewToUpdate", "Lcom/facebook/react/uimanager/v0;", "props", BuildConfig.FLAVOR, "updateProperties", "(Landroid/view/View;Lcom/facebook/react/uimanager/v0;)V", "view", "onAfterUpdateTransaction", "(Landroid/view/View;)V", BuildConfig.FLAVOR, "getNativeProps", "()Ljava/util/Map;", "onDropViewInstance", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getExportedCustomDirectEventTypeConstants", "Lexpo/modules/kotlin/views/q;", "getViewWrapperDelegate", "()Lexpo/modules/kotlin/views/q;", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SimpleViewManagerWrapper extends SimpleViewManager<View> implements s {
    public static final int $stable = 8;
    private final q viewWrapperDelegate;

    public SimpleViewManagerWrapper(q viewWrapperDelegate) {
        Intrinsics.checkNotNullParameter(viewWrapperDelegate, "viewWrapperDelegate");
        this.viewWrapperDelegate = viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected View createViewInstance(F0 reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return getViewWrapperDelegate().a(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> n10;
        Map<String, Object> c10 = getViewWrapperDelegate().c();
        if (c10 == null) {
            c10 = G.h();
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        return (exportedCustomDirectEventTypeConstants == null || (n10 = G.n(exportedCustomDirectEventTypeConstants, c10)) == null) ? c10 : n10;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ViewManagerAdapter_" + getViewWrapperDelegate().e();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, String> getNativeProps() {
        Map<String, String> nativeProps = super.getNativeProps();
        for (Map.Entry entry : getViewWrapperDelegate().f().entrySet()) {
            String str = (String) entry.getKey();
            a aVar = (a) entry.getValue();
            Intrinsics.d(nativeProps);
            nativeProps.put(str, String.valueOf(aVar.b().d().j()));
        }
        Intrinsics.d(nativeProps);
        return nativeProps;
    }

    @Override // expo.modules.kotlin.views.s
    public q getViewWrapperDelegate() {
        return this.viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    protected void onAfterUpdateTransaction(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        getViewWrapperDelegate().i(view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance(view);
        getViewWrapperDelegate().h(view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateProperties(View viewToUpdate, C1973v0 props) {
        Intrinsics.checkNotNullParameter(viewToUpdate, "viewToUpdate");
        Intrinsics.checkNotNullParameter(props, "props");
        ReadableMap a10 = AbstractC1975w0.a(props);
        super.updateProperties(viewToUpdate, new C1973v0(new k(a10, getViewWrapperDelegate().k(viewToUpdate, a10))));
    }
}
