package androidx.lifecycle;

import Jd.C0874b0;
import Jd.O0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1597n {
    public static final AbstractC1593j a(AbstractC1592i abstractC1592i) {
        C1594k c1594k;
        Intrinsics.checkNotNullParameter(abstractC1592i, "<this>");
        do {
            C1594k c1594k2 = (C1594k) abstractC1592i.c().get();
            if (c1594k2 != null) {
                return c1594k2;
            }
            c1594k = new C1594k(abstractC1592i, O0.b(null, 1, null).l(C0874b0.c().y0()));
        } while (!androidx.camera.view.i.a(abstractC1592i.c(), null, c1594k));
        c1594k.b();
        return c1594k;
    }
}
