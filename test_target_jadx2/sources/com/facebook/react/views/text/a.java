package com.facebook.react.views.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22756a = new a();

    private a() {
    }

    private final ColorStateList a(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        return obtainStyledAttributes.getColorStateList(0);
    }

    public static final ColorStateList b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f22756a.a(context, R.attr.textColor);
    }

    public static final int c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ColorStateList a10 = f22756a.a(context, R.attr.textColorHighlight);
        if (a10 != null) {
            return a10.getDefaultColor();
        }
        return 0;
    }

    public static final ColorStateList d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f22756a.a(context, R.attr.textColorHint);
    }
}
