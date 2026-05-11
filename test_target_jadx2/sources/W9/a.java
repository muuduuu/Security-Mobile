package W9;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0211a f11414c = new C0211a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f11415a;

    /* renamed from: b, reason: collision with root package name */
    private final float f11416b;

    /* renamed from: W9.a$a, reason: collision with other inner class name */
    public static final class C0211a {
        public /* synthetic */ C0211a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0211a() {
        }
    }

    public a(int i10, int i11, float f10) {
        super(i10);
        this.f11415a = i11;
        this.f11416b = (Float.isInfinite(f10) || Float.isNaN(f10)) ? 0.0f : f10;
    }

    private final WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f11415a);
        createMap.putDouble("offset", this.f11416b);
        Intrinsics.d(createMap);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), a());
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topPageScroll";
    }
}
