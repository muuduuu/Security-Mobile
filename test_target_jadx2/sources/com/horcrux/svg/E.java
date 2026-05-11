package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.C2898a;

/* loaded from: classes2.dex */
class E extends C2923z {

    /* renamed from: f, reason: collision with root package name */
    SVGLength f28867f;

    /* renamed from: g, reason: collision with root package name */
    SVGLength f28868g;

    /* renamed from: h, reason: collision with root package name */
    SVGLength f28869h;

    /* renamed from: i, reason: collision with root package name */
    SVGLength f28870i;

    /* renamed from: j, reason: collision with root package name */
    private C2898a.b f28871j;

    /* renamed from: k, reason: collision with root package name */
    private C2898a.b f28872k;

    /* renamed from: l, reason: collision with root package name */
    a f28873l;

    enum a {
        LUMINANCE,
        ALPHA
    }

    public E(ReactContext reactContext) {
        super(reactContext);
    }

    public a C() {
        return this.f28873l;
    }

    public C2898a.b D() {
        return this.f28871j;
    }

    public void E(Dynamic dynamic) {
        this.f28870i = SVGLength.b(dynamic);
        invalidate();
    }

    public void F(int i10) {
        if (i10 == 0) {
            this.f28872k = C2898a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f28872k = C2898a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void G(int i10) {
        if (i10 == 0) {
            this.f28873l = a.LUMINANCE;
        } else if (i10 == 1) {
            this.f28873l = a.ALPHA;
        }
        invalidate();
    }

    public void H(int i10) {
        if (i10 == 0) {
            this.f28871j = C2898a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f28871j = C2898a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void I(Dynamic dynamic) {
        this.f28869h = SVGLength.b(dynamic);
        invalidate();
    }

    public void J(Dynamic dynamic) {
        this.f28867f = SVGLength.b(dynamic);
        invalidate();
    }

    public void K(Dynamic dynamic) {
        this.f28868g = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.C2923z, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }
}
