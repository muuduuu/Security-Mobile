package com.google.android.material.snackbar;

import H7.d;
import H7.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1484a0;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: a, reason: collision with root package name */
    private TextView f27437a;

    /* renamed from: b, reason: collision with root package name */
    private Button f27438b;

    /* renamed from: c, reason: collision with root package name */
    private int f27439c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void d(View view, int i10, int i11) {
        if (AbstractC1484a0.W(view)) {
            AbstractC1484a0.G0(view, AbstractC1484a0.F(view), i10, AbstractC1484a0.E(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f27437a.getPaddingTop() == i11 && this.f27437a.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f27437a, i11, i12);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i10, int i11) {
        this.f27437a.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f27437a.animate().alpha(1.0f).setDuration(j10).setStartDelay(j11).start();
        if (this.f27438b.getVisibility() == 0) {
            this.f27438b.setAlpha(0.0f);
            this.f27438b.animate().alpha(1.0f).setDuration(j10).setStartDelay(j11).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i10, int i11) {
        this.f27437a.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f27437a.animate().alpha(0.0f).setDuration(j10).setStartDelay(j11).start();
        if (this.f27438b.getVisibility() == 0) {
            this.f27438b.setAlpha(1.0f);
            this.f27438b.animate().alpha(0.0f).setDuration(j10).setStartDelay(j11).start();
        }
    }

    void c(float f10) {
        if (f10 != 1.0f) {
            this.f27438b.setTextColor(M7.a.h(M7.a.d(this, H7.b.f3143p), this.f27438b.getCurrentTextColor(), f10));
        }
    }

    public Button getActionView() {
        return this.f27438b;
    }

    public TextView getMessageView() {
        return this.f27437a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f27437a = (TextView) findViewById(f.f3240K);
        this.f27438b = (Button) findViewById(f.f3239J);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(d.f3202g);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(d.f3200f);
        boolean z10 = this.f27437a.getLayout().getLineCount() > 1;
        if (!z10 || this.f27439c <= 0 || this.f27438b.getMeasuredWidth() <= this.f27439c) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f27439c = i10;
    }
}
