package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends x {

    /* renamed from: i, reason: collision with root package name */
    private final p f21314i;

    /* renamed from: j, reason: collision with root package name */
    private final int f21315j;

    /* renamed from: k, reason: collision with root package name */
    private final double f21316k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ReadableMap config, p nativeAnimatedNodesManager) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f21314i = nativeAnimatedNodesManager;
        this.f21315j = config.getInt("input");
        this.f21316k = config.getDouble("modulus");
    }

    @Override // com.facebook.react.animated.x, com.facebook.react.animated.b
    public String e() {
        return "NativeAnimatedNodesManager[" + this.f21267d + "] inputNode: " + this.f21315j + " modulus: " + this.f21316k + " super: " + super.e();
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        b k10 = this.f21314i.k(this.f21315j);
        if (!(k10 instanceof x)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        double l10 = ((x) k10).l();
        double d10 = this.f21316k;
        this.f21376f = ((l10 % d10) + d10) % d10;
    }
}
