package h5;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class J0 extends AbstractC1943g {
    public J0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "gradientUnits":
                ((K0) this.f22417a).setGradientUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "opacity":
                ((K0) this.f22417a).setOpacity(view, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case "matrix":
                ((K0) this.f22417a).setMatrix(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((K0) this.f22417a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((K0) this.f22417a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "pointerEvents":
                ((K0) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "cx":
                ((K0) this.f22417a).setCx(view, new DynamicFromObject(obj));
                break;
            case "cy":
                ((K0) this.f22417a).setCy(view, new DynamicFromObject(obj));
                break;
            case "fx":
                ((K0) this.f22417a).setFx(view, new DynamicFromObject(obj));
                break;
            case "fy":
                ((K0) this.f22417a).setFy(view, new DynamicFromObject(obj));
                break;
            case "rx":
                ((K0) this.f22417a).setRx(view, new DynamicFromObject(obj));
                break;
            case "ry":
                ((K0) this.f22417a).setRy(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((K0) this.f22417a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((K0) this.f22417a).setName(view, obj != null ? (String) obj : null);
                break;
            case "gradient":
                ((K0) this.f22417a).setGradient(view, (ReadableArray) obj);
                break;
            case "markerStart":
                ((K0) this.f22417a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "clipPath":
                ((K0) this.f22417a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((K0) this.f22417a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((K0) this.f22417a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "gradientTransform":
                ((K0) this.f22417a).setGradientTransform(view, (ReadableArray) obj);
                break;
            case "responsible":
                ((K0) this.f22417a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
