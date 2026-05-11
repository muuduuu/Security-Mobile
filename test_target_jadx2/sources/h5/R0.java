package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class R0 extends AbstractC1943g {
    public R0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "lengthAdjust":
                ((S0) this.f22417a).setLengthAdjust(view, obj != null ? (String) obj : null);
                break;
            case "filter":
                ((S0) this.f22417a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                ((S0) this.f22417a).setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "alignmentBaseline":
                ((S0) this.f22417a).setAlignmentBaseline(view, obj != null ? (String) obj : null);
                break;
            case "verticalAlign":
                ((S0) this.f22417a).setVerticalAlign(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((S0) this.f22417a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((S0) this.f22417a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((S0) this.f22417a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((S0) this.f22417a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "rotate":
                ((S0) this.f22417a).setRotate(view, new DynamicFromObject(obj));
                break;
            case "stroke":
                ((S0) this.f22417a).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((S0) this.f22417a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((S0) this.f22417a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((S0) this.f22417a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((S0) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((S0) this.f22417a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((S0) this.f22417a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((S0) this.f22417a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((S0) this.f22417a).setY(view, new DynamicFromObject(obj));
                break;
            case "dx":
                ((S0) this.f22417a).setDx(view, new DynamicFromObject(obj));
                break;
            case "dy":
                ((S0) this.f22417a).setDy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((S0) this.f22417a).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((S0) this.f22417a).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((S0) this.f22417a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((S0) this.f22417a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((S0) this.f22417a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((S0) this.f22417a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((S0) this.f22417a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((S0) this.f22417a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "baselineShift":
                ((S0) this.f22417a).setBaselineShift(view, new DynamicFromObject(obj));
                break;
            case "fontSize":
                ((S0) this.f22417a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((S0) this.f22417a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "inlineSize":
                ((S0) this.f22417a).setInlineSize(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((S0) this.f22417a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((S0) this.f22417a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "content":
                ((S0) this.f22417a).setContent(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinecap":
                ((S0) this.f22417a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "textLength":
                ((S0) this.f22417a).setTextLength(view, new DynamicFromObject(obj));
                break;
            case "display":
                ((S0) this.f22417a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((S0) this.f22417a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((S0) this.f22417a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((S0) this.f22417a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
