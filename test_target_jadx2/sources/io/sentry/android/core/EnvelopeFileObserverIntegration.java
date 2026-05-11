package io.sentry.android.core;

import io.sentry.E0;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.K1;
import io.sentry.P1;
import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class EnvelopeFileObserverIntegration implements Integration, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private W f34712a;

    /* renamed from: b, reason: collision with root package name */
    private ILogger f34713b;

    private static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        protected String e(P1 p12) {
            return p12.getOutboxPath();
        }
    }

    public static EnvelopeFileObserverIntegration b() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    @Override // io.sentry.Integration
    public final void c(io.sentry.L l10, P1 p12) {
        io.sentry.util.n.c(l10, "Hub is required");
        io.sentry.util.n.c(p12, "SentryOptions is required");
        this.f34713b = p12.getLogger();
        String e10 = e(p12);
        if (e10 == null) {
            this.f34713b.c(K1.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        ILogger iLogger = this.f34713b;
        K1 k12 = K1.DEBUG;
        iLogger.c(k12, "Registering EnvelopeFileObserverIntegration for path: %s", e10);
        W w10 = new W(e10, new E0(l10, p12.getEnvelopeReader(), p12.getSerializer(), this.f34713b, p12.getFlushTimeoutMillis()), this.f34713b, p12.getFlushTimeoutMillis());
        this.f34712a = w10;
        try {
            w10.startWatching();
            this.f34713b.c(k12, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th) {
            p12.getLogger().b(K1.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        W w10 = this.f34712a;
        if (w10 != null) {
            w10.stopWatching();
            ILogger iLogger = this.f34713b;
            if (iLogger != null) {
                iLogger.c(K1.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    abstract String e(P1 p12);
}
