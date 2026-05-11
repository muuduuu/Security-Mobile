package h5;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3282z0 extends AbstractC1943g {
    public C3282z0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "gradientUnits":
                ((A0) this.f22417a).setGradientUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "opacity":
                ((A0) this.f22417a).setOpacity(view, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case "matrix":
                ((A0) this.f22417a).setMatrix(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((A0) this.f22417a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((A0) this.f22417a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "pointerEvents":
                ((A0) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "x1":
                ((A0) this.f22417a).setX1(view, new DynamicFromObject(obj));
                break;
            case "x2":
                ((A0) this.f22417a).setX2(view, new DynamicFromObject(obj));
                break;
            case "y1":
                ((A0) this.f22417a).setY1(view, new DynamicFromObject(obj));
                break;
            case "y2":
                ((A0) this.f22417a).setY2(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((A0) this.f22417a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((A0) this.f22417a).setName(view, obj != null ? (String) obj : null);
                break;
            case "gradient":
                ((A0) this.f22417a).setGradient(view, (ReadableArray) obj);
                break;
            case "markerStart":
                ((A0) this.f22417a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "clipPath":
                ((A0) this.f22417a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((A0) this.f22417a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((A0) this.f22417a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "gradientTransform":
                ((A0) this.f22417a).setGradientTransform(view, (ReadableArray) obj);
                break;
            case "responsible":
                ((A0) this.f22417a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
