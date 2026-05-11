package fa;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import ea.v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends AbstractC3159b {

    /* renamed from: e, reason: collision with root package name */
    private final double f32934e;

    /* renamed from: f, reason: collision with root package name */
    private final float f32935f;

    /* renamed from: g, reason: collision with root package name */
    private final float f32936g;

    /* renamed from: h, reason: collision with root package name */
    private final double f32937h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f32934e = handler.V0();
        this.f32935f = handler.T0();
        this.f32936g = handler.U0();
        this.f32937h = handler.W0();
    }

    @Override // fa.AbstractC3159b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("rotation", this.f32934e);
        eventData.putDouble("anchorX", C1944g0.e(this.f32935f));
        eventData.putDouble("anchorY", C1944g0.e(this.f32936g));
        eventData.putDouble("velocity", this.f32937h);
    }
}
