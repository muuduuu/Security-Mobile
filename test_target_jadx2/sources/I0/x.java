package I0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends D {

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f4246b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Throwable readException, int i10) {
        super(i10, null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f4246b = readException;
    }

    public final Throwable b() {
        return this.f4246b;
    }
}
