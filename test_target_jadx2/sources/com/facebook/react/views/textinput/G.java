package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
class G extends com.facebook.react.uimanager.events.d {

    /* renamed from: a, reason: collision with root package name */
    private int f22887a;

    /* renamed from: b, reason: collision with root package name */
    private int f22888b;

    public G(int i10, int i11, int i12, int i13) {
        super(i10, i11);
        this.f22887a = i12;
        this.f22888b = i13;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("end", this.f22888b);
        createMap2.putInt("start", this.f22887a);
        createMap.putMap("selection", createMap2);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topSelectionChange";
    }
}
