package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3244g extends AbstractC1943g {
    public C3244g(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void a(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            ((InterfaceC3246h) this.f22417a).setNativeValue(view, readableArray.getBoolean(0));
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "thumbColor":
                ((InterfaceC3246h) this.f22417a).setThumbColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "enabled":
                ((InterfaceC3246h) this.f22417a).setEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "trackTintColor":
                ((InterfaceC3246h) this.f22417a).setTrackTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "on":
                ((InterfaceC3246h) this.f22417a).setOn(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "value":
                ((InterfaceC3246h) this.f22417a).setValue(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "disabled":
                ((InterfaceC3246h) this.f22417a).setDisabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "trackColorForFalse":
                ((InterfaceC3246h) this.f22417a).setTrackColorForFalse(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "thumbTintColor":
                ((InterfaceC3246h) this.f22417a).setThumbTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "trackColorForTrue":
                ((InterfaceC3246h) this.f22417a).setTrackColorForTrue(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
