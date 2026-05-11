package com.shopify.reactnative.skia;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class f extends a0 {

    class a implements L4.a {
        a() {
        }

        @Override // L4.a
        public Map a() {
            HashMap hashMap = new HashMap();
            Class cls = new Class[]{RNSkiaModule.class}[0];
            K4.a aVar = (K4.a) cls.getAnnotation(K4.a.class);
            hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            return hashMap;
        }
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNSkiaModule(reactApplicationContext));
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new SkiaPictureViewManager(), new SkiaDomViewManager());
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (str.equals("RNSkiaModule")) {
            return new RNSkiaModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        return new a();
    }
}
