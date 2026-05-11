package com.ReactNativeBlobUtil;

import com.facebook.fbreact.specs.NativeBlobUtilsSpec;
import com.facebook.react.AbstractC1862b;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends AbstractC1862b {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeBlobUtilsSpec.NAME, new ReactModuleInfo(NativeBlobUtilsSpec.NAME, NativeBlobUtilsSpec.NAME, false, false, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeBlobUtilsSpec.NAME)) {
            return new ReactNativeBlobUtil(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        return new L4.a() { // from class: com.ReactNativeBlobUtil.h
            @Override // L4.a
            public final Map a() {
                Map f10;
                f10 = i.f();
                return f10;
            }
        };
    }
}
