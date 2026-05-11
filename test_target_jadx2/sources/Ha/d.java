package ha;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class d extends com.facebook.react.uimanager.events.d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f34027b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f34028a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(int i10, int i11, int i12) {
        super(i10, i11);
        this.f34028a = i12;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) this.f34028a;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("headerHeight", this.f34028a);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topHeaderHeightChange";
    }
}
