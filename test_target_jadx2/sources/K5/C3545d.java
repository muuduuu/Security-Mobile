package k5;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3545d extends com.facebook.react.uimanager.events.d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f36227b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f36228a;

    /* renamed from: k5.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3545d(int i10, int i11, int i12) {
        super(i10, i11);
        this.f36228a = i12;
    }

    public final int a() {
        return this.f36228a;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(createMap, "createMap(...)");
        createMap.putInt("drawerState", a());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topDrawerStateChanged";
    }
}
