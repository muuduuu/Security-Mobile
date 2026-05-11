package co.hyperverge.crashguard.utils;

import android.content.Context;
import android.util.Log;
import co.hyperverge.crashguard.objects.CrashguardConfig;
import co.hyperverge.crashguard.objects.SentryProperties;
import co.hyperverge.hyperlogger.HyperLogger;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import io.sentry.A;
import io.sentry.A1;
import io.sentry.C3396b;
import io.sentry.InterfaceC3466x;
import io.sentry.K1;
import io.sentry.P1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.q;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.AbstractC3622a;
import lc.o;
import lc.p;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u000bH\u0000\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\u001a\u0010\u0012\u001a\u00020\u0001*\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¨\u0006\u0014"}, d2 = {"doesANRThreadDumpContainFilter", BuildConfig.FLAVOR, "bytes", BuildConfig.FLAVOR, "filters", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "doesEventContainFilter", "stackTraceToString", "containsFilter", "isReleaseBuild", "Landroid/content/Context;", "setConfig", BuildConfig.FLAVOR, "Lio/sentry/android/core/SentryAndroidOptions;", "env", HVRetakeActivity.CONFIG_TAG, "Lco/hyperverge/crashguard/objects/CrashguardConfig;", "shouldReportCrash", BuildConfig.FLAVOR, "crashguard_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ExtensionsKt {
    public static final boolean containsFilter(String str, List<String> filters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(filters, "filters");
        if (!filters.isEmpty()) {
            List<String> list = filters;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.K(str, (String) it.next(), false, 2, null)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean doesANRThreadDumpContainFilter(byte[] bytes, List<String> filters) {
        Object b10;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(filters, "filters");
        try {
            o.a aVar = o.f37128b;
            StringBuilder sb2 = new StringBuilder();
            int length = bytes.length;
            int i10 = 0;
            while (i10 < length) {
                byte b11 = bytes[i10];
                i10++;
                sb2.append((char) b11);
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "stringBuilder.toString()");
            b10 = o.b(Boolean.valueOf(containsFilter(sb3, filters)));
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        Throwable d10 = o.d(b10);
        if (d10 != null) {
            if (!(d10 instanceof OutOfMemoryError)) {
                throw d10;
            }
            Log.e("OutOfMemoryError", Intrinsics.m("Out of memory error occurred: ", d10.getMessage()));
            b10 = Boolean.FALSE;
        }
        return ((Boolean) b10).booleanValue();
    }

    public static final boolean doesEventContainFilter(String stackTraceToString, List<String> filters) {
        Intrinsics.checkNotNullParameter(stackTraceToString, "stackTraceToString");
        Intrinsics.checkNotNullParameter(filters, "filters");
        return containsFilter(stackTraceToString, filters);
    }

    public static final boolean isReleaseBuild(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return !((context.getApplicationContext().getApplicationInfo().flags & 2) != 0);
    }

    public static final void setConfig(final SentryAndroidOptions sentryAndroidOptions, String env, final CrashguardConfig config) {
        Intrinsics.checkNotNullParameter(sentryAndroidOptions, "<this>");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(config, "config");
        final SentryProperties sentryProperties = config.getSentryProperties();
        sentryAndroidOptions.setDsn(sentryProperties.getDsn());
        sentryAndroidOptions.setDebug(sentryProperties.getShouldPrintSentryDebugLogs());
        sentryAndroidOptions.setAttachScreenshot(sentryProperties.getShouldAttachScreenshot());
        sentryAndroidOptions.enableAllAutoBreadcrumbs(sentryProperties.getShouldEnableBreadcrumbs());
        sentryAndroidOptions.setEnableDeduplication(sentryProperties.getShouldEnableEventDeduplicationCheck());
        sentryAndroidOptions.setEnvironment(env);
        sentryAndroidOptions.setRelease(config.getTags().get("release"));
        for (Map.Entry<String, String> entry : config.getTags().entrySet()) {
            sentryAndroidOptions.setTag(entry.getKey(), entry.getValue());
        }
        sentryAndroidOptions.setBeforeSend(new P1.b() { // from class: co.hyperverge.crashguard.utils.a
            @Override // io.sentry.P1.b
            public final A1 a(A1 a12, A a10) {
                A1 m2setConfig$lambda9;
                m2setConfig$lambda9 = ExtensionsKt.m2setConfig$lambda9(CrashguardConfig.this, sentryAndroidOptions, sentryProperties, a12, a10);
                return m2setConfig$lambda9;
            }
        });
        Iterator<T> it = sentryProperties.getSentryEventProcessors().iterator();
        while (it.hasNext()) {
            sentryAndroidOptions.addEventProcessor((InterfaceC3466x) it.next());
        }
        sentryAndroidOptions.setEnableAutoSessionTracking(false);
        sentryAndroidOptions.setAnrEnabled(true);
        sentryAndroidOptions.setAttachAnrThreadDump(true);
        sentryAndroidOptions.setMaxAttachmentSize(524288000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setConfig$lambda-9, reason: not valid java name */
    public static final A1 m2setConfig$lambda9(CrashguardConfig config, SentryAndroidOptions this_setConfig, SentryProperties sentryProperties, A1 event, A hint) {
        Throwable O10;
        String b10;
        byte[] e10;
        Intrinsics.checkNotNullParameter(config, "$config");
        Intrinsics.checkNotNullParameter(this_setConfig, "$this_setConfig");
        Intrinsics.checkNotNullParameter(sentryProperties, "$sentryProperties");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(hint, "hint");
        C3396b h10 = hint.h();
        if ((h10 != null && (e10 = h10.e()) != null && !doesANRThreadDumpContainFilter(e10, config.getFilters())) || (O10 = event.O()) == null || !shouldReportCrash(O10, config.getFilters())) {
            return null;
        }
        this_setConfig.setRelease(config.getTags().get("release"));
        Map N10 = event.N();
        if (N10 != null) {
            for (Map.Entry entry : N10.entrySet()) {
                this_setConfig.setTag((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Throwable O11 = event.O();
        if (O11 != null && (b10 = AbstractC3622a.b(O11)) != null) {
            HyperLogger.INSTANCE.getInstance().log(HyperLogger.Level.ERROR, b10);
        }
        event.z0(K1.FATAL);
        List o02 = event.o0();
        if (o02 != null) {
            Iterator it = o02.iterator();
            while (it.hasNext()) {
                ((q) it.next()).j(sentryProperties.getSentryMechanism());
            }
        }
        q u02 = event.u0();
        if (u02 != null) {
            u02.j(sentryProperties.getSentryMechanism());
        }
        File currentLogZipFile = HyperLogger.INSTANCE.getInstance().getCurrentLogZipFile();
        String path = currentLogZipFile != null ? currentLogZipFile.getPath() : null;
        if (path != null) {
            hint.a(new C3396b(path));
        }
        return event;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean shouldReportCrash(Throwable th, List<String> filters) {
        Object b10;
        boolean z10;
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(filters, "filters");
        try {
            o.a aVar = o.f37128b;
        } catch (Throwable th2) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th2));
        }
        if (!filters.isEmpty()) {
            List<String> list = filters;
            z10 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (StringsKt.K(AbstractC3622a.b(th), (String) it.next(), false, 2, null)) {
                    }
                }
            }
            b10 = o.b(Boolean.valueOf(z10));
            Boolean bool = Boolean.FALSE;
            if (o.f(b10)) {
                b10 = bool;
            }
            return ((Boolean) b10).booleanValue();
        }
        z10 = true;
        b10 = o.b(Boolean.valueOf(z10));
        Boolean bool2 = Boolean.FALSE;
        if (o.f(b10)) {
        }
        return ((Boolean) b10).booleanValue();
    }
}
