package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1504k0;
import androidx.core.view.InterfaceC1506l0;
import g.AbstractC3170a;
import g.AbstractC3179j;

/* renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1399a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected final C0246a f14014a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f14015b;

    /* renamed from: c, reason: collision with root package name */
    protected ActionMenuView f14016c;

    /* renamed from: d, reason: collision with root package name */
    protected C1401c f14017d;

    /* renamed from: e, reason: collision with root package name */
    protected int f14018e;

    /* renamed from: f, reason: collision with root package name */
    protected C1504k0 f14019f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14020g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14021h;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0246a implements InterfaceC1506l0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f14022a = false;

        /* renamed from: b, reason: collision with root package name */
        int f14023b;

        protected C0246a() {
        }

        @Override // androidx.core.view.InterfaceC1506l0
        public void a(View view) {
            this.f14022a = true;
        }

        @Override // androidx.core.view.InterfaceC1506l0
        public void b(View view) {
            if (this.f14022a) {
                return;
            }
            AbstractC1399a abstractC1399a = AbstractC1399a.this;
            abstractC1399a.f14019f = null;
            AbstractC1399a.super.setVisibility(this.f14023b);
        }

        @Override // androidx.core.view.InterfaceC1506l0
        public void c(View view) {
            AbstractC1399a.super.setVisibility(0);
            this.f14022a = false;
        }

        public C0246a d(C1504k0 c1504k0, int i10) {
            AbstractC1399a.this.f14019f = c1504k0;
            this.f14023b = i10;
            return this;
        }
    }

    AbstractC1399a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14014a = new C0246a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC3170a.f33066a, typedValue, true) || typedValue.resourceId == 0) {
            this.f14015b = context;
        } else {
            this.f14015b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public C1504k0 f(int i10, long j10) {
        C1504k0 c1504k0 = this.f14019f;
        if (c1504k0 != null) {
            c1504k0.c();
        }
        if (i10 != 0) {
            C1504k0 b10 = AbstractC1484a0.e(this).b(0.0f);
            b10.f(j10);
            b10.h(this.f14014a.d(b10, i10));
            return b10;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C1504k0 b11 = AbstractC1484a0.e(this).b(1.0f);
        b11.f(j10);
        b11.h(this.f14014a.d(b11, i10));
        return b11;
    }

    public int getAnimatedVisibility() {
        return this.f14019f != null ? this.f14014a.f14023b : getVisibility();
    }

    public int getContentHeight() {
        return this.f14018e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC3179j.f33362a, AbstractC3170a.f33068c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(AbstractC3179j.f33407j, 0));
        obtainStyledAttributes.recycle();
        C1401c c1401c = this.f14017d;
        if (c1401c != null) {
            c1401c.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f14021h = false;
        }
        if (!this.f14021h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f14021h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f14021h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f14020g = false;
        }
        if (!this.f14020g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f14020g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f14020g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C1504k0 c1504k0 = this.f14019f;
            if (c1504k0 != null) {
                c1504k0.c();
            }
            super.setVisibility(i10);
        }
    }
}
