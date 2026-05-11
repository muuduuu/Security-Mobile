package Q0;

import Q0.b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    double f7886a;

    /* renamed from: b, reason: collision with root package name */
    double f7887b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7888c;

    /* renamed from: d, reason: collision with root package name */
    private double f7889d;

    /* renamed from: e, reason: collision with root package name */
    private double f7890e;

    /* renamed from: f, reason: collision with root package name */
    private double f7891f;

    /* renamed from: g, reason: collision with root package name */
    private double f7892g;

    /* renamed from: h, reason: collision with root package name */
    private double f7893h;

    /* renamed from: i, reason: collision with root package name */
    private double f7894i;

    /* renamed from: j, reason: collision with root package name */
    private final b.p f7895j;

    public g() {
        this.f7886a = Math.sqrt(1500.0d);
        this.f7887b = 0.5d;
        this.f7888c = false;
        this.f7894i = Double.MAX_VALUE;
        this.f7895j = new b.p();
    }

    private void b() {
        if (this.f7888c) {
            return;
        }
        if (this.f7894i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f7887b;
        if (d10 > 1.0d) {
            double d11 = this.f7886a;
            this.f7891f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f7887b;
            double d13 = this.f7886a;
            this.f7892g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f7893h = this.f7886a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f7888c = true;
    }

    public float a() {
        return (float) this.f7894i;
    }

    public boolean c(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f7890e && ((double) Math.abs(f10 - a())) < this.f7889d;
    }

    public g d(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f7887b = f10;
        this.f7888c = false;
        return this;
    }

    public g e(float f10) {
        this.f7894i = f10;
        return this;
    }

    public g f(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f7886a = Math.sqrt(f10);
        this.f7888c = false;
        return this;
    }

    void g(double d10) {
        double abs = Math.abs(d10);
        this.f7889d = abs;
        this.f7890e = abs * 62.5d;
    }

    b.p h(double d10, double d11, long j10) {
        double cos;
        double d12;
        b();
        double d13 = j10 / 1000.0d;
        double d14 = d10 - this.f7894i;
        double d15 = this.f7887b;
        if (d15 > 1.0d) {
            double d16 = this.f7892g;
            double d17 = this.f7891f;
            double d18 = d14 - (((d16 * d14) - d11) / (d16 - d17));
            double d19 = ((d14 * d16) - d11) / (d16 - d17);
            d12 = (Math.pow(2.718281828459045d, d16 * d13) * d18) + (Math.pow(2.718281828459045d, this.f7891f * d13) * d19);
            double d20 = this.f7892g;
            double pow = d18 * d20 * Math.pow(2.718281828459045d, d20 * d13);
            double d21 = this.f7891f;
            cos = pow + (d19 * d21 * Math.pow(2.718281828459045d, d21 * d13));
        } else if (d15 == 1.0d) {
            double d22 = this.f7886a;
            double d23 = d11 + (d22 * d14);
            double d24 = d14 + (d23 * d13);
            d12 = Math.pow(2.718281828459045d, (-d22) * d13) * d24;
            double pow2 = d24 * Math.pow(2.718281828459045d, (-this.f7886a) * d13);
            double d25 = this.f7886a;
            cos = (d23 * Math.pow(2.718281828459045d, (-d25) * d13)) + (pow2 * (-d25));
        } else {
            double d26 = 1.0d / this.f7893h;
            double d27 = this.f7886a;
            double d28 = d26 * ((d15 * d27 * d14) + d11);
            double pow3 = Math.pow(2.718281828459045d, (-d15) * d27 * d13) * ((Math.cos(this.f7893h * d13) * d14) + (Math.sin(this.f7893h * d13) * d28));
            double d29 = this.f7886a;
            double d30 = this.f7887b;
            double d31 = (-d29) * pow3 * d30;
            double pow4 = Math.pow(2.718281828459045d, (-d30) * d29 * d13);
            double d32 = this.f7893h;
            double sin = (-d32) * d14 * Math.sin(d32 * d13);
            double d33 = this.f7893h;
            cos = d31 + (pow4 * (sin + (d28 * d33 * Math.cos(d33 * d13))));
            d12 = pow3;
        }
        b.p pVar = this.f7895j;
        pVar.f7877a = (float) (d12 + this.f7894i);
        pVar.f7878b = (float) cos;
        return pVar;
    }

    public g(float f10) {
        this.f7886a = Math.sqrt(1500.0d);
        this.f7887b = 0.5d;
        this.f7888c = false;
        this.f7894i = Double.MAX_VALUE;
        this.f7895j = new b.p();
        this.f7894i = f10;
    }
}
