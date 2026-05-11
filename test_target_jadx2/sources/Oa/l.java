package Oa;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;

/* loaded from: classes2.dex */
public final class l extends CodedException {
    public l(Uri uri) {
        super("File '" + uri + "' could not be deleted because it could not be found", null, 2, null);
    }
}
