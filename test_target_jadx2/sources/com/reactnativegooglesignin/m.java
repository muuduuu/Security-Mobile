package com.reactnativegooglesignin;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class m extends a0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeGoogleSigninSpec.NAME, new ReactModuleInfo(NativeGoogleSigninSpec.NAME, NativeGoogleSigninSpec.NAME, false, false, true, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNGoogleSigninButtonViewManager());
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeGoogleSigninSpec.NAME)) {
            return new RNGoogleSigninModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        return new L4.a() { // from class: com.reactnativegooglesignin.l
            @Override // L4.a
            public final Map a() {
                Map f10;
                f10 = m.f();
                return f10;
            }
        };
    }
}
