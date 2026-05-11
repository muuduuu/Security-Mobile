package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import i0.AbstractC3307a;
import i0.AbstractC3308b;
import i0.AbstractC3309c;
import i0.AbstractC3310d;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f14903h = {R.attr.colorBackground};

    /* renamed from: i, reason: collision with root package name */
    private static final c f14904i;

    /* renamed from: a, reason: collision with root package name */
    private boolean f14905a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14906b;

    /* renamed from: c, reason: collision with root package name */
    int f14907c;

    /* renamed from: d, reason: collision with root package name */
    int f14908d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f14909e;

    /* renamed from: f, reason: collision with root package name */
    final Rect f14910f;

    /* renamed from: g, reason: collision with root package name */
    private final b f14911g;

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f14912a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.f14910f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f14909e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // androidx.cardview.widget.b
        public void b(Drawable drawable) {
            this.f14912a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public boolean c() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public boolean d() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable e() {
            return this.f14912a;
        }

        @Override // androidx.cardview.widget.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f14904i = aVar;
        aVar.i();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3307a.f34108a);
    }

    public ColorStateList getCardBackgroundColor() {
        return f14904i.h(this.f14911g);
    }

    public float getCardElevation() {
        return f14904i.c(this.f14911g);
    }

    public int getContentPaddingBottom() {
        return this.f14909e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f14909e.left;
    }

    public int getContentPaddingRight() {
        return this.f14909e.right;
    }

    public int getContentPaddingTop() {
        return this.f14909e.top;
    }

    public float getMaxCardElevation() {
        return f14904i.g(this.f14911g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f14906b;
    }

    public float getRadius() {
        return f14904i.d(this.f14911g);
    }

    public boolean getUseCompatPadding() {
        return this.f14905a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (f14904i instanceof androidx.cardview.widget.a) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.k(this.f14911g)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.j(this.f14911g)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f14904i.m(this.f14911g, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f14904i.f(this.f14911g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f14904i.n(this.f14911g, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f14908d = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f14907c = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f14906b) {
            this.f14906b = z10;
            f14904i.l(this.f14911g);
        }
    }

    public void setRadius(float f10) {
        f14904i.b(this.f14911g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f14905a != z10) {
            this.f14905a = z10;
            f14904i.e(this.f14911g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f14909e = rect;
        this.f14910f = new Rect();
        a aVar = new a();
        this.f14911g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3310d.f34112a, i10, AbstractC3309c.f34111a);
        if (obtainStyledAttributes.hasValue(AbstractC3310d.f34115d)) {
            valueOf = obtainStyledAttributes.getColorStateList(AbstractC3310d.f34115d);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f14903h);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(AbstractC3308b.f34110b) : getResources().getColor(AbstractC3308b.f34109a));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(AbstractC3310d.f34116e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(AbstractC3310d.f34117f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(AbstractC3310d.f34118g, 0.0f);
        this.f14905a = obtainStyledAttributes.getBoolean(AbstractC3310d.f34120i, false);
        this.f14906b = obtainStyledAttributes.getBoolean(AbstractC3310d.f34119h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC3310d.f34121j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(AbstractC3310d.f34123l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(AbstractC3310d.f34125n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(AbstractC3310d.f34124m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(AbstractC3310d.f34122k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f14907c = obtainStyledAttributes.getDimensionPixelSize(AbstractC3310d.f34113b, 0);
        this.f14908d = obtainStyledAttributes.getDimensionPixelSize(AbstractC3310d.f34114c, 0);
        obtainStyledAttributes.recycle();
        f14904i.a(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f14904i.m(this.f14911g, colorStateList);
    }
}
