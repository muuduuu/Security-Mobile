package fa;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import ea.r;
import ea.x;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends AbstractC3159b {

    /* renamed from: e, reason: collision with root package name */
    private final float f32921e;

    /* renamed from: f, reason: collision with root package name */
    private final float f32922f;

    /* renamed from: g, reason: collision with root package name */
    private final float f32923g;

    /* renamed from: h, reason: collision with root package name */
    private final float f32924h;

    /* renamed from: i, reason: collision with root package name */
    private final float f32925i;

    /* renamed from: j, reason: collision with root package name */
    private final float f32926j;

    /* renamed from: k, reason: collision with root package name */
    private final float f32927k;

    /* renamed from: l, reason: collision with root package name */
    private final float f32928l;

    /* renamed from: m, reason: collision with root package name */
    private final x f32929m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f32921e = handler.J();
        this.f32922f = handler.K();
        this.f32923g = handler.H();
        this.f32924h = handler.I();
        this.f32925i = handler.U0();
        this.f32926j = handler.V0();
        this.f32927k = handler.W0();
        this.f32928l = handler.X0();
        this.f32929m = handler.T0();
    }

    @Override // fa.AbstractC3159b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", C1944g0.e(this.f32921e));
        eventData.putDouble("y", C1944g0.e(this.f32922f));
        eventData.putDouble("absoluteX", C1944g0.e(this.f32923g));
        eventData.putDouble("absoluteY", C1944g0.e(this.f32924h));
        eventData.putDouble("translationX", C1944g0.e(this.f32925i));
        eventData.putDouble("translationY", C1944g0.e(this.f32926j));
        eventData.putDouble("velocityX", C1944g0.e(this.f32927k));
        eventData.putDouble("velocityY", C1944g0.e(this.f32928l));
        if (this.f32929m.a() == -1.0d) {
            return;
        }
        eventData.putMap("stylusData", this.f32929m.b());
    }
}
