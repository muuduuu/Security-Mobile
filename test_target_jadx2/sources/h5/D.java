package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class D extends AbstractC1943g {
    public D(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "rippleRadius":
                ((E) this.f22417a).setRippleRadius(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "enabled":
                ((E) this.f22417a).setEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "rippleColor":
                ((E) this.f22417a).setRippleColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderColor":
                ((E) this.f22417a).setBorderColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderStyle":
                ((E) this.f22417a).setBorderStyle(view, obj == null ? "solid" : (String) obj);
                break;
            case "borderWidth":
                ((E) this.f22417a).setBorderWidth(view, obj == null ? 0.0f : ((Double) obj).floatValue());
                break;
            case "touchSoundDisabled":
                ((E) this.f22417a).setTouchSoundDisabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "exclusive":
                ((E) this.f22417a).setExclusive(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "borderless":
                ((E) this.f22417a).setBorderless(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "foreground":
                ((E) this.f22417a).setForeground(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
