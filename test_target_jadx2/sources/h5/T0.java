package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class T0 extends AbstractC1943g {
    public T0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "lengthAdjust":
                ((U0) this.f22417a).setLengthAdjust(view, obj != null ? (String) obj : null);
                break;
            case "filter":
                ((U0) this.f22417a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case "opacity":
                ((U0) this.f22417a).setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "alignmentBaseline":
                ((U0) this.f22417a).setAlignmentBaseline(view, obj != null ? (String) obj : null);
                break;
            case "verticalAlign":
                ((U0) this.f22417a).setVerticalAlign(view, new DynamicFromObject(obj));
                break;
            case "matrix":
                ((U0) this.f22417a).setMatrix(view, (ReadableArray) obj);
                break;
            case "propList":
                ((U0) this.f22417a).setPropList(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((U0) this.f22417a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((U0) this.f22417a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "rotate":
                ((U0) this.f22417a).setRotate(view, new DynamicFromObject(obj));
                break;
            case "stroke":
                ((U0) this.f22417a).setStroke(view, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((U0) this.f22417a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((U0) this.f22417a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((U0) this.f22417a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((U0) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((U0) this.f22417a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((U0) this.f22417a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "x":
                ((U0) this.f22417a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((U0) this.f22417a).setY(view, new DynamicFromObject(obj));
                break;
            case "dx":
                ((U0) this.f22417a).setDx(view, new DynamicFromObject(obj));
                break;
            case "dy":
                ((U0) this.f22417a).setDy(view, new DynamicFromObject(obj));
                break;
            case "fill":
                ((U0) this.f22417a).setFill(view, new DynamicFromObject(obj));
                break;
            case "font":
                ((U0) this.f22417a).setFont(view, new DynamicFromObject(obj));
                break;
            case "mask":
                ((U0) this.f22417a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((U0) this.f22417a).setName(view, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((U0) this.f22417a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((U0) this.f22417a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "vectorEffect":
                ((U0) this.f22417a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((U0) this.f22417a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "baselineShift":
                ((U0) this.f22417a).setBaselineShift(view, new DynamicFromObject(obj));
                break;
            case "fontSize":
                ((U0) this.f22417a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((U0) this.f22417a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case "inlineSize":
                ((U0) this.f22417a).setInlineSize(view, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((U0) this.f22417a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((U0) this.f22417a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((U0) this.f22417a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "textLength":
                ((U0) this.f22417a).setTextLength(view, new DynamicFromObject(obj));
                break;
            case "display":
                ((U0) this.f22417a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((U0) this.f22417a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((U0) this.f22417a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((U0) this.f22417a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
