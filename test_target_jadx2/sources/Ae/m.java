package ae;

import Td.AbstractC1235k;
import Td.C1225a;
import ae.k;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wc.InterfaceC5068n;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: j, reason: collision with root package name */
    public static final a f12846j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    private static AtomicReferenceFieldUpdater f12847k = AtomicReferenceFieldUpdater.newUpdater(m.class, Map.class, "f");

    /* renamed from: a, reason: collision with root package name */
    private final Zd.d f12848a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12849b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1235k f12850c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5068n f12851d;

    /* renamed from: e, reason: collision with root package name */
    private final long f12852e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Map f12853f;

    /* renamed from: g, reason: collision with root package name */
    private final Zd.c f12854g;

    /* renamed from: h, reason: collision with root package name */
    private final b f12855h;

    /* renamed from: i, reason: collision with root package name */
    private final ConcurrentLinkedQueue f12856i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Zd.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // Zd.a
        public long f() {
            return m.this.b(System.nanoTime());
        }
    }

    public m(Zd.d taskRunner, int i10, long j10, TimeUnit timeUnit, AbstractC1235k connectionListener, InterfaceC5068n exchangeFinderFactory) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        Intrinsics.checkNotNullParameter(exchangeFinderFactory, "exchangeFinderFactory");
        this.f12848a = taskRunner;
        this.f12849b = i10;
        this.f12850c = connectionListener;
        this.f12851d = exchangeFinderFactory;
        this.f12852e = timeUnit.toNanos(j10);
        this.f12853f = G.h();
        this.f12854g = taskRunner.k();
        this.f12855h = new b(Wd.p.f11602f + " ConnectionPool connection closer");
        this.f12856i = new ConcurrentLinkedQueue();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    private final boolean e(Map map, l lVar) {
        android.support.v4.media.session.b.a(map.get(lVar.h().a()));
        return true;
    }

    private final int f(l lVar, long j10) {
        if (Wd.p.f11601e && !Thread.holdsLock(lVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + lVar);
        }
        List i10 = lVar.i();
        int i11 = 0;
        while (i11 < i10.size()) {
            Reference reference = (Reference) i10.get(i11);
            if (reference.get() != null) {
                i11++;
            } else {
                Intrinsics.e(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                ge.n.f33789a.g().m("A connection to " + lVar.v().a().l() + " was leaked. Did you forget to close a response body?", ((k.b) reference).a());
                i10.remove(i11);
                if (i10.isEmpty()) {
                    lVar.x(j10 - this.f12852e);
                    return 0;
                }
            }
        }
        return i10.size();
    }

    public final l a(boolean z10, C1225a address, d connectionUser, List list, boolean z11) {
        boolean z12;
        boolean l10;
        Socket r10;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(connectionUser, "connectionUser");
        Iterator it = this.f12856i.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            Intrinsics.d(lVar);
            synchronized (lVar) {
                z12 = false;
                if (z11) {
                    try {
                        if (!lVar.r()) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (lVar.p(address, list)) {
                    connectionUser.g(lVar);
                    z12 = true;
                }
            }
            if (z12) {
                if (lVar.q(z10)) {
                    return lVar;
                }
                synchronized (lVar) {
                    l10 = lVar.l();
                    lVar.y(true);
                    r10 = connectionUser.r();
                }
                if (r10 != null) {
                    Wd.p.g(r10);
                    this.f12850c.f(lVar);
                } else if (!l10) {
                    this.f12850c.h(lVar);
                }
            }
        }
        return null;
    }

    public final long b(long j10) {
        Map map = this.f12853f;
        Iterator it = map.values().iterator();
        l lVar = null;
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        Iterator it2 = this.f12856i.iterator();
        while (it2.hasNext()) {
            android.support.v4.media.session.b.a(map.get(((l) it2.next()).h().a()));
        }
        long j11 = (j10 - this.f12852e) + 1;
        Iterator it3 = this.f12856i.iterator();
        int i10 = 0;
        l lVar2 = null;
        l lVar3 = null;
        long j12 = Long.MAX_VALUE;
        int i11 = 0;
        while (it3.hasNext()) {
            l lVar4 = (l) it3.next();
            Intrinsics.d(lVar4);
            synchronized (lVar4) {
                if (f(lVar4, j10) > 0) {
                    i11++;
                } else {
                    long k10 = lVar4.k();
                    if (k10 < j11) {
                        lVar2 = lVar4;
                        j11 = k10;
                    }
                    if (e(map, lVar4)) {
                        i10++;
                        if (k10 < j12) {
                            lVar3 = lVar4;
                            j12 = k10;
                        }
                    }
                }
                Unit unit = Unit.f36324a;
            }
        }
        if (lVar2 != null) {
            lVar = lVar2;
        } else if (i10 > this.f12849b) {
            j11 = j12;
            lVar = lVar3;
        } else {
            j11 = -1;
        }
        if (lVar == null) {
            if (lVar3 != null) {
                return (j12 + this.f12852e) - j10;
            }
            if (i11 > 0) {
                return this.f12852e;
            }
            return -1L;
        }
        synchronized (lVar) {
            if (!lVar.i().isEmpty()) {
                return 0L;
            }
            if (lVar.k() != j11) {
                return 0L;
            }
            lVar.y(true);
            this.f12856i.remove(lVar);
            android.support.v4.media.session.b.a(map.get(lVar.h().a()));
            Wd.p.g(lVar.z());
            this.f12850c.f(lVar);
            if (this.f12856i.isEmpty()) {
                this.f12854g.a();
            }
            return 0L;
        }
    }

    public final boolean c(l connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (Wd.p.f11601e && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.l() && this.f12849b != 0) {
            h();
            return false;
        }
        connection.y(true);
        this.f12856i.remove(connection);
        if (this.f12856i.isEmpty()) {
            this.f12854g.a();
        }
        i(connection.h().a());
        return true;
    }

    public final AbstractC1235k d() {
        return this.f12850c;
    }

    public final void g(l connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!Wd.p.f11601e || Thread.holdsLock(connection)) {
            this.f12856i.add(connection);
            h();
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final void h() {
        Zd.c.m(this.f12854g, this.f12855h, 0L, 2, null);
    }

    public final void i(C1225a address) {
        Intrinsics.checkNotNullParameter(address, "address");
        android.support.v4.media.session.b.a(this.f12853f.get(address));
    }
}
