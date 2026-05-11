package com.google.android.material.internal;

import V7.a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1518s;
import u0.AbstractC4860a;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: t0, reason: collision with root package name */
    private static final boolean f27173t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private static final Paint f27174u0 = null;

    /* renamed from: A, reason: collision with root package name */
    private Typeface f27175A;

    /* renamed from: B, reason: collision with root package name */
    private Typeface f27176B;

    /* renamed from: C, reason: collision with root package name */
    private Typeface f27177C;

    /* renamed from: D, reason: collision with root package name */
    private Typeface f27178D;

    /* renamed from: E, reason: collision with root package name */
    private V7.a f27179E;

    /* renamed from: F, reason: collision with root package name */
    private V7.a f27180F;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f27181G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f27182H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f27183I;

    /* renamed from: K, reason: collision with root package name */
    private boolean f27185K;

    /* renamed from: L, reason: collision with root package name */
    private Bitmap f27186L;

    /* renamed from: M, reason: collision with root package name */
    private Paint f27187M;

    /* renamed from: N, reason: collision with root package name */
    private float f27188N;

    /* renamed from: O, reason: collision with root package name */
    private float f27189O;

    /* renamed from: P, reason: collision with root package name */
    private float f27190P;

    /* renamed from: Q, reason: collision with root package name */
    private float f27191Q;

    /* renamed from: R, reason: collision with root package name */
    private float f27192R;

    /* renamed from: S, reason: collision with root package name */
    private int f27193S;

    /* renamed from: T, reason: collision with root package name */
    private int[] f27194T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f27195U;

    /* renamed from: V, reason: collision with root package name */
    private final TextPaint f27196V;

    /* renamed from: W, reason: collision with root package name */
    private final TextPaint f27197W;

    /* renamed from: X, reason: collision with root package name */
    private TimeInterpolator f27198X;

    /* renamed from: Y, reason: collision with root package name */
    private TimeInterpolator f27199Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f27200Z;

    /* renamed from: a, reason: collision with root package name */
    private final View f27201a;

    /* renamed from: a0, reason: collision with root package name */
    private float f27202a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f27203b;

    /* renamed from: b0, reason: collision with root package name */
    private float f27204b0;

    /* renamed from: c, reason: collision with root package name */
    private float f27205c;

    /* renamed from: c0, reason: collision with root package name */
    private ColorStateList f27206c0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27207d;

    /* renamed from: d0, reason: collision with root package name */
    private float f27208d0;

    /* renamed from: e, reason: collision with root package name */
    private float f27209e;

    /* renamed from: e0, reason: collision with root package name */
    private float f27210e0;

    /* renamed from: f, reason: collision with root package name */
    private float f27211f;

    /* renamed from: f0, reason: collision with root package name */
    private float f27212f0;

    /* renamed from: g, reason: collision with root package name */
    private int f27213g;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f27214g0;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f27215h;

    /* renamed from: h0, reason: collision with root package name */
    private float f27216h0;

    /* renamed from: i, reason: collision with root package name */
    private final Rect f27217i;

    /* renamed from: i0, reason: collision with root package name */
    private float f27218i0;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f27219j;

    /* renamed from: j0, reason: collision with root package name */
    private float f27220j0;

    /* renamed from: k0, reason: collision with root package name */
    private StaticLayout f27222k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f27224l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f27226m0;

    /* renamed from: n0, reason: collision with root package name */
    private float f27228n0;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f27229o;

    /* renamed from: o0, reason: collision with root package name */
    private CharSequence f27230o0;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f27231p;

    /* renamed from: q, reason: collision with root package name */
    private int f27233q;

    /* renamed from: r, reason: collision with root package name */
    private float f27235r;

    /* renamed from: s, reason: collision with root package name */
    private float f27237s;

    /* renamed from: t, reason: collision with root package name */
    private float f27239t;

    /* renamed from: u, reason: collision with root package name */
    private float f27240u;

    /* renamed from: v, reason: collision with root package name */
    private float f27241v;

    /* renamed from: w, reason: collision with root package name */
    private float f27242w;

    /* renamed from: x, reason: collision with root package name */
    private Typeface f27243x;

    /* renamed from: y, reason: collision with root package name */
    private Typeface f27244y;

    /* renamed from: z, reason: collision with root package name */
    private Typeface f27245z;

    /* renamed from: k, reason: collision with root package name */
    private int f27221k = 16;

    /* renamed from: l, reason: collision with root package name */
    private int f27223l = 16;

    /* renamed from: m, reason: collision with root package name */
    private float f27225m = 15.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f27227n = 15.0f;

    /* renamed from: J, reason: collision with root package name */
    private boolean f27184J = true;

    /* renamed from: p0, reason: collision with root package name */
    private int f27232p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    private float f27234q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    private float f27236r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    private int f27238s0 = j.f27266n;

    class a implements a.InterfaceC0203a {
        a() {
        }

        @Override // V7.a.InterfaceC0203a
        public void a(Typeface typeface) {
            b.this.T(typeface);
        }
    }

    public b(View view) {
        this.f27201a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f27196V = textPaint;
        this.f27197W = new TextPaint(textPaint);
        this.f27217i = new Rect();
        this.f27215h = new Rect();
        this.f27219j = new RectF();
        this.f27211f = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f27225m);
        textPaint.setTypeface(this.f27175A);
        textPaint.setLetterSpacing(this.f27218i0);
    }

    private void B(float f10) {
        if (this.f27207d) {
            this.f27219j.set(f10 < this.f27211f ? this.f27215h : this.f27217i);
            return;
        }
        this.f27219j.left = G(this.f27215h.left, this.f27217i.left, f10, this.f27198X);
        this.f27219j.top = G(this.f27235r, this.f27237s, f10, this.f27198X);
        this.f27219j.right = G(this.f27215h.right, this.f27217i.right, f10, this.f27198X);
        this.f27219j.bottom = G(this.f27215h.bottom, this.f27217i.bottom, f10, this.f27198X);
    }

    private static boolean C(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean D() {
        return AbstractC1484a0.A(this.f27201a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z10) {
        return (z10 ? androidx.core.text.p.f16011d : androidx.core.text.p.f16010c).a(charSequence, 0, charSequence.length());
    }

    private static float G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return I7.a.a(f10, f11, f12);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean M(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void Q(float f10) {
        this.f27226m0 = f10;
        AbstractC1484a0.h0(this.f27201a);
    }

    private boolean U(Typeface typeface) {
        V7.a aVar = this.f27180F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f27245z == typeface) {
            return false;
        }
        this.f27245z = typeface;
        Typeface b10 = V7.i.b(this.f27201a.getContext().getResources().getConfiguration(), typeface);
        this.f27244y = b10;
        if (b10 == null) {
            b10 = this.f27245z;
        }
        this.f27243x = b10;
        return true;
    }

    private void Y(float f10) {
        this.f27228n0 = f10;
        AbstractC1484a0.h0(this.f27201a);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z10) {
        StaticLayout staticLayout;
        i(1.0f, z10);
        CharSequence charSequence = this.f27182H;
        if (charSequence != null && (staticLayout = this.f27222k0) != null) {
            this.f27230o0 = TextUtils.ellipsize(charSequence, this.f27196V, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f27230o0;
        float f10 = 0.0f;
        if (charSequence2 != null) {
            this.f27224l0 = I(this.f27196V, charSequence2);
        } else {
            this.f27224l0 = 0.0f;
        }
        int b10 = AbstractC1518s.b(this.f27223l, this.f27183I ? 1 : 0);
        int i10 = b10 & 112;
        if (i10 == 48) {
            this.f27237s = this.f27217i.top;
        } else if (i10 != 80) {
            this.f27237s = this.f27217i.centerY() - ((this.f27196V.descent() - this.f27196V.ascent()) / 2.0f);
        } else {
            this.f27237s = this.f27217i.bottom + this.f27196V.ascent();
        }
        int i11 = b10 & 8388615;
        if (i11 == 1) {
            this.f27240u = this.f27217i.centerX() - (this.f27224l0 / 2.0f);
        } else if (i11 != 5) {
            this.f27240u = this.f27217i.left;
        } else {
            this.f27240u = this.f27217i.right - this.f27224l0;
        }
        i(0.0f, z10);
        float height = this.f27222k0 != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f27222k0;
        if (staticLayout2 == null || this.f27232p0 <= 1) {
            CharSequence charSequence3 = this.f27182H;
            if (charSequence3 != null) {
                f10 = I(this.f27196V, charSequence3);
            }
        } else {
            f10 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f27222k0;
        this.f27233q = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int b11 = AbstractC1518s.b(this.f27221k, this.f27183I ? 1 : 0);
        int i12 = b11 & 112;
        if (i12 == 48) {
            this.f27235r = this.f27215h.top;
        } else if (i12 != 80) {
            this.f27235r = this.f27215h.centerY() - (height / 2.0f);
        } else {
            this.f27235r = (this.f27215h.bottom - height) + this.f27196V.descent();
        }
        int i13 = b11 & 8388615;
        if (i13 == 1) {
            this.f27239t = this.f27215h.centerX() - (f10 / 2.0f);
        } else if (i13 != 5) {
            this.f27239t = this.f27215h.left;
        } else {
            this.f27239t = this.f27215h.right - f10;
        }
        j();
        e0(this.f27205c);
    }

    private void c() {
        g(this.f27205c);
    }

    private boolean c0(Typeface typeface) {
        V7.a aVar = this.f27179E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f27177C == typeface) {
            return false;
        }
        this.f27177C = typeface;
        Typeface b10 = V7.i.b(this.f27201a.getContext().getResources().getConfiguration(), typeface);
        this.f27176B = b10;
        if (b10 == null) {
            b10 = this.f27177C;
        }
        this.f27175A = b10;
        return true;
    }

    private float d(float f10) {
        float f11 = this.f27211f;
        return f10 <= f11 ? I7.a.b(1.0f, 0.0f, this.f27209e, f11, f10) : I7.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private float e() {
        float f10 = this.f27209e;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private void e0(float f10) {
        h(f10);
        boolean z10 = f27173t0 && this.f27188N != 1.0f;
        this.f27185K = z10;
        if (z10) {
            n();
        }
        AbstractC1484a0.h0(this.f27201a);
    }

    private boolean f(CharSequence charSequence) {
        boolean D10 = D();
        return this.f27184J ? F(charSequence, D10) : D10;
    }

    private void g(float f10) {
        float f11;
        B(f10);
        if (!this.f27207d) {
            this.f27241v = G(this.f27239t, this.f27240u, f10, this.f27198X);
            this.f27242w = G(this.f27235r, this.f27237s, f10, this.f27198X);
            e0(f10);
            f11 = f10;
        } else if (f10 < this.f27211f) {
            this.f27241v = this.f27239t;
            this.f27242w = this.f27235r;
            e0(0.0f);
            f11 = 0.0f;
        } else {
            this.f27241v = this.f27240u;
            this.f27242w = this.f27237s - Math.max(0, this.f27213g);
            e0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = I7.a.f4336b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        Y(G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f27231p != this.f27229o) {
            this.f27196V.setColor(a(v(), t(), f11));
        } else {
            this.f27196V.setColor(t());
        }
        float f12 = this.f27216h0;
        float f13 = this.f27218i0;
        if (f12 != f13) {
            this.f27196V.setLetterSpacing(G(f13, f12, f10, timeInterpolator));
        } else {
            this.f27196V.setLetterSpacing(f12);
        }
        this.f27190P = G(this.f27208d0, this.f27200Z, f10, null);
        this.f27191Q = G(this.f27210e0, this.f27202a0, f10, null);
        this.f27192R = G(this.f27212f0, this.f27204b0, f10, null);
        int a10 = a(u(this.f27214g0), u(this.f27206c0), f10);
        this.f27193S = a10;
        this.f27196V.setShadowLayer(this.f27190P, this.f27191Q, this.f27192R, a10);
        if (this.f27207d) {
            this.f27196V.setAlpha((int) (d(f10) * this.f27196V.getAlpha()));
        }
        AbstractC1484a0.h0(this.f27201a);
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        boolean z12;
        if (this.f27181G == null) {
            return;
        }
        float width = this.f27217i.width();
        float width2 = this.f27215h.width();
        if (C(f10, 1.0f)) {
            f11 = this.f27227n;
            f12 = this.f27216h0;
            this.f27188N = 1.0f;
            Typeface typeface = this.f27178D;
            Typeface typeface2 = this.f27243x;
            if (typeface != typeface2) {
                this.f27178D = typeface2;
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            float f13 = this.f27225m;
            float f14 = this.f27218i0;
            Typeface typeface3 = this.f27178D;
            Typeface typeface4 = this.f27175A;
            if (typeface3 != typeface4) {
                this.f27178D = typeface4;
                z11 = true;
            } else {
                z11 = false;
            }
            if (C(f10, 0.0f)) {
                this.f27188N = 1.0f;
            } else {
                this.f27188N = G(this.f27225m, this.f27227n, f10, this.f27199Y) / this.f27225m;
            }
            float f15 = this.f27227n / this.f27225m;
            width = (!z10 && width2 * f15 > width) ? Math.min(width / f15, width2) : width2;
            f11 = f13;
            f12 = f14;
            z12 = z11;
        }
        if (width > 0.0f) {
            z12 = ((this.f27189O > f11 ? 1 : (this.f27189O == f11 ? 0 : -1)) != 0) || ((this.f27220j0 > f12 ? 1 : (this.f27220j0 == f12 ? 0 : -1)) != 0) || this.f27195U || z12;
            this.f27189O = f11;
            this.f27220j0 = f12;
            this.f27195U = false;
        }
        if (this.f27182H == null || z12) {
            this.f27196V.setTextSize(this.f27189O);
            this.f27196V.setTypeface(this.f27178D);
            this.f27196V.setLetterSpacing(this.f27220j0);
            this.f27196V.setLinearText(this.f27188N != 1.0f);
            this.f27183I = f(this.f27181G);
            StaticLayout k10 = k(k0() ? this.f27232p0 : 1, width, this.f27183I);
            this.f27222k0 = k10;
            this.f27182H = k10.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.f27186L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f27186L = null;
        }
    }

    private StaticLayout k(int i10, float f10, boolean z10) {
        return (StaticLayout) y0.f.g(j.b(this.f27181G, this.f27196V, (int) f10).d(TextUtils.TruncateAt.END).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i10).h(this.f27234q0, this.f27236r0).e(this.f27238s0).a());
    }

    private boolean k0() {
        return this.f27232p0 > 1 && (!this.f27183I || this.f27207d) && !this.f27185K;
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.f27196V.getAlpha();
        canvas.translate(f10, f11);
        float f12 = alpha;
        this.f27196V.setAlpha((int) (this.f27228n0 * f12));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint = this.f27196V;
            textPaint.setShadowLayer(this.f27190P, this.f27191Q, this.f27192R, M7.a.a(this.f27193S, textPaint.getAlpha()));
        }
        this.f27222k0.draw(canvas);
        this.f27196V.setAlpha((int) (this.f27226m0 * f12));
        if (i10 >= 31) {
            TextPaint textPaint2 = this.f27196V;
            textPaint2.setShadowLayer(this.f27190P, this.f27191Q, this.f27192R, M7.a.a(this.f27193S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f27222k0.getLineBaseline(0);
        CharSequence charSequence = this.f27230o0;
        float f13 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, this.f27196V);
        if (i10 >= 31) {
            this.f27196V.setShadowLayer(this.f27190P, this.f27191Q, this.f27192R, this.f27193S);
        }
        if (this.f27207d) {
            return;
        }
        String trim = this.f27230o0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.f27196V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f27222k0.getLineEnd(0), str.length()), 0.0f, f13, (Paint) this.f27196V);
    }

    private void n() {
        if (this.f27186L != null || this.f27215h.isEmpty() || TextUtils.isEmpty(this.f27182H)) {
            return;
        }
        g(0.0f);
        int width = this.f27222k0.getWidth();
        int height = this.f27222k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f27186L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f27222k0.draw(new Canvas(this.f27186L));
        if (this.f27187M == null) {
            this.f27187M = new Paint(3);
        }
    }

    private float r(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) - (this.f27224l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f27183I ? this.f27217i.left : this.f27217i.right - this.f27224l0 : this.f27183I ? this.f27217i.right - this.f27224l0 : this.f27217i.left;
    }

    private float s(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) + (this.f27224l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f27183I ? rectF.left + this.f27224l0 : this.f27217i.right : this.f27183I ? this.f27217i.right : rectF.left + this.f27224l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f27194T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f27229o);
    }

    private Layout.Alignment y() {
        int b10 = AbstractC1518s.b(this.f27221k, this.f27183I ? 1 : 0) & 7;
        return b10 != 1 ? b10 != 5 ? this.f27183I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f27183I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f27227n);
        textPaint.setTypeface(this.f27243x);
        textPaint.setLetterSpacing(this.f27216h0);
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f27231p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f27229o) != null && colorStateList.isStateful());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f27245z;
            if (typeface != null) {
                this.f27244y = V7.i.b(configuration, typeface);
            }
            Typeface typeface2 = this.f27177C;
            if (typeface2 != null) {
                this.f27176B = V7.i.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f27244y;
            if (typeface3 == null) {
                typeface3 = this.f27245z;
            }
            this.f27243x = typeface3;
            Typeface typeface4 = this.f27176B;
            if (typeface4 == null) {
                typeface4 = this.f27177C;
            }
            this.f27175A = typeface4;
            L(true);
        }
    }

    void J() {
        this.f27203b = this.f27217i.width() > 0 && this.f27217i.height() > 0 && this.f27215h.width() > 0 && this.f27215h.height() > 0;
    }

    public void K() {
        L(false);
    }

    public void L(boolean z10) {
        if ((this.f27201a.getHeight() <= 0 || this.f27201a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (M(this.f27217i, i10, i11, i12, i13)) {
            return;
        }
        this.f27217i.set(i10, i11, i12, i13);
        this.f27195U = true;
        J();
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        V7.d dVar = new V7.d(this.f27201a.getContext(), i10);
        if (dVar.i() != null) {
            this.f27231p = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f27227n = dVar.j();
        }
        ColorStateList colorStateList = dVar.f11052c;
        if (colorStateList != null) {
            this.f27206c0 = colorStateList;
        }
        this.f27202a0 = dVar.f11057h;
        this.f27204b0 = dVar.f11058i;
        this.f27200Z = dVar.f11059j;
        this.f27216h0 = dVar.f11061l;
        V7.a aVar = this.f27180F;
        if (aVar != null) {
            aVar.c();
        }
        this.f27180F = new V7.a(new a(), dVar.e());
        dVar.g(this.f27201a.getContext(), this.f27180F);
        K();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f27231p != colorStateList) {
            this.f27231p = colorStateList;
            K();
        }
    }

    public void S(int i10) {
        if (this.f27223l != i10) {
            this.f27223l = i10;
            K();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            K();
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (M(this.f27215h, i10, i11, i12, i13)) {
            return;
        }
        this.f27215h.set(i10, i11, i12, i13);
        this.f27195U = true;
        J();
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f10) {
        if (this.f27218i0 != f10) {
            this.f27218i0 = f10;
            K();
        }
    }

    public void Z(ColorStateList colorStateList) {
        if (this.f27229o != colorStateList) {
            this.f27229o = colorStateList;
            K();
        }
    }

    public void a0(int i10) {
        if (this.f27221k != i10) {
            this.f27221k = i10;
            K();
        }
    }

    public void b0(float f10) {
        if (this.f27225m != f10) {
            this.f27225m = f10;
            K();
        }
    }

    public void d0(float f10) {
        float a10 = AbstractC4860a.a(f10, 0.0f, 1.0f);
        if (a10 != this.f27205c) {
            this.f27205c = a10;
            c();
        }
    }

    public void f0(TimeInterpolator timeInterpolator) {
        this.f27198X = timeInterpolator;
        K();
    }

    public final boolean g0(int[] iArr) {
        this.f27194T = iArr;
        if (!E()) {
            return false;
        }
        K();
        return true;
    }

    public void h0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f27181G, charSequence)) {
            this.f27181G = charSequence;
            this.f27182H = null;
            j();
            K();
        }
    }

    public void i0(TimeInterpolator timeInterpolator) {
        this.f27199Y = timeInterpolator;
        K();
    }

    public void j0(Typeface typeface) {
        boolean U10 = U(typeface);
        boolean c02 = c0(typeface);
        if (U10 || c02) {
            K();
        }
    }

    public void l(Canvas canvas) {
        int save = canvas.save();
        if (this.f27182H == null || !this.f27203b) {
            return;
        }
        this.f27196V.setTextSize(this.f27189O);
        float f10 = this.f27241v;
        float f11 = this.f27242w;
        boolean z10 = this.f27185K && this.f27186L != null;
        float f12 = this.f27188N;
        if (f12 != 1.0f && !this.f27207d) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z10) {
            canvas.drawBitmap(this.f27186L, f10, f11, this.f27187M);
            canvas.restoreToCount(save);
            return;
        }
        if (!k0() || (this.f27207d && this.f27205c <= this.f27211f)) {
            canvas.translate(f10, f11);
            this.f27222k0.draw(canvas);
        } else {
            m(canvas, this.f27241v - this.f27222k0.getLineStart(0), f11);
        }
        canvas.restoreToCount(save);
    }

    public void o(RectF rectF, int i10, int i11) {
        this.f27183I = f(this.f27181G);
        rectF.left = r(i10, i11);
        rectF.top = this.f27217i.top;
        rectF.right = s(rectF, i10, i11);
        rectF.bottom = this.f27217i.top + q();
    }

    public ColorStateList p() {
        return this.f27231p;
    }

    public float q() {
        z(this.f27197W);
        return -this.f27197W.ascent();
    }

    public int t() {
        return u(this.f27231p);
    }

    public float w() {
        A(this.f27197W);
        return -this.f27197W.ascent();
    }

    public float x() {
        return this.f27205c;
    }
}
