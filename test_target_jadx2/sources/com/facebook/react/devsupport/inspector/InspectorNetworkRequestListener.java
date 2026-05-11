package com.facebook.react.devsupport.inspector;

import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: classes.dex */
public class InspectorNetworkRequestListener {
    private final HybridData mHybridData;

    public InspectorNetworkRequestListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void onCompletion();

    public native void onData(String str);

    public native void onError(String str);

    public native void onHeaders(int i10, Map<String, String> map);
}
