package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.rssignaturecapture.RSSignatureCaptureViewManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.react.uimanager.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1943g implements c1 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC1945h f22417a;

    public AbstractC1943g(InterfaceC1945h mViewManager) {
        Intrinsics.checkNotNullParameter(mViewManager, "mViewManager");
        this.f22417a = mViewManager;
    }

    @Override // com.facebook.react.uimanager.c1
    public void a(View view, String str, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (str != null) {
            switch (str.hashCode()) {
                case -1721943862:
                    if (str.equals("translateX")) {
                        Double d10 = (Double) obj;
                        this.f22417a.setTranslateX(view, d10 != null ? (float) d10.doubleValue() : 0.0f);
                        break;
                    }
                    break;
                case -1721943861:
                    if (str.equals("translateY")) {
                        Double d11 = (Double) obj;
                        this.f22417a.setTranslateY(view, d11 != null ? (float) d11.doubleValue() : 0.0f);
                        break;
                    }
                    break;
                case -1589741021:
                    if (str.equals("shadowColor")) {
                        InterfaceC1945h interfaceC1945h = this.f22417a;
                        Integer color = obj == null ? 0 : ColorPropConverter.getColor(obj, view.getContext());
                        Intrinsics.d(color);
                        interfaceC1945h.setShadowColor(view, color.intValue());
                        break;
                    }
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        Double d12 = (Double) obj;
                        this.f22417a.setOpacity(view, d12 != null ? (float) d12.doubleValue() : 1.0f);
                        break;
                    }
                    break;
                case -1228066334:
                    if (str.equals(Snapshot.BORDER_TOP_LEFT_RADIUS)) {
                        Double d13 = (Double) obj;
                        this.f22417a.setBorderTopLeftRadius(view, d13 != null ? (float) d13.doubleValue() : Float.NaN);
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        Double d14 = (Double) obj;
                        this.f22417a.setScaleX(view, d14 != null ? (float) d14.doubleValue() : 1.0f);
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        Double d15 = (Double) obj;
                        this.f22417a.setScaleY(view, d15 != null ? (float) d15.doubleValue() : 1.0f);
                        break;
                    }
                    break;
                case -877170387:
                    if (str.equals("testID")) {
                        this.f22417a.setTestId(view, (String) obj);
                        break;
                    }
                    break;
                case -781597262:
                    if (str.equals("transformOrigin")) {
                        this.f22417a.setTransformOrigin(view, (ReadableArray) obj);
                        break;
                    }
                    break;
                case -731417480:
                    if (str.equals("zIndex")) {
                        Double d16 = (Double) obj;
                        this.f22417a.setZIndex(view, d16 != null ? (float) d16.doubleValue() : 0.0f);
                        break;
                    }
                    break;
                case -101663499:
                    if (str.equals("accessibilityHint")) {
                        this.f22417a.setAccessibilityHint(view, (String) obj);
                        break;
                    }
                    break;
                case -101359900:
                    if (str.equals("accessibilityRole")) {
                        this.f22417a.setAccessibilityRole(view, (String) obj);
                        break;
                    }
                    break;
                case -80891667:
                    if (str.equals("renderToHardwareTextureAndroid")) {
                        Boolean bool = (Boolean) obj;
                        this.f22417a.setRenderToHardwareTexture(view, bool != null ? bool.booleanValue() : false);
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        Double d17 = (Double) obj;
                        this.f22417a.setRotation(view, d17 != null ? (float) d17.doubleValue() : 0.0f);
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        Double d18 = (Double) obj;
                        this.f22417a.setElevation(view, d18 != null ? (float) d18.doubleValue() : 0.0f);
                        break;
                    }
                    break;
                case 3506294:
                    if (str.equals("role")) {
                        this.f22417a.setRole(view, (String) obj);
                        break;
                    }
                    break;
                case 36255470:
                    if (str.equals("accessibilityLiveRegion")) {
                        this.f22417a.setAccessibilityLiveRegion(view, (String) obj);
                        break;
                    }
                    break;
                case 333432965:
                    if (str.equals(Snapshot.BORDER_TOP_RIGHT_RADIUS)) {
                        Double d19 = (Double) obj;
                        this.f22417a.setBorderTopRightRadius(view, d19 != null ? (float) d19.doubleValue() : Float.NaN);
                        break;
                    }
                    break;
                case 581268560:
                    if (str.equals(Snapshot.BORDER_BOTTOM_LEFT_RADIUS)) {
                        Double d20 = (Double) obj;
                        this.f22417a.setBorderBottomLeftRadius(view, d20 != null ? (float) d20.doubleValue() : Float.NaN);
                        break;
                    }
                    break;
                case 588239831:
                    if (str.equals(Snapshot.BORDER_BOTTOM_RIGHT_RADIUS)) {
                        Double d21 = (Double) obj;
                        this.f22417a.setBorderBottomRightRadius(view, d21 != null ? (float) d21.doubleValue() : Float.NaN);
                        break;
                    }
                    break;
                case 746986311:
                    if (str.equals("importantForAccessibility")) {
                        this.f22417a.setImportantForAccessibility(view, (String) obj);
                        break;
                    }
                    break;
                case 1052666732:
                    if (str.equals("transform")) {
                        this.f22417a.setTransform(view, (ReadableArray) obj);
                        break;
                    }
                    break;
                case 1146842694:
                    if (str.equals("accessibilityLabel")) {
                        this.f22417a.setAccessibilityLabel(view, (String) obj);
                        break;
                    }
                    break;
                case 1153872867:
                    if (str.equals("accessibilityState")) {
                        this.f22417a.setViewState(view, (ReadableMap) obj);
                        break;
                    }
                    break;
                case 1287124693:
                    if (str.equals(RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR)) {
                        InterfaceC1945h interfaceC1945h2 = this.f22417a;
                        Integer color2 = obj == null ? 0 : ColorPropConverter.getColor(obj, view.getContext());
                        Intrinsics.d(color2);
                        interfaceC1945h2.setBackgroundColor(view, color2.intValue());
                        break;
                    }
                    break;
                case 1349188574:
                    if (str.equals(Snapshot.BORDER_RADIUS)) {
                        Double d22 = (Double) obj;
                        this.f22417a.setBorderRadius(view, d22 != null ? (float) d22.doubleValue() : Float.NaN);
                        break;
                    }
                    break;
                case 1505602511:
                    if (str.equals("accessibilityActions")) {
                        this.f22417a.setAccessibilityActions(view, (ReadableArray) obj);
                        break;
                    }
                    break;
                case 1761903244:
                    if (str.equals("accessibilityCollection")) {
                        this.f22417a.setAccessibilityCollection(view, (ReadableMap) obj);
                        break;
                    }
                    break;
                case 1865277756:
                    if (str.equals("accessibilityLabelledBy")) {
                        this.f22417a.setAccessibilityLabelledBy(view, new DynamicFromObject(obj));
                        break;
                    }
                    break;
                case 1993034687:
                    if (str.equals("accessibilityCollectionItem")) {
                        this.f22417a.setAccessibilityCollectionItem(view, (ReadableMap) obj);
                        break;
                    }
                    break;
                case 2045685618:
                    if (str.equals("nativeID")) {
                        this.f22417a.setNativeId(view, (String) obj);
                        break;
                    }
                    break;
            }
        }
    }
}
