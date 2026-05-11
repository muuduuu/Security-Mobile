package com.facebook.react.runtime;

import com.facebook.react.AbstractC1862b;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import java.util.HashMap;
import java.util.Map;
import r4.AbstractC4012a;
import v4.C4925a;

/* renamed from: com.facebook.react.runtime.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1908f extends AbstractC1862b {

    /* renamed from: a, reason: collision with root package name */
    private final C4.e f22079a;

    /* renamed from: b, reason: collision with root package name */
    private final O4.b f22080b;

    public C1908f(C4.e eVar, O4.b bVar) {
        this.f22079a = eVar;
        this.f22080b = bVar;
    }

    private L4.a f() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceInfoModule.class, SourceCodeModule.class, DevMenuModule.class, DevSettingsModule.class, DeviceEventManagerModule.class, LogBoxModule.class, ExceptionsManagerModule.class};
        final HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < 8; i10++) {
            Class cls = clsArr[i10];
            K4.a aVar = (K4.a) cls.getAnnotation(K4.a.class);
            if (aVar != null) {
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), ReactModuleInfo.b(cls)));
            }
        }
        return new L4.a() { // from class: com.facebook.react.runtime.e
            @Override // L4.a
            public final Map a() {
                Map g10;
                g10 = C1908f.g(hashMap);
                return g10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map g(Map map) {
        return map;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        switch (str) {
            case "LogBox":
                return new LogBoxModule(reactApplicationContext, this.f22079a);
            case "DevSettings":
                return new DevSettingsModule(reactApplicationContext, this.f22079a);
            case "DeviceInfo":
                return new DeviceInfoModule(reactApplicationContext);
            case "DevMenu":
                return new DevMenuModule(reactApplicationContext, this.f22079a);
            case "DeviceEventManager":
                return new DeviceEventManagerModule(reactApplicationContext, this.f22080b);
            case "PlatformConstants":
                return new AndroidInfoModule(reactApplicationContext);
            case "ExceptionsManager":
                return new ExceptionsManagerModule(this.f22079a);
            case "SourceCode":
                return new SourceCodeModule(reactApplicationContext);
            default:
                return null;
        }
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        if (!C4925a.a()) {
            return f();
        }
        try {
            return (L4.a) ((Class) AbstractC4012a.c(C4925a.b(C1908f.class.getName() + "$$ReactModuleInfoProvider"))).newInstance();
        } catch (ClassNotFoundException unused) {
            return f();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for " + C1908f.class.getName() + "$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for " + C1908f.class.getName() + "$$ReactModuleInfoProvider", e11);
        }
    }
}
