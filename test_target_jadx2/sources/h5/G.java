package h5;

import android.view.View;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public abstract class G extends AbstractC1943g {
    public G(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "size":
                ((H) this.f22417a).setSize(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "color":
                ((H) this.f22417a).setColor(view, (String) obj);
                break;
            case "disabled":
                ((H) this.f22417a).setDisabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
