package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.C3423k;
import io.sentry.C3429m;
import io.sentry.ILogger;
import io.sentry.K1;
import io.sentry.R0;
import io.sentry.U0;
import io.sentry.V0;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.util.l;
import java.io.File;
import java.util.ArrayList;

/* renamed from: io.sentry.android.core.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3394y {
    private static String d(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + "+" + str;
    }

    private static void e(Context context, SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setCacheDirPath(new File(context.getCacheDir(), "sentry").getAbsolutePath());
    }

    static void f(SentryAndroidOptions sentryAndroidOptions, Context context, N n10, b0 b0Var, C3378h c3378h) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.r)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.b(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new C3423k(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new T(context, n10, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new g0(sentryAndroidOptions, c3378h));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, n10));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new F(context, sentryAndroidOptions, n10));
        sentryAndroidOptions.setTransportGate(new C(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setTransactionProfiler(new B(context, sentryAndroidOptions, n10, new io.sentry.android.core.internal.util.s(context, sentryAndroidOptions, n10)));
        sentryAndroidOptions.setModulesLoader(new io.sentry.android.core.internal.modules.a(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setDebugMetaLoader(new io.sentry.android.core.internal.debugmeta.a(context, sentryAndroidOptions.getLogger()));
        boolean b10 = b0Var.b("androidx.core.view.ScrollingView", sentryAndroidOptions);
        boolean b11 = b0Var.b("androidx.compose.ui.node.Owner", sentryAndroidOptions);
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(b10));
            if (b11 && b0Var.b("io.sentry.compose.gestures.ComposeGestureTargetLocator", sentryAndroidOptions)) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && b11 && b0Var.b("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", sentryAndroidOptions)) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        sentryAndroidOptions.setMainThreadChecker(io.sentry.android.core.internal.util.b.e());
        if (sentryAndroidOptions.getCollectors().isEmpty()) {
            sentryAndroidOptions.addCollector(new C3390u());
            sentryAndroidOptions.addCollector(new r(sentryAndroidOptions.getLogger(), n10));
        }
        sentryAndroidOptions.setTransactionPerformanceCollector(new C3429m(sentryAndroidOptions));
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.s(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.n(sentryAndroidOptions));
        }
    }

    static void g(Context context, final SentryAndroidOptions sentryAndroidOptions, N n10, b0 b0Var, C3378h c3378h, boolean z10, boolean z11) {
        io.sentry.util.l lVar = new io.sentry.util.l(new l.a() { // from class: io.sentry.android.core.v
            @Override // io.sentry.util.l.a
            public final Object a() {
                Boolean i10;
                i10 = AbstractC3394y.i(SentryAndroidOptions.this);
                return i10;
            }
        });
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new U0(new R0() { // from class: io.sentry.android.core.w
            @Override // io.sentry.R0
            public final String a() {
                String cacheDirPath;
                cacheDirPath = SentryAndroidOptions.this.getCacheDirPath();
                return cacheDirPath;
            }
        }), lVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(h(n10) ? b0Var.c("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger()) : null));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.b());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new V0(new R0() { // from class: io.sentry.android.core.x
            @Override // io.sentry.R0
            public final String a() {
                String outboxPath;
                outboxPath = SentryAndroidOptions.this.getOutboxPath();
                return outboxPath;
            }
        }), lVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(E.a(context, n10));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, n10, c3378h));
            sentryAndroidOptions.addIntegration(new CurrentActivityIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, b0Var));
            if (z10) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().c(K1.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z11) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, n10, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.addIntegration(new TempSensorBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new PhoneStateBreadcrumbsIntegration(context));
    }

    private static boolean h(N n10) {
        return n10.d() >= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean i(SentryAndroidOptions sentryAndroidOptions) {
        return Boolean.valueOf(io.sentry.android.core.cache.b.X(sentryAndroidOptions));
    }

    static void l(SentryAndroidOptions sentryAndroidOptions, Context context, ILogger iLogger, N n10) {
        io.sentry.util.n.c(context, "The context is required.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        io.sentry.util.n.c(sentryAndroidOptions, "The options object is required.");
        io.sentry.util.n.c(iLogger, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(iLogger);
        sentryAndroidOptions.setDateProvider(new l0());
        d0.a(context, sentryAndroidOptions, n10);
        e(context, sentryAndroidOptions);
        m(sentryAndroidOptions, context, n10);
    }

    private static void m(SentryAndroidOptions sentryAndroidOptions, Context context, N n10) {
        PackageInfo j10 = P.j(context, sentryAndroidOptions.getLogger(), n10);
        if (j10 != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(d(j10, P.k(j10, n10)));
            }
            String str = j10.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(Y.a(context));
            } catch (RuntimeException e10) {
                sentryAndroidOptions.getLogger().b(K1.ERROR, "Could not generate distinct Id.", e10);
            }
        }
    }
}
