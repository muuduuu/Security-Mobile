package com.facebook.react.views.view;

import a5.C1351a;
import android.graphics.Rect;
import android.view.View;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C1931a;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.EnumC1946h0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.Y;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import e5.C3079a;
import e5.EnumC3081c;
import e5.EnumC3083e;
import java.util.ArrayList;
import java.util.Map;
import v4.AbstractC4929e;

@K4.a(name = ReactViewManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class ReactViewManager extends ReactClippingViewManager<j> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5, 9, 10, 11};

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f22981a;

        a(j jVar) {
            this.f22981a = jVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EventDispatcher c10 = L0.c((ReactContext) this.f22981a.getContext(), this.f22981a.getId());
            if (c10 == null) {
                return;
            }
            c10.c(new l(L0.e(this.f22981a.getContext()), this.f22981a.getId()));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22983a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f22983a = iArr;
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22983a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22983a[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ReactViewManager() {
        setupViewRecycling();
    }

    private void handleHotspotUpdate(j jVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        }
        jVar.drawableHotspotChanged(C1944g0.f(readableArray.getDouble(0)), C1944g0.f(readableArray.getDouble(1)));
    }

    private void handleSetPressed(j jVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        }
        jVar.setPressed(readableArray.getBoolean(0));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return AbstractC4929e.e(HOTSPOT_UPDATE_KEY, 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Z4.a(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(j jVar, int i10) {
        jVar.setNextFocusDownId(i10);
    }

    @Z4.a(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(j jVar, int i10) {
        jVar.setNextFocusForwardId(i10);
    }

    @Z4.a(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(j jVar, int i10) {
        jVar.setNextFocusLeftId(i10);
    }

    @Z4.a(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(j jVar, int i10) {
        jVar.setNextFocusRightId(i10);
    }

    @Z4.a(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(j jVar, int i10) {
        jVar.setNextFocusUpId(i10);
    }

    @Z4.a(name = "accessible")
    public void setAccessible(j jVar, boolean z10) {
        jVar.setFocusable(z10);
    }

    @Z4.a(name = "backfaceVisibility")
    public void setBackfaceVisibility(j jVar, String str) {
        jVar.setBackfaceVisibility(str);
    }

    @Z4.a(customType = "BackgroundImage", name = "experimental_backgroundImage")
    public void setBackgroundImage(j jVar, ReadableArray readableArray) {
        if (C1351a.c(jVar) == 2) {
            if (readableArray == null || readableArray.size() <= 0) {
                jVar.setBackgroundImage(null);
                return;
            }
            ArrayList arrayList = new ArrayList(readableArray.size());
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                arrayList.add(new C3079a(readableArray.getMap(i10)));
            }
            jVar.setBackgroundImage(arrayList);
        }
    }

    @Z4.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor", "borderBlockColor", "borderBlockEndColor", "borderBlockStartColor"})
    public void setBorderColor(j jVar, int i10, Integer num) {
        if (G4.a.c()) {
            C1931a.k(jVar, e5.j.fromSpacingType(SPACING_TYPES[i10]), num);
        } else {
            jVar.setBorderColor(SPACING_TYPES[i10], num);
        }
    }

    @Z4.b(names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS, "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"})
    public void setBorderRadius(j jVar, int i10, Dynamic dynamic) {
        X c10 = X.c(dynamic);
        if (C1351a.c(jVar) != 2 && c10 != null && c10.a() == Y.PERCENT) {
            c10 = null;
        }
        if (G4.a.c()) {
            C1931a.l(jVar, EnumC3081c.values()[i10], c10);
        } else {
            jVar.setBorderRadius(EnumC3081c.values()[i10], c10);
        }
    }

    @Z4.a(name = "borderStyle")
    public void setBorderStyle(j jVar, String str) {
        if (G4.a.c()) {
            C1931a.m(jVar, str == null ? null : EnumC3083e.fromString(str));
        } else {
            jVar.setBorderStyle(str);
        }
    }

    @Z4.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(j jVar, int i10, float f10) {
        if (G4.a.c()) {
            C1931a.n(jVar, e5.j.values()[i10], Float.valueOf(f10));
            return;
        }
        if (!Float.isNaN(f10) && f10 < 0.0f) {
            f10 = Float.NaN;
        }
        if (!Float.isNaN(f10)) {
            f10 = C1944g0.g(f10);
        }
        jVar.setBorderWidth(SPACING_TYPES[i10], f10);
    }

    @Z4.a(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(j jVar, ReadableArray readableArray) {
        if (G4.a.c()) {
            C1931a.o(jVar, readableArray);
        }
    }

    @Z4.a(name = "collapsable")
    public void setCollapsable(j jVar, boolean z10) {
    }

    @Z4.a(name = "collapsableChildren")
    public void setCollapsableChildren(j jVar, boolean z10) {
    }

    @Z4.a(name = "focusable")
    public void setFocusable(j jVar, boolean z10) {
        if (z10) {
            jVar.setOnClickListener(new a(jVar));
            jVar.setFocusable(true);
        } else {
            jVar.setOnClickListener(null);
            jVar.setClickable(false);
        }
    }

    @Z4.a(name = "hitSlop")
    public void setHitSlop(j jVar, Dynamic dynamic) {
        int i10 = b.f22983a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            ReadableMap asMap = dynamic.asMap();
            jVar.setHitSlopRect(new Rect(asMap.hasKey("left") ? (int) C1944g0.f(asMap.getDouble("left")) : 0, asMap.hasKey("top") ? (int) C1944g0.f(asMap.getDouble("top")) : 0, asMap.hasKey("right") ? (int) C1944g0.f(asMap.getDouble("right")) : 0, asMap.hasKey("bottom") ? (int) C1944g0.f(asMap.getDouble("bottom")) : 0));
        } else {
            if (i10 == 2) {
                int f10 = (int) C1944g0.f(dynamic.asDouble());
                jVar.setHitSlopRect(new Rect(f10, f10, f10, f10));
                return;
            }
            if (i10 != 3) {
                AbstractC1721a.J("ReactNative", "Invalid type for 'hitSlop' value " + dynamic.getType());
            }
            jVar.setHitSlopRect(null);
        }
    }

    @Z4.a(name = "nativeBackgroundAndroid")
    public void setNativeBackground(j jVar, ReadableMap readableMap) {
        jVar.setTranslucentBackgroundDrawable(readableMap == null ? null : f.a(jVar.getContext(), readableMap));
    }

    @Z4.a(name = "nativeForegroundAndroid")
    public void setNativeForeground(j jVar, ReadableMap readableMap) {
        jVar.setForeground(readableMap == null ? null : f.a(jVar.getContext(), readableMap));
    }

    @Z4.a(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(j jVar, boolean z10) {
        jVar.setNeedsOffscreenAlphaCompositing(z10);
    }

    @Z4.a(name = "overflow")
    public void setOverflow(j jVar, String str) {
        jVar.setOverflow(str);
    }

    @Z4.a(name = "pointerEvents")
    public void setPointerEvents(j jVar, String str) {
        jVar.setPointerEvents(EnumC1946h0.parsePointerEvents(str));
    }

    @Z4.a(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(j jVar, boolean z10) {
        if (z10) {
            jVar.setFocusable(true);
            jVar.setFocusableInTouchMode(true);
            jVar.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public j createViewInstance(F0 f02) {
        return new j(f02);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public j prepareToRecycleView(F0 f02, j jVar) {
        j jVar2 = (j) super.prepareToRecycleView(f02, (F0) jVar);
        if (jVar2 != null) {
            jVar2.recycleView();
        }
        return jVar;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    public void setBackgroundColor(j jVar, int i10) {
        if (G4.a.c()) {
            C1931a.i(jVar, Integer.valueOf(i10));
        } else {
            super.setBackgroundColor((ReactViewManager) jVar, i10);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    public void setOpacity(j jVar, float f10) {
        jVar.setOpacityIfPossible(f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransformProperty(j jVar, ReadableArray readableArray, ReadableArray readableArray2) {
        super.setTransformProperty((ReactViewManager) jVar, readableArray, readableArray2);
        jVar.setBackfaceVisibilityDependantOpacity();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(j jVar, int i10, ReadableArray readableArray) {
        if (i10 == 1) {
            handleHotspotUpdate(jVar, readableArray);
        } else {
            if (i10 != 2) {
                return;
            }
            handleSetPressed(jVar, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(j jVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setPressed")) {
            handleSetPressed(jVar, readableArray);
        } else if (str.equals(HOTSPOT_UPDATE_KEY)) {
            handleHotspotUpdate(jVar, readableArray);
        }
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(j jVar, int i10, float f10) {
        setBorderRadius(jVar, i10, new DynamicFromObject(Float.valueOf(f10)));
    }
}
