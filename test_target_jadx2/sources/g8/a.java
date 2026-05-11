package G8;

import org.conscrypt.BuildConfig;
import w8.InterfaceC5046c;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: p, reason: collision with root package name */
    private static final a f2938p = new C0070a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f2939a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2940b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2941c;

    /* renamed from: d, reason: collision with root package name */
    private final c f2942d;

    /* renamed from: e, reason: collision with root package name */
    private final d f2943e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2944f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2945g;

    /* renamed from: h, reason: collision with root package name */
    private final int f2946h;

    /* renamed from: i, reason: collision with root package name */
    private final int f2947i;

    /* renamed from: j, reason: collision with root package name */
    private final String f2948j;

    /* renamed from: k, reason: collision with root package name */
    private final long f2949k;

    /* renamed from: l, reason: collision with root package name */
    private final b f2950l;

    /* renamed from: m, reason: collision with root package name */
    private final String f2951m;

    /* renamed from: n, reason: collision with root package name */
    private final long f2952n;

    /* renamed from: o, reason: collision with root package name */
    private final String f2953o;

    /* renamed from: G8.a$a, reason: collision with other inner class name */
    public static final class C0070a {

        /* renamed from: a, reason: collision with root package name */
        private long f2954a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f2955b = BuildConfig.FLAVOR;

        /* renamed from: c, reason: collision with root package name */
        private String f2956c = BuildConfig.FLAVOR;

        /* renamed from: d, reason: collision with root package name */
        private c f2957d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f2958e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f2959f = BuildConfig.FLAVOR;

        /* renamed from: g, reason: collision with root package name */
        private String f2960g = BuildConfig.FLAVOR;

        /* renamed from: h, reason: collision with root package name */
        private int f2961h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f2962i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f2963j = BuildConfig.FLAVOR;

        /* renamed from: k, reason: collision with root package name */
        private long f2964k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f2965l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f2966m = BuildConfig.FLAVOR;

        /* renamed from: n, reason: collision with root package name */
        private long f2967n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f2968o = BuildConfig.FLAVOR;

        C0070a() {
        }

        public a a() {
            return new a(this.f2954a, this.f2955b, this.f2956c, this.f2957d, this.f2958e, this.f2959f, this.f2960g, this.f2961h, this.f2962i, this.f2963j, this.f2964k, this.f2965l, this.f2966m, this.f2967n, this.f2968o);
        }

        public C0070a b(String str) {
            this.f2966m = str;
            return this;
        }

        public C0070a c(String str) {
            this.f2960g = str;
            return this;
        }

        public C0070a d(String str) {
            this.f2968o = str;
            return this;
        }

        public C0070a e(b bVar) {
            this.f2965l = bVar;
            return this;
        }

        public C0070a f(String str) {
            this.f2956c = str;
            return this;
        }

        public C0070a g(String str) {
            this.f2955b = str;
            return this;
        }

        public C0070a h(c cVar) {
            this.f2957d = cVar;
            return this;
        }

        public C0070a i(String str) {
            this.f2959f = str;
            return this;
        }

        public C0070a j(int i10) {
            this.f2961h = i10;
            return this;
        }

        public C0070a k(long j10) {
            this.f2954a = j10;
            return this;
        }

        public C0070a l(d dVar) {
            this.f2958e = dVar;
            return this;
        }

        public C0070a m(String str) {
            this.f2963j = str;
            return this;
        }

        public C0070a n(int i10) {
            this.f2962i = i10;
            return this;
        }
    }

    public enum b implements InterfaceC5046c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // w8.InterfaceC5046c
        public int getNumber() {
            return this.number_;
        }
    }

    public enum c implements InterfaceC5046c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        c(int i10) {
            this.number_ = i10;
        }

        @Override // w8.InterfaceC5046c
        public int getNumber() {
            return this.number_;
        }
    }

    public enum d implements InterfaceC5046c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        d(int i10) {
            this.number_ = i10;
        }

        @Override // w8.InterfaceC5046c
        public int getNumber() {
            return this.number_;
        }
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f2939a = j10;
        this.f2940b = str;
        this.f2941c = str2;
        this.f2942d = cVar;
        this.f2943e = dVar;
        this.f2944f = str3;
        this.f2945g = str4;
        this.f2946h = i10;
        this.f2947i = i11;
        this.f2948j = str5;
        this.f2949k = j11;
        this.f2950l = bVar;
        this.f2951m = str6;
        this.f2952n = j12;
        this.f2953o = str7;
    }

    public static C0070a p() {
        return new C0070a();
    }

    public String a() {
        return this.f2951m;
    }

    public long b() {
        return this.f2949k;
    }

    public long c() {
        return this.f2952n;
    }

    public String d() {
        return this.f2945g;
    }

    public String e() {
        return this.f2953o;
    }

    public b f() {
        return this.f2950l;
    }

    public String g() {
        return this.f2941c;
    }

    public String h() {
        return this.f2940b;
    }

    public c i() {
        return this.f2942d;
    }

    public String j() {
        return this.f2944f;
    }

    public int k() {
        return this.f2946h;
    }

    public long l() {
        return this.f2939a;
    }

    public d m() {
        return this.f2943e;
    }

    public String n() {
        return this.f2948j;
    }

    public int o() {
        return this.f2947i;
    }
}
