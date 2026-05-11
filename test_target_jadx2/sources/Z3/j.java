package Z3;

import c3.AbstractC1721a;
import f3.AbstractC3142a;
import h4.C3230a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: h, reason: collision with root package name */
    public static final a f12394h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Class f12395i = j.class;

    /* renamed from: a, reason: collision with root package name */
    private final W2.n f12396a;

    /* renamed from: b, reason: collision with root package name */
    private final e3.i f12397b;

    /* renamed from: c, reason: collision with root package name */
    private final e3.l f12398c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f12399d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f12400e;

    /* renamed from: f, reason: collision with root package name */
    private final t f12401f;

    /* renamed from: g, reason: collision with root package name */
    private final C f12402g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(W2.n fileCache, e3.i pooledByteBufferFactory, e3.l pooledByteStreams, Executor readExecutor, Executor writeExecutor, t imageCacheStatsTracker) {
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        Intrinsics.checkNotNullParameter(readExecutor, "readExecutor");
        Intrinsics.checkNotNullParameter(writeExecutor, "writeExecutor");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        this.f12396a = fileCache;
        this.f12397b = pooledByteBufferFactory;
        this.f12398c = pooledByteStreams;
        this.f12399d = readExecutor;
        this.f12400e = writeExecutor;
        this.f12401f = imageCacheStatsTracker;
        C d10 = C.d();
        Intrinsics.checkNotNullExpressionValue(d10, "getInstance()");
        this.f12402g = d10;
    }

    private final boolean g(V2.d dVar) {
        g4.i c10 = this.f12402g.c(dVar);
        if (c10 != null) {
            c10.close();
            AbstractC1721a.z(f12395i, "Found image for %s in staging area", dVar.c());
            this.f12401f.e(dVar);
            return true;
        }
        AbstractC1721a.z(f12395i, "Did not find image for %s in staging area", dVar.c());
        this.f12401f.h(dVar);
        try {
            return this.f12396a.e(dVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i(Object obj, j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object e10 = C3230a.e(obj, null);
        try {
            this$0.f12402g.a();
            this$0.f12396a.a();
            return null;
        } finally {
        }
    }

    private final G1.f l(V2.d dVar, g4.i iVar) {
        AbstractC1721a.z(f12395i, "Found image for %s in staging area", dVar.c());
        this.f12401f.e(dVar);
        G1.f h10 = G1.f.h(iVar);
        Intrinsics.checkNotNullExpressionValue(h10, "forResult(pinnedImage)");
        return h10;
    }

    private final G1.f n(final V2.d dVar, final AtomicBoolean atomicBoolean) {
        try {
            final Object d10 = C3230a.d("BufferedDiskCache_getAsync");
            G1.f b10 = G1.f.b(new Callable() { // from class: Z3.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    g4.i o10;
                    o10 = j.o(d10, atomicBoolean, this, dVar);
                    return o10;
                }
            }, this.f12399d);
            Intrinsics.checkNotNullExpressionValue(b10, "{\n      val token = Fres…      readExecutor)\n    }");
            return b10;
        } catch (Exception e10) {
            AbstractC1721a.I(f12395i, e10, "Failed to schedule disk-cache read for %s", dVar.c());
            G1.f g10 = G1.f.g(e10);
            Intrinsics.checkNotNullExpressionValue(g10, "{\n      // Log failure\n …forError(exception)\n    }");
            return g10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g4.i o(Object obj, AtomicBoolean isCancelled, j this$0, V2.d key) {
        Intrinsics.checkNotNullParameter(isCancelled, "$isCancelled");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object e10 = C3230a.e(obj, null);
        try {
            if (isCancelled.get()) {
                throw new CancellationException();
            }
            g4.i c10 = this$0.f12402g.c(key);
            if (c10 != null) {
                AbstractC1721a.z(f12395i, "Found image for %s in staging area", key.c());
                this$0.f12401f.e(key);
            } else {
                AbstractC1721a.z(f12395i, "Did not find image for %s in staging area", key.c());
                this$0.f12401f.h(key);
                try {
                    e3.h r10 = this$0.r(key);
                    if (r10 == null) {
                        return null;
                    }
                    AbstractC3142a y10 = AbstractC3142a.y(r10);
                    Intrinsics.checkNotNullExpressionValue(y10, "of(buffer)");
                    try {
                        c10 = new g4.i(y10);
                    } finally {
                        AbstractC3142a.n(y10);
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            if (!Thread.interrupted()) {
                return c10;
            }
            AbstractC1721a.y(f12395i, "Host thread was interrupted, decreasing reference count");
            c10.close();
            throw new InterruptedException();
        } catch (Throwable th) {
            try {
                C3230a.c(obj, th);
                throw th;
            } finally {
                C3230a.f(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Object obj, j this$0, V2.d key, g4.i iVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object e10 = C3230a.e(obj, null);
        try {
            this$0.u(key, iVar);
        } finally {
        }
    }

    private final e3.h r(V2.d dVar) {
        try {
            Class cls = f12395i;
            AbstractC1721a.z(cls, "Disk cache read for %s", dVar.c());
            U2.a c10 = this.f12396a.c(dVar);
            if (c10 == null) {
                AbstractC1721a.z(cls, "Disk cache miss for %s", dVar.c());
                this.f12401f.l(dVar);
                return null;
            }
            AbstractC1721a.z(cls, "Found entry in disk cache for %s", dVar.c());
            this.f12401f.i(dVar);
            InputStream a10 = c10.a();
            try {
                e3.h d10 = this.f12397b.d(a10, (int) c10.size());
                a10.close();
                AbstractC1721a.z(cls, "Successful read from disk cache for %s", dVar.c());
                return d10;
            } catch (Throwable th) {
                a10.close();
                throw th;
            }
        } catch (IOException e10) {
            AbstractC1721a.I(f12395i, e10, "Exception reading from cache for %s", dVar.c());
            this.f12401f.k(dVar);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void t(Object obj, j this$0, V2.d key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object e10 = C3230a.e(obj, null);
        try {
            this$0.f12402g.g(key);
            this$0.f12396a.f(key);
            return null;
        } finally {
        }
    }

    private final void u(V2.d dVar, final g4.i iVar) {
        Class cls = f12395i;
        AbstractC1721a.z(cls, "About to write to disk-cache for key %s", dVar.c());
        try {
            this.f12396a.g(dVar, new V2.j() { // from class: Z3.i
                @Override // V2.j
                public final void a(OutputStream outputStream) {
                    j.v(g4.i.this, this, outputStream);
                }
            });
            this.f12401f.d(dVar);
            AbstractC1721a.z(cls, "Successful disk-cache write for key %s", dVar.c());
        } catch (IOException e10) {
            AbstractC1721a.I(f12395i, e10, "Failed to write to disk-cache for key %s", dVar.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(g4.i iVar, j this$0, OutputStream os) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.d(iVar);
        InputStream l10 = iVar.l();
        if (l10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this$0.f12398c.a(l10, os);
    }

    public final void f(V2.d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f12396a.d(key);
    }

    public final G1.f h() {
        this.f12402g.a();
        final Object d10 = C3230a.d("BufferedDiskCache_clearAll");
        try {
            G1.f b10 = G1.f.b(new Callable() { // from class: Z3.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void i10;
                    i10 = j.i(d10, this);
                    return i10;
                }
            }, this.f12400e);
            Intrinsics.checkNotNullExpressionValue(b10, "{\n      Task.call(\n     …     writeExecutor)\n    }");
            return b10;
        } catch (Exception e10) {
            AbstractC1721a.I(f12395i, e10, "Failed to schedule disk-cache clear", new Object[0]);
            G1.f g10 = G1.f.g(e10);
            Intrinsics.checkNotNullExpressionValue(g10, "{\n      // Log failure\n …forError(exception)\n    }");
            return g10;
        }
    }

    public final boolean j(V2.d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f12402g.b(key) || this.f12396a.b(key);
    }

    public final boolean k(V2.d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (j(key)) {
            return true;
        }
        return g(key);
    }

    public final G1.f m(V2.d key, AtomicBoolean isCancelled) {
        G1.f n10;
        G1.f l10;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(isCancelled, "isCancelled");
        if (!n4.b.d()) {
            g4.i c10 = this.f12402g.c(key);
            return (c10 == null || (l10 = l(key, c10)) == null) ? n(key, isCancelled) : l10;
        }
        n4.b.a("BufferedDiskCache#get");
        try {
            g4.i c11 = this.f12402g.c(key);
            if (c11 != null) {
                n10 = l(key, c11);
                if (n10 == null) {
                }
                n4.b.b();
                return n10;
            }
            n10 = n(key, isCancelled);
            n4.b.b();
            return n10;
        } catch (Throwable th) {
            n4.b.b();
            throw th;
        }
    }

    public final void p(final V2.d key, g4.i encodedImage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!n4.b.d()) {
            if (!g4.i.y(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f12402g.f(key, encodedImage);
            final g4.i b10 = g4.i.b(encodedImage);
            try {
                final Object d10 = C3230a.d("BufferedDiskCache_putAsync");
                this.f12400e.execute(new Runnable() { // from class: Z3.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(d10, this, key, b10);
                    }
                });
                return;
            } catch (Exception e10) {
                AbstractC1721a.I(f12395i, e10, "Failed to schedule disk-cache write for %s", key.c());
                this.f12402g.h(key, encodedImage);
                g4.i.c(b10);
                return;
            }
        }
        n4.b.a("BufferedDiskCache#put");
        try {
            if (!g4.i.y(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f12402g.f(key, encodedImage);
            final g4.i b11 = g4.i.b(encodedImage);
            try {
                final Object d11 = C3230a.d("BufferedDiskCache_putAsync");
                this.f12400e.execute(new Runnable() { // from class: Z3.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(d11, this, key, b11);
                    }
                });
            } catch (Exception e11) {
                AbstractC1721a.I(f12395i, e11, "Failed to schedule disk-cache write for %s", key.c());
                this.f12402g.h(key, encodedImage);
                g4.i.c(b11);
            }
            Unit unit = Unit.f36324a;
        } finally {
            n4.b.b();
        }
    }

    public final G1.f s(final V2.d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f12402g.g(key);
        try {
            final Object d10 = C3230a.d("BufferedDiskCache_remove");
            G1.f b10 = G1.f.b(new Callable() { // from class: Z3.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void t10;
                    t10 = j.t(d10, this, key);
                    return t10;
                }
            }, this.f12400e);
            Intrinsics.checkNotNullExpressionValue(b10, "{\n      val token = Fres…     writeExecutor)\n    }");
            return b10;
        } catch (Exception e10) {
            AbstractC1721a.I(f12395i, e10, "Failed to schedule disk-cache remove for %s", key.c());
            G1.f g10 = G1.f.g(e10);
            Intrinsics.checkNotNullExpressionValue(g10, "{\n      // Log failure\n …forError(exception)\n    }");
            return g10;
        }
    }
}
