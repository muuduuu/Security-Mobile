package androidx.work.impl.background.systemjob;

import C1.i;
import C1.l;
import C1.m;
import C1.u;
import C1.v;
import C1.x;
import D1.k;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.InterfaceC1636w;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x1.n;
import x1.s;
import x1.z;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public class g implements InterfaceC1636w {

    /* renamed from: f, reason: collision with root package name */
    private static final String f18317f = n.i("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f18318a;

    /* renamed from: b, reason: collision with root package name */
    private final JobScheduler f18319b;

    /* renamed from: c, reason: collision with root package name */
    private final f f18320c;

    /* renamed from: d, reason: collision with root package name */
    private final WorkDatabase f18321d;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.work.a f18322e;

    public g(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        this(context, workDatabase, aVar, (JobScheduler) context.getSystemService("jobscheduler"), new f(context, aVar.a()));
    }

    public static void d(Context context) {
        List g10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g10 = g(context, jobScheduler)) == null || g10.isEmpty()) {
            return;
        }
        Iterator it = g10.iterator();
        while (it.hasNext()) {
            e(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    private static void e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            n.e().d(f18317f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    private static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g10) {
            m h10 = h(jobInfo);
            if (h10 != null && str.equals(h10.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            n.e().d(f18317f, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static m h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, WorkDatabase workDatabase) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        List a10 = workDatabase.H().a();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo jobInfo : g10) {
                m h10 = h(jobInfo);
                if (h10 != null) {
                    hashSet.add(h10.b());
                } else {
                    e(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = a10.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                n.e().a(f18317f, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (z10) {
            workDatabase.e();
            try {
                v K10 = workDatabase.K();
                Iterator it2 = a10.iterator();
                while (it2.hasNext()) {
                    K10.c((String) it2.next(), -1L);
                }
                workDatabase.D();
                workDatabase.i();
            } catch (Throwable th) {
                workDatabase.i();
                throw th;
            }
        }
        return z10;
    }

    @Override // androidx.work.impl.InterfaceC1636w
    public void a(u... uVarArr) {
        k kVar = new k(this.f18321d);
        for (u uVar : uVarArr) {
            this.f18321d.e();
            try {
                u s10 = this.f18321d.K().s(uVar.f790a);
                if (s10 == null) {
                    n.e().k(f18317f, "Skipping scheduling " + uVar.f790a + " because it's no longer in the DB");
                    this.f18321d.D();
                } else if (s10.f791b != z.c.ENQUEUED) {
                    n.e().k(f18317f, "Skipping scheduling " + uVar.f790a + " because it is no longer enqueued");
                    this.f18321d.D();
                } else {
                    m a10 = x.a(uVar);
                    i e10 = this.f18321d.H().e(a10);
                    int e11 = e10 != null ? e10.f765c : kVar.e(this.f18322e.i(), this.f18322e.g());
                    if (e10 == null) {
                        this.f18321d.H().b(l.a(a10, e11));
                    }
                    j(uVar, e11);
                    this.f18321d.D();
                }
            } finally {
                this.f18321d.i();
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC1636w
    public boolean b() {
        return true;
    }

    @Override // androidx.work.impl.InterfaceC1636w
    public void c(String str) {
        List f10 = f(this.f18318a, this.f18319b, str);
        if (f10 == null || f10.isEmpty()) {
            return;
        }
        Iterator it = f10.iterator();
        while (it.hasNext()) {
            e(this.f18319b, ((Integer) it.next()).intValue());
        }
        this.f18321d.H().h(str);
    }

    public void j(u uVar, int i10) {
        JobInfo a10 = this.f18320c.a(uVar, i10);
        n e10 = n.e();
        String str = f18317f;
        e10.a(str, "Scheduling work ID " + uVar.f790a + "Job ID " + i10);
        try {
            if (this.f18319b.schedule(a10) == 0) {
                n.e().k(str, "Unable to schedule work ID " + uVar.f790a);
                if (uVar.f806q && uVar.f807r == s.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    uVar.f806q = false;
                    n.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", uVar.f790a));
                    j(uVar, i10);
                }
            }
        } catch (IllegalStateException e11) {
            List g10 = g(this.f18318a, this.f18319b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g10 != null ? g10.size() : 0), Integer.valueOf(this.f18321d.K().i().size()), Integer.valueOf(this.f18322e.h()));
            n.e().c(f18317f, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e11);
            InterfaceC5159a l10 = this.f18322e.l();
            if (l10 == null) {
                throw illegalStateException;
            }
            l10.accept(illegalStateException);
        } catch (Throwable th) {
            n.e().d(f18317f, "Unable to schedule " + uVar, th);
        }
    }

    public g(Context context, WorkDatabase workDatabase, androidx.work.a aVar, JobScheduler jobScheduler, f fVar) {
        this.f18318a = context;
        this.f18319b = jobScheduler;
        this.f18320c = fVar;
        this.f18321d = workDatabase;
        this.f18322e = aVar;
    }
}
