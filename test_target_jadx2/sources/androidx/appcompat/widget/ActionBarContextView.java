package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1504k0;
import g.AbstractC3170a;
import g.AbstractC3175f;
import g.AbstractC3176g;
import g.AbstractC3179j;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC1399a {

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f13624i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f13625j;

    /* renamed from: k, reason: collision with root package name */
    private View f13626k;

    /* renamed from: l, reason: collision with root package name */
    private View f13627l;

    /* renamed from: m, reason: collision with root package name */
    private View f13628m;

    /* renamed from: n, reason: collision with root package name */
    private LinearLayout f13629n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f13630o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f13631p;

    /* renamed from: q, reason: collision with root package name */
    private int f13632q;

    /* renamed from: r, reason: collision with root package name */
    private int f13633r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13634s;

    /* renamed from: t, reason: collision with root package name */
    private int f13635t;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f13636a;

        a(androidx.appcompat.view.b bVar) {
            this.f13636a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f13636a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f13629n == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC3176g.f33202a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f13629n = linearLayout;
            this.f13630o = (TextView) linearLayout.findViewById(AbstractC3175f.f33181f);
            this.f13631p = (TextView) this.f13629n.findViewById(AbstractC3175f.f33180e);
            if (this.f13632q != 0) {
                this.f13630o.setTextAppearance(getContext(), this.f13632q);
            }
            if (this.f13633r != 0) {
                this.f13631p.setTextAppearance(getContext(), this.f13633r);
            }
        }
        this.f13630o.setText(this.f13624i);
        this.f13631p.setText(this.f13625j);
        boolean isEmpty = TextUtils.isEmpty(this.f13624i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f13625j);
        this.f13631p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f13629n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f13629n.getParent() == null) {
            addView(this.f13629n);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1399a
    public /* bridge */ /* synthetic */ C1504k0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f13626k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC1399a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC1399a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f13625j;
    }

    public CharSequence getTitle() {
        return this.f13624i;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f13626k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f13635t, (ViewGroup) this, false);
            this.f13626k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f13626k);
        }
        View findViewById = this.f13626k.findViewById(AbstractC3175f.f33185j);
        this.f13627l = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        C1401c c1401c = this.f14017d;
        if (c1401c != null) {
            c1401c.y();
        }
        C1401c c1401c2 = new C1401c(getContext());
        this.f14017d = c1401c2;
        c1401c2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f14017d, this.f14015b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f14017d.o(this);
        this.f14016c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f14016c, layoutParams);
    }

    public boolean j() {
        return this.f13634s;
    }

    public void k() {
        removeAllViews();
        this.f13628m = null;
        this.f14016c = null;
        this.f14017d = null;
        View view = this.f13627l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        C1401c c1401c = this.f14017d;
        if (c1401c != null) {
            return c1401c.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1401c c1401c = this.f14017d;
        if (c1401c != null) {
            c1401c.B();
            this.f14017d.C();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1399a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = s0.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f13626k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13626k.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d10 = AbstractC1399a.d(paddingRight, i14, b10);
            paddingRight = AbstractC1399a.d(d10 + e(this.f13626k, d10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f13629n;
        if (linearLayout != null && this.f13628m == null && linearLayout.getVisibility() != 8) {
            i16 += e(this.f13629n, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.f13628m;
        if (view2 != null) {
            e(view2, i17, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f14016c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f14018e;
        if (i12 <= 0) {
            i12 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i13 = i12 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        View view = this.f13626k;
        if (view != null) {
            int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13626k.getLayoutParams();
            paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f14016c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f14016c, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f13629n;
        if (linearLayout != null && this.f13628m == null) {
            if (this.f13634s) {
                this.f13629n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f13629n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f13629n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f13628m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = i14 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i14 >= 0) {
                paddingLeft = Math.min(i14, paddingLeft);
            }
            int i16 = layoutParams.height;
            int i17 = i16 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i16 >= 0) {
                i13 = Math.min(i16, i13);
            }
            this.f13628m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i17));
        }
        if (this.f14018e > 0) {
            setMeasuredDimension(size, i12);
            return;
        }
        int childCount = getChildCount();
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i18) {
                i18 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override // androidx.appcompat.widget.AbstractC1399a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC1399a
    public void setContentHeight(int i10) {
        this.f14018e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f13628m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f13628m = view;
        if (view != null && (linearLayout = this.f13629n) != null) {
            removeView(linearLayout);
            this.f13629n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f13625j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f13624i = charSequence;
        i();
        AbstractC1484a0.t0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f13634s) {
            requestLayout();
        }
        this.f13634s = z10;
    }

    @Override // androidx.appcompat.widget.AbstractC1399a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33072g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        h0 v10 = h0.v(context, attributeSet, AbstractC3179j.f33482y, i10, 0);
        setBackground(v10.g(AbstractC3179j.f33487z));
        this.f13632q = v10.n(AbstractC3179j.f33255D, 0);
        this.f13633r = v10.n(AbstractC3179j.f33250C, 0);
        this.f14018e = v10.m(AbstractC3179j.f33245B, 0);
        this.f13635t = v10.n(AbstractC3179j.f33240A, AbstractC3176g.f33205d);
        v10.x();
    }
}
