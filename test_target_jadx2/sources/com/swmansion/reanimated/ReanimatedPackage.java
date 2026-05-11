package com.swmansion.reanimated;

import com.facebook.react.InterfaceC1995x;
import com.facebook.react.J;
import com.facebook.react.P;
import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import s5.C4313a;

/* loaded from: classes2.dex */
public class ReanimatedPackage extends a0 implements P {
    private UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        C4313a.c(0L, "createUIManagerModule");
        try {
            return ReanimatedUIManagerFactory.create(reactApplicationContext, getReactInstanceManager(reactApplicationContext).H(reactApplicationContext), -1);
        } finally {
            C4313a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0(Map map) {
        return map;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeReanimatedModuleSpec.NAME)) {
            return new ReanimatedModule(reactApplicationContext);
        }
        if (str.equals(UIManagerModule.NAME)) {
            return createUIManager(reactApplicationContext);
        }
        return null;
    }

    public J getReactInstanceManager(ReactApplicationContext reactApplicationContext) {
        return ((InterfaceC1995x) reactApplicationContext.getApplicationContext()).a().c();
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        Class[] clsArr = {ReanimatedModule.class, ReanimatedUIManager.class};
        final HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < 2; i10++) {
            Class cls = clsArr[i10];
            K4.a aVar = (K4.a) cls.getAnnotation(K4.a.class);
            Objects.requireNonNull(aVar);
            K4.a aVar2 = aVar;
            hashMap.put(aVar2.name(), new ReactModuleInfo(aVar2.name(), cls.getName(), true, aVar2.needsEagerInit(), aVar2.isCxxModule(), true));
        }
        return new L4.a() { // from class: com.swmansion.reanimated.h
            @Override // L4.a
            public final Map a() {
                Map lambda$getReactModuleInfoProvider$0;
                lambda$getReactModuleInfoProvider$0 = ReanimatedPackage.lambda$getReactModuleInfoProvider$0(hashMap);
                return lambda$getReactModuleInfoProvider$0;
            }
        };
    }
}
