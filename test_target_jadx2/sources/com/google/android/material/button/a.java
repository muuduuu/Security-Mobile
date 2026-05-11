package com.google.android.material.button;

import H7.b;
import H7.l;
import V7.c;
import Y7.g;
import Y7.k;
import Y7.n;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.internal.o;

/* loaded from: classes2.dex */
class a {

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f26770t = true;

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f26771u = false;

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f26772a;

    /* renamed from: b, reason: collision with root package name */
    private k f26773b;

    /* renamed from: c, reason: collision with root package name */
    private int f26774c;

    /* renamed from: d, reason: collision with root package name */
    private int f26775d;

    /* renamed from: e, reason: collision with root package name */
    private int f26776e;

    /* renamed from: f, reason: collision with root package name */
    private int f26777f;

    /* renamed from: g, reason: collision with root package name */
    private int f26778g;

    /* renamed from: h, reason: collision with root package name */
    private int f26779h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f26780i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f26781j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f26782k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f26783l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f26784m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26785n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f26786o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f26787p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26788q;

    /* renamed from: r, reason: collision with root package name */
    private LayerDrawable f26789r;

    /* renamed from: s, reason: collision with root package name */
    private int f26790s;

    a(MaterialButton materialButton, k kVar) {
        this.f26772a = materialButton;
        this.f26773b = kVar;
    }

    private void E(int i10, int i11) {
        int F10 = AbstractC1484a0.F(this.f26772a);
        int paddingTop = this.f26772a.getPaddingTop();
        int E10 = AbstractC1484a0.E(this.f26772a);
        int paddingBottom = this.f26772a.getPaddingBottom();
        int i12 = this.f26776e;
        int i13 = this.f26777f;
        this.f26777f = i11;
        this.f26776e = i10;
        if (!this.f26786o) {
            F();
        }
        AbstractC1484a0.G0(this.f26772a, F10, (paddingTop + i10) - i12, E10, (paddingBottom + i11) - i13);
    }

    private void F() {
        this.f26772a.setInternalBackground(a());
        g f10 = f();
        if (f10 != null) {
            f10.W(this.f26790s);
        }
    }

    private void G(k kVar) {
        if (f26771u && !this.f26786o) {
            int F10 = AbstractC1484a0.F(this.f26772a);
            int paddingTop = this.f26772a.getPaddingTop();
            int E10 = AbstractC1484a0.E(this.f26772a);
            int paddingBottom = this.f26772a.getPaddingBottom();
            F();
            AbstractC1484a0.G0(this.f26772a, F10, paddingTop, E10, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void H() {
        g f10 = f();
        g n10 = n();
        if (f10 != null) {
            f10.c0(this.f26779h, this.f26782k);
            if (n10 != null) {
                n10.b0(this.f26779h, this.f26785n ? M7.a.d(this.f26772a, b.f3143p) : 0);
            }
        }
    }

    private InsetDrawable I(Drawable drawable) {
        return new InsetDrawable(drawable, this.f26774c, this.f26776e, this.f26775d, this.f26777f);
    }

    private Drawable a() {
        g gVar = new g(this.f26773b);
        gVar.M(this.f26772a.getContext());
        androidx.core.graphics.drawable.a.i(gVar, this.f26781j);
        PorterDuff.Mode mode = this.f26780i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.j(gVar, mode);
        }
        gVar.c0(this.f26779h, this.f26782k);
        g gVar2 = new g(this.f26773b);
        gVar2.setTint(0);
        gVar2.b0(this.f26779h, this.f26785n ? M7.a.d(this.f26772a, b.f3143p) : 0);
        if (f26770t) {
            g gVar3 = new g(this.f26773b);
            this.f26784m = gVar3;
            androidx.core.graphics.drawable.a.h(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(W7.b.d(this.f26783l), I(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f26784m);
            this.f26789r = rippleDrawable;
            return rippleDrawable;
        }
        W7.a aVar = new W7.a(this.f26773b);
        this.f26784m = aVar;
        androidx.core.graphics.drawable.a.i(aVar, W7.b.d(this.f26783l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f26784m});
        this.f26789r = layerDrawable;
        return I(layerDrawable);
    }

    private g g(boolean z10) {
        LayerDrawable layerDrawable = this.f26789r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f26770t ? (g) ((LayerDrawable) ((InsetDrawable) this.f26789r.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0) : (g) this.f26789r.getDrawable(!z10 ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    void A(ColorStateList colorStateList) {
        if (this.f26782k != colorStateList) {
            this.f26782k = colorStateList;
            H();
        }
    }

    void B(int i10) {
        if (this.f26779h != i10) {
            this.f26779h = i10;
            H();
        }
    }

    void C(ColorStateList colorStateList) {
        if (this.f26781j != colorStateList) {
            this.f26781j = colorStateList;
            if (f() != null) {
                androidx.core.graphics.drawable.a.i(f(), this.f26781j);
            }
        }
    }

    void D(PorterDuff.Mode mode) {
        if (this.f26780i != mode) {
            this.f26780i = mode;
            if (f() == null || this.f26780i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.j(f(), this.f26780i);
        }
    }

    int b() {
        return this.f26778g;
    }

    public int c() {
        return this.f26777f;
    }

    public int d() {
        return this.f26776e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f26789r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f26789r.getNumberOfLayers() > 2 ? (n) this.f26789r.getDrawable(2) : (n) this.f26789r.getDrawable(1);
    }

    g f() {
        return g(false);
    }

    ColorStateList h() {
        return this.f26783l;
    }

    k i() {
        return this.f26773b;
    }

    ColorStateList j() {
        return this.f26782k;
    }

    int k() {
        return this.f26779h;
    }

    ColorStateList l() {
        return this.f26781j;
    }

    PorterDuff.Mode m() {
        return this.f26780i;
    }

    boolean o() {
        return this.f26786o;
    }

    boolean p() {
        return this.f26788q;
    }

    void q(TypedArray typedArray) {
        this.f26774c = typedArray.getDimensionPixelOffset(l.f3597b3, 0);
        this.f26775d = typedArray.getDimensionPixelOffset(l.f3606c3, 0);
        this.f26776e = typedArray.getDimensionPixelOffset(l.f3615d3, 0);
        this.f26777f = typedArray.getDimensionPixelOffset(l.f3624e3, 0);
        if (typedArray.hasValue(l.f3660i3)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(l.f3660i3, -1);
            this.f26778g = dimensionPixelSize;
            y(this.f26773b.w(dimensionPixelSize));
            this.f26787p = true;
        }
        this.f26779h = typedArray.getDimensionPixelSize(l.f3750s3, 0);
        this.f26780i = o.f(typedArray.getInt(l.f3651h3, -1), PorterDuff.Mode.SRC_IN);
        this.f26781j = c.a(this.f26772a.getContext(), typedArray, l.f3642g3);
        this.f26782k = c.a(this.f26772a.getContext(), typedArray, l.f3741r3);
        this.f26783l = c.a(this.f26772a.getContext(), typedArray, l.f3732q3);
        this.f26788q = typedArray.getBoolean(l.f3633f3, false);
        this.f26790s = typedArray.getDimensionPixelSize(l.f3669j3, 0);
        int F10 = AbstractC1484a0.F(this.f26772a);
        int paddingTop = this.f26772a.getPaddingTop();
        int E10 = AbstractC1484a0.E(this.f26772a);
        int paddingBottom = this.f26772a.getPaddingBottom();
        if (typedArray.hasValue(l.f3588a3)) {
            s();
        } else {
            F();
        }
        AbstractC1484a0.G0(this.f26772a, F10 + this.f26774c, paddingTop + this.f26776e, E10 + this.f26775d, paddingBottom + this.f26777f);
    }

    void r(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    void s() {
        this.f26786o = true;
        this.f26772a.setSupportBackgroundTintList(this.f26781j);
        this.f26772a.setSupportBackgroundTintMode(this.f26780i);
    }

    void t(boolean z10) {
        this.f26788q = z10;
    }

    void u(int i10) {
        if (this.f26787p && this.f26778g == i10) {
            return;
        }
        this.f26778g = i10;
        this.f26787p = true;
        y(this.f26773b.w(i10));
    }

    public void v(int i10) {
        E(this.f26776e, i10);
    }

    public void w(int i10) {
        E(i10, this.f26777f);
    }

    void x(ColorStateList colorStateList) {
        if (this.f26783l != colorStateList) {
            this.f26783l = colorStateList;
            boolean z10 = f26770t;
            if (z10 && (this.f26772a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f26772a.getBackground()).setColor(W7.b.d(colorStateList));
            } else {
                if (z10 || !(this.f26772a.getBackground() instanceof W7.a)) {
                    return;
                }
                ((W7.a) this.f26772a.getBackground()).setTintList(W7.b.d(colorStateList));
            }
        }
    }

    void y(k kVar) {
        this.f26773b = kVar;
        G(kVar);
    }

    void z(boolean z10) {
        this.f26785n = z10;
        H();
    }
}
