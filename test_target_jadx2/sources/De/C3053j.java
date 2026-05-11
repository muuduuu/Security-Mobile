package de;

import Td.v;
import Wd.p;
import ee.C3122a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pe.C3875c;
import pe.C3877e;
import pe.InterfaceC3879g;
import pe.Z;
import pe.b0;
import pe.c0;

/* renamed from: de.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3053j {

    /* renamed from: n, reason: collision with root package name */
    public static final a f32034n = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f32035a;

    /* renamed from: b, reason: collision with root package name */
    private final C3050g f32036b;

    /* renamed from: c, reason: collision with root package name */
    private final C3122a f32037c;

    /* renamed from: d, reason: collision with root package name */
    private long f32038d;

    /* renamed from: e, reason: collision with root package name */
    private long f32039e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f32040f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f32041g;

    /* renamed from: h, reason: collision with root package name */
    private final c f32042h;

    /* renamed from: i, reason: collision with root package name */
    private final b f32043i;

    /* renamed from: j, reason: collision with root package name */
    private final d f32044j;

    /* renamed from: k, reason: collision with root package name */
    private final d f32045k;

    /* renamed from: l, reason: collision with root package name */
    private EnumC3045b f32046l;

    /* renamed from: m, reason: collision with root package name */
    private IOException f32047m;

    /* renamed from: de.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: de.j$b */
    public final class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        private boolean f32048a;

        /* renamed from: b, reason: collision with root package name */
        private final C3877e f32049b = new C3877e();

        /* renamed from: c, reason: collision with root package name */
        private v f32050c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f32051d;

        public b(boolean z10) {
            this.f32048a = z10;
        }

        private final void a(boolean z10) {
            long min;
            boolean z11;
            C3053j c3053j = C3053j.this;
            synchronized (c3053j) {
                try {
                    c3053j.t().v();
                    while (c3053j.s() >= c3053j.r() && !this.f32048a && !this.f32051d && c3053j.j() == null) {
                        try {
                            c3053j.D();
                        } finally {
                            c3053j.t().C();
                        }
                    }
                    c3053j.t().C();
                    c3053j.d();
                    min = Math.min(c3053j.r() - c3053j.s(), this.f32049b.size());
                    c3053j.A(c3053j.s() + min);
                    z11 = z10 && min == this.f32049b.size();
                    Unit unit = Unit.f36324a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C3053j.this.t().v();
            try {
                C3053j.this.i().N1(C3053j.this.l(), z11, this.f32049b, min);
            } finally {
                c3053j = C3053j.this;
            }
        }

        @Override // pe.Z
        public c0 A() {
            return C3053j.this.t();
        }

        @Override // pe.Z
        public void N0(C3877e source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            C3053j c3053j = C3053j.this;
            if (!p.f11601e || !Thread.holdsLock(c3053j)) {
                this.f32049b.N0(source, j10);
                while (this.f32049b.size() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c3053j);
            }
        }

        public final boolean b() {
            return this.f32051d;
        }

        public final boolean c() {
            return this.f32048a;
        }

        @Override // pe.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C3053j c3053j = C3053j.this;
            if (p.f11601e && Thread.holdsLock(c3053j)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c3053j);
            }
            C3053j c3053j2 = C3053j.this;
            synchronized (c3053j2) {
                if (this.f32051d) {
                    return;
                }
                boolean z10 = c3053j2.j() == null;
                Unit unit = Unit.f36324a;
                if (!C3053j.this.p().f32048a) {
                    boolean z11 = this.f32049b.size() > 0;
                    if (this.f32050c != null) {
                        while (this.f32049b.size() > 0) {
                            a(false);
                        }
                        C3050g i10 = C3053j.this.i();
                        int l10 = C3053j.this.l();
                        v vVar = this.f32050c;
                        Intrinsics.d(vVar);
                        i10.O1(l10, z10, p.q(vVar));
                    } else if (z11) {
                        while (this.f32049b.size() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        C3053j.this.i().N1(C3053j.this.l(), true, null, 0L);
                    }
                }
                C3053j c3053j3 = C3053j.this;
                synchronized (c3053j3) {
                    this.f32051d = true;
                    Intrinsics.e(c3053j3, "null cannot be cast to non-null type java.lang.Object");
                    c3053j3.notifyAll();
                    Unit unit2 = Unit.f36324a;
                }
                C3053j.this.i().flush();
                C3053j.this.c();
            }
        }

        @Override // pe.Z, java.io.Flushable
        public void flush() {
            C3053j c3053j = C3053j.this;
            if (p.f11601e && Thread.holdsLock(c3053j)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c3053j);
            }
            C3053j c3053j2 = C3053j.this;
            synchronized (c3053j2) {
                c3053j2.d();
                Unit unit = Unit.f36324a;
            }
            while (this.f32049b.size() > 0) {
                a(false);
                C3053j.this.i().flush();
            }
        }
    }

    /* renamed from: de.j$c */
    public final class c implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private final long f32053a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f32054b;

        /* renamed from: c, reason: collision with root package name */
        private final C3877e f32055c = new C3877e();

        /* renamed from: d, reason: collision with root package name */
        private final C3877e f32056d = new C3877e();

        /* renamed from: e, reason: collision with root package name */
        private v f32057e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f32058f;

        public c(long j10, boolean z10) {
            this.f32053a = j10;
            this.f32054b = z10;
        }

        private final void j(long j10) {
            C3053j c3053j = C3053j.this;
            if (!p.f11601e || !Thread.holdsLock(c3053j)) {
                C3053j.this.i().M1(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c3053j);
        }

        @Override // pe.b0
        public c0 A() {
            return C3053j.this.n();
        }

        public final boolean a() {
            return this.f32058f;
        }

        public final boolean b() {
            return this.f32054b;
        }

        @Override // pe.b0
        public long b2(C3877e sink, long j10) {
            IOException iOException;
            boolean z10;
            long j11;
            long j12;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j13 = 0;
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            while (true) {
                C3053j c3053j = C3053j.this;
                synchronized (c3053j) {
                    boolean h10 = c3053j.h();
                    if (h10) {
                        c3053j.n().v();
                    }
                    try {
                        if (c3053j.j() == null || this.f32054b) {
                            iOException = null;
                        } else {
                            iOException = c3053j.k();
                            if (iOException == null) {
                                EnumC3045b j14 = c3053j.j();
                                Intrinsics.d(j14);
                                iOException = new C3058o(j14);
                            }
                        }
                        if (this.f32058f) {
                            throw new IOException("stream closed");
                        }
                        if (this.f32056d.size() > j13) {
                            C3877e c3877e = this.f32056d;
                            long b22 = c3877e.b2(sink, Math.min(j10, c3877e.size()));
                            C3122a.c(c3053j.m(), b22, 0L, 2, null);
                            long a10 = c3053j.m().a();
                            if (iOException == null) {
                                j12 = b22;
                                if (a10 >= c3053j.i().N().c() / 2) {
                                    c3053j.i().g2(c3053j.l(), a10);
                                    C3122a.c(c3053j.m(), 0L, a10, 1, null);
                                }
                            } else {
                                j12 = b22;
                            }
                            j11 = j12;
                            z10 = false;
                        } else {
                            if (this.f32054b || iOException != null) {
                                z10 = false;
                            } else {
                                c3053j.D();
                                z10 = true;
                            }
                            j11 = -1;
                        }
                        Unit unit = Unit.f36324a;
                    } finally {
                        if (h10) {
                            c3053j.n().C();
                        }
                    }
                }
                C3053j.this.i().F().a(C3053j.this.l(), C3053j.this.m(), this.f32056d.size());
                if (!z10) {
                    if (j11 != -1) {
                        return j11;
                    }
                    if (iOException == null) {
                        return -1L;
                    }
                    throw iOException;
                }
                j13 = 0;
            }
        }

        public final C3877e c() {
            return this.f32056d;
        }

        @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            C3053j c3053j = C3053j.this;
            synchronized (c3053j) {
                this.f32058f = true;
                size = this.f32056d.size();
                this.f32056d.a();
                Intrinsics.e(c3053j, "null cannot be cast to non-null type java.lang.Object");
                c3053j.notifyAll();
                Unit unit = Unit.f36324a;
            }
            if (size > 0) {
                j(size);
            }
            C3053j.this.c();
        }

        public final C3877e d() {
            return this.f32055c;
        }

        public final v e() {
            return this.f32057e;
        }

        public final void f(InterfaceC3879g source, long j10) {
            boolean z10;
            boolean z11;
            Intrinsics.checkNotNullParameter(source, "source");
            C3053j c3053j = C3053j.this;
            if (p.f11601e && Thread.holdsLock(c3053j)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c3053j);
            }
            long j11 = j10;
            while (j11 > 0) {
                synchronized (C3053j.this) {
                    z10 = this.f32054b;
                    z11 = this.f32056d.size() + j11 > this.f32053a;
                    Unit unit = Unit.f36324a;
                }
                if (z11) {
                    source.skip(j11);
                    C3053j.this.g(EnumC3045b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.skip(j11);
                    return;
                }
                long b22 = source.b2(this.f32055c, j11);
                if (b22 == -1) {
                    throw new EOFException();
                }
                j11 -= b22;
                C3053j c3053j2 = C3053j.this;
                synchronized (c3053j2) {
                    try {
                        if (this.f32058f) {
                            this.f32055c.a();
                        } else {
                            boolean z12 = this.f32056d.size() == 0;
                            this.f32056d.s0(this.f32055c);
                            if (z12) {
                                Intrinsics.e(c3053j2, "null cannot be cast to non-null type java.lang.Object");
                                c3053j2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            j(j10);
            C3053j.this.i().F().a(C3053j.this.l(), C3053j.this.m(), this.f32056d.size());
        }

        public final void g(boolean z10) {
            this.f32054b = z10;
        }

        public final void i(v vVar) {
            this.f32057e = vVar;
        }
    }

    /* renamed from: de.j$d */
    public final class d extends C3875c {
        public d() {
        }

        @Override // pe.C3875c
        protected void B() {
            C3053j.this.g(EnumC3045b.CANCEL);
            C3053j.this.i().t1();
        }

        public final void C() {
            if (w()) {
                throw x(null);
            }
        }

        @Override // pe.C3875c
        protected IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public C3053j(int i10, C3050g connection, boolean z10, boolean z11, v vVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f32035a = i10;
        this.f32036b = connection;
        this.f32037c = new C3122a(i10);
        this.f32039e = connection.Q().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f32040f = arrayDeque;
        this.f32042h = new c(connection.N().c(), z11);
        this.f32043i = new b(z10);
        this.f32044j = new d();
        this.f32045k = new d();
        if (vVar == null) {
            if (!u()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (u()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(vVar);
        }
    }

    private final boolean f(EnumC3045b enumC3045b, IOException iOException) {
        if (p.f11601e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f32046l != null) {
                return false;
            }
            this.f32046l = enumC3045b;
            this.f32047m = iOException;
            Intrinsics.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f32042h.b() && this.f32043i.c()) {
                return false;
            }
            Unit unit = Unit.f36324a;
            this.f32036b.o1(this.f32035a);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h() {
        return !this.f32036b.z() || this.f32043i.b() || this.f32043i.c();
    }

    public final void A(long j10) {
        this.f32038d = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x000f, B:13:0x001d, B:18:0x0027, B:25:0x0030, B:26:0x0035, B:30:0x0036, B:32:0x003e, B:35:0x004d, B:40:0x005c, B:39:0x0052, B:15:0x0022), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0001 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized v B(boolean z10) {
        Object removeFirst;
        boolean z11;
        while (this.f32040f.isEmpty() && this.f32046l == null) {
            try {
                try {
                    if (!z10 && !h()) {
                        z11 = false;
                        if (z11) {
                            this.f32044j.v();
                        }
                        D();
                        if (!z11) {
                            this.f32044j.C();
                        }
                    }
                    D();
                    if (!z11) {
                    }
                } catch (Throwable th) {
                    if (z11) {
                        this.f32044j.C();
                    }
                    throw th;
                }
                z11 = true;
                if (z11) {
                }
            } finally {
            }
        }
        if (this.f32040f.isEmpty()) {
            IOException iOException = this.f32047m;
            if (iOException != null) {
                throw iOException;
            }
            EnumC3045b enumC3045b = this.f32046l;
            Intrinsics.d(enumC3045b);
            throw new C3058o(enumC3045b);
        }
        removeFirst = this.f32040f.removeFirst();
        Intrinsics.checkNotNullExpressionValue(removeFirst, "removeFirst(...)");
        return (v) removeFirst;
    }

    public final synchronized v C() {
        v e10;
        if (!this.f32042h.b() || !this.f32042h.d().p0() || !this.f32042h.c().p0()) {
            if (this.f32046l == null) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            IOException iOException = this.f32047m;
            if (iOException != null) {
                throw iOException;
            }
            EnumC3045b enumC3045b = this.f32046l;
            Intrinsics.d(enumC3045b);
            throw new C3058o(enumC3045b);
        }
        e10 = this.f32042h.e();
        if (e10 == null) {
            e10 = p.f11597a;
        }
        return e10;
    }

    public final void D() {
        try {
            Intrinsics.e(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final c0 E() {
        return this.f32045k;
    }

    public final void b(long j10) {
        this.f32039e += j10;
        if (j10 > 0) {
            Intrinsics.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void c() {
        boolean z10;
        boolean v10;
        if (p.f11601e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f32042h.b() || !this.f32042h.a() || (!this.f32043i.c() && !this.f32043i.b())) {
                    z10 = false;
                    v10 = v();
                    Unit unit = Unit.f36324a;
                }
                z10 = true;
                v10 = v();
                Unit unit2 = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            e(EnumC3045b.CANCEL, null);
        } else {
            if (v10) {
                return;
            }
            this.f32036b.o1(this.f32035a);
        }
    }

    public final void d() {
        if (this.f32043i.b()) {
            throw new IOException("stream closed");
        }
        if (this.f32043i.c()) {
            throw new IOException("stream finished");
        }
        if (this.f32046l != null) {
            IOException iOException = this.f32047m;
            if (iOException != null) {
                throw iOException;
            }
            EnumC3045b enumC3045b = this.f32046l;
            Intrinsics.d(enumC3045b);
            throw new C3058o(enumC3045b);
        }
    }

    public final void e(EnumC3045b rstStatusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (f(rstStatusCode, iOException)) {
            this.f32036b.e2(this.f32035a, rstStatusCode);
        }
    }

    public final void g(EnumC3045b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (f(errorCode, null)) {
            this.f32036b.f2(this.f32035a, errorCode);
        }
    }

    public final C3050g i() {
        return this.f32036b;
    }

    public final synchronized EnumC3045b j() {
        return this.f32046l;
    }

    public final IOException k() {
        return this.f32047m;
    }

    public final int l() {
        return this.f32035a;
    }

    public final C3122a m() {
        return this.f32037c;
    }

    public final d n() {
        return this.f32044j;
    }

    public final Z o() {
        synchronized (this) {
            try {
                if (!this.f32041g && !u()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f32043i;
    }

    public final b p() {
        return this.f32043i;
    }

    public final c q() {
        return this.f32042h;
    }

    public final long r() {
        return this.f32039e;
    }

    public final long s() {
        return this.f32038d;
    }

    public final d t() {
        return this.f32045k;
    }

    public final boolean u() {
        return this.f32036b.z() == ((this.f32035a & 1) == 1);
    }

    public final synchronized boolean v() {
        try {
            if (this.f32046l != null) {
                return false;
            }
            if (!this.f32042h.b()) {
                if (this.f32042h.a()) {
                }
                return true;
            }
            if (this.f32043i.c() || this.f32043i.b()) {
                if (this.f32041g) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final c0 w() {
        return this.f32044j;
    }

    public final void x(InterfaceC3879g source, int i10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!p.f11601e || !Thread.holdsLock(this)) {
            this.f32042h.f(source, i10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:10:0x0038, B:12:0x003d, B:14:0x0045, B:17:0x004e, B:19:0x005f, B:20:0x0064, B:27:0x0056), top: B:9:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(v headers, boolean z10) {
        boolean v10;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (p.f11601e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f32041g && headers.c(":status") == null && headers.c(":method") == null) {
                    this.f32042h.i(headers);
                    if (z10) {
                        this.f32042h.g(true);
                    }
                    v10 = v();
                    Intrinsics.e(this, "null cannot be cast to non-null type java.lang.Object");
                    notifyAll();
                    Unit unit = Unit.f36324a;
                }
                this.f32041g = true;
                this.f32040f.add(headers);
                if (z10) {
                }
                v10 = v();
                Intrinsics.e(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                Unit unit2 = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (v10) {
            return;
        }
        this.f32036b.o1(this.f32035a);
    }

    public final synchronized void z(EnumC3045b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f32046l == null) {
            this.f32046l = errorCode;
            Intrinsics.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }
}
