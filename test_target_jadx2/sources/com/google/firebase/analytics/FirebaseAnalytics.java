package com.google.firebase.analytics;

import D7.AbstractC0789m;
import V6.AbstractC1287s;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2411z1;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.measurement.internal.InterfaceC2650c5;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* renamed from: c, reason: collision with root package name */
    private static volatile FirebaseAnalytics f27943c;

    /* renamed from: a, reason: collision with root package name */
    private final C2411z1 f27944a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f27945b;

    public enum a {
        GRANTED,
        DENIED
    }

    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(C2411z1 c2411z1) {
        AbstractC1287s.m(c2411z1);
        this.f27944a = c2411z1;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f27943c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f27943c == null) {
                        f27943c = new FirebaseAnalytics(C2411z1.s(context, null));
                    }
                } finally {
                }
            }
        }
        return f27943c;
    }

    public static InterfaceC2650c5 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C2411z1 s10 = C2411z1.s(context, bundle);
        if (s10 == null) {
            return null;
        }
        return new d(s10);
    }

    private final ExecutorService l() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f27945b == null) {
                    this.f27945b = new com.google.firebase.analytics.a(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                executorService = this.f27945b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public Task a() {
        try {
            return AbstractC0789m.d(l(), new com.google.firebase.analytics.b(this));
        } catch (RuntimeException e10) {
            this.f27944a.d(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return AbstractC0789m.f(e10);
        }
    }

    public Task b() {
        try {
            return AbstractC0789m.d(l(), new c(this));
        } catch (RuntimeException e10) {
            this.f27944a.d(5, "Failed to schedule task for getSessionId", null, null, null);
            return AbstractC0789m.f(e10);
        }
    }

    public void c(String str, Bundle bundle) {
        this.f27944a.v(str, bundle);
    }

    public void d() {
        this.f27944a.F();
    }

    public void e(boolean z10) {
        this.f27944a.D(Boolean.valueOf(z10));
    }

    public void f(Map map) {
        Bundle bundle = new Bundle();
        a aVar = (a) map.get(b.AD_STORAGE);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int ordinal3 = aVar3.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = (a) map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int ordinal4 = aVar4.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f27944a.E(bundle);
    }

    public void g(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f27944a.i(bundle);
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) AbstractC0789m.b(com.google.firebase.installations.c.s().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public void h(long j10) {
        this.f27944a.G(j10);
    }

    public void i(String str) {
        this.f27944a.B(str);
    }

    public void j(String str, String str2) {
        this.f27944a.x(null, str, str2, false);
    }

    final /* synthetic */ C2411z1 k() {
        return this.f27944a;
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f27944a.C(J0.j(activity), str, str2);
    }
}
