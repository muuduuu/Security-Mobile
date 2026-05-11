package I0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends D {

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f4241b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Throwable finalException) {
        super(Integer.MAX_VALUE, null);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f4241b = finalException;
    }

    public final Throwable b() {
        return this.f4241b;
    }
}
