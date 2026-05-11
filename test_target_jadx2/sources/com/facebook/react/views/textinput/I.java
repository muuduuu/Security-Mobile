package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
class I extends com.facebook.react.uimanager.events.d {

    /* renamed from: a, reason: collision with root package name */
    private String f22894a;

    public I(int i10, int i11, String str) {
        super(i10, i11);
        this.f22894a = str;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putString("text", this.f22894a);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topSubmitEditing";
    }
}
