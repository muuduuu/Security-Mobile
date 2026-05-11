package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3240e extends AbstractC1943g {
    public C3240e(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void a(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeRefreshing")) {
            ((InterfaceC3242f) this.f22417a).setNativeRefreshing(view, readableArray.getBoolean(0));
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "enabled":
                ((InterfaceC3242f) this.f22417a).setEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "colors":
                ((InterfaceC3242f) this.f22417a).setColors(view, (ReadableArray) obj);
                break;
            case "progressBackgroundColor":
                ((InterfaceC3242f) this.f22417a).setProgressBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "progressViewOffset":
                ((InterfaceC3242f) this.f22417a).setProgressViewOffset(view, obj == null ? 0.0f : ((Double) obj).floatValue());
                break;
            case "refreshing":
                ((InterfaceC3242f) this.f22417a).setRefreshing(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "size":
                ((InterfaceC3242f) this.f22417a).setSize(view, (String) obj);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
