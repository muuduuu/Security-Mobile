package h5;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3267s extends AbstractC1943g {
    public C3267s(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "presentationStyle":
                ((InterfaceC3269t) this.f22417a).setPresentationStyle(view, (String) obj);
                break;
            case "supportedOrientations":
                ((InterfaceC3269t) this.f22417a).setSupportedOrientations(view, (ReadableArray) obj);
                break;
            case "transparent":
                ((InterfaceC3269t) this.f22417a).setTransparent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "identifier":
                ((InterfaceC3269t) this.f22417a).setIdentifier(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "statusBarTranslucent":
                ((InterfaceC3269t) this.f22417a).setStatusBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animated":
                ((InterfaceC3269t) this.f22417a).setAnimated(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "visible":
                ((InterfaceC3269t) this.f22417a).setVisible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "hardwareAccelerated":
                ((InterfaceC3269t) this.f22417a).setHardwareAccelerated(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animationType":
                ((InterfaceC3269t) this.f22417a).setAnimationType(view, (String) obj);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
