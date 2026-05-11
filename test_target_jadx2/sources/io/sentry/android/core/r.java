package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C3411g;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.K1;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class r implements io.sentry.I {

    /* renamed from: h, reason: collision with root package name */
    private final ILogger f34991h;

    /* renamed from: i, reason: collision with root package name */
    private final N f34992i;

    /* renamed from: a, reason: collision with root package name */
    private long f34984a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f34985b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f34986c = 1;

    /* renamed from: d, reason: collision with root package name */
    private long f34987d = 1;

    /* renamed from: e, reason: collision with root package name */
    private final long f34988e = 1000000000;

    /* renamed from: f, reason: collision with root package name */
    private double f34989f = 1.0E9d / 1;

    /* renamed from: g, reason: collision with root package name */
    private final File f34990g = new File("/proc/self/stat");

    /* renamed from: j, reason: collision with root package name */
    private boolean f34993j = false;

    public r(ILogger iLogger, N n10) {
        this.f34991h = (ILogger) io.sentry.util.n.c(iLogger, "Logger is required.");
        this.f34992i = (N) io.sentry.util.n.c(n10, "BuildInfoProvider is required.");
    }

    private long c() {
        String str;
        try {
            str = io.sentry.util.e.b(this.f34990g);
        } catch (IOException e10) {
            this.f34993j = false;
            this.f34991h.b(K1.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e10);
            str = null;
        }
        if (str != null) {
            String[] split = str.trim().split("[\n\t\r ]");
            try {
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[14]);
                return (long) ((parseLong + parseLong2 + Long.parseLong(split[15]) + Long.parseLong(split[16])) * this.f34989f);
            } catch (NumberFormatException e11) {
                this.f34991h.b(K1.ERROR, "Error parsing /proc/self/stat file.", e11);
            }
        }
        return 0L;
    }

    @Override // io.sentry.I
    public void a(F0 f02) {
        if (this.f34992i.d() < 21 || !this.f34993j) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long j10 = elapsedRealtimeNanos - this.f34984a;
        this.f34984a = elapsedRealtimeNanos;
        long c10 = c();
        long j11 = c10 - this.f34985b;
        this.f34985b = c10;
        f02.a(new C3411g(System.currentTimeMillis(), ((j11 / j10) / this.f34987d) * 100.0d));
    }

    @Override // io.sentry.I
    public void b() {
        if (this.f34992i.d() < 21) {
            this.f34993j = false;
            return;
        }
        this.f34993j = true;
        this.f34986c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f34987d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f34989f = 1.0E9d / this.f34986c;
        this.f34985b = c();
    }
}
