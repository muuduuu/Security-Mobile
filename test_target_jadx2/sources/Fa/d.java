package fa;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import ea.m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends AbstractC3159b {

    /* renamed from: e, reason: collision with root package name */
    private final float f32915e;

    /* renamed from: f, reason: collision with root package name */
    private final float f32916f;

    /* renamed from: g, reason: collision with root package name */
    private final float f32917g;

    /* renamed from: h, reason: collision with root package name */
    private final float f32918h;

    /* renamed from: i, reason: collision with root package name */
    private final int f32919i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f32915e = handler.J();
        this.f32916f = handler.K();
        this.f32917g = handler.H();
        this.f32918h = handler.I();
        this.f32919i = handler.U0();
    }

    @Override // fa.AbstractC3159b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", C1944g0.e(this.f32915e));
        eventData.putDouble("y", C1944g0.e(this.f32916f));
        eventData.putDouble("absoluteX", C1944g0.e(this.f32917g));
        eventData.putDouble("absoluteY", C1944g0.e(this.f32918h));
        eventData.putInt("duration", this.f32919i);
    }
}
