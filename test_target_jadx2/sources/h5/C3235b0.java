package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3235b0 extends AbstractC1943g {
    public C3235b0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "filter":
                ((InterfaceC3237c0) this.f22417a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                ((InterfaceC3237c0) this.f22417a).setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((InterfaceC3237c0) this.f22417a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((InterfaceC3237c0) this.f22417a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((InterfaceC3237c0) this.f22417a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((InterfaceC3237c0) this.f22417a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((InterfaceC3237c0) this.f22417a).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((InterfaceC3237c0) this.f22417a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((InterfaceC3237c0) this.f22417a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((InterfaceC3237c0) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((InterfaceC3237c0) this.f22417a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((InterfaceC3237c0) this.f22417a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "cx":
                ((InterfaceC3237c0) this.f22417a).setCx(view, new DynamicFromObject(obj));
                break;
            case "cy":
                ((InterfaceC3237c0) this.f22417a).setCy(view, new DynamicFromObject(obj));
                break;
            case "rx":
                ((InterfaceC3237c0) this.f22417a).setRx(view, new DynamicFromObject(obj));
                break;
            case "ry":
                ((InterfaceC3237c0) this.f22417a).setRy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((InterfaceC3237c0) this.f22417a).setFill(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((InterfaceC3237c0) this.f22417a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((InterfaceC3237c0) this.f22417a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((InterfaceC3237c0) this.f22417a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((InterfaceC3237c0) this.f22417a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((InterfaceC3237c0) this.f22417a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((InterfaceC3237c0) this.f22417a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((InterfaceC3237c0) this.f22417a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((InterfaceC3237c0) this.f22417a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((InterfaceC3237c0) this.f22417a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((InterfaceC3237c0) this.f22417a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((InterfaceC3237c0) this.f22417a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((InterfaceC3237c0) this.f22417a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((InterfaceC3237c0) this.f22417a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((InterfaceC3237c0) this.f22417a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
