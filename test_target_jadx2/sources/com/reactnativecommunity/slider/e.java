package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public class e extends com.facebook.react.uimanager.events.d {

    /* renamed from: a, reason: collision with root package name */
    private final double f29276a;

    public e(int i10, double d10) {
        super(i10);
        this.f29276a = d10;
    }

    private WritableMap b() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putDouble("value", a());
        return createMap;
    }

    public double a() {
        return this.f29276a;
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
        return "onRNCSliderSlidingComplete";
    }
}
