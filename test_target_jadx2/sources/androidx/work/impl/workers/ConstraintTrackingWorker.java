package androidx.work.impl.workers;

import C1.u;
import C1.v;
import D1.w;
import F1.d;
import Jd.InterfaceC0915w0;
import Jd.J;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.P;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import x1.n;
import z1.AbstractC5238b;
import z1.AbstractC5242f;
import z1.C5241e;
import z1.InterfaceC5240d;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR8\u0010%\u001a&\u0012\f\u0012\n \"*\u0004\u0018\u00010\r0\r \"*\u0012\u0012\f\u0012\n \"*\u0004\u0018\u00010\r0\r\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010+\u001a\u0004\u0018\u00010\u00012\b\u0010&\u001a\u0004\u0018\u00010\u00018G@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/c;", "Lz1/d;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", BuildConfig.FLAVOR, "t", "()V", "Lh8/d;", "Landroidx/work/c$a;", "o", "()Lh8/d;", "m", "LC1/u;", "workSpec", "Lz1/b;", Keys.STATE, "d", "(LC1/u;Lz1/b;)V", "e", "Landroidx/work/WorkerParameters;", BuildConfig.FLAVOR, "f", "Ljava/lang/Object;", "lock", BuildConfig.FLAVOR, "g", "Z", "areConstraintsUnmet", "Landroidx/work/impl/utils/futures/c;", "kotlin.jvm.PlatformType", "h", "Landroidx/work/impl/utils/futures/c;", "future", "<set-?>", "i", "Landroidx/work/c;", "getDelegate", "()Landroidx/work/c;", "delegate", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends c implements InterfaceC5240d {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters workerParameters;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private volatile boolean areConstraintsUnmet;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.impl.utils.futures.c future;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private c delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
        this.lock = new Object();
        this.future = androidx.work.impl.utils.futures.c.t();
    }

    private final void t() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.future.isCancelled()) {
            return;
        }
        String j10 = f().j("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        n e10 = n.e();
        Intrinsics.checkNotNullExpressionValue(e10, "get()");
        if (j10 == null || j10.length() == 0) {
            str = d.f2202a;
            e10.c(str, "No worker to delegate to.");
            androidx.work.impl.utils.futures.c future = this.future;
            Intrinsics.checkNotNullExpressionValue(future, "future");
            d.d(future);
            return;
        }
        c b10 = j().b(a(), j10, this.workerParameters);
        this.delegate = b10;
        if (b10 == null) {
            str6 = d.f2202a;
            e10.a(str6, "No worker to delegate to.");
            androidx.work.impl.utils.futures.c future2 = this.future;
            Intrinsics.checkNotNullExpressionValue(future2, "future");
            d.d(future2);
            return;
        }
        P n10 = P.n(a());
        Intrinsics.checkNotNullExpressionValue(n10, "getInstance(applicationContext)");
        v K10 = n10.s().K();
        String uuid = e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        u s10 = K10.s(uuid);
        if (s10 == null) {
            androidx.work.impl.utils.futures.c future3 = this.future;
            Intrinsics.checkNotNullExpressionValue(future3, "future");
            d.d(future3);
            return;
        }
        B1.n r10 = n10.r();
        Intrinsics.checkNotNullExpressionValue(r10, "workManagerImpl.trackers");
        C5241e c5241e = new C5241e(r10);
        J a10 = n10.t().a();
        Intrinsics.checkNotNullExpressionValue(a10, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
        final InterfaceC0915w0 b11 = AbstractC5242f.b(c5241e, s10, a10, this);
        this.future.e(new Runnable() { // from class: F1.b
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.u(InterfaceC0915w0.this);
            }
        }, new w());
        if (!c5241e.a(s10)) {
            str2 = d.f2202a;
            e10.a(str2, "Constraints not met for delegate " + j10 + ". Requesting retry.");
            androidx.work.impl.utils.futures.c future4 = this.future;
            Intrinsics.checkNotNullExpressionValue(future4, "future");
            d.e(future4);
            return;
        }
        str3 = d.f2202a;
        e10.a(str3, "Constraints met for delegate " + j10);
        try {
            c cVar = this.delegate;
            Intrinsics.d(cVar);
            final h8.d o10 = cVar.o();
            Intrinsics.checkNotNullExpressionValue(o10, "delegate!!.startWork()");
            o10.e(new Runnable() { // from class: F1.c
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintTrackingWorker.v(ConstraintTrackingWorker.this, o10);
                }
            }, b());
        } catch (Throwable th) {
            str4 = d.f2202a;
            e10.b(str4, "Delegated worker " + j10 + " threw exception in startWork.", th);
            synchronized (this.lock) {
                try {
                    if (!this.areConstraintsUnmet) {
                        androidx.work.impl.utils.futures.c future5 = this.future;
                        Intrinsics.checkNotNullExpressionValue(future5, "future");
                        d.d(future5);
                    } else {
                        str5 = d.f2202a;
                        e10.a(str5, "Constraints were unmet, Retrying.");
                        androidx.work.impl.utils.futures.c future6 = this.future;
                        Intrinsics.checkNotNullExpressionValue(future6, "future");
                        d.e(future6);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(InterfaceC0915w0 job) {
        Intrinsics.checkNotNullParameter(job, "$job");
        job.d(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(ConstraintTrackingWorker this$0, h8.d innerFuture) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
        synchronized (this$0.lock) {
            try {
                if (this$0.areConstraintsUnmet) {
                    androidx.work.impl.utils.futures.c future = this$0.future;
                    Intrinsics.checkNotNullExpressionValue(future, "future");
                    d.e(future);
                } else {
                    this$0.future.r(innerFuture);
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(ConstraintTrackingWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t();
    }

    @Override // z1.InterfaceC5240d
    public void d(u workSpec, AbstractC5238b state) {
        String str;
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(state, "state");
        n e10 = n.e();
        str = d.f2202a;
        e10.a(str, "Constraints changed for " + workSpec);
        if (state instanceof AbstractC5238b.C0670b) {
            synchronized (this.lock) {
                this.areConstraintsUnmet = true;
                Unit unit = Unit.f36324a;
            }
        }
    }

    @Override // androidx.work.c
    public void m() {
        super.m();
        c cVar = this.delegate;
        if (cVar == null || cVar.k()) {
            return;
        }
        cVar.p(Build.VERSION.SDK_INT >= 31 ? g() : 0);
    }

    @Override // androidx.work.c
    public h8.d o() {
        b().execute(new Runnable() { // from class: F1.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.w(ConstraintTrackingWorker.this);
            }
        });
        androidx.work.impl.utils.futures.c future = this.future;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }
}
