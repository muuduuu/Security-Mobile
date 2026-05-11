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
import m5.InterfaceC3651a;

@K4.a(name = ReactHorizontalScrollViewManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class ReactHorizontalScrollViewManager extends ViewGroupManager<b> implements e.a {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private InterfaceC3651a mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this(null);
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
    public void setBorderColor(b bVar, int i10, Integer num) {
        if (G4.a.c()) {
            C1931a.k(bVar, j.ALL, num);
        } else {
            bVar.G(SPACING_TYPES[i10], num);
        }
    }

    @Z4.b(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(b bVar, int i10, float f10) {
        if (G4.a.c()) {
            C1931a.l(bVar, EnumC3081c.values()[i10], Float.isNaN(f10) ? null : new X(f10, Y.POINT));
            return;
        }
        if (!Float.isNaN(f10)) {
            f10 = C1944g0.g(f10);
        }
        if (i10 == 0) {
            bVar.setBorderRadius(f10);
        } else {
            bVar.H(f10, i10 - 1);
        }
    }

    @Z4.a(name = "borderStyle")
    public void setBorderStyle(b bVar, String str) {
        if (G4.a.c()) {
            C1931a.m(bVar, str == null ? null : EnumC3083e.fromString(str));
        } else {
            bVar.setBorderStyle(str);
        }
    }

    @Z4.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(b bVar, int i10, float f10) {
        if (G4.a.c()) {
            C1931a.n(bVar, j.values()[i10], Float.valueOf(f10));
            return;
        }
        if (!Float.isNaN(f10)) {
            f10 = C1944g0.g(f10);
        }
        bVar.I(SPACING_TYPES[i10], f10);
    }

    @Z4.a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(b bVar, int i10) {
        bVar.setEndFillColor(i10);
    }

    @Z4.a(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(b bVar, ReadableArray readableArray) {
        if (G4.a.c()) {
            C1931a.o(bVar, readableArray);
        }
    }

    @Z4.a(name = "contentOffset")
    public void setContentOffset(b bVar, ReadableMap readableMap) {
        if (readableMap != null) {
            bVar.scrollTo((int) C1944g0.f(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) C1944g0.f(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
        } else {
            bVar.scrollTo(0, 0);
        }
    }

    @Z4.a(name = "decelerationRate")
    public void setDecelerationRate(b bVar, float f10) {
        bVar.setDecelerationRate(f10);
    }

    @Z4.a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(b bVar, boolean z10) {
        bVar.setDisableIntervalMomentum(z10);
    }

    @Z4.a(name = "enableSyncOnScroll")
    public void setEnableSyncOnScroll(b bVar, boolean z10) {
        bVar.setEnableSyncOnScroll(z10);
    }

    @Z4.a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(b bVar, int i10) {
        if (i10 > 0) {
            bVar.setHorizontalFadingEdgeEnabled(true);
            bVar.setFadingEdgeLength(i10);
        } else {
            bVar.setHorizontalFadingEdgeEnabled(false);
            bVar.setFadingEdgeLength(0);
        }
    }

    @Z4.a(name = "horizontal")
    public void setHorizontal(b bVar, boolean z10) {
    }

    @Z4.a(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(b bVar, ReadableMap readableMap) {
        if (readableMap != null) {
            bVar.setMaintainVisibleContentPosition(a.b.a(readableMap));
        } else {
            bVar.setMaintainVisibleContentPosition(null);
        }
    }

    @Z4.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(b bVar, boolean z10) {
        AbstractC1484a0.E0(bVar, z10);
    }

    @Z4.a(name = "overScrollMode")
    public void setOverScrollMode(b bVar, String str) {
        bVar.setOverScrollMode(f.m(str));
    }

    @Z4.a(name = "overflow")
    public void setOverflow(b bVar, String str) {
        bVar.setOverflow(str);
    }

    @Z4.a(name = "pagingEnabled")
    public void setPagingEnabled(b bVar, boolean z10) {
        bVar.setPagingEnabled(z10);
    }

    @Z4.a(name = "persistentScrollbar")
    public void setPersistentScrollbar(b bVar, boolean z10) {
        bVar.setScrollbarFadingEnabled(!z10);
    }

    @Z4.a(name = "pointerEvents")
    public void setPointerEvents(b bVar, String str) {
        bVar.setPointerEvents(EnumC1946h0.parsePointerEvents(str));
    }

    @Z4.a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(b bVar, boolean z10) {
        bVar.setRemoveClippedSubviews(z10);
    }

    @Z4.a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(b bVar, boolean z10) {
        bVar.setScrollEnabled(z10);
    }

    @Z4.a(name = "scrollEventThrottle")
    public void setScrollEventThrottle(b bVar, int i10) {
        bVar.setScrollEventThrottle(i10);
    }

    @Z4.a(name = "scrollPerfTag")
    public void setScrollPerfTag(b bVar, String str) {
        bVar.setScrollPerfTag(str);
    }

    @Z4.a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(b bVar, boolean z10) {
        bVar.setSendMomentumEvents(z10);
    }

    @Z4.a(defaultBoolean = true, name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(b bVar, boolean z10) {
        bVar.setHorizontalScrollBarEnabled(z10);
    }

    @Z4.a(name = "snapToAlignment")
    public void setSnapToAlignment(b bVar, String str) {
        bVar.setSnapToAlignment(f.n(str));
    }

    @Z4.a(name = "snapToEnd")
    public void setSnapToEnd(b bVar, boolean z10) {
        bVar.setSnapToEnd(z10);
    }

    @Z4.a(name = "snapToInterval")
    public void setSnapToInterval(b bVar, float f10) {
        bVar.setSnapInterval((int) (f10 * C1944g0.c()));
    }

    @Z4.a(name = "snapToOffsets")
    public void setSnapToOffsets(b bVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            bVar.setSnapOffsets(null);
            return;
        }
        float c10 = C1944g0.c();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i10) * c10)));
        }
        bVar.setSnapOffsets(arrayList);
    }

    @Z4.a(name = "snapToStart")
    public void setSnapToStart(b bVar, boolean z10) {
        bVar.setSnapToStart(z10);
    }

    public ReactHorizontalScrollViewManager(InterfaceC3651a interfaceC3651a) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(F0 f02) {
        return new b(f02, null);
    }

    @Override // com.facebook.react.views.scroll.e.a
    public void flashScrollIndicators(b bVar) {
        bVar.r();
    }

    @Override // com.facebook.react.views.scroll.e.a
    public void scrollTo(b bVar, e.b bVar2) {
        bVar.k();
        if (bVar2.f22706c) {
            bVar.c(bVar2.f22704a, bVar2.f22705b);
        } else {
            bVar.scrollTo(bVar2.f22704a, bVar2.f22705b);
        }
    }

    @Override // com.facebook.react.views.scroll.e.a
    public void scrollToEnd(b bVar, e.c cVar) {
        View childAt = bVar.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on HorizontalScrollView without child");
        }
        int width = childAt.getWidth() + bVar.getPaddingRight();
        bVar.k();
        if (cVar.f22707a) {
            bVar.c(width, bVar.getScrollY());
        } else {
            bVar.scrollTo(width, bVar.getScrollY());
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    public void setBackgroundColor(b bVar, int i10) {
        if (G4.a.c()) {
            C1931a.i(bVar, Integer.valueOf(i10));
        } else {
            super.setBackgroundColor((ReactHorizontalScrollViewManager) bVar, i10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(b bVar, C1973v0 c1973v0, E0 e02) {
        bVar.setStateWrapper(e02);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(b bVar, int i10, ReadableArray readableArray) {
        e.b(this, bVar, i10, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(b bVar, String str, ReadableArray readableArray) {
        e.c(this, bVar, str, readableArray);
    }
}
