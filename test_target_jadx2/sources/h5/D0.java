package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class D0 extends AbstractC1943g {
    public D0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "filter":
                ((E0) this.f22417a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                ((E0) this.f22417a).setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "height":
                ((E0) this.f22417a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((E0) this.f22417a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((E0) this.f22417a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((E0) this.f22417a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((E0) this.f22417a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((E0) this.f22417a).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((E0) this.f22417a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((E0) this.f22417a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((E0) this.f22417a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((E0) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "maskUnits":
                ((E0) this.f22417a).setMaskUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "fillOpacity":
                ((E0) this.f22417a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((E0) this.f22417a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((E0) this.f22417a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((E0) this.f22417a).setY(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((E0) this.f22417a).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((E0) this.f22417a).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((E0) this.f22417a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((E0) this.f22417a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((E0) this.f22417a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((E0) this.f22417a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((E0) this.f22417a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "width":
                ((E0) this.f22417a).setWidth(view, new DynamicFromObject(obj));
                break;
            case "markerStart":
                ((E0) this.f22417a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "maskType":
                ((E0) this.f22417a).setMaskType(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "fontSize":
                ((E0) this.f22417a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((E0) this.f22417a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((E0) this.f22417a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((E0) this.f22417a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((E0) this.f22417a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((E0) this.f22417a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((E0) this.f22417a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((E0) this.f22417a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((E0) this.f22417a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            case "maskContentUnits":
                ((E0) this.f22417a).setMaskContentUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
