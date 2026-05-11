package com.google.android.material.floatingactionbutton;

import H7.k;
import H7.l;
import I7.g;
import Y7.n;
import a8.AbstractC1367a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.C1409k;
import androidx.appcompat.widget.C1415q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.b;
import com.google.android.material.internal.m;
import com.google.android.material.internal.o;
import com.google.android.material.internal.p;
import java.util.List;
import y0.f;

/* loaded from: classes2.dex */
public class FloatingActionButton extends p implements Q7.a, n, CoordinatorLayout.b {

    /* renamed from: r, reason: collision with root package name */
    private static final int f27026r = k.f3333i;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f27027b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f27028c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f27029d;

    /* renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f27030e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f27031f;

    /* renamed from: g, reason: collision with root package name */
    private int f27032g;

    /* renamed from: h, reason: collision with root package name */
    private int f27033h;

    /* renamed from: i, reason: collision with root package name */
    private int f27034i;

    /* renamed from: j, reason: collision with root package name */
    private int f27035j;

    /* renamed from: k, reason: collision with root package name */
    private int f27036k;

    /* renamed from: l, reason: collision with root package name */
    boolean f27037l;

    /* renamed from: m, reason: collision with root package name */
    final Rect f27038m;

    /* renamed from: n, reason: collision with root package name */
    private final Rect f27039n;

    /* renamed from: o, reason: collision with root package name */
    private final C1415q f27040o;

    /* renamed from: p, reason: collision with root package name */
    private final Q7.b f27041p;

    /* renamed from: q, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.b f27042q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.l(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void g(CoordinatorLayout.f fVar) {
            super.g(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
    }

    private class b implements X7.b {
        b() {
        }

        @Override // X7.b
        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f27038m.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f27035j, i11 + FloatingActionButton.this.f27035j, i12 + FloatingActionButton.this.f27035j, i13 + FloatingActionButton.this.f27035j);
        }

        @Override // X7.b
        public void c(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // X7.b
        public boolean d() {
            return FloatingActionButton.this.f27037l;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3149v);
    }

    private com.google.android.material.floatingactionbutton.b e() {
        return new c(this, new b());
    }

    private int g(int i10) {
        int i11 = this.f27034i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        return i10 != -1 ? i10 != 1 ? resources.getDimensionPixelSize(H7.d.f3196d) : resources.getDimensionPixelSize(H7.d.f3194c) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    private com.google.android.material.floatingactionbutton.b getImpl() {
        if (this.f27042q == null) {
            this.f27042q = e();
        }
        return this.f27042q;
    }

    private void i(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f27038m;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f27029d;
        if (colorStateList == null) {
            androidx.core.graphics.drawable.a.a(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f27030e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C1409k.e(colorForState, mode));
    }

    private static int k(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i10, size);
        }
        if (mode == 0) {
            return i10;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private b.k m(a aVar) {
        return null;
    }

    @Override // Q7.a
    public boolean a() {
        return this.f27041p.c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().A(getDrawableState());
    }

    public boolean f(Rect rect) {
        if (!AbstractC1484a0.U(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        i(rect);
        return true;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f27027b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f27028c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().j();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().p();
    }

    public Drawable getContentBackground() {
        return getImpl().i();
    }

    public int getCustomSize() {
        return this.f27034i;
    }

    public int getExpandedComponentIdHint() {
        return this.f27041p.b();
    }

    public g getHideMotionSpec() {
        return getImpl().l();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f27031f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f27031f;
    }

    public Y7.k getShapeAppearanceModel() {
        return (Y7.k) f.g(getImpl().q());
    }

    public g getShowMotionSpec() {
        return getImpl().r();
    }

    public int getSize() {
        return this.f27033h;
    }

    int getSizeDimension() {
        return g(this.f27033h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f27029d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f27030e;
    }

    public boolean getUseCompatPadding() {
        return this.f27037l;
    }

    void h(a aVar, boolean z10) {
        getImpl().s(m(aVar), z10);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().w();
    }

    void l(a aVar, boolean z10) {
        getImpl().Y(m(aVar), z10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().x();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().z();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f27035j = (sizeDimension - this.f27036k) / 2;
        getImpl().b0();
        int min = Math.min(k(sizeDimension, i10), k(sizeDimension, i11));
        Rect rect = this.f27038m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Z7.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Z7.a aVar = (Z7.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        this.f27041p.d((Bundle) f.g(aVar.f12465c.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        Z7.a aVar = new Z7.a(onSaveInstanceState);
        aVar.f12465c.put("expandableWidgetHelper", this.f27041p.e());
        return aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && f(this.f27039n) && !this.f27039n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f27027b != colorStateList) {
            this.f27027b = colorStateList;
            getImpl().H(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f27028c != mode) {
            this.f27028c = mode;
            getImpl().I(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().J(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().M(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().Q(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f27034i) {
            this.f27034i = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().c0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().k()) {
            getImpl().K(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f27041p.f(i10);
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().L(gVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.c(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().a0();
            if (this.f27029d != null) {
                j();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f27040o.i(i10);
        j();
    }

    public void setMaxImageSize(int i10) {
        this.f27036k = i10;
        getImpl().O(i10);
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().E();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().E();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().S(z10);
    }

    @Override // Y7.n
    public void setShapeAppearanceModel(Y7.k kVar) {
        getImpl().T(kVar);
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().U(gVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.c(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f27034i = 0;
        if (i10 != this.f27033h) {
            this.f27033h = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f27029d != colorStateList) {
            this.f27029d = colorStateList;
            j();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f27030e != mode) {
            this.f27030e = mode;
            j();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().F();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().F();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().F();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f27037l != z10) {
            this.f27037l = z10;
            getImpl().y();
        }
    }

    @Override // com.google.android.material.internal.p, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c {

        /* renamed from: a, reason: collision with root package name */
        private Rect f27043a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f27044b;

        public BaseBehavior() {
            this.f27044b = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f27038m;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i10 = 0;
            int i11 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i10 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i10 = -rect.top;
            }
            if (i10 != 0) {
                AbstractC1484a0.b0(floatingActionButton, i10);
            }
            if (i11 != 0) {
                AbstractC1484a0.a0(floatingActionButton, i11);
            }
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            return this.f27044b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f27043a == null) {
                this.f27043a = new Rect();
            }
            Rect rect = this.f27043a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        private boolean L(View view, FloatingActionButton floatingActionButton) {
            if (!J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f27038m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!F(view)) {
                return false;
            }
            L(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List s10 = coordinatorLayout.s(floatingActionButton);
            int size = s10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) s10.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.K(floatingActionButton, i10);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f15677h == 0) {
                fVar.f15677h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f3713o2);
            this.f27044b = obtainStyledAttributes.getBoolean(l.f3722p2, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC1367a.c(context, attributeSet, i10, r6), attributeSet, i10);
        int i11 = f27026r;
        this.f27038m = new Rect();
        this.f27039n = new Rect();
        Context context2 = getContext();
        TypedArray h10 = m.h(context2, attributeSet, l.f3569Y1, i10, i11, new int[0]);
        this.f27027b = V7.c.a(context2, h10, l.f3587a2);
        this.f27028c = o.f(h10.getInt(l.f3596b2, -1), null);
        this.f27031f = V7.c.a(context2, h10, l.f3686l2);
        this.f27033h = h10.getInt(l.f3641g2, -1);
        this.f27034i = h10.getDimensionPixelSize(l.f3632f2, 0);
        this.f27032g = h10.getDimensionPixelSize(l.f3605c2, 0);
        float dimension = h10.getDimension(l.f3614d2, 0.0f);
        float dimension2 = h10.getDimension(l.f3659i2, 0.0f);
        float dimension3 = h10.getDimension(l.f3677k2, 0.0f);
        this.f27037l = h10.getBoolean(l.f3704n2, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(H7.d.f3186W);
        setMaxImageSize(h10.getDimensionPixelSize(l.f3668j2, 0));
        g b10 = g.b(context2, h10, l.f3695m2);
        g b11 = g.b(context2, h10, l.f3650h2);
        Y7.k m10 = Y7.k.g(context2, attributeSet, i10, i11, Y7.k.f12082m).m();
        boolean z10 = h10.getBoolean(l.f3623e2, false);
        setEnabled(h10.getBoolean(l.f3578Z1, true));
        h10.recycle();
        C1415q c1415q = new C1415q(this);
        this.f27040o = c1415q;
        c1415q.g(attributeSet, i10);
        this.f27041p = new Q7.b(this);
        getImpl().T(m10);
        getImpl().t(this.f27027b, this.f27028c, this.f27031f, this.f27032g);
        getImpl().P(dimensionPixelSize);
        getImpl().J(dimension);
        getImpl().M(dimension2);
        getImpl().Q(dimension3);
        getImpl().U(b10);
        getImpl().L(b11);
        getImpl().K(z10);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f27031f != colorStateList) {
            this.f27031f = colorStateList;
            getImpl().R(this.f27031f);
        }
    }
}
