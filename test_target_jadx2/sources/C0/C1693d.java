package c0;

import android.util.Size;
import androidx.camera.core.impl.e1;
import c0.p0;
import org.conscrypt.BuildConfig;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1693d extends p0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19212a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19213b;

    /* renamed from: c, reason: collision with root package name */
    private final e1 f19214c;

    /* renamed from: d, reason: collision with root package name */
    private final Size f19215d;

    /* renamed from: e, reason: collision with root package name */
    private final int f19216e;

    /* renamed from: f, reason: collision with root package name */
    private final q0 f19217f;

    /* renamed from: g, reason: collision with root package name */
    private final int f19218g;

    /* renamed from: h, reason: collision with root package name */
    private final int f19219h;

    /* renamed from: i, reason: collision with root package name */
    private final int f19220i;

    /* renamed from: c0.d$b */
    static final class b extends p0.a {

        /* renamed from: a, reason: collision with root package name */
        private String f19221a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f19222b;

        /* renamed from: c, reason: collision with root package name */
        private e1 f19223c;

        /* renamed from: d, reason: collision with root package name */
        private Size f19224d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f19225e;

        /* renamed from: f, reason: collision with root package name */
        private q0 f19226f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f19227g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f19228h;

        /* renamed from: i, reason: collision with root package name */
        private Integer f19229i;

        b() {
        }

        @Override // c0.p0.a
        public p0 a() {
            String str = this.f19221a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " mimeType";
            }
            if (this.f19222b == null) {
                str2 = str2 + " profile";
            }
            if (this.f19223c == null) {
                str2 = str2 + " inputTimebase";
            }
            if (this.f19224d == null) {
                str2 = str2 + " resolution";
            }
            if (this.f19225e == null) {
                str2 = str2 + " colorFormat";
            }
            if (this.f19226f == null) {
                str2 = str2 + " dataSpace";
            }
            if (this.f19227g == null) {
                str2 = str2 + " frameRate";
            }
            if (this.f19228h == null) {
                str2 = str2 + " IFrameInterval";
            }
            if (this.f19229i == null) {
                str2 = str2 + " bitrate";
            }
            if (str2.isEmpty()) {
                return new C1693d(this.f19221a, this.f19222b.intValue(), this.f19223c, this.f19224d, this.f19225e.intValue(), this.f19226f, this.f19227g.intValue(), this.f19228h.intValue(), this.f19229i.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // c0.p0.a
        public p0.a b(int i10) {
            this.f19229i = Integer.valueOf(i10);
            return this;
        }

        @Override // c0.p0.a
        public p0.a c(int i10) {
            this.f19225e = Integer.valueOf(i10);
            return this;
        }

        @Override // c0.p0.a
        public p0.a d(q0 q0Var) {
            if (q0Var == null) {
                throw new NullPointerException("Null dataSpace");
            }
            this.f19226f = q0Var;
            return this;
        }

        @Override // c0.p0.a
        public p0.a e(int i10) {
            this.f19227g = Integer.valueOf(i10);
            return this;
        }

        @Override // c0.p0.a
        public p0.a f(int i10) {
            this.f19228h = Integer.valueOf(i10);
            return this;
        }

        @Override // c0.p0.a
        public p0.a g(e1 e1Var) {
            if (e1Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f19223c = e1Var;
            return this;
        }

        @Override // c0.p0.a
        public p0.a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f19221a = str;
            return this;
        }

        @Override // c0.p0.a
        public p0.a i(int i10) {
            this.f19222b = Integer.valueOf(i10);
            return this;
        }

        @Override // c0.p0.a
        public p0.a j(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f19224d = size;
            return this;
        }
    }

    @Override // c0.p0, c0.InterfaceC1703n
    public e1 b() {
        return this.f19214c;
    }

    @Override // c0.p0, c0.InterfaceC1703n
    public String c() {
        return this.f19212a;
    }

    @Override // c0.p0
    public int e() {
        return this.f19220i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f19212a.equals(p0Var.c()) && this.f19213b == p0Var.j() && this.f19214c.equals(p0Var.b()) && this.f19215d.equals(p0Var.k()) && this.f19216e == p0Var.f() && this.f19217f.equals(p0Var.g()) && this.f19218g == p0Var.h() && this.f19219h == p0Var.i() && this.f19220i == p0Var.e();
    }

    @Override // c0.p0
    public int f() {
        return this.f19216e;
    }

    @Override // c0.p0
    public q0 g() {
        return this.f19217f;
    }

    @Override // c0.p0
    public int h() {
        return this.f19218g;
    }

    public int hashCode() {
        return ((((((((((((((((this.f19212a.hashCode() ^ 1000003) * 1000003) ^ this.f19213b) * 1000003) ^ this.f19214c.hashCode()) * 1000003) ^ this.f19215d.hashCode()) * 1000003) ^ this.f19216e) * 1000003) ^ this.f19217f.hashCode()) * 1000003) ^ this.f19218g) * 1000003) ^ this.f19219h) * 1000003) ^ this.f19220i;
    }

    @Override // c0.p0
    public int i() {
        return this.f19219h;
    }

    @Override // c0.p0
    public int j() {
        return this.f19213b;
    }

    @Override // c0.p0
    public Size k() {
        return this.f19215d;
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f19212a + ", profile=" + this.f19213b + ", inputTimebase=" + this.f19214c + ", resolution=" + this.f19215d + ", colorFormat=" + this.f19216e + ", dataSpace=" + this.f19217f + ", frameRate=" + this.f19218g + ", IFrameInterval=" + this.f19219h + ", bitrate=" + this.f19220i + "}";
    }

    private C1693d(String str, int i10, e1 e1Var, Size size, int i11, q0 q0Var, int i12, int i13, int i14) {
        this.f19212a = str;
        this.f19213b = i10;
        this.f19214c = e1Var;
        this.f19215d = size;
        this.f19216e = i11;
        this.f19217f = q0Var;
        this.f19218g = i12;
        this.f19219h = i13;
        this.f19220i = i14;
    }
}
