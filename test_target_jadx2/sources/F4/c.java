package F4;

import kotlin.jvm.internal.Intrinsics;
import s5.C4313a;

/* loaded from: classes.dex */
public final class c implements AutoCloseable {
    public c(String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        C4313a.c(0L, sectionName);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        C4313a.i(0L);
    }
}
