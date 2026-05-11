package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    private final int f22341a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22342b;

    public c(int i10, int i11, int i12, int i13) {
        super(i10, i11);
        this.f22341a = i12;
        this.f22342b = i13;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("width", C1944g0.e(this.f22341a));
        createMap.putDouble("height", C1944g0.e(this.f22342b));
        Intrinsics.d(createMap);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topContentSizeChange";
    }

    public c(int i10, int i11, int i12) {
        this(-1, i10, i11, i12);
    }
}
