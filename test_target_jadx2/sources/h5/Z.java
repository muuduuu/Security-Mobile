package h5;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class Z extends AbstractC1943g {
    public Z(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "opacity":
                ((InterfaceC3233a0) this.f22417a).setOpacity(view, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case "matrix":
                ((InterfaceC3233a0) this.f22417a).setMatrix(view, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((InterfaceC3233a0) this.f22417a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((InterfaceC3233a0) this.f22417a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case "pointerEvents":
                ((InterfaceC3233a0) this.f22417a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case "mask":
                ((InterfaceC3233a0) this.f22417a).setMask(view, obj != null ? (String) obj : null);
                break;
            case "name":
                ((InterfaceC3233a0) this.f22417a).setName(view, obj != null ? (String) obj : null);
                break;
            case "markerStart":
                ((InterfaceC3233a0) this.f22417a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case "clipPath":
                ((InterfaceC3233a0) this.f22417a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((InterfaceC3233a0) this.f22417a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((InterfaceC3233a0) this.f22417a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case "responsible":
                ((InterfaceC3233a0) this.f22417a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
