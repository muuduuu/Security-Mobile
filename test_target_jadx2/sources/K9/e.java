package K9;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends com.facebook.react.uimanager.events.d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5490b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f5491a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, int i11, String text) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(text, "text");
        this.f5491a = text;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", this.f5491a);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topFocusedInputTextChanged";
    }
}
