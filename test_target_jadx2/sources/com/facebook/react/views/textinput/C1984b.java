package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: com.facebook.react.views.textinput.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1984b extends com.facebook.react.uimanager.events.d {

    /* renamed from: a, reason: collision with root package name */
    private float f22915a;

    /* renamed from: b, reason: collision with root package name */
    private float f22916b;

    public C1984b(int i10, int i11, float f10, float f11) {
        super(i10, i11);
        this.f22915a = f10;
        this.f22916b = f11;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("width", this.f22915a);
        createMap2.putDouble("height", this.f22916b);
        createMap.putMap("contentSize", createMap2);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topContentSizeChange";
    }
}
