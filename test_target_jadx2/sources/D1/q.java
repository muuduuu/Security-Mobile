package D1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f1152a;

    public q(WorkDatabase workDatabase) {
        this.f1152a = workDatabase;
    }

    public static void c(Context context, l1.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            gVar.P();
            try {
                gVar.J0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                gVar.J0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                gVar.I0();
            } finally {
                gVar.b1();
            }
        }
    }

    public long a() {
        Long b10 = this.f1152a.G().b("last_force_stop_ms");
        if (b10 != null) {
            return b10.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long b10 = this.f1152a.G().b("reschedule_needed");
        return b10 != null && b10.longValue() == 1;
    }

    public void d(long j10) {
        this.f1152a.G().a(new C1.d("last_force_stop_ms", Long.valueOf(j10)));
    }

    public void e(boolean z10) {
        this.f1152a.G().a(new C1.d("reschedule_needed", z10));
    }
}
