package I9;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends com.facebook.react.uimanager.events.d {

    /* renamed from: b, reason: collision with root package name */
    public static final C0088a f4364b = new C0088a(null);

    /* renamed from: a, reason: collision with root package name */
    private final WritableMap f4365a;

    /* renamed from: I9.a$a, reason: collision with other inner class name */
    public static final class C0088a {
        public /* synthetic */ C0088a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0088a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i10, WritableMap mEventData) {
        super(i10);
        Intrinsics.checkNotNullParameter(mEventData, "mEventData");
        this.f4365a = mEventData;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), this.f4365a);
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topCustomMenuSelection";
    }
}
