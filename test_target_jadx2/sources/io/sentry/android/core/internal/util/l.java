package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.ILogger;
import io.sentry.K1;
import io.sentry.android.core.N;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    private static final Charset f34924g = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Context f34925a;

    /* renamed from: b, reason: collision with root package name */
    private final N f34926b;

    /* renamed from: c, reason: collision with root package name */
    private final ILogger f34927c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f34928d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f34929e;

    /* renamed from: f, reason: collision with root package name */
    private final Runtime f34930f;

    public l(Context context, N n10, ILogger iLogger) {
        this(context, n10, iLogger, new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    private boolean a() {
        for (String str : this.f34928d) {
            try {
            } catch (RuntimeException e10) {
                this.f34927c.a(K1.ERROR, e10, "Error when trying to check if root file %s exists.", str);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    private boolean b(ILogger iLogger) {
        PackageManager.PackageInfoFlags of;
        N n10 = new N(iLogger);
        PackageManager packageManager = this.f34925a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f34929e) {
                try {
                    if (n10.d() < 33) {
                        packageManager.getPackageInfo(str, 0);
                        return true;
                    }
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageManager.getPackageInfo(str, of);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean c() {
        Process process = null;
        try {
            try {
                process = this.f34930f.exec(new String[]{"/system/xbin/which", "su"});
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), f34924g));
                try {
                    boolean z10 = bufferedReader.readLine() != null;
                    bufferedReader.close();
                    process.destroy();
                    return z10;
                } finally {
                }
            } finally {
                if (0 != 0) {
                    process.destroy();
                }
            }
        } catch (IOException unused) {
            this.f34927c.c(K1.DEBUG, "SU isn't found on this Device.", new Object[0]);
        } catch (Throwable th) {
            this.f34927c.b(K1.DEBUG, "Error when trying to check if SU exists.", th);
        }
    }

    private boolean d() {
        String a10 = this.f34926b.a();
        return a10 != null && a10.contains("test-keys");
    }

    public boolean e() {
        return d() || a() || c() || b(this.f34927c);
    }

    l(Context context, N n10, ILogger iLogger, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f34925a = (Context) io.sentry.util.n.c(context, "The application context is required.");
        this.f34926b = (N) io.sentry.util.n.c(n10, "The BuildInfoProvider is required.");
        this.f34927c = (ILogger) io.sentry.util.n.c(iLogger, "The Logger is required.");
        this.f34928d = (String[]) io.sentry.util.n.c(strArr, "The root Files are required.");
        this.f34929e = (String[]) io.sentry.util.n.c(strArr2, "The root packages are required.");
        this.f34930f = (Runtime) io.sentry.util.n.c(runtime, "The Runtime is required.");
    }
}
