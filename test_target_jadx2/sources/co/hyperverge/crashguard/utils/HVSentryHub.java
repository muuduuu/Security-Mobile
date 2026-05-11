package co.hyperverge.crashguard.utils;

import Jd.AbstractC0889j;
import android.app.Application;
import android.os.Build;
import android.util.Log;
import co.hyperverge.crashguard.objects.CrashguardConfig;
import co.hyperverge.hyperlogger.HyperLogger;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import io.sentry.G;
import io.sentry.L;
import io.sentry.Y0;
import io.sentry.android.core.SentryAndroidOptions;
import java.lang.Thread;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.e;
import lc.o;
import lc.p;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\nR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001c\u0010#\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lco/hyperverge/crashguard/utils/HVSentryHub;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "env", "Lco/hyperverge/crashguard/objects/CrashguardConfig;", HVRetakeActivity.CONFIG_TAG, BuildConfig.FLAVOR, "initialiseSentryHub", "(Ljava/lang/String;Lco/hyperverge/crashguard/objects/CrashguardConfig;)V", BuildConfig.FLAVOR, "e", "pushUncaughtException", "(Ljava/lang/Throwable;)V", BuildConfig.FLAVOR, "enable", "enableScreenshotAttachment", "(Z)V", "enableMainHubDeduplication", "init", "Lio/sentry/G;", "hub", "Lio/sentry/G;", "Lio/sentry/L;", "clientHub", "Lio/sentry/L;", "Lio/sentry/android/core/SentryAndroidOptions;", "clientHubSentryAndroidOptions", "Lio/sentry/android/core/SentryAndroidOptions;", "clientHubScreenshotConfig", "Z", "clientHubDeduplicationConfig", "Ljava/lang/Thread$UncaughtExceptionHandler;", "kotlin.jvm.PlatformType", "defaultUEH", "Ljava/lang/Thread$UncaughtExceptionHandler;", "crashguard_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class HVSentryHub {
    private static L clientHub;
    private static boolean clientHubDeduplicationConfig;
    private static boolean clientHubScreenshotConfig;
    private static SentryAndroidOptions clientHubSentryAndroidOptions;
    private static G hub;
    public static final HVSentryHub INSTANCE = new HVSentryHub();
    private static final Thread.UncaughtExceptionHandler defaultUEH = Thread.getDefaultUncaughtExceptionHandler();

    private HVSentryHub() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableMainHubDeduplication(boolean enable) {
        String className;
        Object b10;
        String className2;
        Object invoke;
        boolean z10;
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        SentryAndroidOptions sentryAndroidOptions = null;
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        if (L02 == null && (L02 = HVSentryHub.class.getCanonicalName()) == null) {
            L02 = "N/A";
        }
        Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(L02);
        if (matcher.find()) {
            L02 = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
        }
        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L02 = L02.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L02);
        sb2.append(" - ");
        String m10 = Intrinsics.m("enableDeduplication() called with: enable = ", Boolean.valueOf(enable));
        if (m10 == null) {
            m10 = "null ";
        }
        sb2.append(m10);
        sb2.append(' ');
        sb2.append(BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        if (!LogExtsKt.isRelease()) {
            try {
                o.a aVar = o.f37128b;
                invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            } catch (Throwable th) {
                o.a aVar2 = o.f37128b;
                b10 = o.b(p.a(th));
            }
            if (invoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            b10 = o.b(((Application) invoke).getPackageName());
            if (o.f(b10)) {
                b10 = BuildConfig.FLAVOR;
            }
            String packageName = (String) b10;
            if (LogExtsKt.isDebug()) {
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                    StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                    String L03 = (stackTraceElement2 == null || (className2 = stackTraceElement2.getClassName()) == null) ? null : StringsKt.L0(className2, '.', null, 2, null);
                    String str = (L03 == null && (L03 = HVSentryHub.class.getCanonicalName()) == null) ? "N/A" : L03;
                    Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str);
                    if (matcher2.find()) {
                        str = matcher2.replaceAll(BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
                    }
                    if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        str = str.substring(0, 23);
                        Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    StringBuilder sb3 = new StringBuilder();
                    String m11 = Intrinsics.m("enableDeduplication() called with: enable = ", Boolean.valueOf(enable));
                    if (m11 == null) {
                        m11 = "null ";
                    }
                    sb3.append(m11);
                    sb3.append(' ');
                    sb3.append(BuildConfig.FLAVOR);
                    Log.println(3, str, sb3.toString());
                }
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = clientHubSentryAndroidOptions;
        if (sentryAndroidOptions2 == null) {
            Intrinsics.v("clientHubSentryAndroidOptions");
            z10 = enable;
        } else {
            z10 = enable;
            sentryAndroidOptions = sentryAndroidOptions2;
        }
        sentryAndroidOptions.setEnableDeduplication(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableScreenshotAttachment(boolean enable) {
        String className;
        Object b10;
        String className2;
        Object invoke;
        boolean z10;
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        SentryAndroidOptions sentryAndroidOptions = null;
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        if (L02 == null && (L02 = HVSentryHub.class.getCanonicalName()) == null) {
            L02 = "N/A";
        }
        Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(L02);
        if (matcher.find()) {
            L02 = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
        }
        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L02 = L02.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L02);
        sb2.append(" - ");
        String m10 = Intrinsics.m("enableScreenshotAttachment() called with: enable = ", Boolean.valueOf(enable));
        if (m10 == null) {
            m10 = "null ";
        }
        sb2.append(m10);
        sb2.append(' ');
        sb2.append(BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        if (!LogExtsKt.isRelease()) {
            try {
                o.a aVar = o.f37128b;
                invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            } catch (Throwable th) {
                o.a aVar2 = o.f37128b;
                b10 = o.b(p.a(th));
            }
            if (invoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            b10 = o.b(((Application) invoke).getPackageName());
            if (o.f(b10)) {
                b10 = BuildConfig.FLAVOR;
            }
            String packageName = (String) b10;
            if (LogExtsKt.isDebug()) {
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                    StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                    String L03 = (stackTraceElement2 == null || (className2 = stackTraceElement2.getClassName()) == null) ? null : StringsKt.L0(className2, '.', null, 2, null);
                    String str = (L03 == null && (L03 = HVSentryHub.class.getCanonicalName()) == null) ? "N/A" : L03;
                    Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str);
                    if (matcher2.find()) {
                        str = matcher2.replaceAll(BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
                    }
                    if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        str = str.substring(0, 23);
                        Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    StringBuilder sb3 = new StringBuilder();
                    String m11 = Intrinsics.m("enableScreenshotAttachment() called with: enable = ", Boolean.valueOf(enable));
                    if (m11 == null) {
                        m11 = "null ";
                    }
                    sb3.append(m11);
                    sb3.append(' ');
                    sb3.append(BuildConfig.FLAVOR);
                    Log.println(3, str, sb3.toString());
                }
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = clientHubSentryAndroidOptions;
        if (sentryAndroidOptions2 == null) {
            Intrinsics.v("clientHubSentryAndroidOptions");
            z10 = enable;
        } else {
            z10 = enable;
            sentryAndroidOptions = sentryAndroidOptions2;
        }
        sentryAndroidOptions.setAttachScreenshot(z10);
    }

    private final void initialiseSentryHub(String env, final CrashguardConfig config) {
        String className;
        Object b10;
        String className2;
        Object invoke;
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        SentryAndroidOptions sentryAndroidOptions = null;
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        if (L02 == null && (L02 = HVSentryHub.class.getCanonicalName()) == null) {
            L02 = "N/A";
        }
        Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(L02);
        if (matcher.find()) {
            L02 = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
        }
        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L02 = L02.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L02);
        sb2.append(" - ");
        String m10 = Intrinsics.m("initialiseSentryHub() called with: config = ", config);
        if (m10 == null) {
            m10 = "null ";
        }
        sb2.append(m10);
        sb2.append(' ');
        sb2.append(BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        if (!LogExtsKt.isRelease()) {
            try {
                o.a aVar = o.f37128b;
                invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            } catch (Throwable th) {
                o.a aVar2 = o.f37128b;
                b10 = o.b(p.a(th));
            }
            if (invoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            b10 = o.b(((Application) invoke).getPackageName());
            if (o.f(b10)) {
                b10 = BuildConfig.FLAVOR;
            }
            String packageName = (String) b10;
            if (LogExtsKt.isDebug()) {
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                    StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                    String L03 = (stackTraceElement2 == null || (className2 = stackTraceElement2.getClassName()) == null) ? null : StringsKt.L0(className2, '.', null, 2, null);
                    String str = (L03 == null && (L03 = HVSentryHub.class.getCanonicalName()) == null) ? "N/A" : L03;
                    Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str);
                    if (matcher2.find()) {
                        str = matcher2.replaceAll(BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
                    }
                    if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        str = str.substring(0, 23);
                        Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    StringBuilder sb3 = new StringBuilder();
                    String m11 = Intrinsics.m("initialiseSentryHub() called with: config = ", config);
                    if (m11 == null) {
                        m11 = "null ";
                    }
                    sb3.append(m11);
                    sb3.append(' ');
                    sb3.append(BuildConfig.FLAVOR);
                    Log.println(3, str, sb3.toString());
                }
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = new SentryAndroidOptions();
        ExtensionsKt.setConfig(sentryAndroidOptions2, env, config);
        hub = new G(sentryAndroidOptions2);
        L g10 = Y0.g();
        Intrinsics.checkNotNullExpressionValue(g10, "cloneMainHub()");
        clientHub = g10;
        if (g10 == null) {
            Intrinsics.v("clientHub");
            g10 = null;
        }
        SentryAndroidOptions sentryAndroidOptions3 = (SentryAndroidOptions) g10.D();
        clientHubSentryAndroidOptions = sentryAndroidOptions3;
        if (sentryAndroidOptions3 == null) {
            Intrinsics.v("clientHubSentryAndroidOptions");
            sentryAndroidOptions3 = null;
        }
        clientHubScreenshotConfig = sentryAndroidOptions3.isAttachScreenshot();
        SentryAndroidOptions sentryAndroidOptions4 = clientHubSentryAndroidOptions;
        if (sentryAndroidOptions4 == null) {
            Intrinsics.v("clientHubSentryAndroidOptions");
        } else {
            sentryAndroidOptions = sentryAndroidOptions4;
        }
        clientHubDeduplicationConfig = sentryAndroidOptions.isEnableDeduplication();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: co.hyperverge.crashguard.utils.b
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                HVSentryHub.m3initialiseSentryHub$lambda2(CrashguardConfig.this, thread, th2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initialiseSentryHub$lambda-2, reason: not valid java name */
    public static final void m3initialiseSentryHub$lambda2(CrashguardConfig config, Thread thread, Throwable e10) {
        Intrinsics.checkNotNullParameter(config, "$config");
        Intrinsics.checkNotNullExpressionValue(e10, "e");
        if (ExtensionsKt.shouldReportCrash(e10, config.getFilters())) {
            INSTANCE.pushUncaughtException(e10);
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUEH;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, e10);
    }

    private final void pushUncaughtException(Throwable e10) {
        String className;
        Object b10;
        String className2;
        Object invoke;
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        if (L02 == null && (L02 = HVSentryHub.class.getCanonicalName()) == null) {
            L02 = "N/A";
        }
        Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(L02);
        if (matcher.find()) {
            L02 = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
        }
        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L02 = L02.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L02);
        sb2.append(" - ");
        String m10 = Intrinsics.m("pushUncaughtException() called with: e = ", e10);
        if (m10 == null) {
            m10 = "null ";
        }
        sb2.append(m10);
        sb2.append(' ');
        sb2.append(BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        if (!LogExtsKt.isRelease()) {
            try {
                o.a aVar = o.f37128b;
                invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            } catch (Throwable th) {
                o.a aVar2 = o.f37128b;
                b10 = o.b(p.a(th));
            }
            if (invoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            b10 = o.b(((Application) invoke).getPackageName());
            if (o.f(b10)) {
                b10 = BuildConfig.FLAVOR;
            }
            String packageName = (String) b10;
            if (LogExtsKt.isDebug()) {
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                    StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                    String L03 = (stackTraceElement2 == null || (className2 = stackTraceElement2.getClassName()) == null) ? null : StringsKt.L0(className2, '.', null, 2, null);
                    String str = (L03 == null && (L03 = HVSentryHub.class.getCanonicalName()) == null) ? "N/A" : L03;
                    Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str);
                    if (matcher2.find()) {
                        str = matcher2.replaceAll(BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
                    }
                    if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        str = str.substring(0, 23);
                        Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    StringBuilder sb3 = new StringBuilder();
                    String m11 = Intrinsics.m("pushUncaughtException() called with: e = ", e10);
                    if (m11 == null) {
                        m11 = "null ";
                    }
                    sb3.append(m11);
                    sb3.append(' ');
                    sb3.append(BuildConfig.FLAVOR);
                    Log.println(3, str, sb3.toString());
                }
            }
        }
        AbstractC0889j.b(null, new HVSentryHub$pushUncaughtException$2(e10, null), 1, null);
        throw new e();
    }

    public final void init(String env, CrashguardConfig config) {
        String className;
        Object b10;
        String className2;
        Object invoke;
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(config, "config");
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        String str = "N/A";
        if (L02 == null && (L02 = HVSentryHub.class.getCanonicalName()) == null) {
            L02 = "N/A";
        }
        Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(L02);
        if (matcher.find()) {
            L02 = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
        }
        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L02 = L02.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L02);
        sb2.append(" - ");
        String m10 = Intrinsics.m("init() called with: config = ", config);
        if (m10 == null) {
            m10 = "null ";
        }
        sb2.append(m10);
        sb2.append(' ');
        sb2.append(BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        if (!LogExtsKt.isRelease()) {
            try {
                o.a aVar = o.f37128b;
                invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            } catch (Throwable th) {
                o.a aVar2 = o.f37128b;
                b10 = o.b(p.a(th));
            }
            if (invoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            b10 = o.b(((Application) invoke).getPackageName());
            if (o.f(b10)) {
                b10 = BuildConfig.FLAVOR;
            }
            String packageName = (String) b10;
            if (LogExtsKt.isDebug()) {
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                    StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                    String L03 = (stackTraceElement2 == null || (className2 = stackTraceElement2.getClassName()) == null) ? null : StringsKt.L0(className2, '.', null, 2, null);
                    if (L03 == null) {
                        String canonicalName = HVSentryHub.class.getCanonicalName();
                        if (canonicalName != null) {
                            str = canonicalName;
                        }
                    } else {
                        str = L03;
                    }
                    Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str);
                    if (matcher2.find()) {
                        str = matcher2.replaceAll(BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
                    }
                    if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        str = str.substring(0, 23);
                        Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    StringBuilder sb3 = new StringBuilder();
                    String m11 = Intrinsics.m("init() called with: config = ", config);
                    if (m11 == null) {
                        m11 = "null ";
                    }
                    sb3.append(m11);
                    sb3.append(' ');
                    sb3.append(BuildConfig.FLAVOR);
                    Log.println(3, str, sb3.toString());
                }
            }
        }
        initialiseSentryHub(env, config);
    }
}
