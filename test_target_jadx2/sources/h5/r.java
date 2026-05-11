package h5;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes.dex */
public interface r {
    void pause(View view);

    void play(View view, int i10, int i11);

    void reset(View view);

    void resume(View view);

    void setAutoPlay(View view, boolean z10);

    void setCacheComposition(View view, boolean z10);

    void setColorFilters(View view, ReadableArray readableArray);

    void setDummy(View view, ReadableMap readableMap);

    void setEnableMergePathsAndroidForKitKatAndAbove(View view, boolean z10);

    void setEnableSafeModeAndroid(View view, boolean z10);

    void setHardwareAccelerationAndroid(View view, boolean z10);

    void setImageAssetsFolder(View view, String str);

    void setLoop(View view, boolean z10);

    void setProgress(View view, float f10);

    void setRenderMode(View view, String str);

    void setResizeMode(View view, String str);

    void setSourceDotLottieURI(View view, String str);

    void setSourceJson(View view, String str);

    void setSourceName(View view, String str);

    void setSourceURL(View view, String str);

    void setSpeed(View view, double d10);

    void setTextFiltersAndroid(View view, ReadableArray readableArray);

    void setTextFiltersIOS(View view, ReadableArray readableArray);
}
