package com.facebook.react.views.scroll;

import android.view.View;
import androidx.core.view.AbstractC1484a0;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.uimanager.C1931a;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.C1973v0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.EnumC1946h0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.Y;
import com.facebook.react.views.scroll.a;
import com.facebook.react.views.scroll.e;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import e5.EnumC3081c;
import e5.EnumC3083e;
import e5.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m5.InterfaceC3651a;
import v4.AbstractC4929e;

@K4.a(name = ReactScrollViewManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class ReactScrollViewManager extends ViewGroupManager<c> implements e.a {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private InterfaceC3651a mFpsListener;

    public ReactScrollViewManager() {
        this(null);
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        return AbstractC4929e.a().b(h.getJSEventName(h.SCROLL), AbstractC4929e.d("registrationName", "onScroll")).b(h.getJSEventName(h.BEGIN_DRAG), AbstractC4929e.d("registrationName", "onScrollBeginDrag")).b(h.getJSEventName(h.END_DRAG), AbstractC4929e.d("registrationName", "onScrollEndDrag")).b(h.getJSEventName(h.MOMENTUM_BEGIN), AbstractC4929e.d("registrationName", "onMomentumScrollBegin")).b(h.getJSEventName(h.MOMENTUM_END), AbstractC4929e.d("registrationName", "onMomentumScrollEnd")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return e.a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(createExportedCustomDirectEventTypeConstants());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Z4.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(c cVar, int i10, Integer num) {
        if (G4.a.c()) {
            C1931a.k(cVar, j.ALL, num);
        } else {
            cVar.C(SPACING_TYPES[i10], num);
        }
    }

    @Z4.b(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(c cVar, int i10, float f10) {
        if (G4.a.c()) {
            C1931a.l(cVar, EnumC3081c.values()[i10], Float.isNaN(f10) ? null : new X(f10, Y.POINT));
            return;
        }
        if (!Float.isNaN(f10)) {
            f10 = C1944g0.g(f10);
        }
        if (i10 == 0) {
            cVar.setBorderRadius(f10);
        } else {
            cVar.D(f10, i10 - 1);
        }
    }

    @Z4.a(name = "borderStyle")
    public void setBorderStyle(c cVar, String str) {
        if (G4.a.c()) {
            C1931a.m(cVar, str == null ? null : EnumC3083e.fromString(str));
        } else {
            cVar.setBorderStyle(str);
        }
    }

    @Z4.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(c cVar, int i10, float f10) {
        if (G4.a.c()) {
            C1931a.n(cVar, j.values()[i10], Float.valueOf(f10));
            return;
        }
        if (!Float.isNaN(f10)) {
            f10 = C1944g0.g(f10);
        }
        cVar.E(SPACING_TYPES[i10], f10);
    }

    @Z4.a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(c cVar, int i10) {
        cVar.setEndFillColor(i10);
    }

    @Z4.a(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(c cVar, ReadableArray readableArray) {
        if (G4.a.c()) {
            C1931a.o(cVar, readableArray);
        }
    }

    @Z4.a(customType = "Point", name = "contentOffset")
    public void setContentOffset(c cVar, ReadableMap readableMap) {
        cVar.setContentOffset(readableMap);
    }

    @Z4.a(name = "decelerationRate")
    public void setDecelerationRate(c cVar, float f10) {
        cVar.setDecelerationRate(f10);
    }

    @Z4.a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(c cVar, boolean z10) {
        cVar.setDisableIntervalMomentum(z10);
    }

    @Z4.a(name = "enableSyncOnScroll")
    public void setEnableSyncOnScroll(c cVar, boolean z10) {
        cVar.setEnableSyncOnScroll(z10);
    }

    @Z4.a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(c cVar, int i10) {
        if (i10 > 0) {
            cVar.setVerticalFadingEdgeEnabled(true);
            cVar.setFadingEdgeLength(i10);
        } else {
            cVar.setVerticalFadingEdgeEnabled(false);
            cVar.setFadingEdgeLength(0);
        }
    }

    @Z4.a(name = "horizontal")
    public void setHorizontal(c cVar, boolean z10) {
    }

    @Z4.a(name = "isInvertedVirtualizedList")
    public void setIsInvertedVirtualizedList(c cVar, boolean z10) {
        if (z10) {
            cVar.setVerticalScrollbarPosition(1);
        } else {
            cVar.setVerticalScrollbarPosition(0);
        }
    }

    @Z4.a(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(c cVar, ReadableMap readableMap) {
        if (readableMap != null) {
            cVar.setMaintainVisibleContentPosition(a.b.a(readableMap));
        } else {
            cVar.setMaintainVisibleContentPosition(null);
        }
    }

    @Z4.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(c cVar, boolean z10) {
        AbstractC1484a0.E0(cVar, z10);
    }

    @Z4.a(name = "overScrollMode")
    public void setOverScrollMode(c cVar, String str) {
        cVar.setOverScrollMode(f.m(str));
    }

    @Z4.a(name = "overflow")
    public void setOverflow(c cVar, String str) {
        cVar.setOverflow(str);
    }

    @Z4.a(name = "pagingEnabled")
    public void setPagingEnabled(c cVar, boolean z10) {
        cVar.setPagingEnabled(z10);
    }

    @Z4.a(name = "persistentScrollbar")
    public void setPersistentScrollbar(c cVar, boolean z10) {
        cVar.setScrollbarFadingEnabled(!z10);
    }

    @Z4.a(name = "pointerEvents")
    public void setPointerEvents(c cVar, String str) {
        cVar.setPointerEvents(EnumC1946h0.parsePointerEvents(str));
    }

    @Z4.a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(c cVar, boolean z10) {
        cVar.setRemoveClippedSubviews(z10);
    }

    @Z4.a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(c cVar, boolean z10) {
        cVar.setScrollEnabled(z10);
        cVar.setFocusable(z10);
    }

    @Z4.a(name = "scrollEventThrottle")
    public void setScrollEventThrottle(c cVar, int i10) {
        cVar.setScrollEventThrottle(i10);
    }

    @Z4.a(name = "scrollPerfTag")
    public void setScrollPerfTag(c cVar, String str) {
        cVar.setScrollPerfTag(str);
    }

    @Z4.a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(c cVar, boolean z10) {
        cVar.setSendMomentumEvents(z10);
    }

    @Z4.a(defaultBoolean = true, name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(c cVar, boolean z10) {
        cVar.setVerticalScrollBarEnabled(z10);
    }

    @Z4.a(name = "snapToAlignment")
    public void setSnapToAlignment(c cVar, String str) {
        cVar.setSnapToAlignment(f.n(str));
    }

    @Z4.a(name = "snapToEnd")
    public void setSnapToEnd(c cVar, boolean z10) {
        cVar.setSnapToEnd(z10);
    }

    @Z4.a(name = "snapToInterval")
    public void setSnapToInterval(c cVar, float f10) {
        cVar.setSnapInterval((int) (f10 * C1944g0.c()));
    }

    @Z4.a(name = "snapToOffsets")
    public void setSnapToOffsets(c cVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            cVar.setSnapOffsets(null);
            return;
        }
        float c10 = C1944g0.c();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i10) * c10)));
        }
        cVar.setSnapOffsets(arrayList);
    }

    @Z4.a(name = "snapToStart")
    public void setSnapToStart(c cVar, boolean z10) {
        cVar.setSnapToStart(z10);
    }

    public ReactScrollViewManager(InterfaceC3651a interfaceC3651a) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(F0 f02) {
        return new c(f02, null);
    }

    @Override // com.facebook.react.views.scroll.e.a
    public void flashScrollIndicators(c cVar) {
        cVar.p();
    }

    @Override // com.facebook.react.views.scroll.e.a
    public void scrollTo(c cVar, e.b bVar) {
        cVar.k();
        if (bVar.f22706c) {
            cVar.c(bVar.f22704a, bVar.f22705b);
        } else {
            cVar.scrollTo(bVar.f22704a, bVar.f22705b);
        }
    }

    @Override // com.facebook.react.views.scroll.e.a
    public void scrollToEnd(c cVar, e.c cVar2) {
        View childAt = cVar.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
        int height = childAt.getHeight() + cVar.getPaddingBottom();
        cVar.k();
        if (cVar2.f22707a) {
            cVar.c(cVar.getScrollX(), height);
        } else {
            cVar.scrollTo(cVar.getScrollX(), height);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    public void setBackgroundColor(c cVar, int i10) {
        if (G4.a.c()) {
            C1931a.i(cVar, Integer.valueOf(i10));
        } else {
            super.setBackgroundColor((ReactScrollViewManager) cVar, i10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(c cVar, C1973v0 c1973v0, E0 e02) {
        cVar.setStateWrapper(e02);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(c cVar, int i10, ReadableArray readableArray) {
        e.b(this, cVar, i10, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(c cVar, String str, ReadableArray readableArray) {
        e.c(this, cVar, str, readableArray);
    }
}
