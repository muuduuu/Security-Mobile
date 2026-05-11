package fa;

import com.facebook.react.bridge.WritableMap;
import ea.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends AbstractC3159b {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f32920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f32920e = handler.b0();
    }

    @Override // fa.AbstractC3159b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putBoolean("pointerInside", this.f32920e);
    }
}
