package za;

import expo.modules.kotlin.exception.CodedException;

/* loaded from: classes2.dex */
public final class j extends CodedException {
    public j(SecurityException securityException) {
        super("App has no permission to read this clipboard item", securityException);
    }
}
