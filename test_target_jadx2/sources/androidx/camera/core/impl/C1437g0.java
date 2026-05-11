package androidx.camera.core.impl;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.camera.core.impl.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1437g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1437g0 f14589a = new C1437g0();

    private C1437g0() {
    }

    private final boolean a(A.B b10, A.B b11) {
        y0.f.j(b11.e(), "Fully specified range is not actually fully specified.");
        return b10.a() == 0 || b10.a() == b11.a();
    }

    private final boolean b(A.B b10, A.B b11) {
        y0.f.j(b11.e(), "Fully specified range is not actually fully specified.");
        int b12 = b10.b();
        if (b12 == 0) {
            return true;
        }
        int b13 = b11.b();
        return (b12 == 2 && b13 != 1) || b12 == b13;
    }

    public static final boolean c(A.B dynamicRangeToTest, Set fullySpecifiedDynamicRanges) {
        Object obj;
        Intrinsics.checkNotNullParameter(dynamicRangeToTest, "dynamicRangeToTest");
        Intrinsics.checkNotNullParameter(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.e()) {
            return fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        }
        Iterator it = fullySpecifiedDynamicRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (f14589a.d(dynamicRangeToTest, (A.B) obj)) {
                break;
            }
        }
        return obj != null;
    }

    private final boolean d(A.B b10, A.B b11) {
        return a(b10, b11) && b(b10, b11);
    }
}
