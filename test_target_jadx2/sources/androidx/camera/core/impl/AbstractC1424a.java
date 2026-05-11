package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.Z0;
import java.util.List;

/* renamed from: androidx.camera.core.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1424a {
    AbstractC1424a() {
    }

    public static AbstractC1424a a(b1 b1Var, int i10, Size size, A.B b10, List list, V v10, Range range) {
        return new C1426b(b1Var, i10, size, b10, list, v10, range);
    }

    public abstract List b();

    public abstract A.B c();

    public abstract int d();

    public abstract V e();

    public abstract Size f();

    public abstract b1 g();

    public abstract Range h();

    public Z0 i(V v10) {
        Z0.a d10 = Z0.a(f()).b(c()).d(v10);
        if (h() != null) {
            d10.c(h());
        }
        return d10.a();
    }
}
