package com.facebook.react.uimanager;

import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0087 ¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/uimanager/UIConstantsProviderBinding;", BuildConfig.FLAVOR, "()V", "install", BuildConfig.FLAVOR, "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeExecutor;", "defaultEventTypesProvider", "Lcom/facebook/react/uimanager/UIConstantsProviderBinding$DefaultEventTypesProvider;", "viewManagerConstantsProvider", "Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsForViewManagerProvider;", "constantsProvider", "Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsProvider;", "ConstantsForViewManagerProvider", "ConstantsProvider", "DefaultEventTypesProvider", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UIConstantsProviderBinding {
    public static final UIConstantsProviderBinding INSTANCE = new UIConstantsProviderBinding();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsForViewManagerProvider;", BuildConfig.FLAVOR, "getConstantsForViewManager", "Lcom/facebook/react/bridge/NativeMap;", "viewManagerName", BuildConfig.FLAVOR, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ConstantsForViewManagerProvider {
        NativeMap getConstantsForViewManager(String viewManagerName);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsProvider;", BuildConfig.FLAVOR, "getConstants", "Lcom/facebook/react/bridge/NativeMap;", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ConstantsProvider {
        NativeMap getConstants();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/UIConstantsProviderBinding$DefaultEventTypesProvider;", BuildConfig.FLAVOR, "getDefaultEventTypes", "Lcom/facebook/react/bridge/NativeMap;", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface DefaultEventTypesProvider {
        NativeMap getDefaultEventTypes();
    }

    static {
        SoLoader.t("uimanagerjni");
    }

    private UIConstantsProviderBinding() {
    }

    public static final native void install(RuntimeExecutor runtimeExecutor, DefaultEventTypesProvider defaultEventTypesProvider, ConstantsForViewManagerProvider viewManagerConstantsProvider, ConstantsProvider constantsProvider);
}
