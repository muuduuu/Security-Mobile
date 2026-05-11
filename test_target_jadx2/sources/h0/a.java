package H0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {
    public static final File a(Context context, String fileName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
