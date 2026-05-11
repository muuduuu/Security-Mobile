package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import g.AbstractC3175f;
import g.AbstractC3179j;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f13614a;

    /* renamed from: b, reason: collision with root package name */
    private View f13615b;

    /* renamed from: c, reason: collision with root package name */
    private View f13616c;

    /* renamed from: d, reason: collision with root package name */
    private View f13617d;

    /* renamed from: e, reason: collision with root package name */
    Drawable f13618e;

    /* renamed from: f, reason: collision with root package name */
    Drawable f13619f;

    /* renamed from: g, reason: collision with root package name */
    Drawable f13620g;

    /* renamed from: h, reason: collision with root package name */
    boolean f13621h;

    /* renamed from: i, reason: collision with root package name */
    boolean f13622i;

    /* renamed from: j, reason: collision with root package name */
    private int f13623j;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1400b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3179j.f33362a);
        this.f13618e = obtainStyledAttributes.getDrawable(AbstractC3179j.f33367b);
        this.f13619f = obtainStyledAttributes.getDrawable(AbstractC3179j.f33377d);
        this.f13623j = obtainStyledAttributes.getDimensionPixelSize(AbstractC3179j.f33407j, -1);
        boolean z10 = true;
        if (getId() == AbstractC3175f.f33167I) {
            this.f13621h = true;
            this.f13620g = obtainStyledAttributes.getDrawable(AbstractC3179j.f33372c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f13621h ? this.f13618e != null || this.f13619f != null : this.f13620g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13618e;
        if (drawable != null && drawable.isStateful()) {
            this.f13618e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f13619f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f13619f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f13620g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f13620g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f13615b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13618e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f13619f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f13620g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f13616c = findViewById(AbstractC3175f.f33176a);
        this.f13617d = findViewById(AbstractC3175f.f33182g);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f13614a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f13615b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f13621h) {
            Drawable drawable2 = this.f13620g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z11 = z12;
        } else {
            if (this.f13618e != null) {
                if (this.f13616c.getVisibility() == 0) {
                    this.f13618e.setBounds(this.f13616c.getLeft(), this.f13616c.getTop(), this.f13616c.getRight(), this.f13616c.getBottom());
                } else {
                    View view2 = this.f13617d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f13618e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f13618e.setBounds(this.f13617d.getLeft(), this.f13617d.getTop(), this.f13617d.getRight(), this.f13617d.getBottom());
                    }
                }
                z12 = true;
            }
            this.f13622i = z13;
            if (z13 && (drawable = this.f13619f) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z11 = z12;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f13616c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f13623j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f13616c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f13615b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f13616c) ? a(this.f13616c) : !b(this.f13617d) ? a(this.f13617d) : 0) + a(this.f13615b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f13618e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f13618e);
        }
        this.f13618e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f13616c;
            if (view != null) {
                this.f13618e.setBounds(view.getLeft(), this.f13616c.getTop(), this.f13616c.getRight(), this.f13616c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f13621h ? !(this.f13618e != null || this.f13619f != null) : this.f13620g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f13620g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f13620g);
        }
        this.f13620g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f13621h && (drawable2 = this.f13620g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f13621h ? !(this.f13618e != null || this.f13619f != null) : this.f13620g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f13619f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f13619f);
        }
        this.f13619f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f13622i && (drawable2 = this.f13619f) != null) {
                drawable2.setBounds(this.f13615b.getLeft(), this.f13615b.getTop(), this.f13615b.getRight(), this.f13615b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f13621h ? !(this.f13618e != null || this.f13619f != null) : this.f13620g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(a0 a0Var) {
        View view = this.f13615b;
        if (view != null) {
            removeView(view);
        }
        this.f13615b = a0Var;
    }

    public void setTransitioning(boolean z10) {
        this.f13614a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f13618e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f13619f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f13620g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f13618e && !this.f13621h) || (drawable == this.f13619f && this.f13622i) || ((drawable == this.f13620g && this.f13621h) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
