package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q extends com.facebook.react.animated.b {

    /* renamed from: h, reason: collision with root package name */
    public static final a f21331h = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private final p f21332f;

    /* renamed from: g, reason: collision with root package name */
    private final JavaOnlyMap f21333g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21334a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f21334a = iArr;
        }
    }

    public q(ReadableMap config, p nativeAnimatedNodesManager) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f21332f = nativeAnimatedNodesManager;
        JavaOnlyMap deepClone = JavaOnlyMap.deepClone(config);
        Intrinsics.checkNotNullExpressionValue(deepClone, "deepClone(...)");
        this.f21333g = deepClone;
    }

    private final JavaOnlyArray j(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            switch (b.f21334a[readableArray.getType(i10).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i10));
                    break;
                case 3:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i10));
                    break;
                case 4:
                    javaOnlyArray.pushString(readableArray.getString(i10));
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i10);
                    if (!map.hasKey("nodeTag") || map.getType("nodeTag") != ReadableType.Number) {
                        javaOnlyArray.pushMap(k(readableArray.getMap(i10)));
                        break;
                    } else {
                        com.facebook.react.animated.b k10 = this.f21332f.k(map.getInt("nodeTag"));
                        if (k10 == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (k10 instanceof x) {
                            x xVar = (x) k10;
                            Object k11 = xVar.k();
                            if (k11 instanceof Integer) {
                                javaOnlyArray.pushInt(((Number) k11).intValue());
                                break;
                            } else if (k11 instanceof String) {
                                javaOnlyArray.pushString((String) k11);
                                break;
                            } else {
                                javaOnlyArray.pushDouble(xVar.l());
                                break;
                            }
                        } else if (k10 instanceof f) {
                            javaOnlyArray.pushInt(((f) k10).i());
                            break;
                        } else {
                            break;
                        }
                    }
                case 6:
                    javaOnlyArray.pushArray(j(readableArray.getArray(i10)));
                    break;
            }
        }
        return javaOnlyArray;
    }

    private final JavaOnlyMap k(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (b.f21334a[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(nextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    javaOnlyMap.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 4:
                    javaOnlyMap.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(nextKey);
                    if (map == null || !map.hasKey("nodeTag") || map.getType("nodeTag") != ReadableType.Number) {
                        javaOnlyMap.putMap(nextKey, k(map));
                        break;
                    } else {
                        com.facebook.react.animated.b k10 = this.f21332f.k(map.getInt("nodeTag"));
                        if (k10 == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (!(k10 instanceof x)) {
                            if (!(k10 instanceof f)) {
                                break;
                            } else {
                                javaOnlyMap.putInt(nextKey, ((f) k10).i());
                                break;
                            }
                        } else {
                            x xVar = (x) k10;
                            Object k11 = xVar.k();
                            if (!(k11 instanceof Integer)) {
                                if (!(k11 instanceof String)) {
                                    javaOnlyMap.putDouble(nextKey, xVar.l());
                                    break;
                                } else {
                                    javaOnlyMap.putString(nextKey, (String) k11);
                                    break;
                                }
                            } else {
                                javaOnlyMap.putInt(nextKey, ((Number) k11).intValue());
                                break;
                            }
                        }
                    }
                case 6:
                    javaOnlyMap.putArray(nextKey, j(readableMap.getArray(nextKey)));
                    break;
            }
        }
        return javaOnlyMap;
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "ObjectAnimatedNode[" + this.f21267d + "]: mConfig: " + this.f21333g;
    }

    public final void i(String propKey, JavaOnlyMap propsMap) {
        Intrinsics.checkNotNullParameter(propKey, "propKey");
        Intrinsics.checkNotNullParameter(propsMap, "propsMap");
        ReadableType type = this.f21333g.getType("value");
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        if (type == ReadableType.Map) {
            propsMap.putMap(propKey, k(this.f21333g.getMap("value")));
        } else {
            if (type != ReadableType.Array) {
                throw new IllegalArgumentException("Invalid value type for ObjectAnimatedNode");
            }
            propsMap.putArray(propKey, j(this.f21333g.getArray("value")));
        }
    }
}
