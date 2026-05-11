package db;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: db.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3012g extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3012g(File file, Throwable cause) {
        super("Failed to write EXIF data to file '" + Uri.fromFile(file), cause);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
