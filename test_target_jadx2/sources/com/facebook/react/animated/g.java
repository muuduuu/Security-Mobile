package com.facebook.react.animated;

import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: e, reason: collision with root package name */
    private double f21281e;

    /* renamed from: f, reason: collision with root package name */
    private double f21282f;

    /* renamed from: g, reason: collision with root package name */
    private long f21283g;

    /* renamed from: h, reason: collision with root package name */
    private double f21284h;

    /* renamed from: i, reason: collision with root package name */
    private double f21285i;

    /* renamed from: j, reason: collision with root package name */
    private int f21286j;

    /* renamed from: k, reason: collision with root package name */
    private int f21287k;

    public g(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f21283g = -1L;
        this.f21286j = 1;
        this.f21287k = 1;
        a(config);
    }

    @Override // com.facebook.react.animated.e
    public void a(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f21281e = config.getDouble("velocity");
        this.f21282f = config.getDouble("deceleration");
        this.f21283g = -1L;
        this.f21284h = 0.0d;
        this.f21285i = 0.0d;
        int i10 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.f21286j = i10;
        this.f21287k = 1;
        this.f21268a = i10 == 0;
    }

    @Override // com.facebook.react.animated.e
    public void b(long j10) {
        x xVar = this.f21269b;
        if (xVar == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        long j11 = j10 / HVFrameRecorder.BITRATE;
        if (this.f21283g == -1) {
            this.f21283g = j11 - 16;
            double d10 = this.f21284h;
            if (d10 == this.f21285i) {
                this.f21284h = xVar.f21376f;
            } else {
                xVar.f21376f = d10;
            }
            this.f21285i = xVar.f21376f;
        }
        double d11 = this.f21284h;
        double d12 = this.f21281e;
        double d13 = 1;
        double d14 = this.f21282f;
        double exp = d11 + ((d12 / (d13 - d14)) * (d13 - Math.exp((-(d13 - d14)) * (j11 - this.f21283g))));
        if (Math.abs(this.f21285i - exp) < 0.1d) {
            int i10 = this.f21286j;
            if (i10 != -1 && this.f21287k >= i10) {
                this.f21268a = true;
                return;
            } else {
                this.f21283g = -1L;
                this.f21287k++;
            }
        }
        this.f21285i = exp;
        xVar.f21376f = exp;
    }
}
