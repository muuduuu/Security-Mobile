package androidx.work.impl.background.systemjob;

import C1.m;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import androidx.work.impl.A;
import androidx.work.impl.B;
import androidx.work.impl.C1634u;
import androidx.work.impl.InterfaceC1620f;
import androidx.work.impl.N;
import androidx.work.impl.O;
import androidx.work.impl.P;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import x1.n;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC1620f {

    /* renamed from: e, reason: collision with root package name */
    private static final String f18308e = n.i("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    private P f18309a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f18310b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final B f18311c = new B();

    /* renamed from: d, reason: collision with root package name */
    private N f18312d;

    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    static class c {
        static int a(JobParameters jobParameters) {
            return SystemJobService.a(jobParameters.getStopReason());
        }
    }

    static int a(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return i10;
            default:
                return -512;
        }
    }

    private static m b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.InterfaceC1620f
    public void e(m mVar, boolean z10) {
        JobParameters jobParameters;
        n.e().a(f18308e, mVar.b() + " executed on JobScheduler");
        synchronized (this.f18310b) {
            jobParameters = (JobParameters) this.f18310b.remove(mVar);
        }
        this.f18311c.b(mVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            P n10 = P.n(getApplicationContext());
            this.f18309a = n10;
            C1634u p10 = n10.p();
            this.f18312d = new O(p10, this.f18309a.t());
            p10.e(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            n.e().k(f18308e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        P p10 = this.f18309a;
        if (p10 != null) {
            p10.p().p(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f18309a == null) {
            n.e().a(f18308e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        m b10 = b(jobParameters);
        if (b10 == null) {
            n.e().c(f18308e, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f18310b) {
            try {
                if (this.f18310b.containsKey(b10)) {
                    n.e().a(f18308e, "Job is already being executed by SystemJobService: " + b10);
                    return false;
                }
                n.e().a(f18308e, "onStartJob for " + b10);
                this.f18310b.put(b10, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.f18110b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.f18109a = Arrays.asList(a.a(jobParameters));
                }
                if (i10 >= 28) {
                    aVar.f18111c = b.a(jobParameters);
                }
                this.f18312d.a(this.f18311c.d(b10), aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f18309a == null) {
            n.e().a(f18308e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        m b10 = b(jobParameters);
        if (b10 == null) {
            n.e().c(f18308e, "WorkSpec id not found!");
            return false;
        }
        n.e().a(f18308e, "onStopJob for " + b10);
        synchronized (this.f18310b) {
            this.f18310b.remove(b10);
        }
        A b11 = this.f18311c.b(b10);
        if (b11 != null) {
            this.f18312d.d(b11, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512);
        }
        return !this.f18309a.p().j(b10.b());
    }
}
