package com.facebook.react.uimanager;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.List;

@K4.a(name = UIManagerModule.NAME)
/* loaded from: classes.dex */
public class ReanimatedUIManager extends UIManagerModule {
    public ReanimatedUIManager(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i10) {
        super(reactApplicationContext, list, i10);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void clearJSResponder() {
        super.clearJSResponder();
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        super.configureNextLayoutAnimation(readableMap, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void createView(int i10, String str, int i11, ReadableMap readableMap) {
        super.createView(i10, str, i11, readableMap);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void dispatchViewManagerCommand(int i10, Dynamic dynamic, ReadableArray readableArray) {
        super.dispatchViewManagerCommand(i10, dynamic, readableArray);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void findSubviewIn(int i10, ReadableArray readableArray, Callback callback) {
        super.findSubviewIn(i10, readableArray, callback);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        return super.getConstantsForViewManager(str);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return super.getDefaultEventTypes();
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void manageChildren(int i10, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        super.manageChildren(i10, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void measure(int i10, Callback callback) {
        super.measure(i10, callback);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void measureInWindow(int i10, Callback callback) {
        super.measureInWindow(i10, callback);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void measureLayout(int i10, int i11, Callback callback, Callback callback2) {
        super.measureLayout(i10, i11, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule, com.facebook.react.bridge.OnBatchCompleteListener
    public void onBatchComplete() {
        super.onBatchComplete();
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void removeRootView(int i10) {
        super.removeRootView(i10);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule, com.facebook.react.bridge.UIManager
    @ReactMethod
    public void sendAccessibilityEvent(int i10, int i11) {
        super.sendAccessibilityEvent(i10, i11);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void setChildren(int i10, ReadableArray readableArray) {
        super.setChildren(i10, readableArray);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void setJSResponder(int i10, boolean z10) {
        super.setJSResponder(i10, z10);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z10) {
        super.setLayoutAnimationEnabledExperimental(z10);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void updateView(int i10, String str, ReadableMap readableMap) {
        super.updateView(i10, str, readableMap);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i10, int i11, Callback callback) {
        super.viewIsDescendantOf(i10, i11, callback);
    }
}
