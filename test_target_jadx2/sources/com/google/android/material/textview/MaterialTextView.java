package com.google.android.material.textview;

import H7.l;
import V7.b;
import V7.c;
import a8.AbstractC1367a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.D;

/* loaded from: classes2.dex */
public class MaterialTextView extends D {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void s(Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, l.f3616d4);
        int v10 = v(getContext(), obtainStyledAttributes, l.f3634f4, l.f3643g4);
        obtainStyledAttributes.recycle();
        if (v10 >= 0) {
            setLineHeight(v10);
        }
    }

    private static boolean t(Context context) {
        return b.b(context, H7.b.f3124P, true);
    }

    private static int u(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f3652h4, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(l.f3661i4, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int v(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = c.c(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    private static boolean w(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f3652h4, i10, i11);
        int v10 = v(context, obtainStyledAttributes, l.f3670j4, l.f3679k4);
        obtainStyledAttributes.recycle();
        return v10 != -1;
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (t(context)) {
            s(context.getTheme(), i10);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(AbstractC1367a.c(context, attributeSet, i10, i11), attributeSet, i10);
        int u10;
        Context context2 = getContext();
        if (t(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (w(context2, theme, attributeSet, i10, i11) || (u10 = u(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            s(theme, u10);
        }
    }
}
