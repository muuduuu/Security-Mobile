package Nb;

import expo.modules.kotlin.exception.CodedException;

/* loaded from: classes2.dex */
public final class e extends CodedException {
    public e() {
        super("Couldn't start the foreground service. Foreground service cannot be started when the application is in the background", null, 2, null);
    }
}
