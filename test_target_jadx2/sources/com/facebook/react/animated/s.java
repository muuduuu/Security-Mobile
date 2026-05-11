package com.facebook.react.animated;

import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends e {

    /* renamed from: u, reason: collision with root package name */
    public static final a f21340u = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private long f21341e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21342f;

    /* renamed from: g, reason: collision with root package name */
    private double f21343g;

    /* renamed from: h, reason: collision with root package name */
    private double f21344h;

    /* renamed from: i, reason: collision with root package name */
    private double f21345i;

    /* renamed from: j, reason: collision with root package name */
    private double f21346j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21347k;

    /* renamed from: l, reason: collision with root package name */
    private final b f21348l;

    /* renamed from: m, reason: collision with root package name */
    private double f21349m;

    /* renamed from: n, reason: collision with root package name */
    private double f21350n;

    /* renamed from: o, reason: collision with root package name */
    private double f21351o;

    /* renamed from: p, reason: collision with root package name */
    private double f21352p;

    /* renamed from: q, reason: collision with root package name */
    private double f21353q;

    /* renamed from: r, reason: collision with root package name */
    private int f21354r;

    /* renamed from: s, reason: collision with root package name */
    private int f21355s;

    /* renamed from: t, reason: collision with root package name */
    private double f21356t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private double f21357a;

        /* renamed from: b, reason: collision with root package name */
        private double f21358b;

        public b(double d10, double d11) {
            this.f21357a = d10;
            this.f21358b = d11;
        }

        public final double a() {
            return this.f21357a;
        }

        public final double b() {
            return this.f21358b;
        }

        public final void c(double d10) {
            this.f21357a = d10;
        }

        public final void d(double d10) {
            this.f21358b = d10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.f21357a, bVar.f21357a) == 0 && Double.compare(this.f21358b, bVar.f21358b) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.f21357a) * 31) + Double.hashCode(this.f21358b);
        }

        public String toString() {
            return "PhysicsState(position=" + this.f21357a + ", velocity=" + this.f21358b + ")";
        }

        public /* synthetic */ b(double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11);
        }
    }

    public s(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        b bVar = new b(0.0d, 0.0d, 3, null);
        this.f21348l = bVar;
        bVar.d(config.getDouble("initialVelocity"));
        a(config);
    }

    private final void c(double d10) {
        double d11;
        double d12;
        if (e()) {
            return;
        }
        this.f21353q += d10 <= 0.064d ? d10 : 0.064d;
        double d13 = this.f21344h;
        double d14 = this.f21345i;
        double d15 = this.f21343g;
        double d16 = -this.f21346j;
        double sqrt = d13 / (2 * Math.sqrt(d15 * d14));
        double sqrt2 = Math.sqrt(d15 / d14);
        double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
        double d17 = this.f21350n - this.f21349m;
        double d18 = this.f21353q;
        if (sqrt < 1.0d) {
            double exp = Math.exp((-sqrt) * sqrt2 * d18);
            double d19 = sqrt * sqrt2;
            double d20 = d16 + (d19 * d17);
            double d21 = d18 * sqrt3;
            d12 = this.f21350n - ((((d20 / sqrt3) * Math.sin(d21)) + (Math.cos(d21) * d17)) * exp);
            d11 = ((d19 * exp) * (((Math.sin(d21) * d20) / sqrt3) + (Math.cos(d21) * d17))) - (((Math.cos(d21) * d20) - ((sqrt3 * d17) * Math.sin(d21))) * exp);
        } else {
            double exp2 = Math.exp((-sqrt2) * d18);
            double d22 = this.f21350n - (((((sqrt2 * d17) + d16) * d18) + d17) * exp2);
            d11 = exp2 * ((d16 * ((d18 * sqrt2) - 1)) + (d18 * d17 * sqrt2 * sqrt2));
            d12 = d22;
        }
        this.f21348l.c(d12);
        this.f21348l.d(d11);
        if (e() || (this.f21347k && f())) {
            if (this.f21343g > 0.0d) {
                double d23 = this.f21350n;
                this.f21349m = d23;
                this.f21348l.c(d23);
            } else {
                double a10 = this.f21348l.a();
                this.f21350n = a10;
                this.f21349m = a10;
            }
            this.f21348l.d(0.0d);
        }
    }

    private final double d(b bVar) {
        return Math.abs(this.f21350n - bVar.a());
    }

    private final boolean e() {
        return Math.abs(this.f21348l.b()) <= this.f21351o && (d(this.f21348l) <= this.f21352p || this.f21343g == 0.0d);
    }

    private final boolean f() {
        return this.f21343g > 0.0d && ((this.f21349m < this.f21350n && this.f21348l.a() > this.f21350n) || (this.f21349m > this.f21350n && this.f21348l.a() < this.f21350n));
    }

    @Override // com.facebook.react.animated.e
    public void a(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f21343g = config.getDouble("stiffness");
        this.f21344h = config.getDouble("damping");
        this.f21345i = config.getDouble("mass");
        this.f21346j = this.f21348l.b();
        this.f21350n = config.getDouble("toValue");
        this.f21351o = config.getDouble("restSpeedThreshold");
        this.f21352p = config.getDouble("restDisplacementThreshold");
        this.f21347k = config.getBoolean("overshootClamping");
        int i10 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.f21354r = i10;
        this.f21268a = i10 == 0;
        this.f21355s = 0;
        this.f21353q = 0.0d;
        this.f21342f = false;
    }

    @Override // com.facebook.react.animated.e
    public void b(long j10) {
        x xVar = this.f21269b;
        if (xVar == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        long j11 = j10 / HVFrameRecorder.BITRATE;
        if (!this.f21342f) {
            if (this.f21355s == 0) {
                this.f21356t = xVar.f21376f;
                this.f21355s = 1;
            }
            this.f21348l.c(xVar.f21376f);
            this.f21349m = this.f21348l.a();
            this.f21341e = j11;
            this.f21353q = 0.0d;
            this.f21342f = true;
        }
        c((j11 - this.f21341e) / 1000.0d);
        this.f21341e = j11;
        xVar.f21376f = this.f21348l.a();
        if (e()) {
            int i10 = this.f21354r;
            if (i10 != -1 && this.f21355s >= i10) {
                this.f21268a = true;
                return;
            }
            this.f21342f = false;
            xVar.f21376f = this.f21356t;
            this.f21355s++;
        }
    }
}
