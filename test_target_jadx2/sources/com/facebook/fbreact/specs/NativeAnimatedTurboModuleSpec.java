package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes.dex */
public abstract class NativeAnimatedTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeAnimatedTurboModule";

    public NativeAnimatedTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void addAnimatedEventToView(double d10, String str, ReadableMap readableMap);

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void connectAnimatedNodeToView(double d10, double d11);

    @ReactMethod
    public abstract void connectAnimatedNodes(double d10, double d11);

    @ReactMethod
    public abstract void createAnimatedNode(double d10, ReadableMap readableMap);

    @ReactMethod
    public abstract void disconnectAnimatedNodeFromView(double d10, double d11);

    @ReactMethod
    public abstract void disconnectAnimatedNodes(double d10, double d11);

    @ReactMethod
    public abstract void dropAnimatedNode(double d10);

    @ReactMethod
    public abstract void extractAnimatedNodeOffset(double d10);

    @ReactMethod
    public abstract void finishOperationBatch();

    @ReactMethod
    public abstract void flattenAnimatedNodeOffset(double d10);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void getValue(double d10, Callback callback);

    @ReactMethod
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
    }

    @ReactMethod
    public abstract void removeAnimatedEventFromView(double d10, String str, double d11);

    @ReactMethod
    public abstract void removeListeners(double d10);

    @ReactMethod
    public abstract void restoreDefaultValues(double d10);

    @ReactMethod
    public abstract void setAnimatedNodeOffset(double d10, double d11);

    @ReactMethod
    public abstract void setAnimatedNodeValue(double d10, double d11);

    @ReactMethod
    public abstract void startAnimatingNode(double d10, double d11, ReadableMap readableMap, Callback callback);

    @ReactMethod
    public abstract void startListeningToAnimatedNodeValue(double d10);

    @ReactMethod
    public abstract void startOperationBatch();

    @ReactMethod
    public abstract void stopAnimation(double d10);

    @ReactMethod
    public abstract void stopListeningToAnimatedNodeValue(double d10);

    @ReactMethod
    public void updateAnimatedNodeConfig(double d10, ReadableMap readableMap) {
    }
}
