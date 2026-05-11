package fa;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import ea.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends AbstractC3159b {

    /* renamed from: e, reason: collision with root package name */
    private final float f32938e;

    /* renamed from: f, reason: collision with root package name */
    private final float f32939f;

    /* renamed from: g, reason: collision with root package name */
    private final float f32940g;

    /* renamed from: h, reason: collision with root package name */
    private final float f32941h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f32938e = handler.J();
        this.f32939f = handler.K();
        this.f32940g = handler.H();
        this.f32941h = handler.I();
    }

    @Override // fa.AbstractC3159b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", C1944g0.e(this.f32938e));
        eventData.putDouble("y", C1944g0.e(this.f32939f));
        eventData.putDouble("absoluteX", C1944g0.e(this.f32940g));
        eventData.putDouble("absoluteY", C1944g0.e(this.f32941h));
    }
}
