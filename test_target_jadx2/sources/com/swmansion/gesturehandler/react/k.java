package com.swmansion.gesturehandler.react;

import android.view.View;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.L0;
import ea.AbstractC3109d;
import fa.AbstractC3159b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends com.facebook.react.uimanager.events.d {

    /* renamed from: d, reason: collision with root package name */
    public static final a f29787d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final y0.e f29788e = new y0.e(7);

    /* renamed from: a, reason: collision with root package name */
    private AbstractC3159b f29789a;

    /* renamed from: b, reason: collision with root package name */
    private int f29790b;

    /* renamed from: c, reason: collision with root package name */
    private int f29791c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap a(AbstractC3159b dataBuilder, int i10, int i11) {
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            WritableMap createMap = Arguments.createMap();
            Intrinsics.d(createMap);
            dataBuilder.a(createMap);
            createMap.putInt(Keys.STATE, i10);
            createMap.putInt("oldState", i11);
            Intrinsics.checkNotNullExpressionValue(createMap, "apply(...)");
            return createMap;
        }

        public final k b(AbstractC3109d handler, int i10, int i11, AbstractC3159b dataBuilder) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            k kVar = (k) k.f29788e.b();
            if (kVar == null) {
                kVar = new k(null);
            }
            kVar.c(handler, i10, i11, dataBuilder);
            return kVar;
        }

        private a() {
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(AbstractC3109d abstractC3109d, int i10, int i11, AbstractC3159b abstractC3159b) {
        View U10 = abstractC3109d.U();
        Intrinsics.d(U10);
        super.init(L0.f(U10), U10.getId());
        this.f29789a = abstractC3159b;
        this.f29790b = i10;
        this.f29791c = i11;
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
        a aVar = f29787d;
        AbstractC3159b abstractC3159b = this.f29789a;
        Intrinsics.d(abstractC3159b);
        return aVar.a(abstractC3159b, this.f29790b, this.f29791c);
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "onGestureHandlerStateChange";
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        this.f29789a = null;
        this.f29790b = 0;
        this.f29791c = 0;
        f29788e.a(this);
    }

    private k() {
    }
}
