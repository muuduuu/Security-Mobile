package Y;

import Y.AbstractC1305a;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
final class u extends AbstractC1305a {

    /* renamed from: b, reason: collision with root package name */
    private final int f11974b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11975c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11976d;

    /* renamed from: e, reason: collision with root package name */
    private final int f11977e;

    static final class b extends AbstractC1305a.AbstractC0223a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f11978a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f11979b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f11980c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f11981d;

        b() {
        }

        @Override // Y.AbstractC1305a.AbstractC0223a
        AbstractC1305a a() {
            Integer num = this.f11978a;
            String str = BuildConfig.FLAVOR;
            if (num == null) {
                str = BuildConfig.FLAVOR + " audioSource";
            }
            if (this.f11979b == null) {
                str = str + " sampleRate";
            }
            if (this.f11980c == null) {
                str = str + " channelCount";
            }
            if (this.f11981d == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new u(this.f11978a.intValue(), this.f11979b.intValue(), this.f11980c.intValue(), this.f11981d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Y.AbstractC1305a.AbstractC0223a
        public AbstractC1305a.AbstractC0223a c(int i10) {
            this.f11981d = Integer.valueOf(i10);
            return this;
        }

        @Override // Y.AbstractC1305a.AbstractC0223a
        public AbstractC1305a.AbstractC0223a d(int i10) {
            this.f11978a = Integer.valueOf(i10);
            return this;
        }

        @Override // Y.AbstractC1305a.AbstractC0223a
        public AbstractC1305a.AbstractC0223a e(int i10) {
            this.f11980c = Integer.valueOf(i10);
            return this;
        }

        @Override // Y.AbstractC1305a.AbstractC0223a
        public AbstractC1305a.AbstractC0223a f(int i10) {
            this.f11979b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // Y.AbstractC1305a
    public int b() {
        return this.f11977e;
    }

    @Override // Y.AbstractC1305a
    public int c() {
        return this.f11974b;
    }

    @Override // Y.AbstractC1305a
    public int e() {
        return this.f11976d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1305a)) {
            return false;
        }
        AbstractC1305a abstractC1305a = (AbstractC1305a) obj;
        return this.f11974b == abstractC1305a.c() && this.f11975c == abstractC1305a.f() && this.f11976d == abstractC1305a.e() && this.f11977e == abstractC1305a.b();
    }

    @Override // Y.AbstractC1305a
    public int f() {
        return this.f11975c;
    }

    public int hashCode() {
        return ((((((this.f11974b ^ 1000003) * 1000003) ^ this.f11975c) * 1000003) ^ this.f11976d) * 1000003) ^ this.f11977e;
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.f11974b + ", sampleRate=" + this.f11975c + ", channelCount=" + this.f11976d + ", audioFormat=" + this.f11977e + "}";
    }

    private u(int i10, int i11, int i12, int i13) {
        this.f11974b = i10;
        this.f11975c = i11;
        this.f11976d = i12;
        this.f11977e = i13;
    }
}
