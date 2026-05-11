package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class H0 extends AbstractC1943g {
    public H0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "vbHeight":
                ((I0) this.f22417a).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "filter":
                ((I0) this.f22417a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                ((I0) this.f22417a).setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "height":
                ((I0) this.f22417a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((I0) this.f22417a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((I0) this.f22417a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((I0) this.f22417a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((I0) this.f22417a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((I0) this.f22417a).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((I0) this.f22417a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((I0) this.f22417a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((I0) this.f22417a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((I0) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "patternUnits":
                ((I0) this.f22417a).setPatternUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "patternContentUnits":
                ((I0) this.f22417a).setPatternContentUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "fillOpacity":
                ((I0) this.f22417a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((I0) this.f22417a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((I0) this.f22417a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((I0) this.f22417a).setY(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((I0) this.f22417a).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((I0) this.f22417a).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((I0) this.f22417a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "minX":
                ((I0) this.f22417a).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "minY":
                ((I0) this.f22417a).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "name":
                ((I0) this.f22417a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((I0) this.f22417a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((I0) this.f22417a).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((I0) this.f22417a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((I0) this.f22417a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "width":
                ((I0) this.f22417a).setWidth(view, new DynamicFromObject(obj));
                break;
            case "markerStart":
                ((I0) this.f22417a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "vbWidth":
                ((I0) this.f22417a).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fontSize":
                ((I0) this.f22417a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((I0) this.f22417a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "patternTransform":
                ((I0) this.f22417a).setPatternTransform(view, (ReadableArray) obj);
                break;
            case "clipPath":
                ((I0) this.f22417a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((I0) this.f22417a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((I0) this.f22417a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((I0) this.f22417a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((I0) this.f22417a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((I0) this.f22417a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "meetOrSlice":
                ((I0) this.f22417a).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeWidth":
                ((I0) this.f22417a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
