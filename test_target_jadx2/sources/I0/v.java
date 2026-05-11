package I0;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class v {
    public static final t a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.canonicalFile.absolutePath");
        return u.a(absolutePath);
    }
}
