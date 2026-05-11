package com.facebook.react.views.text;

import c3.AbstractC1721a;
import com.facebook.react.uimanager.C1944g0;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private boolean f22871a = true;

    /* renamed from: b, reason: collision with root package name */
    private float f22872b = Float.NaN;

    /* renamed from: c, reason: collision with root package name */
    private float f22873c = Float.NaN;

    /* renamed from: d, reason: collision with root package name */
    private float f22874d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    private float f22875e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    private float f22876f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    private t f22877g = t.UNSET;

    public r a(r rVar) {
        r rVar2 = new r();
        rVar2.f22871a = this.f22871a;
        rVar2.f22872b = !Float.isNaN(rVar.f22872b) ? rVar.f22872b : this.f22872b;
        rVar2.f22873c = !Float.isNaN(rVar.f22873c) ? rVar.f22873c : this.f22873c;
        rVar2.f22874d = !Float.isNaN(rVar.f22874d) ? rVar.f22874d : this.f22874d;
        rVar2.f22875e = !Float.isNaN(rVar.f22875e) ? rVar.f22875e : this.f22875e;
        rVar2.f22876f = !Float.isNaN(rVar.f22876f) ? rVar.f22876f : this.f22876f;
        t tVar = rVar.f22877g;
        if (tVar == t.UNSET) {
            tVar = this.f22877g;
        }
        rVar2.f22877g = tVar;
        return rVar2;
    }

    public boolean b() {
        return this.f22871a;
    }

    public int c() {
        float f10 = !Float.isNaN(this.f22872b) ? this.f22872b : 14.0f;
        return (int) (this.f22871a ? Math.ceil(C1944g0.j(f10, f())) : Math.ceil(C1944g0.g(f10)));
    }

    public float d() {
        if (Float.isNaN(this.f22874d)) {
            return Float.NaN;
        }
        return (this.f22871a ? C1944g0.j(this.f22874d, f()) : C1944g0.g(this.f22874d)) / c();
    }

    public float e() {
        if (Float.isNaN(this.f22873c)) {
            return Float.NaN;
        }
        float j10 = this.f22871a ? C1944g0.j(this.f22873c, f()) : C1944g0.g(this.f22873c);
        if (Float.isNaN(this.f22876f)) {
            return j10;
        }
        float f10 = this.f22876f;
        return f10 > j10 ? f10 : j10;
    }

    public float f() {
        if (Float.isNaN(this.f22875e)) {
            return 0.0f;
        }
        return this.f22875e;
    }

    public float g() {
        return this.f22872b;
    }

    public float h() {
        return this.f22876f;
    }

    public float i() {
        return this.f22874d;
    }

    public float j() {
        return this.f22873c;
    }

    public float k() {
        return this.f22875e;
    }

    public t l() {
        return this.f22877g;
    }

    public void m(boolean z10) {
        this.f22871a = z10;
    }

    public void n(float f10) {
        this.f22872b = f10;
    }

    public void o(float f10) {
        this.f22876f = f10;
    }

    public void p(float f10) {
        this.f22874d = f10;
    }

    public void q(float f10) {
        this.f22873c = f10;
    }

    public void r(float f10) {
        if (f10 == 0.0f || f10 >= 1.0f) {
            this.f22875e = f10;
        } else {
            AbstractC1721a.J("ReactNative", "maxFontSizeMultiplier must be NaN, 0, or >= 1");
            this.f22875e = Float.NaN;
        }
    }

    public void s(t tVar) {
        this.f22877g = tVar;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + b() + "\n  getFontSize(): " + g() + "\n  getEffectiveFontSize(): " + c() + "\n  getHeightOfTallestInlineViewOrImage(): " + h() + "\n  getLetterSpacing(): " + i() + "\n  getEffectiveLetterSpacing(): " + d() + "\n  getLineHeight(): " + j() + "\n  getEffectiveLineHeight(): " + e() + "\n  getTextTransform(): " + l() + "\n  getMaxFontSizeMultiplier(): " + k() + "\n  getEffectiveMaxFontSizeMultiplier(): " + f() + "\n}";
    }
}
