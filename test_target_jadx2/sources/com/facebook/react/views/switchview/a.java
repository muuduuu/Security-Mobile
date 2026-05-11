package com.facebook.react.views.switchview;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.appcompat.widget.c0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends c0 {

    /* renamed from: q0, reason: collision with root package name */
    private boolean f22751q0;

    /* renamed from: r0, reason: collision with root package name */
    private Integer f22752r0;

    /* renamed from: s0, reason: collision with root package name */
    private Integer f22753s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22751q0 = true;
    }

    private final ColorStateList r(int i10) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}}, new int[]{i10});
    }

    public final void s(Drawable drawable, Integer num) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        setBackground(new RippleDrawable(r(i10), new ColorDrawable(i10), null));
    }

    @Override // androidx.appcompat.widget.c0, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f22751q0 || isChecked() == z10) {
            super.setChecked(isChecked());
            return;
        }
        this.f22751q0 = false;
        super.setChecked(z10);
        setTrackColor(z10);
    }

    public final void setOn(boolean z10) {
        if (isChecked() != z10) {
            super.setChecked(z10);
            setTrackColor(z10);
        }
        this.f22751q0 = true;
    }

    public final void setThumbColor(Integer num) {
        Drawable thumbDrawable = super.getThumbDrawable();
        Intrinsics.checkNotNullExpressionValue(thumbDrawable, "getThumbDrawable(...)");
        s(thumbDrawable, num);
        if (num == null || !(super.getBackground() instanceof RippleDrawable)) {
            return;
        }
        ColorStateList r10 = r(num.intValue());
        Drawable background = super.getBackground();
        Intrinsics.e(background, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
        ((RippleDrawable) background).setColor(r10);
    }

    public final void setTrackColor(Integer num) {
        Drawable trackDrawable = super.getTrackDrawable();
        Intrinsics.checkNotNullExpressionValue(trackDrawable, "getTrackDrawable(...)");
        s(trackDrawable, num);
    }

    public final void setTrackColorForFalse(Integer num) {
        if (Intrinsics.b(num, this.f22752r0)) {
            return;
        }
        this.f22752r0 = num;
        if (isChecked()) {
            return;
        }
        setTrackColor(this.f22752r0);
    }

    public final void setTrackColorForTrue(Integer num) {
        if (Intrinsics.b(num, this.f22753s0)) {
            return;
        }
        this.f22753s0 = num;
        if (isChecked()) {
            setTrackColor(this.f22753s0);
        }
    }

    private final void setTrackColor(boolean z10) {
        Integer num = this.f22753s0;
        if (num == null && this.f22752r0 == null) {
            return;
        }
        if (!z10) {
            num = this.f22752r0;
        }
        setTrackColor(num);
    }
}
