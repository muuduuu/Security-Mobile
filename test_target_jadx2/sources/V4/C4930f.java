package v4;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4930f implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final a f43926a;

    /* renamed from: b, reason: collision with root package name */
    private final int f43927b;

    /* renamed from: c, reason: collision with root package name */
    private float f43928c;

    /* renamed from: d, reason: collision with root package name */
    private float f43929d;

    /* renamed from: e, reason: collision with root package name */
    private float f43930e;

    /* renamed from: f, reason: collision with root package name */
    private SensorManager f43931f;

    /* renamed from: g, reason: collision with root package name */
    private long f43932g;

    /* renamed from: h, reason: collision with root package name */
    private int f43933h;

    /* renamed from: i, reason: collision with root package name */
    private long f43934i;

    /* renamed from: v4.f$a */
    public interface a {
        void a();
    }

    public C4930f(a shakeListener, int i10) {
        Intrinsics.checkNotNullParameter(shakeListener, "shakeListener");
        this.f43926a = shakeListener;
        this.f43927b = i10;
    }

    private final boolean a(float f10) {
        return Math.abs(f10) > 13.042845f;
    }

    private final void b(long j10) {
        float f10;
        if (this.f43933h >= this.f43927b * 8) {
            d();
            this.f43926a.a();
        }
        float f11 = j10 - this.f43934i;
        f10 = AbstractC4931g.f43936b;
        if (f11 > f10) {
            d();
        }
    }

    private final void c(long j10) {
        this.f43934i = j10;
        this.f43933h++;
    }

    private final void d() {
        this.f43933h = 0;
        this.f43928c = 0.0f;
        this.f43929d = 0.0f;
        this.f43930e = 0.0f;
    }

    public final void e(SensorManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Sensor defaultSensor = manager.getDefaultSensor(1);
        if (defaultSensor == null) {
            return;
        }
        this.f43931f = manager;
        this.f43932g = -1L;
        manager.registerListener(this, defaultSensor, 2);
        this.f43934i = 0L;
        d();
    }

    public final void f() {
        SensorManager sensorManager = this.f43931f;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.f43931f = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long j10;
        Intrinsics.checkNotNullParameter(sensorEvent, "sensorEvent");
        long j11 = sensorEvent.timestamp - this.f43932g;
        j10 = AbstractC4931g.f43935a;
        if (j11 < j10) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2] - 9.80665f;
        this.f43932g = sensorEvent.timestamp;
        if (a(f10) && this.f43928c * f10 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f43928c = f10;
        } else if (a(f11) && this.f43929d * f11 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f43929d = f11;
        } else if (a(f12) && this.f43930e * f12 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f43930e = f12;
        }
        b(sensorEvent.timestamp);
    }
}
