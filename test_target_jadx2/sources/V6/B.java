package V6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;

/* loaded from: classes2.dex */
public final class B extends Button {
    public B(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int b(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        throw new IllegalStateException("Unknown color scheme: " + i10);
    }

    public final void a(Resources resources, int i10, int i11) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i12 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i12);
        setMinWidth(i12);
        int i13 = P6.b.f7522b;
        int i14 = P6.b.f7523c;
        int b10 = b(i11, i13, i14, i14);
        int i15 = P6.b.f7524d;
        int i16 = P6.b.f7525e;
        int b11 = b(i11, i15, i16, i16);
        if (i10 == 0 || i10 == 1) {
            b10 = b11;
        } else if (i10 != 2) {
            throw new IllegalStateException("Unknown button size: " + i10);
        }
        Drawable l10 = androidx.core.graphics.drawable.a.l(resources.getDrawable(b10));
        androidx.core.graphics.drawable.a.i(l10, resources.getColorStateList(P6.a.f7520c));
        androidx.core.graphics.drawable.a.j(l10, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(l10);
        int i17 = P6.a.f7518a;
        int i18 = P6.a.f7519b;
        setTextColor((ColorStateList) AbstractC1287s.m(resources.getColorStateList(b(i11, i17, i18, i18))));
        if (i10 == 0) {
            setText(resources.getString(P6.c.f7541p));
        } else if (i10 == 1) {
            setText(resources.getString(P6.c.f7542q));
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown button size: " + i10);
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (com.google.android.gms.common.util.j.c(getContext())) {
            setGravity(19);
        }
    }
}
