package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Map;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends b {

    /* renamed from: f, reason: collision with root package name */
    private final p f21359f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f21360g;

    public t(ReadableMap config, p nativeAnimatedNodesManager) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f21359f = nativeAnimatedNodesManager;
        ReadableMap map = config.getMap("style");
        ReadableMapKeySetIterator keySetIterator = map != null ? map.keySetIterator() : null;
        Map c10 = G.c();
        while (keySetIterator != null && keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            c10.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.f21360g = G.b(c10);
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "StyleAnimatedNode[" + this.f21267d + "] mPropMapping: " + this.f21360g;
    }

    public final void i(JavaOnlyMap propsMap) {
        Intrinsics.checkNotNullParameter(propsMap, "propsMap");
        for (Map.Entry entry : this.f21360g.entrySet()) {
            String str = (String) entry.getKey();
            b k10 = this.f21359f.k(((Number) entry.getValue()).intValue());
            if (k10 == null) {
                throw new IllegalArgumentException("Mapped style node does not exist");
            }
            if (k10 instanceof w) {
                ((w) k10).i(propsMap);
            } else if (k10 instanceof x) {
                x xVar = (x) k10;
                Object k11 = xVar.k();
                if (k11 instanceof Integer) {
                    propsMap.putInt(str, ((Number) k11).intValue());
                } else if (k11 instanceof String) {
                    propsMap.putString(str, (String) k11);
                } else {
                    propsMap.putDouble(str, xVar.l());
                }
            } else if (k10 instanceof f) {
                propsMap.putInt(str, ((f) k10).i());
            } else {
                if (!(k10 instanceof q)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + k10.getClass());
                }
                ((q) k10).i(str, propsMap);
            }
        }
    }
}
