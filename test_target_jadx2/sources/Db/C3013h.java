package db;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;
import java.io.File;
import org.conscrypt.BuildConfig;

/* renamed from: db.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3013h extends CodedException {
    public C3013h(File file, Throwable th) {
        super("Failed to write a file '" + ((file == null || (r3 = Uri.fromFile(file)) == null || (r3 = r3.toString()) == null) ? BuildConfig.FLAVOR : r3) + "'", th);
        Uri fromFile;
        String uri;
    }
}
