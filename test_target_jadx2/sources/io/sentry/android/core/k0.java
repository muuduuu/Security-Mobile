package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.AbstractC3410f1;
import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.K1;
import io.sentry.P1;
import io.sentry.Y0;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC3410f1 f34961a = AbstractC3388s.a();

    /* renamed from: b, reason: collision with root package name */
    private static final long f34962b = SystemClock.uptimeMillis();

    private static void c(P1 p12, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Integration integration : p12.getIntegrations()) {
            if (z10 && (integration instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(integration);
            }
            if (z11 && (integration instanceof SentryTimberIntegration)) {
                arrayList.add(integration);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
                p12.getIntegrations().remove((Integration) arrayList2.get(i10));
            }
        }
        if (arrayList.size() > 1) {
            for (int i11 = 0; i11 < arrayList.size() - 1; i11++) {
                p12.getIntegrations().remove((Integration) arrayList.get(i11));
            }
        }
    }

    public static void d(Context context, ILogger iLogger) {
        e(context, iLogger, new Y0.a() { // from class: io.sentry.android.core.i0
            @Override // io.sentry.Y0.a
            public final void a(P1 p12) {
                k0.g((SentryAndroidOptions) p12);
            }
        });
    }

    public static synchronized void e(final Context context, final ILogger iLogger, final Y0.a aVar) {
        synchronized (k0.class) {
            L.e().i(f34962b, f34961a);
            try {
                try {
                    Y0.n(B0.a(SentryAndroidOptions.class), new Y0.a() { // from class: io.sentry.android.core.j0
                        @Override // io.sentry.Y0.a
                        public final void a(P1 p12) {
                            k0.h(ILogger.this, context, aVar, (SentryAndroidOptions) p12);
                        }
                    }, true);
                    io.sentry.L m10 = Y0.m();
                    if (m10.D().isEnableAutoSessionTracking() && P.m(context)) {
                        m10.w(io.sentry.android.core.internal.util.c.a("session.start"));
                        m10.L();
                    }
                } catch (IllegalAccessException e10) {
                    iLogger.b(K1.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
                } catch (InvocationTargetException e11) {
                    iLogger.b(K1.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
                }
            } catch (InstantiationException e12) {
                iLogger.b(K1.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
            } catch (NoSuchMethodException e13) {
                iLogger.b(K1.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
            }
        }
    }

    public static void f(Context context, Y0.a aVar) {
        e(context, new C3389t(), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(SentryAndroidOptions sentryAndroidOptions) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(ILogger iLogger, Context context, Y0.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        b0 b0Var = new b0();
        boolean b10 = b0Var.b("timber.log.Timber", sentryAndroidOptions);
        boolean z10 = false;
        boolean z11 = b0Var.b("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions) && b0Var.b("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions);
        if (b10 && b0Var.b("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions)) {
            z10 = true;
        }
        N n10 = new N(iLogger);
        b0 b0Var2 = new b0();
        C3378h c3378h = new C3378h(b0Var2, sentryAndroidOptions);
        AbstractC3394y.l(sentryAndroidOptions, context, iLogger, n10);
        AbstractC3394y.g(context, sentryAndroidOptions, n10, b0Var2, c3378h, z11, z10);
        aVar.a(sentryAndroidOptions);
        AbstractC3394y.f(sentryAndroidOptions, context, n10, b0Var2, c3378h);
        c(sentryAndroidOptions, z11, z10);
    }
}
