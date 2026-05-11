package L0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {
    public static final File a(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return H0.a.a(context, name + ".preferences_pb");
    }
}
