package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u extends x {

    /* renamed from: i, reason: collision with root package name */
    private final p f21361i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f21362j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ReadableMap config, p nativeAnimatedNodesManager) {
        super(null, 1, null);
        int[] iArr;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f21361i = nativeAnimatedNodesManager;
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
        this.f21362j = iArr;
    }

    @Override // com.facebook.react.animated.x, com.facebook.react.animated.b
    public String e() {
        return "SubtractionAnimatedNode[" + this.f21267d + "]: input nodes: " + this.f21362j + " - super: " + super.e();
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        int length = this.f21362j.length;
        for (int i10 = 0; i10 < length; i10++) {
            b k10 = this.f21361i.k(this.f21362j[i10]);
            if (k10 == null || !(k10 instanceof x)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.subtract node");
            }
            double l10 = ((x) k10).l();
            if (i10 == 0) {
                this.f21376f = l10;
            } else {
                this.f21376f -= l10;
            }
        }
    }
}
