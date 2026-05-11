package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import s1.AbstractC4306a;

/* loaded from: classes2.dex */
public final class j extends g {

    /* renamed from: p, reason: collision with root package name */
    private h f27374p;

    /* renamed from: q, reason: collision with root package name */
    private i f27375q;

    j(Context context, b bVar, h hVar, i iVar) {
        super(context, bVar);
        w(hVar);
        v(iVar);
    }

    public static j s(Context context, e eVar) {
        return new j(context, eVar, new c(eVar), new d(eVar));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.f27374p.g(canvas, g());
        this.f27374p.c(canvas, this.f27365m);
        int i10 = 0;
        while (true) {
            i iVar = this.f27375q;
            int[] iArr = iVar.f27373c;
            if (i10 >= iArr.length) {
                canvas.restore();
                return;
            }
            h hVar = this.f27374p;
            Paint paint = this.f27365m;
            float[] fArr = iVar.f27372b;
            int i11 = i10 * 2;
            hVar.b(canvas, paint, fArr[i11], fArr[i11 + 1], iArr[i10]);
            i10++;
        }
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f27374p.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f27374p.e();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean h() {
        return super.h();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ void l(AbstractC4306a abstractC4306a) {
        super.l(abstractC4306a);
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean p(boolean z10, boolean z11, boolean z12) {
        return super.p(z10, z11, z12);
    }

    @Override // com.google.android.material.progressindicator.g
    boolean q(boolean z10, boolean z11, boolean z12) {
        boolean q10 = super.q(z10, z11, z12);
        if (!isRunning()) {
            this.f27375q.a();
        }
        this.f27355c.a(this.f27353a.getContentResolver());
        if (z10 && z12) {
            this.f27375q.g();
        }
        return q10;
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean r(AbstractC4306a abstractC4306a) {
        return super.r(abstractC4306a);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    i t() {
        return this.f27375q;
    }

    h u() {
        return this.f27374p;
    }

    void v(i iVar) {
        this.f27375q = iVar;
        iVar.e(this);
    }

    void w(h hVar) {
        this.f27374p = hVar;
        hVar.f(this);
    }
}
