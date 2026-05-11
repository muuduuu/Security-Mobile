package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@K4.a(name = ScreenFooterManager.REACT_CLASS)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/swmansion/rnscreens/ScreenFooterManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/w;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/F0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/swmansion/rnscreens/w;", "Lcom/facebook/react/uimanager/c1;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", "delegate", "Lcom/facebook/react/uimanager/c1;", "Companion", C4870a.f43493a, "react-native-screens_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreenFooterManager extends ViewGroupManager<w> {
    public static final String REACT_CLASS = "RNSScreenFooter";
    private final c1 delegate = new h5.K(this);

    @Override // com.facebook.react.uimanager.ViewManager
    protected c1 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public w createViewInstance(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new w(context);
    }
}
