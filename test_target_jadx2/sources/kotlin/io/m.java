package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class m extends l {
    public static final i m(File file, FileWalkDirection direction) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new i(file, direction);
    }

    public static final i n(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return m(file, FileWalkDirection.BOTTOM_UP);
    }

    public static final i o(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return m(file, FileWalkDirection.TOP_DOWN);
    }
}
