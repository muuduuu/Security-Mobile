package com.shopify.reactnative.flash_list;

import android.view.View;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c1;
import h5.C3248i;
import h5.InterfaceC3250j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import zc.AbstractC5272a;

@K4.a(name = AutoLayoutViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001.B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00160\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001aH\u0017¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0006H\u0017¢\u0006\u0004\b%\u0010#J\u001f\u0010'\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0006H\u0017¢\u0006\u0004\b'\u0010#J\u001f\u0010)\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u001aH\u0017¢\u0006\u0004\b)\u0010\u001eR \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/shopify/reactnative/flash_list/AutoLayoutViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/shopify/reactnative/flash_list/b;", "Lh5/j;", "<init>", "()V", BuildConfig.FLAVOR, "dp", "density", BuildConfig.FLAVOR, "convertToPixelLayout", "(DD)I", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/c1;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", "Lcom/facebook/react/uimanager/F0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/shopify/reactnative/flash_list/b;", BuildConfig.FLAVOR, "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", BuildConfig.FLAVOR, "isHorizontal", BuildConfig.FLAVOR, "setHorizontal", "(Lcom/shopify/reactnative/flash_list/b;Z)V", "disableAutoLayout", "setDisableAutoLayout", "scrollOffset", "setScrollOffset", "(Lcom/shopify/reactnative/flash_list/b;D)V", "windowSize", "setWindowSize", "renderOffset", "setRenderAheadOffset", "enableInstrumentation", "setEnableInstrumentation", "Lh5/i;", "mDelegate", "Lh5/i;", "Companion", C4870a.f43493a, "shopify_flash-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AutoLayoutViewManager extends ViewGroupManager<b> implements InterfaceC3250j {
    public static final String REACT_CLASS = "AutoLayoutView";
    private final C3248i mDelegate = new C3248i(this);

    private final int convertToPixelLayout(double dp, double density) {
        return AbstractC5272a.b(dp * density);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate */
    protected c1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return G.l(t.a("onBlankAreaEvent", G.l(t.a("registrationName", "onBlankAreaEvent"))));
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
    public b createViewInstance(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b bVar = new b(context);
        bVar.setPixelDensity(context.getResources().getDisplayMetrics().density);
        return bVar;
    }

    @Override // h5.InterfaceC3250j
    @Z4.a(name = "disableAutoLayout")
    public void setDisableAutoLayout(b view, boolean disableAutoLayout) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDisableAutoLayout(disableAutoLayout);
    }

    @Override // h5.InterfaceC3250j
    @Z4.a(name = "enableInstrumentation")
    public void setEnableInstrumentation(b view, boolean enableInstrumentation) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnableInstrumentation(enableInstrumentation);
    }

    @Override // h5.InterfaceC3250j
    @Z4.a(name = "horizontal")
    public void setHorizontal(b view, boolean isHorizontal) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.getAlShadow().h(isHorizontal);
    }

    @Override // h5.InterfaceC3250j
    @Z4.a(name = "renderAheadOffset")
    public void setRenderAheadOffset(b view, double renderOffset) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.getAlShadow().k(convertToPixelLayout(renderOffset, view.getPixelDensity()));
    }

    @Override // h5.InterfaceC3250j
    @Z4.a(name = "scrollOffset")
    public void setScrollOffset(b view, double scrollOffset) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.getAlShadow().l(convertToPixelLayout(scrollOffset, view.getPixelDensity()));
    }

    @Override // h5.InterfaceC3250j
    @Z4.a(name = "windowSize")
    public void setWindowSize(b view, double windowSize) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.getAlShadow().m(convertToPixelLayout(windowSize, view.getPixelDensity()));
    }
}
