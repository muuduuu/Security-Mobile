package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.A1;
import io.sentry.AbstractC3420j;
import io.sentry.C3396b;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.K1;
import io.sentry.P1;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class AnrV2Integration implements Integration, Closeable {

    /* renamed from: d, reason: collision with root package name */
    static final long f34659d = TimeUnit.DAYS.toMillis(91);

    /* renamed from: a, reason: collision with root package name */
    private final Context f34660a;

    /* renamed from: b, reason: collision with root package name */
    private final io.sentry.transport.o f34661b;

    /* renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f34662c;

    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Context f34663a;

        /* renamed from: b, reason: collision with root package name */
        private final io.sentry.L f34664b;

        /* renamed from: c, reason: collision with root package name */
        private final SentryAndroidOptions f34665c;

        /* renamed from: d, reason: collision with root package name */
        private final long f34666d;

        a(Context context, io.sentry.L l10, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.o oVar) {
            this.f34663a = context;
            this.f34664b = l10;
            this.f34665c = sentryAndroidOptions;
            this.f34666d = oVar.a() - AnrV2Integration.f34659d;
        }

        private byte[] a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }

        private c b(ApplicationExitInfo applicationExitInfo, boolean z10) {
            InputStream traceInputStream;
            byte[] bArr;
            try {
                traceInputStream = applicationExitInfo.getTraceInputStream();
                if (traceInputStream == null) {
                    return new c(c.a.NO_DUMP);
                }
                try {
                    bArr = a(traceInputStream);
                } catch (Throwable th) {
                    this.f34665c.getLogger().b(K1.WARNING, "Failed to convert ANR thread dump to byte array", th);
                    bArr = null;
                }
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr)));
                    try {
                        List f10 = new io.sentry.android.core.internal.threaddump.c(this.f34665c, z10).f(io.sentry.android.core.internal.threaddump.b.c(bufferedReader));
                        if (f10.isEmpty()) {
                            c cVar = new c(c.a.ERROR, bArr);
                            bufferedReader.close();
                            return cVar;
                        }
                        c cVar2 = new c(c.a.DUMP, bArr, f10);
                        bufferedReader.close();
                        return cVar2;
                    } finally {
                    }
                } catch (Throwable th2) {
                    this.f34665c.getLogger().b(K1.WARNING, "Failed to parse ANR thread dump", th2);
                    return new c(c.a.ERROR, bArr);
                }
            } catch (Throwable th3) {
                this.f34665c.getLogger().b(K1.WARNING, "Failed to read ANR thread dump", th3);
                return new c(c.a.NO_DUMP);
            }
        }

        private void c(ApplicationExitInfo applicationExitInfo, boolean z10) {
            long timestamp;
            int importance;
            byte[] bArr;
            String applicationExitInfo2;
            timestamp = applicationExitInfo.getTimestamp();
            importance = applicationExitInfo.getImportance();
            boolean z11 = importance != 100;
            c b10 = b(applicationExitInfo, z11);
            if (b10.f34670a == c.a.NO_DUMP) {
                ILogger logger = this.f34665c.getLogger();
                K1 k12 = K1.WARNING;
                applicationExitInfo2 = applicationExitInfo.toString();
                logger.c(k12, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo2);
                return;
            }
            b bVar = new b(this.f34665c.getFlushTimeoutMillis(), this.f34665c.getLogger(), timestamp, z10, z11);
            io.sentry.A e10 = io.sentry.util.j.e(bVar);
            A1 a12 = new A1();
            c.a aVar = b10.f34670a;
            if (aVar == c.a.ERROR) {
                io.sentry.protocol.k kVar = new io.sentry.protocol.k();
                kVar.d("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                a12.A0(kVar);
            } else if (aVar == c.a.DUMP) {
                a12.C0(b10.f34672c);
            }
            a12.z0(K1.FATAL);
            a12.D0(AbstractC3420j.d(timestamp));
            if (this.f34665c.isAttachAnrThreadDump() && (bArr = b10.f34671b) != null) {
                e10.m(C3396b.b(bArr));
            }
            if (this.f34664b.M(a12, e10).equals(io.sentry.protocol.r.f35409b) || bVar.e()) {
                return;
            }
            this.f34665c.getLogger().c(K1.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", a12.G());
        }

        private void d(List list, Long l10) {
            int reason;
            long timestamp;
            long timestamp2;
            Collections.reverse(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo a10 = D1.f.a(it.next());
                reason = a10.getReason();
                if (reason == 6) {
                    timestamp = a10.getTimestamp();
                    if (timestamp < this.f34666d) {
                        this.f34665c.getLogger().c(K1.DEBUG, "ANR happened too long ago %s.", a10);
                    } else {
                        if (l10 != null) {
                            timestamp2 = a10.getTimestamp();
                            if (timestamp2 <= l10.longValue()) {
                                this.f34665c.getLogger().c(K1.DEBUG, "ANR has already been reported %s.", a10);
                            }
                        }
                        c(a10, false);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            List historicalProcessExitReasons;
            long timestamp;
            long timestamp2;
            int reason;
            ApplicationExitInfo applicationExitInfo = null;
            historicalProcessExitReasons = ((ActivityManager) this.f34663a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() == 0) {
                this.f34665c.getLogger().c(K1.DEBUG, "No records in historical exit reasons.", new Object[0]);
                return;
            }
            io.sentry.cache.f envelopeDiskCache = this.f34665c.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof io.sentry.cache.e) && this.f34665c.isEnableAutoSessionTracking()) {
                io.sentry.cache.e eVar = (io.sentry.cache.e) envelopeDiskCache;
                if (!eVar.S()) {
                    this.f34665c.getLogger().c(K1.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                    eVar.I();
                }
            }
            ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
            Long Z10 = io.sentry.android.core.cache.b.Z(this.f34665c);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ApplicationExitInfo a10 = D1.f.a(it.next());
                reason = a10.getReason();
                if (reason == 6) {
                    arrayList.remove(a10);
                    applicationExitInfo = a10;
                    break;
                }
            }
            if (applicationExitInfo == null) {
                this.f34665c.getLogger().c(K1.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                return;
            }
            timestamp = applicationExitInfo.getTimestamp();
            if (timestamp < this.f34666d) {
                this.f34665c.getLogger().c(K1.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                return;
            }
            if (Z10 != null) {
                timestamp2 = applicationExitInfo.getTimestamp();
                if (timestamp2 <= Z10.longValue()) {
                    this.f34665c.getLogger().c(K1.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                    return;
                }
            }
            if (this.f34665c.isReportHistoricalAnrs()) {
                d(arrayList, Z10);
            }
            c(applicationExitInfo, true);
        }
    }

    public static final class b extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.a {

        /* renamed from: d, reason: collision with root package name */
        private final long f34667d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f34668e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f34669f;

        public b(long j10, ILogger iLogger, long j11, boolean z10, boolean z11) {
            super(j10, iLogger);
            this.f34667d = j11;
            this.f34668e = z10;
            this.f34669f = z11;
        }

        @Override // io.sentry.hints.c
        public boolean a() {
            return this.f34668e;
        }

        @Override // io.sentry.hints.a
        public Long c() {
            return Long.valueOf(this.f34667d);
        }

        @Override // io.sentry.hints.a
        public String f() {
            return this.f34669f ? "anr_background" : "anr_foreground";
        }
    }

    public AnrV2Integration(Context context) {
        this(context, io.sentry.transport.m.b());
    }

    @Override // io.sentry.Integration
    public void c(io.sentry.L l10, P1 p12) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.n.c(p12 instanceof SentryAndroidOptions ? (SentryAndroidOptions) p12 : null, "SentryAndroidOptions is required");
        this.f34662c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(K1.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f34662c.isAnrEnabled()));
        if (this.f34662c.getCacheDirPath() == null) {
            this.f34662c.getLogger().c(K1.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f34662c.isAnrEnabled()) {
            try {
                p12.getExecutorService().submit(new a(this.f34660a, l10, this.f34662c, this.f34661b));
            } catch (Throwable th) {
                p12.getLogger().b(K1.DEBUG, "Failed to start AnrProcessor.", th);
            }
            p12.getLogger().c(K1.DEBUG, "AnrV2Integration installed.", new Object[0]);
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f34662c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(K1.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    AnrV2Integration(Context context, io.sentry.transport.o oVar) {
        this.f34660a = context;
        this.f34661b = oVar;
    }

    static final class c {

        /* renamed from: a, reason: collision with root package name */
        final a f34670a;

        /* renamed from: b, reason: collision with root package name */
        final byte[] f34671b;

        /* renamed from: c, reason: collision with root package name */
        final List f34672c;

        enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        c(a aVar) {
            this.f34670a = aVar;
            this.f34671b = null;
            this.f34672c = null;
        }

        c(a aVar, byte[] bArr) {
            this.f34670a = aVar;
            this.f34671b = bArr;
            this.f34672c = null;
        }

        c(a aVar, byte[] bArr, List list) {
            this.f34670a = aVar;
            this.f34671b = bArr;
            this.f34672c = list;
        }
    }
}
