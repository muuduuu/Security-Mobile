package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;", BuildConfig.FLAVOR, "()V", "componentNames", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getFabricComponentName", "componentName", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FabricNameComponentMapping {
    public static final FabricNameComponentMapping INSTANCE = new FabricNameComponentMapping();
    private static final Map<String, String> componentNames = G.k(t.a("View", ReactViewManager.REACT_CLASS), t.a("Image", ReactImageManager.REACT_CLASS), t.a("ScrollView", ReactScrollViewManager.REACT_CLASS), t.a("Slider", "RCTSlider"), t.a("ModalHostView", ReactModalHostManager.REACT_CLASS), t.a("Paragraph", ReactTextViewManager.REACT_CLASS), t.a("Text", "RCText"), t.a("RawText", ReactRawTextManager.REACT_CLASS), t.a("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS), t.a("ShimmeringView", "RKShimmeringView"), t.a("TemplateView", "RCTTemplateView"), t.a("AxialGradientView", "RCTAxialGradientView"), t.a("Video", "RCTVideo"), t.a("Map", "RCTMap"), t.a("WebView", "RCTWebView"), t.a("Keyframes", "RCTKeyframes"), t.a("ImpressionTrackingView", "RCTImpressionTrackingView"));

    private FabricNameComponentMapping() {
    }

    public static final String getFabricComponentName(String componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        String str = componentNames.get(componentName);
        return str == null ? componentName : str;
    }
}
