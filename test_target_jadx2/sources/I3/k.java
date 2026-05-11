package I3;

import f3.AbstractC3142a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3142a f4298a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4299b;

    public enum a {
        SUCCESS,
        NEAREST,
        MISSING
    }

    public k(AbstractC3142a abstractC3142a, a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f4298a = abstractC3142a;
        this.f4299b = type;
    }

    public final AbstractC3142a a() {
        return this.f4298a;
    }

    public final a b() {
        return this.f4299b;
    }
}
