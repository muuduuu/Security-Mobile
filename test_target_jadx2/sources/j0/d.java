package j0;

import java.util.ConcurrentModificationException;
import k0.AbstractC3526a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {
    public static final void a(C3477b c3477b, int i10) {
        Intrinsics.checkNotNullParameter(c3477b, "<this>");
        c3477b.u(new int[i10]);
        c3477b.t(new Object[i10]);
    }

    public static final int b(C3477b c3477b, int i10) {
        Intrinsics.checkNotNullParameter(c3477b, "<this>");
        try {
            return AbstractC3526a.a(c3477b.h(), c3477b.m(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(C3477b c3477b, Object obj, int i10) {
        Intrinsics.checkNotNullParameter(c3477b, "<this>");
        int m10 = c3477b.m();
        if (m10 == 0) {
            return -1;
        }
        int b10 = b(c3477b, i10);
        if (b10 < 0) {
            return b10;
        }
        if (Intrinsics.b(obj, c3477b.e()[b10])) {
            return b10;
        }
        int i11 = b10 + 1;
        while (i11 < m10 && c3477b.h()[i11] == i10) {
            if (Intrinsics.b(obj, c3477b.e()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = b10 - 1; i12 >= 0 && c3477b.h()[i12] == i10; i12--) {
            if (Intrinsics.b(obj, c3477b.e()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public static final int d(C3477b c3477b) {
        Intrinsics.checkNotNullParameter(c3477b, "<this>");
        return c(c3477b, null, 0);
    }
}
