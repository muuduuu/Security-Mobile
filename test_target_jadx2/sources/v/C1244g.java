package V;

import V.r;
import org.conscrypt.BuildConfig;

/* renamed from: V.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1244g extends r {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f10623a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1236a f10624b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10625c;

    /* renamed from: V.g$b */
    static final class b extends r.a {

        /* renamed from: a, reason: collision with root package name */
        private B0 f10626a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC1236a f10627b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f10628c;

        @Override // V.r.a
        public r a() {
            B0 b02 = this.f10626a;
            String str = BuildConfig.FLAVOR;
            if (b02 == null) {
                str = BuildConfig.FLAVOR + " videoSpec";
            }
            if (this.f10627b == null) {
                str = str + " audioSpec";
            }
            if (this.f10628c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new C1244g(this.f10626a, this.f10627b, this.f10628c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // V.r.a
        B0 c() {
            B0 b02 = this.f10626a;
            if (b02 != null) {
                return b02;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override // V.r.a
        public r.a d(AbstractC1236a abstractC1236a) {
            if (abstractC1236a == null) {
                throw new NullPointerException("Null audioSpec");
            }
            this.f10627b = abstractC1236a;
            return this;
        }

        @Override // V.r.a
        public r.a e(int i10) {
            this.f10628c = Integer.valueOf(i10);
            return this;
        }

        @Override // V.r.a
        public r.a f(B0 b02) {
            if (b02 == null) {
                throw new NullPointerException("Null videoSpec");
            }
            this.f10626a = b02;
            return this;
        }

        b() {
        }

        private b(r rVar) {
            this.f10626a = rVar.d();
            this.f10627b = rVar.b();
            this.f10628c = Integer.valueOf(rVar.c());
        }
    }

    @Override // V.r
    public AbstractC1236a b() {
        return this.f10624b;
    }

    @Override // V.r
    public int c() {
        return this.f10625c;
    }

    @Override // V.r
    public B0 d() {
        return this.f10623a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f10623a.equals(rVar.d()) && this.f10624b.equals(rVar.b()) && this.f10625c == rVar.c();
    }

    public int hashCode() {
        return ((((this.f10623a.hashCode() ^ 1000003) * 1000003) ^ this.f10624b.hashCode()) * 1000003) ^ this.f10625c;
    }

    @Override // V.r
    public r.a i() {
        return new b(this);
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.f10623a + ", audioSpec=" + this.f10624b + ", outputFormat=" + this.f10625c + "}";
    }

    private C1244g(B0 b02, AbstractC1236a abstractC1236a, int i10) {
        this.f10623a = b02;
        this.f10624b = abstractC1236a;
        this.f10625c = i10;
    }
}
