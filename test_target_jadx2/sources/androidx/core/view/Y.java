package androidx.core.view;

import android.view.MotionEvent;

/* loaded from: classes.dex */
class Y {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f16079a = new float[20];

    /* renamed from: b, reason: collision with root package name */
    private final long[] f16080b = new long[20];

    /* renamed from: c, reason: collision with root package name */
    private float f16081c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private int f16082d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f16083e = 0;

    Y() {
    }

    private void b() {
        this.f16082d = 0;
        this.f16081c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j10;
        int i10 = this.f16082d;
        if (i10 < 2) {
            return 0.0f;
        }
        int i11 = this.f16083e;
        int i12 = ((i11 + 20) - (i10 - 1)) % 20;
        long j11 = this.f16080b[i11];
        while (true) {
            jArr = this.f16080b;
            j10 = jArr[i12];
            if (j11 - j10 <= 100) {
                break;
            }
            this.f16082d--;
            i12 = (i12 + 1) % 20;
        }
        int i13 = this.f16082d;
        if (i13 < 2) {
            return 0.0f;
        }
        if (i13 == 2) {
            int i14 = (i12 + 1) % 20;
            if (j10 == jArr[i14]) {
                return 0.0f;
            }
            return this.f16079a[i14] / (r2 - j10);
        }
        float f10 = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f16082d - 1; i16++) {
            int i17 = i16 + i12;
            long[] jArr2 = this.f16080b;
            long j12 = jArr2[i17 % 20];
            int i18 = (i17 + 1) % 20;
            if (jArr2[i18] != j12) {
                i15++;
                float f11 = f(f10);
                float f12 = this.f16079a[i18] / (this.f16080b[i18] - j12);
                f10 += (f12 - f11) * Math.abs(f12);
                if (i15 == 1) {
                    f10 *= 0.5f;
                }
            }
        }
        return f(f10);
    }

    private static float f(float f10) {
        return (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f16082d != 0 && eventTime - this.f16080b[this.f16083e] > 40) {
            b();
        }
        int i10 = (this.f16083e + 1) % 20;
        this.f16083e = i10;
        int i11 = this.f16082d;
        if (i11 != 20) {
            this.f16082d = i11 + 1;
        }
        this.f16079a[i10] = motionEvent.getAxisValue(26);
        this.f16080b[this.f16083e] = eventTime;
    }

    void c(int i10, float f10) {
        float e10 = e() * i10;
        this.f16081c = e10;
        if (e10 < (-Math.abs(f10))) {
            this.f16081c = -Math.abs(f10);
        } else if (this.f16081c > Math.abs(f10)) {
            this.f16081c = Math.abs(f10);
        }
    }

    float d(int i10) {
        if (i10 != 26) {
            return 0.0f;
        }
        return this.f16081c;
    }
}
