package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class T extends AbstractC1943g {
    public T(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void a(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        switch (str) {
            case "cancelSearch":
                ((U) this.f22417a).cancelSearch(view);
                break;
            case "clearText":
                ((U) this.f22417a).clearText(view);
                break;
            case "toggleCancelButton":
                ((U) this.f22417a).toggleCancelButton(view, readableArray.getBoolean(0));
                break;
            case "blur":
                ((U) this.f22417a).blur(view);
                break;
            case "focus":
                ((U) this.f22417a).focus(view);
                break;
            case "setText":
                ((U) this.f22417a).setText(view, readableArray.getString(0));
                break;
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "hideNavigationBar":
                ((U) this.f22417a).setHideNavigationBar(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "headerIconColor":
                ((U) this.f22417a).setHeaderIconColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "autoCapitalize":
                ((U) this.f22417a).setAutoCapitalize(view, (String) obj);
                break;
            case "textColor":
                ((U) this.f22417a).setTextColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "barTintColor":
                ((U) this.f22417a).setBarTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "hintTextColor":
                ((U) this.f22417a).setHintTextColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "hideWhenScrolling":
                ((U) this.f22417a).setHideWhenScrolling(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "cancelButtonText":
                ((U) this.f22417a).setCancelButtonText(view, obj != null ? (String) obj : null);
                break;
            case "disableBackButtonOverride":
                ((U) this.f22417a).setDisableBackButtonOverride(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "shouldShowHintSearchIcon":
                ((U) this.f22417a).setShouldShowHintSearchIcon(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "placeholder":
                ((U) this.f22417a).setPlaceholder(view, obj != null ? (String) obj : null);
                break;
            case "tintColor":
                ((U) this.f22417a).setTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "obscureBackground":
                ((U) this.f22417a).setObscureBackground(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "inputType":
                ((U) this.f22417a).setInputType(view, obj != null ? (String) obj : null);
                break;
            case "placement":
                ((U) this.f22417a).setPlacement(view, (String) obj);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
