package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.AbstractC1484a0;
import androidx.emoji2.text.f;
import g.AbstractC3170a;
import g.AbstractC3177h;
import g.AbstractC3179j;
import h.AbstractC3220a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import k.C3525a;

/* loaded from: classes.dex */
public abstract class c0 extends CompoundButton {

    /* renamed from: o0, reason: collision with root package name */
    private static final Property f14074o0 = new a(Float.class, "thumbPos");

    /* renamed from: p0, reason: collision with root package name */
    private static final int[] f14075p0 = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    private int f14076A;

    /* renamed from: B, reason: collision with root package name */
    private int f14077B;

    /* renamed from: C, reason: collision with root package name */
    private int f14078C;

    /* renamed from: D, reason: collision with root package name */
    private int f14079D;

    /* renamed from: E, reason: collision with root package name */
    private int f14080E;

    /* renamed from: F, reason: collision with root package name */
    private int f14081F;

    /* renamed from: G, reason: collision with root package name */
    private int f14082G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f14083H;

    /* renamed from: I, reason: collision with root package name */
    private final TextPaint f14084I;

    /* renamed from: J, reason: collision with root package name */
    private ColorStateList f14085J;

    /* renamed from: K, reason: collision with root package name */
    private Layout f14086K;

    /* renamed from: a, reason: collision with root package name */
    private Drawable f14087a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f14088b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f14089c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14090d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14091e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f14092f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f14093g;

    /* renamed from: h, reason: collision with root package name */
    private PorterDuff.Mode f14094h;

    /* renamed from: h0, reason: collision with root package name */
    private Layout f14095h0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14096i;

    /* renamed from: i0, reason: collision with root package name */
    private TransformationMethod f14097i0;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14098j;

    /* renamed from: j0, reason: collision with root package name */
    ObjectAnimator f14099j0;

    /* renamed from: k, reason: collision with root package name */
    private int f14100k;

    /* renamed from: k0, reason: collision with root package name */
    private final C f14101k0;

    /* renamed from: l, reason: collision with root package name */
    private int f14102l;

    /* renamed from: l0, reason: collision with root package name */
    private C1412n f14103l0;

    /* renamed from: m, reason: collision with root package name */
    private int f14104m;

    /* renamed from: m0, reason: collision with root package name */
    private b f14105m0;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14106n;

    /* renamed from: n0, reason: collision with root package name */
    private final Rect f14107n0;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f14108o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f14109p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f14110q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f14111r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14112s;

    /* renamed from: t, reason: collision with root package name */
    private int f14113t;

    /* renamed from: u, reason: collision with root package name */
    private int f14114u;

    /* renamed from: v, reason: collision with root package name */
    private float f14115v;

    /* renamed from: w, reason: collision with root package name */
    private float f14116w;

    /* renamed from: x, reason: collision with root package name */
    private VelocityTracker f14117x;

    /* renamed from: y, reason: collision with root package name */
    private int f14118y;

    /* renamed from: z, reason: collision with root package name */
    float f14119z;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(c0 c0Var) {
            return Float.valueOf(c0Var.f14119z);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c0 c0Var, Float f10) {
            c0Var.setThumbPosition(f10.floatValue());
        }
    }

    static class b extends f.AbstractC0284f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f14120a;

        b(c0 c0Var) {
            this.f14120a = new WeakReference(c0Var);
        }

        @Override // androidx.emoji2.text.f.AbstractC0284f
        public void a(Throwable th) {
            c0 c0Var = (c0) this.f14120a.get();
            if (c0Var != null) {
                c0Var.j();
            }
        }

        @Override // androidx.emoji2.text.f.AbstractC0284f
        public void b() {
            c0 c0Var = (c0) this.f14120a.get();
            if (c0Var != null) {
                c0Var.j();
            }
        }
    }

    public c0(Context context) {
        this(context, null);
    }

    private void a(boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<c0, Float>) f14074o0, z10 ? 1.0f : 0.0f);
        this.f14099j0 = ofFloat;
        ofFloat.setDuration(250L);
        this.f14099j0.setAutoCancel(true);
        this.f14099j0.start();
    }

    private void b() {
        Drawable drawable = this.f14087a;
        if (drawable != null) {
            if (this.f14090d || this.f14091e) {
                Drawable mutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
                this.f14087a = mutate;
                if (this.f14090d) {
                    androidx.core.graphics.drawable.a.i(mutate, this.f14088b);
                }
                if (this.f14091e) {
                    androidx.core.graphics.drawable.a.j(this.f14087a, this.f14089c);
                }
                if (this.f14087a.isStateful()) {
                    this.f14087a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f14092f;
        if (drawable != null) {
            if (this.f14096i || this.f14098j) {
                Drawable mutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
                this.f14092f = mutate;
                if (this.f14096i) {
                    androidx.core.graphics.drawable.a.i(mutate, this.f14093g);
                }
                if (this.f14098j) {
                    androidx.core.graphics.drawable.a.j(this.f14092f, this.f14094h);
                }
                if (this.f14092f.isStateful()) {
                    this.f14092f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f14099j0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod f10 = getEmojiTextViewHelper().f(this.f14097i0);
        return f10 != null ? f10.getTransformation(charSequence, this) : charSequence;
    }

    private C1412n getEmojiTextViewHelper() {
        if (this.f14103l0 == null) {
            this.f14103l0 = new C1412n(this);
        }
        return this.f14103l0;
    }

    private boolean getTargetCheckedState() {
        return this.f14119z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((s0.b(this) ? 1.0f - this.f14119z : this.f14119z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f14092f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f14107n0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f14087a;
        Rect d10 = drawable2 != null ? O.d(drawable2) : O.f13760c;
        return ((((this.f14076A - this.f14078C) - rect.left) - rect.right) - d10.left) - d10.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f14087a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f14087a.getPadding(this.f14107n0);
        int i10 = this.f14080E;
        int i11 = this.f14114u;
        int i12 = i10 - i11;
        int i13 = (this.f14079D + thumbOffset) - i11;
        int i14 = this.f14078C + i13;
        Rect rect = this.f14107n0;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f14082G + i11));
    }

    private Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f14084I, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f14110q;
            if (charSequence == null) {
                charSequence = getResources().getString(AbstractC3177h.f33223b);
            }
            AbstractC1484a0.K0(this, charSequence);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f14108o;
            if (charSequence == null) {
                charSequence = getResources().getString(AbstractC3177h.f33224c);
            }
            AbstractC1484a0.K0(this, charSequence);
        }
    }

    private void o(int i10, int i11) {
        n(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    private void p() {
        if (this.f14105m0 == null && this.f14103l0.b() && androidx.emoji2.text.f.i()) {
            androidx.emoji2.text.f c10 = androidx.emoji2.text.f.c();
            int e10 = c10.e();
            if (e10 == 3 || e10 == 0) {
                b bVar = new b(this);
                this.f14105m0 = bVar;
                c10.t(bVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        this.f14113t = 0;
        boolean z10 = true;
        boolean z11 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z11) {
            this.f14117x.computeCurrentVelocity(1000);
            float xVelocity = this.f14117x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f14118y) {
                z10 = getTargetCheckedState();
            } else if (!s0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z10 = false;
            }
        } else {
            z10 = isChecked;
        }
        if (z10 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z10);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f14110q = charSequence;
        this.f14111r = g(charSequence);
        this.f14095h0 = null;
        if (this.f14112s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f14108o = charSequence;
        this.f14109p = g(charSequence);
        this.f14086K = null;
        if (this.f14112s) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f14107n0;
        int i12 = this.f14079D;
        int i13 = this.f14080E;
        int i14 = this.f14081F;
        int i15 = this.f14082G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f14087a;
        Rect d10 = drawable != null ? O.d(drawable) : O.f13760c;
        Drawable drawable2 = this.f14092f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (d10 != null) {
                int i17 = d10.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = d10.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = d10.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = d10.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f14092f.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f14092f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f14087a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f14078C + rect.right;
            this.f14087a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.f(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f14087a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.e(drawable, f10, f11);
        }
        Drawable drawable2 = this.f14092f;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.e(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f14087a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f14092f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!s0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f14076A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f14104m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (s0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f14076A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f14104m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.r(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f14112s;
    }

    public boolean getSplitTrack() {
        return this.f14106n;
    }

    public int getSwitchMinWidth() {
        return this.f14102l;
    }

    public int getSwitchPadding() {
        return this.f14104m;
    }

    public CharSequence getTextOff() {
        return this.f14110q;
    }

    public CharSequence getTextOn() {
        return this.f14108o;
    }

    public Drawable getThumbDrawable() {
        return this.f14087a;
    }

    protected final float getThumbPosition() {
        return this.f14119z;
    }

    public int getThumbTextPadding() {
        return this.f14100k;
    }

    public ColorStateList getThumbTintList() {
        return this.f14088b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f14089c;
    }

    public Drawable getTrackDrawable() {
        return this.f14092f;
    }

    public ColorStateList getTrackTintList() {
        return this.f14093g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f14094h;
    }

    void j() {
        setTextOnInternal(this.f14108o);
        setTextOffInternal(this.f14110q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14087a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f14092f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f14099j0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f14099j0.end();
        this.f14099j0 = null;
    }

    public void m(Context context, int i10) {
        h0 t10 = h0.t(context, i10, AbstractC3179j.f33333S2);
        ColorStateList c10 = t10.c(AbstractC3179j.f33349W2);
        if (c10 != null) {
            this.f14085J = c10;
        } else {
            this.f14085J = getTextColors();
        }
        int f10 = t10.f(AbstractC3179j.f33337T2, 0);
        if (f10 != 0) {
            float f11 = f10;
            if (f11 != this.f14084I.getTextSize()) {
                this.f14084I.setTextSize(f11);
                requestLayout();
            }
        }
        o(t10.k(AbstractC3179j.f33341U2, -1), t10.k(AbstractC3179j.f33345V2, -1));
        if (t10.a(AbstractC3179j.f33371b3, false)) {
            this.f14097i0 = new C3525a(getContext());
        } else {
            this.f14097i0 = null;
        }
        setTextOnInternal(this.f14108o);
        setTextOffInternal(this.f14110q);
        t10.x();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.f14084I.setFakeBoldText(false);
            this.f14084I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(defaultFromStyle);
            int i11 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i10;
            this.f14084I.setFakeBoldText((i11 & 1) != 0);
            this.f14084I.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f14075p0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f14107n0;
        Drawable drawable = this.f14092f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f14080E;
        int i11 = this.f14082G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f14087a;
        if (drawable != null) {
            if (!this.f14106n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d10 = O.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d10.left;
                rect.right -= d10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f14086K : this.f14095h0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f14085J;
            if (colorStateList != null) {
                this.f14084I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f14084I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f14108o : this.f14110q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        int i16;
        int i17;
        int i18;
        super.onLayout(z10, i10, i11, i12, i13);
        int i19 = 0;
        if (this.f14087a != null) {
            Rect rect = this.f14107n0;
            Drawable drawable = this.f14092f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d10 = O.d(this.f14087a);
            i14 = Math.max(0, d10.left - rect.left);
            i19 = Math.max(0, d10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (s0.b(this)) {
            i15 = getPaddingLeft() + i14;
            width = ((this.f14076A + i15) - i14) - i19;
        } else {
            width = (getWidth() - getPaddingRight()) - i19;
            i15 = (width - this.f14076A) + i14 + i19;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i16 = this.f14077B;
            i17 = paddingTop - (i16 / 2);
        } else {
            if (gravity == 80) {
                i18 = getHeight() - getPaddingBottom();
                i17 = i18 - this.f14077B;
                this.f14079D = i15;
                this.f14080E = i17;
                this.f14082G = i18;
                this.f14081F = width;
            }
            i17 = getPaddingTop();
            i16 = this.f14077B;
        }
        i18 = i16 + i17;
        this.f14079D = i15;
        this.f14080E = i17;
        this.f14082G = i18;
        this.f14081F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.f14112s) {
            if (this.f14086K == null) {
                this.f14086K = i(this.f14109p);
            }
            if (this.f14095h0 == null) {
                this.f14095h0 = i(this.f14111r);
            }
        }
        Rect rect = this.f14107n0;
        Drawable drawable = this.f14087a;
        int i14 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i12 = (this.f14087a.getIntrinsicWidth() - rect.left) - rect.right;
            i13 = this.f14087a.getIntrinsicHeight();
        } else {
            i12 = 0;
            i13 = 0;
        }
        this.f14078C = Math.max(this.f14112s ? Math.max(this.f14086K.getWidth(), this.f14095h0.getWidth()) + (this.f14100k * 2) : 0, i12);
        Drawable drawable2 = this.f14092f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i14 = this.f14092f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i15 = rect.left;
        int i16 = rect.right;
        Drawable drawable3 = this.f14087a;
        if (drawable3 != null) {
            Rect d10 = O.d(drawable3);
            i15 = Math.max(i15, d10.left);
            i16 = Math.max(i16, d10.right);
        }
        int max = this.f14083H ? Math.max(this.f14102l, (this.f14078C * 2) + i15 + i16) : this.f14102l;
        int max2 = Math.max(i14, i13);
        this.f14076A = max;
        this.f14077B = max2;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f14108o : this.f14110q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f14117x.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.f14113t;
                    if (i10 == 1) {
                        float x10 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        if (Math.abs(x10 - this.f14115v) > this.f14114u || Math.abs(y10 - this.f14116w) > this.f14114u) {
                            this.f14113t = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f14115v = x10;
                            this.f14116w = y10;
                            return true;
                        }
                    } else if (i10 == 2) {
                        float x11 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f10 = x11 - this.f14115v;
                        float f11 = thumbScrollRange != 0 ? f10 / thumbScrollRange : f10 > 0.0f ? 1.0f : -1.0f;
                        if (s0.b(this)) {
                            f11 = -f11;
                        }
                        float f12 = f(this.f14119z + f11, 0.0f, 1.0f);
                        if (f12 != this.f14119z) {
                            this.f14115v = x11;
                            setThumbPosition(f12);
                        }
                        return true;
                    }
                }
            }
            if (this.f14113t == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f14113t = 0;
            this.f14117x.clear();
        } else {
            float x12 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (isEnabled() && h(x12, y11)) {
                this.f14113t = 1;
                this.f14115v = x12;
                this.f14116w = y11;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(isChecked);
        } else {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f14108o);
        setTextOffInternal(this.f14110q);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z10) {
        this.f14083H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f14112s != z10) {
            this.f14112s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f14106n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f14102l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f14104m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f14084I.getTypeface() == null || this.f14084I.getTypeface().equals(typeface)) && (this.f14084I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f14084I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f14087a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f14087a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.f14119z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(AbstractC3220a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f14100k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f14088b = colorStateList;
        this.f14090d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f14089c = mode;
        this.f14091e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f14092f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f14092f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(AbstractC3220a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f14093g = colorStateList;
        this.f14096i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f14094h = mode;
        this.f14098j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14087a || drawable == this.f14092f;
    }

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33062J);
    }

    public c0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14088b = null;
        this.f14089c = null;
        this.f14090d = false;
        this.f14091e = false;
        this.f14093g = null;
        this.f14094h = null;
        this.f14096i = false;
        this.f14098j = false;
        this.f14117x = VelocityTracker.obtain();
        this.f14083H = true;
        this.f14107n0 = new Rect();
        d0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f14084I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        h0 v10 = h0.v(context, attributeSet, AbstractC3179j.f33258D2, i10, 0);
        AbstractC1484a0.o0(this, context, AbstractC3179j.f33258D2, attributeSet, v10.r(), i10, 0);
        Drawable g10 = v10.g(AbstractC3179j.f33273G2);
        this.f14087a = g10;
        if (g10 != null) {
            g10.setCallback(this);
        }
        Drawable g11 = v10.g(AbstractC3179j.f33318P2);
        this.f14092f = g11;
        if (g11 != null) {
            g11.setCallback(this);
        }
        setTextOnInternal(v10.p(AbstractC3179j.f33263E2));
        setTextOffInternal(v10.p(AbstractC3179j.f33268F2));
        this.f14112s = v10.a(AbstractC3179j.f33278H2, true);
        this.f14100k = v10.f(AbstractC3179j.f33303M2, 0);
        this.f14102l = v10.f(AbstractC3179j.f33288J2, 0);
        this.f14104m = v10.f(AbstractC3179j.f33293K2, 0);
        this.f14106n = v10.a(AbstractC3179j.f33283I2, false);
        ColorStateList c10 = v10.c(AbstractC3179j.f33308N2);
        if (c10 != null) {
            this.f14088b = c10;
            this.f14090d = true;
        }
        PorterDuff.Mode e10 = O.e(v10.k(AbstractC3179j.f33313O2, -1), null);
        if (this.f14089c != e10) {
            this.f14089c = e10;
            this.f14091e = true;
        }
        if (this.f14090d || this.f14091e) {
            b();
        }
        ColorStateList c11 = v10.c(AbstractC3179j.f33323Q2);
        if (c11 != null) {
            this.f14093g = c11;
            this.f14096i = true;
        }
        PorterDuff.Mode e11 = O.e(v10.k(AbstractC3179j.f33328R2, -1), null);
        if (this.f14094h != e11) {
            this.f14094h = e11;
            this.f14098j = true;
        }
        if (this.f14096i || this.f14098j) {
            c();
        }
        int n10 = v10.n(AbstractC3179j.f33298L2, 0);
        if (n10 != 0) {
            m(context, n10);
        }
        C c12 = new C(this);
        this.f14101k0 = c12;
        c12.m(attributeSet, i10);
        v10.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f14114u = viewConfiguration.getScaledTouchSlop();
        this.f14118y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
