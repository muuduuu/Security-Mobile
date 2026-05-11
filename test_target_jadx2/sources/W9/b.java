package W9;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f11417b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f11418a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, String mPageScrollState) {
        super(i10);
        Intrinsics.checkNotNullParameter(mPageScrollState, "mPageScrollState");
        this.f11418a = mPageScrollState;
    }

    private final WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("pageScrollState", this.f11418a);
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
        return "topPageScrollStateChanged";
    }
}
