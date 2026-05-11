package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import s1.AbstractC4306a;

/* loaded from: classes2.dex */
public final class f extends g {

    /* renamed from: u, reason: collision with root package name */
    private static final Q0.d f27346u = new a("indicatorLevel");

    /* renamed from: p, reason: collision with root package name */
    private h f27347p;

    /* renamed from: q, reason: collision with root package name */
    private final Q0.g f27348q;

    /* renamed from: r, reason: collision with root package name */
    private final Q0.f f27349r;

    /* renamed from: s, reason: collision with root package name */
    private float f27350s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27351t;

    class a extends Q0.d {
        a(String str) {
            super(str);
        }

        @Override // Q0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(f fVar) {
            return fVar.w() * 10000.0f;
        }

        @Override // Q0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, float f10) {
            fVar.y(f10 / 10000.0f);
        }
    }

    f(Context context, b bVar, h hVar) {
        super(context, bVar);
        this.f27351t = false;
        x(hVar);
        Q0.g gVar = new Q0.g();
        this.f27348q = gVar;
        gVar.d(1.0f);
        gVar.f(50.0f);
        Q0.f fVar = new Q0.f(this, f27346u);
        this.f27349r = fVar;
        fVar.t(gVar);
        m(1.0f);
    }

    public static f u(Context context, e eVar) {
        return new f(context, eVar, new c(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float w() {
        return this.f27350s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(float f10) {
        this.f27350s = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f27347p.g(canvas, g());
            this.f27347p.c(canvas, this.f27365m);
            this.f27347p.b(canvas, this.f27365m, 0.0f, w(), M7.a.a(this.f27354b.f27320c[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f27347p.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f27347p.e();
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

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f27349r.u();
        y(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ void l(AbstractC4306a abstractC4306a) {
        super.l(abstractC4306a);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        if (this.f27351t) {
            this.f27349r.u();
            y(i10 / 10000.0f);
            return true;
        }
        this.f27349r.j(w() * 10000.0f);
        this.f27349r.o(i10);
        return true;
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean p(boolean z10, boolean z11, boolean z12) {
        return super.p(z10, z11, z12);
    }

    @Override // com.google.android.material.progressindicator.g
    boolean q(boolean z10, boolean z11, boolean z12) {
        boolean q10 = super.q(z10, z11, z12);
        float a10 = this.f27355c.a(this.f27353a.getContentResolver());
        if (a10 == 0.0f) {
            this.f27351t = true;
        } else {
            this.f27351t = false;
            this.f27348q.f(50.0f / a10);
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

    h v() {
        return this.f27347p;
    }

    void x(h hVar) {
        this.f27347p = hVar;
        hVar.f(this);
    }

    void z(float f10) {
        setLevel((int) (f10 * 10000.0f));
    }
}
