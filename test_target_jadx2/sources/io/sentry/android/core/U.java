package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.AbstractC3420j;
import io.sentry.K1;
import io.sentry.android.core.P;
import io.sentry.android.core.internal.util.d;
import io.sentry.protocol.f;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class U {

    /* renamed from: h, reason: collision with root package name */
    private static volatile U f34779h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f34780a;

    /* renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f34781b;

    /* renamed from: c, reason: collision with root package name */
    private final N f34782c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f34783d;

    /* renamed from: e, reason: collision with root package name */
    private final P.a f34784e;

    /* renamed from: f, reason: collision with root package name */
    private final io.sentry.protocol.l f34785f;

    /* renamed from: g, reason: collision with root package name */
    private final Long f34786g;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34787a;

        static {
            int[] iArr = new int[d.a.values().length];
            f34787a = iArr;
            try {
                iArr[d.a.NOT_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34787a[d.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public U(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.f34780a = context;
        this.f34781b = sentryAndroidOptions;
        N n10 = new N(sentryAndroidOptions.getLogger());
        this.f34782c = n10;
        io.sentry.android.core.internal.util.f.a().c();
        this.f34785f = B();
        this.f34783d = n10.f();
        this.f34784e = P.n(context, sentryAndroidOptions.getLogger(), n10);
        ActivityManager.MemoryInfo h10 = P.h(context, sentryAndroidOptions.getLogger());
        if (h10 != null) {
            this.f34786g = q(h10);
        } else {
            this.f34786g = null;
        }
    }

    private boolean A() {
        String externalStorageState = Environment.getExternalStorageState();
        return ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated();
    }

    private void C(io.sentry.protocol.f fVar, boolean z10) {
        Intent d10 = d();
        if (d10 != null) {
            fVar.N(e(d10));
            fVar.R(z(d10));
            fVar.O(f(d10));
        }
        int i10 = a.f34787a[io.sentry.android.core.internal.util.d.b(this.f34780a, this.f34781b.getLogger()).ordinal()];
        fVar.h0(i10 != 1 ? i10 != 2 ? null : Boolean.TRUE : Boolean.FALSE);
        ActivityManager.MemoryInfo h10 = P.h(this.f34780a, this.f34781b.getLogger());
        if (h10 != null && z10) {
            fVar.W(Long.valueOf(h10.availMem));
            fVar.b0(Boolean.valueOf(h10.lowMemory));
        }
        File externalFilesDir = this.f34780a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            fVar.q0(w(statFs));
            fVar.X(y(statFs));
        }
        StatFs o10 = o(externalFilesDir);
        if (o10 != null) {
            fVar.U(v(o10));
            fVar.T(x(o10));
        }
        if (fVar.I() == null) {
            fVar.S(io.sentry.android.core.internal.util.d.c(this.f34780a, this.f34781b.getLogger(), this.f34782c));
        }
    }

    private int b(StatFs statFs) {
        return statFs.getAvailableBlocks();
    }

    private long c(StatFs statFs) {
        return this.f34782c.d() >= 18 ? statFs.getAvailableBlocksLong() : b(statFs);
    }

    private Intent d() {
        return this.f34780a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    private Float e(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            this.f34781b.getLogger().b(K1.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    private Float f(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th) {
            this.f34781b.getLogger().b(K1.ERROR, "Error getting battery temperature.", th);
            return null;
        }
    }

    private int g(StatFs statFs) {
        return statFs.getBlockCount();
    }

    private long h(StatFs statFs) {
        return this.f34782c.d() >= 18 ? statFs.getBlockCountLong() : g(statFs);
    }

    private int i(StatFs statFs) {
        return statFs.getBlockSize();
    }

    private long j(StatFs statFs) {
        return this.f34782c.d() >= 18 ? statFs.getBlockSizeLong() : i(statFs);
    }

    private Date k() {
        try {
            return AbstractC3420j.d(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e10) {
            this.f34781b.getLogger().a(K1.ERROR, e10, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    private String l() {
        try {
            return Y.a(this.f34780a);
        } catch (Throwable th) {
            this.f34781b.getLogger().b(K1.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    private File[] m() {
        if (this.f34782c.d() >= 19) {
            return this.f34780a.getExternalFilesDirs(null);
        }
        File externalFilesDir = this.f34780a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            return new File[]{externalFilesDir};
        }
        return null;
    }

    private File n(File file) {
        File[] m10 = m();
        if (m10 != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : m10) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f34781b.getLogger().c(K1.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    private StatFs o(File file) {
        if (A()) {
            this.f34781b.getLogger().c(K1.INFO, "External storage is not mounted or emulated.", new Object[0]);
            return null;
        }
        File n10 = n(file);
        if (n10 != null) {
            return new StatFs(n10.getPath());
        }
        this.f34781b.getLogger().c(K1.INFO, "Not possible to read external files directory", new Object[0]);
        return null;
    }

    public static U p(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f34779h == null) {
            synchronized (U.class) {
                try {
                    if (f34779h == null) {
                        f34779h = new U(context.getApplicationContext(), sentryAndroidOptions);
                    }
                } finally {
                }
            }
        }
        return f34779h;
    }

    private Long q(ActivityManager.MemoryInfo memoryInfo) {
        return this.f34782c.d() >= 16 ? Long.valueOf(memoryInfo.totalMem) : Long.valueOf(Runtime.getRuntime().totalMemory());
    }

    private f.b s() {
        f.b bVar;
        Throwable th;
        try {
            bVar = io.sentry.android.core.internal.util.h.a(this.f34780a.getResources().getConfiguration().orientation);
            if (bVar == null) {
                try {
                    this.f34781b.getLogger().c(K1.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    this.f34781b.getLogger().b(K1.ERROR, "Error getting device orientation.", th);
                    return bVar;
                }
            }
        } catch (Throwable th3) {
            bVar = null;
            th = th3;
        }
        return bVar;
    }

    private TimeZone u() {
        if (this.f34782c.d() >= 24) {
            LocaleList locales = this.f34780a.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    private Long v(StatFs statFs) {
        try {
            return Long.valueOf(h(statFs) * j(statFs));
        } catch (Throwable th) {
            this.f34781b.getLogger().b(K1.ERROR, "Error getting total external storage amount.", th);
            return null;
        }
    }

    private Long w(StatFs statFs) {
        try {
            return Long.valueOf(h(statFs) * j(statFs));
        } catch (Throwable th) {
            this.f34781b.getLogger().b(K1.ERROR, "Error getting total internal storage amount.", th);
            return null;
        }
    }

    private Long x(StatFs statFs) {
        try {
            return Long.valueOf(c(statFs) * j(statFs));
        } catch (Throwable th) {
            this.f34781b.getLogger().b(K1.ERROR, "Error getting unused external storage amount.", th);
            return null;
        }
    }

    private Long y(StatFs statFs) {
        try {
            return Long.valueOf(c(statFs) * j(statFs));
        } catch (Throwable th) {
            this.f34781b.getLogger().b(K1.ERROR, "Error getting unused internal storage amount.", th);
            return null;
        }
    }

    private Boolean z(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z10 = true;
            if (intExtra != 1 && intExtra != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Throwable th) {
            this.f34781b.getLogger().b(K1.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    protected io.sentry.protocol.l B() {
        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
        lVar.j("Android");
        lVar.m(Build.VERSION.RELEASE);
        lVar.h(Build.DISPLAY);
        String g10 = P.g(this.f34781b.getLogger());
        if (g10 != null) {
            lVar.i(g10);
        }
        if (this.f34781b.isEnableRootCheck()) {
            lVar.k(Boolean.valueOf(new io.sentry.android.core.internal.util.l(this.f34780a, this.f34782c, this.f34781b.getLogger()).e()));
        }
        return lVar;
    }

    public io.sentry.protocol.f a(boolean z10, boolean z11) {
        io.sentry.protocol.f fVar = new io.sentry.protocol.f();
        if (this.f34781b.isSendDefaultPii()) {
            fVar.g0(P.d(this.f34780a, this.f34782c));
        }
        fVar.c0(Build.MANUFACTURER);
        fVar.Q(Build.BRAND);
        fVar.V(P.f(this.f34781b.getLogger()));
        fVar.e0(Build.MODEL);
        fVar.f0(Build.ID);
        fVar.M(P.c(this.f34782c));
        fVar.i0(s());
        Boolean bool = this.f34783d;
        if (bool != null) {
            fVar.p0(bool);
        }
        DisplayMetrics e10 = P.e(this.f34780a, this.f34781b.getLogger());
        if (e10 != null) {
            fVar.o0(Integer.valueOf(e10.widthPixels));
            fVar.n0(Integer.valueOf(e10.heightPixels));
            fVar.l0(Float.valueOf(e10.density));
            fVar.m0(Integer.valueOf(e10.densityDpi));
        }
        fVar.P(k());
        fVar.r0(u());
        if (fVar.J() == null) {
            fVar.Y(l());
        }
        Locale locale = Locale.getDefault();
        if (fVar.K() == null) {
            fVar.Z(locale.getLanguage());
        }
        if (fVar.L() == null) {
            fVar.a0(locale.toString());
        }
        List c10 = io.sentry.android.core.internal.util.f.a().c();
        if (!c10.isEmpty()) {
            fVar.k0(Double.valueOf(((Integer) Collections.max(c10)).doubleValue()));
            fVar.j0(Integer.valueOf(c10.size()));
        }
        fVar.d0(this.f34786g);
        if (z10 && this.f34781b.isCollectAdditionalContext()) {
            C(fVar, z11);
        }
        return fVar;
    }

    public io.sentry.protocol.l r() {
        return this.f34785f;
    }

    public P.a t() {
        return this.f34784e;
    }
}
