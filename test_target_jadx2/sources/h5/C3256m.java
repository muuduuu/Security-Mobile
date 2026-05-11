package h5;

import android.view.View;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3256m extends AbstractC1943g {
    public C3256m(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "enabled":
                ((InterfaceC3258n) this.f22417a).setEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "statusBarTranslucent":
                ((InterfaceC3258n) this.f22417a).setStatusBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "preserveEdgeToEdge":
                ((InterfaceC3258n) this.f22417a).setPreserveEdgeToEdge(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "navigationBarTranslucent":
                ((InterfaceC3258n) this.f22417a).setNavigationBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
