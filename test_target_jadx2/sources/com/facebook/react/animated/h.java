package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends x {

    /* renamed from: i, reason: collision with root package name */
    private final p f21288i;

    /* renamed from: j, reason: collision with root package name */
    private final int f21289j;

    /* renamed from: k, reason: collision with root package name */
    private final double f21290k;

    /* renamed from: l, reason: collision with root package name */
    private final double f21291l;

    /* renamed from: m, reason: collision with root package name */
    private double f21292m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ReadableMap config, p nativeAnimatedNodesManager) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f21288i = nativeAnimatedNodesManager;
        this.f21289j = config.getInt("input");
        this.f21290k = config.getDouble("min");
        this.f21291l = config.getDouble("max");
        this.f21376f = this.f21292m;
    }

    private final double o() {
        b k10 = this.f21288i.k(this.f21289j);
        if (k10 == null || !(k10 instanceof x)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        return ((x) k10).l();
    }

    @Override // com.facebook.react.animated.x, com.facebook.react.animated.b
    public String e() {
        return "DiffClampAnimatedNode[" + this.f21267d + "]: InputNodeTag: " + this.f21289j + " min: " + this.f21290k + " max: " + this.f21291l + " lastValue: " + this.f21292m + " super: " + super.e();
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        double o10 = o();
        double d10 = o10 - this.f21292m;
        this.f21292m = o10;
        this.f21376f = Math.min(Math.max(this.f21376f + d10, this.f21290k), this.f21291l);
    }
}
