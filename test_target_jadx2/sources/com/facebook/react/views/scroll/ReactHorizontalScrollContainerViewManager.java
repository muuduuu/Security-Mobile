package com.facebook.react.views.scroll;

import com.facebook.react.uimanager.F0;
import com.facebook.react.views.view.ReactClippingViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m5.C3653c;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@K4.a(name = ReactHorizontalScrollContainerViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;", "Lcom/facebook/react/views/view/ReactClippingViewManager;", "Lm5/c;", "<init>", "()V", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/F0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lm5/c;", "Companion", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReactHorizontalScrollContainerViewManager extends ReactClippingViewManager<C3653c> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C3653c createViewInstance(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C3653c(context);
    }
}
