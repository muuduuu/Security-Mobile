package com.facebook.react.bridge;

import com.facebook.yoga.YogaValue;
import com.facebook.yoga.w;

/* loaded from: classes.dex */
public class DimensionPropConverter {
    public static YogaValue getDimension(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return new YogaValue(((Double) obj).floatValue(), w.POINT);
        }
        if (obj instanceof String) {
            return YogaValue.a((String) obj);
        }
        throw new JSApplicationCausedNativeException("DimensionValue: the value must be a number or string.");
    }
}
