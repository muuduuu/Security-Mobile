package ha;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class q extends com.facebook.react.uimanager.events.d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f34047c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f34048a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34049b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public q(int i10, int i11, int i12, boolean z10) {
        super(i10, i11);
        this.f34048a = i12;
        this.f34049b = z10;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("index", this.f34048a);
        createMap.putBoolean("isStable", this.f34049b);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topSheetDetentChanged";
    }
}
