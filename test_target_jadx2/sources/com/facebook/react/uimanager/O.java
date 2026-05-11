package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface O extends P {
    void addView(View view, View view2, int i10);

    View getChildAt(View view, int i10);

    int getChildCount(View view);

    default void removeAllViews(View parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        UiThreadUtil.assertOnUiThread();
        int childCount = getChildCount(parent);
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            } else {
                removeViewAt(parent, childCount);
            }
        }
    }

    void removeViewAt(View view, int i10);
}
