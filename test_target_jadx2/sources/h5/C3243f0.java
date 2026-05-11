package h5;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3243f0 extends AbstractC1943g {
    public C3243f0(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "height":
                ((InterfaceC3245g0) this.f22417a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((InterfaceC3245g0) this.f22417a).setResult(view, obj != null ? (String) obj : null);
                break;
            case "values":
                ((InterfaceC3245g0) this.f22417a).setValues(view, (ReadableArray) obj);
                break;
            case "x":
                ((InterfaceC3245g0) this.f22417a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC3245g0) this.f22417a).setY(view, new DynamicFromObject(obj));
                break;
            case "in1":
                ((InterfaceC3245g0) this.f22417a).setIn1(view, obj != null ? (String) obj : null);
                break;
            case "type":
                ((InterfaceC3245g0) this.f22417a).setType(view, (String) obj);
                break;
            case "width":
                ((InterfaceC3245g0) this.f22417a).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
