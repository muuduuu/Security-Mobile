package h5;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC1943g;
import com.facebook.react.uimanager.InterfaceC1945h;

/* renamed from: h5.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3264q extends AbstractC1943g {
    public C3264q(InterfaceC1945h interfaceC1945h) {
        super(interfaceC1945h);
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void a(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        switch (str) {
            case "resume":
                ((r) this.f22417a).resume(view);
                break;
            case "play":
                ((r) this.f22417a).play(view, readableArray.getInt(0), readableArray.getInt(1));
                break;
            case "pause":
                ((r) this.f22417a).pause(view);
                break;
            case "reset":
                ((r) this.f22417a).reset(view);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC1943g, com.facebook.react.uimanager.c1
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "imageAssetsFolder":
                ((r) this.f22417a).setImageAssetsFolder(view, obj != null ? (String) obj : null);
                break;
            case "sourceURL":
                ((r) this.f22417a).setSourceURL(view, obj != null ? (String) obj : null);
                break;
            case "textFiltersIOS":
                ((r) this.f22417a).setTextFiltersIOS(view, (ReadableArray) obj);
                break;
            case "sourceJson":
                ((r) this.f22417a).setSourceJson(view, obj != null ? (String) obj : null);
                break;
            case "sourceName":
                ((r) this.f22417a).setSourceName(view, obj != null ? (String) obj : null);
                break;
            case "cacheComposition":
                ((r) this.f22417a).setCacheComposition(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "progress":
                ((r) this.f22417a).setProgress(view, obj == null ? 0.0f : ((Double) obj).floatValue());
                break;
            case "textFiltersAndroid":
                ((r) this.f22417a).setTextFiltersAndroid(view, (ReadableArray) obj);
                break;
            case "sourceDotLottieURI":
                ((r) this.f22417a).setSourceDotLottieURI(view, obj != null ? (String) obj : null);
                break;
            case "loop":
                ((r) this.f22417a).setLoop(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "dummy":
                ((r) this.f22417a).setDummy(view, (ReadableMap) obj);
                break;
            case "speed":
                ((r) this.f22417a).setSpeed(view, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case "hardwareAccelerationAndroid":
                ((r) this.f22417a).setHardwareAccelerationAndroid(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "enableSafeModeAndroid":
                ((r) this.f22417a).setEnableSafeModeAndroid(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "renderMode":
                ((r) this.f22417a).setRenderMode(view, obj != null ? (String) obj : null);
                break;
            case "colorFilters":
                ((r) this.f22417a).setColorFilters(view, (ReadableArray) obj);
                break;
            case "autoPlay":
                ((r) this.f22417a).setAutoPlay(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "resizeMode":
                ((r) this.f22417a).setResizeMode(view, obj != null ? (String) obj : null);
                break;
            case "enableMergePathsAndroidForKitKatAndAbove":
                ((r) this.f22417a).setEnableMergePathsAndroidForKitKatAndAbove(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
