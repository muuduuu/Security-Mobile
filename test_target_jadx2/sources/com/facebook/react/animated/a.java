package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends x {

    /* renamed from: i, reason: collision with root package name */
    private final p f21261i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f21262j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReadableMap config, p nativeAnimatedNodesManager) {
        super(null, 1, null);
        int[] iArr;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f21261i = nativeAnimatedNodesManager;
        ReadableArray array = config.getArray("input");
        if (array == null) {
            iArr = new int[0];
        } else {
            int size = array.size();
            int[] iArr2 = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr2[i10] = array.getInt(i10);
            }
            iArr = iArr2;
        }
        this.f21262j = iArr;
    }

    @Override // com.facebook.react.animated.x, com.facebook.react.animated.b
    public String e() {
        return "AdditionAnimatedNode[" + this.f21267d + "]: input nodes: " + AbstractC3574i.R(this.f21262j, null, null, null, 0, null, null, 63, null) + " - super: " + super.e();
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        this.f21376f = 0.0d;
        double d10 = 0.0d;
        for (int i10 : this.f21262j) {
            b k10 = this.f21261i.k(i10);
            if (!(k10 instanceof x)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.Add node");
            }
            d10 += ((x) k10).l();
        }
        this.f21376f = 0.0d + d10;
    }
}
