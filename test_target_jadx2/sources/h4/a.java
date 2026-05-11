package H4;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f3089a;

    /* renamed from: b, reason: collision with root package name */
    private final WritableMap f3090b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String eventName, WritableMap writableMap, int i10, int i11) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f3089a = eventName;
        this.f3090b = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return this.f3090b;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.f3089a;
    }
}
