package h5;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes.dex */
public interface M {
    void setActivityState(View view, float f10);

    void setCustomAnimationOnSwipe(View view, boolean z10);

    void setFullScreenSwipeEnabled(View view, boolean z10);

    void setFullScreenSwipeShadowEnabled(View view, boolean z10);

    void setGestureEnabled(View view, boolean z10);

    void setGestureResponseDistance(View view, ReadableMap readableMap);

    void setHideKeyboardOnSwipe(View view, boolean z10);

    void setHomeIndicatorHidden(View view, boolean z10);

    void setNativeBackButtonDismissalEnabled(View view, boolean z10);

    void setNavigationBarColor(View view, Integer num);

    void setNavigationBarHidden(View view, boolean z10);

    void setNavigationBarTranslucent(View view, boolean z10);

    void setPreventNativeDismiss(View view, boolean z10);

    void setReplaceAnimation(View view, String str);

    void setScreenOrientation(View view, String str);

    void setSheetAllowedDetents(View view, ReadableArray readableArray);

    void setSheetCornerRadius(View view, float f10);

    void setSheetElevation(View view, int i10);

    void setSheetExpandsWhenScrolledToEdge(View view, boolean z10);

    void setSheetGrabberVisible(View view, boolean z10);

    void setSheetInitialDetent(View view, int i10);

    void setSheetLargestUndimmedDetent(View view, int i10);

    void setStackAnimation(View view, String str);

    void setStackPresentation(View view, String str);

    void setStatusBarAnimation(View view, String str);

    void setStatusBarColor(View view, Integer num);

    void setStatusBarHidden(View view, boolean z10);

    void setStatusBarStyle(View view, String str);

    void setStatusBarTranslucent(View view, boolean z10);

    void setSwipeDirection(View view, String str);

    void setTransitionDuration(View view, int i10);
}
