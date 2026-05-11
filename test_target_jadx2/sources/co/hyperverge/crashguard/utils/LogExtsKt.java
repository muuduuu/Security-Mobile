package co.hyperverge.crashguard.utils;

import android.app.Application;
import android.os.Build;
import android.util.Log;
import co.hyperverge.hyperlogger.HyperLogger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.i;
import lc.o;
import lc.p;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u001a\"\u0010\u0012\u001a\u00020\u0013*\u0004\u0018\u00010\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0015H\u0080\bø\u0001\u0000\u001a.\u0010\u0016\u001a\u00020\u0013*\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0015H\u0080\bø\u0001\u0000\u001a\"\u0010\u0019\u001a\u00020\u0013*\u0004\u0018\u00010\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0015H\u0080\bø\u0001\u0000\u001a3\u0010\u001a\u001a\u00020\u0013*\u0004\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\u00042\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0082\b\u001a\"\u0010\u001c\u001a\u00020\u0013*\u0004\u0018\u00010\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0015H\u0080\bø\u0001\u0000\u001a.\u0010\u001d\u001a\u00020\u0013*\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0015H\u0080\bø\u0001\u0000\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u001b\u0010\u0007\u001a\u00020\b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\t\"\u001b\u0010\f\u001a\u00020\b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\f\u0010\t\"\u001b\u0010\u000e\u001a\u00020\u0006*\u0004\u0018\u00010\u000f8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"ANON_CLASS_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "MAX_TAG_LENGTH", BuildConfig.FLAVOR, "NULL_VALUE", BuildConfig.FLAVOR, "isDebug", BuildConfig.FLAVOR, "()Z", "isDebug$delegate", "Lkotlin/Lazy;", "isRelease", "isRelease$delegate", "tag", BuildConfig.FLAVOR, "getTag", "(Ljava/lang/Object;)Ljava/lang/String;", "d", BuildConfig.FLAVOR, "message", "Lkotlin/Function0;", "e", "t", BuildConfig.FLAVOR, "i", "log", "priority", "v", "w", "crashguard_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LogExtsKt {
    private static final int MAX_TAG_LENGTH = 23;
    private static final String NULL_VALUE = "null ";
    private static final Pattern ANON_CLASS_PATTERN = Pattern.compile("(\\$\\d+)+$");
    private static final Lazy isDebug$delegate = i.a(LogExtsKt$isDebug$2.INSTANCE);
    private static final Lazy isRelease$delegate = i.a(LogExtsKt$isRelease$2.INSTANCE);

    public static final void d(Object obj, Function0<String> message) {
        String className;
        Object b10;
        String canonicalName;
        String className2;
        Object invoke;
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        String str = null;
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        String str2 = "N/A";
        if (L02 == null && (obj == null || (L02 = obj.getClass().getCanonicalName()) == null)) {
            L02 = "N/A";
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(L02);
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
        String str3 = (String) message.invoke();
        String str4 = NULL_VALUE;
        if (str3 == null) {
            str3 = NULL_VALUE;
        }
        sb2.append(str3);
        sb2.append(' ');
        sb2.append(BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        if (isRelease()) {
            return;
        }
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
        if (isDebug()) {
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                if (stackTraceElement2 != null && (className2 = stackTraceElement2.getClassName()) != null) {
                    str = StringsKt.L0(className2, '.', null, 2, null);
                }
                if (str != null) {
                    str2 = str;
                } else if (obj != null && (canonicalName = obj.getClass().getCanonicalName()) != null) {
                    str2 = canonicalName;
                }
                Matcher matcher2 = ANON_CLASS_PATTERN.matcher(str2);
                if (matcher2.find()) {
                    str2 = matcher2.replaceAll(BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullExpressionValue(str2, "replaceAll(\"\")");
                }
                if (str2.length() > 23 && Build.VERSION.SDK_INT < 26) {
                    str2 = str2.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                StringBuilder sb3 = new StringBuilder();
                String str5 = (String) message.invoke();
                if (str5 != null) {
                    str4 = str5;
                }
                sb3.append(str4);
                sb3.append(' ');
                sb3.append(BuildConfig.FLAVOR);
                Log.println(3, str2, sb3.toString());
            }
        }
    }

    public static final void e(Object obj, Throwable th, Function0<String> message) {
        String className;
        Object b10;
        String className2;
        Object invoke;
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.ERROR;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        String str = "N/A";
        if (L02 == null && (obj == null || (L02 = obj.getClass().getCanonicalName()) == null)) {
            L02 = "N/A";
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(L02);
        boolean find = matcher.find();
        String str2 = BuildConfig.FLAVOR;
        if (find) {
            L02 = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
        }
        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L02 = L02.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L02);
        sb2.append(" - ");
        String str3 = (String) message.invoke();
        String str4 = NULL_VALUE;
        if (str3 == null) {
            str3 = NULL_VALUE;
        }
        sb2.append(str3);
        sb2.append(' ');
        String localizedMessage = th == null ? null : th.getLocalizedMessage();
        sb2.append(localizedMessage != null ? Intrinsics.m("\n", localizedMessage) : BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        isRelease();
        try {
            o.a aVar = o.f37128b;
            invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
        } catch (Throwable th2) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th2));
        }
        if (invoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
        b10 = o.b(((Application) invoke).getPackageName());
        if (o.f(b10)) {
            b10 = BuildConfig.FLAVOR;
        }
        String packageName = (String) b10;
        if (isDebug()) {
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                String L03 = (stackTraceElement2 == null || (className2 = stackTraceElement2.getClassName()) == null) ? null : StringsKt.L0(className2, '.', null, 2, null);
                if (L03 != null || (obj != null && (L03 = obj.getClass().getCanonicalName()) != null)) {
                    str = L03;
                }
                Matcher matcher2 = ANON_CLASS_PATTERN.matcher(str);
                if (matcher2.find()) {
                    str = matcher2.replaceAll(BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
                }
                if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
                    str = str.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                StringBuilder sb3 = new StringBuilder();
                String str5 = (String) message.invoke();
                if (str5 != null) {
                    str4 = str5;
                }
                sb3.append(str4);
                sb3.append(' ');
                String localizedMessage2 = th != null ? th.getLocalizedMessage() : null;
                if (localizedMessage2 != null) {
                    str2 = Intrinsics.m("\n", localizedMessage2);
                }
                sb3.append(str2);
                Log.println(6, str, sb3.toString());
            }
        }
    }

    public static /* synthetic */ void e$default(Object obj, Throwable th, Function0 message, int i10, Object obj2) {
        String className;
        Object b10;
        String className2;
        Object invoke;
        Throwable th2 = (i10 & 1) != 0 ? null : th;
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.ERROR;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        String str = "N/A";
        if (L02 == null && (obj == null || (L02 = obj.getClass().getCanonicalName()) == null)) {
            L02 = "N/A";
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(L02);
        boolean find = matcher.find();
        String str2 = BuildConfig.FLAVOR;
        if (find) {
            L02 = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
        }
        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L02 = L02.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L02);
        sb2.append(" - ");
        String str3 = (String) message.invoke();
        String str4 = NULL_VALUE;
        if (str3 == null) {
            str3 = NULL_VALUE;
        }
        sb2.append(str3);
        sb2.append(' ');
        String localizedMessage = th2 == null ? null : th2.getLocalizedMessage();
        sb2.append(localizedMessage != null ? Intrinsics.m("\n", localizedMessage) : BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        isRelease();
        try {
            o.a aVar = o.f37128b;
            invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
        } catch (Throwable th3) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th3));
        }
        if (invoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
        b10 = o.b(((Application) invoke).getPackageName());
        if (o.f(b10)) {
            b10 = BuildConfig.FLAVOR;
        }
        String packageName = (String) b10;
        if (isDebug()) {
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                String L03 = (stackTraceElement2 == null || (className2 = stackTraceElement2.getClassName()) == null) ? null : StringsKt.L0(className2, '.', null, 2, null);
                if (L03 != null || (obj != null && (L03 = obj.getClass().getCanonicalName()) != null)) {
                    str = L03;
                }
                Matcher matcher2 = ANON_CLASS_PATTERN.matcher(str);
                if (matcher2.find()) {
                    str = matcher2.replaceAll(BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
                }
                if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
                    str = str.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                StringBuilder sb3 = new StringBuilder();
                String str5 = (String) message.invoke();
                if (str5 != null) {
                    str4 = str5;
                }
                sb3.append(str4);
                sb3.append(' ');
                String localizedMessage2 = th2 != null ? th2.getLocalizedMessage() : null;
                if (localizedMessage2 != null) {
                    str2 = Intrinsics.m("\n", localizedMessage2);
                }
                sb3.append(str2);
                Log.println(6, str, sb3.toString());
            }
        }
    }

    private static final String getTag(Object obj) {
        String canonicalName;
        String className;
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        String str = null;
        if (stackTraceElement != null && (className = stackTraceElement.getClassName()) != null) {
            str = StringsKt.L0(className, '.', null, 2, null);
        }
        if (str == null) {
            str = "N/A";
            if (obj != null && (canonicalName = obj.getClass().getCanonicalName()) != null) {
                str = canonicalName;
            }
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(str);
        if (matcher.find()) {
            str = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
        }
        if (str.length() <= 23 || Build.VERSION.SDK_INT >= 26) {
            return str;
        }
        String substring = str.substring(0, 23);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void i(Object obj, Function0<String> message) {
        String className;
        Object b10;
        String canonicalName;
        String className2;
        Object invoke;
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        String str = null;
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        String str2 = "N/A";
        if (L02 == null && (obj == null || (L02 = obj.getClass().getCanonicalName()) == null)) {
            L02 = "N/A";
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(L02);
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
        String str3 = (String) message.invoke();
        String str4 = NULL_VALUE;
        if (str3 == null) {
            str3 = NULL_VALUE;
        }
        sb2.append(str3);
        sb2.append(' ');
        sb2.append(BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        if (isRelease()) {
            return;
        }
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
        if (isDebug()) {
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                if (stackTraceElement2 != null && (className2 = stackTraceElement2.getClassName()) != null) {
                    str = StringsKt.L0(className2, '.', null, 2, null);
                }
                if (str != null) {
                    str2 = str;
                } else if (obj != null && (canonicalName = obj.getClass().getCanonicalName()) != null) {
                    str2 = canonicalName;
                }
                Matcher matcher2 = ANON_CLASS_PATTERN.matcher(str2);
                if (matcher2.find()) {
                    str2 = matcher2.replaceAll(BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullExpressionValue(str2, "replaceAll(\"\")");
                }
                if (str2.length() > 23 && Build.VERSION.SDK_INT < 26) {
                    str2 = str2.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                StringBuilder sb3 = new StringBuilder();
                String str5 = (String) message.invoke();
                if (str5 != null) {
                    str4 = str5;
                }
                sb3.append(str4);
                sb3.append(' ');
                sb3.append(BuildConfig.FLAVOR);
                Log.println(4, str2, sb3.toString());
            }
        }
    }

    public static final /* synthetic */ boolean isDebug() {
        return ((Boolean) isDebug$delegate.getValue()).booleanValue();
    }

    public static final /* synthetic */ boolean isRelease() {
        return ((Boolean) isRelease$delegate.getValue()).booleanValue();
    }

    private static final void log(Object obj, int i10, Function0<String> function0, Throwable th) {
        String className;
        Object b10;
        String className2;
        Object invoke;
        HyperLogger.Level level = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? HyperLogger.Level.DEBUG : HyperLogger.Level.ERROR;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        String str = "N/A";
        if (L02 == null && (obj == null || (L02 = obj.getClass().getCanonicalName()) == null)) {
            L02 = "N/A";
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(L02);
        boolean find = matcher.find();
        String str2 = BuildConfig.FLAVOR;
        if (find) {
            L02 = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
        }
        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L02 = L02.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L02);
        sb2.append(" - ");
        String str3 = (String) function0.invoke();
        String str4 = NULL_VALUE;
        if (str3 == null) {
            str3 = NULL_VALUE;
        }
        sb2.append(str3);
        sb2.append(' ');
        String localizedMessage = th == null ? null : th.getLocalizedMessage();
        sb2.append(localizedMessage != null ? Intrinsics.m("\n", localizedMessage) : BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        if (!isRelease() || i10 >= 6) {
            try {
                o.a aVar = o.f37128b;
                invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            } catch (Throwable th2) {
                o.a aVar2 = o.f37128b;
                b10 = o.b(p.a(th2));
            }
            if (invoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            b10 = o.b(((Application) invoke).getPackageName());
            if (o.f(b10)) {
                b10 = BuildConfig.FLAVOR;
            }
            String packageName = (String) b10;
            if (isDebug()) {
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                    StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                    String L03 = (stackTraceElement2 == null || (className2 = stackTraceElement2.getClassName()) == null) ? null : StringsKt.L0(className2, '.', null, 2, null);
                    if (L03 != null || (obj != null && (L03 = obj.getClass().getCanonicalName()) != null)) {
                        str = L03;
                    }
                    Matcher matcher2 = ANON_CLASS_PATTERN.matcher(str);
                    if (matcher2.find()) {
                        str = matcher2.replaceAll(BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
                    }
                    if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        str = str.substring(0, 23);
                        Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    StringBuilder sb3 = new StringBuilder();
                    String str5 = (String) function0.invoke();
                    if (str5 != null) {
                        str4 = str5;
                    }
                    sb3.append(str4);
                    sb3.append(' ');
                    String localizedMessage2 = th != null ? th.getLocalizedMessage() : null;
                    if (localizedMessage2 != null) {
                        str2 = Intrinsics.m("\n", localizedMessage2);
                    }
                    sb3.append(str2);
                    Log.println(i10, str, sb3.toString());
                }
            }
        }
    }

    static /* synthetic */ void log$default(Object obj, int i10, Function0 function0, Throwable th, int i11, Object obj2) {
        String className;
        Object b10;
        String className2;
        Object invoke;
        Throwable th2 = (i11 & 4) != 0 ? null : th;
        HyperLogger.Level level = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? HyperLogger.Level.DEBUG : HyperLogger.Level.ERROR;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        String str = "N/A";
        if (L02 == null && (obj == null || (L02 = obj.getClass().getCanonicalName()) == null)) {
            L02 = "N/A";
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(L02);
        boolean find = matcher.find();
        String str2 = BuildConfig.FLAVOR;
        if (find) {
            L02 = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
        }
        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L02 = L02.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L02);
        sb2.append(" - ");
        String str3 = (String) function0.invoke();
        String str4 = NULL_VALUE;
        if (str3 == null) {
            str3 = NULL_VALUE;
        }
        sb2.append(str3);
        sb2.append(' ');
        String localizedMessage = th2 == null ? null : th2.getLocalizedMessage();
        sb2.append(localizedMessage != null ? Intrinsics.m("\n", localizedMessage) : BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        if (!isRelease() || i10 >= 6) {
            try {
                o.a aVar = o.f37128b;
                invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            } catch (Throwable th3) {
                o.a aVar2 = o.f37128b;
                b10 = o.b(p.a(th3));
            }
            if (invoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            b10 = o.b(((Application) invoke).getPackageName());
            if (o.f(b10)) {
                b10 = BuildConfig.FLAVOR;
            }
            String packageName = (String) b10;
            if (isDebug()) {
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                    StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                    StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                    String L03 = (stackTraceElement2 == null || (className2 = stackTraceElement2.getClassName()) == null) ? null : StringsKt.L0(className2, '.', null, 2, null);
                    if (L03 != null || (obj != null && (L03 = obj.getClass().getCanonicalName()) != null)) {
                        str = L03;
                    }
                    Matcher matcher2 = ANON_CLASS_PATTERN.matcher(str);
                    if (matcher2.find()) {
                        str = matcher2.replaceAll(BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
                    }
                    if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
                        str = str.substring(0, 23);
                        Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    StringBuilder sb3 = new StringBuilder();
                    String str5 = (String) function0.invoke();
                    if (str5 != null) {
                        str4 = str5;
                    }
                    sb3.append(str4);
                    sb3.append(' ');
                    String localizedMessage2 = th2 != null ? th2.getLocalizedMessage() : null;
                    if (localizedMessage2 != null) {
                        str2 = Intrinsics.m("\n", localizedMessage2);
                    }
                    sb3.append(str2);
                    Log.println(i10, str, sb3.toString());
                }
            }
        }
    }

    public static final void v(Object obj, Function0<String> message) {
        String className;
        Object b10;
        String canonicalName;
        String className2;
        Object invoke;
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        String str = null;
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        String str2 = "N/A";
        if (L02 == null && (obj == null || (L02 = obj.getClass().getCanonicalName()) == null)) {
            L02 = "N/A";
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(L02);
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
        String str3 = (String) message.invoke();
        String str4 = NULL_VALUE;
        if (str3 == null) {
            str3 = NULL_VALUE;
        }
        sb2.append(str3);
        sb2.append(' ');
        sb2.append(BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        if (isRelease()) {
            return;
        }
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
        if (isDebug()) {
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                if (stackTraceElement2 != null && (className2 = stackTraceElement2.getClassName()) != null) {
                    str = StringsKt.L0(className2, '.', null, 2, null);
                }
                if (str != null) {
                    str2 = str;
                } else if (obj != null && (canonicalName = obj.getClass().getCanonicalName()) != null) {
                    str2 = canonicalName;
                }
                Matcher matcher2 = ANON_CLASS_PATTERN.matcher(str2);
                if (matcher2.find()) {
                    str2 = matcher2.replaceAll(BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullExpressionValue(str2, "replaceAll(\"\")");
                }
                if (str2.length() > 23 && Build.VERSION.SDK_INT < 26) {
                    str2 = str2.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                StringBuilder sb3 = new StringBuilder();
                String str5 = (String) message.invoke();
                if (str5 != null) {
                    str4 = str5;
                }
                sb3.append(str4);
                sb3.append(' ');
                sb3.append(BuildConfig.FLAVOR);
                Log.println(2, str2, sb3.toString());
            }
        }
    }

    public static final void w(Object obj, Throwable th, Function0<String> message) {
        String className;
        Object b10;
        String className2;
        Object invoke;
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        String str = "N/A";
        if (L02 == null && (obj == null || (L02 = obj.getClass().getCanonicalName()) == null)) {
            L02 = "N/A";
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(L02);
        boolean find = matcher.find();
        String str2 = BuildConfig.FLAVOR;
        if (find) {
            L02 = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
        }
        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L02 = L02.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L02);
        sb2.append(" - ");
        String str3 = (String) message.invoke();
        String str4 = NULL_VALUE;
        if (str3 == null) {
            str3 = NULL_VALUE;
        }
        sb2.append(str3);
        sb2.append(' ');
        String localizedMessage = th == null ? null : th.getLocalizedMessage();
        sb2.append(localizedMessage != null ? Intrinsics.m("\n", localizedMessage) : BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        if (isRelease()) {
            return;
        }
        try {
            o.a aVar = o.f37128b;
            invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
        } catch (Throwable th2) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th2));
        }
        if (invoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
        b10 = o.b(((Application) invoke).getPackageName());
        if (o.f(b10)) {
            b10 = BuildConfig.FLAVOR;
        }
        String packageName = (String) b10;
        if (isDebug()) {
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                String L03 = (stackTraceElement2 == null || (className2 = stackTraceElement2.getClassName()) == null) ? null : StringsKt.L0(className2, '.', null, 2, null);
                if (L03 != null || (obj != null && (L03 = obj.getClass().getCanonicalName()) != null)) {
                    str = L03;
                }
                Matcher matcher2 = ANON_CLASS_PATTERN.matcher(str);
                if (matcher2.find()) {
                    str = matcher2.replaceAll(BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
                }
                if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
                    str = str.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                StringBuilder sb3 = new StringBuilder();
                String str5 = (String) message.invoke();
                if (str5 != null) {
                    str4 = str5;
                }
                sb3.append(str4);
                sb3.append(' ');
                String localizedMessage2 = th != null ? th.getLocalizedMessage() : null;
                if (localizedMessage2 != null) {
                    str2 = Intrinsics.m("\n", localizedMessage2);
                }
                sb3.append(str2);
                Log.println(5, str, sb3.toString());
            }
        }
    }

    public static /* synthetic */ void w$default(Object obj, Throwable th, Function0 message, int i10, Object obj2) {
        String className;
        Object b10;
        String className2;
        Object invoke;
        Throwable th2 = (i10 & 1) != 0 ? null : th;
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
        String str = "N/A";
        if (L02 == null && (obj == null || (L02 = obj.getClass().getCanonicalName()) == null)) {
            L02 = "N/A";
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(L02);
        boolean find = matcher.find();
        String str2 = BuildConfig.FLAVOR;
        if (find) {
            L02 = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
        }
        if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
            L02 = L02.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        sb2.append(L02);
        sb2.append(" - ");
        String str3 = (String) message.invoke();
        String str4 = NULL_VALUE;
        if (str3 == null) {
            str3 = NULL_VALUE;
        }
        sb2.append(str3);
        sb2.append(' ');
        String localizedMessage = th2 == null ? null : th2.getLocalizedMessage();
        sb2.append(localizedMessage != null ? Intrinsics.m("\n", localizedMessage) : BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
        if (isRelease()) {
            return;
        }
        try {
            o.a aVar = o.f37128b;
            invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
        } catch (Throwable th3) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th3));
        }
        if (invoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
        b10 = o.b(((Application) invoke).getPackageName());
        if (o.f(b10)) {
            b10 = BuildConfig.FLAVOR;
        }
        String packageName = (String) b10;
        if (isDebug()) {
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            if (StringsKt.K(packageName, "co.hyperverge", false, 2, null)) {
                StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "Throwable().stackTrace");
                StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                String L03 = (stackTraceElement2 == null || (className2 = stackTraceElement2.getClassName()) == null) ? null : StringsKt.L0(className2, '.', null, 2, null);
                if (L03 != null || (obj != null && (L03 = obj.getClass().getCanonicalName()) != null)) {
                    str = L03;
                }
                Matcher matcher2 = ANON_CLASS_PATTERN.matcher(str);
                if (matcher2.find()) {
                    str = matcher2.replaceAll(BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
                }
                if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
                    str = str.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                StringBuilder sb3 = new StringBuilder();
                String str5 = (String) message.invoke();
                if (str5 != null) {
                    str4 = str5;
                }
                sb3.append(str4);
                sb3.append(' ');
                String localizedMessage2 = th2 != null ? th2.getLocalizedMessage() : null;
                if (localizedMessage2 != null) {
                    str2 = Intrinsics.m("\n", localizedMessage2);
                }
                sb3.append(str2);
                Log.println(5, str, sb3.toString());
            }
        }
    }
}
