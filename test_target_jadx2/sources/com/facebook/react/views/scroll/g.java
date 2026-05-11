package com.facebook.react.views.scroll;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.views.scroll.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r4.AbstractC4012a;

/* loaded from: classes2.dex */
public final class g extends com.facebook.react.uimanager.events.d {

    /* renamed from: k, reason: collision with root package name */
    public static final a f22724k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static final String f22725l = g.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    private static final y0.e f22726m = new y0.e(3);

    /* renamed from: a, reason: collision with root package name */
    private float f22727a;

    /* renamed from: b, reason: collision with root package name */
    private float f22728b;

    /* renamed from: c, reason: collision with root package name */
    private float f22729c;

    /* renamed from: d, reason: collision with root package name */
    private float f22730d;

    /* renamed from: e, reason: collision with root package name */
    private int f22731e;

    /* renamed from: f, reason: collision with root package name */
    private int f22732f;

    /* renamed from: g, reason: collision with root package name */
    private int f22733g;

    /* renamed from: h, reason: collision with root package name */
    private int f22734h;

    /* renamed from: i, reason: collision with root package name */
    private h f22735i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22736j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(int i10, int i11, h hVar, float f10, float f11, float f12, float f13, int i12, int i13, int i14, int i15, boolean z10) {
            g gVar = (g) g.f22726m.b();
            if (gVar == null) {
                gVar = new g(null);
            }
            gVar.c(i10, i11, hVar, f10, f11, f12, f13, i12, i13, i14, i15, z10);
            return gVar;
        }

        public final g b(int i10, h hVar, float f10, float f11, float f12, float f13, int i11, int i12, int i13, int i14) {
            return a(-1, i10, hVar, f10, f11, f12, f13, i11, i12, i13, i14, false);
        }

        private a() {
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i10, int i11, h hVar, float f10, float f11, float f12, float f13, int i12, int i13, int i14, int i15, boolean z10) {
        super.init(i10, i11);
        this.f22735i = hVar;
        this.f22727a = f10;
        this.f22728b = f11;
        this.f22729c = f12;
        this.f22730d = f13;
        this.f22731e = i12;
        this.f22732f = i13;
        this.f22733g = i14;
        this.f22734h = i15;
        this.f22736j = z10;
    }

    public static final g d(int i10, int i11, h hVar, float f10, float f11, float f12, float f13, int i12, int i13, int i14, int i15, boolean z10) {
        return f22724k.a(i10, i11, hVar, f10, f11, f12, f13, i12, i13, i14, i15, z10);
    }

    public static final g e(int i10, h hVar, float f10, float f11, float f12, float f13, int i11, int i12, int i13, int i14) {
        return f22724k.b(i10, hVar, f10, f11, f12, f13, i11, i12, i13, i14);
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return this.f22735i == h.SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected boolean experimental_isSynchronous() {
        return this.f22736j;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", 0.0d);
        createMap.putDouble("bottom", 0.0d);
        createMap.putDouble("left", 0.0d);
        createMap.putDouble("right", 0.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("x", C1944g0.e(this.f22727a));
        createMap2.putDouble("y", C1944g0.e(this.f22728b));
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("width", C1944g0.e(this.f22731e));
        createMap3.putDouble("height", C1944g0.e(this.f22732f));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble("width", C1944g0.e(this.f22733g));
        createMap4.putDouble("height", C1944g0.e(this.f22734h));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble("x", this.f22729c);
        createMap5.putDouble("y", this.f22730d);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap("contentInset", createMap);
        createMap6.putMap("contentOffset", createMap2);
        createMap6.putMap("contentSize", createMap3);
        createMap6.putMap("layoutMeasurement", createMap4);
        createMap6.putMap("velocity", createMap5);
        createMap6.putInt("target", getViewTag());
        createMap6.putBoolean("responderIgnoreScroll", true);
        Intrinsics.d(createMap6);
        return createMap6;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        h.a aVar = h.Companion;
        Object c10 = AbstractC4012a.c(this.f22735i);
        Intrinsics.checkNotNullExpressionValue(c10, "assertNotNull(...)");
        return aVar.a((h) c10);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        try {
            f22726m.a(this);
        } catch (IllegalStateException e10) {
            ReactSoftExceptionLogger.logSoftException(f22725l, e10);
        }
    }

    private g() {
    }
}
