package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import c3.AbstractC1721a;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1931a;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.Y;
import com.facebook.react.views.image.b;
import com.rssignaturecapture.RSSignatureCaptureViewManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import e5.EnumC3081c;
import e5.j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import v3.AbstractC4922b;

@K4.a(name = ReactImageManager.REACT_CLASS)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u000b\b\u0007\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001XB=\b\u0007\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB-\b\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rB7\b\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b)\u0010'J!\u0010*\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b*\u0010'J!\u0010-\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b0\u0010.J\u001f\u00102\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00101\u001a\u00020!H\u0007¢\u0006\u0004\b2\u0010$J'\u00105\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020!H\u0007¢\u0006\u0004\b5\u00106J!\u00108\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b8\u0010'J!\u0010:\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b:\u0010'J\u001f\u0010<\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010;\u001a\u00020!H\u0007¢\u0006\u0004\b<\u0010$J!\u0010>\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b>\u0010.J\u001f\u0010@\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0017H\u0007¢\u0006\u0004\b@\u0010\u001bJ\u001f\u0010B\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010A\u001a\u00020+H\u0007¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0017H\u0007¢\u0006\u0004\bE\u0010\u001bJ!\u0010H\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010FH\u0007¢\u0006\u0004\bH\u0010IJ!\u0010K\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010J\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\bK\u0010\u001fJ!\u0010M\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010L\u001a\u00020+H\u0016¢\u0006\u0004\bM\u0010CJ\u001b\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0NH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\bQ\u0010RR&\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010SR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010TR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010UR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010V¨\u0006Y"}, d2 = {"Lcom/facebook/react/views/image/ReactImageManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/views/image/h;", "Lv3/b;", "draweeControllerBuilder", "Lcom/facebook/react/views/image/a;", "globalImageLoadListener", "Lcom/facebook/react/views/image/f;", "callerContextFactory", "<init>", "(Lv3/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;)V", BuildConfig.FLAVOR, "callerContext", "(Lv3/b;Ljava/lang/Object;)V", "(Lv3/b;Lcom/facebook/react/views/image/a;Ljava/lang/Object;)V", "Lcom/facebook/react/uimanager/F0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/facebook/react/views/image/h;", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "view", BuildConfig.FLAVOR, "accessible", BuildConfig.FLAVOR, "setAccessible", "(Lcom/facebook/react/views/image/h;Z)V", "Lcom/facebook/react/bridge/ReadableArray;", "sources", "setSrc", "(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableArray;)V", "setSource", BuildConfig.FLAVOR, "blurRadius", "setBlurRadius", "(Lcom/facebook/react/views/image/h;F)V", "analyticTag", "setInternal_AnalyticsTag", "(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V", "source", "setDefaultSource", "setLoadingIndicatorSource", BuildConfig.FLAVOR, "borderColor", "setBorderColor", "(Lcom/facebook/react/views/image/h;Ljava/lang/Integer;)V", "overlayColor", "setOverlayColor", "borderWidth", "setBorderWidth", "index", Snapshot.BORDER_RADIUS, "setBorderRadius", "(Lcom/facebook/react/views/image/h;IF)V", "resizeMode", "setResizeMode", "resizeMethod", "setResizeMethod", "resizeMultiplier", "setResizeMultiplier", "tintColor", "setTintColor", AppConstants.VIDEO_RECORDING_ENABLED, "setProgressiveRenderingEnabled", "durationMs", "setFadeDuration", "(Lcom/facebook/react/views/image/h;I)V", "shouldNotifyLoadEvents", "setLoadHandlersRegistered", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "setHeaders", "(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableMap;)V", "shadows", "setBoxShadow", RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR, "setBackgroundColor", BuildConfig.FLAVOR, "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/image/h;)V", "Lv3/b;", "Lcom/facebook/react/views/image/a;", "Lcom/facebook/react/views/image/f;", "Ljava/lang/Object;", "Companion", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReactImageManager extends SimpleViewManager<h> {
    private static final String ON_ERROR = "onError";
    private static final String ON_LOAD = "onLoad";
    private static final String ON_LOAD_END = "onLoadEnd";
    private static final String ON_LOAD_START = "onLoadStart";
    private static final String ON_PROGRESS = "onProgress";
    public static final String REACT_CLASS = "RCTImageView";
    private static final String REGISTRATION_NAME = "registrationName";
    private Object callerContext;
    private final f callerContextFactory;
    private final AbstractC4922b draweeControllerBuilder;
    private final a globalImageLoadListener;

    public ReactImageManager() {
        this(null, null, null, 7, null);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        b.a aVar = b.f22515h;
        exportedCustomDirectEventTypeConstants.put(aVar.f(4), G.e(t.a(REGISTRATION_NAME, ON_LOAD_START)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(5), G.e(t.a(REGISTRATION_NAME, ON_PROGRESS)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(2), G.e(t.a(REGISTRATION_NAME, ON_LOAD)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(1), G.e(t.a(REGISTRATION_NAME, ON_ERROR)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(3), G.e(t.a(REGISTRATION_NAME, ON_LOAD_END)));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Z4.a(name = "accessible")
    public final void setAccessible(h view, boolean accessible) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFocusable(accessible);
    }

    @Z4.a(name = "blurRadius")
    public final void setBlurRadius(h view, float blurRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBlurRadius(blurRadius);
    }

    @Z4.a(customType = "Color", name = "borderColor")
    public final void setBorderColor(h view, Integer borderColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (G4.a.c()) {
            C1931a.k(view, j.ALL, borderColor);
        } else if (borderColor == null) {
            view.setBorderColor(0);
        } else {
            view.setBorderColor(borderColor.intValue());
        }
    }

    @Z4.b(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public final void setBorderRadius(h view, int index, float borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (G4.a.c()) {
            C1931a.l(view, EnumC3081c.values()[index], Float.isNaN(borderRadius) ? null : new X(borderRadius, Y.POINT));
            return;
        }
        if (!Float.isNaN(borderRadius)) {
            borderRadius = C1944g0.f22418a.b(borderRadius);
        }
        if (index == 0) {
            view.setBorderRadius(borderRadius);
        } else {
            view.q(borderRadius, index - 1);
        }
    }

    @Z4.a(name = "borderWidth")
    public final void setBorderWidth(h view, float borderWidth) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (G4.a.c()) {
            C1931a.n(view, j.ALL, Float.valueOf(borderWidth));
        } else {
            view.setBorderWidth(borderWidth);
        }
    }

    @Z4.a(customType = "BoxShadow", name = "boxShadow")
    public final void setBoxShadow(h view, ReadableArray shadows) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (G4.a.c()) {
            C1931a.o(view, shadows);
        }
    }

    @Z4.a(name = "defaultSrc")
    public final void setDefaultSource(h view, String source) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDefaultSource(source);
    }

    @Z4.a(name = "fadeDuration")
    public final void setFadeDuration(h view, int durationMs) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFadeDuration(durationMs);
    }

    @Z4.a(name = "headers")
    public final void setHeaders(h view, ReadableMap headers) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (headers != null) {
            view.setHeaders(headers);
        }
    }

    @Z4.a(name = "internal_analyticTag")
    public final void setInternal_AnalyticsTag(h view, String analyticTag) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Z4.a(name = "shouldNotifyLoadEvents")
    public final void setLoadHandlersRegistered(h view, boolean shouldNotifyLoadEvents) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShouldNotifyLoadEvents(shouldNotifyLoadEvents);
    }

    @Z4.a(name = "loadingIndicatorSrc")
    public final void setLoadingIndicatorSource(h view, String source) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLoadingIndicatorSource(source);
    }

    @Z4.a(customType = "Color", name = "overlayColor")
    public final void setOverlayColor(h view, Integer overlayColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (overlayColor == null) {
            view.setOverlayColor(0);
        } else {
            view.setOverlayColor(overlayColor.intValue());
        }
    }

    @Z4.a(name = "progressiveRenderingEnabled")
    public final void setProgressiveRenderingEnabled(h view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setProgressiveRenderingEnabled(enabled);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.equals("auto") == false) goto L20;
     */
    @Z4.a(name = "resizeMethod")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setResizeMethod(h view, String resizeMethod) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (resizeMethod != null) {
            int hashCode = resizeMethod.hashCode();
            if (hashCode != -934437708) {
                if (hashCode != 3005871) {
                    if (hashCode == 109250890 && resizeMethod.equals("scale")) {
                        view.setResizeMethod(c.SCALE);
                        return;
                    }
                }
            } else if (resizeMethod.equals("resize")) {
                view.setResizeMethod(c.RESIZE);
                return;
            }
            view.setResizeMethod(c.AUTO);
            AbstractC1721a.J("ReactNative", "Invalid resize method: '" + resizeMethod + "'");
            return;
        }
        view.setResizeMethod(c.AUTO);
    }

    @Z4.a(name = "resizeMode")
    public final void setResizeMode(h view, String resizeMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScaleType(d.c(resizeMode));
        view.setTileMode(d.d(resizeMode));
    }

    @Z4.a(name = "resizeMultiplier")
    public final void setResizeMultiplier(h view, float resizeMultiplier) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (resizeMultiplier < 0.01f) {
            AbstractC1721a.J("ReactNative", "Invalid resize multiplier: '" + resizeMultiplier + "'");
        }
        view.setResizeMultiplier(resizeMultiplier);
    }

    @Z4.a(name = "source")
    public final void setSource(h view, ReadableArray sources) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSource(sources);
    }

    @Z4.a(name = "src")
    public final void setSrc(h view, ReadableArray sources) {
        Intrinsics.checkNotNullParameter(view, "view");
        setSource(view, sources);
    }

    @Z4.a(customType = "Color", name = "tintColor")
    public final void setTintColor(h view, Integer tintColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (tintColor == null) {
            view.clearColorFilter();
        } else {
            view.setColorFilter(tintColor.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public ReactImageManager(AbstractC4922b abstractC4922b) {
        this(abstractC4922b, null, null, 6, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = this.callerContext;
        if (obj == null) {
            obj = null;
        }
        AbstractC4922b abstractC4922b = this.draweeControllerBuilder;
        if (abstractC4922b == null) {
            abstractC4922b = r3.c.g();
        }
        Intrinsics.d(abstractC4922b);
        return new h(context, abstractC4922b, null, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(h view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction((ReactImageManager) view);
        view.n();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    public void setBackgroundColor(h view, int backgroundColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (G4.a.c()) {
            C1931a.i(view, Integer.valueOf(backgroundColor));
        } else {
            super.setBackgroundColor((ReactImageManager) view, backgroundColor);
        }
    }

    public ReactImageManager(AbstractC4922b abstractC4922b, a aVar) {
        this(abstractC4922b, aVar, null, 4, null);
    }

    public /* synthetic */ ReactImageManager(AbstractC4922b abstractC4922b, a aVar, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC4922b, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : fVar);
    }

    public ReactImageManager(AbstractC4922b abstractC4922b, a aVar, f fVar) {
        this.draweeControllerBuilder = abstractC4922b;
    }

    public ReactImageManager(AbstractC4922b abstractC4922b, Object obj) {
        this(abstractC4922b, (a) null, (f) null);
        this.callerContext = obj;
    }

    public ReactImageManager(AbstractC4922b abstractC4922b, a aVar, Object obj) {
        this(abstractC4922b, aVar, (f) null);
        this.callerContext = obj;
    }
}
