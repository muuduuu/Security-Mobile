package com.reactnativegooglesignin;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public class n extends com.facebook.react.uimanager.events.d {
    public n(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topPress";
    }
}
