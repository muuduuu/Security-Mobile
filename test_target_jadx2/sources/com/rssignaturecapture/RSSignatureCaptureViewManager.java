package com.rssignaturecapture;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import org.conscrypt.BuildConfig;
import r4.AbstractC4012a;
import v4.AbstractC4929e;

/* loaded from: classes2.dex */
public class RSSignatureCaptureViewManager extends ViewGroupManager<a> {
    public static final int COMMAND_RESET_IMAGE = 2;
    public static final int COMMAND_SAVE_IMAGE = 1;
    public static final String PROPS_BACKGROUND_COLOR = "backgroundColor";
    public static final String PROPS_MAX_SIZE = "maxSize";
    public static final String PROPS_MAX_STROKE_WIDTH = "maxStrokeWidth";
    public static final String PROPS_MIN_STROKE_WIDTH = "minStrokeWidth";
    public static final String PROPS_SAVE_IMAGE_FILE = "saveImageFileInExtStorage";
    public static final String PROPS_SHOW_NATIVE_BUTTONS = "showNativeButtons";
    public static final String PROPS_STROKE_COLOR = "strokeColor";
    public static final String PROPS_VIEW_MODE = "viewMode";
    private RSSignatureCaptureContextModule mContextModule;

    public RSSignatureCaptureViewManager(ReactApplicationContext reactApplicationContext) {
        this.mContextModule = new RSSignatureCaptureContextModule(reactApplicationContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Log.d("React", " View manager getCommandsMap:");
        return AbstractC4929e.e("saveImage", 1, "resetImage", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RSSignatureView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Z4.a(name = PROPS_BACKGROUND_COLOR)
    public void setPropsBackgroundColor(a aVar, String str) {
        Log.d("backgroundColor:", BuildConfig.FLAVOR + str);
        if (aVar != null) {
            aVar.getSignatureView().setBackgroundColor(Color.parseColor(str));
        }
    }

    @Z4.a(name = PROPS_MAX_STROKE_WIDTH)
    public void setPropsMaxStrokeWidth(a aVar, int i10) {
        Log.d("maxStrokeWidth:", BuildConfig.FLAVOR + i10);
        if (aVar != null) {
            aVar.getSignatureView().setMaxStrokeWidth(i10);
        }
    }

    @Z4.a(name = PROPS_MIN_STROKE_WIDTH)
    public void setPropsMinStrokeWidth(a aVar, int i10) {
        Log.d("minStrokeWidth:", BuildConfig.FLAVOR + i10);
        if (aVar != null) {
            aVar.getSignatureView().setMinStrokeWidth(i10);
        }
    }

    @Z4.a(name = PROPS_SHOW_NATIVE_BUTTONS)
    public void setPropsShowNativeButtons(a aVar, Boolean bool) {
        Log.d("showNativeButtons:", BuildConfig.FLAVOR + bool);
        if (aVar != null) {
            aVar.setShowNativeButtons(bool);
        }
    }

    @Z4.a(name = PROPS_STROKE_COLOR)
    public void setPropsStrokeColor(a aVar, String str) {
        Log.d("strokeColor:", BuildConfig.FLAVOR + str);
        if (aVar != null) {
            aVar.getSignatureView().setStrokeColor(Color.parseColor(str));
        }
    }

    @Z4.a(name = PROPS_MAX_SIZE)
    public void setPropsWidth(a aVar, Integer num) {
        Log.d("maxSize:", BuildConfig.FLAVOR + num);
        if (aVar != null) {
            aVar.setMaxSize(num.intValue());
        }
    }

    @Z4.a(name = PROPS_SAVE_IMAGE_FILE)
    public void setSaveImageFileInExtStorage(a aVar, Boolean bool) {
        Log.d("setFileInExtStorage:", BuildConfig.FLAVOR + bool);
        if (aVar != null) {
            aVar.setSaveFileInExtStorage(bool);
        }
    }

    @Z4.a(name = PROPS_VIEW_MODE)
    public void setViewMode(a aVar, String str) {
        Log.d("setViewMode:", BuildConfig.FLAVOR + str);
        if (aVar != null) {
            aVar.setViewMode(str);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(F0 f02) {
        Log.d("React", " View manager createViewInstance:");
        return new a(f02, this.mContextModule.getActivity());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(a aVar, int i10, ReadableArray readableArray) {
        AbstractC4012a.c(aVar);
        AbstractC4012a.c(readableArray);
        if (i10 == 1) {
            aVar.e();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i10), getClass().getSimpleName()));
            }
            aVar.d();
        }
    }
}
