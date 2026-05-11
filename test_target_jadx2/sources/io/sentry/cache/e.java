package io.sentry.cache;

import io.sentry.A;
import io.sentry.AbstractC3420j;
import io.sentry.C3407e1;
import io.sentry.C3416h1;
import io.sentry.C3471y1;
import io.sentry.ILogger;
import io.sentry.J1;
import io.sentry.K1;
import io.sentry.P1;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.Z1;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class e extends b implements f {

    /* renamed from: f, reason: collision with root package name */
    private final CountDownLatch f35039f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f35040g;

    public e(P1 p12, String str, int i10) {
        super(p12, str, i10);
        this.f35040g = new WeakHashMap();
        this.f35039f = new CountDownLatch(1);
    }

    private File[] F() {
        File[] listFiles;
        return (!j() || (listFiles = this.f35036c.listFiles(new FilenameFilter() { // from class: io.sentry.cache.d
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean O10;
                O10 = e.O(file, str);
                return O10;
            }
        })) == null) ? new File[0] : listFiles;
    }

    public static f G(P1 p12) {
        String cacheDirPath = p12.getCacheDirPath();
        int maxCacheItems = p12.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new e(p12, cacheDirPath, maxCacheItems);
        }
        p12.getLogger().c(K1.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        return io.sentry.transport.r.c();
    }

    public static File J(String str) {
        return new File(str, "session.json");
    }

    private synchronized File L(C3416h1 c3416h1) {
        String str;
        try {
            if (this.f35040g.containsKey(c3416h1)) {
                str = (String) this.f35040g.get(c3416h1);
            } else {
                String str2 = (c3416h1.b().a() != null ? c3416h1.b().a().toString() : UUID.randomUUID().toString()) + ".envelope";
                this.f35040g.put(c3416h1, str2);
                str = str2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new File(this.f35036c.getAbsolutePath(), str);
    }

    public static File M(String str) {
        return new File(str, "previous_session.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean O(File file, String str) {
        return str.endsWith(".envelope");
    }

    private void P(A a10) {
        Date date;
        Object g10 = io.sentry.util.j.g(a10);
        if (g10 instanceof io.sentry.hints.a) {
            File M10 = M(this.f35036c.getAbsolutePath());
            if (!M10.exists()) {
                this.f35034a.getLogger().c(K1.DEBUG, "No previous session file to end.", new Object[0]);
                return;
            }
            ILogger logger = this.f35034a.getLogger();
            K1 k12 = K1.WARNING;
            logger.c(k12, "Previous session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(M10), b.f35033e));
                try {
                    Z1 z12 = (Z1) this.f35035b.c(bufferedReader, Z1.class);
                    if (z12 != null) {
                        io.sentry.hints.a aVar = (io.sentry.hints.a) g10;
                        Long c10 = aVar.c();
                        if (c10 != null) {
                            date = AbstractC3420j.d(c10.longValue());
                            Date k10 = z12.k();
                            if (k10 != null) {
                                if (date.before(k10)) {
                                }
                            }
                            this.f35034a.getLogger().c(k12, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                            bufferedReader.close();
                            return;
                        }
                        date = null;
                        z12.q(Z1.b.Abnormal, null, true, aVar.f());
                        z12.d(date);
                        V(M10, z12);
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th) {
                this.f35034a.getLogger().b(K1.ERROR, "Error processing previous session.", th);
            }
        }
    }

    private void R(File file, C3416h1 c3416h1) {
        Iterable c10 = c3416h1.c();
        if (!c10.iterator().hasNext()) {
            this.f35034a.getLogger().c(K1.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        C3471y1 c3471y1 = (C3471y1) c10.iterator().next();
        if (!J1.Session.equals(c3471y1.x().b())) {
            this.f35034a.getLogger().c(K1.INFO, "Current envelope has a different envelope type %s", c3471y1.x().b());
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c3471y1.w()), b.f35033e));
            try {
                Z1 z12 = (Z1) this.f35035b.c(bufferedReader, Z1.class);
                if (z12 == null) {
                    this.f35034a.getLogger().c(K1.ERROR, "Item of type %s returned null by the parser.", c3471y1.x().b());
                } else {
                    V(file, z12);
                }
                bufferedReader.close();
            } finally {
            }
        } catch (Throwable th) {
            this.f35034a.getLogger().b(K1.ERROR, "Item failed to process.", th);
        }
    }

    private void T() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f35034a.getCacheDirPath(), "last_crash"));
            try {
                fileOutputStream.write(AbstractC3420j.g(AbstractC3420j.c()).getBytes(b.f35033e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            this.f35034a.getLogger().b(K1.ERROR, "Error writing the crash marker file to the disk", th);
        }
    }

    private void U(File file, C3416h1 c3416h1) {
        if (file.exists()) {
            this.f35034a.getLogger().c(K1.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f35034a.getLogger().c(K1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f35035b.b(c3416h1, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            this.f35034a.getLogger().a(K1.ERROR, th, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
        }
    }

    private void V(File file, Z1 z12) {
        if (file.exists()) {
            this.f35034a.getLogger().c(K1.DEBUG, "Overwriting session to offline storage: %s", z12.j());
            if (!file.delete()) {
                this.f35034a.getLogger().c(K1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, b.f35033e));
                try {
                    this.f35035b.a(z12, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f35034a.getLogger().a(K1.ERROR, th, "Error writing Session to offline storage: %s", z12.j());
        }
    }

    public void I() {
        this.f35039f.countDown();
    }

    @Override // io.sentry.cache.f
    public void Q(C3416h1 c3416h1) {
        io.sentry.util.n.c(c3416h1, "Envelope is required.");
        File L10 = L(c3416h1);
        if (!L10.exists()) {
            this.f35034a.getLogger().c(K1.DEBUG, "Envelope was not cached: %s", L10.getAbsolutePath());
            return;
        }
        this.f35034a.getLogger().c(K1.DEBUG, "Discarding envelope from cache: %s", L10.getAbsolutePath());
        if (L10.delete()) {
            return;
        }
        this.f35034a.getLogger().c(K1.ERROR, "Failed to delete envelope: %s", L10.getAbsolutePath());
    }

    public boolean S() {
        try {
            return this.f35039f.await(this.f35034a.getFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f35034a.getLogger().c(K1.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        File[] F10 = F();
        ArrayList arrayList = new ArrayList(F10.length);
        for (File file : F10) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.f35035b.d(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                this.f35034a.getLogger().c(K1.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e10) {
                this.f35034a.getLogger().b(K1.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e10);
            }
        }
        return arrayList.iterator();
    }

    public void z0(C3416h1 c3416h1, A a10) {
        io.sentry.util.n.c(c3416h1, "Envelope is required.");
        A(F());
        File J10 = J(this.f35036c.getAbsolutePath());
        File M10 = M(this.f35036c.getAbsolutePath());
        if (io.sentry.util.j.h(a10, io.sentry.hints.k.class) && !J10.delete()) {
            this.f35034a.getLogger().c(K1.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (io.sentry.util.j.h(a10, io.sentry.hints.a.class)) {
            P(a10);
        }
        if (io.sentry.util.j.h(a10, io.sentry.hints.m.class)) {
            if (J10.exists()) {
                this.f35034a.getLogger().c(K1.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(J10), b.f35033e));
                    try {
                        Z1 z12 = (Z1) this.f35035b.c(bufferedReader, Z1.class);
                        if (z12 != null) {
                            V(M10, z12);
                        }
                        bufferedReader.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    this.f35034a.getLogger().b(K1.ERROR, "Error processing session.", th);
                }
            }
            R(J10, c3416h1);
            boolean exists = new File(this.f35034a.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (!exists) {
                File file = new File(this.f35034a.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    this.f35034a.getLogger().c(K1.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f35034a.getLogger().c(K1.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    exists = true;
                }
            }
            C3407e1.a().b(exists);
            I();
        }
        File L10 = L(c3416h1);
        if (L10.exists()) {
            this.f35034a.getLogger().c(K1.WARNING, "Not adding Envelope to offline storage because it already exists: %s", L10.getAbsolutePath());
            return;
        }
        this.f35034a.getLogger().c(K1.DEBUG, "Adding Envelope to offline storage: %s", L10.getAbsolutePath());
        U(L10, c3416h1);
        if (io.sentry.util.j.h(a10, UncaughtExceptionHandlerIntegration.a.class)) {
            T();
        }
    }
}
