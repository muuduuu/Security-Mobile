package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.rssignaturecapture.RSSignatureCaptureViewManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f22461a = new m1();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f22462b = {8, 4, 5, 1, 3, 0, 2};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f22463c = {8, 7, 6, 4, 5, 1, 3, 0, 2};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f22464d = {4, 5, 1, 3};

    /* renamed from: e, reason: collision with root package name */
    private static final HashSet f22465e = new HashSet(Arrays.asList("alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "rowGap", "columnGap", "gap", "flexShrink", "flexWrap", "justifyContent", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd"));

    private m1() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean a(ReadableMap map, String prop) {
        ReadableType type;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(prop, "prop");
        if (f22465e.contains(prop)) {
            return true;
        }
        if (Intrinsics.b("pointerEvents", prop)) {
            String string = map.getString(prop);
            return Intrinsics.b("auto", string) || Intrinsics.b("box-none", string);
        }
        switch (prop.hashCode()) {
            case -1989576717:
                if (prop.equals("borderRightColor") && map.getType("borderRightColor") == ReadableType.Number && map.getInt("borderRightColor") == 0) {
                    return true;
                }
                break;
            case -1971292586:
                if (prop.equals("borderRightWidth") && (map.isNull("borderRightWidth") || map.getDouble("borderRightWidth") == 0.0d)) {
                    return true;
                }
                break;
            case -1470826662:
                if (prop.equals("borderTopColor") && map.getType("borderTopColor") == ReadableType.Number && map.getInt("borderTopColor") == 0) {
                    return true;
                }
                break;
            case -1452542531:
                if (prop.equals("borderTopWidth") && (map.isNull("borderTopWidth") || map.getDouble("borderTopWidth") == 0.0d)) {
                    return true;
                }
                break;
            case -1308858324:
                if (prop.equals("borderBottomColor") && map.getType("borderBottomColor") == ReadableType.Number && map.getInt("borderBottomColor") == 0) {
                    return true;
                }
                break;
            case -1290574193:
                if (prop.equals("borderBottomWidth") && (map.isNull("borderBottomWidth") || map.getDouble("borderBottomWidth") == 0.0d)) {
                    return true;
                }
                break;
            case -1267206133:
                if (prop.equals("opacity") && (map.isNull("opacity") || map.getDouble("opacity") == 1.0d)) {
                    return true;
                }
                break;
            case -242276144:
                if (prop.equals("borderLeftColor") && map.getType("borderLeftColor") == ReadableType.Number && map.getInt("borderLeftColor") == 0) {
                    return true;
                }
                break;
            case -223992013:
                if (prop.equals("borderLeftWidth") && (map.isNull("borderLeftWidth") || map.getDouble("borderLeftWidth") == 0.0d)) {
                    return true;
                }
                break;
            case 306963138:
                if (prop.equals("borderBlockStartColor") && map.getType("borderBlockStartColor") == ReadableType.Number && map.getInt("borderBlockStartColor") == 0) {
                    return true;
                }
                break;
            case 529642498:
                if (prop.equals("overflow") && (map.isNull("overflow") || Intrinsics.b("visible", map.getString("overflow")))) {
                    return true;
                }
                break;
            case 684610594:
                if (prop.equals("borderBlockColor") && map.getType("borderBlockColor") == ReadableType.Number && map.getInt("borderBlockColor") == 0) {
                    return true;
                }
                break;
            case 741115130:
                if (prop.equals("borderWidth") && (map.isNull("borderWidth") || map.getDouble("borderWidth") == 0.0d)) {
                    return true;
                }
                break;
            case 762983977:
                if (prop.equals("borderBlockEndColor") && map.getType("borderBlockEndColor") == ReadableType.Number && map.getInt("borderBlockEndColor") == 0) {
                    return true;
                }
                break;
            case 1349188574:
                if (prop.equals(Snapshot.BORDER_RADIUS)) {
                    if (!map.hasKey(RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR) || (((type = map.getType(RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR)) != ReadableType.Number || map.getInt(RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR) == 0) && type == ReadableType.Null)) {
                        return !map.hasKey("borderWidth") || map.isNull("borderWidth") || map.getDouble("borderWidth") == 0.0d;
                    }
                    return false;
                }
                break;
        }
        return false;
    }
}
