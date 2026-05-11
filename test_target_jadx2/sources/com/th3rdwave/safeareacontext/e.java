package com.th3rdwave.safeareacontext;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends a0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f(Map reactModuleInfoMap) {
        Intrinsics.checkNotNullParameter(reactModuleInfoMap, "$reactModuleInfoMap");
        return reactModuleInfoMap;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.m(new SafeAreaProviderManager(), new SafeAreaViewManager());
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.b(name, "RNCSafeAreaContext")) {
            return new SafeAreaContextModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        final HashMap hashMap = new HashMap();
        Class cls = new Class[]{SafeAreaContextModule.class}[0];
        K4.a aVar = (K4.a) cls.getAnnotation(K4.a.class);
        if (aVar != null) {
            String name = aVar.name();
            String name2 = aVar.name();
            String name3 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
            hashMap.put(name, new ReactModuleInfo(name2, name3, true, aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), true));
        }
        return new L4.a() { // from class: com.th3rdwave.safeareacontext.d
            @Override // L4.a
            public final Map a() {
                Map f10;
                f10 = e.f(hashMap);
                return f10;
            }
        };
    }
}
