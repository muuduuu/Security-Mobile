package fa;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import ea.C3116k;
import ea.x;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fa.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3160c extends AbstractC3159b {

    /* renamed from: e, reason: collision with root package name */
    private final float f32910e;

    /* renamed from: f, reason: collision with root package name */
    private final float f32911f;

    /* renamed from: g, reason: collision with root package name */
    private final float f32912g;

    /* renamed from: h, reason: collision with root package name */
    private final float f32913h;

    /* renamed from: i, reason: collision with root package name */
    private final x f32914i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3160c(C3116k handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f32910e = handler.J();
        this.f32911f = handler.K();
        this.f32912g = handler.H();
        this.f32913h = handler.I();
        this.f32914i = handler.U0();
    }

    @Override // fa.AbstractC3159b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", C1944g0.e(this.f32910e));
        eventData.putDouble("y", C1944g0.e(this.f32911f));
        eventData.putDouble("absoluteX", C1944g0.e(this.f32912g));
        eventData.putDouble("absoluteY", C1944g0.e(this.f32913h));
        if (this.f32914i.a() == -1.0d) {
            return;
        }
        eventData.putMap("stylusData", this.f32914i.b());
    }
}
