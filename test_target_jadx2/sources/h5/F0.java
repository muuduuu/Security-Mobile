package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class F0 extends AbstractC1943g {
    public F0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "filter":
                ((G0) this.f22417a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                ((G0) this.f22417a).setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((G0) this.f22417a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((G0) this.f22417a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((G0) this.f22417a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((G0) this.f22417a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((G0) this.f22417a).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((G0) this.f22417a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((G0) this.f22417a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((G0) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((G0) this.f22417a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((G0) this.f22417a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "d":
                ((G0) this.f22417a).setD(view, obj != null ? (String) obj : null);
                break;
            case "fill":
                ((G0) this.f22417a).setFill(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((G0) this.f22417a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((G0) this.f22417a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((G0) this.f22417a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((G0) this.f22417a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((G0) this.f22417a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((G0) this.f22417a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((G0) this.f22417a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((G0) this.f22417a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((G0) this.f22417a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((G0) this.f22417a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((G0) this.f22417a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((G0) this.f22417a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((G0) this.f22417a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((G0) this.f22417a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
