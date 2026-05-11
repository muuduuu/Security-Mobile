package co.hyperverge.encoder.utils.extensions;

import android.app.Application;
import android.os.Build;
import co.hyperverge.hyperlogger.HyperLogger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.o;
import lc.p;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u001a\"\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000eH\u0080\bø\u0001\u0000\u001a.\u0010\u000f\u001a\u00020\f*\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000eH\u0080\bø\u0001\u0000\u001a\"\u0010\u0012\u001a\u00020\f*\u0004\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000eH\u0080\bø\u0001\u0000\u001a3\u0010\u0013\u001a\u00020\f*\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u00042\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0082\b\u001a\"\u0010\u0015\u001a\u00020\f*\u0004\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000eH\u0080\bø\u0001\u0000\u001a.\u0010\u0016\u001a\u00020\f*\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000eH\u0080\bø\u0001\u0000\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u001b\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\b8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"ANON_CLASS_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "MAX_TAG_LENGTH", BuildConfig.FLAVOR, "NULL_VALUE", BuildConfig.FLAVOR, "tag", BuildConfig.FLAVOR, "getTag", "(Ljava/lang/Object;)Ljava/lang/String;", "d", BuildConfig.FLAVOR, "message", "Lkotlin/Function0;", "e", "t", BuildConfig.FLAVOR, "i", "log", "priority", "v", "w", "hv-bitmaps-to-video_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LogExtsKt {
    private static final Pattern ANON_CLASS_PATTERN = Pattern.compile("(\\$\\d+)+$");
    private static final int MAX_TAG_LENGTH = 23;
    private static final String NULL_VALUE = "null ";

    public static final void d(Object obj, Function0<String> message) {
        String str;
        String className;
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (str = StringsKt.L0(className, '.', null, 2, null)) == null) {
            String canonicalName = obj != null ? obj.getClass().getCanonicalName() : null;
            str = canonicalName == null ? "N/A" : canonicalName;
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(str);
        if (matcher.find()) {
            str = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
        }
        if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
            str = str.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb2.append(str);
        sb2.append(" - ");
        String str2 = (String) message.invoke();
        if (str2 == null) {
            str2 = NULL_VALUE;
        }
        sb2.append(str2);
        sb2.append(' ');
        sb2.append(BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
    }

    public static final void e(Object obj, Throwable th, Function0<String> message) {
        String canonicalName;
        String str;
        Object obj2;
        String className;
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.ERROR;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (canonicalName = StringsKt.L0(className, '.', null, 2, null)) == null) {
            canonicalName = obj != null ? obj.getClass().getCanonicalName() : null;
            if (canonicalName == null) {
                canonicalName = "N/A";
            }
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(canonicalName);
        boolean find = matcher.find();
        Object obj3 = BuildConfig.FLAVOR;
        if (find) {
            canonicalName = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "replaceAll(\"\")");
        }
        if (canonicalName.length() > 23 && Build.VERSION.SDK_INT < 26) {
            canonicalName = canonicalName.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb2.append(canonicalName);
        sb2.append(" - ");
        String str2 = (String) message.invoke();
        if (str2 == null) {
            str2 = NULL_VALUE;
        }
        sb2.append(str2);
        sb2.append(' ');
        String localizedMessage = th != null ? th.getLocalizedMessage() : null;
        if (localizedMessage != null) {
            str = '\n' + localizedMessage;
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb2.append(str);
        companion.log(level, sb2.toString());
        try {
            o.a aVar = o.f37128b;
            Object invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            Intrinsics.e(invoke, "null cannot be cast to non-null type android.app.Application");
            obj2 = o.b(((Application) invoke).getPackageName());
        } catch (Throwable th2) {
            o.a aVar2 = o.f37128b;
            obj2 = o.b(p.a(th2));
        }
        if (!o.f(obj2)) {
            obj3 = obj2;
        }
    }

    public static /* synthetic */ void e$default(Object obj, Throwable th, Function0 message, int i10, Object obj2) {
        String canonicalName;
        String str;
        Object obj3;
        String className;
        if ((i10 & 1) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.ERROR;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (canonicalName = StringsKt.L0(className, '.', null, 2, null)) == null) {
            canonicalName = obj != null ? obj.getClass().getCanonicalName() : null;
            if (canonicalName == null) {
                canonicalName = "N/A";
            }
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(canonicalName);
        boolean find = matcher.find();
        Object obj4 = BuildConfig.FLAVOR;
        if (find) {
            canonicalName = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "replaceAll(\"\")");
        }
        if (canonicalName.length() > 23 && Build.VERSION.SDK_INT < 26) {
            canonicalName = canonicalName.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb2.append(canonicalName);
        sb2.append(" - ");
        String str2 = (String) message.invoke();
        if (str2 == null) {
            str2 = NULL_VALUE;
        }
        sb2.append(str2);
        sb2.append(' ');
        String localizedMessage = th != null ? th.getLocalizedMessage() : null;
        if (localizedMessage != null) {
            str = '\n' + localizedMessage;
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb2.append(str);
        companion.log(level, sb2.toString());
        try {
            o.a aVar = o.f37128b;
            Object invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            Intrinsics.e(invoke, "null cannot be cast to non-null type android.app.Application");
            obj3 = o.b(((Application) invoke).getPackageName());
        } catch (Throwable th2) {
            o.a aVar2 = o.f37128b;
            obj3 = o.b(p.a(th2));
        }
        if (!o.f(obj3)) {
            obj4 = obj3;
        }
    }

    private static final String getTag(Object obj) {
        String str;
        String className;
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (str = StringsKt.L0(className, '.', null, 2, null)) == null) {
            String canonicalName = obj != null ? obj.getClass().getCanonicalName() : null;
            str = canonicalName == null ? "N/A" : canonicalName;
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
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void i(Object obj, Function0<String> message) {
        String str;
        String className;
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (str = StringsKt.L0(className, '.', null, 2, null)) == null) {
            String canonicalName = obj != null ? obj.getClass().getCanonicalName() : null;
            str = canonicalName == null ? "N/A" : canonicalName;
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(str);
        if (matcher.find()) {
            str = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
        }
        if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
            str = str.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb2.append(str);
        sb2.append(" - ");
        String str2 = (String) message.invoke();
        if (str2 == null) {
            str2 = NULL_VALUE;
        }
        sb2.append(str2);
        sb2.append(' ');
        sb2.append(BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
    }

    private static final void log(Object obj, int i10, Function0<String> function0, Throwable th) {
        String canonicalName;
        String str;
        Object obj2;
        String className;
        HyperLogger.Level level = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? HyperLogger.Level.DEBUG : HyperLogger.Level.ERROR;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (canonicalName = StringsKt.L0(className, '.', null, 2, null)) == null) {
            canonicalName = obj != null ? obj.getClass().getCanonicalName() : null;
            if (canonicalName == null) {
                canonicalName = "N/A";
            }
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(canonicalName);
        boolean find = matcher.find();
        Object obj3 = BuildConfig.FLAVOR;
        if (find) {
            canonicalName = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "replaceAll(\"\")");
        }
        if (canonicalName.length() > 23 && Build.VERSION.SDK_INT < 26) {
            canonicalName = canonicalName.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb2.append(canonicalName);
        sb2.append(" - ");
        String str2 = (String) function0.invoke();
        if (str2 == null) {
            str2 = NULL_VALUE;
        }
        sb2.append(str2);
        sb2.append(' ');
        String localizedMessage = th != null ? th.getLocalizedMessage() : null;
        if (localizedMessage != null) {
            str = '\n' + localizedMessage;
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb2.append(str);
        companion.log(level, sb2.toString());
        if (i10 < 6) {
            return;
        }
        try {
            o.a aVar = o.f37128b;
            Object invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            Intrinsics.e(invoke, "null cannot be cast to non-null type android.app.Application");
            obj2 = o.b(((Application) invoke).getPackageName());
        } catch (Throwable th2) {
            o.a aVar2 = o.f37128b;
            obj2 = o.b(p.a(th2));
        }
        if (!o.f(obj2)) {
            obj3 = obj2;
        }
    }

    static /* synthetic */ void log$default(Object obj, int i10, Function0 function0, Throwable th, int i11, Object obj2) {
        String canonicalName;
        String str;
        Object obj3;
        String className;
        if ((i11 & 4) != 0) {
            th = null;
        }
        HyperLogger.Level level = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? HyperLogger.Level.DEBUG : HyperLogger.Level.ERROR;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (canonicalName = StringsKt.L0(className, '.', null, 2, null)) == null) {
            canonicalName = obj != null ? obj.getClass().getCanonicalName() : null;
            if (canonicalName == null) {
                canonicalName = "N/A";
            }
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(canonicalName);
        boolean find = matcher.find();
        Object obj4 = BuildConfig.FLAVOR;
        if (find) {
            canonicalName = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "replaceAll(\"\")");
        }
        if (canonicalName.length() > 23 && Build.VERSION.SDK_INT < 26) {
            canonicalName = canonicalName.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb2.append(canonicalName);
        sb2.append(" - ");
        String str2 = (String) function0.invoke();
        if (str2 == null) {
            str2 = NULL_VALUE;
        }
        sb2.append(str2);
        sb2.append(' ');
        String localizedMessage = th != null ? th.getLocalizedMessage() : null;
        if (localizedMessage != null) {
            str = '\n' + localizedMessage;
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb2.append(str);
        companion.log(level, sb2.toString());
        if (i10 < 6) {
            return;
        }
        try {
            o.a aVar = o.f37128b;
            Object invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            Intrinsics.e(invoke, "null cannot be cast to non-null type android.app.Application");
            obj3 = o.b(((Application) invoke).getPackageName());
        } catch (Throwable th2) {
            o.a aVar2 = o.f37128b;
            obj3 = o.b(p.a(th2));
        }
        if (!o.f(obj3)) {
            obj4 = obj3;
        }
    }

    public static final void v(Object obj, Function0<String> message) {
        String str;
        String className;
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (str = StringsKt.L0(className, '.', null, 2, null)) == null) {
            String canonicalName = obj != null ? obj.getClass().getCanonicalName() : null;
            str = canonicalName == null ? "N/A" : canonicalName;
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(str);
        if (matcher.find()) {
            str = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(str, "replaceAll(\"\")");
        }
        if (str.length() > 23 && Build.VERSION.SDK_INT < 26) {
            str = str.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb2.append(str);
        sb2.append(" - ");
        String str2 = (String) message.invoke();
        if (str2 == null) {
            str2 = NULL_VALUE;
        }
        sb2.append(str2);
        sb2.append(' ');
        sb2.append(BuildConfig.FLAVOR);
        companion.log(level, sb2.toString());
    }

    public static final void w(Object obj, Throwable th, Function0<String> message) {
        String canonicalName;
        String className;
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (canonicalName = StringsKt.L0(className, '.', null, 2, null)) == null) {
            canonicalName = obj != null ? obj.getClass().getCanonicalName() : null;
            if (canonicalName == null) {
                canonicalName = "N/A";
            }
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(canonicalName);
        boolean find = matcher.find();
        String str = BuildConfig.FLAVOR;
        if (find) {
            canonicalName = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "replaceAll(\"\")");
        }
        if (canonicalName.length() > 23 && Build.VERSION.SDK_INT < 26) {
            canonicalName = canonicalName.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb2.append(canonicalName);
        sb2.append(" - ");
        String str2 = (String) message.invoke();
        if (str2 == null) {
            str2 = NULL_VALUE;
        }
        sb2.append(str2);
        sb2.append(' ');
        String localizedMessage = th != null ? th.getLocalizedMessage() : null;
        if (localizedMessage != null) {
            str = '\n' + localizedMessage;
        }
        sb2.append(str);
        companion.log(level, sb2.toString());
    }

    public static /* synthetic */ void w$default(Object obj, Throwable th, Function0 message, int i10, Object obj2) {
        String canonicalName;
        String className;
        if ((i10 & 1) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(message, "message");
        HyperLogger.Level level = HyperLogger.Level.DEBUG;
        HyperLogger companion = HyperLogger.INSTANCE.getInstance();
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
        if (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (canonicalName = StringsKt.L0(className, '.', null, 2, null)) == null) {
            canonicalName = obj != null ? obj.getClass().getCanonicalName() : null;
            if (canonicalName == null) {
                canonicalName = "N/A";
            }
        }
        Matcher matcher = ANON_CLASS_PATTERN.matcher(canonicalName);
        boolean find = matcher.find();
        String str = BuildConfig.FLAVOR;
        if (find) {
            canonicalName = matcher.replaceAll(BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "replaceAll(\"\")");
        }
        if (canonicalName.length() > 23 && Build.VERSION.SDK_INT < 26) {
            canonicalName = canonicalName.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb2.append(canonicalName);
        sb2.append(" - ");
        String str2 = (String) message.invoke();
        if (str2 == null) {
            str2 = NULL_VALUE;
        }
        sb2.append(str2);
        sb2.append(' ');
        String localizedMessage = th != null ? th.getLocalizedMessage() : null;
        if (localizedMessage != null) {
            str = '\n' + localizedMessage;
        }
        sb2.append(str);
        companion.log(level, sb2.toString());
    }
}
