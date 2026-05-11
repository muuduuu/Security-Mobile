package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3277x extends AbstractC1943g {
    public C3277x(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "vertical":
                ((InterfaceC3279y) this.f22417a).setVertical(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "maximumTrackTintColor":
                ((InterfaceC3279y) this.f22417a).setMaximumTrackTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "thumbImage":
                ((InterfaceC3279y) this.f22417a).setThumbImage(view, (ReadableMap) obj);
                break;
            case "upperLimit":
                ((InterfaceC3279y) this.f22417a).setUpperLimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "minimumTrackTintColor":
                ((InterfaceC3279y) this.f22417a).setMinimumTrackTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "maximumTrackImage":
                ((InterfaceC3279y) this.f22417a).setMaximumTrackImage(view, (ReadableMap) obj);
                break;
            case "testID":
                ((InterfaceC3279y) this.f22417a).setTestID(view, obj != null ? (String) obj : null);
                break;
            case "step":
                ((InterfaceC3279y) this.f22417a).setStep(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "value":
                ((InterfaceC3279y) this.f22417a).setValue(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "disabled":
                ((InterfaceC3279y) this.f22417a).setDisabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "inverted":
                ((InterfaceC3279y) this.f22417a).setInverted(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "accessibilityIncrements":
                ((InterfaceC3279y) this.f22417a).setAccessibilityIncrements(view, (ReadableArray) obj);
                break;
            case "maximumValue":
                ((InterfaceC3279y) this.f22417a).setMaximumValue(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "trackImage":
                ((InterfaceC3279y) this.f22417a).setTrackImage(view, (ReadableMap) obj);
                break;
            case "accessibilityUnits":
                ((InterfaceC3279y) this.f22417a).setAccessibilityUnits(view, obj != null ? (String) obj : null);
                break;
            case "tapToSeek":
                ((InterfaceC3279y) this.f22417a).setTapToSeek(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "minimumValue":
                ((InterfaceC3279y) this.f22417a).setMinimumValue(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "lowerLimit":
                ((InterfaceC3279y) this.f22417a).setLowerLimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "minimumTrackImage":
                ((InterfaceC3279y) this.f22417a).setMinimumTrackImage(view, (ReadableMap) obj);
                break;
            case "thumbTintColor":
                ((InterfaceC3279y) this.f22417a).setThumbTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
