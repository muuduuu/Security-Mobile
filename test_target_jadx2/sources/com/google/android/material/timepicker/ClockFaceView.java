package com.google.android.material.timepicker;

import H7.d;
import H7.f;
import H7.h;
import H7.k;
import H7.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1483a;
import com.google.android.material.timepicker.ClockHandView;
import h.AbstractC3220a;
import java.util.Arrays;
import org.conscrypt.BuildConfig;
import z0.C5228A;

/* loaded from: classes2.dex */
class ClockFaceView extends com.google.android.material.timepicker.b implements ClockHandView.c {

    /* renamed from: d, reason: collision with root package name */
    private final ClockHandView f27742d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f27743e;

    /* renamed from: f, reason: collision with root package name */
    private final RectF f27744f;

    /* renamed from: g, reason: collision with root package name */
    private final SparseArray f27745g;

    /* renamed from: h, reason: collision with root package name */
    private final C1483a f27746h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f27747i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f27748j;

    /* renamed from: k, reason: collision with root package name */
    private final int f27749k;

    /* renamed from: l, reason: collision with root package name */
    private final int f27750l;

    /* renamed from: m, reason: collision with root package name */
    private final int f27751m;

    /* renamed from: n, reason: collision with root package name */
    private final int f27752n;

    /* renamed from: o, reason: collision with root package name */
    private String[] f27753o;

    /* renamed from: p, reason: collision with root package name */
    private float f27754p;

    /* renamed from: q, reason: collision with root package name */
    private final ColorStateList f27755q;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.q(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f27742d.g()) - ClockFaceView.this.f27749k);
            return true;
        }
    }

    class b extends C1483a {
        b() {
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            super.g(view, c5228a);
            int intValue = ((Integer) view.getTag(f.f3264p)).intValue();
            if (intValue > 0) {
                c5228a.U0((View) ClockFaceView.this.f27745g.get(intValue - 1));
            }
            c5228a.t0(C5228A.f.b(0, 1, intValue, 1, false, view.isSelected()));
            c5228a.r0(true);
            c5228a.b(C5228A.a.f45627i);
        }

        @Override // androidx.core.view.C1483a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            float x10 = view.getX() + (view.getWidth() / 2.0f);
            float height = (view.getHeight() / 2.0f) + view.getY();
            ClockFaceView.this.f27742d.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x10, height, 0));
            ClockFaceView.this.f27742d.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x10, height, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3110B);
    }

    private void B(int i10) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f27745g.size();
        for (int i11 = 0; i11 < Math.max(this.f27753o.length, size); i11++) {
            TextView textView = (TextView) this.f27745g.get(i11);
            if (i11 >= this.f27753o.length) {
                removeView(textView);
                this.f27745g.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(h.f3286i, (ViewGroup) this, false);
                    this.f27745g.put(i11, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f27753o[i11]);
                textView.setTag(f.f3264p, Integer.valueOf(i11));
                AbstractC1484a0.q0(textView, this.f27746h);
                textView.setTextColor(this.f27755q);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f27753o[i11]));
                }
            }
        }
    }

    private void x() {
        RectF d10 = this.f27742d.d();
        for (int i10 = 0; i10 < this.f27745g.size(); i10++) {
            TextView textView = (TextView) this.f27745g.get(i10);
            if (textView != null) {
                textView.getDrawingRect(this.f27743e);
                offsetDescendantRectToMyCoords(textView, this.f27743e);
                textView.setSelected(d10.contains(this.f27743e.centerX(), this.f27743e.centerY()));
                textView.getPaint().setShader(y(d10, this.f27743e, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient y(RectF rectF, Rect rect, TextView textView) {
        this.f27744f.set(rect);
        this.f27744f.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (RectF.intersects(rectF, this.f27744f)) {
            return new RadialGradient(rectF.centerX() - this.f27744f.left, rectF.centerY() - this.f27744f.top, rectF.width() * 0.5f, this.f27747i, this.f27748j, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private static float z(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    public void A(String[] strArr, int i10) {
        this.f27753o = strArr;
        B(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void a(float f10, boolean z10) {
        if (Math.abs(this.f27754p - f10) > 0.001f) {
            this.f27754p = f10;
            x();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C5228A.Y0(accessibilityNodeInfo).s0(C5228A.e.b(1, this.f27753o.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int z10 = (int) (this.f27752n / z(this.f27750l / displayMetrics.heightPixels, this.f27751m / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(z10, 1073741824);
        setMeasuredDimension(z10, z10);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.b
    public void q(int i10) {
        if (i10 != p()) {
            super.q(i10);
            this.f27742d.j(p());
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27743e = new Rect();
        this.f27744f = new RectF();
        this.f27745g = new SparseArray();
        this.f27748j = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f3353A1, i10, k.f3350z);
        Resources resources = getResources();
        ColorStateList a10 = V7.c.a(context, obtainStyledAttributes, l.f3371C1);
        this.f27755q = a10;
        LayoutInflater.from(context).inflate(h.f3287j, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.f3259k);
        this.f27742d = clockHandView;
        this.f27749k = resources.getDimensionPixelSize(d.f3208l);
        int colorForState = a10.getColorForState(new int[]{R.attr.state_selected}, a10.getDefaultColor());
        this.f27747i = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = AbstractC3220a.a(context, H7.c.f3159f).getDefaultColor();
        ColorStateList a11 = V7.c.a(context, obtainStyledAttributes, l.f3362B1);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f27746h = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.FLAVOR);
        A(strArr, 0);
        this.f27750l = resources.getDimensionPixelSize(d.f3221y);
        this.f27751m = resources.getDimensionPixelSize(d.f3222z);
        this.f27752n = resources.getDimensionPixelSize(d.f3210n);
    }
}
