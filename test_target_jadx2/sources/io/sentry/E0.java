package io.sentry;

import io.sentry.util.j;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class E0 extends AbstractC3438p implements K {

    /* renamed from: g, reason: collision with root package name */
    private static final Charset f34447g = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    private final L f34448c;

    /* renamed from: d, reason: collision with root package name */
    private final J f34449d;

    /* renamed from: e, reason: collision with root package name */
    private final Q f34450e;

    /* renamed from: f, reason: collision with root package name */
    private final ILogger f34451f;

    public E0(L l10, J j10, Q q10, ILogger iLogger, long j11) {
        super(iLogger, j11);
        this.f34448c = (L) io.sentry.util.n.c(l10, "Hub is required.");
        this.f34449d = (J) io.sentry.util.n.c(j10, "Envelope reader is required.");
        this.f34450e = (Q) io.sentry.util.n.c(q10, "Serializer is required.");
        this.f34451f = (ILogger) io.sentry.util.n.c(iLogger, "Logger is required.");
    }

    private n2 i(l2 l2Var) {
        String a10;
        if (l2Var != null && (a10 = l2Var.a()) != null) {
            try {
                Double valueOf = Double.valueOf(Double.parseDouble(a10));
                if (io.sentry.util.q.e(valueOf, false)) {
                    return new n2(Boolean.TRUE, valueOf);
                }
                this.f34451f.c(K1.ERROR, "Invalid sample rate parsed from TraceContext: %s", a10);
            } catch (Exception unused) {
                this.f34451f.c(K1.ERROR, "Unable to parse sample rate from TraceContext: %s", a10);
            }
        }
        return new n2(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(File file, io.sentry.hints.j jVar) {
        if (jVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.f34451f.c(K1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e10) {
            this.f34451f.a(K1.ERROR, e10, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    private void l(C3471y1 c3471y1, int i10) {
        this.f34451f.c(K1.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i10), c3471y1.x().b());
    }

    private void m(int i10) {
        this.f34451f.c(K1.DEBUG, "Item %d is being captured.", Integer.valueOf(i10));
    }

    private void n(io.sentry.protocol.r rVar) {
        this.f34451f.c(K1.WARNING, "Timed out waiting for event id submission: %s", rVar);
    }

    private void o(C3416h1 c3416h1, io.sentry.protocol.r rVar, int i10) {
        this.f34451f.c(K1.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i10), c3416h1.b().a(), rVar);
    }

    private void p(C3416h1 c3416h1, A a10) {
        BufferedReader bufferedReader;
        Object g10;
        this.f34451f.c(K1.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(io.sentry.util.b.d(c3416h1.c())));
        int i10 = 0;
        for (C3471y1 c3471y1 : c3416h1.c()) {
            i10++;
            if (c3471y1.x() == null) {
                this.f34451f.c(K1.ERROR, "Item %d has no header", Integer.valueOf(i10));
            } else if (J1.Event.equals(c3471y1.x().b())) {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c3471y1.w()), f34447g));
                } catch (Throwable th) {
                    this.f34451f.b(K1.ERROR, "Item failed to process.", th);
                }
                try {
                    A1 a12 = (A1) this.f34450e.c(bufferedReader, A1.class);
                    if (a12 == null) {
                        l(c3471y1, i10);
                    } else {
                        if (a12.L() != null) {
                            io.sentry.util.j.s(a10, a12.L().e());
                        }
                        if (c3416h1.b().a() == null || c3416h1.b().a().equals(a12.G())) {
                            this.f34448c.M(a12, a10);
                            m(i10);
                            if (!q(a10)) {
                                n(a12.G());
                                bufferedReader.close();
                                return;
                            }
                        } else {
                            o(c3416h1, a12.G(), i10);
                            bufferedReader.close();
                        }
                    }
                    bufferedReader.close();
                    g10 = io.sentry.util.j.g(a10);
                    if (!(g10 instanceof io.sentry.hints.o) && !((io.sentry.hints.o) g10).d()) {
                        this.f34451f.c(K1.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i10));
                        return;
                    }
                    io.sentry.util.j.o(a10, io.sentry.hints.i.class, new j.a() { // from class: io.sentry.D0
                        @Override // io.sentry.util.j.a
                        public final void accept(Object obj) {
                            ((io.sentry.hints.i) obj).reset();
                        }
                    });
                } finally {
                }
            } else {
                if (J1.Transaction.equals(c3471y1.x().b())) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c3471y1.w()), f34447g));
                        try {
                            io.sentry.protocol.y yVar = (io.sentry.protocol.y) this.f34450e.c(bufferedReader, io.sentry.protocol.y.class);
                            if (yVar == null) {
                                l(c3471y1, i10);
                            } else if (c3416h1.b().a() == null || c3416h1.b().a().equals(yVar.G())) {
                                l2 c10 = c3416h1.b().c();
                                if (yVar.C().e() != null) {
                                    yVar.C().e().n(i(c10));
                                }
                                this.f34448c.z(yVar, c10, a10);
                                m(i10);
                                if (!q(a10)) {
                                    n(yVar.G());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                o(c3416h1, yVar.G(), i10);
                                bufferedReader.close();
                            }
                            bufferedReader.close();
                        } finally {
                        }
                    } catch (Throwable th2) {
                        this.f34451f.b(K1.ERROR, "Item failed to process.", th2);
                    }
                } else {
                    this.f34448c.x(new C3416h1(c3416h1.b().a(), c3416h1.b().b(), c3471y1), a10);
                    this.f34451f.c(K1.DEBUG, "%s item %d is being captured.", c3471y1.x().b().getItemType(), Integer.valueOf(i10));
                    if (!q(a10)) {
                        this.f34451f.c(K1.WARNING, "Timed out waiting for item type submission: %s", c3471y1.x().b().getItemType());
                        return;
                    }
                }
                g10 = io.sentry.util.j.g(a10);
                if (!(g10 instanceof io.sentry.hints.o)) {
                }
                io.sentry.util.j.o(a10, io.sentry.hints.i.class, new j.a() { // from class: io.sentry.D0
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.i) obj).reset();
                    }
                });
            }
        }
    }

    private boolean q(A a10) {
        Object g10 = io.sentry.util.j.g(a10);
        if (g10 instanceof io.sentry.hints.h) {
            return ((io.sentry.hints.h) g10).e();
        }
        io.sentry.util.m.a(io.sentry.hints.h.class, g10, this.f34451f);
        return true;
    }

    @Override // io.sentry.K
    public void a(String str, A a10) {
        io.sentry.util.n.c(str, "Path is required.");
        f(new File(str), a10);
    }

    @Override // io.sentry.AbstractC3438p
    protected boolean c(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.AbstractC3438p
    public /* bridge */ /* synthetic */ void e(File file) {
        super.e(file);
    }

    @Override // io.sentry.AbstractC3438p
    protected void f(final File file, A a10) {
        ILogger iLogger;
        j.a aVar;
        io.sentry.util.n.c(file, "File is required.");
        try {
            if (!c(file.getName())) {
                this.f34451f.c(K1.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    C3416h1 a11 = this.f34449d.a(bufferedInputStream);
                    if (a11 == null) {
                        this.f34451f.c(K1.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        p(a11, a10);
                        this.f34451f.c(K1.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    iLogger = this.f34451f;
                    aVar = new j.a() { // from class: io.sentry.C0
                        @Override // io.sentry.util.j.a
                        public final void accept(Object obj) {
                            E0.this.k(file, (io.sentry.hints.j) obj);
                        }
                    };
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                this.f34451f.b(K1.ERROR, "Error processing envelope.", e10);
                iLogger = this.f34451f;
                aVar = new j.a() { // from class: io.sentry.C0
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        E0.this.k(file, (io.sentry.hints.j) obj);
                    }
                };
            }
            io.sentry.util.j.q(a10, io.sentry.hints.j.class, iLogger, aVar);
        } catch (Throwable th3) {
            io.sentry.util.j.q(a10, io.sentry.hints.j.class, this.f34451f, new j.a() { // from class: io.sentry.C0
                @Override // io.sentry.util.j.a
                public final void accept(Object obj) {
                    E0.this.k(file, (io.sentry.hints.j) obj);
                }
            });
            throw th3;
        }
    }
}
