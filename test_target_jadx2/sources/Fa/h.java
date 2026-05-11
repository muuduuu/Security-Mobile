package fa;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import ea.s;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends AbstractC3159b {

    /* renamed from: e, reason: collision with root package name */
    private final double f32930e;

    /* renamed from: f, reason: collision with root package name */
    private final float f32931f;

    /* renamed from: g, reason: collision with root package name */
    private final float f32932g;

    /* renamed from: h, reason: collision with root package name */
    private final double f32933h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f32930e = handler.Y0();
        this.f32931f = handler.W0();
        this.f32932g = handler.X0();
        this.f32933h = handler.Z0();
    }

    @Override // fa.AbstractC3159b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("scale", this.f32930e);
        eventData.putDouble("focalX", C1944g0.e(this.f32931f));
        eventData.putDouble("focalY", C1944g0.e(this.f32932g));
        eventData.putDouble("velocity", this.f32933h);
    }
}
