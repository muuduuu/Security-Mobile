package com.shopify.reactnative.flash_list;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends com.facebook.react.uimanager.events.d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f29459c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final double f29460a;

    /* renamed from: b, reason: collision with root package name */
    private final double f29461b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(int i10, int i11, double d10, double d11) {
        super(i10, i11);
        this.f29460a = d10;
        this.f29461b = d11;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), getEventData());
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("offsetStart", this.f29460a);
        createMap.putDouble("offsetEnd", this.f29461b);
        Intrinsics.checkNotNullExpressionValue(createMap, "apply(...)");
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "onBlankAreaEvent";
    }
}
