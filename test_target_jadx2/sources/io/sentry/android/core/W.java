package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.ILogger;
import io.sentry.K1;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class W extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    private final String f34795a;

    /* renamed from: b, reason: collision with root package name */
    private final io.sentry.K f34796b;

    /* renamed from: c, reason: collision with root package name */
    private final ILogger f34797c;

    /* renamed from: d, reason: collision with root package name */
    private final long f34798d;

    private static final class a implements io.sentry.hints.e, io.sentry.hints.j, io.sentry.hints.o, io.sentry.hints.h, io.sentry.hints.b, io.sentry.hints.i {

        /* renamed from: a, reason: collision with root package name */
        boolean f34799a;

        /* renamed from: b, reason: collision with root package name */
        boolean f34800b;

        /* renamed from: c, reason: collision with root package name */
        private CountDownLatch f34801c;

        /* renamed from: d, reason: collision with root package name */
        private final long f34802d;

        /* renamed from: e, reason: collision with root package name */
        private final ILogger f34803e;

        public a(long j10, ILogger iLogger) {
            reset();
            this.f34802d = j10;
            this.f34803e = (ILogger) io.sentry.util.n.c(iLogger, "ILogger is required.");
        }

        @Override // io.sentry.hints.j
        public boolean a() {
            return this.f34799a;
        }

        @Override // io.sentry.hints.o
        public void b(boolean z10) {
            this.f34800b = z10;
            this.f34801c.countDown();
        }

        @Override // io.sentry.hints.j
        public void c(boolean z10) {
            this.f34799a = z10;
        }

        @Override // io.sentry.hints.o
        public boolean d() {
            return this.f34800b;
        }

        @Override // io.sentry.hints.h
        public boolean e() {
            try {
                return this.f34801c.await(this.f34802d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f34803e.b(K1.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }

        @Override // io.sentry.hints.i
        public void reset() {
            this.f34801c = new CountDownLatch(1);
            this.f34799a = false;
            this.f34800b = false;
        }
    }

    W(String str, io.sentry.K k10, ILogger iLogger, long j10) {
        super(str);
        this.f34795a = str;
        this.f34796b = (io.sentry.K) io.sentry.util.n.c(k10, "Envelope sender is required.");
        this.f34797c = (ILogger) io.sentry.util.n.c(iLogger, "Logger is required.");
        this.f34798d = j10;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i10, String str) {
        if (str == null || i10 != 8) {
            return;
        }
        this.f34797c.c(K1.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i10), this.f34795a, str);
        io.sentry.A e10 = io.sentry.util.j.e(new a(this.f34798d, this.f34797c));
        this.f34796b.a(this.f34795a + File.separator + str, e10);
    }
}
