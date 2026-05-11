package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class X extends AbstractC1943g {
    public X(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "filter":
                ((Y) this.f22417a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                ((Y) this.f22417a).setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((Y) this.f22417a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((Y) this.f22417a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((Y) this.f22417a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((Y) this.f22417a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((Y) this.f22417a).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((Y) this.f22417a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((Y) this.f22417a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((Y) this.f22417a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((Y) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((Y) this.f22417a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((Y) this.f22417a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fill":
                ((Y) this.f22417a).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((Y) this.f22417a).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((Y) this.f22417a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((Y) this.f22417a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((Y) this.f22417a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((Y) this.f22417a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((Y) this.f22417a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((Y) this.f22417a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "fontSize":
                ((Y) this.f22417a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((Y) this.f22417a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((Y) this.f22417a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((Y) this.f22417a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((Y) this.f22417a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((Y) this.f22417a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((Y) this.f22417a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((Y) this.f22417a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((Y) this.f22417a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
