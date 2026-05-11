package androidx.work.impl.utils;

import C1.r;
import C1.u;
import C1.v;
import D1.f;
import D1.q;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.p;
import androidx.work.a;
import androidx.work.impl.F;
import androidx.work.impl.P;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.g;
import java.util.List;
import java.util.concurrent.TimeUnit;
import x1.n;
import x1.z;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static final String f18387e = n.i("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    private static final long f18388f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    private final Context f18389a;

    /* renamed from: b, reason: collision with root package name */
    private final P f18390b;

    /* renamed from: c, reason: collision with root package name */
    private final q f18391c;

    /* renamed from: d, reason: collision with root package name */
    private int f18392d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private static final String f18393a = n.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            n.e().j(f18393a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, P p10) {
        this.f18389a = context.getApplicationContext();
        this.f18390b = p10;
        this.f18391c = p10.o();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d10 = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f18388f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d10);
        }
    }

    public boolean a() {
        boolean i10 = g.i(this.f18389a, this.f18390b.s());
        WorkDatabase s10 = this.f18390b.s();
        v K10 = s10.K();
        r J10 = s10.J();
        s10.e();
        try {
            List<u> l10 = K10.l();
            boolean z10 = (l10 == null || l10.isEmpty()) ? false : true;
            if (z10) {
                for (u uVar : l10) {
                    K10.m(z.c.ENQUEUED, uVar.f790a);
                    K10.g(uVar.f790a, -512);
                    K10.c(uVar.f790a, -1L);
                }
            }
            J10.b();
            s10.D();
            s10.i();
            return z10 || i10;
        } catch (Throwable th) {
            s10.i();
            throw th;
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            n.e().a(f18387e, "Rescheduling Workers.");
            this.f18390b.v();
            this.f18390b.o().e(false);
        } else if (e()) {
            n.e().a(f18387e, "Application was force-stopped, rescheduling.");
            this.f18390b.v();
            this.f18391c.d(this.f18390b.l().a().a());
        } else if (a10) {
            n.e().a(f18387e, "Found unfinished work, scheduling it.");
            androidx.work.impl.z.h(this.f18390b.l(), this.f18390b.s(), this.f18390b.q());
        }
    }

    public boolean e() {
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent d10 = d(this.f18389a, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (d10 != null) {
                    d10.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.f18389a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long a10 = this.f18391c.a();
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo a11 = f.a(historicalProcessExitReasons.get(i11));
                        reason = a11.getReason();
                        if (reason == 10) {
                            timestamp = a11.getTimestamp();
                            if (timestamp >= a10) {
                                return true;
                            }
                        }
                    }
                }
            } else if (d10 == null) {
                g(this.f18389a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e10) {
            e = e10;
            n.e().l(f18387e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e11) {
            e = e11;
            n.e().l(f18387e, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a l10 = this.f18390b.l();
        if (TextUtils.isEmpty(l10.c())) {
            n.e().a(f18387e, "The default process name was not specified.");
            return true;
        }
        boolean b10 = D1.r.b(this.f18389a, l10);
        n.e().a(f18387e, "Is default app process = " + b10);
        return b10;
    }

    public boolean h() {
        return this.f18390b.o().b();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (f()) {
                while (true) {
                    try {
                        F.d(this.f18389a);
                        n.e().a(f18387e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                            i10 = this.f18392d + 1;
                            this.f18392d = i10;
                            if (i10 >= 3) {
                                String str = p.a(this.f18389a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                n e11 = n.e();
                                String str2 = f18387e;
                                e11.d(str2, str, e10);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e10);
                                InterfaceC5159a e12 = this.f18390b.l().e();
                                if (e12 == null) {
                                    throw illegalStateException;
                                }
                                n.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                e12.accept(illegalStateException);
                            } else {
                                n.e().b(f18387e, "Retrying after " + (i10 * 300), e10);
                                i(((long) this.f18392d) * 300);
                            }
                        }
                        n.e().b(f18387e, "Retrying after " + (i10 * 300), e10);
                        i(((long) this.f18392d) * 300);
                    } catch (SQLiteException e13) {
                        n.e().c(f18387e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e13);
                        InterfaceC5159a e14 = this.f18390b.l().e();
                        if (e14 == null) {
                            throw illegalStateException2;
                        }
                        e14.accept(illegalStateException2);
                    }
                }
            }
        } finally {
            this.f18390b.u();
        }
    }
}
