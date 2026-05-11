package h5;

import android.view.View;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3248i extends AbstractC1943g {
    public C3248i(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "disableAutoLayout":
                ((InterfaceC3250j) this.f22417a).setDisableAutoLayout(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "enableInstrumentation":
                ((InterfaceC3250j) this.f22417a).setEnableInstrumentation(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "scrollOffset":
                ((InterfaceC3250j) this.f22417a).setScrollOffset(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "horizontal":
                ((InterfaceC3250j) this.f22417a).setHorizontal(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "renderAheadOffset":
                ((InterfaceC3250j) this.f22417a).setRenderAheadOffset(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case "windowSize":
                ((InterfaceC3250j) this.f22417a).setWindowSize(view, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
