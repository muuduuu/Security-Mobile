package O;

import O.e;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    private final String f6806a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6807b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6808c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6809d;

    static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        private String f6810a;

        /* renamed from: b, reason: collision with root package name */
        private String f6811b;

        /* renamed from: c, reason: collision with root package name */
        private String f6812c;

        /* renamed from: d, reason: collision with root package name */
        private String f6813d;

        b() {
        }

        @Override // O.e.a
        public e a() {
            String str = this.f6810a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " glVersion";
            }
            if (this.f6811b == null) {
                str2 = str2 + " eglVersion";
            }
            if (this.f6812c == null) {
                str2 = str2 + " glExtensions";
            }
            if (this.f6813d == null) {
                str2 = str2 + " eglExtensions";
            }
            if (str2.isEmpty()) {
                return new a(this.f6810a, this.f6811b, this.f6812c, this.f6813d);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // O.e.a
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f6813d = str;
            return this;
        }

        @Override // O.e.a
        public e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.f6811b = str;
            return this;
        }

        @Override // O.e.a
        public e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f6812c = str;
            return this;
        }

        @Override // O.e.a
        public e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f6810a = str;
            return this;
        }
    }

    @Override // O.e
    public String b() {
        return this.f6809d;
    }

    @Override // O.e
    public String c() {
        return this.f6807b;
    }

    @Override // O.e
    public String d() {
        return this.f6808c;
    }

    @Override // O.e
    public String e() {
        return this.f6806a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f6806a.equals(eVar.e()) && this.f6807b.equals(eVar.c()) && this.f6808c.equals(eVar.d()) && this.f6809d.equals(eVar.b());
    }

    public int hashCode() {
        return ((((((this.f6806a.hashCode() ^ 1000003) * 1000003) ^ this.f6807b.hashCode()) * 1000003) ^ this.f6808c.hashCode()) * 1000003) ^ this.f6809d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f6806a + ", eglVersion=" + this.f6807b + ", glExtensions=" + this.f6808c + ", eglExtensions=" + this.f6809d + "}";
    }

    private a(String str, String str2, String str3, String str4) {
        this.f6806a = str;
        this.f6807b = str2;
        this.f6808c = str3;
        this.f6809d = str4;
    }
}
