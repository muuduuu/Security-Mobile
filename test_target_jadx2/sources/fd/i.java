package fd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class i {
    public static final boolean a(AbstractC3165a version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return (version.a() == 1 && version.b() >= 4) || version.a() > 1;
    }

    public static final boolean b(AbstractC3165a version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return a(version);
    }
}
