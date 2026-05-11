package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.K1;
import io.sentry.P1;
import io.sentry.android.core.N;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class s implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final N f34939a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f34940b;

    /* renamed from: c, reason: collision with root package name */
    private final P1 f34941c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f34942d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference f34943e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f34944f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34945g;

    /* renamed from: h, reason: collision with root package name */
    private final c f34946h;

    /* renamed from: i, reason: collision with root package name */
    private Window.OnFrameMetricsAvailableListener f34947i;

    /* renamed from: j, reason: collision with root package name */
    private Choreographer f34948j;

    /* renamed from: k, reason: collision with root package name */
    private Field f34949k;

    /* renamed from: l, reason: collision with root package name */
    private long f34950l;

    /* renamed from: m, reason: collision with root package name */
    private long f34951m;

    class a implements c {
        a() {
        }
    }

    public interface b {
        void a(long j10, long j11, float f10);
    }

    public interface c {
        default void a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        default void b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    public s(Context context, P1 p12, N n10) {
        this(context, p12, n10, new a());
    }

    private long d(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    private long e(FrameMetrics frameMetrics) {
        Field field;
        if (this.f34939a.d() >= 26) {
            return frameMetrics.getMetric(10);
        }
        Choreographer choreographer = this.f34948j;
        if (choreographer == null || (field = this.f34949k) == null) {
            return -1L;
        }
        try {
            Long l10 = (Long) field.get(choreographer);
            if (l10 != null) {
                return l10.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(P1 p12, Thread thread, Throwable th) {
        p12.getLogger().b(K1.ERROR, "Error during frames measurements.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f34948j = Choreographer.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(N n10, Window window, FrameMetrics frameMetrics, int i10) {
        float refreshRate;
        Display display;
        long nanoTime = System.nanoTime();
        if (n10.d() >= 30) {
            display = window.getContext().getDisplay();
            refreshRate = display.getRefreshRate();
        } else {
            refreshRate = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        }
        long d10 = d(frameMetrics);
        long e10 = e(frameMetrics);
        if (e10 < 0) {
            e10 = nanoTime - d10;
        }
        long max = Math.max(e10, this.f34951m);
        if (max == this.f34950l) {
            return;
        }
        this.f34950l = max;
        this.f34951m = max + d10;
        Iterator it = this.f34944f.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this.f34951m, d10, refreshRate);
        }
    }

    private void i(Window window) {
        WeakReference weakReference = this.f34943e;
        if (weakReference == null || weakReference.get() != window) {
            this.f34943e = new WeakReference(window);
            m();
        }
    }

    private void l(Window window) {
        if (this.f34940b.contains(window)) {
            if (this.f34939a.d() >= 24) {
                try {
                    this.f34946h.b(window, this.f34947i);
                } catch (Exception e10) {
                    this.f34941c.getLogger().b(K1.ERROR, "Failed to remove frameMetricsAvailableListener", e10);
                }
            }
            this.f34940b.remove(window);
        }
    }

    private void m() {
        WeakReference weakReference = this.f34943e;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.f34945g || this.f34940b.contains(window) || this.f34944f.isEmpty() || this.f34939a.d() < 24 || this.f34942d == null) {
            return;
        }
        this.f34940b.add(window);
        this.f34946h.a(window, this.f34947i, this.f34942d);
    }

    public String j(b bVar) {
        if (!this.f34945g) {
            return null;
        }
        String uuid = UUID.randomUUID().toString();
        this.f34944f.put(uuid, bVar);
        m();
        return uuid;
    }

    public void k(String str) {
        if (this.f34945g) {
            if (str != null) {
                this.f34944f.remove(str);
            }
            WeakReference weakReference = this.f34943e;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !this.f34944f.isEmpty()) {
                return;
            }
            l(window);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        i(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        l(activity.getWindow());
        WeakReference weakReference = this.f34943e;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f34943e = null;
    }

    public s(Context context, final P1 p12, final N n10, c cVar) {
        this.f34940b = new CopyOnWriteArraySet();
        this.f34944f = new ConcurrentHashMap();
        this.f34945g = false;
        this.f34950l = 0L;
        this.f34951m = 0L;
        io.sentry.util.n.c(context, "The context is required");
        this.f34941c = (P1) io.sentry.util.n.c(p12, "SentryOptions is required");
        this.f34939a = (N) io.sentry.util.n.c(n10, "BuildInfoProvider is required");
        this.f34946h = (c) io.sentry.util.n.c(cVar, "WindowFrameMetricsManager is required");
        if ((context instanceof Application) && n10.d() >= 24) {
            this.f34945g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.p
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    s.f(P1.this, thread, th);
                }
            });
            handlerThread.start();
            this.f34942d = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.q
                @Override // java.lang.Runnable
                public final void run() {
                    s.this.g();
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f34949k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                p12.getLogger().b(K1.ERROR, "Unable to get the frame timestamp from the choreographer: ", e10);
            }
            this.f34947i = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.r
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                    s.this.h(n10, window, frameMetrics, i10);
                }
            };
        }
    }
}
