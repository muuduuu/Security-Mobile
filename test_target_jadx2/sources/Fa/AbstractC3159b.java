package fa;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.bridge.WritableMap;
import ea.AbstractC3109d;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fa.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3159b {

    /* renamed from: a, reason: collision with root package name */
    private final int f32906a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32907b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32908c;

    /* renamed from: d, reason: collision with root package name */
    private final int f32909d;

    public AbstractC3159b(AbstractC3109d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f32906a = handler.M();
        this.f32907b = handler.R();
        this.f32908c = handler.Q();
        this.f32909d = handler.O();
    }

    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        eventData.putInt("numberOfPointers", this.f32906a);
        eventData.putInt("handlerTag", this.f32907b);
        eventData.putInt(Keys.STATE, this.f32908c);
        eventData.putInt("pointerType", this.f32909d);
    }
}
