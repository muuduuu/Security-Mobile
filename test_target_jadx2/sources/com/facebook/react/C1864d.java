package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.j1;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s5.C4313a;
import v4.C4925a;

/* renamed from: com.facebook.react.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1864d extends AbstractC1862b implements T {

    /* renamed from: a, reason: collision with root package name */
    private final J f21425a;

    /* renamed from: b, reason: collision with root package name */
    private final O4.b f21426b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21427c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21428d;

    /* renamed from: com.facebook.react.d$a */
    class a implements j1 {
        a() {
        }

        @Override // com.facebook.react.uimanager.j1
        public Collection a() {
            return C1864d.this.f21425a.I();
        }

        @Override // com.facebook.react.uimanager.j1
        public ViewManager b(String str) {
            return C1864d.this.f21425a.A(str);
        }
    }

    public C1864d(J j10, O4.b bVar, boolean z10, int i10) {
        this.f21425a = j10;
        this.f21426b = bVar;
        this.f21427c = z10;
        this.f21428d = i10;
    }

    private UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        C4313a.c(0L, "createUIManagerModule");
        try {
            return this.f21427c ? new UIManagerModule(reactApplicationContext, new a(), this.f21428d) : new UIManagerModule(reactApplicationContext, (List<ViewManager>) this.f21425a.H(reactApplicationContext), this.f21428d);
        } finally {
            C4313a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    private L4.a g() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevMenuModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class};
        final HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < 11; i10++) {
            Class cls = clsArr[i10];
            K4.a aVar = (K4.a) cls.getAnnotation(K4.a.class);
            hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), ReactModuleInfo.b(cls)));
        }
        return new L4.a() { // from class: com.facebook.react.c
            @Override // L4.a
            public final Map a() {
                Map h10;
                h10 = C1864d.h(hashMap);
                return h10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map h(Map map) {
        return map;
    }

    @Override // com.facebook.react.T
    public void a() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    @Override // com.facebook.react.T
    public void b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        switch (str) {
            case "LogBox":
                return new LogBoxModule(reactApplicationContext, this.f21425a.E());
            case "Timing":
                return new TimingModule(reactApplicationContext, this.f21425a.E());
            case "DevSettings":
                return new DevSettingsModule(reactApplicationContext, this.f21425a.E());
            case "DeviceInfo":
                return new DeviceInfoModule(reactApplicationContext);
            case "DevMenu":
                return new DevMenuModule(reactApplicationContext, this.f21425a.E());
            case "DeviceEventManager":
                return new DeviceEventManagerModule(reactApplicationContext, this.f21426b);
            case "PlatformConstants":
                return new AndroidInfoModule(reactApplicationContext);
            case "ExceptionsManager":
                return new ExceptionsManagerModule(this.f21425a.E());
            case "SourceCode":
                return new SourceCodeModule(reactApplicationContext);
            case "HeadlessJsTaskSupport":
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case "UIManager":
                return createUIManager(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        if (!C4925a.a()) {
            return g();
        }
        try {
            return (L4.a) C4925a.b("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return g();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e11);
        }
    }
}
