package A;

import android.util.Rational;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    private int f93a;

    /* renamed from: b, reason: collision with root package name */
    private Rational f94b;

    /* renamed from: c, reason: collision with root package name */
    private int f95c;

    /* renamed from: d, reason: collision with root package name */
    private int f96d;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private final Rational f98b;

        /* renamed from: c, reason: collision with root package name */
        private final int f99c;

        /* renamed from: a, reason: collision with root package name */
        private int f97a = 1;

        /* renamed from: d, reason: collision with root package name */
        private int f100d = 0;

        public a(Rational rational, int i10) {
            this.f98b = rational;
            this.f99c = i10;
        }

        public L0 a() {
            y0.f.h(this.f98b, "The crop aspect ratio must be set.");
            return new L0(this.f97a, this.f98b, this.f99c, this.f100d);
        }

        public a b(int i10) {
            this.f100d = i10;
            return this;
        }

        public a c(int i10) {
            this.f97a = i10;
            return this;
        }
    }

    L0(int i10, Rational rational, int i11, int i12) {
        this.f93a = i10;
        this.f94b = rational;
        this.f95c = i11;
        this.f96d = i12;
    }

    public Rational a() {
        return this.f94b;
    }

    public int b() {
        return this.f96d;
    }

    public int c() {
        return this.f95c;
    }

    public int d() {
        return this.f93a;
    }
}
