package K9;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends com.facebook.react.uimanager.events.d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5481b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f5482a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, int i11, d event) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5482a = event;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", this.f5482a.g());
        WritableMap createMap2 = Arguments.createMap();
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("x", this.f5482a.e());
        createMap3.putDouble("y", this.f5482a.f());
        createMap3.putInt("position", this.f5482a.d());
        Unit unit = Unit.f36324a;
        createMap2.putMap("start", createMap3);
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble("x", this.f5482a.b());
        createMap4.putDouble("y", this.f5482a.c());
        createMap4.putInt("position", this.f5482a.a());
        createMap2.putMap("end", createMap4);
        createMap.putMap("selection", createMap2);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topFocusedInputSelectionChanged";
    }
}
