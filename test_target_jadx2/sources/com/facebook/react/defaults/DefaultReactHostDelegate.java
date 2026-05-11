package com.facebook.react.defaults;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.W;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.InterfaceC1909g;
import com.facebook.react.runtime.JSRuntimeFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\f\u0010\u001eR\u001c\u0010$\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010*\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u001a\u0010/\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b%\u0010.¨\u00060"}, d2 = {"Lcom/facebook/react/defaults/DefaultReactHostDelegate;", "Lcom/facebook/react/runtime/g;", "Lcom/facebook/react/fabric/ReactNativeConfig;", "b", "()Lcom/facebook/react/fabric/ReactNativeConfig;", "Ljava/lang/Exception;", "Lkotlin/Exception;", AppConstants.VIDEO_RECORDING_ERROR, BuildConfig.FLAVOR, "d", "(Ljava/lang/Exception;)V", BuildConfig.FLAVOR, C4870a.f43493a, "Ljava/lang/String;", "g", "()Ljava/lang/String;", "jsMainModulePath", "Lcom/facebook/react/bridge/JSBundleLoader;", "Lcom/facebook/react/bridge/JSBundleLoader;", "e", "()Lcom/facebook/react/bridge/JSBundleLoader;", "jsBundleLoader", BuildConfig.FLAVOR, "Lcom/facebook/react/P;", "c", "Ljava/util/List;", "()Ljava/util/List;", "reactPackages", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "()Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "Lcom/facebook/react/runtime/BindingsInstaller;", "Lcom/facebook/react/runtime/BindingsInstaller;", "getBindingsInstaller", "()Lcom/facebook/react/runtime/BindingsInstaller;", "bindingsInstaller", "f", "Lcom/facebook/react/fabric/ReactNativeConfig;", "reactNativeConfig", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "exceptionHandler", "Lcom/facebook/react/W$a;", "h", "Lcom/facebook/react/W$a;", "()Lcom/facebook/react/W$a;", "turboModuleManagerDelegateBuilder", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultReactHostDelegate implements InterfaceC1909g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String jsMainModulePath;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final JSBundleLoader jsBundleLoader;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List reactPackages;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final JSRuntimeFactory jsRuntimeFactory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final BindingsInstaller bindingsInstaller;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ReactNativeConfig reactNativeConfig;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function1 exceptionHandler;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final W.a turboModuleManagerDelegateBuilder;

    @Override // com.facebook.react.runtime.InterfaceC1909g
    /* renamed from: a, reason: from getter */
    public JSRuntimeFactory getJsRuntimeFactory() {
        return this.jsRuntimeFactory;
    }

    @Override // com.facebook.react.runtime.InterfaceC1909g
    /* renamed from: b, reason: from getter */
    public ReactNativeConfig getReactNativeConfig() {
        return this.reactNativeConfig;
    }

    @Override // com.facebook.react.runtime.InterfaceC1909g
    /* renamed from: c, reason: from getter */
    public List getReactPackages() {
        return this.reactPackages;
    }

    @Override // com.facebook.react.runtime.InterfaceC1909g
    public void d(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.exceptionHandler.invoke(error);
    }

    @Override // com.facebook.react.runtime.InterfaceC1909g
    /* renamed from: e, reason: from getter */
    public JSBundleLoader getJsBundleLoader() {
        return this.jsBundleLoader;
    }

    @Override // com.facebook.react.runtime.InterfaceC1909g
    /* renamed from: f, reason: from getter */
    public W.a getTurboModuleManagerDelegateBuilder() {
        return this.turboModuleManagerDelegateBuilder;
    }

    @Override // com.facebook.react.runtime.InterfaceC1909g
    /* renamed from: g, reason: from getter */
    public String getJsMainModulePath() {
        return this.jsMainModulePath;
    }

    @Override // com.facebook.react.runtime.InterfaceC1909g
    public BindingsInstaller getBindingsInstaller() {
        return this.bindingsInstaller;
    }
}
