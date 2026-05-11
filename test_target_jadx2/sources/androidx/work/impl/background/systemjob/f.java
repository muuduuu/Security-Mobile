package androidx.work.impl.background.systemjob;

import C1.u;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Iterator;
import x1.C5100d;
import x1.EnumC5097a;
import x1.InterfaceC5098b;
import x1.n;
import x1.o;

/* loaded from: classes.dex */
class f {

    /* renamed from: c, reason: collision with root package name */
    private static final String f18313c = n.i("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    private final ComponentName f18314a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5098b f18315b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18316a;

        static {
            int[] iArr = new int[o.values().length];
            f18316a = iArr;
            try {
                iArr[o.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18316a[o.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18316a[o.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18316a[o.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18316a[o.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    f(Context context, InterfaceC5098b interfaceC5098b) {
        this.f18315b = interfaceC5098b;
        this.f18314a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(C5100d.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.a(), cVar.b() ? 1 : 0);
    }

    static int c(o oVar) {
        int i10 = a.f18316a[oVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        n.e().a(f18313c, "API version too low. Cannot convert network type value " + oVar);
        return 1;
    }

    static void d(JobInfo.Builder builder, o oVar) {
        if (Build.VERSION.SDK_INT < 30 || oVar != o.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(oVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(u uVar, int i10) {
        C5100d c5100d = uVar.f799j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", uVar.f790a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", uVar.f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", uVar.m());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f18314a).setRequiresCharging(c5100d.g()).setRequiresDeviceIdle(c5100d.h()).setExtras(persistableBundle);
        d(extras, c5100d.d());
        if (!c5100d.h()) {
            extras.setBackoffCriteria(uVar.f802m, uVar.f801l == EnumC5097a.LINEAR ? 0 : 1);
        }
        long max = Math.max(uVar.c() - this.f18315b.a(), 0L);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!uVar.f806q) {
            extras.setImportantWhileForeground(true);
        }
        if (c5100d.e()) {
            Iterator it = c5100d.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((C5100d.c) it.next()));
            }
            extras.setTriggerContentUpdateDelay(c5100d.b());
            extras.setTriggerContentMaxDelay(c5100d.a());
        }
        extras.setPersisted(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            extras.setRequiresBatteryNotLow(c5100d.f());
            extras.setRequiresStorageNotLow(c5100d.i());
        }
        boolean z10 = uVar.f800k > 0;
        boolean z11 = max > 0;
        if (i11 >= 31 && uVar.f806q && !z10 && !z11) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
