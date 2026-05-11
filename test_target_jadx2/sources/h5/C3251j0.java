package h5;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3251j0 extends AbstractC1943g {
    public C3251j0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "height":
                ((InterfaceC3253k0) this.f22417a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((InterfaceC3253k0) this.f22417a).setResult(view, obj != null ? (String) obj : null);
                break;
            case "x":
                ((InterfaceC3253k0) this.f22417a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC3253k0) this.f22417a).setY(view, new DynamicFromObject(obj));
                break;
            case "in1":
                ((InterfaceC3253k0) this.f22417a).setIn1(view, obj != null ? (String) obj : null);
                break;
            case "width":
                ((InterfaceC3253k0) this.f22417a).setWidth(view, new DynamicFromObject(obj));
                break;
            case "edgeMode":
                ((InterfaceC3253k0) this.f22417a).setEdgeMode(view, (String) obj);
                break;
            case "stdDeviationX":
                ((InterfaceC3253k0) this.f22417a).setStdDeviationX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "stdDeviationY":
                ((InterfaceC3253k0) this.f22417a).setStdDeviationY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
