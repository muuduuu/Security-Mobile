package io.sentry.android.core.cache;

import io.sentry.A;
import io.sentry.C3416h1;
import io.sentry.K1;
import io.sentry.P1;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.L;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.cache.e;
import io.sentry.transport.o;
import io.sentry.util.j;
import io.sentry.util.n;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes2.dex */
public final class b extends e {

    /* renamed from: h, reason: collision with root package name */
    private final o f34833h;

    public b(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, io.sentry.android.core.internal.util.a.b());
    }

    public static boolean X(P1 p12) {
        String outboxPath = p12.getOutboxPath();
        if (outboxPath == null) {
            p12.getLogger().c(K1.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(outboxPath, "startup_crash");
        try {
            boolean exists = file.exists();
            if (exists && !file.delete()) {
                p12.getLogger().c(K1.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            }
            return exists;
        } catch (Throwable th) {
            p12.getLogger().b(K1.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(SentryAndroidOptions sentryAndroidOptions, AnrV2Integration.b bVar) {
        Long c10 = bVar.c();
        sentryAndroidOptions.getLogger().c(K1.DEBUG, "Writing last reported ANR marker with timestamp %d", c10);
        a0(c10);
    }

    public static Long Z(P1 p12) {
        File file = new File((String) n.c(p12.getCacheDirPath(), "Cache dir path should be set for getting ANRs reported"), "last_anr_report");
        try {
        } catch (Throwable th) {
            p12.getLogger().b(K1.ERROR, "Error reading last ANR marker", th);
        }
        if (!file.exists() || !file.canRead()) {
            p12.getLogger().c(K1.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
            return null;
        }
        String b10 = io.sentry.util.e.b(file);
        if (b10.equals("null")) {
            return null;
        }
        return Long.valueOf(Long.parseLong(b10.trim()));
    }

    private void a0(Long l10) {
        String cacheDirPath = this.f35034a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f35034a.getLogger().c(K1.DEBUG, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            try {
                fileOutputStream.write(String.valueOf(l10).getBytes(f35033e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            this.f35034a.getLogger().b(K1.ERROR, "Error writing the ANR marker to the disk", th);
        }
    }

    private void b0() {
        String outboxPath = this.f35034a.getOutboxPath();
        if (outboxPath == null) {
            this.f35034a.getLogger().c(K1.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, "startup_crash").createNewFile();
        } catch (Throwable th) {
            this.f35034a.getLogger().b(K1.ERROR, "Error writing the startup crash marker file to the disk", th);
        }
    }

    @Override // io.sentry.cache.e, io.sentry.cache.f
    public void z0(C3416h1 c3416h1, A a10) {
        super.z0(c3416h1, a10);
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f35034a;
        Long c10 = L.e().c();
        if (j.h(a10, UncaughtExceptionHandlerIntegration.a.class) && c10 != null) {
            long a11 = this.f34833h.a() - c10.longValue();
            if (a11 <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().c(K1.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(a11));
                b0();
            }
        }
        j.o(a10, AnrV2Integration.b.class, new j.a() { // from class: io.sentry.android.core.cache.a
            @Override // io.sentry.util.j.a
            public final void accept(Object obj) {
                b.this.Y(sentryAndroidOptions, (AnrV2Integration.b) obj);
            }
        });
    }

    b(SentryAndroidOptions sentryAndroidOptions, o oVar) {
        super(sentryAndroidOptions, (String) n.c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.f34833h = oVar;
    }
}
