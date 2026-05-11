package expo.modules.devmenu.safearea;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.view.j;
import com.th3rdwave.safeareacontext.SafeAreaProviderManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"expo/modules/devmenu/safearea/MockedSafeAreaPackage$createViewManagers$1", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/F0;", "reactContext", "Lcom/facebook/react/views/view/j;", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/facebook/react/views/view/j;", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "expo-dev-menu_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MockedSafeAreaPackage$createViewManagers$1 extends ViewGroupManager<ViewGroup> {
    MockedSafeAreaPackage$createViewManagers$1() {
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return SafeAreaProviderManager.REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public j createViewInstance(F0 reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new j(reactContext);
    }
}
