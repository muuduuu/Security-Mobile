package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends x {

    /* renamed from: i, reason: collision with root package name */
    private final p f21293i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f21294j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ReadableMap config, p nativeAnimatedNodesManager) {
        super(null, 1, null);
        int[] iArr;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f21293i = nativeAnimatedNodesManager;
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
        this.f21294j = iArr;
    }

    @Override // com.facebook.react.animated.x, com.facebook.react.animated.b
    public String e() {
        return "DivisionAnimatedNode[" + this.f21267d + "]: input nodes: " + this.f21294j + " - super: " + super.e();
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        int[] iArr = this.f21294j;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            b k10 = this.f21293i.k(iArr[i10]);
            if (k10 == null || !(k10 instanceof x)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node with Animated ID " + this.f21267d);
            }
            double d10 = ((x) k10).f21376f;
            if (i11 == 0) {
                this.f21376f = d10;
            } else {
                if (d10 == 0.0d) {
                    throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node with Animated ID " + this.f21267d);
                }
                this.f21376f /= d10;
            }
            i10++;
            i11 = i12;
        }
    }
}
