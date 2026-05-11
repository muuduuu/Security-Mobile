package W7;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.core.graphics.d;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f11399a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f11400b = {R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f11401c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f11402d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f11403e = {R.attr.state_hovered};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f11404f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f11405g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f11406h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f11407i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f11408j = {R.attr.state_selected};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f11409k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l, reason: collision with root package name */
    static final String f11410l = b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f11399a) {
            return new ColorStateList(new int[][]{f11408j, StateSet.NOTHING}, new int[]{c(colorStateList, f11404f), c(colorStateList, f11400b)});
        }
        int[] iArr = f11404f;
        int[] iArr2 = f11405g;
        int[] iArr3 = f11406h;
        int[] iArr4 = f11407i;
        int[] iArr5 = f11400b;
        int[] iArr6 = f11401c;
        int[] iArr7 = f11402d;
        int[] iArr8 = f11403e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f11408j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    private static int b(int i10) {
        return d.p(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f11399a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f11409k, 0)) != 0) {
            Log.w(f11410l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
