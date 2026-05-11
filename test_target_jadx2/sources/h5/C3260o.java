package h5;

import android.view.View;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3260o extends AbstractC1943g {
    public C3260o(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "showOnSwipeUp":
                ((InterfaceC3262p) this.f22417a).setShowOnSwipeUp(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "offset":
                ((InterfaceC3262p) this.f22417a).setOffset(view, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case "textInputNativeID":
                ((InterfaceC3262p) this.f22417a).setTextInputNativeID(view, obj == null ? null : (String) obj);
                break;
            case "enableSwipeToDismiss":
                ((InterfaceC3262p) this.f22417a).setEnableSwipeToDismiss(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "interpolator":
                ((InterfaceC3262p) this.f22417a).setInterpolator(view, (String) obj);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
