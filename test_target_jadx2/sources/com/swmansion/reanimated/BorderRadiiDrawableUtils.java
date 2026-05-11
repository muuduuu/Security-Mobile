package com.swmansion.reanimated;

import android.graphics.Rect;
import android.view.View;
import com.facebook.react.uimanager.C1931a;
import com.facebook.react.uimanager.X;
import com.swmansion.reanimated.ReactNativeUtils;
import e5.EnumC3081c;

/* loaded from: classes2.dex */
public class BorderRadiiDrawableUtils {
    public static ReactNativeUtils.BorderRadii getBorderRadii(View view) {
        return new ReactNativeUtils.BorderRadii(getRadiusForCorner(view, EnumC3081c.BORDER_RADIUS, 0.0f), getRadiusForCorner(view, EnumC3081c.BORDER_TOP_LEFT_RADIUS, Float.NaN), getRadiusForCorner(view, EnumC3081c.BORDER_TOP_RIGHT_RADIUS, Float.NaN), getRadiusForCorner(view, EnumC3081c.BORDER_BOTTOM_LEFT_RADIUS, Float.NaN), getRadiusForCorner(view, EnumC3081c.BORDER_BOTTOM_RIGHT_RADIUS, Float.NaN));
    }

    private static float getRadiusForCorner(View view, EnumC3081c enumC3081c, float f10) {
        X e10 = C1931a.e(view, enumC3081c);
        if (e10 == null) {
            return f10;
        }
        Rect bounds = view.getBackground().getBounds();
        return e10.b(bounds.width(), bounds.height()).c().a();
    }
}
