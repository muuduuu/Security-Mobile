package com.horcrux.svg.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import l5.C3609a;

/* loaded from: classes2.dex */
public class SvgLoadEvent extends d {
    public static final String EVENT_NAME = "topLoad";
    private final float height;
    private final String uri;
    private final float width;

    public SvgLoadEvent(int i10, int i11, ReactContext reactContext, String str, float f10, float f11) {
        super(i10, i11);
        this.uri = new C3609a(reactContext, str).d();
        this.width = f10;
        this.height = f11;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), getEventData());
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("width", this.width);
        createMap.putDouble("height", this.height);
        createMap.putString("uri", this.uri);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("source", createMap);
        return createMap2;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return EVENT_NAME;
    }
}
