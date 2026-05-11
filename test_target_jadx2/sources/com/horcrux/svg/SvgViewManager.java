package com.horcrux.svg;

import android.graphics.Rect;
import android.util.SparseArray;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.EnumC1946h0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.c1;
import com.facebook.react.views.view.ReactViewManager;
import h5.N0;
import h5.O0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes2.dex */
class SvgViewManager extends ReactViewManager implements O0 {
    public static final String REACT_CLASS = "RNSVGSvgViewAndroid";
    private final c1 mDelegate = new N0(this);
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28978a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f28978a = iArr;
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28978a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28978a[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static SvgView getSvgViewByTag(int i10) {
        return mTagToSvgView.get(i10);
    }

    static void runWhenViewIsAvailable(int i10, Runnable runnable) {
        mTagToRunnable.put(i10, runnable);
    }

    static void setSvgView(int i10, SvgView svgView) {
        mTagToSvgView.put(i10, svgView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i10);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate */
    protected c1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.P
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.view.j createViewInstance(F0 f02) {
        return new SvgView(f02);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(com.facebook.react.views.view.j jVar) {
        super.onDropViewInstance((SvgViewManager) jVar);
        mTagToSvgView.remove(jVar.getId());
    }

    @Override // h5.O0
    public void setAccessible(SvgView svgView, boolean z10) {
        super.setAccessible((com.facebook.react.views.view.j) svgView, z10);
    }

    @Override // h5.O0
    @Z4.a(name = "align")
    public void setAlign(SvgView svgView, String str) {
        svgView.setAlign(str);
    }

    @Override // h5.O0
    public void setBackfaceVisibility(SvgView svgView, String str) {
        super.setBackfaceVisibility((com.facebook.react.views.view.j) svgView, str);
    }

    @Override // h5.O0
    @Z4.a(name = "bbHeight")
    public void setBbHeight(SvgView svgView, Dynamic dynamic) {
        svgView.setBbHeight(dynamic);
    }

    @Override // h5.O0
    @Z4.a(name = "bbWidth")
    public void setBbWidth(SvgView svgView, Dynamic dynamic) {
        svgView.setBbWidth(dynamic);
    }

    @Override // h5.O0
    public void setBorderBlockColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 9, num);
    }

    @Override // h5.O0
    public void setBorderBlockEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 10, num);
    }

    @Override // h5.O0
    public void setBorderBlockStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 11, num);
    }

    @Override // h5.O0
    public void setBorderBottomColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 4, num);
    }

    @Override // h5.O0
    public void setBorderBottomEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 8, dynamic);
    }

    @Override // h5.O0
    public void setBorderBottomLeftRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 4, dynamic);
    }

    @Override // h5.O0
    public void setBorderBottomRightRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 3, dynamic);
    }

    @Override // h5.O0
    public void setBorderBottomStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 7, dynamic);
    }

    @Override // h5.O0
    public void setBorderColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 0, num);
    }

    @Override // h5.O0
    public void setBorderEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 6, num);
    }

    @Override // h5.O0
    public void setBorderEndEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 9, dynamic);
    }

    @Override // h5.O0
    public void setBorderEndStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 10, dynamic);
    }

    @Override // h5.O0
    public void setBorderLeftColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 1, num);
    }

    @Override // h5.O0
    public void setBorderRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 0, dynamic);
    }

    @Override // h5.O0
    public void setBorderRightColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 2, num);
    }

    @Override // h5.O0
    public void setBorderStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 5, num);
    }

    @Override // h5.O0
    public void setBorderStartEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 11, dynamic);
    }

    @Override // h5.O0
    public void setBorderStartStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 12, dynamic);
    }

    @Override // h5.O0
    public void setBorderStyle(SvgView svgView, String str) {
        super.setBorderStyle((com.facebook.react.views.view.j) svgView, str);
    }

    @Override // h5.O0
    public void setBorderTopColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 3, num);
    }

    @Override // h5.O0
    public void setBorderTopEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 6, dynamic);
    }

    @Override // h5.O0
    public void setBorderTopLeftRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 1, dynamic);
    }

    @Override // h5.O0
    public void setBorderTopRightRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 2, dynamic);
    }

    @Override // h5.O0
    public void setBorderTopStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 5, dynamic);
    }

    @Override // h5.O0
    @Z4.a(customType = "Color", name = "color")
    public void setColor(SvgView svgView, Integer num) {
        svgView.setCurrentColor(num);
    }

    @Override // h5.O0
    public void setFocusable(SvgView svgView, boolean z10) {
        super.setFocusable((com.facebook.react.views.view.j) svgView, z10);
    }

    @Override // h5.O0
    public void setHasTVPreferredFocus(SvgView svgView, boolean z10) {
        super.setTVPreferredFocus(svgView, z10);
    }

    @Override // h5.O0
    public void setHitSlop(SvgView svgView, Dynamic dynamic) {
        int i10 = a.f28978a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            ReadableMap asMap = dynamic.asMap();
            svgView.setHitSlopRect(new Rect(asMap.hasKey("left") ? (int) C1944g0.f(asMap.getDouble("left")) : 0, asMap.hasKey("top") ? (int) C1944g0.f(asMap.getDouble("top")) : 0, asMap.hasKey("right") ? (int) C1944g0.f(asMap.getDouble("right")) : 0, asMap.hasKey("bottom") ? (int) C1944g0.f(asMap.getDouble("bottom")) : 0));
        } else {
            if (i10 == 2) {
                int f10 = (int) C1944g0.f(dynamic.asDouble());
                svgView.setHitSlopRect(new Rect(f10, f10, f10, f10));
                return;
            }
            if (i10 != 3) {
                AbstractC1721a.J("ReactNative", "Invalid type for 'hitSlop' value " + dynamic.getType());
            }
            svgView.setHitSlopRect(null);
        }
    }

    @Override // h5.O0
    @Z4.a(name = "meetOrSlice")
    public void setMeetOrSlice(SvgView svgView, int i10) {
        svgView.setMeetOrSlice(i10);
    }

    @Override // h5.O0
    @Z4.a(name = "minX")
    public void setMinX(SvgView svgView, float f10) {
        svgView.setMinX(f10);
    }

    @Override // h5.O0
    @Z4.a(name = "minY")
    public void setMinY(SvgView svgView, float f10) {
        svgView.setMinY(f10);
    }

    @Override // h5.O0
    public void setNativeBackgroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeBackground(svgView, readableMap);
    }

    @Override // h5.O0
    public void setNativeForegroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeForeground(svgView, readableMap);
    }

    @Override // h5.O0
    public void setNeedsOffscreenAlphaCompositing(SvgView svgView, boolean z10) {
        super.setNeedsOffscreenAlphaCompositing((com.facebook.react.views.view.j) svgView, z10);
    }

    @Override // h5.O0
    public void setNextFocusDown(SvgView svgView, int i10) {
        super.nextFocusDown(svgView, i10);
    }

    @Override // h5.O0
    public void setNextFocusForward(SvgView svgView, int i10) {
        super.nextFocusForward(svgView, i10);
    }

    @Override // h5.O0
    public void setNextFocusLeft(SvgView svgView, int i10) {
        super.nextFocusLeft(svgView, i10);
    }

    @Override // h5.O0
    public void setNextFocusRight(SvgView svgView, int i10) {
        super.nextFocusRight(svgView, i10);
    }

    @Override // h5.O0
    public void setNextFocusUp(SvgView svgView, int i10) {
        super.nextFocusUp(svgView, i10);
    }

    @Override // h5.O0
    @Z4.a(name = "pointerEvents")
    public void setPointerEvents(SvgView svgView, String str) {
        try {
            Class<? super Object> superclass = svgView.getClass().getSuperclass();
            if (superclass != null) {
                Method declaredMethod = superclass.getDeclaredMethod("setPointerEvents", EnumC1946h0.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(svgView, EnumC1946h0.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            e10.printStackTrace();
        }
    }

    @Override // h5.O0
    public void setRemoveClippedSubviews(SvgView svgView, boolean z10) {
        super.setRemoveClippedSubviews((SvgViewManager) svgView, z10);
    }

    @Override // h5.O0
    @Z4.a(name = "vbHeight")
    public void setVbHeight(SvgView svgView, float f10) {
        svgView.setVbHeight(f10);
    }

    @Override // h5.O0
    @Z4.a(name = "vbWidth")
    public void setVbWidth(SvgView svgView, float f10) {
        svgView.setVbWidth(f10);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(com.facebook.react.views.view.j jVar, Object obj) {
        super.updateExtraData((SvgViewManager) jVar, obj);
        jVar.invalidate();
    }
}
