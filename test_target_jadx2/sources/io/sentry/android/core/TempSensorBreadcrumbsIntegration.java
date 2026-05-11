package io.sentry.android.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import io.sentry.C3405e;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.K1;
import io.sentry.P1;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class TempSensorBreadcrumbsIntegration implements Integration, Closeable, SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34775a;

    /* renamed from: b, reason: collision with root package name */
    private io.sentry.L f34776b;

    /* renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f34777c;

    /* renamed from: d, reason: collision with root package name */
    SensorManager f34778d;

    public TempSensorBreadcrumbsIntegration(Context context) {
        this.f34775a = (Context) io.sentry.util.n.c(context, "Context is required");
    }

    @Override // io.sentry.Integration
    public void c(io.sentry.L l10, P1 p12) {
        this.f34776b = (io.sentry.L) io.sentry.util.n.c(l10, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.n.c(p12 instanceof SentryAndroidOptions ? (SentryAndroidOptions) p12 : null, "SentryAndroidOptions is required");
        this.f34777c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        K1 k12 = K1.DEBUG;
        logger.c(k12, "enableSystemEventsBreadcrumbs enabled: %s", Boolean.valueOf(this.f34777c.isEnableSystemEventBreadcrumbs()));
        if (this.f34777c.isEnableSystemEventBreadcrumbs()) {
            try {
                SensorManager sensorManager = (SensorManager) this.f34775a.getSystemService("sensor");
                this.f34778d = sensorManager;
                if (sensorManager != null) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(13);
                    if (defaultSensor != null) {
                        this.f34778d.registerListener(this, defaultSensor, 3);
                        p12.getLogger().c(k12, "TempSensorBreadcrumbsIntegration installed.", new Object[0]);
                        a();
                    } else {
                        this.f34777c.getLogger().c(K1.INFO, "TYPE_AMBIENT_TEMPERATURE is not available.", new Object[0]);
                    }
                } else {
                    this.f34777c.getLogger().c(K1.INFO, "SENSOR_SERVICE is not available.", new Object[0]);
                }
            } catch (Throwable th) {
                p12.getLogger().a(K1.ERROR, th, "Failed to init. the SENSOR_SERVICE.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SensorManager sensorManager = this.f34778d;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f34778d = null;
            SentryAndroidOptions sentryAndroidOptions = this.f34777c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(K1.DEBUG, "TempSensorBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length == 0 || fArr[0] == 0.0f || this.f34776b == null) {
            return;
        }
        C3405e c3405e = new C3405e();
        c3405e.l("system");
        c3405e.h("device.event");
        c3405e.i("action", "TYPE_AMBIENT_TEMPERATURE");
        c3405e.i("accuracy", Integer.valueOf(sensorEvent.accuracy));
        c3405e.i("timestamp", Long.valueOf(sensorEvent.timestamp));
        c3405e.j(K1.INFO);
        c3405e.i("degree", Float.valueOf(sensorEvent.values[0]));
        io.sentry.A a10 = new io.sentry.A();
        a10.k("android:sensorEvent", sensorEvent);
        this.f34776b.A(c3405e, a10);
    }
}
