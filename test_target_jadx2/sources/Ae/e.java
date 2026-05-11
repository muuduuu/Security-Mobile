package ae;

import Td.D;
import Td.E;
import Td.F;
import Td.G;
import Td.v;
import be.d;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import le.d;
import pe.AbstractC3886n;
import pe.AbstractC3887o;
import pe.C3877e;
import pe.M;
import pe.Z;
import pe.b0;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final k f12773a;

    /* renamed from: b, reason: collision with root package name */
    private final Td.s f12774b;

    /* renamed from: c, reason: collision with root package name */
    private final f f12775c;

    /* renamed from: d, reason: collision with root package name */
    private final be.d f12776d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12777e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12778f;

    private final class a extends AbstractC3886n {

        /* renamed from: b, reason: collision with root package name */
        private final long f12779b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f12780c;

        /* renamed from: d, reason: collision with root package name */
        private long f12781d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f12782e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f12783f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, Z delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f12783f = eVar;
            this.f12779b = j10;
        }

        private final IOException a(IOException iOException) {
            if (this.f12780c) {
                return iOException;
            }
            this.f12780c = true;
            return this.f12783f.a(this.f12781d, false, true, iOException);
        }

        @Override // pe.AbstractC3886n, pe.Z
        public void N0(C3877e source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f12782e) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f12779b;
            if (j11 == -1 || this.f12781d + j10 <= j11) {
                try {
                    super.N0(source, j10);
                    this.f12781d += j10;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new ProtocolException("expected " + this.f12779b + " bytes but received " + (this.f12781d + j10));
        }

        @Override // pe.AbstractC3886n, pe.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f12782e) {
                return;
            }
            this.f12782e = true;
            long j10 = this.f12779b;
            if (j10 != -1 && this.f12781d != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // pe.AbstractC3886n, pe.Z, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    public final class b extends AbstractC3887o {

        /* renamed from: b, reason: collision with root package name */
        private final long f12784b;

        /* renamed from: c, reason: collision with root package name */
        private long f12785c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f12786d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f12787e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f12788f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f12789g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, b0 delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f12789g = eVar;
            this.f12784b = j10;
            this.f12786d = true;
            if (j10 == 0) {
                b(null);
            }
        }

        public final IOException b(IOException iOException) {
            if (this.f12787e) {
                return iOException;
            }
            this.f12787e = true;
            if (iOException == null && this.f12786d) {
                this.f12786d = false;
                this.f12789g.i().w(this.f12789g.g());
            }
            return this.f12789g.a(this.f12785c, true, false, iOException);
        }

        @Override // pe.AbstractC3887o, pe.b0
        public long b2(C3877e sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f12788f) {
                throw new IllegalStateException("closed");
            }
            try {
                long b22 = a().b2(sink, j10);
                if (this.f12786d) {
                    this.f12786d = false;
                    this.f12789g.i().w(this.f12789g.g());
                }
                if (b22 == -1) {
                    b(null);
                    return -1L;
                }
                long j11 = this.f12785c + b22;
                long j12 = this.f12784b;
                if (j12 != -1 && j11 > j12) {
                    throw new ProtocolException("expected " + this.f12784b + " bytes but received " + j11);
                }
                this.f12785c = j11;
                if (j11 == j12) {
                    b(null);
                }
                return b22;
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        @Override // pe.AbstractC3887o, pe.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f12788f) {
                return;
            }
            this.f12788f = true;
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }
    }

    public e(k call, Td.s eventListener, f finder, be.d codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f12773a = call;
        this.f12774b = eventListener;
        this.f12775c = finder;
        this.f12776d = codec;
    }

    private final void u(IOException iOException) {
        this.f12778f = true;
        this.f12776d.a().b(this.f12773a, iOException);
    }

    public final IOException a(long j10, boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            u(iOException);
        }
        if (z11) {
            if (iOException != null) {
                this.f12774b.s(this.f12773a, iOException);
            } else {
                this.f12774b.q(this.f12773a, j10);
            }
        }
        if (z10) {
            if (iOException != null) {
                this.f12774b.x(this.f12773a, iOException);
            } else {
                this.f12774b.v(this.f12773a, j10);
            }
        }
        return this.f12773a.z(this, z11, z10, iOException);
    }

    public final void b() {
        this.f12776d.cancel();
    }

    public final Z c(D request, boolean z10) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f12777e = z10;
        E a10 = request.a();
        Intrinsics.d(a10);
        long contentLength = a10.contentLength();
        this.f12774b.r(this.f12773a);
        return new a(this, this.f12776d.f(request, contentLength), contentLength);
    }

    public final void d() {
        this.f12776d.cancel();
        this.f12773a.z(this, true, true, null);
    }

    public final void e() {
        try {
            this.f12776d.c();
        } catch (IOException e10) {
            this.f12774b.s(this.f12773a, e10);
            u(e10);
            throw e10;
        }
    }

    public final void f() {
        try {
            this.f12776d.h();
        } catch (IOException e10) {
            this.f12774b.s(this.f12773a, e10);
            u(e10);
            throw e10;
        }
    }

    public final k g() {
        return this.f12773a;
    }

    public final l h() {
        d.a a10 = this.f12776d.a();
        l lVar = a10 instanceof l ? (l) a10 : null;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public final Td.s i() {
        return this.f12774b;
    }

    public final f j() {
        return this.f12775c;
    }

    public final boolean k() {
        return this.f12778f;
    }

    public final boolean l() {
        return !Intrinsics.b(this.f12775c.b().b().l().h(), this.f12776d.a().h().a().l().h());
    }

    public final boolean m() {
        return this.f12777e;
    }

    public final d.AbstractC0552d n() {
        this.f12773a.E();
        d.a a10 = this.f12776d.a();
        Intrinsics.e(a10, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        return ((l) a10).t(this);
    }

    public final void o() {
        this.f12776d.a().f();
    }

    public final void p() {
        this.f12773a.z(this, true, false, null);
    }

    public final G q(F response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String o10 = F.o(response, "Content-Type", null, 2, null);
            long d10 = this.f12776d.d(response);
            return new be.h(o10, d10, M.c(new b(this, this.f12776d.e(response), d10)));
        } catch (IOException e10) {
            this.f12774b.x(this.f12773a, e10);
            u(e10);
            throw e10;
        }
    }

    public final F.a r(boolean z10) {
        try {
            F.a g10 = this.f12776d.g(z10);
            if (g10 != null) {
                g10.k(this);
            }
            return g10;
        } catch (IOException e10) {
            this.f12774b.x(this.f12773a, e10);
            u(e10);
            throw e10;
        }
    }

    public final void s(F response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f12774b.y(this.f12773a, response);
    }

    public final void t() {
        this.f12774b.z(this.f12773a);
    }

    public final v v() {
        return this.f12776d.i();
    }

    public final void w() {
        a(-1L, true, true, null);
    }

    public final void x(D request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.f12774b.u(this.f12773a);
            this.f12776d.b(request);
            this.f12774b.t(this.f12773a, request);
        } catch (IOException e10) {
            this.f12774b.s(this.f12773a, e10);
            u(e10);
            throw e10;
        }
    }
}
