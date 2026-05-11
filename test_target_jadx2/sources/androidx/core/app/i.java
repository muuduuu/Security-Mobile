package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class i extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    final ArrayList<d> mCompatQueue;
    h mCompatWorkEnqueuer;
    a mCurProcessor;
    b mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, h> sClassWorkEnqueuer = new HashMap<>();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;

    final class a extends AsyncTask {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e dequeueWork = i.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                i.this.onHandleWork(dequeueWork.getIntent());
                dequeueWork.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            i.this.processorFinished();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            i.this.processorFinished();
        }
    }

    interface b {
        IBinder a();

        e b();
    }

    static final class c extends h {

        /* renamed from: d, reason: collision with root package name */
        private final Context f15741d;

        /* renamed from: e, reason: collision with root package name */
        private final PowerManager.WakeLock f15742e;

        /* renamed from: f, reason: collision with root package name */
        private final PowerManager.WakeLock f15743f;

        /* renamed from: g, reason: collision with root package name */
        boolean f15744g;

        /* renamed from: h, reason: collision with root package name */
        boolean f15745h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f15741d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f15742e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f15743f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.i.h
        void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f15756a);
            if (this.f15741d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f15744g) {
                            this.f15744g = true;
                            if (!this.f15745h) {
                                this.f15742e.acquire(60000L);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // androidx.core.app.i.h
        public void c() {
            synchronized (this) {
                try {
                    if (this.f15745h) {
                        if (this.f15744g) {
                            this.f15742e.acquire(60000L);
                        }
                        this.f15745h = false;
                        this.f15743f.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.i.h
        public void d() {
            synchronized (this) {
                try {
                    if (!this.f15745h) {
                        this.f15745h = true;
                        this.f15743f.acquire(600000L);
                        this.f15742e.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.i.h
        public void e() {
            synchronized (this) {
                this.f15744g = false;
            }
        }
    }

    final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        final Intent f15746a;

        /* renamed from: b, reason: collision with root package name */
        final int f15747b;

        d(Intent intent, int i10) {
            this.f15746a = intent;
            this.f15747b = i10;
        }

        @Override // androidx.core.app.i.e
        public void a() {
            i.this.stopSelf(this.f15747b);
        }

        @Override // androidx.core.app.i.e
        public Intent getIntent() {
            return this.f15746a;
        }
    }

    interface e {
        void a();

        Intent getIntent();
    }

    static final class f extends JobServiceEngine implements b {

        /* renamed from: a, reason: collision with root package name */
        final i f15749a;

        /* renamed from: b, reason: collision with root package name */
        final Object f15750b;

        /* renamed from: c, reason: collision with root package name */
        JobParameters f15751c;

        final class a implements e {

            /* renamed from: a, reason: collision with root package name */
            final JobWorkItem f15752a;

            a(JobWorkItem jobWorkItem) {
                this.f15752a = jobWorkItem;
            }

            @Override // androidx.core.app.i.e
            public void a() {
                synchronized (f.this.f15750b) {
                    try {
                        JobParameters jobParameters = f.this.f15751c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f15752a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // androidx.core.app.i.e
            public Intent getIntent() {
                Intent intent;
                intent = this.f15752a.getIntent();
                return intent;
            }
        }

        f(i iVar) {
            super(iVar);
            this.f15750b = new Object();
            this.f15749a = iVar;
        }

        @Override // androidx.core.app.i.b
        public IBinder a() {
            IBinder binder;
            binder = getBinder();
            return binder;
        }

        @Override // androidx.core.app.i.b
        public e b() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.f15750b) {
                try {
                    JobParameters jobParameters = this.f15751c;
                    if (jobParameters == null) {
                        return null;
                    }
                    dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork == null) {
                        return null;
                    }
                    intent = dequeueWork.getIntent();
                    intent.setExtrasClassLoader(this.f15749a.getClassLoader());
                    return new a(dequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f15751c = jobParameters;
            this.f15749a.ensureProcessorRunningLocked(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.f15749a.doStopCurrentWork();
            synchronized (this.f15750b) {
                this.f15751c = null;
            }
            return doStopCurrentWork;
        }
    }

    static final class g extends h {

        /* renamed from: d, reason: collision with root package name */
        private final JobInfo f15754d;

        /* renamed from: e, reason: collision with root package name */
        private final JobScheduler f15755e;

        g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            b(i10);
            this.f15754d = new JobInfo.Builder(i10, this.f15756a).setOverrideDeadline(0L).build();
            this.f15755e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.i.h
        void a(Intent intent) {
            this.f15755e.enqueue(this.f15754d, o.a(intent));
        }
    }

    static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f15756a;

        /* renamed from: b, reason: collision with root package name */
        boolean f15757b;

        /* renamed from: c, reason: collision with root package name */
        int f15758c;

        h(ComponentName componentName) {
            this.f15756a = componentName;
        }

        abstract void a(Intent intent);

        void b(int i10) {
            if (!this.f15757b) {
                this.f15757b = true;
                this.f15758c = i10;
            } else {
                if (this.f15758c == i10) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f15758c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public i() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    public static void enqueueWork(Context context, Class<?> cls, int i10, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i10, intent);
    }

    static h getWorkEnqueuer(Context context, ComponentName componentName, boolean z10, int i10) {
        h cVar;
        HashMap<ComponentName, h> hashMap = sClassWorkEnqueuer;
        h hVar = hashMap.get(componentName);
        if (hVar == null) {
            if (Build.VERSION.SDK_INT < 26) {
                cVar = new c(context, componentName);
            } else {
                if (!z10) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                cVar = new g(context, componentName, i10);
            }
            hVar = cVar;
            hashMap.put(componentName, hVar);
        }
        return hVar;
    }

    e dequeueWork() {
        b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.mCompatQueue) {
            try {
                if (this.mCompatQueue.size() <= 0) {
                    return null;
                }
                return this.mCompatQueue.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean doStopCurrentWork() {
        a aVar = this.mCurProcessor;
        if (aVar != null) {
            aVar.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    void ensureProcessorRunningLocked(boolean z10) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new a();
            h hVar = this.mCompatWorkEnqueuer;
            if (hVar != null && z10) {
                hVar.d();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new f(this);
            this.mCompatWorkEnqueuer = null;
        } else {
            this.mJobImpl = null;
            this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.c();
            }
        }
    }

    protected abstract void onHandleWork(Intent intent);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.e();
        synchronized (this.mCompatQueue) {
            ArrayList<d> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i11));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    void processorFinished() {
        ArrayList<d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<d> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.c();
                    }
                } finally {
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z10) {
        this.mInterruptIfStopped = z10;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i10, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (sLock) {
            h workEnqueuer = getWorkEnqueuer(context, componentName, true, i10);
            workEnqueuer.b(i10);
            workEnqueuer.a(intent);
        }
    }
}
