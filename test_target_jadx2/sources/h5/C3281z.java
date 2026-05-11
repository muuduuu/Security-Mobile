package h5;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3281z extends AbstractC1943g {
    public C3281z(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void a(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        switch (str) {
            case "setPageWithoutAnimation":
                ((InterfaceC3231A) this.f22417a).setPageWithoutAnimation(view, readableArray.getInt(0));
                break;
            case "setScrollEnabledImperatively":
                ((InterfaceC3231A) this.f22417a).setScrollEnabledImperatively(view, readableArray.getBoolean(0));
                break;
            case "setPage":
                ((InterfaceC3231A) this.f22417a).setPage(view, readableArray.getInt(0));
                break;
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "layoutDirection":
                ((InterfaceC3231A) this.f22417a).setLayoutDirection(view, (String) obj);
                break;
            case "offscreenPageLimit":
                ((InterfaceC3231A) this.f22417a).setOffscreenPageLimit(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "orientation":
                ((InterfaceC3231A) this.f22417a).setOrientation(view, (String) obj);
                break;
            case "overScrollMode":
                ((InterfaceC3231A) this.f22417a).setOverScrollMode(view, (String) obj);
                break;
            case "scrollEnabled":
                ((InterfaceC3231A) this.f22417a).setScrollEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "keyboardDismissMode":
                ((InterfaceC3231A) this.f22417a).setKeyboardDismissMode(view, (String) obj);
                break;
            case "useLegacy":
                ((InterfaceC3231A) this.f22417a).setUseLegacy(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "overdrag":
                ((InterfaceC3231A) this.f22417a).setOverdrag(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "pageMargin":
                ((InterfaceC3231A) this.f22417a).setPageMargin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "initialPage":
                ((InterfaceC3231A) this.f22417a).setInitialPage(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
