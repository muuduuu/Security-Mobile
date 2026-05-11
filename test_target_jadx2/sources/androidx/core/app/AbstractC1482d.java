package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1482d {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class f15720a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f15721b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f15722c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f15723d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f15724e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f15725f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f15726g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.d$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0259d f15727a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f15728b;

        a(C0259d c0259d, Object obj) {
            this.f15727a = c0259d;
            this.f15728b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15727a.f15733a = this.f15728b;
        }
    }

    /* renamed from: androidx.core.app.d$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f15729a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0259d f15730b;

        b(Application application, C0259d c0259d) {
            this.f15729a = application;
            this.f15730b = c0259d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15729a.unregisterActivityLifecycleCallbacks(this.f15730b);
        }
    }

    /* renamed from: androidx.core.app.d$c */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f15731a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f15732b;

        c(Object obj, Object obj2) {
            this.f15731a = obj;
            this.f15732b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = AbstractC1482d.f15723d;
                if (method != null) {
                    method.invoke(this.f15731a, this.f15732b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    AbstractC1482d.f15724e.invoke(this.f15731a, this.f15732b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    private static final class C0259d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        Object f15733a;

        /* renamed from: b, reason: collision with root package name */
        private Activity f15734b;

        /* renamed from: c, reason: collision with root package name */
        private final int f15735c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15736d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f15737e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f15738f = false;

        C0259d(Activity activity) {
            this.f15734b = activity;
            this.f15735c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f15734b == activity) {
                this.f15734b = null;
                this.f15737e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f15737e || this.f15738f || this.f15736d || !AbstractC1482d.h(this.f15733a, this.f15735c, activity)) {
                return;
            }
            this.f15738f = true;
            this.f15733a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f15734b == activity) {
                this.f15736d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class a10 = a();
        f15720a = a10;
        f15721b = b();
        f15722c = f();
        f15723d = d(a10);
        f15724e = c(a10);
        f15725f = e(a10);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f15722c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f15726g.postAtFrontOfQueue(new c(f15721b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f15725f == null) {
            return false;
        }
        if (f15724e == null && f15723d == null) {
            return false;
        }
        try {
            Object obj2 = f15722c.get(activity);
            if (obj2 == null || (obj = f15721b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0259d c0259d = new C0259d(activity);
            application.registerActivityLifecycleCallbacks(c0259d);
            Handler handler = f15726g;
            handler.post(new a(c0259d, obj2));
            try {
                if (g()) {
                    Method method = f15725f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0259d));
                return true;
            } catch (Throwable th) {
                f15726g.post(new b(application, c0259d));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
