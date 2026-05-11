package h5;

import android.view.View;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3252k extends AbstractC1943g {
    public C3252k(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        if (str.equals("index")) {
            ((InterfaceC3254l) this.f22417a).setIndex(view, obj == null ? 0 : ((Double) obj).intValue());
        } else {
            super.b(view, str, obj);
        }
    }
}
