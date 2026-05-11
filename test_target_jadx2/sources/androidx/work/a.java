package androidx.work;

import androidx.work.impl.C1619e;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x1.AbstractC5096C;
import x1.AbstractC5099c;
import x1.InterfaceC5098b;
import x1.k;
import x1.p;
import x1.w;
import x1.x;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: p, reason: collision with root package name */
    public static final b f18112p = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18113a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f18114b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5098b f18115c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5096C f18116d;

    /* renamed from: e, reason: collision with root package name */
    private final k f18117e;

    /* renamed from: f, reason: collision with root package name */
    private final w f18118f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC5159a f18119g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC5159a f18120h;

    /* renamed from: i, reason: collision with root package name */
    private final String f18121i;

    /* renamed from: j, reason: collision with root package name */
    private final int f18122j;

    /* renamed from: k, reason: collision with root package name */
    private final int f18123k;

    /* renamed from: l, reason: collision with root package name */
    private final int f18124l;

    /* renamed from: m, reason: collision with root package name */
    private final int f18125m;

    /* renamed from: n, reason: collision with root package name */
    private final int f18126n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f18127o;

    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public static final class C0311a {

        /* renamed from: a, reason: collision with root package name */
        private Executor f18128a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5096C f18129b;

        /* renamed from: c, reason: collision with root package name */
        private k f18130c;

        /* renamed from: d, reason: collision with root package name */
        private Executor f18131d;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC5098b f18132e;

        /* renamed from: f, reason: collision with root package name */
        private w f18133f;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC5159a f18134g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC5159a f18135h;

        /* renamed from: i, reason: collision with root package name */
        private String f18136i;

        /* renamed from: k, reason: collision with root package name */
        private int f18138k;

        /* renamed from: j, reason: collision with root package name */
        private int f18137j = 4;

        /* renamed from: l, reason: collision with root package name */
        private int f18139l = Integer.MAX_VALUE;

        /* renamed from: m, reason: collision with root package name */
        private int f18140m = 20;

        /* renamed from: n, reason: collision with root package name */
        private int f18141n = AbstractC5099c.c();

        public final a a() {
            return new a(this);
        }

        public final InterfaceC5098b b() {
            return this.f18132e;
        }

        public final int c() {
            return this.f18141n;
        }

        public final String d() {
            return this.f18136i;
        }

        public final Executor e() {
            return this.f18128a;
        }

        public final InterfaceC5159a f() {
            return this.f18134g;
        }

        public final k g() {
            return this.f18130c;
        }

        public final int h() {
            return this.f18137j;
        }

        public final int i() {
            return this.f18139l;
        }

        public final int j() {
            return this.f18140m;
        }

        public final int k() {
            return this.f18138k;
        }

        public final w l() {
            return this.f18133f;
        }

        public final InterfaceC5159a m() {
            return this.f18135h;
        }

        public final Executor n() {
            return this.f18131d;
        }

        public final AbstractC5096C o() {
            return this.f18129b;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public a(C0311a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Executor e10 = builder.e();
        this.f18113a = e10 == null ? AbstractC5099c.b(false) : e10;
        this.f18127o = builder.n() == null;
        Executor n10 = builder.n();
        this.f18114b = n10 == null ? AbstractC5099c.b(true) : n10;
        InterfaceC5098b b10 = builder.b();
        this.f18115c = b10 == null ? new x() : b10;
        AbstractC5096C o10 = builder.o();
        if (o10 == null) {
            o10 = AbstractC5096C.c();
            Intrinsics.checkNotNullExpressionValue(o10, "getDefaultWorkerFactory()");
        }
        this.f18116d = o10;
        k g10 = builder.g();
        this.f18117e = g10 == null ? p.f44709a : g10;
        w l10 = builder.l();
        this.f18118f = l10 == null ? new C1619e() : l10;
        this.f18122j = builder.h();
        this.f18123k = builder.k();
        this.f18124l = builder.i();
        this.f18126n = builder.j();
        this.f18119g = builder.f();
        this.f18120h = builder.m();
        this.f18121i = builder.d();
        this.f18125m = builder.c();
    }

    public final InterfaceC5098b a() {
        return this.f18115c;
    }

    public final int b() {
        return this.f18125m;
    }

    public final String c() {
        return this.f18121i;
    }

    public final Executor d() {
        return this.f18113a;
    }

    public final InterfaceC5159a e() {
        return this.f18119g;
    }

    public final k f() {
        return this.f18117e;
    }

    public final int g() {
        return this.f18124l;
    }

    public final int h() {
        return this.f18126n;
    }

    public final int i() {
        return this.f18123k;
    }

    public final int j() {
        return this.f18122j;
    }

    public final w k() {
        return this.f18118f;
    }

    public final InterfaceC5159a l() {
        return this.f18120h;
    }

    public final Executor m() {
        return this.f18114b;
    }

    public final AbstractC5096C n() {
        return this.f18116d;
    }
}
