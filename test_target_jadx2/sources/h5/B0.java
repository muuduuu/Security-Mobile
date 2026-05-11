package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class B0 extends AbstractC1943g {
    public B0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "vbHeight":
                ((C0) this.f22417a).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "filter":
                ((C0) this.f22417a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                ((C0) this.f22417a).setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((C0) this.f22417a).setMatrix(view, (ReadableArray) obj);
                break;
            case "orient":
                ((C0) this.f22417a).setOrient(view, obj != null ? (String) obj : null);
                break;
            case "propList":
                ((C0) this.f22417a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((C0) this.f22417a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((C0) this.f22417a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((C0) this.f22417a).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((C0) this.f22417a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((C0) this.f22417a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((C0) this.f22417a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((C0) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((C0) this.f22417a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((C0) this.f22417a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fill":
                ((C0) this.f22417a).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((C0) this.f22417a).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((C0) this.f22417a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "minX":
                ((C0) this.f22417a).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "minY":
                ((C0) this.f22417a).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "name":
                ((C0) this.f22417a).setName(view, obj != null ? (String) obj : null);
                break;
            case "refX":
                ((C0) this.f22417a).setRefX(view, new DynamicFromObject(obj));
                break;
            case "refY":
                ((C0) this.f22417a).setRefY(view, new DynamicFromObject(obj));
                break;
            case "strokeMiterlimit":
                ((C0) this.f22417a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((C0) this.f22417a).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((C0) this.f22417a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((C0) this.f22417a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((C0) this.f22417a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "markerUnits":
                ((C0) this.f22417a).setMarkerUnits(view, obj != null ? (String) obj : null);
                break;
            case "markerWidth":
                ((C0) this.f22417a).setMarkerWidth(view, new DynamicFromObject(obj));
                break;
            case "vbWidth":
                ((C0) this.f22417a).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fontSize":
                ((C0) this.f22417a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((C0) this.f22417a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((C0) this.f22417a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((C0) this.f22417a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((C0) this.f22417a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((C0) this.f22417a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((C0) this.f22417a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((C0) this.f22417a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "meetOrSlice":
                ((C0) this.f22417a).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeWidth":
                ((C0) this.f22417a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            case "markerHeight":
                ((C0) this.f22417a).setMarkerHeight(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
