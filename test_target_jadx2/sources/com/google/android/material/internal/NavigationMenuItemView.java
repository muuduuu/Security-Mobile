package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.T;
import androidx.appcompat.widget.m0;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1483a;
import g.AbstractC3170a;
import z0.C5228A;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends f implements k.a {

    /* renamed from: F, reason: collision with root package name */
    private static final int[] f27155F = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f27156A;

    /* renamed from: B, reason: collision with root package name */
    private ColorStateList f27157B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f27158C;

    /* renamed from: D, reason: collision with root package name */
    private Drawable f27159D;

    /* renamed from: E, reason: collision with root package name */
    private final C1483a f27160E;

    /* renamed from: v, reason: collision with root package name */
    private int f27161v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f27162w;

    /* renamed from: x, reason: collision with root package name */
    boolean f27163x;

    /* renamed from: y, reason: collision with root package name */
    private final CheckedTextView f27164y;

    /* renamed from: z, reason: collision with root package name */
    private FrameLayout f27165z;

    class a extends C1483a {
        a() {
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            super.g(view, c5228a);
            c5228a.o0(NavigationMenuItemView.this.f27163x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.f27164y.setVisibility(8);
            FrameLayout frameLayout = this.f27165z;
            if (frameLayout != null) {
                T.a aVar = (T.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f27165z.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f27164y.setVisibility(0);
        FrameLayout frameLayout2 = this.f27165z;
        if (frameLayout2 != null) {
            T.a aVar2 = (T.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f27165z.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC3170a.f33085t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f27155F, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.f27156A.getTitle() == null && this.f27156A.getIcon() == null && this.f27156A.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f27165z == null) {
                this.f27165z = (FrameLayout) ((ViewStub) findViewById(H7.f.f3254f)).inflate();
            }
            this.f27165z.removeAllViews();
            this.f27165z.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f27156A = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            AbstractC1484a0.u0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        m0.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f27156A;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.f27156A;
        if (gVar != null && gVar.isCheckable() && this.f27156A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f27155F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f27163x != z10) {
            this.f27163x = z10;
            this.f27160E.l(this.f27164y, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f27164y.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f27158C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
                androidx.core.graphics.drawable.a.i(drawable, this.f27157B);
            }
            int i10 = this.f27161v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f27162w) {
            if (this.f27159D == null) {
                Drawable f10 = androidx.core.content.res.f.f(getResources(), H7.e.f3229g, getContext().getTheme());
                this.f27159D = f10;
                if (f10 != null) {
                    int i11 = this.f27161v;
                    f10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f27159D;
        }
        androidx.core.widget.k.j(this.f27164y, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f27164y.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f27161v = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f27157B = colorStateList;
        this.f27158C = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.f27156A;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f27164y.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f27162w = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.k.p(this.f27164y, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f27164y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f27164y.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.f27160E = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(H7.h.f3283f, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(H7.d.f3198e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(H7.f.f3255g);
        this.f27164y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC1484a0.q0(checkedTextView, aVar);
    }
}
