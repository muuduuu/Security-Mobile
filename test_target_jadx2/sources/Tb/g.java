package Tb;

import expo.modules.kotlin.exception.CodedException;

/* loaded from: classes2.dex */
public final class g extends CodedException {
    public g(String str) {
        super("An error occurred when accessing the keystore: " + (str == null ? "unknown" : str), null, 2, null);
    }
}
