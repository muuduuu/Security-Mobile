package io.sentry;

import io.sentry.Z1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* loaded from: classes2.dex */
final class G0 implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private static final Charset f34462c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final P1 f34463a;

    /* renamed from: b, reason: collision with root package name */
    private final L f34464b;

    G0(P1 p12, L l10) {
        this.f34463a = p12;
        this.f34464b = l10;
    }

    private Date a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f34462c));
            try {
                String readLine = bufferedReader.readLine();
                this.f34463a.getLogger().c(K1.DEBUG, "Crash marker file has %s timestamp.", readLine);
                Date e10 = AbstractC3420j.e(readLine);
                bufferedReader.close();
                return e10;
            } finally {
            }
        } catch (IOException e11) {
            this.f34463a.getLogger().b(K1.ERROR, "Error reading the crash marker file.", e11);
            return null;
        } catch (IllegalArgumentException e12) {
            this.f34463a.getLogger().a(K1.ERROR, e12, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f34463a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f34463a.getLogger().c(K1.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!this.f34463a.isEnableAutoSessionTracking()) {
            this.f34463a.getLogger().c(K1.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.f envelopeDiskCache = this.f34463a.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.e) && !((io.sentry.cache.e) envelopeDiskCache).S()) {
            this.f34463a.getLogger().c(K1.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        File M10 = io.sentry.cache.e.M(cacheDirPath);
        Q serializer = this.f34463a.getSerializer();
        if (M10.exists()) {
            this.f34463a.getLogger().c(K1.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(M10), f34462c));
                try {
                    Z1 z12 = (Z1) serializer.c(bufferedReader, Z1.class);
                    if (z12 == null) {
                        this.f34463a.getLogger().c(K1.ERROR, "Stream from path %s resulted in a null envelope.", M10.getAbsolutePath());
                    } else {
                        File file = new File(this.f34463a.getCacheDirPath(), ".sentry-native/last_crash");
                        Date date = null;
                        if (file.exists()) {
                            this.f34463a.getLogger().c(K1.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date a10 = a(file);
                            if (!file.delete()) {
                                this.f34463a.getLogger().c(K1.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                            }
                            z12.p(Z1.b.Crashed, null, true);
                            date = a10;
                        }
                        if (z12.f() == null) {
                            z12.d(date);
                        }
                        this.f34464b.K(C3416h1.a(serializer, z12, this.f34463a.getSdkVersion()));
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th) {
                this.f34463a.getLogger().b(K1.ERROR, "Error processing previous session.", th);
            }
            if (M10.delete()) {
                return;
            }
            this.f34463a.getLogger().c(K1.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
