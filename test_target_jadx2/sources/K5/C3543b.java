package k5;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: k5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3543b extends com.facebook.react.uimanager.events.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36224a = new a(null);

    /* renamed from: k5.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3543b(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topDrawerOpen";
    }
}
