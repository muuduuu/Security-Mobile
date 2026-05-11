package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends com.facebook.react.uimanager.events.d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f30088c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final com.th3rdwave.safeareacontext.a f30089a;

    /* renamed from: b, reason: collision with root package name */
    private final c f30090b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, int i11, com.th3rdwave.safeareacontext.a mInsets, c mFrame) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(mInsets, "mInsets");
        Intrinsics.checkNotNullParameter(mFrame, "mFrame");
        this.f30089a = mInsets;
        this.f30090b = mFrame;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("insets", q.b(this.f30089a));
        createMap.putMap("frame", q.d(this.f30090b));
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topInsetsChange";
    }
}
