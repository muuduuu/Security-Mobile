package va;

import expo.modules.kotlin.exception.CodedException;

/* loaded from: classes2.dex */
public final class d extends CodedException {
    public d(String str) {
        super("Video recording failed: " + str, null, 2, null);
    }
}
