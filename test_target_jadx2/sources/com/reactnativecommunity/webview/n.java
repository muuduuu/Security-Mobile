package com.reactnativecommunity.webview;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class n extends a0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeRNCWebViewModuleSpec.NAME, new ReactModuleInfo(NativeRNCWebViewModuleSpec.NAME, NativeRNCWebViewModuleSpec.NAME, false, false, true, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNCWebViewManager());
        return arrayList;
    }

    @Override // com.facebook.react.AbstractC1862b, com.facebook.react.P
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeRNCWebViewModuleSpec.NAME)) {
            return new RNCWebViewModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1862b
    public L4.a getReactModuleInfoProvider() {
        return new L4.a() { // from class: com.reactnativecommunity.webview.m
            @Override // L4.a
            public final Map a() {
                Map f10;
                f10 = n.f();
                return f10;
            }
        };
    }
}
