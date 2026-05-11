package K9;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends com.facebook.react.uimanager.events.d {

    /* renamed from: b, reason: collision with root package name */
    public static final C0103a f5471b = new C0103a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f5472a;

    /* renamed from: K9.a$a, reason: collision with other inner class name */
    public static final class C0103a {
        public /* synthetic */ C0103a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0103a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i10, int i11, b event) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5472a = event;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", this.f5472a.e());
        createMap.putInt("parentScrollViewTarget", this.f5472a.d());
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("x", this.f5472a.g());
        createMap2.putDouble("y", this.f5472a.h());
        createMap2.putDouble("width", this.f5472a.f());
        createMap2.putDouble("height", this.f5472a.c());
        createMap2.putDouble("absoluteX", this.f5472a.a());
        createMap2.putDouble("absoluteY", this.f5472a.b());
        Unit unit = Unit.f36324a;
        createMap.putMap("layout", createMap2);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topFocusedInputLayoutChanged";
    }
}
