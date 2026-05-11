package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public class b extends com.facebook.react.uimanager.events.d {

    /* renamed from: a, reason: collision with root package name */
    private final double f29274a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29275b;

    public b(int i10, double d10, boolean z10) {
        super(i10);
        this.f29274a = d10;
        this.f29275b = z10;
    }

    private WritableMap c() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putDouble("value", a());
        createMap.putBoolean("fromUser", b());
        return createMap;
    }

    public double a() {
        return this.f29274a;
    }

    public boolean b() {
        return this.f29275b;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return c();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topChange";
    }
}
