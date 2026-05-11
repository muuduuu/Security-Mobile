package h5;

import android.view.View;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class P extends AbstractC1943g {
    public P(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        if (str.equals("type")) {
            ((Q) this.f22417a).setType(view, (String) obj);
        } else {
            super.b(view, str, obj);
        }
    }
}
