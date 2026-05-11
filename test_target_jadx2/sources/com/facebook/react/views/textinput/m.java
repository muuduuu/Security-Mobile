package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public class m extends com.facebook.react.uimanager.events.d {

    /* renamed from: a, reason: collision with root package name */
    private String f22969a;

    /* renamed from: b, reason: collision with root package name */
    private int f22970b;

    public m(int i10, int i11, String str, int i12) {
        super(i10, i11);
        this.f22969a = str;
        this.f22970b = i12;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", this.f22969a);
        createMap.putInt("eventCount", this.f22970b);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topChange";
    }
}
