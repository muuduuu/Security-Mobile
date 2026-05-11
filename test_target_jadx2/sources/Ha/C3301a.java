package ha;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ha.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3301a extends com.facebook.react.uimanager.events.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0503a f34024a = new C0503a(null);

    /* renamed from: ha.a$a, reason: collision with other inner class name */
    public static final class C0503a {
        public /* synthetic */ C0503a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0503a() {
        }
    }

    public C3301a(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topAttached";
    }
}
