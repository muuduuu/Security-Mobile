package k5;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3544c extends com.facebook.react.uimanager.events.d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f36225b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final float f36226a;

    /* renamed from: k5.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3544c(int i10, int i11, float f10) {
        super(i10, i11);
        this.f36226a = f10;
    }

    public final float a() {
        return this.f36226a;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(createMap, "createMap(...)");
        createMap.putDouble("offset", a());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topDrawerSlide";
    }
}
