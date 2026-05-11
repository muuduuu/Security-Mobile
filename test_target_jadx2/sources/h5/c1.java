package h5;

import android.view.View;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class c1 extends AbstractC1943g {
    public c1(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        if (str.equals("mode")) {
            ((d1) this.f22417a).setMode(view, obj == null ? null : (String) obj);
        } else if (str.equals("debug")) {
            ((d1) this.f22417a).setDebug(view, obj == null ? false : ((Boolean) obj).booleanValue());
        } else {
            super.b(view, str, obj);
        }
    }
}
