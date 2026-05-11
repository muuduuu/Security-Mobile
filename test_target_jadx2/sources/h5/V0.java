package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class V0 extends AbstractC1943g {
    public V0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "spacing":
                ((W0) this.f22417a).setSpacing(view, obj != null ? (String) obj : null);
                break;
            case "startOffset":
                ((W0) this.f22417a).setStartOffset(view, new DynamicFromObject(obj));
                break;
            case "lengthAdjust":
                ((W0) this.f22417a).setLengthAdjust(view, obj != null ? (String) obj : null);
                break;
            case "filter":
                ((W0) this.f22417a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                ((W0) this.f22417a).setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "alignmentBaseline":
                ((W0) this.f22417a).setAlignmentBaseline(view, obj != null ? (String) obj : null);
                break;
            case "verticalAlign":
                ((W0) this.f22417a).setVerticalAlign(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((W0) this.f22417a).setMatrix(view, (ReadableArray) obj);
                break;
            case "method":
                ((W0) this.f22417a).setMethod(view, obj != null ? (String) obj : null);
                break;
            case "propList":
                ((W0) this.f22417a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((W0) this.f22417a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((W0) this.f22417a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "rotate":
                ((W0) this.f22417a).setRotate(view, new DynamicFromObject(obj));
                break;
            case "stroke":
                ((W0) this.f22417a).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((W0) this.f22417a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((W0) this.f22417a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((W0) this.f22417a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((W0) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((W0) this.f22417a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((W0) this.f22417a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((W0) this.f22417a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((W0) this.f22417a).setY(view, new DynamicFromObject(obj));
                break;
            case "dx":
                ((W0) this.f22417a).setDx(view, new DynamicFromObject(obj));
                break;
            case "dy":
                ((W0) this.f22417a).setDy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((W0) this.f22417a).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((W0) this.f22417a).setFont(view, new DynamicFromObject(obj));
                break;
            case "href":
                ((W0) this.f22417a).setHref(view, obj != null ? (String) obj : null);
                break;
            case "mask":
                ((W0) this.f22417a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((W0) this.f22417a).setName(view, obj != null ? (String) obj : null);
                break;
            case "side":
                ((W0) this.f22417a).setSide(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((W0) this.f22417a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((W0) this.f22417a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((W0) this.f22417a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((W0) this.f22417a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "baselineShift":
                ((W0) this.f22417a).setBaselineShift(view, new DynamicFromObject(obj));
                break;
            case "fontSize":
                ((W0) this.f22417a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((W0) this.f22417a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "inlineSize":
                ((W0) this.f22417a).setInlineSize(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((W0) this.f22417a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((W0) this.f22417a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((W0) this.f22417a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "midLine":
                ((W0) this.f22417a).setMidLine(view, obj != null ? (String) obj : null);
                break;
            case "textLength":
                ((W0) this.f22417a).setTextLength(view, new DynamicFromObject(obj));
                break;
            case "display":
                ((W0) this.f22417a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((W0) this.f22417a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((W0) this.f22417a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((W0) this.f22417a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
