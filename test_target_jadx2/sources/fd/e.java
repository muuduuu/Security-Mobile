package fd;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* loaded from: classes3.dex */
public abstract class e {
    public static final Object a(i.d dVar, i.f extension) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (dVar.u(extension)) {
            return dVar.r(extension);
        }
        return null;
    }

    public static final Object b(i.d dVar, i.f extension, int i10) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (i10 < dVar.t(extension)) {
            return dVar.s(extension, i10);
        }
        return null;
    }
}
