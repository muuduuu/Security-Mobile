package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import java.util.Map;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;

/* loaded from: classes2.dex */
public abstract class q {
    public static final Map a(a insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return G.k(t.a("top", Float.valueOf(C1944g0.e(insets.d()))), t.a("right", Float.valueOf(C1944g0.e(insets.c()))), t.a("bottom", Float.valueOf(C1944g0.e(insets.a()))), t.a("left", Float.valueOf(C1944g0.e(insets.b()))));
    }

    public static final WritableMap b(a insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", C1944g0.e(insets.d()));
        createMap.putDouble("right", C1944g0.e(insets.c()));
        createMap.putDouble("bottom", C1944g0.e(insets.a()));
        createMap.putDouble("left", C1944g0.e(insets.b()));
        Intrinsics.d(createMap);
        return createMap;
    }

    public static final Map c(c rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return G.k(t.a("x", Float.valueOf(C1944g0.e(rect.c()))), t.a("y", Float.valueOf(C1944g0.e(rect.d()))), t.a("width", Float.valueOf(C1944g0.e(rect.b()))), t.a("height", Float.valueOf(C1944g0.e(rect.a()))));
    }

    public static final WritableMap d(c rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", C1944g0.e(rect.c()));
        createMap.putDouble("y", C1944g0.e(rect.d()));
        createMap.putDouble("width", C1944g0.e(rect.b()));
        createMap.putDouble("height", C1944g0.e(rect.a()));
        Intrinsics.d(createMap);
        return createMap;
    }
}
