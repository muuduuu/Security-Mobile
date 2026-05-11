package co.hyperverge.crashguard.objects;

import io.sentry.InterfaceC3466x;
import io.sentry.Y0;
import io.sentry.protocol.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0005R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\"\u0010%\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\"\u0010(\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!¨\u0006+"}, d2 = {"Lco/hyperverge/crashguard/objects/SentryProperties;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "dsn", "<init>", "(Ljava/lang/String;)V", "Lio/sentry/protocol/j;", "getSentryMechanism", "()Lio/sentry/protocol/j;", BuildConfig.FLAVOR, "Lio/sentry/x;", "getSentryEventProcessors", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lco/hyperverge/crashguard/objects/SentryProperties;", "toString", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDsn", "setDsn", "shouldAttachScreenshot", "Z", "getShouldAttachScreenshot", "()Z", "setShouldAttachScreenshot", "(Z)V", "shouldEnableBreadcrumbs", "getShouldEnableBreadcrumbs", "setShouldEnableBreadcrumbs", "shouldPrintSentryDebugLogs", "getShouldPrintSentryDebugLogs", "setShouldPrintSentryDebugLogs", "shouldEnableEventDeduplicationCheck", "getShouldEnableEventDeduplicationCheck", "setShouldEnableEventDeduplicationCheck", "crashguard_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SentryProperties {
    private String dsn;
    private boolean shouldAttachScreenshot;
    private boolean shouldEnableBreadcrumbs;
    private boolean shouldEnableEventDeduplicationCheck;
    private boolean shouldPrintSentryDebugLogs;

    public SentryProperties(String dsn) {
        Intrinsics.checkNotNullParameter(dsn, "dsn");
        this.dsn = dsn;
        this.shouldAttachScreenshot = true;
        this.shouldEnableBreadcrumbs = true;
    }

    public static /* synthetic */ SentryProperties copy$default(SentryProperties sentryProperties, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sentryProperties.dsn;
        }
        return sentryProperties.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDsn() {
        return this.dsn;
    }

    public final SentryProperties copy(String dsn) {
        Intrinsics.checkNotNullParameter(dsn, "dsn");
        return new SentryProperties(dsn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SentryProperties) && Intrinsics.b(this.dsn, ((SentryProperties) other).dsn);
    }

    public final String getDsn() {
        return this.dsn;
    }

    public final List<InterfaceC3466x> getSentryEventProcessors() {
        List<InterfaceC3466x> eventProcessors = Y0.g().D().getEventProcessors();
        Intrinsics.checkNotNullExpressionValue(eventProcessors, "cloneMainHub().options.eventProcessors");
        return eventProcessors;
    }

    public final j getSentryMechanism() {
        j jVar = new j();
        jVar.j("UncaughtExceptionHandler");
        jVar.i(Boolean.FALSE);
        return jVar;
    }

    public final boolean getShouldAttachScreenshot() {
        return this.shouldAttachScreenshot;
    }

    public final boolean getShouldEnableBreadcrumbs() {
        return this.shouldEnableBreadcrumbs;
    }

    public final boolean getShouldEnableEventDeduplicationCheck() {
        return this.shouldEnableEventDeduplicationCheck;
    }

    public final boolean getShouldPrintSentryDebugLogs() {
        return this.shouldPrintSentryDebugLogs;
    }

    public int hashCode() {
        return this.dsn.hashCode();
    }

    public final void setDsn(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dsn = str;
    }

    public final void setShouldAttachScreenshot(boolean z10) {
        this.shouldAttachScreenshot = z10;
    }

    public final void setShouldEnableBreadcrumbs(boolean z10) {
        this.shouldEnableBreadcrumbs = z10;
    }

    public final void setShouldEnableEventDeduplicationCheck(boolean z10) {
        this.shouldEnableEventDeduplicationCheck = z10;
    }

    public final void setShouldPrintSentryDebugLogs(boolean z10) {
        this.shouldPrintSentryDebugLogs = z10;
    }

    public String toString() {
        return "SentryProperties(dsn=" + this.dsn + ')';
    }
}
