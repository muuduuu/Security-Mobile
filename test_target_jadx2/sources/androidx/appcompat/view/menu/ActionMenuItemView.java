package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.S;
import androidx.appcompat.widget.m0;
import g.AbstractC3179j;
import l.InterfaceC3588e;

/* loaded from: classes.dex */
public class ActionMenuItemView extends D implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: h, reason: collision with root package name */
    g f13387h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f13388i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f13389j;

    /* renamed from: k, reason: collision with root package name */
    e.b f13390k;

    /* renamed from: l, reason: collision with root package name */
    private S f13391l;

    /* renamed from: m, reason: collision with root package name */
    b f13392m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13393n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13394o;

    /* renamed from: p, reason: collision with root package name */
    private int f13395p;

    /* renamed from: q, reason: collision with root package name */
    private int f13396q;

    /* renamed from: r, reason: collision with root package name */
    private int f13397r;

    private class a extends S {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.S
        public InterfaceC3588e b() {
            b bVar = ActionMenuItemView.this.f13392m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.S
        protected boolean c() {
            InterfaceC3588e b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f13390k;
            return bVar != null && bVar.a(actionMenuItemView.f13387h) && (b10 = b()) != null && b10.a();
        }
    }

    public static abstract class b {
        public abstract InterfaceC3588e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void u() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f13388i);
        if (this.f13389j != null && (!this.f13387h.B() || (!this.f13393n && !this.f13394o))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f13388i : null);
        CharSequence contentDescription = this.f13387h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f13387h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f13387h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            m0.a(this, z12 ? null : this.f13387h.getTitle());
        } else {
            m0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return s() && this.f13387h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(g gVar, int i10) {
        this.f13387h = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f13391l == null) {
            this.f13391l = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f13387h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f13390k;
        if (bVar != null) {
            bVar.a(this.f13387h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f13393n = t();
        u();
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean s10 = s();
        if (s10 && (i12 = this.f13396q) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f13395p) : this.f13395p;
        if (mode != 1073741824 && this.f13395p > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (s10 || this.f13389j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f13389j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        S s10;
        if (this.f13387h.hasSubMenu() && (s10 = this.f13391l) != null && s10.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f13394o != z10) {
            this.f13394o = z10;
            g gVar = this.f13387h;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f13389j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f13397r;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        u();
    }

    public void setItemInvoker(e.b bVar) {
        this.f13390k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f13396q = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f13392m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f13388i = charSequence;
        u();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f13393n = t();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3179j.f33467v, i10, 0);
        this.f13395p = obtainStyledAttributes.getDimensionPixelSize(AbstractC3179j.f33472w, 0);
        obtainStyledAttributes.recycle();
        this.f13397r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f13396q = -1;
        setSaveEnabled(false);
    }
}
