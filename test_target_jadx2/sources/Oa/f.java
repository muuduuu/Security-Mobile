package Oa;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;

/* loaded from: classes2.dex */
public final class f extends CodedException {
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0018, code lost:
    
        if (r3 == null) goto L5;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(Uri uri) {
        super(r3, null, 2, null);
        String str;
        if (uri != null) {
            str = "Directory '" + uri + "' could not be created or already exists";
        }
        str = "Unknown error";
    }
}
