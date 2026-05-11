package X4;

import com.facebook.react.AbstractC1862b;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.b0;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.facebook.react.modules.devtoolssettings.DevToolsSettingsManagerModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.safeareaview.ReactSafeAreaViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.unimplementedview.ReactUnimplementedViewManager;
import com.facebook.react.views.view.ReactViewManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import v4.C4925a;

/* loaded from: classes.dex */
public class t extends AbstractC1862b implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private Map f11752a;

    public t(a aVar) {
    }

    private static void f(Map map, String str, Provider provider) {
        map.put(str, ModuleSpec.viewManagerSpec(provider));
    }

    private L4.a g() {
        Class[] clsArr = {AccessibilityInfoModule.class, AppearanceModule.class, AppStateModule.class, BlobModule.class, DevLoadingModule.class, FileReaderModule.class, ClipboardModule.class, DialogModule.class, FrescoModule.class, I18nManagerModule.class, ImageLoaderModule.class, ImageStoreManager.class, IntentModule.class, NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, DevToolsSettingsManagerModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class};
        final HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < 23; i10++) {
            Class cls = clsArr[i10];
            K4.a aVar = (K4.a) cls.getAnnotation(K4.a.class);
            if (aVar != null) {
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), ReactModuleInfo.b(cls)));
            }
        }
        return new L4.a() { // from class: X4.j
            @Override // L4.a
            public final Map a() {
                Map i11;
                i11 = t.i(hashMap);
                return i11;
            }
        };
    }

    @Override // com.facebook.react.b0
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = (ModuleSpec) h().get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactDrawerLayoutManager());
        arrayList.add(new ReactHorizontalScrollViewManager());
        arrayList.add(new ReactHorizontalScrollContainerViewManager());
        arrayList.add(new ReactProgressBarViewManager());
        arrayList.add(new ReactScrollViewManager());
        arrayList.add(new ReactSwitchManager());
        arrayList.add(new ReactSafeAreaViewManager());
        arrayList.add(new SwipeRefreshLayoutManager());
        arrayList.add(new FrescoBasedReactTextInlineImageViewManager());
        arrayList.add(new ReactImageManager());
        arrayList.add(new ReactModalHostManager());
        arrayList.add(new ReactRawTextManager());
        arrayList.add(new ReactTextInputManager());
        arrayList.add(new ReactTextViewManager());
        arrayList.add(new ReactViewManager());
        arrayList.add(new ReactVirtualTextViewManager());
        arrayList.add(new ReactUnimplementedViewManager());
        return arrayList;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        switch (str) {
            case "ToastAndroid":
                return new ToastModule(reactApplicationContext);
            case "ImageStoreManager":
                return new ImageStoreManager(reactApplicationContext);
            case "SoundManager":
                return new SoundManagerModule(reactApplicationContext);
            case "DialogManagerAndroid":
                return new DialogModule(reactApplicationContext);
            case "FileReaderModule":
                return new FileReaderModule(reactApplicationContext);
            case "PermissionsAndroid":
                return new PermissionsModule(reactApplicationContext);
            case "ImageLoader":
                return new ImageLoaderModule(reactApplicationContext);
            case "I18nManager":
                return new I18nManagerModule(reactApplicationContext);
            case "Appearance":
                return new AppearanceModule(reactApplicationContext);
            case "AccessibilityInfo":
                return new AccessibilityInfoModule(reactApplicationContext);
            case "StatusBarManager":
                return new StatusBarModule(reactApplicationContext);
            case "WebSocketModule":
                return new WebSocketModule(reactApplicationContext);
            case "DevLoadingView":
                return new DevLoadingModule(reactApplicationContext);
            case "FrescoModule":
                return new FrescoModule(reactApplicationContext, true, (b4.l) null);
            case "Clipboard":
                return new ClipboardModule(reactApplicationContext);
            case "DevToolsSettingsManager":
                return new DevToolsSettingsManagerModule(reactApplicationContext);
            case "IntentAndroid":
                return new IntentModule(reactApplicationContext);
            case "AppState":
                return new AppStateModule(reactApplicationContext);
            case "Networking":
                return new NetworkingModule(reactApplicationContext);
            case "BlobModule":
                return new BlobModule(reactApplicationContext);
            case "ShareModule":
                return new ShareModule(reactApplicationContext);
            case "NativeAnimatedModule":
                return new NativeAnimatedModule(reactApplicationContext);
            case "Vibration":
                return new VibrationModule(reactApplicationContext);
            default:
                return null;
        }
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        if (!C4925a.a()) {
            return g();
        }
        try {
            return (L4.a) C4925a.b("com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return g();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider", e11);
        }
    }

    @Override // com.facebook.react.b0
    public Collection getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return h().keySet();
    }

    @Override // com.facebook.react.AbstractC1862b
    public List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(h().values());
    }

    public Map h() {
        if (this.f11752a == null) {
            HashMap hashMap = new HashMap();
            f(hashMap, ReactDrawerLayoutManager.REACT_CLASS, new Provider() { // from class: X4.b
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactDrawerLayoutManager();
                }
            });
            f(hashMap, ReactHorizontalScrollViewManager.REACT_CLASS, new Provider() { // from class: X4.r
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactHorizontalScrollViewManager();
                }
            });
            f(hashMap, ReactHorizontalScrollContainerViewManager.REACT_CLASS, new Provider() { // from class: X4.s
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactHorizontalScrollContainerViewManager();
                }
            });
            f(hashMap, ReactProgressBarViewManager.REACT_CLASS, new Provider() { // from class: X4.c
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactProgressBarViewManager();
                }
            });
            f(hashMap, ReactSafeAreaViewManager.REACT_CLASS, new Provider() { // from class: X4.d
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactSafeAreaViewManager();
                }
            });
            f(hashMap, ReactScrollViewManager.REACT_CLASS, new Provider() { // from class: X4.e
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactScrollViewManager();
                }
            });
            f(hashMap, ReactSwitchManager.REACT_CLASS, new Provider() { // from class: X4.f
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactSwitchManager();
                }
            });
            f(hashMap, SwipeRefreshLayoutManager.REACT_CLASS, new Provider() { // from class: X4.g
                @Override // javax.inject.Provider
                public final Object get() {
                    return new SwipeRefreshLayoutManager();
                }
            });
            f(hashMap, FrescoBasedReactTextInlineImageViewManager.REACT_CLASS, new Provider() { // from class: X4.h
                @Override // javax.inject.Provider
                public final Object get() {
                    return new FrescoBasedReactTextInlineImageViewManager();
                }
            });
            f(hashMap, ReactImageManager.REACT_CLASS, new Provider() { // from class: X4.i
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactImageManager();
                }
            });
            f(hashMap, ReactModalHostManager.REACT_CLASS, new Provider() { // from class: X4.k
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactModalHostManager();
                }
            });
            f(hashMap, ReactRawTextManager.REACT_CLASS, new Provider() { // from class: X4.l
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactRawTextManager();
                }
            });
            f(hashMap, ReactTextInputManager.REACT_CLASS, new Provider() { // from class: X4.m
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactTextInputManager();
                }
            });
            f(hashMap, ReactTextViewManager.REACT_CLASS, new Provider() { // from class: X4.n
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactTextViewManager();
                }
            });
            f(hashMap, ReactViewManager.REACT_CLASS, new Provider() { // from class: X4.o
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactViewManager();
                }
            });
            f(hashMap, ReactVirtualTextViewManager.REACT_CLASS, new Provider() { // from class: X4.p
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactVirtualTextViewManager();
                }
            });
            f(hashMap, ReactUnimplementedViewManager.REACT_CLASS, new Provider() { // from class: X4.q
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactUnimplementedViewManager();
                }
            });
            this.f11752a = hashMap;
        }
        return this.f11752a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map i(Map map) {
        return map;
    }
}
