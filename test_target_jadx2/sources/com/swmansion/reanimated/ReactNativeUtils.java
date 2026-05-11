package com.swmansion.reanimated;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class ReactNativeUtils {
    private static Method getCornerRadiiMethod;
    private static Field mBorderRadiusField;

    public static class BorderRadii {
        public float bottomLeft;
        public float bottomRight;
        public float full;
        public float topLeft;
        public float topRight;

        public BorderRadii(float f10, float f11, float f12, float f13, float f14) {
            this.full = Float.isNaN(f10) ? 0.0f : f10;
            this.topLeft = Float.isNaN(f11) ? this.full : f11;
            this.topRight = Float.isNaN(f12) ? this.full : f12;
            this.bottomLeft = Float.isNaN(f13) ? this.full : f13;
            this.bottomRight = Float.isNaN(f14) ? this.full : f14;
        }
    }

    public static BorderRadii getBorderRadii(View view) {
        if (view.getBackground() != null) {
            return BorderRadiiDrawableUtils.getBorderRadii(view);
        }
        if (view instanceof com.facebook.react.views.image.h) {
            try {
                if (mBorderRadiusField == null) {
                    Field declaredField = com.facebook.react.views.image.h.class.getDeclaredField("mBorderRadius");
                    mBorderRadiusField = declaredField;
                    declaredField.setAccessible(true);
                }
                float f10 = mBorderRadiusField.getFloat(view);
                if (getCornerRadiiMethod == null) {
                    Method declaredMethod = com.facebook.react.views.image.h.class.getDeclaredMethod("j", float[].class);
                    getCornerRadiiMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (Float.isNaN(f10)) {
                    f10 = 0.0f;
                }
                float f11 = f10;
                float[] fArr = new float[4];
                getCornerRadiiMethod.invoke(view, fArr);
                return new BorderRadii(f11, fArr[0], fArr[1], fArr[2], fArr[3]);
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            }
        }
        return new BorderRadii(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    }
}
