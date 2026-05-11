package com.google.android.material.snackbar;

import H7.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes2.dex */
public class Snackbar extends BaseTransientBottomBar {

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f27431y;

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f27432z;

    /* renamed from: w, reason: collision with root package name */
    private final AccessibilityManager f27433w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f27434x;

    public static final class SnackbarLayout extends BaseTransientBottomBar.s {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f27435a;

        a(View.OnClickListener onClickListener) {
            this.f27435a = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f27435a.onClick(view);
            Snackbar.this.s(1);
        }
    }

    static {
        int i10 = H7.b.f3116H;
        f27431y = new int[]{i10};
        f27432z = new int[]{i10, H7.b.f3118J};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        super(context, viewGroup, view, aVar);
        this.f27433w = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static ViewGroup a0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button b0() {
        return c0().getActionView();
    }

    private SnackbarContentLayout c0() {
        return (SnackbarContentLayout) this.f27382c.getChildAt(0);
    }

    private TextView d0() {
        return c0().getMessageView();
    }

    private static boolean e0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f27432z);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar f0(View view, CharSequence charSequence, int i10) {
        return g0(null, view, charSequence, i10);
    }

    private static Snackbar g0(Context context, View view, CharSequence charSequence, int i10) {
        ViewGroup a02 = a0(view);
        if (a02 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = a02.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(e0(context) ? h.f3300w : h.f3280c, a02, false);
        Snackbar snackbar = new Snackbar(context, a02, snackbarContentLayout, snackbarContentLayout);
        snackbar.j0(charSequence);
        snackbar.O(i10);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void S() {
        super.S();
    }

    public Snackbar h0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button b02 = b0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            b02.setVisibility(8);
            b02.setOnClickListener(null);
            this.f27434x = false;
        } else {
            this.f27434x = true;
            b02.setVisibility(0);
            b02.setText(charSequence);
            b02.setOnClickListener(new a(onClickListener));
        }
        return this;
    }

    public Snackbar i0(int i10) {
        b0().setTextColor(i10);
        return this;
    }

    public Snackbar j0(CharSequence charSequence) {
        d0().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void r() {
        super.r();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int v() {
        int recommendedTimeoutMillis;
        int v10 = super.v();
        if (v10 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = this.f27433w.getRecommendedTimeoutMillis(v10, (this.f27434x ? 4 : 0) | 3);
            return recommendedTimeoutMillis;
        }
        if (this.f27434x && this.f27433w.isTouchExplorationEnabled()) {
            return -2;
        }
        return v10;
    }
}
