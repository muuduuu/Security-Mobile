package co.hyperverge.crashguard;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import co.hyperverge.crashguard.CrashGuard;
import co.hyperverge.crashguard.objects.CrashguardConfig;
import co.hyperverge.crashguard.utils.ExtensionsKt;
import co.hyperverge.crashguard.utils.HVSentryHub;
import co.hyperverge.crashguard.utils.LogExtsKt;
import co.hyperverge.hyperlogger.HyperLogger;
import io.sentry.P1;
import io.sentry.Y0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.k0;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.o;
import lc.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007J\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lco/hyperverge/crashguard/CrashGuard;", org.conscrypt.BuildConfig.FLAVOR, "()V", "crashguardConfig", "Lco/hyperverge/crashguard/objects/CrashguardConfig;", "isInitialized", org.conscrypt.BuildConfig.FLAVOR, "endSession", org.conscrypt.BuildConfig.FLAVOR, "init", "context", "Landroid/content/Context;", "startSession", "Companion", "crashguard_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CrashGuard {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static CrashGuard INSTANCE;
    private CrashguardConfig crashguardConfig;
    private boolean isInitialized;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lco/hyperverge/crashguard/CrashGuard$Companion;", org.conscrypt.BuildConfig.FLAVOR, "()V", "INSTANCE", "Lco/hyperverge/crashguard/CrashGuard;", "getInstance", "crashguard_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CrashGuard getInstance() {
            CrashGuard crashGuard = CrashGuard.INSTANCE;
            if (crashGuard != null) {
                return crashGuard;
            }
            CrashGuard crashGuard2 = new CrashGuard(null);
            CrashGuard.INSTANCE = crashGuard2;
            return crashGuard2;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CrashGuard(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final CrashGuard getInstance() {
        return INSTANCE.getInstance();
    }

    public static /* synthetic */ void init$default(CrashGuard crashGuard, Context context, CrashguardConfig crashguardConfig, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            crashguardConfig = new CrashguardConfig(null, null, null, 7, null);
        }
        crashGuard.init(context, crashguardConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-5, reason: not valid java name */
    public static final void m1init$lambda5(String env, CrashguardConfig crashguardConfig, SentryAndroidOptions it) {
        Intrinsics.checkNotNullParameter(env, "$env");
        Intrinsics.checkNotNullParameter(crashguardConfig, "$crashguardConfig");
        Intrinsics.checkNotNullParameter(it, "it");
        ExtensionsKt.setConfig(it, env, crashguardConfig);
    }

    public final void endSession() {
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
        String str = null;
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        String str2 = "N/A";
        if (L02 == null && (L02 = CrashGuard.class.getCanonicalName()) == null) {
            L02 = "N/A";
        }
        Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(L02);
        if (matcher.find()) {
            L02 = matcher.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
        }
        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L02 = L02.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L02);
        sb2.append(" - ");
        sb2.append("endSession() called");
        sb2.append(' ');
        sb2.append(org.conscrypt.BuildConfig.FLAVOR);
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
                b10 = org.conscrypt.BuildConfig.FLAVOR;
            }
            String packageName = (String) b10;
            if (LogExtsKt.isDebug()) {
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                    StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                    if (stackTraceElement2 != null && (className2 = stackTraceElement2.getClassName()) != null) {
                        str = StringsKt.L0(className2, '.', null, 2, null);
                    }
                    if (str == null) {
                        String canonicalName = CrashGuard.class.getCanonicalName();
                        if (canonicalName != null) {
                            str2 = canonicalName;
                        }
                    } else {
                        str2 = str;
                    }
                    Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str2);
                    if (matcher2.find()) {
                        str2 = matcher2.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullExpressionValue(str2, "replaceAll(\"\")");
                    }
                    if (str2.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        str2 = str2.substring(0, 23);
                        Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    Log.println(3, str2, "endSession() called " + org.conscrypt.BuildConfig.FLAVOR);
                }
            }
        }
        if (this.isInitialized) {
            Y0.m().J();
        }
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        init$default(this, context, null, 2, null);
    }

    public final void startSession() {
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
        String str = null;
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        String str2 = "N/A";
        if (L02 == null && (L02 = CrashGuard.class.getCanonicalName()) == null) {
            L02 = "N/A";
        }
        Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(L02);
        if (matcher.find()) {
            L02 = matcher.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
        }
        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L02 = L02.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L02);
        sb2.append(" - ");
        sb2.append("startSession() called");
        sb2.append(' ');
        sb2.append(org.conscrypt.BuildConfig.FLAVOR);
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
                b10 = org.conscrypt.BuildConfig.FLAVOR;
            }
            String packageName = (String) b10;
            if (LogExtsKt.isDebug()) {
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                    StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                    if (stackTraceElement2 != null && (className2 = stackTraceElement2.getClassName()) != null) {
                        str = StringsKt.L0(className2, '.', null, 2, null);
                    }
                    if (str == null) {
                        String canonicalName = CrashGuard.class.getCanonicalName();
                        if (canonicalName != null) {
                            str2 = canonicalName;
                        }
                    } else {
                        str2 = str;
                    }
                    Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str2);
                    if (matcher2.find()) {
                        str2 = matcher2.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullExpressionValue(str2, "replaceAll(\"\")");
                    }
                    if (str2.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        str2 = str2.substring(0, 23);
                        Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    Log.println(3, str2, "startSession() called " + org.conscrypt.BuildConfig.FLAVOR);
                }
            }
        }
        if (this.isInitialized) {
            Y0.m().L();
        }
    }

    private CrashGuard() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void init(Context context, final CrashguardConfig crashguardConfig) {
        String className;
        Object b10;
        String str;
        String str2;
        String className2;
        Object invoke;
        String className3;
        String str3;
        CharSequence charSequence;
        String str4;
        String L02;
        Object b11;
        String className4;
        String str5;
        Object invoke2;
        String className5;
        Object b12;
        String className6;
        String str6;
        Object invoke3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(crashguardConfig, "crashguardConfig");
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        String L03 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        if (L03 == null && (L03 = CrashGuard.class.getCanonicalName()) == null) {
            L03 = "N/A";
        }
        Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(L03);
        if (matcher.find()) {
            L03 = matcher.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L03, "replaceAll(\"\")");
        }
        Unit unit = Unit.f36324a;
        if (L03.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L03 = L03.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L03, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L03);
        sb2.append(" - ");
        String m10 = Intrinsics.m("init() called with: crashguardConfig = ", crashguardConfig);
        if (m10 == null) {
            m10 = "null ";
        }
        sb2.append(m10);
        sb2.append(' ');
        sb2.append(org.conscrypt.BuildConfig.FLAVOR);
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
                b10 = org.conscrypt.BuildConfig.FLAVOR;
            }
            String packageName = (String) b10;
            if (LogExtsKt.isDebug()) {
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                str = "packageName";
                str2 = "null cannot be cast to non-null type android.app.Application";
                if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                    StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                    String L04 = (stackTraceElement2 == null || (className2 = stackTraceElement2.getClassName()) == null) ? null : StringsKt.L0(className2, '.', null, 2, null);
                    if (L04 == null && (L04 = CrashGuard.class.getCanonicalName()) == null) {
                        L04 = "N/A";
                    }
                    Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(L04);
                    if (matcher2.find()) {
                        L04 = matcher2.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullExpressionValue(L04, "replaceAll(\"\")");
                    }
                    Unit unit2 = Unit.f36324a;
                    if (L04.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        L04 = L04.substring(0, 23);
                        Intrinsics.checkNotNullExpressionValue(L04, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    StringBuilder sb3 = new StringBuilder();
                    String m11 = Intrinsics.m("init() called with: crashguardConfig = ", crashguardConfig);
                    if (m11 == null) {
                        m11 = "null ";
                    }
                    sb3.append(m11);
                    sb3.append(' ');
                    sb3.append(org.conscrypt.BuildConfig.FLAVOR);
                    Log.println(3, L04, sb3.toString());
                }
                if (!this.isInitialized) {
                    HyperLogger.Level level2 = HyperLogger.Level.DEBUG;
                    HyperLogger companion2 = HyperLogger.INSTANCE.getInstance();
                    StringBuilder sb4 = new StringBuilder();
                    StackTraceElement[] stackTrace3 = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace3, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement3 = (StackTraceElement) AbstractC3574i.A(stackTrace3);
                    String L05 = (stackTraceElement3 == null || (className5 = stackTraceElement3.getClassName()) == null) ? null : StringsKt.L0(className5, '.', null, 2, null);
                    if (L05 == null && (L05 = CrashGuard.class.getCanonicalName()) == null) {
                        L05 = "N/A";
                    }
                    Matcher matcher3 = LogExtsKt.ANON_CLASS_PATTERN.matcher(L05);
                    if (matcher3.find()) {
                        L05 = matcher3.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullExpressionValue(L05, "replaceAll(\"\")");
                    }
                    Unit unit3 = Unit.f36324a;
                    if (L05.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        L05 = L05.substring(0, 23);
                        Intrinsics.checkNotNullExpressionValue(L05, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    sb4.append(L05);
                    sb4.append(" - ");
                    sb4.append("Already initialized.");
                    sb4.append(' ');
                    sb4.append(org.conscrypt.BuildConfig.FLAVOR);
                    companion2.log(level2, sb4.toString());
                    if (LogExtsKt.isRelease()) {
                        return;
                    }
                    try {
                        o.a aVar3 = o.f37128b;
                        invoke3 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                    } catch (Throwable th2) {
                        o.a aVar4 = o.f37128b;
                        b12 = o.b(p.a(th2));
                    }
                    if (invoke3 == null) {
                        throw new NullPointerException(str2);
                    }
                    b12 = o.b(((Application) invoke3).getPackageName());
                    if (o.f(b12)) {
                        b12 = org.conscrypt.BuildConfig.FLAVOR;
                    }
                    String str7 = (String) b12;
                    if (LogExtsKt.isDebug()) {
                        Intrinsics.checkNotNullExpressionValue(str7, str);
                        if (StringsKt.K(str7, "co.hyperverge", false, 2, null)) {
                            StackTraceElement[] stackTrace4 = new Throwable().getStackTrace();
                            Intrinsics.checkNotNullExpressionValue(stackTrace4, "Throwable().stackTrace");
                            StackTraceElement stackTraceElement4 = (StackTraceElement) AbstractC3574i.A(stackTrace4);
                            String L06 = (stackTraceElement4 == null || (className6 = stackTraceElement4.getClassName()) == null) ? null : StringsKt.L0(className6, '.', null, 2, null);
                            if (L06 == null) {
                                String canonicalName = CrashGuard.class.getCanonicalName();
                                str6 = canonicalName == null ? "N/A" : canonicalName;
                            } else {
                                str6 = L06;
                            }
                            Matcher matcher4 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str6);
                            if (matcher4.find()) {
                                str6 = matcher4.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                                Intrinsics.checkNotNullExpressionValue(str6, "replaceAll(\"\")");
                            }
                            Unit unit4 = Unit.f36324a;
                            if (str6.length() > 23 && Build.VERSION.SDK_INT < 26) {
                                str6 = str6.substring(0, 23);
                                Intrinsics.checkNotNullExpressionValue(str6, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            Log.println(3, str6, "Already initialized. " + org.conscrypt.BuildConfig.FLAVOR);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String str8 = str;
                String str9 = str2;
                this.crashguardConfig = crashguardConfig;
                if (crashguardConfig.getShouldReportCrashes()) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                    String str10 = ExtensionsKt.isReleaseBuild(applicationContext) ? "release" : "debug";
                    if (Y0.q()) {
                        HVSentryHub.INSTANCE.init(str10, crashguardConfig);
                    } else {
                        HyperLogger.Level level3 = HyperLogger.Level.DEBUG;
                        HyperLogger companion3 = HyperLogger.INSTANCE.getInstance();
                        StringBuilder sb5 = new StringBuilder();
                        StackTraceElement[] stackTrace5 = new Throwable().getStackTrace();
                        Intrinsics.checkNotNullExpressionValue(stackTrace5, "Throwable().stackTrace");
                        StackTraceElement stackTraceElement5 = (StackTraceElement) AbstractC3574i.A(stackTrace5);
                        if (stackTraceElement5 == null || (className3 = stackTraceElement5.getClassName()) == null) {
                            str3 = str10;
                            charSequence = "co.hyperverge";
                            str4 = "Throwable().stackTrace";
                            L02 = null;
                        } else {
                            str3 = str10;
                            charSequence = "co.hyperverge";
                            str4 = "Throwable().stackTrace";
                            L02 = StringsKt.L0(className3, '.', null, 2, null);
                        }
                        if (L02 == null && (L02 = CrashGuard.class.getCanonicalName()) == null) {
                            L02 = "N/A";
                        }
                        Matcher matcher5 = LogExtsKt.ANON_CLASS_PATTERN.matcher(L02);
                        if (matcher5.find()) {
                            L02 = matcher5.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
                        }
                        Unit unit5 = Unit.f36324a;
                        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
                            L02 = L02.substring(0, 23);
                            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        }
                        sb5.append(L02);
                        sb5.append(" - ");
                        String str11 = "SentryAndroid init() called with: config = [" + crashguardConfig + ']';
                        if (str11 == null) {
                            str11 = "null ";
                        }
                        sb5.append(str11);
                        sb5.append(' ');
                        sb5.append(org.conscrypt.BuildConfig.FLAVOR);
                        companion3.log(level3, sb5.toString());
                        if (!LogExtsKt.isRelease()) {
                            try {
                                o.a aVar5 = o.f37128b;
                                invoke2 = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                            } catch (Throwable th3) {
                                o.a aVar6 = o.f37128b;
                                b11 = o.b(p.a(th3));
                            }
                            if (invoke2 == null) {
                                throw new NullPointerException(str9);
                            }
                            b11 = o.b(((Application) invoke2).getPackageName());
                            if (o.f(b11)) {
                                b11 = org.conscrypt.BuildConfig.FLAVOR;
                            }
                            String str12 = (String) b11;
                            if (LogExtsKt.isDebug()) {
                                Intrinsics.checkNotNullExpressionValue(str12, str8);
                                if (StringsKt.K(str12, charSequence, false, 2, null)) {
                                    StackTraceElement[] stackTrace6 = new Throwable().getStackTrace();
                                    Intrinsics.checkNotNullExpressionValue(stackTrace6, str4);
                                    StackTraceElement stackTraceElement6 = (StackTraceElement) AbstractC3574i.A(stackTrace6);
                                    String L07 = (stackTraceElement6 == null || (className4 = stackTraceElement6.getClassName()) == null) ? null : StringsKt.L0(className4, '.', null, 2, null);
                                    if (L07 == null) {
                                        String canonicalName2 = CrashGuard.class.getCanonicalName();
                                        str5 = canonicalName2 == null ? "N/A" : canonicalName2;
                                    } else {
                                        str5 = L07;
                                    }
                                    Matcher matcher6 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str5);
                                    if (matcher6.find()) {
                                        str5 = matcher6.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                                        Intrinsics.checkNotNullExpressionValue(str5, "replaceAll(\"\")");
                                    }
                                    Unit unit6 = Unit.f36324a;
                                    if (str5.length() > 23 && Build.VERSION.SDK_INT < 26) {
                                        str5 = str5.substring(0, 23);
                                        Intrinsics.checkNotNullExpressionValue(str5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    }
                                    StringBuilder sb6 = new StringBuilder();
                                    String str13 = "SentryAndroid init() called with: config = [" + crashguardConfig + ']';
                                    if (str13 == null) {
                                        str13 = "null ";
                                    }
                                    sb6.append(str13);
                                    sb6.append(' ');
                                    sb6.append(org.conscrypt.BuildConfig.FLAVOR);
                                    Log.println(3, str5, sb6.toString());
                                }
                            }
                        }
                        final String str14 = str3;
                        k0.f(context.getApplicationContext(), new Y0.a() { // from class: H1.a
                            @Override // io.sentry.Y0.a
                            public final void a(P1 p12) {
                                CrashGuard.m1init$lambda5(str14, crashguardConfig, (SentryAndroidOptions) p12);
                            }
                        });
                    }
                }
                this.isInitialized = true;
                return;
            }
        }
        str = "packageName";
        str2 = "null cannot be cast to non-null type android.app.Application";
        if (!this.isInitialized) {
        }
    }
}
