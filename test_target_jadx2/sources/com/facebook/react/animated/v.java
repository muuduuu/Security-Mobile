package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v extends b {

    /* renamed from: f, reason: collision with root package name */
    private final p f21363f;

    /* renamed from: g, reason: collision with root package name */
    private final JavaOnlyMap f21364g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21365h;

    /* renamed from: i, reason: collision with root package name */
    private final int f21366i;

    /* renamed from: j, reason: collision with root package name */
    private final int f21367j;

    public v(ReadableMap config, p nativeAnimatedNodesManager) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f21363f = nativeAnimatedNodesManager;
        JavaOnlyMap deepClone = JavaOnlyMap.deepClone(config.getMap("animationConfig"));
        Intrinsics.checkNotNullExpressionValue(deepClone, "deepClone(...)");
        this.f21364g = deepClone;
        this.f21365h = config.getInt("animationId");
        this.f21366i = config.getInt("toValue");
        this.f21367j = config.getInt("value");
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "TrackingAnimatedNode[" + this.f21267d + "]: animationID: " + this.f21365h + " toValueNode: " + this.f21366i + " valueNode: " + this.f21367j + " animationConfig: " + this.f21364g;
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        b k10 = this.f21363f.k(this.f21366i);
        x xVar = k10 instanceof x ? (x) k10 : null;
        if (xVar != null) {
            this.f21364g.putDouble("toValue", xVar.l());
        } else {
            this.f21364g.putNull("toValue");
        }
        this.f21363f.w(this.f21365h, this.f21367j, this.f21364g, null);
    }
}
