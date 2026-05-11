package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.D;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0002\u0010\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/p;", "<init>", "()V", BuildConfig.FLAVOR, "f", "e", "d", "g", "j", "k", "Landroid/content/Context;", "context", "h", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, C4870a.f43493a, "I", "startedCounter", "b", "resumedCounter", BuildConfig.FLAVOR, "c", "Z", "pauseSent", "stopSent", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/r;", "Landroidx/lifecycle/r;", "registry", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/D$a;", "Landroidx/lifecycle/D$a;", "initializationListener", "Landroidx/lifecycle/i;", "getLifecycle", "()Landroidx/lifecycle/i;", "lifecycle", "i", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleOwner implements InterfaceC1599p {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    private static final ProcessLifecycleOwner f17073j = new ProcessLifecycleOwner();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int startedCounter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int resumedCounter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Handler handler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean pauseSent = true;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean stopSent = true;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final r registry = new r(this);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Runnable delayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.B
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.i(ProcessLifecycleOwner.this);
        }
    };

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final D.a initializationListener = new d();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17082a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1599p a() {
            return ProcessLifecycleOwner.f17073j;
        }

        public final void b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ProcessLifecycleOwner.f17073j.h(context);
        }

        private Companion() {
        }
    }

    public static final class c extends AbstractC1588e {

        public static final class a extends AbstractC1588e {
            final /* synthetic */ ProcessLifecycleOwner this$0;

            a(ProcessLifecycleOwner processLifecycleOwner) {
                this.this$0 = processLifecycleOwner;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.AbstractC1588e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                D.f17036b.b(activity).f(ProcessLifecycleOwner.this.initializationListener);
            }
        }

        @Override // androidx.lifecycle.AbstractC1588e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ProcessLifecycleOwner.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            a.a(activity, new a(ProcessLifecycleOwner.this));
        }

        @Override // androidx.lifecycle.AbstractC1588e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ProcessLifecycleOwner.this.g();
        }
    }

    public static final class d implements D.a {
        d() {
        }

        @Override // androidx.lifecycle.D.a
        public void a() {
            ProcessLifecycleOwner.this.e();
        }

        @Override // androidx.lifecycle.D.a
        public void b() {
            ProcessLifecycleOwner.this.f();
        }

        @Override // androidx.lifecycle.D.a
        public void c() {
        }
    }

    private ProcessLifecycleOwner() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ProcessLifecycleOwner this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
        this$0.k();
    }

    public static final InterfaceC1599p l() {
        return INSTANCE.a();
    }

    public final void d() {
        int i10 = this.resumedCounter - 1;
        this.resumedCounter = i10;
        if (i10 == 0) {
            Handler handler = this.handler;
            Intrinsics.d(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    public final void e() {
        int i10 = this.resumedCounter + 1;
        this.resumedCounter = i10;
        if (i10 == 1) {
            if (this.pauseSent) {
                this.registry.i(AbstractC1592i.a.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                Intrinsics.d(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    public final void f() {
        int i10 = this.startedCounter + 1;
        this.startedCounter = i10;
        if (i10 == 1 && this.stopSent) {
            this.registry.i(AbstractC1592i.a.ON_START);
            this.stopSent = false;
        }
    }

    public final void g() {
        this.startedCounter--;
        k();
    }

    @Override // androidx.lifecycle.InterfaceC1599p
    public AbstractC1592i getLifecycle() {
        return this.registry;
    }

    public final void h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.handler = new Handler();
        this.registry.i(AbstractC1592i.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.i(AbstractC1592i.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.i(AbstractC1592i.a.ON_STOP);
            this.stopSent = true;
        }
    }
}
