package ce;

import Td.B;
import Td.D;
import Td.E;
import Td.F;
import Td.o;
import Td.v;
import Td.w;
import Wd.m;
import Wd.p;
import be.d;
import be.i;
import be.k;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.C3877e;
import pe.C3888p;
import pe.InterfaceC3878f;
import pe.InterfaceC3879g;
import pe.Z;
import pe.b0;
import pe.c0;

/* loaded from: classes3.dex */
public final class b implements be.d {

    /* renamed from: h, reason: collision with root package name */
    public static final d f19472h = new d(null);

    /* renamed from: a, reason: collision with root package name */
    private final B f19473a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a f19474b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3879g f19475c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3878f f19476d;

    /* renamed from: e, reason: collision with root package name */
    private int f19477e;

    /* renamed from: f, reason: collision with root package name */
    private final C1752a f19478f;

    /* renamed from: g, reason: collision with root package name */
    private v f19479g;

    private abstract class a implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private final C3888p f19480a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f19481b;

        public a() {
            this.f19480a = new C3888p(b.this.f19475c.A());
        }

        @Override // pe.b0
        public c0 A() {
            return this.f19480a;
        }

        protected final boolean a() {
            return this.f19481b;
        }

        public final void b() {
            if (b.this.f19477e == 6) {
                return;
            }
            if (b.this.f19477e == 5) {
                b.this.s(this.f19480a);
                b.this.f19477e = 6;
            } else {
                throw new IllegalStateException("state: " + b.this.f19477e);
            }
        }

        @Override // pe.b0
        public long b2(C3877e sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return b.this.f19475c.b2(sink, j10);
            } catch (IOException e10) {
                b.this.a().f();
                b();
                throw e10;
            }
        }

        protected final void c(boolean z10) {
            this.f19481b = z10;
        }
    }

    /* renamed from: ce.b$b, reason: collision with other inner class name */
    private final class C0353b implements Z {

        /* renamed from: a, reason: collision with root package name */
        private final C3888p f19483a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f19484b;

        public C0353b() {
            this.f19483a = new C3888p(b.this.f19476d.A());
        }

        @Override // pe.Z
        public c0 A() {
            return this.f19483a;
        }

        @Override // pe.Z
        public void N0(C3877e source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f19484b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            b.this.f19476d.h1(j10);
            b.this.f19476d.T0("\r\n");
            b.this.f19476d.N0(source, j10);
            b.this.f19476d.T0("\r\n");
        }

        @Override // pe.Z, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f19484b) {
                return;
            }
            this.f19484b = true;
            b.this.f19476d.T0("0\r\n\r\n");
            b.this.s(this.f19483a);
            b.this.f19477e = 3;
        }

        @Override // pe.Z, java.io.Flushable
        public synchronized void flush() {
            if (this.f19484b) {
                return;
            }
            b.this.f19476d.flush();
        }
    }

    private final class c extends a {

        /* renamed from: d, reason: collision with root package name */
        private final w f19486d;

        /* renamed from: e, reason: collision with root package name */
        private long f19487e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f19488f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f19489g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, w url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f19489g = bVar;
            this.f19486d = url;
            this.f19487e = -1L;
            this.f19488f = true;
        }

        private final void d() {
            if (this.f19487e != -1) {
                this.f19489g.f19475c.u1();
            }
            try {
                this.f19487e = this.f19489g.f19475c.Z1();
                String obj = StringsKt.S0(this.f19489g.f19475c.u1()).toString();
                if (this.f19487e < 0 || (obj.length() > 0 && !StringsKt.F(obj, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f19487e + obj + '\"');
                }
                if (this.f19487e == 0) {
                    this.f19488f = false;
                    b bVar = this.f19489g;
                    bVar.f19479g = bVar.f19478f.a();
                    B b10 = this.f19489g.f19473a;
                    Intrinsics.d(b10);
                    o n10 = b10.n();
                    w wVar = this.f19486d;
                    v vVar = this.f19489g.f19479g;
                    Intrinsics.d(vVar);
                    be.e.f(n10, wVar, vVar);
                    b();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // ce.b.a, pe.b0
        public long b2(C3877e sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f19488f) {
                return -1L;
            }
            long j11 = this.f19487e;
            if (j11 == 0 || j11 == -1) {
                d();
                if (!this.f19488f) {
                    return -1L;
                }
            }
            long b22 = super.b2(sink, Math.min(j10, this.f19487e));
            if (b22 != -1) {
                this.f19487e -= b22;
                return b22;
            }
            this.f19489g.a().f();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }

        @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f19488f && !p.h(this, 100, TimeUnit.MILLISECONDS)) {
                this.f19489g.a().f();
                b();
            }
            c(true);
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    private final class e extends a {

        /* renamed from: d, reason: collision with root package name */
        private long f19490d;

        public e(long j10) {
            super();
            this.f19490d = j10;
            if (j10 == 0) {
                b();
            }
        }

        @Override // ce.b.a, pe.b0
        public long b2(C3877e sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f19490d;
            if (j11 == 0) {
                return -1L;
            }
            long b22 = super.b2(sink, Math.min(j11, j10));
            if (b22 == -1) {
                b.this.a().f();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j12 = this.f19490d - b22;
            this.f19490d = j12;
            if (j12 == 0) {
                b();
            }
            return b22;
        }

        @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f19490d != 0 && !p.h(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.a().f();
                b();
            }
            c(true);
        }
    }

    private final class f implements Z {

        /* renamed from: a, reason: collision with root package name */
        private final C3888p f19492a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f19493b;

        public f() {
            this.f19492a = new C3888p(b.this.f19476d.A());
        }

        @Override // pe.Z
        public c0 A() {
            return this.f19492a;
        }

        @Override // pe.Z
        public void N0(C3877e source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f19493b) {
                throw new IllegalStateException("closed");
            }
            m.e(source.size(), 0L, j10);
            b.this.f19476d.N0(source, j10);
        }

        @Override // pe.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f19493b) {
                return;
            }
            this.f19493b = true;
            b.this.s(this.f19492a);
            b.this.f19477e = 3;
        }

        @Override // pe.Z, java.io.Flushable
        public void flush() {
            if (this.f19493b) {
                return;
            }
            b.this.f19476d.flush();
        }
    }

    private final class g extends a {

        /* renamed from: d, reason: collision with root package name */
        private boolean f19495d;

        public g() {
            super();
        }

        @Override // ce.b.a, pe.b0
        public long b2(C3877e sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (this.f19495d) {
                return -1L;
            }
            long b22 = super.b2(sink, j10);
            if (b22 != -1) {
                return b22;
            }
            this.f19495d = true;
            b();
            return -1L;
        }

        @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.f19495d) {
                b();
            }
            c(true);
        }
    }

    static final class h extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f19497a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v invoke() {
            throw new IllegalStateException("trailers not available");
        }
    }

    public b(B b10, d.a carrier, InterfaceC3879g source, InterfaceC3878f sink) {
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f19473a = b10;
        this.f19474b = carrier;
        this.f19475c = source;
        this.f19476d = sink;
        this.f19478f = new C1752a(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(C3888p c3888p) {
        c0 i10 = c3888p.i();
        c3888p.j(c0.f38662e);
        i10.a();
        i10.b();
    }

    private final boolean t(D d10) {
        return StringsKt.r("chunked", d10.e("Transfer-Encoding"), true);
    }

    private final boolean u(F f10) {
        return StringsKt.r("chunked", F.o(f10, "Transfer-Encoding", null, 2, null), true);
    }

    private final Z v() {
        if (this.f19477e == 1) {
            this.f19477e = 2;
            return new C0353b();
        }
        throw new IllegalStateException(("state: " + this.f19477e).toString());
    }

    private final b0 w(w wVar) {
        if (this.f19477e == 4) {
            this.f19477e = 5;
            return new c(this, wVar);
        }
        throw new IllegalStateException(("state: " + this.f19477e).toString());
    }

    private final b0 x(long j10) {
        if (this.f19477e == 4) {
            this.f19477e = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f19477e).toString());
    }

    private final Z y() {
        if (this.f19477e == 1) {
            this.f19477e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f19477e).toString());
    }

    private final b0 z() {
        if (this.f19477e == 4) {
            this.f19477e = 5;
            a().f();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f19477e).toString());
    }

    public final void A(F response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long j10 = p.j(response);
        if (j10 == -1) {
            return;
        }
        b0 x10 = x(j10);
        p.n(x10, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        x10.close();
    }

    public final void B(v headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f19477e != 0) {
            throw new IllegalStateException(("state: " + this.f19477e).toString());
        }
        this.f19476d.T0(requestLine).T0("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19476d.T0(headers.h(i10)).T0(": ").T0(headers.v(i10)).T0("\r\n");
        }
        this.f19476d.T0("\r\n");
        this.f19477e = 1;
    }

    @Override // be.d
    public d.a a() {
        return this.f19474b;
    }

    @Override // be.d
    public void b(D request) {
        Intrinsics.checkNotNullParameter(request, "request");
        i iVar = i.f19071a;
        Proxy.Type type = a().h().b().type();
        Intrinsics.checkNotNullExpressionValue(type, "type(...)");
        B(request.f(), iVar.a(request, type));
    }

    @Override // be.d
    public void c() {
        this.f19476d.flush();
    }

    @Override // be.d
    public void cancel() {
        a().cancel();
    }

    @Override // be.d
    public long d(F response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!be.e.b(response)) {
            return 0L;
        }
        if (u(response)) {
            return -1L;
        }
        return p.j(response);
    }

    @Override // be.d
    public b0 e(F response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!be.e.b(response)) {
            return x(0L);
        }
        if (u(response)) {
            return w(response.z().n());
        }
        long j10 = p.j(response);
        return j10 != -1 ? x(j10) : z();
    }

    @Override // be.d
    public Z f(D request, long j10) {
        Intrinsics.checkNotNullParameter(request, "request");
        E a10 = request.a();
        if (a10 != null && a10.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (t(request)) {
            return v();
        }
        if (j10 != -1) {
            return y();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // be.d
    public F.a g(boolean z10) {
        int i10 = this.f19477e;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f19477e).toString());
        }
        try {
            k a10 = k.f19074d.a(this.f19478f.b());
            F.a D10 = new F.a().o(a10.f19075a).e(a10.f19076b).l(a10.f19077c).j(this.f19478f.a()).D(h.f19497a);
            if (z10 && a10.f19076b == 100) {
                return null;
            }
            int i11 = a10.f19076b;
            if (i11 == 100) {
                this.f19477e = 3;
                return D10;
            }
            if (102 > i11 || i11 >= 200) {
                this.f19477e = 4;
                return D10;
            }
            this.f19477e = 3;
            return D10;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + a().h().a().l().s(), e10);
        }
    }

    @Override // be.d
    public void h() {
        this.f19476d.flush();
    }

    @Override // be.d
    public v i() {
        if (this.f19477e != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        v vVar = this.f19479g;
        return vVar == null ? p.f11597a : vVar;
    }
}
