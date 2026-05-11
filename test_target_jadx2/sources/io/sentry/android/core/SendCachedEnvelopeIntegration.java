package io.sentry.android.core;

import io.sentry.Integration;
import io.sentry.K1;
import io.sentry.P1;
import io.sentry.Q0;
import io.sentry.T0;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class SendCachedEnvelopeIntegration implements Integration {

    /* renamed from: a, reason: collision with root package name */
    private final T0 f34758a;

    /* renamed from: b, reason: collision with root package name */
    private final io.sentry.util.l f34759b;

    public SendCachedEnvelopeIntegration(T0 t02, io.sentry.util.l lVar) {
        this.f34758a = (T0) io.sentry.util.n.c(t02, "SendFireAndForgetFactory is required");
        this.f34759b = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Q0 q02, SentryAndroidOptions sentryAndroidOptions) {
        try {
            q02.a();
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(K1.ERROR, "Failed trying to send cached events.", th);
        }
    }

    @Override // io.sentry.Integration
    public void c(io.sentry.L l10, P1 p12) {
        io.sentry.util.n.c(l10, "Hub is required");
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.n.c(p12 instanceof SentryAndroidOptions ? (SentryAndroidOptions) p12 : null, "SentryAndroidOptions is required");
        if (!this.f34758a.e(p12.getCacheDirPath(), p12.getLogger())) {
            p12.getLogger().c(K1.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        final Q0 d10 = this.f34758a.d(l10, sentryAndroidOptions);
        if (d10 == null) {
            sentryAndroidOptions.getLogger().c(K1.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            return;
        }
        try {
            Future submit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.h0
                @Override // java.lang.Runnable
                public final void run() {
                    SendCachedEnvelopeIntegration.e(Q0.this, sentryAndroidOptions);
                }
            });
            if (((Boolean) this.f34759b.a()).booleanValue()) {
                sentryAndroidOptions.getLogger().c(K1.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                try {
                    submit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    sentryAndroidOptions.getLogger().c(K1.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                }
            }
            sentryAndroidOptions.getLogger().c(K1.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().b(K1.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e10);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(K1.ERROR, "Failed to call the executor. Cached events will not be sent", th);
        }
    }
}
