package com.facebook.react.uimanager;

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import v4.AbstractC4929e;

/* loaded from: classes.dex */
abstract class N0 {
    static Map a() {
        return AbstractC4929e.a().b("topChange", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onChange", "captured", "onChangeCapture"))).b("topSelect", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onSelect", "captured", "onSelectCapture"))).b(com.facebook.react.uimanager.events.r.getJSEventName(com.facebook.react.uimanager.events.r.START), AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).b(com.facebook.react.uimanager.events.r.getJSEventName(com.facebook.react.uimanager.events.r.MOVE), AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).b(com.facebook.react.uimanager.events.r.getJSEventName(com.facebook.react.uimanager.events.r.END), AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).b(com.facebook.react.uimanager.events.r.getJSEventName(com.facebook.react.uimanager.events.r.CANCEL), AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.e("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).a();
    }

    public static Map b() {
        HashMap b10 = AbstractC4929e.b();
        b10.put("UIView", AbstractC4929e.d("ContentMode", AbstractC4929e.f("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        b10.put("StyleConstants", AbstractC4929e.d("PointerEventsValues", AbstractC4929e.g("none", Integer.valueOf(EnumC1946h0.NONE.ordinal()), "boxNone", Integer.valueOf(EnumC1946h0.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(EnumC1946h0.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(EnumC1946h0.AUTO.ordinal()))));
        b10.put("AccessibilityEventTypes", AbstractC4929e.f("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return b10;
    }

    static Map c() {
        return AbstractC4929e.a().b("topContentSizeChange", AbstractC4929e.d("registrationName", "onContentSizeChange")).b("topLayout", AbstractC4929e.d("registrationName", "onLayout")).b("topLoadingError", AbstractC4929e.d("registrationName", "onLoadingError")).b("topLoadingFinish", AbstractC4929e.d("registrationName", "onLoadingFinish")).b("topLoadingStart", AbstractC4929e.d("registrationName", "onLoadingStart")).b("topSelectionChange", AbstractC4929e.d("registrationName", "onSelectionChange")).b("topMessage", AbstractC4929e.d("registrationName", "onMessage")).b("topScrollBeginDrag", AbstractC4929e.d("registrationName", "onScrollBeginDrag")).b("topScrollEndDrag", AbstractC4929e.d("registrationName", "onScrollEndDrag")).b("topScroll", AbstractC4929e.d("registrationName", "onScroll")).b("topMomentumScrollBegin", AbstractC4929e.d("registrationName", "onMomentumScrollBegin")).b("topMomentumScrollEnd", AbstractC4929e.d("registrationName", "onMomentumScrollEnd")).a();
    }
}
