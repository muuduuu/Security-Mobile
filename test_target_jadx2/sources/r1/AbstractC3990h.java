package r1;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: r1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3990h {
    static PropertyValuesHolder a(Property property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
