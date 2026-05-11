package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class P0 extends AbstractC1943g {
    public P0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "vbHeight":
                ((Q0) this.f22417a).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "filter":
                ((Q0) this.f22417a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                ((Q0) this.f22417a).setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((Q0) this.f22417a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((Q0) this.f22417a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((Q0) this.f22417a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((Q0) this.f22417a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((Q0) this.f22417a).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((Q0) this.f22417a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((Q0) this.f22417a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((Q0) this.f22417a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((Q0) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((Q0) this.f22417a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((Q0) this.f22417a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fill":
                ((Q0) this.f22417a).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((Q0) this.f22417a).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((Q0) this.f22417a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "minX":
                ((Q0) this.f22417a).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "minY":
                ((Q0) this.f22417a).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "name":
                ((Q0) this.f22417a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((Q0) this.f22417a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "align":
                ((Q0) this.f22417a).setAlign(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((Q0) this.f22417a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((Q0) this.f22417a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((Q0) this.f22417a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "vbWidth":
                ((Q0) this.f22417a).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fontSize":
                ((Q0) this.f22417a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((Q0) this.f22417a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((Q0) this.f22417a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((Q0) this.f22417a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((Q0) this.f22417a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((Q0) this.f22417a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((Q0) this.f22417a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((Q0) this.f22417a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "meetOrSlice":
                ((Q0) this.f22417a).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeWidth":
                ((Q0) this.f22417a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
