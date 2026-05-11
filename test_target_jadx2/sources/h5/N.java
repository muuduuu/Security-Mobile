package h5;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* loaded from: classes.dex */
public class N extends AbstractC1943g {
    public N(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "translucent":
                ((O) this.f22417a).setTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "titleColor":
                ((O) this.f22417a).setTitleColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "blurEffect":
                ((O) this.f22417a).setBlurEffect(view, (String) obj);
                break;
            case "largeTitleColor":
                ((O) this.f22417a).setLargeTitleColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "titleFontFamily":
                ((O) this.f22417a).setTitleFontFamily(view, obj != null ? (String) obj : null);
                break;
            case "disableBackButtonMenu":
                ((O) this.f22417a).setDisableBackButtonMenu(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "titleFontWeight":
                ((O) this.f22417a).setTitleFontWeight(view, obj != null ? (String) obj : null);
                break;
            case "hidden":
                ((O) this.f22417a).setHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "largeTitleFontSize":
                ((O) this.f22417a).setLargeTitleFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "backButtonDisplayMode":
                ((O) this.f22417a).setBackButtonDisplayMode(view, (String) obj);
                break;
            case "backTitleVisible":
                ((O) this.f22417a).setBackTitleVisible(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "direction":
                ((O) this.f22417a).setDirection(view, (String) obj);
                break;
            case "largeTitleBackgroundColor":
                ((O) this.f22417a).setLargeTitleBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "backButtonInCustomView":
                ((O) this.f22417a).setBackButtonInCustomView(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "largeTitleFontFamily":
                ((O) this.f22417a).setLargeTitleFontFamily(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((O) this.f22417a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "title":
                ((O) this.f22417a).setTitle(view, obj != null ? (String) obj : null);
                break;
            case "backTitleFontSize":
                ((O) this.f22417a).setBackTitleFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "backTitleFontFamily":
                ((O) this.f22417a).setBackTitleFontFamily(view, obj != null ? (String) obj : null);
                break;
            case "hideShadow":
                ((O) this.f22417a).setHideShadow(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "largeTitleFontWeight":
                ((O) this.f22417a).setLargeTitleFontWeight(view, obj != null ? (String) obj : null);
                break;
            case "hideBackButton":
                ((O) this.f22417a).setHideBackButton(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "backgroundColor":
                ((O) this.f22417a).setBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "backTitle":
                ((O) this.f22417a).setBackTitle(view, obj != null ? (String) obj : null);
                break;
            case "titleFontSize":
                ((O) this.f22417a).setTitleFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "largeTitleHideShadow":
                ((O) this.f22417a).setLargeTitleHideShadow(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "largeTitle":
                ((O) this.f22417a).setLargeTitle(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "topInsetEnabled":
                ((O) this.f22417a).setTopInsetEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
