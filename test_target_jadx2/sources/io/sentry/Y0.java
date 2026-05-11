package io.sentry;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public abstract class Y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f34595a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    private static volatile L f34596b = C3439p0.a();

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f34597c = false;

    public interface a {
        void a(P1 p12);
    }

    public static void c(C3405e c3405e, A a10) {
        m().A(c3405e, a10);
    }

    private static void d(a aVar, P1 p12) {
        try {
            aVar.a(p12);
        } catch (Throwable th) {
            p12.getLogger().b(K1.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
    }

    public static io.sentry.protocol.r e(A1 a12, A a10) {
        return m().M(a12, a10);
    }

    public static io.sentry.protocol.r f(Throwable th, A a10) {
        return m().H(th, a10);
    }

    public static L g() {
        return f34597c ? f34596b : f34596b.clone();
    }

    public static synchronized void h() {
        synchronized (Y0.class) {
            L m10 = m();
            f34596b = C3439p0.a();
            f34595a.remove();
            m10.close();
        }
    }

    public static void i(P0 p02) {
        m().B(p02);
    }

    public static void j() {
        m().J();
    }

    private static void k(P1 p12, L l10) {
        try {
            p12.getExecutorService().submit(new G0(p12, l10));
        } catch (Throwable th) {
            p12.getLogger().b(K1.DEBUG, "Failed to finalize previous session.", th);
        }
    }

    public static void l(long j10) {
        m().v(j10);
    }

    public static L m() {
        if (f34597c) {
            return f34596b;
        }
        ThreadLocal threadLocal = f34595a;
        L l10 = (L) threadLocal.get();
        if (l10 != null && !(l10 instanceof C3439p0)) {
            return l10;
        }
        L clone = f34596b.clone();
        threadLocal.set(clone);
        return clone;
    }

    public static void n(B0 b02, a aVar, boolean z10) {
        P1 p12 = (P1) b02.b();
        d(aVar, p12);
        o(p12, z10);
    }

    private static synchronized void o(P1 p12, boolean z10) {
        synchronized (Y0.class) {
            try {
                if (q()) {
                    p12.getLogger().c(K1.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                if (p(p12)) {
                    p12.getLogger().c(K1.INFO, "GlobalHubMode: '%s'", String.valueOf(z10));
                    f34597c = z10;
                    L m10 = m();
                    f34596b = new G(p12);
                    f34595a.set(f34596b);
                    m10.close();
                    if (p12.getExecutorService().isClosed()) {
                        p12.setExecutorService(new C1());
                    }
                    Iterator<Integration> it = p12.getIntegrations().iterator();
                    while (it.hasNext()) {
                        it.next().c(H.a(), p12);
                    }
                    t(p12);
                    k(p12, H.a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean p(P1 p12) {
        if (p12.isEnableExternalConfiguration()) {
            p12.merge(C3469y.g(io.sentry.config.g.a(), p12.getLogger()));
        }
        String dsn = p12.getDsn();
        if (!p12.isEnabled() || (dsn != null && dsn.isEmpty())) {
            h();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        new C3445q(dsn);
        ILogger logger = p12.getLogger();
        if (p12.isDebug() && (logger instanceof C3446q0)) {
            p12.setLogger(new k2());
            logger = p12.getLogger();
        }
        K1 k12 = K1.INFO;
        logger.c(k12, "Initializing SDK with DSN: '%s'", p12.getDsn());
        String outboxPath = p12.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.c(k12, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = p12.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (p12.getEnvelopeDiskCache() instanceof io.sentry.transport.r) {
                p12.setEnvelopeDiskCache(io.sentry.cache.e.G(p12));
            }
        }
        String profilingTracesDirPath = p12.getProfilingTracesDirPath();
        if (p12.isProfilingEnabled() && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            final File[] listFiles = file.listFiles();
            try {
                p12.getExecutorService().submit(new Runnable() { // from class: io.sentry.W0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Y0.r(listFiles);
                    }
                });
            } catch (RejectedExecutionException e10) {
                p12.getLogger().b(K1.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e10);
            }
        }
        io.sentry.internal.modules.b modulesLoader = p12.getModulesLoader();
        if (!p12.isSendModules()) {
            p12.setModulesLoader(io.sentry.internal.modules.e.b());
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            p12.setModulesLoader(new io.sentry.internal.modules.a(Arrays.asList(new io.sentry.internal.modules.c(p12.getLogger()), new io.sentry.internal.modules.f(p12.getLogger())), p12.getLogger()));
        }
        if (p12.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            p12.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(p12.getLogger()));
        }
        io.sentry.util.c.c(p12, p12.getDebugMetaLoader().a());
        if (p12.getMainThreadChecker() instanceof io.sentry.util.thread.c) {
            p12.setMainThreadChecker(io.sentry.util.thread.b.e());
        }
        if (p12.getCollectors().isEmpty()) {
            p12.addCollector(new Y());
        }
        return true;
    }

    public static boolean q() {
        return m().isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(File[] fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            io.sentry.util.e.a(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(P1 p12) {
        for (M m10 : p12.getOptionsObservers()) {
            m10.f(p12.getRelease());
            m10.e(p12.getProguardUuid());
            m10.b(p12.getSdkVersion());
            m10.c(p12.getDist());
            m10.d(p12.getEnvironment());
            m10.a(p12.getTags());
        }
    }

    private static void t(final P1 p12) {
        try {
            p12.getExecutorService().submit(new Runnable() { // from class: io.sentry.X0
                @Override // java.lang.Runnable
                public final void run() {
                    Y0.s(P1.this);
                }
            });
        } catch (Throwable th) {
            p12.getLogger().b(K1.DEBUG, "Failed to notify options observers.", th);
        }
    }

    public static void u() {
        m().L();
    }

    public static T v(o2 o2Var, q2 q2Var) {
        return m().y(o2Var, q2Var);
    }

    public static void w(P0 p02) {
        m().E(p02);
    }
}
