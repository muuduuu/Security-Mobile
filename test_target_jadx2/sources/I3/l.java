package I3;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private final i f4300a;

    /* renamed from: b, reason: collision with root package name */
    private final Date f4301b;

    public l(i frameLoader, Date insertedTime) {
        Intrinsics.checkNotNullParameter(frameLoader, "frameLoader");
        Intrinsics.checkNotNullParameter(insertedTime, "insertedTime");
        this.f4300a = frameLoader;
        this.f4301b = insertedTime;
    }

    public final i a() {
        return this.f4300a;
    }

    public final Date b() {
        return this.f4301b;
    }
}
