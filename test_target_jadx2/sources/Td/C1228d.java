package Td;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Td.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1228d {

    /* renamed from: n, reason: collision with root package name */
    public static final b f9974n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1228d f9975o;

    /* renamed from: p, reason: collision with root package name */
    public static final C1228d f9976p;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9977a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9978b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9979c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9980d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9981e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9982f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f9983g;

    /* renamed from: h, reason: collision with root package name */
    private final int f9984h;

    /* renamed from: i, reason: collision with root package name */
    private final int f9985i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f9986j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f9987k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f9988l;

    /* renamed from: m, reason: collision with root package name */
    private String f9989m;

    /* renamed from: Td.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f9990a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f9991b;

        /* renamed from: c, reason: collision with root package name */
        private int f9992c = -1;

        /* renamed from: d, reason: collision with root package name */
        private int f9993d = -1;

        /* renamed from: e, reason: collision with root package name */
        private int f9994e = -1;

        /* renamed from: f, reason: collision with root package name */
        private boolean f9995f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f9996g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f9997h;

        public final C1228d a() {
            return Wd.c.a(this);
        }

        public final boolean b() {
            return this.f9997h;
        }

        public final int c() {
            return this.f9992c;
        }

        public final int d() {
            return this.f9993d;
        }

        public final int e() {
            return this.f9994e;
        }

        public final boolean f() {
            return this.f9990a;
        }

        public final boolean g() {
            return this.f9991b;
        }

        public final boolean h() {
            return this.f9996g;
        }

        public final boolean i() {
            return this.f9995f;
        }

        public final a j(int i10, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f9992c = Wd.c.b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i10).toString());
        }

        public final a k(long j10) {
            long u10 = kotlin.time.a.u(j10);
            if (u10 >= 0) {
                this.f9993d = Wd.c.b(u10);
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + u10).toString());
        }

        public final a l() {
            return Wd.c.e(this);
        }

        public final a m() {
            return Wd.c.f(this);
        }

        public final a n() {
            return Wd.c.g(this);
        }

        public final void o(boolean z10) {
            this.f9990a = z10;
        }

        public final void p(boolean z10) {
            this.f9991b = z10;
        }

        public final void q(boolean z10) {
            this.f9995f = z10;
        }
    }

    /* renamed from: Td.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1228d a(v headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return Wd.c.h(this, headers);
        }

        private b() {
        }
    }

    static {
        b bVar = new b(null);
        f9974n = bVar;
        f9975o = Wd.c.d(bVar);
        f9976p = Wd.c.c(bVar);
    }

    public C1228d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f9977a = z10;
        this.f9978b = z11;
        this.f9979c = i10;
        this.f9980d = i11;
        this.f9981e = z12;
        this.f9982f = z13;
        this.f9983g = z14;
        this.f9984h = i12;
        this.f9985i = i13;
        this.f9986j = z15;
        this.f9987k = z16;
        this.f9988l = z17;
        this.f9989m = str;
    }

    public final String a() {
        return this.f9989m;
    }

    public final boolean b() {
        return this.f9988l;
    }

    public final boolean c() {
        return this.f9981e;
    }

    public final boolean d() {
        return this.f9982f;
    }

    public final int e() {
        return this.f9979c;
    }

    public final int f() {
        return this.f9984h;
    }

    public final int g() {
        return this.f9985i;
    }

    public final boolean h() {
        return this.f9983g;
    }

    public final boolean i() {
        return this.f9977a;
    }

    public final boolean j() {
        return this.f9978b;
    }

    public final boolean k() {
        return this.f9987k;
    }

    public final boolean l() {
        return this.f9986j;
    }

    public final int m() {
        return this.f9980d;
    }

    public final void n(String str) {
        this.f9989m = str;
    }

    public String toString() {
        return Wd.c.i(this);
    }
}
