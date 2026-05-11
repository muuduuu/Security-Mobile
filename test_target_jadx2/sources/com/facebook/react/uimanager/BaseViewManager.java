package com.facebook.react.uimanager;

import a5.C1351a;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.AbstractC1484a0;
import c3.AbstractC1721a;
import com.facebook.react.AbstractC1899n;
import com.facebook.react.AbstractC1902q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C1948i0;
import com.facebook.react.uimanager.V;
import com.facebook.react.uimanager.Z;
import com.facebook.react.uimanager.events.n;
import com.rssignaturecapture.RSSignatureCaptureViewManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import f5.AbstractC3147a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import v4.AbstractC4929e;

/* loaded from: classes.dex */
public abstract class BaseViewManager<T extends View, C extends V> extends ViewManager<T, C> implements InterfaceC1945h, View.OnLayoutChangeListener {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static final Z.a sMatrixDecompositionContext = new Z.a();
    private static final double[] sTransformDecompositionArray = new double[16];

    private static class a {
        /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void a(View view, ReadableArray readableArray, Boolean bool) {
            Paint paint;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                view.setRenderEffect(null);
            }
            if (readableArray != null) {
                if (L.t(readableArray)) {
                    paint = new Paint();
                    paint.setColorFilter(L.v(readableArray));
                    if (paint != null) {
                        view.setLayerType((bool == null || !bool.booleanValue()) ? 0 : 2, null);
                        return;
                    } else {
                        view.setLayerType(2, paint);
                        return;
                    }
                }
                if (i10 >= 31) {
                    view.setRenderEffect(L.w(readableArray));
                }
            }
            paint = null;
            if (paint != null) {
            }
        }
    }

    public BaseViewManager() {
        super(null);
    }

    private void logUnsupportedPropertyWarning(String str) {
        AbstractC1721a.L("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f10) {
        if (f10 >= -3.4028235E38f && f10 <= Float.MAX_VALUE) {
            return f10;
        }
        if (f10 < -3.4028235E38f || f10 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f10 > Float.MAX_VALUE || f10 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f10)) {
            return CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        throw new IllegalStateException("Invalid float property value: " + f10);
    }

    private static void setPointerEventsFlag(View view, n.b bVar, boolean z10) {
        Integer num = (Integer) view.getTag(AbstractC1899n.f21899r);
        int intValue = num != null ? num.intValue() : 0;
        int ordinal = 1 << bVar.ordinal();
        view.setTag(AbstractC1899n.f21899r, Integer.valueOf(z10 ? ordinal | intValue : (~ordinal) & intValue));
    }

    private void updateViewAccessibility(T t10) {
        C1948i0.k0(t10, t10.isFocusable(), t10.getImportantForAccessibility());
    }

    private void updateViewContentDescription(T t10) {
        Dynamic dynamic;
        String str = (String) t10.getTag(AbstractC1899n.f21886e);
        ReadableMap readableMap = (ReadableMap) t10.getTag(AbstractC1899n.f21889h);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t10.getTag(AbstractC1899n.f21891j);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(nextKey);
                if (nextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t10.getContext().getString(AbstractC1902q.f21920F));
                } else if (nextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t10.getContext().getString(AbstractC1902q.f21919E));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.size() > 0) {
            t10.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        AbstractC4929e.a b10 = AbstractC4929e.a().b("topPointerCancel", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture"))).b("topPointerDown", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onPointerDown", "captured", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        exportedCustomDirectEventTypeConstants.putAll(b10.b("topPointerEnter", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.f("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture", "skipBubbling", bool))).b("topPointerLeave", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.f("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture", "skipBubbling", bool))).b("topPointerMove", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onPointerMove", "captured", "onPointerMoveCapture"))).b("topPointerUp", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onPointerUp", "captured", "onPointerUpCapture"))).b("topPointerOut", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onPointerOut", "captured", "onPointerOutCapture"))).b("topPointerOver", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onPointerOver", "captured", "onPointerOverCapture"))).b("topClick", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onClick", "captured", "onClickCapture"))).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(AbstractC4929e.a().b("topAccessibilityAction", AbstractC4929e.d("registrationName", "onAccessibilityAction")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected void onAfterUpdateTransaction(T t10) {
        super.onAfterUpdateTransaction(t10);
        updateViewAccessibility(t10);
        Boolean bool = (Boolean) t10.getTag(AbstractC1899n.f21896o);
        if (bool != null && bool.booleanValue()) {
            t10.addOnLayoutChangeListener(this);
            setTransformProperty(t10, (ReadableArray) t10.getTag(AbstractC1899n.f21907z), (ReadableArray) t10.getTag(AbstractC1899n.f21878A));
            t10.setTag(AbstractC1899n.f21896o, Boolean.FALSE);
        }
        a.a(t10, (ReadableArray) t10.getTag(AbstractC1899n.f21894m), (Boolean) t10.getTag(AbstractC1899n.f21879B));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i16 - i14;
        int i19 = i12 - i10;
        if (i13 - i11 == i17 - i15 && i19 == i18) {
            return;
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(AbstractC1899n.f21878A);
        ReadableArray readableArray2 = (ReadableArray) view.getTag(AbstractC1899n.f21907z);
        if (readableArray2 == null && readableArray == null) {
            return;
        }
        setTransformProperty(view, readableArray2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected T prepareToRecycleView(F0 f02, T t10) {
        t10.setTag(null);
        t10.setTag(AbstractC1899n.f21899r, null);
        t10.setTag(AbstractC1899n.f21900s, null);
        t10.setTag(AbstractC1899n.f21881D, null);
        t10.setTag(AbstractC1899n.f21897p, null);
        t10.setTag(AbstractC1899n.f21886e, null);
        t10.setTag(AbstractC1899n.f21885d, null);
        t10.setTag(AbstractC1899n.f21888g, null);
        t10.setTag(AbstractC1899n.f21889h, null);
        t10.setTag(AbstractC1899n.f21882a, null);
        t10.setTag(AbstractC1899n.f21891j, null);
        t10.setTag(AbstractC1899n.f21890i, null);
        setTransformProperty(t10, null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            return null;
        }
        t10.resetPivot();
        t10.setTop(0);
        t10.setBottom(0);
        t10.setLeft(0);
        t10.setRight(0);
        t10.setElevation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        if (i10 >= 29) {
            t10.setAnimationMatrix(null);
        }
        t10.setTag(AbstractC1899n.f21907z, null);
        t10.setTag(AbstractC1899n.f21878A, null);
        t10.setTag(AbstractC1899n.f21896o, null);
        t10.removeOnLayoutChangeListener(this);
        t10.setTag(AbstractC1899n.f21879B, null);
        t10.setTag(AbstractC1899n.f21894m, null);
        t10.setTag(AbstractC1899n.f21898q, null);
        a.a(t10, null, null);
        if (i10 >= 28) {
            t10.setOutlineAmbientShadowColor(-16777216);
            t10.setOutlineSpotShadowColor(-16777216);
        }
        t10.setNextFocusDownId(-1);
        t10.setNextFocusForwardId(-1);
        t10.setNextFocusRightId(-1);
        t10.setNextFocusUpId(-1);
        t10.setFocusable(false);
        t10.setFocusableInTouchMode(false);
        t10.setElevation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        t10.setAlpha(1.0f);
        setPadding(t10, 0, 0, 0, 0);
        t10.setForeground(null);
        return t10;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "accessibilityActions")
    public void setAccessibilityActions(T t10, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t10.setTag(AbstractC1899n.f21882a, readableArray);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "accessibilityCollection")
    public void setAccessibilityCollection(T t10, ReadableMap readableMap) {
        t10.setTag(AbstractC1899n.f21883b, readableMap);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "accessibilityCollectionItem")
    public void setAccessibilityCollectionItem(T t10, ReadableMap readableMap) {
        t10.setTag(AbstractC1899n.f21884c, readableMap);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "accessibilityHint")
    public void setAccessibilityHint(T t10, String str) {
        t10.setTag(AbstractC1899n.f21885d, str);
        updateViewContentDescription(t10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t10, String str) {
        t10.setTag(AbstractC1899n.f21886e, str);
        updateViewContentDescription(t10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "accessibilityLabelledBy")
    public void setAccessibilityLabelledBy(T t10, Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t10.setTag(AbstractC1899n.f21897p, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t10.setTag(AbstractC1899n.f21897p, dynamic.asArray().getString(0));
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t10, String str) {
        if (str == null || str.equals("none")) {
            AbstractC1484a0.s0(t10, 0);
        } else if (str.equals("polite")) {
            AbstractC1484a0.s0(t10, 1);
        } else if (str.equals("assertive")) {
            AbstractC1484a0.s0(t10, 2);
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "accessibilityRole")
    public void setAccessibilityRole(T t10, String str) {
        if (str == null) {
            t10.setTag(AbstractC1899n.f21888g, null);
        } else {
            t10.setTag(AbstractC1899n.f21888g, C1948i0.e.fromValue(str));
        }
    }

    @Z4.a(name = "accessibilityValue")
    public void setAccessibilityValue(T t10, ReadableMap readableMap) {
        if (readableMap == null) {
            t10.setTag(AbstractC1899n.f21891j, null);
            t10.setContentDescription(null);
        } else {
            t10.setTag(AbstractC1899n.f21891j, readableMap);
            if (readableMap.hasKey("text")) {
                updateViewContentDescription(t10);
            }
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(customType = "Color", defaultInt = 0, name = RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR)
    public void setBackgroundColor(T t10, int i10) {
        t10.setBackgroundColor(i10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    public void setBorderBottomLeftRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_BOTTOM_LEFT_RADIUS);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    public void setBorderBottomRightRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_BOTTOM_RIGHT_RADIUS);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    public void setBorderRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_RADIUS);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    public void setBorderTopLeftRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_TOP_LEFT_RADIUS);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    public void setBorderTopRightRadius(T t10, float f10) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_TOP_RIGHT_RADIUS);
    }

    @Z4.a(name = "onClick")
    public void setClick(T t10, boolean z10) {
        setPointerEventsFlag(t10, n.b.CLICK, z10);
    }

    @Z4.a(name = "onClickCapture")
    public void setClickCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, n.b.CLICK_CAPTURE, z10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "elevation")
    public void setElevation(T t10, float f10) {
        AbstractC1484a0.y0(t10, C1944g0.g(f10));
    }

    @Z4.a(customType = "Filter", name = "filter")
    public void setFilter(T t10, ReadableArray readableArray) {
        if (C1351a.c(t10) == 2) {
            t10.setTag(AbstractC1899n.f21894m, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t10, String str) {
        if (str == null || str.equals("auto")) {
            AbstractC1484a0.B0(t10, 0);
            return;
        }
        if (str.equals("yes")) {
            AbstractC1484a0.B0(t10, 1);
        } else if (str.equals("no")) {
            AbstractC1484a0.B0(t10, 2);
        } else if (str.equals("no-hide-descendants")) {
            AbstractC1484a0.B0(t10, 4);
        }
    }

    @Z4.a(name = "experimental_mixBlendMode")
    public void setMixBlendMode(T t10, String str) {
        if (C1351a.c(t10) == 2) {
            t10.setTag(AbstractC1899n.f21898q, C1976x.a(str));
        }
    }

    @Z4.a(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(T t10, boolean z10) {
    }

    @Z4.a(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(T t10, boolean z10) {
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "nativeID")
    public void setNativeId(T t10, String str) {
        t10.setTag(AbstractC1899n.f21881D, str);
        AbstractC3147a.c(t10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t10, float f10) {
        t10.setAlpha(f10);
    }

    @Z4.a(name = "onPointerEnter")
    public void setPointerEnter(T t10, boolean z10) {
        setPointerEventsFlag(t10, n.b.ENTER, z10);
    }

    @Z4.a(name = "onPointerEnterCapture")
    public void setPointerEnterCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, n.b.ENTER_CAPTURE, z10);
    }

    @Z4.a(name = "onPointerLeave")
    public void setPointerLeave(T t10, boolean z10) {
        setPointerEventsFlag(t10, n.b.LEAVE, z10);
    }

    @Z4.a(name = "onPointerLeaveCapture")
    public void setPointerLeaveCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, n.b.LEAVE_CAPTURE, z10);
    }

    @Z4.a(name = "onPointerMove")
    public void setPointerMove(T t10, boolean z10) {
        setPointerEventsFlag(t10, n.b.MOVE, z10);
    }

    @Z4.a(name = "onPointerMoveCapture")
    public void setPointerMoveCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, n.b.MOVE_CAPTURE, z10);
    }

    @Z4.a(name = "onPointerOut")
    public void setPointerOut(T t10, boolean z10) {
        setPointerEventsFlag(t10, n.b.OUT, z10);
    }

    @Z4.a(name = "onPointerOutCapture")
    public void setPointerOutCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, n.b.OUT_CAPTURE, z10);
    }

    @Z4.a(name = "onPointerOver")
    public void setPointerOver(T t10, boolean z10) {
        setPointerEventsFlag(t10, n.b.OVER, z10);
    }

    @Z4.a(name = "onPointerOverCapture")
    public void setPointerOverCapture(T t10, boolean z10) {
        setPointerEventsFlag(t10, n.b.OVER_CAPTURE, z10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t10, boolean z10) {
        t10.setTag(AbstractC1899n.f21879B, Boolean.valueOf(z10));
    }

    @Z4.a(name = "onResponderEnd")
    public void setResponderEnd(T t10, boolean z10) {
    }

    @Z4.a(name = "onResponderGrant")
    public void setResponderGrant(T t10, boolean z10) {
    }

    @Z4.a(name = "onResponderMove")
    public void setResponderMove(T t10, boolean z10) {
    }

    @Z4.a(name = "onResponderReject")
    public void setResponderReject(T t10, boolean z10) {
    }

    @Z4.a(name = "onResponderRelease")
    public void setResponderRelease(T t10, boolean z10) {
    }

    @Z4.a(name = "onResponderStart")
    public void setResponderStart(T t10, boolean z10) {
    }

    @Z4.a(name = "onResponderTerminate")
    public void setResponderTerminate(T t10, boolean z10) {
    }

    @Z4.a(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(T t10, boolean z10) {
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "role")
    public void setRole(T t10, String str) {
        if (str == null) {
            t10.setTag(AbstractC1899n.f21906y, null);
        } else {
            t10.setTag(AbstractC1899n.f21906y, C1948i0.f.fromValue(str));
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "rotation")
    @Deprecated
    public void setRotation(T t10, float f10) {
        t10.setRotation(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(T t10, float f10) {
        t10.setScaleX(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(T t10, float f10) {
        t10.setScaleY(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(customType = "Color", defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(T t10, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            t10.setOutlineAmbientShadowColor(i10);
            t10.setOutlineSpotShadowColor(i10);
        }
    }

    @Z4.a(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(T t10, boolean z10) {
    }

    @Z4.a(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(T t10, boolean z10) {
    }

    @Z4.a(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(T t10, boolean z10) {
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "testID")
    public void setTestId(T t10, String str) {
        t10.setTag(AbstractC1899n.f21900s, str);
        t10.setTag(str);
    }

    @Z4.a(name = "onTouchCancel")
    public void setTouchCancel(T t10, boolean z10) {
    }

    @Z4.a(name = "onTouchEnd")
    public void setTouchEnd(T t10, boolean z10) {
    }

    @Z4.a(name = "onTouchMove")
    public void setTouchMove(T t10, boolean z10) {
    }

    @Z4.a(name = "onTouchStart")
    public void setTouchStart(T t10, boolean z10) {
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "transform")
    public void setTransform(T t10, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t10.getTag(AbstractC1899n.f21907z), readableArray)) {
            return;
        }
        t10.setTag(AbstractC1899n.f21907z, readableArray);
        t10.setTag(AbstractC1899n.f21896o, Boolean.TRUE);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "transformOrigin")
    public void setTransformOrigin(T t10, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t10.getTag(AbstractC1899n.f21878A), readableArray)) {
            return;
        }
        t10.setTag(AbstractC1899n.f21878A, readableArray);
        t10.setTag(AbstractC1899n.f21896o, Boolean.TRUE);
    }

    protected void setTransformProperty(T t10, ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray == null) {
            t10.setTranslationX(C1944g0.g(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
            t10.setTranslationY(C1944g0.g(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
            t10.setRotation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            t10.setRotationX(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            t10.setRotationY(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            t10.setScaleX(1.0f);
            t10.setScaleY(1.0f);
            t10.setCameraDistance(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            return;
        }
        boolean z10 = C1351a.c(t10) == 2;
        Z.a aVar = sMatrixDecompositionContext;
        aVar.a();
        double[] dArr = sTransformDecompositionArray;
        I0.e(readableArray, dArr, C1944g0.e(t10.getWidth()), C1944g0.e(t10.getHeight()), readableArray2, z10);
        Z.k(dArr, aVar);
        t10.setTranslationX(C1944g0.g(sanitizeFloatPropertyValue((float) aVar.f22313d[0])));
        t10.setTranslationY(C1944g0.g(sanitizeFloatPropertyValue((float) aVar.f22313d[1])));
        t10.setRotation(sanitizeFloatPropertyValue((float) aVar.f22314e[2]));
        t10.setRotationX(sanitizeFloatPropertyValue((float) aVar.f22314e[0]));
        t10.setRotationY(sanitizeFloatPropertyValue((float) aVar.f22314e[1]));
        t10.setScaleX(sanitizeFloatPropertyValue((float) aVar.f22311b[0]));
        t10.setScaleY(sanitizeFloatPropertyValue((float) aVar.f22311b[1]));
        double[] dArr2 = aVar.f22310a;
        if (dArr2.length > 2) {
            float f10 = (float) dArr2[2];
            if (f10 == CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f10 = 7.8125E-4f;
            }
            float f11 = (-1.0f) / f10;
            float f12 = C1978y.c().density;
            t10.setCameraDistance(sanitizeFloatPropertyValue(f12 * f12 * f11 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(defaultFloat = CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, name = "translateX")
    @Deprecated
    public void setTranslateX(T t10, float f10) {
        t10.setTranslationX(C1944g0.g(f10));
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(defaultFloat = CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, name = "translateY")
    @Deprecated
    public void setTranslateY(T t10, float f10) {
        t10.setTranslationY(C1944g0.g(f10));
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "accessibilityState")
    public void setViewState(T t10, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey(STATE_EXPANDED)) {
            t10.setTag(AbstractC1899n.f21890i, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
        }
        if (readableMap.hasKey("selected")) {
            boolean isSelected = t10.isSelected();
            boolean z10 = readableMap.getBoolean("selected");
            t10.setSelected(z10);
            if (t10.isAccessibilityFocused() && isSelected && !z10) {
                t10.announceForAccessibility(t10.getContext().getString(AbstractC1902q.f21921G));
            }
        } else {
            t10.setSelected(false);
        }
        t10.setTag(AbstractC1899n.f21889h, readableMap);
        if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
            t10.setEnabled(true);
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.equals(STATE_BUSY) || nextKey.equals(STATE_EXPANDED) || (nextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t10);
                return;
            } else if (t10.isAccessibilityFocused()) {
                t10.sendAccessibilityEvent(1);
            }
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = "zIndex")
    public void setZIndex(T t10, float f10) {
        ViewGroupManager.setViewZIndex(t10, Math.round(f10));
        ViewParent parent = t10.getParent();
        if (parent instanceof InterfaceC1979y0) {
            ((InterfaceC1979y0) parent).updateDrawingOrder();
        }
    }

    public BaseViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
