package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3438p {

    /* renamed from: a, reason: collision with root package name */
    private final ILogger f35235a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35236b;

    /* renamed from: io.sentry.p$a */
    private static final class a implements io.sentry.hints.e, io.sentry.hints.j, io.sentry.hints.o, io.sentry.hints.h {

        /* renamed from: a, reason: collision with root package name */
        boolean f35237a = false;

        /* renamed from: b, reason: collision with root package name */
        boolean f35238b = false;

        /* renamed from: c, reason: collision with root package name */
        private final CountDownLatch f35239c = new CountDownLatch(1);

        /* renamed from: d, reason: collision with root package name */
        private final long f35240d;

        /* renamed from: e, reason: collision with root package name */
        private final ILogger f35241e;

        public a(long j10, ILogger iLogger) {
            this.f35240d = j10;
            this.f35241e = iLogger;
        }

        @Override // io.sentry.hints.j
        public boolean a() {
            return this.f35237a;
        }

        @Override // io.sentry.hints.o
        public void b(boolean z10) {
            this.f35238b = z10;
            this.f35239c.countDown();
        }

        @Override // io.sentry.hints.j
        public void c(boolean z10) {
            this.f35237a = z10;
        }

        @Override // io.sentry.hints.o
        public boolean d() {
            return this.f35238b;
        }

        @Override // io.sentry.hints.h
        public boolean e() {
            try {
                return this.f35239c.await(this.f35240d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f35241e.b(K1.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }
    }

    AbstractC3438p(ILogger iLogger, long j10) {
        this.f35235a = iLogger;
        this.f35236b = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d(File file, String str) {
        return c(str);
    }

    protected abstract boolean c(String str);

    public void e(File file) {
        try {
            ILogger iLogger = this.f35235a;
            K1 k12 = K1.DEBUG;
            iLogger.c(k12, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                this.f35235a.c(K1.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
                return;
            }
            if (!file.isDirectory()) {
                this.f35235a.c(K1.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                this.f35235a.c(K1.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                return;
            }
            File[] listFiles2 = file.listFiles(new FilenameFilter() { // from class: io.sentry.o
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    boolean d10;
                    d10 = AbstractC3438p.this.d(file2, str);
                    return d10;
                }
            });
            this.f35235a.c(k12, "Processing %d items from cache dir %s", Integer.valueOf(listFiles2 != null ? listFiles2.length : 0), file.getAbsolutePath());
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    this.f35235a.c(K1.DEBUG, "Processing file: %s", file2.getAbsolutePath());
                    f(file2, io.sentry.util.j.e(new a(this.f35236b, this.f35235a)));
                } else {
                    this.f35235a.c(K1.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (Throwable th) {
            this.f35235a.a(K1.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    protected abstract void f(File file, A a10);
}
