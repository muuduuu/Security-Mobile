package I0;

import android.os.Build;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m {
    public static final boolean a(File file, File toFile) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? C0835a.f4027a.a(file, toFile) : file.renameTo(toFile);
    }
}
