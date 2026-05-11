package Oa;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Uri fromUri, Uri toUri) {
        super("File '" + fromUri + "' could not be moved to '" + toUri + "'", null, 2, null);
        Intrinsics.checkNotNullParameter(fromUri, "fromUri");
        Intrinsics.checkNotNullParameter(toUri, "toUri");
    }
}
