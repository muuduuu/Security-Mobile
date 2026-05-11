package c5;

/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1728a {
    public static final float a(float f10, float f11) {
        float f12;
        if (f10 < Math.abs(f11)) {
            f12 = 1 + ((float) Math.pow((f10 / Math.abs(f11)) - r0, 3));
        } else {
            f12 = 1.0f;
        }
        return kotlin.ranges.d.c(f10 + (f11 * f12), 0.0f);
    }
}
