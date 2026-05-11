package oe;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import pe.C3877e;

/* loaded from: classes3.dex */
public abstract class a {
    public static final boolean a(C3877e c3877e) {
        Intrinsics.checkNotNullParameter(c3877e, "<this>");
        try {
            C3877e c3877e2 = new C3877e();
            c3877e.l(c3877e2, 0L, d.i(c3877e.size(), 64L));
            for (int i10 = 0; i10 < 16; i10++) {
                if (c3877e2.p0()) {
                    return true;
                }
                int Q10 = c3877e2.Q();
                if (Character.isISOControl(Q10) && !Character.isWhitespace(Q10)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
