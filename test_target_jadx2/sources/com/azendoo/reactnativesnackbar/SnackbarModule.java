package com.azendoo.reactnativesnackbar;

import H7.f;
import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.rssignaturecapture.RSSignatureCaptureViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class SnackbarModule extends ReactContextBaseJavaModule {
    private static final String ON_SNACKBAR_VISIBILITY_EVENT = "onSnackbarVisibility";
    private static final String REACT_NAME = "RNSnackbar";
    private static final int SHOW_EVENT = 5;
    private final List<Snackbar> mActiveSnackbars;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        boolean f20198a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callback f20199b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnackbarModule f20200c;

        a(SnackbarModule snackbarModule, Callback callback) {
            this.f20199b = callback;
            this.f20200c = snackbarModule;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f20198a) {
                return;
            }
            this.f20198a = true;
            this.f20199b.invoke(new Object[0]);
        }
    }

    class b extends BaseTransientBottomBar.q {
        b() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.q
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Snackbar snackbar, int i10) {
            SnackbarModule.this.sendSnackbarVisibilityEvent(i10);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.q
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(Snackbar snackbar) {
            SnackbarModule.this.sendSnackbarVisibilityEvent(5);
        }
    }

    public SnackbarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mActiveSnackbars = new ArrayList();
    }

    public static float convertDpToPixel(float f10, Context context) {
        return f10 * (context.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    private void displaySnackbar(View view, ReadableMap readableMap, Callback callback) {
        String optionValue = getOptionValue(readableMap, "text", BuildConfig.FLAVOR);
        int optionValue2 = getOptionValue(readableMap, "duration", -1);
        int optionValue3 = getOptionValue(readableMap, "numberOfLines", 2);
        int optionValue4 = getOptionValue(readableMap, "textColor", -1);
        boolean optionValue5 = getOptionValue(readableMap, "textAlignCenter", false);
        boolean optionValue6 = getOptionValue(readableMap, "rtl", false);
        int optionValue7 = getOptionValue(readableMap, "marginBottom", 0);
        Typeface typeface = null;
        String optionValue8 = getOptionValue(readableMap, "fontFamily", (String) null);
        if (optionValue8 != null) {
            try {
                typeface = Typeface.createFromAsset(view.getContext().getAssets(), "fonts/" + optionValue8 + ".ttf");
            } catch (Exception e10) {
                e10.printStackTrace();
                throw new Error("Failed to load font " + optionValue8 + ".ttf, did you include it in your assets?");
            }
        }
        try {
            Snackbar f02 = Snackbar.f0(view, optionValue, optionValue2);
            f02.N(optionValue7 == 0 ? 0 : 1);
            View B10 = f02.B();
            if (optionValue6) {
                B10.setLayoutDirection(1);
                B10.setTextDirection(4);
            }
            if (optionValue7 != 0) {
                B10.setTranslationY(-convertDpToPixel(optionValue7, B10.getContext()));
            }
            TextView textView = (TextView) B10.findViewById(f.f3240K);
            textView.setMaxLines(optionValue3);
            textView.setTextColor(optionValue4);
            if (optionValue5) {
                textView.setTextAlignment(4);
            } else {
                textView.setTextAlignment(2);
            }
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            this.mActiveSnackbars.add(f02);
            if (readableMap.hasKey(RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR)) {
                B10.setBackgroundColor(readableMap.getInt(RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR));
            }
            if (readableMap.hasKey("action")) {
                ReadableMap map = readableMap.getMap("action");
                String optionValue9 = getOptionValue(map, "text", BuildConfig.FLAVOR);
                int optionValue10 = getOptionValue(map, "textColor", -1);
                f02.h0(optionValue9, new a(this, callback));
                f02.i0(optionValue10);
                if (typeface != null) {
                    ((TextView) B10.findViewById(f.f3239J)).setTypeface(typeface);
                }
            }
            f02.n(new b());
            f02.S();
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
        }
    }

    private String getOptionValue(ReadableMap readableMap, String str, String str2) {
        return readableMap.hasKey(str) ? readableMap.getString(str) : str2;
    }

    private ArrayList<View> recursiveLoopChildren(ViewGroup viewGroup, ArrayList<View> arrayList) {
        if (viewGroup.getClass().getSimpleName().equalsIgnoreCase("ReactModalHostView")) {
            arrayList.add(viewGroup.getChildAt(0));
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                recursiveLoopChildren((ViewGroup) childAt, arrayList);
            }
        }
        return arrayList;
    }

    private void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSnackbarVisibilityEvent(int i10) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(Keys.EVENT, i10);
        sendEvent(getReactApplicationContext(), ON_SNACKBAR_VISIBILITY_EVENT, createMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void dismiss() {
        for (Snackbar snackbar : this.mActiveSnackbars) {
            if (snackbar != null) {
                snackbar.r();
            }
        }
        this.mActiveSnackbars.clear();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("LENGTH_LONG", 0);
        hashMap.put("LENGTH_SHORT", -1);
        hashMap.put("LENGTH_INDEFINITE", -2);
        hashMap.put("DISMISS_EVENT_SWIPE", 0);
        hashMap.put("DISMISS_EVENT_ACTION", 1);
        hashMap.put("DISMISS_EVENT_TIMEOUT", 2);
        hashMap.put("DISMISS_EVENT_MANUAL", 3);
        hashMap.put("DISMISS_EVENT_CONSECUTIVE", 4);
        hashMap.put("SHOW_EVENT", 5);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_NAME;
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void show(ReadableMap readableMap, Callback callback) {
        try {
            ViewGroup viewGroup = (ViewGroup) getCurrentActivity().getWindow().getDecorView().findViewById(R.id.content);
            if (viewGroup == null) {
                return;
            }
            this.mActiveSnackbars.clear();
            if (viewGroup.hasWindowFocus()) {
                displaySnackbar(viewGroup, readableMap, callback);
                return;
            }
            ArrayList<View> recursiveLoopChildren = recursiveLoopChildren(viewGroup, new ArrayList<>());
            Collections.reverse(recursiveLoopChildren);
            Iterator<View> it = recursiveLoopChildren.iterator();
            while (it.hasNext()) {
                View next = it.next();
                if (next != null) {
                    displaySnackbar(next, readableMap, callback);
                    return;
                }
            }
            if (viewGroup.getVisibility() == 0) {
                displaySnackbar(viewGroup, readableMap, callback);
            } else {
                Log.w(REACT_NAME, "Content view is not in focus or not visible");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private int getOptionValue(ReadableMap readableMap, String str, int i10) {
        return readableMap.hasKey(str) ? readableMap.getInt(str) : i10;
    }

    private boolean getOptionValue(ReadableMap readableMap, String str, boolean z10) {
        return readableMap.hasKey(str) ? readableMap.getBoolean(str) : z10;
    }
}
