package com.facebook.react.uimanager.events;

import c3.AbstractC1721a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements EventDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22339a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final EventDispatcher f22340b = new b();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EventDispatcher a() {
            return b.f22340b;
        }

        private a() {
        }
    }

    private b() {
    }

    public static final EventDispatcher l() {
        return f22339a.a();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void a(int i10, RCTEventEmitter eventEmitter) {
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void b(h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void c(d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        AbstractC1721a.b("BlackHoleEventDispatcher", "Trying to emit event to JS, but the React instance isn't ready. Event: " + event.getEventName());
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void d() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void e(com.facebook.react.uimanager.events.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void f(com.facebook.react.uimanager.events.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void g() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void h(int i10, RCTModernEventEmitter eventEmitter) {
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void i(int i10) {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void j(h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
