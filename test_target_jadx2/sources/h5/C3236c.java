package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;
import org.conscrypt.BuildConfig;

/* renamed from: h5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3236c extends AbstractC1943g {
    public C3236c(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "progress":
                ((InterfaceC3238d) this.f22417a).setProgress(view, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case "testID":
                ((InterfaceC3238d) this.f22417a).setTestID(view, obj == null ? BuildConfig.FLAVOR : (String) obj);
                break;
            case "typeAttr":
                ((InterfaceC3238d) this.f22417a).setTypeAttr(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((InterfaceC3238d) this.f22417a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "indeterminate":
                ((InterfaceC3238d) this.f22417a).setIndeterminate(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animating":
                ((InterfaceC3238d) this.f22417a).setAnimating(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "styleAttr":
                ((InterfaceC3238d) this.f22417a).setStyleAttr(view, obj != null ? (String) obj : null);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
