package io.sentry;

import io.sentry.util.j;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: io.sentry.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3463w extends AbstractC3438p implements K {

    /* renamed from: c, reason: collision with root package name */
    private final L f35613c;

    /* renamed from: d, reason: collision with root package name */
    private final Q f35614d;

    /* renamed from: e, reason: collision with root package name */
    private final ILogger f35615e;

    public C3463w(L l10, Q q10, ILogger iLogger, long j10) {
        super(iLogger, j10);
        this.f35613c = (L) io.sentry.util.n.c(l10, "Hub is required.");
        this.f35614d = (Q) io.sentry.util.n.c(q10, "Serializer is required.");
        this.f35615e = (ILogger) io.sentry.util.n.c(iLogger, "Logger is required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(io.sentry.hints.h hVar) {
        if (hVar.e()) {
            return;
        }
        this.f35615e.c(K1.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Throwable th, File file, io.sentry.hints.j jVar) {
        jVar.c(false);
        this.f35615e.a(K1.INFO, th, "File '%s' won't retry.", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(File file, io.sentry.hints.j jVar) {
        if (jVar.a()) {
            this.f35615e.c(K1.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            m(file, "after trying to capture it");
            this.f35615e.c(K1.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    private void m(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.f35615e.c(K1.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th) {
            this.f35615e.a(K1.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.K
    public void a(String str, A a10) {
        io.sentry.util.n.c(str, "Path is required.");
        f(new File(str), a10);
    }

    @Override // io.sentry.AbstractC3438p
    protected boolean c(String str) {
        return str.endsWith(".envelope");
    }

    @Override // io.sentry.AbstractC3438p
    public /* bridge */ /* synthetic */ void e(File file) {
        super.e(file);
    }

    @Override // io.sentry.AbstractC3438p
    protected void f(final File file, A a10) {
        ILogger iLogger;
        j.a aVar;
        if (!file.isFile()) {
            this.f35615e.c(K1.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!c(file.getName())) {
            this.f35615e.c(K1.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.f35615e.c(K1.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        C3416h1 d10 = this.f35614d.d(bufferedInputStream);
                        if (d10 == null) {
                            this.f35615e.c(K1.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.f35613c.x(d10, a10);
                        }
                        io.sentry.util.j.q(a10, io.sentry.hints.h.class, this.f35615e, new j.a() { // from class: io.sentry.t
                            @Override // io.sentry.util.j.a
                            public final void accept(Object obj) {
                                C3463w.this.j((io.sentry.hints.h) obj);
                            }
                        });
                        bufferedInputStream.close();
                        iLogger = this.f35615e;
                        aVar = new j.a() { // from class: io.sentry.u
                            @Override // io.sentry.util.j.a
                            public final void accept(Object obj) {
                                C3463w.this.l(file, (io.sentry.hints.j) obj);
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
                } catch (FileNotFoundException e10) {
                    this.f35615e.a(K1.ERROR, e10, "File '%s' cannot be found.", file.getAbsolutePath());
                    iLogger = this.f35615e;
                    aVar = new j.a() { // from class: io.sentry.u
                        @Override // io.sentry.util.j.a
                        public final void accept(Object obj) {
                            C3463w.this.l(file, (io.sentry.hints.j) obj);
                        }
                    };
                }
            } catch (IOException e11) {
                this.f35615e.a(K1.ERROR, e11, "I/O on file '%s' failed.", file.getAbsolutePath());
                iLogger = this.f35615e;
                aVar = new j.a() { // from class: io.sentry.u
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        C3463w.this.l(file, (io.sentry.hints.j) obj);
                    }
                };
            } catch (Throwable th3) {
                this.f35615e.a(K1.ERROR, th3, "Failed to capture cached envelope %s", file.getAbsolutePath());
                io.sentry.util.j.q(a10, io.sentry.hints.j.class, this.f35615e, new j.a() { // from class: io.sentry.v
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        C3463w.this.k(th3, file, (io.sentry.hints.j) obj);
                    }
                });
                iLogger = this.f35615e;
                aVar = new j.a() { // from class: io.sentry.u
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        C3463w.this.l(file, (io.sentry.hints.j) obj);
                    }
                };
            }
            io.sentry.util.j.q(a10, io.sentry.hints.j.class, iLogger, aVar);
        } catch (Throwable th4) {
            io.sentry.util.j.q(a10, io.sentry.hints.j.class, this.f35615e, new j.a() { // from class: io.sentry.u
                @Override // io.sentry.util.j.a
                public final void accept(Object obj) {
                    C3463w.this.l(file, (io.sentry.hints.j) obj);
                }
            });
            throw th4;
        }
    }
}
