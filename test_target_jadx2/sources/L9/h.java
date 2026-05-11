package L9;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.bridge.ReactContext;
import g.AbstractC3175f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class h {
    public static final ViewGroup a(ReactContext reactContext) {
        Window window;
        View decorView;
        View rootView;
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootView = decorView.getRootView()) == null) {
            return null;
        }
        return (ViewGroup) rootView.findViewById(AbstractC3175f.f33179d);
    }

    public static final View b(ReactContext reactContext) {
        Window window;
        View decorView;
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getRootView();
    }
}
