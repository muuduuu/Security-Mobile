package ae;

import Td.B;
import Td.D;
import Td.F;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import ae.r;
import be.C1679a;
import be.C1680b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lc.AbstractC3622a;
import org.conscrypt.BuildConfig;
import pe.C3875c;

/* loaded from: classes3.dex */
public final class k implements InterfaceC1229e, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private final B f12801a;

    /* renamed from: b, reason: collision with root package name */
    private final D f12802b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12803c;

    /* renamed from: d, reason: collision with root package name */
    private final m f12804d;

    /* renamed from: e, reason: collision with root package name */
    private final Td.s f12805e;

    /* renamed from: f, reason: collision with root package name */
    private final c f12806f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f12807g;

    /* renamed from: h, reason: collision with root package name */
    private Object f12808h;

    /* renamed from: i, reason: collision with root package name */
    private f f12809i;

    /* renamed from: j, reason: collision with root package name */
    private l f12810j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12811k;

    /* renamed from: l, reason: collision with root package name */
    private e f12812l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12813m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12814n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12815o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f12816p;

    /* renamed from: q, reason: collision with root package name */
    private volatile e f12817q;

    /* renamed from: r, reason: collision with root package name */
    private final CopyOnWriteArrayList f12818r;

    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1230f f12819a;

        /* renamed from: b, reason: collision with root package name */
        private volatile AtomicInteger f12820b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f12821c;

        public a(k kVar, InterfaceC1230f responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f12821c = kVar;
            this.f12819a = responseCallback;
            this.f12820b = new AtomicInteger(0);
        }

        public static /* synthetic */ void c(a aVar, RejectedExecutionException rejectedExecutionException, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rejectedExecutionException = null;
            }
            aVar.b(rejectedExecutionException);
        }

        public final void a(ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            Td.q o10 = this.f12821c.n().o();
            if (Wd.p.f11601e && Thread.holdsLock(o10)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + o10);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    b(e10);
                    this.f12821c.n().o().f(this);
                }
            } catch (Throwable th) {
                this.f12821c.n().o().f(this);
                throw th;
            }
        }

        public final void b(RejectedExecutionException rejectedExecutionException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(rejectedExecutionException);
            this.f12821c.A(interruptedIOException);
            this.f12819a.d(this.f12821c, interruptedIOException);
        }

        public final k d() {
            return this.f12821c;
        }

        public final AtomicInteger e() {
            return this.f12820b;
        }

        public final String f() {
            return this.f12821c.v().n().h();
        }

        public final void g(a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.f12820b = other.f12820b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th;
            IOException e10;
            Td.q o10;
            String str = "OkHttp " + this.f12821c.B();
            k kVar = this.f12821c;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                kVar.f12806f.v();
                try {
                    try {
                        z10 = true;
                        try {
                            this.f12819a.c(kVar, kVar.x());
                            o10 = kVar.n().o();
                        } catch (IOException e11) {
                            e10 = e11;
                            if (z10) {
                                ge.n.f33789a.g().k("Callback failure for " + kVar.H(), 4, e10);
                            } else {
                                this.f12819a.d(kVar, e10);
                            }
                            o10 = kVar.n().o();
                            o10.f(this);
                        } catch (Throwable th2) {
                            th = th2;
                            kVar.cancel();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th);
                                AbstractC3622a.a(iOException, th);
                                this.f12819a.d(kVar, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        kVar.n().o().f(this);
                        throw th3;
                    }
                } catch (IOException e12) {
                    z10 = false;
                    e10 = e12;
                } catch (Throwable th4) {
                    z10 = false;
                    th = th4;
                }
                o10.f(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    public static final class b extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        private final Object f12822a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f12822a = obj;
        }

        public final Object a() {
            return this.f12822a;
        }
    }

    public static final class c extends C3875c {
        c() {
        }

        @Override // pe.C3875c
        protected void B() {
            k.this.cancel();
        }
    }

    public k(B client, D originalRequest, boolean z10) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f12801a = client;
        this.f12802b = originalRequest;
        this.f12803c = z10;
        this.f12804d = client.l().a();
        this.f12805e = client.q().a(this);
        c cVar = new c();
        cVar.g(client.h(), TimeUnit.MILLISECONDS);
        this.f12806f = cVar;
        this.f12807g = new AtomicBoolean();
        this.f12815o = true;
        this.f12818r = new CopyOnWriteArrayList();
    }

    private final IOException G(IOException iOException) {
        if (this.f12811k) {
            return iOException;
        }
        if (!this.f12806f.w()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String H() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e() ? "canceled " : BuildConfig.FLAVOR);
        sb2.append(this.f12803c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(B());
        return sb2.toString();
    }

    private final IOException h(IOException iOException) {
        Socket C10;
        boolean z10 = Wd.p.f11601e;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        l lVar = this.f12810j;
        if (lVar != null) {
            if (z10 && Thread.holdsLock(lVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + lVar);
            }
            synchronized (lVar) {
                C10 = C();
            }
            if (this.f12810j == null) {
                if (C10 != null) {
                    Wd.p.g(C10);
                }
                this.f12805e.l(this, lVar);
                lVar.j().g(lVar, this);
                if (C10 != null) {
                    lVar.j().f(lVar);
                }
            } else if (C10 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException G10 = G(iOException);
        if (iOException != null) {
            Td.s sVar = this.f12805e;
            Intrinsics.d(G10);
            sVar.e(this, G10);
        } else {
            this.f12805e.d(this);
        }
        return G10;
    }

    private final void i() {
        this.f12808h = ge.n.f33789a.g().i("response.body().close()");
        this.f12805e.f(this);
    }

    public final IOException A(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f12815o) {
                    this.f12815o = false;
                    if (!this.f12813m && !this.f12814n) {
                        z10 = true;
                    }
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10 ? h(iOException) : iOException;
    }

    public final String B() {
        return this.f12802b.n().s();
    }

    public final Socket C() {
        l lVar = this.f12810j;
        Intrinsics.d(lVar);
        if (Wd.p.f11601e && !Thread.holdsLock(lVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + lVar);
        }
        List i10 = lVar.i();
        Iterator it = i10.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.b(((Reference) it.next()).get(), this)) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        i10.remove(i11);
        this.f12810j = null;
        if (i10.isEmpty()) {
            lVar.x(System.nanoTime());
            if (this.f12804d.c(lVar)) {
                return lVar.z();
            }
        }
        return null;
    }

    public final boolean D() {
        e eVar = this.f12817q;
        if (eVar != null && eVar.k()) {
            f fVar = this.f12809i;
            Intrinsics.d(fVar);
            r b10 = fVar.b();
            e eVar2 = this.f12817q;
            if (b10.d(eVar2 != null ? eVar2.h() : null)) {
                return true;
            }
        }
        return false;
    }

    public final void E() {
        if (this.f12811k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f12811k = true;
        this.f12806f.w();
    }

    @Override // Td.InterfaceC1229e
    public void cancel() {
        if (this.f12816p) {
            return;
        }
        this.f12816p = true;
        e eVar = this.f12817q;
        if (eVar != null) {
            eVar.b();
        }
        Iterator it = this.f12818r.iterator();
        while (it.hasNext()) {
            ((r.b) it.next()).cancel();
        }
        this.f12805e.g(this);
    }

    public final void d(l connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!Wd.p.f11601e || Thread.holdsLock(connection)) {
            if (this.f12810j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f12810j = connection;
            connection.i().add(new b(this, this.f12808h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // Td.InterfaceC1229e
    public boolean e() {
        return this.f12816p;
    }

    @Override // Td.InterfaceC1229e
    public void g1(InterfaceC1230f responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f12807g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        i();
        this.f12801a.o().a(new a(this, responseCallback));
    }

    @Override // Td.InterfaceC1229e
    public F j() {
        if (!this.f12807g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f12806f.v();
        i();
        try {
            this.f12801a.o().b(this);
            return x();
        } finally {
            this.f12801a.o().g(this);
        }
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC1229e clone() {
        return new k(this.f12801a, this.f12802b, this.f12803c);
    }

    public final void l(D request, boolean z10, be.g chain) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (this.f12812l != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f12814n) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f12813m) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f36324a;
        }
        if (z10) {
            n nVar = new n(this.f12801a.v(), this.f12804d, this.f12801a.H(), this.f12801a.N(), chain.f(), chain.h(), this.f12801a.C(), this.f12801a.I(), this.f12801a.r(), this.f12801a.e(request.n()), this.f12801a.u(), new C1395a(this, this.f12804d.d(), chain));
            this.f12809i = this.f12801a.r() ? new h(nVar, this.f12801a.v()) : new t(nVar);
        }
    }

    public final void m(boolean z10) {
        e eVar;
        synchronized (this) {
            if (!this.f12815o) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f36324a;
        }
        if (z10 && (eVar = this.f12817q) != null) {
            eVar.d();
        }
        this.f12812l = null;
    }

    public final B n() {
        return this.f12801a;
    }

    public final l o() {
        return this.f12810j;
    }

    public final Td.s p() {
        return this.f12805e;
    }

    public final boolean q() {
        return this.f12803c;
    }

    public final e s() {
        return this.f12812l;
    }

    @Override // Td.InterfaceC1229e
    public D t() {
        return this.f12802b;
    }

    public final D v() {
        return this.f12802b;
    }

    public final CopyOnWriteArrayList w() {
        return this.f12818r;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final F x() {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.z(arrayList, this.f12801a.x());
        arrayList.add(new be.j(this.f12801a));
        arrayList.add(new C1679a(this.f12801a.n()));
        arrayList.add(new Yd.a(this.f12801a.g()));
        arrayList.add(C1396b.f12742a);
        if (!this.f12803c) {
            CollectionsKt.z(arrayList, this.f12801a.z());
        }
        arrayList.add(new C1680b(this.f12803c));
        boolean z10 = false;
        try {
            F a10 = new be.g(this, arrayList, 0, null, this.f12802b, this.f12801a.k(), this.f12801a.H(), this.f12801a.N()).a(this.f12802b);
            if (e()) {
                Wd.m.f(a10);
                throw new IOException("Canceled");
            }
            A(null);
            return a10;
        } catch (IOException e10) {
            try {
                IOException A10 = A(e10);
                Intrinsics.e(A10, "null cannot be cast to non-null type kotlin.Throwable");
                throw A10;
            } catch (Throwable th) {
                th = th;
                z10 = true;
                if (!z10) {
                    A(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z10) {
            }
            throw th;
        }
    }

    public final e y(be.g chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.f12815o) {
                throw new IllegalStateException("released");
            }
            if (this.f12814n) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f12813m) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f36324a;
        }
        f fVar = this.f12809i;
        Intrinsics.d(fVar);
        e eVar = new e(this, this.f12805e, fVar, fVar.a().s(this.f12801a, chain));
        this.f12812l = eVar;
        this.f12817q = eVar;
        synchronized (this) {
            this.f12813m = true;
            this.f12814n = true;
        }
        if (this.f12816p) {
            throw new IOException("Canceled");
        }
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:44:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001b), top: B:43:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:44:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001b), top: B:43:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException z(e exchange, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        boolean z13;
        boolean z14;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (!Intrinsics.b(exchange, this.f12817q)) {
            return iOException;
        }
        synchronized (this) {
            z12 = false;
            if (z10) {
                try {
                    if (!this.f12813m) {
                    }
                    if (z10) {
                        this.f12813m = false;
                    }
                    if (z11) {
                        this.f12814n = false;
                    }
                    z14 = this.f12813m;
                    boolean z15 = z14 && !this.f12814n;
                    if (!z14 && !this.f12814n && !this.f12815o) {
                        z12 = true;
                    }
                    z13 = z12;
                    z12 = z15;
                    Unit unit = Unit.f36324a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z11 || !this.f12814n) {
                z13 = false;
                Unit unit2 = Unit.f36324a;
            }
            if (z10) {
            }
            if (z11) {
            }
            z14 = this.f12813m;
            if (z14) {
            }
            if (!z14) {
                z12 = true;
            }
            z13 = z12;
            z12 = z15;
            Unit unit22 = Unit.f36324a;
        }
        if (z12) {
            this.f12817q = null;
            l lVar = this.f12810j;
            if (lVar != null) {
                lVar.o();
            }
        }
        return z13 ? h(iOException) : iOException;
    }
}
