package n4;

import android.os.Trace;
import kotlin.jvm.internal.Intrinsics;
import n4.b;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3707a implements b.c {
    @Override // n4.b.c
    public void a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isTracing()) {
            Trace.beginSection(name);
        }
    }

    @Override // n4.b.c
    public void b() {
        if (isTracing()) {
            Trace.endSection();
        }
    }

    @Override // n4.b.c
    public boolean isTracing() {
        return false;
    }
}
