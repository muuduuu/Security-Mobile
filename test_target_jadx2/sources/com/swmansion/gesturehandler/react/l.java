package com.swmansion.gesturehandler.react;

import android.view.View;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.L0;
import ea.AbstractC3109d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l extends com.facebook.react.uimanager.events.d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f29792c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final y0.e f29793d = new y0.e(7);

    /* renamed from: a, reason: collision with root package name */
    private WritableMap f29794a;

    /* renamed from: b, reason: collision with root package name */
    private short f29795b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap a(AbstractC3109d handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("handlerTag", handler.R());
            createMap.putInt(Keys.STATE, handler.Q());
            createMap.putInt("numberOfTouches", handler.T());
            createMap.putInt("eventType", handler.S());
            createMap.putInt("pointerType", handler.O());
            WritableArray r10 = handler.r();
            if (r10 != null) {
                createMap.putArray("changedTouches", r10);
            }
            WritableArray q10 = handler.q();
            if (q10 != null) {
                createMap.putArray("allTouches", q10);
            }
            if (handler.Y() && handler.Q() == 4) {
                createMap.putInt(Keys.STATE, 2);
            }
            Intrinsics.checkNotNullExpressionValue(createMap, "apply(...)");
            return createMap;
        }

        public final l b(AbstractC3109d handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            l lVar = (l) l.f29793d.b();
            if (lVar == null) {
                lVar = new l(null);
            }
            lVar.c(handler);
            return lVar;
        }

        private a() {
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(AbstractC3109d abstractC3109d) {
        View U10 = abstractC3109d.U();
        Intrinsics.d(U10);
        super.init(L0.f(U10), U10.getId());
        this.f29794a = f29792c.a(abstractC3109d);
        this.f29795b = abstractC3109d.G();
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f29795b;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return this.f29794a;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        this.f29794a = null;
        f29793d.a(this);
    }

    private l() {
    }
}
