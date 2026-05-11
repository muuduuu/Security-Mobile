package com.hypersnapsdk;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements P {
    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HypersnapsdkModule(reactApplicationContext));
        arrayList.add(new RNHyperSnapSDK(reactApplicationContext));
        arrayList.add(new RNHVDocsCapture(reactApplicationContext));
        arrayList.add(new RNHVQRScanCapture(reactApplicationContext));
        arrayList.add(new RNHVFaceCapture(reactApplicationContext));
        arrayList.add(new RNHVNetworkHelper(reactApplicationContext));
        arrayList.add(new RNHyperSnapParams(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
