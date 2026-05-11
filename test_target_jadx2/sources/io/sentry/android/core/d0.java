package io.sentry.android.core;

import android.content.Context;
import android.os.Bundle;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.K1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
abstract class d0 {
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cd A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x007d, B:14:0x008b, B:15:0x008e, B:18:0x00c0, B:22:0x00c9, B:23:0x00e4, B:25:0x01cd, B:26:0x01d7, B:28:0x01dd, B:30:0x01eb, B:31:0x01ee, B:33:0x0228, B:35:0x0236, B:36:0x0239, B:38:0x025f, B:39:0x0266, B:43:0x0274, B:45:0x027a, B:46:0x027e, B:48:0x0284, B:51:0x0296, B:52:0x0299, B:54:0x02b6, B:55:0x02bb, B:57:0x02ed, B:58:0x02f1, B:60:0x02f7, B:62:0x0305, B:64:0x028c, B:65:0x00d7, B:66:0x031f), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01dd A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x007d, B:14:0x008b, B:15:0x008e, B:18:0x00c0, B:22:0x00c9, B:23:0x00e4, B:25:0x01cd, B:26:0x01d7, B:28:0x01dd, B:30:0x01eb, B:31:0x01ee, B:33:0x0228, B:35:0x0236, B:36:0x0239, B:38:0x025f, B:39:0x0266, B:43:0x0274, B:45:0x027a, B:46:0x027e, B:48:0x0284, B:51:0x0296, B:52:0x0299, B:54:0x02b6, B:55:0x02bb, B:57:0x02ed, B:58:0x02f1, B:60:0x02f7, B:62:0x0305, B:64:0x028c, B:65:0x00d7, B:66:0x031f), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0228 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x007d, B:14:0x008b, B:15:0x008e, B:18:0x00c0, B:22:0x00c9, B:23:0x00e4, B:25:0x01cd, B:26:0x01d7, B:28:0x01dd, B:30:0x01eb, B:31:0x01ee, B:33:0x0228, B:35:0x0236, B:36:0x0239, B:38:0x025f, B:39:0x0266, B:43:0x0274, B:45:0x027a, B:46:0x027e, B:48:0x0284, B:51:0x0296, B:52:0x0299, B:54:0x02b6, B:55:0x02bb, B:57:0x02ed, B:58:0x02f1, B:60:0x02f7, B:62:0x0305, B:64:0x028c, B:65:0x00d7, B:66:0x031f), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x025f A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x007d, B:14:0x008b, B:15:0x008e, B:18:0x00c0, B:22:0x00c9, B:23:0x00e4, B:25:0x01cd, B:26:0x01d7, B:28:0x01dd, B:30:0x01eb, B:31:0x01ee, B:33:0x0228, B:35:0x0236, B:36:0x0239, B:38:0x025f, B:39:0x0266, B:43:0x0274, B:45:0x027a, B:46:0x027e, B:48:0x0284, B:51:0x0296, B:52:0x0299, B:54:0x02b6, B:55:0x02bb, B:57:0x02ed, B:58:0x02f1, B:60:0x02f7, B:62:0x0305, B:64:0x028c, B:65:0x00d7, B:66:0x031f), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b6 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x007d, B:14:0x008b, B:15:0x008e, B:18:0x00c0, B:22:0x00c9, B:23:0x00e4, B:25:0x01cd, B:26:0x01d7, B:28:0x01dd, B:30:0x01eb, B:31:0x01ee, B:33:0x0228, B:35:0x0236, B:36:0x0239, B:38:0x025f, B:39:0x0266, B:43:0x0274, B:45:0x027a, B:46:0x027e, B:48:0x0284, B:51:0x0296, B:52:0x0299, B:54:0x02b6, B:55:0x02bb, B:57:0x02ed, B:58:0x02f1, B:60:0x02f7, B:62:0x0305, B:64:0x028c, B:65:0x00d7, B:66:0x031f), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ed A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x007d, B:14:0x008b, B:15:0x008e, B:18:0x00c0, B:22:0x00c9, B:23:0x00e4, B:25:0x01cd, B:26:0x01d7, B:28:0x01dd, B:30:0x01eb, B:31:0x01ee, B:33:0x0228, B:35:0x0236, B:36:0x0239, B:38:0x025f, B:39:0x0266, B:43:0x0274, B:45:0x027a, B:46:0x027e, B:48:0x0284, B:51:0x0296, B:52:0x0299, B:54:0x02b6, B:55:0x02bb, B:57:0x02ed, B:58:0x02f1, B:60:0x02f7, B:62:0x0305, B:64:0x028c, B:65:0x00d7, B:66:0x031f), top: B:2:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(Context context, SentryAndroidOptions sentryAndroidOptions, N n10) {
        long h10;
        List<String> g10;
        io.sentry.protocol.p sdkVersion;
        List g11;
        io.sentry.util.n.c(context, "The application context is required.");
        io.sentry.util.n.c(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle b10 = b(context, sentryAndroidOptions.getLogger(), n10);
            ILogger logger = sentryAndroidOptions.getLogger();
            if (b10 != null) {
                sentryAndroidOptions.setDebug(d(b10, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String name = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String i10 = i(b10, logger, "io.sentry.debug.level", name.toLowerCase(locale));
                    if (i10 != null) {
                        sentryAndroidOptions.setDiagnosticLevel(K1.valueOf(i10.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(d(b10, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(d(b10, logger, "io.sentry.auto-session-tracking.enable", d(b10, logger, "io.sentry.session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking())));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    Double f10 = f(b10, logger, "io.sentry.sample-rate");
                    if (f10.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setSampleRate(f10);
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(d(b10, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(h(b10, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                String i11 = i(b10, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean d10 = d(b10, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (d10 && (i11 == null || !i11.isEmpty())) {
                    if (i11 == null) {
                        sentryAndroidOptions.getLogger().c(K1.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                    }
                    sentryAndroidOptions.setEnabled(d10);
                    sentryAndroidOptions.setDsn(i11);
                    sentryAndroidOptions.setEnableNdk(d(b10, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                    sentryAndroidOptions.setEnableScopeSync(d(b10, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                    sentryAndroidOptions.setRelease(i(b10, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                    sentryAndroidOptions.setEnvironment(i(b10, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                    sentryAndroidOptions.setSessionTrackingIntervalMillis(h(b10, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                    sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(d(b10, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                    sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(d(b10, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(d(b10, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                    sentryAndroidOptions.setEnableAppComponentBreadcrumbs(d(b10, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                    sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(d(b10, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                    sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(d(b10, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                    sentryAndroidOptions.setEnableUncaughtExceptionHandler(d(b10, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                    sentryAndroidOptions.setAttachThreads(d(b10, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                    sentryAndroidOptions.setAttachScreenshot(d(b10, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                    sentryAndroidOptions.setAttachViewHierarchy(d(b10, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                    sentryAndroidOptions.setSendClientReports(d(b10, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                    sentryAndroidOptions.setCollectAdditionalContext(d(b10, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                    if (sentryAndroidOptions.getEnableTracing() == null) {
                        sentryAndroidOptions.setEnableTracing(e(b10, logger, "io.sentry.traces.enable", null));
                    }
                    if (sentryAndroidOptions.getTracesSampleRate() == null) {
                        Double f11 = f(b10, logger, "io.sentry.traces.sample-rate");
                        if (f11.doubleValue() != -1.0d) {
                            sentryAndroidOptions.setTracesSampleRate(f11);
                        }
                    }
                    sentryAndroidOptions.setTraceSampling(d(b10, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                    sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(d(b10, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                    sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(d(b10, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                    sentryAndroidOptions.setProfilingEnabled(d(b10, logger, "io.sentry.traces.profiling.enable", sentryAndroidOptions.isProfilingEnabled()));
                    if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                        Double f12 = f(b10, logger, "io.sentry.traces.profiling.sample-rate");
                        if (f12.doubleValue() != -1.0d) {
                            sentryAndroidOptions.setProfilesSampleRate(f12);
                        }
                    }
                    sentryAndroidOptions.setEnableUserInteractionTracing(d(b10, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                    sentryAndroidOptions.setEnableTimeToFullDisplayTracing(d(b10, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                    h10 = h(b10, logger, "io.sentry.traces.idle-timeout", -1L);
                    if (h10 != -1) {
                        sentryAndroidOptions.setIdleTimeout(Long.valueOf(h10));
                    }
                    g10 = g(b10, logger, "io.sentry.traces.trace-propagation-targets");
                    if (!b10.containsKey("io.sentry.traces.trace-propagation-targets") && (g10 == null || g10.isEmpty())) {
                        g10 = g(b10, logger, "io.sentry.traces.tracing-origins");
                    }
                    if ((!b10.containsKey("io.sentry.traces.trace-propagation-targets") || b10.containsKey("io.sentry.traces.tracing-origins")) && g10 == null) {
                        sentryAndroidOptions.setTracePropagationTargets(Collections.emptyList());
                    } else if (g10 != null) {
                        sentryAndroidOptions.setTracePropagationTargets(g10);
                    }
                    sentryAndroidOptions.setEnableFramesTracking(d(b10, logger, "io.sentry.traces.frames-tracking", true));
                    sentryAndroidOptions.setProguardUuid(i(b10, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                    sdkVersion = sentryAndroidOptions.getSdkVersion();
                    if (sdkVersion == null) {
                        sdkVersion = new io.sentry.protocol.p(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                    }
                    sdkVersion.h(j(b10, logger, "io.sentry.sdk.name", sdkVersion.e()));
                    sdkVersion.j(j(b10, logger, "io.sentry.sdk.version", sdkVersion.g()));
                    sentryAndroidOptions.setSdkVersion(sdkVersion);
                    sentryAndroidOptions.setSendDefaultPii(d(b10, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                    g11 = g(b10, logger, "io.sentry.gradle-plugin-integrations");
                    if (g11 != null) {
                        Iterator it = g11.iterator();
                        while (it.hasNext()) {
                            I1.c().a((String) it.next());
                        }
                    }
                    sentryAndroidOptions.setEnableRootCheck(d(b10, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                    sentryAndroidOptions.setSendModules(d(b10, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                }
                sentryAndroidOptions.getLogger().c(K1.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                sentryAndroidOptions.setEnabled(d10);
                sentryAndroidOptions.setDsn(i11);
                sentryAndroidOptions.setEnableNdk(d(b10, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(d(b10, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                sentryAndroidOptions.setRelease(i(b10, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(i(b10, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(h(b10, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(d(b10, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(d(b10, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(d(b10, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(d(b10, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(d(b10, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(d(b10, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(d(b10, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(d(b10, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(d(b10, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(d(b10, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(d(b10, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                sentryAndroidOptions.setCollectAdditionalContext(d(b10, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                if (sentryAndroidOptions.getEnableTracing() == null) {
                }
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                }
                sentryAndroidOptions.setTraceSampling(d(b10, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(d(b10, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(d(b10, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                sentryAndroidOptions.setProfilingEnabled(d(b10, logger, "io.sentry.traces.profiling.enable", sentryAndroidOptions.isProfilingEnabled()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                }
                sentryAndroidOptions.setEnableUserInteractionTracing(d(b10, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(d(b10, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                h10 = h(b10, logger, "io.sentry.traces.idle-timeout", -1L);
                if (h10 != -1) {
                }
                g10 = g(b10, logger, "io.sentry.traces.trace-propagation-targets");
                if (!b10.containsKey("io.sentry.traces.trace-propagation-targets")) {
                    g10 = g(b10, logger, "io.sentry.traces.tracing-origins");
                }
                if (b10.containsKey("io.sentry.traces.trace-propagation-targets")) {
                }
                sentryAndroidOptions.setTracePropagationTargets(Collections.emptyList());
                sentryAndroidOptions.setEnableFramesTracking(d(b10, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(i(b10, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                }
                sdkVersion.h(j(b10, logger, "io.sentry.sdk.name", sdkVersion.e()));
                sdkVersion.j(j(b10, logger, "io.sentry.sdk.version", sdkVersion.g()));
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(d(b10, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                g11 = g(b10, logger, "io.sentry.gradle-plugin-integrations");
                if (g11 != null) {
                }
                sentryAndroidOptions.setEnableRootCheck(d(b10, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(d(b10, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
            }
            sentryAndroidOptions.getLogger().c(K1.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(K1.ERROR, "Failed to read configuration from android manifest metadata.", th);
        }
    }

    private static Bundle b(Context context, ILogger iLogger, N n10) {
        if (n10 == null) {
            n10 = new N(iLogger);
        }
        return P.a(context, 128L, n10).metaData;
    }

    static boolean c(Context context, ILogger iLogger) {
        io.sentry.util.n.c(context, "The application context is required.");
        try {
            Bundle b10 = b(context, iLogger, null);
            r1 = b10 != null ? d(b10, iLogger, "io.sentry.auto-init", true) : true;
            iLogger.c(K1.INFO, "Retrieving auto-init from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            iLogger.b(K1.ERROR, "Failed to read auto-init from android manifest metadata.", th);
        }
        return r1;
    }

    private static boolean d(Bundle bundle, ILogger iLogger, String str, boolean z10) {
        boolean z11 = bundle.getBoolean(str, z10);
        iLogger.c(K1.DEBUG, "%s read: %s", str, Boolean.valueOf(z11));
        return z11;
    }

    private static Boolean e(Bundle bundle, ILogger iLogger, String str, Boolean bool) {
        if (bundle.getSerializable(str) == null) {
            iLogger.c(K1.DEBUG, "%s used default %s", str, bool);
            return bool;
        }
        boolean z10 = bundle.getBoolean(str, bool != null);
        iLogger.c(K1.DEBUG, "%s read: %s", str, Boolean.valueOf(z10));
        return Boolean.valueOf(z10);
    }

    private static Double f(Bundle bundle, ILogger iLogger, String str) {
        Double valueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue());
        iLogger.c(K1.DEBUG, "%s read: %s", str, valueOf);
        return valueOf;
    }

    private static List g(Bundle bundle, ILogger iLogger, String str) {
        String string = bundle.getString(str);
        iLogger.c(K1.DEBUG, "%s read: %s", str, string);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    private static long h(Bundle bundle, ILogger iLogger, String str, long j10) {
        long j11 = bundle.getInt(str, (int) j10);
        iLogger.c(K1.DEBUG, "%s read: %s", str, Long.valueOf(j11));
        return j11;
    }

    private static String i(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.c(K1.DEBUG, "%s read: %s", str, string);
        return string;
    }

    private static String j(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.c(K1.DEBUG, "%s read: %s", str, string);
        return string;
    }
}
