package fa;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import ea.C3107b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3158a extends AbstractC3159b {

    /* renamed from: e, reason: collision with root package name */
    private final float f32902e;

    /* renamed from: f, reason: collision with root package name */
    private final float f32903f;

    /* renamed from: g, reason: collision with root package name */
    private final float f32904g;

    /* renamed from: h, reason: collision with root package name */
    private final float f32905h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3158a(C3107b handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f32902e = handler.J();
        this.f32903f = handler.K();
        this.f32904g = handler.H();
        this.f32905h = handler.I();
    }

    @Override // fa.AbstractC3159b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", C1944g0.e(this.f32902e));
        eventData.putDouble("y", C1944g0.e(this.f32903f));
        eventData.putDouble("absoluteX", C1944g0.e(this.f32904g));
        eventData.putDouble("absoluteY", C1944g0.e(this.f32905h));
    }
}
