package androidx.work.impl.background.systemalarm;

import C1.i;
import C1.j;
import C1.l;
import C1.m;
import D1.k;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import x1.n;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18261a = n.i("Alarms");

    /* renamed from: androidx.work.impl.background.systemalarm.a$a, reason: collision with other inner class name */
    static class C0314a {
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, m mVar) {
        j H10 = workDatabase.H();
        i e10 = H10.e(mVar);
        if (e10 != null) {
            b(context, mVar, e10.f765c);
            n.e().a(f18261a, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            H10.g(mVar);
        }
    }

    private static void b(Context context, m mVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, mVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        n.e().a(f18261a, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    public static void c(Context context, WorkDatabase workDatabase, m mVar, long j10) {
        j H10 = workDatabase.H();
        i e10 = H10.e(mVar);
        if (e10 != null) {
            b(context, mVar, e10.f765c);
            d(context, mVar, e10.f765c, j10);
        } else {
            int c10 = new k(workDatabase).c();
            H10.b(l.a(mVar, c10));
            d(context, mVar, c10, j10);
        }
    }

    private static void d(Context context, m mVar, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, mVar), 201326592);
        if (alarmManager != null) {
            C0314a.a(alarmManager, 0, j10, service);
        }
    }
}
