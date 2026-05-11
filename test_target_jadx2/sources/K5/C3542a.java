package k5;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: k5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3542a extends com.facebook.react.uimanager.events.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0523a f36223a = new C0523a(null);

    /* renamed from: k5.a$a, reason: collision with other inner class name */
    public static final class C0523a {
        public /* synthetic */ C0523a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0523a() {
        }
    }

    public C3542a(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topDrawerClose";
    }
}
