package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.L0;
import ea.AbstractC3109d;
import fa.AbstractC3159b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends com.facebook.react.uimanager.events.d {

    /* renamed from: d, reason: collision with root package name */
    public static final a f29761d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final y0.e f29762e = new y0.e(7);

    /* renamed from: a, reason: collision with root package name */
    private AbstractC3159b f29763a;

    /* renamed from: b, reason: collision with root package name */
    private short f29764b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29765c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ c c(a aVar, AbstractC3109d abstractC3109d, AbstractC3159b abstractC3159b, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return aVar.b(abstractC3109d, abstractC3159b, z10);
        }

        public final WritableMap a(AbstractC3159b dataBuilder) {
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            WritableMap createMap = Arguments.createMap();
            Intrinsics.d(createMap);
            dataBuilder.a(createMap);
            Intrinsics.checkNotNullExpressionValue(createMap, "apply(...)");
            return createMap;
        }

        public final c b(AbstractC3109d handler, AbstractC3159b dataBuilder, boolean z10) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            c cVar = (c) c.f29762e.b();
            if (cVar == null) {
                cVar = new c(null);
            }
            cVar.c(handler, dataBuilder, z10);
            return cVar;
        }

        private a() {
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(AbstractC3109d abstractC3109d, AbstractC3159b abstractC3159b, boolean z10) {
        View U10 = abstractC3109d.U();
        Intrinsics.d(U10);
        super.init(L0.f(U10), U10.getId());
        this.f29763a = abstractC3159b;
        this.f29765c = z10;
        this.f29764b = abstractC3109d.G();
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f29764b;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        a aVar = f29761d;
        AbstractC3159b abstractC3159b = this.f29763a;
        Intrinsics.d(abstractC3159b);
        return aVar.a(abstractC3159b);
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.f29765c ? "topGestureHandlerEvent" : "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        this.f29763a = null;
        f29762e.a(this);
    }

    private c() {
    }
}
