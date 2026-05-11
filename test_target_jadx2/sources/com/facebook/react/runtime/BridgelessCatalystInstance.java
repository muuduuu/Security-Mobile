package com.facebook.react.runtime;

import android.content.res.AssetManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeArrayInterface;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b#\u0010$J)\u0010(\u001a\u00020\b2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010\u001dJ\u000f\u0010+\u001a\u00020\bH\u0017¢\u0006\u0004\b+\u0010\u001dJ)\u00100\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010-*\u00020,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0016¢\u0006\u0004\b0\u00101J'\u00104\u001a\u00020\u000f\"\b\b\u0000\u0010-*\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0016¢\u0006\u0004\b4\u00105J)\u00106\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010-*\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0016¢\u0006\u0004\b6\u00107J\u0019\u00106\u001a\u0004\u0018\u0001022\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b6\u00109J\u0017\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bB\u0010AJ\u001f\u0010E\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\rH\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010I\u001a\u00020\b2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rH\u0017¢\u0006\u0004\bI\u0010\u0018J\u0017\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\b2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020NH\u0016¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u001fR\u0014\u0010Z\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001a\u0010_\u001a\u00020[8WX\u0096\u0004¢\u0006\f\u0012\u0004\b^\u0010\u001d\u001a\u0004\b\\\u0010]R\u0014\u0010c\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u0002020d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0016\u0010o\u001a\u0004\u0018\u00010l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0016\u0010s\u001a\u0004\u0018\u00010p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006v"}, d2 = {"Lcom/facebook/react/runtime/BridgelessCatalystInstance;", "Lcom/facebook/react/bridge/CatalystInstance;", "Lcom/facebook/react/runtime/ReactHostImpl;", "reactHost", "<init>", "(Lcom/facebook/react/runtime/ReactHostImpl;)V", BuildConfig.FLAVOR, "level", BuildConfig.FLAVOR, "handleMemoryPressure", "(I)V", "Landroid/content/res/AssetManager;", "assetManager", BuildConfig.FLAVOR, "assetURL", BuildConfig.FLAVOR, "loadSynchronously", "loadScriptFromAssets", "(Landroid/content/res/AssetManager;Ljava/lang/String;Z)V", "fileName", "sourceURL", "loadScriptFromFile", "(Ljava/lang/String;Ljava/lang/String;Z)V", "loadSplitBundleFromFile", "(Ljava/lang/String;Ljava/lang/String;)V", "deviceURL", "remoteURL", "setSourceURLs", "runJSBundle", "()V", "hasRunJSBundle", "()Z", "callbackID", "Lcom/facebook/react/bridge/NativeArrayInterface;", "arguments", "invokeCallback", "(ILcom/facebook/react/bridge/NativeArrayInterface;)V", "module", "method", "Lcom/facebook/react/bridge/NativeArray;", "callFunction", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)V", "destroy", "initialize", "Lcom/facebook/react/bridge/JavaScriptModule;", "T", "Ljava/lang/Class;", "jsInterface", "getJSModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;", "Lcom/facebook/react/bridge/NativeModule;", "nativeModuleInterface", "hasNativeModule", "(Ljava/lang/Class;)Z", "getNativeModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "moduleName", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/bridge/NativeModuleRegistry;", "modules", "extendNativeModules", "(Lcom/facebook/react/bridge/NativeModuleRegistry;)V", "Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;", "listener", "addBridgeIdleDebugListener", "(Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;)V", "removeBridgeIdleDebugListener", "segmentId", "path", "registerSegment", "(ILjava/lang/String;)V", "propName", "jsonValue", "setGlobalVariable", "Lcom/facebook/react/internal/turbomodule/core/interfaces/TurboModuleRegistry;", "turboModuleRegistry", "setTurboModuleRegistry", "(Lcom/facebook/react/internal/turbomodule/core/interfaces/TurboModuleRegistry;)V", "Lcom/facebook/react/bridge/UIManager;", "fabricUIManager", "setFabricUIManager", "(Lcom/facebook/react/bridge/UIManager;)V", "getFabricUIManager", "()Lcom/facebook/react/bridge/UIManager;", C4870a.f43493a, "Lcom/facebook/react/runtime/ReactHostImpl;", "isDestroyed", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "getJavaScriptContextHolder", "()Lcom/facebook/react/bridge/JavaScriptContextHolder;", "javaScriptContextHolder", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getJSCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getJSCallInvokerHolder$annotations", "jsCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;", "getNativeMethodCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;", "nativeMethodCallInvokerHolder", BuildConfig.FLAVOR, "getNativeModules", "()Ljava/util/Collection;", "nativeModules", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "getReactQueueConfiguration", "()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "reactQueueConfiguration", "Lcom/facebook/react/bridge/RuntimeExecutor;", "getRuntimeExecutor", "()Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeScheduler;", "getRuntimeScheduler", "()Lcom/facebook/react/bridge/RuntimeScheduler;", "runtimeScheduler", "getSourceURL", "()Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BridgelessCatalystInstance implements CatalystInstance {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactHostImpl reactHost;

    public BridgelessCatalystInstance(ReactHostImpl reactHost) {
        Intrinsics.checkNotNullParameter(reactHost, "reactHost");
        this.reactHost = reactHost;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw new UnsupportedOperationException("Unimplemented method 'addBridgeIdleDebugListener'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String module, String method, NativeArray arguments) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(method, "method");
        throw new UnsupportedOperationException("Unimplemented method 'callFunction'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    /* renamed from: destroy */
    public void lambda$onNativeException$6() {
        throw new UnsupportedOperationException("Unimplemented method 'destroy'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void extendNativeModules(NativeModuleRegistry modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        throw new UnsupportedOperationException("Unimplemented method 'extendNativeModules'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public UIManager getFabricUIManager() {
        throw new UnsupportedOperationException("Unimplemented method 'getFabricUIManager'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public CallInvokerHolder getJSCallInvokerHolder() {
        CallInvokerHolder r02 = this.reactHost.r0();
        Intrinsics.d(r02);
        return r02;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptModule getJSModule(Class jsInterface) {
        Intrinsics.checkNotNullParameter(jsInterface, "jsInterface");
        ReactContext k10 = this.reactHost.k();
        if (k10 != null) {
            return k10.getJSModule(jsInterface);
        }
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        JavaScriptContextHolder s02 = this.reactHost.s0();
        Intrinsics.d(s02);
        return s02;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeMethodCallInvokerHolder getNativeMethodCallInvokerHolder() {
        throw new UnsupportedOperationException("Unimplemented method 'getNativeMethodCallInvokerHolder'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(Class nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        return this.reactHost.v0(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public Collection getNativeModules() {
        Collection x02 = this.reactHost.x0();
        Intrinsics.checkNotNullExpressionValue(x02, "getNativeModules(...)");
        return x02;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public ReactQueueConfiguration getReactQueueConfiguration() {
        ReactQueueConfiguration F02 = this.reactHost.F0();
        Intrinsics.d(F02);
        return F02;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public RuntimeExecutor getRuntimeExecutor() {
        return this.reactHost.G0();
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public RuntimeScheduler getRuntimeScheduler() {
        throw new UnsupportedOperationException("Unimplemented method 'getRuntimeScheduler'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public String getSourceURL() {
        throw new UnsupportedOperationException("Unimplemented method 'getSourceURL'");
    }

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public void handleMemoryPressure(int level) {
        throw new UnsupportedOperationException("Unimplemented method 'handleMemoryPressure'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasNativeModule(Class nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        return this.reactHost.J0(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasRunJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'hasRunJSBundle'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void initialize() {
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSInstance
    public void invokeCallback(int callbackID, NativeArrayInterface arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        throw new UnsupportedOperationException("Unimplemented method 'invokeCallback'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean isDestroyed() {
        throw new UnsupportedOperationException("Unimplemented method 'isDestroyed'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromAssets(AssetManager assetManager, String assetURL, boolean loadSynchronously) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(assetURL, "assetURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromAssets'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromFile(String fileName, String sourceURL, boolean loadSynchronously) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(sourceURL, "sourceURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromFile'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadSplitBundleFromFile(String fileName, String sourceURL) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(sourceURL, "sourceURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadSplitBundleFromFile'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void registerSegment(int segmentId, String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new UnsupportedOperationException("Unimplemented method 'registerSegment'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw new UnsupportedOperationException("Unimplemented method 'removeBridgeIdleDebugListener'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void runJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'runJSBundle'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setFabricUIManager(UIManager fabricUIManager) {
        Intrinsics.checkNotNullParameter(fabricUIManager, "fabricUIManager");
        throw new UnsupportedOperationException("Unimplemented method 'setFabricUIManager'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setGlobalVariable(String propName, String jsonValue) {
        Intrinsics.checkNotNullParameter(propName, "propName");
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        throw new UnsupportedOperationException("Unimplemented method 'setGlobalVariable'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setSourceURLs(String deviceURL, String remoteURL) {
        Intrinsics.checkNotNullParameter(deviceURL, "deviceURL");
        Intrinsics.checkNotNullParameter(remoteURL, "remoteURL");
        throw new UnsupportedOperationException("Unimplemented method 'setSourceURLs'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setTurboModuleRegistry(TurboModuleRegistry turboModuleRegistry) {
        Intrinsics.checkNotNullParameter(turboModuleRegistry, "turboModuleRegistry");
        throw new UnsupportedOperationException("Unimplemented method 'setTurboModuleRegistry'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return this.reactHost.w0(moduleName);
    }
}
