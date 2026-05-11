package V;

import V.B0;
import android.util.Range;
import org.conscrypt.BuildConfig;

/* renamed from: V.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1251n extends B0 {

    /* renamed from: d, reason: collision with root package name */
    private final C1261y f10660d;

    /* renamed from: e, reason: collision with root package name */
    private final Range f10661e;

    /* renamed from: f, reason: collision with root package name */
    private final Range f10662f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10663g;

    /* renamed from: V.n$b */
    static final class b extends B0.a {

        /* renamed from: a, reason: collision with root package name */
        private C1261y f10664a;

        /* renamed from: b, reason: collision with root package name */
        private Range f10665b;

        /* renamed from: c, reason: collision with root package name */
        private Range f10666c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f10667d;

        @Override // V.B0.a
        public B0 a() {
            C1261y c1261y = this.f10664a;
            String str = BuildConfig.FLAVOR;
            if (c1261y == null) {
                str = BuildConfig.FLAVOR + " qualitySelector";
            }
            if (this.f10665b == null) {
                str = str + " frameRate";
            }
            if (this.f10666c == null) {
                str = str + " bitrate";
            }
            if (this.f10667d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new C1251n(this.f10664a, this.f10665b, this.f10666c, this.f10667d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // V.B0.a
        B0.a b(int i10) {
            this.f10667d = Integer.valueOf(i10);
            return this;
        }

        @Override // V.B0.a
        public B0.a c(Range range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f10666c = range;
            return this;
        }

        @Override // V.B0.a
        public B0.a d(Range range) {
            if (range == null) {
                throw new NullPointerException("Null frameRate");
            }
            this.f10665b = range;
            return this;
        }

        @Override // V.B0.a
        public B0.a e(C1261y c1261y) {
            if (c1261y == null) {
                throw new NullPointerException("Null qualitySelector");
            }
            this.f10664a = c1261y;
            return this;
        }

        b() {
        }

        private b(B0 b02) {
            this.f10664a = b02.e();
            this.f10665b = b02.d();
            this.f10666c = b02.c();
            this.f10667d = Integer.valueOf(b02.b());
        }
    }

    @Override // V.B0
    int b() {
        return this.f10663g;
    }

    @Override // V.B0
    public Range c() {
        return this.f10662f;
    }

    @Override // V.B0
    public Range d() {
        return this.f10661e;
    }

    @Override // V.B0
    public C1261y e() {
        return this.f10660d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return this.f10660d.equals(b02.e()) && this.f10661e.equals(b02.d()) && this.f10662f.equals(b02.c()) && this.f10663g == b02.b();
    }

    @Override // V.B0
    public B0.a f() {
        return new b(this);
    }

    public int hashCode() {
        return ((((((this.f10660d.hashCode() ^ 1000003) * 1000003) ^ this.f10661e.hashCode()) * 1000003) ^ this.f10662f.hashCode()) * 1000003) ^ this.f10663g;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f10660d + ", frameRate=" + this.f10661e + ", bitrate=" + this.f10662f + ", aspectRatio=" + this.f10663g + "}";
    }

    private C1251n(C1261y c1261y, Range range, Range range2, int i10) {
        this.f10660d = c1261y;
        this.f10661e = range;
        this.f10662f = range2;
        this.f10663g = i10;
    }
}
