package com.google.android.material.chip;

import H7.l;
import V7.c;
import W7.b;
import Y7.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.d;
import com.google.android.material.internal.k;
import com.google.android.material.internal.m;
import com.google.android.material.internal.o;
import h.AbstractC3220a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class a extends g implements Drawable.Callback, k.b {

    /* renamed from: c1, reason: collision with root package name */
    private static final int[] f26829c1 = {R.attr.state_enabled};

    /* renamed from: d1, reason: collision with root package name */
    private static final ShapeDrawable f26830d1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f26831A;

    /* renamed from: A0, reason: collision with root package name */
    private final Paint f26832A0;

    /* renamed from: B, reason: collision with root package name */
    private float f26833B;

    /* renamed from: B0, reason: collision with root package name */
    private final Paint f26834B0;

    /* renamed from: C, reason: collision with root package name */
    private float f26835C;

    /* renamed from: C0, reason: collision with root package name */
    private final Paint.FontMetrics f26836C0;

    /* renamed from: D, reason: collision with root package name */
    private ColorStateList f26837D;

    /* renamed from: D0, reason: collision with root package name */
    private final RectF f26838D0;

    /* renamed from: E, reason: collision with root package name */
    private float f26839E;

    /* renamed from: E0, reason: collision with root package name */
    private final PointF f26840E0;

    /* renamed from: F, reason: collision with root package name */
    private ColorStateList f26841F;

    /* renamed from: F0, reason: collision with root package name */
    private final Path f26842F0;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f26843G;

    /* renamed from: G0, reason: collision with root package name */
    private final k f26844G0;

    /* renamed from: H, reason: collision with root package name */
    private boolean f26845H;

    /* renamed from: H0, reason: collision with root package name */
    private int f26846H0;

    /* renamed from: I, reason: collision with root package name */
    private Drawable f26847I;

    /* renamed from: I0, reason: collision with root package name */
    private int f26848I0;

    /* renamed from: J, reason: collision with root package name */
    private ColorStateList f26849J;

    /* renamed from: J0, reason: collision with root package name */
    private int f26850J0;

    /* renamed from: K, reason: collision with root package name */
    private float f26851K;

    /* renamed from: K0, reason: collision with root package name */
    private int f26852K0;

    /* renamed from: L0, reason: collision with root package name */
    private int f26853L0;

    /* renamed from: M0, reason: collision with root package name */
    private int f26854M0;

    /* renamed from: N0, reason: collision with root package name */
    private boolean f26855N0;

    /* renamed from: O0, reason: collision with root package name */
    private int f26856O0;

    /* renamed from: P0, reason: collision with root package name */
    private int f26857P0;

    /* renamed from: Q0, reason: collision with root package name */
    private ColorFilter f26858Q0;

    /* renamed from: R0, reason: collision with root package name */
    private PorterDuffColorFilter f26859R0;

    /* renamed from: S0, reason: collision with root package name */
    private ColorStateList f26860S0;

    /* renamed from: T0, reason: collision with root package name */
    private PorterDuff.Mode f26861T0;

    /* renamed from: U0, reason: collision with root package name */
    private int[] f26862U0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f26863V0;

    /* renamed from: W0, reason: collision with root package name */
    private ColorStateList f26864W0;

    /* renamed from: X, reason: collision with root package name */
    private boolean f26865X;

    /* renamed from: X0, reason: collision with root package name */
    private WeakReference f26866X0;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f26867Y;

    /* renamed from: Y0, reason: collision with root package name */
    private TextUtils.TruncateAt f26868Y0;

    /* renamed from: Z, reason: collision with root package name */
    private Drawable f26869Z;

    /* renamed from: Z0, reason: collision with root package name */
    private boolean f26870Z0;

    /* renamed from: a1, reason: collision with root package name */
    private int f26871a1;

    /* renamed from: b1, reason: collision with root package name */
    private boolean f26872b1;

    /* renamed from: h0, reason: collision with root package name */
    private Drawable f26873h0;

    /* renamed from: i0, reason: collision with root package name */
    private ColorStateList f26874i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f26875j0;

    /* renamed from: k0, reason: collision with root package name */
    private CharSequence f26876k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f26877l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f26878m0;

    /* renamed from: n0, reason: collision with root package name */
    private Drawable f26879n0;

    /* renamed from: o0, reason: collision with root package name */
    private ColorStateList f26880o0;

    /* renamed from: p0, reason: collision with root package name */
    private I7.g f26881p0;

    /* renamed from: q0, reason: collision with root package name */
    private I7.g f26882q0;

    /* renamed from: r0, reason: collision with root package name */
    private float f26883r0;

    /* renamed from: s0, reason: collision with root package name */
    private float f26884s0;

    /* renamed from: t0, reason: collision with root package name */
    private float f26885t0;

    /* renamed from: u0, reason: collision with root package name */
    private float f26886u0;

    /* renamed from: v0, reason: collision with root package name */
    private float f26887v0;

    /* renamed from: w0, reason: collision with root package name */
    private float f26888w0;

    /* renamed from: x0, reason: collision with root package name */
    private float f26889x0;

    /* renamed from: y0, reason: collision with root package name */
    private float f26890y0;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f26891z;

    /* renamed from: z0, reason: collision with root package name */
    private final Context f26892z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0396a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f26835C = -1.0f;
        this.f26832A0 = new Paint(1);
        this.f26836C0 = new Paint.FontMetrics();
        this.f26838D0 = new RectF();
        this.f26840E0 = new PointF();
        this.f26842F0 = new Path();
        this.f26857P0 = 255;
        this.f26861T0 = PorterDuff.Mode.SRC_IN;
        this.f26866X0 = new WeakReference(null);
        M(context);
        this.f26892z0 = context;
        k kVar = new k(this);
        this.f26844G0 = kVar;
        this.f26843G = BuildConfig.FLAVOR;
        kVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f26834B0 = null;
        int[] iArr = f26829c1;
        setState(iArr);
        j2(iArr);
        this.f26870Z0 = true;
        if (b.f11399a) {
            f26830d1.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        this.f26832A0.setColor(this.f26853L0);
        this.f26832A0.setStyle(Paint.Style.FILL);
        this.f26838D0.set(rect);
        if (!this.f26872b1) {
            canvas.drawRoundRect(this.f26838D0, G0(), G0(), this.f26832A0);
        } else {
            h(new RectF(rect), this.f26842F0);
            super.q(canvas, this.f26832A0, this.f26842F0, u());
        }
    }

    private void B0(Canvas canvas, Rect rect) {
        Paint paint = this.f26834B0;
        if (paint != null) {
            paint.setColor(d.p(-16777216, 127));
            canvas.drawRect(rect, this.f26834B0);
            if (L2() || K2()) {
                j0(rect, this.f26838D0);
                canvas.drawRect(this.f26838D0, this.f26834B0);
            }
            if (this.f26843G != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f26834B0);
            }
            if (M2()) {
                m0(rect, this.f26838D0);
                canvas.drawRect(this.f26838D0, this.f26834B0);
            }
            this.f26834B0.setColor(d.p(-65536, 127));
            l0(rect, this.f26838D0);
            canvas.drawRect(this.f26838D0, this.f26834B0);
            this.f26834B0.setColor(d.p(-16711936, 127));
            n0(rect, this.f26838D0);
            canvas.drawRect(this.f26838D0, this.f26834B0);
        }
    }

    private void C0(Canvas canvas, Rect rect) {
        if (this.f26843G != null) {
            Paint.Align r02 = r0(rect, this.f26840E0);
            p0(rect, this.f26838D0);
            if (this.f26844G0.d() != null) {
                this.f26844G0.e().drawableState = getState();
                this.f26844G0.j(this.f26892z0);
            }
            this.f26844G0.e().setTextAlign(r02);
            int i10 = 0;
            boolean z10 = Math.round(this.f26844G0.f(f1().toString())) > Math.round(this.f26838D0.width());
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f26838D0);
            }
            CharSequence charSequence = this.f26843G;
            if (z10 && this.f26868Y0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f26844G0.e(), this.f26838D0.width(), this.f26868Y0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f26840E0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f26844G0.e());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    private boolean K2() {
        return this.f26878m0 && this.f26879n0 != null && this.f26855N0;
    }

    private boolean L2() {
        return this.f26845H && this.f26847I != null;
    }

    private boolean M2() {
        return this.f26867Y && this.f26869Z != null;
    }

    private void N2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void O2() {
        this.f26864W0 = this.f26863V0 ? b.d(this.f26841F) : null;
    }

    private void P2() {
        this.f26873h0 = new RippleDrawable(b.d(d1()), this.f26869Z, f26830d1);
    }

    private float X0() {
        Drawable drawable = this.f26855N0 ? this.f26879n0 : this.f26847I;
        float f10 = this.f26851K;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) Math.ceil(o.b(this.f26892z0, 24));
            if (drawable.getIntrinsicHeight() <= f10) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f10;
    }

    private float Y0() {
        Drawable drawable = this.f26855N0 ? this.f26879n0 : this.f26847I;
        float f10 = this.f26851K;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private void Z1(ColorStateList colorStateList) {
        if (this.f26891z != colorStateList) {
            this.f26891z = colorStateList;
            onStateChange(getState());
        }
    }

    private void i0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.g(drawable, androidx.core.graphics.drawable.a.b(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f26869Z) {
            if (drawable.isStateful()) {
                drawable.setState(U0());
            }
            androidx.core.graphics.drawable.a.i(drawable, this.f26874i0);
            return;
        }
        Drawable drawable2 = this.f26847I;
        if (drawable == drawable2 && this.f26865X) {
            androidx.core.graphics.drawable.a.i(drawable2, this.f26849J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (L2() || K2()) {
            float f10 = this.f26883r0 + this.f26884s0;
            float Y02 = Y0();
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + Y02;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - Y02;
            }
            float X02 = X0();
            float exactCenterY = rect.exactCenterY() - (X02 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + X02;
        }
    }

    private ColorFilter j1() {
        ColorFilter colorFilter = this.f26858Q0;
        return colorFilter != null ? colorFilter : this.f26859R0;
    }

    private void l0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (M2()) {
            float f10 = this.f26890y0 + this.f26889x0 + this.f26875j0 + this.f26888w0 + this.f26887v0;
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private static boolean l1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (M2()) {
            float f10 = this.f26890y0 + this.f26889x0;
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f26875j0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f26875j0;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f26875j0;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (M2()) {
            float f10 = this.f26890y0 + this.f26889x0 + this.f26875j0 + this.f26888w0 + this.f26887v0;
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f26843G != null) {
            float k02 = this.f26883r0 + k0() + this.f26886u0;
            float o02 = this.f26890y0 + o0() + this.f26887v0;
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                rectF.left = rect.left + k02;
                rectF.right = rect.right - o02;
            } else {
                rectF.left = rect.left + o02;
                rectF.right = rect.right - k02;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean p1(V7.d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private float q0() {
        this.f26844G0.e().getFontMetrics(this.f26836C0);
        Paint.FontMetrics fontMetrics = this.f26836C0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean q1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean r1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private boolean s0() {
        return this.f26878m0 && this.f26879n0 != null && this.f26877l0;
    }

    private void s1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray h10 = m.h(this.f26892z0, attributeSet, l.f3810z0, i10, i11, new int[0]);
        this.f26872b1 = h10.hasValue(l.f3676k1);
        Z1(c.a(this.f26892z0, h10, l.f3559X0));
        D1(c.a(this.f26892z0, h10, l.f3442K0));
        R1(h10.getDimension(l.f3514S0, 0.0f));
        if (h10.hasValue(l.f3451L0)) {
            F1(h10.getDimension(l.f3451L0, 0.0f));
        }
        V1(c.a(this.f26892z0, h10, l.f3541V0));
        X1(h10.getDimension(l.f3550W0, 0.0f));
        w2(c.a(this.f26892z0, h10, l.f3667j1));
        B2(h10.getText(l.f3388E0));
        V7.d f10 = c.f(this.f26892z0, h10, l.f3352A0);
        f10.l(h10.getDimension(l.f3361B0, f10.j()));
        C2(f10);
        int i12 = h10.getInt(l.f3370C0, 0);
        if (i12 == 1) {
            o2(TextUtils.TruncateAt.START);
        } else if (i12 == 2) {
            o2(TextUtils.TruncateAt.MIDDLE);
        } else if (i12 == 3) {
            o2(TextUtils.TruncateAt.END);
        }
        Q1(h10.getBoolean(l.f3505R0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            Q1(h10.getBoolean(l.f3478O0, false));
        }
        J1(c.d(this.f26892z0, h10, l.f3469N0));
        if (h10.hasValue(l.f3496Q0)) {
            N1(c.a(this.f26892z0, h10, l.f3496Q0));
        }
        L1(h10.getDimension(l.f3487P0, -1.0f));
        m2(h10.getBoolean(l.f3622e1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            m2(h10.getBoolean(l.f3577Z0, false));
        }
        a2(c.d(this.f26892z0, h10, l.f3568Y0));
        k2(c.a(this.f26892z0, h10, l.f3613d1));
        f2(h10.getDimension(l.f3595b1, 0.0f));
        v1(h10.getBoolean(l.f3397F0, false));
        C1(h10.getBoolean(l.f3433J0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            C1(h10.getBoolean(l.f3415H0, false));
        }
        x1(c.d(this.f26892z0, h10, l.f3406G0));
        if (h10.hasValue(l.f3424I0)) {
            z1(c.a(this.f26892z0, h10, l.f3424I0));
        }
        z2(I7.g.b(this.f26892z0, h10, l.f3685l1));
        p2(I7.g.b(this.f26892z0, h10, l.f3640g1));
        T1(h10.getDimension(l.f3532U0, 0.0f));
        t2(h10.getDimension(l.f3658i1, 0.0f));
        r2(h10.getDimension(l.f3649h1, 0.0f));
        G2(h10.getDimension(l.f3703n1, 0.0f));
        E2(h10.getDimension(l.f3694m1, 0.0f));
        h2(h10.getDimension(l.f3604c1, 0.0f));
        c2(h10.getDimension(l.f3586a1, 0.0f));
        H1(h10.getDimension(l.f3460M0, 0.0f));
        v2(h10.getDimensionPixelSize(l.f3379D0, Integer.MAX_VALUE));
        h10.recycle();
    }

    public static a t0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.s1(attributeSet, i10, i11);
        return aVar;
    }

    private void u0(Canvas canvas, Rect rect) {
        if (K2()) {
            j0(rect, this.f26838D0);
            RectF rectF = this.f26838D0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f26879n0.setBounds(0, 0, (int) this.f26838D0.width(), (int) this.f26838D0.height());
            this.f26879n0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private boolean u1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f26891z;
        int l10 = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f26846H0) : 0);
        boolean z11 = true;
        if (this.f26846H0 != l10) {
            this.f26846H0 = l10;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f26831A;
        int l11 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f26848I0) : 0);
        if (this.f26848I0 != l11) {
            this.f26848I0 = l11;
            onStateChange = true;
        }
        int g10 = M7.a.g(l10, l11);
        if ((this.f26850J0 != g10) | (x() == null)) {
            this.f26850J0 = g10;
            X(ColorStateList.valueOf(g10));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f26837D;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f26852K0) : 0;
        if (this.f26852K0 != colorForState) {
            this.f26852K0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f26864W0 == null || !b.e(iArr)) ? 0 : this.f26864W0.getColorForState(iArr, this.f26853L0);
        if (this.f26853L0 != colorForState2) {
            this.f26853L0 = colorForState2;
            if (this.f26863V0) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f26844G0.d() == null || this.f26844G0.d().i() == null) ? 0 : this.f26844G0.d().i().getColorForState(iArr, this.f26854M0);
        if (this.f26854M0 != colorForState3) {
            this.f26854M0 = colorForState3;
            onStateChange = true;
        }
        boolean z12 = l1(getState(), R.attr.state_checked) && this.f26877l0;
        if (this.f26855N0 == z12 || this.f26879n0 == null) {
            z10 = false;
        } else {
            float k02 = k0();
            this.f26855N0 = z12;
            if (k02 != k0()) {
                onStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f26860S0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f26856O0) : 0;
        if (this.f26856O0 != colorForState4) {
            this.f26856O0 = colorForState4;
            this.f26859R0 = O7.a.b(this, this.f26860S0, this.f26861T0);
        } else {
            z11 = onStateChange;
        }
        if (r1(this.f26847I)) {
            z11 |= this.f26847I.setState(iArr);
        }
        if (r1(this.f26879n0)) {
            z11 |= this.f26879n0.setState(iArr);
        }
        if (r1(this.f26869Z)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z11 |= this.f26869Z.setState(iArr3);
        }
        if (b.f11399a && r1(this.f26873h0)) {
            z11 |= this.f26873h0.setState(iArr2);
        }
        if (z11) {
            invalidateSelf();
        }
        if (z10) {
            t1();
        }
        return z11;
    }

    private void v0(Canvas canvas, Rect rect) {
        if (this.f26872b1) {
            return;
        }
        this.f26832A0.setColor(this.f26848I0);
        this.f26832A0.setStyle(Paint.Style.FILL);
        this.f26832A0.setColorFilter(j1());
        this.f26838D0.set(rect);
        canvas.drawRoundRect(this.f26838D0, G0(), G0(), this.f26832A0);
    }

    private void w0(Canvas canvas, Rect rect) {
        if (L2()) {
            j0(rect, this.f26838D0);
            RectF rectF = this.f26838D0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f26847I.setBounds(0, 0, (int) this.f26838D0.width(), (int) this.f26838D0.height());
            this.f26847I.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void x0(Canvas canvas, Rect rect) {
        if (this.f26839E <= 0.0f || this.f26872b1) {
            return;
        }
        this.f26832A0.setColor(this.f26852K0);
        this.f26832A0.setStyle(Paint.Style.STROKE);
        if (!this.f26872b1) {
            this.f26832A0.setColorFilter(j1());
        }
        RectF rectF = this.f26838D0;
        float f10 = rect.left;
        float f11 = this.f26839E;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.f26835C - (this.f26839E / 2.0f);
        canvas.drawRoundRect(this.f26838D0, f12, f12, this.f26832A0);
    }

    private void y0(Canvas canvas, Rect rect) {
        if (this.f26872b1) {
            return;
        }
        this.f26832A0.setColor(this.f26846H0);
        this.f26832A0.setStyle(Paint.Style.FILL);
        this.f26838D0.set(rect);
        canvas.drawRoundRect(this.f26838D0, G0(), G0(), this.f26832A0);
    }

    private void z0(Canvas canvas, Rect rect) {
        if (M2()) {
            m0(rect, this.f26838D0);
            RectF rectF = this.f26838D0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f26869Z.setBounds(0, 0, (int) this.f26838D0.width(), (int) this.f26838D0.height());
            if (b.f11399a) {
                this.f26873h0.setBounds(this.f26869Z.getBounds());
                this.f26873h0.jumpToCurrentState();
                this.f26873h0.draw(canvas);
            } else {
                this.f26869Z.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    public void A1(int i10) {
        z1(AbstractC3220a.a(this.f26892z0, i10));
    }

    public void A2(int i10) {
        z2(I7.g.c(this.f26892z0, i10));
    }

    public void B1(int i10) {
        C1(this.f26892z0.getResources().getBoolean(i10));
    }

    public void B2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (TextUtils.equals(this.f26843G, charSequence)) {
            return;
        }
        this.f26843G = charSequence;
        this.f26844G0.i(true);
        invalidateSelf();
        t1();
    }

    public void C1(boolean z10) {
        if (this.f26878m0 != z10) {
            boolean K22 = K2();
            this.f26878m0 = z10;
            boolean K23 = K2();
            if (K22 != K23) {
                if (K23) {
                    i0(this.f26879n0);
                } else {
                    N2(this.f26879n0);
                }
                invalidateSelf();
                t1();
            }
        }
    }

    public void C2(V7.d dVar) {
        this.f26844G0.h(dVar, this.f26892z0);
    }

    public Drawable D0() {
        return this.f26879n0;
    }

    public void D1(ColorStateList colorStateList) {
        if (this.f26831A != colorStateList) {
            this.f26831A = colorStateList;
            onStateChange(getState());
        }
    }

    public void D2(int i10) {
        C2(new V7.d(this.f26892z0, i10));
    }

    public ColorStateList E0() {
        return this.f26880o0;
    }

    public void E1(int i10) {
        D1(AbstractC3220a.a(this.f26892z0, i10));
    }

    public void E2(float f10) {
        if (this.f26887v0 != f10) {
            this.f26887v0 = f10;
            invalidateSelf();
            t1();
        }
    }

    public ColorStateList F0() {
        return this.f26831A;
    }

    public void F1(float f10) {
        if (this.f26835C != f10) {
            this.f26835C = f10;
            setShapeAppearanceModel(C().w(f10));
        }
    }

    public void F2(int i10) {
        E2(this.f26892z0.getResources().getDimension(i10));
    }

    public float G0() {
        return this.f26872b1 ? F() : this.f26835C;
    }

    public void G1(int i10) {
        F1(this.f26892z0.getResources().getDimension(i10));
    }

    public void G2(float f10) {
        if (this.f26886u0 != f10) {
            this.f26886u0 = f10;
            invalidateSelf();
            t1();
        }
    }

    public float H0() {
        return this.f26890y0;
    }

    public void H1(float f10) {
        if (this.f26890y0 != f10) {
            this.f26890y0 = f10;
            invalidateSelf();
            t1();
        }
    }

    public void H2(int i10) {
        G2(this.f26892z0.getResources().getDimension(i10));
    }

    public Drawable I0() {
        Drawable drawable = this.f26847I;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.k(drawable);
        }
        return null;
    }

    public void I1(int i10) {
        H1(this.f26892z0.getResources().getDimension(i10));
    }

    public void I2(boolean z10) {
        if (this.f26863V0 != z10) {
            this.f26863V0 = z10;
            O2();
            onStateChange(getState());
        }
    }

    public float J0() {
        return this.f26851K;
    }

    public void J1(Drawable drawable) {
        Drawable I02 = I0();
        if (I02 != drawable) {
            float k02 = k0();
            this.f26847I = drawable != null ? androidx.core.graphics.drawable.a.l(drawable).mutate() : null;
            float k03 = k0();
            N2(I02);
            if (L2()) {
                i0(this.f26847I);
            }
            invalidateSelf();
            if (k02 != k03) {
                t1();
            }
        }
    }

    boolean J2() {
        return this.f26870Z0;
    }

    public ColorStateList K0() {
        return this.f26849J;
    }

    public void K1(int i10) {
        J1(AbstractC3220a.b(this.f26892z0, i10));
    }

    public float L0() {
        return this.f26833B;
    }

    public void L1(float f10) {
        if (this.f26851K != f10) {
            float k02 = k0();
            this.f26851K = f10;
            float k03 = k0();
            invalidateSelf();
            if (k02 != k03) {
                t1();
            }
        }
    }

    public float M0() {
        return this.f26883r0;
    }

    public void M1(int i10) {
        L1(this.f26892z0.getResources().getDimension(i10));
    }

    public ColorStateList N0() {
        return this.f26837D;
    }

    public void N1(ColorStateList colorStateList) {
        this.f26865X = true;
        if (this.f26849J != colorStateList) {
            this.f26849J = colorStateList;
            if (L2()) {
                androidx.core.graphics.drawable.a.i(this.f26847I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float O0() {
        return this.f26839E;
    }

    public void O1(int i10) {
        N1(AbstractC3220a.a(this.f26892z0, i10));
    }

    public Drawable P0() {
        Drawable drawable = this.f26869Z;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.k(drawable);
        }
        return null;
    }

    public void P1(int i10) {
        Q1(this.f26892z0.getResources().getBoolean(i10));
    }

    public CharSequence Q0() {
        return this.f26876k0;
    }

    public void Q1(boolean z10) {
        if (this.f26845H != z10) {
            boolean L22 = L2();
            this.f26845H = z10;
            boolean L23 = L2();
            if (L22 != L23) {
                if (L23) {
                    i0(this.f26847I);
                } else {
                    N2(this.f26847I);
                }
                invalidateSelf();
                t1();
            }
        }
    }

    public float R0() {
        return this.f26889x0;
    }

    public void R1(float f10) {
        if (this.f26833B != f10) {
            this.f26833B = f10;
            invalidateSelf();
            t1();
        }
    }

    public float S0() {
        return this.f26875j0;
    }

    public void S1(int i10) {
        R1(this.f26892z0.getResources().getDimension(i10));
    }

    public float T0() {
        return this.f26888w0;
    }

    public void T1(float f10) {
        if (this.f26883r0 != f10) {
            this.f26883r0 = f10;
            invalidateSelf();
            t1();
        }
    }

    public int[] U0() {
        return this.f26862U0;
    }

    public void U1(int i10) {
        T1(this.f26892z0.getResources().getDimension(i10));
    }

    public ColorStateList V0() {
        return this.f26874i0;
    }

    public void V1(ColorStateList colorStateList) {
        if (this.f26837D != colorStateList) {
            this.f26837D = colorStateList;
            if (this.f26872b1) {
                d0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void W0(RectF rectF) {
        n0(getBounds(), rectF);
    }

    public void W1(int i10) {
        V1(AbstractC3220a.a(this.f26892z0, i10));
    }

    public void X1(float f10) {
        if (this.f26839E != f10) {
            this.f26839E = f10;
            this.f26832A0.setStrokeWidth(f10);
            if (this.f26872b1) {
                super.e0(f10);
            }
            invalidateSelf();
        }
    }

    public void Y1(int i10) {
        X1(this.f26892z0.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt Z0() {
        return this.f26868Y0;
    }

    @Override // com.google.android.material.internal.k.b
    public void a() {
        t1();
        invalidateSelf();
    }

    public I7.g a1() {
        return this.f26882q0;
    }

    public void a2(Drawable drawable) {
        Drawable P02 = P0();
        if (P02 != drawable) {
            float o02 = o0();
            this.f26869Z = drawable != null ? androidx.core.graphics.drawable.a.l(drawable).mutate() : null;
            if (b.f11399a) {
                P2();
            }
            float o03 = o0();
            N2(P02);
            if (M2()) {
                i0(this.f26869Z);
            }
            invalidateSelf();
            if (o02 != o03) {
                t1();
            }
        }
    }

    public float b1() {
        return this.f26885t0;
    }

    public void b2(CharSequence charSequence) {
        if (this.f26876k0 != charSequence) {
            this.f26876k0 = androidx.core.text.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float c1() {
        return this.f26884s0;
    }

    public void c2(float f10) {
        if (this.f26889x0 != f10) {
            this.f26889x0 = f10;
            invalidateSelf();
            if (M2()) {
                t1();
            }
        }
    }

    public ColorStateList d1() {
        return this.f26841F;
    }

    public void d2(int i10) {
        c2(this.f26892z0.getResources().getDimension(i10));
    }

    @Override // Y7.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.f26857P0;
        int a10 = i10 < 255 ? K7.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i10) : 0;
        y0(canvas, bounds);
        v0(canvas, bounds);
        if (this.f26872b1) {
            super.draw(canvas);
        }
        x0(canvas, bounds);
        A0(canvas, bounds);
        w0(canvas, bounds);
        u0(canvas, bounds);
        if (this.f26870Z0) {
            C0(canvas, bounds);
        }
        z0(canvas, bounds);
        B0(canvas, bounds);
        if (this.f26857P0 < 255) {
            canvas.restoreToCount(a10);
        }
    }

    public I7.g e1() {
        return this.f26881p0;
    }

    public void e2(int i10) {
        a2(AbstractC3220a.b(this.f26892z0, i10));
    }

    public CharSequence f1() {
        return this.f26843G;
    }

    public void f2(float f10) {
        if (this.f26875j0 != f10) {
            this.f26875j0 = f10;
            invalidateSelf();
            if (M2()) {
                t1();
            }
        }
    }

    public V7.d g1() {
        return this.f26844G0.d();
    }

    public void g2(int i10) {
        f2(this.f26892z0.getResources().getDimension(i10));
    }

    @Override // Y7.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f26857P0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f26858Q0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f26833B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f26883r0 + k0() + this.f26886u0 + this.f26844G0.f(f1().toString()) + this.f26887v0 + o0() + this.f26890y0), this.f26871a1);
    }

    @Override // Y7.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // Y7.g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f26872b1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f26835C);
        } else {
            outline.setRoundRect(bounds, this.f26835C);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public float h1() {
        return this.f26887v0;
    }

    public void h2(float f10) {
        if (this.f26888w0 != f10) {
            this.f26888w0 = f10;
            invalidateSelf();
            if (M2()) {
                t1();
            }
        }
    }

    public float i1() {
        return this.f26886u0;
    }

    public void i2(int i10) {
        h2(this.f26892z0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // Y7.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return q1(this.f26891z) || q1(this.f26831A) || q1(this.f26837D) || (this.f26863V0 && q1(this.f26864W0)) || p1(this.f26844G0.d()) || s0() || r1(this.f26847I) || r1(this.f26879n0) || q1(this.f26860S0);
    }

    public boolean j2(int[] iArr) {
        if (Arrays.equals(this.f26862U0, iArr)) {
            return false;
        }
        this.f26862U0 = iArr;
        if (M2()) {
            return u1(getState(), iArr);
        }
        return false;
    }

    float k0() {
        if (L2() || K2()) {
            return this.f26884s0 + Y0() + this.f26885t0;
        }
        return 0.0f;
    }

    public boolean k1() {
        return this.f26863V0;
    }

    public void k2(ColorStateList colorStateList) {
        if (this.f26874i0 != colorStateList) {
            this.f26874i0 = colorStateList;
            if (M2()) {
                androidx.core.graphics.drawable.a.i(this.f26869Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void l2(int i10) {
        k2(AbstractC3220a.a(this.f26892z0, i10));
    }

    public boolean m1() {
        return this.f26877l0;
    }

    public void m2(boolean z10) {
        if (this.f26867Y != z10) {
            boolean M22 = M2();
            this.f26867Y = z10;
            boolean M23 = M2();
            if (M22 != M23) {
                if (M23) {
                    i0(this.f26869Z);
                } else {
                    N2(this.f26869Z);
                }
                invalidateSelf();
                t1();
            }
        }
    }

    public boolean n1() {
        return r1(this.f26869Z);
    }

    public void n2(InterfaceC0396a interfaceC0396a) {
        this.f26866X0 = new WeakReference(interfaceC0396a);
    }

    float o0() {
        if (M2()) {
            return this.f26888w0 + this.f26875j0 + this.f26889x0;
        }
        return 0.0f;
    }

    public boolean o1() {
        return this.f26867Y;
    }

    public void o2(TextUtils.TruncateAt truncateAt) {
        this.f26868Y0 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (L2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.g(this.f26847I, i10);
        }
        if (K2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.g(this.f26879n0, i10);
        }
        if (M2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.g(this.f26869Z, i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (L2()) {
            onLevelChange |= this.f26847I.setLevel(i10);
        }
        if (K2()) {
            onLevelChange |= this.f26879n0.setLevel(i10);
        }
        if (M2()) {
            onLevelChange |= this.f26869Z.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // Y7.g, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f26872b1) {
            super.onStateChange(iArr);
        }
        return u1(iArr, U0());
    }

    public void p2(I7.g gVar) {
        this.f26882q0 = gVar;
    }

    public void q2(int i10) {
        p2(I7.g.c(this.f26892z0, i10));
    }

    Paint.Align r0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f26843G != null) {
            float k02 = this.f26883r0 + k0() + this.f26886u0;
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                pointF.x = rect.left + k02;
            } else {
                pointF.x = rect.right - k02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - q0();
        }
        return align;
    }

    public void r2(float f10) {
        if (this.f26885t0 != f10) {
            float k02 = k0();
            this.f26885t0 = f10;
            float k03 = k0();
            invalidateSelf();
            if (k02 != k03) {
                t1();
            }
        }
    }

    public void s2(int i10) {
        r2(this.f26892z0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // Y7.g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f26857P0 != i10) {
            this.f26857P0 = i10;
            invalidateSelf();
        }
    }

    @Override // Y7.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f26858Q0 != colorFilter) {
            this.f26858Q0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // Y7.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f26860S0 != colorStateList) {
            this.f26860S0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // Y7.g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f26861T0 != mode) {
            this.f26861T0 = mode;
            this.f26859R0 = O7.a.b(this, this.f26860S0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (L2()) {
            visible |= this.f26847I.setVisible(z10, z11);
        }
        if (K2()) {
            visible |= this.f26879n0.setVisible(z10, z11);
        }
        if (M2()) {
            visible |= this.f26869Z.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    protected void t1() {
        InterfaceC0396a interfaceC0396a = (InterfaceC0396a) this.f26866X0.get();
        if (interfaceC0396a != null) {
            interfaceC0396a.a();
        }
    }

    public void t2(float f10) {
        if (this.f26884s0 != f10) {
            float k02 = k0();
            this.f26884s0 = f10;
            float k03 = k0();
            invalidateSelf();
            if (k02 != k03) {
                t1();
            }
        }
    }

    public void u2(int i10) {
        t2(this.f26892z0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(boolean z10) {
        if (this.f26877l0 != z10) {
            this.f26877l0 = z10;
            float k02 = k0();
            if (!z10 && this.f26855N0) {
                this.f26855N0 = false;
            }
            float k03 = k0();
            invalidateSelf();
            if (k02 != k03) {
                t1();
            }
        }
    }

    public void v2(int i10) {
        this.f26871a1 = i10;
    }

    public void w1(int i10) {
        v1(this.f26892z0.getResources().getBoolean(i10));
    }

    public void w2(ColorStateList colorStateList) {
        if (this.f26841F != colorStateList) {
            this.f26841F = colorStateList;
            O2();
            onStateChange(getState());
        }
    }

    public void x1(Drawable drawable) {
        if (this.f26879n0 != drawable) {
            float k02 = k0();
            this.f26879n0 = drawable;
            float k03 = k0();
            N2(this.f26879n0);
            i0(this.f26879n0);
            invalidateSelf();
            if (k02 != k03) {
                t1();
            }
        }
    }

    public void x2(int i10) {
        w2(AbstractC3220a.a(this.f26892z0, i10));
    }

    public void y1(int i10) {
        x1(AbstractC3220a.b(this.f26892z0, i10));
    }

    void y2(boolean z10) {
        this.f26870Z0 = z10;
    }

    public void z1(ColorStateList colorStateList) {
        if (this.f26880o0 != colorStateList) {
            this.f26880o0 = colorStateList;
            if (s0()) {
                androidx.core.graphics.drawable.a.i(this.f26879n0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void z2(I7.g gVar) {
        this.f26881p0 = gVar;
    }
}
