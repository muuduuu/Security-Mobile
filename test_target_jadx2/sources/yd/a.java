package Yd;

import Td.C;
import Td.C1227c;
import Td.D;
import Td.F;
import Td.InterfaceC1229e;
import Td.s;
import Td.v;
import Td.x;
import Wd.l;
import Wd.m;
import Wd.p;
import Yd.d;
import ae.k;
import be.h;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.C3877e;
import pe.InterfaceC3878f;
import pe.InterfaceC3879g;
import pe.M;
import pe.b0;
import pe.c0;

/* loaded from: classes3.dex */
public final class a implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final C0226a f12194b = new C0226a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C1227c f12195a;

    /* renamed from: Yd.a$a, reason: collision with other inner class name */
    public static final class C0226a {
        public /* synthetic */ C0226a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final v b(v vVar, v vVar2) {
            v.a aVar = new v.a();
            int size = vVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String h10 = vVar.h(i10);
                String v10 = vVar.v(i10);
                if ((!StringsKt.r("Warning", h10, true) || !StringsKt.F(v10, "1", false, 2, null)) && (c(h10) || !d(h10) || vVar2.c(h10) == null)) {
                    aVar.d(h10, v10);
                }
            }
            int size2 = vVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String h11 = vVar2.h(i11);
                if (!c(h11) && d(h11)) {
                    aVar.d(h11, vVar2.v(i11));
                }
            }
            return aVar.f();
        }

        private final boolean c(String str) {
            return StringsKt.r("Content-Length", str, true) || StringsKt.r("Content-Encoding", str, true) || StringsKt.r("Content-Type", str, true);
        }

        private final boolean d(String str) {
            return (StringsKt.r("Connection", str, true) || StringsKt.r("Keep-Alive", str, true) || StringsKt.r("Proxy-Authenticate", str, true) || StringsKt.r("Proxy-Authorization", str, true) || StringsKt.r("TE", str, true) || StringsKt.r("Trailers", str, true) || StringsKt.r("Transfer-Encoding", str, true) || StringsKt.r("Upgrade", str, true)) ? false : true;
        }

        private C0226a() {
        }
    }

    public static final class b implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f12196a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3879g f12197b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f12198c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3878f f12199d;

        b(InterfaceC3879g interfaceC3879g, c cVar, InterfaceC3878f interfaceC3878f) {
            this.f12197b = interfaceC3879g;
            this.f12198c = cVar;
            this.f12199d = interfaceC3878f;
        }

        @Override // pe.b0
        public c0 A() {
            return this.f12197b.A();
        }

        @Override // pe.b0
        public long b2(C3877e sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                long b22 = this.f12197b.b2(sink, j10);
                if (b22 != -1) {
                    sink.l(this.f12199d.m(), sink.size() - b22, b22);
                    this.f12199d.B0();
                    return b22;
                }
                if (!this.f12196a) {
                    this.f12196a = true;
                    this.f12199d.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (!this.f12196a) {
                    this.f12196a = true;
                    this.f12198c.a();
                }
                throw e10;
            }
        }

        @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f12196a && !p.h(this, 100, TimeUnit.MILLISECONDS)) {
                this.f12196a = true;
                this.f12198c.a();
            }
            this.f12197b.close();
        }
    }

    public a(C1227c c1227c) {
        this.f12195a = c1227c;
    }

    private final F a(c cVar, F f10) {
        if (cVar == null) {
            return f10;
        }
        b bVar = new b(f10.b().j(), cVar, M.b(cVar.b()));
        return f10.t().b(new h(F.o(f10, "Content-Type", null, 2, null), f10.b().e(), M.c(bVar))).c();
    }

    @Override // Td.x
    public F intercept(x.a chain) {
        F f10;
        s sVar;
        D b10;
        D b11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        InterfaceC1229e call = chain.call();
        C1227c c1227c = this.f12195a;
        if (c1227c != null) {
            b11 = Yd.b.b(chain.t());
            f10 = c1227c.b(b11);
        } else {
            f10 = null;
        }
        d b12 = new d.b(System.currentTimeMillis(), chain.t(), f10).b();
        D b13 = b12.b();
        F a10 = b12.a();
        C1227c c1227c2 = this.f12195a;
        if (c1227c2 != null) {
            c1227c2.l(b12);
        }
        k kVar = call instanceof k ? (k) call : null;
        if (kVar == null || (sVar = kVar.p()) == null) {
            sVar = s.f10201b;
        }
        if (f10 != null && a10 == null) {
            m.f(f10.b());
        }
        if (b13 == null && a10 == null) {
            F c10 = new F.a().r(chain.t()).o(C.HTTP_1_1).e(504).l("Unsatisfiable Request (only-if-cached)").s(-1L).p(System.currentTimeMillis()).c();
            sVar.A(call, c10);
            return c10;
        }
        if (b13 == null) {
            Intrinsics.d(a10);
            F c11 = a10.t().d(l.v(a10)).c();
            sVar.b(call, c11);
            return c11;
        }
        if (a10 != null) {
            sVar.a(call, a10);
        } else if (this.f12195a != null) {
            sVar.c(call);
        }
        try {
            F a11 = chain.a(b13);
            if (a11 == null && f10 != null) {
            }
            if (a10 != null) {
                if (a11 != null && a11.f() == 304) {
                    F c12 = a10.t().j(f12194b.b(a10.p(), a11.p())).s(a11.C()).p(a11.y()).d(l.v(a10)).m(l.v(a11)).c();
                    a11.b().close();
                    C1227c c1227c3 = this.f12195a;
                    Intrinsics.d(c1227c3);
                    c1227c3.j();
                    this.f12195a.n(a10, c12);
                    sVar.b(call, c12);
                    return c12;
                }
                m.f(a10.b());
            }
            Intrinsics.d(a11);
            F c13 = a11.t().d(a10 != null ? l.v(a10) : null).m(l.v(a11)).c();
            if (this.f12195a != null) {
                b10 = Yd.b.b(b13);
                if (be.e.b(c13) && d.f12200c.a(c13, b10)) {
                    F a12 = a(this.f12195a.e(c13.t().r(b10).c()), c13);
                    if (a10 != null) {
                        sVar.c(call);
                    }
                    return a12;
                }
                if (be.f.a(b13.i())) {
                    try {
                        this.f12195a.f(b13);
                    } catch (IOException unused) {
                    }
                }
            }
            return c13;
        } finally {
            if (f10 != null) {
                m.f(f10.b());
            }
        }
    }
}
