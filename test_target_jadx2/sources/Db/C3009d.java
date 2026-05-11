package db;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;

/* renamed from: db.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3009d extends CodedException {
    public /* synthetic */ C3009d(File file, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : file, (i10 & 2) != 0 ? null : th);
    }

    public C3009d(File file, Throwable th) {
        super("Failed to extract metadata from video file '" + ((file == null || (r3 = Uri.fromFile(file)) == null || (r3 = r3.toString()) == null) ? BuildConfig.FLAVOR : r3) + "'", th);
        Uri fromFile;
        String uri;
    }
}
