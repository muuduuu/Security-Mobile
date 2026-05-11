package co.hyperverge.crashguard.utils;

import Jd.AbstractC0891k;
import Jd.N;
import Jd.V;
import android.app.Application;
import android.os.Build;
import android.util.Log;
import co.hyperverge.crashguard.utils.HVSentryHub$pushUncaughtException$2;
import co.hyperverge.hyperlogger.HyperLogger;
import io.sentry.A;
import io.sentry.C3396b;
import io.sentry.C3405e;
import io.sentry.G;
import io.sentry.L;
import io.sentry.O0;
import io.sentry.P0;
import io.sentry.protocol.r;
import java.io.File;
import java.util.Queue;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.e;
import lc.o;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.crashguard.utils.HVSentryHub$pushUncaughtException$2", f = "HVSentryHub.kt", l = {93}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)Ljava/lang/Void;"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class HVSentryHub$pushUncaughtException$2 extends l implements Function2<N, d<?>, Object> {
    final /* synthetic */ Throwable $e;
    private /* synthetic */ Object L$0;
    int label;

    @f(c = "co.hyperverge.crashguard.utils.HVSentryHub$pushUncaughtException$2$1", f = "HVSentryHub.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJd/N;", "Lio/sentry/protocol/r;", "Lorg/jetbrains/annotations/NotNull;", "<anonymous>", "(LJd/N;)Lio/sentry/protocol/r;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: co.hyperverge.crashguard.utils.HVSentryHub$pushUncaughtException$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements Function2<N, d<? super r>, Object> {
        final /* synthetic */ Throwable $e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Throwable th, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$e = th;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invokeSuspend$lambda-1, reason: not valid java name */
        public static final void m4invokeSuspend$lambda1(O0 o02) {
            G g10;
            Queue<C3405e> i10 = o02.i();
            Intrinsics.checkNotNullExpressionValue(i10, "it.breadcrumbs");
            for (C3405e c3405e : i10) {
                g10 = HVSentryHub.hub;
                if (g10 == null) {
                    Intrinsics.v("hub");
                    g10 = null;
                }
                g10.w(c3405e);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$e, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, d<? super r> dVar) {
            return ((AnonymousClass1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x03c7  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0227  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x041d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x043b  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x044a  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0467  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x055c  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0563  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0484 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            L l10;
            String str;
            String str2;
            String str3;
            String className;
            String str4;
            String L02;
            Object b10;
            String str5;
            CharSequence charSequence;
            String str6;
            String className2;
            Object invoke;
            G g10;
            AnonymousClass1 anonymousClass1;
            boolean z10;
            StackTraceElement stackTraceElement;
            String className3;
            String str7;
            CharSequence charSequence2;
            String L03;
            Matcher matcher;
            String m10;
            Object b11;
            String className4;
            L l11;
            String L04;
            String str8;
            Object invoke2;
            L l12;
            AnonymousClass1 anonymousClass12;
            L l13;
            String className5;
            String str9;
            String str10;
            String L05;
            Object b12;
            String str11;
            String className6;
            String L06;
            Object invoke3;
            G g11;
            AbstractC3868b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            N n10 = (N) this.L$0;
            l10 = HVSentryHub.clientHub;
            if (l10 == null) {
                Intrinsics.v("clientHub");
                l10 = null;
            }
            l10.E(new P0() { // from class: co.hyperverge.crashguard.utils.c
                @Override // io.sentry.P0
                public final void a(O0 o02) {
                    HVSentryHub$pushUncaughtException$2.AnonymousClass1.m4invokeSuspend$lambda1(o02);
                }
            });
            HVSentryHub.INSTANCE.enableScreenshotAttachment(true);
            HyperLogger.Companion companion = HyperLogger.INSTANCE;
            File currentLogZipFile = companion.getInstance().getCurrentLogZipFile();
            String path = currentLogZipFile == null ? null : currentLogZipFile.getPath();
            if (path != null) {
                CharSequence charSequence3 = "co.hyperverge";
                Throwable th = this.$e;
                HyperLogger.Level level = HyperLogger.Level.DEBUG;
                HyperLogger companion2 = companion.getInstance();
                StringBuilder sb2 = new StringBuilder();
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
                StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC3574i.A(stackTrace);
                if (stackTraceElement2 == null || (className5 = stackTraceElement2.getClassName()) == null) {
                    str9 = "Throwable().stackTrace";
                    str10 = "getInitialApplication";
                    str2 = "android.app.AppGlobals";
                    L05 = null;
                } else {
                    str9 = "Throwable().stackTrace";
                    str10 = "getInitialApplication";
                    str2 = "android.app.AppGlobals";
                    L05 = StringsKt.L0(className5, '.', null, 2, null);
                }
                if (L05 == null && (n10 == null || (L05 = n10.getClass().getCanonicalName()) == null)) {
                    L05 = "N/A";
                }
                Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(L05);
                if (matcher2.find()) {
                    L05 = matcher2.replaceAll(BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullExpressionValue(L05, "replaceAll(\"\")");
                }
                if (L05.length() > 23 && Build.VERSION.SDK_INT < 26) {
                    L05 = L05.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(L05, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                sb2.append(L05);
                sb2.append(" - ");
                String str12 = "pushUncaughtException: capturing exception: " + th + " and log path: " + ((Object) path);
                if (str12 == null) {
                    str12 = "null ";
                }
                sb2.append(str12);
                sb2.append(' ');
                sb2.append(BuildConfig.FLAVOR);
                companion2.log(level, sb2.toString());
                if (LogExtsKt.isRelease()) {
                    str11 = str9;
                    str = "null cannot be cast to non-null type android.app.Application";
                    str3 = str10;
                } else {
                    try {
                        o.a aVar = o.f37128b;
                        str3 = str10;
                        try {
                            invoke3 = Class.forName(str2).getMethod(str3, null).invoke(null, null);
                        } catch (Throwable th2) {
                            th = th2;
                            str = "null cannot be cast to non-null type android.app.Application";
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str = "null cannot be cast to non-null type android.app.Application";
                        str3 = str10;
                    }
                    if (invoke3 == null) {
                        str = "null cannot be cast to non-null type android.app.Application";
                        try {
                            throw new NullPointerException(str);
                        } catch (Throwable th4) {
                            th = th4;
                            o.a aVar2 = o.f37128b;
                            b12 = o.b(p.a(th));
                            if (o.f(b12)) {
                            }
                            String packageName = (String) b12;
                            if (LogExtsKt.isDebug()) {
                            }
                            str11 = str9;
                            g11 = HVSentryHub.hub;
                            if (g11 == null) {
                            }
                            g11.H(this.$e, A.o(new C3396b(path)));
                            anonymousClass1 = this;
                            str6 = str11;
                            charSequence = charSequence3;
                            str5 = "packageName";
                            HVSentryHub hVSentryHub = HVSentryHub.INSTANCE;
                            z10 = HVSentryHub.clientHubScreenshotConfig;
                            hVSentryHub.enableScreenshotAttachment(z10);
                            hVSentryHub.enableMainHubDeduplication(false);
                            Throwable th5 = anonymousClass1.$e;
                            HyperLogger.Level level2 = HyperLogger.Level.DEBUG;
                            HyperLogger companion3 = HyperLogger.INSTANCE.getInstance();
                            StringBuilder sb3 = new StringBuilder();
                            StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                            Intrinsics.checkNotNullExpressionValue(stackTrace2, str6);
                            stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace2);
                            if (stackTraceElement == null) {
                                str7 = str6;
                                charSequence2 = charSequence;
                                L03 = StringsKt.L0(className3, '.', null, 2, null);
                                if (L03 == null) {
                                    L03 = "N/A";
                                }
                                matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(L03);
                                if (matcher.find()) {
                                }
                                if (L03.length() > 23) {
                                    L03 = L03.substring(0, 23);
                                    Intrinsics.checkNotNullExpressionValue(L03, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                }
                                sb3.append(L03);
                                sb3.append(" - ");
                                m10 = Intrinsics.m("pushUncaughtException: mainHub capturing exception: ", th5);
                                if (m10 == null) {
                                }
                                sb3.append(m10);
                                sb3.append(' ');
                                sb3.append(BuildConfig.FLAVOR);
                                companion3.log(level2, sb3.toString());
                                if (!LogExtsKt.isRelease()) {
                                }
                                l11 = null;
                                l12 = HVSentryHub.clientHub;
                                if (l12 != null) {
                                }
                                return l13.G(anonymousClass12.$e);
                            }
                            str7 = str6;
                            charSequence2 = charSequence;
                            L03 = null;
                            if (L03 == null) {
                            }
                            matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(L03);
                            if (matcher.find()) {
                            }
                            if (L03.length() > 23) {
                            }
                            sb3.append(L03);
                            sb3.append(" - ");
                            m10 = Intrinsics.m("pushUncaughtException: mainHub capturing exception: ", th5);
                            if (m10 == null) {
                            }
                            sb3.append(m10);
                            sb3.append(' ');
                            sb3.append(BuildConfig.FLAVOR);
                            companion3.log(level2, sb3.toString());
                            if (!LogExtsKt.isRelease()) {
                            }
                            l11 = null;
                            l12 = HVSentryHub.clientHub;
                            if (l12 != null) {
                            }
                            return l13.G(anonymousClass12.$e);
                        }
                    }
                    b12 = o.b(((Application) invoke3).getPackageName());
                    str = "null cannot be cast to non-null type android.app.Application";
                    if (o.f(b12)) {
                        b12 = BuildConfig.FLAVOR;
                    }
                    String packageName2 = (String) b12;
                    if (LogExtsKt.isDebug()) {
                        Intrinsics.checkNotNullExpressionValue(packageName2, "packageName");
                        if (StringsKt.K(packageName2, charSequence3, false, 2, null)) {
                            StackTraceElement[] stackTrace3 = new Throwable().getStackTrace();
                            str11 = str9;
                            Intrinsics.checkNotNullExpressionValue(stackTrace3, str11);
                            StackTraceElement stackTraceElement3 = (StackTraceElement) AbstractC3574i.A(stackTrace3);
                            if (stackTraceElement3 == null || (className6 = stackTraceElement3.getClassName()) == null) {
                                charSequence3 = charSequence3;
                                L06 = null;
                            } else {
                                charSequence3 = charSequence3;
                                L06 = StringsKt.L0(className6, '.', null, 2, null);
                            }
                            if (L06 == null && (n10 == null || (L06 = n10.getClass().getCanonicalName()) == null)) {
                                L06 = "N/A";
                            }
                            Matcher matcher3 = LogExtsKt.ANON_CLASS_PATTERN.matcher(L06);
                            if (matcher3.find()) {
                                L06 = matcher3.replaceAll(BuildConfig.FLAVOR);
                                Intrinsics.checkNotNullExpressionValue(L06, "replaceAll(\"\")");
                            }
                            if (L06.length() > 23 && Build.VERSION.SDK_INT < 26) {
                                L06 = L06.substring(0, 23);
                                Intrinsics.checkNotNullExpressionValue(L06, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            StringBuilder sb4 = new StringBuilder();
                            String str13 = "pushUncaughtException: capturing exception: " + th + " and log path: " + ((Object) path);
                            if (str13 == null) {
                                str13 = "null ";
                            }
                            sb4.append(str13);
                            sb4.append(' ');
                            sb4.append(BuildConfig.FLAVOR);
                            Log.println(3, L06, sb4.toString());
                        } else {
                            charSequence3 = charSequence3;
                        }
                    }
                    str11 = str9;
                }
                g11 = HVSentryHub.hub;
                if (g11 == null) {
                    Intrinsics.v("hub");
                    g11 = null;
                }
                g11.H(this.$e, A.o(new C3396b(path)));
                anonymousClass1 = this;
                str6 = str11;
                charSequence = charSequence3;
                str5 = "packageName";
            } else {
                str = "null cannot be cast to non-null type android.app.Application";
                str2 = "android.app.AppGlobals";
                str3 = "getInitialApplication";
                Throwable th6 = this.$e;
                HyperLogger.Level level3 = HyperLogger.Level.DEBUG;
                HyperLogger companion4 = companion.getInstance();
                StringBuilder sb5 = new StringBuilder();
                StackTraceElement[] stackTrace4 = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace4, "Throwable().stackTrace");
                StackTraceElement stackTraceElement4 = (StackTraceElement) AbstractC3574i.A(stackTrace4);
                if (stackTraceElement4 == null || (className = stackTraceElement4.getClassName()) == null) {
                    str4 = "Throwable().stackTrace";
                    L02 = null;
                } else {
                    str4 = "Throwable().stackTrace";
                    L02 = StringsKt.L0(className, '.', null, 2, null);
                }
                if (L02 == null && (n10 == null || (L02 = n10.getClass().getCanonicalName()) == null)) {
                    L02 = "N/A";
                }
                Matcher matcher4 = LogExtsKt.ANON_CLASS_PATTERN.matcher(L02);
                if (matcher4.find()) {
                    L02 = matcher4.replaceAll(BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullExpressionValue(L02, "replaceAll(\"\")");
                }
                if (L02.length() > 23 && Build.VERSION.SDK_INT < 26) {
                    L02 = L02.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(L02, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                sb5.append(L02);
                sb5.append(" - ");
                String m11 = Intrinsics.m("pushUncaughtException: capturing exception: ", th6);
                if (m11 == null) {
                    m11 = "null ";
                }
                sb5.append(m11);
                sb5.append(' ');
                sb5.append(BuildConfig.FLAVOR);
                companion4.log(level3, sb5.toString());
                if (!LogExtsKt.isRelease()) {
                    try {
                        o.a aVar3 = o.f37128b;
                        invoke = Class.forName(str2).getMethod(str3, null).invoke(null, null);
                    } catch (Throwable th7) {
                        o.a aVar4 = o.f37128b;
                        b10 = o.b(p.a(th7));
                    }
                    if (invoke == null) {
                        throw new NullPointerException(str);
                    }
                    b10 = o.b(((Application) invoke).getPackageName());
                    if (o.f(b10)) {
                        b10 = BuildConfig.FLAVOR;
                    }
                    String str14 = (String) b10;
                    if (LogExtsKt.isDebug()) {
                        str5 = "packageName";
                        Intrinsics.checkNotNullExpressionValue(str14, str5);
                        charSequence = "co.hyperverge";
                        if (StringsKt.K(str14, charSequence, false, 2, null)) {
                            StackTraceElement[] stackTrace5 = new Throwable().getStackTrace();
                            str6 = str4;
                            Intrinsics.checkNotNullExpressionValue(stackTrace5, str6);
                            StackTraceElement stackTraceElement5 = (StackTraceElement) AbstractC3574i.A(stackTrace5);
                            String L07 = (stackTraceElement5 == null || (className2 = stackTraceElement5.getClassName()) == null) ? null : StringsKt.L0(className2, '.', null, 2, null);
                            if (L07 == null && (n10 == null || (L07 = n10.getClass().getCanonicalName()) == null)) {
                                L07 = "N/A";
                            }
                            Matcher matcher5 = LogExtsKt.ANON_CLASS_PATTERN.matcher(L07);
                            if (matcher5.find()) {
                                L07 = matcher5.replaceAll(BuildConfig.FLAVOR);
                                Intrinsics.checkNotNullExpressionValue(L07, "replaceAll(\"\")");
                            }
                            if (L07.length() > 23 && Build.VERSION.SDK_INT < 26) {
                                L07 = L07.substring(0, 23);
                                Intrinsics.checkNotNullExpressionValue(L07, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            StringBuilder sb6 = new StringBuilder();
                            String m12 = Intrinsics.m("pushUncaughtException: capturing exception: ", th6);
                            if (m12 == null) {
                                m12 = "null ";
                            }
                            sb6.append(m12);
                            sb6.append(' ');
                            sb6.append(BuildConfig.FLAVOR);
                            Log.println(3, L07, sb6.toString());
                            g10 = HVSentryHub.hub;
                            if (g10 == null) {
                                Intrinsics.v("hub");
                                g10 = null;
                            }
                            anonymousClass1 = this;
                            g10.G(anonymousClass1.$e);
                        }
                        str6 = str4;
                        g10 = HVSentryHub.hub;
                        if (g10 == null) {
                        }
                        anonymousClass1 = this;
                        g10.G(anonymousClass1.$e);
                    }
                }
                charSequence = "co.hyperverge";
                str5 = "packageName";
                str6 = str4;
                g10 = HVSentryHub.hub;
                if (g10 == null) {
                }
                anonymousClass1 = this;
                g10.G(anonymousClass1.$e);
            }
            HVSentryHub hVSentryHub2 = HVSentryHub.INSTANCE;
            z10 = HVSentryHub.clientHubScreenshotConfig;
            hVSentryHub2.enableScreenshotAttachment(z10);
            hVSentryHub2.enableMainHubDeduplication(false);
            Throwable th52 = anonymousClass1.$e;
            HyperLogger.Level level22 = HyperLogger.Level.DEBUG;
            HyperLogger companion32 = HyperLogger.INSTANCE.getInstance();
            StringBuilder sb32 = new StringBuilder();
            StackTraceElement[] stackTrace22 = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace22, str6);
            stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace22);
            if (stackTraceElement == null || (className3 = stackTraceElement.getClassName()) == null) {
                str7 = str6;
                charSequence2 = charSequence;
                L03 = null;
            } else {
                str7 = str6;
                charSequence2 = charSequence;
                L03 = StringsKt.L0(className3, '.', null, 2, null);
            }
            if (L03 == null && (n10 == null || (L03 = n10.getClass().getCanonicalName()) == null)) {
                L03 = "N/A";
            }
            matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher(L03);
            if (matcher.find()) {
                L03 = matcher.replaceAll(BuildConfig.FLAVOR);
                Intrinsics.checkNotNullExpressionValue(L03, "replaceAll(\"\")");
            }
            if (L03.length() > 23 && Build.VERSION.SDK_INT < 26) {
                L03 = L03.substring(0, 23);
                Intrinsics.checkNotNullExpressionValue(L03, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            sb32.append(L03);
            sb32.append(" - ");
            m10 = Intrinsics.m("pushUncaughtException: mainHub capturing exception: ", th52);
            if (m10 == null) {
                m10 = "null ";
            }
            sb32.append(m10);
            sb32.append(' ');
            sb32.append(BuildConfig.FLAVOR);
            companion32.log(level22, sb32.toString());
            if (!LogExtsKt.isRelease()) {
                try {
                    o.a aVar5 = o.f37128b;
                    invoke2 = Class.forName(str2).getMethod(str3, null).invoke(null, null);
                } catch (Throwable th8) {
                    o.a aVar6 = o.f37128b;
                    b11 = o.b(p.a(th8));
                }
                if (invoke2 == null) {
                    throw new NullPointerException(str);
                }
                b11 = o.b(((Application) invoke2).getPackageName());
                if (o.f(b11)) {
                    b11 = BuildConfig.FLAVOR;
                }
                String str15 = (String) b11;
                if (LogExtsKt.isDebug()) {
                    Intrinsics.checkNotNullExpressionValue(str15, str5);
                    if (StringsKt.K(str15, charSequence2, false, 2, null)) {
                        StackTraceElement[] stackTrace6 = new Throwable().getStackTrace();
                        Intrinsics.checkNotNullExpressionValue(stackTrace6, str7);
                        StackTraceElement stackTraceElement6 = (StackTraceElement) AbstractC3574i.A(stackTrace6);
                        if (stackTraceElement6 == null || (className4 = stackTraceElement6.getClassName()) == null) {
                            l11 = null;
                            L04 = null;
                        } else {
                            l11 = null;
                            L04 = StringsKt.L0(className4, '.', null, 2, null);
                        }
                        if (L04 != null) {
                            str8 = L04;
                        } else if (n10 == null || (str8 = n10.getClass().getCanonicalName()) == null) {
                            str8 = "N/A";
                        }
                        Matcher matcher6 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str8);
                        if (matcher6.find()) {
                            str8 = matcher6.replaceAll(BuildConfig.FLAVOR);
                            Intrinsics.checkNotNullExpressionValue(str8, "replaceAll(\"\")");
                        }
                        if (str8.length() > 23 && Build.VERSION.SDK_INT < 26) {
                            str8 = str8.substring(0, 23);
                            Intrinsics.checkNotNullExpressionValue(str8, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        }
                        StringBuilder sb7 = new StringBuilder();
                        String m13 = Intrinsics.m("pushUncaughtException: mainHub capturing exception: ", th52);
                        if (m13 == null) {
                            m13 = "null ";
                        }
                        sb7.append(m13);
                        sb7.append(' ');
                        sb7.append(BuildConfig.FLAVOR);
                        Log.println(3, str8, sb7.toString());
                        l12 = HVSentryHub.clientHub;
                        if (l12 != null) {
                            Intrinsics.v("clientHub");
                            l13 = l11;
                            anonymousClass12 = this;
                        } else {
                            anonymousClass12 = this;
                            l13 = l12;
                        }
                        return l13.G(anonymousClass12.$e);
                    }
                }
            }
            l11 = null;
            l12 = HVSentryHub.clientHub;
            if (l12 != null) {
            }
            return l13.G(anonymousClass12.$e);
        }
    }

    @f(c = "co.hyperverge.crashguard.utils.HVSentryHub$pushUncaughtException$2$2", f = "HVSentryHub.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)Ljava/lang/Void;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: co.hyperverge.crashguard.utils.HVSentryHub$pushUncaughtException$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends l implements Function2<N, d<?>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, d<?> dVar) {
            return ((AnonymousClass2) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            String className;
            Object b10;
            String canonicalName;
            String className2;
            Object invoke;
            AbstractC3868b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            N n10 = (N) this.L$0;
            HVSentryHub hVSentryHub = HVSentryHub.INSTANCE;
            z10 = HVSentryHub.clientHubDeduplicationConfig;
            hVSentryHub.enableMainHubDeduplication(z10);
            HyperLogger.Level level = HyperLogger.Level.DEBUG;
            HyperLogger companion = HyperLogger.INSTANCE.getInstance();
            StringBuilder sb2 = new StringBuilder();
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
            StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
            String str = null;
            String L02 = (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? null : StringsKt.L0(className, '.', null, 2, null);
            String str2 = "N/A";
            if (L02 == null && (n10 == null || (L02 = n10.getClass().getCanonicalName()) == null)) {
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
            sb2.append("pushUncaughtException: exiting process");
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
                        if (stackTraceElement2 != null && (className2 = stackTraceElement2.getClassName()) != null) {
                            str = StringsKt.L0(className2, '.', null, 2, null);
                        }
                        if (str != null) {
                            str2 = str;
                        } else if (n10 != null && (canonicalName = n10.getClass().getCanonicalName()) != null) {
                            str2 = canonicalName;
                        }
                        Matcher matcher2 = LogExtsKt.ANON_CLASS_PATTERN.matcher(str2);
                        if (matcher2.find()) {
                            str2 = matcher2.replaceAll(BuildConfig.FLAVOR);
                            Intrinsics.checkNotNullExpressionValue(str2, "replaceAll(\"\")");
                        }
                        if (str2.length() > 23 && Build.VERSION.SDK_INT < 26) {
                            str2 = str2.substring(0, 23);
                            Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        }
                        Log.println(3, str2, "pushUncaughtException: exiting process " + BuildConfig.FLAVOR);
                    }
                }
            }
            System.exit(2);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HVSentryHub$pushUncaughtException$2(Throwable th, d<? super HVSentryHub$pushUncaughtException$2> dVar) {
        super(2, dVar);
        this.$e = th;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HVSentryHub$pushUncaughtException$2 hVSentryHub$pushUncaughtException$2 = new HVSentryHub$pushUncaughtException$2(this.$e, dVar);
        hVSentryHub$pushUncaughtException$2.L$0 = obj;
        return hVSentryHub$pushUncaughtException$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<?> dVar) {
        return ((HVSentryHub$pushUncaughtException$2) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V b10;
        Object e10 = AbstractC3868b.e();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            N n10 = (N) this.L$0;
            AbstractC0891k.b(n10, null, null, new AnonymousClass1(this.$e, null), 3, null);
            b10 = AbstractC0891k.b(n10, null, null, new AnonymousClass2(null), 3, null);
            this.label = 1;
            if (b10.q(this) == e10) {
                return e10;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
        }
        throw new e();
    }
}
