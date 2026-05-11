package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class N0 extends AbstractC1943g {
    public N0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "bbHeight":
                ((O0) this.f22417a).setBbHeight(view, new DynamicFromObject(obj));
                break;
            case "borderRightColor":
                ((O0) this.f22417a).setBorderRightColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "backfaceVisibility":
                ((O0) this.f22417a).setBackfaceVisibility(view, obj != null ? (String) obj : null);
                break;
            case "vbHeight":
                ((O0) this.f22417a).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "borderTopColor":
                ((O0) this.f22417a).setBorderTopColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderBottomColor":
                ((O0) this.f22417a).setBorderBottomColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderTopLeftRadius":
                ((O0) this.f22417a).setBorderTopLeftRadius(view, new DynamicFromObject(obj));
                break;
            case "accessible":
                ((O0) this.f22417a).setAccessible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "borderTopStartRadius":
                ((O0) this.f22417a).setBorderTopStartRadius(view, new DynamicFromObject(obj));
                break;
            case "borderBottomStartRadius":
                ((O0) this.f22417a).setBorderBottomStartRadius(view, new DynamicFromObject(obj));
                break;
            case "hasTVPreferredFocus":
                ((O0) this.f22417a).setHasTVPreferredFocus(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "nextFocusDown":
                ((O0) this.f22417a).setNextFocusDown(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "nextFocusLeft":
                ((O0) this.f22417a).setNextFocusLeft(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "borderTopEndRadius":
                ((O0) this.f22417a).setBorderTopEndRadius(view, new DynamicFromObject(obj));
                break;
            case "bbWidth":
                ((O0) this.f22417a).setBbWidth(view, new DynamicFromObject(obj));
                break;
            case "pointerEvents":
                ((O0) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "removeClippedSubviews":
                ((O0) this.f22417a).setRemoveClippedSubviews(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "borderLeftColor":
                ((O0) this.f22417a).setBorderLeftColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderStartEndRadius":
                ((O0) this.f22417a).setBorderStartEndRadius(view, new DynamicFromObject(obj));
                break;
            case "borderBottomEndRadius":
                ((O0) this.f22417a).setBorderBottomEndRadius(view, new DynamicFromObject(obj));
                break;
            case "nativeForegroundAndroid":
                ((O0) this.f22417a).setNativeForegroundAndroid(view, (ReadableMap) obj);
                break;
            case "borderStartStartRadius":
                ((O0) this.f22417a).setBorderStartStartRadius(view, new DynamicFromObject(obj));
                break;
            case "minX":
                ((O0) this.f22417a).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "minY":
                ((O0) this.f22417a).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((O0) this.f22417a).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((O0) this.f22417a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vbWidth":
                ((O0) this.f22417a).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "borderBlockStartColor":
                ((O0) this.f22417a).setBorderBlockStartColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderTopRightRadius":
                ((O0) this.f22417a).setBorderTopRightRadius(view, new DynamicFromObject(obj));
                break;
            case "nextFocusForward":
                ((O0) this.f22417a).setNextFocusForward(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "borderBottomLeftRadius":
                ((O0) this.f22417a).setBorderBottomLeftRadius(view, new DynamicFromObject(obj));
                break;
            case "borderBottomRightRadius":
                ((O0) this.f22417a).setBorderBottomRightRadius(view, new DynamicFromObject(obj));
                break;
            case "nextFocusUp":
                ((O0) this.f22417a).setNextFocusUp(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "borderBlockColor":
                ((O0) this.f22417a).setBorderBlockColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderColor":
                ((O0) this.f22417a).setBorderColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderStyle":
                ((O0) this.f22417a).setBorderStyle(view, obj != null ? (String) obj : null);
                break;
            case "borderBlockEndColor":
                ((O0) this.f22417a).setBorderBlockEndColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderEndStartRadius":
                ((O0) this.f22417a).setBorderEndStartRadius(view, new DynamicFromObject(obj));
                break;
            case "hitSlop":
                ((O0) this.f22417a).setHitSlop(view, new DynamicFromObject(obj));
                break;
            case "borderEndColor":
                ((O0) this.f22417a).setBorderEndColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderRadius":
                ((O0) this.f22417a).setBorderRadius(view, new DynamicFromObject(obj));
                break;
            case "focusable":
                ((O0) this.f22417a).setFocusable(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "needsOffscreenAlphaCompositing":
                ((O0) this.f22417a).setNeedsOffscreenAlphaCompositing(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "borderEndEndRadius":
                ((O0) this.f22417a).setBorderEndEndRadius(view, new DynamicFromObject(obj));
                break;
            case "nativeBackgroundAndroid":
                ((O0) this.f22417a).setNativeBackgroundAndroid(view, (ReadableMap) obj);
                break;
            case "meetOrSlice":
                ((O0) this.f22417a).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "nextFocusRight":
                ((O0) this.f22417a).setNextFocusRight(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "borderStartColor":
                ((O0) this.f22417a).setBorderStartColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
