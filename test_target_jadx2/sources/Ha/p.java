package ha;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class p extends com.facebook.react.uimanager.events.d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f34045b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f34046a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public p(int i10, int i11, String str) {
        super(i10, i11);
        this.f34046a = str;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", this.f34046a);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topSearchButtonPress";
    }
}
