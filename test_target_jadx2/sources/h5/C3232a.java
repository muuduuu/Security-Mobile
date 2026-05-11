package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3232a extends AbstractC1943g {
    public C3232a(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void a(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals(ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER)) {
            ((InterfaceC3234b) this.f22417a).closeDrawer(view);
        } else if (str.equals(ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER)) {
            ((InterfaceC3234b) this.f22417a).openDrawer(view);
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "statusBarBackgroundColor":
                ((InterfaceC3234b) this.f22417a).setStatusBarBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "drawerBackgroundColor":
                ((InterfaceC3234b) this.f22417a).setDrawerBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "keyboardDismissMode":
                ((InterfaceC3234b) this.f22417a).setKeyboardDismissMode(view, (String) obj);
                break;
            case "drawerWidth":
                ((InterfaceC3234b) this.f22417a).setDrawerWidth(view, obj == null ? null : Float.valueOf(((Double) obj).floatValue()));
                break;
            case "drawerPosition":
                ((InterfaceC3234b) this.f22417a).setDrawerPosition(view, (String) obj);
                break;
            case "drawerLockMode":
                ((InterfaceC3234b) this.f22417a).setDrawerLockMode(view, (String) obj);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
