package io.sentry.android.core;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import io.sentry.C3405e;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.K1;
import io.sentry.P1;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class PhoneStateBreadcrumbsIntegration implements Integration, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34746a;

    /* renamed from: b, reason: collision with root package name */
    private SentryAndroidOptions f34747b;

    /* renamed from: c, reason: collision with root package name */
    a f34748c;

    /* renamed from: d, reason: collision with root package name */
    private TelephonyManager f34749d;

    static final class a extends PhoneStateListener {

        /* renamed from: a, reason: collision with root package name */
        private final io.sentry.L f34750a;

        a(io.sentry.L l10) {
            this.f34750a = l10;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i10, String str) {
            if (i10 == 1) {
                C3405e c3405e = new C3405e();
                c3405e.l("system");
                c3405e.h("device.event");
                c3405e.i("action", "CALL_STATE_RINGING");
                c3405e.k("Device ringing");
                c3405e.j(K1.INFO);
                this.f34750a.w(c3405e);
            }
        }
    }

    public PhoneStateBreadcrumbsIntegration(Context context) {
        this.f34746a = (Context) io.sentry.util.n.c(context, "Context is required");
    }

    @Override // io.sentry.Integration
    public void c(io.sentry.L l10, P1 p12) {
        io.sentry.util.n.c(l10, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.n.c(p12 instanceof SentryAndroidOptions ? (SentryAndroidOptions) p12 : null, "SentryAndroidOptions is required");
        this.f34747b = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        K1 k12 = K1.DEBUG;
        logger.c(k12, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.f34747b.isEnableSystemEventBreadcrumbs()));
        if (this.f34747b.isEnableSystemEventBreadcrumbs() && io.sentry.android.core.internal.util.k.a(this.f34746a, "android.permission.READ_PHONE_STATE")) {
            TelephonyManager telephonyManager = (TelephonyManager) this.f34746a.getSystemService("phone");
            this.f34749d = telephonyManager;
            if (telephonyManager == null) {
                this.f34747b.getLogger().c(K1.INFO, "TelephonyManager is not available", new Object[0]);
                return;
            }
            try {
                a aVar = new a(l10);
                this.f34748c = aVar;
                this.f34749d.listen(aVar, 32);
                p12.getLogger().c(k12, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
                a();
            } catch (Throwable th) {
                this.f34747b.getLogger().a(K1.INFO, th, "TelephonyManager is not available or ready to use.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a aVar;
        TelephonyManager telephonyManager = this.f34749d;
        if (telephonyManager == null || (aVar = this.f34748c) == null) {
            return;
        }
        telephonyManager.listen(aVar, 0);
        this.f34748c = null;
        SentryAndroidOptions sentryAndroidOptions = this.f34747b;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(K1.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
        }
    }
}
