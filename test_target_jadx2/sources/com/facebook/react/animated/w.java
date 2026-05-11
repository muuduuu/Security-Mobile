package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends com.facebook.react.animated.b {

    /* renamed from: f, reason: collision with root package name */
    private final p f21368f;

    /* renamed from: g, reason: collision with root package name */
    private final List f21369g;

    private final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        private int f21370c;

        public a() {
            super();
        }

        public final int c() {
            return this.f21370c;
        }

        public final void d(int i10) {
            this.f21370c = i10;
        }
    }

    private final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        private double f21372c;

        public b() {
            super();
        }

        public final double c() {
            return this.f21372c;
        }

        public final void d(double d10) {
            this.f21372c = d10;
        }
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        private String f21374a;

        public c() {
        }

        public final String a() {
            return this.f21374a;
        }

        public final void b(String str) {
            this.f21374a = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.facebook.react.animated.w$b, com.facebook.react.animated.w$c] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.facebook.react.animated.w$a, com.facebook.react.animated.w$c] */
    public w(ReadableMap config, p nativeAnimatedNodesManager) {
        ArrayList arrayList;
        ?? bVar;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f21368f = nativeAnimatedNodesManager;
        ReadableArray array = config.getArray("transforms");
        if (array == null) {
            arrayList = new ArrayList();
        } else {
            int size = array.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = array.getMap(i10);
                String string = map.getString("property");
                if (Intrinsics.b(map.getString("type"), "animated")) {
                    bVar = new a();
                    bVar.b(string);
                    bVar.d(map.getInt("nodeTag"));
                } else {
                    bVar = new b();
                    bVar.b(string);
                    bVar.d(map.getDouble("value"));
                }
                arrayList2.add(bVar);
            }
            arrayList = arrayList2;
        }
        this.f21369g = arrayList;
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "TransformAnimatedNode[" + this.f21267d + "]: transformConfigs: " + this.f21369g;
    }

    public final void i(JavaOnlyMap propsMap) {
        double c10;
        Intrinsics.checkNotNullParameter(propsMap, "propsMap");
        int size = this.f21369g.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) this.f21369g.get(i10);
            if (cVar instanceof a) {
                com.facebook.react.animated.b k10 = this.f21368f.k(((a) cVar).c());
                if (k10 == null) {
                    throw new IllegalArgumentException("Mapped style node does not exist");
                }
                if (!(k10 instanceof x)) {
                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + k10.getClass());
                }
                c10 = ((x) k10).l();
            } else {
                Intrinsics.e(cVar, "null cannot be cast to non-null type com.facebook.react.animated.TransformAnimatedNode.StaticTransformConfig");
                c10 = ((b) cVar).c();
            }
            JavaOnlyMap of = JavaOnlyMap.of(cVar.a(), Double.valueOf(c10));
            Intrinsics.checkNotNullExpressionValue(of, "of(...)");
            arrayList.add(of);
        }
        propsMap.putArray("transform", JavaOnlyArray.from(arrayList));
    }
}
