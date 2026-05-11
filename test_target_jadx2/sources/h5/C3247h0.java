package h5;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3247h0 extends AbstractC1943g {
    public C3247h0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "floodColor":
                ((InterfaceC3249i0) this.f22417a).setFloodColor(view, new DynamicFromObject(obj));
                break;
            case "height":
                ((InterfaceC3249i0) this.f22417a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "floodOpacity":
                ((InterfaceC3249i0) this.f22417a).setFloodOpacity(view, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case "result":
                ((InterfaceC3249i0) this.f22417a).setResult(view, obj == null ? null : (String) obj);
                break;
            case "x":
                ((InterfaceC3249i0) this.f22417a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC3249i0) this.f22417a).setY(view, new DynamicFromObject(obj));
                break;
            case "width":
                ((InterfaceC3249i0) this.f22417a).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
