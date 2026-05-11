package Nb;

import expo.modules.kotlin.exception.CodedException;

/* loaded from: classes2.dex */
public final class d extends CodedException {
    public d() {
        super("Couldn't start the foreground service. Foreground service permissions were not found in the manifest", null, 2, null);
    }
}
