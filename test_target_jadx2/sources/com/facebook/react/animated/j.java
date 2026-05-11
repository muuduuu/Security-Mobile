package com.facebook.react.animated;

import c3.AbstractC1721a;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x4.C5109a;

/* loaded from: classes.dex */
public final class j extends e {

    /* renamed from: l, reason: collision with root package name */
    public static final a f21295l = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private long f21296e;

    /* renamed from: f, reason: collision with root package name */
    private double[] f21297f;

    /* renamed from: g, reason: collision with root package name */
    private double f21298g;

    /* renamed from: h, reason: collision with root package name */
    private double f21299h;

    /* renamed from: i, reason: collision with root package name */
    private int f21300i;

    /* renamed from: j, reason: collision with root package name */
    private int f21301j;

    /* renamed from: k, reason: collision with root package name */
    private int f21302k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f21296e = -1L;
        this.f21297f = new double[0];
        this.f21300i = 1;
        this.f21301j = 1;
        a(config);
    }

    @Override // com.facebook.react.animated.e
    public void a(ReadableMap config) {
        int size;
        Intrinsics.checkNotNullParameter(config, "config");
        ReadableArray array = config.getArray("frames");
        if (array != null && this.f21297f.length != (size = array.size())) {
            double[] dArr = new double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = array.getDouble(i10);
            }
            this.f21297f = dArr;
        }
        this.f21298g = (config.hasKey("toValue") && config.getType("toValue") == ReadableType.Number) ? config.getDouble("toValue") : 0.0d;
        int i11 = (config.hasKey("iterations") && config.getType("iterations") == ReadableType.Number) ? config.getInt("iterations") : 1;
        this.f21300i = i11;
        this.f21301j = 1;
        this.f21268a = i11 == 0;
        this.f21296e = -1L;
    }

    @Override // com.facebook.react.animated.e
    public void b(long j10) {
        double d10;
        x xVar = this.f21269b;
        if (xVar == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        if (this.f21296e < 0) {
            this.f21296e = j10;
            if (this.f21301j == 1) {
                this.f21299h = xVar.f21376f;
            }
        }
        int round = (int) Math.round(((j10 - this.f21296e) / HVFrameRecorder.BITRATE) / 16.666666666666668d);
        if (round < 0) {
            String str = "Calculated frame index should never be lower than 0. Called with frameTimeNanos " + j10 + " and mStartFrameTimeNanos " + this.f21296e;
            if (C5109a.f44775b) {
                throw new IllegalStateException(str.toString());
            }
            if (this.f21302k < 100) {
                AbstractC1721a.J("ReactNative", str);
                this.f21302k++;
                return;
            }
            return;
        }
        if (this.f21268a) {
            return;
        }
        double[] dArr = this.f21297f;
        if (round >= dArr.length - 1) {
            int i10 = this.f21300i;
            if (i10 == -1 || this.f21301j < i10) {
                double d11 = this.f21299h;
                d10 = d11 + (dArr[dArr.length - 1] * (this.f21298g - d11));
                this.f21296e = -1L;
                this.f21301j++;
            } else {
                d10 = this.f21298g;
                this.f21268a = true;
            }
        } else {
            double d12 = this.f21299h;
            d10 = d12 + (dArr[round] * (this.f21298g - d12));
        }
        xVar.f21376f = d10;
    }
}
