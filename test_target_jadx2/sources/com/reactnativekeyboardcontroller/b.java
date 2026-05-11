package com.reactnativekeyboardcontroller;

import com.facebook.react.AbstractC1862b;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends AbstractC1862b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeKeyboardControllerSpec.NAME, new ReactModuleInfo(NativeKeyboardControllerSpec.NAME, NativeKeyboardControllerSpec.NAME, false, false, false, true));
        hashMap.put(NativeStatusBarManagerCompatSpec.NAME, new ReactModuleInfo(NativeStatusBarManagerCompatSpec.NAME, NativeStatusBarManagerCompatSpec.NAME, false, false, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.m(new KeyboardControllerViewManager(), new KeyboardGestureAreaViewManager(), new OverKeyboardViewManager());
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.b(name, NativeKeyboardControllerSpec.NAME)) {
            return new KeyboardControllerModule(reactContext);
        }
        if (Intrinsics.b(name, NativeStatusBarManagerCompatSpec.NAME)) {
            return new StatusBarManagerCompatModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        return new L4.a() { // from class: com.reactnativekeyboardcontroller.a
            @Override // L4.a
            public final Map a() {
                Map f10;
                f10 = b.f();
                return f10;
            }
        };
    }
}
