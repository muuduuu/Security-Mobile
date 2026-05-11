package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public class f extends com.facebook.react.uimanager.events.d {

    /* renamed from: a, reason: collision with root package name */
    private final double f29277a;

    public f(int i10, double d10) {
        super(i10);
        this.f29277a = d10;
    }

    private WritableMap b() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putDouble("value", a());
        return createMap;
    }

    public double a() {
        return this.f29277a;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return b();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "onRNCSliderSlidingStart";
    }
}
