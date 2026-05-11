package ae;

import ae.r;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import lc.AbstractC3622a;

/* loaded from: classes3.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    private final r f12792a;

    /* renamed from: b, reason: collision with root package name */
    private final Zd.d f12793b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12794c;

    /* renamed from: d, reason: collision with root package name */
    private long f12795d;

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList f12796e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f12797f;

    public static final class a extends Zd.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ r.b f12798e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h f12799f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, r.b bVar, h hVar) {
            super(str, false, 2, null);
            this.f12798e = bVar;
            this.f12799f = hVar;
        }

        @Override // Zd.a
        public long f() {
            r.a aVar;
            try {
                aVar = this.f12798e.e();
            } catch (Throwable th) {
                aVar = new r.a(this.f12798e, null, th, 2, null);
            }
            if (!this.f12799f.f12796e.contains(this.f12798e)) {
                return -1L;
            }
            this.f12799f.f12797f.put(aVar);
            return -1L;
        }
    }

    public h(r routePlanner, Zd.d taskRunner) {
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f12792a = routePlanner;
        this.f12793b = taskRunner;
        this.f12794c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f12795d = Long.MIN_VALUE;
        this.f12796e = new CopyOnWriteArrayList();
        this.f12797f = taskRunner.f().c(new LinkedBlockingDeque());
    }

    private final r.a e(long j10, TimeUnit timeUnit) {
        r.a aVar;
        if (this.f12796e.isEmpty() || (aVar = (r.a) this.f12797f.poll(j10, timeUnit)) == null) {
            return null;
        }
        this.f12796e.remove(aVar.d());
        return aVar;
    }

    private final void f() {
        Iterator it = this.f12796e.iterator();
        while (it.hasNext()) {
            r.b bVar = (r.b) it.next();
            bVar.cancel();
            r.b a10 = bVar.a();
            if (a10 != null) {
                b().f().addLast(a10);
            }
        }
        this.f12796e.clear();
    }

    private final r.a g() {
        r.b gVar;
        if (r.a(b(), null, 1, null)) {
            try {
                gVar = b().g();
            } catch (Throwable th) {
                gVar = new g(th);
            }
            if (gVar.d()) {
                return new r.a(gVar, null, null, 6, null);
            }
            if (gVar instanceof g) {
                return ((g) gVar).f();
            }
            this.f12796e.add(gVar);
            Zd.c.m(this.f12793b.k(), new a(Wd.p.f11602f + " connect " + b().b().l().s(), gVar, this), 0L, 2, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0002, B:5:0x000a, B:11:0x0020, B:13:0x002a, B:20:0x0054, B:23:0x005d, B:25:0x0063, B:27:0x0070, B:28:0x0078, B:31:0x007e, B:34:0x008a, B:36:0x0090, B:39:0x0096, B:40:0x009a, B:42:0x009e, B:43:0x009f, B:46:0x00a5, B:54:0x0049, B:56:0x00b2, B:57:0x00b9), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0002, B:5:0x000a, B:11:0x0020, B:13:0x002a, B:20:0x0054, B:23:0x005d, B:25:0x0063, B:27:0x0070, B:28:0x0078, B:31:0x007e, B:34:0x008a, B:36:0x0090, B:39:0x0096, B:40:0x009a, B:42:0x009e, B:43:0x009f, B:46:0x00a5, B:54:0x0049, B:56:0x00b2, B:57:0x00b9), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0002 A[SYNTHETIC] */
    @Override // ae.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l a() {
        r.a g10;
        long j10;
        Throwable e10;
        r.b c10;
        IOException iOException = null;
        while (true) {
            try {
                if (this.f12796e.isEmpty() && !r.a(b(), null, 1, null)) {
                    f();
                    Intrinsics.d(iOException);
                    throw iOException;
                }
                if (b().e()) {
                    throw new IOException("Canceled");
                }
                long b10 = this.f12793b.f().b();
                long j11 = this.f12795d - b10;
                if (!this.f12796e.isEmpty() && j11 > 0) {
                    j10 = j11;
                    g10 = null;
                    if (g10 == null || (g10 = e(j10, TimeUnit.NANOSECONDS)) != null) {
                        if (g10.f()) {
                            f();
                            if (!g10.d().d()) {
                                g10 = g10.d().g();
                            }
                            if (g10.f()) {
                                return g10.d().c();
                            }
                        }
                        e10 = g10.e();
                        if (e10 != null) {
                            if (!(e10 instanceof IOException)) {
                                throw e10;
                            }
                            if (iOException == null) {
                                iOException = (IOException) e10;
                            } else {
                                AbstractC3622a.a(iOException, e10);
                            }
                        }
                        c10 = g10.c();
                        if (c10 == null) {
                            b().f().addFirst(c10);
                        }
                    }
                }
                g10 = g();
                j10 = this.f12794c;
                this.f12795d = b10 + j10;
                if (g10 == null) {
                }
                if (g10.f()) {
                }
                e10 = g10.e();
                if (e10 != null) {
                }
                c10 = g10.c();
                if (c10 == null) {
                }
            } finally {
                f();
            }
        }
    }

    @Override // ae.f
    public r b() {
        return this.f12792a;
    }
}
