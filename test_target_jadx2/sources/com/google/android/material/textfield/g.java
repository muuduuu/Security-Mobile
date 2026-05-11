package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class g {
    static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                androidx.core.graphics.drawable.a.i(drawable, colorStateList);
            } else {
                androidx.core.graphics.drawable.a.i(drawable, ColorStateList.valueOf(colorStateList.getColorForState(b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                androidx.core.graphics.drawable.a.j(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static int[] b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
        androidx.core.graphics.drawable.a.i(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    private static void d(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean P10 = AbstractC1484a0.P(checkableImageButton);
        boolean z10 = onLongClickListener != null;
        boolean z11 = P10 || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(P10);
        checkableImageButton.setPressable(P10);
        checkableImageButton.setLongClickable(z10);
        AbstractC1484a0.B0(checkableImageButton, z11 ? 1 : 2);
    }

    static void e(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        d(checkableImageButton, onLongClickListener);
    }

    static void f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d(checkableImageButton, onLongClickListener);
    }
}
