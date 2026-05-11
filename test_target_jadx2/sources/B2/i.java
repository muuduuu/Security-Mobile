package b2;

import O1.AbstractC1034e;
import O1.C1038i;
import android.view.Choreographer;

/* loaded from: classes.dex */
public class i extends AbstractC1645c implements Choreographer.FrameCallback {

    /* renamed from: l, reason: collision with root package name */
    private C1038i f18530l;

    /* renamed from: d, reason: collision with root package name */
    private float f18522d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18523e = false;

    /* renamed from: f, reason: collision with root package name */
    private long f18524f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float f18525g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f18526h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private int f18527i = 0;

    /* renamed from: j, reason: collision with root package name */
    private float f18528j = -2.1474836E9f;

    /* renamed from: k, reason: collision with root package name */
    private float f18529k = 2.1474836E9f;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f18531m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f18532n = false;

    private void O() {
        if (this.f18530l == null) {
            return;
        }
        float f10 = this.f18526h;
        if (f10 < this.f18528j || f10 > this.f18529k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f18528j), Float.valueOf(this.f18529k), Float.valueOf(this.f18526h)));
        }
    }

    private float q() {
        C1038i c1038i = this.f18530l;
        if (c1038i == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c1038i.i()) / Math.abs(this.f18522d);
    }

    private boolean x() {
        return w() < 0.0f;
    }

    protected void A() {
        if (isRunning()) {
            C(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void B() {
        C(true);
    }

    protected void C(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f18531m = false;
        }
    }

    public void D() {
        this.f18531m = true;
        A();
        this.f18524f = 0L;
        if (x() && p() == v()) {
            H(s());
        } else if (!x() && p() == s()) {
            H(v());
        }
        i();
    }

    public void E() {
        M(-w());
    }

    public void G(C1038i c1038i) {
        boolean z10 = this.f18530l == null;
        this.f18530l = c1038i;
        if (z10) {
            K(Math.max(this.f18528j, c1038i.p()), Math.min(this.f18529k, c1038i.f()));
        } else {
            K((int) c1038i.p(), (int) c1038i.f());
        }
        float f10 = this.f18526h;
        this.f18526h = 0.0f;
        this.f18525g = 0.0f;
        H((int) f10);
        l();
    }

    public void H(float f10) {
        if (this.f18525g == f10) {
            return;
        }
        float b10 = k.b(f10, v(), s());
        this.f18525g = b10;
        if (this.f18532n) {
            b10 = (float) Math.floor(b10);
        }
        this.f18526h = b10;
        this.f18524f = 0L;
        l();
    }

    public void J(float f10) {
        K(this.f18528j, f10);
    }

    public void K(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        C1038i c1038i = this.f18530l;
        float p10 = c1038i == null ? -3.4028235E38f : c1038i.p();
        C1038i c1038i2 = this.f18530l;
        float f12 = c1038i2 == null ? Float.MAX_VALUE : c1038i2.f();
        float b10 = k.b(f10, p10, f12);
        float b11 = k.b(f11, p10, f12);
        if (b10 == this.f18528j && b11 == this.f18529k) {
            return;
        }
        this.f18528j = b10;
        this.f18529k = b11;
        H((int) k.b(this.f18526h, b10, b11));
    }

    public void L(int i10) {
        K(i10, (int) this.f18529k);
    }

    public void M(float f10) {
        this.f18522d = f10;
    }

    public void N(boolean z10) {
        this.f18532n = z10;
    }

    @Override // b2.AbstractC1645c
    void a() {
        super.a();
        b(x());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        B();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        A();
        if (this.f18530l == null || !isRunning()) {
            return;
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("LottieValueAnimator#doFrame");
        }
        float q10 = (this.f18524f != 0 ? j10 - r2 : 0L) / q();
        float f10 = this.f18525g;
        if (x()) {
            q10 = -q10;
        }
        float f11 = f10 + q10;
        boolean d10 = k.d(f11, v(), s());
        float f12 = this.f18525g;
        float b10 = k.b(f11, v(), s());
        this.f18525g = b10;
        if (this.f18532n) {
            b10 = (float) Math.floor(b10);
        }
        this.f18526h = b10;
        this.f18524f = j10;
        if (!this.f18532n || this.f18525g != f12) {
            l();
        }
        if (!d10) {
            if (getRepeatCount() == -1 || this.f18527i < getRepeatCount()) {
                h();
                this.f18527i++;
                if (getRepeatMode() == 2) {
                    this.f18523e = !this.f18523e;
                    E();
                } else {
                    float s10 = x() ? s() : v();
                    this.f18525g = s10;
                    this.f18526h = s10;
                }
                this.f18524f = j10;
            } else {
                float v10 = this.f18522d < 0.0f ? v() : s();
                this.f18525g = v10;
                this.f18526h = v10;
                B();
                b(x());
            }
        }
        O();
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float v10;
        float s10;
        float v11;
        if (this.f18530l == null) {
            return 0.0f;
        }
        if (x()) {
            v10 = s() - this.f18526h;
            s10 = s();
            v11 = v();
        } else {
            v10 = this.f18526h - v();
            s10 = s();
            v11 = v();
        }
        return v10 / (s10 - v11);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(o());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C1038i c1038i = this.f18530l;
        if (c1038i == null) {
            return 0L;
        }
        return (long) c1038i.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f18531m;
    }

    public void m() {
        this.f18530l = null;
        this.f18528j = -2.1474836E9f;
        this.f18529k = 2.1474836E9f;
    }

    public void n() {
        B();
        b(x());
    }

    public float o() {
        C1038i c1038i = this.f18530l;
        if (c1038i == null) {
            return 0.0f;
        }
        return (this.f18526h - c1038i.p()) / (this.f18530l.f() - this.f18530l.p());
    }

    public float p() {
        return this.f18526h;
    }

    public float s() {
        C1038i c1038i = this.f18530l;
        if (c1038i == null) {
            return 0.0f;
        }
        float f10 = this.f18529k;
        return f10 == 2.1474836E9f ? c1038i.f() : f10;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f18523e) {
            return;
        }
        this.f18523e = false;
        E();
    }

    public float v() {
        C1038i c1038i = this.f18530l;
        if (c1038i == null) {
            return 0.0f;
        }
        float f10 = this.f18528j;
        return f10 == -2.1474836E9f ? c1038i.p() : f10;
    }

    public float w() {
        return this.f18522d;
    }

    public void y() {
        B();
        d();
    }

    public void z() {
        this.f18531m = true;
        k(x());
        H((int) (x() ? s() : v()));
        this.f18524f = 0L;
        this.f18527i = 0;
        A();
    }
}
