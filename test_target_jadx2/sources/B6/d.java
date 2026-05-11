package B6;

import C6.InterfaceC0753d;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import y6.AbstractC5177a;

/* loaded from: classes2.dex */
public class d implements x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f456a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0753d f457b;

    /* renamed from: c, reason: collision with root package name */
    private final f f458c;

    public d(Context context, InterfaceC0753d interfaceC0753d, f fVar) {
        this.f456a = context;
        this.f457b = interfaceC0753d;
        this.f458c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    @Override // B6.x
    public void a(u6.o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f456a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f456a.getSystemService("jobscheduler");
        int c10 = c(oVar);
        if (!z10 && d(jobScheduler, c10, i10)) {
            AbstractC5177a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long H12 = this.f457b.H1(oVar);
        JobInfo.Builder c11 = this.f458c.c(new JobInfo.Builder(c10, componentName), oVar.d(), H12, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", F6.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        c11.setExtras(persistableBundle);
        AbstractC5177a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c10), Long.valueOf(this.f458c.g(oVar.d(), H12, i10)), Long.valueOf(H12), Integer.valueOf(i10));
        jobScheduler.schedule(c11.build());
    }

    @Override // B6.x
    public void b(u6.o oVar, int i10) {
        a(oVar, i10, false);
    }

    int c(u6.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f456a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(F6.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
