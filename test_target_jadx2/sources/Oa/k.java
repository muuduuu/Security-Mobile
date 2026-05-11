package Oa;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;

/* loaded from: classes2.dex */
public final class k extends CodedException {
    public k(Uri uri) {
        super("File '" + uri + "' could not be copied because it could not be found", null, 2, null);
    }
}
