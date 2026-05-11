package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, V> implements O {
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();

    public ViewGroupManager() {
        super(null);
    }

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i10) {
        mZIndexHash.put(view, Integer.valueOf(i10));
    }

    public void addViews(T t10, List<View> list) {
        UiThreadUtil.assertOnUiThread();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            addView((ViewGroupManager<T>) t10, list.get(i10), i10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends V> getShadowNodeClass() {
        return V.class;
    }

    @Override // com.facebook.react.uimanager.P
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    public void removeView(T t10, View view) {
        UiThreadUtil.assertOnUiThread();
        for (int i10 = 0; i10 < getChildCount((ViewGroupManager<T>) t10); i10++) {
            if (getChildAt((ViewGroupManager<T>) t10, i10) == view) {
                removeViewAt((ViewGroupManager<T>) t10, i10);
                return;
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T t10, Object obj) {
    }

    public ViewGroupManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.uimanager.O
    public void addView(T t10, View view, int i10) {
        t10.addView(view, i10);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public V createShadowNodeInstance() {
        return new V();
    }

    @Override // com.facebook.react.uimanager.O
    public View getChildAt(T t10, int i10) {
        return t10.getChildAt(i10);
    }

    @Override // com.facebook.react.uimanager.O
    public int getChildCount(T t10) {
        return t10.getChildCount();
    }

    @Override // com.facebook.react.uimanager.O
    public void removeViewAt(T t10, int i10) {
        UiThreadUtil.assertOnUiThread();
        t10.removeViewAt(i10);
    }
}
