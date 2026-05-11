package h5;

import android.view.View;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3271u extends AbstractC1943g {
    public C3271u(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        if (str.equals("visible")) {
            ((InterfaceC3273v) this.f22417a).setVisible(view, obj == null ? false : ((Boolean) obj).booleanValue());
        } else {
            super.b(view, str, obj);
        }
    }
}
