package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import c3.AbstractC1721a;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.InterfaceC1969t0;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes.dex */
public abstract class ViewManager<T extends View, C extends InterfaceC1969t0> extends BaseJavaModule {
    private static final String NAME = "ViewManager";
    private HashMap<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mRecyclableViews = null;
    }

    private Stack<T> getRecyclableViewStack(int i10, boolean z10) {
        HashMap<Integer, Stack<T>> hashMap = this.mRecyclableViews;
        if (hashMap == null) {
            return null;
        }
        if (z10 && !hashMap.containsKey(Integer.valueOf(i10))) {
            this.mRecyclableViews.put(Integer.valueOf(i10), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i10));
    }

    protected void addEventEmitters(F0 f02, T t10) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public T createView(int i10, F0 f02, C1973v0 c1973v0, E0 e02, Y4.a aVar) {
        T createViewInstance = createViewInstance(i10, f02, c1973v0, e02);
        if (createViewInstance instanceof Y4.d) {
            ((Y4.d) createViewInstance).setOnInterceptTouchEventListener(aVar);
        }
        return createViewInstance;
    }

    protected T createViewInstance(int i10, F0 f02, C1973v0 c1973v0, E0 e02) {
        Object updateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(f02.c(), true);
        T createViewInstance = (recyclableViewStack == null || recyclableViewStack.empty()) ? createViewInstance(f02) : recycleView(f02, recyclableViewStack.pop());
        createViewInstance.setId(i10);
        addEventEmitters(f02, createViewInstance);
        if (c1973v0 != null) {
            updateProperties(createViewInstance, c1973v0);
        }
        if (e02 != null && (updateState = updateState(createViewInstance, c1973v0, e02)) != null) {
            updateExtraData(createViewInstance, updateState);
        }
        return createViewInstance;
    }

    protected abstract T createViewInstance(F0 f02);

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    protected c1 getDelegate() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return e1.e(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, com.facebook.yoga.p pVar, float f11, com.facebook.yoga.p pVar2, float[] fArr) {
        return 0L;
    }

    protected void onAfterUpdateTransaction(T t10) {
    }

    public void onDropViewInstance(T t10) {
        T prepareToRecycleView;
        Context context = t10.getContext();
        if (context == null) {
            AbstractC1721a.m(NAME, "onDropViewInstance: view [" + t10.getId() + "] has a null context");
            return;
        }
        if (context instanceof F0) {
            F0 f02 = (F0) context;
            Stack<T> recyclableViewStack = getRecyclableViewStack(f02.c(), false);
            if (recyclableViewStack == null || (prepareToRecycleView = prepareToRecycleView(f02, t10)) == null) {
                return;
            }
            recyclableViewStack.push(prepareToRecycleView);
            return;
        }
        AbstractC1721a.m(NAME, "onDropViewInstance: view [" + t10.getId() + "] has a context that is not a ThemedReactContext: " + context);
    }

    public void onSurfaceStopped(int i10) {
        HashMap<Integer, Stack<T>> hashMap = this.mRecyclableViews;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i10));
        }
    }

    protected abstract T prepareToRecycleView(F0 f02, T t10);

    @Deprecated
    public void receiveCommand(T t10, int i10, ReadableArray readableArray) {
    }

    protected T recycleView(F0 f02, T t10) {
        return t10;
    }

    public void setPadding(T t10, int i10, int i11, int i12, int i13) {
    }

    protected void setupViewRecycling() {
        if (G4.a.h()) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public abstract void updateExtraData(T t10, Object obj);

    public void updateProperties(T t10, C1973v0 c1973v0) {
        c1 delegate = getDelegate();
        if (delegate != null) {
            e1.h(delegate, t10, c1973v0);
        } else {
            e1.g(this, t10, c1973v0);
        }
        onAfterUpdateTransaction(t10);
    }

    public Object updateState(T t10, C1973v0 c1973v0, E0 e02) {
        return null;
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }

    public long measure(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, com.facebook.react.common.mapbuffer.a aVar3, float f10, com.facebook.yoga.p pVar, float f11, com.facebook.yoga.p pVar2, float[] fArr) {
        return 0L;
    }

    public void receiveCommand(T t10, String str, ReadableArray readableArray) {
        c1 delegate = getDelegate();
        if (delegate != null) {
            delegate.a(t10, str, readableArray);
        }
    }

    public ViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRecyclableViews = null;
    }
}
