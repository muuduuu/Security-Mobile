package com.facebook.react.views.text;

import android.text.TextUtils;
import android.view.View;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1931a;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.Y;
import com.facebook.react.views.text.c;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import e5.EnumC3081c;
import e5.EnumC3083e;

/* loaded from: classes2.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends c> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};
    private static final String TAG = "ReactTextAnchorViewManager";

    @Z4.a(name = "accessible")
    public void setAccessible(m mVar, boolean z10) {
        mVar.setFocusable(z10);
    }

    @Z4.a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(m mVar, boolean z10) {
        mVar.setAdjustFontSizeToFit(z10);
    }

    @Z4.a(name = "android_hyphenationFrequency")
    public void setAndroidHyphenationFrequency(m mVar, String str) {
        if (str == null || str.equals("none")) {
            mVar.setHyphenationFrequency(0);
            return;
        }
        if (str.equals("full")) {
            mVar.setHyphenationFrequency(2);
            return;
        }
        if (str.equals("normal")) {
            mVar.setHyphenationFrequency(1);
            return;
        }
        AbstractC1721a.J("ReactNative", "Invalid android_hyphenationFrequency: " + str);
        mVar.setHyphenationFrequency(0);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    public void setBackgroundColor(T t10, int i10) {
        if (G4.a.c()) {
            C1931a.i(t10, Integer.valueOf(i10));
        } else {
            super.setBackgroundColor(t10, i10);
        }
    }

    @Z4.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(m mVar, int i10, Integer num) {
        if (G4.a.c()) {
            C1931a.k(mVar, e5.j.ALL, num);
        } else {
            mVar.w(SPACING_TYPES[i10], num);
        }
    }

    @Z4.b(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(m mVar, int i10, float f10) {
        if (G4.a.c()) {
            C1931a.l(mVar, EnumC3081c.values()[i10], Float.isNaN(f10) ? null : new X(f10, Y.POINT));
            return;
        }
        if (!Float.isNaN(f10)) {
            f10 = C1944g0.g(f10);
        }
        if (i10 == 0) {
            mVar.setBorderRadius(f10);
        } else {
            mVar.x(f10, i10 - 1);
        }
    }

    @Z4.a(name = "borderStyle")
    public void setBorderStyle(m mVar, String str) {
        if (G4.a.c()) {
            C1931a.m(mVar, str == null ? null : EnumC3083e.fromString(str));
        } else {
            mVar.setBorderStyle(str);
        }
    }

    @Z4.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(m mVar, int i10, float f10) {
        if (G4.a.c()) {
            C1931a.n(mVar, e5.j.values()[i10], Float.valueOf(f10));
            return;
        }
        if (!Float.isNaN(f10)) {
            f10 = C1944g0.g(f10);
        }
        mVar.y(SPACING_TYPES[i10], f10);
    }

    @Z4.a(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(m mVar, ReadableArray readableArray) {
        if (G4.a.c()) {
            C1931a.o(mVar, readableArray);
        }
    }

    @Z4.a(name = "dataDetectorType")
    public void setDataDetectorType(m mVar, String str) {
        if (str != null) {
            switch (str) {
                case "phoneNumber":
                    mVar.setLinkifyMask(4);
                    break;
                case "all":
                    mVar.setLinkifyMask(15);
                    break;
                case "link":
                    mVar.setLinkifyMask(1);
                    break;
                case "email":
                    mVar.setLinkifyMask(2);
                    break;
            }
            return;
        }
        mVar.setLinkifyMask(0);
    }

    @Z4.a(defaultBoolean = false, name = "disabled")
    public void setDisabled(m mVar, boolean z10) {
        mVar.setEnabled(!z10);
    }

    @Z4.a(name = "ellipsizeMode")
    public void setEllipsizeMode(m mVar, String str) {
        if (str == null || str.equals("tail")) {
            mVar.setEllipsizeLocation(TextUtils.TruncateAt.END);
            return;
        }
        if (str.equals("head")) {
            mVar.setEllipsizeLocation(TextUtils.TruncateAt.START);
            return;
        }
        if (str.equals("middle")) {
            mVar.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
            return;
        }
        if (str.equals("clip")) {
            mVar.setEllipsizeLocation(null);
            return;
        }
        AbstractC1721a.J("ReactNative", "Invalid ellipsizeMode: " + str);
        mVar.setEllipsizeLocation(TextUtils.TruncateAt.END);
    }

    @Z4.a(name = "fontSize")
    public void setFontSize(m mVar, float f10) {
        mVar.setFontSize(f10);
    }

    @Z4.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(m mVar, boolean z10) {
        mVar.setIncludeFontPadding(z10);
    }

    @Z4.a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(m mVar, float f10) {
        mVar.setLetterSpacing(f10);
    }

    @Z4.a(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(m mVar, boolean z10) {
        mVar.setNotifyOnInlineViewLayout(z10);
    }

    @Z4.a(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(m mVar, int i10) {
        mVar.setNumberOfLines(i10);
    }

    @Z4.a(name = "selectable")
    public void setSelectable(m mVar, boolean z10) {
        mVar.setTextIsSelectable(z10);
    }

    @Z4.a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(m mVar, Integer num) {
        if (num == null) {
            mVar.setHighlightColor(a.c(mVar.getContext()));
        } else {
            mVar.setHighlightColor(num.intValue());
        }
    }

    @Z4.a(name = "textAlignVertical")
    public void setTextAlignVertical(m mVar, String str) {
        if (str == null || "auto".equals(str)) {
            mVar.setGravityVertical(0);
            return;
        }
        if ("top".equals(str)) {
            mVar.setGravityVertical(48);
            return;
        }
        if ("bottom".equals(str)) {
            mVar.setGravityVertical(80);
            return;
        }
        if ("center".equals(str)) {
            mVar.setGravityVertical(16);
            return;
        }
        AbstractC1721a.J("ReactNative", "Invalid textAlignVertical: " + str);
        mVar.setGravityVertical(0);
    }
}
