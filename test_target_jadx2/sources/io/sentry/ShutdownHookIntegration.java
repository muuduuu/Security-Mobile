package io.sentry;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class ShutdownHookIntegration implements Integration, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Runtime f34557a;

    /* renamed from: b, reason: collision with root package name */
    private Thread f34558b;

    public ShutdownHookIntegration(Runtime runtime) {
        this.f34557a = (Runtime) io.sentry.util.n.c(runtime, "Runtime is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(L l10, P1 p12) {
        l10.v(p12.getFlushTimeoutMillis());
    }

    @Override // io.sentry.Integration
    public void c(final L l10, final P1 p12) {
        io.sentry.util.n.c(l10, "Hub is required");
        io.sentry.util.n.c(p12, "SentryOptions is required");
        if (!p12.isEnableShutdownHook()) {
            p12.getLogger().c(K1.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        Thread thread = new Thread(new Runnable() { // from class: io.sentry.a2
            @Override // java.lang.Runnable
            public final void run() {
                ShutdownHookIntegration.e(L.this, p12);
            }
        });
        this.f34558b = thread;
        this.f34557a.addShutdownHook(thread);
        p12.getLogger().c(K1.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Thread thread = this.f34558b;
        if (thread != null) {
            try {
                this.f34557a.removeShutdownHook(thread);
            } catch (IllegalStateException e10) {
                String message = e10.getMessage();
                if (message == null || !message.equals("Shutdown in progress")) {
                    throw e10;
                }
            }
        }
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
