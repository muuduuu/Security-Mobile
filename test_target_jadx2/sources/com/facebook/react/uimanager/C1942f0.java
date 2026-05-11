package com.facebook.react.uimanager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: com.facebook.react.uimanager.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1942f0 extends com.facebook.react.uimanager.events.d {

    /* renamed from: e, reason: collision with root package name */
    private static final y0.e f22412e = new y0.e(20);

    /* renamed from: a, reason: collision with root package name */
    private int f22413a;

    /* renamed from: b, reason: collision with root package name */
    private int f22414b;

    /* renamed from: c, reason: collision with root package name */
    private int f22415c;

    /* renamed from: d, reason: collision with root package name */
    private int f22416d;

    private C1942f0() {
    }

    public static C1942f0 b(int i10, int i11, int i12, int i13, int i14) {
        return c(-1, i10, i11, i12, i13, i14);
    }

    public static C1942f0 c(int i10, int i11, int i12, int i13, int i14, int i15) {
        C1942f0 c1942f0 = (C1942f0) f22412e.b();
        if (c1942f0 == null) {
            c1942f0 = new C1942f0();
        }
        c1942f0.a(i10, i11, i12, i13, i14, i15);
        return c1942f0;
    }

    protected void a(int i10, int i11, int i12, int i13, int i14, int i15) {
        super.init(i10, i11);
        this.f22413a = i12;
        this.f22414b = i13;
        this.f22415c = i14;
        this.f22416d = i15;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", C1944g0.e(this.f22413a));
        createMap.putDouble("y", C1944g0.e(this.f22414b));
        createMap.putDouble("width", C1944g0.e(this.f22415c));
        createMap.putDouble("height", C1944g0.e(this.f22416d));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt("target", getViewTag());
        return createMap2;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topLayout";
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        f22412e.a(this);
    }
}
