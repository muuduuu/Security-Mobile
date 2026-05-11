package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.util.Collection;

/* loaded from: classes.dex */
public class F0 extends ReactContext {

    /* renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f22153a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22154b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22155c;

    public F0(ReactApplicationContext reactApplicationContext, Context context, String str, int i10) {
        super(context);
        initializeFromOther(reactApplicationContext);
        this.f22153a = reactApplicationContext;
        this.f22154b = str;
        this.f22155c = i10;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f22153a.addLifecycleEventListener(lifecycleEventListener);
    }

    public ReactApplicationContext b() {
        return this.f22153a;
    }

    public int c() {
        return this.f22155c;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
        this.f22153a.destroy();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        return this.f22153a.getCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Activity getCurrentActivity() {
        return this.f22153a.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public UIManager getFabricUIManager() {
        return this.f22153a.getFabricUIManager();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.f22153a.getJSCallInvokerHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptModule getJSModule(Class cls) {
        return this.f22153a.getJSModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.f22153a.getJavaScriptContextHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(Class cls) {
        return this.f22153a.getNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection getNativeModules() {
        return this.f22153a.getNativeModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public String getSourceURL() {
        return this.f22153a.getSourceURL();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception exc) {
        this.f22153a.handleException(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveCatalystInstance() {
        return this.f22153a.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        return this.f22153a.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCatalystInstance() {
        return this.f22153a.hasCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCurrentActivity() {
        return this.f22153a.hasCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasNativeModule(Class cls) {
        return this.f22153a.hasNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.f22153a.hasReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean isBridgeless() {
        return this.f22153a.isBridgeless();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int i10, String str, Callback callback) {
        this.f22153a.registerSegment(i10, str, callback);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f22153a.removeLifecycleEventListener(lifecycleEventListener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(String str) {
        return this.f22153a.getNativeModule(str);
    }
}
