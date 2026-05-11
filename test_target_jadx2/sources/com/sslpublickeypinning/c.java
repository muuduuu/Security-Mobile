package com.sslpublickeypinning;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c extends a0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put("SslPublicKeyPinning", new ReactModuleInfo("SslPublicKeyPinning", "SslPublicKeyPinning", false, false, true, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("SslPublicKeyPinning")) {
            return new SslPublicKeyPinningModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        return new L4.a() { // from class: com.sslpublickeypinning.b
            @Override // L4.a
            public final Map a() {
                Map f10;
                f10 = c.f();
                return f10;
            }
        };
    }
}
