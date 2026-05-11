package com.facebook.react.bridge;

import c3.AbstractC1721a;
import java.util.Map;
import r4.AbstractC4012a;
import x4.C5109a;

/* loaded from: classes.dex */
public abstract class BaseJavaModule implements NativeModule {
    public static final String METHOD_TYPE_ASYNC = "async";
    public static final String METHOD_TYPE_PROMISE = "promise";
    public static final String METHOD_TYPE_SYNC = "sync";
    protected CxxCallbackImpl mEventEmitterCallback;
    private final ReactApplicationContext mReactApplicationContext;

    public BaseJavaModule() {
        this(null);
    }

    private final void setEventEmitterCallback(CxxCallbackImpl cxxCallbackImpl) {
        this.mEventEmitterCallback = cxxCallbackImpl;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    public Map<String, Object> getConstants() {
        return null;
    }

    protected final ReactApplicationContext getReactApplicationContext() {
        return (ReactApplicationContext) AbstractC4012a.d(this.mReactApplicationContext, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
    }

    protected final ReactApplicationContext getReactApplicationContextIfActiveOrWarn() {
        if (this.mReactApplicationContext.hasActiveReactInstance()) {
            return this.mReactApplicationContext;
        }
        String str = "React Native Instance has already disappeared: requested by " + getName();
        if (C5109a.f44775b) {
            AbstractC1721a.J("ReactNative", str);
            return null;
        }
        ReactSoftExceptionLogger.logSoftException("ReactNative", new RuntimeException(str));
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
    }

    public BaseJavaModule(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }
}
