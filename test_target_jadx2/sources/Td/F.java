package Td;

import Td.v;
import java.io.Closeable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class F implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final D f9885a;

    /* renamed from: b, reason: collision with root package name */
    private final C f9886b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9887c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9888d;

    /* renamed from: e, reason: collision with root package name */
    private final u f9889e;

    /* renamed from: f, reason: collision with root package name */
    private final v f9890f;

    /* renamed from: g, reason: collision with root package name */
    private final G f9891g;

    /* renamed from: h, reason: collision with root package name */
    private final F f9892h;

    /* renamed from: i, reason: collision with root package name */
    private final F f9893i;

    /* renamed from: j, reason: collision with root package name */
    private final F f9894j;

    /* renamed from: k, reason: collision with root package name */
    private final long f9895k;

    /* renamed from: l, reason: collision with root package name */
    private final long f9896l;

    /* renamed from: m, reason: collision with root package name */
    private final ae.e f9897m;

    /* renamed from: n, reason: collision with root package name */
    private Function0 f9898n;

    /* renamed from: o, reason: collision with root package name */
    private C1228d f9899o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f9900p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f9901q;

    public F(D request, C protocol, String message, int i10, u uVar, v headers, G body, F f10, F f11, F f12, long j10, long j11, ae.e eVar, Function0 trailersFn) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(trailersFn, "trailersFn");
        this.f9885a = request;
        this.f9886b = protocol;
        this.f9887c = message;
        this.f9888d = i10;
        this.f9889e = uVar;
        this.f9890f = headers;
        this.f9891g = body;
        this.f9892h = f10;
        this.f9893i = f11;
        this.f9894j = f12;
        this.f9895k = j10;
        this.f9896l = j11;
        this.f9897m = eVar;
        this.f9898n = trailersFn;
        this.f9900p = Wd.l.u(this);
        this.f9901q = Wd.l.t(this);
    }

    public static /* synthetic */ String o(F f10, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return f10.n(str, str2);
    }

    public final long C() {
        return this.f9895k;
    }

    public final void F(C1228d c1228d) {
        this.f9899o = c1228d;
    }

    public final G b() {
        return this.f9891g;
    }

    public final C1228d c() {
        return Wd.l.s(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Wd.l.e(this);
    }

    public final F d() {
        return this.f9893i;
    }

    public final List e() {
        String str;
        v vVar = this.f9890f;
        int i10 = this.f9888d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return CollectionsKt.j();
            }
            str = "Proxy-Authenticate";
        }
        return be.e.a(vVar, str);
    }

    public final int f() {
        return this.f9888d;
    }

    public final ae.e g() {
        return this.f9897m;
    }

    public final C1228d i() {
        return this.f9899o;
    }

    public final boolean isSuccessful() {
        return this.f9900p;
    }

    public final u j() {
        return this.f9889e;
    }

    public final String l(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return o(this, name, null, 2, null);
    }

    public final String n(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Wd.l.h(this, name, str);
    }

    public final v p() {
        return this.f9890f;
    }

    public final boolean q() {
        return this.f9901q;
    }

    public final String r() {
        return this.f9887c;
    }

    public final F s() {
        return this.f9892h;
    }

    public final a t() {
        return Wd.l.l(this);
    }

    public String toString() {
        return Wd.l.q(this);
    }

    public final F u() {
        return this.f9894j;
    }

    public final C x() {
        return this.f9886b;
    }

    public final long y() {
        return this.f9896l;
    }

    public final D z() {
        return this.f9885a;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private D f9902a;

        /* renamed from: b, reason: collision with root package name */
        private C f9903b;

        /* renamed from: c, reason: collision with root package name */
        private int f9904c;

        /* renamed from: d, reason: collision with root package name */
        private String f9905d;

        /* renamed from: e, reason: collision with root package name */
        private u f9906e;

        /* renamed from: f, reason: collision with root package name */
        private v.a f9907f;

        /* renamed from: g, reason: collision with root package name */
        private G f9908g;

        /* renamed from: h, reason: collision with root package name */
        private F f9909h;

        /* renamed from: i, reason: collision with root package name */
        private F f9910i;

        /* renamed from: j, reason: collision with root package name */
        private F f9911j;

        /* renamed from: k, reason: collision with root package name */
        private long f9912k;

        /* renamed from: l, reason: collision with root package name */
        private long f9913l;

        /* renamed from: m, reason: collision with root package name */
        private ae.e f9914m;

        /* renamed from: n, reason: collision with root package name */
        private Function0 f9915n;

        /* renamed from: Td.F$a$a, reason: collision with other inner class name */
        static final class C0188a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ae.e f9916a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0188a(ae.e eVar) {
                super(0);
                this.f9916a = eVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v invoke() {
                return this.f9916a.v();
            }
        }

        static final class b extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f9917a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v invoke() {
                return v.f10217b.b(new String[0]);
            }
        }

        public a() {
            this.f9904c = -1;
            this.f9908g = Wd.m.o();
            this.f9915n = b.f9917a;
            this.f9907f = new v.a();
        }

        public final void A(C c10) {
            this.f9903b = c10;
        }

        public final void B(D d10) {
            this.f9902a = d10;
        }

        public final void C(Function0 function0) {
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            this.f9915n = function0;
        }

        public a D(Function0 trailersFn) {
            Intrinsics.checkNotNullParameter(trailersFn, "trailersFn");
            return Wd.l.r(this, trailersFn);
        }

        public a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return Wd.l.b(this, name, value);
        }

        public a b(G body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return Wd.l.c(this, body);
        }

        public F c() {
            int i10 = this.f9904c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f9904c).toString());
            }
            D d10 = this.f9902a;
            if (d10 == null) {
                throw new IllegalStateException("request == null");
            }
            C c10 = this.f9903b;
            if (c10 == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f9905d;
            if (str != null) {
                return new F(d10, c10, str, i10, this.f9906e, this.f9907f.f(), this.f9908g, this.f9909h, this.f9910i, this.f9911j, this.f9912k, this.f9913l, this.f9914m, this.f9915n);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(F f10) {
            return Wd.l.d(this, f10);
        }

        public a e(int i10) {
            return Wd.l.f(this, i10);
        }

        public final int f() {
            return this.f9904c;
        }

        public final v.a g() {
            return this.f9907f;
        }

        public a h(u uVar) {
            this.f9906e = uVar;
            return this;
        }

        public a i(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return Wd.l.g(this, name, value);
        }

        public a j(v headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return Wd.l.i(this, headers);
        }

        public final void k(ae.e exchange) {
            Intrinsics.checkNotNullParameter(exchange, "exchange");
            this.f9914m = exchange;
            this.f9915n = new C0188a(exchange);
        }

        public a l(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return Wd.l.j(this, message);
        }

        public a m(F f10) {
            return Wd.l.k(this, f10);
        }

        public a n(F f10) {
            return Wd.l.m(this, f10);
        }

        public a o(C protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            return Wd.l.n(this, protocol);
        }

        public a p(long j10) {
            this.f9913l = j10;
            return this;
        }

        public a q(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return Wd.l.o(this, name);
        }

        public a r(D request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return Wd.l.p(this, request);
        }

        public a s(long j10) {
            this.f9912k = j10;
            return this;
        }

        public final void t(G g10) {
            Intrinsics.checkNotNullParameter(g10, "<set-?>");
            this.f9908g = g10;
        }

        public final void u(F f10) {
            this.f9910i = f10;
        }

        public final void v(int i10) {
            this.f9904c = i10;
        }

        public final void w(v.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            this.f9907f = aVar;
        }

        public final void x(String str) {
            this.f9905d = str;
        }

        public final void y(F f10) {
            this.f9909h = f10;
        }

        public final void z(F f10) {
            this.f9911j = f10;
        }

        public a(F response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f9904c = -1;
            this.f9908g = Wd.m.o();
            this.f9915n = b.f9917a;
            this.f9902a = response.z();
            this.f9903b = response.x();
            this.f9904c = response.f();
            this.f9905d = response.r();
            this.f9906e = response.j();
            this.f9907f = response.p().m();
            this.f9908g = response.b();
            this.f9909h = response.s();
            this.f9910i = response.d();
            this.f9911j = response.u();
            this.f9912k = response.C();
            this.f9913l = response.y();
            this.f9914m = response.g();
            this.f9915n = response.f9898n;
        }
    }
}
