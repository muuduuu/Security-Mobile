package com.webengage.sdk.android;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* loaded from: classes2.dex */
public class v0 extends TypefaceSpan {

    /* renamed from: a, reason: collision with root package name */
    private final u0 f31043a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31044b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31045c;

    public v0(u0 u0Var) {
        super(u0Var == null ? null : u0Var.e());
        this.f31043a = u0Var;
    }

    public u0 a() {
        return this.f31043a;
    }

    public void b(boolean z10) {
        this.f31045c = z10;
    }

    public boolean c() {
        return this.f31045c;
    }

    @Override // android.text.style.TypefaceSpan
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n");
        if (this.f31043a != null) {
            sb2.append("  font-family: ");
            sb2.append(this.f31043a.e());
            sb2.append("\n");
        }
        sb2.append("  bold: ");
        sb2.append(b());
        sb2.append("\n");
        sb2.append("  italic: ");
        sb2.append(c());
        sb2.append("\n");
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.f31043a);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint, this.f31043a);
    }

    private void a(Paint paint, u0 u0Var) {
        paint.setAntiAlias(true);
        paint.setTypeface(u0Var.c());
        if (this.f31044b) {
            if (u0Var.f()) {
                paint.setFakeBoldText(true);
            } else {
                paint.setTypeface(u0Var.b());
            }
        }
        if (this.f31045c) {
            if (u0Var.g()) {
                paint.setTextSkewX(-0.25f);
            } else {
                paint.setTypeface(u0Var.d());
            }
        }
        if (this.f31044b && this.f31045c && u0Var.a() != null) {
            paint.setTypeface(u0Var.a());
        }
    }

    public boolean b() {
        return this.f31044b;
    }

    public void a(boolean z10) {
        this.f31044b = z10;
    }
}
